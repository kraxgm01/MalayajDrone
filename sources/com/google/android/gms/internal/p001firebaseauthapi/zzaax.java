package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Iterator;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaax  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzaax {
    zzaax() {
    }

    public static final int zza(int i, Object obj, Object obj2) {
        zzaaw zzaaw = (zzaaw) obj;
        zzaav zzaav = (zzaav) obj2;
        if (zzaaw.isEmpty()) {
            return 0;
        }
        Iterator it = zzaaw.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final boolean zzb(Object obj) {
        return !((zzaaw) obj).zze();
    }

    public static final Object zzc(Object obj, Object obj2) {
        zzaaw zzaaw = (zzaaw) obj;
        zzaaw zzaaw2 = (zzaaw) obj2;
        if (!zzaaw2.isEmpty()) {
            if (!zzaaw.zze()) {
                zzaaw = zzaaw.zzb();
            }
            zzaaw.zzd(zzaaw2);
        }
        return zzaaw;
    }
}
