package com.huawei.hianalytics.util;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.p118pd.sdk.AbstractC8536oo00OO0O;
import com.p118pd.sdk.C8589oo0O000O;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.huawei.hianalytics.util.e */
public class C1105e {

    /* renamed from: com.huawei.hianalytics.util.e$a */
    public static class C1106a extends Exception {
        public C1106a(String str) {
            super(str);
        }
    }

    public static Object OooO00o(Class cls, String str, Class[] clsArr, Object[] objArr) {
        String str2;
        if (cls != null) {
            if (clsArr == null) {
                if (objArr != null) {
                    throw new C1106a("paramsType is null, but params is not null");
                }
            } else if (objArr == null) {
                throw new C1106a("paramsType or params should be same");
            } else if (clsArr.length != objArr.length) {
                throw new C1106a("paramsType len:" + clsArr.length + " should equal params.len:" + objArr.length);
            }
            try {
                try {
                    return cls.getMethod(str, clsArr).invoke(null, objArr);
                } catch (IllegalAccessException unused) {
                    str2 = "invokeStaticFun(): method invoke Exception!";
                    AbstractC8536oo00OO0O.OooO0OO("globalStreamUtil", str2);
                    return null;
                } catch (IllegalArgumentException unused2) {
                    str2 = "invokeStaticFun(): Illegal Argument!";
                    AbstractC8536oo00OO0O.OooO0OO("globalStreamUtil", str2);
                    return null;
                } catch (InvocationTargetException unused3) {
                    str2 = "invokeStaticFun(): Invocation Target Exception!";
                    AbstractC8536oo00OO0O.OooO0OO("globalStreamUtil", str2);
                    return null;
                }
            } catch (NoSuchMethodException unused4) {
                AbstractC8536oo00OO0O.OooO0OO("globalStreamUtil", "invokeStaticFun(): cls.getMethod(),No Such Method !");
                return null;
            }
        } else {
            throw new C1106a("class is null in invokeStaticFun");
        }
    }

    public static Object OooO00o(String str, String str2, Class[] clsArr, Object[] objArr) {
        String str3;
        try {
            return OooO00o(Class.forName(str), str2, clsArr, objArr);
        } catch (ClassNotFoundException unused) {
            str3 = "invokeStaticFun() Not found class!";
            AbstractC8536oo00OO0O.OooO0OO("globalStreamUtil", str3);
            return null;
        } catch (C1106a unused2) {
            str3 = "invokeStaticFun(): Static function call Exception ";
            AbstractC8536oo00OO0O.OooO0OO("globalStreamUtil", str3);
            return null;
        }
    }

    public static String OooO00o(InputStream inputStream, int i) {
        C8589oo0O000O oo0o000o = new C8589oo0O000O(i);
        byte[] bArr = new byte[i];
        while (true) {
            int read = inputStream.read(bArr);
            if (((long) read) == -1) {
                break;
            }
            oo0o000o.OooO00o(bArr, read);
        }
        return oo0o000o.OooO00o() == 0 ? "" : new String(oo0o000o.m20236OooO00o(), "UTF-8");
    }

    public static String OooO00o(String str, String str2) {
        return OooO0O0(str, str2);
    }

    public static String OooO00o(String str, String str2, String str3) {
        Object OooO00o = OooO00o(str, "get", new Class[]{String.class, String.class}, new Object[]{str2, str3});
        return OooO00o != null ? (String) OooO00o : str3;
    }

    public static void OooO00o(int i, Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
                AbstractC8536oo00OO0O.OooO0OO("globalStreamUtil", "closeQuietly(): Exception when closing the closeable!");
            }
        }
    }

    public static boolean OooO00o(Context context, String str) {
        if (context == null) {
            return true;
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (context.getPackageManager().checkPermission(str, context.getPackageName()) == 0) {
                return false;
            }
            AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "not have read phone permission!");
            return true;
        } else if (context.checkSelfPermission(str) == 0) {
            return false;
        } else {
            AbstractC8536oo00OO0O.OooO0OO("HianalyticsSDK", "not have read phone permission!");
            return true;
        }
    }

    public static String OooO0O0(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        String OooO00o = OooO00o("android.os.SystemProperties", str, str2);
        return TextUtils.isEmpty(OooO00o) ? OooO00o("com.huawei.android.os.SystemPropertiesEx", str, str2) : OooO00o;
    }
}
