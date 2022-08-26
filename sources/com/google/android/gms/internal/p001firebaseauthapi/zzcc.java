package com.google.android.gms.internal.p001firebaseauthapi;

@Deprecated
/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcc  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzcc {
    public static final zzkq zza = zzb(16);
    public static final zzkq zzb = zzb(32);
    public static final zzkq zzc = zza(16, 16);
    public static final zzkq zzd = zza(32, 16);
    public static final zzkq zze = zzc(16, 16, 32, 16, 5);
    public static final zzkq zzf = zzc(32, 16, 32, 32, 5);
    public static final zzkq zzg;
    public static final zzkq zzh;

    static {
        zzkp zza2 = zzkq.zza();
        new zzcx();
        zza2.zza("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
        zza2.zzc(3);
        zzg = (zzkq) zza2.zzk();
        zzkp zza3 = zzkq.zza();
        new zzdh();
        zza3.zza("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
        zza3.zzc(3);
        zzh = (zzkq) zza3.zzk();
    }

    public static zzkq zza(int i, int i2) {
        zzhi zzb2 = zzhj.zzb();
        zzb2.zza(i);
        zzhl zzb3 = zzhm.zzb();
        zzb3.zza(16);
        zzb2.zzb((zzhm) zzb3.zzk());
        zzkp zza2 = zzkq.zza();
        zza2.zzb(((zzhj) zzb2.zzk()).zzo());
        new zzco();
        zza2.zza("type.googleapis.com/google.crypto.tink.AesEaxKey");
        zza2.zzc(3);
        return (zzkq) zza2.zzk();
    }

    public static zzkq zzb(int i) {
        zzhr zzb2 = zzhs.zzb();
        zzb2.zza(i);
        zzkp zza2 = zzkq.zza();
        zza2.zzb(((zzhs) zzb2.zzk()).zzo());
        new zzcr();
        zza2.zza("type.googleapis.com/google.crypto.tink.AesGcmKey");
        zza2.zzc(3);
        return (zzkq) zza2.zzk();
    }

    public static zzkq zzc(int i, int i2, int i3, int i4, int i5) {
        zzgz zzb2 = zzha.zzb();
        zzhc zzb3 = zzhd.zzb();
        zzb3.zza(16);
        zzb2.zzb((zzhd) zzb3.zzk());
        zzb2.zza(i);
        zzjq zzb4 = zzjr.zzb();
        zzjt zzb5 = zzju.zzb();
        zzb5.zzb(5);
        zzb5.zza(i4);
        zzb4.zzb((zzju) zzb5.zzk());
        zzb4.zza(32);
        zzgt zza2 = zzgu.zza();
        zza2.zza((zzha) zzb2.zzk());
        zza2.zzb((zzjr) zzb4.zzk());
        zzkp zza3 = zzkq.zza();
        zza3.zzb(((zzgu) zza2.zzk()).zzo());
        new zzci();
        zza3.zza("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        zza3.zzc(3);
        return (zzkq) zza3.zzk();
    }
}
