package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzee  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzee extends zzfq {
    /* access modifiers changed from: private */
    public static final byte[] zza = new byte[0];

    zzee() {
        super(zziy.class, zzjb.class, new zzec(zzau.class));
    }

    static /* bridge */ /* synthetic */ zzfm zzi(int i, int i2, int i3, zzbe zzbe, byte[] bArr, int i4) {
        zzir zza2 = zzis.zza();
        zzjd zza3 = zzje.zza();
        int i5 = 4;
        zza3.zzb(4);
        zza3.zzc(5);
        zza3.zza(zzyu.zzn(bArr));
        zzje zzje = (zzje) zza3.zzk();
        zzkp zza4 = zzkq.zza();
        zza4.zza(zzbe.zzb());
        zza4.zzb(zzyu.zzn(zzbe.zzc()));
        switch (zzbe.zzd() - 1) {
            case 0:
                i5 = 3;
                break;
            case 1:
                break;
            case 2:
                i5 = 5;
                break;
            default:
                i5 = 6;
                break;
        }
        zza4.zzc(i5);
        zzio zza5 = zzip.zza();
        zza5.zza((zzkq) zza4.zzk());
        zziu zzb = zziv.zzb();
        zzb.zzb(zzje);
        zzb.zza((zzip) zza5.zzk());
        zzb.zzc(i3);
        zza2.zza((zziv) zzb.zzk());
        return new zzfm((zzis) zza2.zzk(), i4);
    }

    public final zzfn zza() {
        return new zzed(this, zzis.class);
    }

    public final /* synthetic */ zzabc zzb(zzyu zzyu) throws zzaaf {
        return zziy.zzd(zzyu, zzzk.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzabc zzabc) throws GeneralSecurityException {
        zziy zziy = (zziy) zzabc;
        if (!zziy.zzf().zzs()) {
            zznm.zzc(zziy.zza(), 0);
            zzen.zza(zziy.zze().zzb());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    public final int zzf() {
        return 4;
    }

    public final /* synthetic */ zzabc zzg(zzabc zzabc) throws GeneralSecurityException {
        return ((zziy) zzabc).zze();
    }
}
