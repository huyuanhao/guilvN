package com.p118pd.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
import android.text.TextUtils;
import androidx.multidex.MultiDexExtractor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* renamed from: com.pd.sdk.oo00o00O  reason: case insensitive filesystem */
public class C8560oo00o00O {
    public static int OooO00o(File[] fileArr) {
        String str;
        int length = fileArr.length;
        int i = 0;
        for (File file : fileArr) {
            String path = file.getPath();
            if (!path.endsWith(".log") && !path.endsWith(MultiDexExtractor.o0OO00O)) {
                if (file.delete()) {
                    i++;
                    str = "del filter file :";
                } else {
                    str = "del file failed.";
                }
                AbstractC8536oo00OO0O.OooO0O0("HiAnalytics/logServer", str);
            }
        }
        return length - i;
    }

    public static String OooO00o() {
        String OooO0OO = OooO0OO();
        int myPid = Process.myPid();
        return myPid + "_" + OooO0OO + ".log";
    }

    public static void OooO00o(Context context, String str) {
        float f;
        try {
            f = Float.parseFloat(str.split(C8932ooOOO0o.OooO0Oo)[1].trim());
            if (f > 3.0f) {
                f = 3.0f;
            } else if (f < 0.0f) {
                f = 0.0f;
            }
        } catch (NumberFormatException unused) {
            AbstractC8536oo00OO0O.OooO0Oo("AppLogApi/LogUtil", "The cycle of the server returns : " + str);
            f = 1.0f;
        }
        AbstractC8536oo00OO0O.OooO0O0("AppLogApi/LogUtil", "setpolicy cycle : " + f);
        C8559oo00o000.m20213OooO00o(C8559oo00o000.OooO00o(context), "autocheck_policy", (Object) Float.valueOf(1.0f));
    }

    public static void OooO00o(String str) {
        if (!TextUtils.isEmpty(str) && !new File(str).delete()) {
            AbstractC8536oo00OO0O.OooO0Oo("AppLogApi/LogUtil", "delete file fail");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0082, code lost:
        if ((r2 - r6) > r10) goto L_0x0043;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean OooO00o(android.content.Context r14) {
        /*
        // Method dump skipped, instructions count: 154
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C8560oo00o00O.OooO00o(android.content.Context):boolean");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20214OooO00o(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return file.mkdirs();
        }
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m20215OooO00o(File[] fileArr) {
        for (File file : fileArr) {
            if (!file.getName().contains("Crash")) {
                if (!file.delete()) {
                    return true;
                } else {
                    AbstractC8536oo00OO0O.OooO0OO("AppLogApi/LogUtil", "Logzips folder is larger than 1.8M, and the first file is deleted. ");
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean OooO00o(File[] fileArr, File file) {
        return OooO0O0(fileArr, file);
    }

    public static String OooO0O0() {
        return new SimpleDateFormat("yy-MM-dd HH:mm:ss.SSS", Locale.getDefault()).format(Calendar.getInstance().getTime());
    }

    public static boolean OooO0O0(Context context) {
        boolean z = false;
        if (context == null) {
            AbstractC8536oo00OO0O.OooO0Oo("AppLogApi/LogUtil", "No init of logServer!");
            return false;
        }
        SharedPreferences OooO00o = C8559oo00o000.OooO00o(context);
        long currentTimeMillis = System.currentTimeMillis();
        long longValue = ((Long) C8559oo00o000.OooO00o(OooO00o, "autocheck_tenminstarttime", (Object) -1L)).longValue();
        AbstractC8536oo00OO0O.OooO0O0("AppLogApi/LogUtil", "checkTimeOver beforeTimeMillis : " + longValue);
        if (-1 == longValue || (currentTimeMillis - longValue > 600000 && OooO0OO(context))) {
            C8559oo00o000.m20213OooO00o(OooO00o, "autocheck_tenminstarttime", (Object) Long.valueOf(currentTimeMillis));
            AbstractC8536oo00OO0O.OooO0O0("AppLogApi/LogUtil", "setTenMinAutoCheckTime!");
            z = true;
        }
        AbstractC8536oo00OO0O.OooO0OO("AppLogApi/LogUtil", "checkTimeOver " + z);
        return z;
    }

    public static synchronized boolean OooO0O0(File[] fileArr, File file) {
        FileOutputStream fileOutputStream;
        Throwable th;
        int i;
        synchronized (C8560oo00o00O.class) {
            byte[] bArr = new byte[1024];
            ZipOutputStream zipOutputStream = null;
            try {
                fileOutputStream = new FileOutputStream(file);
                try {
                    ZipOutputStream zipOutputStream2 = new ZipOutputStream(fileOutputStream);
                    if (fileArr != null) {
                        try {
                            if (fileArr.length > 0) {
                                int i2 = 0;
                                for (File file2 : fileArr) {
                                    if (((double) file2.length()) <= 1887436.8d) {
                                        FileInputStream fileInputStream = new FileInputStream(file2);
                                        try {
                                            zipOutputStream2.putNextEntry(new ZipEntry(file2.getName()));
                                            if (((double) (((long) i2) + file2.length())) <= 1887436.8d) {
                                                while (true) {
                                                    int read = fileInputStream.read(bArr);
                                                    if (read <= 0) {
                                                        break;
                                                    }
                                                    i2 += read;
                                                    zipOutputStream2.write(bArr, 0, read);
                                                }
                                            }
                                            zipOutputStream2.flush();
                                            i = 1;
                                        } catch (IOException unused) {
                                            AbstractC8536oo00OO0O.OooO0Oo("AppLogApi/LogUtil", "createLogZipWithLock() Stream Exception!");
                                            i = 1;
                                        } catch (Throwable th2) {
                                            C8558oo00o00.OooO00o(1, fileInputStream);
                                            throw th2;
                                        }
                                        C8558oo00o00.OooO00o(i, fileInputStream);
                                    } else if (file2.delete()) {
                                        AbstractC8536oo00OO0O.OooO0O0("AppLogApi/LogUtil", "Delete a file larger than 1.8M");
                                    }
                                }
                            }
                        } catch (FileNotFoundException unused2) {
                            zipOutputStream = zipOutputStream2;
                            try {
                                AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/logServer", "checkUploadLog,file not found !");
                                C8558oo00o00.OooO00o(5, zipOutputStream);
                                C8558oo00o00.OooO00o(6, fileOutputStream);
                                return false;
                            } catch (Throwable th3) {
                                th = th3;
                                C8558oo00o00.OooO00o(5, zipOutputStream);
                                C8558oo00o00.OooO00o(6, fileOutputStream);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            zipOutputStream = zipOutputStream2;
                            C8558oo00o00.OooO00o(5, zipOutputStream);
                            C8558oo00o00.OooO00o(6, fileOutputStream);
                            throw th;
                        }
                    }
                    C8558oo00o00.OooO00o(5, zipOutputStream2);
                    C8558oo00o00.OooO00o(6, fileOutputStream);
                    return true;
                } catch (FileNotFoundException unused3) {
                    AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/logServer", "checkUploadLog,file not found !");
                    C8558oo00o00.OooO00o(5, zipOutputStream);
                    C8558oo00o00.OooO00o(6, fileOutputStream);
                    return false;
                }
            } catch (FileNotFoundException unused4) {
                fileOutputStream = null;
                AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/logServer", "checkUploadLog,file not found !");
                C8558oo00o00.OooO00o(5, zipOutputStream);
                C8558oo00o00.OooO00o(6, fileOutputStream);
                return false;
            } catch (Throwable th5) {
                th = th5;
                fileOutputStream = null;
                C8558oo00o00.OooO00o(5, zipOutputStream);
                C8558oo00o00.OooO00o(6, fileOutputStream);
                throw th;
            }
        }
    }

    public static String OooO0OO() {
        return new SimpleDateFormat("yyyyMMddHHmmssSSS", Locale.getDefault()).format(Calendar.getInstance().getTime());
    }

    public static boolean OooO0OO(Context context) {
        NetworkInfo activeNetworkInfo;
        if (context == null || context.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) != 0) {
            AbstractC8536oo00OO0O.OooO0OO("HiAnalytics/logServer", "not have network state phone permission!");
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        return connectivityManager != null && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null && activeNetworkInfo.isConnected() && activeNetworkInfo.isAvailable();
    }
}
