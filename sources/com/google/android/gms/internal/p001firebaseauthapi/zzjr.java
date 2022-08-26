package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzjr extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzjr zzb;
    private zzju zze;
    /* access modifiers changed from: private */
    public int zzf;
    private int zzg;

    static {
        zzjr zzjr = new zzjr();
        zzb = zzjr;
        zzzx.zzE(zzjr.class, zzjr);
    }

    private zzjr() {
    }

    public static zzjq zzb() {
        return (zzjq) zzb.zzt();
    }

    public static zzjr zzd() {
        return zzb;
    }

    public static zzjr zze(zzyu zzyu, zzzk zzzk) throws zzaaf {
        return (zzjr) zzzx.zzw(zzb, zzyu, zzzk);
    }

    static /* synthetic */ void zzg(zzjr zzjr, zzju zzju) {
        zzju.getClass();
        zzjr.zze = zzju;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzju zzf() {
        zzju zzju = this.zze;
        return zzju == null ? zzju.zzd() : zzju;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 2:
                return zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf", "zzg"});
            case 3:
                return new zzjr();
            case 4:
                return new zzjq((zzjp) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
