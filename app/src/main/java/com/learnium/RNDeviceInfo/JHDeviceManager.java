package com.learnium.RNDeviceInfo;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.os.Process;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.annotation.RequiresApi;
import com.facebook.react.views.text.FontMetricsUtil;
import com.jinhui365.util.permission.OnBasePermissionGrantedListener;
import com.jinhui365.util.permission.PermissionManager;
import com.learnium.RNDeviceInfo.SystemBarTintManager;
import com.p118pd.sdk.AbstractC7726o0ooOOoo;
import com.p118pd.sdk.C5982OoooOoO;
import com.p118pd.sdk.C7047o00O00Oo;
import com.p118pd.sdk.C7402o0OOOOoo;
import com.p118pd.sdk.C8734oo0oOOO;
import com.p118pd.sdk.C8738oo0oOOo0;
import com.p118pd.sdk.C8741oo0oOo0;
import com.p118pd.sdk.C8742oo0oOo00;
import com.p118pd.sdk.C8876ooO0oOOo;
import com.p118pd.sdk.C9053ooOoOo;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.umeng.message.MsgConstant;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.HashMap;
import java.util.UUID;

public class JHDeviceManager {
    public static final int TYPE_FLYME = 1;
    public static final int TYPE_M = 3;
    public static final int TYPE_MIUI = 0;
    public static String deviceId = "";
    public static String iccid = "";
    public static String imei = "";
    public static String imsi = "";
    public static boolean sIsNotchScreen = false;
    public static String umpn = "";

    public static void doActualOperation(final boolean z, final Activity activity, final View view) {
        activity.runOnUiThread(new Runnable() {
            /* class com.learnium.RNDeviceInfo.JHDeviceManager.RunnableC14376 */

            public void run() {
                if (!z || JHDeviceManager.sIsNotchScreen) {
                    view.setSystemUiVisibility(0);
                    JHDeviceManager.setStatusBarColor(activity, "#FF6700", true);
                    return;
                }
                view.setSystemUiVisibility(1280);
                JHDeviceManager.setStatusBarColor(activity, "#33EEEEFF", false);
            }
        });
    }

    public static String getAppCurrentMemory(Context context) {
        return String.valueOf(((ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0)).getProcessMemoryInfo(new int[]{Process.myPid()})[0].getTotalPss() / 1024);
    }

    public static String getAppMaxAvailableMemory() {
        double maxMemory = (double) Runtime.getRuntime().maxMemory();
        Double.isNaN(maxMemory);
        return C8738oo0oOOo0.OooO0o(((maxMemory * 1.0d) / 1024.0d) / 1024.0d);
    }

    public static String getAppName(Context context) {
        return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
    }

    public static String getAppVersion(Context context) {
        return C8742oo0oOo00.OooO0Oo(context);
    }

    public static String getBiologicalInfo(Context context) {
        if (Build.VERSION.SDK_INT < 23) {
            return "NOT_SUPPORTED";
        }
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        C7047o00O00Oo OooO00o = C7047o00O00Oo.m18322OooO00o(context);
        if (OooO00o == null || !OooO00o.OooO0O0()) {
            return "NOT_PRESENT";
        }
        if (keyguardManager == null || !keyguardManager.isKeyguardSecure()) {
            return "NOT_AVAILABLE";
        }
        return !OooO00o.OooO00o() ? "NOT_ENROLLED" : "IS_SUPPORTED";
    }

    public static String getDensity(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        float f = displayMetrics.density;
        int i = displayMetrics.densityDpi;
        return "density:" + f + "  densityDpi:" + i;
    }

    public static String getDeviceAvailableMemory(Context context) {
        long j;
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0)).getMemoryInfo(memoryInfo);
            j = memoryInfo.availMem;
        } catch (Exception e) {
            e.printStackTrace();
            j = 0;
        }
        double d = (double) j;
        Double.isNaN(d);
        return C8738oo0oOOo0.OooO0O0((((d * 1.0d) / 1024.0d) / 1024.0d) / 1024.0d, 3, true);
    }

    public static String getDeviceId(final Context context) {
        String string = Settings.Secure.getString(context.getContentResolver(), "android_id");
        deviceId = string;
        if (string != null) {
            try {
                if (!C8876ooO0oOOo.OooO00o.equals(string)) {
                    deviceId = UUID.nameUUIDFromBytes(deviceId.getBytes(C7402o0OOOOoo.OooOO0)).toString();
                    return deviceId;
                }
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
                HashMap hashMap = new HashMap();
                hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "getDeviceId");
                hashMap.put("desc", "UnsupportedEncodingException:" + e.getLocalizedMessage());
                LogCollectorManager.sharedInstance().recordWarn(LogCategory.API, "DeviceInfo", hashMap);
            } catch (Exception e2) {
                e2.printStackTrace();
                HashMap hashMap2 = new HashMap();
                hashMap2.put(AbstractC7726o0ooOOoo.OooOOo0, "getDeviceId");
                hashMap2.put("desc", "Exception:" + e2.getLocalizedMessage());
                LogCollectorManager.sharedInstance().recordWarn(LogCategory.API, "DeviceInfo", hashMap2);
            }
        }
        PermissionManager.OooO00o(context).OooO00o(new String[]{MsgConstant.PERMISSION_READ_PHONE_STATE}, new OnBasePermissionGrantedListener(context) {
            /* class com.learnium.RNDeviceInfo.JHDeviceManager.C14311 */

            @Override // com.jinhui365.util.permission.OnBasePermissionGrantedListener
            public void onGranted() {
                String deviceId = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
                JHDeviceManager.deviceId = deviceId;
                if (deviceId == null) {
                    JHDeviceManager.deviceId = Settings.Secure.getString(context.getContentResolver(), "android_id");
                }
                try {
                    JHDeviceManager.deviceId = (C8741oo0oOo0.OooO0Oo(JHDeviceManager.deviceId) ? UUID.nameUUIDFromBytes(JHDeviceManager.deviceId.getBytes(C7402o0OOOOoo.OooOO0)) : UUID.randomUUID()).toString();
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                    HashMap hashMap = new HashMap();
                    hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "getDeviceId");
                    hashMap.put("desc", "UnsupportedEncodingException:" + e.getLocalizedMessage());
                    LogCollectorManager.sharedInstance().recordWarn(LogCategory.API, "DeviceInfo", hashMap);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put(AbstractC7726o0ooOOoo.OooOOo0, "getDeviceId");
                    hashMap2.put("desc", "Exception:" + e2.getLocalizedMessage());
                    LogCollectorManager.sharedInstance().recordWarn(LogCategory.API, "DeviceInfo", hashMap2);
                }
            }
        });
        return deviceId;
    }

    public static String getDeviceTotalMemory(Context context) {
        long j;
        try {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) context.getSystemService(C5982OoooOoO.OooO0o0)).getMemoryInfo(memoryInfo);
            j = memoryInfo.totalMem;
        } catch (Exception e) {
            e.printStackTrace();
            j = 0;
        }
        double d = (double) j;
        Double.isNaN(d);
        return C8738oo0oOOo0.OooO0O0((((d * 1.0d) / 1024.0d) / 1024.0d) / 1024.0d, 3, true);
    }

    public static String getDeviceVendor() {
        return Build.BRAND + " " + Build.DISPLAY;
    }

    public static double getFreeMemory() {
        return (double) Runtime.getRuntime().freeMemory();
    }

    @SuppressLint({"MissingPermission"})
    public static String getICCID(Context context) {
        try {
            iccid = "";
            String simSerialNumber = ((TelephonyManager) context.getSystemService("phone")).getSimSerialNumber();
            iccid = simSerialNumber;
            if (simSerialNumber == null) {
                iccid = "";
            }
            return iccid;
        } catch (Exception e) {
            e.printStackTrace();
            HashMap hashMap = new HashMap();
            hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "getICCID");
            hashMap.put("desc", "Exception:" + e.getLocalizedMessage());
            LogCollectorManager.sharedInstance().recordWarn(LogCategory.API, "DeviceInfo", hashMap);
            return "";
        }
    }

    @SuppressLint({"MissingPermission"})
    public static String getIMEI(Context context) {
        try {
            imei = "";
            String deviceId2 = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
            imei = deviceId2;
            if (deviceId2 == null) {
                imei = "";
            }
            return imei;
        } catch (Exception e) {
            e.printStackTrace();
            HashMap hashMap = new HashMap();
            hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "getIMEI");
            hashMap.put("desc", "Exception:" + e.getLocalizedMessage());
            LogCollectorManager.sharedInstance().recordWarn(LogCategory.API, "DeviceInfo", hashMap);
            return "";
        }
    }

    @SuppressLint({"MissingPermission"})
    public static String getIMSI(Context context) {
        try {
            imsi = "";
            String subscriberId = ((TelephonyManager) context.getSystemService("phone")).getSubscriberId();
            imsi = subscriberId;
            if (subscriberId == null) {
                imsi = "";
            }
            return imsi;
        } catch (Exception e) {
            e.printStackTrace();
            HashMap hashMap = new HashMap();
            hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "getIMSI");
            hashMap.put("desc", "Exception:" + e.getLocalizedMessage());
            LogCollectorManager.sharedInstance().recordWarn(LogCategory.API, "DeviceInfo", hashMap);
            return "";
        }
    }

    public static String getMacAddress() {
        try {
            for (NetworkInterface networkInterface : Collections.list(NetworkInterface.getNetworkInterfaces())) {
                if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                    byte[] hardwareAddress = networkInterface.getHardwareAddress();
                    if (hardwareAddress == null) {
                        return "";
                    }
                    StringBuilder sb = new StringBuilder();
                    int length = hardwareAddress.length;
                    for (int i = 0; i < length; i++) {
                        sb.append(String.format("%02X:", Byte.valueOf(hardwareAddress[i])));
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString();
                }
            }
        } catch (Exception e) {
            LogCollectorManager sharedInstance = LogCollectorManager.sharedInstance();
            LogCategory logCategory = LogCategory.API;
            sharedInstance.recordWarn(logCategory, "DeviceInfo: macAddress error；" + e.getLocalizedMessage());
        }
        return "";
    }

    public static String getModel() {
        return Build.MODEL;
    }

    public static PackageInfo getPackageInfo(Application application) throws Exception {
        return application.getPackageManager().getPackageInfo(application.getPackageName(), 0);
    }

    public static String getPackageName(Context context) {
        return C8742oo0oOo00.m20371OooO0O0(context);
    }

    public static String getResolution(Context context) {
        try {
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            return displayMetrics.widthPixels + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + displayMetrics.heightPixels;
        } catch (Exception e) {
            e.printStackTrace();
            LogCollectorManager sharedInstance = LogCollectorManager.sharedInstance();
            LogCategory logCategory = LogCategory.API;
            sharedInstance.recordWarn(logCategory, "DeviceInfo:获取 resolution异常，error" + e.getLocalizedMessage());
            return "";
        }
    }

    public static int getStatusBarHeight(Context context) {
        Resources resources = context.getResources();
        return C8734oo0oOOO.OooO0O0(context, (float) resources.getDimensionPixelSize(resources.getIdentifier(SystemBarTintManager.SystemBarConfig.STATUS_BAR_HEIGHT_RES_NAME, "dimen", "android")));
    }

    public static String getSystemName() {
        return "Android";
    }

    public static String getSystemVersion() {
        return Build.VERSION.RELEASE;
    }

    @SuppressLint({"MissingPermission"})
    public static String getUMPN(Context context) {
        try {
            umpn = "";
            String line1Number = ((TelephonyManager) context.getSystemService("phone")).getLine1Number();
            umpn = line1Number;
            if (line1Number == null) {
                umpn = "";
            }
            return umpn;
        } catch (Exception e) {
            e.printStackTrace();
            HashMap hashMap = new HashMap();
            hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, "getUMPN");
            hashMap.put("desc", "Exception:" + e.getLocalizedMessage());
            LogCollectorManager.sharedInstance().recordWarn(LogCategory.API, "DeviceInfo", hashMap);
            return "";
        }
    }

    public static boolean isEmulator() {
        return Build.FINGERPRINT.startsWith("generic") || Build.FINGERPRINT.startsWith("unknown") || Build.MODEL.contains("google_sdk") || Build.MODEL.toLowerCase().contains("droid4x") || Build.MODEL.contains("Emulator") || Build.MODEL.contains("Android SDK built for x86") || Build.MANUFACTURER.contains("Genymotion") || Build.HARDWARE.contains("goldfish") || Build.HARDWARE.contains("ranchu") || Build.HARDWARE.contains("vbox86") || Build.PRODUCT.contains("sdk") || Build.PRODUCT.contains("google_sdk") || Build.PRODUCT.contains("sdk_google") || Build.PRODUCT.contains("sdk_x86") || Build.PRODUCT.contains("vbox86p") || Build.PRODUCT.contains("emulator") || Build.PRODUCT.contains("simulator") || Build.BOARD.toLowerCase().contains("nox") || Build.BOOTLOADER.toLowerCase().contains("nox") || Build.HARDWARE.toLowerCase().contains("nox") || Build.PRODUCT.toLowerCase().contains("nox") || Build.SERIAL.toLowerCase().contains("nox") || (Build.BRAND.startsWith("generic") && Build.DEVICE.startsWith("generic"));
    }

    public static boolean isRoot() {
        String[] strArr = {"/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/", "/su/bin/"};
        for (int i = 0; i < 6; i++) {
            try {
                String str = strArr[i];
                File file = new File(str + C9053ooOoOo.OooO00o);
                if (file.exists() && file.canExecute()) {
                    return true;
                }
            } catch (Exception e) {
                e.printStackTrace();
                LogCollectorManager sharedInstance = LogCollectorManager.sharedInstance();
                LogCategory logCategory = LogCategory.API;
                sharedInstance.recordWarn(logCategory, "DeviceInfo:isRoot error;" + e.getLocalizedMessage());
            }
        }
        return false;
    }

    public static boolean setCommonUI(final Activity activity, final boolean z) {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        activity.runOnUiThread(new Runnable() {
            /* class com.learnium.RNDeviceInfo.JHDeviceManager.RunnableC14343 */

            public void run() {
                View decorView = activity.getWindow().getDecorView();
                if (decorView != null) {
                    int systemUiVisibility = decorView.getSystemUiVisibility();
                    int i = z ? systemUiVisibility | 8192 : systemUiVisibility & -8193;
                    if (decorView.getSystemUiVisibility() != i) {
                        decorView.setSystemUiVisibility(i);
                    }
                }
            }
        });
        return true;
    }

    public static boolean setFlymeUI(Activity activity, boolean z) {
        try {
            Window window = activity.getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            Field declaredField = WindowManager.LayoutParams.class.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON");
            Field declaredField2 = WindowManager.LayoutParams.class.getDeclaredField("meizuFlags");
            declaredField.setAccessible(true);
            declaredField2.setAccessible(true);
            int i = declaredField.getInt(null);
            int i2 = declaredField2.getInt(attributes);
            declaredField2.setInt(attributes, z ? i2 | i : (i ^ -1) & i2);
            window.setAttributes(attributes);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static boolean setMiuiUI(Activity activity, boolean z) {
        try {
            Window window = activity.getWindow();
            Class<?> cls = activity.getWindow().getClass();
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Method declaredMethod = cls.getDeclaredMethod("setExtraFlags", Integer.TYPE, Integer.TYPE);
            declaredMethod.setAccessible(true);
            if (z) {
                declaredMethod.invoke(window, Integer.valueOf(i), Integer.valueOf(i));
            } else {
                declaredMethod.invoke(window, 0, Integer.valueOf(i));
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void setStatusBarColor(final Activity activity, String str, final boolean z) {
        sIsNotchScreen = true;
        final String translateColorValid = Util.translateColorValid(str);
        activity.runOnUiThread(new Runnable() {
            /* class com.learnium.RNDeviceInfo.JHDeviceManager.RunnableC14322 */

            public void run() {
                if (Build.VERSION.SDK_INT >= 23) {
                    final Window window = activity.getWindow();
                    window.getDecorView().addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                        /* class com.learnium.RNDeviceInfo.JHDeviceManager.RunnableC14322.View$OnAttachStateChangeListenerC14331 */

                        public void onViewAttachedToWindow(View view) {
                            boolean unused = JHDeviceManager.sIsNotchScreen = true;
                            if (!z) {
                                window.getDecorView().setSystemUiVisibility(1280);
                            } else {
                                window.getDecorView().setSystemUiVisibility(0);
                            }
                            RunnableC14322 r2 = RunnableC14322.this;
                            JHDeviceManager.setStatusBarDarkTheme(activity, Util.isLightColor(translateColorValid));
                        }

                        public void onViewDetachedFromWindow(View view) {
                        }
                    });
                    if (!z) {
                        window.getDecorView().setSystemUiVisibility(1280);
                    } else {
                        window.getDecorView().setSystemUiVisibility(0);
                    }
                    window.addFlags(Integer.MIN_VALUE);
                    window.setStatusBarColor(Color.parseColor(translateColorValid));
                }
                JHDeviceManager.setStatusBarDarkTheme(activity, Util.isLightColor(translateColorValid));
            }
        });
    }

    public static boolean setStatusBarDarkTheme(Activity activity, boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 19) {
            if (i >= 23) {
                setStatusBarFontIconDark(activity, 3, z);
            } else if (Util.isMiui()) {
                setStatusBarFontIconDark(activity, 0, z);
            } else if (Util.isFlyme()) {
                setStatusBarFontIconDark(activity, 1, z);
            }
            return true;
        }
        return false;
    }

    public static boolean setStatusBarFontIconDark(Activity activity, int i, boolean z) {
        if (i == 0) {
            return setMiuiUI(activity, z);
        }
        if (i != 1) {
            return setCommonUI(activity, z);
        }
        return setFlymeUI(activity, z);
    }

    @TargetApi(19)
    public static void setTranslucentStatus(final Activity activity, final boolean z) {
        activity.runOnUiThread(new Runnable() {
            /* class com.learnium.RNDeviceInfo.JHDeviceManager.RunnableC14354 */

            public void run() {
                View childAt = ((ViewGroup) activity.findViewById(16908290)).getChildAt(0);
                if (childAt != null) {
                    childAt.setFitsSystemWindows(z);
                }
                int i = Build.VERSION.SDK_INT;
                if (i >= 21) {
                    Window window = activity.getWindow();
                    window.getDecorView().setSystemUiVisibility(1280);
                    window.addFlags(Integer.MIN_VALUE);
                    window.setStatusBarColor(0);
                } else if (i >= 19) {
                    activity.getWindow().addFlags(67108864);
                }
            }
        });
    }

    @RequiresApi(api = 21)
    public static void switchLayoutFullScreenState(final boolean z, final Activity activity) {
        sIsNotchScreen = true;
        final View decorView = activity.getWindow().getDecorView();
        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
            /* class com.learnium.RNDeviceInfo.JHDeviceManager.View$OnAttachStateChangeListenerC14365 */

            @RequiresApi(api = 28)
            public void onViewAttachedToWindow(View view) {
                boolean unused = JHDeviceManager.sIsNotchScreen = Util.hasNotchInScreen(activity);
                JHDeviceManager.doActualOperation(z, activity, decorView);
            }

            public void onViewDetachedFromWindow(View view) {
            }
        });
        doActualOperation(z, activity, decorView);
    }
}
