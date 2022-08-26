package com.google.android.gms.internal.p001firebaseauthapi;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaau  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzaau implements zzabp {
    private static final zzaba zza = new zzaas();
    private final zzaba zzb;

    public zzaau() {
        zzaba zzaba;
        zzaba[] zzabaArr = new zzaba[2];
        zzabaArr[0] = zzzs.zza();
        try {
            zzaba = (zzaba) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke((Object) null, new Object[0]);
        } catch (Exception e) {
            zzaba = zza;
        }
        zzabaArr[1] = zzaba;
        zzaat zzaat = new zzaat(zzabaArr);
        zzaad.zzf(zzaat, "messageInfoFactory");
        this.zzb = zzaat;
    }

    private static boolean zzb(zzaaz zzaaz) {
        return zzaaz.zzc() == 1;
    }

    public final zzabo zza(Class cls) {
        zzabq.zzG(cls);
        zzaaz zzb2 = this.zzb.zzb(cls);
        if (zzb2.zzb()) {
            if (zzzx.class.isAssignableFrom(cls)) {
                return zzabg.zzc(zzabq.zzB(), zzzn.zzb(), zzb2.zza());
            }
            return zzabg.zzc(zzabq.zzz(), zzzn.zza(), zzb2.zza());
        } else if (zzzx.class.isAssignableFrom(cls)) {
            if (zzb(zzb2)) {
                return zzabf.zzl(cls, zzb2, zzabi.zzb(), zzaaq.zze(), zzabq.zzB(), zzzn.zzb(), zzaay.zzb());
            }
            return zzabf.zzl(cls, zzb2, zzabi.zzb(), zzaaq.zze(), zzabq.zzB(), (zzzl) null, zzaay.zzb());
        } else if (zzb(zzb2)) {
            return zzabf.zzl(cls, zzb2, zzabi.zza(), zzaaq.zzd(), zzabq.zzz(), zzzn.zza(), zzaay.zza());
        } else {
            return zzabf.zzl(cls, zzb2, zzabi.zza(), zzaaq.zzd(), zzabq.zzA(), (zzzl) null, zzaay.zza());
        }
    }
}
