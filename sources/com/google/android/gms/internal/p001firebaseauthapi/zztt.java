package com.google.android.gms.internal.p001firebaseauthapi;

import android.content.Context;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.PhoneAuthCredential;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zztt  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zztt {
    private static final Logger zza = new Logger("FirebaseAuth", "FirebaseAuthFallback:");
    private final zzrx zzb;
    private final zzvn zzc;

    zztt(FirebaseApp firebaseApp) {
        Preconditions.checkNotNull(firebaseApp);
        Context applicationContext = firebaseApp.getApplicationContext();
        Preconditions.checkNotNull(applicationContext);
        this.zzb = new zzrx(new zzuh(firebaseApp, zzug.zza(), (zzve) null, (zzub) null, (zzuc) null));
        this.zzc = new zzvn(applicationContext);
    }

    private static boolean zzG(long j, boolean z) {
        if (j > 0 && z) {
            return true;
        }
        zza.w("App hash will not be appended to the request.", new Object[0]);
        return false;
    }

    public final void zzA(zzpq zzpq, zztr zztr) {
        Preconditions.checkNotNull(zzpq);
        Preconditions.checkNotNull(zztr);
        String phoneNumber = zzpq.zzb().getPhoneNumber();
        zzts zzts = new zzts(zztr, zza);
        if (this.zzc.zzl(phoneNumber)) {
            if (zzpq.zzg()) {
                this.zzc.zzj(phoneNumber);
            } else {
                this.zzc.zzi(zzts, phoneNumber);
                return;
            }
        }
        long zza2 = zzpq.zza();
        boolean zzh = zzpq.zzh();
        zzxm zzb2 = zzxm.zzb(zzpq.zzd(), zzpq.zzb().getUid(), zzpq.zzb().getPhoneNumber(), zzpq.zzc(), zzpq.zze(), zzpq.zzf());
        if (zzG(zza2, zzh)) {
            zzb2.zzd(new zzvs(this.zzc.zzc()));
        }
        this.zzc.zzk(phoneNumber, zzts, zza2, zzh);
        this.zzb.zzG(zzb2, new zzvk(this.zzc, zzts, phoneNumber));
    }

    public final void zzB(zzps zzps, zztr zztr) {
        Preconditions.checkNotNull(zzps);
        Preconditions.checkNotNull(zztr);
        this.zzb.zzH(zzps.zza(), zzps.zzb(), new zzts(zztr, zza));
    }

    public final void zzC(zzpu zzpu, zztr zztr) {
        Preconditions.checkNotNull(zzpu);
        Preconditions.checkNotEmpty(zzpu.zza());
        Preconditions.checkNotNull(zztr);
        this.zzb.zzI(zzpu.zza(), new zzts(zztr, zza));
    }

    public final void zzD(zzpw zzpw, zztr zztr) {
        Preconditions.checkNotNull(zzpw);
        Preconditions.checkNotEmpty(zzpw.zzb());
        Preconditions.checkNotEmpty(zzpw.zza());
        Preconditions.checkNotNull(zztr);
        this.zzb.zzJ(zzpw.zzb(), zzpw.zza(), new zzts(zztr, zza));
    }

    public final void zzE(zzpy zzpy, zztr zztr) {
        Preconditions.checkNotNull(zzpy);
        Preconditions.checkNotEmpty(zzpy.zzb());
        Preconditions.checkNotNull(zzpy.zza());
        Preconditions.checkNotNull(zztr);
        this.zzb.zzK(zzpy.zzb(), zzpy.zza(), new zzts(zztr, zza));
    }

    public final void zzF(zzqa zzqa, zztr zztr) {
        Preconditions.checkNotNull(zzqa);
        this.zzb.zzL(zzwn.zzc(zzqa.zza(), zzqa.zzb(), zzqa.zzc()), new zzts(zztr, zza));
    }

    public final void zza(zznq zznq, zztr zztr) {
        Preconditions.checkNotNull(zznq);
        Preconditions.checkNotEmpty(zznq.zza());
        Preconditions.checkNotNull(zztr);
        this.zzb.zzg(zznq.zza(), zznq.zzb(), new zzts(zztr, zza));
    }

    public final void zzb(zzns zzns, zztr zztr) {
        Preconditions.checkNotNull(zzns);
        Preconditions.checkNotEmpty(zzns.zza());
        Preconditions.checkNotEmpty(zzns.zzb());
        Preconditions.checkNotNull(zztr);
        this.zzb.zzh(zzns.zza(), zzns.zzb(), new zzts(zztr, zza));
    }

    public final void zzc(zznu zznu, zztr zztr) {
        Preconditions.checkNotNull(zznu);
        Preconditions.checkNotEmpty(zznu.zza());
        Preconditions.checkNotEmpty(zznu.zzb());
        Preconditions.checkNotNull(zztr);
        this.zzb.zzi(zznu.zza(), zznu.zzb(), new zzts(zztr, zza));
    }

    public final void zzd(zznw zznw, zztr zztr) {
        Preconditions.checkNotNull(zznw);
        Preconditions.checkNotEmpty(zznw.zza());
        Preconditions.checkNotNull(zztr);
        this.zzb.zzj(zznw.zza(), zznw.zzb(), new zzts(zztr, zza));
    }

    public final void zze(zzny zzny, zztr zztr) {
        Preconditions.checkNotNull(zzny);
        Preconditions.checkNotEmpty(zzny.zza());
        Preconditions.checkNotEmpty(zzny.zzb());
        Preconditions.checkNotNull(zztr);
        this.zzb.zzk(zzny.zza(), zzny.zzb(), zzny.zzc(), new zzts(zztr, zza));
    }

    public final void zzf(zzoa zzoa, zztr zztr) {
        Preconditions.checkNotNull(zzoa);
        Preconditions.checkNotEmpty(zzoa.zza());
        Preconditions.checkNotEmpty(zzoa.zzb());
        Preconditions.checkNotNull(zztr);
        this.zzb.zzl(zzoa.zza(), zzoa.zzb(), zzoa.zzc(), new zzts(zztr, zza));
    }

    public final void zzg(zzoc zzoc, zztr zztr) {
        Preconditions.checkNotNull(zzoc);
        Preconditions.checkNotEmpty(zzoc.zza());
        Preconditions.checkNotNull(zztr);
        this.zzb.zzm(zzoc.zza(), new zzts(zztr, zza));
    }

    public final void zzh(zzoe zzoe, zztr zztr) {
        Preconditions.checkNotNull(zzoe);
        Preconditions.checkNotNull(zztr);
        this.zzb.zzn(zzwa.zzb(zzoe.zzb(), (String) Preconditions.checkNotNull(zzoe.zza().zzg()), (String) Preconditions.checkNotNull(zzoe.zza().getSmsCode()), zzoe.zzc()), zzoe.zzb(), new zzts(zztr, zza));
    }

    public final void zzi(zzog zzog, zztr zztr) {
        Preconditions.checkNotNull(zzog);
        Preconditions.checkNotNull(zztr);
        this.zzb.zzo(zzwc.zzb(zzog.zzb(), (String) Preconditions.checkNotNull(zzog.zza().zzg()), (String) Preconditions.checkNotNull(zzog.zza().getSmsCode())), new zzts(zztr, zza));
    }

    public final void zzj(zzoi zzoi, zztr zztr) {
        Preconditions.checkNotNull(zzoi);
        Preconditions.checkNotNull(zztr);
        Preconditions.checkNotEmpty(zzoi.zza());
        this.zzb.zzp(zzoi.zza(), new zzts(zztr, zza));
    }

    public final void zzk(zzok zzok, zztr zztr) {
        Preconditions.checkNotNull(zzok);
        Preconditions.checkNotEmpty(zzok.zza());
        this.zzb.zzq(zzok.zza(), zzok.zzb(), new zzts(zztr, zza));
    }

    public final void zzl(zzom zzom, zztr zztr) {
        Preconditions.checkNotNull(zzom);
        Preconditions.checkNotEmpty(zzom.zzb());
        Preconditions.checkNotEmpty(zzom.zzc());
        Preconditions.checkNotEmpty(zzom.zza());
        Preconditions.checkNotNull(zztr);
        this.zzb.zzr(zzom.zzb(), zzom.zzc(), zzom.zza(), new zzts(zztr, zza));
    }

    public final void zzm(zzoo zzoo, zztr zztr) {
        Preconditions.checkNotNull(zzoo);
        Preconditions.checkNotEmpty(zzoo.zzb());
        Preconditions.checkNotNull(zzoo.zza());
        Preconditions.checkNotNull(zztr);
        this.zzb.zzs(zzoo.zzb(), zzoo.zza(), new zzts(zztr, zza));
    }

    public final void zzn(zzoq zzoq, zztr zztr) {
        Preconditions.checkNotNull(zztr);
        Preconditions.checkNotNull(zzoq);
        this.zzb.zzt(Preconditions.checkNotEmpty(zzoq.zzb()), zzvd.zza((PhoneAuthCredential) Preconditions.checkNotNull(zzoq.zza())), new zzts(zztr, zza));
    }

    public final void zzo(zzos zzos, zztr zztr) {
        Preconditions.checkNotNull(zzos);
        Preconditions.checkNotEmpty(zzos.zza());
        Preconditions.checkNotNull(zztr);
        this.zzb.zzu(zzos.zza(), new zzts(zztr, zza));
    }

    public final void zzp(zzou zzou, zztr zztr) {
        Preconditions.checkNotNull(zzou);
        Preconditions.checkNotEmpty(zzou.zzb());
        Preconditions.checkNotNull(zztr);
        this.zzb.zzv(zzou.zzb(), zzou.zza(), new zzts(zztr, zza));
    }

    public final void zzq(zzow zzow, zztr zztr) {
        Preconditions.checkNotNull(zzow);
        Preconditions.checkNotEmpty(zzow.zzb());
        Preconditions.checkNotNull(zztr);
        this.zzb.zzw(zzow.zzb(), zzow.zza(), zzow.zzc(), new zzts(zztr, zza));
    }

    public final void zzr(zzoy zzoy, zztr zztr) {
        Preconditions.checkNotNull(zztr);
        Preconditions.checkNotNull(zzoy);
        zzxd zzxd = (zzxd) Preconditions.checkNotNull(zzoy.zza());
        String zzd = zzxd.zzd();
        zzts zzts = new zzts(zztr, zza);
        if (this.zzc.zzl(zzd)) {
            if (zzxd.zzf()) {
                this.zzc.zzj(zzd);
            } else {
                this.zzc.zzi(zzts, zzd);
                return;
            }
        }
        long zzb2 = zzxd.zzb();
        boolean zzg = zzxd.zzg();
        if (zzG(zzb2, zzg)) {
            zzxd.zze(new zzvs(this.zzc.zzc()));
        }
        this.zzc.zzk(zzd, zzts, zzb2, zzg);
        this.zzb.zzx(zzxd, new zzvk(this.zzc, zzts, zzd));
    }

    public final void zzs(zzpa zzpa, zztr zztr) {
        Preconditions.checkNotNull(zzpa);
        Preconditions.checkNotNull(zztr);
        this.zzb.zzy(zzpa.zza(), new zzts(zztr, zza));
    }

    public final void zzt(zzpc zzpc, zztr zztr) {
        Preconditions.checkNotNull(zzpc);
        Preconditions.checkNotNull(zztr);
        this.zzb.zzz(zzpc.zza(), new zzts(zztr, zza));
    }

    public final void zzu(zzpe zzpe, zztr zztr) {
        Preconditions.checkNotNull(zzpe);
        Preconditions.checkNotNull(zzpe.zza());
        Preconditions.checkNotNull(zztr);
        this.zzb.zzA(zzpe.zza(), new zzts(zztr, zza));
    }

    public final void zzv(zzpg zzpg, zztr zztr) {
        Preconditions.checkNotNull(zzpg);
        Preconditions.checkNotEmpty(zzpg.zzb());
        Preconditions.checkNotNull(zztr);
        this.zzb.zzB(new zzxt(zzpg.zzb(), zzpg.zza()), new zzts(zztr, zza));
    }

    public final void zzw(zzpi zzpi, zztr zztr) {
        Preconditions.checkNotNull(zzpi);
        Preconditions.checkNotEmpty(zzpi.zza());
        Preconditions.checkNotEmpty(zzpi.zzb());
        Preconditions.checkNotNull(zztr);
        this.zzb.zzC(zzpi.zza(), zzpi.zzb(), zzpi.zzc(), new zzts(zztr, zza));
    }

    public final void zzx(zzpk zzpk, zztr zztr) {
        Preconditions.checkNotNull(zzpk);
        Preconditions.checkNotNull(zzpk.zza());
        Preconditions.checkNotNull(zztr);
        this.zzb.zzD(zzpk.zza(), new zzts(zztr, zza));
    }

    public final void zzy(zzpm zzpm, zztr zztr) {
        Preconditions.checkNotNull(zztr);
        Preconditions.checkNotNull(zzpm);
        this.zzb.zzE(zzvd.zza((PhoneAuthCredential) Preconditions.checkNotNull(zzpm.zza())), new zzts(zztr, zza));
    }

    public final void zzz(zzpo zzpo, zztr zztr) {
        Preconditions.checkNotNull(zzpo);
        Preconditions.checkNotNull(zztr);
        String zzd = zzpo.zzd();
        zzts zzts = new zzts(zztr, zza);
        if (this.zzc.zzl(zzd)) {
            if (zzpo.zzg()) {
                this.zzc.zzj(zzd);
            } else {
                this.zzc.zzi(zzts, zzd);
                return;
            }
        }
        long zza2 = zzpo.zza();
        boolean zzh = zzpo.zzh();
        zzxk zzb2 = zzxk.zzb(zzpo.zzb(), zzpo.zzd(), zzpo.zzc(), zzpo.zze(), zzpo.zzf());
        if (zzG(zza2, zzh)) {
            zzb2.zzd(new zzvs(this.zzc.zzc()));
        }
        this.zzc.zzk(zzd, zzts, zza2, zzh);
        this.zzb.zzF(zzb2, new zzvk(this.zzc, zzts, zzd));
    }
}
