package com.google.android.gms.internal.p001firebaseauthapi;

import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Base64;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.firebase.auth.PhoneAuthCredential;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvn  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
final class zzvn {
    /* access modifiers changed from: private */
    public static final Logger zza = new Logger("FirebaseAuth", "SmsRetrieverHelper");
    private final Context zzb;
    private final ScheduledExecutorService zzc;
    /* access modifiers changed from: private */
    public final HashMap zzd = new HashMap();

    zzvn(Context context) {
        this.zzb = (Context) Preconditions.checkNotNull(context);
        zzf.zza();
        this.zzc = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
    }

    static String zzb(String str) {
        Matcher matcher = Pattern.compile("(?<!\\d)\\d{6}(?!\\d)").matcher(str);
        if (matcher.find()) {
            return matcher.group();
        }
        return null;
    }

    static /* bridge */ /* synthetic */ void zze(zzvn zzvn, String str) {
        zzvm zzvm = (zzvm) zzvn.zzd.get(str);
        if (zzvm != null && !zzag.zzd(zzvm.zzd) && !zzag.zzd(zzvm.zze) && !zzvm.zzb.isEmpty()) {
            for (zzts zzo : zzvm.zzb) {
                zzo.zzo(PhoneAuthCredential.zzc(zzvm.zzd, zzvm.zze));
            }
            zzvm.zzh = true;
        }
    }

    private static String zzm(String str, String str2) {
        String str3 = str + " " + str2;
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(str3.getBytes(zzo.zzc));
            String substring = Base64.encodeToString(Arrays.copyOf(instance.digest(), 9), 3).substring(0, 11);
            zza.d("Package: " + str + " -- Hash: " + substring, new Object[0]);
            return substring;
        } catch (NoSuchAlgorithmException e) {
            zza.e("NoSuchAlgorithm: ".concat(String.valueOf(e.getMessage())), new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public final void zzn(String str) {
        zzvm zzvm = (zzvm) this.zzd.get(str);
        if (zzvm != null && !zzvm.zzh && !zzag.zzd(zzvm.zzd)) {
            zza.w("Timed out waiting for SMS.", new Object[0]);
            for (zzts zza2 : zzvm.zzb) {
                zza2.zza(zzvm.zzd);
            }
            zzvm.zzi = true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: zzo */
    public final void zzh(String str) {
        zzvm zzvm = (zzvm) this.zzd.get(str);
        if (zzvm != null) {
            if (!zzvm.zzi) {
                zzn(str);
            }
            zzj(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final String zzc() {
        Signature[] signatureArr;
        try {
            String packageName = this.zzb.getPackageName();
            if (Build.VERSION.SDK_INT < 28) {
                signatureArr = Wrappers.packageManager(this.zzb).getPackageInfo(packageName, 64).signatures;
            } else {
                signatureArr = Wrappers.packageManager(this.zzb).getPackageInfo(packageName, 134217728).signingInfo.getApkContentsSigners();
            }
            String zzm = zzm(packageName, signatureArr[0].toCharsString());
            if (zzm != null) {
                return zzm;
            }
            zza.e("Hash generation failed.", new Object[0]);
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            zza.e("Unable to find package to obtain hash.", new Object[0]);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzi(zzts zzts, String str) {
        zzvm zzvm = (zzvm) this.zzd.get(str);
        if (zzvm != null) {
            zzvm.zzb.add(zzts);
            if (zzvm.zzg) {
                zzts.zzb(zzvm.zzd);
            }
            if (zzvm.zzh) {
                zzts.zzo(PhoneAuthCredential.zzc(zzvm.zzd, zzvm.zze));
            }
            if (zzvm.zzi) {
                zzts.zza(zzvm.zzd);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzj(String str) {
        zzvm zzvm = (zzvm) this.zzd.get(str);
        if (zzvm != null) {
            ScheduledFuture scheduledFuture = zzvm.zzf;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                zzvm.zzf.cancel(false);
            }
            zzvm.zzb.clear();
            this.zzd.remove(str);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzk(String str, zzts zzts, long j, boolean z) {
        this.zzd.put(str, new zzvm(j, z));
        zzi(zzts, str);
        zzvm zzvm = (zzvm) this.zzd.get(str);
        long j2 = zzvm.zza;
        if (j2 <= 0) {
            zza.w("Timeout of 0 specified; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzvm.zzf = this.zzc.schedule(new zzvi(this, str), j2, TimeUnit.SECONDS);
        if (!zzvm.zzc) {
            zza.w("SMS auto-retrieval unavailable; SmsRetriever will not start.", new Object[0]);
            return;
        }
        zzvl zzvl = new zzvl(this, str);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(SmsRetriever.SMS_RETRIEVED_ACTION);
        zzb.zza(this.zzb.getApplicationContext(), zzvl, intentFilter);
        SmsRetriever.getClient(this.zzb).startSmsRetriever().addOnFailureListener(new zzvj(this));
    }

    /* access modifiers changed from: package-private */
    public final boolean zzl(String str) {
        return this.zzd.get(str) != null;
    }
}
