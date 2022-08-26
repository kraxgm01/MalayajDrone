package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzjn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzjn extends zzzt implements zzabd {
    private zzjn() {
        super(zzjo.zzb);
    }

    public final zzjn zza(zzyu zzyu) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzjo) this.zza).zzg = zzyu;
        return this;
    }

    public final zzjn zzb(zzju zzju) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zzjo.zzi((zzjo) this.zza, zzju);
        return this;
    }

    public final zzjn zzc(int i) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        ((zzjo) this.zza).zze = 0;
        return this;
    }

    /* synthetic */ zzjn(zzjm zzjm) {
        super(zzjo.zzb);
    }
}
