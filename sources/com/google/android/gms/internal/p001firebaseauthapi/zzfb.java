package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzfb extends zzfo {
    public zzfb() {
        super(zzki.class, new zzfa(zzav.class));
    }

    public final /* synthetic */ zzabc zzb(zzyu zzyu) throws zzaaf {
        return zzki.zzf(zzyu, zzzk.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzabc zzabc) throws GeneralSecurityException {
        zzki zzki = (zzki) zzabc;
        zznm.zzc(zzki.zza(), 0);
        if (zzki.zzl()) {
            zzfc.zza(zzki.zzb());
            return;
        }
        throw new GeneralSecurityException("Missing HPKE key params.");
    }

    public final int zzf() {
        return 5;
    }
}
