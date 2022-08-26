package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzql  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzql implements zzuy {
    final /* synthetic */ zzxg zza;
    final /* synthetic */ zzwj zzb;
    final /* synthetic */ zzts zzc;
    final /* synthetic */ zzwq zzd;
    final /* synthetic */ zzux zze;
    final /* synthetic */ zzrx zzf;

    zzql(zzrx zzrx, zzxg zzxg, zzwj zzwj, zzts zzts, zzwq zzwq, zzux zzux) {
        this.zzf = zzrx;
        this.zza = zzxg;
        this.zzb = zzwj;
        this.zzc = zzts;
        this.zzd = zzwq;
        this.zze = zzux;
    }

    public final void zza(String str) {
        this.zze.zza(str);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzxh zzxh = (zzxh) obj;
        if (this.zza.zzn("EMAIL")) {
            this.zzb.zzg((String) null);
        } else {
            zzxg zzxg = this.zza;
            if (zzxg.zzk() != null) {
                this.zzb.zzg(zzxg.zzk());
            }
        }
        if (this.zza.zzn("DISPLAY_NAME")) {
            this.zzb.zzf((String) null);
        } else {
            zzxg zzxg2 = this.zza;
            if (zzxg2.zzj() != null) {
                this.zzb.zzf(zzxg2.zzj());
            }
        }
        if (this.zza.zzn("PHOTO_URL")) {
            this.zzb.zzj((String) null);
        } else {
            zzxg zzxg3 = this.zza;
            if (zzxg3.zzm() != null) {
                this.zzb.zzj(zzxg3.zzm());
            }
        }
        if (!TextUtils.isEmpty(this.zza.zzl())) {
            this.zzb.zzi(Base64Utils.encode("redacted".getBytes()));
        }
        List zzf2 = zzxh.zzf();
        if (zzf2 == null) {
            zzf2 = new ArrayList();
        }
        this.zzb.zzk(zzf2);
        zzts zzts = this.zzc;
        zzwq zzwq = this.zzd;
        Preconditions.checkNotNull(zzwq);
        Preconditions.checkNotNull(zzxh);
        String zzd2 = zzxh.zzd();
        String zze2 = zzxh.zze();
        if (!TextUtils.isEmpty(zzd2) && !TextUtils.isEmpty(zze2)) {
            zzwq = new zzwq(zze2, zzd2, Long.valueOf(zzxh.zzb()), zzwq.zzg());
        }
        zzts.zzi(zzwq, this.zzb);
    }
}
