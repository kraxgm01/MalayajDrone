package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzga  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzga implements zzbl {
    private final zzbu zza;
    private final byte[] zzb = {0};

    /* synthetic */ zzga(zzbu zzbu, zzfz zzfz) {
        this.zza = zzbu;
    }

    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzbo zzbo : this.zza.zzb(copyOf)) {
                try {
                    if (zzbo.zzc() == 4) {
                        ((zzbl) zzbo.zza()).zza(copyOfRange, zzmj.zzc(bArr2, this.zzb));
                        return;
                    }
                    ((zzbl) zzbo.zza()).zza(copyOfRange, bArr2);
                    return;
                } catch (GeneralSecurityException e) {
                    zzgb.zza.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e.toString()));
                }
            }
            for (zzbo zza2 : this.zza.zzb(zzas.zza)) {
                try {
                    ((zzbl) zza2.zza()).zza(bArr, bArr2);
                    return;
                } catch (GeneralSecurityException e2) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
        throw new GeneralSecurityException("tag too short");
    }
}
