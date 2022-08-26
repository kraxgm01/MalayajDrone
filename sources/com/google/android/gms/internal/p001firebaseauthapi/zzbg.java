package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbg  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzbg {
    private final zzky zza;

    private zzbg(zzky zzky) {
        this.zza = zzky;
    }

    static final zzbg zza(zzky zzky) throws GeneralSecurityException {
        zzi(zzky);
        return new zzbg(zzky);
    }

    public static final zzbg zzh(zzfk zzfk, zzap zzap) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        zzjj zza2 = zzfk.zza();
        if (zza2 == null || zza2.zzd().zzd() == 0) {
            throw new GeneralSecurityException("empty keyset");
        }
        try {
            zzky zzf = zzky.zzf(zzap.zza(zza2.zzd().zzt(), bArr), zzzk.zza());
            zzi(zzf);
            return new zzbg(zzf);
        } catch (zzaaf e) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    private static void zzi(zzky zzky) throws GeneralSecurityException {
        if (zzky == null || zzky.zza() <= 0) {
            throw new GeneralSecurityException("empty keyset");
        }
    }

    public final String toString() {
        return zzca.zza(this.zza).toString();
    }

    public final zzbg zzb() throws GeneralSecurityException {
        if (this.zza != null) {
            zzkv zzc = zzky.zzc();
            for (zzkx zzkx : this.zza.zzg()) {
                zzkl zzb = zzkx.zzb();
                if (zzb.zzh() == 4) {
                    String zze = zzb.zze();
                    zzyu zzd = zzb.zzd();
                    zzax zza2 = zzbz.zza(zze);
                    if (zza2 instanceof zzbw) {
                        zzkl zzf = ((zzbw) zza2).zzf(zzd);
                        zzbz.zzf(zzf);
                        zzkw zzc2 = zzkx.zzc();
                        zzc2.zzj(zzkx);
                        zzc2.zza(zzf);
                        zzc.zzb((zzkx) zzc2.zzk());
                    } else {
                        throw new GeneralSecurityException("manager for key type " + zze + " is not a PrivateKeyManager");
                    }
                } else {
                    throw new GeneralSecurityException("The keyset contains a non-private key");
                }
            }
            zzc.zzc(this.zza.zzb());
            return new zzbg((zzky) zzc.zzk());
        }
        throw new GeneralSecurityException("cleartext keyset is not available");
    }

    /* access modifiers changed from: package-private */
    public final zzky zzc() {
        return this.zza;
    }

    public final zzld zzd() {
        return zzca.zza(this.zza);
    }

    public final Object zze(Class cls) throws GeneralSecurityException {
        Class zze = zzbz.zze(cls);
        if (zze != null) {
            zzca.zzb(this.zza);
            zzbn zzbn = new zzbn(zze, (zzbm) null);
            for (zzkx zzkx : this.zza.zzg()) {
                if (zzkx.zzh() == 3) {
                    Object zzg = zzbz.zzg(zzkx.zzb(), zze);
                    if (zzkx.zza() == this.zza.zzb()) {
                        zzbn.zza(zzg, zzkx);
                    } else {
                        zzbn.zzb(zzg, zzkx);
                    }
                }
            }
            return zzbz.zzk(zzbn.zzc(), cls);
        }
        throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(cls.getName())));
    }

    public final void zzf(zzbi zzbi, zzap zzap) throws GeneralSecurityException, IOException {
        byte[] bArr = new byte[0];
        zzky zzky = this.zza;
        byte[] zzb = zzap.zzb(zzky.zzr(), bArr);
        try {
            if (zzky.zzf(zzap.zza(zzb, bArr), zzzk.zza()).equals(zzky)) {
                zzji zza2 = zzjj.zza();
                zza2.zza(zzyu.zzn(zzb));
                zza2.zzb(zzca.zza(zzky));
                zzbi.zzb((zzjj) zza2.zzk());
                return;
            }
            throw new GeneralSecurityException("cannot encrypt keyset");
        } catch (zzaaf e) {
            throw new GeneralSecurityException("invalid keyset, corrupted key material");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:3:0x0010  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void zzg(com.google.android.gms.internal.p001firebaseauthapi.zzbi r6) throws java.security.GeneralSecurityException, java.io.IOException {
        /*
            r5 = this;
            com.google.android.gms.internal.firebase-auth-api.zzky r0 = r5.zza
            java.util.List r0 = r0.zzg()
            java.util.Iterator r0 = r0.iterator()
        L_0x000a:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x006f
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.firebase-auth-api.zzkx r1 = (com.google.android.gms.internal.p001firebaseauthapi.zzkx) r1
            com.google.android.gms.internal.firebase-auth-api.zzkl r2 = r1.zzb()
            int r2 = r2.zzh()
            r3 = 2
            if (r2 == r3) goto L_0x0037
            com.google.android.gms.internal.firebase-auth-api.zzkl r2 = r1.zzb()
            int r2 = r2.zzh()
            r4 = 3
            if (r2 == r4) goto L_0x0037
            com.google.android.gms.internal.firebase-auth-api.zzkl r2 = r1.zzb()
            int r2 = r2.zzh()
            r4 = 4
            if (r2 != r4) goto L_0x000a
        L_0x0037:
            java.security.GeneralSecurityException r6 = new java.security.GeneralSecurityException
            java.lang.Object[] r0 = new java.lang.Object[r3]
            com.google.android.gms.internal.firebase-auth-api.zzkl r2 = r1.zzb()
            int r2 = r2.zzh()
            switch(r2) {
                case 2: goto L_0x0055;
                case 3: goto L_0x0052;
                case 4: goto L_0x004f;
                case 5: goto L_0x004c;
                case 6: goto L_0x0049;
                default: goto L_0x0046;
            }
        L_0x0046:
            java.lang.String r2 = "UNRECOGNIZED"
            goto L_0x0057
        L_0x0049:
            java.lang.String r2 = "REMOTE"
            goto L_0x0057
        L_0x004c:
            java.lang.String r2 = "ASYMMETRIC_PUBLIC"
            goto L_0x0057
        L_0x004f:
            java.lang.String r2 = "ASYMMETRIC_PRIVATE"
            goto L_0x0057
        L_0x0052:
            java.lang.String r2 = "SYMMETRIC"
            goto L_0x0057
        L_0x0055:
            java.lang.String r2 = "UNKNOWN_KEYMATERIAL"
        L_0x0057:
            r3 = 0
            r0[r3] = r2
            r2 = 1
            com.google.android.gms.internal.firebase-auth-api.zzkl r1 = r1.zzb()
            java.lang.String r1 = r1.zze()
            r0[r2] = r1
            java.lang.String r1 = "keyset contains key material of type %s for type url %s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            r6.<init>(r0)
            throw r6
        L_0x006f:
            com.google.android.gms.internal.firebase-auth-api.zzky r0 = r5.zza
            r6.zzc(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p001firebaseauthapi.zzbg.zzg(com.google.android.gms.internal.firebase-auth-api.zzbi):void");
    }
}
