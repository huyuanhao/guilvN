package com.p118pd.sdk;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Process;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.pd.sdk.ooO0oOo  reason: case insensitive filesystem */
public class C8877ooO0oOo {
    public static void OooO00o(String str) throws UnsatisfiedLinkError {
        try {
            System.loadLibrary(str);
        } catch (UnsatisfiedLinkError unused) {
            String[] strArr = null;
            if (Build.VERSION.SDK_INT >= 21) {
                strArr = Build.SUPPORTED_ABIS;
            }
            if (strArr == null) {
                strArr = new String[]{Build.CPU_ABI};
            }
            boolean z = false;
            for (String str2 : strArr) {
                try {
                    System.loadLibrary(str + "_" + str2);
                    z = true;
                } catch (UnsatisfiedLinkError e) {
                    e.printStackTrace();
                }
                if (z) {
                    break;
                }
            }
            if (!z) {
                try {
                    System.loadLibrary(str + "_armeabi");
                } catch (UnsatisfiedLinkError unused2) {
                    throw new UnsatisfiedLinkError("Can not load " + str + " library. \n");
                }
            }
        }
    }

    public static void OooO00o(Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.addCategory("android.intent.category.HOME");
        intent.setFlags(CommonNetImpl.FLAG_AUTH);
        context.startActivity(intent);
        Process.killProcess(Process.myPid());
        System.exit(0);
    }

    public static String OooO00o(String str, String str2) {
        try {
            Class<?> cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", String.class, String.class).invoke(cls, str, str2);
        } catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }
}
