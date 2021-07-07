package com.vivo.push.util;

import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.android.agoo.common.AgooConstants;

/* renamed from: com.vivo.push.util.k */
public final class C4141k {

    /* renamed from: a */
    public static final boolean f11104a = C4156z.m11267b("ro.vivo.product.overseas", "no").equals("yes");

    /* renamed from: b */
    public static final String f11105b;

    /* renamed from: c */
    public static final boolean f11106c;

    /* renamed from: d */
    public static final boolean f11107d = "IN".equals(f11105b);

    /* renamed from: e */
    public static final boolean f11108e = m11175b("rom_1.0");

    /* renamed from: f */
    public static final boolean f11109f = m11175b("rom_2.0");

    /* renamed from: g */
    public static final boolean f11110g = m11175b("rom_2.5");

    /* renamed from: h */
    public static final boolean f11111h = m11175b("rom_3.0");

    /* renamed from: i */
    public static Method f11112i;

    /* renamed from: j */
    public static String f11113j = null;

    /* renamed from: k */
    public static String f11114k = null;

    /* renamed from: l */
    public static String f11115l = "";

    /* renamed from: m */
    public static String f11116m = "";

    static {
        String str;
        if (Build.VERSION.SDK_INT >= 26) {
            str = C4156z.m11267b("ro.product.country.region", "N");
        } else {
            str = C4156z.m11267b("ro.product.customize.bbk", "N");
        }
        f11105b = str;
        f11106c = "RU".equals(str);
    }

    /* renamed from: a */
    public static synchronized String m11172a() {
        synchronized (C4141k.class) {
            if (f11113j == null && f11114k == null) {
                try {
                    Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class, String.class);
                    f11112i = declaredMethod;
                    declaredMethod.setAccessible(true);
                    f11113j = (String) f11112i.invoke(null, "ro.vivo.rom", "@><@");
                    f11114k = (String) f11112i.invoke(null, "ro.vivo.rom.version", "@><@");
                } catch (Exception unused) {
                    C4146p.m11211b("Device", "getRomCode error");
                }
            }
            C4146p.m11216d("Device", "sRomProperty1 : " + f11113j + " ; sRomProperty2 : " + f11114k);
            String a = m11173a(f11113j);
            if (!TextUtils.isEmpty(a)) {
                return a;
            }
            String a2 = m11173a(f11114k);
            if (!TextUtils.isEmpty(a2)) {
                return a2;
            }
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m11175b(String str) {
        String b = C4156z.m11267b("ro.vivo.rom", "");
        String b2 = C4156z.m11267b("ro.vivo.rom.version", "");
        C4146p.m11216d("Device", "ro.vivo.rom = " + b + " ; ro.vivo.rom.version = " + b2);
        if (b == null || !b.contains(str)) {
            return b2 != null && b2.contains(str);
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m11174b() {
        if (TextUtils.isEmpty(Build.MANUFACTURER)) {
            C4146p.m11216d("Device", "Build.MANUFACTURER is null");
            return false;
        }
        C4146p.m11216d("Device", "Build.MANUFACTURER is " + Build.MANUFACTURER);
        if (Build.MANUFACTURER.toLowerCase().contains("bbk") || Build.MANUFACTURER.toLowerCase().startsWith(AgooConstants.MESSAGE_SYSTEM_SOURCE_VIVO)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m11173a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Matcher matcher = Pattern.compile("rom_([\\d]*).?([\\d]*)", 2).matcher(str);
        if (!matcher.find()) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(matcher.group(1));
        sb.append(TextUtils.isEmpty(matcher.group(2)) ? "0" : matcher.group(2).substring(0, 1));
        return sb.toString();
    }
}
