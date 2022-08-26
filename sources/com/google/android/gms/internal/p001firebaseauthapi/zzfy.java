package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfy  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzfy {
    @Deprecated
    public static final zzlu zza;
    @Deprecated
    public static final zzlu zzb;
    @Deprecated
    public static final zzlu zzc;

    static {
        new zzfx();
        zzlu zzb2 = zzlu.zzb();
        zza = zzb2;
        zzb = zzb2;
        zzc = zzb2;
        try {
            zza();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzbz.zzo(new zzgb());
        zzbz.zzn(new zzfx(), true);
        if (!zzdv.zzb()) {
            zzbz.zzn(new zzfu(), true);
        }
    }
}
