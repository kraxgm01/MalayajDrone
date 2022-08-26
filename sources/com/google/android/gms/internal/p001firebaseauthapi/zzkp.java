package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkp  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzkp extends zzzt implements zzabd {
    private zzkp() {
        super(zzkq.zzb);
    }

    public final zzkp zza(String str) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zzkq.zzf((zzkq) this.zza, str);
        return this;
    }

    public final zzkp zzb(zzyu zzyu) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzkq) this.zza).zzf = zzyu;
        return this;
    }

    public final zzkp zzc(int i) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzkq) this.zza).zzg = zzlr.zza(i);
        return this;
    }

    /* synthetic */ zzkp(zzko zzko) {
        super(zzkq.zzb);
    }
}
