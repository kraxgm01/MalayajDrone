package com.google.android.gms.internal.p001firebaseauthapi;

@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzem  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzem {
    public static final zzkq zza;
    public static final zzkq zzb;
    public static final zzkq zzc;
    private static final byte[] zzd;

    static {
        byte[] bArr = new byte[0];
        zzd = bArr;
        byte[] bArr2 = bArr;
        zza = zza(4, 5, 3, zzcc.zza, 3, bArr2);
        zzb = zza(4, 5, 4, zzcc.zza, 5, bArr2);
        zzc = zza(4, 5, 3, zzcc.zze, 3, bArr2);
    }

    public static zzkq zza(int i, int i2, int i3, zzkq zzkq, int i4, byte[] bArr) {
        zzir zza2 = zzis.zza();
        zzjd zza3 = zzje.zza();
        zza3.zzb(4);
        zza3.zzc(5);
        zza3.zza(zzyu.zzn(bArr));
        zzio zza4 = zzip.zza();
        zza4.zza(zzkq);
        zziu zzb2 = zziv.zzb();
        zzb2.zzb((zzje) zza3.zzk());
        zzb2.zza((zzip) zza4.zzk());
        zzb2.zzc(i3);
        zza2.zza((zziv) zzb2.zzk());
        zzkp zza5 = zzkq.zza();
        new zzee();
        zza5.zza("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey");
        zza5.zzc(i4);
        zza5.zzb(((zzis) zza2.zzk()).zzo());
        return (zzkq) zza5.zzk();
    }
}
