package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import com.google.firebase.auth.zze;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzqm  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzqm implements zzuy {
    final /* synthetic */ zzux zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ Boolean zzd;
    final /* synthetic */ zze zze;
    final /* synthetic */ zzts zzf;
    final /* synthetic */ zzwq zzg;

    zzqm(zzrx zzrx, zzux zzux, String str, String str2, Boolean bool, zze zze2, zzts zzts, zzwq zzwq) {
        this.zza = zzux;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bool;
        this.zze = zze2;
        this.zzf = zzts;
        this.zzg = zzwq;
    }

    public final void zza(String str) {
        this.zza.zza(str);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List list;
        List zzb2 = ((zzwh) obj).zzb();
        if (zzb2 == null || zzb2.isEmpty()) {
            this.zza.zza("No users.");
            return;
        }
        int i = 0;
        zzwj zzwj = (zzwj) zzb2.get(0);
        zzwy zzl = zzwj.zzl();
        if (zzl != null) {
            list = zzl.zzc();
        } else {
            list = null;
        }
        if (list != null && !list.isEmpty()) {
            if (!TextUtils.isEmpty(this.zzb)) {
                while (true) {
                    if (i >= list.size()) {
                        break;
                    } else if (((zzww) list.get(i)).zzf().equals(this.zzb)) {
                        ((zzww) list.get(i)).zzh(this.zzc);
                        break;
                    } else {
                        i++;
                    }
                }
            } else {
                ((zzww) list.get(0)).zzh(this.zzc);
            }
        }
        zzwj.zzh(this.zzd.booleanValue());
        zzwj.zze(this.zze);
        this.zzf.zzi(this.zzg, zzwj);
    }
}
