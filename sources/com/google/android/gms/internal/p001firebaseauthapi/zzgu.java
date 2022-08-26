package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgu  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzgu extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzgu zzb;
    private zzha zze;
    private zzjr zzf;

    static {
        zzgu zzgu = new zzgu();
        zzb = zzgu;
        zzzx.zzE(zzgu.class, zzgu);
    }

    private zzgu() {
    }

    public static zzgt zza() {
        return (zzgt) zzb.zzt();
    }

    public static zzgu zzc(zzyu zzyu, zzzk zzzk) throws zzaaf {
        return (zzgu) zzzx.zzw(zzb, zzyu, zzzk);
    }

    static /* synthetic */ void zzf(zzgu zzgu, zzha zzha) {
        zzha.getClass();
        zzgu.zze = zzha;
    }

    static /* synthetic */ void zzg(zzgu zzgu, zzjr zzjr) {
        zzjr.getClass();
        zzgu.zzf = zzjr;
    }

    public final zzha zzd() {
        zzha zzha = this.zze;
        return zzha == null ? zzha.zzd() : zzha;
    }

    public final zzjr zze() {
        zzjr zzjr = this.zzf;
        return zzjr == null ? zzjr.zzd() : zzjr;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 2:
                return zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"zze", "zzf"});
            case 3:
                return new zzgu();
            case 4:
                return new zzgt((zzgs) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
