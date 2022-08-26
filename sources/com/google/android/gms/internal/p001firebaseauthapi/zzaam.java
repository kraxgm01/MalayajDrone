package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaam  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzaam extends zzaaq {
    private static final Class zza = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private zzaam() {
        super((zzaap) null);
    }

    /* synthetic */ zzaam(zzaal zzaal) {
        super((zzaap) null);
    }

    private static List zzf(Object obj, long j, int i) {
        List list;
        List list2 = (List) zzacp.zzf(obj, j);
        if (list2.isEmpty()) {
            if (list2 instanceof zzaak) {
                list = new zzaaj(i);
            } else if (!(list2 instanceof zzabj) || !(list2 instanceof zzaac)) {
                list = new ArrayList(i);
            } else {
                list = ((zzaac) list2).zzd(i);
            }
            zzacp.zzs(obj, j, list);
            return list;
        } else if (zza.isAssignableFrom(list2.getClass())) {
            ArrayList arrayList = new ArrayList(list2.size() + i);
            arrayList.addAll(list2);
            zzacp.zzs(obj, j, arrayList);
            return arrayList;
        } else if (list2 instanceof zzack) {
            zzaaj zzaaj = new zzaaj(list2.size() + i);
            zzaaj.addAll(zzaaj.size(), (zzack) list2);
            zzacp.zzs(obj, j, zzaaj);
            return zzaaj;
        } else if (!(list2 instanceof zzabj) || !(list2 instanceof zzaac)) {
            return list2;
        } else {
            zzaac zzaac = (zzaac) list2;
            if (zzaac.zzc()) {
                return list2;
            }
            zzaac zzd = zzaac.zzd(list2.size() + i);
            zzacp.zzs(obj, j, zzd);
            return zzd;
        }
    }

    /* access modifiers changed from: package-private */
    public final List zza(Object obj, long j) {
        return zzf(obj, j, 10);
    }

    /* access modifiers changed from: package-private */
    public final void zzb(Object obj, long j) {
        Object obj2;
        List list = (List) zzacp.zzf(obj, j);
        if (list instanceof zzaak) {
            obj2 = ((zzaak) list).zze();
        } else if (!zza.isAssignableFrom(list.getClass())) {
            if (!(list instanceof zzabj) || !(list instanceof zzaac)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                zzaac zzaac = (zzaac) list;
                if (zzaac.zzc()) {
                    zzaac.zzb();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        zzacp.zzs(obj, j, obj2);
    }

    /* access modifiers changed from: package-private */
    public final void zzc(Object obj, Object obj2, long j) {
        List list = (List) zzacp.zzf(obj2, j);
        List zzf = zzf(obj, j, list.size());
        int size = zzf.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            zzf.addAll(list);
        }
        if (size > 0) {
            list = zzf;
        }
        zzacp.zzs(obj, j, list);
    }
}
