package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgi  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzgi extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzgi zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public zzyu zzf = zzyu.zzb;
    private zzgo zzg;

    static {
        zzgi zzgi = new zzgi();
        zzb = zzgi;
        zzzx.zzE(zzgi.class, zzgi);
    }

    private zzgi() {
    }

    public static zzgh zzb() {
        return (zzgh) zzb.zzt();
    }

    public static zzgi zzd(zzyu zzyu, zzzk zzzk) throws zzaaf {
        return (zzgi) zzzx.zzw(zzb, zzyu, zzzk);
    }

    static /* synthetic */ void zzi(zzgi zzgi, zzgo zzgo) {
        zzgo.getClass();
        zzgi.zzg = zzgo;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzgo zze() {
        zzgo zzgo = this.zzg;
        return zzgo == null ? zzgo.zzd() : zzgo;
    }

    public final zzyu zzf() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 2:
                return zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"zze", "zzf", "zzg"});
            case 3:
                return new zzgi();
            case 4:
                return new zzgh((zzgg) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
