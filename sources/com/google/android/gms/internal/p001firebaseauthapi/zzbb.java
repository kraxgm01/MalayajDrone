package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzbb implements zzbc {
    final /* synthetic */ zzfq zza;
    final /* synthetic */ zzfo zzb;

    zzbb(zzfq zzfq, zzfo zzfo) {
        this.zza = zzfq;
        this.zzb = zzfo;
    }

    public final zzax zza(Class cls) throws GeneralSecurityException {
        try {
            return new zzbx(this.zza, this.zzb, cls);
        } catch (IllegalArgumentException e) {
            throw new GeneralSecurityException("Primitive type not supported", e);
        }
    }

    public final zzax zzb() {
        zzfq zzfq = this.zza;
        return new zzbx(zzfq, this.zzb, zzfq.zzj());
    }

    public final Class zzc() {
        return this.zza.getClass();
    }

    public final Class zzd() {
        return this.zzb.getClass();
    }

    public final Set zze() {
        return this.zza.zzm();
    }
}
