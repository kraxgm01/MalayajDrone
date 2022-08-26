package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.internal.zzai;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqw  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzqw implements zzuy {
    final /* synthetic */ zzxy zza;
    final /* synthetic */ zzts zzb;
    final /* synthetic */ zzrx zzc;

    zzqw(zzrx zzrx, zzxy zzxy, zzts zzts) {
        this.zzc = zzrx;
        this.zza = zzxy;
        this.zzb = zzts;
    }

    public final void zza(String str) {
        this.zzb.zzh(zzai.zza(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zza.zzd(((zzwq) obj).zze());
        this.zzc.zza.zzt(this.zza, new zzqv(this, this));
    }
}
