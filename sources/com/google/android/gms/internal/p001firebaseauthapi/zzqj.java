package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.internal.zzai;
import com.google.firebase.auth.zze;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzqj implements zzuy {
    final /* synthetic */ zzts zza;
    final /* synthetic */ zzrx zzb;

    zzqj(zzrx zzrx, zzts zzts) {
        this.zzb = zzrx;
        this.zza = zzts;
    }

    public final void zza(String str) {
        this.zza.zzh(zzai.zza(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzvz zzvz = (zzvz) obj;
        if (zzvz.zzg()) {
            this.zza.zzf(new zzqe(zzvz.zzd(), zzvz.zzf(), (zze) null));
            return;
        }
        this.zzb.zzO(new zzwq(zzvz.zze(), zzvz.zzc(), Long.valueOf(zzvz.zzb()), "Bearer"), (String) null, (String) null, Boolean.valueOf(zzvz.zzh()), (zze) null, this.zza, this);
    }
}
