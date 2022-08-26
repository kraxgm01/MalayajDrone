package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzbd {
    private static final Logger zza = Logger.getLogger(zzbd.class.getName());
    private final ConcurrentMap zzb;

    zzbd() {
        this.zzb = new ConcurrentHashMap();
    }

    private final zzax zzg(String str, Class cls) throws GeneralSecurityException {
        zzbc zzh = zzh(str);
        if (cls == null) {
            return zzh.zzb();
        }
        if (zzh.zze().contains(cls)) {
            return zzh.zza(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzh.zzc());
        Set<Class> zze = zzh.zze();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class cls2 : zze) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        throw new GeneralSecurityException("Primitive type " + name + " not supported by key manager of type " + valueOf + ", supported primitives: " + sb2);
    }

    private final synchronized zzbc zzh(String str) throws GeneralSecurityException {
        if (this.zzb.containsKey(str)) {
        } else {
            throw new GeneralSecurityException("No key manager found for key type ".concat(String.valueOf(str)));
        }
        return (zzbc) this.zzb.get(str);
    }

    private final synchronized void zzi(zzbc zzbc, boolean z) throws GeneralSecurityException {
        String zze = zzbc.zzb().zze();
        zzbc zzbc2 = (zzbc) this.zzb.get(zze);
        if (zzbc2 != null) {
            if (!zzbc2.zzc().equals(zzbc.zzc())) {
                zza.logp(Level.WARNING, "com.google.crypto.tink.KeyManagerRegistry", "registerKeyManagerContainer", "Attempted overwrite of a registered key manager for key type ".concat(zze));
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", new Object[]{zze, zzbc2.zzc().getName(), zzbc.zzc().getName()}));
            }
        }
        if (!z) {
            this.zzb.putIfAbsent(zze, zzbc);
        } else {
            this.zzb.put(zze, zzbc);
        }
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public final zzax zza(String str) throws GeneralSecurityException {
        return zzg(str, (Class) null);
    }

    /* access modifiers changed from: package-private */
    public final zzax zzb(String str, Class cls) throws GeneralSecurityException {
        return zzg(str, cls);
    }

    /* access modifiers changed from: package-private */
    public final zzax zzc(String str) throws GeneralSecurityException {
        return zzh(str).zzb();
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zzd(zzfq zzfq, zzfo zzfo) throws GeneralSecurityException {
        Class zzd;
        int zze = zzfo.zze();
        if (!zzdu.zza(1)) {
            String valueOf = String.valueOf(zzfq.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        } else if (zzdu.zza(zze)) {
            String zzc = zzfq.zzc();
            String zzc2 = zzfo.zzc();
            if (!(!this.zzb.containsKey(zzc) || ((zzbc) this.zzb.get(zzc)).zzd() == null || (zzd = ((zzbc) this.zzb.get(zzc)).zzd()) == null)) {
                if (!zzd.getName().equals(zzfo.getClass().getName())) {
                    Logger logger = zza;
                    Level level = Level.WARNING;
                    logger.logp(level, "com.google.crypto.tink.KeyManagerRegistry", "registerAsymmetricKeyManagers", "Attempted overwrite of a registered key manager for key type " + zzc + " with inconsistent public key type " + zzc2);
                    throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", new Object[]{zzfq.getClass().getName(), zzd.getName(), zzfo.getClass().getName()}));
                }
            }
            zzi(new zzbb(zzfq, zzfo), true);
            zzi(new zzba(zzfo), false);
        } else {
            String valueOf2 = String.valueOf(zzfo.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf2 + " as it is not FIPS compatible.");
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void zze(zzfo zzfo) throws GeneralSecurityException {
        if (zzdu.zza(zzfo.zze())) {
            zzi(new zzba(zzfo), false);
        } else {
            String valueOf = String.valueOf(zzfo.getClass());
            throw new GeneralSecurityException("failed to register key manager " + valueOf + " as it is not FIPS compatible.");
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean zzf(String str) {
        return this.zzb.containsKey(str);
    }

    zzbd(zzbd zzbd) {
        this.zzb = new ConcurrentHashMap(zzbd.zzb);
    }
}
