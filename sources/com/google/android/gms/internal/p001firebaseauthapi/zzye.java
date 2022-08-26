package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzyd;
import com.google.android.gms.internal.p001firebaseauthapi.zzye;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzye  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public abstract class zzye<MessageType extends zzye<MessageType, BuilderType>, BuilderType extends zzyd<MessageType, BuilderType>> implements zzabc {
    protected int zza = 0;

    /* access modifiers changed from: package-private */
    public int zzn() {
        throw null;
    }

    public final zzyu zzo() {
        try {
            int zzs = zzs();
            zzyu zzyu = zzyu.zzb;
            byte[] bArr = new byte[zzs];
            zzzf zzG = zzzf.zzG(bArr);
            zzF(zzG);
            zzG.zzI();
            return new zzyr(bArr);
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a ByteString threw an IOException (should never happen).", e);
        }
    }

    /* access modifiers changed from: package-private */
    public void zzp(int i) {
        throw null;
    }

    public final void zzq(OutputStream outputStream) throws IOException {
        zzzf zzH = zzzf.zzH(outputStream, zzzf.zzB(zzs()));
        zzF(zzH);
        zzH.zzN();
    }

    public final byte[] zzr() {
        try {
            byte[] bArr = new byte[zzs()];
            zzzf zzG = zzzf.zzG(bArr);
            zzF(zzG);
            zzG.zzI();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            throw new RuntimeException("Serializing " + name + " to a byte array threw an IOException (should never happen).", e);
        }
    }
}
