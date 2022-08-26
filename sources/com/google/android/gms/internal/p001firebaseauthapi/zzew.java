package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzew  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzew {
    static zzes zza(zzkc zzkc) throws GeneralSecurityException {
        if (zzkc.zzd() == 3) {
            return new zzep(16);
        }
        if (zzkc.zzd() == 4) {
            return new zzep(32);
        }
        if (zzkc.zzd() == 5) {
            return new zzeq();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    static zzer zzb(zzkc zzkc) {
        if (zzkc.zze() == 3) {
            return new zzer("HmacSha256");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }

    static zzfd zzc(zzkc zzkc) {
        if (zzkc.zzf() == 3) {
            return new zzfd(new zzer("HmacSha256"));
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }
}
