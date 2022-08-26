package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaao  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzaao extends zzaaq {
    private zzaao() {
        super((zzaap) null);
    }

    /* synthetic */ zzaao(zzaan zzaan) {
        super((zzaap) null);
    }

    /* access modifiers changed from: package-private */
    public final List zza(Object obj, long j) {
        int i;
        zzaac zzaac = (zzaac) zzacp.zzf(obj, j);
        if (zzaac.zzc()) {
            return zzaac;
        }
        int size = zzaac.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        zzaac zzd = zzaac.zzd(i);
        zzacp.zzs(obj, j, zzd);
        return zzd;
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object obj, long j) {
        ((zzaac) zzacp.zzf(obj, j)).zzb();
    }

    /* access modifiers changed from: package-private */
    public final void zzc(Object obj, Object obj2, long j) {
        zzaac zzaac = (zzaac) zzacp.zzf(obj, j);
        zzaac zzaac2 = (zzaac) zzacp.zzf(obj2, j);
        int size = zzaac.size();
        int size2 = zzaac2.size();
        if (size > 0 && size2 > 0) {
            if (!zzaac.zzc()) {
                zzaac = zzaac.zzd(size2 + size);
            }
            zzaac.addAll(zzaac2);
        }
        if (size > 0) {
            zzaac2 = zzaac;
        }
        zzacp.zzs(obj, j, zzaac2);
    }
}
