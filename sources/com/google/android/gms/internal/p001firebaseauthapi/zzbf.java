package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbf  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzbf {
    public static zzbe zza(String str) throws GeneralSecurityException {
        if (zzbz.zzl().containsKey(str)) {
            return (zzbe) zzbz.zzl().get(str);
        }
        throw new GeneralSecurityException("cannot find key template: ".concat(str));
    }
}
