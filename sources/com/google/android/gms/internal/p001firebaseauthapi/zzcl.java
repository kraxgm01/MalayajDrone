package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcl  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzcl extends zzfo {
    zzcl() {
        super(zzgx.class, new zzcj(zzne.class));
    }

    public static final void zzh(zzgx zzgx) throws GeneralSecurityException {
        zznm.zzc(zzgx.zza(), 0);
        zznm.zzb(zzgx.zzg().zzd());
        zzi(zzgx.zzf());
    }

    /* access modifiers changed from: private */
    public static final void zzi(zzhd zzhd) throws GeneralSecurityException {
        if (zzhd.zza() < 12 || zzhd.zza() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    public final zzfn zza() {
        return new zzck(this, zzha.class);
    }

    public final /* synthetic */ zzabc zzb(zzyu zzyu) throws zzaaf {
        return zzgx.zze(zzyu, zzzk.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzabc zzabc) throws GeneralSecurityException {
        zzh((zzgx) zzabc);
    }

    public final int zzf() {
        return 3;
    }
}
