package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.internal.zzai;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzrq implements zzuy {
    final /* synthetic */ zzts zza;
    final /* synthetic */ zzrx zzb;

    zzrq(zzrx zzrx, zzts zzts) {
        this.zzb = zzrx;
        this.zza = zzts;
    }

    public final void zza(String str) {
        this.zza.zzh(zzai.zza(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzxs zzxs = (zzxs) obj;
        if (!zzxs.zzm()) {
            zzrx.zzd(this.zzb, zzxs, this.zza, this);
        } else {
            this.zza.zzf(new zzqe(zzxs.zzg(), zzxs.zzl(), zzxs.zzc()));
        }
    }
}
