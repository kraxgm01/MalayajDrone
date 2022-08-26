package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.internal.p001firebaseauthapi.zzzt;
import com.google.android.gms.internal.p001firebaseauthapi.zzzx;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzzx  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public abstract class zzzx<MessageType extends zzzx<MessageType, BuilderType>, BuilderType extends zzzt<MessageType, BuilderType>> extends zzye<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    protected zzacg zzc = zzacg.zzc();
    protected int zzd = -1;

    static Object zzC(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    protected static Object zzD(zzabc zzabc, String str, Object[] objArr) {
        return new zzabm(zzabc, str, objArr);
    }

    protected static void zzE(Class cls, zzzx zzzx) {
        zzb.put(cls, zzzx);
    }

    private static zzzx zza(zzzx zzzx) throws zzaaf {
        if (zzzx == null || zzzx.zzG()) {
            return zzzx;
        }
        zzaaf zza = new zzace(zzzx).zza();
        zza.zzh(zzzx);
        throw zza;
    }

    private static zzzx zzb(zzzx zzzx, byte[] bArr, int i, int i2, zzzk zzzk) throws zzaaf {
        zzzx zzzx2 = (zzzx) zzzx.zzj(4, (Object) null, (Object) null);
        try {
            zzabo zzb2 = zzabk.zza().zzb(zzzx2.getClass());
            zzb2.zzi(zzzx2, bArr, 0, i2, new zzyh(zzzk));
            zzb2.zzf(zzzx2);
            if (zzzx2.zza == 0) {
                return zzzx2;
            }
            throw new RuntimeException();
        } catch (zzaaf e) {
            e.zzh(zzzx2);
            throw e;
        } catch (zzace e2) {
            zzaaf zza = e2.zza();
            zza.zzh(zzzx2);
            throw zza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzaaf) {
                throw ((zzaaf) e3.getCause());
            }
            zzaaf zzaaf = new zzaaf(e3);
            zzaaf.zzh(zzzx2);
            throw zzaaf;
        } catch (IndexOutOfBoundsException e4) {
            zzaaf zzi = zzaaf.zzi();
            zzi.zzh(zzzx2);
            throw zzi;
        }
    }

    static zzzx zzv(Class cls) {
        Map map = zzb;
        zzzx zzzx = (zzzx) map.get(cls);
        if (zzzx == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzzx = (zzzx) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzzx == null) {
            zzzx = (zzzx) ((zzzx) zzacp.zze(cls)).zzj(6, (Object) null, (Object) null);
            if (zzzx != null) {
                map.put(cls, zzzx);
            } else {
                throw new IllegalStateException();
            }
        }
        return zzzx;
    }

    protected static zzzx zzw(zzzx zzzx, zzyu zzyu, zzzk zzzk) throws zzaaf {
        zzyy zzh = zzyu.zzh();
        zzzx zzzx2 = (zzzx) zzzx.zzj(4, (Object) null, (Object) null);
        try {
            zzabo zzb2 = zzabk.zza().zzb(zzzx2.getClass());
            zzb2.zzh(zzzx2, zzyz.zzq(zzh), zzzk);
            zzb2.zzf(zzzx2);
            try {
                zzh.zzm(0);
                zza(zzzx2);
                return zzzx2;
            } catch (zzaaf e) {
                e.zzh(zzzx2);
                throw e;
            }
        } catch (zzaaf e2) {
            e2.zzh(zzzx2);
            throw e2;
        } catch (zzace e3) {
            zzaaf zza = e3.zza();
            zza.zzh(zzzx2);
            throw zza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzaaf) {
                throw ((zzaaf) e4.getCause());
            }
            zzaaf zzaaf = new zzaaf(e4);
            zzaaf.zzh(zzzx2);
            throw zzaaf;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzaaf) {
                throw ((zzaaf) e5.getCause());
            }
            throw e5;
        }
    }

    protected static zzzx zzx(zzzx zzzx, byte[] bArr, zzzk zzzk) throws zzaaf {
        zzzx zzb2 = zzb(zzzx, bArr, 0, bArr.length, zzzk);
        zza(zzb2);
        return zzb2;
    }

    protected static zzaac zzy() {
        return zzabl.zze();
    }

    protected static zzaac zzz(zzaac zzaac) {
        int i;
        int size = zzaac.size();
        if (size == 0) {
            i = 10;
        } else {
            i = size + size;
        }
        return zzaac.zzd(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzabk.zza().zzb(getClass()).zzj(this, (zzzx) obj);
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int zzb2 = zzabk.zza().zzb(getClass()).zzb(this);
        this.zza = zzb2;
        return zzb2;
    }

    public final String toString() {
        return zzabe.zza(this, super.toString());
    }

    public final /* synthetic */ zzabb zzA() {
        return (zzzt) zzj(5, (Object) null, (Object) null);
    }

    public final /* synthetic */ zzabb zzB() {
        zzzt zzzt = (zzzt) zzj(5, (Object) null, (Object) null);
        zzzt.zzj(this);
        return zzzt;
    }

    public final void zzF(zzzf zzzf) throws IOException {
        zzabk.zza().zzb(getClass()).zzn(this, zzzg.zza(zzzf));
    }

    public final boolean zzG() {
        zzzx zzzx;
        boolean booleanValue = Boolean.TRUE.booleanValue();
        byte byteValue = ((Byte) zzj(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzk = zzabk.zza().zzb(getClass()).zzk(this);
        if (!booleanValue) {
            return zzk;
        }
        if (true != zzk) {
            zzzx = null;
        } else {
            zzzx = this;
        }
        zzj(2, zzzx, (Object) null);
        return zzk;
    }

    public final /* synthetic */ zzabc zzH() {
        return (zzzx) zzj(6, (Object) null, (Object) null);
    }

    /* access modifiers changed from: protected */
    public abstract Object zzj(int i, Object obj, Object obj2);

    /* access modifiers changed from: package-private */
    public final int zzn() {
        return this.zzd;
    }

    /* access modifiers changed from: package-private */
    public final void zzp(int i) {
        this.zzd = i;
    }

    public final int zzs() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int zza = zzabk.zza().zzb(getClass()).zza(this);
        this.zzd = zza;
        return zza;
    }

    /* access modifiers changed from: protected */
    public final zzzt zzt() {
        return (zzzt) zzj(5, (Object) null, (Object) null);
    }

    public final zzzt zzu() {
        zzzt zzzt = (zzzt) zzj(5, (Object) null, (Object) null);
        zzzt.zzj(this);
        return zzzt;
    }
}
