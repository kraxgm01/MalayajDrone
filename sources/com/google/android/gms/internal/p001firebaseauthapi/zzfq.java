package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public abstract class zzfq extends zzfo {
    private final Class zza;

    @SafeVarargs
    protected zzfq(Class cls, Class cls2, zzfp... zzfpArr) {
        super(cls, zzfpArr);
        this.zza = cls2;
    }

    public abstract zzabc zzg(zzabc zzabc) throws GeneralSecurityException;
}
