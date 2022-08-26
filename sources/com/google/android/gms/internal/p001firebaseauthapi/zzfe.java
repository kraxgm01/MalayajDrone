package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfe  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzfe {
    private final zzap zza;
    private final zzat zzb;

    public zzfe(zzap zzap) {
        this.zza = zzap;
        this.zzb = null;
    }

    public zzfe(zzat zzat) {
        this.zza = null;
        this.zzb = zzat;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzap zzap = this.zza;
        if (zzap != null) {
            return zzap.zza(bArr, bArr2);
        }
        return this.zzb.zza(bArr, bArr2);
    }
}
