package com.google.android.gms.internal.p001firebaseauthapi;

import androidx.core.internal.view.SupportMenu;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzzj {
    private final Object zza;
    private final int zzb;

    zzzj(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzzj)) {
            return false;
        }
        zzzj zzzj = (zzzj) obj;
        if (this.zza == zzzj.zza && this.zzb == zzzj.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * SupportMenu.USER_MASK) + this.zzb;
    }
}
