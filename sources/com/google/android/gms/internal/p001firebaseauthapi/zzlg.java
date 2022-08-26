package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlg  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzlg extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzlg zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzlj zzf;

    static {
        zzlg zzlg = new zzlg();
        zzb = zzlg;
        zzzx.zzE(zzlg.class, zzlg);
    }

    private zzlg() {
    }

    public static zzlf zzb() {
        return (zzlf) zzb.zzt();
    }

    public static zzlg zzd(zzyu zzyu, zzzk zzzk) throws zzaaf {
        return (zzlg) zzzx.zzw(zzb, zzyu, zzzk);
    }

    static /* synthetic */ void zzg(zzlg zzlg, zzlj zzlj) {
        zzlj.getClass();
        zzlg.zzf = zzlj;
    }

    public final int zza() {
        return this.zze;
    }

    public final zzlj zze() {
        zzlj zzlj = this.zzf;
        return zzlj == null ? zzlj.zzb() : zzlj;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 2:
                return zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"zze", "zzf"});
            case 3:
                return new zzlg();
            case 4:
                return new zzlf((zzle) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
