package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkk  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzkk extends zzzt implements zzabd {
    private zzkk() {
        super(zzkl.zzb);
    }

    public final zzkk zza(String str) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzkl) this.zza).zze = str;
        return this;
    }

    public final zzkk zzb(zzyu zzyu) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzkl) this.zza).zzf = zzyu;
        return this;
    }

    public final zzkk zzc(int i) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzkl) this.zza).zzg = i - 2;
        return this;
    }

    /* synthetic */ zzkk(zzkj zzkj) {
        super(zzkl.zzb);
    }
}
