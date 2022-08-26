package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzaq implements zzbi {
    private final OutputStream zza;

    private zzaq(OutputStream outputStream) {
        this.zza = outputStream;
    }

    public static zzbi zza(OutputStream outputStream) {
        return new zzaq(outputStream);
    }

    public final void zzb(zzjj zzjj) throws IOException {
        throw null;
    }

    public final void zzc(zzky zzky) throws IOException {
        try {
            zzky.zzq(this.zza);
        } finally {
            this.zza.close();
        }
    }
}
