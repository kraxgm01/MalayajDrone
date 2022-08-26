package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Comparator;
import kotlin.UByte;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzym  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzym implements Comparator {
    zzym() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzyu zzyu = (zzyu) obj;
        zzyu zzyu2 = (zzyu) obj2;
        zzyl zzyl = new zzyl(zzyu);
        zzyl zzyl2 = new zzyl(zzyu2);
        while (zzyl.hasNext() && zzyl2.hasNext()) {
            int compareTo = Integer.valueOf(zzyl.zza() & UByte.MAX_VALUE).compareTo(Integer.valueOf(zzyl2.zza() & UByte.MAX_VALUE));
            if (compareTo != 0) {
                return compareTo;
            }
        }
        return Integer.valueOf(zzyu.zzd()).compareTo(Integer.valueOf(zzyu2.zzd()));
    }
}
