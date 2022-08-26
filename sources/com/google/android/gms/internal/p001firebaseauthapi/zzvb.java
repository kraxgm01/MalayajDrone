package com.google.android.gms.internal.p001firebaseauthapi;

import com.google.android.gms.common.internal.Preconditions;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzvb  reason: invalid package */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
public final class zzvb {
    public static void zza(String str, zzue zzue, zzuy zzuy, Type type, zzui zzui) {
        BufferedOutputStream bufferedOutputStream;
        try {
            Preconditions.checkNotNull(zzue);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setDoOutput(true);
            byte[] bytes = zzue.zza().getBytes(Charset.defaultCharset());
            int length = bytes.length;
            httpURLConnection.setFixedLengthStreamingMode(length);
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            httpURLConnection.setConnectTimeout(60000);
            zzui.zza(httpURLConnection);
            bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream(), length);
            bufferedOutputStream.write(bytes, 0, length);
            bufferedOutputStream.close();
            zzb(httpURLConnection, zzuy, type);
            return;
        } catch (SocketTimeoutException e) {
            zzuy.zza("TIMEOUT");
            return;
        } catch (UnknownHostException e2) {
            zzuy.zza("<<Network Error>>");
            return;
        } catch (IOException | NullPointerException | JSONException e3) {
            zzuy.zza(e3.getMessage());
            return;
        } catch (Throwable th) {
            zzva.zza(th, th);
        }
        throw th;
    }

    private static void zzb(HttpURLConnection httpURLConnection, zzuy zzuy, Type type) {
        InputStream inputStream;
        BufferedReader bufferedReader;
        try {
            int responseCode = httpURLConnection.getResponseCode();
            if (zzc(responseCode)) {
                inputStream = httpURLConnection.getInputStream();
            } else {
                inputStream = httpURLConnection.getErrorStream();
            }
            StringBuilder sb = new StringBuilder();
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                sb.append(readLine);
            }
            bufferedReader.close();
            String sb2 = sb.toString();
            if (!zzc(responseCode)) {
                zzuy.zza((String) zzud.zza(sb2, String.class));
            } else {
                zzuy.zzb((zzuf) zzud.zza(sb2, type));
            }
        } catch (SocketTimeoutException e) {
            zzuy.zza("TIMEOUT");
        } catch (zzry | IOException e2) {
            try {
                zzuy.zza(e2.getMessage());
            } catch (Throwable th) {
                httpURLConnection.disconnect();
                throw th;
            }
        } catch (Throwable th2) {
            zzva.zza(th, th2);
        }
        httpURLConnection.disconnect();
        return;
        throw th;
    }

    private static final boolean zzc(int i) {
        return i >= 200 && i < 300;
    }
}
