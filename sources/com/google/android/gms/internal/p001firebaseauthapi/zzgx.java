package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzgx extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzgx zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzhd zzf;
    /* access modifiers changed from: private */
    public zzyu zzg = zzyu.zzb;

    static {
        zzgx zzgx = new zzgx();
        zzb = zzgx;
        zzzx.zzE(zzgx.class, zzgx);
    }

    private zzgx() {
    }

    public static zzgw zzb() {
        return (zzgw) zzb.zzt();
    }

    public static zzgx zzd() {
        return zzb;
    }

    public static zzgx zze(zzyu zzyu, zzzk zzzk) throws zzaaf {
        return (zzgx) zzzx.zzw(zzb, zzyu, zzzk);
    }

    static /* synthetic */ void zzi(zzgx zzgx, zzhd zzhd) {
        zzhd.getClass();
        zzgx.zzf = zzhd;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzhd zzf() {
        zzhd zzhd = this.zzf;
        return zzhd == null ? zzhd.zzd() : zzhd;
    }

    public final zzyu zzg() {
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
                return new zzgx();
            case 4:
                return new zzgw((zzgv) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
