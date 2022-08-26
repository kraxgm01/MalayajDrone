package com.google.android.gms.internal.p001firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.ECPublicKeySpec;
import java.security.spec.EllipticCurve;
import java.util.Arrays;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmp  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzmp {
    private final ECPrivateKey zza;

    public zzmp(ECPrivateKey eCPrivateKey) {
        this.zza = eCPrivateKey;
    }

    public final byte[] zza(byte[] bArr, String str, byte[] bArr2, byte[] bArr3, int i, int i2) throws GeneralSecurityException {
        ECPoint eCPoint;
        boolean z;
        ECParameterSpec params = this.zza.getParams();
        EllipticCurve curve = params.getCurve();
        int zza2 = zzmr.zza(curve);
        int i3 = 1;
        switch (i2 - 1) {
            case 0:
                int length = bArr.length;
                if (length != zza2 + zza2 + 1) {
                    throw new GeneralSecurityException("invalid point size");
                } else if (bArr[0] == 4) {
                    int i4 = zza2 + 1;
                    eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 1, i4)), new BigInteger(1, Arrays.copyOfRange(bArr, i4, length)));
                    zzmr.zzd(eCPoint, curve);
                    break;
                } else {
                    throw new GeneralSecurityException("invalid point format");
                }
            case 2:
                int length2 = bArr.length;
                if (length2 == zza2 + zza2) {
                    eCPoint = new ECPoint(new BigInteger(1, Arrays.copyOfRange(bArr, 0, zza2)), new BigInteger(1, Arrays.copyOfRange(bArr, zza2, length2)));
                    zzmr.zzd(eCPoint, curve);
                    break;
                } else {
                    throw new GeneralSecurityException("invalid point size");
                }
            default:
                BigInteger zzb = zzmr.zzb(curve);
                int length3 = bArr.length;
                if (length3 == zza2 + 1) {
                    byte b = bArr[0];
                    if (b == 2) {
                        z = false;
                    } else if (b == 3) {
                        z = true;
                    } else {
                        throw new GeneralSecurityException("invalid format");
                    }
                    BigInteger bigInteger = new BigInteger(1, Arrays.copyOfRange(bArr, 1, length3));
                    if (bigInteger.signum() != -1 && bigInteger.compareTo(zzb) < 0) {
                        eCPoint = new ECPoint(bigInteger, zzmr.zzc(bigInteger, z, curve));
                        break;
                    } else {
                        throw new GeneralSecurityException("x is out of range");
                    }
                } else {
                    throw new GeneralSecurityException("compressed point has wrong length");
                }
                break;
        }
        ECPublicKey eCPublicKey = (ECPublicKey) ((KeyFactory) zzmt.zzg.zza("EC")).generatePublic(new ECPublicKeySpec(eCPoint, params));
        ECPrivateKey eCPrivateKey = this.zza;
        try {
            ECParameterSpec params2 = eCPublicKey.getParams();
            ECParameterSpec params3 = eCPrivateKey.getParams();
            if (!params2.getCurve().equals(params3.getCurve()) || !params2.getGenerator().equals(params3.getGenerator()) || !params2.getOrder().equals(params3.getOrder()) || params2.getCofactor() != params3.getCofactor()) {
                throw new GeneralSecurityException("invalid public key spec");
            }
            ECPoint w = eCPublicKey.getW();
            zzmr.zzd(w, eCPrivateKey.getParams().getCurve());
            PublicKey generatePublic = ((KeyFactory) zzmt.zzg.zza("EC")).generatePublic(new ECPublicKeySpec(w, eCPrivateKey.getParams()));
            KeyAgreement keyAgreement = (KeyAgreement) zzmt.zze.zza("ECDH");
            keyAgreement.init(eCPrivateKey);
            try {
                keyAgreement.doPhase(generatePublic, true);
                byte[] generateSecret = keyAgreement.generateSecret();
                EllipticCurve curve2 = eCPrivateKey.getParams().getCurve();
                BigInteger bigInteger2 = new BigInteger(1, generateSecret);
                if (bigInteger2.signum() == -1 || bigInteger2.compareTo(zzmr.zzb(curve2)) >= 0) {
                    throw new GeneralSecurityException("shared secret is out of range");
                }
                zzmr.zzc(bigInteger2, true, curve2);
                byte[] zzc = zzmj.zzc(bArr, generateSecret);
                Mac mac = (Mac) zzmt.zzb.zza(str);
                if (i <= mac.getMacLength() * 255) {
                    if (bArr2 == null || bArr2.length == 0) {
                        mac.init(new SecretKeySpec(new byte[mac.getMacLength()], str));
                    } else {
                        mac.init(new SecretKeySpec(bArr2, str));
                    }
                    byte[] bArr4 = new byte[i];
                    mac.init(new SecretKeySpec(mac.doFinal(zzc), str));
                    byte[] bArr5 = new byte[0];
                    int i5 = 0;
                    while (true) {
                        mac.update(bArr5);
                        mac.update((byte[]) null);
                        mac.update((byte) i3);
                        bArr5 = mac.doFinal();
                        int length4 = bArr5.length;
                        int i6 = i5 + length4;
                        if (i6 < i) {
                            System.arraycopy(bArr5, 0, bArr4, i5, length4);
                            i3++;
                            i5 = i6;
                        } else {
                            System.arraycopy(bArr5, 0, bArr4, i5, i - i5);
                            return bArr4;
                        }
                    }
                } else {
                    throw new GeneralSecurityException("size too large");
                }
            } catch (IllegalStateException e) {
                throw new GeneralSecurityException(e);
            }
        } catch (IllegalArgumentException | NullPointerException e2) {
            throw new GeneralSecurityException(e2);
        }
    }
}
