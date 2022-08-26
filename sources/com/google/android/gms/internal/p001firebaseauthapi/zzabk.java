package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabk  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzabk {
    private static final zzabk zza = new zzabk();
    private final zzabp zzb = new zzaau();
    private final ConcurrentMap zzc = new ConcurrentHashMap();

    private zzabk() {
    }

    public static zzabk zza() {
        return zza;
    }

    public final zzabo zzb(Class cls) {
        zzaad.zzf(cls, "messageType");
        zzabo zzabo = (zzabo) this.zzc.get(cls);
        if (zzabo == null) {
            zzabo = this.zzb.zza(cls);
            zzaad.zzf(cls, "messageType");
            zzaad.zzf(zzabo, "schema");
            zzabo zzabo2 = (zzabo) this.zzc.putIfAbsent(cls, zzabo);
            return zzabo2 == null ? zzabo : zzabo2;
        }
    }
}
