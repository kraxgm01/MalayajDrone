package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzkq extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzkq zzb;
    private String zze = "";
    /* access modifiers changed from: private */
    public zzyu zzf = zzyu.zzb;
    /* access modifiers changed from: private */
    public int zzg;

    static {
        zzkq zzkq = new zzkq();
        zzb = zzkq;
        zzzx.zzE(zzkq.class, zzkq);
    }

    private zzkq() {
    }

    public static zzkp zza() {
        return (zzkp) zzb.zzt();
    }

    public static zzkq zzc() {
        return zzb;
    }

    static /* synthetic */ void zzf(zzkq zzkq, String str) {
        str.getClass();
        zzkq.zze = str;
    }

    public final zzyu zzd() {
        return this.zzf;
    }

    public final String zze() {
        return this.zze;
    }

    public final int zzh() {
        int zzb2 = zzlr.zzb(this.zzg);
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
                return zzD(zzb, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zze", "zzf", "zzg"});
            case 3:
                return new zzkq();
            case 4:
                return new zzkp((zzko) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
