package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzabg  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzabg implements zzabo {
    private final zzabc zza;
    private final zzacf zzb;
    private final boolean zzc;
    private final zzzl zzd;

    private zzabg(zzacf zzacf, zzzl zzzl, zzabc zzabc) {
        this.zzb = zzacf;
        this.zzc = zzzl.zzh(zzabc);
        this.zzd = zzzl;
        this.zza = zzabc;
    }

    static zzabg zzc(zzacf zzacf, zzzl zzzl, zzabc zzabc) {
        return new zzabg(zzacf, zzzl, zzabc);
    }

    public final int zza(Object obj) {
        zzacf zzacf = this.zzb;
        int zzb2 = zzacf.zzb(zzacf.zzd(obj));
        if (!this.zzc) {
            return zzb2;
        }
        this.zzd.zza(obj);
        throw null;
    }

    public final int zzb(Object obj) {
        int hashCode = this.zzb.zzd(obj).hashCode();
        if (!this.zzc) {
            return hashCode;
        }
        this.zzd.zza(obj);
        throw null;
    }

    public final Object zze() {
        return this.zza.zzA().zzm();
    }

    public final void zzf(Object obj) {
        this.zzb.zzm(obj);
        this.zzd.zze(obj);
    }

    public final void zzg(Object obj, Object obj2) {
        zzabq.zzF(this.zzb, obj, obj2);
        if (this.zzc) {
            zzabq.zzE(this.zzd, obj, obj2);
        }
    }

    public final void zzh(Object obj, zzabn zzabn, zzzk zzzk) throws IOException {
        boolean z;
        zzacf zzacf = this.zzb;
        zzzl zzzl = this.zzd;
        Object zzc2 = zzacf.zzc(obj);
        zzzp zzb2 = zzzl.zzb(obj);
        while (zzabn.zzc() != Integer.MAX_VALUE) {
            int zzd2 = zzabn.zzd();
            if (zzd2 != 11) {
                if ((zzd2 & 7) == 2) {
                    Object zzc3 = zzzl.zzc(zzzk, this.zza, zzd2 >>> 3);
                    if (zzc3 != null) {
                        zzzl.zzf(zzabn, zzc3, zzzk, zzb2);
                    } else {
                        z = zzacf.zzp(zzc2, zzabn);
                    }
                } else {
                    z = zzabn.zzO();
                }
                if (!z) {
                    break;
                }
            } else {
                int i = 0;
                Object obj2 = null;
                zzyu zzyu = null;
                while (true) {
                    try {
                        if (zzabn.zzc() == Integer.MAX_VALUE) {
                            break;
                        }
                        int zzd3 = zzabn.zzd();
                        if (zzd3 == 16) {
                            i = zzabn.zzj();
                            obj2 = zzzl.zzc(zzzk, this.zza, i);
                        } else if (zzd3 == 26) {
                            if (obj2 != null) {
                                zzzl.zzf(zzabn, obj2, zzzk, zzb2);
                            } else {
                                zzyu = zzabn.zzp();
                            }
                        } else if (!zzabn.zzO()) {
                            break;
                        }
                    } catch (Throwable th) {
                        zzacf.zzn(obj, zzc2);
                        throw th;
                    }
                }
                if (zzabn.zzd() != 12) {
                    throw zzaaf.zzb();
                } else if (zzyu != null) {
                    if (obj2 != null) {
                        zzzl.zzg(zzyu, obj2, zzzk, zzb2);
                    } else {
                        zzacf.zzk(zzc2, i, zzyu);
                    }
                }
            }
        }
        zzacf.zzn(obj, zzc2);
    }

    public final void zzi(Object obj, byte[] bArr, int i, int i2, zzyh zzyh) throws IOException {
        zzzx zzzx = (zzzx) obj;
        if (zzzx.zzc == zzacg.zzc()) {
            zzzx.zzc = zzacg.zze();
        }
        zzzu zzzu = (zzzu) obj;
        throw null;
    }

    public final boolean zzj(Object obj, Object obj2) {
        if (!this.zzb.zzd(obj).equals(this.zzb.zzd(obj2))) {
            return false;
        }
        if (!this.zzc) {
            return true;
        }
        this.zzd.zza(obj);
        this.zzd.zza(obj2);
        throw null;
    }

    public final boolean zzk(Object obj) {
        this.zzd.zza(obj);
        throw null;
    }

    public final void zzn(Object obj, zzzg zzzg) throws IOException {
        this.zzd.zza(obj);
        throw null;
    }
}
