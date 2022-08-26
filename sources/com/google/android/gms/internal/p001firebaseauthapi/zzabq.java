package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzabq {
    private static final Class zza;
    private static final zzacf zzb = zzab(false);
    private static final zzacf zzc = zzab(true);
    private static final zzacf zzd = new zzach();

    static {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.GeneratedMessage");
        } catch (Throwable th) {
            cls = null;
        }
        zza = cls;
    }

    public static zzacf zzA() {
        return zzc;
    }

    public static zzacf zzB() {
        return zzd;
    }

    static Object zzC(int i, List list, zzaab zzaab, Object obj, zzacf zzacf) {
        if (zzaab == null) {
            return obj;
        }
        if (list instanceof RandomAccess) {
            int size = list.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                int intValue = ((Integer) list.get(i3)).intValue();
                if (zzaab.zza()) {
                    if (i3 != i2) {
                        list.set(i2, Integer.valueOf(intValue));
                    }
                    i2++;
                } else {
                    obj = zzD(i, intValue, obj, zzacf);
                }
            }
            if (i2 != size) {
                list.subList(i2, size).clear();
                return obj;
            }
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                int intValue2 = ((Integer) it.next()).intValue();
                if (!zzaab.zza()) {
                    obj = zzD(i, intValue2, obj, zzacf);
                    it.remove();
                }
            }
        }
        return obj;
    }

    static Object zzD(int i, int i2, Object obj, zzacf zzacf) {
        if (obj == null) {
            obj = zzacf.zzf();
        }
        zzacf.zzl(obj, i, (long) i2);
        return obj;
    }

    static void zzE(zzzl zzzl, Object obj, Object obj2) {
        zzzl.zza(obj2);
        throw null;
    }

    static void zzF(zzacf zzacf, Object obj, Object obj2) {
        zzacf.zzo(obj, zzacf.zze(zzacf.zzd(obj), zzacf.zzd(obj2)));
    }

    public static void zzG(Class cls) {
        Class cls2;
        if (!zzzx.class.isAssignableFrom(cls) && (cls2 = zza) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    static boolean zzH(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    static void zzI(zzaax zzaax, Object obj, Object obj2, long j) {
        zzacp.zzs(obj, j, zzaax.zzc(zzacp.zzf(obj, j), zzacp.zzf(obj2, j)));
    }

    public static void zzJ(int i, List list, zzzg zzzg, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzzg.zzc(i, list, z);
        }
    }

    public static void zzK(int i, List list, zzzg zzzg) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzzg.zze(i, list);
        }
    }

    public static void zzL(int i, List list, zzzg zzzg, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzzg.zzg(i, list, z);
        }
    }

    public static void zzM(int i, List list, zzzg zzzg, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzzg.zzj(i, list, z);
        }
    }

    public static void zzN(int i, List list, zzzg zzzg, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzzg.zzl(i, list, z);
        }
    }

    public static void zzO(int i, List list, zzzg zzzg, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzzg.zzn(i, list, z);
        }
    }

    public static void zzP(int i, List list, zzzg zzzg, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzzg.zzp(i, list, z);
        }
    }

    public static void zzQ(int i, List list, zzzg zzzg, zzabo zzabo) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzzg.zzq(i, list.get(i2), zzabo);
            }
        }
    }

    public static void zzR(int i, List list, zzzg zzzg, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzzg.zzs(i, list, z);
        }
    }

    public static void zzS(int i, List list, zzzg zzzg, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzzg.zzu(i, list, z);
        }
    }

    public static void zzT(int i, List list, zzzg zzzg, zzabo zzabo) throws IOException {
        if (list != null && !list.isEmpty()) {
            for (int i2 = 0; i2 < list.size(); i2++) {
                zzzg.zzv(i, list.get(i2), zzabo);
            }
        }
    }

    public static void zzU(int i, List list, zzzg zzzg, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzzg.zzx(i, list, z);
        }
    }

    public static void zzV(int i, List list, zzzg zzzg, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzzg.zzz(i, list, z);
        }
    }

    public static void zzW(int i, List list, zzzg zzzg, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzzg.zzB(i, list, z);
        }
    }

    public static void zzX(int i, List list, zzzg zzzg, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzzg.zzD(i, list, z);
        }
    }

    public static void zzY(int i, List list, zzzg zzzg) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzzg.zzG(i, list);
        }
    }

    public static void zzZ(int i, List list, zzzg zzzg, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzzg.zzI(i, list, z);
        }
    }

    static int zza(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzzf.zzE(i << 3) + 1);
    }

    public static void zzaa(int i, List list, zzzg zzzg, boolean z) throws IOException {
        if (list != null && !list.isEmpty()) {
            zzzg.zzK(i, list, z);
        }
    }

    private static zzacf zzab(boolean z) {
        Class<?> cls;
        try {
            cls = Class.forName("com.google.protobuf.UnknownFieldSetSchema");
        } catch (Throwable th) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            return (zzacf) cls.getConstructor(new Class[]{Boolean.TYPE}).newInstance(new Object[]{Boolean.valueOf(z)});
        } catch (Throwable th2) {
            return null;
        }
    }

    static int zzb(List list) {
        return list.size();
    }

    static int zzc(int i, List list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzD = size * zzzf.zzD(i);
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzD += zzzf.zzw((zzyu) list.get(i2));
        }
        return zzD;
    }

    static int zzd(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zze(list) + (size * zzzf.zzD(i));
    }

    static int zze(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzzy) {
            zzzy zzzy = (zzzy) list;
            i = 0;
            while (i2 < size) {
                i += zzzf.zzy(zzzy.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzzf.zzy(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzf(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzzf.zzE(i << 3) + 4);
    }

    static int zzg(List list) {
        return list.size() * 4;
    }

    static int zzh(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (zzzf.zzE(i << 3) + 8);
    }

    static int zzi(List list) {
        return list.size() * 8;
    }

    static int zzj(int i, List list, zzabo zzabo) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            i2 += zzzf.zzx(i, (zzabc) list.get(i3), zzabo);
        }
        return i2;
    }

    static int zzk(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzl(list) + (size * zzzf.zzD(i));
    }

    static int zzl(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzzy) {
            zzzy zzzy = (zzzy) list;
            i = 0;
            while (i2 < size) {
                i += zzzf.zzy(zzzy.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzzf.zzy(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzm(int i, List list, boolean z) {
        if (list.size() == 0) {
            return 0;
        }
        return zzn(list) + (list.size() * zzzf.zzD(i));
    }

    static int zzn(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaar) {
            zzaar zzaar = (zzaar) list;
            i = 0;
            while (i2 < size) {
                i += zzzf.zzF(zzaar.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzzf.zzF(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    static int zzo(int i, Object obj, zzabo zzabo) {
        if (!(obj instanceof zzaai)) {
            return zzzf.zzE(i << 3) + zzzf.zzA((zzabc) obj, zzabo);
        }
        int zzE = zzzf.zzE(i << 3);
        int zza2 = ((zzaai) obj).zza();
        return zzE + zzzf.zzE(zza2) + zza2;
    }

    static int zzp(int i, List list, zzabo zzabo) {
        int i2;
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int zzD = zzzf.zzD(i) * size;
        for (int i3 = 0; i3 < size; i3++) {
            Object obj = list.get(i3);
            if (obj instanceof zzaai) {
                i2 = zzzf.zzz((zzaai) obj);
            } else {
                i2 = zzzf.zzA((zzabc) obj, zzabo);
            }
            zzD += i2;
        }
        return zzD;
    }

    static int zzq(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzr(list) + (size * zzzf.zzD(i));
    }

    static int zzr(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzzy) {
            zzzy zzzy = (zzzy) list;
            i = 0;
            while (i2 < size) {
                int zze = zzzy.zze(i2);
                i += zzzf.zzE((zze >> 31) ^ (zze + zze));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                int intValue = ((Integer) list.get(i2)).intValue();
                i3 = i + zzzf.zzE((intValue >> 31) ^ (intValue + intValue));
                i2++;
            }
        }
        return i;
    }

    static int zzs(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzt(list) + (size * zzzf.zzD(i));
    }

    static int zzt(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaar) {
            zzaar zzaar = (zzaar) list;
            i = 0;
            while (i2 < size) {
                long zze = zzaar.zze(i2);
                i += zzzf.zzF((zze >> 63) ^ (zze + zze));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                long longValue = ((Long) list.get(i2)).longValue();
                i3 = i + zzzf.zzF((longValue >> 63) ^ (longValue + longValue));
                i2++;
            }
        }
        return i;
    }

    static int zzu(int i, List list) {
        int i2;
        int i3;
        int size = list.size();
        int i4 = 0;
        if (size == 0) {
            return 0;
        }
        int zzD = zzzf.zzD(i) * size;
        if (list instanceof zzaak) {
            zzaak zzaak = (zzaak) list;
            while (i4 < size) {
                Object zzf = zzaak.zzf(i4);
                if (zzf instanceof zzyu) {
                    i3 = zzzf.zzw((zzyu) zzf);
                } else {
                    i3 = zzzf.zzC((String) zzf);
                }
                zzD += i3;
                i4++;
            }
        } else {
            while (i4 < size) {
                Object obj = list.get(i4);
                if (obj instanceof zzyu) {
                    i2 = zzzf.zzw((zzyu) obj);
                } else {
                    i2 = zzzf.zzC((String) obj);
                }
                zzD += i2;
                i4++;
            }
        }
        return zzD;
    }

    static int zzv(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzw(list) + (size * zzzf.zzD(i));
    }

    static int zzw(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzzy) {
            zzzy zzzy = (zzzy) list;
            i = 0;
            while (i2 < size) {
                i += zzzf.zzE(zzzy.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzzf.zzE(((Integer) list.get(i2)).intValue());
                i2++;
            }
        }
        return i;
    }

    static int zzx(int i, List list, boolean z) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return zzy(list) + (size * zzzf.zzD(i));
    }

    static int zzy(List list) {
        int i;
        int size = list.size();
        int i2 = 0;
        if (size == 0) {
            return 0;
        }
        if (list instanceof zzaar) {
            zzaar zzaar = (zzaar) list;
            i = 0;
            while (i2 < size) {
                i += zzzf.zzF(zzaar.zze(i2));
                i2++;
            }
        } else {
            int i3 = 0;
            while (i2 < size) {
                i3 = i + zzzf.zzF(((Long) list.get(i2)).longValue());
                i2++;
            }
        }
        return i;
    }

    public static zzacf zzz() {
        return zzb;
    }
}
