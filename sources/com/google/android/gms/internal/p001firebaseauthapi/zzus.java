package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzus  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzus {
    private final zzut zza;
    private final TaskCompletionSource zzb;

    public zzus(zzut zzut, TaskCompletionSource taskCompletionSource) {
        this.zza = zzut;
        this.zzb = taskCompletionSource;
    }

    public final void zza(Object obj, Status status) {
        FirebaseUser firebaseUser;
        Preconditions.checkNotNull(this.zzb, "completion source cannot be null");
        if (status != null) {
            zzut zzut = this.zza;
            if (zzut.zzs != null) {
                TaskCompletionSource taskCompletionSource = this.zzb;
                FirebaseAuth instance = FirebaseAuth.getInstance(zzut.zzd);
                zzut zzut2 = this.zza;
                zzqe zzqe = zzut2.zzs;
                if ("reauthenticateWithCredential".equals(zzut2.zza()) || "reauthenticateWithCredentialWithData".equals(this.zza.zza())) {
                    firebaseUser = this.zza.zze;
                } else {
                    firebaseUser = null;
                }
                taskCompletionSource.setException(zztu.zzc(instance, zzqe, firebaseUser));
                return;
            }
            AuthCredential authCredential = zzut.zzp;
            if (authCredential != null) {
                this.zzb.setException(zztu.zzb(status, authCredential, zzut.zzq, zzut.zzr));
            } else {
                this.zzb.setException(zztu.zza(status));
            }
        } else {
            this.zzb.setResult(obj);
        }
    }
}
