package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaaf  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public class zzaaf extends IOException {
    private zzabc zza = null;

    public zzaaf(IOException iOException) {
        super(iOException.getMessage(), iOException);
    }

    static zzaae zza() {
        return new zzaae("Protocol message tag had invalid wire type.");
    }

    static zzaaf zzb() {
        return new zzaaf("Protocol message end-group tag did not match expected tag.");
    }

    static zzaaf zzc() {
        return new zzaaf("Protocol message contained an invalid tag (zero).");
    }

    static zzaaf zzd() {
        return new zzaaf("Protocol message had invalid UTF-8.");
    }

    static zzaaf zze() {
        return new zzaaf("CodedInputStream encountered a malformed varint.");
    }

    static zzaaf zzf() {
        return new zzaaf("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzaaf zzg() {
        return new zzaaf("Failed to parse the message.");
    }

    static zzaaf zzi() {
        return new zzaaf("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public final zzaaf zzh(zzabc zzabc) {
        this.zza = zzabc;
        return this;
    }

    public zzaaf(String str) {
        super(str);
    }
}
