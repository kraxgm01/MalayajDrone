package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzg;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zztj extends zzut {
    private final String zza;

    public zztj(String str) {
        super(2);
        this.zza = Preconditions.checkNotEmpty(str, "email cannot be null or empty");
    }

    public final String zza() {
        return "updateEmail";
    }

    public final void zzb() {
        ((zzg) this.zzf).zza(this.zzj, zztq.zzN(this.zzd, this.zzk));
        zzm((Object) null);
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zztt zztt) {
        this.zzv = new zzus(this, taskCompletionSource);
        zztt.zzb(new zzns(this.zze.zzf(), this.zza), this.zzc);
    }
}
