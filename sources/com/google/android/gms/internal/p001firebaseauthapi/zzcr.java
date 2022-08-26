package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzcr extends zzfo {
    zzcr() {
        super(zzhp.class, new zzcp(zzap.class));
    }

    static /* bridge */ /* synthetic */ zzfm zzg(int i, int i2) {
        zzhr zzb = zzhs.zzb();
        zzb.zza(i);
        return new zzfm((zzhs) zzb.zzk(), i2);
    }

    public final zzfn zza() {
        return new zzcq(this, zzhs.class);
    }

    public final /* synthetic */ zzabc zzb(zzyu zzyu) throws zzaaf {
        return zzhp.zzd(zzyu, zzzk.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzabc zzabc) throws GeneralSecurityException {
        zzhp zzhp = (zzhp) zzabc;
        zznm.zzc(zzhp.zza(), 0);
        zznm.zzb(zzhp.zze().zzd());
    }

    public final int zze() {
        return 2;
    }

    public final int zzf() {
        return 3;
    }
}
