package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzmo  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzmo implements zzav {
    private final zzmq zza;
    private final String zzb;
    private final byte[] zzc;
    private final zzmm zzd;

    public zzmo(ECPublicKey eCPublicKey, byte[] bArr, String str, int i, zzmm zzmm) throws GeneralSecurityException {
        zzmr.zzd(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.zza = new zzmq(eCPublicKey);
        this.zzc = bArr;
        this.zzb = str;
        this.zzd = zzmm;
    }
}
