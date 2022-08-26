package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzco  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzco extends zzfo {
    zzco() {
        super(zzhg.class, new zzcm(zzap.class));
    }

    static /* bridge */ /* synthetic */ zzfm zzg(int i, int i2, int i3) {
        zzhi zzb = zzhj.zzb();
        zzb.zza(i);
        zzhl zzb2 = zzhm.zzb();
        zzb2.zza(16);
        zzb.zzb((zzhm) zzb2.zzk());
        return new zzfm((zzhj) zzb.zzk(), i3);
    }

    public final zzfn zza() {
        return new zzcn(this, zzhj.class);
    }

    public final /* synthetic */ zzabc zzb(zzyu zzyu) throws zzaaf {
        return zzhg.zzd(zzyu, zzzk.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzabc zzabc) throws GeneralSecurityException {
        zzhg zzhg = (zzhg) zzabc;
        zznm.zzc(zzhg.zza(), 0);
        zznm.zzb(zzhg.zzf().zzd());
        if (zzhg.zze().zza() != 12 && zzhg.zze().zza() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    public final int zzf() {
        return 3;
    }
}
