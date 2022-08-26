package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlm  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzlm extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzlm zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzlp zzf;

    static {
        zzlm zzlm = new zzlm();
        zzb = zzlm;
        zzzx.zzE(zzlm.class, zzlm);
    }

    private zzlm() {
    }

    public static zzll zzb() {
        return (zzll) zzb.zzt();
    }

    public static zzlm zzd(zzyu zzyu, zzzk zzzk) throws zzaaf {
        return (zzlm) zzzx.zzw(zzb, zzyu, zzzk);
    }

    static /* synthetic */ void zzg(zzlm zzlm, zzlp zzlp) {
        zzlp.getClass();
        zzlm.zzf = zzlp;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzlp zze() {
        zzlp zzlp = this.zzf;
        return zzlp == null ? zzlp.zzc() : zzlp;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 2:
                return zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
            case 3:
                return new zzlm();
            case 4:
                return new zzll((zzlk) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
