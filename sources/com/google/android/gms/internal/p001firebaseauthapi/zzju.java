package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzju  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzju extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzju zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzju zzju = new zzju();
        zzb = zzju;
        zzzx.zzE(zzju.class, zzju);
    }

    private zzju() {
    }

    public static zzjt zzb() {
        return (zzjt) zzb.zzt();
    }

    public static zzju zzd() {
        return zzb;
    }

    public final int zza() {
        return this.zzf;
    }

    public final int zzf() {
        int zzb2 = zzjl.zzb(this.zze);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 2:
                return zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"zze", "zzf"});
            case 3:
                return new zzju();
            case 4:
                return new zzjt((zzjs) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
