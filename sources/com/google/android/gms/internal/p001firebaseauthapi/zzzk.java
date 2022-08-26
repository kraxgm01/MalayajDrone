package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzk  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzzk {
    static final zzzk zza = new zzzk(true);
    private static volatile boolean zzb = false;
    private static volatile zzzk zzc;
    private final Map zzd;

    zzzk() {
        this.zzd = new HashMap();
    }

    public static zzzk zza() {
        zzzk zzzk = zzc;
        if (zzzk == null) {
            synchronized (zzzk.class) {
                zzzk = zzc;
                if (zzzk == null) {
                    zzzk = zza;
                    zzc = zzzk;
                }
            }
        }
        return zzzk;
    }

    public final zzzv zzb(zzabc zzabc, int i) {
        return (zzzv) this.zzd.get(new zzzj(zzabc, i));
    }

    zzzk(boolean z) {
        this.zzd = Collections.emptyMap();
    }
}
