package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzje  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzje extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzje zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public zzyu zzg = zzyu.zzb;

    static {
        zzje zzje = new zzje();
        zzb = zzje;
        zzzx.zzE(zzje.class, zzje);
    }

    private zzje() {
    }

    public static zzjd zza() {
        return (zzjd) zzb.zzt();
    }

    public static zzje zzc() {
        return zzb;
    }

    public final zzyu zzd() {
        return this.zzg;
    }

    public final int zzf() {
        int i;
        switch (this.zze) {
            case 0:
                i = 2;
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
            case 5:
                i = 7;
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

    public final int zzg() {
        int zzb2 = zzjl.zzb(this.zzf);
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
                return zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"zze", "zzf", "zzg"});
            case 3:
                return new zzje();
            case 4:
                return new zzjd((zzjc) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
