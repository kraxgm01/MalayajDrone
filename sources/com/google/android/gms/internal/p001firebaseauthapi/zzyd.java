package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzyd;
import com.google.android.gms.internal.p001firebaseauthapi.zzye;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzyd  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public abstract class zzyd<MessageType extends zzye<MessageType, BuilderType>, BuilderType extends zzyd<MessageType, BuilderType>> implements zzabb {
    /* renamed from: zzf */
    public abstract zzyd clone();

    /* access modifiers changed from: protected */
    public abstract zzyd zzg(zzye zzye);

    public final /* bridge */ /* synthetic */ zzabb zzh(zzabc zzabc) {
        if (zzH().getClass().isInstance(zzabc)) {
            return zzg((zzye) zzabc);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
