package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzgr extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzgr zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgx zzf;
    private zzjo zzg;

    static {
        zzgr zzgr = new zzgr();
        zzb = zzgr;
        zzzx.zzE(zzgr.class, zzgr);
    }

    private zzgr() {
    }

    public static zzgq zzb() {
        return (zzgq) zzb.zzt();
    }

    public static zzgr zzd(zzyu zzyu, zzzk zzzk) throws zzaaf {
        return (zzgr) zzzx.zzw(zzb, zzyu, zzzk);
    }

    static /* synthetic */ void zzh(zzgr zzgr, zzgx zzgx) {
        zzgx.getClass();
        zzgr.zzf = zzgx;
    }

    static /* synthetic */ void zzi(zzgr zzgr, zzjo zzjo) {
        zzjo.getClass();
        zzgr.zzg = zzjo;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzgx zze() {
        zzgx zzgx = this.zzf;
        return zzgx == null ? zzgx.zzd() : zzgx;
    }

    public final zzjo zzf() {
        zzjo zzjo = this.zzg;
        return zzjo == null ? zzjo.zzd() : zzjo;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 2:
                return zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"zze", "zzf", "zzg"});
            case 3:
                return new zzgr();
            case 4:
                return new zzgq((zzgp) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
