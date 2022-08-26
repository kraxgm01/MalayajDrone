package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzlj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzlj extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzlj zzb;
    private String zze = "";

    static {
        zzlj zzlj = new zzlj();
        zzb = zzlj;
        zzzx.zzE(zzlj.class, zzlj);
    }

    private zzlj() {
    }

    public static zzlj zzb() {
        return zzb;
    }

    public static zzlj zzc(zzyu zzyu, zzzk zzzk) throws zzaaf {
        return (zzlj) zzzx.zzw(zzb, zzyu, zzzk);
    }

    public final String zzd() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 2:
                return zzD(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"zze"});
            case 3:
                return new zzlj();
            case 4:
                return new zzli((zzlh) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
