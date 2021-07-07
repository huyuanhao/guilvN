package com.facebook.react.modules.systeminfo;

import android.os.Build;
import java.util.Locale;

public class AndroidInfoHelpers {
    public static final int DEBUG_SERVER_HOST_PORT = 8081;
    public static final String DEVICE_LOCALHOST = "localhost";
    public static final String EMULATOR_LOCALHOST = "10.0.2.2";
    public static final String GENYMOTION_LOCALHOST = "10.0.3.2";
    public static final int INSPECTOR_PROXY_PORT = 8082;
    public static final String METRO_HOST_PROP_NAME = "metro.host";
    public static final String TAG = "AndroidInfoHelpers";
    public static String metroHostPropValue;

    public static String getFriendlyDeviceName() {
        if (isRunningOnGenymotion()) {
            return Build.MODEL;
        }
        return Build.MODEL + " - " + Build.VERSION.RELEASE + " - API " + Build.VERSION.SDK_INT;
    }

    public static String getInspectorProxyHost() {
        return getServerIpAddress(INSPECTOR_PROXY_PORT);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0046, code lost:
        if (r2 == null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0048, code lost:
        r2.destroy();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0073, code lost:
        if (r2 == null) goto L_0x0076;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0076, code lost:
        r1 = com.facebook.react.modules.systeminfo.AndroidInfoHelpers.metroHostPropValue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0079, code lost:
        return r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006e A[SYNTHETIC, Splitter:B:36:0x006e] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x007d A[SYNTHETIC, Splitter:B:45:0x007d] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.lang.String getMetroHostPropValue() {
        /*
        // Method dump skipped, instructions count: 141
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.systeminfo.AndroidInfoHelpers.getMetroHostPropValue():java.lang.String");
    }

    public static String getServerHost() {
        return getServerIpAddress(DEBUG_SERVER_HOST_PORT);
    }

    public static String getServerIpAddress(int i) {
        String metroHostPropValue2 = getMetroHostPropValue();
        if (metroHostPropValue2.equals("")) {
            if (isRunningOnGenymotion()) {
                metroHostPropValue2 = GENYMOTION_LOCALHOST;
            } else {
                metroHostPropValue2 = isRunningOnStockEmulator() ? EMULATOR_LOCALHOST : DEVICE_LOCALHOST;
            }
        }
        return String.format(Locale.US, "%s:%d", metroHostPropValue2, Integer.valueOf(i));
    }

    public static boolean isRunningOnGenymotion() {
        return Build.FINGERPRINT.contains("vbox");
    }

    public static boolean isRunningOnStockEmulator() {
        return Build.FINGERPRINT.contains("generic");
    }
}
