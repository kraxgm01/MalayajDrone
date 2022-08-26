package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.SecureRandom;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zznj  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zznj extends ThreadLocal {
    zznj() {
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object initialValue() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
