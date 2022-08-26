package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.internal.zzai;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzqz implements zzuy {
    final /* synthetic */ zzts zza;
    final /* synthetic */ zzrx zzb;

    zzqz(zzrx zzrx, zzts zzts) {
        this.zzb = zzrx;
        this.zza = zzts;
    }

    public final void zza(String str) {
        this.zza.zzh(zzai.zza(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzwq zzwq = (zzwq) obj;
        zzxg zzxg = new zzxg();
        zzxg.zze(zzwq.zze());
        zzxg.zzd((String) null);
        zzxg.zzg((String) null);
        zzrx.zze(this.zzb, this.zza, zzwq, zzxg, this);
    }
}
