package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzki  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzki extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzki zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzkc zzf;
    /* access modifiers changed from: private */
    public zzyu zzg = zzyu.zzb;

    static {
        zzki zzki = new zzki();
        zzb = zzki;
        zzzx.zzE(zzki.class, zzki);
    }

    private zzki() {
    }

    public static zzkh zzc() {
        return (zzkh) zzb.zzt();
    }

    public static zzki zze() {
        return zzb;
    }

    public static zzki zzf(zzyu zzyu, zzzk zzzk) throws zzaaf {
        return (zzki) zzzx.zzw(zzb, zzyu, zzzk);
    }

    static /* synthetic */ void zzi(zzki zzki, zzkc zzkc) {
        zzkc.getClass();
        zzki.zzf = zzkc;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzkc zzb() {
        zzkc zzkc = this.zzf;
        return zzkc == null ? zzkc.zzc() : zzkc;
    }

    public final zzyu zzg() {
        return this.zzg;
    }

    public final boolean zzl() {
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
                return new zzki();
            case 4:
                return new zzkh((zzkg) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
