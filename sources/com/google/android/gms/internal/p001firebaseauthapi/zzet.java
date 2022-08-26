package com.google.android.gms.internal.p001firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzet  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzet {
    private static final byte[] zza = new byte[0];
    private final zzes zzb;
    private final BigInteger zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private BigInteger zzg = BigInteger.ZERO;

    private zzet(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, zzes zzes) {
        this.zzf = bArr;
        this.zzd = bArr2;
        this.zze = bArr3;
        this.zzc = bigInteger;
        this.zzb = zzes;
    }

    static zzet zzb(byte[] bArr, byte[] bArr2, zzfd zzfd, zzer zzer, zzes zzes, byte[] bArr3) throws GeneralSecurityException {
        zzer zzer2 = zzer;
        byte[] bArr4 = zzfc.zzc;
        if (Arrays.equals(bArr4, bArr4)) {
            byte[] zzb2 = zzfc.zzb(zzfc.zzb, zzfc.zzc, zzes.zzb());
            byte[] bArr5 = zzfc.zzg;
            byte[] bArr6 = zza;
            byte[] zzc2 = zzmj.zzc(zzfc.zza, zzer2.zzd(bArr5, bArr6, "psk_id_hash", zzb2), zzer2.zzd(zzfc.zzg, bArr3, "info_hash", zzb2));
            zzer zzer3 = zzer;
            byte[] zzd2 = zzer2.zzd(bArr2, bArr6, "secret", zzb2);
            byte[] bArr7 = zzc2;
            byte[] bArr8 = zzb2;
            return new zzet(bArr, zzer3.zzc(zzd2, bArr7, "key", bArr8, zzes.zza()), zzer3.zzc(zzd2, bArr7, "base_nonce", bArr8, 12), BigInteger.ONE.shiftLeft(96).subtract(BigInteger.ONE), zzes);
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }

    private final synchronized byte[] zzc() throws GeneralSecurityException {
        byte[] zzd2;
        byte[] bArr = this.zze;
        byte[] byteArray = this.zzg.toByteArray();
        int length = byteArray.length;
        if (length != 12) {
            if (length > 13) {
                throw new GeneralSecurityException("integer too large");
            } else if (length != 13) {
                byte[] bArr2 = new byte[12];
                System.arraycopy(byteArray, 0, bArr2, 12 - length, length);
                byteArray = bArr2;
            } else if (byteArray[0] == 0) {
                byteArray = Arrays.copyOfRange(byteArray, 1, 13);
            } else {
                throw new GeneralSecurityException("integer too large");
            }
        }
        zzd2 = zzmj.zzd(bArr, byteArray);
        if (this.zzg.compareTo(this.zzc) < 0) {
            this.zzg = this.zzg.add(BigInteger.ONE);
        } else {
            throw new GeneralSecurityException("message limit reached");
        }
        return zzd2;
    }

    /* access modifiers changed from: package-private */
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.zzb.zzc(this.zzd, zzc(), bArr, bArr2);
    }
}
