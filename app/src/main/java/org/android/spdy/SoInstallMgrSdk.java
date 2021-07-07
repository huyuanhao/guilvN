package org.android.spdy;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.lang.reflect.Method;

public class SoInstallMgrSdk {
    public static final String ARMEABI = "armeabi";
    public static final int EventID_SO_INIT = 21033;
    public static final String LOGTAG = "INIT_SO";
    public static final String MIPS = "mips";
    public static final String X86 = "x86";
    public static Context mContext;

    public static String _cpuType() {
        String _getFieldReflectively = _getFieldReflectively(new Build(), "CPU_ABI");
        if (_getFieldReflectively == null || _getFieldReflectively.length() == 0 || _getFieldReflectively.equals("Unknown")) {
            _getFieldReflectively = ARMEABI;
        }
        return _getFieldReflectively.toLowerCase();
    }

    public static String _getFieldReflectively(Build build, String str) {
        try {
            return Build.class.getField(str).get(build).toString();
        } catch (Exception unused) {
            return "Unknown";
        }
    }

    public static boolean _loadUnzipSo(String str, int i, ClassLoader classLoader) {
        try {
            if (!isExist(str, i)) {
                return true;
            }
            if (classLoader == null) {
                System.load(_targetSoFile(str, i));
                return true;
            }
            Runtime runtime = Runtime.getRuntime();
            Method declaredMethod = Runtime.class.getDeclaredMethod("load", String.class, ClassLoader.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(runtime, _targetSoFile(str, i), classLoader);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } catch (UnsatisfiedLinkError e2) {
            e2.printStackTrace();
            return false;
        } catch (Error e3) {
            e3.printStackTrace();
            return false;
        }
    }

    public static String _targetSoFile(String str, int i) {
        Context context = mContext;
        if (context == null) {
            return "";
        }
        String str2 = "/data/data/" + context.getPackageName() + "/files";
        File filesDir = context.getFilesDir();
        if (filesDir != null) {
            str2 = filesDir.getPath();
        }
        return str2 + "/lib" + str + "bk" + i + ".so";
    }

    public static void init(Context context) {
        mContext = context;
    }

    public static boolean initSo(String str, int i) {
        return initSo(str, i, null);
    }

    public static boolean isExist(String str, int i) {
        return new File(_targetSoFile(str, i)).exists();
    }

    public static void removeSoIfExit(String str, int i) {
        File file = new File(_targetSoFile(str, i));
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x00d9 A[SYNTHETIC, Splitter:B:59:0x00d9] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00e3 A[SYNTHETIC, Splitter:B:64:0x00e3] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x00ed A[SYNTHETIC, Splitter:B:69:0x00ed] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean unZipSelectedFiles(java.lang.String r9, int r10, java.lang.ClassLoader r11) throws java.util.zip.ZipException, java.io.IOException {
        /*
        // Method dump skipped, instructions count: 255
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.spdy.SoInstallMgrSdk.unZipSelectedFiles(java.lang.String, int, java.lang.ClassLoader):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d A[SYNTHETIC, Splitter:B:13:0x003d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean initSo(java.lang.String r7, int r8, java.lang.ClassLoader r9) {
        /*
        // Method dump skipped, instructions count: 131
        */
        throw new UnsupportedOperationException("Method not decompiled: org.android.spdy.SoInstallMgrSdk.initSo(java.lang.String, int, java.lang.ClassLoader):boolean");
    }
}
