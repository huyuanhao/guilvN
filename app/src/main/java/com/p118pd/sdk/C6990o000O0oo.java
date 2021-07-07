package com.p118pd.sdk;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: com.pd.sdk.o000O0oo  reason: case insensitive filesystem */
public final class C6990o000O0oo {
    @Nullable
    public static IBinder OooO00o(@NonNull Bundle bundle, @Nullable String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            return bundle.getBinder(str);
        }
        return OooO00o.OooO00o(bundle, str);
    }

    public static void OooO00o(@NonNull Bundle bundle, @Nullable String str, @Nullable IBinder iBinder) {
        if (Build.VERSION.SDK_INT >= 18) {
            bundle.putBinder(str, iBinder);
        } else {
            OooO00o.OooO00o(bundle, str, iBinder);
        }
    }

    /* renamed from: com.pd.sdk.o000O0oo$OooO00o */
    public static class OooO00o {
        public static final String OooO00o = "BundleCompatBaseImpl";

        /* renamed from: OooO00o  reason: collision with other field name */
        public static Method f19193OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public static boolean f19194OooO00o;
        public static Method OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public static boolean f19195OooO0O0;

        public static IBinder OooO00o(Bundle bundle, String str) {
            if (!f19194OooO00o) {
                try {
                    Method method = Bundle.class.getMethod("getIBinder", String.class);
                    f19193OooO00o = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i(OooO00o, "Failed to retrieve getIBinder method", e);
                }
                f19194OooO00o = true;
            }
            Method method2 = f19193OooO00o;
            if (method2 != null) {
                try {
                    return (IBinder) method2.invoke(bundle, str);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i(OooO00o, "Failed to invoke getIBinder via reflection", e2);
                    f19193OooO00o = null;
                }
            }
            return null;
        }

        public static void OooO00o(Bundle bundle, String str, IBinder iBinder) {
            if (!f19195OooO0O0) {
                try {
                    Method method = Bundle.class.getMethod("putIBinder", String.class, IBinder.class);
                    OooO0O0 = method;
                    method.setAccessible(true);
                } catch (NoSuchMethodException e) {
                    Log.i(OooO00o, "Failed to retrieve putIBinder method", e);
                }
                f19195OooO0O0 = true;
            }
            Method method2 = OooO0O0;
            if (method2 != null) {
                try {
                    method2.invoke(bundle, str, iBinder);
                } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e2) {
                    Log.i(OooO00o, "Failed to invoke putIBinder via reflection", e2);
                    OooO0O0 = null;
                }
            }
        }
    }
}
