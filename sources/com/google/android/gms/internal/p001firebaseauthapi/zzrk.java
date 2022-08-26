package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrk  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzrk implements zzuy {
    final /* synthetic */ zzuy zza;
    final /* synthetic */ zzwq zzb;
    final /* synthetic */ zzrl zzc;

    zzrk(zzrl zzrl, zzuy zzuy, zzwq zzwq) {
        this.zzc = zzrl;
        this.zza = zzuy;
        this.zzb = zzwq;
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List zzb2 = ((zzwh) obj).zzb();
        if (zzb2 == null || zzb2.isEmpty()) {
            this.zza.zza("No users");
        } else {
            this.zzc.zza.zzi(this.zzb, (zzwj) zzb2.get(0));
        }
    }
}
