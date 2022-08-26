package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzci  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzci extends zzfo {
    zzci() {
        super(zzgr.class, new zzcg(zzap.class));
    }

    static /* bridge */ /* synthetic */ zzfm zzg(int i, int i2, int i3, int i4, int i5, int i6) {
        zzgz zzb = zzha.zzb();
        zzhc zzb2 = zzhd.zzb();
        zzb2.zza(16);
        zzb.zzb((zzhd) zzb2.zzk());
        zzb.zza(i);
        zzjq zzb3 = zzjr.zzb();
        zzjt zzb4 = zzju.zzb();
        zzb4.zzb(5);
        zzb4.zza(i4);
        zzb3.zzb((zzju) zzb4.zzk());
        zzb3.zza(32);
        zzgt zza = zzgu.zza();
        zza.zza((zzha) zzb.zzk());
        zza.zzb((zzjr) zzb3.zzk());
        return new zzfm((zzgu) zza.zzk(), i6);
    }

    public final zzfn zza() {
        return new zzch(this, zzgu.class);
    }

    public final /* synthetic */ zzabc zzb(zzyu zzyu) throws zzaaf {
        return zzgr.zzd(zzyu, zzzk.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzabc zzabc) throws GeneralSecurityException {
        zzgr zzgr = (zzgr) zzabc;
        zznm.zzc(zzgr.zza(), 0);
        new zzcl();
        zzcl.zzh(zzgr.zze());
        new zzfx();
        zzfx.zzh(zzgr.zzf());
    }

    public final int zze() {
        return 2;
    }

    public final int zzf() {
        return 3;
    }
}
