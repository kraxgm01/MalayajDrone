package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzdx extends zzfn {
    final /* synthetic */ zzdy zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzdx(zzdy zzdy, Class cls) {
        super(cls);
        this.zza = zzdy;
    }

    public final /* bridge */ /* synthetic */ zzabc zza(zzabc zzabc) throws GeneralSecurityException {
        zzia zzb = zzib.zzb();
        zzb.zza(zzyu.zzn(zznk.zza(((zzie) zzabc).zza())));
        zzb.zzb(0);
        return (zzib) zzb.zzk();
    }

    public final /* synthetic */ zzabc zzb(zzyu zzyu) throws zzaaf {
        return zzie.zzd(zzyu, zzzk.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzid zzb = zzie.zzb();
        zzb.zza(64);
        hashMap.put("AES256_SIV", new zzfm((zzie) zzb.zzk(), 1));
        zzid zzb2 = zzie.zzb();
        zzb2.zza(64);
        hashMap.put("AES256_SIV_RAW", new zzfm((zzie) zzb2.zzk(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzabc zzabc) throws GeneralSecurityException {
        zzie zzie = (zzie) zzabc;
        if (zzie.zza() != 64) {
            int zza2 = zzie.zza();
            throw new InvalidAlgorithmParameterException("invalid key size: " + zza2 + ". Valid keys must have 64 bytes.");
        }
    }
}
