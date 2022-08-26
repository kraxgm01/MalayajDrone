package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzky  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzky extends zzzx implements zzabd {
    /* access modifiers changed from: private */
    public static final zzky zzb;
    /* access modifiers changed from: private */
    public int zze;
    private zzaac zzf = zzy();

    static {
        zzky zzky = new zzky();
        zzb = zzky;
        zzzx.zzE(zzky.class, zzky);
    }

    private zzky() {
    }

    public static zzkv zzc() {
        return (zzkv) zzb.zzt();
    }

    public static zzky zzf(byte[] bArr, zzzk zzzk) throws zzaaf {
        return (zzky) zzzx.zzx(zzb, bArr, zzzk);
    }

    static /* synthetic */ void zzi(zzky zzky, zzkx zzkx) {
        zzkx.getClass();
        zzaac zzaac = zzky.zzf;
        if (!zzaac.zzc()) {
            zzky.zzf = zzzx.zzz(zzaac);
        }
        zzky.zzf.add(zzkx);
    }

    public final int zza() {
        return this.zzf.size();
    }

    public final int zzb() {
        return this.zze;
    }

    public final zzkx zzd(int i) {
        return (zzkx) this.zzf.get(i);
    }

    public final List zzg() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final Object zzj(int i, Object obj, Object obj2) {
        switch (i - 1) {
            case 0:
                return (byte) 1;
            case 2:
                return zzD(zzb, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zze", "zzf", zzkx.class});
            case 3:
                return new zzky();
            case 4:
                return new zzkv((zzku) null);
            case 5:
                return zzb;
            default:
                return null;
        }
    }
}
