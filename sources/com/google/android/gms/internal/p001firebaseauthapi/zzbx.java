package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzbx extends zzaz implements zzbw {
    private final zzfq zza;
    private final zzfo zzb;

    public zzbx(zzfq zzfq, zzfo zzfo, Class cls) {
        super(zzfq, cls);
        this.zza = zzfq;
        this.zzb = zzfo;
    }

    public final zzkl zzf(zzyu zzyu) throws GeneralSecurityException {
        try {
            zzabc zzb2 = this.zza.zzb(zzyu);
            this.zza.zzd(zzb2);
            zzabc zzg = this.zza.zzg(zzb2);
            this.zzb.zzd(zzg);
            zzkk zza2 = zzkl.zza();
            zza2.zza(this.zzb.zzc());
            zza2.zzb(zzg.zzo());
            zza2.zzc(this.zzb.zzf());
            return (zzkl) zza2.zzk();
        } catch (zzaaf e) {
            throw new GeneralSecurityException("expected serialized proto of type ", e);
        }
    }
}
