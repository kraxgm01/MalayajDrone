package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfu  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzfu extends zzfo {
    zzfu() {
        super(zzgi.class, new zzfs(zzbl.class));
    }

    /* access modifiers changed from: private */
    public static void zzi(zzgo zzgo) throws GeneralSecurityException {
        if (zzgo.zza() < 10) {
            throw new GeneralSecurityException("tag size too short");
        } else if (zzgo.zza() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* access modifiers changed from: private */
    public static void zzn(int i) throws GeneralSecurityException {
        if (i != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    public final zzfn zza() {
        return new zzft(this, zzgl.class);
    }

    public final /* synthetic */ zzabc zzb(zzyu zzyu) throws zzaaf {
        return zzgi.zzd(zzyu, zzzk.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzabc zzabc) throws GeneralSecurityException {
        zzgi zzgi = (zzgi) zzabc;
        zznm.zzc(zzgi.zza(), 0);
        zzn(zzgi.zzf().zzd());
        zzi(zzgi.zze());
    }

    public final int zzf() {
        return 3;
    }
}
