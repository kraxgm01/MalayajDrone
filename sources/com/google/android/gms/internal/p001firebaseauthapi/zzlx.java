package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzlx extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzlx zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public zzyu zzf = zzyu.zzb;

    static {
        zzlx zzlx = new zzlx();
        zzb = zzlx;
        zzzx.zzE(zzlx.class, zzlx);
    }

    private zzlx() {
    }

    public static zzlw zzb() {
        return (zzlw) zzb.zzt();
    }

    public static zzlx zzd(zzyu zzyu, zzzk zzzk) throws zzaaf {
        return (zzlx) zzzx.zzw(zzb, zzyu, zzzk);
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
                return new zzlx();
            case 4:
                return new zzlw((zzlv) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
