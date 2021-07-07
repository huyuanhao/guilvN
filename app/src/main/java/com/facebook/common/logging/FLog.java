package com.facebook.common.logging;

public class FLog {
    public static final int ASSERT = 7;
    public static final int DEBUG = 3;
    public static final int ERROR = 6;
    public static final int INFO = 4;
    public static final int VERBOSE = 2;
    public static final int WARN = 5;
    public static LoggingDelegate sHandler = FLogDefaultLoggingDelegate.getInstance();

    /* renamed from: d */
    public static void m861d(String str, String str2) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo5137d(str, str2);
        }
    }

    /* renamed from: e */
    public static void m873e(String str, String str2) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo5139e(str, str2);
        }
    }

    public static String formatString(String str, Object... objArr) {
        return String.format(null, str, objArr);
    }

    public static int getMinimumLoggingLevel() {
        return sHandler.getMinimumLoggingLevel();
    }

    public static String getTag(Class<?> cls) {
        return cls.getSimpleName();
    }

    /* renamed from: i */
    public static void m885i(String str, String str2) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo5142i(str, str2);
        }
    }

    public static boolean isLoggable(int i) {
        return sHandler.isLoggable(i);
    }

    public static void setLoggingDelegate(LoggingDelegate loggingDelegate) {
        if (loggingDelegate != null) {
            sHandler = loggingDelegate;
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void setMinimumLoggingLevel(int i) {
        sHandler.setMinimumLoggingLevel(i);
    }

    /* renamed from: v */
    public static void m901v(String str, String str2) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo5148v(str, str2);
        }
    }

    /* renamed from: w */
    public static void m913w(String str, String str2) {
        if (sHandler.isLoggable(5)) {
            sHandler.mo5150w(str, str2);
        }
    }

    public static void wtf(String str, String str2) {
        if (sHandler.isLoggable(6)) {
            sHandler.wtf(str, str2);
        }
    }

    /* renamed from: d */
    public static void m862d(String str, String str2, Object obj) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo5137d(str, formatString(str2, obj));
        }
    }

    /* renamed from: e */
    public static void m869e(Class<?> cls, String str) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo5139e(getTag(cls), str);
        }
    }

    /* renamed from: i */
    public static void m886i(String str, String str2, Object obj) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo5142i(str, formatString(str2, obj));
        }
    }

    /* renamed from: v */
    public static void m902v(String str, String str2, Object obj) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo5148v(str, formatString(str2, obj));
        }
    }

    /* renamed from: w */
    public static void m909w(Class<?> cls, String str) {
        if (sHandler.isLoggable(5)) {
            sHandler.mo5150w(getTag(cls), str);
        }
    }

    public static void wtf(Class<?> cls, String str) {
        if (sHandler.isLoggable(6)) {
            sHandler.wtf(getTag(cls), str);
        }
    }

    /* renamed from: d */
    public static void m863d(String str, String str2, Object obj, Object obj2) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo5137d(str, formatString(str2, obj, obj2));
        }
    }

    /* renamed from: e */
    public static void m875e(String str, String str2, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo5139e(str, formatString(str2, objArr));
        }
    }

    /* renamed from: i */
    public static void m887i(String str, String str2, Object obj, Object obj2) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo5142i(str, formatString(str2, obj, obj2));
        }
    }

    /* renamed from: v */
    public static void m903v(String str, String str2, Object obj, Object obj2) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo5148v(str, formatString(str2, obj, obj2));
        }
    }

    /* renamed from: w */
    public static void m915w(String str, String str2, Object... objArr) {
        if (sHandler.isLoggable(5)) {
            sHandler.mo5150w(str, formatString(str2, objArr));
        }
    }

    public static void wtf(String str, String str2, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.wtf(str, formatString(str2, objArr));
        }
    }

    /* renamed from: d */
    public static void m864d(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo5137d(str, formatString(str2, obj, obj2, obj3));
        }
    }

    /* renamed from: e */
    public static void m876e(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo5140e(str, formatString(str2, objArr), th);
        }
    }

    /* renamed from: i */
    public static void m888i(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo5142i(str, formatString(str2, obj, obj2, obj3));
        }
    }

    /* renamed from: v */
    public static void m904v(String str, String str2, Object obj, Object obj2, Object obj3) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo5148v(str, formatString(str2, obj, obj2, obj3));
        }
    }

    /* renamed from: w */
    public static void m916w(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.isLoggable(5)) {
            sHandler.mo5151w(str, formatString(str2, objArr), th);
        }
    }

    public static void wtf(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.wtf(str, formatString(str2, objArr), th);
        }
    }

    /* renamed from: d */
    public static void m865d(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo5137d(str, formatString(str2, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: e */
    public static void m871e(Class<?> cls, String str, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo5139e(getTag(cls), formatString(str, objArr));
        }
    }

    /* renamed from: i */
    public static void m889i(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo5142i(str, formatString(str2, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: v */
    public static void m905v(String str, String str2, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo5148v(str, formatString(str2, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: w */
    public static void m911w(Class<?> cls, String str, Object... objArr) {
        if (sHandler.isLoggable(5)) {
            sHandler.mo5150w(getTag(cls), formatString(str, objArr));
        }
    }

    public static void wtf(Class<?> cls, String str, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.wtf(getTag(cls), formatString(str, objArr));
        }
    }

    /* renamed from: d */
    public static void m853d(Class<?> cls, String str) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo5137d(getTag(cls), str);
        }
    }

    /* renamed from: e */
    public static void m872e(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo5140e(getTag(cls), formatString(str, objArr), th);
        }
    }

    /* renamed from: i */
    public static void m877i(Class<?> cls, String str) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo5142i(getTag(cls), str);
        }
    }

    /* renamed from: v */
    public static void m893v(Class<?> cls, String str) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo5148v(getTag(cls), str);
        }
    }

    /* renamed from: w */
    public static void m912w(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (isLoggable(5)) {
            m910w(cls, formatString(str, objArr), th);
        }
    }

    public static void wtf(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (sHandler.isLoggable(6)) {
            sHandler.wtf(getTag(cls), formatString(str, objArr), th);
        }
    }

    /* renamed from: d */
    public static void m854d(Class<?> cls, String str, Object obj) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo5137d(getTag(cls), formatString(str, obj));
        }
    }

    /* renamed from: e */
    public static void m874e(String str, String str2, Throwable th) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo5140e(str, str2, th);
        }
    }

    /* renamed from: i */
    public static void m878i(Class<?> cls, String str, Object obj) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo5142i(getTag(cls), formatString(str, obj));
        }
    }

    /* renamed from: v */
    public static void m894v(Class<?> cls, String str, Object obj) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo5148v(getTag(cls), formatString(str, obj));
        }
    }

    /* renamed from: w */
    public static void m914w(String str, String str2, Throwable th) {
        if (sHandler.isLoggable(5)) {
            sHandler.mo5151w(str, str2, th);
        }
    }

    public static void wtf(String str, String str2, Throwable th) {
        if (sHandler.isLoggable(6)) {
            sHandler.wtf(str, str2, th);
        }
    }

    /* renamed from: d */
    public static void m855d(Class<?> cls, String str, Object obj, Object obj2) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo5137d(getTag(cls), formatString(str, obj, obj2));
        }
    }

    /* renamed from: e */
    public static void m870e(Class<?> cls, String str, Throwable th) {
        if (sHandler.isLoggable(6)) {
            sHandler.mo5140e(getTag(cls), str, th);
        }
    }

    /* renamed from: i */
    public static void m879i(Class<?> cls, String str, Object obj, Object obj2) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo5142i(getTag(cls), formatString(str, obj, obj2));
        }
    }

    /* renamed from: v */
    public static void m895v(Class<?> cls, String str, Object obj, Object obj2) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo5148v(getTag(cls), formatString(str, obj, obj2));
        }
    }

    /* renamed from: w */
    public static void m910w(Class<?> cls, String str, Throwable th) {
        if (sHandler.isLoggable(5)) {
            sHandler.mo5151w(getTag(cls), str, th);
        }
    }

    public static void wtf(Class<?> cls, String str, Throwable th) {
        if (sHandler.isLoggable(6)) {
            sHandler.wtf(getTag(cls), str, th);
        }
    }

    /* renamed from: d */
    public static void m856d(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo5137d(getTag(cls), formatString(str, obj, obj2, obj3));
        }
    }

    /* renamed from: i */
    public static void m880i(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo5142i(getTag(cls), formatString(str, obj, obj2, obj3));
        }
    }

    /* renamed from: v */
    public static void m896v(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        if (isLoggable(2)) {
            m893v(cls, formatString(str, obj, obj2, obj3));
        }
    }

    /* renamed from: d */
    public static void m857d(Class<?> cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo5137d(getTag(cls), formatString(str, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: i */
    public static void m881i(Class<?> cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo5142i(getTag(cls), formatString(str, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: v */
    public static void m897v(Class<?> cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo5148v(getTag(cls), formatString(str, obj, obj2, obj3, obj4));
        }
    }

    /* renamed from: d */
    public static void m867d(String str, String str2, Object... objArr) {
        if (sHandler.isLoggable(3)) {
            m861d(str, formatString(str2, objArr));
        }
    }

    /* renamed from: i */
    public static void m891i(String str, String str2, Object... objArr) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo5142i(str, formatString(str2, objArr));
        }
    }

    /* renamed from: v */
    public static void m907v(String str, String str2, Object... objArr) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo5148v(str, formatString(str2, objArr));
        }
    }

    /* renamed from: d */
    public static void m868d(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.isLoggable(3)) {
            m866d(str, formatString(str2, objArr), th);
        }
    }

    /* renamed from: i */
    public static void m892i(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo5143i(str, formatString(str2, objArr), th);
        }
    }

    /* renamed from: v */
    public static void m908v(String str, Throwable th, String str2, Object... objArr) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo5149v(str, formatString(str2, objArr), th);
        }
    }

    /* renamed from: d */
    public static void m859d(Class<?> cls, String str, Object... objArr) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo5137d(getTag(cls), formatString(str, objArr));
        }
    }

    /* renamed from: i */
    public static void m883i(Class<?> cls, String str, Object... objArr) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo5142i(getTag(cls), formatString(str, objArr));
        }
    }

    /* renamed from: v */
    public static void m899v(Class<?> cls, String str, Object... objArr) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo5148v(getTag(cls), formatString(str, objArr));
        }
    }

    /* renamed from: d */
    public static void m860d(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo5138d(getTag(cls), formatString(str, objArr), th);
        }
    }

    /* renamed from: i */
    public static void m884i(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (isLoggable(4)) {
            sHandler.mo5143i(getTag(cls), formatString(str, objArr), th);
        }
    }

    /* renamed from: v */
    public static void m900v(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo5149v(getTag(cls), formatString(str, objArr), th);
        }
    }

    /* renamed from: d */
    public static void m866d(String str, String str2, Throwable th) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo5138d(str, str2, th);
        }
    }

    /* renamed from: i */
    public static void m890i(String str, String str2, Throwable th) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo5143i(str, str2, th);
        }
    }

    /* renamed from: v */
    public static void m906v(String str, String str2, Throwable th) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo5149v(str, str2, th);
        }
    }

    /* renamed from: d */
    public static void m858d(Class<?> cls, String str, Throwable th) {
        if (sHandler.isLoggable(3)) {
            sHandler.mo5138d(getTag(cls), str, th);
        }
    }

    /* renamed from: i */
    public static void m882i(Class<?> cls, String str, Throwable th) {
        if (sHandler.isLoggable(4)) {
            sHandler.mo5143i(getTag(cls), str, th);
        }
    }

    /* renamed from: v */
    public static void m898v(Class<?> cls, String str, Throwable th) {
        if (sHandler.isLoggable(2)) {
            sHandler.mo5149v(getTag(cls), str, th);
        }
    }
}
