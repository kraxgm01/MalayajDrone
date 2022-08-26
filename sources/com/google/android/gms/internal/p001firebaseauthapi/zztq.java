package com.google.android.gms.internal.p001firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.FirebaseAuthProvider;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.PhoneMultiFactorAssertion;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzag;
import com.google.firebase.auth.internal.zzan;
import com.google.firebase.auth.internal.zzba;
import com.google.firebase.auth.internal.zzbk;
import com.google.firebase.auth.internal.zzg;
import com.google.firebase.auth.internal.zzt;
import com.google.firebase.auth.internal.zzx;
import com.google.firebase.auth.internal.zzz;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zztq extends zzuw {
    public zztq(FirebaseApp firebaseApp) {
        this.zza = new zztt(firebaseApp);
        this.zzb = Executors.newCachedThreadPool();
    }

    static zzx zzN(FirebaseApp firebaseApp, zzwj zzwj) {
        Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotNull(zzwj);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzt(zzwj, FirebaseAuthProvider.PROVIDER_ID));
        List zzr = zzwj.zzr();
        if (zzr != null && !zzr.isEmpty()) {
            for (int i = 0; i < zzr.size(); i++) {
                arrayList.add(new zzt((zzww) zzr.get(i)));
            }
        }
        zzx zzx = new zzx(firebaseApp, arrayList);
        zzx.zzr(new zzz(zzwj.zzb(), zzwj.zza()));
        zzx.zzq(zzwj.zzt());
        zzx.zzp(zzwj.zzd());
        zzx.zzi(zzba.zzb(zzwj.zzq()));
        return zzx;
    }

    public final Task zzA(FirebaseApp firebaseApp, String str, String str2, String str3, zzg zzg) {
        zztb zztb = new zztb(str, str2, str3);
        zztb.zzf(firebaseApp);
        zztb.zzd(zzg);
        return zzP(zztb);
    }

    public final Task zzB(FirebaseApp firebaseApp, EmailAuthCredential emailAuthCredential, zzg zzg) {
        zztc zztc = new zztc(emailAuthCredential);
        zztc.zzf(firebaseApp);
        zztc.zzd(zzg);
        return zzP(zztc);
    }

    public final Task zzC(FirebaseApp firebaseApp, PhoneAuthCredential phoneAuthCredential, String str, zzg zzg) {
        zzvh.zzc();
        zztd zztd = new zztd(phoneAuthCredential, str);
        zztd.zzf(firebaseApp);
        zztd.zzd(zzg);
        return zzP(zztd);
    }

    public final Task zzD(zzag zzag, String str, String str2, long j, boolean z, boolean z2, String str3, String str4, boolean z3, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Executor executor, Activity activity) {
        zzte zzte = new zzte(zzag, str, str2, j, z, z2, str3, str4, z3);
        String str5 = str;
        zzte.zzh(onVerificationStateChangedCallbacks, activity, executor, str);
        return zzP(zzte);
    }

    public final Task zzE(zzag zzag, PhoneMultiFactorInfo phoneMultiFactorInfo, String str, long j, boolean z, boolean z2, String str2, String str3, boolean z3, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Executor executor, Activity activity) {
        zztf zztf = new zztf(phoneMultiFactorInfo, Preconditions.checkNotEmpty(zzag.zzd()), str, j, z, z2, str2, str3, z3);
        Activity activity2 = activity;
        zztf.zzh(onVerificationStateChangedCallbacks, activity2, executor, phoneMultiFactorInfo.getUid());
        return zzP(zztf);
    }

    public final Task zzF(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzbk zzbk) {
        zztg zztg = new zztg(firebaseUser.zzf(), str);
        zztg.zzf(firebaseApp);
        zztg.zzg(firebaseUser);
        zztg.zzd(zzbk);
        zztg.zze(zzbk);
        return zzP(zztg);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.tasks.Task zzG(com.google.firebase.FirebaseApp r2, com.google.firebase.auth.FirebaseUser r3, java.lang.String r4, com.google.firebase.auth.internal.zzbk r5) {
        /*
            r1 = this;
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r4)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r3)
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r5)
            java.util.List r0 = r3.zzg()
            if (r0 == 0) goto L_0x0018
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto L_0x001e
        L_0x0018:
            boolean r0 = r3.isAnonymous()
            if (r0 == 0) goto L_0x002e
        L_0x001e:
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status
            r3 = 17016(0x4278, float:2.3844E-41)
            r2.<init>((int) r3, (java.lang.String) r4)
            com.google.firebase.FirebaseException r2 = com.google.android.gms.internal.p001firebaseauthapi.zztu.zza(r2)
            com.google.android.gms.tasks.Task r2 = com.google.android.gms.tasks.Tasks.forException(r2)
            return r2
        L_0x002e:
            int r0 = r4.hashCode()
            switch(r0) {
                case 1216985755: goto L_0x0036;
                default: goto L_0x0035;
            }
        L_0x0035:
            goto L_0x0041
        L_0x0036:
            java.lang.String r0 = "password"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0035
            r0 = 0
            goto L_0x0042
        L_0x0041:
            r0 = -1
        L_0x0042:
            switch(r0) {
                case 0: goto L_0x005b;
                default: goto L_0x0045;
            }
        L_0x0045:
            com.google.android.gms.internal.firebase-auth-api.zzti r0 = new com.google.android.gms.internal.firebase-auth-api.zzti
            r0.<init>(r4)
            r0.zzf(r2)
            r0.zzg(r3)
            r0.zzd(r5)
            r0.zze(r5)
            com.google.android.gms.tasks.Task r2 = r1.zzP(r0)
            return r2
        L_0x005b:
            com.google.android.gms.internal.firebase-auth-api.zzth r4 = new com.google.android.gms.internal.firebase-auth-api.zzth
            r4.<init>()
            r4.zzf(r2)
            r4.zzg(r3)
            r4.zzd(r5)
            r4.zze(r5)
            com.google.android.gms.tasks.Task r2 = r1.zzP(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zztq.zzG(com.google.firebase.FirebaseApp, com.google.firebase.auth.FirebaseUser, java.lang.String, com.google.firebase.auth.internal.zzbk):com.google.android.gms.tasks.Task");
    }

    public final Task zzH(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzbk zzbk) {
        zztj zztj = new zztj(str);
        zztj.zzf(firebaseApp);
        zztj.zzg(firebaseUser);
        zztj.zzd(zzbk);
        zztj.zze(zzbk);
        return zzP(zztj);
    }

    public final Task zzI(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzbk zzbk) {
        zztk zztk = new zztk(str);
        zztk.zzf(firebaseApp);
        zztk.zzg(firebaseUser);
        zztk.zzd(zzbk);
        zztk.zze(zzbk);
        return zzP(zztk);
    }

    public final Task zzJ(FirebaseApp firebaseApp, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, zzbk zzbk) {
        zzvh.zzc();
        zztl zztl = new zztl(phoneAuthCredential);
        zztl.zzf(firebaseApp);
        zztl.zzg(firebaseUser);
        zztl.zzd(zzbk);
        zztl.zze(zzbk);
        return zzP(zztl);
    }

    public final Task zzK(FirebaseApp firebaseApp, FirebaseUser firebaseUser, UserProfileChangeRequest userProfileChangeRequest, zzbk zzbk) {
        zztm zztm = new zztm(userProfileChangeRequest);
        zztm.zzf(firebaseApp);
        zztm.zzg(firebaseUser);
        zztm.zzd(zzbk);
        zztm.zze(zzbk);
        return zzP(zztm);
    }

    public final Task zzL(String str, String str2, ActionCodeSettings actionCodeSettings) {
        actionCodeSettings.zzg(7);
        return zzP(new zztn(str, str2, actionCodeSettings));
    }

    public final Task zzM(FirebaseApp firebaseApp, String str, String str2) {
        zzto zzto = new zzto(str, str2);
        zzto.zzf(firebaseApp);
        return zzP(zzto);
    }

    public final void zzO(FirebaseApp firebaseApp, zzxd zzxd, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Activity activity, Executor executor) {
        zztp zztp = new zztp(zzxd);
        zztp.zzf(firebaseApp);
        zztp.zzh(onVerificationStateChangedCallbacks, activity, executor, zzxd.zzd());
        zzP(zztp);
    }

    public final Task zza(FirebaseApp firebaseApp, String str, String str2) {
        zzrz zzrz = new zzrz(str, str2);
        zzrz.zzf(firebaseApp);
        return zzP(zzrz);
    }

    public final Task zzb(FirebaseApp firebaseApp, String str, String str2) {
        zzsa zzsa = new zzsa(str, str2);
        zzsa.zzf(firebaseApp);
        return zzP(zzsa);
    }

    public final Task zzc(FirebaseApp firebaseApp, String str, String str2, String str3) {
        zzsb zzsb = new zzsb(str, str2, str3);
        zzsb.zzf(firebaseApp);
        return zzP(zzsb);
    }

    public final Task zzd(FirebaseApp firebaseApp, String str, String str2, String str3, zzg zzg) {
        zzsc zzsc = new zzsc(str, str2, str3);
        zzsc.zzf(firebaseApp);
        zzsc.zzd(zzg);
        return zzP(zzsc);
    }

    public final Task zze(FirebaseUser firebaseUser, zzan zzan) {
        zzsd zzsd = new zzsd();
        zzsd.zzg(firebaseUser);
        zzsd.zzd(zzan);
        zzsd.zze(zzan);
        return zzP(zzsd);
    }

    public final Task zzf(FirebaseApp firebaseApp, String str, String str2) {
        zzse zzse = new zzse(str, str2);
        zzse.zzf(firebaseApp);
        return zzP(zzse);
    }

    public final Task zzg(FirebaseApp firebaseApp, PhoneMultiFactorAssertion phoneMultiFactorAssertion, FirebaseUser firebaseUser, String str, zzg zzg) {
        zzvh.zzc();
        zzsf zzsf = new zzsf(phoneMultiFactorAssertion, firebaseUser.zzf(), str);
        zzsf.zzf(firebaseApp);
        zzsf.zzd(zzg);
        return zzP(zzsf);
    }

    public final Task zzh(FirebaseApp firebaseApp, FirebaseUser firebaseUser, PhoneMultiFactorAssertion phoneMultiFactorAssertion, String str, zzg zzg) {
        zzvh.zzc();
        zzsg zzsg = new zzsg(phoneMultiFactorAssertion, str);
        zzsg.zzf(firebaseApp);
        zzsg.zzd(zzg);
        if (firebaseUser != null) {
            zzsg.zzg(firebaseUser);
        }
        return zzP(zzsg);
    }

    public final Task zzi(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, zzbk zzbk) {
        zzsh zzsh = new zzsh(str);
        zzsh.zzf(firebaseApp);
        zzsh.zzg(firebaseUser);
        zzsh.zzd(zzbk);
        zzsh.zze(zzbk);
        return zzP(zzsh);
    }

    public final Task zzj(FirebaseApp firebaseApp, FirebaseUser firebaseUser, AuthCredential authCredential, zzbk zzbk) {
        Preconditions.checkNotNull(firebaseApp);
        Preconditions.checkNotNull(authCredential);
        Preconditions.checkNotNull(firebaseUser);
        Preconditions.checkNotNull(zzbk);
        List zzg = firebaseUser.zzg();
        if (zzg != null && zzg.contains(authCredential.getProvider())) {
            return Tasks.forException(zztu.zza(new Status(FirebaseError.ERROR_PROVIDER_ALREADY_LINKED)));
        }
        if (authCredential instanceof EmailAuthCredential) {
            EmailAuthCredential emailAuthCredential = (EmailAuthCredential) authCredential;
            if (!emailAuthCredential.zzg()) {
                zzsi zzsi = new zzsi(emailAuthCredential);
                zzsi.zzf(firebaseApp);
                zzsi.zzg(firebaseUser);
                zzsi.zzd(zzbk);
                zzsi.zze(zzbk);
                return zzP(zzsi);
            }
            zzsl zzsl = new zzsl(emailAuthCredential);
            zzsl.zzf(firebaseApp);
            zzsl.zzg(firebaseUser);
            zzsl.zzd(zzbk);
            zzsl.zze(zzbk);
            return zzP(zzsl);
        } else if (authCredential instanceof PhoneAuthCredential) {
            zzvh.zzc();
            zzsk zzsk = new zzsk((PhoneAuthCredential) authCredential);
            zzsk.zzf(firebaseApp);
            zzsk.zzg(firebaseUser);
            zzsk.zzd(zzbk);
            zzsk.zze(zzbk);
            return zzP(zzsk);
        } else {
            Preconditions.checkNotNull(firebaseApp);
            Preconditions.checkNotNull(authCredential);
            Preconditions.checkNotNull(firebaseUser);
            Preconditions.checkNotNull(zzbk);
            zzsj zzsj = new zzsj(authCredential);
            zzsj.zzf(firebaseApp);
            zzsj.zzg(firebaseUser);
            zzsj.zzd(zzbk);
            zzsj.zze(zzbk);
            return zzP(zzsj);
        }
    }

    public final Task zzk(FirebaseApp firebaseApp, FirebaseUser firebaseUser, AuthCredential authCredential, String str, zzbk zzbk) {
        zzsm zzsm = new zzsm(authCredential, str);
        zzsm.zzf(firebaseApp);
        zzsm.zzg(firebaseUser);
        zzsm.zzd(zzbk);
        zzsm.zze(zzbk);
        return zzP(zzsm);
    }

    public final Task zzl(FirebaseApp firebaseApp, FirebaseUser firebaseUser, AuthCredential authCredential, String str, zzbk zzbk) {
        zzsn zzsn = new zzsn(authCredential, str);
        zzsn.zzf(firebaseApp);
        zzsn.zzg(firebaseUser);
        zzsn.zzd(zzbk);
        zzsn.zze(zzbk);
        return zzP(zzsn);
    }

    public final Task zzm(FirebaseApp firebaseApp, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, zzbk zzbk) {
        zzso zzso = new zzso(emailAuthCredential);
        zzso.zzf(firebaseApp);
        zzso.zzg(firebaseUser);
        zzso.zzd(zzbk);
        zzso.zze(zzbk);
        return zzP(zzso);
    }

    public final Task zzn(FirebaseApp firebaseApp, FirebaseUser firebaseUser, EmailAuthCredential emailAuthCredential, zzbk zzbk) {
        zzsp zzsp = new zzsp(emailAuthCredential);
        zzsp.zzf(firebaseApp);
        zzsp.zzg(firebaseUser);
        zzsp.zzd(zzbk);
        zzsp.zze(zzbk);
        return zzP(zzsp);
    }

    public final Task zzo(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, String str2, String str3, zzbk zzbk) {
        zzsq zzsq = new zzsq(str, str2, str3);
        zzsq.zzf(firebaseApp);
        zzsq.zzg(firebaseUser);
        zzsq.zzd(zzbk);
        zzsq.zze(zzbk);
        return zzP(zzsq);
    }

    public final Task zzp(FirebaseApp firebaseApp, FirebaseUser firebaseUser, String str, String str2, String str3, zzbk zzbk) {
        zzsr zzsr = new zzsr(str, str2, str3);
        zzsr.zzf(firebaseApp);
        zzsr.zzg(firebaseUser);
        zzsr.zzd(zzbk);
        zzsr.zze(zzbk);
        return zzP(zzsr);
    }

    public final Task zzq(FirebaseApp firebaseApp, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, String str, zzbk zzbk) {
        zzvh.zzc();
        zzss zzss = new zzss(phoneAuthCredential, str);
        zzss.zzf(firebaseApp);
        zzss.zzg(firebaseUser);
        zzss.zzd(zzbk);
        zzss.zze(zzbk);
        return zzP(zzss);
    }

    public final Task zzr(FirebaseApp firebaseApp, FirebaseUser firebaseUser, PhoneAuthCredential phoneAuthCredential, String str, zzbk zzbk) {
        zzvh.zzc();
        zzst zzst = new zzst(phoneAuthCredential, str);
        zzst.zzf(firebaseApp);
        zzst.zzg(firebaseUser);
        zzst.zzd(zzbk);
        zzst.zze(zzbk);
        return zzP(zzst);
    }

    public final Task zzs(FirebaseApp firebaseApp, FirebaseUser firebaseUser, zzbk zzbk) {
        zzsu zzsu = new zzsu();
        zzsu.zzf(firebaseApp);
        zzsu.zzg(firebaseUser);
        zzsu.zzd(zzbk);
        zzsu.zze(zzbk);
        return zzP(zzsu);
    }

    public final Task zzt(FirebaseApp firebaseApp, ActionCodeSettings actionCodeSettings, String str) {
        zzsv zzsv = new zzsv(str, actionCodeSettings);
        zzsv.zzf(firebaseApp);
        return zzP(zzsv);
    }

    public final Task zzu(FirebaseApp firebaseApp, String str, ActionCodeSettings actionCodeSettings, String str2) {
        actionCodeSettings.zzg(1);
        zzsw zzsw = new zzsw(str, actionCodeSettings, str2, "sendPasswordResetEmail");
        zzsw.zzf(firebaseApp);
        return zzP(zzsw);
    }

    public final Task zzv(FirebaseApp firebaseApp, String str, ActionCodeSettings actionCodeSettings, String str2) {
        actionCodeSettings.zzg(6);
        zzsw zzsw = new zzsw(str, actionCodeSettings, str2, "sendSignInLinkToEmail");
        zzsw.zzf(firebaseApp);
        return zzP(zzsw);
    }

    public final Task zzw(String str) {
        return zzP(new zzsx(str));
    }

    public final Task zzx(FirebaseApp firebaseApp, zzg zzg, String str) {
        zzsy zzsy = new zzsy(str);
        zzsy.zzf(firebaseApp);
        zzsy.zzd(zzg);
        return zzP(zzsy);
    }

    public final Task zzy(FirebaseApp firebaseApp, AuthCredential authCredential, String str, zzg zzg) {
        zzsz zzsz = new zzsz(authCredential, str);
        zzsz.zzf(firebaseApp);
        zzsz.zzd(zzg);
        return zzP(zzsz);
    }

    public final Task zzz(FirebaseApp firebaseApp, String str, String str2, zzg zzg) {
        zzta zzta = new zzta(str, str2);
        zzta.zzf(firebaseApp);
        zzta.zzd(zzg);
        return zzP(zzta);
    }
}
