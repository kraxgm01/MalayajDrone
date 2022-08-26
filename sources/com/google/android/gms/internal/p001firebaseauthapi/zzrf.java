package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.internal.zzai;
import com.google.firebase.auth.zze;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrf  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzrf implements zzuy {
    final /* synthetic */ zzts zza;
    final /* synthetic */ zzrx zzb;

    zzrf(zzrx zzrx, zzts zzts) {
        this.zzb = zzrx;
        this.zza = zzts;
    }

    public final void zza(String str) {
        this.zza.zzh(zzai.zza(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzxu zzxu = (zzxu) obj;
        this.zzb.zzO(new zzwq(zzxu.zzd(), zzxu.zzc(), Long.valueOf(zzxu.zzb()), "Bearer"), (String) null, (String) null, Boolean.valueOf(zzxu.zze()), (zze) null, this.zza, this);
    }
}
