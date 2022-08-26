package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhs  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzhs extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzhs zzb;
    /* access modifiers changed from: private */
    public int zze;
    private int zzf;

    static {
        zzhs zzhs = new zzhs();
        zzb = zzhs;
        zzzx.zzE(zzhs.class, zzhs);
    }

    private zzhs() {
    }

    public static zzhr zzb() {
        return (zzhr) zzb.zzt();
    }

    public static zzhs zzd(zzyu zzyu, zzzk zzzk) throws zzaaf {
        return (zzhs) zzzx.zzw(zzb, zzyu, zzzk);
    }

    public final int zza() {
        return this.zze;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 2:
                return zzD(zzb, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"zze", "zzf"});
            case 3:
                return new zzhs();
            case 4:
                return new zzhr((zzhq) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
