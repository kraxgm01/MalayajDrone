package com.google.android.gms.internal.p001firebaseauthapi;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzec  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzec extends zzfp {
    zzec(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object zza(zzabc zzabc) throws GeneralSecurityException {
        zziy zziy = (zziy) zzabc;
        zziv zzb = zziy.zze().zzb();
        zzje zze = zzb.zze();
        int zzc = zzen.zzc(zze.zzf());
        byte[] zzt = zziy.zzf().zzt();
        ECPrivateKeySpec eCPrivateKeySpec = new ECPrivateKeySpec(new BigInteger(1, zzt), zzmr.zzf(zzc));
        return new zzmn((ECPrivateKey) ((KeyFactory) zzmt.zzg.zza("EC")).generatePrivate(eCPrivateKeySpec), zze.zzd().zzt(), zzen.zzb(zze.zzg()), zzen.zzd(zzb.zzh()), new zzeo(zzb.zza().zzd()));
    }
}
