package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzjz extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzjz zzb;
    private zzkc zze;

    static {
        zzjz zzjz = new zzjz();
        zzb = zzjz;
        zzzx.zzE(zzjz.class, zzjz);
    }

    private zzjz() {
    }

    public static zzjy zza() {
        return (zzjy) zzb.zzt();
    }

    public static zzjz zzc(zzyu zzyu, zzzk zzzk) throws zzaaf {
        return (zzjz) zzzx.zzw(zzb, zzyu, zzzk);
    }

    static /* synthetic */ void zze(zzjz zzjz, zzkc zzkc) {
        zzkc.getClass();
        zzjz.zze = zzkc;
    }

    public final zzkc zzd() {
        zzkc zzkc = this.zze;
        return zzkc == null ? zzkc.zzc() : zzkc;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 2:
                return zzD(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
            case 3:
                return new zzjz();
            case 4:
                return new zzjy((zzjx) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
