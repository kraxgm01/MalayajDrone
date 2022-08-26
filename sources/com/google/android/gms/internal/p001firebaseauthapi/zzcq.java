package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzcq extends zzfn {
    final /* synthetic */ zzcr zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzcq(zzcr zzcr, Class cls) {
        super(cls);
        this.zza = zzcr;
    }

    public final /* bridge */ /* synthetic */ zzabc zza(zzabc zzabc) throws GeneralSecurityException {
        zzho zzb = zzhp.zzb();
        zzb.zza(zzyu.zzn(zznk.zza(((zzhs) zzabc).zza())));
        zzb.zzb(0);
        return (zzhp) zzb.zzk();
    }

    public final /* synthetic */ zzabc zzb(zzyu zzyu) throws zzaaf {
        return zzhs.zzd(zzyu, zzzk.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", zzcr.zzg(16, 1));
        hashMap.put("AES128_GCM_RAW", zzcr.zzg(16, 3));
        hashMap.put("AES256_GCM", zzcr.zzg(32, 1));
        hashMap.put("AES256_GCM_RAW", zzcr.zzg(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* synthetic */ void zzd(zzabc zzabc) throws GeneralSecurityException {
        zznm.zzb(((zzhs) zzabc).zza());
    }
}
