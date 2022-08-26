package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzed  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzed extends zzfn {
    final /* synthetic */ zzee zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzed(zzee zzee, Class cls) {
        super(cls);
        this.zza = zzee;
    }

    public final /* bridge */ /* synthetic */ zzabc zza(zzabc zzabc) throws GeneralSecurityException {
        zzis zzis = (zzis) zzabc;
        ECParameterSpec zzf = zzmr.zzf(zzen.zzc(zzis.zzd().zze().zzf()));
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) zzmt.zzf.zza("EC");
        keyPairGenerator.initialize(zzf);
        KeyPair generateKeyPair = keyPairGenerator.generateKeyPair();
        ECPoint w = ((ECPublicKey) generateKeyPair.getPublic()).getW();
        zzja zzc = zzjb.zzc();
        zzc.zzb(0);
        zzc.zza(zzis.zzd());
        zzc.zzc(zzyu.zzn(w.getAffineX().toByteArray()));
        zzc.zzd(zzyu.zzn(w.getAffineY().toByteArray()));
        zzix zzb = zziy.zzb();
        zzb.zzc(0);
        zzb.zzb((zzjb) zzc.zzk());
        zzb.zza(zzyu.zzn(((ECPrivateKey) generateKeyPair.getPrivate()).getS().toByteArray()));
        return (zziy) zzb.zzk();
    }

    public final /* synthetic */ zzabc zzb(zzyu zzyu) throws zzaaf {
        return zzis.zzc(zzyu, zzzk.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zzee.zzi(4, 5, 3, zzbf.zza("AES128_GCM"), zzee.zza, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzee.zzi(4, 5, 3, zzbf.zza("AES128_GCM"), zzee.zza, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zzee.zzi(4, 5, 4, zzbf.zza("AES128_GCM"), zzee.zza, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzee.zzi(4, 5, 4, zzbf.zza("AES128_GCM"), zzee.zza, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzee.zzi(4, 5, 4, zzbf.zza("AES128_GCM"), zzee.zza, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzee.zzi(4, 5, 3, zzbf.zza("AES128_CTR_HMAC_SHA256"), zzee.zza, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzee.zzi(4, 5, 3, zzbf.zza("AES128_CTR_HMAC_SHA256"), zzee.zza, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzee.zzi(4, 5, 4, zzbf.zza("AES128_CTR_HMAC_SHA256"), zzee.zza, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzee.zzi(4, 5, 4, zzbf.zza("AES128_CTR_HMAC_SHA256"), zzee.zza, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* synthetic */ void zzd(zzabc zzabc) throws GeneralSecurityException {
        zzen.zza(((zzis) zzabc).zzd());
    }
}
