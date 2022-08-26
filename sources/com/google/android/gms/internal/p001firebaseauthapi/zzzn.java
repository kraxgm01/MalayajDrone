package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzzn {
    private static final zzzl zza = new zzzm();
    private static final zzzl zzb;

    static {
        zzzl zzzl;
        try {
            zzzl = (zzzl) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            zzzl = null;
        }
        zzb = zzzl;
    }

    static zzzl zza() {
        zzzl zzzl = zzb;
        if (zzzl != null) {
            return zzzl;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static zzzl zzb() {
        return zza;
    }
}
