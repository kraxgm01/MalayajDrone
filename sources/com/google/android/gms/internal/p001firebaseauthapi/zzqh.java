package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.internal.zzai;
import com.google.firebase.auth.zze;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqh  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzqh implements zzuy {
    final /* synthetic */ zzts zza;
    final /* synthetic */ zzrx zzb;

    zzqh(zzrx zzrx, zzts zzts) {
        this.zzb = zzrx;
        this.zza = zzts;
    }

    public final void zza(String str) {
        this.zza.zzh(zzai.zza(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzxx zzxx = (zzxx) obj;
        if (zzxx.zzg()) {
            this.zza.zzf(new zzqe(zzxx.zzd(), zzxx.zzf(), (zze) null));
            return;
        }
        this.zzb.zzO(new zzwq(zzxx.zze(), zzxx.zzc(), Long.valueOf(zzxx.zzb()), "Bearer"), (String) null, (String) null, false, (zze) null, this.zza, this);
    }
}
