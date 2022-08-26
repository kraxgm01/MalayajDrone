package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzch  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzch extends zzfn {
    final /* synthetic */ zzci zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzch(zzci zzci, Class cls) {
        super(cls);
        this.zza = zzci;
    }

    public final /* bridge */ /* synthetic */ zzabc zza(zzabc zzabc) throws GeneralSecurityException {
        zzgu zzgu = (zzgu) zzabc;
        new zzcl();
        zzgx zzf = zzck.zzf(zzgu.zzd());
        zzabc zza2 = new zzfx().zza().zza(zzgu.zze());
        zzgq zzb = zzgr.zzb();
        zzb.zza(zzf);
        zzb.zzb((zzjo) zza2);
        zzb.zzc(0);
        return (zzgr) zzb.zzk();
    }

    public final /* synthetic */ zzabc zzb(zzyu zzyu) throws zzaaf {
        return zzgu.zzc(zzyu, zzzk.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", zzci.zzg(16, 16, 32, 16, 5, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzci.zzg(16, 16, 32, 16, 5, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", zzci.zzg(32, 16, 32, 32, 5, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzci.zzg(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzabc zzabc) throws GeneralSecurityException {
        zzgu zzgu = (zzgu) zzabc;
        ((zzck) new zzcl().zza()).zzd(zzgu.zzd());
        new zzfx().zza().zzd(zzgu.zze());
        zznm.zzb(zzgu.zzd().zza());
    }
}
