package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzfx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzfx extends zzfo {
    public zzfx() {
        super(zzjo.class, new zzfv(zzbl.class));
    }

    public static final void zzh(zzjo zzjo) throws GeneralSecurityException {
        zznm.zzc(zzjo.zza(), 0);
        if (zzjo.zzg().zzd() >= 16) {
            zzn(zzjo.zzf());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }

    static /* bridge */ /* synthetic */ zzfm zzi(int i, int i2, int i3, int i4) {
        zzjq zzb = zzjr.zzb();
        zzjt zzb2 = zzju.zzb();
        zzb2.zzb(i3);
        zzb2.zza(i2);
        zzb.zzb((zzju) zzb2.zzk());
        zzb.zza(i);
        return new zzfm((zzjr) zzb.zzk(), i4);
    }

    /* access modifiers changed from: private */
    public static void zzn(zzju zzju) throws GeneralSecurityException {
        if (zzju.zza() >= 10) {
            switch (zzju.zzf() - 2) {
                case 1:
                    if (zzju.zza() > 20) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                case 2:
                    if (zzju.zza() > 48) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                case 3:
                    if (zzju.zza() > 32) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                case 4:
                    if (zzju.zza() > 64) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                case 5:
                    if (zzju.zza() > 28) {
                        throw new GeneralSecurityException("tag size too big");
                    }
                    return;
                default:
                    throw new GeneralSecurityException("unknown hash type");
            }
        } else {
            throw new GeneralSecurityException("tag size too small");
        }
    }

    public final zzfn zza() {
        return new zzfw(this, zzjr.class);
    }

    public final /* synthetic */ zzabc zzb(zzyu zzyu) throws zzaaf {
        return zzjo.zze(zzyu, zzzk.zza());
    }

    public final String zzc() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    public final /* bridge */ /* synthetic */ void zzd(zzabc zzabc) throws GeneralSecurityException {
        zzh((zzjo) zzabc);
    }

    public final int zze() {
        return 2;
    }

    public final int zzf() {
        return 3;
    }
}
