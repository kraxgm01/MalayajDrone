package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzeo  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzeo implements zzmm {
    private final String zza;
    private final int zzb;
    private zzhp zzc;
    private zzgr zzd;
    private int zze;
    private zzib zzf;

    zzeo(zzkq zzkq) throws GeneralSecurityException {
        String zze2 = zzkq.zze();
        this.zza = zze2;
        if (zze2.equals(zzcb.zzb)) {
            try {
                zzhs zzd2 = zzhs.zzd(zzkq.zzd(), zzzk.zza());
                this.zzc = (zzhp) zzbz.zzd(zzkq);
                this.zzb = zzd2.zza();
            } catch (zzaaf e) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e);
            }
        } else if (zze2.equals(zzcb.zza)) {
            try {
                zzgu zzc2 = zzgu.zzc(zzkq.zzd(), zzzk.zza());
                this.zzd = (zzgr) zzbz.zzd(zzkq);
                this.zze = zzc2.zzd().zza();
                this.zzb = this.zze + zzc2.zze().zza();
            } catch (zzaaf e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e2);
            }
        } else if (zze2.equals(zzdz.zza)) {
            try {
                zzie zzd3 = zzie.zzd(zzkq.zzd(), zzzk.zza());
                this.zzf = (zzib) zzbz.zzd(zzkq);
                this.zzb = zzd3.zza();
            } catch (zzaaf e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        } else {
            throw new GeneralSecurityException("unsupported AEAD DEM key type: ".concat(String.valueOf(zze2)));
        }
    }

    public final int zza() {
        return this.zzb;
    }

    public final zzfe zzb(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != this.zzb) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        } else if (this.zza.equals(zzcb.zzb)) {
            zzho zzb2 = zzhp.zzb();
            zzb2.zzj(this.zzc);
            zzb2.zza(zzyu.zzo(bArr, 0, this.zzb));
            return new zzfe((zzap) zzbz.zzi(this.zza, (zzhp) zzb2.zzk(), zzap.class));
        } else if (this.zza.equals(zzcb.zza)) {
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, this.zze);
            byte[] copyOfRange2 = Arrays.copyOfRange(bArr, this.zze, this.zzb);
            zzgw zzb3 = zzgx.zzb();
            zzb3.zzj(this.zzd.zze());
            zzb3.zza(zzyu.zzn(copyOfRange));
            zzjn zzb4 = zzjo.zzb();
            zzb4.zzj(this.zzd.zzf());
            zzb4.zza(zzyu.zzn(copyOfRange2));
            zzgq zzb5 = zzgr.zzb();
            zzb5.zzc(this.zzd.zza());
            zzb5.zza((zzgx) zzb3.zzk());
            zzb5.zzb((zzjo) zzb4.zzk());
            return new zzfe((zzap) zzbz.zzi(this.zza, (zzgr) zzb5.zzk(), zzap.class));
        } else if (this.zza.equals(zzdz.zza)) {
            zzia zzb6 = zzib.zzb();
            zzb6.zzj(this.zzf);
            zzb6.zza(zzyu.zzo(bArr, 0, this.zzb));
            return new zzfe((zzat) zzbz.zzi(this.zza, (zzib) zzb6.zzk(), zzat.class));
        } else {
            throw new GeneralSecurityException("unknown DEM key type");
        }
    }
}
