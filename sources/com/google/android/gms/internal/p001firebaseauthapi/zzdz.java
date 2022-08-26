package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzdz {
    public static final String zza = "type.googleapis.com/google.crypto.tink.AesSivKey";
    @Deprecated
    public static final zzlu zzb = zzlu.zzb();
    @Deprecated
    public static final zzlu zzc = zzlu.zzb();

    static {
        new zzdy();
        try {
            zzbz.zzo(new zzeb());
            if (!zzdv.zzb()) {
                zzbz.zzn(new zzdy(), true);
            }
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
