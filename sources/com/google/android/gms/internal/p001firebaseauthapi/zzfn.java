package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public abstract class zzfn {
    private final Class zza;

    public zzfn(Class cls) {
        this.zza = cls;
    }

    public abstract zzabc zza(zzabc zzabc) throws GeneralSecurityException;

    public abstract zzabc zzb(zzyu zzyu) throws zzaaf;

    public Map zzc() throws GeneralSecurityException {
        return Collections.emptyMap();
    }

    public abstract void zzd(zzabc zzabc) throws GeneralSecurityException;

    public final Class zzg() {
        return this.zza;
    }
}
