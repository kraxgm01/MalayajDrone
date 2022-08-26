package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhg  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzhg extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzhg zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzhm zzf;
    /* access modifiers changed from: private */
    public zzyu zzg = zzyu.zzb;

    static {
        zzhg zzhg = new zzhg();
        zzb = zzhg;
        zzzx.zzE(zzhg.class, zzhg);
    }

    private zzhg() {
    }

    public static zzhf zzb() {
        return (zzhf) zzb.zzt();
    }

    public static zzhg zzd(zzyu zzyu, zzzk zzzk) throws zzaaf {
        return (zzhg) zzzx.zzw(zzb, zzyu, zzzk);
    }

    static /* synthetic */ void zzh(zzhg zzhg, zzhm zzhm) {
        zzhm.getClass();
        zzhg.zzf = zzhm;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzhm zze() {
        zzhm zzhm = this.zzf;
        return zzhm == null ? zzhm.zzd() : zzhm;
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
                return new zzhg();
            case 4:
                return new zzhf((zzhe) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
