package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuu  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final /* synthetic */ class zzuu implements Runnable {
    public final /* synthetic */ zzuw zza;
    public final /* synthetic */ zzuv zzb;
    public final /* synthetic */ TaskCompletionSource zzc;

    public /* synthetic */ zzuu(zzuw zzuw, zzuv zzuv, TaskCompletionSource taskCompletionSource) {
        this.zza = zzuw;
        this.zzb = zzuv;
        this.zzc = taskCompletionSource;
    }

    public final void run() {
        this.zzb.zzc(this.zzc, this.zza.zza);
    }
}
