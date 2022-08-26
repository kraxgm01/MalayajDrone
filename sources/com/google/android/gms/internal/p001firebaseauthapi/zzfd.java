package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzfd {
    private final zzer zza;

    zzfd(zzer zzer) {
        this.zza = zzer;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zza2 = zznn.zza(bArr2, bArr);
        byte[] zzc = zzmj.zzc(bArr, zznn.zzb(bArr2));
        byte[] zzd = zzfc.zzd(zzfc.zzb);
        zzer zzer = this.zza;
        return zzer.zzb((byte[]) null, zza2, "eae_prk", zzc, "shared_secret", zzd, zzer.zza());
    }
}
