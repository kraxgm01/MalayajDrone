package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuw  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public class zzuw {
    zztt zza;
    ExecutorService zzb;

    public final Task zzP(zzuv zzuv) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zzb.execute(new zzuu(this, zzuv, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
