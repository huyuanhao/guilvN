package com.p273uc.crashsdk;

import android.os.Looper;
import android.os.Process;
import com.p118pd.sdk.C9090ooOooo0O;
import com.p118pd.sdk.C9111oooO0000;
import com.p118pd.sdk.C9112oooO000O;
import com.p118pd.sdk.C9113oooO000o;
import com.p118pd.sdk.C9119oooO00o0;
import com.p118pd.sdk.C9120oooO00oO;
import com.p118pd.sdk.C9142oooO0oO0;
import com.p118pd.sdk.C9146oooO0oo0;
import com.p118pd.sdk.C9264ooooOOOo;
import com.p118pd.sdk.C9278ooooo0;
import com.p118pd.sdk.RunnableC9106ooo0oooo;
import java.io.File;
import java.util.Locale;

/* renamed from: com.uc.crashsdk.JNIBridge */
public class JNIBridge {
    public static String OooO00o(int i, long j, Object[] objArr) {
        switch (i) {
            case 1:
                return String.valueOf(Runtime.getRuntime().maxMemory());
            case 2:
                return C9278ooooo0.OooO0o0();
            case 3:
                if (objArr == null || objArr.length != 2 || !(objArr[0] instanceof String) || !(objArr[1] instanceof String)) {
                    return null;
                }
                return C9278ooooo0.OooO00o((String) objArr[0], (String) objArr[1]);
            case 4:
                return C9278ooooo0.OooO0oo();
            case 5:
                C9119oooO00o0.OooO00o(true);
                break;
            case 6:
                return C9111oooO0000.OooO0OO();
            case 7:
                C9146oooO0oo0.OooO00o(2, new RunnableC9106ooo0oooo(102), 8000);
                C9278ooooo0.OooOOo();
                break;
        }
        return null;
    }

    public static long OooO0O0(int i, String str) {
        return nativeSet(i, 0, str, null);
    }

    public static native boolean nativeAddCachedInfo(String str, String str2);

    public static native int nativeAddCallbackInfo(String str, int i, long j, int i2);

    public static native int nativeAddDumpFile(String str, String str2, boolean z, boolean z2, int i, boolean z3);

    public static native void nativeAddHeaderInfo(String str, String str2);

    public static native boolean nativeChangeState(String str, String str2, boolean z);

    public static native void nativeClientCloseConnection(long j);

    public static native long nativeClientCreateConnection(String str, String str2, String str3, int i);

    public static native int nativeClientWriteData(long j, String str);

    public static native void nativeCloseFile(int i);

    public static native long nativeCmd(int i, long j, String str, Object[] objArr);

    public static native void nativeCrash(int i, int i2);

    public static native int nativeCreateCachedInfo(String str, int i, int i2);

    public static native String nativeDumpThreads(String str, long j);

    public static native int nativeGenerateUnexpLog(long j, int i);

    public static native String nativeGet(int i, long j, String str);

    public static native String nativeGetCallbackInfo(String str, long j, int i, boolean z);

    public static native boolean nativeIsCrashing();

    public static native boolean nativeLockFile(int i, boolean z);

    public static native int nativeLog(int i, String str, String str2);

    public static native int nativeOpenFile(String str);

    public static native long nativeSet(int i, long j, String str, Object[] objArr);

    public static native void nativeSetForeground(boolean z);

    public static String OooO00o(String str, boolean z) {
        return C9119oooO00o0.OooO00o(str, z);
    }

    public static String OooO00o(Thread thread, int i) {
        if (i != 0 && i == Process.myPid()) {
            thread = Looper.getMainLooper().getThread();
        }
        if (thread != null) {
            return C9278ooooo0.OooO00o(thread.getStackTrace(), "getJavaStackTrace").toString();
        }
        return null;
    }

    public static void OooO00o(String str, String str2, String str3, boolean z) {
        boolean equals = C9278ooooo0.OooO().equals(str2);
        boolean equals2 = C9264ooooOOOo.f22646OooO00o.equals(str3);
        if (!C9278ooooo0.m21180OooO00o()) {
            if (equals && equals2) {
                try {
                    C9142oooO0oO0.m20881OooO00o(true);
                } catch (Throwable th) {
                    C9111oooO0000.OooO00o(th);
                }
            }
            str = C9278ooooo0.m21169OooO00o(str);
        }
        C9113oooO000o.OooO00o(str, str2, str3);
        if (!C9278ooooo0.m21180OooO00o()) {
            if (z || (!equals && C9120oooO00oO.m20872OooOOO())) {
                C9278ooooo0.m21185OooO00o(false, false);
            } else if (equals) {
                C9278ooooo0.OooO0O0(equals2);
            }
        }
    }

    public static void OooO00o() {
        C9113oooO000o.OooO00o(false);
        C9112oooO000O.m20813OooO0Oo();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m21973OooO00o(String str, String str2) {
        C9119oooO00o0.m20836OooO00o(str, str2);
    }

    public static int OooO00o(String str, int i) {
        return C9119oooO00o0.OooO00o(i, str);
    }

    public static int OooO00o(String str, int i, long j, int i2) {
        return C9119oooO00o0.OooO00o(str, i, null, j, i2);
    }

    public static int OooO00o(String str, String str2, boolean z, boolean z2, int i, boolean z3) {
        return C9119oooO00o0.OooO00o(str, str2, z, z2, i, z3);
    }

    public static int OooO00o(String str, int i, int i2) {
        return C9119oooO00o0.OooO00o(str, i, i2);
    }

    public static int OooO00o(String str, String str2) {
        return C9119oooO00o0.OooO00o(str, str2);
    }

    public static boolean OooO00o(String str, String str2, long j, String str3, String str4, String str5, String str6) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        return C9278ooooo0.OooO00o(stringBuffer, str2, j, C9119oooO00o0.m20834OooO00o(str3), C9119oooO00o0.m20834OooO00o(str4), C9119oooO00o0.m20834OooO00o(str5), str6);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m21972OooO00o(String str, int i, int i2) {
        String str2 = "onKillProcess. SIG: " + i2;
        if (C9278ooooo0.m21201OooO0oO()) {
            C9090ooOooo0O.OooO0O0("crashsdk", str2);
        } else {
            C9090ooOooo0O.OooO00o("crashsdk", str2);
        }
        StringBuilder OooO00o = C9278ooooo0.m21171OooO00o("onKillProcess");
        OooO00o.insert(0, String.format(Locale.US, "State in disk: '%s'\n", C9112oooO000O.OooOOo0()));
        OooO00o.insert(0, String.format(Locale.US, "SIG: %d, fg: %s, exiting: %s, main process: %s, time: %s\n", Integer.valueOf(i2), Boolean.valueOf(C9112oooO000O.OooOo0()), Boolean.valueOf(C9112oooO000O.m20829OooOOOo()), Boolean.valueOf(C9112oooO000O.m20802OooO00o()), C9278ooooo0.OooOO0O()));
        OooO00o.insert(0, String.format(Locale.US, "Kill PID: %d (%s) by pid: %d (%s) tid: %d (%s)\n", Integer.valueOf(i), C9278ooooo0.OooO00o(i), Integer.valueOf(Process.myPid()), C9278ooooo0.OooO00o(Process.myPid()), Integer.valueOf(Process.myTid()), Thread.currentThread().getName()));
        String sb = OooO00o.toString();
        if (C9278ooooo0.m21201OooO0oO()) {
            C9090ooOooo0O.OooO0O0("crashsdk", sb);
        } else {
            C9090ooOooo0O.OooO00o("crashsdk", sb);
        }
        if (!C9112oooO000O.m20811OooO0OO()) {
            C9111oooO0000.OooO00o(new File(str), sb.getBytes());
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m21971OooO00o(int i, String str) {
        boolean equals = "$all$".equals(str);
        if (i == 1) {
            if (equals) {
                return C9119oooO00o0.OooO0O0();
            }
            return C9119oooO00o0.OooO00o(str);
        } else if (i == 2) {
            if (equals) {
                return C9119oooO00o0.OooO0OO();
            }
            return C9119oooO00o0.OooO00o(str, true);
        } else if (i == 3) {
            if (equals) {
                return C9119oooO00o0.OooO0Oo();
            }
            return C9119oooO00o0.OooO0O0(str);
        } else if (i == 4) {
            return C9278ooooo0.m21183OooO00o(str) ? "1" : "0";
        } else {
            return null;
        }
    }

    public static int OooO00o(String str, String str2, boolean z) {
        C9120oooO00oO.m20851OooO0O0();
        C9278ooooo0.m21179OooO00o(false);
        if (C9278ooooo0.m21184OooO00o(str, str2, z)) {
            return 0;
        }
        C9278ooooo0.OooO00o(str, str2, z);
        return 1;
    }

    public static long OooO00o(int i, boolean z) {
        return nativeSet(i, z ? 1 : 0, null, null);
    }

    public static long OooO00o(int i, long j) {
        return nativeSet(i, j, null, null);
    }

    public static long OooO00o(int i) {
        return nativeCmd(i, 0, null, null);
    }

    public static long OooO00o(int i, String str) {
        return nativeCmd(i, 0, str, null);
    }
}
