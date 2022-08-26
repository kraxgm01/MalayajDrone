package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhp  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzhp extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzhp zzb;
    /* access modifiers changed from: private */
    public int zze;
    /* access modifiers changed from: private */
    public zzyu zzf = zzyu.zzb;

    static {
        zzhp zzhp = new zzhp();
        zzb = zzhp;
        zzzx.zzE(zzhp.class, zzhp);
    }

    private zzhp() {
    }

    public static zzho zzb() {
        return (zzho) zzb.zzt();
    }

    public static zzhp zzd(zzyu zzyu, zzzk zzzk) throws zzaaf {
        return (zzhp) zzzx.zzw(zzb, zzyu, zzzk);
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
                return zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"zze", "zzf"});
            case 3:
                return new zzhp();
            case 4:
                return new zzho((zzhn) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
