package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzie  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzie extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzie zzb;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        zzie zzie = new zzie();
        zzb = zzie;
        zzzx.zzE(zzie.class, zzie);
    }

    private zzie() {
    }

    public static zzid zzb() {
        return (zzid) zzb.zzt();
    }

    public static zzie zzd(zzyu zzyu, zzzk zzzk) throws zzaaf {
        return (zzie) zzzx.zzw(zzb, zzyu, zzzk);
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
                return zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"zze", "zzf"});
            case 3:
                return new zzie();
            case 4:
                return new zzid((zzic) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
