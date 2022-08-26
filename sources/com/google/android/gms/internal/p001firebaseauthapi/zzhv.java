package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzhv extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzhv zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public zzyu zzf = zzyu.zzb;

    static {
        zzhv zzhv = new zzhv();
        zzb = zzhv;
        zzzx.zzE(zzhv.class, zzhv);
    }

    private zzhv() {
    }

    public static zzhu zzb() {
        return (zzhu) zzb.zzt();
    }

    public static zzhv zzd(zzyu zzyu, zzzk zzzk) throws zzaaf {
        return (zzhv) zzzx.zzw(zzb, zzyu, zzzk);
    }

    public final int zza() {
        return this.zze;
    }

    public final zzyu zze() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 2:
                return zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
            case 3:
                return new zzhv();
            case 4:
                return new zzhu((zzht) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
