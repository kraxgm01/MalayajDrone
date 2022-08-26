package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzdy  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzdy extends zzfo {
    zzdy() {
        super(zzib.class, new zzdw(zzat.class));
    }

    public final zzfn zza() {
        return new zzdx(this, zzie.class);
    }

    public final /* synthetic */ zzabc zzb(zzyu zzyu) throws zzaaf {
        return zzib.zzd(zzyu, zzzk.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzabc zzabc) throws GeneralSecurityException {
        zzib zzib = (zzib) zzabc;
        zznm.zzc(zzib.zza(), 0);
        if (zzib.zze().zzd() != 64) {
            int zzd = zzib.zze().zzd();
            throw new InvalidKeyException("invalid key size: " + zzd + ". Valid keys must have 64 bytes.");
        }
    }

    public final int zzf() {
        return 3;
    }
}
