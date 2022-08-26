package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.internal.zzai;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqu  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzqu implements zzuy {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzts zzc;
    final /* synthetic */ zzrx zzd;

    zzqu(zzrx zzrx, String str, String str2, zzts zzts) {
        this.zzd = zzrx;
        this.zza = str;
        this.zzb = str2;
        this.zzc = zzts;
    }

    public final void zza(String str) {
        this.zzc.zzh(zzai.zza(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzwq zzwq = (zzwq) obj;
        zzxg zzxg = new zzxg();
        zzxg.zze(zzwq.zze());
        zzxg.zzd(this.zza);
        zzxg.zzg(this.zzb);
        zzrx.zze(this.zzd, this.zzc, zzwq, zzxg, this);
    }
}
