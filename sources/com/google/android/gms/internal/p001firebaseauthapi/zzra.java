package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.internal.zzai;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzra  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzra implements zzuy {
    final /* synthetic */ zzuy zza;
    final /* synthetic */ zzwq zzb;
    final /* synthetic */ zzrb zzc;

    zzra(zzrb zzrb, zzuy zzuy, zzwq zzwq) {
        this.zzc = zzrb;
        this.zza = zzuy;
        this.zzb = zzwq;
    }

    public final void zza(String str) {
        this.zzc.zzb.zzh(zzai.zza(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List zzb2 = ((zzwh) obj).zzb();
        if (zzb2 == null || zzb2.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        zzxg zzxg = new zzxg();
        zzxg.zze(this.zzb.zze());
        zzxg.zzb(this.zzc.zza);
        zzrb zzrb = this.zzc;
        zzrx.zzf(zzrb.zzc, zzrb.zzb, this.zzb, (zzwj) zzb2.get(0), zzxg, this.zza);
    }
}
