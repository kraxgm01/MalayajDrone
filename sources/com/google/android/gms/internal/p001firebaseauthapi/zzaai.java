package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaai  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public class zzaai {
    private static final zzzk zzb = zzzk.zza();
    protected volatile zzabc zza;
    private volatile zzyu zzc;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzaai)) {
            return false;
        }
        zzaai zzaai = (zzaai) obj;
        zzabc zzabc = this.zza;
        zzabc zzabc2 = zzaai.zza;
        if (zzabc == null && zzabc2 == null) {
            return zzb().equals(zzaai.zzb());
        }
        if (zzabc != null && zzabc2 != null) {
            return zzabc.equals(zzabc2);
        }
        if (zzabc != null) {
            zzaai.zzc(zzabc.zzH());
            return zzabc.equals(zzaai.zza);
        }
        zzc(zzabc2.zzH());
        return this.zza.equals(zzabc2);
    }

    public int hashCode() {
        return 1;
    }

    public final int zza() {
        if (this.zzc != null) {
            return ((zzyr) this.zzc).zza.length;
        }
        if (this.zza != null) {
            return this.zza.zzs();
        }
        return 0;
    }

    public final zzyu zzb() {
        if (this.zzc != null) {
            return this.zzc;
        }
        synchronized (this) {
            if (this.zzc != null) {
                zzyu zzyu = this.zzc;
                return zzyu;
            }
            if (this.zza == null) {
                this.zzc = zzyu.zzb;
            } else {
                this.zzc = this.zza.zzo();
            }
            zzyu zzyu2 = this.zzc;
            return zzyu2;
        }
    }

    /* access modifiers changed from: protected */
    public final void zzc(zzabc zzabc) {
        if (this.zza == null) {
            synchronized (this) {
                if (this.zza == null) {
                    try {
                        this.zza = zzabc;
                        this.zzc = zzyu.zzb;
                    } catch (zzaaf e) {
                        this.zza = zzabc;
                        this.zzc = zzyu.zzb;
                    }
                }
            }
        }
    }
}
