package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfo  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public abstract class zzfo {
    private final Class zza;
    private final Map zzb;
    private final Class zzc;

    @SafeVarargs
    protected zzfo(Class cls, zzfp... zzfpArr) {
        this.zza = cls;
        HashMap hashMap = new HashMap();
        int i = 0;
        while (i <= 0) {
            zzfp zzfp = zzfpArr[i];
            if (!hashMap.containsKey(zzfp.zzb())) {
                hashMap.put(zzfp.zzb(), zzfp);
                i++;
            } else {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive ".concat(String.valueOf(zzfp.zzb().getCanonicalName())));
            }
        }
        this.zzc = zzfpArr[0].zzb();
        this.zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzfn zza() {
        throw new UnsupportedOperationException("Creating keys is not supported.");
    }

    public abstract zzabc zzb(zzyu zzyu) throws zzaaf;

    public abstract String zzc();

    public abstract void zzd(zzabc zzabc) throws GeneralSecurityException;

    public int zze() {
        return 1;
    }

    public abstract int zzf();

    public final Class zzj() {
        return this.zzc;
    }

    public final Class zzk() {
        return this.zza;
    }

    public final Object zzl(zzabc zzabc, Class cls) throws GeneralSecurityException {
        zzfp zzfp = (zzfp) this.zzb.get(cls);
        if (zzfp != null) {
            return zzfp.zza(zzabc);
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalArgumentException("Requested primitive class " + canonicalName + " not supported.");
    }

    public final Set zzm() {
        return this.zzb.keySet();
    }
}
