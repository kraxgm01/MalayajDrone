package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzsb extends zzut {
    private final zzny zza;

    public zzsb(String str, String str2, String str3) {
        super(4);
        Preconditions.checkNotEmpty(str, "code cannot be null or empty");
        Preconditions.checkNotEmpty(str2, "new password cannot be null or empty");
        this.zza = new zzny(str, str2, str3);
    }

    public final String zza() {
        return "confirmPasswordReset";
    }

    public final void zzb() {
        zzm((Object) null);
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zztt zztt) {
        this.zzv = new zzus(this, taskCompletionSource);
        zztt.zze(this.zza, this.zzc);
    }
}
