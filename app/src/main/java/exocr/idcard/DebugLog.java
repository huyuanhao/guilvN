package exocr.idcard;

import android.util.Log;
import com.xiaomi.mipush.sdk.Constants;

public class DebugLog {
    public static int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static String f23764OooO00o;
    public static String OooO0O0;

    public static boolean OooO00o() {
        return IDCardManager.OooO00o().OooOO0o();
    }

    public static void OooO0O0(String str) {
        if (OooO00o()) {
            OooO00o(new Throwable().getStackTrace());
            OooO00o(str);
        }
    }

    public static void OooO0OO(String str) {
        if (OooO00o()) {
            OooO00o(new Throwable().getStackTrace());
            Log.i(f23764OooO00o, OooO00o(str));
        }
    }

    public static void OooO0Oo(String str) {
        if (OooO00o()) {
            OooO00o(new Throwable().getStackTrace());
            OooO00o(str);
        }
    }

    public static void OooO0o(String str) {
        if (OooO00o()) {
            OooO00o(new Throwable().getStackTrace());
            OooO00o(str);
        }
    }

    public static void OooO0o0(String str) {
        if (OooO00o()) {
            OooO00o(new Throwable().getStackTrace());
            OooO00o(str);
        }
    }

    public static String OooO00o(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[");
        stringBuffer.append(OooO0O0);
        stringBuffer.append(Constants.COLON_SEPARATOR);
        stringBuffer.append(OooO00o);
        stringBuffer.append("]");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }

    public static void OooO00o(StackTraceElement[] stackTraceElementArr) {
        f23764OooO00o = stackTraceElementArr[1].getFileName();
        OooO0O0 = stackTraceElementArr[1].getMethodName();
        OooO00o = stackTraceElementArr[1].getLineNumber();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m22048OooO00o(String str) {
        if (OooO00o()) {
            OooO00o(new Throwable().getStackTrace());
            OooO00o(str);
        }
    }
}
