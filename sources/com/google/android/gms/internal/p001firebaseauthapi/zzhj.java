package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzhj extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzhj zzb;
    private zzhm zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzhj zzhj = new zzhj();
        zzb = zzhj;
        zzzx.zzE(zzhj.class, zzhj);
    }

    private zzhj() {
    }

    public static zzhi zzb() {
        return (zzhi) zzb.zzt();
    }

    public static zzhj zzd(zzyu zzyu, zzzk zzzk) throws zzaaf {
        return (zzhj) zzzx.zzw(zzb, zzyu, zzzk);
    }

    static /* synthetic */ void zzf(zzhj zzhj, zzhm zzhm) {
        zzhm.getClass();
        zzhj.zze = zzhm;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzhm zze() {
        zzhm zzhm = this.zze;
        return zzhm == null ? zzhm.zzd() : zzhm;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 2:
                return zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
            case 3:
                return new zzhj();
            case 4:
                return new zzhi((zzhh) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
