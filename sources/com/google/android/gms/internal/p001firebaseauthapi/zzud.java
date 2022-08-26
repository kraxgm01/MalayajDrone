package com.google.android.gms.internal.p001firebaseauthapi;

import java.lang.reflect.Type;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzud  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzud {
    private static final String zza = zzud.class.getName();

    private zzud() {
    }

    public static Object zza(String str, Type type) throws zzry {
        if (type == String.class) {
            try {
                zzvt zzvt = new zzvt();
                zzvt.zzb(str);
                if (zzvt.zzd()) {
                    return zzvt.zzc();
                }
                throw new zzry("No error message: " + str);
            } catch (Exception e) {
                throw new zzry("Json conversion failed! ".concat(String.valueOf(e.getMessage())), e);
            }
        } else if (type == Void.class) {
            return null;
        } else {
            try {
                zzuf zzuf = (zzuf) ((Class) type).getConstructor(new Class[0]).newInstance(new Object[0]);
                try {
                    zzuf.zza(str);
                    return zzuf;
                } catch (Exception e2) {
                    throw new zzry("Json conversion failed! ".concat(String.valueOf(e2.getMessage())), e2);
                }
            } catch (Exception e3) {
                throw new zzry("Instantiation of JsonResponse failed! ".concat(type.toString()), e3);
            }
        }
    }
}
