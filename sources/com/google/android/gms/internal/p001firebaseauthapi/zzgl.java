package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgl  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzgl extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzgl zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzgo zzf;

    static {
        zzgl zzgl = new zzgl();
        zzb = zzgl;
        zzzx.zzE(zzgl.class, zzgl);
    }

    private zzgl() {
    }

    public static zzgk zzb() {
        return (zzgk) zzb.zzt();
    }

    public static zzgl zzd(zzyu zzyu, zzzk zzzk) throws zzaaf {
        return (zzgl) zzzx.zzw(zzb, zzyu, zzzk);
    }

    static /* synthetic */ void zzg(zzgl zzgl, zzgo zzgo) {
        zzgo.getClass();
        zzgl.zzf = zzgo;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzgo zze() {
        zzgo zzgo = this.zzf;
        return zzgo == null ? zzgo.zzd() : zzgo;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 2:
                return zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
            case 3:
                return new zzgl();
            case 4:
                return new zzgk((zzgj) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
