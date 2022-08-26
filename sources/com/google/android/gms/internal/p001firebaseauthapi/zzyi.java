package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyi  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzyi {
    static int zza(byte[] bArr, int i, zzyh zzyh) throws zzaaf {
        int zzj = zzj(bArr, i, zzyh);
        int i2 = zzyh.zza;
        if (i2 < 0) {
            throw zzaaf.zzf();
        } else if (i2 > bArr.length - zzj) {
            throw zzaaf.zzi();
        } else if (i2 == 0) {
            zzyh.zzc = zzyu.zzb;
            return zzj;
        } else {
            zzyh.zzc = zzyu.zzo(bArr, zzj, i2);
            return zzj + i2;
        }
    }

    static int zzb(byte[] bArr, int i) {
        return ((bArr[i + 3] & UByte.MAX_VALUE) << 24) | (bArr[i] & UByte.MAX_VALUE) | ((bArr[i + 1] & UByte.MAX_VALUE) << 8) | ((bArr[i + 2] & UByte.MAX_VALUE) << 16);
    }

    static int zzc(zzabo zzabo, byte[] bArr, int i, int i2, int i3, zzyh zzyh) throws IOException {
        zzabf zzabf = (zzabf) zzabo;
        Object zze = zzabf.zze();
        int zzc = zzabf.zzc(zze, bArr, i, i2, i3, zzyh);
        zzabf.zzf(zze);
        zzyh.zzc = zze;
        return zzc;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int zzd(com.google.android.gms.internal.p001firebaseauthapi.zzabo r6, byte[] r7, int r8, int r9, com.google.android.gms.internal.p001firebaseauthapi.zzyh r10) throws java.io.IOException {
        /*
            int r0 = r8 + 1
            byte r8 = r7[r8]
            if (r8 >= 0) goto L_0x000e
            int r0 = zzk(r8, r7, r0, r10)
            int r8 = r10.zza
            r3 = r0
            goto L_0x000f
        L_0x000e:
            r3 = r0
        L_0x000f:
            if (r8 < 0) goto L_0x0027
            int r9 = r9 - r3
            if (r8 > r9) goto L_0x0027
            java.lang.Object r9 = r6.zze()
            int r8 = r8 + r3
            r0 = r6
            r1 = r9
            r2 = r7
            r4 = r8
            r5 = r10
            r0.zzi(r1, r2, r3, r4, r5)
            r6.zzf(r9)
            r10.zzc = r9
            return r8
        L_0x0027:
            com.google.android.gms.internal.firebase-auth-api.zzaaf r6 = com.google.android.gms.internal.p001firebaseauthapi.zzaaf.zzi()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzyi.zzd(com.google.android.gms.internal.firebase-auth-api.zzabo, byte[], int, int, com.google.android.gms.internal.firebase-auth-api.zzyh):int");
    }

    static int zze(zzabo zzabo, int i, byte[] bArr, int i2, int i3, zzaac zzaac, zzyh zzyh) throws IOException {
        int zzd = zzd(zzabo, bArr, i2, i3, zzyh);
        zzaac.add(zzyh.zzc);
        while (zzd < i3) {
            int zzj = zzj(bArr, zzd, zzyh);
            if (i != zzyh.zza) {
                break;
            }
            zzd = zzd(zzabo, bArr, zzj, i3, zzyh);
            zzaac.add(zzyh.zzc);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i, zzaac zzaac, zzyh zzyh) throws IOException {
        zzzy zzzy = (zzzy) zzaac;
        int zzj = zzj(bArr, i, zzyh);
        int i2 = zzyh.zza + zzj;
        while (zzj < i2) {
            zzj = zzj(bArr, zzj, zzyh);
            zzzy.zzf(zzyh.zza);
        }
        if (zzj == i2) {
            return zzj;
        }
        throw zzaaf.zzi();
    }

    static int zzg(byte[] bArr, int i, zzyh zzyh) throws zzaaf {
        int zzj = zzj(bArr, i, zzyh);
        int i2 = zzyh.zza;
        if (i2 < 0) {
            throw zzaaf.zzf();
        } else if (i2 == 0) {
            zzyh.zzc = "";
            return zzj;
        } else {
            zzyh.zzc = new String(bArr, zzj, i2, zzaad.zzb);
            return zzj + i2;
        }
    }

    static int zzh(byte[] bArr, int i, zzyh zzyh) throws zzaaf {
        int zzj = zzj(bArr, i, zzyh);
        int i2 = zzyh.zza;
        if (i2 < 0) {
            throw zzaaf.zzf();
        } else if (i2 == 0) {
            zzyh.zzc = "";
            return zzj;
        } else {
            zzyh.zzc = zzacu.zzd(bArr, zzj, i2);
            return zzj + i2;
        }
    }

    static int zzj(byte[] bArr, int i, zzyh zzyh) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return zzk(b, bArr, i2, zzyh);
        }
        zzyh.zza = b;
        return i2;
    }

    static int zzk(int i, byte[] bArr, int i2, zzyh zzyh) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            zzyh.zza = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & ByteCompanionObject.MAX_VALUE) << 7);
        int i6 = i4 + 1;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            zzyh.zza = i5 | (b2 << 14);
            return i6;
        }
        int i7 = i5 | ((b2 & ByteCompanionObject.MAX_VALUE) << 14);
        int i8 = i6 + 1;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            zzyh.zza = i7 | (b3 << 21);
            return i8;
        }
        int i9 = i7 | ((b3 & ByteCompanionObject.MAX_VALUE) << 21);
        int i10 = i8 + 1;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            zzyh.zza = i9 | (b4 << 28);
            return i10;
        }
        int i11 = i9 | ((b4 & ByteCompanionObject.MAX_VALUE) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                zzyh.zza = i11;
                return i12;
            }
        }
    }

    static int zzl(int i, byte[] bArr, int i2, int i3, zzaac zzaac, zzyh zzyh) {
        zzzy zzzy = (zzzy) zzaac;
        int zzj = zzj(bArr, i2, zzyh);
        zzzy.zzf(zzyh.zza);
        while (zzj < i3) {
            int zzj2 = zzj(bArr, zzj, zzyh);
            if (i != zzyh.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzyh);
            zzzy.zzf(zzyh.zza);
        }
        return zzj;
    }

    static int zzm(byte[] bArr, int i, zzyh zzyh) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            zzyh.zzb = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & ByteCompanionObject.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & ByteCompanionObject.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        zzyh.zzb = j2;
        return i3;
    }

    static long zzn(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    static int zzi(int i, byte[] bArr, int i2, int i3, zzacg zzacg, zzyh zzyh) throws zzaaf {
        if ((i >>> 3) != 0) {
            switch (i & 7) {
                case 0:
                    int zzm = zzm(bArr, i2, zzyh);
                    zzacg.zzh(i, Long.valueOf(zzyh.zzb));
                    return zzm;
                case 1:
                    zzacg.zzh(i, Long.valueOf(zzn(bArr, i2)));
                    return i2 + 8;
                case 2:
                    int zzj = zzj(bArr, i2, zzyh);
                    int i4 = zzyh.zza;
                    if (i4 < 0) {
                        throw zzaaf.zzf();
                    } else if (i4 <= bArr.length - zzj) {
                        if (i4 == 0) {
                            zzacg.zzh(i, zzyu.zzb);
                        } else {
                            zzacg.zzh(i, zzyu.zzo(bArr, zzj, i4));
                        }
                        return zzj + i4;
                    } else {
                        throw zzaaf.zzi();
                    }
                case 3:
                    int i5 = (i & -8) | 4;
                    zzacg zze = zzacg.zze();
                    int i6 = 0;
                    while (true) {
                        if (i2 < i3) {
                            int zzj2 = zzj(bArr, i2, zzyh);
                            int i7 = zzyh.zza;
                            if (i7 == i5) {
                                i6 = i7;
                                i2 = zzj2;
                            } else {
                                i6 = i7;
                                i2 = zzi(i7, bArr, zzj2, i3, zze, zzyh);
                            }
                        }
                    }
                    if (i2 > i3 || i6 != i5) {
                        throw zzaaf.zzg();
                    }
                    zzacg.zzh(i, zze);
                    return i2;
                case 5:
                    zzacg.zzh(i, Integer.valueOf(zzb(bArr, i2)));
                    return i2 + 4;
                default:
                    throw zzaaf.zzc();
            }
        } else {
            throw zzaaf.zzc();
        }
    }
}
