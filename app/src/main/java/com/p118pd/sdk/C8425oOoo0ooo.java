package com.p118pd.sdk;

import android.util.Log;
import com.umeng.message.proguard.C3848l;

/* renamed from: com.pd.sdk.oOoo0ooo  reason: case insensitive filesystem */
public final class C8425oOoo0ooo {
    public static final int OooO00o = 4;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static OooO00o f21566OooO00o = null;
    public static final int OooO0O0 = 2;

    /* renamed from: com.pd.sdk.oOoo0ooo$OooO00o */
    public interface OooO00o {
        void OooO00o(String str, String str2);

        void OooO0O0(String str, String str2);

        void OooO0OO(String str, String str2);

        void OooO0Oo(String str, String str2);

        void OooO0o0(String str, String str2);
    }

    public static void OooO00o(OooO00o oooO00o) {
        f21566OooO00o = oooO00o;
    }

    public static void OooO0O0(String str) {
        StringBuilder sb = new StringBuilder();
        OooO00o(sb);
        sb.append(str);
        OooO00o oooO00o = f21566OooO00o;
        if (oooO00o != null) {
            oooO00o.OooO0OO("HMSAgent", sb.toString());
        } else {
            sb.toString();
        }
    }

    public static void OooO0OO(String str) {
        StringBuilder sb = new StringBuilder();
        OooO00o(sb);
        sb.append(str);
        OooO00o oooO00o = f21566OooO00o;
        if (oooO00o != null) {
            oooO00o.OooO0O0("HMSAgent", sb.toString());
        } else {
            Log.i("HMSAgent", sb.toString());
        }
    }

    public static void OooO0Oo(String str) {
        StringBuilder sb = new StringBuilder();
        OooO00o(sb);
        sb.append(str);
        OooO00o oooO00o = f21566OooO00o;
        if (oooO00o != null) {
            oooO00o.OooO0Oo("HMSAgent", sb.toString());
        } else {
            sb.toString();
        }
    }

    public static void OooO0o0(String str) {
        StringBuilder sb = new StringBuilder();
        OooO00o(sb);
        sb.append(str);
        OooO00o oooO00o = f21566OooO00o;
        if (oooO00o != null) {
            oooO00o.OooO00o("HMSAgent", sb.toString());
        } else {
            sb.toString();
        }
    }

    public static void OooO00o(String str) {
        StringBuilder sb = new StringBuilder();
        OooO00o(sb);
        sb.append(str);
        OooO00o oooO00o = f21566OooO00o;
        if (oooO00o != null) {
            oooO00o.OooO0o0("HMSAgent", sb.toString());
        } else {
            sb.toString();
        }
    }

    public static void OooO00o(StringBuilder sb) {
        int indexOf;
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        if (stackTrace != null && stackTrace.length > 4) {
            for (int min = Math.min(stackTrace.length - 1, 6); min >= 4; min--) {
                if (stackTrace[min] != null) {
                    String fileName = stackTrace[min].getFileName();
                    if (fileName != null && (indexOf = fileName.indexOf(46)) > 0) {
                        fileName = fileName.substring(0, indexOf);
                    }
                    sb.append(fileName);
                    sb.append('(');
                    sb.append(stackTrace[min].getLineNumber());
                    sb.append(C3848l.f10402t);
                    sb.append("->");
                }
            }
            sb.append(stackTrace[4].getMethodName());
        }
        sb.append('\n');
    }
}
