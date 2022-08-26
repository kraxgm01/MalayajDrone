package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzen  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzen {
    public static void zza(zziv zziv) throws GeneralSecurityException {
        zzmr.zzf(zzc(zziv.zze().zzf()));
        zzb(zziv.zze().zzg());
        if (zziv.zzh() != 2) {
            zzbz.zzc(zziv.zza().zzd());
            return;
        }
        throw new GeneralSecurityException("unknown EC point format");
    }

    public static String zzb(int i) throws NoSuchAlgorithmException {
        switch (i - 2) {
            case 1:
                return "HmacSha1";
            case 2:
                return "HmacSha384";
            case 3:
                return "HmacSha256";
            case 4:
                return "HmacSha512";
            case 5:
                return "HmacSha224";
            default:
                throw new NoSuchAlgorithmException("hash unsupported for HMAC: ".concat(Integer.toString(zzjl.zza(i))));
        }
    }

    public static int zzc(int i) throws GeneralSecurityException {
        switch (i - 2) {
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            default:
                throw new GeneralSecurityException("unknown curve type: ".concat(Integer.toString(zzjg.zza(i))));
        }
    }

    public static int zzd(int i) throws GeneralSecurityException {
        switch (i - 2) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            default:
                throw new GeneralSecurityException("unknown point format: ".concat(Integer.toString(zzim.zza(i))));
        }
    }
}
