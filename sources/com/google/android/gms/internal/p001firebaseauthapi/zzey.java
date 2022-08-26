package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzey  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzey extends zzfn {
    final /* synthetic */ zzez zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzey(zzez zzez, Class cls) {
        super(cls);
        this.zza = zzez;
    }

    public final /* bridge */ /* synthetic */ zzabc zza(zzabc zzabc) throws GeneralSecurityException {
        byte[] zza2 = zznk.zza(32);
        zza2[0] = (byte) (zza2[0] | 7);
        byte b = zza2[31] & 63;
        zza2[31] = (byte) b;
        zza2[31] = (byte) (b | ByteCompanionObject.MIN_VALUE);
        byte[] zzb = zznn.zzb(zza2);
        zzkh zzc = zzki.zzc();
        zzc.zzc(0);
        zzc.zza(((zzjz) zzabc).zzd());
        zzc.zzb(zzyu.zzn(zzb));
        zzke zzb2 = zzkf.zzb();
        zzb2.zzc(0);
        zzb2.zzb((zzki) zzc.zzk());
        zzb2.zza(zzyu.zzn(zza2));
        return (zzkf) zzb2.zzk();
    }

    public final /* synthetic */ zzabc zzb(zzyu zzyu) throws zzaaf {
        return zzjz.zzc(zzyu, zzzk.zza());
    }

    public final Map zzc() {
        HashMap hashMap = new HashMap();
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzez.zzh(3, 3, 3, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzez.zzh(3, 3, 3, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzez.zzh(3, 3, 4, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzez.zzh(3, 3, 4, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", zzez.zzh(3, 3, 5, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", zzez.zzh(3, 3, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* synthetic */ void zzd(zzabc zzabc) throws GeneralSecurityException {
        zzfc.zza(((zzjz) zzabc).zzd());
    }
}
