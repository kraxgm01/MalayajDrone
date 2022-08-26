package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbu  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzbu {
    private final ConcurrentMap zza;
    private final zzbo zzb;
    private final Class zzc;
    private final zzge zzd;

    /* synthetic */ zzbu(ConcurrentMap concurrentMap, zzbo zzbo, zzge zzge, Class cls, zzbt zzbt) {
        this.zza = concurrentMap;
        this.zzb = zzbo;
        this.zzc = cls;
        this.zzd = zzge;
    }

    public final Class zza() {
        return this.zzc;
    }

    public final List zzb(byte[] bArr) {
        List list = (List) this.zza.get(new zzbq(bArr, (zzbp) null));
        if (list != null) {
            return list;
        }
        return Collections.emptyList();
    }
}
