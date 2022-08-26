package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzp  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzzp {
    private static final zzzp zzb = new zzzp(true);
    final zzacb zza = new zzabr(16);
    private boolean zzc;
    private boolean zzd;

    private zzzp() {
    }

    public static zzzp zza() {
        throw null;
    }

    private static final void zzd(zzzo zzzo, Object obj) {
        boolean z;
        zzacv zzb2 = zzzo.zzb();
        zzaad.zze(obj);
        zzacv zzacv = zzacv.DOUBLE;
        zzacw zzacw = zzacw.INT;
        switch (zzb2.zza().ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof zzyu) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof zzzz)) {
                    return;
                }
            case 8:
                if ((obj instanceof zzabc) || (obj instanceof zzaah)) {
                    return;
                }
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(zzzo.zza()), zzzo.zzb().zza(), obj.getClass().getName()}));
    }

    public final /* bridge */ /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzzp zzzp = new zzzp();
        for (int i = 0; i < this.zza.zzb(); i++) {
            Map.Entry zzg = this.zza.zzg(i);
            zzzp.zzc((zzzo) zzg.getKey(), zzg.getValue());
        }
        for (Map.Entry entry : this.zza.zzc()) {
            zzzp.zzc((zzzo) entry.getKey(), entry.getValue());
        }
        zzzp.zzd = this.zzd;
        return zzzp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzzp)) {
            return false;
        }
        return this.zza.equals(((zzzp) obj).zza);
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final void zzb() {
        if (!this.zzc) {
            this.zza.zza();
            this.zzc = true;
        }
    }

    public final void zzc(zzzo zzzo, Object obj) {
        if (!zzzo.zzc()) {
            zzd(zzzo, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                zzd(zzzo, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof zzaah) {
            this.zzd = true;
        }
        this.zza.put(zzzo, obj);
    }

    private zzzp(boolean z) {
        zzb();
        zzb();
    }
}
