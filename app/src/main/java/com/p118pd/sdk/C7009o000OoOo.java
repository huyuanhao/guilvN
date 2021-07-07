package com.p118pd.sdk;

import android.accessibilityservice.AccessibilityService;
import android.accounts.AccountManager;
import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.AppOpsManager;
import android.app.DownloadManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.SearchManager;
import android.app.UiModeManager;
import android.app.WallpaperManager;
import android.app.admin.DevicePolicyManager;
import android.app.job.JobScheduler;
import android.app.usage.UsageStatsManager;
import android.appwidget.AppWidgetManager;
import android.bluetooth.BluetoothManager;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.RestrictionsManager;
import android.content.pm.LauncherApps;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.hardware.ConsumerIrManager;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.hardware.input.InputManager;
import android.hardware.usb.UsbManager;
import android.location.LocationManager;
import android.media.AudioManager;
import android.media.MediaRouter;
import android.media.projection.MediaProjectionManager;
import android.media.session.MediaSessionManager;
import android.media.tv.TvInputManager;
import android.net.ConnectivityManager;
import android.net.nsd.NsdManager;
import android.net.wifi.WifiManager;
import android.net.wifi.p2p.WifiP2pManager;
import android.nfc.NfcManager;
import android.os.BatteryManager;
import android.os.Build;
import android.os.Bundle;
import android.os.DropBoxManager;
import android.os.PowerManager;
import android.os.Process;
import android.os.UserManager;
import android.os.Vibrator;
import android.os.storage.StorageManager;
import android.print.PrintManager;
import android.telecom.TelecomManager;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.WindowManager;
import android.view.accessibility.CaptioningManager;
import android.view.inputmethod.InputMethodManager;
import android.view.textservice.TextServicesManager;
import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.react.modules.netinfo.NetInfoModule;
import com.facebook.react.uimanager.ViewProps;
import com.umeng.commonsdk.proguard.C3617o;
import com.umeng.message.entity.UMessage;
import java.io.File;
import java.util.HashMap;

/* renamed from: com.pd.sdk.o000OoOo  reason: case insensitive filesystem */
public class C7009o000OoOo {
    public static TypedValue OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Object f19275OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f19276OooO00o = "ContextCompat";

    /* renamed from: com.pd.sdk.o000OoOo$OooO00o */
    public static final class OooO00o {
        public static final HashMap<Class<?>, String> OooO00o = new HashMap<>();

        static {
            if (Build.VERSION.SDK_INT > 22) {
                OooO00o.put(SubscriptionManager.class, "telephony_subscription_service");
                OooO00o.put(UsageStatsManager.class, "usagestats");
            }
            if (Build.VERSION.SDK_INT > 21) {
                OooO00o.put(AppWidgetManager.class, "appwidget");
                OooO00o.put(BatteryManager.class, "batterymanager");
                OooO00o.put(CameraManager.class, "camera");
                OooO00o.put(JobScheduler.class, "jobscheduler");
                OooO00o.put(LauncherApps.class, "launcherapps");
                OooO00o.put(MediaProjectionManager.class, "media_projection");
                OooO00o.put(MediaSessionManager.class, "media_session");
                OooO00o.put(RestrictionsManager.class, "restrictions");
                OooO00o.put(TelecomManager.class, "telecom");
                OooO00o.put(TvInputManager.class, "tv_input");
            }
            if (Build.VERSION.SDK_INT > 19) {
                OooO00o.put(AppOpsManager.class, "appops");
                OooO00o.put(CaptioningManager.class, "captioning");
                OooO00o.put(ConsumerIrManager.class, "consumer_ir");
                OooO00o.put(PrintManager.class, "print");
            }
            if (Build.VERSION.SDK_INT > 18) {
                OooO00o.put(BluetoothManager.class, NetInfoModule.CONNECTION_TYPE_BLUETOOTH);
            }
            if (Build.VERSION.SDK_INT > 17) {
                OooO00o.put(DisplayManager.class, ViewProps.DISPLAY);
                OooO00o.put(UserManager.class, "user");
            }
            if (Build.VERSION.SDK_INT > 16) {
                OooO00o.put(InputManager.class, "input");
                OooO00o.put(MediaRouter.class, "media_router");
                OooO00o.put(NsdManager.class, "servicediscovery");
            }
            OooO00o.put(AccessibilityService.class, "accessibility");
            OooO00o.put(AccountManager.class, "account");
            OooO00o.put(ActivityManager.class, C5982OoooOoO.OooO0o0);
            OooO00o.put(AlarmManager.class, "alarm");
            OooO00o.put(AudioManager.class, "audio");
            OooO00o.put(ClipboardManager.class, "clipboard");
            OooO00o.put(ConnectivityManager.class, "connectivity");
            OooO00o.put(DevicePolicyManager.class, "device_policy");
            OooO00o.put(DownloadManager.class, "download");
            OooO00o.put(DropBoxManager.class, "dropbox");
            OooO00o.put(InputMethodManager.class, "input_method");
            OooO00o.put(KeyguardManager.class, "keyguard");
            OooO00o.put(LayoutInflater.class, "layout_inflater");
            OooO00o.put(LocationManager.class, "location");
            OooO00o.put(NfcManager.class, "nfc");
            OooO00o.put(NotificationManager.class, UMessage.DISPLAY_TYPE_NOTIFICATION);
            OooO00o.put(PowerManager.class, "power");
            OooO00o.put(SearchManager.class, "search");
            OooO00o.put(SensorManager.class, C3617o.f9339Z);
            OooO00o.put(StorageManager.class, "storage");
            OooO00o.put(TelephonyManager.class, "phone");
            OooO00o.put(TextServicesManager.class, "textservices");
            OooO00o.put(UiModeManager.class, "uimode");
            OooO00o.put(UsbManager.class, "usb");
            OooO00o.put(Vibrator.class, "vibrator");
            OooO00o.put(WallpaperManager.class, "wallpaper");
            OooO00o.put(WifiP2pManager.class, "wifip2p");
            OooO00o.put(WifiManager.class, "wifi");
            OooO00o.put(WindowManager.class, "window");
        }
    }

    public static boolean OooO00o(@NonNull Context context, @NonNull Intent[] intentArr) {
        return OooO00o(context, intentArr, (Bundle) null);
    }

    @Nullable
    public static File OooO0O0(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.getDataDir();
        }
        String str = context.getApplicationInfo().dataDir;
        if (str != null) {
            return new File(str);
        }
        return null;
    }

    @Nullable
    public static File OooO0OO(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getNoBackupFilesDir();
        }
        return OooO00o(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    public static boolean OooO00o(@NonNull Context context, @NonNull Intent[] intentArr, @Nullable Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, bundle);
            return true;
        }
        context.startActivities(intentArr);
        return true;
    }

    public static void OooO00o(@NonNull Context context, @NonNull Intent intent, @Nullable Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            context.startActivity(intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    @NonNull
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static File[] m18262OooO0O0(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return context.getObbDirs();
        }
        return new File[]{context.getObbDir()};
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static File[] m18261OooO00o(@NonNull Context context, @Nullable String str) {
        if (Build.VERSION.SDK_INT >= 19) {
            return context.getExternalFilesDirs(str);
        }
        return new File[]{context.getExternalFilesDir(str)};
    }

    @NonNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static File[] m18260OooO00o(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 19) {
            return context.getExternalCacheDirs();
        }
        return new File[]{context.getExternalCacheDir()};
    }

    public static File OooO00o(File file, String... strArr) {
        for (String str : strArr) {
            if (file == null) {
                file = new File(str);
            } else if (str != null) {
                file = new File(file, str);
            }
        }
        return file;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Drawable m18256OooO00o(@NonNull Context context, @DrawableRes int i) {
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 21) {
            return context.getDrawable(i);
        }
        if (i3 >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (f19275OooO00o) {
            if (OooO00o == null) {
                OooO00o = new TypedValue();
            }
            context.getResources().getValue(i, OooO00o, true);
            i2 = OooO00o.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static ColorStateList m18255OooO00o(@NonNull Context context, @ColorRes int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(i);
        }
        return context.getResources().getColorStateList(i);
    }

    @ColorInt
    public static int OooO00o(@NonNull Context context, @ColorRes int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColor(i);
        }
        return context.getResources().getColor(i);
    }

    public static int OooO00o(@NonNull Context context, @NonNull String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static File m18257OooO00o(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 21) {
            return context.getCodeCacheDir();
        }
        return OooO00o(new File(context.getApplicationInfo().dataDir, C7244o00oooOo.f19783OooO0OO));
    }

    public static synchronized File OooO00o(File file) {
        synchronized (C7009o000OoOo.class) {
            if (file.exists() || file.mkdirs()) {
                return file;
            }
            if (file.exists()) {
                return file;
            }
            String str = "Unable to create files subdir " + file.getPath();
            return null;
        }
    }

    @Nullable
    public static Context OooO00o(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.createDeviceProtectedStorageContext();
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18259OooO00o(@NonNull Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.isDeviceProtectedStorage();
        }
        return false;
    }

    public static void OooO00o(@NonNull Context context, @NonNull Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    @Nullable
    public static <T> T OooO00o(@NonNull Context context, @NonNull Class<T> cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return (T) context.getSystemService(cls);
        }
        String OooO00o2 = m18258OooO00o(context, (Class<?>) cls);
        if (OooO00o2 != null) {
            return (T) context.getSystemService(OooO00o2);
        }
        return null;
    }

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m18258OooO00o(@NonNull Context context, @NonNull Class<?> cls) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getSystemServiceName(cls);
        }
        return OooO00o.OooO00o.get(cls);
    }
}
