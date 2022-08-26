package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzdd extends zzfn {
    final /* synthetic */ zzde zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdd(zzde zzde, Class cls) {
        super(cls);
        this.zza = zzde;
    }

    public final /* bridge */ /* synthetic */ zzabc zza(zzabc zzabc) throws GeneralSecurityException {
        zzll zzb = zzlm.zzb();
        zzb.zza((zzlp) zzabc);
        zzb.zzb(0);
        return (zzlm) zzb.zzk();
    }

    public final /* synthetic */ zzabc zzb(zzyu zzyu) throws zzaaf {
        return zzlp.zzd(zzyu, zzzk.zza());
    }

    public final /* bridge */ /* synthetic */ void zzd(zzabc zzabc) throws GeneralSecurityException {
        zzlp zzlp = (zzlp) zzabc;
        if (zzlp.zze().isEmpty() || !zzlp.zzf()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
