package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
class zzaz implements zzax {
    private final zzfo zza;
    private final Class zzb;

    public zzaz(zzfo zzfo, Class cls) {
        if (zzfo.zzm().contains(cls) || Void.class.equals(cls)) {
            this.zza = zzfo;
            this.zzb = cls;
            return;
        }
        throw new IllegalArgumentException(String.format("Given internalKeyMananger %s does not support primitive class %s", new Object[]{zzfo.toString(), cls.getName()}));
    }

    private final zzay zzf() {
        return new zzay(this.zza.zza());
    }

    private final Object zzg(zzabc zzabc) throws GeneralSecurityException {
        if (!Void.class.equals(this.zzb)) {
            this.zza.zzd(zzabc);
            return this.zza.zzl(zzabc, this.zzb);
        }
        throw new GeneralSecurityException("Cannot create a primitive for Void");
    }

    public final zzkl zza(zzyu zzyu) throws GeneralSecurityException {
        try {
            zzabc zza2 = zzf().zza(zzyu);
            zzkk zza3 = zzkl.zza();
            zza3.zza(this.zza.zzc());
            zza3.zzb(zza2.zzo());
            zza3.zzc(this.zza.zzf());
            return (zzkl) zza3.zzk();
        } catch (zzaaf e) {
            throw new GeneralSecurityException("Unexpected proto", e);
        }
    }

    public final zzabc zzb(zzyu zzyu) throws GeneralSecurityException {
        try {
            return zzf().zza(zzyu);
        } catch (zzaaf e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(String.valueOf(this.zza.zza().zzg().getName())), e);
        }
    }

    public final Object zzc(zzyu zzyu) throws GeneralSecurityException {
        try {
            return zzg(this.zza.zzb(zzyu));
        } catch (zzaaf e) {
            throw new GeneralSecurityException("Failures parsing proto of type ".concat(String.valueOf(this.zza.zzk().getName())), e);
        }
    }

    public final Object zzd(zzabc zzabc) throws GeneralSecurityException {
        String concat = "Expected proto of type ".concat(String.valueOf(this.zza.zzk().getName()));
        if (this.zza.zzk().isInstance(zzabc)) {
            return zzg(zzabc);
        }
        throw new GeneralSecurityException(concat);
    }

    public final String zze() {
        return this.zza.zzc();
    }
}
