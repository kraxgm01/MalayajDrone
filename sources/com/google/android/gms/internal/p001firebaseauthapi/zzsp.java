package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzr;
import com.google.firebase.auth.internal.zzx;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzsp  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzsp extends zzut {
    private final zzpk zza;

    public zzsp(EmailAuthCredential emailAuthCredential) {
        super(2);
        Preconditions.checkNotNull(emailAuthCredential, "credential cannot be null or empty");
        this.zza = new zzpk(emailAuthCredential);
    }

    public final String zza() {
        return "reauthenticateWithEmailLinkWithData";
    }

    public final void zzb() {
        zzx zzN = zztq.zzN(this.zzd, this.zzk);
        if (this.zze.getUid().equalsIgnoreCase(zzN.getUid())) {
            ((zzg) this.zzf).zza(this.zzj, zzN);
            zzm(new zzr(zzN));
            return;
        }
        zzl(new Status(FirebaseError.ERROR_USER_MISMATCH));
    }

    public final void zzc(TaskCompletionSource taskCompletionSource, zztt zztt) {
        this.zzv = new zzus(this, taskCompletionSource);
        zztt.zzx(this.zza, this.zzc);
    }
}
