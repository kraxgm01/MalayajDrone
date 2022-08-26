package com.google.android.gms.internal.p001firebaseauthapi;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbz  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzbz {
    private static final Logger zza = Logger.getLogger(zzbz.class.getName());
    private static final AtomicReference zzb = new AtomicReference(new zzbd());
    private static final ConcurrentMap zzc = new ConcurrentHashMap();
    private static final ConcurrentMap zzd = new ConcurrentHashMap();
    private static final ConcurrentMap zze = new ConcurrentHashMap();
    private static final ConcurrentMap zzf = new ConcurrentHashMap();
    private static final ConcurrentMap zzg = new ConcurrentHashMap();

    private zzbz() {
    }

    @Deprecated
    public static zzax zza(String str) throws GeneralSecurityException {
        return ((zzbd) zzb.get()).zza(str);
    }

    public static zzax zzb(String str) throws GeneralSecurityException {
        return ((zzbd) zzb.get()).zzc(str);
    }

    public static synchronized zzkl zzc(zzkq zzkq) throws GeneralSecurityException {
        zzkl zza2;
        synchronized (zzbz.class) {
            zzax zzb2 = zzb(zzkq.zze());
            if (((Boolean) zzd.get(zzkq.zze())).booleanValue()) {
                zza2 = zzb2.zza(zzkq.zzd());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzkq.zze())));
            }
        }
        return zza2;
    }

    public static synchronized zzabc zzd(zzkq zzkq) throws GeneralSecurityException {
        zzabc zzb2;
        synchronized (zzbz.class) {
            zzax zzb3 = zzb(zzkq.zze());
            if (((Boolean) zzd.get(zzkq.zze())).booleanValue()) {
                zzb2 = zzb3.zzb(zzkq.zzd());
            } else {
                throw new GeneralSecurityException("newKey-operation not permitted for key type ".concat(String.valueOf(zzkq.zze())));
            }
        }
        return zzb2;
    }

    public static Class zze(Class cls) {
        zzbv zzbv = (zzbv) zzf.get(cls);
        if (zzbv == null) {
            return null;
        }
        return zzbv.zza();
    }

    @Deprecated
    public static Object zzf(zzkl zzkl) throws GeneralSecurityException {
        String zze2 = zzkl.zze();
        return ((zzbd) zzb.get()).zza(zze2).zzc(zzkl.zzd());
    }

    public static Object zzg(zzkl zzkl, Class cls) throws GeneralSecurityException {
        return zzh(zzkl.zze(), zzkl.zzd(), cls);
    }

    public static Object zzh(String str, zzyu zzyu, Class cls) throws GeneralSecurityException {
        return ((zzbd) zzb.get()).zzb(str, cls).zzc(zzyu);
    }

    public static Object zzi(String str, zzabc zzabc, Class cls) throws GeneralSecurityException {
        return ((zzbd) zzb.get()).zzb(str, cls).zzd(zzabc);
    }

    public static Object zzj(String str, byte[] bArr, Class cls) throws GeneralSecurityException {
        return zzh(str, zzyu.zzn(bArr), cls);
    }

    public static Object zzk(zzbu zzbu, Class cls) throws GeneralSecurityException {
        zzbv zzbv = (zzbv) zzf.get(cls);
        if (zzbv == null) {
            throw new GeneralSecurityException("No wrapper found for ".concat(String.valueOf(zzbu.zza().getName())));
        } else if (zzbv.zza().equals(zzbu.zza())) {
            return zzbv.zzc(zzbu);
        } else {
            String obj = zzbv.zza().toString();
            String obj2 = zzbu.zza().toString();
            throw new GeneralSecurityException("Wrong input primitive class, expected " + obj + ", got " + obj2);
        }
    }

    static synchronized Map zzl() {
        Map unmodifiableMap;
        synchronized (zzbz.class) {
            unmodifiableMap = Collections.unmodifiableMap(zzg);
        }
        return unmodifiableMap;
    }

    public static synchronized void zzm(zzfq zzfq, zzfo zzfo, boolean z) throws GeneralSecurityException {
        synchronized (zzbz.class) {
            AtomicReference atomicReference = zzb;
            zzbd zzbd = new zzbd((zzbd) atomicReference.get());
            zzbd.zzd(zzfq, zzfo);
            String zzc2 = zzfq.zzc();
            String zzc3 = zzfo.zzc();
            zzp(zzc2, zzfq.zza().zzc(), true);
            zzp(zzc3, Collections.emptyMap(), false);
            if (!((zzbd) atomicReference.get()).zzf(zzc2)) {
                zzc.put(zzc2, new zzby(zzfq));
                zzq(zzfq.zzc(), zzfq.zza().zzc());
            }
            ConcurrentMap concurrentMap = zzd;
            concurrentMap.put(zzc2, true);
            concurrentMap.put(zzc3, false);
            atomicReference.set(zzbd);
        }
    }

    public static synchronized void zzn(zzfo zzfo, boolean z) throws GeneralSecurityException {
        synchronized (zzbz.class) {
            AtomicReference atomicReference = zzb;
            zzbd zzbd = new zzbd((zzbd) atomicReference.get());
            zzbd.zze(zzfo);
            String zzc2 = zzfo.zzc();
            zzp(zzc2, zzfo.zza().zzc(), true);
            if (!((zzbd) atomicReference.get()).zzf(zzc2)) {
                zzc.put(zzc2, new zzby(zzfo));
                zzq(zzc2, zzfo.zza().zzc());
            }
            zzd.put(zzc2, true);
            atomicReference.set(zzbd);
        }
    }

    public static synchronized void zzo(zzbv zzbv) throws GeneralSecurityException {
        synchronized (zzbz.class) {
            if (zzbv != null) {
                Class zzb2 = zzbv.zzb();
                ConcurrentMap concurrentMap = zzf;
                if (concurrentMap.containsKey(zzb2)) {
                    zzbv zzbv2 = (zzbv) concurrentMap.get(zzb2);
                    if (!zzbv.getClass().getName().equals(zzbv2.getClass().getName())) {
                        zza.logp(Level.WARNING, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", "Attempted overwrite of a registered PrimitiveWrapper for type ".concat(zzb2.toString()));
                        throw new GeneralSecurityException(String.format("PrimitiveWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", new Object[]{zzb2.getName(), zzbv2.getClass().getName(), zzbv.getClass().getName()}));
                    }
                }
                concurrentMap.put(zzb2, zzbv);
            } else {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
        }
    }

    private static synchronized void zzp(String str, Map map, boolean z) throws GeneralSecurityException {
        synchronized (zzbz.class) {
            if (z) {
                ConcurrentMap concurrentMap = zzd;
                if (concurrentMap.containsKey(str)) {
                    if (!((Boolean) concurrentMap.get(str)).booleanValue()) {
                        throw new GeneralSecurityException("New keys are already disallowed for key type ".concat(str));
                    }
                }
                if (((zzbd) zzb.get()).zzf(str)) {
                    for (Map.Entry entry : map.entrySet()) {
                        if (!zzg.containsKey(entry.getKey())) {
                            throw new GeneralSecurityException("Attempted to register a new key template " + ((String) entry.getKey()) + " from an existing key manager of type " + str);
                        }
                    }
                } else {
                    for (Map.Entry entry2 : map.entrySet()) {
                        if (zzg.containsKey(entry2.getKey())) {
                            throw new GeneralSecurityException("Attempted overwrite of a registered key template ".concat(String.valueOf((String) entry2.getKey())));
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [java.lang.Object, com.google.android.gms.internal.firebase-auth-api.zzabc] */
    private static void zzq(String str, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            zzg.put((String) entry.getKey(), zzbe.zze(str, ((zzfm) entry.getValue()).zza.zzr(), ((zzfm) entry.getValue()).zzb));
        }
    }
}
