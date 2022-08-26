package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbe  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzbe {
    private final zzkq zza;

    private zzbe(zzkq zzkq) {
        this.zza = zzkq;
    }

    public static zzbe zze(String str, byte[] bArr, int i) {
        int i2;
        zzkp zza2 = zzkq.zza();
        zza2.zza(str);
        zza2.zzb(zzyu.zzn(bArr));
        switch (i - 1) {
            case 0:
                i2 = 3;
                break;
            case 1:
                i2 = 4;
                break;
            case 2:
                i2 = 5;
                break;
            default:
                i2 = 6;
                break;
        }
        zza2.zzc(i2);
        return new zzbe((zzkq) zza2.zzk());
    }

    /* access modifiers changed from: package-private */
    public final zzkq zza() {
        return this.zza;
    }

    public final String zzb() {
        return this.zza.zze();
    }

    public final byte[] zzc() {
        return this.zza.zzd().zzt();
    }

    public final int zzd() {
        switch (this.zza.zzh() - 2) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            default:
                throw new IllegalArgumentException("Unknown output prefix type");
        }
    }
}
