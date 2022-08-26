package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhm  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzhm extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzhm zzb;
    /* access modifiers changed from: private */
    public int zze;

    static {
        zzhm zzhm = new zzhm();
        zzb = zzhm;
        zzzx.zzE(zzhm.class, zzhm);
    }

    private zzhm() {
    }

    public static zzhl zzb() {
        return (zzhl) zzb.zzt();
    }

    public static zzhm zzd() {
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
                return new zzhm();
            case 4:
                return new zzhl((zzhk) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
