package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabf  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzabf<T> implements zzabo<T> {
    private static final int[] zza = new int[0];
    private static final Unsafe zzb = zzacp.zzg();
    private final int[] zzc;
    private final Object[] zzd;
    private final int zze;
    private final int zzf;
    private final zzabc zzg;
    private final boolean zzh;
    private final boolean zzi;
    private final boolean zzj;
    private final int[] zzk;
    private final int zzl;
    private final int zzm;
    private final zzaaq zzn;
    private final zzacf zzo;
    private final zzzl zzp;
    private final zzabh zzq;
    private final zzaax zzr;

    private zzabf(int[] iArr, Object[] objArr, int i, int i2, zzabc zzabc, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzabh zzabh, zzaaq zzaaq, zzacf zzacf, zzzl zzzl, zzaax zzaax, byte[] bArr) {
        zzabc zzabc2 = zzabc;
        zzzl zzzl2 = zzzl;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zze = i;
        this.zzf = i2;
        this.zzi = zzabc2 instanceof zzzx;
        this.zzj = z;
        boolean z3 = false;
        if (zzzl2 != null && zzzl2.zzh(zzabc)) {
            z3 = true;
        }
        this.zzh = z3;
        this.zzk = iArr2;
        this.zzl = i3;
        this.zzm = i4;
        this.zzq = zzabh;
        this.zzn = zzaaq;
        this.zzo = zzacf;
        this.zzp = zzzl2;
        this.zzg = zzabc2;
        this.zzr = zzaax;
    }

    private final int zzA(int i, int i2) {
        int length = (this.zzc.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzc[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    private static int zzB(int i) {
        return (i >>> 20) & 255;
    }

    private final int zzC(int i) {
        return this.zzc[i + 1];
    }

    private static long zzD(Object obj, long j) {
        return ((Long) zzacp.zzf(obj, j)).longValue();
    }

    private final zzaab zzE(int i) {
        int i2 = i / 3;
        return (zzaab) this.zzd[i2 + i2 + 1];
    }

    private final zzabo zzF(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        zzabo zzabo = (zzabo) this.zzd[i3];
        if (zzabo != null) {
            return zzabo;
        }
        zzabo zzb2 = zzabk.zza().zzb((Class) this.zzd[i3 + 1]);
        this.zzd[i3] = zzb2;
        return zzb2;
    }

    private final Object zzG(Object obj, int i, Object obj2, zzacf zzacf) {
        int i2 = this.zzc[i];
        Object zzf2 = zzacp.zzf(obj, (long) (zzC(i) & 1048575));
        if (zzf2 == null || zzE(i) == null) {
            return obj2;
        }
        zzaaw zzaaw = (zzaaw) zzf2;
        zzaav zzaav = (zzaav) zzH(i);
        throw null;
    }

    private final Object zzH(int i) {
        int i2 = i / 3;
        return this.zzd[i2 + i2];
    }

    private static Field zzI(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    private final void zzJ(Object obj, Object obj2, int i) {
        long zzC = (long) (zzC(i) & 1048575);
        if (zzQ(obj2, i)) {
            Object zzf2 = zzacp.zzf(obj, zzC);
            Object zzf3 = zzacp.zzf(obj2, zzC);
            if (zzf2 != null && zzf3 != null) {
                zzacp.zzs(obj, zzC, zzaad.zzg(zzf2, zzf3));
                zzM(obj, i);
            } else if (zzf3 != null) {
                zzacp.zzs(obj, zzC, zzf3);
                zzM(obj, i);
            }
        }
    }

    private final void zzK(Object obj, Object obj2, int i) {
        Object obj3;
        int zzC = zzC(i);
        int i2 = this.zzc[i];
        long j = (long) (zzC & 1048575);
        if (zzT(obj2, i2, i)) {
            if (zzT(obj, i2, i)) {
                obj3 = zzacp.zzf(obj, j);
            } else {
                obj3 = null;
            }
            Object zzf2 = zzacp.zzf(obj2, j);
            if (obj3 != null && zzf2 != null) {
                zzacp.zzs(obj, j, zzaad.zzg(obj3, zzf2));
                zzN(obj, i2, i);
            } else if (zzf2 != null) {
                zzacp.zzs(obj, j, zzf2);
                zzN(obj, i2, i);
            }
        }
    }

    private final void zzL(Object obj, int i, zzabn zzabn) throws IOException {
        if (zzP(i)) {
            zzacp.zzs(obj, (long) (i & 1048575), zzabn.zzu());
        } else if (this.zzi) {
            zzacp.zzs(obj, (long) (i & 1048575), zzabn.zzt());
        } else {
            zzacp.zzs(obj, (long) (i & 1048575), zzabn.zzp());
        }
    }

    private final void zzM(Object obj, int i) {
        int zzz = zzz(i);
        long j = (long) (1048575 & zzz);
        if (j != 1048575) {
            zzacp.zzq(obj, j, (1 << (zzz >>> 20)) | zzacp.zzc(obj, j));
        }
    }

    private final void zzN(Object obj, int i, int i2) {
        zzacp.zzq(obj, (long) (zzz(i2) & 1048575), i);
    }

    private final boolean zzO(Object obj, Object obj2, int i) {
        return zzQ(obj, i) == zzQ(obj2, i);
    }

    private static boolean zzP(int i) {
        return (i & 536870912) != 0;
    }

    private final boolean zzQ(Object obj, int i) {
        int zzz = zzz(i);
        long j = (long) (zzz & 1048575);
        if (j != 1048575) {
            return (zzacp.zzc(obj, j) & (1 << (zzz >>> 20))) != 0;
        }
        int zzC = zzC(i);
        long j2 = (long) (zzC & 1048575);
        switch (zzB(zzC)) {
            case 0:
                return Double.doubleToRawLongBits(zzacp.zza(obj, j2)) != 0;
            case 1:
                return Float.floatToRawIntBits(zzacp.zzb(obj, j2)) != 0;
            case 2:
                return zzacp.zzd(obj, j2) != 0;
            case 3:
                return zzacp.zzd(obj, j2) != 0;
            case 4:
                return zzacp.zzc(obj, j2) != 0;
            case 5:
                return zzacp.zzd(obj, j2) != 0;
            case 6:
                return zzacp.zzc(obj, j2) != 0;
            case 7:
                return zzacp.zzw(obj, j2);
            case 8:
                Object zzf2 = zzacp.zzf(obj, j2);
                if (zzf2 instanceof String) {
                    return !((String) zzf2).isEmpty();
                }
                if (zzf2 instanceof zzyu) {
                    return !zzyu.zzb.equals(zzf2);
                }
                throw new IllegalArgumentException();
            case 9:
                return zzacp.zzf(obj, j2) != null;
            case 10:
                return !zzyu.zzb.equals(zzacp.zzf(obj, j2));
            case 11:
                return zzacp.zzc(obj, j2) != 0;
            case 12:
                return zzacp.zzc(obj, j2) != 0;
            case 13:
                return zzacp.zzc(obj, j2) != 0;
            case 14:
                return zzacp.zzd(obj, j2) != 0;
            case 15:
                return zzacp.zzc(obj, j2) != 0;
            case 16:
                return zzacp.zzd(obj, j2) != 0;
            case 17:
                return zzacp.zzf(obj, j2) != null;
            default:
                throw new IllegalArgumentException();
        }
    }

    private final boolean zzR(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return zzQ(obj, i);
        }
        return (i3 & i4) != 0;
    }

    private static boolean zzS(Object obj, int i, zzabo zzabo) {
        return zzabo.zzk(zzacp.zzf(obj, (long) (i & 1048575)));
    }

    private final boolean zzT(Object obj, int i, int i2) {
        return zzacp.zzc(obj, (long) (zzz(i2) & 1048575)) == i;
    }

    private static boolean zzU(Object obj, long j) {
        return ((Boolean) zzacp.zzf(obj, j)).booleanValue();
    }

    private final void zzV(Object obj, zzzg zzzg) throws IOException {
        int i;
        Object obj2 = obj;
        zzzg zzzg2 = zzzg;
        if (!this.zzh) {
            int length = this.zzc.length;
            Unsafe unsafe = zzb;
            int i2 = 1048575;
            int i3 = 1048575;
            int i4 = 0;
            int i5 = 0;
            while (i4 < length) {
                int zzC = zzC(i4);
                int[] iArr = this.zzc;
                int i6 = iArr[i4];
                int zzB = zzB(zzC);
                if (zzB <= 17) {
                    int i7 = iArr[i4 + 2];
                    int i8 = i7 & i2;
                    if (i8 != i3) {
                        i5 = unsafe.getInt(obj2, (long) i8);
                        i3 = i8;
                    }
                    i = 1 << (i7 >>> 20);
                } else {
                    i = 0;
                }
                long j = (long) (zzC & i2);
                switch (zzB) {
                    case 0:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzzg2.zzf(i6, zzacp.zza(obj2, j));
                            break;
                        }
                    case 1:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzzg2.zzo(i6, zzacp.zzb(obj2, j));
                            break;
                        }
                    case 2:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzzg2.zzt(i6, unsafe.getLong(obj2, j));
                            break;
                        }
                    case 3:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzzg2.zzJ(i6, unsafe.getLong(obj2, j));
                            break;
                        }
                    case 4:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzzg2.zzr(i6, unsafe.getInt(obj2, j));
                            break;
                        }
                    case 5:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzzg2.zzm(i6, unsafe.getLong(obj2, j));
                            break;
                        }
                    case 6:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzzg2.zzk(i6, unsafe.getInt(obj2, j));
                            break;
                        }
                    case 7:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzzg2.zzb(i6, zzacp.zzw(obj2, j));
                            break;
                        }
                    case 8:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzX(i6, unsafe.getObject(obj2, j), zzzg2);
                            break;
                        }
                    case 9:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzzg2.zzv(i6, unsafe.getObject(obj2, j), zzF(i4));
                            break;
                        }
                    case 10:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzzg2.zzd(i6, (zzyu) unsafe.getObject(obj2, j));
                            break;
                        }
                    case 11:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzzg2.zzH(i6, unsafe.getInt(obj2, j));
                            break;
                        }
                    case 12:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzzg2.zzi(i6, unsafe.getInt(obj2, j));
                            break;
                        }
                    case 13:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzzg2.zzw(i6, unsafe.getInt(obj2, j));
                            break;
                        }
                    case 14:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzzg2.zzy(i6, unsafe.getLong(obj2, j));
                            break;
                        }
                    case 15:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzzg2.zzA(i6, unsafe.getInt(obj2, j));
                            break;
                        }
                    case 16:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzzg2.zzC(i6, unsafe.getLong(obj2, j));
                            break;
                        }
                    case 17:
                        if ((i5 & i) == 0) {
                            break;
                        } else {
                            zzzg2.zzq(i6, unsafe.getObject(obj2, j), zzF(i4));
                            break;
                        }
                    case 18:
                        zzabq.zzL(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2, false);
                        break;
                    case 19:
                        zzabq.zzP(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2, false);
                        break;
                    case 20:
                        zzabq.zzS(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2, false);
                        break;
                    case 21:
                        zzabq.zzaa(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2, false);
                        break;
                    case 22:
                        zzabq.zzR(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2, false);
                        break;
                    case 23:
                        zzabq.zzO(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2, false);
                        break;
                    case 24:
                        zzabq.zzN(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2, false);
                        break;
                    case 25:
                        zzabq.zzJ(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2, false);
                        break;
                    case 26:
                        zzabq.zzY(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2);
                        break;
                    case 27:
                        zzabq.zzT(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2, zzF(i4));
                        break;
                    case 28:
                        zzabq.zzK(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2);
                        break;
                    case 29:
                        zzabq.zzZ(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2, false);
                        break;
                    case 30:
                        zzabq.zzM(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2, false);
                        break;
                    case 31:
                        zzabq.zzU(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2, false);
                        break;
                    case 32:
                        zzabq.zzV(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2, false);
                        break;
                    case 33:
                        zzabq.zzW(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2, false);
                        break;
                    case 34:
                        zzabq.zzX(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2, false);
                        break;
                    case 35:
                        zzabq.zzL(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2, true);
                        break;
                    case 36:
                        zzabq.zzP(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2, true);
                        break;
                    case 37:
                        zzabq.zzS(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2, true);
                        break;
                    case 38:
                        zzabq.zzaa(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2, true);
                        break;
                    case 39:
                        zzabq.zzR(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2, true);
                        break;
                    case 40:
                        zzabq.zzO(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2, true);
                        break;
                    case 41:
                        zzabq.zzN(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2, true);
                        break;
                    case 42:
                        zzabq.zzJ(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2, true);
                        break;
                    case 43:
                        zzabq.zzZ(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2, true);
                        break;
                    case 44:
                        zzabq.zzM(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2, true);
                        break;
                    case 45:
                        zzabq.zzU(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2, true);
                        break;
                    case 46:
                        zzabq.zzV(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2, true);
                        break;
                    case 47:
                        zzabq.zzW(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2, true);
                        break;
                    case 48:
                        zzabq.zzX(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2, true);
                        break;
                    case 49:
                        zzabq.zzQ(this.zzc[i4], (List) unsafe.getObject(obj2, j), zzzg2, zzF(i4));
                        break;
                    case 50:
                        zzW(zzzg2, i6, unsafe.getObject(obj2, j), i4);
                        break;
                    case 51:
                        if (!zzT(obj2, i6, i4)) {
                            break;
                        } else {
                            zzzg2.zzf(i6, zzo(obj2, j));
                            break;
                        }
                    case 52:
                        if (!zzT(obj2, i6, i4)) {
                            break;
                        } else {
                            zzzg2.zzo(i6, zzp(obj2, j));
                            break;
                        }
                    case 53:
                        if (!zzT(obj2, i6, i4)) {
                            break;
                        } else {
                            zzzg2.zzt(i6, zzD(obj2, j));
                            break;
                        }
                    case 54:
                        if (!zzT(obj2, i6, i4)) {
                            break;
                        } else {
                            zzzg2.zzJ(i6, zzD(obj2, j));
                            break;
                        }
                    case 55:
                        if (!zzT(obj2, i6, i4)) {
                            break;
                        } else {
                            zzzg2.zzr(i6, zzs(obj2, j));
                            break;
                        }
                    case 56:
                        if (!zzT(obj2, i6, i4)) {
                            break;
                        } else {
                            zzzg2.zzm(i6, zzD(obj2, j));
                            break;
                        }
                    case 57:
                        if (!zzT(obj2, i6, i4)) {
                            break;
                        } else {
                            zzzg2.zzk(i6, zzs(obj2, j));
                            break;
                        }
                    case 58:
                        if (!zzT(obj2, i6, i4)) {
                            break;
                        } else {
                            zzzg2.zzb(i6, zzU(obj2, j));
                            break;
                        }
                    case 59:
                        if (!zzT(obj2, i6, i4)) {
                            break;
                        } else {
                            zzX(i6, unsafe.getObject(obj2, j), zzzg2);
                            break;
                        }
                    case 60:
                        if (!zzT(obj2, i6, i4)) {
                            break;
                        } else {
                            zzzg2.zzv(i6, unsafe.getObject(obj2, j), zzF(i4));
                            break;
                        }
                    case 61:
                        if (!zzT(obj2, i6, i4)) {
                            break;
                        } else {
                            zzzg2.zzd(i6, (zzyu) unsafe.getObject(obj2, j));
                            break;
                        }
                    case 62:
                        if (!zzT(obj2, i6, i4)) {
                            break;
                        } else {
                            zzzg2.zzH(i6, zzs(obj2, j));
                            break;
                        }
                    case 63:
                        if (!zzT(obj2, i6, i4)) {
                            break;
                        } else {
                            zzzg2.zzi(i6, zzs(obj2, j));
                            break;
                        }
                    case 64:
                        if (!zzT(obj2, i6, i4)) {
                            break;
                        } else {
                            zzzg2.zzw(i6, zzs(obj2, j));
                            break;
                        }
                    case 65:
                        if (!zzT(obj2, i6, i4)) {
                            break;
                        } else {
                            zzzg2.zzy(i6, zzD(obj2, j));
                            break;
                        }
                    case 66:
                        if (!zzT(obj2, i6, i4)) {
                            break;
                        } else {
                            zzzg2.zzA(i6, zzs(obj2, j));
                            break;
                        }
                    case 67:
                        if (!zzT(obj2, i6, i4)) {
                            break;
                        } else {
                            zzzg2.zzC(i6, zzD(obj2, j));
                            break;
                        }
                    case 68:
                        if (!zzT(obj2, i6, i4)) {
                            break;
                        } else {
                            zzzg2.zzq(i6, unsafe.getObject(obj2, j), zzF(i4));
                            break;
                        }
                }
                i4 += 3;
                i2 = 1048575;
            }
            zzacf zzacf = this.zzo;
            zzacf.zzr(zzacf.zzd(obj2), zzzg2);
            return;
        }
        this.zzp.zza(obj2);
        throw null;
    }

    private final void zzW(zzzg zzzg, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zzaav zzaav = (zzaav) zzH(i2);
            throw null;
        }
    }

    private static final void zzX(int i, Object obj, zzzg zzzg) throws IOException {
        if (obj instanceof String) {
            zzzg.zzF(i, (String) obj);
        } else {
            zzzg.zzd(i, (zzyu) obj);
        }
    }

    static zzacg zzd(Object obj) {
        zzzx zzzx = (zzzx) obj;
        zzacg zzacg = zzzx.zzc;
        if (zzacg != zzacg.zzc()) {
            return zzacg;
        }
        zzacg zze2 = zzacg.zze();
        zzzx.zzc = zze2;
        return zze2;
    }

    static zzabf zzl(Class cls, zzaaz zzaaz, zzabh zzabh, zzaaq zzaaq, zzacf zzacf, zzzl zzzl, zzaax zzaax) {
        if (zzaaz instanceof zzabm) {
            return zzm((zzabm) zzaaz, zzabh, zzaaq, zzacf, zzzl, zzaax);
        }
        zzacc zzacc = (zzacc) zzaaz;
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:158:0x034b  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0394  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x03ad  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.android.gms.internal.p001firebaseauthapi.zzabf zzm(com.google.android.gms.internal.p001firebaseauthapi.zzabm r34, com.google.android.gms.internal.p001firebaseauthapi.zzabh r35, com.google.android.gms.internal.p001firebaseauthapi.zzaaq r36, com.google.android.gms.internal.p001firebaseauthapi.zzacf r37, com.google.android.gms.internal.p001firebaseauthapi.zzzl r38, com.google.android.gms.internal.p001firebaseauthapi.zzaax r39) {
        /*
            int r0 = r34.zzc()
            r1 = 0
            r3 = 2
            if (r0 != r3) goto L_0x000a
            r10 = 1
            goto L_0x000b
        L_0x000a:
            r10 = r1
        L_0x000b:
            java.lang.String r0 = r34.zzd()
            int r3 = r0.length()
            char r4 = r0.charAt(r1)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L_0x0027
            r4 = 1
        L_0x001d:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0028
            r4 = r6
            goto L_0x001d
        L_0x0027:
            r6 = 1
        L_0x0028:
            int r4 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0048
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0034:
            int r9 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0044
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r8
            r6 = r6 | r4
            int r8 = r8 + 13
            r4 = r9
            goto L_0x0034
        L_0x0044:
            int r4 = r4 << r8
            r6 = r6 | r4
            r4 = r9
            goto L_0x0049
        L_0x0048:
        L_0x0049:
            if (r6 != 0) goto L_0x0059
            int[] r6 = zza
            r8 = r1
            r9 = r8
            r11 = r9
            r12 = r11
            r14 = r12
            r16 = r14
            r13 = r6
            r6 = r16
            goto L_0x0178
        L_0x0059:
            int r6 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x0079
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = 13
        L_0x0065:
            int r9 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x0075
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r8
            r4 = r4 | r6
            int r8 = r8 + 13
            r6 = r9
            goto L_0x0065
        L_0x0075:
            int r6 = r6 << r8
            r4 = r4 | r6
            r6 = r9
            goto L_0x007a
        L_0x0079:
        L_0x007a:
            int r8 = r6 + 1
            char r6 = r0.charAt(r6)
            if (r6 < r5) goto L_0x009a
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0086:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x0096
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r6 = r6 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x0086
        L_0x0096:
            int r8 = r8 << r9
            r6 = r6 | r8
            r8 = r11
            goto L_0x009b
        L_0x009a:
        L_0x009b:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r5) goto L_0x00bb
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x00a7:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00b7
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x00a7
        L_0x00b7:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
            goto L_0x00bc
        L_0x00bb:
        L_0x00bc:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r5) goto L_0x00dc
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00c8:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00d8
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00c8
        L_0x00d8:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
            goto L_0x00dd
        L_0x00dc:
        L_0x00dd:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r5) goto L_0x00fd
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00e9:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x00f9
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00e9
        L_0x00f9:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
            goto L_0x00fe
        L_0x00fd:
        L_0x00fe:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r5) goto L_0x011e
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x010a:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x011a
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x010a
        L_0x011a:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
            goto L_0x011f
        L_0x011e:
        L_0x011f:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r5) goto L_0x0141
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x012b:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x013c
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x012b
        L_0x013c:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
            goto L_0x0142
        L_0x0141:
        L_0x0142:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r5) goto L_0x0166
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x014e:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r5) goto L_0x0160
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x014e
        L_0x0160:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
            goto L_0x0167
        L_0x0166:
        L_0x0167:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int[] r13 = new int[r13]
            int r16 = r4 + r4
            int r16 = r16 + r6
            r6 = r4
            r4 = r15
            r33 = r12
            r12 = r9
            r9 = r33
        L_0x0178:
            sun.misc.Unsafe r15 = zzb
            java.lang.Object[] r17 = r34.zze()
            com.google.android.gms.internal.firebase-auth-api.zzabc r18 = r34.zza()
            java.lang.Class r1 = r18.getClass()
            int r7 = r11 * 3
            int[] r7 = new int[r7]
            int r11 = r11 + r11
            java.lang.Object[] r11 = new java.lang.Object[r11]
            int r21 = r14 + r9
            r22 = r14
            r23 = r21
            r9 = 0
            r20 = 0
        L_0x0196:
            if (r4 >= r3) goto L_0x03e9
            int r24 = r4 + 1
            char r4 = r0.charAt(r4)
            if (r4 < r5) goto L_0x01be
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r2 = r24
            r24 = 13
        L_0x01a6:
            int r26 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01b8
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r24
            r4 = r4 | r2
            int r24 = r24 + 13
            r2 = r26
            goto L_0x01a6
        L_0x01b8:
            int r2 = r2 << r24
            r4 = r4 | r2
            r2 = r26
            goto L_0x01c0
        L_0x01be:
            r2 = r24
        L_0x01c0:
            int r24 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r5) goto L_0x01ed
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            r5 = r24
            r24 = 13
        L_0x01ce:
            int r27 = r5 + 1
            char r5 = r0.charAt(r5)
            r28 = r3
            r3 = 55296(0xd800, float:7.7486E-41)
            if (r5 < r3) goto L_0x01e7
            r3 = r5 & 8191(0x1fff, float:1.1478E-41)
            int r3 = r3 << r24
            r2 = r2 | r3
            int r24 = r24 + 13
            r5 = r27
            r3 = r28
            goto L_0x01ce
        L_0x01e7:
            int r3 = r5 << r24
            r2 = r2 | r3
            r3 = r27
            goto L_0x01f1
        L_0x01ed:
            r28 = r3
            r3 = r24
        L_0x01f1:
            r5 = r2 & 255(0xff, float:3.57E-43)
            r24 = r14
            r14 = r2 & 1024(0x400, float:1.435E-42)
            if (r14 == 0) goto L_0x01ff
            int r14 = r20 + 1
            r13[r20] = r9
            r20 = r14
        L_0x01ff:
            r14 = 51
            if (r5 < r14) goto L_0x02aa
            int r14 = r3 + 1
            char r3 = r0.charAt(r3)
            r27 = r14
            r14 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r14) goto L_0x0235
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r14 = r27
            r27 = 13
        L_0x0216:
            int r31 = r14 + 1
            char r14 = r0.charAt(r14)
            r32 = r12
            r12 = 55296(0xd800, float:7.7486E-41)
            if (r14 < r12) goto L_0x022f
            r12 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r27
            r3 = r3 | r12
            int r27 = r27 + 13
            r14 = r31
            r12 = r32
            goto L_0x0216
        L_0x022f:
            int r12 = r14 << r27
            r3 = r3 | r12
            r14 = r31
            goto L_0x0239
        L_0x0235:
            r32 = r12
            r14 = r27
        L_0x0239:
            int r12 = r5 + -51
            r27 = r14
            r14 = 9
            if (r12 == r14) goto L_0x025c
            r14 = 17
            if (r12 != r14) goto L_0x0246
            goto L_0x025c
        L_0x0246:
            r14 = 12
            if (r12 != r14) goto L_0x026b
            if (r10 != 0) goto L_0x026b
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
            r16 = r14
            goto L_0x026b
        L_0x025c:
            int r12 = r9 / 3
            int r14 = r16 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r16 = r17[r16]
            r11[r12] = r16
            r16 = r14
        L_0x026b:
            int r3 = r3 + r3
            r12 = r17[r3]
            boolean r14 = r12 instanceof java.lang.reflect.Field
            if (r14 == 0) goto L_0x0275
            java.lang.reflect.Field r12 = (java.lang.reflect.Field) r12
            goto L_0x027d
        L_0x0275:
            java.lang.String r12 = (java.lang.String) r12
            java.lang.reflect.Field r12 = zzI(r1, r12)
            r17[r3] = r12
        L_0x027d:
            r31 = r7
            r14 = r8
            long r7 = r15.objectFieldOffset(r12)
            int r7 = (int) r7
            int r3 = r3 + 1
            r8 = r17[r3]
            boolean r12 = r8 instanceof java.lang.reflect.Field
            if (r12 == 0) goto L_0x0290
            java.lang.reflect.Field r8 = (java.lang.reflect.Field) r8
            goto L_0x0298
        L_0x0290:
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = zzI(r1, r8)
            r17[r3] = r8
        L_0x0298:
            r3 = r7
            long r7 = r15.objectFieldOffset(r8)
            int r7 = (int) r7
            r30 = r0
            r8 = r1
            r0 = r7
            r29 = r11
            r25 = 1
            r7 = r3
            r3 = 0
            goto L_0x03b0
        L_0x02aa:
            r31 = r7
            r14 = r8
            r32 = r12
            int r7 = r16 + 1
            r8 = r17[r16]
            java.lang.String r8 = (java.lang.String) r8
            java.lang.reflect.Field r8 = zzI(r1, r8)
            r12 = 9
            if (r5 == r12) goto L_0x0329
            r12 = 17
            if (r5 != r12) goto L_0x02c5
            r25 = 1
            goto L_0x032b
        L_0x02c5:
            r12 = 27
            if (r5 == r12) goto L_0x0319
            r12 = 49
            if (r5 != r12) goto L_0x02ce
            goto L_0x0319
        L_0x02ce:
            r12 = 12
            if (r5 == r12) goto L_0x0304
            r12 = 30
            if (r5 == r12) goto L_0x0304
            r12 = 44
            if (r5 != r12) goto L_0x02db
            goto L_0x0304
        L_0x02db:
            r12 = 50
            if (r5 != r12) goto L_0x0303
            int r12 = r22 + 1
            r13[r22] = r9
            int r22 = r9 / 3
            int r22 = r22 + r22
            int r27 = r7 + 1
            r7 = r17[r7]
            r11[r22] = r7
            r7 = r2 & 2048(0x800, float:2.87E-42)
            if (r7 == 0) goto L_0x02fc
            int r7 = r27 + 1
            int r22 = r22 + 1
            r27 = r17[r27]
            r11[r22] = r27
            r22 = r12
            goto L_0x0300
        L_0x02fc:
            r22 = r12
            r7 = r27
        L_0x0300:
            r25 = 1
            goto L_0x0336
        L_0x0303:
            goto L_0x0300
        L_0x0304:
            if (r10 != 0) goto L_0x0318
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
            r7 = r27
        L_0x0315:
            r25 = 1
            goto L_0x0336
        L_0x0318:
            goto L_0x0315
        L_0x0319:
            int r12 = r9 / 3
            int r27 = r7 + 1
            int r12 = r12 + r12
            r25 = 1
            int r12 = r12 + 1
            r7 = r17[r7]
            r11[r12] = r7
            r7 = r27
            goto L_0x0336
        L_0x0329:
            r25 = 1
        L_0x032b:
            int r12 = r9 / 3
            int r12 = r12 + r12
            int r12 = r12 + 1
            java.lang.Class r27 = r8.getType()
            r11[r12] = r27
        L_0x0336:
            r12 = r7
            long r7 = r15.objectFieldOffset(r8)
            int r7 = (int) r7
            r8 = r2 & 4096(0x1000, float:5.74E-42)
            r27 = 1048575(0xfffff, float:1.469367E-39)
            r29 = r11
            r11 = 4096(0x1000, float:5.74E-42)
            if (r8 != r11) goto L_0x0394
            r8 = 17
            if (r5 > r8) goto L_0x0394
            int r8 = r3 + 1
            char r3 = r0.charAt(r3)
            r11 = 55296(0xd800, float:7.7486E-41)
            if (r3 < r11) goto L_0x0370
            r3 = r3 & 8191(0x1fff, float:1.1478E-41)
            r26 = 13
        L_0x035a:
            int r27 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r11) goto L_0x036c
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r26
            r3 = r3 | r8
            int r26 = r26 + 13
            r8 = r27
            goto L_0x035a
        L_0x036c:
            int r8 = r8 << r26
            r3 = r3 | r8
            goto L_0x0372
        L_0x0370:
            r27 = r8
        L_0x0372:
            int r8 = r6 + r6
            int r26 = r3 / 32
            int r8 = r8 + r26
            r11 = r17[r8]
            r30 = r0
            boolean r0 = r11 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0383
            java.lang.reflect.Field r11 = (java.lang.reflect.Field) r11
            goto L_0x038b
        L_0x0383:
            java.lang.String r11 = (java.lang.String) r11
            java.lang.reflect.Field r11 = zzI(r1, r11)
            r17[r8] = r11
        L_0x038b:
            r8 = r1
            long r0 = r15.objectFieldOffset(r11)
            int r0 = (int) r0
            int r3 = r3 % 32
            goto L_0x039c
        L_0x0394:
            r30 = r0
            r8 = r1
            r0 = r27
            r27 = r3
            r3 = 0
        L_0x039c:
            r1 = 18
            if (r5 < r1) goto L_0x03ad
            r1 = 49
            if (r5 > r1) goto L_0x03ad
            int r1 = r23 + 1
            r13[r23] = r7
            r23 = r1
            r16 = r12
            goto L_0x03b0
        L_0x03ad:
            r16 = r12
        L_0x03b0:
            int r1 = r9 + 1
            r31[r9] = r4
            int r4 = r1 + 1
            r9 = r2 & 512(0x200, float:7.175E-43)
            if (r9 == 0) goto L_0x03bd
            r9 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03be
        L_0x03bd:
            r9 = 0
        L_0x03be:
            r2 = r2 & 256(0x100, float:3.59E-43)
            if (r2 == 0) goto L_0x03c5
            r2 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03c6
        L_0x03c5:
            r2 = 0
        L_0x03c6:
            r2 = r2 | r9
            int r5 = r5 << 20
            r2 = r2 | r5
            r2 = r2 | r7
            r31[r1] = r2
            int r9 = r4 + 1
            int r1 = r3 << 20
            r0 = r0 | r1
            r31[r4] = r0
            r1 = r8
            r8 = r14
            r14 = r24
            r4 = r27
            r3 = r28
            r11 = r29
            r0 = r30
            r7 = r31
            r12 = r32
            r5 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0196
        L_0x03e9:
            r31 = r7
            r29 = r11
            r32 = r12
            r24 = r14
            r14 = r8
            com.google.android.gms.internal.firebase-auth-api.zzabf r0 = new com.google.android.gms.internal.firebase-auth-api.zzabf
            r4 = r0
            com.google.android.gms.internal.firebase-auth-api.zzabc r9 = r34.zza()
            r11 = 0
            r1 = r29
            r20 = 0
            r5 = r31
            r6 = r1
            r7 = r14
            r8 = r32
            r12 = r13
            r13 = r24
            r14 = r21
            r15 = r35
            r16 = r36
            r17 = r37
            r18 = r38
            r19 = r39
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzabf.zzm(com.google.android.gms.internal.firebase-auth-api.zzabm, com.google.android.gms.internal.firebase-auth-api.zzabh, com.google.android.gms.internal.firebase-auth-api.zzaaq, com.google.android.gms.internal.firebase-auth-api.zzacf, com.google.android.gms.internal.firebase-auth-api.zzzl, com.google.android.gms.internal.firebase-auth-api.zzaax):com.google.android.gms.internal.firebase-auth-api.zzabf");
    }

    private static double zzo(Object obj, long j) {
        return ((Double) zzacp.zzf(obj, j)).doubleValue();
    }

    private static float zzp(Object obj, long j) {
        return ((Float) zzacp.zzf(obj, j)).floatValue();
    }

    private final int zzq(Object obj) {
        int i;
        Object obj2 = obj;
        Unsafe unsafe = zzb;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (i4 < this.zzc.length) {
            int zzC = zzC(i4);
            int[] iArr = this.zzc;
            int i7 = iArr[i4];
            int zzB = zzB(zzC);
            if (zzB <= 17) {
                int i8 = iArr[i4 + 2];
                int i9 = i8 & i2;
                i = 1 << (i8 >>> 20);
                if (i9 != i3) {
                    i6 = unsafe.getInt(obj2, (long) i9);
                    i3 = i9;
                }
            } else {
                i = 0;
            }
            long j = (long) (zzC & i2);
            switch (zzB) {
                case 0:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        i5 += zzzf.zzE(i7 << 3) + 8;
                        break;
                    }
                case 1:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        i5 += zzzf.zzE(i7 << 3) + 4;
                        break;
                    }
                case 2:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        i5 += zzzf.zzE(i7 << 3) + zzzf.zzF(unsafe.getLong(obj2, j));
                        break;
                    }
                case 3:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        i5 += zzzf.zzE(i7 << 3) + zzzf.zzF(unsafe.getLong(obj2, j));
                        break;
                    }
                case 4:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        i5 += zzzf.zzE(i7 << 3) + zzzf.zzy(unsafe.getInt(obj2, j));
                        break;
                    }
                case 5:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        i5 += zzzf.zzE(i7 << 3) + 8;
                        break;
                    }
                case 6:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        i5 += zzzf.zzE(i7 << 3) + 4;
                        break;
                    }
                case 7:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        i5 += zzzf.zzE(i7 << 3) + 1;
                        break;
                    }
                case 8:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        Object object = unsafe.getObject(obj2, j);
                        if (!(object instanceof zzyu)) {
                            i5 += zzzf.zzE(i7 << 3) + zzzf.zzC((String) object);
                            break;
                        } else {
                            int zzE = zzzf.zzE(i7 << 3);
                            int zzd2 = ((zzyu) object).zzd();
                            i5 += zzE + zzzf.zzE(zzd2) + zzd2;
                            break;
                        }
                    }
                case 9:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        i5 += zzabq.zzo(i7, unsafe.getObject(obj2, j), zzF(i4));
                        break;
                    }
                case 10:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        int zzE2 = zzzf.zzE(i7 << 3);
                        int zzd3 = ((zzyu) unsafe.getObject(obj2, j)).zzd();
                        i5 += zzE2 + zzzf.zzE(zzd3) + zzd3;
                        break;
                    }
                case 11:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        i5 += zzzf.zzE(i7 << 3) + zzzf.zzE(unsafe.getInt(obj2, j));
                        break;
                    }
                case 12:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        i5 += zzzf.zzE(i7 << 3) + zzzf.zzy(unsafe.getInt(obj2, j));
                        break;
                    }
                case 13:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        i5 += zzzf.zzE(i7 << 3) + 4;
                        break;
                    }
                case 14:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        i5 += zzzf.zzE(i7 << 3) + 8;
                        break;
                    }
                case 15:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        int i10 = unsafe.getInt(obj2, j);
                        i5 += zzzf.zzE(i7 << 3) + zzzf.zzE((i10 >> 31) ^ (i10 + i10));
                        break;
                    }
                case 16:
                    if ((i & i6) == 0) {
                        break;
                    } else {
                        long j2 = unsafe.getLong(obj2, j);
                        i5 += zzzf.zzE(i7 << 3) + zzzf.zzF((j2 >> 63) ^ (j2 + j2));
                        break;
                    }
                case 17:
                    if ((i6 & i) == 0) {
                        break;
                    } else {
                        i5 += zzzf.zzx(i7, (zzabc) unsafe.getObject(obj2, j), zzF(i4));
                        break;
                    }
                case 18:
                    i5 += zzabq.zzh(i7, (List) unsafe.getObject(obj2, j), false);
                    break;
                case 19:
                    i5 += zzabq.zzf(i7, (List) unsafe.getObject(obj2, j), false);
                    break;
                case 20:
                    i5 += zzabq.zzm(i7, (List) unsafe.getObject(obj2, j), false);
                    break;
                case 21:
                    i5 += zzabq.zzx(i7, (List) unsafe.getObject(obj2, j), false);
                    break;
                case 22:
                    i5 += zzabq.zzk(i7, (List) unsafe.getObject(obj2, j), false);
                    break;
                case 23:
                    i5 += zzabq.zzh(i7, (List) unsafe.getObject(obj2, j), false);
                    break;
                case 24:
                    i5 += zzabq.zzf(i7, (List) unsafe.getObject(obj2, j), false);
                    break;
                case 25:
                    i5 += zzabq.zza(i7, (List) unsafe.getObject(obj2, j), false);
                    break;
                case 26:
                    i5 += zzabq.zzu(i7, (List) unsafe.getObject(obj2, j));
                    break;
                case 27:
                    i5 += zzabq.zzp(i7, (List) unsafe.getObject(obj2, j), zzF(i4));
                    break;
                case 28:
                    i5 += zzabq.zzc(i7, (List) unsafe.getObject(obj2, j));
                    break;
                case 29:
                    i5 += zzabq.zzv(i7, (List) unsafe.getObject(obj2, j), false);
                    break;
                case 30:
                    i5 += zzabq.zzd(i7, (List) unsafe.getObject(obj2, j), false);
                    break;
                case 31:
                    i5 += zzabq.zzf(i7, (List) unsafe.getObject(obj2, j), false);
                    break;
                case 32:
                    i5 += zzabq.zzh(i7, (List) unsafe.getObject(obj2, j), false);
                    break;
                case 33:
                    i5 += zzabq.zzq(i7, (List) unsafe.getObject(obj2, j), false);
                    break;
                case 34:
                    i5 += zzabq.zzs(i7, (List) unsafe.getObject(obj2, j), false);
                    break;
                case 35:
                    int zzi2 = zzabq.zzi((List) unsafe.getObject(obj2, j));
                    if (zzi2 <= 0) {
                        break;
                    } else {
                        i5 += zzzf.zzD(i7) + zzzf.zzE(zzi2) + zzi2;
                        break;
                    }
                case 36:
                    int zzg2 = zzabq.zzg((List) unsafe.getObject(obj2, j));
                    if (zzg2 <= 0) {
                        break;
                    } else {
                        i5 += zzzf.zzD(i7) + zzzf.zzE(zzg2) + zzg2;
                        break;
                    }
                case 37:
                    int zzn2 = zzabq.zzn((List) unsafe.getObject(obj2, j));
                    if (zzn2 <= 0) {
                        break;
                    } else {
                        i5 += zzzf.zzD(i7) + zzzf.zzE(zzn2) + zzn2;
                        break;
                    }
                case 38:
                    int zzy = zzabq.zzy((List) unsafe.getObject(obj2, j));
                    if (zzy <= 0) {
                        break;
                    } else {
                        i5 += zzzf.zzD(i7) + zzzf.zzE(zzy) + zzy;
                        break;
                    }
                case 39:
                    int zzl2 = zzabq.zzl((List) unsafe.getObject(obj2, j));
                    if (zzl2 <= 0) {
                        break;
                    } else {
                        i5 += zzzf.zzD(i7) + zzzf.zzE(zzl2) + zzl2;
                        break;
                    }
                case 40:
                    int zzi3 = zzabq.zzi((List) unsafe.getObject(obj2, j));
                    if (zzi3 <= 0) {
                        break;
                    } else {
                        i5 += zzzf.zzD(i7) + zzzf.zzE(zzi3) + zzi3;
                        break;
                    }
                case 41:
                    int zzg3 = zzabq.zzg((List) unsafe.getObject(obj2, j));
                    if (zzg3 <= 0) {
                        break;
                    } else {
                        i5 += zzzf.zzD(i7) + zzzf.zzE(zzg3) + zzg3;
                        break;
                    }
                case 42:
                    int zzb2 = zzabq.zzb((List) unsafe.getObject(obj2, j));
                    if (zzb2 <= 0) {
                        break;
                    } else {
                        i5 += zzzf.zzD(i7) + zzzf.zzE(zzb2) + zzb2;
                        break;
                    }
                case 43:
                    int zzw = zzabq.zzw((List) unsafe.getObject(obj2, j));
                    if (zzw <= 0) {
                        break;
                    } else {
                        i5 += zzzf.zzD(i7) + zzzf.zzE(zzw) + zzw;
                        break;
                    }
                case 44:
                    int zze2 = zzabq.zze((List) unsafe.getObject(obj2, j));
                    if (zze2 <= 0) {
                        break;
                    } else {
                        i5 += zzzf.zzD(i7) + zzzf.zzE(zze2) + zze2;
                        break;
                    }
                case 45:
                    int zzg4 = zzabq.zzg((List) unsafe.getObject(obj2, j));
                    if (zzg4 <= 0) {
                        break;
                    } else {
                        i5 += zzzf.zzD(i7) + zzzf.zzE(zzg4) + zzg4;
                        break;
                    }
                case 46:
                    int zzi4 = zzabq.zzi((List) unsafe.getObject(obj2, j));
                    if (zzi4 <= 0) {
                        break;
                    } else {
                        i5 += zzzf.zzD(i7) + zzzf.zzE(zzi4) + zzi4;
                        break;
                    }
                case 47:
                    int zzr2 = zzabq.zzr((List) unsafe.getObject(obj2, j));
                    if (zzr2 <= 0) {
                        break;
                    } else {
                        i5 += zzzf.zzD(i7) + zzzf.zzE(zzr2) + zzr2;
                        break;
                    }
                case 48:
                    int zzt = zzabq.zzt((List) unsafe.getObject(obj2, j));
                    if (zzt <= 0) {
                        break;
                    } else {
                        i5 += zzzf.zzD(i7) + zzzf.zzE(zzt) + zzt;
                        break;
                    }
                case 49:
                    i5 += zzabq.zzj(i7, (List) unsafe.getObject(obj2, j), zzF(i4));
                    break;
                case 50:
                    zzaax.zza(i7, unsafe.getObject(obj2, j), zzH(i4));
                    break;
                case 51:
                    if (!zzT(obj2, i7, i4)) {
                        break;
                    } else {
                        i5 += zzzf.zzE(i7 << 3) + 8;
                        break;
                    }
                case 52:
                    if (!zzT(obj2, i7, i4)) {
                        break;
                    } else {
                        i5 += zzzf.zzE(i7 << 3) + 4;
                        break;
                    }
                case 53:
                    if (!zzT(obj2, i7, i4)) {
                        break;
                    } else {
                        i5 += zzzf.zzE(i7 << 3) + zzzf.zzF(zzD(obj2, j));
                        break;
                    }
                case 54:
                    if (!zzT(obj2, i7, i4)) {
                        break;
                    } else {
                        i5 += zzzf.zzE(i7 << 3) + zzzf.zzF(zzD(obj2, j));
                        break;
                    }
                case 55:
                    if (!zzT(obj2, i7, i4)) {
                        break;
                    } else {
                        i5 += zzzf.zzE(i7 << 3) + zzzf.zzy(zzs(obj2, j));
                        break;
                    }
                case 56:
                    if (!zzT(obj2, i7, i4)) {
                        break;
                    } else {
                        i5 += zzzf.zzE(i7 << 3) + 8;
                        break;
                    }
                case 57:
                    if (!zzT(obj2, i7, i4)) {
                        break;
                    } else {
                        i5 += zzzf.zzE(i7 << 3) + 4;
                        break;
                    }
                case 58:
                    if (!zzT(obj2, i7, i4)) {
                        break;
                    } else {
                        i5 += zzzf.zzE(i7 << 3) + 1;
                        break;
                    }
                case 59:
                    if (!zzT(obj2, i7, i4)) {
                        break;
                    } else {
                        Object object2 = unsafe.getObject(obj2, j);
                        if (!(object2 instanceof zzyu)) {
                            i5 += zzzf.zzE(i7 << 3) + zzzf.zzC((String) object2);
                            break;
                        } else {
                            int zzE3 = zzzf.zzE(i7 << 3);
                            int zzd4 = ((zzyu) object2).zzd();
                            i5 += zzE3 + zzzf.zzE(zzd4) + zzd4;
                            break;
                        }
                    }
                case 60:
                    if (!zzT(obj2, i7, i4)) {
                        break;
                    } else {
                        i5 += zzabq.zzo(i7, unsafe.getObject(obj2, j), zzF(i4));
                        break;
                    }
                case 61:
                    if (!zzT(obj2, i7, i4)) {
                        break;
                    } else {
                        int zzE4 = zzzf.zzE(i7 << 3);
                        int zzd5 = ((zzyu) unsafe.getObject(obj2, j)).zzd();
                        i5 += zzE4 + zzzf.zzE(zzd5) + zzd5;
                        break;
                    }
                case 62:
                    if (!zzT(obj2, i7, i4)) {
                        break;
                    } else {
                        i5 += zzzf.zzE(i7 << 3) + zzzf.zzE(zzs(obj2, j));
                        break;
                    }
                case 63:
                    if (!zzT(obj2, i7, i4)) {
                        break;
                    } else {
                        i5 += zzzf.zzE(i7 << 3) + zzzf.zzy(zzs(obj2, j));
                        break;
                    }
                case 64:
                    if (!zzT(obj2, i7, i4)) {
                        break;
                    } else {
                        i5 += zzzf.zzE(i7 << 3) + 4;
                        break;
                    }
                case 65:
                    if (!zzT(obj2, i7, i4)) {
                        break;
                    } else {
                        i5 += zzzf.zzE(i7 << 3) + 8;
                        break;
                    }
                case 66:
                    if (!zzT(obj2, i7, i4)) {
                        break;
                    } else {
                        int zzs = zzs(obj2, j);
                        i5 += zzzf.zzE(i7 << 3) + zzzf.zzE((zzs >> 31) ^ (zzs + zzs));
                        break;
                    }
                case 67:
                    if (!zzT(obj2, i7, i4)) {
                        break;
                    } else {
                        long zzD = zzD(obj2, j);
                        i5 += zzzf.zzE(i7 << 3) + zzzf.zzF((zzD >> 63) ^ (zzD + zzD));
                        break;
                    }
                case 68:
                    if (!zzT(obj2, i7, i4)) {
                        break;
                    } else {
                        i5 += zzzf.zzx(i7, (zzabc) unsafe.getObject(obj2, j), zzF(i4));
                        break;
                    }
            }
            i4 += 3;
            i2 = 1048575;
        }
        zzacf zzacf = this.zzo;
        int zza2 = i5 + zzacf.zza(zzacf.zzd(obj2));
        if (!this.zzh) {
            return zza2;
        }
        this.zzp.zza(obj2);
        throw null;
    }

    private final int zzr(Object obj) {
        Unsafe unsafe = zzb;
        int i = 0;
        for (int i2 = 0; i2 < this.zzc.length; i2 += 3) {
            int zzC = zzC(i2);
            int zzB = zzB(zzC);
            int i3 = this.zzc[i2];
            long j = (long) (zzC & 1048575);
            if (zzB >= zzzq.DOUBLE_LIST_PACKED.zza() && zzB <= zzzq.SINT64_LIST_PACKED.zza()) {
                int i4 = this.zzc[i2 + 2];
            }
            switch (zzB) {
                case 0:
                    if (!zzQ(obj, i2)) {
                        break;
                    } else {
                        i += zzzf.zzE(i3 << 3) + 8;
                        break;
                    }
                case 1:
                    if (!zzQ(obj, i2)) {
                        break;
                    } else {
                        i += zzzf.zzE(i3 << 3) + 4;
                        break;
                    }
                case 2:
                    if (!zzQ(obj, i2)) {
                        break;
                    } else {
                        i += zzzf.zzE(i3 << 3) + zzzf.zzF(zzacp.zzd(obj, j));
                        break;
                    }
                case 3:
                    if (!zzQ(obj, i2)) {
                        break;
                    } else {
                        i += zzzf.zzE(i3 << 3) + zzzf.zzF(zzacp.zzd(obj, j));
                        break;
                    }
                case 4:
                    if (!zzQ(obj, i2)) {
                        break;
                    } else {
                        i += zzzf.zzE(i3 << 3) + zzzf.zzy(zzacp.zzc(obj, j));
                        break;
                    }
                case 5:
                    if (!zzQ(obj, i2)) {
                        break;
                    } else {
                        i += zzzf.zzE(i3 << 3) + 8;
                        break;
                    }
                case 6:
                    if (!zzQ(obj, i2)) {
                        break;
                    } else {
                        i += zzzf.zzE(i3 << 3) + 4;
                        break;
                    }
                case 7:
                    if (!zzQ(obj, i2)) {
                        break;
                    } else {
                        i += zzzf.zzE(i3 << 3) + 1;
                        break;
                    }
                case 8:
                    if (!zzQ(obj, i2)) {
                        break;
                    } else {
                        Object zzf2 = zzacp.zzf(obj, j);
                        if (!(zzf2 instanceof zzyu)) {
                            i += zzzf.zzE(i3 << 3) + zzzf.zzC((String) zzf2);
                            break;
                        } else {
                            int zzE = zzzf.zzE(i3 << 3);
                            int zzd2 = ((zzyu) zzf2).zzd();
                            i += zzE + zzzf.zzE(zzd2) + zzd2;
                            break;
                        }
                    }
                case 9:
                    if (!zzQ(obj, i2)) {
                        break;
                    } else {
                        i += zzabq.zzo(i3, zzacp.zzf(obj, j), zzF(i2));
                        break;
                    }
                case 10:
                    if (!zzQ(obj, i2)) {
                        break;
                    } else {
                        int zzE2 = zzzf.zzE(i3 << 3);
                        int zzd3 = ((zzyu) zzacp.zzf(obj, j)).zzd();
                        i += zzE2 + zzzf.zzE(zzd3) + zzd3;
                        break;
                    }
                case 11:
                    if (!zzQ(obj, i2)) {
                        break;
                    } else {
                        i += zzzf.zzE(i3 << 3) + zzzf.zzE(zzacp.zzc(obj, j));
                        break;
                    }
                case 12:
                    if (!zzQ(obj, i2)) {
                        break;
                    } else {
                        i += zzzf.zzE(i3 << 3) + zzzf.zzy(zzacp.zzc(obj, j));
                        break;
                    }
                case 13:
                    if (!zzQ(obj, i2)) {
                        break;
                    } else {
                        i += zzzf.zzE(i3 << 3) + 4;
                        break;
                    }
                case 14:
                    if (!zzQ(obj, i2)) {
                        break;
                    } else {
                        i += zzzf.zzE(i3 << 3) + 8;
                        break;
                    }
                case 15:
                    if (!zzQ(obj, i2)) {
                        break;
                    } else {
                        int zzc2 = zzacp.zzc(obj, j);
                        i += zzzf.zzE(i3 << 3) + zzzf.zzE((zzc2 >> 31) ^ (zzc2 + zzc2));
                        break;
                    }
                case 16:
                    if (!zzQ(obj, i2)) {
                        break;
                    } else {
                        long zzd4 = zzacp.zzd(obj, j);
                        i += zzzf.zzE(i3 << 3) + zzzf.zzF((zzd4 >> 63) ^ (zzd4 + zzd4));
                        break;
                    }
                case 17:
                    if (!zzQ(obj, i2)) {
                        break;
                    } else {
                        i += zzzf.zzx(i3, (zzabc) zzacp.zzf(obj, j), zzF(i2));
                        break;
                    }
                case 18:
                    i += zzabq.zzh(i3, (List) zzacp.zzf(obj, j), false);
                    break;
                case 19:
                    i += zzabq.zzf(i3, (List) zzacp.zzf(obj, j), false);
                    break;
                case 20:
                    i += zzabq.zzm(i3, (List) zzacp.zzf(obj, j), false);
                    break;
                case 21:
                    i += zzabq.zzx(i3, (List) zzacp.zzf(obj, j), false);
                    break;
                case 22:
                    i += zzabq.zzk(i3, (List) zzacp.zzf(obj, j), false);
                    break;
                case 23:
                    i += zzabq.zzh(i3, (List) zzacp.zzf(obj, j), false);
                    break;
                case 24:
                    i += zzabq.zzf(i3, (List) zzacp.zzf(obj, j), false);
                    break;
                case 25:
                    i += zzabq.zza(i3, (List) zzacp.zzf(obj, j), false);
                    break;
                case 26:
                    i += zzabq.zzu(i3, (List) zzacp.zzf(obj, j));
                    break;
                case 27:
                    i += zzabq.zzp(i3, (List) zzacp.zzf(obj, j), zzF(i2));
                    break;
                case 28:
                    i += zzabq.zzc(i3, (List) zzacp.zzf(obj, j));
                    break;
                case 29:
                    i += zzabq.zzv(i3, (List) zzacp.zzf(obj, j), false);
                    break;
                case 30:
                    i += zzabq.zzd(i3, (List) zzacp.zzf(obj, j), false);
                    break;
                case 31:
                    i += zzabq.zzf(i3, (List) zzacp.zzf(obj, j), false);
                    break;
                case 32:
                    i += zzabq.zzh(i3, (List) zzacp.zzf(obj, j), false);
                    break;
                case 33:
                    i += zzabq.zzq(i3, (List) zzacp.zzf(obj, j), false);
                    break;
                case 34:
                    i += zzabq.zzs(i3, (List) zzacp.zzf(obj, j), false);
                    break;
                case 35:
                    int zzi2 = zzabq.zzi((List) unsafe.getObject(obj, j));
                    if (zzi2 <= 0) {
                        break;
                    } else {
                        i += zzzf.zzD(i3) + zzzf.zzE(zzi2) + zzi2;
                        break;
                    }
                case 36:
                    int zzg2 = zzabq.zzg((List) unsafe.getObject(obj, j));
                    if (zzg2 <= 0) {
                        break;
                    } else {
                        i += zzzf.zzD(i3) + zzzf.zzE(zzg2) + zzg2;
                        break;
                    }
                case 37:
                    int zzn2 = zzabq.zzn((List) unsafe.getObject(obj, j));
                    if (zzn2 <= 0) {
                        break;
                    } else {
                        i += zzzf.zzD(i3) + zzzf.zzE(zzn2) + zzn2;
                        break;
                    }
                case 38:
                    int zzy = zzabq.zzy((List) unsafe.getObject(obj, j));
                    if (zzy <= 0) {
                        break;
                    } else {
                        i += zzzf.zzD(i3) + zzzf.zzE(zzy) + zzy;
                        break;
                    }
                case 39:
                    int zzl2 = zzabq.zzl((List) unsafe.getObject(obj, j));
                    if (zzl2 <= 0) {
                        break;
                    } else {
                        i += zzzf.zzD(i3) + zzzf.zzE(zzl2) + zzl2;
                        break;
                    }
                case 40:
                    int zzi3 = zzabq.zzi((List) unsafe.getObject(obj, j));
                    if (zzi3 <= 0) {
                        break;
                    } else {
                        i += zzzf.zzD(i3) + zzzf.zzE(zzi3) + zzi3;
                        break;
                    }
                case 41:
                    int zzg3 = zzabq.zzg((List) unsafe.getObject(obj, j));
                    if (zzg3 <= 0) {
                        break;
                    } else {
                        i += zzzf.zzD(i3) + zzzf.zzE(zzg3) + zzg3;
                        break;
                    }
                case 42:
                    int zzb2 = zzabq.zzb((List) unsafe.getObject(obj, j));
                    if (zzb2 <= 0) {
                        break;
                    } else {
                        i += zzzf.zzD(i3) + zzzf.zzE(zzb2) + zzb2;
                        break;
                    }
                case 43:
                    int zzw = zzabq.zzw((List) unsafe.getObject(obj, j));
                    if (zzw <= 0) {
                        break;
                    } else {
                        i += zzzf.zzD(i3) + zzzf.zzE(zzw) + zzw;
                        break;
                    }
                case 44:
                    int zze2 = zzabq.zze((List) unsafe.getObject(obj, j));
                    if (zze2 <= 0) {
                        break;
                    } else {
                        i += zzzf.zzD(i3) + zzzf.zzE(zze2) + zze2;
                        break;
                    }
                case 45:
                    int zzg4 = zzabq.zzg((List) unsafe.getObject(obj, j));
                    if (zzg4 <= 0) {
                        break;
                    } else {
                        i += zzzf.zzD(i3) + zzzf.zzE(zzg4) + zzg4;
                        break;
                    }
                case 46:
                    int zzi4 = zzabq.zzi((List) unsafe.getObject(obj, j));
                    if (zzi4 <= 0) {
                        break;
                    } else {
                        i += zzzf.zzD(i3) + zzzf.zzE(zzi4) + zzi4;
                        break;
                    }
                case 47:
                    int zzr2 = zzabq.zzr((List) unsafe.getObject(obj, j));
                    if (zzr2 <= 0) {
                        break;
                    } else {
                        i += zzzf.zzD(i3) + zzzf.zzE(zzr2) + zzr2;
                        break;
                    }
                case 48:
                    int zzt = zzabq.zzt((List) unsafe.getObject(obj, j));
                    if (zzt <= 0) {
                        break;
                    } else {
                        i += zzzf.zzD(i3) + zzzf.zzE(zzt) + zzt;
                        break;
                    }
                case 49:
                    i += zzabq.zzj(i3, (List) zzacp.zzf(obj, j), zzF(i2));
                    break;
                case 50:
                    zzaax.zza(i3, zzacp.zzf(obj, j), zzH(i2));
                    break;
                case 51:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i += zzzf.zzE(i3 << 3) + 8;
                        break;
                    }
                case 52:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i += zzzf.zzE(i3 << 3) + 4;
                        break;
                    }
                case 53:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i += zzzf.zzE(i3 << 3) + zzzf.zzF(zzD(obj, j));
                        break;
                    }
                case 54:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i += zzzf.zzE(i3 << 3) + zzzf.zzF(zzD(obj, j));
                        break;
                    }
                case 55:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i += zzzf.zzE(i3 << 3) + zzzf.zzy(zzs(obj, j));
                        break;
                    }
                case 56:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i += zzzf.zzE(i3 << 3) + 8;
                        break;
                    }
                case 57:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i += zzzf.zzE(i3 << 3) + 4;
                        break;
                    }
                case 58:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i += zzzf.zzE(i3 << 3) + 1;
                        break;
                    }
                case 59:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        Object zzf3 = zzacp.zzf(obj, j);
                        if (!(zzf3 instanceof zzyu)) {
                            i += zzzf.zzE(i3 << 3) + zzzf.zzC((String) zzf3);
                            break;
                        } else {
                            int zzE3 = zzzf.zzE(i3 << 3);
                            int zzd5 = ((zzyu) zzf3).zzd();
                            i += zzE3 + zzzf.zzE(zzd5) + zzd5;
                            break;
                        }
                    }
                case 60:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i += zzabq.zzo(i3, zzacp.zzf(obj, j), zzF(i2));
                        break;
                    }
                case 61:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        int zzE4 = zzzf.zzE(i3 << 3);
                        int zzd6 = ((zzyu) zzacp.zzf(obj, j)).zzd();
                        i += zzE4 + zzzf.zzE(zzd6) + zzd6;
                        break;
                    }
                case 62:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i += zzzf.zzE(i3 << 3) + zzzf.zzE(zzs(obj, j));
                        break;
                    }
                case 63:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i += zzzf.zzE(i3 << 3) + zzzf.zzy(zzs(obj, j));
                        break;
                    }
                case 64:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i += zzzf.zzE(i3 << 3) + 4;
                        break;
                    }
                case 65:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i += zzzf.zzE(i3 << 3) + 8;
                        break;
                    }
                case 66:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        int zzs = zzs(obj, j);
                        i += zzzf.zzE(i3 << 3) + zzzf.zzE((zzs >> 31) ^ (zzs + zzs));
                        break;
                    }
                case 67:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        long zzD = zzD(obj, j);
                        i += zzzf.zzE(i3 << 3) + zzzf.zzF((zzD >> 63) ^ (zzD + zzD));
                        break;
                    }
                case 68:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i += zzzf.zzx(i3, (zzabc) zzacp.zzf(obj, j), zzF(i2));
                        break;
                    }
            }
        }
        zzacf zzacf = this.zzo;
        return i + zzacf.zza(zzacf.zzd(obj));
    }

    private static int zzs(Object obj, long j) {
        return ((Integer) zzacp.zzf(obj, j)).intValue();
    }

    private final int zzt(Object obj, byte[] bArr, int i, int i2, int i3, long j, zzyh zzyh) throws IOException {
        Unsafe unsafe = zzb;
        Object zzH = zzH(i3);
        Object object = unsafe.getObject(obj, j);
        if (zzaax.zzb(object)) {
            zzaaw zzb2 = zzaaw.zza().zzb();
            zzaax.zzc(zzb2, object);
            unsafe.putObject(obj, j, zzb2);
        }
        zzaav zzaav = (zzaav) zzH;
        throw null;
    }

    private final int zzu(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zzyh zzyh) throws IOException {
        boolean z;
        Object obj2;
        Object obj3;
        Object obj4 = obj;
        byte[] bArr2 = bArr;
        int i9 = i;
        int i10 = i3;
        int i11 = i4;
        int i12 = i5;
        long j2 = j;
        int i13 = i8;
        zzyh zzyh2 = zzyh;
        Unsafe unsafe = zzb;
        long j3 = (long) (this.zzc[i13 + 2] & 1048575);
        switch (i7) {
            case 51:
                if (i12 == 1) {
                    unsafe.putObject(obj4, j2, Double.valueOf(Double.longBitsToDouble(zzyi.zzn(bArr, i))));
                    unsafe.putInt(obj4, j3, i11);
                    return i9 + 8;
                }
                break;
            case 52:
                if (i12 == 5) {
                    unsafe.putObject(obj4, j2, Float.valueOf(Float.intBitsToFloat(zzyi.zzb(bArr, i))));
                    unsafe.putInt(obj4, j3, i11);
                    return i9 + 4;
                }
                break;
            case 53:
            case 54:
                if (i12 == 0) {
                    int zzm2 = zzyi.zzm(bArr2, i9, zzyh2);
                    unsafe.putObject(obj4, j2, Long.valueOf(zzyh2.zzb));
                    unsafe.putInt(obj4, j3, i11);
                    return zzm2;
                }
                break;
            case 55:
            case 62:
                if (i12 == 0) {
                    int zzj2 = zzyi.zzj(bArr2, i9, zzyh2);
                    unsafe.putObject(obj4, j2, Integer.valueOf(zzyh2.zza));
                    unsafe.putInt(obj4, j3, i11);
                    return zzj2;
                }
                break;
            case 56:
            case 65:
                if (i12 == 1) {
                    unsafe.putObject(obj4, j2, Long.valueOf(zzyi.zzn(bArr, i)));
                    unsafe.putInt(obj4, j3, i11);
                    return i9 + 8;
                }
                break;
            case 57:
            case 64:
                if (i12 == 5) {
                    unsafe.putObject(obj4, j2, Integer.valueOf(zzyi.zzb(bArr, i)));
                    unsafe.putInt(obj4, j3, i11);
                    return i9 + 4;
                }
                break;
            case 58:
                if (i12 == 0) {
                    int zzm3 = zzyi.zzm(bArr2, i9, zzyh2);
                    if (zzyh2.zzb != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    unsafe.putObject(obj4, j2, Boolean.valueOf(z));
                    unsafe.putInt(obj4, j3, i11);
                    return zzm3;
                }
                break;
            case 59:
                if (i12 == 2) {
                    int zzj3 = zzyi.zzj(bArr2, i9, zzyh2);
                    int i14 = zzyh2.zza;
                    if (i14 == 0) {
                        unsafe.putObject(obj4, j2, "");
                    } else if ((i6 & 536870912) == 0 || zzacu.zzf(bArr2, zzj3, zzj3 + i14)) {
                        unsafe.putObject(obj4, j2, new String(bArr2, zzj3, i14, zzaad.zzb));
                        zzj3 += i14;
                    } else {
                        throw zzaaf.zzd();
                    }
                    unsafe.putInt(obj4, j3, i11);
                    return zzj3;
                }
                break;
            case 60:
                if (i12 == 2) {
                    int zzd2 = zzyi.zzd(zzF(i13), bArr2, i9, i2, zzyh2);
                    if (unsafe.getInt(obj4, j3) == i11) {
                        obj2 = unsafe.getObject(obj4, j2);
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == null) {
                        unsafe.putObject(obj4, j2, zzyh2.zzc);
                    } else {
                        unsafe.putObject(obj4, j2, zzaad.zzg(obj2, zzyh2.zzc));
                    }
                    unsafe.putInt(obj4, j3, i11);
                    return zzd2;
                }
                break;
            case 61:
                if (i12 == 2) {
                    int zza2 = zzyi.zza(bArr2, i9, zzyh2);
                    unsafe.putObject(obj4, j2, zzyh2.zzc);
                    unsafe.putInt(obj4, j3, i11);
                    return zza2;
                }
                break;
            case 63:
                if (i12 == 0) {
                    int zzj4 = zzyi.zzj(bArr2, i9, zzyh2);
                    int i15 = zzyh2.zza;
                    zzaab zzE = zzE(i13);
                    if (zzE == null || zzE.zza()) {
                        unsafe.putObject(obj4, j2, Integer.valueOf(i15));
                        unsafe.putInt(obj4, j3, i11);
                    } else {
                        zzd(obj).zzh(i10, Long.valueOf((long) i15));
                    }
                    return zzj4;
                }
                break;
            case 66:
                if (i12 == 0) {
                    int zzj5 = zzyi.zzj(bArr2, i9, zzyh2);
                    unsafe.putObject(obj4, j2, Integer.valueOf(zzyy.zzs(zzyh2.zza)));
                    unsafe.putInt(obj4, j3, i11);
                    return zzj5;
                }
                break;
            case 67:
                if (i12 == 0) {
                    int zzm4 = zzyi.zzm(bArr2, i9, zzyh2);
                    unsafe.putObject(obj4, j2, Long.valueOf(zzyy.zzt(zzyh2.zzb)));
                    unsafe.putInt(obj4, j3, i11);
                    return zzm4;
                }
                break;
            case 68:
                if (i12 == 3) {
                    int zzc2 = zzyi.zzc(zzF(i13), bArr, i, i2, (i10 & -8) | 4, zzyh);
                    if (unsafe.getInt(obj4, j3) == i11) {
                        obj3 = unsafe.getObject(obj4, j2);
                    } else {
                        obj3 = null;
                    }
                    if (obj3 == null) {
                        unsafe.putObject(obj4, j2, zzyh2.zzc);
                    } else {
                        unsafe.putObject(obj4, j2, zzaad.zzg(obj3, zzyh2.zzc));
                    }
                    unsafe.putInt(obj4, j3, i11);
                    return zzc2;
                }
                break;
        }
        return i9;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v3, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int zzv(java.lang.Object r32, byte[] r33, int r34, int r35, com.google.android.gms.internal.p001firebaseauthapi.zzyh r36) throws java.io.IOException {
        /*
            r31 = this;
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            r11 = r36
            sun.misc.Unsafe r9 = zzb
            r10 = -1
            r16 = 0
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r34
            r7 = r8
            r1 = r10
            r2 = r16
            r6 = r2
        L_0x0019:
            if (r0 >= r13) goto L_0x045f
            int r3 = r0 + 1
            byte r0 = r12[r0]
            if (r0 >= 0) goto L_0x002b
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzyi.zzk(r0, r12, r3, r11)
            int r3 = r11.zza
            r4 = r0
            r17 = r3
            goto L_0x002e
        L_0x002b:
            r17 = r0
            r4 = r3
        L_0x002e:
            int r5 = r17 >>> 3
            r3 = r17 & 7
            if (r5 <= r1) goto L_0x003c
            int r2 = r2 / 3
            int r0 = r15.zzy(r5, r2)
            r2 = r0
            goto L_0x0041
        L_0x003c:
            int r0 = r15.zzx(r5)
            r2 = r0
        L_0x0041:
            if (r2 != r10) goto L_0x004e
            r2 = r4
            r20 = r5
            r28 = r9
            r19 = r10
            r23 = r16
            goto L_0x0438
        L_0x004e:
            int[] r0 = r15.zzc
            int r1 = r2 + 1
            r1 = r0[r1]
            int r10 = zzB(r1)
            r34 = r5
            r5 = r1 & r8
            r19 = r9
            long r8 = (long) r5
            r5 = 17
            r21 = r1
            if (r10 > r5) goto L_0x02dd
            int r5 = r2 + 2
            r0 = r0[r5]
            int r5 = r0 >>> 20
            r1 = 1
            int r23 = r1 << r5
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r5
            if (r0 == r7) goto L_0x008f
            if (r7 == r5) goto L_0x007f
            r20 = r2
            long r1 = (long) r7
            r7 = r19
            r7.putInt(r14, r1, r6)
            goto L_0x0083
        L_0x007f:
            r20 = r2
            r7 = r19
        L_0x0083:
            if (r0 == r5) goto L_0x008b
            long r1 = (long) r0
            int r6 = r7.getInt(r14, r1)
            goto L_0x008c
        L_0x008b:
        L_0x008c:
            r2 = r7
            r7 = r0
            goto L_0x0093
        L_0x008f:
            r20 = r2
            r2 = r19
        L_0x0093:
            r0 = 5
            switch(r10) {
                case 0: goto L_0x02aa;
                case 1: goto L_0x0283;
                case 2: goto L_0x025a;
                case 3: goto L_0x025a;
                case 4: goto L_0x0236;
                case 5: goto L_0x0209;
                case 6: goto L_0x01e5;
                case 7: goto L_0x01b7;
                case 8: goto L_0x0187;
                case 9: goto L_0x014e;
                case 10: goto L_0x0129;
                case 11: goto L_0x0236;
                case 12: goto L_0x0105;
                case 13: goto L_0x01e5;
                case 14: goto L_0x0209;
                case 15: goto L_0x00dd;
                case 16: goto L_0x00a3;
                default: goto L_0x0097;
            }
        L_0x0097:
            r25 = r5
            r19 = r7
            r10 = r20
            r20 = r34
            r7 = r2
            r5 = r4
            goto L_0x02d2
        L_0x00a3:
            if (r3 != 0) goto L_0x00d0
            int r10 = com.google.android.gms.internal.p001firebaseauthapi.zzyi.zzm(r12, r4, r11)
            long r0 = r11.zzb
            long r21 = com.google.android.gms.internal.p001firebaseauthapi.zzyy.zzt(r0)
            r0 = r2
            r1 = r32
            r19 = r7
            r4 = r20
            r7 = r2
            r2 = r8
            r20 = r34
            r8 = r4
            r25 = r5
            r4 = r21
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r9 = r7
            r2 = r8
            r0 = r10
            r7 = r19
            r1 = r20
            r8 = r25
            r10 = -1
            goto L_0x0019
        L_0x00d0:
            r25 = r5
            r19 = r7
            r8 = r20
            r20 = r34
            r7 = r2
            r5 = r4
            r10 = r8
            goto L_0x02d2
        L_0x00dd:
            r25 = r5
            r19 = r7
            r10 = r20
            r20 = r34
            r7 = r2
            if (r3 != 0) goto L_0x0102
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzyi.zzj(r12, r4, r11)
            int r1 = r11.zza
            int r1 = com.google.android.gms.internal.p001firebaseauthapi.zzyy.zzs(r1)
            r7.putInt(r14, r8, r1)
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            r7 = r19
            r1 = r20
            r8 = r25
            r10 = -1
            goto L_0x0019
        L_0x0102:
            r5 = r4
            goto L_0x02d2
        L_0x0105:
            r25 = r5
            r19 = r7
            r10 = r20
            r20 = r34
            r7 = r2
            if (r3 != 0) goto L_0x0126
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzyi.zzj(r12, r4, r11)
            int r1 = r11.zza
            r7.putInt(r14, r8, r1)
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            r7 = r19
            r1 = r20
            r8 = r25
            r10 = -1
            goto L_0x0019
        L_0x0126:
            r5 = r4
            goto L_0x02d2
        L_0x0129:
            r25 = r5
            r19 = r7
            r10 = r20
            r20 = r34
            r7 = r2
            r0 = 2
            if (r3 != r0) goto L_0x014b
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzyi.zza(r12, r4, r11)
            java.lang.Object r1 = r11.zzc
            r7.putObject(r14, r8, r1)
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            r7 = r19
            r1 = r20
            r8 = r25
            r10 = -1
            goto L_0x0019
        L_0x014b:
            r5 = r4
            goto L_0x02d2
        L_0x014e:
            r25 = r5
            r19 = r7
            r10 = r20
            r0 = 2
            r20 = r34
            r7 = r2
            if (r3 != r0) goto L_0x0184
            com.google.android.gms.internal.firebase-auth-api.zzabo r0 = r15.zzF(r10)
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzyi.zzd(r0, r12, r4, r13, r11)
            java.lang.Object r1 = r7.getObject(r14, r8)
            if (r1 != 0) goto L_0x016e
            java.lang.Object r1 = r11.zzc
            r7.putObject(r14, r8, r1)
            goto L_0x0177
        L_0x016e:
            java.lang.Object r2 = r11.zzc
            java.lang.Object r1 = com.google.android.gms.internal.p001firebaseauthapi.zzaad.zzg(r1, r2)
            r7.putObject(r14, r8, r1)
        L_0x0177:
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            r7 = r19
            r1 = r20
            r8 = r25
            r10 = -1
            goto L_0x0019
        L_0x0184:
            r5 = r4
            goto L_0x02d2
        L_0x0187:
            r25 = r5
            r19 = r7
            r10 = r20
            r20 = r34
            r7 = r2
            r0 = 2
            if (r3 != r0) goto L_0x01b4
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r21 & r0
            if (r0 != 0) goto L_0x019e
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzyi.zzg(r12, r4, r11)
            goto L_0x01a2
        L_0x019e:
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzyi.zzh(r12, r4, r11)
        L_0x01a2:
            java.lang.Object r1 = r11.zzc
            r7.putObject(r14, r8, r1)
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            r7 = r19
            r1 = r20
            r8 = r25
            r10 = -1
            goto L_0x0019
        L_0x01b4:
            r5 = r4
            goto L_0x02d2
        L_0x01b7:
            r25 = r5
            r19 = r7
            r10 = r20
            r20 = r34
            r7 = r2
            if (r3 != 0) goto L_0x01e2
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzyi.zzm(r12, r4, r11)
            long r1 = r11.zzb
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x01d0
            r1 = 1
            goto L_0x01d2
        L_0x01d0:
            r1 = r16
        L_0x01d2:
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzm(r14, r8, r1)
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            r7 = r19
            r1 = r20
            r8 = r25
            r10 = -1
            goto L_0x0019
        L_0x01e2:
            r5 = r4
            goto L_0x02d2
        L_0x01e5:
            r25 = r5
            r19 = r7
            r10 = r20
            r20 = r34
            r7 = r2
            if (r3 != r0) goto L_0x0206
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzyi.zzb(r12, r4)
            r7.putInt(r14, r8, r0)
            int r0 = r4 + 4
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            r7 = r19
            r1 = r20
            r8 = r25
            r10 = -1
            goto L_0x0019
        L_0x0206:
            r5 = r4
            goto L_0x02d2
        L_0x0209:
            r25 = r5
            r19 = r7
            r10 = r20
            r20 = r34
            r7 = r2
            r0 = 1
            if (r3 != r0) goto L_0x0232
            long r21 = com.google.android.gms.internal.p001firebaseauthapi.zzyi.zzn(r12, r4)
            r0 = r7
            r1 = r32
            r2 = r8
            r8 = r4
            r4 = r21
            r0.putLong(r1, r2, r4)
            int r0 = r8 + 8
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            r7 = r19
            r1 = r20
            r8 = r25
            r10 = -1
            goto L_0x0019
        L_0x0232:
            r8 = r4
            r5 = r8
            goto L_0x02d2
        L_0x0236:
            r25 = r5
            r19 = r7
            r10 = r20
            r20 = r34
            r7 = r2
            r5 = r4
            if (r3 != 0) goto L_0x0258
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzyi.zzj(r12, r5, r11)
            int r1 = r11.zza
            r7.putInt(r14, r8, r1)
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            r7 = r19
            r1 = r20
            r8 = r25
            r10 = -1
            goto L_0x0019
        L_0x0258:
            goto L_0x02d2
        L_0x025a:
            r25 = r5
            r19 = r7
            r10 = r20
            r20 = r34
            r7 = r2
            r5 = r4
            if (r3 != 0) goto L_0x0282
            int r17 = com.google.android.gms.internal.p001firebaseauthapi.zzyi.zzm(r12, r5, r11)
            long r4 = r11.zzb
            r0 = r7
            r1 = r32
            r2 = r8
            r0.putLong(r1, r2, r4)
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            r0 = r17
            r7 = r19
            r1 = r20
            r8 = r25
            r10 = -1
            goto L_0x0019
        L_0x0282:
            goto L_0x02d2
        L_0x0283:
            r25 = r5
            r19 = r7
            r10 = r20
            r20 = r34
            r7 = r2
            r5 = r4
            if (r3 != r0) goto L_0x02a9
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzyi.zzb(r12, r5)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzp(r14, r8, r0)
            int r0 = r5 + 4
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            r7 = r19
            r1 = r20
            r8 = r25
            r10 = -1
            goto L_0x0019
        L_0x02a9:
            goto L_0x02d2
        L_0x02aa:
            r25 = r5
            r19 = r7
            r10 = r20
            r20 = r34
            r7 = r2
            r5 = r4
            r0 = 1
            if (r3 != r0) goto L_0x02d1
            long r0 = com.google.android.gms.internal.p001firebaseauthapi.zzyi.zzn(r12, r5)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzo(r14, r8, r0)
            int r0 = r5 + 8
            r6 = r6 | r23
            r9 = r7
            r2 = r10
            r7 = r19
            r1 = r20
            r8 = r25
            r10 = -1
            goto L_0x0019
        L_0x02d1:
        L_0x02d2:
            r2 = r5
            r28 = r7
            r23 = r10
            r7 = r19
            r19 = -1
            goto L_0x0438
        L_0x02dd:
            r20 = r34
            r5 = r4
            r25 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2
            r29 = r19
            r19 = r7
            r7 = r29
            r0 = 27
            if (r10 != r0) goto L_0x0341
            r0 = 2
            if (r3 != r0) goto L_0x0333
            java.lang.Object r0 = r7.getObject(r14, r8)
            com.google.android.gms.internal.firebase-auth-api.zzaac r0 = (com.google.android.gms.internal.p001firebaseauthapi.zzaac) r0
            boolean r1 = r0.zzc()
            if (r1 != 0) goto L_0x0310
            int r1 = r0.size()
            if (r1 != 0) goto L_0x0306
            r1 = 10
            goto L_0x0307
        L_0x0306:
            int r1 = r1 + r1
        L_0x0307:
            com.google.android.gms.internal.firebase-auth-api.zzaac r0 = r0.zzd(r1)
            r7.putObject(r14, r8, r0)
            r8 = r0
            goto L_0x0311
        L_0x0310:
            r8 = r0
        L_0x0311:
            com.google.android.gms.internal.firebase-auth-api.zzabo r0 = r15.zzF(r4)
            r1 = r17
            r2 = r33
            r3 = r5
            r23 = r4
            r4 = r35
            r5 = r8
            r8 = r6
            r6 = r36
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzyi.zze(r0, r1, r2, r3, r4, r5, r6)
            r9 = r7
            r6 = r8
            r7 = r19
            r1 = r20
            r2 = r23
            r8 = r25
            r10 = -1
            goto L_0x0019
        L_0x0333:
            r23 = r4
            r8 = r6
            r15 = r5
            r28 = r7
            r26 = r8
            r27 = r19
            r19 = -1
            goto L_0x03f6
        L_0x0341:
            r23 = r4
            r0 = 49
            if (r10 > r0) goto L_0x03a3
            r1 = r21
            long r1 = (long) r1
            r0 = r31
            r21 = r1
            r1 = r32
            r2 = r33
            r4 = r3
            r3 = r5
            r34 = r4
            r4 = r35
            r15 = r5
            r5 = r17
            r26 = r6
            r6 = r20
            r27 = r19
            r19 = r7
            r7 = r34
            r29 = r8
            r9 = r25
            r24 = r29
            r8 = r23
            r18 = r10
            r28 = r19
            r19 = -1
            r9 = r21
            r11 = r18
            r12 = r24
            r14 = r36
            int r0 = r0.zzw(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12, r14)
            if (r0 == r15) goto L_0x039c
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            r11 = r36
            r10 = r19
            r1 = r20
            r2 = r23
            r6 = r26
            r7 = r27
            r9 = r28
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0019
        L_0x039c:
            r2 = r0
            r6 = r26
            r7 = r27
            goto L_0x0438
        L_0x03a3:
            r34 = r3
            r15 = r5
            r26 = r6
            r28 = r7
            r24 = r8
            r18 = r10
            r27 = r19
            r1 = r21
            r19 = -1
            r0 = 50
            r9 = r18
            if (r9 != r0) goto L_0x03fc
            r7 = r34
            r0 = 2
            if (r7 != r0) goto L_0x03f5
            r0 = r31
            r1 = r32
            r2 = r33
            r3 = r15
            r4 = r35
            r5 = r23
            r6 = r24
            r8 = r36
            int r0 = r0.zzt(r1, r2, r3, r4, r5, r6, r8)
            if (r0 == r15) goto L_0x03ef
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            r11 = r36
            r10 = r19
            r1 = r20
            r2 = r23
            r6 = r26
            r7 = r27
            r9 = r28
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0019
        L_0x03ef:
            r2 = r0
            r6 = r26
            r7 = r27
            goto L_0x0438
        L_0x03f5:
        L_0x03f6:
            r2 = r15
            r6 = r26
            r7 = r27
            goto L_0x0438
        L_0x03fc:
            r7 = r34
            r0 = r31
            r8 = r1
            r1 = r32
            r2 = r33
            r3 = r15
            r4 = r35
            r5 = r17
            r6 = r20
            r10 = r24
            r12 = r23
            r13 = r36
            int r0 = r0.zzu(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            if (r0 == r15) goto L_0x0433
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            r11 = r36
            r10 = r19
            r1 = r20
            r2 = r23
            r6 = r26
            r7 = r27
            r9 = r28
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0019
        L_0x0433:
            r2 = r0
            r6 = r26
            r7 = r27
        L_0x0438:
            com.google.android.gms.internal.firebase-auth-api.zzacg r4 = zzd(r32)
            r0 = r17
            r1 = r33
            r3 = r35
            r5 = r36
            int r0 = com.google.android.gms.internal.p001firebaseauthapi.zzyi.zzi(r0, r1, r2, r3, r4, r5)
            r15 = r31
            r14 = r32
            r12 = r33
            r13 = r35
            r11 = r36
            r10 = r19
            r1 = r20
            r2 = r23
            r9 = r28
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto L_0x0019
        L_0x045f:
            r26 = r6
            r27 = r7
            r28 = r9
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r7 == r1) goto L_0x0474
            long r1 = (long) r7
            r3 = r32
            r6 = r26
            r4 = r28
            r4.putInt(r3, r1, r6)
        L_0x0474:
            r1 = r35
            if (r0 != r1) goto L_0x0479
            return r0
        L_0x0479:
            com.google.android.gms.internal.firebase-auth-api.zzaaf r0 = com.google.android.gms.internal.p001firebaseauthapi.zzaaf.zzg()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzabf.zzv(java.lang.Object, byte[], int, int, com.google.android.gms.internal.firebase-auth-api.zzyh):int");
    }

    private final int zzw(Object obj, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zzyh zzyh) throws IOException {
        boolean z;
        boolean z2;
        boolean z3;
        int i8;
        int i9;
        int i10;
        int i11;
        Object obj2 = obj;
        byte[] bArr2 = bArr;
        int i12 = i;
        int i13 = i2;
        int i14 = i3;
        int i15 = i5;
        int i16 = i6;
        long j3 = j2;
        zzyh zzyh2 = zzyh;
        Unsafe unsafe = zzb;
        zzaac zzaac = (zzaac) unsafe.getObject(obj2, j3);
        if (!zzaac.zzc()) {
            int size = zzaac.size();
            zzaac = zzaac.zzd(size == 0 ? 10 : size + size);
            unsafe.putObject(obj2, j3, zzaac);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i15 == 2) {
                    zzzh zzzh = (zzzh) zzaac;
                    int zzj2 = zzyi.zzj(bArr2, i12, zzyh2);
                    int i17 = zzyh2.zza + zzj2;
                    while (zzj2 < i17) {
                        zzzh.zze(Double.longBitsToDouble(zzyi.zzn(bArr2, zzj2)));
                        zzj2 += 8;
                    }
                    if (zzj2 == i17) {
                        return zzj2;
                    }
                    throw zzaaf.zzi();
                } else if (i15 == 1) {
                    zzzh zzzh2 = (zzzh) zzaac;
                    zzzh2.zze(Double.longBitsToDouble(zzyi.zzn(bArr, i)));
                    int i18 = i12 + 8;
                    while (i18 < i13) {
                        int zzj3 = zzyi.zzj(bArr2, i18, zzyh2);
                        if (i14 != zzyh2.zza) {
                            return i18;
                        }
                        zzzh2.zze(Double.longBitsToDouble(zzyi.zzn(bArr2, zzj3)));
                        i18 = zzj3 + 8;
                    }
                    return i18;
                }
                break;
            case 19:
            case 36:
                if (i15 == 2) {
                    zzzr zzzr = (zzzr) zzaac;
                    int zzj4 = zzyi.zzj(bArr2, i12, zzyh2);
                    int i19 = zzyh2.zza + zzj4;
                    while (zzj4 < i19) {
                        zzzr.zze(Float.intBitsToFloat(zzyi.zzb(bArr2, zzj4)));
                        zzj4 += 4;
                    }
                    if (zzj4 == i19) {
                        return zzj4;
                    }
                    throw zzaaf.zzi();
                } else if (i15 == 5) {
                    zzzr zzzr2 = (zzzr) zzaac;
                    zzzr2.zze(Float.intBitsToFloat(zzyi.zzb(bArr, i)));
                    int i20 = i12 + 4;
                    while (i20 < i13) {
                        int zzj5 = zzyi.zzj(bArr2, i20, zzyh2);
                        if (i14 != zzyh2.zza) {
                            return i20;
                        }
                        zzzr2.zze(Float.intBitsToFloat(zzyi.zzb(bArr2, zzj5)));
                        i20 = zzj5 + 4;
                    }
                    return i20;
                }
                break;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i15 == 2) {
                    zzaar zzaar = (zzaar) zzaac;
                    int zzj6 = zzyi.zzj(bArr2, i12, zzyh2);
                    int i21 = zzyh2.zza + zzj6;
                    while (zzj6 < i21) {
                        zzj6 = zzyi.zzm(bArr2, zzj6, zzyh2);
                        zzaar.zzf(zzyh2.zzb);
                    }
                    if (zzj6 == i21) {
                        return zzj6;
                    }
                    throw zzaaf.zzi();
                } else if (i15 == 0) {
                    zzaar zzaar2 = (zzaar) zzaac;
                    int zzm2 = zzyi.zzm(bArr2, i12, zzyh2);
                    zzaar2.zzf(zzyh2.zzb);
                    while (zzm2 < i13) {
                        int zzj7 = zzyi.zzj(bArr2, zzm2, zzyh2);
                        if (i14 != zzyh2.zza) {
                            return zzm2;
                        }
                        zzm2 = zzyi.zzm(bArr2, zzj7, zzyh2);
                        zzaar2.zzf(zzyh2.zzb);
                    }
                    return zzm2;
                }
                break;
            case 22:
            case 29:
            case 39:
            case 43:
                if (i15 == 2) {
                    return zzyi.zzf(bArr2, i12, zzaac, zzyh2);
                }
                if (i15 == 0) {
                    return zzyi.zzl(i3, bArr, i, i2, zzaac, zzyh);
                }
                break;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i15 == 2) {
                    zzaar zzaar3 = (zzaar) zzaac;
                    int zzj8 = zzyi.zzj(bArr2, i12, zzyh2);
                    int i22 = zzyh2.zza + zzj8;
                    while (zzj8 < i22) {
                        zzaar3.zzf(zzyi.zzn(bArr2, zzj8));
                        zzj8 += 8;
                    }
                    if (zzj8 == i22) {
                        return zzj8;
                    }
                    throw zzaaf.zzi();
                } else if (i15 == 1) {
                    zzaar zzaar4 = (zzaar) zzaac;
                    zzaar4.zzf(zzyi.zzn(bArr, i));
                    int i23 = i12 + 8;
                    while (i23 < i13) {
                        int zzj9 = zzyi.zzj(bArr2, i23, zzyh2);
                        if (i14 != zzyh2.zza) {
                            return i23;
                        }
                        zzaar4.zzf(zzyi.zzn(bArr2, zzj9));
                        i23 = zzj9 + 8;
                    }
                    return i23;
                }
                break;
            case 24:
            case 31:
            case 41:
            case 45:
                if (i15 == 2) {
                    zzzy zzzy = (zzzy) zzaac;
                    int zzj10 = zzyi.zzj(bArr2, i12, zzyh2);
                    int i24 = zzyh2.zza + zzj10;
                    while (zzj10 < i24) {
                        zzzy.zzf(zzyi.zzb(bArr2, zzj10));
                        zzj10 += 4;
                    }
                    if (zzj10 == i24) {
                        return zzj10;
                    }
                    throw zzaaf.zzi();
                } else if (i15 == 5) {
                    zzzy zzzy2 = (zzzy) zzaac;
                    zzzy2.zzf(zzyi.zzb(bArr, i));
                    int i25 = i12 + 4;
                    while (i25 < i13) {
                        int zzj11 = zzyi.zzj(bArr2, i25, zzyh2);
                        if (i14 != zzyh2.zza) {
                            return i25;
                        }
                        zzzy2.zzf(zzyi.zzb(bArr2, zzj11));
                        i25 = zzj11 + 4;
                    }
                    return i25;
                }
                break;
            case 25:
            case 42:
                if (i15 == 2) {
                    zzyj zzyj = (zzyj) zzaac;
                    int zzj12 = zzyi.zzj(bArr2, i12, zzyh2);
                    int i26 = zzyh2.zza + zzj12;
                    while (zzj12 < i26) {
                        zzj12 = zzyi.zzm(bArr2, zzj12, zzyh2);
                        if (zzyh2.zzb != 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        zzyj.zze(z3);
                    }
                    if (zzj12 == i26) {
                        return zzj12;
                    }
                    throw zzaaf.zzi();
                } else if (i15 == 0) {
                    zzyj zzyj2 = (zzyj) zzaac;
                    int zzm3 = zzyi.zzm(bArr2, i12, zzyh2);
                    if (zzyh2.zzb != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zzyj2.zze(z);
                    while (zzm3 < i13) {
                        int zzj13 = zzyi.zzj(bArr2, zzm3, zzyh2);
                        if (i14 != zzyh2.zza) {
                            return zzm3;
                        }
                        zzm3 = zzyi.zzm(bArr2, zzj13, zzyh2);
                        if (zzyh2.zzb != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        zzyj2.zze(z2);
                    }
                    return zzm3;
                }
                break;
            case 26:
                if (i15 == 2) {
                    if ((j & 536870912) == 0) {
                        int zzj14 = zzyi.zzj(bArr2, i12, zzyh2);
                        int i27 = zzyh2.zza;
                        if (i27 >= 0) {
                            if (i27 == 0) {
                                zzaac.add("");
                            } else {
                                zzaac.add(new String(bArr2, zzj14, i27, zzaad.zzb));
                                zzj14 += i27;
                            }
                            while (i9 < i13) {
                                int zzj15 = zzyi.zzj(bArr2, i9, zzyh2);
                                if (i14 != zzyh2.zza) {
                                    return i9;
                                }
                                i9 = zzyi.zzj(bArr2, zzj15, zzyh2);
                                int i28 = zzyh2.zza;
                                if (i28 < 0) {
                                    throw zzaaf.zzf();
                                } else if (i28 == 0) {
                                    zzaac.add("");
                                } else {
                                    zzaac.add(new String(bArr2, i9, i28, zzaad.zzb));
                                    i9 += i28;
                                }
                            }
                            return i9;
                        }
                        throw zzaaf.zzf();
                    }
                    int zzj16 = zzyi.zzj(bArr2, i12, zzyh2);
                    int i29 = zzyh2.zza;
                    if (i29 >= 0) {
                        if (i29 == 0) {
                            zzaac.add("");
                        } else {
                            int i30 = zzj16 + i29;
                            if (zzacu.zzf(bArr2, zzj16, i30)) {
                                zzaac.add(new String(bArr2, zzj16, i29, zzaad.zzb));
                                zzj16 = i30;
                            } else {
                                throw zzaaf.zzd();
                            }
                        }
                        while (i8 < i13) {
                            int zzj17 = zzyi.zzj(bArr2, i8, zzyh2);
                            if (i14 != zzyh2.zza) {
                                return i8;
                            }
                            i8 = zzyi.zzj(bArr2, zzj17, zzyh2);
                            int i31 = zzyh2.zza;
                            if (i31 < 0) {
                                throw zzaaf.zzf();
                            } else if (i31 == 0) {
                                zzaac.add("");
                            } else {
                                int i32 = i8 + i31;
                                if (zzacu.zzf(bArr2, i8, i32)) {
                                    zzaac.add(new String(bArr2, i8, i31, zzaad.zzb));
                                    i8 = i32;
                                } else {
                                    throw zzaaf.zzd();
                                }
                            }
                        }
                        return i8;
                    }
                    throw zzaaf.zzf();
                }
                break;
            case 27:
                if (i15 == 2) {
                    return zzyi.zze(zzF(i16), i3, bArr, i, i2, zzaac, zzyh);
                }
                break;
            case 28:
                if (i15 == 2) {
                    int zzj18 = zzyi.zzj(bArr2, i12, zzyh2);
                    int i33 = zzyh2.zza;
                    if (i33 < 0) {
                        throw zzaaf.zzf();
                    } else if (i33 <= bArr2.length - zzj18) {
                        if (i33 == 0) {
                            zzaac.add(zzyu.zzb);
                        } else {
                            zzaac.add(zzyu.zzo(bArr2, zzj18, i33));
                            zzj18 += i33;
                        }
                        while (i10 < i13) {
                            int zzj19 = zzyi.zzj(bArr2, i10, zzyh2);
                            if (i14 != zzyh2.zza) {
                                return i10;
                            }
                            i10 = zzyi.zzj(bArr2, zzj19, zzyh2);
                            int i34 = zzyh2.zza;
                            if (i34 < 0) {
                                throw zzaaf.zzf();
                            } else if (i34 > bArr2.length - i10) {
                                throw zzaaf.zzi();
                            } else if (i34 == 0) {
                                zzaac.add(zzyu.zzb);
                            } else {
                                zzaac.add(zzyu.zzo(bArr2, i10, i34));
                                i10 += i34;
                            }
                        }
                        return i10;
                    } else {
                        throw zzaaf.zzi();
                    }
                }
                break;
            case 30:
            case 44:
                if (i15 == 2) {
                    i11 = zzyi.zzf(bArr2, i12, zzaac, zzyh2);
                } else if (i15 == 0) {
                    i11 = zzyi.zzl(i3, bArr, i, i2, zzaac, zzyh);
                }
                zzzx zzzx = (zzzx) obj2;
                zzacg zzacg = zzzx.zzc;
                if (zzacg == zzacg.zzc()) {
                    zzacg = null;
                }
                Object zzC = zzabq.zzC(i4, zzaac, zzE(i16), zzacg, this.zzo);
                if (zzC == null) {
                    return i11;
                }
                zzzx.zzc = (zzacg) zzC;
                return i11;
            case 33:
            case 47:
                if (i15 == 2) {
                    zzzy zzzy3 = (zzzy) zzaac;
                    int zzj20 = zzyi.zzj(bArr2, i12, zzyh2);
                    int i35 = zzyh2.zza + zzj20;
                    while (zzj20 < i35) {
                        zzj20 = zzyi.zzj(bArr2, zzj20, zzyh2);
                        zzzy3.zzf(zzyy.zzs(zzyh2.zza));
                    }
                    if (zzj20 == i35) {
                        return zzj20;
                    }
                    throw zzaaf.zzi();
                } else if (i15 == 0) {
                    zzzy zzzy4 = (zzzy) zzaac;
                    int zzj21 = zzyi.zzj(bArr2, i12, zzyh2);
                    zzzy4.zzf(zzyy.zzs(zzyh2.zza));
                    while (zzj21 < i13) {
                        int zzj22 = zzyi.zzj(bArr2, zzj21, zzyh2);
                        if (i14 != zzyh2.zza) {
                            return zzj21;
                        }
                        zzj21 = zzyi.zzj(bArr2, zzj22, zzyh2);
                        zzzy4.zzf(zzyy.zzs(zzyh2.zza));
                    }
                    return zzj21;
                }
                break;
            case 34:
            case 48:
                if (i15 == 2) {
                    zzaar zzaar5 = (zzaar) zzaac;
                    int zzj23 = zzyi.zzj(bArr2, i12, zzyh2);
                    int i36 = zzyh2.zza + zzj23;
                    while (zzj23 < i36) {
                        zzj23 = zzyi.zzm(bArr2, zzj23, zzyh2);
                        zzaar5.zzf(zzyy.zzt(zzyh2.zzb));
                    }
                    if (zzj23 == i36) {
                        return zzj23;
                    }
                    throw zzaaf.zzi();
                } else if (i15 == 0) {
                    zzaar zzaar6 = (zzaar) zzaac;
                    int zzm4 = zzyi.zzm(bArr2, i12, zzyh2);
                    zzaar6.zzf(zzyy.zzt(zzyh2.zzb));
                    while (zzm4 < i13) {
                        int zzj24 = zzyi.zzj(bArr2, zzm4, zzyh2);
                        if (i14 != zzyh2.zza) {
                            return zzm4;
                        }
                        zzm4 = zzyi.zzm(bArr2, zzj24, zzyh2);
                        zzaar6.zzf(zzyy.zzt(zzyh2.zzb));
                    }
                    return zzm4;
                }
                break;
            default:
                if (i15 == 3) {
                    zzabo zzF = zzF(i16);
                    int i37 = (i14 & -8) | 4;
                    int zzc2 = zzyi.zzc(zzF, bArr, i, i2, i37, zzyh);
                    zzaac.add(zzyh2.zzc);
                    while (zzc2 < i13) {
                        int zzj25 = zzyi.zzj(bArr2, zzc2, zzyh2);
                        if (i14 != zzyh2.zza) {
                            return zzc2;
                        }
                        zzc2 = zzyi.zzc(zzF, bArr, zzj25, i2, i37, zzyh);
                        zzaac.add(zzyh2.zzc);
                    }
                    return zzc2;
                }
                break;
        }
        return i12;
    }

    private final int zzx(int i) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzA(i, 0);
    }

    private final int zzy(int i, int i2) {
        if (i < this.zze || i > this.zzf) {
            return -1;
        }
        return zzA(i, i2);
    }

    private final int zzz(int i) {
        return this.zzc[i + 2];
    }

    public final int zza(Object obj) {
        return this.zzj ? zzr(obj) : zzq(obj);
    }

    public final int zzb(Object obj) {
        int length = this.zzc.length;
        int i = 0;
        for (int i2 = 0; i2 < length; i2 += 3) {
            int zzC = zzC(i2);
            int i3 = this.zzc[i2];
            long j = (long) (1048575 & zzC);
            int i4 = 37;
            switch (zzB(zzC)) {
                case 0:
                    i = (i * 53) + zzaad.zzc(Double.doubleToLongBits(zzacp.zza(obj, j)));
                    break;
                case 1:
                    i = (i * 53) + Float.floatToIntBits(zzacp.zzb(obj, j));
                    break;
                case 2:
                    i = (i * 53) + zzaad.zzc(zzacp.zzd(obj, j));
                    break;
                case 3:
                    i = (i * 53) + zzaad.zzc(zzacp.zzd(obj, j));
                    break;
                case 4:
                    i = (i * 53) + zzacp.zzc(obj, j);
                    break;
                case 5:
                    i = (i * 53) + zzaad.zzc(zzacp.zzd(obj, j));
                    break;
                case 6:
                    i = (i * 53) + zzacp.zzc(obj, j);
                    break;
                case 7:
                    i = (i * 53) + zzaad.zza(zzacp.zzw(obj, j));
                    break;
                case 8:
                    i = (i * 53) + ((String) zzacp.zzf(obj, j)).hashCode();
                    break;
                case 9:
                    Object zzf2 = zzacp.zzf(obj, j);
                    if (zzf2 != null) {
                        i4 = zzf2.hashCode();
                    }
                    i = (i * 53) + i4;
                    break;
                case 10:
                    i = (i * 53) + zzacp.zzf(obj, j).hashCode();
                    break;
                case 11:
                    i = (i * 53) + zzacp.zzc(obj, j);
                    break;
                case 12:
                    i = (i * 53) + zzacp.zzc(obj, j);
                    break;
                case 13:
                    i = (i * 53) + zzacp.zzc(obj, j);
                    break;
                case 14:
                    i = (i * 53) + zzaad.zzc(zzacp.zzd(obj, j));
                    break;
                case 15:
                    i = (i * 53) + zzacp.zzc(obj, j);
                    break;
                case 16:
                    i = (i * 53) + zzaad.zzc(zzacp.zzd(obj, j));
                    break;
                case 17:
                    Object zzf3 = zzacp.zzf(obj, j);
                    if (zzf3 != null) {
                        i4 = zzf3.hashCode();
                    }
                    i = (i * 53) + i4;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i = (i * 53) + zzacp.zzf(obj, j).hashCode();
                    break;
                case 50:
                    i = (i * 53) + zzacp.zzf(obj, j).hashCode();
                    break;
                case 51:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzaad.zzc(Double.doubleToLongBits(zzo(obj, j)));
                        break;
                    }
                case 52:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + Float.floatToIntBits(zzp(obj, j));
                        break;
                    }
                case 53:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzaad.zzc(zzD(obj, j));
                        break;
                    }
                case 54:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzaad.zzc(zzD(obj, j));
                        break;
                    }
                case 55:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzs(obj, j);
                        break;
                    }
                case 56:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzaad.zzc(zzD(obj, j));
                        break;
                    }
                case 57:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzs(obj, j);
                        break;
                    }
                case 58:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzaad.zza(zzU(obj, j));
                        break;
                    }
                case 59:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + ((String) zzacp.zzf(obj, j)).hashCode();
                        break;
                    }
                case 60:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzacp.zzf(obj, j).hashCode();
                        break;
                    }
                case 61:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzacp.zzf(obj, j).hashCode();
                        break;
                    }
                case 62:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzs(obj, j);
                        break;
                    }
                case 63:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzs(obj, j);
                        break;
                    }
                case 64:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzs(obj, j);
                        break;
                    }
                case 65:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzaad.zzc(zzD(obj, j));
                        break;
                    }
                case 66:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzs(obj, j);
                        break;
                    }
                case 67:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzaad.zzc(zzD(obj, j));
                        break;
                    }
                case 68:
                    if (!zzT(obj, i3, i2)) {
                        break;
                    } else {
                        i = (i * 53) + zzacp.zzf(obj, j).hashCode();
                        break;
                    }
            }
        }
        int hashCode = (i * 53) + this.zzo.zzd(obj).hashCode();
        if (!this.zzh) {
            return hashCode;
        }
        this.zzp.zza(obj);
        throw null;
    }

    /* access modifiers changed from: package-private */
    public final int zzc(Object obj, byte[] bArr, int i, int i2, int i3, zzyh zzyh) throws IOException {
        Unsafe unsafe;
        int i4;
        Object obj2;
        zzabf zzabf;
        Object obj3;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        Object obj4;
        int i13;
        zzyh zzyh2;
        int zzi2;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        boolean z;
        zzabf zzabf2 = this;
        Object obj5 = obj;
        byte[] bArr2 = bArr;
        int i24 = i2;
        int i25 = i3;
        zzyh zzyh3 = zzyh;
        Unsafe unsafe2 = zzb;
        int i26 = i;
        int i27 = 0;
        int i28 = 0;
        int i29 = 0;
        int i30 = -1;
        int i31 = 1048575;
        while (true) {
            if (i26 < i24) {
                int i32 = i26 + 1;
                byte b = bArr2[i26];
                if (b < 0) {
                    i6 = zzyi.zzk(b, bArr2, i32, zzyh3);
                    i5 = zzyh3.zza;
                } else {
                    int i33 = i32;
                    i5 = b;
                    i6 = i33;
                }
                int i34 = i5 >>> 3;
                int i35 = i5 & 7;
                if (i34 > i30) {
                    i7 = zzabf2.zzy(i34, i28 / 3);
                } else {
                    i7 = zzabf2.zzx(i34);
                }
                if (i7 == -1) {
                    i12 = i6;
                    i8 = i5;
                    i10 = i29;
                    i9 = i34;
                    unsafe = unsafe2;
                    i11 = 0;
                } else {
                    int[] iArr = zzabf2.zzc;
                    int i36 = iArr[i7 + 1];
                    int zzB = zzB(i36);
                    int i37 = i5;
                    int i38 = i6;
                    long j = (long) (i36 & 1048575);
                    if (zzB <= 17) {
                        int i39 = iArr[i7 + 2];
                        int i40 = 1 << (i39 >>> 20);
                        int i41 = i39 & 1048575;
                        if (i41 != i31) {
                            if (i31 != 1048575) {
                                i18 = i7;
                                unsafe2.putInt(obj5, (long) i31, i29);
                            } else {
                                i18 = i7;
                            }
                            i14 = i41;
                            i19 = unsafe2.getInt(obj5, (long) i41);
                        } else {
                            i18 = i7;
                            i14 = i31;
                            i19 = i29;
                        }
                        switch (zzB) {
                            case 0:
                                i21 = i37;
                                i23 = i38;
                                long j2 = j;
                                i20 = i34;
                                i22 = i18;
                                if (i35 == 1) {
                                    zzacp.zzo(obj5, j2, Double.longBitsToDouble(zzyi.zzn(bArr2, i23)));
                                    i26 = i23 + 8;
                                    i29 = i19 | i40;
                                    i28 = i22;
                                    i27 = i21;
                                    i30 = i20;
                                    i31 = i14;
                                    i25 = i3;
                                    continue;
                                }
                                break;
                            case 1:
                                i21 = i37;
                                i23 = i38;
                                long j3 = j;
                                i20 = i34;
                                i22 = i18;
                                if (i35 == 5) {
                                    zzacp.zzp(obj5, j3, Float.intBitsToFloat(zzyi.zzb(bArr2, i23)));
                                    i26 = i23 + 4;
                                    i29 = i19 | i40;
                                    i28 = i22;
                                    i27 = i21;
                                    i30 = i20;
                                    i31 = i14;
                                    i25 = i3;
                                    continue;
                                }
                                break;
                            case 2:
                            case 3:
                                i21 = i37;
                                i23 = i38;
                                long j4 = j;
                                i20 = i34;
                                i22 = i18;
                                if (i35 == 0) {
                                    int zzm2 = zzyi.zzm(bArr2, i23, zzyh3);
                                    unsafe2.putLong(obj, j4, zzyh3.zzb);
                                    i29 = i19 | i40;
                                    i28 = i22;
                                    i26 = zzm2;
                                    i27 = i21;
                                    i30 = i20;
                                    i31 = i14;
                                    i25 = i3;
                                    continue;
                                }
                                break;
                            case 4:
                            case 11:
                                i21 = i37;
                                i23 = i38;
                                long j5 = j;
                                i20 = i34;
                                i22 = i18;
                                if (i35 == 0) {
                                    i26 = zzyi.zzj(bArr2, i23, zzyh3);
                                    unsafe2.putInt(obj5, j5, zzyh3.zza);
                                    i29 = i19 | i40;
                                    i28 = i22;
                                    i27 = i21;
                                    i30 = i20;
                                    i31 = i14;
                                    i25 = i3;
                                    continue;
                                }
                                break;
                            case 5:
                            case 14:
                                i21 = i37;
                                int i42 = i38;
                                long j6 = j;
                                i20 = i34;
                                i22 = i18;
                                if (i35 != 1) {
                                    i23 = i42;
                                    break;
                                } else {
                                    unsafe2.putLong(obj, j6, zzyi.zzn(bArr2, i42));
                                    i26 = i42 + 8;
                                    i29 = i19 | i40;
                                    i28 = i22;
                                    i27 = i21;
                                    i30 = i20;
                                    i31 = i14;
                                    i25 = i3;
                                    continue;
                                }
                            case 6:
                            case 13:
                                i21 = i37;
                                int i43 = i38;
                                long j7 = j;
                                i20 = i34;
                                i22 = i18;
                                if (i35 != 5) {
                                    i23 = i43;
                                    break;
                                } else {
                                    unsafe2.putInt(obj5, j7, zzyi.zzb(bArr2, i43));
                                    i26 = i43 + 4;
                                    i29 = i19 | i40;
                                    i28 = i22;
                                    i27 = i21;
                                    i30 = i20;
                                    i31 = i14;
                                    i25 = i3;
                                    continue;
                                }
                            case 7:
                                i21 = i37;
                                int i44 = i38;
                                long j8 = j;
                                i20 = i34;
                                i22 = i18;
                                if (i35 != 0) {
                                    i23 = i44;
                                    break;
                                } else {
                                    i26 = zzyi.zzm(bArr2, i44, zzyh3);
                                    if (zzyh3.zzb != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    zzacp.zzm(obj5, j8, z);
                                    i29 = i19 | i40;
                                    i28 = i22;
                                    i27 = i21;
                                    i30 = i20;
                                    i31 = i14;
                                    i25 = i3;
                                    continue;
                                }
                            case 8:
                                i21 = i37;
                                int i45 = i38;
                                long j9 = j;
                                i20 = i34;
                                i22 = i18;
                                if (i35 != 2) {
                                    i23 = i45;
                                    break;
                                } else {
                                    if ((536870912 & i36) == 0) {
                                        i26 = zzyi.zzg(bArr2, i45, zzyh3);
                                    } else {
                                        i26 = zzyi.zzh(bArr2, i45, zzyh3);
                                    }
                                    unsafe2.putObject(obj5, j9, zzyh3.zzc);
                                    i29 = i19 | i40;
                                    i28 = i22;
                                    i27 = i21;
                                    i30 = i20;
                                    i31 = i14;
                                    i25 = i3;
                                    continue;
                                }
                            case 9:
                                i21 = i37;
                                int i46 = i38;
                                long j10 = j;
                                i20 = i34;
                                i22 = i18;
                                if (i35 != 2) {
                                    i23 = i46;
                                    break;
                                } else {
                                    i26 = zzyi.zzd(zzabf2.zzF(i22), bArr2, i46, i24, zzyh3);
                                    if ((i19 & i40) == 0) {
                                        unsafe2.putObject(obj5, j10, zzyh3.zzc);
                                    } else {
                                        unsafe2.putObject(obj5, j10, zzaad.zzg(unsafe2.getObject(obj5, j10), zzyh3.zzc));
                                    }
                                    i29 = i19 | i40;
                                    i28 = i22;
                                    i27 = i21;
                                    i30 = i20;
                                    i31 = i14;
                                    i25 = i3;
                                    continue;
                                }
                            case 10:
                                i21 = i37;
                                int i47 = i38;
                                long j11 = j;
                                i20 = i34;
                                i22 = i18;
                                if (i35 != 2) {
                                    i23 = i47;
                                    break;
                                } else {
                                    i26 = zzyi.zza(bArr2, i47, zzyh3);
                                    unsafe2.putObject(obj5, j11, zzyh3.zzc);
                                    i29 = i19 | i40;
                                    i28 = i22;
                                    i27 = i21;
                                    i30 = i20;
                                    i31 = i14;
                                    i25 = i3;
                                    continue;
                                }
                            case 12:
                                i21 = i37;
                                int i48 = i38;
                                long j12 = j;
                                i20 = i34;
                                i22 = i18;
                                if (i35 != 0) {
                                    i23 = i48;
                                    break;
                                } else {
                                    i26 = zzyi.zzj(bArr2, i48, zzyh3);
                                    int i49 = zzyh3.zza;
                                    zzaab zzE = zzabf2.zzE(i22);
                                    if (zzE == null || zzE.zza()) {
                                        unsafe2.putInt(obj5, j12, i49);
                                        i29 = i19 | i40;
                                        i28 = i22;
                                        i27 = i21;
                                        i30 = i20;
                                        i31 = i14;
                                        i25 = i3;
                                        break;
                                    } else {
                                        zzd(obj).zzh(i21, Long.valueOf((long) i49));
                                        i29 = i19;
                                        i28 = i22;
                                        i27 = i21;
                                        i30 = i20;
                                        i31 = i14;
                                        i25 = i3;
                                        continue;
                                    }
                                }
                            case 15:
                                i21 = i37;
                                int i50 = i38;
                                i20 = i34;
                                i22 = i18;
                                if (i35 != 0) {
                                    i23 = i50;
                                    break;
                                } else {
                                    i26 = zzyi.zzj(bArr2, i50, zzyh3);
                                    unsafe2.putInt(obj5, j, zzyy.zzs(zzyh3.zza));
                                    i29 = i19 | i40;
                                    i28 = i22;
                                    i27 = i21;
                                    i30 = i20;
                                    i31 = i14;
                                    i25 = i3;
                                    continue;
                                }
                            case 16:
                                if (i35 != 0) {
                                    i21 = i37;
                                    i20 = i34;
                                    i22 = i18;
                                    i23 = i38;
                                    break;
                                } else {
                                    int zzm3 = zzyi.zzm(bArr2, i38, zzyh3);
                                    long j13 = j;
                                    unsafe2.putLong(obj, j, zzyy.zzt(zzyh3.zzb));
                                    i29 = i19 | i40;
                                    i28 = i18;
                                    i26 = zzm3;
                                    i27 = i37;
                                    i30 = i34;
                                    i31 = i14;
                                    i25 = i3;
                                    continue;
                                }
                            default:
                                i21 = i37;
                                i23 = i38;
                                long j14 = j;
                                i20 = i34;
                                i22 = i18;
                                if (i35 == 3) {
                                    long j15 = j14;
                                    i26 = zzyi.zzc(zzabf2.zzF(i22), bArr, i23, i2, (i20 << 3) | 4, zzyh);
                                    if ((i19 & i40) == 0) {
                                        unsafe2.putObject(obj5, j15, zzyh3.zzc);
                                    } else {
                                        unsafe2.putObject(obj5, j15, zzaad.zzg(unsafe2.getObject(obj5, j15), zzyh3.zzc));
                                    }
                                    i29 = i19 | i40;
                                    bArr2 = bArr;
                                    i24 = i2;
                                    i28 = i22;
                                    i27 = i21;
                                    i30 = i20;
                                    i31 = i14;
                                    i25 = i3;
                                    continue;
                                }
                                break;
                        }
                        i12 = i23;
                        i10 = i19;
                        i11 = i22;
                        unsafe = unsafe2;
                        i8 = i21;
                        i9 = i20;
                    } else {
                        int i51 = i37;
                        long j16 = j;
                        int i52 = i34;
                        int i53 = i7;
                        int i54 = i38;
                        if (zzB != 27) {
                            i10 = i29;
                            i16 = i31;
                            int i55 = i54;
                            int i56 = i51;
                            if (zzB <= 49) {
                                int i57 = i55;
                                i8 = i56;
                                i11 = i53;
                                i9 = i52;
                                unsafe = unsafe2;
                                i26 = zzw(obj, bArr, i55, i2, i56, i52, i35, i11, (long) i36, zzB, j16, zzyh);
                                if (i26 != i57) {
                                    zzabf2 = this;
                                    obj5 = obj;
                                    bArr2 = bArr;
                                    i27 = i8;
                                    i24 = i2;
                                    i25 = i3;
                                    zzyh3 = zzyh;
                                    i28 = i11;
                                    i29 = i10;
                                    i30 = i9;
                                    i31 = i16;
                                    unsafe2 = unsafe;
                                } else {
                                    i12 = i26;
                                    i31 = i16;
                                }
                            } else {
                                i15 = i55;
                                i8 = i56;
                                i11 = i53;
                                unsafe = unsafe2;
                                i9 = i52;
                                if (zzB != 50) {
                                    i26 = zzu(obj, bArr, i15, i2, i8, i9, i35, i36, zzB, j16, i11, zzyh);
                                    if (i26 != i15) {
                                        zzabf2 = this;
                                        obj5 = obj;
                                        bArr2 = bArr;
                                        i27 = i8;
                                        i24 = i2;
                                        i25 = i3;
                                        zzyh3 = zzyh;
                                        i28 = i11;
                                        i29 = i10;
                                        i30 = i9;
                                        i31 = i16;
                                        unsafe2 = unsafe;
                                    } else {
                                        i12 = i26;
                                        i31 = i16;
                                    }
                                } else if (i35 == 2) {
                                    i26 = zzt(obj, bArr, i15, i2, i11, j16, zzyh);
                                    if (i26 != i15) {
                                        zzabf2 = this;
                                        obj5 = obj;
                                        bArr2 = bArr;
                                        i27 = i8;
                                        i24 = i2;
                                        i25 = i3;
                                        zzyh3 = zzyh;
                                        i28 = i11;
                                        i29 = i10;
                                        i30 = i9;
                                        i31 = i16;
                                        unsafe2 = unsafe;
                                    } else {
                                        i12 = i26;
                                        i31 = i16;
                                    }
                                }
                            }
                        } else if (i35 == 2) {
                            zzaac zzaac = (zzaac) unsafe2.getObject(obj5, j16);
                            if (!zzaac.zzc()) {
                                int size = zzaac.size();
                                if (size == 0) {
                                    i17 = 10;
                                } else {
                                    i17 = size + size;
                                }
                                zzaac = zzaac.zzd(i17);
                                unsafe2.putObject(obj5, j16, zzaac);
                            }
                            int i58 = i51;
                            i26 = zzyi.zze(zzabf2.zzF(i53), i51, bArr, i54, i2, zzaac, zzyh);
                            bArr2 = bArr;
                            i24 = i2;
                            i28 = i53;
                            i27 = i58;
                            i30 = i52;
                            i29 = i29;
                            i31 = i31;
                            i25 = i3;
                        } else {
                            i10 = i29;
                            i16 = i31;
                            i15 = i54;
                            i11 = i53;
                            unsafe = unsafe2;
                            i8 = i51;
                            i9 = i52;
                        }
                        i12 = i15;
                    }
                    i31 = i14;
                }
                int i59 = i8;
                i4 = i3;
                if (i59 != i4 || i4 == 0) {
                    if (this.zzh) {
                        zzyh2 = zzyh;
                        if (zzyh2.zzd != zzzk.zza()) {
                            i13 = i9;
                            if (zzyh2.zzd.zzb(this.zzg, i13) == null) {
                                zzi2 = zzyi.zzi(i59, bArr, i12, i2, zzd(obj), zzyh);
                                obj4 = obj;
                                i24 = i2;
                                i27 = i59;
                                zzabf2 = this;
                                zzyh3 = zzyh2;
                                i30 = i13;
                                obj5 = obj4;
                                i28 = i11;
                                i29 = i10;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i25 = i4;
                            } else {
                                zzzu zzzu = (zzzu) obj;
                                throw null;
                            }
                        } else {
                            obj4 = obj;
                            i13 = i9;
                        }
                    } else {
                        obj4 = obj;
                        zzyh2 = zzyh;
                        i13 = i9;
                    }
                    zzi2 = zzyi.zzi(i59, bArr, i12, i2, zzd(obj), zzyh);
                    i24 = i2;
                    i27 = i59;
                    zzabf2 = this;
                    zzyh3 = zzyh2;
                    i30 = i13;
                    obj5 = obj4;
                    i28 = i11;
                    i29 = i10;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i25 = i4;
                } else {
                    zzabf = this;
                    obj2 = obj;
                    i26 = i12;
                    i27 = i59;
                    i29 = i10;
                    obj3 = null;
                }
            } else {
                int i60 = i29;
                int i61 = i31;
                unsafe = unsafe2;
                i4 = i25;
                obj2 = obj5;
                zzabf = zzabf2;
                obj3 = null;
            }
        }
        if (i31 != 1048575) {
            unsafe.putInt(obj2, (long) i31, i29);
        }
        for (int i62 = zzabf.zzl; i62 < zzabf.zzm; i62++) {
            zzabf.zzG(obj2, zzabf.zzk[i62], obj3, zzabf.zzo);
        }
        if (i4 == 0) {
            if (i26 != i2) {
                throw zzaaf.zzg();
            }
        } else if (i26 > i2 || i27 != i4) {
            throw zzaaf.zzg();
        }
        return i26;
    }

    public final Object zze() {
        return ((zzzx) this.zzg).zzj(4, (Object) null, (Object) null);
    }

    public final void zzf(Object obj) {
        int i;
        int i2 = this.zzl;
        while (true) {
            i = this.zzm;
            if (i2 >= i) {
                break;
            }
            long zzC = (long) (zzC(this.zzk[i2]) & 1048575);
            Object zzf2 = zzacp.zzf(obj, zzC);
            if (zzf2 != null) {
                ((zzaaw) zzf2).zzc();
                zzacp.zzs(obj, zzC, zzf2);
            }
            i2++;
        }
        int length = this.zzk.length;
        while (i < length) {
            this.zzn.zzb(obj, (long) this.zzk[i]);
            i++;
        }
        this.zzo.zzm(obj);
        if (this.zzh) {
            this.zzp.zze(obj);
        }
    }

    public final void zzg(Object obj, Object obj2) {
        if (obj2 != null) {
            for (int i = 0; i < this.zzc.length; i += 3) {
                int zzC = zzC(i);
                long j = (long) (1048575 & zzC);
                int i2 = this.zzc[i];
                switch (zzB(zzC)) {
                    case 0:
                        if (!zzQ(obj2, i)) {
                            break;
                        } else {
                            zzacp.zzo(obj, j, zzacp.zza(obj2, j));
                            zzM(obj, i);
                            break;
                        }
                    case 1:
                        if (!zzQ(obj2, i)) {
                            break;
                        } else {
                            zzacp.zzp(obj, j, zzacp.zzb(obj2, j));
                            zzM(obj, i);
                            break;
                        }
                    case 2:
                        if (!zzQ(obj2, i)) {
                            break;
                        } else {
                            zzacp.zzr(obj, j, zzacp.zzd(obj2, j));
                            zzM(obj, i);
                            break;
                        }
                    case 3:
                        if (!zzQ(obj2, i)) {
                            break;
                        } else {
                            zzacp.zzr(obj, j, zzacp.zzd(obj2, j));
                            zzM(obj, i);
                            break;
                        }
                    case 4:
                        if (!zzQ(obj2, i)) {
                            break;
                        } else {
                            zzacp.zzq(obj, j, zzacp.zzc(obj2, j));
                            zzM(obj, i);
                            break;
                        }
                    case 5:
                        if (!zzQ(obj2, i)) {
                            break;
                        } else {
                            zzacp.zzr(obj, j, zzacp.zzd(obj2, j));
                            zzM(obj, i);
                            break;
                        }
                    case 6:
                        if (!zzQ(obj2, i)) {
                            break;
                        } else {
                            zzacp.zzq(obj, j, zzacp.zzc(obj2, j));
                            zzM(obj, i);
                            break;
                        }
                    case 7:
                        if (!zzQ(obj2, i)) {
                            break;
                        } else {
                            zzacp.zzm(obj, j, zzacp.zzw(obj2, j));
                            zzM(obj, i);
                            break;
                        }
                    case 8:
                        if (!zzQ(obj2, i)) {
                            break;
                        } else {
                            zzacp.zzs(obj, j, zzacp.zzf(obj2, j));
                            zzM(obj, i);
                            break;
                        }
                    case 9:
                        zzJ(obj, obj2, i);
                        break;
                    case 10:
                        if (!zzQ(obj2, i)) {
                            break;
                        } else {
                            zzacp.zzs(obj, j, zzacp.zzf(obj2, j));
                            zzM(obj, i);
                            break;
                        }
                    case 11:
                        if (!zzQ(obj2, i)) {
                            break;
                        } else {
                            zzacp.zzq(obj, j, zzacp.zzc(obj2, j));
                            zzM(obj, i);
                            break;
                        }
                    case 12:
                        if (!zzQ(obj2, i)) {
                            break;
                        } else {
                            zzacp.zzq(obj, j, zzacp.zzc(obj2, j));
                            zzM(obj, i);
                            break;
                        }
                    case 13:
                        if (!zzQ(obj2, i)) {
                            break;
                        } else {
                            zzacp.zzq(obj, j, zzacp.zzc(obj2, j));
                            zzM(obj, i);
                            break;
                        }
                    case 14:
                        if (!zzQ(obj2, i)) {
                            break;
                        } else {
                            zzacp.zzr(obj, j, zzacp.zzd(obj2, j));
                            zzM(obj, i);
                            break;
                        }
                    case 15:
                        if (!zzQ(obj2, i)) {
                            break;
                        } else {
                            zzacp.zzq(obj, j, zzacp.zzc(obj2, j));
                            zzM(obj, i);
                            break;
                        }
                    case 16:
                        if (!zzQ(obj2, i)) {
                            break;
                        } else {
                            zzacp.zzr(obj, j, zzacp.zzd(obj2, j));
                            zzM(obj, i);
                            break;
                        }
                    case 17:
                        zzJ(obj, obj2, i);
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        this.zzn.zzc(obj, obj2, j);
                        break;
                    case 50:
                        zzabq.zzI(this.zzr, obj, obj2, j);
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                        if (!zzT(obj2, i2, i)) {
                            break;
                        } else {
                            zzacp.zzs(obj, j, zzacp.zzf(obj2, j));
                            zzN(obj, i2, i);
                            break;
                        }
                    case 60:
                        zzK(obj, obj2, i);
                        break;
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                        if (!zzT(obj2, i2, i)) {
                            break;
                        } else {
                            zzacp.zzs(obj, j, zzacp.zzf(obj2, j));
                            zzN(obj, i2, i);
                            break;
                        }
                    case 68:
                        zzK(obj, obj2, i);
                        break;
                }
            }
            zzabq.zzF(this.zzo, obj, obj2);
            if (this.zzh) {
                zzabq.zzE(this.zzp, obj, obj2);
                return;
            }
            return;
        }
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:172:0x05c9 A[LOOP:5: B:170:0x05c5->B:172:0x05c9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x05d6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzh(java.lang.Object r13, com.google.android.gms.internal.p001firebaseauthapi.zzabn r14, com.google.android.gms.internal.p001firebaseauthapi.zzzk r15) throws java.io.IOException {
        /*
            r12 = this;
            r0 = 0
            if (r15 == 0) goto L_0x05da
            com.google.android.gms.internal.firebase-auth-api.zzacf r8 = r12.zzo
            com.google.android.gms.internal.firebase-auth-api.zzzl r9 = r12.zzp
            r1 = r0
            r10 = r1
        L_0x0009:
            int r2 = r14.zzc()     // Catch:{ all -> 0x05c2 }
            int r3 = r12.zzx(r2)     // Catch:{ all -> 0x05c2 }
            if (r3 >= 0) goto L_0x0079
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r2 != r3) goto L_0x002f
            int r14 = r12.zzl
        L_0x001a:
            int r15 = r12.zzm
            if (r14 >= r15) goto L_0x0029
            int[] r15 = r12.zzk
            r15 = r15[r14]
            java.lang.Object r10 = r12.zzG(r13, r15, r10, r8)
            int r14 = r14 + 1
            goto L_0x001a
        L_0x0029:
            if (r10 == 0) goto L_0x05bf
        L_0x002b:
            r8.zzn(r13, r10)
            return
        L_0x002f:
            boolean r3 = r12.zzh     // Catch:{ all -> 0x05c2 }
            if (r3 != 0) goto L_0x0035
            r3 = r0
            goto L_0x003c
        L_0x0035:
            com.google.android.gms.internal.firebase-auth-api.zzabc r3 = r12.zzg     // Catch:{ all -> 0x05c2 }
            java.lang.Object r2 = r9.zzc(r15, r3, r2)     // Catch:{ all -> 0x05c2 }
            r3 = r2
        L_0x003c:
            if (r3 == 0) goto L_0x0053
            if (r1 != 0) goto L_0x0046
            com.google.android.gms.internal.firebase-auth-api.zzzp r1 = r9.zzb(r13)     // Catch:{ all -> 0x05c2 }
            r11 = r1
            goto L_0x0047
        L_0x0046:
            r11 = r1
        L_0x0047:
            r1 = r9
            r2 = r14
            r4 = r15
            r5 = r11
            r6 = r10
            r7 = r8
            java.lang.Object r10 = r1.zzd(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x05c2 }
            r1 = r11
            goto L_0x0009
        L_0x0053:
            r8.zzq(r14)     // Catch:{ all -> 0x05c2 }
            if (r10 != 0) goto L_0x005c
            java.lang.Object r10 = r8.zzc(r13)     // Catch:{ all -> 0x05c2 }
        L_0x005c:
            boolean r2 = r8.zzp(r10, r14)     // Catch:{ all -> 0x0076 }
            if (r2 != 0) goto L_0x0009
            int r14 = r12.zzl
        L_0x0064:
            int r15 = r12.zzm
            if (r14 >= r15) goto L_0x0073
            int[] r15 = r12.zzk
            r15 = r15[r14]
            java.lang.Object r10 = r12.zzG(r13, r15, r10, r8)
            int r14 = r14 + 1
            goto L_0x0064
        L_0x0073:
            if (r10 == 0) goto L_0x05bf
            goto L_0x002b
        L_0x0076:
            r14 = move-exception
            goto L_0x05c3
        L_0x0079:
            int r4 = r12.zzC(r3)     // Catch:{ all -> 0x05c2 }
            int r5 = zzB(r4)     // Catch:{ zzaae -> 0x0599 }
            r6 = 1048575(0xfffff, float:1.469367E-39)
            switch(r5) {
                case 0: goto L_0x0569;
                case 1: goto L_0x055b;
                case 2: goto L_0x054d;
                case 3: goto L_0x053f;
                case 4: goto L_0x0531;
                case 5: goto L_0x0523;
                case 6: goto L_0x0514;
                case 7: goto L_0x0505;
                case 8: goto L_0x04fd;
                case 9: goto L_0x04cc;
                case 10: goto L_0x04bd;
                case 11: goto L_0x04ae;
                case 12: goto L_0x048c;
                case 13: goto L_0x047d;
                case 14: goto L_0x046e;
                case 15: goto L_0x045f;
                case 16: goto L_0x0450;
                case 17: goto L_0x041f;
                case 18: goto L_0x0411;
                case 19: goto L_0x0403;
                case 20: goto L_0x03f5;
                case 21: goto L_0x03e7;
                case 22: goto L_0x03d9;
                case 23: goto L_0x03cb;
                case 24: goto L_0x03bd;
                case 25: goto L_0x03af;
                case 26: goto L_0x0385;
                case 27: goto L_0x0373;
                case 28: goto L_0x0365;
                case 29: goto L_0x0357;
                case 30: goto L_0x0342;
                case 31: goto L_0x0334;
                case 32: goto L_0x0326;
                case 33: goto L_0x0318;
                case 34: goto L_0x030a;
                case 35: goto L_0x02fc;
                case 36: goto L_0x02ee;
                case 37: goto L_0x02e0;
                case 38: goto L_0x02d2;
                case 39: goto L_0x02c4;
                case 40: goto L_0x02b6;
                case 41: goto L_0x02a8;
                case 42: goto L_0x029a;
                case 43: goto L_0x028c;
                case 44: goto L_0x0277;
                case 45: goto L_0x0269;
                case 46: goto L_0x025b;
                case 47: goto L_0x024d;
                case 48: goto L_0x023f;
                case 49: goto L_0x022d;
                case 50: goto L_0x01f7;
                case 51: goto L_0x01e5;
                case 52: goto L_0x01d3;
                case 53: goto L_0x01c1;
                case 54: goto L_0x01af;
                case 55: goto L_0x019d;
                case 56: goto L_0x018b;
                case 57: goto L_0x0179;
                case 58: goto L_0x0167;
                case 59: goto L_0x015f;
                case 60: goto L_0x012e;
                case 61: goto L_0x0120;
                case 62: goto L_0x010e;
                case 63: goto L_0x00e9;
                case 64: goto L_0x00d7;
                case 65: goto L_0x00c5;
                case 66: goto L_0x00b3;
                case 67: goto L_0x00a1;
                case 68: goto L_0x008f;
                default: goto L_0x0087;
            }     // Catch:{ zzaae -> 0x0599 }
        L_0x0087:
            if (r10 != 0) goto L_0x0577
            java.lang.Object r10 = r8.zzf()     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0577
        L_0x008f:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzabo r6 = r12.zzF(r3)     // Catch:{ zzaae -> 0x0599 }
            java.lang.Object r6 = r14.zzr(r6, r15)     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzs(r13, r4, r6)     // Catch:{ zzaae -> 0x0599 }
            r12.zzN(r13, r2, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x00a1:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaae -> 0x0599 }
            long r6 = r14.zzn()     // Catch:{ zzaae -> 0x0599 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzs(r13, r4, r6)     // Catch:{ zzaae -> 0x0599 }
            r12.zzN(r13, r2, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x00b3:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaae -> 0x0599 }
            int r6 = r14.zzi()     // Catch:{ zzaae -> 0x0599 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzs(r13, r4, r6)     // Catch:{ zzaae -> 0x0599 }
            r12.zzN(r13, r2, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x00c5:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaae -> 0x0599 }
            long r6 = r14.zzm()     // Catch:{ zzaae -> 0x0599 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzs(r13, r4, r6)     // Catch:{ zzaae -> 0x0599 }
            r12.zzN(r13, r2, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x00d7:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaae -> 0x0599 }
            int r6 = r14.zzh()     // Catch:{ zzaae -> 0x0599 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzs(r13, r4, r6)     // Catch:{ zzaae -> 0x0599 }
            r12.zzN(r13, r2, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x00e9:
            int r5 = r14.zze()     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzaab r7 = r12.zzE(r3)     // Catch:{ zzaae -> 0x0599 }
            if (r7 == 0) goto L_0x0100
            boolean r7 = r7.zza()     // Catch:{ zzaae -> 0x0599 }
            if (r7 == 0) goto L_0x00fa
            goto L_0x0100
        L_0x00fa:
            java.lang.Object r10 = com.google.android.gms.internal.p001firebaseauthapi.zzabq.zzD(r2, r5, r10, r8)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x0100:
            r4 = r4 & r6
            long r6 = (long) r4     // Catch:{ zzaae -> 0x0599 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzs(r13, r6, r4)     // Catch:{ zzaae -> 0x0599 }
            r12.zzN(r13, r2, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x010e:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaae -> 0x0599 }
            int r6 = r14.zzj()     // Catch:{ zzaae -> 0x0599 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzs(r13, r4, r6)     // Catch:{ zzaae -> 0x0599 }
            r12.zzN(r13, r2, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x0120:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzyu r6 = r14.zzp()     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzs(r13, r4, r6)     // Catch:{ zzaae -> 0x0599 }
            r12.zzN(r13, r2, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x012e:
            boolean r5 = r12.zzT(r13, r2, r3)     // Catch:{ zzaae -> 0x0599 }
            if (r5 == 0) goto L_0x014a
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaae -> 0x0599 }
            java.lang.Object r6 = com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzf(r13, r4)     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzabo r7 = r12.zzF(r3)     // Catch:{ zzaae -> 0x0599 }
            java.lang.Object r7 = r14.zzs(r7, r15)     // Catch:{ zzaae -> 0x0599 }
            java.lang.Object r6 = com.google.android.gms.internal.p001firebaseauthapi.zzaad.zzg(r6, r7)     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzs(r13, r4, r6)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x015a
        L_0x014a:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzabo r6 = r12.zzF(r3)     // Catch:{ zzaae -> 0x0599 }
            java.lang.Object r6 = r14.zzs(r6, r15)     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzs(r13, r4, r6)     // Catch:{ zzaae -> 0x0599 }
            r12.zzM(r13, r3)     // Catch:{ zzaae -> 0x0599 }
        L_0x015a:
            r12.zzN(r13, r2, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x015f:
            r12.zzL(r13, r4, r14)     // Catch:{ zzaae -> 0x0599 }
            r12.zzN(r13, r2, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x0167:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaae -> 0x0599 }
            boolean r6 = r14.zzN()     // Catch:{ zzaae -> 0x0599 }
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzs(r13, r4, r6)     // Catch:{ zzaae -> 0x0599 }
            r12.zzN(r13, r2, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x0179:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaae -> 0x0599 }
            int r6 = r14.zzf()     // Catch:{ zzaae -> 0x0599 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzs(r13, r4, r6)     // Catch:{ zzaae -> 0x0599 }
            r12.zzN(r13, r2, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x018b:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaae -> 0x0599 }
            long r6 = r14.zzk()     // Catch:{ zzaae -> 0x0599 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzs(r13, r4, r6)     // Catch:{ zzaae -> 0x0599 }
            r12.zzN(r13, r2, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x019d:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaae -> 0x0599 }
            int r6 = r14.zzg()     // Catch:{ zzaae -> 0x0599 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzs(r13, r4, r6)     // Catch:{ zzaae -> 0x0599 }
            r12.zzN(r13, r2, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x01af:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaae -> 0x0599 }
            long r6 = r14.zzo()     // Catch:{ zzaae -> 0x0599 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzs(r13, r4, r6)     // Catch:{ zzaae -> 0x0599 }
            r12.zzN(r13, r2, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x01c1:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaae -> 0x0599 }
            long r6 = r14.zzl()     // Catch:{ zzaae -> 0x0599 }
            java.lang.Long r6 = java.lang.Long.valueOf(r6)     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzs(r13, r4, r6)     // Catch:{ zzaae -> 0x0599 }
            r12.zzN(r13, r2, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x01d3:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaae -> 0x0599 }
            float r6 = r14.zzb()     // Catch:{ zzaae -> 0x0599 }
            java.lang.Float r6 = java.lang.Float.valueOf(r6)     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzs(r13, r4, r6)     // Catch:{ zzaae -> 0x0599 }
            r12.zzN(r13, r2, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x01e5:
            r4 = r4 & r6
            long r4 = (long) r4     // Catch:{ zzaae -> 0x0599 }
            double r6 = r14.zza()     // Catch:{ zzaae -> 0x0599 }
            java.lang.Double r6 = java.lang.Double.valueOf(r6)     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzs(r13, r4, r6)     // Catch:{ zzaae -> 0x0599 }
            r12.zzN(r13, r2, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x01f7:
            java.lang.Object r2 = r12.zzH(r3)     // Catch:{ zzaae -> 0x0599 }
            int r3 = r12.zzC(r3)     // Catch:{ zzaae -> 0x0599 }
            r3 = r3 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            java.lang.Object r5 = com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzf(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            if (r5 == 0) goto L_0x021d
            boolean r6 = com.google.android.gms.internal.p001firebaseauthapi.zzaax.zzb(r5)     // Catch:{ zzaae -> 0x0599 }
            if (r6 == 0) goto L_0x0228
            com.google.android.gms.internal.firebase-auth-api.zzaaw r6 = com.google.android.gms.internal.p001firebaseauthapi.zzaaw.zza()     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzaaw r6 = r6.zzb()     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzaax.zzc(r6, r5)     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzs(r13, r3, r6)     // Catch:{ zzaae -> 0x0599 }
            r5 = r6
            goto L_0x0228
        L_0x021d:
            com.google.android.gms.internal.firebase-auth-api.zzaaw r5 = com.google.android.gms.internal.p001firebaseauthapi.zzaaw.zza()     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzaaw r5 = r5.zzb()     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzs(r13, r3, r5)     // Catch:{ zzaae -> 0x0599 }
        L_0x0228:
            com.google.android.gms.internal.firebase-auth-api.zzaaw r5 = (com.google.android.gms.internal.p001firebaseauthapi.zzaaw) r5     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzaav r2 = (com.google.android.gms.internal.p001firebaseauthapi.zzaav) r2     // Catch:{ zzaae -> 0x0599 }
            throw r0     // Catch:{ zzaae -> 0x0599 }
        L_0x022d:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzabo r2 = r12.zzF(r3)     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzaaq r3 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            java.util.List r3 = r3.zza(r13, r4)     // Catch:{ zzaae -> 0x0599 }
            r14.zzC(r3, r2, r15)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x023f:
            com.google.android.gms.internal.firebase-auth-api.zzaaq r2 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            r14.zzJ(r2)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x024d:
            com.google.android.gms.internal.firebase-auth-api.zzaaq r2 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            r14.zzI(r2)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x025b:
            com.google.android.gms.internal.firebase-auth-api.zzaaq r2 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            r14.zzH(r2)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x0269:
            com.google.android.gms.internal.firebase-auth-api.zzaaq r2 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            r14.zzG(r2)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x0277:
            com.google.android.gms.internal.firebase-auth-api.zzaaq r5 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r4 = r4 & r6
            long r6 = (long) r4     // Catch:{ zzaae -> 0x0599 }
            java.util.List r4 = r5.zza(r13, r6)     // Catch:{ zzaae -> 0x0599 }
            r14.zzy(r4)     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzaab r3 = r12.zzE(r3)     // Catch:{ zzaae -> 0x0599 }
            java.lang.Object r10 = com.google.android.gms.internal.p001firebaseauthapi.zzabq.zzC(r2, r4, r3, r10, r8)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x028c:
            com.google.android.gms.internal.firebase-auth-api.zzaaq r2 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            r14.zzL(r2)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x029a:
            com.google.android.gms.internal.firebase-auth-api.zzaaq r2 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            r14.zzv(r2)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x02a8:
            com.google.android.gms.internal.firebase-auth-api.zzaaq r2 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            r14.zzz(r2)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x02b6:
            com.google.android.gms.internal.firebase-auth-api.zzaaq r2 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            r14.zzA(r2)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x02c4:
            com.google.android.gms.internal.firebase-auth-api.zzaaq r2 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            r14.zzD(r2)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x02d2:
            com.google.android.gms.internal.firebase-auth-api.zzaaq r2 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            r14.zzM(r2)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x02e0:
            com.google.android.gms.internal.firebase-auth-api.zzaaq r2 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            r14.zzE(r2)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x02ee:
            com.google.android.gms.internal.firebase-auth-api.zzaaq r2 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            r14.zzB(r2)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x02fc:
            com.google.android.gms.internal.firebase-auth-api.zzaaq r2 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            r14.zzx(r2)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x030a:
            com.google.android.gms.internal.firebase-auth-api.zzaaq r2 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            r14.zzJ(r2)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x0318:
            com.google.android.gms.internal.firebase-auth-api.zzaaq r2 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            r14.zzI(r2)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x0326:
            com.google.android.gms.internal.firebase-auth-api.zzaaq r2 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            r14.zzH(r2)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x0334:
            com.google.android.gms.internal.firebase-auth-api.zzaaq r2 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            r14.zzG(r2)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x0342:
            com.google.android.gms.internal.firebase-auth-api.zzaaq r5 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r4 = r4 & r6
            long r6 = (long) r4     // Catch:{ zzaae -> 0x0599 }
            java.util.List r4 = r5.zza(r13, r6)     // Catch:{ zzaae -> 0x0599 }
            r14.zzy(r4)     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzaab r3 = r12.zzE(r3)     // Catch:{ zzaae -> 0x0599 }
            java.lang.Object r10 = com.google.android.gms.internal.p001firebaseauthapi.zzabq.zzC(r2, r4, r3, r10, r8)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x0357:
            com.google.android.gms.internal.firebase-auth-api.zzaaq r2 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            r14.zzL(r2)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x0365:
            com.google.android.gms.internal.firebase-auth-api.zzaaq r2 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            r14.zzw(r2)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x0373:
            com.google.android.gms.internal.firebase-auth-api.zzabo r2 = r12.zzF(r3)     // Catch:{ zzaae -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzaaq r5 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            java.util.List r3 = r5.zza(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            r14.zzF(r3, r2, r15)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x0385:
            boolean r2 = zzP(r4)     // Catch:{ zzaae -> 0x0599 }
            if (r2 == 0) goto L_0x039d
            com.google.android.gms.internal.firebase-auth-api.zzaaq r2 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            r3 = r14
            com.google.android.gms.internal.firebase-auth-api.zzyz r3 = (com.google.android.gms.internal.p001firebaseauthapi.zzyz) r3     // Catch:{ zzaae -> 0x0599 }
            r4 = 1
            r3.zzK(r2, r4)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x039d:
            com.google.android.gms.internal.firebase-auth-api.zzaaq r2 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            r3 = r14
            com.google.android.gms.internal.firebase-auth-api.zzyz r3 = (com.google.android.gms.internal.p001firebaseauthapi.zzyz) r3     // Catch:{ zzaae -> 0x0599 }
            r4 = 0
            r3.zzK(r2, r4)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x03af:
            com.google.android.gms.internal.firebase-auth-api.zzaaq r2 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            r14.zzv(r2)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x03bd:
            com.google.android.gms.internal.firebase-auth-api.zzaaq r2 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            r14.zzz(r2)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x03cb:
            com.google.android.gms.internal.firebase-auth-api.zzaaq r2 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            r14.zzA(r2)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x03d9:
            com.google.android.gms.internal.firebase-auth-api.zzaaq r2 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            r14.zzD(r2)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x03e7:
            com.google.android.gms.internal.firebase-auth-api.zzaaq r2 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            r14.zzM(r2)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x03f5:
            com.google.android.gms.internal.firebase-auth-api.zzaaq r2 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            r14.zzE(r2)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x0403:
            com.google.android.gms.internal.firebase-auth-api.zzaaq r2 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            r14.zzB(r2)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x0411:
            com.google.android.gms.internal.firebase-auth-api.zzaaq r2 = r12.zzn     // Catch:{ zzaae -> 0x0599 }
            r3 = r4 & r6
            long r3 = (long) r3     // Catch:{ zzaae -> 0x0599 }
            java.util.List r2 = r2.zza(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            r14.zzx(r2)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x041f:
            boolean r2 = r12.zzQ(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            if (r2 == 0) goto L_0x043d
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaae -> 0x0599 }
            java.lang.Object r2 = com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzf(r13, r4)     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzabo r3 = r12.zzF(r3)     // Catch:{ zzaae -> 0x0599 }
            java.lang.Object r3 = r14.zzr(r3, r15)     // Catch:{ zzaae -> 0x0599 }
            java.lang.Object r2 = com.google.android.gms.internal.p001firebaseauthapi.zzaad.zzg(r2, r3)     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzs(r13, r4, r2)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x043d:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzabo r2 = r12.zzF(r3)     // Catch:{ zzaae -> 0x0599 }
            java.lang.Object r2 = r14.zzr(r2, r15)     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzs(r13, r4, r2)     // Catch:{ zzaae -> 0x0599 }
            r12.zzM(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x0450:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaae -> 0x0599 }
            long r6 = r14.zzn()     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzr(r13, r4, r6)     // Catch:{ zzaae -> 0x0599 }
            r12.zzM(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x045f:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaae -> 0x0599 }
            int r2 = r14.zzi()     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzq(r13, r4, r2)     // Catch:{ zzaae -> 0x0599 }
            r12.zzM(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x046e:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaae -> 0x0599 }
            long r6 = r14.zzm()     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzr(r13, r4, r6)     // Catch:{ zzaae -> 0x0599 }
            r12.zzM(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x047d:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaae -> 0x0599 }
            int r2 = r14.zzh()     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzq(r13, r4, r2)     // Catch:{ zzaae -> 0x0599 }
            r12.zzM(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x048c:
            int r5 = r14.zze()     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzaab r7 = r12.zzE(r3)     // Catch:{ zzaae -> 0x0599 }
            if (r7 == 0) goto L_0x04a3
            boolean r7 = r7.zza()     // Catch:{ zzaae -> 0x0599 }
            if (r7 == 0) goto L_0x049d
            goto L_0x04a3
        L_0x049d:
            java.lang.Object r10 = com.google.android.gms.internal.p001firebaseauthapi.zzabq.zzD(r2, r5, r10, r8)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x04a3:
            r2 = r4 & r6
            long r6 = (long) r2     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzq(r13, r6, r5)     // Catch:{ zzaae -> 0x0599 }
            r12.zzM(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x04ae:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaae -> 0x0599 }
            int r2 = r14.zzj()     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzq(r13, r4, r2)     // Catch:{ zzaae -> 0x0599 }
            r12.zzM(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x04bd:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzyu r2 = r14.zzp()     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzs(r13, r4, r2)     // Catch:{ zzaae -> 0x0599 }
            r12.zzM(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x04cc:
            boolean r2 = r12.zzQ(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            if (r2 == 0) goto L_0x04ea
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaae -> 0x0599 }
            java.lang.Object r2 = com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzf(r13, r4)     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzabo r3 = r12.zzF(r3)     // Catch:{ zzaae -> 0x0599 }
            java.lang.Object r3 = r14.zzs(r3, r15)     // Catch:{ zzaae -> 0x0599 }
            java.lang.Object r2 = com.google.android.gms.internal.p001firebaseauthapi.zzaad.zzg(r2, r3)     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzs(r13, r4, r2)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x04ea:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.firebase-auth-api.zzabo r2 = r12.zzF(r3)     // Catch:{ zzaae -> 0x0599 }
            java.lang.Object r2 = r14.zzs(r2, r15)     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzs(r13, r4, r2)     // Catch:{ zzaae -> 0x0599 }
            r12.zzM(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x04fd:
            r12.zzL(r13, r4, r14)     // Catch:{ zzaae -> 0x0599 }
            r12.zzM(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x0505:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaae -> 0x0599 }
            boolean r2 = r14.zzN()     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzm(r13, r4, r2)     // Catch:{ zzaae -> 0x0599 }
            r12.zzM(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x0514:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaae -> 0x0599 }
            int r2 = r14.zzf()     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzq(r13, r4, r2)     // Catch:{ zzaae -> 0x0599 }
            r12.zzM(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x0523:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaae -> 0x0599 }
            long r6 = r14.zzk()     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzr(r13, r4, r6)     // Catch:{ zzaae -> 0x0599 }
            r12.zzM(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x0531:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaae -> 0x0599 }
            int r2 = r14.zzg()     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzq(r13, r4, r2)     // Catch:{ zzaae -> 0x0599 }
            r12.zzM(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x053f:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaae -> 0x0599 }
            long r6 = r14.zzo()     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzr(r13, r4, r6)     // Catch:{ zzaae -> 0x0599 }
            r12.zzM(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x054d:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaae -> 0x0599 }
            long r6 = r14.zzl()     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzr(r13, r4, r6)     // Catch:{ zzaae -> 0x0599 }
            r12.zzM(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x055b:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaae -> 0x0599 }
            float r2 = r14.zzb()     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzp(r13, r4, r2)     // Catch:{ zzaae -> 0x0599 }
            r12.zzM(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x0569:
            r2 = r4 & r6
            long r4 = (long) r2     // Catch:{ zzaae -> 0x0599 }
            double r6 = r14.zza()     // Catch:{ zzaae -> 0x0599 }
            com.google.android.gms.internal.p001firebaseauthapi.zzacp.zzo(r13, r4, r6)     // Catch:{ zzaae -> 0x0599 }
            r12.zzM(r13, r3)     // Catch:{ zzaae -> 0x0599 }
            goto L_0x0593
        L_0x0577:
            boolean r2 = r8.zzp(r10, r14)     // Catch:{ zzaae -> 0x0597, all -> 0x0595 }
            if (r2 != 0) goto L_0x0592
            int r14 = r12.zzl
        L_0x057f:
            int r15 = r12.zzm
            if (r14 >= r15) goto L_0x058e
            int[] r15 = r12.zzk
            r15 = r15[r14]
            java.lang.Object r10 = r12.zzG(r13, r15, r10, r8)
            int r14 = r14 + 1
            goto L_0x057f
        L_0x058e:
            if (r10 == 0) goto L_0x05bf
            goto L_0x002b
        L_0x0592:
        L_0x0593:
            goto L_0x0009
        L_0x0595:
            r14 = move-exception
            goto L_0x05c3
        L_0x0597:
            r2 = move-exception
            goto L_0x059a
        L_0x0599:
            r2 = move-exception
        L_0x059a:
            r8.zzq(r14)     // Catch:{ all -> 0x05c0 }
            if (r10 != 0) goto L_0x05a4
            java.lang.Object r2 = r8.zzc(r13)     // Catch:{ all -> 0x05c0 }
            r10 = r2
        L_0x05a4:
            boolean r2 = r8.zzp(r10, r14)     // Catch:{ all -> 0x05c0 }
            if (r2 != 0) goto L_0x0009
            int r14 = r12.zzl
        L_0x05ac:
            int r15 = r12.zzm
            if (r14 >= r15) goto L_0x05bb
            int[] r15 = r12.zzk
            r15 = r15[r14]
            java.lang.Object r10 = r12.zzG(r13, r15, r10, r8)
            int r14 = r14 + 1
            goto L_0x05ac
        L_0x05bb:
            if (r10 == 0) goto L_0x05bf
            goto L_0x002b
        L_0x05bf:
            return
        L_0x05c0:
            r14 = move-exception
            goto L_0x05c3
        L_0x05c2:
            r14 = move-exception
        L_0x05c3:
            int r15 = r12.zzl
        L_0x05c5:
            int r0 = r12.zzm
            if (r15 >= r0) goto L_0x05d4
            int[] r0 = r12.zzk
            r0 = r0[r15]
            java.lang.Object r10 = r12.zzG(r13, r0, r10, r8)
            int r15 = r15 + 1
            goto L_0x05c5
        L_0x05d4:
            if (r10 == 0) goto L_0x05d9
            r8.zzn(r13, r10)
        L_0x05d9:
            throw r14
        L_0x05da:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzabf.zzh(java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzabn, com.google.android.gms.internal.firebase-auth-api.zzzk):void");
    }

    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzyh zzyh) throws IOException {
        if (this.zzj) {
            zzv(obj, bArr, i, i2, zzyh);
        } else {
            zzc(obj, bArr, i, i2, 0, zzyh);
        }
    }

    public final boolean zzj(Object obj, Object obj2) {
        boolean z;
        int length = this.zzc.length;
        for (int i = 0; i < length; i += 3) {
            int zzC = zzC(i);
            long j = (long) (zzC & 1048575);
            switch (zzB(zzC)) {
                case 0:
                    if (zzO(obj, obj2, i) && Double.doubleToLongBits(zzacp.zza(obj, j)) == Double.doubleToLongBits(zzacp.zza(obj2, j))) {
                        continue;
                    }
                case 1:
                    if (zzO(obj, obj2, i) && Float.floatToIntBits(zzacp.zzb(obj, j)) == Float.floatToIntBits(zzacp.zzb(obj2, j))) {
                        continue;
                    }
                case 2:
                    if (zzO(obj, obj2, i) && zzacp.zzd(obj, j) == zzacp.zzd(obj2, j)) {
                        continue;
                    }
                case 3:
                    if (zzO(obj, obj2, i) && zzacp.zzd(obj, j) == zzacp.zzd(obj2, j)) {
                        continue;
                    }
                case 4:
                    if (zzO(obj, obj2, i) && zzacp.zzc(obj, j) == zzacp.zzc(obj2, j)) {
                        continue;
                    }
                case 5:
                    if (zzO(obj, obj2, i) && zzacp.zzd(obj, j) == zzacp.zzd(obj2, j)) {
                        continue;
                    }
                case 6:
                    if (zzO(obj, obj2, i) && zzacp.zzc(obj, j) == zzacp.zzc(obj2, j)) {
                        continue;
                    }
                case 7:
                    if (zzO(obj, obj2, i) && zzacp.zzw(obj, j) == zzacp.zzw(obj2, j)) {
                        continue;
                    }
                case 8:
                    if (zzO(obj, obj2, i) && zzabq.zzH(zzacp.zzf(obj, j), zzacp.zzf(obj2, j))) {
                        continue;
                    }
                case 9:
                    if (zzO(obj, obj2, i) && zzabq.zzH(zzacp.zzf(obj, j), zzacp.zzf(obj2, j))) {
                        continue;
                    }
                case 10:
                    if (zzO(obj, obj2, i) && zzabq.zzH(zzacp.zzf(obj, j), zzacp.zzf(obj2, j))) {
                        continue;
                    }
                case 11:
                    if (zzO(obj, obj2, i) && zzacp.zzc(obj, j) == zzacp.zzc(obj2, j)) {
                        continue;
                    }
                case 12:
                    if (zzO(obj, obj2, i) && zzacp.zzc(obj, j) == zzacp.zzc(obj2, j)) {
                        continue;
                    }
                case 13:
                    if (zzO(obj, obj2, i) && zzacp.zzc(obj, j) == zzacp.zzc(obj2, j)) {
                        continue;
                    }
                case 14:
                    if (zzO(obj, obj2, i) && zzacp.zzd(obj, j) == zzacp.zzd(obj2, j)) {
                        continue;
                    }
                case 15:
                    if (zzO(obj, obj2, i) && zzacp.zzc(obj, j) == zzacp.zzc(obj2, j)) {
                        continue;
                    }
                case 16:
                    if (zzO(obj, obj2, i) && zzacp.zzd(obj, j) == zzacp.zzd(obj2, j)) {
                        continue;
                    }
                case 17:
                    if (zzO(obj, obj2, i) && zzabq.zzH(zzacp.zzf(obj, j), zzacp.zzf(obj2, j))) {
                        continue;
                    }
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    z = zzabq.zzH(zzacp.zzf(obj, j), zzacp.zzf(obj2, j));
                    break;
                case 50:
                    z = zzabq.zzH(zzacp.zzf(obj, j), zzacp.zzf(obj2, j));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                case 60:
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                case 68:
                    long zzz = (long) (zzz(i) & 1048575);
                    if (zzacp.zzc(obj, zzz) == zzacp.zzc(obj2, zzz) && zzabq.zzH(zzacp.zzf(obj, j), zzacp.zzf(obj2, j))) {
                        continue;
                    }
            }
            if (!z) {
                return false;
            }
        }
        if (!this.zzo.zzd(obj).equals(this.zzo.zzd(obj2))) {
            return false;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzp.zza(obj);
        this.zzp.zza(obj2);
        throw null;
    }

    public final boolean zzk(Object obj) {
        int i;
        int i2;
        Object obj2 = obj;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (i5 < this.zzl) {
            int i6 = this.zzk[i5];
            int i7 = this.zzc[i6];
            int zzC = zzC(i6);
            int i8 = this.zzc[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 == i3) {
                i2 = i3;
                i = i4;
            } else if (i9 != 1048575) {
                i = zzb.getInt(obj2, (long) i9);
                i2 = i9;
            } else {
                i = i4;
                i2 = i9;
            }
            if ((268435456 & zzC) != 0 && !zzR(obj, i6, i2, i, i10)) {
                return false;
            }
            switch (zzB(zzC)) {
                case 9:
                case 17:
                    if (zzR(obj, i6, i2, i, i10) && !zzS(obj2, zzC, zzF(i6))) {
                        return false;
                    }
                case 27:
                case 49:
                    List list = (List) zzacp.zzf(obj2, (long) (zzC & 1048575));
                    if (!list.isEmpty()) {
                        zzabo zzF = zzF(i6);
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            if (!zzF.zzk(list.get(i11))) {
                                return false;
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                case 50:
                    if (((zzaaw) zzacp.zzf(obj2, (long) (zzC & 1048575))).isEmpty()) {
                        break;
                    } else {
                        zzaav zzaav = (zzaav) zzH(i6);
                        throw null;
                    }
                case 60:
                case 68:
                    if (zzT(obj2, i7, i6) && !zzS(obj2, zzC, zzF(i6))) {
                        return false;
                    }
            }
            i5++;
            i3 = i2;
            i4 = i;
        }
        if (!this.zzh) {
            return true;
        }
        this.zzp.zza(obj2);
        throw null;
    }

    public final void zzn(Object obj, zzzg zzzg) throws IOException {
        if (!this.zzj) {
            zzV(obj, zzzg);
        } else if (!this.zzh) {
            int length = this.zzc.length;
            for (int i = 0; i < length; i += 3) {
                int zzC = zzC(i);
                int i2 = this.zzc[i];
                switch (zzB(zzC)) {
                    case 0:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzzg.zzf(i2, zzacp.zza(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 1:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzzg.zzo(i2, zzacp.zzb(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 2:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzzg.zzt(i2, zzacp.zzd(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 3:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzzg.zzJ(i2, zzacp.zzd(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 4:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzzg.zzr(i2, zzacp.zzc(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 5:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzzg.zzm(i2, zzacp.zzd(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 6:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzzg.zzk(i2, zzacp.zzc(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 7:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzzg.zzb(i2, zzacp.zzw(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 8:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzX(i2, zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg);
                            break;
                        }
                    case 9:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzzg.zzv(i2, zzacp.zzf(obj, (long) (zzC & 1048575)), zzF(i));
                            break;
                        }
                    case 10:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzzg.zzd(i2, (zzyu) zzacp.zzf(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 11:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzzg.zzH(i2, zzacp.zzc(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 12:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzzg.zzi(i2, zzacp.zzc(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 13:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzzg.zzw(i2, zzacp.zzc(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 14:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzzg.zzy(i2, zzacp.zzd(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 15:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzzg.zzA(i2, zzacp.zzc(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 16:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzzg.zzC(i2, zzacp.zzd(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 17:
                        if (!zzQ(obj, i)) {
                            break;
                        } else {
                            zzzg.zzq(i2, zzacp.zzf(obj, (long) (zzC & 1048575)), zzF(i));
                            break;
                        }
                    case 18:
                        zzabq.zzL(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg, false);
                        break;
                    case 19:
                        zzabq.zzP(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg, false);
                        break;
                    case 20:
                        zzabq.zzS(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg, false);
                        break;
                    case 21:
                        zzabq.zzaa(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg, false);
                        break;
                    case 22:
                        zzabq.zzR(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg, false);
                        break;
                    case 23:
                        zzabq.zzO(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg, false);
                        break;
                    case 24:
                        zzabq.zzN(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg, false);
                        break;
                    case 25:
                        zzabq.zzJ(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg, false);
                        break;
                    case 26:
                        zzabq.zzY(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg);
                        break;
                    case 27:
                        zzabq.zzT(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg, zzF(i));
                        break;
                    case 28:
                        zzabq.zzK(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg);
                        break;
                    case 29:
                        zzabq.zzZ(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg, false);
                        break;
                    case 30:
                        zzabq.zzM(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg, false);
                        break;
                    case 31:
                        zzabq.zzU(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg, false);
                        break;
                    case 32:
                        zzabq.zzV(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg, false);
                        break;
                    case 33:
                        zzabq.zzW(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg, false);
                        break;
                    case 34:
                        zzabq.zzX(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg, false);
                        break;
                    case 35:
                        zzabq.zzL(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg, true);
                        break;
                    case 36:
                        zzabq.zzP(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg, true);
                        break;
                    case 37:
                        zzabq.zzS(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg, true);
                        break;
                    case 38:
                        zzabq.zzaa(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg, true);
                        break;
                    case 39:
                        zzabq.zzR(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg, true);
                        break;
                    case 40:
                        zzabq.zzO(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg, true);
                        break;
                    case 41:
                        zzabq.zzN(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg, true);
                        break;
                    case 42:
                        zzabq.zzJ(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg, true);
                        break;
                    case 43:
                        zzabq.zzZ(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg, true);
                        break;
                    case 44:
                        zzabq.zzM(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg, true);
                        break;
                    case 45:
                        zzabq.zzU(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg, true);
                        break;
                    case 46:
                        zzabq.zzV(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg, true);
                        break;
                    case 47:
                        zzabq.zzW(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg, true);
                        break;
                    case 48:
                        zzabq.zzX(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg, true);
                        break;
                    case 49:
                        zzabq.zzQ(i2, (List) zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg, zzF(i));
                        break;
                    case 50:
                        zzW(zzzg, i2, zzacp.zzf(obj, (long) (zzC & 1048575)), i);
                        break;
                    case 51:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzzg.zzf(i2, zzo(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 52:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzzg.zzo(i2, zzp(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 53:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzzg.zzt(i2, zzD(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 54:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzzg.zzJ(i2, zzD(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 55:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzzg.zzr(i2, zzs(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 56:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzzg.zzm(i2, zzD(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 57:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzzg.zzk(i2, zzs(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 58:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzzg.zzb(i2, zzU(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 59:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzX(i2, zzacp.zzf(obj, (long) (zzC & 1048575)), zzzg);
                            break;
                        }
                    case 60:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzzg.zzv(i2, zzacp.zzf(obj, (long) (zzC & 1048575)), zzF(i));
                            break;
                        }
                    case 61:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzzg.zzd(i2, (zzyu) zzacp.zzf(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 62:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzzg.zzH(i2, zzs(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 63:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzzg.zzi(i2, zzs(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 64:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzzg.zzw(i2, zzs(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 65:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzzg.zzy(i2, zzD(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 66:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzzg.zzA(i2, zzs(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 67:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzzg.zzC(i2, zzD(obj, (long) (zzC & 1048575)));
                            break;
                        }
                    case 68:
                        if (!zzT(obj, i2, i)) {
                            break;
                        } else {
                            zzzg.zzq(i2, zzacp.zzf(obj, (long) (zzC & 1048575)), zzF(i));
                            break;
                        }
                }
            }
            zzacf zzacf = this.zzo;
            zzacf.zzr(zzacf.zzd(obj), zzzg);
        } else {
            this.zzp.zza(obj);
            throw null;
        }
    }
}
