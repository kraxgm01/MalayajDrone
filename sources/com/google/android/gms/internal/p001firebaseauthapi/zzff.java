package com.google.android.gms.internal.p001firebaseauthapi;

import android.content.Context;
import android.os.Build;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStoreException;
import java.security.ProviderException;
import javax.crypto.KeyGenerator;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzff  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzff {
    /* access modifiers changed from: private */
    public zzbi zza = null;
    private String zzb = null;
    /* access modifiers changed from: private */
    public zzap zzc = null;
    private zzbe zzd = null;
    /* access modifiers changed from: private */
    public zzbh zze;
    private zzfk zzf = null;

    private final zzap zzh() throws GeneralSecurityException {
        if (Build.VERSION.SDK_INT >= 23) {
            zzfj zzfj = new zzfj();
            boolean zzc2 = zzfj.zzc(this.zzb);
            if (!zzc2) {
                try {
                    String str = this.zzb;
                    if (!new zzfj().zzc(str)) {
                        String zza2 = zznm.zza("android-keystore://", str);
                        KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                        instance.init(new KeyGenParameterSpec.Builder(zza2, 3).setKeySize(256).setBlockModes(new String[]{"GCM"}).setEncryptionPaddings(new String[]{"NoPadding"}).build());
                        instance.generateKey();
                    } else {
                        throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", new Object[]{str}));
                    }
                } catch (GeneralSecurityException | ProviderException e) {
                    Log.w(zzfh.zzb, "cannot use Android Keystore, it'll be disabled", e);
                    return null;
                }
            }
            try {
                return zzfj.zza(this.zzb);
            } catch (GeneralSecurityException | ProviderException e2) {
                if (!zzc2) {
                    Log.w(zzfh.zzb, "cannot use Android Keystore, it'll be disabled", e2);
                    return null;
                }
                throw new KeyStoreException(String.format("the master key %s exists but is unusable", new Object[]{this.zzb}), e2);
            }
        } else {
            Log.w(zzfh.zzb, "Android Keystore requires at least Android M");
            return null;
        }
    }

    private final zzbh zzi() throws GeneralSecurityException, IOException {
        zzap zzap = this.zzc;
        if (zzap != null) {
            try {
                return zzbh.zzf(zzbg.zzh(this.zzf, zzap));
            } catch (zzaaf | GeneralSecurityException e) {
                Log.w(zzfh.zzb, "cannot decrypt keyset: ", e);
            }
        }
        return zzbh.zzf(zzar.zzb(this.zzf));
    }

    @Deprecated
    public final zzff zzd(zzkq zzkq) {
        int i;
        String zze2 = zzkq.zze();
        byte[] zzt = zzkq.zzd().zzt();
        int zzh = zzkq.zzh();
        int i2 = zzfh.zza;
        switch (zzh - 2) {
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            case 3:
                i = 3;
                break;
            case 4:
                i = 4;
                break;
            default:
                throw new IllegalArgumentException("Unknown output prefix type");
        }
        this.zzd = zzbe.zze(zze2, zzt, i);
        return this;
    }

    public final zzff zze(String str) {
        if (str.startsWith("android-keystore://")) {
            this.zzb = str;
            return this;
        }
        throw new IllegalArgumentException("key URI must start with android-keystore://");
    }

    public final zzff zzf(Context context, String str, String str2) throws IOException {
        if (context != null) {
            this.zzf = new zzfk(context, "GenericIdpKeyset", str2);
            this.zza = new zzfl(context, "GenericIdpKeyset", str2);
            return this;
        }
        throw new IllegalArgumentException("need an Android context");
    }

    public final synchronized zzfh zzg() throws GeneralSecurityException, IOException {
        zzbh zzbh;
        if (this.zzb != null) {
            this.zzc = zzh();
        }
        try {
            zzbh = zzi();
        } catch (FileNotFoundException e) {
            if (Log.isLoggable(zzfh.zzb, 4)) {
                Log.i(zzfh.zzb, String.format("keyset not found, will generate a new one. %s", new Object[]{e.getMessage()}));
            }
            if (this.zzd != null) {
                zzbh = zzbh.zze();
                zzbh.zzc(this.zzd);
                zzbh.zzd(zzbh.zzb().zzd().zzb(0).zza());
                if (this.zzc != null) {
                    zzbh.zzb().zzf(this.zza, this.zzc);
                } else {
                    zzar.zza(zzbh.zzb(), this.zza);
                }
            } else {
                throw new GeneralSecurityException("cannot read or generate keyset");
            }
        }
        this.zze = zzbh;
        return new zzfh(this, (zzfg) null);
    }
}
