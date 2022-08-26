package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdg  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzdg extends zzfn {
    final /* synthetic */ zzdh zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdg(zzdh zzdh, Class cls) {
        super(cls);
        this.zza = zzdh;
    }

    public final /* bridge */ /* synthetic */ zzabc zza(zzabc zzabc) throws GeneralSecurityException {
        zzma zzma = (zzma) zzabc;
        zzlw zzb = zzlx.zzb();
        zzb.zzb(0);
        zzb.zza(zzyu.zzn(zznk.zza(32)));
        return (zzlx) zzb.zzk();
    }

    public final /* synthetic */ zzabc zzb(zzyu zzyu) throws zzaaf {
        return zzma.zzc(zzyu, zzzk.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("XCHACHA20_POLY1305", new zzfm(zzma.zzb(), 1));
        hashMap.put("XCHACHA20_POLY1305_RAW", new zzfm(zzma.zzb(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzabc zzabc) throws GeneralSecurityException {
        zzma zzma = (zzma) zzabc;
    }
}
