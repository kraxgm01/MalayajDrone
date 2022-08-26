package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzhd extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzhd zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzhd zzhd = new zzhd();
        zzb = zzhd;
        zzzx.zzE(zzhd.class, zzhd);
    }

    private zzhd() {
    }

    public static zzhc zzb() {
        return (zzhc) zzb.zzt();
    }

    public static zzhd zzd() {
        return zzb;
    }

    public final int zza() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 2:
                return zzD(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 3:
                return new zzhd();
            case 4:
                return new zzhc((zzhb) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
