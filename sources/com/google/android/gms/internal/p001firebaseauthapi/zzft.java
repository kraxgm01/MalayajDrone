package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzft  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzft extends zzfn {
    zzft(zzfu zzfu, Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ zzabc zza(zzabc zzabc) throws GeneralSecurityException {
        zzgl zzgl = (zzgl) zzabc;
        zzgh zzb = zzgi.zzb();
        zzb.zzc(0);
        zzb.zza(zzyu.zzn(zznk.zza(zzgl.zza())));
        zzb.zzb(zzgl.zze());
        return (zzgi) zzb.zzk();
    }

    public final /* synthetic */ zzabc zzb(zzyu zzyu) throws zzaaf {
        return zzgl.zzd(zzyu, zzzk.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzgk zzb = zzgl.zzb();
        zzb.zza(32);
        zzgn zzb2 = zzgo.zzb();
        zzb2.zza(16);
        zzb.zzb((zzgo) zzb2.zzk());
        hashMap.put("AES_CMAC", new zzfm((zzgl) zzb.zzk(), 1));
        zzgk zzb3 = zzgl.zzb();
        zzb3.zza(32);
        zzgn zzb4 = zzgo.zzb();
        zzb4.zza(16);
        zzb3.zzb((zzgo) zzb4.zzk());
        hashMap.put("AES256_CMAC", new zzfm((zzgl) zzb3.zzk(), 1));
        zzgk zzb5 = zzgl.zzb();
        zzb5.zza(32);
        zzgn zzb6 = zzgo.zzb();
        zzb6.zza(16);
        zzb5.zzb((zzgo) zzb6.zzk());
        hashMap.put("AES256_CMAC_RAW", new zzfm((zzgl) zzb5.zzk(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzabc zzabc) throws GeneralSecurityException {
        zzgl zzgl = (zzgl) zzabc;
        zzfu.zzi(zzgl.zze());
        zzfu.zzn(zzgl.zza());
    }
}
