package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzacv  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public enum zzacv {
    DOUBLE(zzacw.DOUBLE, 1),
    FLOAT(zzacw.FLOAT, 5),
    INT64(zzacw.LONG, 0),
    UINT64(zzacw.LONG, 0),
    INT32(zzacw.INT, 0),
    FIXED64(zzacw.LONG, 1),
    FIXED32(zzacw.INT, 5),
    BOOL(zzacw.BOOLEAN, 0),
    STRING(zzacw.STRING, 2),
    GROUP(zzacw.MESSAGE, 3),
    MESSAGE(zzacw.MESSAGE, 2),
    BYTES(zzacw.BYTE_STRING, 2),
    UINT32(zzacw.INT, 0),
    ENUM(zzacw.ENUM, 0),
    SFIXED32(zzacw.INT, 5),
    SFIXED64(zzacw.LONG, 1),
    SINT32(zzacw.INT, 0),
    SINT64(zzacw.LONG, 0);
    
    private final zzacw zzt;

    private zzacv(zzacw zzacw, int i) {
        this.zzt = zzacw;
    }

    public final zzacw zza() {
        return this.zzt;
    }
}
