package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzkh  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzkh extends zzzt implements zzabd {
    private zzkh() {
        super(zzki.zzb);
    }

    public final zzkh zza(zzkc zzkc) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zzki.zzi((zzki) this.zza, zzkc);
        return this;
    }

    public final zzkh zzb(zzyu zzyu) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzki) this.zza).zzg = zzyu;
        return this;
    }

    public final zzkh zzc(int i) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzki) this.zza).zze = 0;
        return this;
    }

    /* synthetic */ zzkh(zzkg zzkg) {
        super(zzki.zzb);
    }
}
