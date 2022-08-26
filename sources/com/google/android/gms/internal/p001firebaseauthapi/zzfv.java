package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzfv extends zzfp {
    zzfv(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object zza(zzabc zzabc) throws GeneralSecurityException {
        zzjo zzjo = (zzjo) zzabc;
        int zzf = zzjo.zzf().zzf();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzjo.zzg().zzt(), "HMAC");
        int zza = zzjo.zzf().zza();
        switch (zzf - 2) {
            case 1:
                return new zzni(new zznh("HMACSHA1", secretKeySpec), zza);
            case 2:
                return new zzni(new zznh("HMACSHA384", secretKeySpec), zza);
            case 3:
                return new zzni(new zznh("HMACSHA256", secretKeySpec), zza);
            case 4:
                return new zzni(new zznh("HMACSHA512", secretKeySpec), zza);
            case 5:
                return new zzni(new zznh("HMACSHA224", secretKeySpec), zza);
            default:
                throw new GeneralSecurityException("unknown hash");
        }
    }
}
