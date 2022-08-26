package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zziv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zziv extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zziv zzb;
    private zzje zze;
    private zzip zzf;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        zziv zziv = new zziv();
        zzb = zziv;
        zzzx.zzE(zziv.class, zziv);
    }

    private zziv() {
    }

    public static zziu zzb() {
        return (zziu) zzb.zzt();
    }

    public static zziv zzd() {
        return zzb;
    }

    static /* synthetic */ void zzf(zziv zziv, zzje zzje) {
        zzje.getClass();
        zziv.zze = zzje;
    }

    static /* synthetic */ void zzg(zziv zziv, zzip zzip) {
        zzip.getClass();
        zziv.zzf = zzip;
    }

    public final zzip zza() {
        zzip zzip = this.zzf;
        return zzip == null ? zzip.zzc() : zzip;
    }

    public final zzje zze() {
        zzje zzje = this.zze;
        return zzje == null ? zzje.zzc() : zzje;
    }

    public final int zzh() {
        int i;
        switch (this.zzg) {
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

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 2:
                return zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 3:
                return new zziv();
            case 4:
                return new zziu((zzit) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
