package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.internal.zzai;
import com.google.firebase.auth.zze;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqt  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzqt implements zzuy {
    final /* synthetic */ zzts zza;
    final /* synthetic */ zzrx zzb;

    zzqt(zzrx zzrx, zzts zzts) {
        this.zzb = zzrx;
        this.zza = zzts;
    }

    public final void zza(String str) {
        this.zza.zzh(zzai.zza(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzxz zzxz = (zzxz) obj;
        this.zzb.zzO(new zzwq(zzxz.zze(), zzxz.zzc(), Long.valueOf(zzxz.zzb()), "Bearer"), (String) null, (String) null, Boolean.valueOf(zzxz.zzg()), (zze) null, this.zza, this);
    }
}
