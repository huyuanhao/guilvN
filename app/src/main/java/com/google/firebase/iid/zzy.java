package com.google.firebase.iid;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.internal.firebase_messaging.zzc;
import com.p118pd.sdk.C7009o000OoOo;
import com.p118pd.sdk.C7491o0OoOOO;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Properties;

public final class zzy {
    public static void zza(Context context) {
        File[] listFiles = zzb(context).listFiles();
        for (File file : listFiles) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
    }

    @Nullable
    private final zzz zzd(Context context, String str) throws zzaa {
        zzaa e;
        try {
            zzz zze = zze(context, str);
            if (zze != null) {
                zza(context, str, zze);
                return zze;
            }
            e = null;
            try {
                zzz zza = zza(context.getSharedPreferences("com.google.android.gms.appid", 0), str);
                if (zza != null) {
                    zza(context, str, zza, false);
                    return zza;
                }
            } catch (zzaa e2) {
                e = e2;
            }
            if (e == null) {
                return null;
            }
            throw e;
        } catch (zzaa e3) {
            e = e3;
        }
    }

    @Nullable
    private final zzz zze(Context context, String str) throws zzaa {
        File zzf = zzf(context, str);
        if (!zzf.exists()) {
            return null;
        }
        try {
            return zza(zzf);
        } catch (zzaa | IOException e) {
            if (Log.isLoggable("FirebaseInstanceId", 3)) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
                sb.append("Failed to read key from file, retrying: ");
                sb.append(valueOf);
                sb.toString();
            }
            try {
                return zza(zzf);
            } catch (IOException e2) {
                String valueOf2 = String.valueOf(e2);
                StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 45);
                sb2.append("IID file exists, but failed to read from it: ");
                sb2.append(valueOf2);
                sb2.toString();
                throw new zzaa(e2);
            }
        }
    }

    public static File zzf(Context context, String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "com.google.InstanceId.properties";
        } else {
            try {
                String encodeToString = Base64.encodeToString(str.getBytes("UTF-8"), 11);
                StringBuilder sb = new StringBuilder(String.valueOf(encodeToString).length() + 33);
                sb.append("com.google.InstanceId_");
                sb.append(encodeToString);
                sb.append(".properties");
                str2 = sb.toString();
            } catch (UnsupportedEncodingException e) {
                throw new AssertionError(e);
            }
        }
        return new File(zzb(context), str2);
    }

    @WorkerThread
    public final zzz zzb(Context context, String str) throws zzaa {
        zzz zzd = zzd(context, str);
        if (zzd != null) {
            return zzd;
        }
        return zzc(context, str);
    }

    @WorkerThread
    public final zzz zzc(Context context, String str) {
        zzz zzz = new zzz(zza.zzb(), System.currentTimeMillis());
        zzz zza = zza(context, str, zzz, true);
        if (zza == null || zza.equals(zzz)) {
            Log.isLoggable("FirebaseInstanceId", 3);
            zza(context, str, zzz);
            return zzz;
        }
        Log.isLoggable("FirebaseInstanceId", 3);
        return zza;
    }

    public static File zzb(Context context) {
        File OooO0OO = C7009o000OoOo.OooO0OO(context);
        if (OooO0OO == null || !OooO0OO.isDirectory()) {
            return context.getFilesDir();
        }
        return OooO0OO;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0099, code lost:
        r12 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009a, code lost:
        if (r9 != null) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009c, code lost:
        zza(r11, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009f, code lost:
        throw r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a2, code lost:
        r11 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a3, code lost:
        zza(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a6, code lost:
        throw r11;
     */
    @androidx.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.firebase.iid.zzz zza(android.content.Context r9, java.lang.String r10, com.google.firebase.iid.zzz r11, boolean r12) {
        /*
        // Method dump skipped, instructions count: 199
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.zzy.zza(android.content.Context, java.lang.String, com.google.firebase.iid.zzz, boolean):com.google.firebase.iid.zzz");
    }

    public static long zzb(SharedPreferences sharedPreferences, String str) {
        String string = sharedPreferences.getString(zzaw.zzd(str, "cre"), null);
        if (string == null) {
            return 0;
        }
        try {
            return Long.parseLong(string);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static KeyPair zzc(String str, String str2) throws zzaa {
        try {
            byte[] decode = Base64.decode(str, 8);
            byte[] decode2 = Base64.decode(str2, 8);
            try {
                KeyFactory instance = KeyFactory.getInstance(C7491o0OoOOO.OooO00o);
                return new KeyPair(instance.generatePublic(new X509EncodedKeySpec(decode)), instance.generatePrivate(new PKCS8EncodedKeySpec(decode2)));
            } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 19);
                sb.append("Invalid key stored ");
                sb.append(valueOf);
                sb.toString();
                throw new zzaa(e);
            }
        } catch (IllegalArgumentException e2) {
            throw new zzaa(e2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0025, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        if (r8 != null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        zza(r1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002e, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x002f, code lost:
        zza(r8, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0032, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.firebase.iid.zzz zza(java.io.File r8) throws com.google.firebase.iid.zzaa, java.io.IOException {
        /*
            r7 = this;
            java.io.FileInputStream r0 = new java.io.FileInputStream
            r0.<init>(r8)
            java.nio.channels.FileChannel r8 = r0.getChannel()     // Catch:{ all -> 0x002c }
            r2 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 1
            r1 = r8
            r1.lock(r2, r4, r6)     // Catch:{ all -> 0x0023 }
            com.google.firebase.iid.zzz r1 = zza(r8)     // Catch:{ all -> 0x0023 }
            r2 = 0
            if (r8 == 0) goto L_0x001f
            zza(r2, r8)
        L_0x001f:
            zza(r2, r0)
            return r1
        L_0x0023:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0025 }
        L_0x0025:
            r2 = move-exception
            if (r8 == 0) goto L_0x002b
            zza(r1, r8)
        L_0x002b:
            throw r2
        L_0x002c:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x002e }
        L_0x002e:
            r1 = move-exception
            zza(r8, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.zzy.zza(java.io.File):com.google.firebase.iid.zzz");
    }

    public static zzz zza(FileChannel fileChannel) throws zzaa, IOException {
        Properties properties = new Properties();
        properties.load(Channels.newInputStream(fileChannel));
        String property = properties.getProperty("pub");
        String property2 = properties.getProperty("pri");
        if (property == null || property2 == null) {
            throw new zzaa("Invalid properties file");
        }
        try {
            return new zzz(zzc(property, property2), Long.parseLong(properties.getProperty("cre")));
        } catch (NumberFormatException e) {
            throw new zzaa(e);
        }
    }

    @Nullable
    public static zzz zza(SharedPreferences sharedPreferences, String str) throws zzaa {
        String string = sharedPreferences.getString(zzaw.zzd(str, "|P|"), null);
        String string2 = sharedPreferences.getString(zzaw.zzd(str, "|K|"), null);
        if (string == null || string2 == null) {
            return null;
        }
        return new zzz(zzc(string, string2), zzb(sharedPreferences, str));
    }

    private final void zza(Context context, String str, zzz zzz) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
        try {
            if (zzz.equals(zza(sharedPreferences, str))) {
                return;
            }
        } catch (zzaa unused) {
        }
        Log.isLoggable("FirebaseInstanceId", 3);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.putString(zzaw.zzd(str, "|P|"), zzz.zzv());
        edit.putString(zzaw.zzd(str, "|K|"), zzz.zzw());
        edit.putString(zzaw.zzd(str, "cre"), String.valueOf(zzz.zzbs));
        edit.commit();
    }

    public static /* synthetic */ void zza(Throwable th, FileChannel fileChannel) {
        if (th != null) {
            try {
                fileChannel.close();
            } catch (Throwable th2) {
                zzc.zza(th, th2);
            }
        } else {
            fileChannel.close();
        }
    }

    public static /* synthetic */ void zza(Throwable th, RandomAccessFile randomAccessFile) {
        if (th != null) {
            try {
                randomAccessFile.close();
            } catch (Throwable th2) {
                zzc.zza(th, th2);
            }
        } else {
            randomAccessFile.close();
        }
    }

    public static /* synthetic */ void zza(Throwable th, FileInputStream fileInputStream) {
        if (th != null) {
            try {
                fileInputStream.close();
            } catch (Throwable th2) {
                zzc.zza(th, th2);
            }
        } else {
            fileInputStream.close();
        }
    }
}
