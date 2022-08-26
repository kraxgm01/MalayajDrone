package com.google.android.gms.internal.p001firebaseauthapi;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzca  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzca {
    public static final Charset zza = Charset.forName("UTF-8");

    public static zzld zza(zzky zzky) {
        zzla zza2 = zzld.zza();
        zza2.zzb(zzky.zzb());
        for (zzkx zzkx : zzky.zzg()) {
            zzlb zzb = zzlc.zzb();
            zzb.zzb(zzkx.zzb().zze());
            zzb.zzd(zzkx.zzh());
            zzb.zzc(zzkx.zzi());
            zzb.zza(zzkx.zza());
            zza2.zza((zzlc) zzb.zzk());
        }
        return (zzld) zza2.zzk();
    }

    public static void zzb(zzky zzky) throws GeneralSecurityException {
        int zzb = zzky.zzb();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzkx zzkx : zzky.zzg()) {
            if (zzkx.zzh() == 3) {
                if (!zzkx.zzg()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(zzkx.zza())}));
                } else if (zzkx.zzi() == 2) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(zzkx.zza())}));
                } else if (zzkx.zzh() != 2) {
                    if (zzkx.zza() == zzb) {
                        if (!z) {
                            z = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    z2 &= zzkx.zzb().zzh() == 5;
                    i++;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(zzkx.zza())}));
                }
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
