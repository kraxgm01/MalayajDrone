package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzan;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzsd extends zzut {
    public zzsd() {
        super(5);
    }

    public final String zza() {
        return "delete";
    }

    public final void zzb() {
        ((zzan) this.zzf).zza();
        zzm((Object) null);
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zztt zztt) {
        this.zzv = new zzus(this, taskCompletionSource);
        zztt.zzg(new zzoc(this.zze.zzf()), this.zzc);
    }
}
