package com.umeng.commonsdk.framework;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Process;
import android.text.TextUtils;
import com.p118pd.sdk.C5982OoooOoO;
import com.p118pd.sdk.C8932ooOOO0o;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.proguard.C3617o;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class UMFrUtils {
    public static final String KEY_LAST_INSTANT_SUCC_BUILD_TIME = "last_instant_build_time";
    public static final String KEY_LAST_SUCC_BUILD_TIME = "last_successful_build_time";
    public static String mDefaultEnvelopeDir = "envelope";
    public static String mDefaultEnvelopeDirPath;
    public static Object mEnvelopeBuildTimeLock = new Object();
    public static Object mEnvelopeFileLock = new Object();

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0030 A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean checkPermission(android.content.Context r7, java.lang.String r8) {
        /*
            r0 = 0
            if (r7 == 0) goto L_0x004a
            android.content.Context r1 = r7.getApplicationContext()
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 23
            r4 = 1
            if (r2 < r3) goto L_0x0037
            java.lang.String r2 = "android.content.Context"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = "checkSelfPermission"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ all -> 0x0032 }
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r0] = r6     // Catch:{ all -> 0x0032 }
            java.lang.reflect.Method r2 = r2.getMethod(r3, r5)     // Catch:{ all -> 0x0032 }
            java.lang.Object[] r3 = new java.lang.Object[r4]     // Catch:{ all -> 0x0032 }
            r3[r0] = r8     // Catch:{ all -> 0x0032 }
            java.lang.Object r7 = r2.invoke(r7, r3)     // Catch:{ all -> 0x0032 }
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ all -> 0x0032 }
            int r7 = r7.intValue()     // Catch:{ all -> 0x0032 }
            if (r7 != 0) goto L_0x004a
        L_0x0030:
            r0 = 1
            goto L_0x004a
        L_0x0032:
            r7 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r7)
            goto L_0x004a
        L_0x0037:
            android.content.pm.PackageManager r7 = r1.getPackageManager()     // Catch:{ all -> 0x0046 }
            java.lang.String r2 = r1.getPackageName()     // Catch:{ all -> 0x0046 }
            int r7 = r7.checkPermission(r8, r2)     // Catch:{ all -> 0x0046 }
            if (r7 != 0) goto L_0x004a
            goto L_0x0030
        L_0x0046:
            r7 = move-exception
            com.umeng.commonsdk.internal.crash.UMCrashManager.reportCrash(r1, r7)
        L_0x004a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.framework.UMFrUtils.checkPermission(android.content.Context, java.lang.String):boolean");
    }

    public static int envelopeFileNumber(Context context) {
        String[] list;
        if (context != null) {
            try {
                File file = new File(getEnvelopeDirPath(context));
                synchronized (mEnvelopeFileLock) {
                    if (file.isDirectory() && (list = file.list()) != null) {
                        return list.length;
                    }
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(context, th);
            }
        }
        return 0;
    }

    public static String getCreateTimeFromFileName(String str) {
        Context appContext = UMModuleRegister.getAppContext();
        if (!TextUtils.isEmpty(str)) {
            int indexOf = str.indexOf(95) + 1;
            try {
                return str.substring(indexOf, str.indexOf(95, indexOf));
            } catch (IndexOutOfBoundsException e) {
                UMCrashManager.reportCrash(appContext, e);
            }
        }
        return "";
    }

    public static String getCurrentProcessName(Context context) {
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0);
            if (activityManager == null || (runningAppProcesses = activityManager.getRunningAppProcesses()) == null || runningAppProcesses.size() <= 0) {
                return "";
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                if (runningAppProcessInfo.pid == myPid) {
                    return runningAppProcessInfo.processName;
                }
            }
            return "";
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context.getApplicationContext(), th);
            return "";
        }
    }

    public static long getDistanceDays(long j, long j2) {
        return (j < j2 ? j2 - j : j - j2) / 86400000;
    }

    public static String getEnvelopeDirPath(Context context) {
        String str;
        synchronized (mEnvelopeFileLock) {
            try {
                if (mDefaultEnvelopeDirPath == null) {
                    mDefaultEnvelopeDirPath = context.getFilesDir().getAbsolutePath() + "/." + mDefaultEnvelopeDir;
                }
                File file = new File(mDefaultEnvelopeDirPath);
                if (!file.exists() && !file.mkdir()) {
                    ULog.m9817d("--->>> Create Envelope Directory failed!!!");
                }
            } catch (Throwable th) {
                UMCrashManager.reportCrash(context, th);
            }
            str = mDefaultEnvelopeDirPath;
        }
        return str;
    }

    public static File getEnvelopeFile(final Context context) {
        if (context == null) {
            return null;
        }
        File file = new File(getEnvelopeDirPath(context));
        synchronized (mEnvelopeFileLock) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                if (listFiles.length != 0) {
                    Arrays.sort(listFiles, new Comparator<File>() {
                        /* class com.umeng.commonsdk.framework.UMFrUtils.C35152 */

                        /* renamed from: a */
                        public int compare(File file, File file2) {
                            String name = file.getName();
                            String name2 = file2.getName();
                            String createTimeFromFileName = UMFrUtils.getCreateTimeFromFileName(name);
                            String createTimeFromFileName2 = UMFrUtils.getCreateTimeFromFileName(name2);
                            if (!TextUtils.isEmpty(createTimeFromFileName) && !TextUtils.isEmpty(createTimeFromFileName2)) {
                                try {
                                    long longValue = Long.valueOf(createTimeFromFileName).longValue() - Long.valueOf(createTimeFromFileName2).longValue();
                                    if (longValue > 0) {
                                        return 1;
                                    }
                                    return longValue == 0 ? 0 : -1;
                                } catch (NumberFormatException e) {
                                    UMCrashManager.reportCrash(context, e);
                                }
                            }
                            return 1;
                        }
                    });
                    return listFiles[0];
                }
            }
            return null;
        }
    }

    public static long getLastInstantBuildTime(Context context) {
        long j;
        synchronized (mEnvelopeBuildTimeLock) {
            j = PreferenceWrapper.getDefault(context).getLong(KEY_LAST_INSTANT_SUCC_BUILD_TIME, 0);
        }
        return j;
    }

    public static long getLastSuccessfulBuildTime(Context context) {
        long j;
        synchronized (mEnvelopeBuildTimeLock) {
            j = PreferenceWrapper.getDefault(context).getLong(KEY_LAST_SUCC_BUILD_TIME, 0);
        }
        return j;
    }

    public static String getLegacyEnvelopeDir(Context context) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0);
        if (activityManager != null) {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses == null) {
                ULog.m9817d("--->>> getEnvelopeDir: can't get process name, use default envelope directory.");
                return mDefaultEnvelopeDir;
            } else if (runningAppProcesses.size() == 0) {
                return mDefaultEnvelopeDir;
            } else {
                try {
                    for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                        if (runningAppProcessInfo.pid == Process.myPid()) {
                            String replace = runningAppProcessInfo.processName.replace(':', '_');
                            ULog.m9817d("--->>> getEnvelopeDir: use current process name as envelope directory.");
                            return replace;
                        }
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(context, th);
                }
            }
        }
        return mDefaultEnvelopeDir;
    }

    public static String getSubProcessName(Context context) {
        String str = "";
        try {
            String currentProcessName = getCurrentProcessName(context);
            int indexOf = currentProcessName.indexOf(Constants.COLON_SEPARATOR);
            if (indexOf >= 0) {
                str = currentProcessName.substring(indexOf + 1);
            }
            if (indexOf < 0) {
                return currentProcessName.substring(context.getPackageName().length() + 1, currentProcessName.length());
            }
            return str;
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context.getApplicationContext(), th);
            return str;
        }
    }

    public static boolean hasEnvelopeFile(Context context, UMLogDataProtocol.UMBusinessType uMBusinessType) {
        String str = uMBusinessType == UMLogDataProtocol.UMBusinessType.U_INTERNAL ? C3617o.f9367au : "a";
        String envelopeDirPath = getEnvelopeDirPath(context);
        if (envelopeDirPath == null) {
            return false;
        }
        File file = new File(envelopeDirPath);
        synchronized (mEnvelopeFileLock) {
            try {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    if (listFiles.length != 0) {
                        for (File file2 : listFiles) {
                            if (file2.getName().startsWith(str)) {
                                return true;
                            }
                        }
                        return false;
                    }
                }
                return false;
            } catch (Throwable th) {
                UMCrashManager.reportCrash(context, th);
            }
        }
    }

    public static boolean isOnline(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        try {
            if (!checkPermission(context, "android.permission.ACCESS_NETWORK_STATE") || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null) {
                return false;
            }
            return activeNetworkInfo.isConnectedOrConnecting();
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context.getApplicationContext(), th);
            return false;
        }
    }

    public static boolean removeEnvelopeFile(File file) {
        Context appContext = UMModuleRegister.getAppContext();
        synchronized (mEnvelopeFileLock) {
            if (file != null) {
                try {
                    if (file.exists()) {
                        return file.delete();
                    }
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(appContext, th);
                }
            }
            return true;
        }
    }

    public static void removeRedundantEnvelopeFiles(final Context context, int i) {
        File file = new File(getEnvelopeDirPath(context));
        synchronized (mEnvelopeFileLock) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                if (listFiles.length > i) {
                    Arrays.sort(listFiles, new Comparator<File>() {
                        /* class com.umeng.commonsdk.framework.UMFrUtils.C35141 */

                        /* renamed from: a */
                        public int compare(File file, File file2) {
                            String name = file.getName();
                            String name2 = file2.getName();
                            String createTimeFromFileName = UMFrUtils.getCreateTimeFromFileName(name);
                            String createTimeFromFileName2 = UMFrUtils.getCreateTimeFromFileName(name2);
                            if (!TextUtils.isEmpty(createTimeFromFileName) && !TextUtils.isEmpty(createTimeFromFileName2)) {
                                try {
                                    long longValue = Long.valueOf(createTimeFromFileName).longValue() - Long.valueOf(createTimeFromFileName2).longValue();
                                    if (longValue > 0) {
                                        return 1;
                                    }
                                    return longValue == 0 ? 0 : -1;
                                } catch (NumberFormatException e) {
                                    UMCrashManager.reportCrash(context, e);
                                }
                            }
                            return 1;
                        }
                    });
                    if (listFiles.length > i) {
                        for (int i2 = 0; i2 < listFiles.length - i; i2++) {
                            try {
                                if (!listFiles[i2].delete()) {
                                    ULog.m9817d("--->>> remove [" + i2 + "] file fail.");
                                }
                            } catch (Throwable th) {
                                UMCrashManager.reportCrash(context, th);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x005c A[SYNTHETIC, Splitter:B:28:0x005c] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0068 A[SYNTHETIC, Splitter:B:35:0x0068] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int saveEnvelopeFile(android.content.Context r5, java.lang.String r6, byte[] r7) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.framework.UMFrUtils.saveEnvelopeFile(android.content.Context, java.lang.String, byte[]):int");
    }

    public static void syncLegacyEnvelopeIfNeeded(Context context) {
        if (context != null) {
            try {
                String legacyEnvelopeDir = getLegacyEnvelopeDir(context);
                if (!TextUtils.isEmpty(legacyEnvelopeDir) && !legacyEnvelopeDir.equals(mDefaultEnvelopeDir)) {
                    File file = new File(context.getFilesDir().getAbsolutePath() + "/." + legacyEnvelopeDir);
                    if (file.exists()) {
                        File[] listFiles = file.listFiles();
                        if (listFiles == null || listFiles.length == 0) {
                            try {
                                if (file.isDirectory()) {
                                    file.delete();
                                }
                            } catch (Throwable th) {
                                UMCrashManager.reportCrash(context, th);
                            }
                        } else {
                            try {
                                String envelopeDirPath = getEnvelopeDirPath(context);
                                for (int i = 0; i < listFiles.length; i++) {
                                    File file2 = listFiles[i];
                                    file2.renameTo(new File(envelopeDirPath + C8932ooOOO0o.OooO0OO + listFiles[i].getName()));
                                }
                                if (file.isDirectory()) {
                                    file.delete();
                                }
                            } catch (Throwable th2) {
                                UMCrashManager.reportCrash(context, th2);
                            }
                        }
                    }
                }
            } catch (Throwable th3) {
                UMCrashManager.reportCrash(context, th3);
            }
        }
    }

    public static byte[] toByteArray(String str) throws IOException {
        byte[] bArr;
        Context appContext = UMModuleRegister.getAppContext();
        synchronized (mEnvelopeFileLock) {
            FileChannel fileChannel = null;
            try {
                FileChannel channel = new RandomAccessFile(str, "r").getChannel();
                MappedByteBuffer load = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size()).load();
                bArr = new byte[((int) channel.size())];
                if (load.remaining() > 0) {
                    load.get(bArr, 0, load.remaining());
                }
                try {
                    channel.close();
                } catch (Throwable th) {
                    UMCrashManager.reportCrash(appContext, th);
                }
            } catch (IOException e) {
                UMCrashManager.reportCrash(appContext, e);
                throw e;
            } catch (Throwable th2) {
                UMCrashManager.reportCrash(appContext, th2);
            }
        }
        return bArr;
        throw th;
    }

    public static void updateLastInstantBuildTime(Context context) {
        synchronized (mEnvelopeBuildTimeLock) {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            sharedPreferences.edit().putLong(KEY_LAST_INSTANT_SUCC_BUILD_TIME, System.currentTimeMillis()).commit();
        }
    }

    public static void updateLastSuccessfulBuildTime(Context context) {
        synchronized (mEnvelopeBuildTimeLock) {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            sharedPreferences.edit().putLong(KEY_LAST_SUCC_BUILD_TIME, System.currentTimeMillis()).commit();
        }
    }
}
