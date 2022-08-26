package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzkv extends zzzt implements zzabd {
    private zzkv() {
        super(zzky.zzb);
    }

    public final int zza() {
        return ((zzky) this.zza).zza();
    }

    public final zzkv zzb(zzkx zzkx) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zzky.zzi((zzky) this.zza, zzkx);
        return this;
    }

    public final zzkv zzc(int i) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzky) this.zza).zze = i;
        return this;
    }

    public final zzkx zzd(int i) {
        return ((zzky) this.zza).zzd(i);
    }

    public final List zze() {
        return Collections.unmodifiableList(((zzky) this.zza).zzg());
    }

    /* synthetic */ zzkv(zzku zzku) {
        super(zzky.zzb);
    }
}
