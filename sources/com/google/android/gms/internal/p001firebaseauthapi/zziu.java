package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zziu  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zziu extends zzzt implements zzabd {
    private zziu() {
        super(zziv.zzb);
    }

    public final zziu zza(zzip zzip) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zziv.zzg((zziv) this.zza, zzip);
        return this;
    }

    public final zziu zzb(zzje zzje) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zziv.zzf((zziv) this.zza, zzje);
        return this;
    }

    public final zziu zzc(int i) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zziv) this.zza).zzg = zzim.zza(i);
        return this;
    }

    /* synthetic */ zziu(zzit zzit) {
        super(zziv.zzb);
    }
}
