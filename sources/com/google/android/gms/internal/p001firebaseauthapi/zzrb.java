package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.internal.zzai;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzrb implements zzuy {
    final /* synthetic */ String zza;
    final /* synthetic */ zzts zzb;
    final /* synthetic */ zzrx zzc;

    zzrb(zzrx zzrx, String str, zzts zzts) {
        this.zzc = zzrx;
        this.zza = str;
        this.zzb = zzts;
    }

    public final void zza(String str) {
        this.zzb.zzh(zzai.zza(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzwq zzwq = (zzwq) obj;
        this.zzc.zza.zzg(new zzwg(zzwq.zze()), new zzra(this, this, zzwq));
    }
}
