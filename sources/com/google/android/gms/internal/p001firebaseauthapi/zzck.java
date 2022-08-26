package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzck  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzck extends zzfn {
    final /* synthetic */ zzcl zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzck(zzcl zzcl, Class cls) {
        super(cls);
        this.zza = zzcl;
    }

    public static final zzgx zzf(zzha zzha) throws GeneralSecurityException {
        zzgw zzb = zzgx.zzb();
        zzb.zzb(zzha.zzf());
        zzb.zza(zzyu.zzn(zznk.zza(zzha.zza())));
        zzb.zzc(0);
        return (zzgx) zzb.zzk();
    }

    public final /* bridge */ /* synthetic */ zzabc zza(zzabc zzabc) throws GeneralSecurityException {
        return zzf((zzha) zzabc);
    }

    public final /* synthetic */ zzabc zzb(zzyu zzyu) throws zzaaf {
        return zzha.zze(zzyu, zzzk.zza());
    }

    /* renamed from: zze */
    public final void zzd(zzha zzha) throws GeneralSecurityException {
        zznm.zzb(zzha.zza());
        zzcl.zzi(zzha.zzf());
    }
}
