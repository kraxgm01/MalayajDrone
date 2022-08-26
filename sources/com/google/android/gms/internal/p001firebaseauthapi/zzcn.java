package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzcn extends zzfn {
    final /* synthetic */ zzco zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzcn(zzco zzco, Class cls) {
        super(cls);
        this.zza = zzco;
    }

    public final /* bridge */ /* synthetic */ zzabc zza(zzabc zzabc) throws GeneralSecurityException {
        zzhj zzhj = (zzhj) zzabc;
        zzhf zzb = zzhg.zzb();
        zzb.zza(zzyu.zzn(zznk.zza(zzhj.zza())));
        zzb.zzb(zzhj.zze());
        zzb.zzc(0);
        return (zzhg) zzb.zzk();
    }

    public final /* synthetic */ zzabc zzb(zzyu zzyu) throws zzaaf {
        return zzhj.zzd(zzyu, zzzk.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_EAX", zzco.zzg(16, 16, 1));
        hashMap.put("AES128_EAX_RAW", zzco.zzg(16, 16, 3));
        hashMap.put("AES256_EAX", zzco.zzg(32, 16, 1));
        hashMap.put("AES256_EAX_RAW", zzco.zzg(32, 16, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzabc zzabc) throws GeneralSecurityException {
        zzhj zzhj = (zzhj) zzabc;
        zznm.zzb(zzhj.zza());
        if (zzhj.zze().zza() != 12 && zzhj.zze().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }
}
