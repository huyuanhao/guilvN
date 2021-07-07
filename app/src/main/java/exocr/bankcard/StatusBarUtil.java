package exocr.bankcard;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import android.view.WindowManager;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StatusBarUtil {
    public static int OooO00o(Activity activity) {
        if (Build.VERSION.SDK_INT < 19) {
            return 0;
        }
        if (OooO00o(activity, false)) {
            return 1;
        }
        if (OooO00o(activity.getWindow(), false)) {
            return 2;
        }
        if (Build.VERSION.SDK_INT < 23) {
            return 0;
        }
        activity.getWindow().getDecorView().setSystemUiVisibility(0);
        return 3;
    }

    public static int OooO0O0(Activity activity) {
        if (Build.VERSION.SDK_INT >= 19) {
            if (OooO00o(activity, true)) {
                return 1;
            }
            if (OooO00o(activity.getWindow(), true)) {
                return 2;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                activity.getWindow().getDecorView().setSystemUiVisibility(9216);
                return 3;
            }
        }
        return 0;
    }

    public static void OooO00o(Activity activity, int i) {
        if (i == 1) {
            OooO00o(activity, false);
        } else if (i == 2) {
            OooO00o(activity.getWindow(), false);
        } else if (i == 3) {
            activity.getWindow().getDecorView().setSystemUiVisibility(0);
        }
    }

    public static void OooO0O0(Activity activity, int i) {
        if (i == 1) {
            OooO00o(activity, true);
        } else if (i == 2) {
            OooO00o(activity.getWindow(), true);
        } else if (i == 3) {
            activity.getWindow().getDecorView().setSystemUiVisibility(9216);
        }
    }

    public static boolean OooO00o(Window window, boolean z) {
        if (window != null) {
            try {
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
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean OooO00o(Activity activity, boolean z) {
        Window window = activity.getWindow();
        if (window != null) {
            Class<?> cls = window.getClass();
            try {
                Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
                int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
                Method method = cls.getMethod("setExtraFlags", Integer.TYPE, Integer.TYPE);
                if (z) {
                    method.invoke(window, Integer.valueOf(i), Integer.valueOf(i));
                } else {
                    method.invoke(window, 0, Integer.valueOf(i));
                }
                try {
                    if (Build.VERSION.SDK_INT < 23) {
                        return true;
                    }
                    if (z) {
                        activity.getWindow().getDecorView().setSystemUiVisibility(9216);
                        return true;
                    }
                    activity.getWindow().getDecorView().setSystemUiVisibility(0);
                    return true;
                } catch (Exception unused) {
                    return true;
                }
            } catch (Exception unused2) {
            }
        }
        return false;
    }
}
