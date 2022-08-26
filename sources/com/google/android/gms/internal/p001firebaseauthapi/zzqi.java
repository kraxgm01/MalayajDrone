package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.EmailAuthCredential;
import com.google.firebase.auth.internal.zzai;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqi  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzqi implements zzuy {
    final /* synthetic */ EmailAuthCredential zza;
    final /* synthetic */ zzts zzb;
    final /* synthetic */ zzrx zzc;

    zzqi(zzrx zzrx, EmailAuthCredential emailAuthCredential, zzts zzts) {
        this.zzc = zzrx;
        this.zza = emailAuthCredential;
        this.zzb = zzts;
    }

    public final void zza(String str) {
        this.zzb.zzh(zzai.zza(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        this.zzc.zzN(new zzvy(this.zza, ((zzwq) obj).zze()), this.zzb);
    }
}
