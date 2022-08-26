package com.google.android.gms.internal.p001firebaseauthapi;

import java.nio.charset.StandardCharsets;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzfc {
    public static final byte[] zza = zzc(1, 0);
    public static final byte[] zzb = zzc(2, 32);
    public static final byte[] zzc = zzc(2, 1);
    public static final byte[] zzd = zzc(2, 1);
    public static final byte[] zze = zzc(2, 2);
    public static final byte[] zzf = zzc(2, 3);
    public static final byte[] zzg = new byte[0];
    private static final byte[] zzh = "KEM".getBytes(StandardCharsets.UTF_8);
    private static final byte[] zzi = "HPKE".getBytes(StandardCharsets.UTF_8);
    private static final byte[] zzj = "HPKE-v1".getBytes(StandardCharsets.UTF_8);

    static void zza(zzkc zzkc) throws GeneralSecurityException {
        if (zzkc.zzf() == 2 || zzkc.zzf() == 1) {
            throw new GeneralSecurityException("Invalid KEM param: ".concat(zzjw.zza(zzkc.zzf())));
        }
        String str = "UNRECOGNIZED";
        if (zzkc.zze() == 2 || zzkc.zze() == 1) {
            switch (zzkc.zze()) {
                case 2:
                    str = "KDF_UNKNOWN";
                    break;
                case 3:
                    str = "HKDF_SHA256";
                    break;
            }
            throw new GeneralSecurityException("Invalid KDF param: ".concat(str));
        } else if (zzkc.zzd() == 2 || zzkc.zzd() == 1) {
            switch (zzkc.zzd()) {
                case 2:
                    str = "AEAD_UNKNOWN";
                    break;
                case 3:
                    str = "AES_128_GCM";
                    break;
                case 4:
                    str = "AES_256_GCM";
                    break;
                case 5:
                    str = "CHACHA20_POLY1305";
                    break;
            }
            throw new GeneralSecurityException("Invalid AEAD param: ".concat(str));
        }
    }

    static byte[] zzb(byte[] bArr, byte[] bArr2, byte[] bArr3) throws GeneralSecurityException {
        return zzmj.zzc(zzi, bArr, bArr2, bArr3);
    }

    public static byte[] zzc(int i, int i2) {
        byte[] bArr = new byte[i];
        for (int i3 = 0; i3 < i; i3++) {
            bArr[i3] = (byte) ((i2 >> (((i - i3) - 1) * 8)) & 255);
        }
        return bArr;
    }

    static byte[] zzd(byte[] bArr) throws GeneralSecurityException {
        return zzmj.zzc(zzh, bArr);
    }

    static byte[] zze(String str, byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return zzmj.zzc(zzj, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }

    static byte[] zzf(String str, byte[] bArr, byte[] bArr2, int i) throws GeneralSecurityException {
        return zzmj.zzc(zzc(2, i), zzj, bArr2, str.getBytes(StandardCharsets.UTF_8), bArr);
    }
}
