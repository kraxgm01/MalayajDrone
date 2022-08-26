package com.google.android.gms.internal.p001firebaseauthapi;

import android.app.Activity;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.internal.zzao;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzut  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
abstract class zzut implements zzuv {
    /* access modifiers changed from: private */
    public boolean zza;
    protected final int zzb;
    final zzuq zzc = new zzuq(this);
    protected FirebaseApp zzd;
    protected FirebaseUser zze;
    protected Object zzf;
    protected zzao zzg;
    protected final List zzh = new ArrayList();
    protected Executor zzi;
    protected zzwq zzj;
    protected zzwj zzk;
    protected zzvv zzl;
    protected zzxb zzm;
    protected String zzn;
    protected String zzo;
    protected AuthCredential zzp;
    protected String zzq;
    protected String zzr;
    protected zzqe zzs;
    Object zzt;
    Status zzu;
    protected zzus zzv;

    public zzut(int i) {
        this.zzb = i;
    }

    static /* bridge */ /* synthetic */ void zzj(zzut zzut) {
        zzut.zzb();
        Preconditions.checkState(zzut.zza, "no success or failure set on method implementation");
    }

    static /* bridge */ /* synthetic */ void zzk(zzut zzut, Status status) {
        zzao zzao = zzut.zzg;
        if (zzao != null) {
            zzao.zzb(status);
        }
    }

    public abstract void zzb();

    public final zzut zzd(Object obj) {
        this.zzf = Preconditions.checkNotNull(obj, "external callback cannot be null");
        return this;
    }

    public final zzut zze(zzao zzao) {
        this.zzg = (zzao) Preconditions.checkNotNull(zzao, "external failure callback cannot be null");
        return this;
    }

    public final zzut zzf(FirebaseApp firebaseApp) {
        this.zzd = (FirebaseApp) Preconditions.checkNotNull(firebaseApp, "firebaseApp cannot be null");
        return this;
    }

    public final zzut zzg(FirebaseUser firebaseUser) {
        this.zze = (FirebaseUser) Preconditions.checkNotNull(firebaseUser, "firebaseUser cannot be null");
        return this;
    }

    public final zzut zzh(PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Activity activity, Executor executor, String str) {
        PhoneAuthProvider.OnVerificationStateChangedCallbacks zza2 = zzvh.zza(str, onVerificationStateChangedCallbacks, this);
        synchronized (this.zzh) {
            this.zzh.add((PhoneAuthProvider.OnVerificationStateChangedCallbacks) Preconditions.checkNotNull(zza2));
        }
        if (activity != null) {
            zzuk.zza(activity, this.zzh);
        }
        this.zzi = (Executor) Preconditions.checkNotNull(executor);
        return this;
    }

    public final void zzl(Status status) {
        this.zza = true;
        this.zzu = status;
        this.zzv.zza((Object) null, status);
    }

    public final void zzm(Object obj) {
        this.zza = true;
        this.zzt = obj;
        this.zzv.zza(obj, (Status) null);
    }
}
