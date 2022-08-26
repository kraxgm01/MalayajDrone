package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzkx extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzkx zzb;
    private zzkl zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;
    /* access modifiers changed from: private */
    public int zzh;

    static {
        zzkx zzkx = new zzkx();
        zzb = zzkx;
        zzzx.zzE(zzkx.class, zzkx);
    }

    private zzkx() {
    }

    public static zzkw zzc() {
        return (zzkw) zzb.zzt();
    }

    static /* synthetic */ void zze(zzkx zzkx, zzkl zzkl) {
        zzkl.getClass();
        zzkx.zze = zzkl;
    }

    public final int zza() {
        return this.zzg;
    }

    public final zzkl zzb() {
        zzkl zzkl = this.zze;
        return zzkl == null ? zzkl.zzc() : zzkl;
    }

    public final boolean zzg() {
        return this.zze != null;
    }

    public final int zzh() {
        int i;
        switch (this.zzf) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int zzi() {
        int zzb2 = zzlr.zzb(this.zzh);
        if (zzb2 == 0) {
            return 1;
        }
        return zzb2;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 2:
                return zzD(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 3:
                return new zzkx();
            case 4:
                return new zzkw((zzku) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
