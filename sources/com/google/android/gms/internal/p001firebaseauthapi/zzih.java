package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzih  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzih extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzih zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public zzyu zzf = zzyu.zzb;

    static {
        zzih zzih = new zzih();
        zzb = zzih;
        zzzx.zzE(zzih.class, zzih);
    }

    private zzih() {
    }

    public static zzig zzb() {
        return (zzig) zzb.zzt();
    }

    public static zzih zzd(zzyu zzyu, zzzk zzzk) throws zzaaf {
        return (zzih) zzzx.zzw(zzb, zzyu, zzzk);
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
                return zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
            case 3:
                return new zzih();
            case 4:
                return new zzig((zzif) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
