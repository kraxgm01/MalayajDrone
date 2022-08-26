package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzeu  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzeu implements zzau {
    private static final byte[] zza = new byte[0];
    private final zzkf zzb;
    private final zzes zzc;
    private final zzfd zzd;
    private final zzer zze;

    private zzeu(zzkf zzkf, zzfd zzfd, zzer zzer, zzes zzes, int i, byte[] bArr) {
        this.zzb = zzkf;
        this.zzd = zzfd;
        this.zze = zzer;
        this.zzc = zzes;
    }

    static zzeu zzb(zzkf zzkf) throws GeneralSecurityException {
        if (!zzkf.zzk()) {
            throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
        } else if (!zzkf.zze().zzl()) {
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        } else if (!zzkf.zzf().zzs()) {
            zzkc zzb2 = zzkf.zze().zzb();
            zzfd zzc2 = zzew.zzc(zzb2);
            zzer zzb3 = zzew.zzb(zzb2);
            zzes zza2 = zzew.zza(zzb2);
            int zzf = zzb2.zzf();
            switch (zzf - 2) {
                case 1:
                    return new zzeu(zzkf, zzc2, zzb3, zza2, 32, (byte[]) null);
                default:
                    throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(zzjw.zza(zzf)));
            }
        } else {
            throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
        }
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length >= 32) {
            byte[] copyOf = Arrays.copyOf(bArr, 32);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 32, length);
            zzkf zzkf = this.zzb;
            zzfd zzfd = this.zzd;
            zzer zzer = this.zze;
            zzes zzes = this.zzc;
            return zzet.zzb(copyOf, zzfd.zza(copyOf, zzkf.zzf().zzt()), zzfd, zzer, zzes, new byte[0]).zza(copyOfRange, zza);
        }
        throw new GeneralSecurityException("Ciphertext is too short.");
    }
}
