package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzjj extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzjj zzb;
    /* access modifiers changed from: private */
    public zzyu zze = zzyu.zzb;
    private zzld zzf;

    static {
        zzjj zzjj = new zzjj();
        zzb = zzjj;
        zzzx.zzE(zzjj.class, zzjj);
    }

    private zzjj() {
    }

    public static zzji zza() {
        return (zzji) zzb.zzt();
    }

    public static zzjj zzc(byte[] bArr, zzzk zzzk) throws zzaaf {
        return (zzjj) zzzx.zzx(zzb, bArr, zzzk);
    }

    static /* synthetic */ void zzf(zzjj zzjj, zzld zzld) {
        zzld.getClass();
        zzjj.zzf = zzld;
    }

    public final zzyu zzd() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 2:
                return zzD(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"zze", "zzf"});
            case 3:
                return new zzjj();
            case 4:
                return new zzji((zzjh) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
