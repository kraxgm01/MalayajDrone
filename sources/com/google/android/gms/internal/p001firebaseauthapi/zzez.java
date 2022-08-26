package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzez  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzez extends zzfq {
    public zzez() {
        super(zzkf.class, zzki.class, new zzex(zzau.class));
    }

    static /* bridge */ /* synthetic */ zzfm zzh(int i, int i2, int i3, int i4) {
        zzkb zza = zzkc.zza();
        zza.zzc(3);
        zza.zzb(3);
        zza.zza(i3);
        zzjy zza2 = zzjz.zza();
        zza2.zza((zzkc) zza.zzk());
        return new zzfm((zzjz) zza2.zzk(), i4);
    }

    public final zzfn zza() {
        return new zzey(this, zzjz.class);
    }

    public final /* synthetic */ zzabc zzb(zzyu zzyu) throws zzaaf {
        return zzkf.zzd(zzyu, zzzk.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzabc zzabc) throws GeneralSecurityException {
        zzkf zzkf = (zzkf) zzabc;
        if (zzkf.zzf().zzs()) {
            throw new GeneralSecurityException("Private key is empty.");
        } else if (zzkf.zzk()) {
            zznm.zzc(zzkf.zza(), 0);
            zzfc.zza(zzkf.zze().zzb());
        } else {
            throw new GeneralSecurityException("Missing public key.");
        }
    }

    public final int zzf() {
        return 4;
    }

    public final /* synthetic */ zzabc zzg(zzabc zzabc) throws GeneralSecurityException {
        return ((zzkf) zzabc).zze();
    }
}
