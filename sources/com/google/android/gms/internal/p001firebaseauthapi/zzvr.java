package com.google.android.gms.internal.p001firebaseauthapi;

import androidx.collection.ArrayMap;
import com.google.firebase.FirebaseApp;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvr  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzvr {
    private static final Map zza = new ArrayMap();
    private static final Map zzb = new ArrayMap();

    public static String zza(String str) {
        zzvp zzvp;
        Map map = zza;
        synchronized (map) {
            zzvp = (zzvp) map.get(str);
        }
        if (zzvp != null) {
            return zzh(zzvp.zzb(), zzvp.zza(), zzvp.zzb().contains(":")).concat("emulator/auth/handler");
        }
        throw new IllegalStateException("Tried to get the emulator widget endpoint, but no emulator endpoint overrides found.");
    }

    public static String zzb(String str) {
        zzvp zzvp;
        Map map = zza;
        synchronized (map) {
            zzvp = (zzvp) map.get(str);
        }
        return (zzvp != null ? "".concat(zzh(zzvp.zzb(), zzvp.zza(), zzvp.zzb().contains(":"))) : "https://").concat("www.googleapis.com/identitytoolkit/v3/relyingparty");
    }

    public static String zzc(String str) {
        zzvp zzvp;
        Map map = zza;
        synchronized (map) {
            zzvp = (zzvp) map.get(str);
        }
        return (zzvp != null ? "".concat(zzh(zzvp.zzb(), zzvp.zza(), zzvp.zzb().contains(":"))) : "https://").concat("identitytoolkit.googleapis.com/v2/accounts");
    }

    public static String zzd(String str) {
        zzvp zzvp;
        Map map = zza;
        synchronized (map) {
            zzvp = (zzvp) map.get(str);
        }
        return (zzvp != null ? "".concat(zzh(zzvp.zzb(), zzvp.zza(), zzvp.zzb().contains(":"))) : "https://").concat("securetoken.googleapis.com/v1");
    }

    public static void zze(String str, zzvq zzvq) {
        Map map = zzb;
        synchronized (map) {
            if (map.containsKey(str)) {
                ((List) map.get(str)).add(new WeakReference(zzvq));
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new WeakReference(zzvq));
                map.put(str, arrayList);
            }
        }
    }

    public static void zzf(FirebaseApp firebaseApp, String str, int i) {
        String apiKey = firebaseApp.getOptions().getApiKey();
        Map map = zza;
        synchronized (map) {
            map.put(apiKey, new zzvp(str, i));
        }
        Map map2 = zzb;
        synchronized (map2) {
            if (map2.containsKey(apiKey)) {
                boolean z = false;
                for (WeakReference weakReference : (List) map2.get(apiKey)) {
                    zzvq zzvq = (zzvq) weakReference.get();
                    if (zzvq != null) {
                        zzvq.zzi();
                        z = true;
                    }
                }
                if (!z) {
                    zza.remove(apiKey);
                }
            }
        }
    }

    public static boolean zzg(FirebaseApp firebaseApp) {
        return zza.containsKey(firebaseApp.getOptions().getApiKey());
    }

    private static String zzh(String str, int i, boolean z) {
        if (z) {
            return "http://[" + str + "]:" + i + "/";
        }
        return "http://" + str + ":" + i + "/";
    }
}
