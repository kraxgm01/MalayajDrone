package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzcx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzcx extends zzfo {
    zzcx() {
        super(zzih.class, new zzcv(zzap.class));
    }

    public final zzfn zza() {
        return new zzcw(this, zzik.class);
    }

    public final /* synthetic */ zzabc zzb(zzyu zzyu) throws zzaaf {
        return zzih.zzd(zzyu, zzzk.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzabc zzabc) throws GeneralSecurityException {
        zzih zzih = (zzih) zzabc;
        zznm.zzc(zzih.zza(), 0);
        if (zzih.zze().zzd() != 32) {
            throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
        }
    }

    public final int zzf() {
        return 3;
    }
}
