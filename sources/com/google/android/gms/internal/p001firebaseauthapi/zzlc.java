package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzlc extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzlc zzb;
    private String zze = "";
    /* access modifiers changed from: private */
    public int zzf;
    /* access modifiers changed from: private */
    public int zzg;
    /* access modifiers changed from: private */
    public int zzh;

    static {
        zzlc zzlc = new zzlc();
        zzb = zzlc;
        zzzx.zzE(zzlc.class, zzlc);
    }

    private zzlc() {
    }

    public static zzlb zzb() {
        return (zzlb) zzb.zzt();
    }

    static /* synthetic */ void zzd(zzlc zzlc, String str) {
        str.getClass();
        zzlc.zze = str;
    }

    public final int zza() {
        return this.zzg;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 2:
                return zzD(zzb, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 3:
                return new zzlc();
            case 4:
                return new zzlb((zzkz) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
