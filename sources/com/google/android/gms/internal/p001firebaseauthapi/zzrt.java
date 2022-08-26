package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.internal.zzai;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrt  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzrt implements zzuy {
    final /* synthetic */ String zza;
    final /* synthetic */ zzts zzb;
    final /* synthetic */ zzrx zzc;

    zzrt(zzrx zzrx, String str, zzts zzts) {
        this.zzc = zzrx;
        this.zza = str;
        this.zzb = zzts;
    }

    public final void zza(String str) {
        this.zzb.zzh(zzai.zza(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzwq zzwq = (zzwq) obj;
        zzxg zzxg = new zzxg();
        zzxg.zze(zzwq.zze());
        zzxg.zzd(this.zza);
        zzrx.zze(this.zzc, this.zzb, zzwq, zzxg, this);
    }
}
