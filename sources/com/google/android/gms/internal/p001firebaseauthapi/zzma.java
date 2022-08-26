package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzma  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzma extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzma zzb;
    private int zze;

    static {
        zzma zzma = new zzma();
        zzb = zzma;
        zzzx.zzE(zzma.class, zzma);
    }

    private zzma() {
    }

    public static zzma zzb() {
        return zzb;
    }

    public static zzma zzc(zzyu zzyu, zzzk zzzk) throws zzaaf {
        return (zzma) zzzx.zzw(zzb, zzyu, zzzk);
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 2:
                return zzD(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zze"});
            case 3:
                return new zzma();
            case 4:
                return new zzlz((zzly) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
