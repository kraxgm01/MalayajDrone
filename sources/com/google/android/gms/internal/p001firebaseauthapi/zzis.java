package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzis  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzis extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzis zzb;
    private zziv zze;

    static {
        zzis zzis = new zzis();
        zzb = zzis;
        zzzx.zzE(zzis.class, zzis);
    }

    private zzis() {
    }

    public static zzir zza() {
        return (zzir) zzb.zzt();
    }

    public static zzis zzc(zzyu zzyu, zzzk zzzk) throws zzaaf {
        return (zzis) zzzx.zzw(zzb, zzyu, zzzk);
    }

    static /* synthetic */ void zze(zzis zzis, zziv zziv) {
        zziv.getClass();
        zzis.zze = zziv;
    }

    public final zziv zzd() {
        zziv zziv = this.zze;
        return zziv == null ? zziv.zzd() : zziv;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 2:
                return zzD(zzb, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"zze"});
            case 3:
                return new zzis();
            case 4:
                return new zzir((zziq) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
