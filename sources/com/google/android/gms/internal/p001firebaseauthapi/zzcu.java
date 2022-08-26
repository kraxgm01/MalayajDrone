package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcu  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzcu extends zzfo {
    zzcu() {
        super(zzhv.class, new zzcs(zzap.class));
    }

    public static void zzg(boolean z) throws GeneralSecurityException {
        if (zzi()) {
            zzbz.zzn(new zzcu(), true);
        }
    }

    static /* bridge */ /* synthetic */ zzfm zzh(int i, int i2) {
        zzhx zzb = zzhy.zzb();
        zzb.zza(i);
        return new zzfm((zzhy) zzb.zzk(), i2);
    }

    private static boolean zzi() {
        try {
            Cipher.getInstance("AES/GCM-SIV/NoPadding");
            return true;
        } catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
            return false;
        }
    }

    public final zzfn zza() {
        return new zzct(this, zzhy.class);
    }

    public final /* synthetic */ zzabc zzb(zzyu zzyu) throws zzaaf {
        return zzhv.zzd(zzyu, zzzk.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzabc zzabc) throws GeneralSecurityException {
        zzhv zzhv = (zzhv) zzabc;
        zznm.zzc(zzhv.zza(), 0);
        zznm.zzb(zzhv.zze().zzd());
    }

    public final int zzf() {
        return 3;
    }
}
