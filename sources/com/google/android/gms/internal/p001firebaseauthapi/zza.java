package com.google.android.gms.internal.p001firebaseauthapi;

import android.os.Build;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zza  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zza {
    static boolean zza() {
        return Build.VERSION.SDK_INT >= 33 || Build.VERSION.CODENAME.charAt(0) == 'T';
    }
}
