package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzzt;
import com.google.android.gms.internal.p001firebaseauthapi.zzzx;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzt  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public class zzzt<MessageType extends zzzx<MessageType, BuilderType>, BuilderType extends zzzt<MessageType, BuilderType>> extends zzyd<MessageType, BuilderType> {
    protected zzzx zza;
    protected boolean zzb = false;
    private final zzzx zzc;

    protected zzzt(MessageType messagetype) {
        this.zzc = messagetype;
        this.zza = (zzzx) messagetype.zzj(4, (Object) null, (Object) null);
    }

    private static final void zza(zzzx zzzx, zzzx zzzx2) {
        zzabk.zza().zzb(zzzx.getClass()).zzg(zzzx, zzzx2);
    }

    public final /* synthetic */ zzabc zzH() {
        return this.zzc;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ zzyd zzg(zzye zzye) {
        zzj((zzzx) zzye);
        return this;
    }

    /* renamed from: zzi */
    public final zzzt zzf() {
        zzzt zzzt = (zzzt) this.zzc.zzj(5, (Object) null, (Object) null);
        zzzt.zzj(zzm());
        return zzzt;
    }

    public final zzzt zzj(zzzx zzzx) {
        if (this.zzb) {
            zzo();
            this.zzb = false;
        }
        zza(this.zza, zzzx);
        return this;
    }

    public final MessageType zzk() {
        MessageType zzl = zzm();
        if (zzl.zzG()) {
            return zzl;
        }
        throw new zzace(zzl);
    }

    /* renamed from: zzl */
    public MessageType zzm() {
        if (this.zzb) {
            return this.zza;
        }
        zzzx zzzx = this.zza;
        zzabk.zza().zzb(zzzx.getClass()).zzf(zzzx);
        this.zzb = true;
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public void zzo() {
        zzzx zzzx = (zzzx) this.zza.zzj(4, (Object) null, (Object) null);
        zza(zzzx, this.zza);
        this.zza = zzzx;
    }
}
