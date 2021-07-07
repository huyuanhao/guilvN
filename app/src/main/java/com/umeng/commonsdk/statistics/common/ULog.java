package com.umeng.commonsdk.statistics.common;

import android.text.TextUtils;
import android.util.Log;
import java.util.Formatter;
import java.util.Locale;

public class ULog {
    public static boolean DEBUG = false;
    public static final int LEVEL_DEBUG = 2;
    public static final int LEVEL_ERROR = 5;
    public static final int LEVEL_INFO = 3;
    public static final int LEVEL_VERBOSE = 1;
    public static final int LEVEL_WARN = 4;
    public static int LOG_MAXLENGTH = 2000;
    public static String TAG = "ULog";

    /* renamed from: d */
    public static void m9822d(Locale locale, String str, Object... objArr) {
        try {
            m9818d(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m9827e(th);
        }
    }

    /* renamed from: e */
    public static void m9828e(Locale locale, String str, Object... objArr) {
        try {
            m9824e(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m9827e(th);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0025 A[SYNTHETIC, Splitter:B:18:0x0025] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String getStackTrace(java.lang.Throwable r3) {
        /*
            r0 = 0
            java.io.StringWriter r1 = new java.io.StringWriter     // Catch:{ all -> 0x0022 }
            r1.<init>()     // Catch:{ all -> 0x0022 }
            java.io.PrintWriter r2 = new java.io.PrintWriter     // Catch:{ all -> 0x001f }
            r2.<init>(r1)     // Catch:{ all -> 0x001f }
            r3.printStackTrace(r2)     // Catch:{ all -> 0x0020 }
            r2.flush()     // Catch:{ all -> 0x0020 }
            r1.flush()     // Catch:{ all -> 0x0020 }
            java.lang.String r3 = r1.toString()     // Catch:{ all -> 0x0020 }
            r1.close()     // Catch:{ all -> 0x001b }
        L_0x001b:
            r2.close()
            goto L_0x0031
        L_0x001f:
            r2 = r0
        L_0x0020:
            r0 = r1
            goto L_0x0023
        L_0x0022:
            r2 = r0
        L_0x0023:
            if (r0 == 0) goto L_0x002a
            r0.close()     // Catch:{ all -> 0x0029 }
            goto L_0x002a
        L_0x0029:
        L_0x002a:
            if (r2 == 0) goto L_0x002f
            r2.close()
        L_0x002f:
            java.lang.String r3 = ""
        L_0x0031:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.common.ULog.getStackTrace(java.lang.Throwable):java.lang.String");
    }

    /* renamed from: i */
    public static void m9834i(Locale locale, String str, Object... objArr) {
        try {
            m9830i(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m9827e(th);
        }
    }

    public static void print(int i, String str, String str2, Throwable th) {
        if (!TextUtils.isEmpty(str2)) {
            int length = str2.length();
            int i2 = LOG_MAXLENGTH;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i3 >= 100) {
                    break;
                } else if (length > i2) {
                    if (i == 1) {
                        str2.substring(i4, i2);
                    } else if (i == 2) {
                        str2.substring(i4, i2);
                    } else if (i == 3) {
                        Log.i(str, str2.substring(i4, i2));
                    } else if (i == 4) {
                        str2.substring(i4, i2);
                    } else if (i == 5) {
                        str2.substring(i4, i2);
                    }
                    i3++;
                    i4 = i2;
                    i2 = LOG_MAXLENGTH + i2;
                } else if (i == 1) {
                    str2.substring(i4, length);
                } else if (i == 2) {
                    str2.substring(i4, length);
                } else if (i == 3) {
                    Log.i(str, str2.substring(i4, length));
                } else if (i == 4) {
                    str2.substring(i4, length);
                } else if (i == 5) {
                    str2.substring(i4, length);
                }
            }
        }
        if (th != null) {
            String stackTrace = getStackTrace(th);
            if (!TextUtils.isEmpty(stackTrace) && i == 3) {
                Log.i(str, stackTrace);
            }
        }
    }

    /* renamed from: v */
    public static void m9840v(Locale locale, String str, Object... objArr) {
        try {
            m9836v(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m9827e(th);
        }
    }

    /* renamed from: w */
    public static void m9846w(Locale locale, String str, Object... objArr) {
        try {
            m9842w(TAG, new Formatter(locale).format(str, objArr).toString(), (Throwable) null);
        } catch (Throwable th) {
            m9827e(th);
        }
    }

    /* renamed from: d */
    public static void m9820d(String str, Object... objArr) {
        String str2 = "";
        try {
            if (str.contains("%")) {
                m9818d(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
                return;
            }
            if (objArr != null) {
                str2 = (String) objArr[0];
            }
            m9818d(str, str2, (Throwable) null);
        } catch (Throwable th) {
            m9827e(th);
        }
    }

    /* renamed from: e */
    public static void m9826e(String str, Object... objArr) {
        String str2 = "";
        try {
            if (str.contains("%")) {
                m9824e(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
                return;
            }
            if (objArr != null) {
                str2 = (String) objArr[0];
            }
            m9824e(str, str2, (Throwable) null);
        } catch (Throwable th) {
            m9827e(th);
        }
    }

    /* renamed from: i */
    public static void m9832i(String str, Object... objArr) {
        String str2 = "";
        try {
            if (str.contains("%")) {
                m9830i(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
                return;
            }
            if (objArr != null) {
                str2 = (String) objArr[0];
            }
            m9830i(str, str2, (Throwable) null);
        } catch (Throwable th) {
            m9827e(th);
        }
    }

    /* renamed from: v */
    public static void m9838v(String str, Object... objArr) {
        String str2 = "";
        try {
            if (str.contains("%")) {
                m9836v(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
                return;
            }
            if (objArr != null) {
                str2 = (String) objArr[0];
            }
            m9836v(str, str2, (Throwable) null);
        } catch (Throwable th) {
            m9827e(th);
        }
    }

    /* renamed from: w */
    public static void m9844w(String str, Object... objArr) {
        String str2 = "";
        try {
            if (str.contains("%")) {
                m9842w(TAG, new Formatter().format(str, objArr).toString(), (Throwable) null);
                return;
            }
            if (objArr != null) {
                str2 = (String) objArr[0];
            }
            m9842w(str, str2, (Throwable) null);
        } catch (Throwable th) {
            m9827e(th);
        }
    }

    /* renamed from: d */
    public static void m9821d(Throwable th) {
        m9818d(TAG, (String) null, th);
    }

    /* renamed from: e */
    public static void m9827e(Throwable th) {
        m9824e(TAG, (String) null, th);
    }

    /* renamed from: i */
    public static void m9833i(Throwable th) {
        m9830i(TAG, (String) null, th);
    }

    /* renamed from: v */
    public static void m9839v(Throwable th) {
        m9836v(TAG, (String) null, th);
    }

    /* renamed from: w */
    public static void m9845w(Throwable th) {
        m9842w(TAG, (String) null, th);
    }

    /* renamed from: d */
    public static void m9819d(String str, Throwable th) {
        m9818d(TAG, str, th);
    }

    /* renamed from: e */
    public static void m9825e(String str, Throwable th) {
        m9824e(TAG, str, th);
    }

    /* renamed from: i */
    public static void m9831i(String str, Throwable th) {
        m9830i(TAG, str, th);
    }

    /* renamed from: v */
    public static void m9837v(String str, Throwable th) {
        m9836v(TAG, str, th);
    }

    /* renamed from: w */
    public static void m9843w(String str, Throwable th) {
        m9842w(TAG, str, th);
    }

    /* renamed from: d */
    public static void m9817d(String str) {
        m9818d(TAG, str, (Throwable) null);
    }

    /* renamed from: e */
    public static void m9823e(String str) {
        m9824e(TAG, str, (Throwable) null);
    }

    /* renamed from: i */
    public static void m9829i(String str) {
        m9830i(TAG, str, (Throwable) null);
    }

    /* renamed from: v */
    public static void m9835v(String str) {
        m9836v(TAG, str, (Throwable) null);
    }

    /* renamed from: w */
    public static void m9841w(String str) {
        m9842w(TAG, str, (Throwable) null);
    }

    /* renamed from: d */
    public static void m9818d(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(2, str, str2, th);
        }
    }

    /* renamed from: e */
    public static void m9824e(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(5, str, str2, th);
        }
    }

    /* renamed from: i */
    public static void m9830i(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(3, str, str2, th);
        }
    }

    /* renamed from: v */
    public static void m9836v(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(1, str, str2, th);
        }
    }

    /* renamed from: w */
    public static void m9842w(String str, String str2, Throwable th) {
        if (DEBUG) {
            print(4, str, str2, th);
        }
    }
}
