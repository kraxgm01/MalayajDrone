package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzcb {
    public static final String zza = "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    public static final String zzb = "type.googleapis.com/google.crypto.tink.AesGcmKey";
    @Deprecated
    public static final zzlu zzc;
    @Deprecated
    public static final zzlu zzd;
    @Deprecated
    public static final zzlu zze;

    static {
        new zzci();
        new zzcr();
        new zzcu();
        new zzco();
        new zzda();
        new zzde();
        new zzcx();
        new zzdh();
        zzlu zzb2 = zzlu.zzb();
        zzc = zzb2;
        zzd = zzb2;
        zze = zzb2;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzbz.zzo(new zzcf());
        zzfy.zza();
        zzbz.zzn(new zzci(), true);
        zzbz.zzn(new zzcr(), true);
        if (!zzdv.zzb()) {
            zzbz.zzn(new zzco(), true);
            zzcu.zzg(true);
            zzbz.zzn(new zzcx(), true);
            zzbz.zzn(new zzda(), true);
            zzbz.zzn(new zzde(), true);
            zzbz.zzn(new zzdh(), true);
        }
    }
}
