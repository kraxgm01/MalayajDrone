package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkf  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzkf extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzkf zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzki zzf;
    /* access modifiers changed from: private */
    public zzyu zzg = zzyu.zzb;

    static {
        zzkf zzkf = new zzkf();
        zzb = zzkf;
        zzzx.zzE(zzkf.class, zzkf);
    }

    private zzkf() {
    }

    public static zzke zzb() {
        return (zzke) zzb.zzt();
    }

    public static zzkf zzd(zzyu zzyu, zzzk zzzk) throws zzaaf {
        return (zzkf) zzzx.zzw(zzb, zzyu, zzzk);
    }

    static /* synthetic */ void zzh(zzkf zzkf, zzki zzki) {
        zzki.getClass();
        zzkf.zzf = zzki;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzki zze() {
        zzki zzki = this.zzf;
        return zzki == null ? zzki.zze() : zzki;
    }

    public final zzyu zzf() {
        return this.zzg;
    }

    public final boolean zzk() {
        return this.zzf != null;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 2:
                return zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"zze", "zzf", "zzg"});
            case 3:
                return new zzkf();
            case 4:
                return new zzke((zzkd) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
