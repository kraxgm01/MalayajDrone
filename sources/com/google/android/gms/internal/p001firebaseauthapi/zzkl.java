package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkl  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzkl extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzkl zzb;
    /* access modifiers changed from: private */
    public String zze = "";
    /* access modifiers changed from: private */
    public zzyu zzf = zzyu.zzb;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        zzkl zzkl = new zzkl();
        zzb = zzkl;
        zzzx.zzE(zzkl.class, zzkl);
    }

    private zzkl() {
    }

    public static zzkk zza() {
        return (zzkk) zzb.zzt();
    }

    public static zzkl zzc() {
        return zzb;
    }

    public final zzyu zzd() {
        return this.zzf;
    }

    public final String zze() {
        return this.zze;
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
            case 4:
                i = 6;
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
                return zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 3:
                return new zzkl();
            case 4:
                return new zzkk((zzkj) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
