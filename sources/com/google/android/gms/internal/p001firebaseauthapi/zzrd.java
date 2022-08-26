package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.internal.zzai;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzrd implements zzuy {
    final /* synthetic */ String zza;
    final /* synthetic */ zzts zzb;
    final /* synthetic */ zzrx zzc;

    zzrd(zzrx zzrx, String str, zzts zzts) {
        this.zzc = zzrx;
        this.zza = str;
        this.zzb = zzts;
    }

    public final void zza(String str) {
        this.zzb.zzh(zzai.zza(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzc.zza.zzu(new zzya(((zzwq) obj).zze(), this.zza), new zzrc(this));
    }
}
