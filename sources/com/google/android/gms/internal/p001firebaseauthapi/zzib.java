package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzib  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzib extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzib zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public zzyu zzf = zzyu.zzb;

    static {
        zzib zzib = new zzib();
        zzb = zzib;
        zzzx.zzE(zzib.class, zzib);
    }

    private zzib() {
    }

    public static zzia zzb() {
        return (zzia) zzb.zzt();
    }

    public static zzib zzd(zzyu zzyu, zzzk zzzk) throws zzaaf {
        return (zzib) zzzx.zzw(zzb, zzyu, zzzk);
    }

    public final int zza() {
        return this.zze;
    }

    public final zzyu zze() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 2:
                return zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"zze", "zzf"});
            case 3:
                return new zzib();
            case 4:
                return new zzia((zzhz) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
