package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzev  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzev implements zzav {
    private final zzki zza;
    private final zzes zzb;
    private final zzfd zzc;
    private final zzer zzd;

    private zzev(zzki zzki, zzfd zzfd, zzer zzer, zzes zzes, byte[] bArr) {
        this.zza = zzki;
        this.zzc = zzfd;
        this.zzd = zzer;
        this.zzb = zzes;
    }

    static zzev zza(zzki zzki) throws GeneralSecurityException {
        if (!zzki.zzg().zzs()) {
            zzkc zzb2 = zzki.zzb();
            return new zzev(zzki, zzew.zzc(zzb2), zzew.zzb(zzb2), zzew.zza(zzb2), (byte[]) null);
        }
        throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
    }
}
