package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzwe  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public enum zzwe {
    REFRESH_TOKEN("refresh_token"),
    AUTHORIZATION_CODE("authorization_code");
    
    private final String zzd;

    private zzwe(String str) {
        this.zzd = str;
    }

    public final String toString() {
        return this.zzd;
    }
}
