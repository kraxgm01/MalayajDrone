package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzgh  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzgh extends zzzt implements zzabd {
    private zzgh() {
        super(zzgi.zzb);
    }

    public final zzgh zza(zzyu zzyu) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzgi) this.zza).zzf = zzyu;
        return this;
    }

    public final zzgh zzb(zzgo zzgo) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zzgi.zzi((zzgi) this.zza, zzgo);
        return this;
    }

    public final zzgh zzc(int i) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzgi) this.zza).zze = 0;
        return this;
    }

    /* synthetic */ zzgh(zzgg zzgg) {
        super(zzgi.zzb);
    }
}
