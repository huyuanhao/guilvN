package com.umeng.message.util;

import android.os.Build;
import java.io.IOException;

/* renamed from: com.umeng.message.util.d */
public class C3894d {

    /* renamed from: a */
    public static final String f10607a = "ro.build.version.emui";

    /* renamed from: b */
    public static final String f10608b = "ro.miui.ui.version.code";

    /* renamed from: c */
    public static final String f10609c = "ro.miui.ui.version.name";

    /* renamed from: d */
    public static final String f10610d = "ro.miui.internal.storage";

    /* renamed from: a */
    public static boolean m10705a(String... strArr) {
        try {
            C3891a g = C3891a.m10687g();
            for (String str : strArr) {
                if (g.mo40143a(str) == null) {
                    return false;
                }
            }
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m10706b() {
        return m10705a("ro.miui.ui.version.code", "ro.miui.ui.version.name", "ro.miui.internal.storage");
    }

    /* renamed from: c */
    public static boolean m10707c() {
        try {
            return Build.class.getMethod("hasSmartBar", new Class[0]) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m10704a() {
        return m10705a("ro.build.version.emui");
    }

    /* renamed from: a */
    public static Class<?> m10703a(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
