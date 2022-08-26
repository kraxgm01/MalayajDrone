package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaat  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzaat implements zzaba {
    private final zzaba[] zza;

    zzaat(zzaba... zzabaArr) {
        this.zza = zzabaArr;
    }

    public final zzaaz zzb(Class cls) {
        zzaba[] zzabaArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzaba zzaba = zzabaArr[i];
            if (zzaba.zzc(cls)) {
                return zzaba.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    public final boolean zzc(Class cls) {
        zzaba[] zzabaArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zzabaArr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
