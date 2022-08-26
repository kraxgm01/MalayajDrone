package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacg  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzacg {
    private static final zzacg zza = new zzacg(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzacg() {
        this(0, new int[8], new Object[8], true);
    }

    private zzacg(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzacg zzc() {
        return zza;
    }

    static zzacg zzd(zzacg zzacg, zzacg zzacg2) {
        int i = zzacg.zzb + zzacg2.zzb;
        int[] copyOf = Arrays.copyOf(zzacg.zzc, i);
        System.arraycopy(zzacg2.zzc, 0, copyOf, zzacg.zzb, zzacg2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzacg.zzd, i);
        System.arraycopy(zzacg2.zzd, 0, copyOf2, zzacg.zzb, zzacg2.zzb);
        return new zzacg(i, copyOf, copyOf2, true);
    }

    static zzacg zze() {
        return new zzacg(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzacg)) {
            return false;
        }
        zzacg zzacg = (zzacg) obj;
        int i = this.zzb;
        if (i == zzacg.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzacg.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzacg.zzd;
                    int i3 = this.zzb;
                    int i4 = 0;
                    while (i4 < i3) {
                        if (objArr[i4].equals(objArr2[i4])) {
                            i4++;
                        }
                    }
                    return true;
                } else if (iArr[i2] != iArr2[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = (i + 527) * 31;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final int zza() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3];
            int i5 = i4 >>> 3;
            switch (i4 & 7) {
                case 0:
                    i2 += zzzf.zzE(i5 << 3) + zzzf.zzF(((Long) this.zzd[i3]).longValue());
                    break;
                case 1:
                    ((Long) this.zzd[i3]).longValue();
                    i2 += zzzf.zzE(i5 << 3) + 8;
                    break;
                case 2:
                    int zzE = zzzf.zzE(i5 << 3);
                    int zzd2 = ((zzyu) this.zzd[i3]).zzd();
                    i2 += zzE + zzzf.zzE(zzd2) + zzd2;
                    break;
                case 3:
                    int zzD = zzzf.zzD(i5);
                    i2 += zzD + zzD + ((zzacg) this.zzd[i3]).zza();
                    break;
                case 5:
                    ((Integer) this.zzd[i3]).intValue();
                    i2 += zzzf.zzE(i5 << 3) + 4;
                    break;
                default:
                    throw new IllegalStateException(zzaaf.zza());
            }
        }
        this.zze = i2;
        return i2;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3];
            int zzE = zzzf.zzE(8);
            int zzd2 = ((zzyu) this.zzd[i3]).zzd();
            i2 += zzE + zzE + zzzf.zzE(16) + zzzf.zzE(i4 >>> 3) + zzzf.zzE(24) + zzzf.zzE(zzd2) + zzd2;
        }
        this.zze = i2;
        return i2;
    }

    public final void zzf() {
        this.zzf = false;
    }

    /* access modifiers changed from: package-private */
    public final void zzg(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzabe.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzh(int i, Object obj) {
        int i2;
        if (this.zzf) {
            int i3 = this.zzb;
            int[] iArr = this.zzc;
            if (i3 == iArr.length) {
                if (i3 < 4) {
                    i2 = 8;
                } else {
                    i2 = i3 >> 1;
                }
                int i4 = i3 + i2;
                this.zzc = Arrays.copyOf(iArr, i4);
                this.zzd = Arrays.copyOf(this.zzd, i4);
            }
            int[] iArr2 = this.zzc;
            int i5 = this.zzb;
            iArr2[i5] = i;
            this.zzd[i5] = obj;
            this.zzb = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void zzi(zzzg zzzg) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 >>> 3;
                switch (i2 & 7) {
                    case 0:
                        zzzg.zzt(i3, ((Long) obj).longValue());
                        break;
                    case 1:
                        zzzg.zzm(i3, ((Long) obj).longValue());
                        break;
                    case 2:
                        zzzg.zzd(i3, (zzyu) obj);
                        break;
                    case 3:
                        zzzg.zzE(i3);
                        ((zzacg) obj).zzi(zzzg);
                        zzzg.zzh(i3);
                        break;
                    case 5:
                        zzzg.zzk(i3, ((Integer) obj).intValue());
                        break;
                    default:
                        throw new RuntimeException(zzaaf.zza());
                }
            }
        }
    }
}
