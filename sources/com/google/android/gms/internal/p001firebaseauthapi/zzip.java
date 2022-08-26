package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzip  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzip extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzip zzb;
    private zzkq zze;

    static {
        zzip zzip = new zzip();
        zzb = zzip;
        zzzx.zzE(zzip.class, zzip);
    }

    private zzip() {
    }

    public static zzio zza() {
        return (zzio) zzb.zzt();
    }

    public static zzip zzc() {
        return zzb;
    }

    static /* synthetic */ void zze(zzip zzip, zzkq zzkq) {
        zzkq.getClass();
        zzip.zze = zzkq;
    }

    public final zzkq zzd() {
        zzkq zzkq = this.zze;
        return zzkq == null ? zzkq.zzc() : zzkq;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 2:
                return zzD(zzb, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"zze"});
            case 3:
                return new zzip();
            case 4:
                return new zzio((zzin) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
