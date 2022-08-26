package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzq  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public enum zzzq {
    DOUBLE(0, 1, zzaag.DOUBLE),
    FLOAT(1, 1, zzaag.FLOAT),
    INT64(2, 1, zzaag.LONG),
    UINT64(3, 1, zzaag.LONG),
    INT32(4, 1, zzaag.INT),
    FIXED64(5, 1, zzaag.LONG),
    FIXED32(6, 1, zzaag.INT),
    BOOL(7, 1, zzaag.BOOLEAN),
    STRING(8, 1, zzaag.STRING),
    MESSAGE(9, 1, zzaag.MESSAGE),
    BYTES(10, 1, zzaag.BYTE_STRING),
    UINT32(11, 1, zzaag.INT),
    ENUM(12, 1, zzaag.ENUM),
    SFIXED32(13, 1, zzaag.INT),
    SFIXED64(14, 1, zzaag.LONG),
    SINT32(15, 1, zzaag.INT),
    SINT64(16, 1, zzaag.LONG),
    GROUP(17, 1, zzaag.MESSAGE),
    DOUBLE_LIST(18, 2, zzaag.DOUBLE),
    FLOAT_LIST(19, 2, zzaag.FLOAT),
    INT64_LIST(20, 2, zzaag.LONG),
    UINT64_LIST(21, 2, zzaag.LONG),
    INT32_LIST(22, 2, zzaag.INT),
    FIXED64_LIST(23, 2, zzaag.LONG),
    FIXED32_LIST(24, 2, zzaag.INT),
    BOOL_LIST(25, 2, zzaag.BOOLEAN),
    STRING_LIST(26, 2, zzaag.STRING),
    MESSAGE_LIST(27, 2, zzaag.MESSAGE),
    BYTES_LIST(28, 2, zzaag.BYTE_STRING),
    UINT32_LIST(29, 2, zzaag.INT),
    ENUM_LIST(30, 2, zzaag.ENUM),
    SFIXED32_LIST(31, 2, zzaag.INT),
    SFIXED64_LIST(32, 2, zzaag.LONG),
    SINT32_LIST(33, 2, zzaag.INT),
    SINT64_LIST(34, 2, zzaag.LONG),
    DOUBLE_LIST_PACKED(35, 3, zzaag.DOUBLE),
    FLOAT_LIST_PACKED(36, 3, zzaag.FLOAT),
    INT64_LIST_PACKED(37, 3, zzaag.LONG),
    UINT64_LIST_PACKED(38, 3, zzaag.LONG),
    INT32_LIST_PACKED(39, 3, zzaag.INT),
    FIXED64_LIST_PACKED(40, 3, zzaag.LONG),
    FIXED32_LIST_PACKED(41, 3, zzaag.INT),
    BOOL_LIST_PACKED(42, 3, zzaag.BOOLEAN),
    UINT32_LIST_PACKED(43, 3, zzaag.INT),
    ENUM_LIST_PACKED(44, 3, zzaag.ENUM),
    SFIXED32_LIST_PACKED(45, 3, zzaag.INT),
    SFIXED64_LIST_PACKED(46, 3, zzaag.LONG),
    SINT32_LIST_PACKED(47, 3, zzaag.INT),
    SINT64_LIST_PACKED(48, 3, zzaag.LONG),
    GROUP_LIST(49, 2, zzaag.MESSAGE),
    MAP(50, 4, zzaag.VOID);
    
    private static final zzzq[] zzZ = null;
    private final zzaag zzab;
    private final int zzac;
    private final Class zzad;

    static {
        zzZ = new zzzq[r1];
        for (zzzq zzzq : values()) {
            zzZ[zzzq.zzac] = zzzq;
        }
    }

    private zzzq(int i, int i2, zzaag zzaag) {
        this.zzac = i;
        this.zzab = zzaag;
        zzaag zzaag2 = zzaag.VOID;
        switch (i2 - 1) {
            case 1:
                this.zzad = zzaag.zza();
                break;
            case 3:
                this.zzad = zzaag.zza();
                break;
            default:
                this.zzad = null;
                break;
        }
        if (i2 == 1) {
            zzaag.ordinal();
        }
    }

    public final int zza() {
        return this.zzac;
    }
}
