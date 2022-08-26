package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzjb extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzjb zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zziv zzf;
    /* access modifiers changed from: private */
    public zzyu zzg = zzyu.zzb;
    /* access modifiers changed from: private */
    public zzyu zzh = zzyu.zzb;

    static {
        zzjb zzjb = new zzjb();
        zzb = zzjb;
        zzzx.zzE(zzjb.class, zzjb);
    }

    private zzjb() {
    }

    public static zzja zzc() {
        return (zzja) zzb.zzt();
    }

    public static zzjb zze() {
        return zzb;
    }

    public static zzjb zzf(zzyu zzyu, zzzk zzzk) throws zzaaf {
        return (zzjb) zzzx.zzw(zzb, zzyu, zzzk);
    }

    static /* synthetic */ void zzk(zzjb zzjb, zziv zziv) {
        zziv.getClass();
        zzjb.zzf = zziv;
    }

    public final int zza() {
        return this.zze;
    }

    public final zziv zzb() {
        zziv zziv = this.zzf;
        return zziv == null ? zziv.zzd() : zziv;
    }

    public final zzyu zzg() {
        return this.zzg;
    }

    public final zzyu zzh() {
        return this.zzh;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 2:
                return zzD(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 3:
                return new zzjb();
            case 4:
                return new zzja((zziz) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
