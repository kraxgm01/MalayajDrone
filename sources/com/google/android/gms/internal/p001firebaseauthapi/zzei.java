package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzei  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzei implements zzau {
    private final zzbu zza;

    public zzei(zzbu zzbu) {
        this.zza = zzbu;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, length);
            for (zzbo zza2 : this.zza.zzb(copyOfRange)) {
                try {
                    return ((zzau) zza2.zza()).zza(copyOfRange2, (byte[]) null);
                } catch (GeneralSecurityException e) {
                    zzej.zza.logp(Level.INFO, "com.google.crypto.tink.hybrid.HybridDecryptWrapper$WrappedHybridDecrypt", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(String.valueOf(e.toString())));
                }
            }
        }
        for (zzbo zza3 : this.zza.zzb(zzas.zza)) {
            try {
                return ((zzau) zza3.zza()).zza(bArr, (byte[]) null);
            } catch (GeneralSecurityException e2) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }
}
