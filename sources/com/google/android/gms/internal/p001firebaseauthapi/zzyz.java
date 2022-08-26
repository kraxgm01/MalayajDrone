package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzyz implements zzabn {
    private final zzyy zza;
    private int zzb;
    private int zzc;
    private int zzd = 0;

    private zzyz(zzyy zzyy) {
        zzaad.zzf(zzyy, "input");
        this.zza = zzyy;
        zzyy.zzc = this;
    }

    private final Object zzP(zzabo zzabo, zzzk zzzk) throws IOException {
        int i = this.zzc;
        this.zzc = ((this.zzb >>> 3) << 3) | 4;
        try {
            Object zze = zzabo.zze();
            zzabo.zzh(zze, this, zzzk);
            zzabo.zzf(zze);
            if (this.zzb == this.zzc) {
                return zze;
            }
            throw zzaaf.zzg();
        } finally {
            this.zzc = i;
        }
    }

    private final Object zzQ(zzabo zzabo, zzzk zzzk) throws IOException {
        int zze = ((zzyw) this.zza).zze();
        zzyy zzyy = this.zza;
        if (zzyy.zza < zzyy.zzb) {
            int zzc2 = zzyy.zzc(zze);
            Object zze2 = zzabo.zze();
            this.zza.zza++;
            zzabo.zzh(zze2, this, zzzk);
            zzabo.zzf(zze2);
            this.zza.zzm(0);
            zzyy zzyy2 = this.zza;
            zzyy2.zza--;
            zzyy2.zzn(zzc2);
            return zze2;
        }
        throw new zzaaf("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    private final void zzR(int i) throws IOException {
        if (this.zza.zzb() != i) {
            throw zzaaf.zzi();
        }
    }

    private final void zzS(int i) throws IOException {
        if ((this.zzb & 7) != i) {
            throw zzaaf.zza();
        }
    }

    private static final void zzT(int i) throws IOException {
        if ((i & 3) != 0) {
            throw zzaaf.zzg();
        }
    }

    private static final void zzU(int i) throws IOException {
        if ((i & 7) != 0) {
            throw zzaaf.zzg();
        }
    }

    public static zzyz zzq(zzyy zzyy) {
        zzyz zzyz = zzyy.zzc;
        return zzyz != null ? zzyz : new zzyz(zzyy);
    }

    public final void zzA(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzaar) {
            zzaar zzaar = (zzaar) list;
            switch (this.zzb & 7) {
                case 1:
                    break;
                case 2:
                    int zze = ((zzyw) this.zza).zze();
                    zzU(zze);
                    int zzb2 = this.zza.zzb() + zze;
                    do {
                        zzaar.zzf(((zzyw) this.zza).zzg());
                    } while (this.zza.zzb() < zzb2);
                    return;
                default:
                    throw zzaaf.zza();
            }
            do {
                zzaar.zzf(((zzyw) this.zza).zzg());
                zzyy zzyy = this.zza;
                if (!zzyy.zzp()) {
                    zzf2 = zzyy.zzf();
                } else {
                    return;
                }
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        switch (this.zzb & 7) {
            case 1:
                break;
            case 2:
                int zze2 = ((zzyw) this.zza).zze();
                zzU(zze2);
                int zzb3 = this.zza.zzb() + zze2;
                do {
                    list.add(Long.valueOf(((zzyw) this.zza).zzg()));
                } while (this.zza.zzb() < zzb3);
                return;
            default:
                throw zzaaf.zza();
        }
        do {
            list.add(Long.valueOf(((zzyw) this.zza).zzg()));
            zzyy zzyy2 = this.zza;
            if (!zzyy2.zzp()) {
                zzf = zzyy2.zzf();
            } else {
                return;
            }
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    public final void zzB(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzzr) {
            zzzr zzzr = (zzzr) list;
            switch (this.zzb & 7) {
                case 2:
                    int zze = ((zzyw) this.zza).zze();
                    zzT(zze);
                    int zzb2 = this.zza.zzb() + zze;
                    do {
                        zzzr.zze(Float.intBitsToFloat(((zzyw) this.zza).zzd()));
                    } while (this.zza.zzb() < zzb2);
                    return;
                case 5:
                    break;
                default:
                    throw zzaaf.zza();
            }
            do {
                zzzr.zze(Float.intBitsToFloat(((zzyw) this.zza).zzd()));
                zzyy zzyy = this.zza;
                if (!zzyy.zzp()) {
                    zzf2 = zzyy.zzf();
                } else {
                    return;
                }
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        switch (this.zzb & 7) {
            case 2:
                int zze2 = ((zzyw) this.zza).zze();
                zzT(zze2);
                int zzb3 = this.zza.zzb() + zze2;
                do {
                    list.add(Float.valueOf(Float.intBitsToFloat(((zzyw) this.zza).zzd())));
                } while (this.zza.zzb() < zzb3);
                return;
            case 5:
                break;
            default:
                throw zzaaf.zza();
        }
        do {
            list.add(Float.valueOf(Float.intBitsToFloat(((zzyw) this.zza).zzd())));
            zzyy zzyy2 = this.zza;
            if (!zzyy2.zzp()) {
                zzf = zzyy2.zzf();
            } else {
                return;
            }
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    @Deprecated
    public final void zzC(List list, zzabo zzabo, zzzk zzzk) throws IOException {
        int zzf;
        int i = this.zzb;
        if ((i & 7) == 3) {
            do {
                list.add(zzP(zzabo, zzzk));
                zzyy zzyy = this.zza;
                if (!zzyy.zzp() && this.zzd == 0) {
                    zzf = zzyy.zzf();
                } else {
                    return;
                }
            } while (zzf == i);
            this.zzd = zzf;
            return;
        }
        throw zzaaf.zza();
    }

    public final void zzD(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzzy) {
            zzzy zzzy = (zzzy) list;
            switch (this.zzb & 7) {
                case 0:
                    break;
                case 2:
                    int zzb2 = this.zza.zzb() + ((zzyw) this.zza).zze();
                    do {
                        zzzy.zzf(((zzyw) this.zza).zze());
                    } while (this.zza.zzb() < zzb2);
                    zzR(zzb2);
                    return;
                default:
                    throw zzaaf.zza();
            }
            do {
                zzzy.zzf(((zzyw) this.zza).zze());
                zzyy zzyy = this.zza;
                if (!zzyy.zzp()) {
                    zzf2 = zzyy.zzf();
                } else {
                    return;
                }
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        switch (this.zzb & 7) {
            case 0:
                break;
            case 2:
                int zzb3 = this.zza.zzb() + ((zzyw) this.zza).zze();
                do {
                    list.add(Integer.valueOf(((zzyw) this.zza).zze()));
                } while (this.zza.zzb() < zzb3);
                zzR(zzb3);
                return;
            default:
                throw zzaaf.zza();
        }
        do {
            list.add(Integer.valueOf(((zzyw) this.zza).zze()));
            zzyy zzyy2 = this.zza;
            if (!zzyy2.zzp()) {
                zzf = zzyy2.zzf();
            } else {
                return;
            }
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    public final void zzE(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzaar) {
            zzaar zzaar = (zzaar) list;
            switch (this.zzb & 7) {
                case 0:
                    break;
                case 2:
                    int zzb2 = this.zza.zzb() + ((zzyw) this.zza).zze();
                    do {
                        zzaar.zzf(((zzyw) this.zza).zzh());
                    } while (this.zza.zzb() < zzb2);
                    zzR(zzb2);
                    return;
                default:
                    throw zzaaf.zza();
            }
            do {
                zzaar.zzf(((zzyw) this.zza).zzh());
                zzyy zzyy = this.zza;
                if (!zzyy.zzp()) {
                    zzf2 = zzyy.zzf();
                } else {
                    return;
                }
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        switch (this.zzb & 7) {
            case 0:
                break;
            case 2:
                int zzb3 = this.zza.zzb() + ((zzyw) this.zza).zze();
                do {
                    list.add(Long.valueOf(((zzyw) this.zza).zzh()));
                } while (this.zza.zzb() < zzb3);
                zzR(zzb3);
                return;
            default:
                throw zzaaf.zza();
        }
        do {
            list.add(Long.valueOf(((zzyw) this.zza).zzh()));
            zzyy zzyy2 = this.zza;
            if (!zzyy2.zzp()) {
                zzf = zzyy2.zzf();
            } else {
                return;
            }
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    public final void zzF(List list, zzabo zzabo, zzzk zzzk) throws IOException {
        int zzf;
        int i = this.zzb;
        if ((i & 7) == 2) {
            do {
                list.add(zzQ(zzabo, zzzk));
                zzyy zzyy = this.zza;
                if (!zzyy.zzp() && this.zzd == 0) {
                    zzf = zzyy.zzf();
                } else {
                    return;
                }
            } while (zzf == i);
            this.zzd = zzf;
            return;
        }
        throw zzaaf.zza();
    }

    public final void zzG(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzzy) {
            zzzy zzzy = (zzzy) list;
            switch (this.zzb & 7) {
                case 2:
                    int zze = ((zzyw) this.zza).zze();
                    zzT(zze);
                    int zzb2 = this.zza.zzb() + zze;
                    do {
                        zzzy.zzf(((zzyw) this.zza).zzd());
                    } while (this.zza.zzb() < zzb2);
                    return;
                case 5:
                    break;
                default:
                    throw zzaaf.zza();
            }
            do {
                zzzy.zzf(((zzyw) this.zza).zzd());
                zzyy zzyy = this.zza;
                if (!zzyy.zzp()) {
                    zzf2 = zzyy.zzf();
                } else {
                    return;
                }
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        switch (this.zzb & 7) {
            case 2:
                int zze2 = ((zzyw) this.zza).zze();
                zzT(zze2);
                int zzb3 = this.zza.zzb() + zze2;
                do {
                    list.add(Integer.valueOf(((zzyw) this.zza).zzd()));
                } while (this.zza.zzb() < zzb3);
                return;
            case 5:
                break;
            default:
                throw zzaaf.zza();
        }
        do {
            list.add(Integer.valueOf(((zzyw) this.zza).zzd()));
            zzyy zzyy2 = this.zza;
            if (!zzyy2.zzp()) {
                zzf = zzyy2.zzf();
            } else {
                return;
            }
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    public final void zzH(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzaar) {
            zzaar zzaar = (zzaar) list;
            switch (this.zzb & 7) {
                case 1:
                    break;
                case 2:
                    int zze = ((zzyw) this.zza).zze();
                    zzU(zze);
                    int zzb2 = this.zza.zzb() + zze;
                    do {
                        zzaar.zzf(((zzyw) this.zza).zzg());
                    } while (this.zza.zzb() < zzb2);
                    return;
                default:
                    throw zzaaf.zza();
            }
            do {
                zzaar.zzf(((zzyw) this.zza).zzg());
                zzyy zzyy = this.zza;
                if (!zzyy.zzp()) {
                    zzf2 = zzyy.zzf();
                } else {
                    return;
                }
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        switch (this.zzb & 7) {
            case 1:
                break;
            case 2:
                int zze2 = ((zzyw) this.zza).zze();
                zzU(zze2);
                int zzb3 = this.zza.zzb() + zze2;
                do {
                    list.add(Long.valueOf(((zzyw) this.zza).zzg()));
                } while (this.zza.zzb() < zzb3);
                return;
            default:
                throw zzaaf.zza();
        }
        do {
            list.add(Long.valueOf(((zzyw) this.zza).zzg()));
            zzyy zzyy2 = this.zza;
            if (!zzyy2.zzp()) {
                zzf = zzyy2.zzf();
            } else {
                return;
            }
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    public final void zzI(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzzy) {
            zzzy zzzy = (zzzy) list;
            switch (this.zzb & 7) {
                case 0:
                    break;
                case 2:
                    int zzb2 = this.zza.zzb() + ((zzyw) this.zza).zze();
                    do {
                        zzzy.zzf(zzyw.zzs(((zzyw) this.zza).zze()));
                    } while (this.zza.zzb() < zzb2);
                    zzR(zzb2);
                    return;
                default:
                    throw zzaaf.zza();
            }
            do {
                zzzy.zzf(zzyw.zzs(((zzyw) this.zza).zze()));
                zzyy zzyy = this.zza;
                if (!zzyy.zzp()) {
                    zzf2 = zzyy.zzf();
                } else {
                    return;
                }
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        switch (this.zzb & 7) {
            case 0:
                break;
            case 2:
                int zzb3 = this.zza.zzb() + ((zzyw) this.zza).zze();
                do {
                    list.add(Integer.valueOf(zzyw.zzs(((zzyw) this.zza).zze())));
                } while (this.zza.zzb() < zzb3);
                zzR(zzb3);
                return;
            default:
                throw zzaaf.zza();
        }
        do {
            list.add(Integer.valueOf(zzyw.zzs(((zzyw) this.zza).zze())));
            zzyy zzyy2 = this.zza;
            if (!zzyy2.zzp()) {
                zzf = zzyy2.zzf();
            } else {
                return;
            }
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    public final void zzJ(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzaar) {
            zzaar zzaar = (zzaar) list;
            switch (this.zzb & 7) {
                case 0:
                    break;
                case 2:
                    int zzb2 = this.zza.zzb() + ((zzyw) this.zza).zze();
                    do {
                        zzaar.zzf(zzyw.zzt(((zzyw) this.zza).zzh()));
                    } while (this.zza.zzb() < zzb2);
                    zzR(zzb2);
                    return;
                default:
                    throw zzaaf.zza();
            }
            do {
                zzaar.zzf(zzyw.zzt(((zzyw) this.zza).zzh()));
                zzyy zzyy = this.zza;
                if (!zzyy.zzp()) {
                    zzf2 = zzyy.zzf();
                } else {
                    return;
                }
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        switch (this.zzb & 7) {
            case 0:
                break;
            case 2:
                int zzb3 = this.zza.zzb() + ((zzyw) this.zza).zze();
                do {
                    list.add(Long.valueOf(zzyw.zzt(((zzyw) this.zza).zzh())));
                } while (this.zza.zzb() < zzb3);
                zzR(zzb3);
                return;
            default:
                throw zzaaf.zza();
        }
        do {
            list.add(Long.valueOf(zzyw.zzt(((zzyw) this.zza).zzh())));
            zzyy zzyy2 = this.zza;
            if (!zzyy2.zzp()) {
                zzf = zzyy2.zzf();
            } else {
                return;
            }
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    public final void zzK(List list, boolean z) throws IOException {
        int zzf;
        int zzf2;
        if ((this.zzb & 7) != 2) {
            throw zzaaf.zza();
        } else if ((list instanceof zzaak) && !z) {
            zzaak zzaak = (zzaak) list;
            do {
                zzaak.zzi(zzp());
                zzyy zzyy = this.zza;
                if (!zzyy.zzp()) {
                    zzf2 = zzyy.zzf();
                } else {
                    return;
                }
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
        } else {
            do {
                list.add(z ? zzu() : zzt());
                zzyy zzyy2 = this.zza;
                if (!zzyy2.zzp()) {
                    zzf = zzyy2.zzf();
                } else {
                    return;
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
        }
    }

    public final void zzL(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzzy) {
            zzzy zzzy = (zzzy) list;
            switch (this.zzb & 7) {
                case 0:
                    break;
                case 2:
                    int zzb2 = this.zza.zzb() + ((zzyw) this.zza).zze();
                    do {
                        zzzy.zzf(((zzyw) this.zza).zze());
                    } while (this.zza.zzb() < zzb2);
                    zzR(zzb2);
                    return;
                default:
                    throw zzaaf.zza();
            }
            do {
                zzzy.zzf(((zzyw) this.zza).zze());
                zzyy zzyy = this.zza;
                if (!zzyy.zzp()) {
                    zzf2 = zzyy.zzf();
                } else {
                    return;
                }
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        switch (this.zzb & 7) {
            case 0:
                break;
            case 2:
                int zzb3 = this.zza.zzb() + ((zzyw) this.zza).zze();
                do {
                    list.add(Integer.valueOf(((zzyw) this.zza).zze()));
                } while (this.zza.zzb() < zzb3);
                zzR(zzb3);
                return;
            default:
                throw zzaaf.zza();
        }
        do {
            list.add(Integer.valueOf(((zzyw) this.zza).zze()));
            zzyy zzyy2 = this.zza;
            if (!zzyy2.zzp()) {
                zzf = zzyy2.zzf();
            } else {
                return;
            }
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    public final void zzM(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzaar) {
            zzaar zzaar = (zzaar) list;
            switch (this.zzb & 7) {
                case 0:
                    break;
                case 2:
                    int zzb2 = this.zza.zzb() + ((zzyw) this.zza).zze();
                    do {
                        zzaar.zzf(((zzyw) this.zza).zzh());
                    } while (this.zza.zzb() < zzb2);
                    zzR(zzb2);
                    return;
                default:
                    throw zzaaf.zza();
            }
            do {
                zzaar.zzf(((zzyw) this.zza).zzh());
                zzyy zzyy = this.zza;
                if (!zzyy.zzp()) {
                    zzf2 = zzyy.zzf();
                } else {
                    return;
                }
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        switch (this.zzb & 7) {
            case 0:
                break;
            case 2:
                int zzb3 = this.zza.zzb() + ((zzyw) this.zza).zze();
                do {
                    list.add(Long.valueOf(((zzyw) this.zza).zzh()));
                } while (this.zza.zzb() < zzb3);
                zzR(zzb3);
                return;
            default:
                throw zzaaf.zza();
        }
        do {
            list.add(Long.valueOf(((zzyw) this.zza).zzh()));
            zzyy zzyy2 = this.zza;
            if (!zzyy2.zzp()) {
                zzf = zzyy2.zzf();
            } else {
                return;
            }
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    public final boolean zzN() throws IOException {
        zzS(0);
        return this.zza.zzq();
    }

    public final boolean zzO() throws IOException {
        int i;
        zzyy zzyy = this.zza;
        if (zzyy.zzp() || (i = this.zzb) == this.zzc) {
            return false;
        }
        return zzyy.zzr(i);
    }

    public final double zza() throws IOException {
        zzS(1);
        return Double.longBitsToDouble(((zzyw) this.zza).zzg());
    }

    public final float zzb() throws IOException {
        zzS(5);
        return Float.intBitsToFloat(((zzyw) this.zza).zzd());
    }

    public final int zzc() throws IOException {
        int i = this.zzd;
        if (i != 0) {
            this.zzb = i;
            this.zzd = 0;
        } else {
            i = this.zza.zzf();
            this.zzb = i;
        }
        if (i == 0 || i == this.zzc) {
            return Integer.MAX_VALUE;
        }
        return i >>> 3;
    }

    public final int zzd() {
        return this.zzb;
    }

    public final int zze() throws IOException {
        zzS(0);
        return ((zzyw) this.zza).zze();
    }

    public final int zzf() throws IOException {
        zzS(5);
        return ((zzyw) this.zza).zzd();
    }

    public final int zzg() throws IOException {
        zzS(0);
        return ((zzyw) this.zza).zze();
    }

    public final int zzh() throws IOException {
        zzS(5);
        return ((zzyw) this.zza).zzd();
    }

    public final int zzi() throws IOException {
        zzS(0);
        return zzyw.zzs(((zzyw) this.zza).zze());
    }

    public final int zzj() throws IOException {
        zzS(0);
        return ((zzyw) this.zza).zze();
    }

    public final long zzk() throws IOException {
        zzS(1);
        return ((zzyw) this.zza).zzg();
    }

    public final long zzl() throws IOException {
        zzS(0);
        return ((zzyw) this.zza).zzh();
    }

    public final long zzm() throws IOException {
        zzS(1);
        return ((zzyw) this.zza).zzg();
    }

    public final long zzn() throws IOException {
        zzS(0);
        return zzyw.zzt(((zzyw) this.zza).zzh());
    }

    public final long zzo() throws IOException {
        zzS(0);
        return ((zzyw) this.zza).zzh();
    }

    public final zzyu zzp() throws IOException {
        zzS(2);
        return this.zza.zzj();
    }

    @Deprecated
    public final Object zzr(zzabo zzabo, zzzk zzzk) throws IOException {
        zzS(3);
        return zzP(zzabo, zzzk);
    }

    public final Object zzs(zzabo zzabo, zzzk zzzk) throws IOException {
        zzS(2);
        return zzQ(zzabo, zzzk);
    }

    public final String zzt() throws IOException {
        zzS(2);
        return this.zza.zzk();
    }

    public final String zzu() throws IOException {
        zzS(2);
        return this.zza.zzl();
    }

    public final void zzv(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzyj) {
            zzyj zzyj = (zzyj) list;
            switch (this.zzb & 7) {
                case 0:
                    break;
                case 2:
                    int zzb2 = this.zza.zzb() + ((zzyw) this.zza).zze();
                    do {
                        zzyj.zze(this.zza.zzq());
                    } while (this.zza.zzb() < zzb2);
                    zzR(zzb2);
                    return;
                default:
                    throw zzaaf.zza();
            }
            do {
                zzyj.zze(this.zza.zzq());
                zzyy zzyy = this.zza;
                if (!zzyy.zzp()) {
                    zzf2 = zzyy.zzf();
                } else {
                    return;
                }
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        switch (this.zzb & 7) {
            case 0:
                break;
            case 2:
                int zzb3 = this.zza.zzb() + ((zzyw) this.zza).zze();
                do {
                    list.add(Boolean.valueOf(this.zza.zzq()));
                } while (this.zza.zzb() < zzb3);
                zzR(zzb3);
                return;
            default:
                throw zzaaf.zza();
        }
        do {
            list.add(Boolean.valueOf(this.zza.zzq()));
            zzyy zzyy2 = this.zza;
            if (!zzyy2.zzp()) {
                zzf = zzyy2.zzf();
            } else {
                return;
            }
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    public final void zzw(List list) throws IOException {
        int zzf;
        if ((this.zzb & 7) == 2) {
            do {
                list.add(zzp());
                zzyy zzyy = this.zza;
                if (!zzyy.zzp()) {
                    zzf = zzyy.zzf();
                } else {
                    return;
                }
            } while (zzf == this.zzb);
            this.zzd = zzf;
            return;
        }
        throw zzaaf.zza();
    }

    public final void zzx(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzzh) {
            zzzh zzzh = (zzzh) list;
            switch (this.zzb & 7) {
                case 1:
                    break;
                case 2:
                    int zze = ((zzyw) this.zza).zze();
                    zzU(zze);
                    int zzb2 = this.zza.zzb() + zze;
                    do {
                        zzzh.zze(Double.longBitsToDouble(((zzyw) this.zza).zzg()));
                    } while (this.zza.zzb() < zzb2);
                    return;
                default:
                    throw zzaaf.zza();
            }
            do {
                zzzh.zze(Double.longBitsToDouble(((zzyw) this.zza).zzg()));
                zzyy zzyy = this.zza;
                if (!zzyy.zzp()) {
                    zzf2 = zzyy.zzf();
                } else {
                    return;
                }
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        switch (this.zzb & 7) {
            case 1:
                break;
            case 2:
                int zze2 = ((zzyw) this.zza).zze();
                zzU(zze2);
                int zzb3 = this.zza.zzb() + zze2;
                do {
                    list.add(Double.valueOf(Double.longBitsToDouble(((zzyw) this.zza).zzg())));
                } while (this.zza.zzb() < zzb3);
                return;
            default:
                throw zzaaf.zza();
        }
        do {
            list.add(Double.valueOf(Double.longBitsToDouble(((zzyw) this.zza).zzg())));
            zzyy zzyy2 = this.zza;
            if (!zzyy2.zzp()) {
                zzf = zzyy2.zzf();
            } else {
                return;
            }
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    public final void zzy(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzzy) {
            zzzy zzzy = (zzzy) list;
            switch (this.zzb & 7) {
                case 0:
                    break;
                case 2:
                    int zzb2 = this.zza.zzb() + ((zzyw) this.zza).zze();
                    do {
                        zzzy.zzf(((zzyw) this.zza).zze());
                    } while (this.zza.zzb() < zzb2);
                    zzR(zzb2);
                    return;
                default:
                    throw zzaaf.zza();
            }
            do {
                zzzy.zzf(((zzyw) this.zza).zze());
                zzyy zzyy = this.zza;
                if (!zzyy.zzp()) {
                    zzf2 = zzyy.zzf();
                } else {
                    return;
                }
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        switch (this.zzb & 7) {
            case 0:
                break;
            case 2:
                int zzb3 = this.zza.zzb() + ((zzyw) this.zza).zze();
                do {
                    list.add(Integer.valueOf(((zzyw) this.zza).zze()));
                } while (this.zza.zzb() < zzb3);
                zzR(zzb3);
                return;
            default:
                throw zzaaf.zza();
        }
        do {
            list.add(Integer.valueOf(((zzyw) this.zza).zze()));
            zzyy zzyy2 = this.zza;
            if (!zzyy2.zzp()) {
                zzf = zzyy2.zzf();
            } else {
                return;
            }
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }

    public final void zzz(List list) throws IOException {
        int zzf;
        int zzf2;
        if (list instanceof zzzy) {
            zzzy zzzy = (zzzy) list;
            switch (this.zzb & 7) {
                case 2:
                    int zze = ((zzyw) this.zza).zze();
                    zzT(zze);
                    int zzb2 = this.zza.zzb() + zze;
                    do {
                        zzzy.zzf(((zzyw) this.zza).zzd());
                    } while (this.zza.zzb() < zzb2);
                    return;
                case 5:
                    break;
                default:
                    throw zzaaf.zza();
            }
            do {
                zzzy.zzf(((zzyw) this.zza).zzd());
                zzyy zzyy = this.zza;
                if (!zzyy.zzp()) {
                    zzf2 = zzyy.zzf();
                } else {
                    return;
                }
            } while (zzf2 == this.zzb);
            this.zzd = zzf2;
            return;
        }
        switch (this.zzb & 7) {
            case 2:
                int zze2 = ((zzyw) this.zza).zze();
                zzT(zze2);
                int zzb3 = this.zza.zzb() + zze2;
                do {
                    list.add(Integer.valueOf(((zzyw) this.zza).zzd()));
                } while (this.zza.zzb() < zzb3);
                return;
            case 5:
                break;
            default:
                throw zzaaf.zza();
        }
        do {
            list.add(Integer.valueOf(((zzyw) this.zza).zzd()));
            zzyy zzyy2 = this.zza;
            if (!zzyy2.zzp()) {
                zzf = zzyy2.zzf();
            } else {
                return;
            }
        } while (zzf == this.zzb);
        this.zzd = zzf;
    }
}
