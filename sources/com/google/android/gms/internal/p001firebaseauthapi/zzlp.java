package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlp  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzlp extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzlp zzb;
    private String zze = "";
    private zzkq zzf;

    static {
        zzlp zzlp = new zzlp();
        zzb = zzlp;
        zzzx.zzE(zzlp.class, zzlp);
    }

    private zzlp() {
    }

    public static zzlp zzc() {
        return zzb;
    }

    public static zzlp zzd(zzyu zzyu, zzzk zzzk) throws zzaaf {
        return (zzlp) zzzx.zzw(zzb, zzyu, zzzk);
    }

    public final zzkq zza() {
        zzkq zzkq = this.zzf;
        return zzkq == null ? zzkq.zzc() : zzkq;
    }

    public final String zze() {
        return this.zze;
    }

    public final boolean zzf() {
        return this.zzf != null;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 2:
                return zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"zze", "zzf"});
            case 3:
                return new zzlp();
            case 4:
                return new zzlo((zzln) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
