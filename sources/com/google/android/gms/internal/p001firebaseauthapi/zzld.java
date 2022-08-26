package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzld  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzld extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzld zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzaac zzf = zzy();

    static {
        zzld zzld = new zzld();
        zzb = zzld;
        zzzx.zzE(zzld.class, zzld);
    }

    private zzld() {
    }

    public static zzla zza() {
        return (zzla) zzb.zzt();
    }

    static /* synthetic */ void zze(zzld zzld, zzlc zzlc) {
        zzlc.getClass();
        zzaac zzaac = zzld.zzf;
        if (!zzaac.zzc()) {
            zzld.zzf = zzzx.zzz(zzaac);
        }
        zzld.zzf.add(zzlc);
    }

    public final zzlc zzb(int i) {
        return (zzlc) this.zzf.get(0);
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 2:
                return zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzlc.class});
            case 3:
                return new zzld();
            case 4:
                return new zzla((zzkz) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
