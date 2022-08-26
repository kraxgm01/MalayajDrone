package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzs  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzzs implements zzaba {
    private static final zzzs zza = new zzzs();

    private zzzs() {
    }

    public static zzzs zza() {
        return zza;
    }

    public final zzaaz zzb(Class cls) {
        if (zzzx.class.isAssignableFrom(cls)) {
            try {
                return (zzaaz) zzzx.zzv(cls.asSubclass(zzzx.class)).zzj(3, (Object) null, (Object) null);
            } catch (Exception e) {
                throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
    }

    public final boolean zzc(Class cls) {
        return zzzx.class.isAssignableFrom(cls);
    }
}
