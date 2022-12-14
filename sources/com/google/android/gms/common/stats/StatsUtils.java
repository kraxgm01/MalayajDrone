package com.google.android.gms.common.stats;

import android.os.PowerManager;
import android.os.Process;
import android.text.TextUtils;

@Deprecated
/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
public class StatsUtils {
    public static String getEventKey(PowerManager.WakeLock wakeLock, String secondaryName) {
        String valueOf = String.valueOf(String.valueOf((((long) Process.myPid()) << 32) | ((long) System.identityHashCode(wakeLock))));
        if (true == TextUtils.isEmpty(secondaryName)) {
            secondaryName = "";
        }
        String valueOf2 = String.valueOf(secondaryName);
        return valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
    }
}
