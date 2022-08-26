package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.firebase.auth.UserProfileChangeRequest;
import com.google.firebase.auth.internal.zzai;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzrs  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzrs implements zzuy {
    final /* synthetic */ UserProfileChangeRequest zza;
    final /* synthetic */ zzts zzb;
    final /* synthetic */ zzrx zzc;

    zzrs(zzrx zzrx, UserProfileChangeRequest userProfileChangeRequest, zzts zzts) {
        this.zzc = zzrx;
        this.zza = userProfileChangeRequest;
        this.zzb = zzts;
    }

    public final void zza(String str) {
        this.zzb.zzh(zzai.zza(str));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzwq zzwq = (zzwq) obj;
        zzxg zzxg = new zzxg();
        zzxg.zze(zzwq.zze());
        if (this.zza.zzb() || this.zza.getDisplayName() != null) {
            zzxg.zzc(this.zza.getDisplayName());
        }
        if (this.zza.zzc() || this.zza.getPhotoUri() != null) {
            zzxg.zzh(this.zza.zza());
        }
        zzrx.zze(this.zzc, this.zzb, zzwq, zzxg, this);
    }
}
