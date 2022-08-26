package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzct  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzct extends zzfn {
    final /* synthetic */ zzcu zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzct(zzcu zzcu, Class cls) {
        super(cls);
        this.zza = zzcu;
    }

    public final /* bridge */ /* synthetic */ zzabc zza(zzabc zzabc) throws GeneralSecurityException {
        zzhu zzb = zzhv.zzb();
        zzb.zza(zzyu.zzn(zznk.zza(((zzhy) zzabc).zza())));
        zzb.zzb(0);
        return (zzhv) zzb.zzk();
    }

    public final /* synthetic */ zzabc zzb(zzyu zzyu) throws zzaaf {
        return zzhy.zzd(zzyu, zzzk.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", zzcu.zzh(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", zzcu.zzh(16, 3));
        hashMap.put("AES256_GCM_SIV", zzcu.zzh(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", zzcu.zzh(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* synthetic */ void zzd(zzabc zzabc) throws GeneralSecurityException {
        zznm.zzb(((zzhy) zzabc).zza());
    }
}
