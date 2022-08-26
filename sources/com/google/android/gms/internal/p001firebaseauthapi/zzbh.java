package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbh  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzbh {
    private final zzkv zza;

    private zzbh(zzkv zzkv) {
        this.zza = zzkv;
    }

    public static zzbh zze() {
        return new zzbh(zzky.zzc());
    }

    public static zzbh zzf(zzbg zzbg) {
        return new zzbh((zzkv) zzbg.zzc().zzu());
    }

    private final synchronized int zzg() {
        int zza2;
        zza2 = zzfr.zza();
        while (zzi(zza2)) {
            zza2 = zzfr.zza();
        }
        return zza2;
    }

    private final synchronized zzkx zzh(zzkq zzkq) throws GeneralSecurityException {
        return zzj(zzbz.zzc(zzkq), zzkq.zzh());
    }

    private final synchronized boolean zzi(int i) {
        boolean z;
        Iterator it = this.zza.zze().iterator();
        while (true) {
            if (it.hasNext()) {
                if (((zzkx) it.next()).zza() == i) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        return z;
    }

    private final synchronized zzkx zzj(zzkl zzkl, int i) throws GeneralSecurityException {
        zzkw zzc;
        int zzg = zzg();
        if (i != 2) {
            zzc = zzkx.zzc();
            zzc.zza(zzkl);
            zzc.zzb(zzg);
            zzc.zzd(3);
            zzc.zzc(i);
        } else {
            throw new GeneralSecurityException("unknown output prefix type");
        }
        return (zzkx) zzc.zzk();
    }

    @Deprecated
    public final synchronized int zza(zzkq zzkq, boolean z) throws GeneralSecurityException {
        zzkx zzh;
        zzh = zzh(zzkq);
        this.zza.zzb(zzh);
        return zzh.zza();
    }

    public final synchronized zzbg zzb() throws GeneralSecurityException {
        return zzbg.zza((zzky) this.zza.zzk());
    }

    public final synchronized zzbh zzc(zzbe zzbe) throws GeneralSecurityException {
        zza(zzbe.zza(), false);
        return this;
    }

    public final synchronized zzbh zzd(int i) throws GeneralSecurityException {
        int i2 = 0;
        while (i2 < this.zza.zza()) {
            zzkx zzd = this.zza.zzd(i2);
            if (zzd.zza() != i) {
                i2++;
            } else if (zzd.zzh() == 3) {
                this.zza.zzc(i);
            } else {
                throw new GeneralSecurityException("cannot set key as primary because it's not enabled: " + i);
            }
        }
        throw new GeneralSecurityException("key not found: " + i);
        return this;
    }
}
