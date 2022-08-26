package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.internal.zzai;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrh  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzrh implements zzuy {
    final /* synthetic */ zzwa zza;
    final /* synthetic */ zzts zzb;
    final /* synthetic */ zzrx zzc;

    zzrh(zzrx zzrx, zzwa zzwa, zzts zzts) {
        this.zzc = zzrx;
        this.zza = zzwa;
        this.zzb = zzts;
    }

    public final void zza(String str) {
        this.zzb.zzh(zzai.zza(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zza.zzc(((zzwq) obj).zze());
        this.zzc.zza.zzd(this.zza, new zzrg(this));
    }
}
