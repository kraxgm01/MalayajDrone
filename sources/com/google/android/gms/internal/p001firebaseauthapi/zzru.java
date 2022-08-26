package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.internal.zzai;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzru  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzru implements zzuy {
    final /* synthetic */ String zza;
    final /* synthetic */ zzts zzb;
    final /* synthetic */ zzrx zzc;

    zzru(zzrx zzrx, String str, zzts zzts) {
        this.zzc = zzrx;
        this.zza = str;
        this.zzb = zzts;
    }

    public final void zza(String str) {
        this.zzb.zzh(zzai.zza(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzwq zzwq = (zzwq) obj;
        String zze = zzwq.zze();
        zzxg zzxg = new zzxg();
        zzxg.zze(zze);
        zzxg.zzg(this.zza);
        zzrx.zze(this.zzc, this.zzb, zzwq, zzxg, this);
    }
}
