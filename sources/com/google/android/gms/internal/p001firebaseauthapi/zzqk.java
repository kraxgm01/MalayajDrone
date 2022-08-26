package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqk  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzqk implements zzuy {
    final /* synthetic */ zzux zza;
    final /* synthetic */ zzts zzb;
    final /* synthetic */ zzwq zzc;
    final /* synthetic */ zzxg zzd;
    final /* synthetic */ zzrx zze;

    zzqk(zzrx zzrx, zzux zzux, zzts zzts, zzwq zzwq, zzxg zzxg) {
        this.zze = zzrx;
        this.zza = zzux;
        this.zzb = zzts;
        this.zzc = zzwq;
        this.zzd = zzxg;
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List zzb2 = ((zzwh) obj).zzb();
        if (zzb2 == null || zzb2.isEmpty()) {
            this.zza.zza("No users");
        } else {
            zzrx.zzf(this.zze, this.zzb, this.zzc, (zzwj) zzb2.get(0), this.zzd, this.zza);
        }
    }
}
