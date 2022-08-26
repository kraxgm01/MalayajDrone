package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import java.io.UnsupportedEncodingException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzws  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzws {
    public static long zza(String str) {
        Preconditions.checkNotEmpty(str);
        List zzd = zzaf.zzb('.').zzd(str);
        if (zzd.size() >= 2) {
            try {
                zzwt zza = zzwt.zza(new String(Base64Utils.decodeUrlSafeNoPadding((String) zzd.get(1)), "UTF-8"));
                return zza.zzb().longValue() - zza.zzc().longValue();
            } catch (UnsupportedEncodingException e) {
                throw new RuntimeException("Unable to decode token", e);
            }
        } else {
            throw new RuntimeException("Invalid idToken ".concat(String.valueOf(str)));
        }
    }
}
