package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzai;
import com.google.firebase.auth.zze;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzrx {
    /* access modifiers changed from: private */
    public final zzuz zza;

    public zzrx(zzuz zzuz) {
        this.zza = (zzuz) Preconditions.checkNotNull(zzuz);
    }

    private final void zzM(String str, zzuy zzuy) {
        Preconditions.checkNotNull(zzuy);
        Preconditions.checkNotEmpty(str);
        zzwq zzd = zzwq.zzd(str);
        if (zzd.zzj()) {
            zzuy.zzb(zzd);
            return;
        }
        this.zza.zzf(new zzwf(zzd.zzf()), new zzrw(this, zzuy));
    }

    /* access modifiers changed from: private */
    public final void zzN(zzvy zzvy, zzts zzts) {
        Preconditions.checkNotNull(zzvy);
        Preconditions.checkNotNull(zzts);
        this.zza.zzc(zzvy, new zzqj(this, zzts));
    }

    /* access modifiers changed from: private */
    public final void zzO(zzwq zzwq, String str, String str2, Boolean bool, zze zze, zzts zzts, zzux zzux) {
        Preconditions.checkNotNull(zzwq);
        Preconditions.checkNotNull(zzux);
        Preconditions.checkNotNull(zzts);
        this.zza.zzg(new zzwg(zzwq.zze()), new zzqm(this, zzux, str2, str, bool, zze, zzts, zzwq));
    }

    private final void zzP(zzwn zzwn, zzts zzts) {
        Preconditions.checkNotNull(zzwn);
        Preconditions.checkNotNull(zzts);
        this.zza.zzh(zzwn, new zzrp(this, zzts));
    }

    static /* bridge */ /* synthetic */ void zzd(zzrx zzrx, zzxs zzxs, zzts zzts, zzux zzux) {
        Status status;
        if (zzxs.zzp()) {
            zze zzc = zzxs.zzc();
            String zzd = zzxs.zzd();
            String zzk = zzxs.zzk();
            if (zzxs.zzn()) {
                status = new Status(FirebaseError.ERROR_ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL);
            } else {
                status = zzai.zza(zzxs.zze());
            }
            zzts.zze(new zzqc(status, zzc, zzd, zzk));
            return;
        }
        zzrx.zzO(new zzwq(zzxs.zzj(), zzxs.zzf(), Long.valueOf(zzxs.zzb()), "Bearer"), zzxs.zzi(), zzxs.zzh(), Boolean.valueOf(zzxs.zzo()), zzxs.zzc(), zzts, zzux);
    }

    static /* bridge */ /* synthetic */ void zze(zzrx zzrx, zzts zzts, zzwq zzwq, zzxg zzxg, zzux zzux) {
        Preconditions.checkNotNull(zzts);
        Preconditions.checkNotNull(zzwq);
        Preconditions.checkNotNull(zzxg);
        Preconditions.checkNotNull(zzux);
        zzrx.zza.zzg(new zzwg(zzwq.zze()), new zzqk(zzrx, zzux, zzts, zzwq, zzxg));
    }

    static /* bridge */ /* synthetic */ void zzf(zzrx zzrx, zzts zzts, zzwq zzwq, zzwj zzwj, zzxg zzxg, zzux zzux) {
        Preconditions.checkNotNull(zzts);
        Preconditions.checkNotNull(zzwq);
        Preconditions.checkNotNull(zzwj);
        Preconditions.checkNotNull(zzxg);
        Preconditions.checkNotNull(zzux);
        zzrx.zza.zzl(zzxg, new zzql(zzrx, zzxg, zzwj, zzts, zzwq, zzux));
    }

    public final void zzA(zzxq zzxq, zzts zzts) {
        Preconditions.checkNotNull(zzxq);
        Preconditions.checkNotNull(zzts);
        zzxq.zzd(true);
        this.zza.zzq(zzxq, new zzrq(this, zzts));
    }

    public final void zzB(zzxt zzxt, zzts zzts) {
        Preconditions.checkNotNull(zzxt);
        Preconditions.checkNotNull(zzts);
        this.zza.zzr(zzxt, new zzrf(this, zzts));
    }

    public final void zzC(String str, String str2, String str3, zzts zzts) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzts);
        this.zza.zzs(new zzxw(str, str2, str3), new zzqh(this, zzts));
    }

    public final void zzD(EmailAuthCredential emailAuthCredential, zzts zzts) {
        Preconditions.checkNotNull(emailAuthCredential);
        Preconditions.checkNotNull(zzts);
        if (emailAuthCredential.zzh()) {
            zzM(emailAuthCredential.zzc(), new zzqi(this, emailAuthCredential, zzts));
        } else {
            zzN(new zzvy(emailAuthCredential, (String) null), zzts);
        }
    }

    public final void zzE(zzxy zzxy, zzts zzts) {
        Preconditions.checkNotNull(zzxy);
        Preconditions.checkNotNull(zzts);
        this.zza.zzt(zzxy, new zzqt(this, zzts));
    }

    public final void zzF(zzxk zzxk, zzts zzts) {
        Preconditions.checkNotNull(zzxk);
        Preconditions.checkNotNull(zzts);
        this.zza.zzo(zzxk, new zzre(this, zzts));
    }

    public final void zzG(zzxm zzxm, zzts zzts) {
        Preconditions.checkNotNull(zzxm);
        Preconditions.checkNotNull(zzts);
        this.zza.zzp(zzxm, new zzrj(this, zzts));
    }

    public final void zzH(String str, String str2, zzts zzts) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzts);
        zzM(str, new zzrd(this, str2, zzts));
    }

    public final void zzI(String str, zzts zzts) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzts);
        zzM(str, new zzqz(this, zzts));
    }

    public final void zzJ(String str, String str2, zzts zzts) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzts);
        zzM(str2, new zzrb(this, str, zzts));
    }

    public final void zzK(String str, UserProfileChangeRequest userProfileChangeRequest, zzts zzts) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(userProfileChangeRequest);
        Preconditions.checkNotNull(zzts);
        zzM(str, new zzrs(this, userProfileChangeRequest, zzts));
    }

    public final void zzL(zzwn zzwn, zzts zzts) {
        zzP(zzwn, zzts);
    }

    public final void zzg(String str, String str2, zzts zzts) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzts);
        zzxg zzxg = new zzxg();
        zzxg.zzf(str);
        zzxg.zzi(str2);
        this.zza.zzl(zzxg, new zzrv(this, zzts));
    }

    public final void zzh(String str, String str2, zzts zzts) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzts);
        zzM(str, new zzrt(this, str2, zzts));
    }

    public final void zzi(String str, String str2, zzts zzts) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzts);
        zzM(str, new zzru(this, str2, zzts));
    }

    public final void zzj(String str, String str2, zzts zzts) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzts);
        this.zza.zzj(new zzxa(str, (String) null, str2), new zzqp(this, zzts));
    }

    public final void zzk(String str, String str2, String str3, zzts zzts) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzts);
        this.zza.zzj(new zzxa(str, str2, str3), new zzqr(this, zzts));
    }

    public final void zzl(String str, String str2, String str3, zzts zzts) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotNull(zzts);
        this.zza.zzn(new zzxi(str, str2, (String) null, str3), new zzqg(this, zzts));
    }

    public final void zzm(String str, zzts zzts) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzts);
        zzM(str, new zzrn(this, zzts));
    }

    public final void zzn(zzwa zzwa, String str, zzts zzts) {
        Preconditions.checkNotNull(zzwa);
        Preconditions.checkNotNull(zzts);
        zzM(str, new zzrh(this, zzwa, zzts));
    }

    public final void zzo(zzwc zzwc, zzts zzts) {
        Preconditions.checkNotNull(zzwc);
        Preconditions.checkNotNull(zzts);
        this.zza.zze(zzwc, new zzri(this, zzts));
    }

    public final void zzp(String str, zzts zzts) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzts);
        this.zza.zzf(new zzwf(str), new zzqq(this, zzts));
    }

    public final void zzq(String str, String str2, zzts zzts) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzts);
        this.zza.zza(new zzvu(str, str2), new zzqn(this, zzts));
    }

    public final void zzr(String str, String str2, String str3, zzts zzts) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        Preconditions.checkNotNull(zzts);
        zzM(str3, new zzqu(this, str, str2, zzts));
    }

    public final void zzs(String str, zzxq zzxq, zzts zzts) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzxq);
        Preconditions.checkNotNull(zzts);
        zzM(str, new zzqy(this, zzxq, zzts));
    }

    public final void zzt(String str, zzxy zzxy, zzts zzts) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzxy);
        Preconditions.checkNotNull(zzts);
        zzM(str, new zzqw(this, zzxy, zzts));
    }

    public final void zzu(String str, zzts zzts) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzts);
        zzM(str, new zzrl(this, zzts));
    }

    public final void zzv(String str, ActionCodeSettings actionCodeSettings, zzts zzts) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzts);
        zzwn zzwn = new zzwn(4);
        zzwn.zzg(str);
        if (actionCodeSettings != null) {
            zzwn.zzd(actionCodeSettings);
        }
        zzP(zzwn, zzts);
    }

    public final void zzw(String str, ActionCodeSettings actionCodeSettings, String str2, zzts zzts) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(zzts);
        zzwn zzwn = new zzwn(actionCodeSettings.zza());
        zzwn.zze(str);
        zzwn.zzd(actionCodeSettings);
        zzwn.zzf(str2);
        this.zza.zzh(zzwn, new zzqo(this, zzts));
    }

    public final void zzx(zzxd zzxd, zzts zzts) {
        Preconditions.checkNotEmpty(zzxd.zzd());
        Preconditions.checkNotNull(zzts);
        this.zza.zzk(zzxd, new zzqs(this, zzts));
    }

    public final void zzy(String str, zzts zzts) {
        Preconditions.checkNotNull(zzts);
        this.zza.zzm(str, new zzro(this, zzts));
    }

    public final void zzz(String str, zzts zzts) {
        Preconditions.checkNotNull(zzts);
        this.zza.zzn(new zzxi(str), new zzrr(this, zzts));
    }
}
