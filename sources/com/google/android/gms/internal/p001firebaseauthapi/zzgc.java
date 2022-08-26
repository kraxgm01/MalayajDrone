package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Collections;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzgc {
    private HashMap zza = new HashMap();

    public final zzge zza() {
        if (this.zza != null) {
            zzge zzge = new zzge(Collections.unmodifiableMap(this.zza), (zzgd) null);
            this.zza = null;
            return zzge;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
