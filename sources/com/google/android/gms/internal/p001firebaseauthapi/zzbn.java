package com.google.android.gms.internal.p001firebaseauthapi;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzbn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzbn {
    private final Class zza;
    private ConcurrentMap zzb = new ConcurrentHashMap();
    private zzbo zzc;
    private final zzge zzd;

    /* synthetic */ zzbn(Class cls, zzbm zzbm) {
        this.zza = cls;
        this.zzd = zzge.zza;
    }

    private final zzbn zzd(Object obj, zzkx zzkx, boolean z) throws GeneralSecurityException {
        byte[] bArr;
        if (this.zzb == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        } else if (zzkx.zzh() == 3) {
            zzbs zzbs = new zzbs(zzkx.zzb().zze(), zzkx.zzi(), (zzbr) null);
            switch (zzkx.zzi() - 2) {
                case 1:
                    bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(zzkx.zza()).array();
                    break;
                case 2:
                case 4:
                    bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(zzkx.zza()).array();
                    break;
                case 3:
                    bArr = zzas.zza;
                    break;
                default:
                    throw new GeneralSecurityException("unknown output prefix type");
            }
            zzbo zzbo = new zzbo(obj, bArr, zzkx.zzh(), zzkx.zzi(), zzkx.zza(), zzbs);
            ArrayList arrayList = new ArrayList();
            arrayList.add(zzbo);
            zzbq zzbq = new zzbq(zzbo.zzb(), (zzbp) null);
            List list = (List) this.zzb.put(zzbq, Collections.unmodifiableList(arrayList));
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                arrayList2.add(zzbo);
                this.zzb.put(zzbq, Collections.unmodifiableList(arrayList2));
            }
            if (z) {
                if (this.zzc == null) {
                    this.zzc = zzbo;
                } else {
                    throw new IllegalStateException("you cannot set two primary primitives");
                }
            }
            return this;
        } else {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
    }

    public final zzbn zza(Object obj, zzkx zzkx) throws GeneralSecurityException {
        zzd(obj, zzkx, true);
        return this;
    }

    public final zzbn zzb(Object obj, zzkx zzkx) throws GeneralSecurityException {
        zzd(obj, zzkx, false);
        return this;
    }

    public final zzbu zzc() throws GeneralSecurityException {
        ConcurrentMap concurrentMap = this.zzb;
        if (concurrentMap != null) {
            zzbu zzbu = new zzbu(concurrentMap, this.zzc, this.zzd, this.zza, (zzbt) null);
            this.zzb = null;
            return zzbu;
        }
        throw new IllegalStateException("build cannot be called twice");
    }
}
