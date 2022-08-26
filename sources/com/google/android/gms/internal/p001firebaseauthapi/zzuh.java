package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzuh  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzuh extends zzuz implements zzvq {
    zzui zza;
    private zzub zzb;
    private zzuc zzc;
    private zzve zzd;
    private final zzug zze;
    private final FirebaseApp zzf;
    private final String zzg;

    zzuh(FirebaseApp firebaseApp, zzug zzug, zzve zzve, zzub zzub, zzuc zzuc) {
        this.zzf = firebaseApp;
        String apiKey = firebaseApp.getOptions().getApiKey();
        this.zzg = apiKey;
        this.zze = (zzug) Preconditions.checkNotNull(zzug);
        zzw((zzve) null, (zzub) null, (zzuc) null);
        zzvr.zze(apiKey, this);
    }

    private final zzui zzv() {
        if (this.zza == null) {
            FirebaseApp firebaseApp = this.zzf;
            this.zza = new zzui(firebaseApp.getApplicationContext(), firebaseApp, this.zze.zzb());
        }
        return this.zza;
    }

    private final void zzw(zzve zzve, zzub zzub, zzuc zzuc) {
        this.zzd = null;
        this.zzb = null;
        this.zzc = null;
        String zza2 = zzvo.zza("firebear.secureToken");
        if (TextUtils.isEmpty(zza2)) {
            zza2 = zzvr.zzd(this.zzg);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for secureToken URL: ".concat(String.valueOf(zza2)));
        }
        if (this.zzd == null) {
            this.zzd = new zzve(zza2, zzv());
        }
        String zza3 = zzvo.zza("firebear.identityToolkit");
        if (TextUtils.isEmpty(zza3)) {
            zza3 = zzvr.zzb(this.zzg);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkit URL: ".concat(String.valueOf(zza3)));
        }
        if (this.zzb == null) {
            this.zzb = new zzub(zza3, zzv());
        }
        String zza4 = zzvo.zza("firebear.identityToolkitV2");
        if (TextUtils.isEmpty(zza4)) {
            zza4 = zzvr.zzc(this.zzg);
        } else {
            Log.e("LocalClient", "Found hermetic configuration for identityToolkitV2 URL: ".concat(String.valueOf(zza4)));
        }
        if (this.zzc == null) {
            this.zzc = new zzuc(zza4, zzv());
        }
    }

    public final void zza(zzvu zzvu, zzuy zzuy) {
        Preconditions.checkNotNull(zzvu);
        Preconditions.checkNotNull(zzuy);
        zzub zzub = this.zzb;
        zzvb.zza(zzub.zza("/createAuthUri", this.zzg), zzvu, zzuy, zzvv.class, zzub.zzb);
    }

    public final void zzb(zzvx zzvx, zzuy zzuy) {
        Preconditions.checkNotNull(zzvx);
        Preconditions.checkNotNull(zzuy);
        zzub zzub = this.zzb;
        zzvb.zza(zzub.zza("/deleteAccount", this.zzg), zzvx, zzuy, Void.class, zzub.zzb);
    }

    public final void zzc(zzvy zzvy, zzuy zzuy) {
        Preconditions.checkNotNull(zzvy);
        Preconditions.checkNotNull(zzuy);
        zzub zzub = this.zzb;
        zzvb.zza(zzub.zza("/emailLinkSignin", this.zzg), zzvy, zzuy, zzvz.class, zzub.zzb);
    }

    public final void zzd(zzwa zzwa, zzuy zzuy) {
        Preconditions.checkNotNull(zzwa);
        Preconditions.checkNotNull(zzuy);
        zzuc zzuc = this.zzc;
        zzvb.zza(zzuc.zza("/mfaEnrollment:finalize", this.zzg), zzwa, zzuy, zzwb.class, zzuc.zzb);
    }

    public final void zze(zzwc zzwc, zzuy zzuy) {
        Preconditions.checkNotNull(zzwc);
        Preconditions.checkNotNull(zzuy);
        zzuc zzuc = this.zzc;
        zzvb.zza(zzuc.zza("/mfaSignIn:finalize", this.zzg), zzwc, zzuy, zzwd.class, zzuc.zzb);
    }

    public final void zzf(zzwf zzwf, zzuy zzuy) {
        Preconditions.checkNotNull(zzwf);
        Preconditions.checkNotNull(zzuy);
        zzve zzve = this.zzd;
        zzvb.zza(zzve.zza("/token", this.zzg), zzwf, zzuy, zzwq.class, zzve.zzb);
    }

    public final void zzg(zzwg zzwg, zzuy zzuy) {
        Preconditions.checkNotNull(zzwg);
        Preconditions.checkNotNull(zzuy);
        zzub zzub = this.zzb;
        zzvb.zza(zzub.zza("/getAccountInfo", this.zzg), zzwg, zzuy, zzwh.class, zzub.zzb);
    }

    public final void zzh(zzwn zzwn, zzuy zzuy) {
        Preconditions.checkNotNull(zzwn);
        Preconditions.checkNotNull(zzuy);
        if (zzwn.zzb() != null) {
            zzv().zzc(zzwn.zzb().zze());
        }
        zzub zzub = this.zzb;
        zzvb.zza(zzub.zza("/getOobConfirmationCode", this.zzg), zzwn, zzuy, zzwo.class, zzub.zzb);
    }

    public final void zzi() {
        zzw((zzve) null, (zzub) null, (zzuc) null);
    }

    public final void zzj(zzxa zzxa, zzuy zzuy) {
        Preconditions.checkNotNull(zzxa);
        Preconditions.checkNotNull(zzuy);
        zzub zzub = this.zzb;
        zzvb.zza(zzub.zza("/resetPassword", this.zzg), zzxa, zzuy, zzxb.class, zzub.zzb);
    }

    public final void zzk(zzxd zzxd, zzuy zzuy) {
        Preconditions.checkNotNull(zzxd);
        Preconditions.checkNotNull(zzuy);
        if (!TextUtils.isEmpty(zzxd.zzc())) {
            zzv().zzc(zzxd.zzc());
        }
        zzub zzub = this.zzb;
        zzvb.zza(zzub.zza("/sendVerificationCode", this.zzg), zzxd, zzuy, zzxf.class, zzub.zzb);
    }

    public final void zzl(zzxg zzxg, zzuy zzuy) {
        Preconditions.checkNotNull(zzxg);
        Preconditions.checkNotNull(zzuy);
        zzub zzub = this.zzb;
        zzvb.zza(zzub.zza("/setAccountInfo", this.zzg), zzxg, zzuy, zzxh.class, zzub.zzb);
    }

    public final void zzm(String str, zzuy zzuy) {
        Preconditions.checkNotNull(zzuy);
        zzv().zzb(str);
        ((zzro) zzuy).zza.zzm();
    }

    public final void zzn(zzxi zzxi, zzuy zzuy) {
        Preconditions.checkNotNull(zzxi);
        Preconditions.checkNotNull(zzuy);
        zzub zzub = this.zzb;
        zzvb.zza(zzub.zza("/signupNewUser", this.zzg), zzxi, zzuy, zzxj.class, zzub.zzb);
    }

    public final void zzo(zzxk zzxk, zzuy zzuy) {
        Preconditions.checkNotNull(zzxk);
        Preconditions.checkNotNull(zzuy);
        if (!TextUtils.isEmpty(zzxk.zzc())) {
            zzv().zzc(zzxk.zzc());
        }
        zzuc zzuc = this.zzc;
        zzvb.zza(zzuc.zza("/mfaEnrollment:start", this.zzg), zzxk, zzuy, zzxl.class, zzuc.zzb);
    }

    public final void zzp(zzxm zzxm, zzuy zzuy) {
        Preconditions.checkNotNull(zzxm);
        Preconditions.checkNotNull(zzuy);
        if (!TextUtils.isEmpty(zzxm.zzc())) {
            zzv().zzc(zzxm.zzc());
        }
        zzuc zzuc = this.zzc;
        zzvb.zza(zzuc.zza("/mfaSignIn:start", this.zzg), zzxm, zzuy, zzxn.class, zzuc.zzb);
    }

    public final void zzq(zzxq zzxq, zzuy zzuy) {
        Preconditions.checkNotNull(zzxq);
        Preconditions.checkNotNull(zzuy);
        zzub zzub = this.zzb;
        zzvb.zza(zzub.zza("/verifyAssertion", this.zzg), zzxq, zzuy, zzxs.class, zzub.zzb);
    }

    public final void zzr(zzxt zzxt, zzuy zzuy) {
        Preconditions.checkNotNull(zzxt);
        Preconditions.checkNotNull(zzuy);
        zzub zzub = this.zzb;
        zzvb.zza(zzub.zza("/verifyCustomToken", this.zzg), zzxt, zzuy, zzxu.class, zzub.zzb);
    }

    public final void zzs(zzxw zzxw, zzuy zzuy) {
        Preconditions.checkNotNull(zzxw);
        Preconditions.checkNotNull(zzuy);
        zzub zzub = this.zzb;
        zzvb.zza(zzub.zza("/verifyPassword", this.zzg), zzxw, zzuy, zzxx.class, zzub.zzb);
    }

    public final void zzt(zzxy zzxy, zzuy zzuy) {
        Preconditions.checkNotNull(zzxy);
        Preconditions.checkNotNull(zzuy);
        zzub zzub = this.zzb;
        zzvb.zza(zzub.zza("/verifyPhoneNumber", this.zzg), zzxy, zzuy, zzxz.class, zzub.zzb);
    }

    public final void zzu(zzya zzya, zzuy zzuy) {
        Preconditions.checkNotNull(zzya);
        Preconditions.checkNotNull(zzuy);
        zzuc zzuc = this.zzc;
        zzvb.zza(zzuc.zza("/mfaEnrollment:withdraw", this.zzg), zzya, zzuy, zzyb.class, zzuc.zzb);
    }
}
