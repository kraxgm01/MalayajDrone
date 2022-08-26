package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzua  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public class zzua {
    final String zza;
    final zzui zzb;

    public zzua(String str, zzui zzui) {
        this.zza = str;
        this.zzb = zzui;
    }

    /* access modifiers changed from: package-private */
    public final String zza(String str, String str2) {
        String str3 = this.zza;
        return str3 + str + "?key=" + str2;
    }
}
