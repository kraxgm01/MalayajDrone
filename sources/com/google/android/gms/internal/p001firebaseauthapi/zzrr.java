package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.internal.zzai;
import com.google.firebase.auth.zze;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzrr implements zzuy {
    final /* synthetic */ zzts zza;
    final /* synthetic */ zzrx zzb;

    zzrr(zzrx zzrx, zzts zzts) {
        this.zzb = zzrx;
        this.zza = zzts;
    }

    public final void zza(String str) {
        this.zza.zzh(zzai.zza(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzxj zzxj = (zzxj) obj;
        this.zzb.zzO(new zzwq(zzxj.zzd(), zzxj.zzc(), Long.valueOf(zzxj.zzb()), "Bearer"), (String) null, (String) null, true, (zze) null, this.zza, this);
    }
}
