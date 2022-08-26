package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzeh  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzeh {
    @Deprecated
    public static final zzlu zza = zzlu.zzb();
    @Deprecated
    public static final zzlu zzb = zzlu.zzb();
    @Deprecated
    public static final zzlu zzc = zzlu.zzb();

    static {
        new zzeg();
        new zzee();
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzbz.zzo(new zzej());
        zzbz.zzo(new zzel());
        zzcb.zza();
        if (!zzdv.zzb()) {
            zzbz.zzm(new zzee(), new zzeg(), true);
            zzbz.zzm(new zzez(), new zzfb(), true);
        }
    }
}
