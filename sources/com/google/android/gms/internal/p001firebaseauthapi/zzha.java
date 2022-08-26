package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzha  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzha extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzha zzb;
    private zzhd zze;
    /* access modifiers changed from: private */
    public int zzf;

    static {
        zzha zzha = new zzha();
        zzb = zzha;
        zzzx.zzE(zzha.class, zzha);
    }

    private zzha() {
    }

    public static zzgz zzb() {
        return (zzgz) zzb.zzt();
    }

    public static zzha zzd() {
        return zzb;
    }

    public static zzha zze(zzyu zzyu, zzzk zzzk) throws zzaaf {
        return (zzha) zzzx.zzw(zzb, zzyu, zzzk);
    }

    static /* synthetic */ void zzg(zzha zzha, zzhd zzhd) {
        zzhd.getClass();
        zzha.zze = zzhd;
    }

    public final int zza() {
        return this.zzf;
    }

    public final zzhd zzf() {
        zzhd zzhd = this.zze;
        return zzhd == null ? zzhd.zzd() : zzhd;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 2:
                return zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"zze", "zzf"});
            case 3:
                return new zzha();
            case 4:
                return new zzgz((zzgy) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
