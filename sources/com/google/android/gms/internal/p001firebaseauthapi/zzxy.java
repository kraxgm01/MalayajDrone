package com.google.android.gms.internal.p001firebaseauthapi;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxy  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzxy implements zzue {
    private String zza;
    private String zzb;
    private String zzc;
    private String zzd;
    private String zze;
    private boolean zzf;

    private zzxy() {
    }

    public static zzxy zzb(String str, String str2, boolean z) {
        zzxy zzxy = new zzxy();
        zzxy.zzb = Preconditions.checkNotEmpty(str);
        zzxy.zzc = Preconditions.checkNotEmpty(str2);
        zzxy.zzf = z;
        return zzxy;
    }

    public static zzxy zzc(String str, String str2, boolean z) {
        zzxy zzxy = new zzxy();
        zzxy.zza = Preconditions.checkNotEmpty(str);
        zzxy.zzd = Preconditions.checkNotEmpty(str2);
        zzxy.zzf = z;
        return zzxy;
    }

    public final String zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(this.zzd)) {
            jSONObject.put("phoneNumber", this.zza);
            jSONObject.put("temporaryProof", this.zzd);
        } else {
            jSONObject.put("sessionInfo", this.zzb);
            jSONObject.put("code", this.zzc);
        }
        String str = this.zze;
        if (str != null) {
            jSONObject.put("idToken", str);
        }
        if (!this.zzf) {
            jSONObject.put("operation", 2);
        }
        return jSONObject.toString();
    }

    public final void zzd(String str) {
        this.zze = str;
    }
}
