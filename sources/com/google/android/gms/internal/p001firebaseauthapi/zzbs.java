package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbs  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzbs extends zzaw {
    private final String zza;
    private final int zzb;

    /* synthetic */ zzbs(String str, int i, zzbr zzbr) {
        this.zza = str;
        this.zzb = i;
    }

    public final String toString() {
        String str;
        Object[] objArr = new Object[2];
        objArr[0] = this.zza;
        switch (this.zzb - 2) {
            case 1:
                str = "TINK";
                break;
            case 2:
                str = "LEGACY";
                break;
            case 3:
                str = "RAW";
                break;
            case 4:
                str = "CRUNCHY";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        objArr[1] = str;
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }
}
