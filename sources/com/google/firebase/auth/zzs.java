package com.google.firebase.auth;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p001firebaseauthapi.zzwq;
import com.google.firebase.auth.internal.zzg;

/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
class zzs implements zzg {
    final /* synthetic */ FirebaseAuth zza;

    zzs(FirebaseAuth firebaseAuth) {
        this.zza = firebaseAuth;
    }

    public final void zza(zzwq zzwq, FirebaseUser firebaseUser) {
        Preconditions.checkNotNull(zzwq);
        Preconditions.checkNotNull(firebaseUser);
        firebaseUser.zzh(zzwq);
        this.zza.zzE(firebaseUser, zzwq, true);
    }
}
