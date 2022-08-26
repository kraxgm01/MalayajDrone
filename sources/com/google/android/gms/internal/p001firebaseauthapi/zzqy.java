package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.internal.zzai;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqy  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzqy implements zzuy {
    final /* synthetic */ zzxq zza;
    final /* synthetic */ zzts zzb;
    final /* synthetic */ zzrx zzc;

    zzqy(zzrx zzrx, zzxq zzxq, zzts zzts) {
        this.zzc = zzrx;
        this.zza = zzxq;
        this.zzb = zzts;
    }

    public final void zza(String str) {
        this.zzb.zzh(zzai.zza(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zza.zzd(true);
        this.zza.zzc(((zzwq) obj).zze());
        this.zzc.zza.zzq(this.zza, new zzqx(this, this));
    }
}
