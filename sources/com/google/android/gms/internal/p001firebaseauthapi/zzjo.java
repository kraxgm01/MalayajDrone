package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjo  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzjo extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzjo zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzju zzf;
    /* access modifiers changed from: private */
    public zzyu zzg = zzyu.zzb;

    static {
        zzjo zzjo = new zzjo();
        zzb = zzjo;
        zzzx.zzE(zzjo.class, zzjo);
    }

    private zzjo() {
    }

    public static zzjn zzb() {
        return (zzjn) zzb.zzt();
    }

    public static zzjo zzd() {
        return zzb;
    }

    public static zzjo zze(zzyu zzyu, zzzk zzzk) throws zzaaf {
        return (zzjo) zzzx.zzw(zzb, zzyu, zzzk);
    }

    static /* synthetic */ void zzi(zzjo zzjo, zzju zzju) {
        zzju.getClass();
        zzjo.zzf = zzju;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzju zzf() {
        zzju zzju = this.zzf;
        return zzju == null ? zzju.zzd() : zzju;
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
                return new zzjo();
            case 4:
                return new zzjn((zzjm) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
