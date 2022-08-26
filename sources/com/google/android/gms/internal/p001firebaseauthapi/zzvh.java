package com.google.android.gms.internal.p001firebaseauthapi;

import android.app.Activity;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.util.DefaultClock;
import com.google.firebase.auth.PhoneAuthProvider;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvh  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzvh {
    private static final Map zza = new ArrayMap();

    public static PhoneAuthProvider.OnVerificationStateChangedCallbacks zza(String str, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, zzut zzut) {
        zze(str, zzut);
        return new zzvf(onVerificationStateChangedCallbacks, str);
    }

    public static void zzc() {
        zza.clear();
    }

    public static boolean zzd(String str, PhoneAuthProvider.OnVerificationStateChangedCallbacks onVerificationStateChangedCallbacks, Activity activity, Executor executor) {
        Map map = zza;
        if (map.containsKey(str)) {
            zzvg zzvg = (zzvg) map.get(str);
            if (DefaultClock.getInstance().currentTimeMillis() - zzvg.zzb < 120000) {
                zzut zzut = zzvg.zza;
                if (zzut == null) {
                    return true;
                }
                zzut.zzh(onVerificationStateChangedCallbacks, activity, executor, str);
                return true;
            }
            zze(str, (zzut) null);
            return false;
        }
        zze(str, (zzut) null);
        return false;
    }

    private static void zze(String str, zzut zzut) {
        zza.put(str, new zzvg(zzut, DefaultClock.getInstance().currentTimeMillis()));
    }
}
