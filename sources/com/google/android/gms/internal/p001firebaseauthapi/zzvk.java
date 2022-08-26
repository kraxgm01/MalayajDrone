package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.logging.Logger;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvk  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzvk extends zzts {
    final /* synthetic */ zzvn zza;
    private final String zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzvk(zzvn zzvn, zzts zzts, String str) {
        super(zzts);
        this.zza = zzvn;
        this.zzb = str;
    }

    public final void zzb(String str) {
        zzvn.zza.d("onCodeSent", new Object[0]);
        zzvm zzvm = (zzvm) this.zza.zzd.get(this.zzb);
        if (zzvm != null) {
            for (zzts zzb2 : zzvm.zzb) {
                zzb2.zzb(str);
            }
            zzvm.zzg = true;
            zzvm.zzd = str;
            if (zzvm.zza <= 0) {
                this.zza.zzh(this.zzb);
            } else if (!zzvm.zzc) {
                this.zza.zzn(this.zzb);
            } else if (!zzag.zzd(zzvm.zze)) {
                zzvn.zze(this.zza, this.zzb);
            }
        }
    }

    public final void zzh(Status status) {
        Logger zza2 = zzvn.zza;
        String statusCodeString = CommonStatusCodes.getStatusCodeString(status.getStatusCode());
        String statusMessage = status.getStatusMessage();
        zza2.e("SMS verification code request failed: " + statusCodeString + " " + statusMessage, new Object[0]);
        zzvm zzvm = (zzvm) this.zza.zzd.get(this.zzb);
        if (zzvm != null) {
            for (zzts zzh : zzvm.zzb) {
                zzh.zzh(status);
            }
            this.zza.zzj(this.zzb);
        }
    }
}
