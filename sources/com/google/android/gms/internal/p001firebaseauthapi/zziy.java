package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zziy  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zziy extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zziy zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzjb zzf;
    /* access modifiers changed from: private */
    public zzyu zzg = zzyu.zzb;

    static {
        zziy zziy = new zziy();
        zzb = zziy;
        zzzx.zzE(zziy.class, zziy);
    }

    private zziy() {
    }

    public static zzix zzb() {
        return (zzix) zzb.zzt();
    }

    public static zziy zzd(zzyu zzyu, zzzk zzzk) throws zzaaf {
        return (zziy) zzzx.zzw(zzb, zzyu, zzzk);
    }

    static /* synthetic */ void zzh(zziy zziy, zzjb zzjb) {
        zzjb.getClass();
        zziy.zzf = zzjb;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzjb zze() {
        zzjb zzjb = this.zzf;
        return zzjb == null ? zzjb.zze() : zzjb;
    }

    public final zzyu zzf() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 2:
                return zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
            case 3:
                return new zziy();
            case 4:
                return new zzix((zziw) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
