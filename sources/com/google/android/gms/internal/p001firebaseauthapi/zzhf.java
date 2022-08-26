package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzhf  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzhf extends zzzt implements zzabd {
    private zzhf() {
        super(zzhg.zzb);
    }

    public final zzhf zza(zzyu zzyu) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzhg) this.zza).zzg = zzyu;
        return this;
    }

    public final zzhf zzb(zzhm zzhm) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zzhg.zzh((zzhg) this.zza, zzhm);
        return this;
    }

    public final zzhf zzc(int i) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzhg) this.zza).zze = 0;
        return this;
    }

    /* synthetic */ zzhf(zzhe zzhe) {
        super(zzhg.zzb);
    }
}
