package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfw  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzfw extends zzfn {
    final /* synthetic */ zzfx zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzfw(zzfx zzfx, Class cls) {
        super(cls);
        this.zza = zzfx;
    }

    public final /* bridge */ /* synthetic */ zzabc zza(zzabc zzabc) throws GeneralSecurityException {
        zzjr zzjr = (zzjr) zzabc;
        zzjn zzb = zzjo.zzb();
        zzb.zzc(0);
        zzb.zzb(zzjr.zzf());
        zzb.zza(zzyu.zzn(zznk.zza(zzjr.zza())));
        return (zzjo) zzb.zzk();
    }

    public final /* synthetic */ zzabc zzb(zzyu zzyu) throws zzaaf {
        return zzjr.zze(zzyu, zzzk.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", zzfx.zzi(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", zzfx.zzi(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", zzfx.zzi(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzfx.zzi(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", zzfx.zzi(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzfx.zzi(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", zzfx.zzi(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzfx.zzi(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", zzfx.zzi(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzfx.zzi(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzabc zzabc) throws GeneralSecurityException {
        zzjr zzjr = (zzjr) zzabc;
        if (zzjr.zza() >= 16) {
            zzfx.zzn(zzjr.zzf());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
