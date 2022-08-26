package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzla  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzla extends zzzt implements zzabd {
    private zzla() {
        super(zzld.zzb);
    }

    public final zzla zza(zzlc zzlc) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zzld.zze((zzld) this.zza, zzlc);
        return this;
    }

    public final zzla zzb(int i) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzld) this.zza).zze = i;
        return this;
    }

    /* synthetic */ zzla(zzkz zzkz) {
        super(zzld.zzb);
    }
}
