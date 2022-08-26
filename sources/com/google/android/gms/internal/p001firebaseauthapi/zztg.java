package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.internal.zzg;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztg  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zztg extends zzut {
    private final zzps zza;

    public zztg(String str, String str2) {
        super(2);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(str2);
        this.zza = new zzps(str, str2);
    }

    public final String zza() {
        return "unenrollMfa";
    }

    public final void zzb() {
        ((zzg) this.zzf).zza(this.zzj, zztq.zzN(this.zzd, this.zzk));
        zzm((Object) null);
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zztt zztt) {
        this.zzv = new zzus(this, taskCompletionSource);
        zztt.zzB(this.zza, this.zzc);
    }
}
