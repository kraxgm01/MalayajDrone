package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.api.Status;
import com.google.firebase.FirebaseError;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.zze;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzqv implements zzuy {
    final /* synthetic */ zzuy zza;
    final /* synthetic */ zzqw zzb;

    zzqv(zzqw zzqw, zzuy zzuy) {
        this.zzb = zzqw;
        this.zza = zzuy;
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzxz zzxz = (zzxz) obj;
        if (!TextUtils.isEmpty(zzxz.zzf())) {
            this.zzb.zzb.zzg(new Status(FirebaseError.ERROR_CREDENTIAL_ALREADY_IN_USE), PhoneAuthCredential.zzd(zzxz.zzd(), zzxz.zzf()));
            return;
        }
        this.zzb.zzc.zzO(new zzwq(zzxz.zze(), zzxz.zzc(), Long.valueOf(zzxz.zzb()), "Bearer"), (String) null, "phone", Boolean.valueOf(zzxz.zzg()), (zze) null, this.zzb.zzb, this.zza);
    }
}
