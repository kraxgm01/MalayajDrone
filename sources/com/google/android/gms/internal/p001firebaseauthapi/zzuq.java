package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.internal.zzai;
import com.google.firebase.auth.internal.zzao;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzuq implements zztr {
    final /* synthetic */ zzut zza;

    zzuq(zzut zzut) {
        this.zza = zzut;
    }

    private final void zzp(zzur zzur) {
        this.zza.zzi.execute(new zzup(this, zzur));
    }

    private final void zzq(Status status, AuthCredential authCredential, String str, String str2) {
        zzut.zzk(this.zza, status);
        zzut zzut = this.zza;
        zzut.zzp = authCredential;
        zzut.zzq = str;
        zzut.zzr = str2;
        zzao zzao = zzut.zzg;
        if (zzao != null) {
            zzao.zzb(status);
        }
        this.zza.zzl(status);
    }

    public final void zza(String str) throws RemoteException {
        boolean z;
        int i = this.zza.zzb;
        if (i == 8) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Unexpected response type " + i);
        zzut zzut = this.zza;
        zzut.zzo = str;
        zzut.zza = true;
        zzp(new zzun(this, str));
    }

    public final void zzb(String str) throws RemoteException {
        boolean z;
        int i = this.zza.zzb;
        if (i == 8) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Unexpected response type " + i);
        this.zza.zzo = str;
        zzp(new zzul(this, str));
    }

    public final void zzc(zzvv zzvv) throws RemoteException {
        boolean z;
        int i = this.zza.zzb;
        if (i == 3) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Unexpected response type " + i);
        zzut zzut = this.zza;
        zzut.zzl = zzvv;
        zzut.zzj(zzut);
    }

    public final void zzd() throws RemoteException {
        boolean z;
        int i = this.zza.zzb;
        if (i == 5) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Unexpected response type " + i);
        zzut.zzj(this.zza);
    }

    public final void zze(zzqc zzqc) {
        zzq(zzqc.zza(), zzqc.zzb(), zzqc.zzc(), zzqc.zzd());
    }

    public final void zzf(zzqe zzqe) {
        zzut zzut = this.zza;
        zzut.zzs = zzqe;
        zzut.zzl(zzai.zza("REQUIRES_SECOND_FACTOR_AUTH"));
    }

    public final void zzg(Status status, PhoneAuthCredential phoneAuthCredential) throws RemoteException {
        boolean z;
        int i = this.zza.zzb;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Unexpected response type " + i);
        zzq(status, phoneAuthCredential, (String) null, (String) null);
    }

    public final void zzh(Status status) throws RemoteException {
        String statusMessage = status.getStatusMessage();
        if (statusMessage != null) {
            if (statusMessage.contains("MISSING_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17081);
            } else if (statusMessage.contains("MISSING_MFA_ENROLLMENT_ID")) {
                status = new Status(17082);
            } else if (statusMessage.contains("INVALID_MFA_PENDING_CREDENTIAL")) {
                status = new Status(17083);
            } else if (statusMessage.contains("MFA_ENROLLMENT_NOT_FOUND")) {
                status = new Status(17084);
            } else if (statusMessage.contains("ADMIN_ONLY_OPERATION")) {
                status = new Status(17085);
            } else if (statusMessage.contains("UNVERIFIED_EMAIL")) {
                status = new Status(17086);
            } else if (statusMessage.contains("SECOND_FACTOR_EXISTS")) {
                status = new Status(17087);
            } else if (statusMessage.contains("SECOND_FACTOR_LIMIT_EXCEEDED")) {
                status = new Status(17088);
            } else if (statusMessage.contains("UNSUPPORTED_FIRST_FACTOR")) {
                status = new Status(17089);
            } else if (statusMessage.contains("EMAIL_CHANGE_NEEDS_VERIFICATION")) {
                status = new Status(17090);
            }
        }
        zzut zzut = this.zza;
        if (zzut.zzb == 8) {
            zzut.zza = true;
            zzp(new zzuo(this, status));
            return;
        }
        zzut.zzk(zzut, status);
        this.zza.zzl(status);
    }

    public final void zzi(zzwq zzwq, zzwj zzwj) throws RemoteException {
        boolean z;
        int i = this.zza.zzb;
        if (i == 2) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Unexpected response type: " + i);
        zzut zzut = this.zza;
        zzut.zzj = zzwq;
        zzut.zzk = zzwj;
        zzut.zzj(zzut);
    }

    public final void zzj(zzxb zzxb) throws RemoteException {
        boolean z;
        int i = this.zza.zzb;
        if (i == 4) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Unexpected response type " + i);
        zzut zzut = this.zza;
        zzut.zzm = zzxb;
        zzut.zzj(zzut);
    }

    public final void zzk() throws RemoteException {
        boolean z;
        int i = this.zza.zzb;
        if (i == 6) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Unexpected response type " + i);
        zzut.zzj(this.zza);
    }

    public final void zzl(String str) throws RemoteException {
        boolean z;
        int i = this.zza.zzb;
        if (i == 7) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Unexpected response type " + i);
        zzut zzut = this.zza;
        zzut.zzn = str;
        zzut.zzj(zzut);
    }

    public final void zzm() throws RemoteException {
        boolean z;
        int i = this.zza.zzb;
        if (i == 9) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Unexpected response type " + i);
        zzut.zzj(this.zza);
    }

    public final void zzn(zzwq zzwq) throws RemoteException {
        int i = this.zza.zzb;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        Preconditions.checkState(z, "Unexpected response type: " + i);
        zzut zzut = this.zza;
        zzut.zzj = zzwq;
        zzut.zzj(zzut);
    }

    public final void zzo(PhoneAuthCredential phoneAuthCredential) throws RemoteException {
        boolean z;
        int i = this.zza.zzb;
        if (i == 8) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkState(z, "Unexpected response type " + i);
        this.zza.zza = true;
        zzp(new zzum(this, phoneAuthCredential));
    }
}
