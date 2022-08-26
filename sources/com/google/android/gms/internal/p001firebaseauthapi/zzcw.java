package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcw  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzcw extends zzfn {
    final /* synthetic */ zzcx zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzcw(zzcx zzcx, Class cls) {
        super(cls);
        this.zza = zzcx;
    }

    public final /* bridge */ /* synthetic */ zzabc zza(zzabc zzabc) throws GeneralSecurityException {
        zzik zzik = (zzik) zzabc;
        zzig zzb = zzih.zzb();
        zzb.zzb(0);
        zzb.zza(zzyu.zzn(zznk.zza(32)));
        return (zzih) zzb.zzk();
    }

    public final /* synthetic */ zzabc zzb(zzyu zzyu) throws zzaaf {
        return zzik.zzc(zzyu, zzzk.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("CHACHA20_POLY1305", new zzfm(zzik.zzb(), 1));
        hashMap.put("CHACHA20_POLY1305_RAW", new zzfm(zzik.zzb(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzabc zzabc) throws GeneralSecurityException {
        zzik zzik = (zzik) zzabc;
    }
}
