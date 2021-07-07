package com.p118pd.sdk;

import java.util.Arrays;
import java.util.List;
import kotlin.KotlinNullPointerException;
import kotlin.SinceKotlin;
import kotlin.UninitializedPropertyAccessException;

/* renamed from: com.pd.sdk.o0O0OO00 */
public class o0O0OO00 {
    public static void OooO(String str) {
        throw ((UninitializedPropertyAccessException) OooO00o((Throwable) new UninitializedPropertyAccessException(str)));
    }

    public static int OooO00o(int i, int i2) {
        if (i < i2) {
            return -1;
        }
        return i == i2 ? 0 : 1;
    }

    public static int OooO00o(long j, long j2) {
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static String OooO00o(String str, Object obj) {
        return str + obj;
    }

    public static void OooO0O0() {
        throw ((AssertionError) OooO00o((Throwable) new AssertionError()));
    }

    public static void OooO0OO(Object obj, String str) {
        if (obj == null) {
            OooO0o(str);
        }
    }

    public static void OooO0Oo(String str) {
        throw ((IllegalArgumentException) OooO00o((Throwable) new IllegalArgumentException(str)));
    }

    public static void OooO0o(String str) {
        throw ((KotlinNullPointerException) OooO00o((Throwable) new KotlinNullPointerException(str)));
    }

    public static void OooO0o0() {
        throw ((KotlinNullPointerException) OooO00o((Throwable) new KotlinNullPointerException()));
    }

    public static void OooO0oO(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) OooO00o((Throwable) new IllegalStateException(str)));
        }
    }

    public static void OooO0oo(String str) {
        throw new UnsupportedOperationException(str);
    }

    public static void OooOO0(String str) {
        OooO("lateinit property " + str + " has not been initialized");
    }

    public static void OooO00o(Object obj) {
        if (obj == null) {
            OooO0o0();
        }
    }

    public static void OooO0O0(Object obj, String str, String str2) {
        if (obj == null) {
            throw ((IllegalStateException) OooO00o((Throwable) new IllegalStateException("Method specified as non-null returned null: " + str + C9058ooOoOoOO.OooOO0 + str2)));
        }
    }

    public static void OooO0OO(String str) {
        throw ((AssertionError) OooO00o((Throwable) new AssertionError(str)));
    }

    public static void OooO0Oo() {
        throw ((IllegalStateException) OooO00o((Throwable) new IllegalStateException()));
    }

    public static void OooO0o(Object obj, String str) {
        if (obj == null) {
            OooO0oO(str);
        }
    }

    public static void OooO0o0(String str) {
        throw ((IllegalStateException) OooO00o((Throwable) new IllegalStateException(str)));
    }

    public static void OooO0oO(String str) {
        StackTraceElement stackTraceElement = Thread.currentThread().getStackTrace()[3];
        String className = stackTraceElement.getClassName();
        String methodName = stackTraceElement.getMethodName();
        throw ((IllegalArgumentException) OooO00o((Throwable) new IllegalArgumentException("Parameter specified as non-null is null: method " + className + C9058ooOoOoOO.OooOO0 + methodName + ", parameter " + str)));
    }

    public static void OooO00o(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) OooO00o((Throwable) new IllegalStateException(str + " must not be null")));
        }
    }

    public static void OooO0O0(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) OooO00o((Throwable) new IllegalStateException(str)));
        }
    }

    public static void OooO0OO() {
        throw ((IllegalArgumentException) OooO00o((Throwable) new IllegalArgumentException()));
    }

    public static void OooO0Oo(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalStateException) OooO00o((Throwable) new IllegalStateException(str)));
        }
    }

    public static void OooO0o() {
        OooO0oo("This function has a reified type parameter and thus can only be inlined at compilation time, not called directly.");
    }

    public static void OooO0o0(Object obj, String str) {
        if (obj == null) {
            throw ((IllegalArgumentException) OooO00o((Throwable) new IllegalArgumentException(str)));
        }
    }

    public static void OooO00o(Object obj, String str, String str2) {
        if (obj == null) {
            throw ((IllegalStateException) OooO00o((Throwable) new IllegalStateException("Field specified as non-null is null: " + str + C9058ooOoOoOO.OooOO0 + str2)));
        }
    }

    public static void OooO0O0(String str) {
        OooO0oo(str);
    }

    public static boolean OooO00o(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    @SinceKotlin(version = "1.1")
    public static boolean OooO00o(Double d, Double d2) {
        if (d != null) {
            return d2 != null && d.doubleValue() == d2.doubleValue();
        }
        if (d2 == null) {
            return true;
        }
    }

    @SinceKotlin(version = "1.1")
    public static boolean OooO00o(Double d, double d2) {
        return d != null && d.doubleValue() == d2;
    }

    @SinceKotlin(version = "1.1")
    public static boolean OooO00o(double d, Double d2) {
        return d2 != null && d == d2.doubleValue();
    }

    @SinceKotlin(version = "1.1")
    public static boolean OooO00o(Float f, Float f2) {
        if (f != null) {
            return f2 != null && f.floatValue() == f2.floatValue();
        }
        if (f2 == null) {
            return true;
        }
    }

    @SinceKotlin(version = "1.1")
    public static boolean OooO00o(Float f, float f2) {
        return f != null && f.floatValue() == f2;
    }

    @SinceKotlin(version = "1.1")
    public static boolean OooO00o(float f, Float f2) {
        return f2 != null && f == f2.floatValue();
    }

    public static void OooO00o(int i, String str) {
        OooO0o();
    }

    public static void OooO00o(int i, String str, String str2) {
        OooO0oo(str2);
    }

    public static void OooO00o() {
        OooO0o();
    }

    public static void OooO00o(String str) throws ClassNotFoundException {
        String replace = str.replace('/', '.');
        try {
            Class.forName(replace);
        } catch (ClassNotFoundException e) {
            throw ((ClassNotFoundException) OooO00o((Throwable) new ClassNotFoundException("Class " + replace + " is not found. Please update the Kotlin runtime to the latest version", e)));
        }
    }

    public static void OooO00o(String str, String str2) throws ClassNotFoundException {
        String replace = str.replace('/', '.');
        try {
            Class.forName(replace);
        } catch (ClassNotFoundException e) {
            throw ((ClassNotFoundException) OooO00o((Throwable) new ClassNotFoundException("Class " + replace + " is not found: this code requires the Kotlin runtime of version at least " + str2, e)));
        }
    }

    public static <T extends Throwable> T OooO00o(T t) {
        return (T) OooO00o((Throwable) t, o0O0OO00.class.getName());
    }

    public static <T extends Throwable> T OooO00o(T t, String str) {
        StackTraceElement[] stackTrace = t.getStackTrace();
        int length = stackTrace.length;
        int i = -1;
        for (int i2 = 0; i2 < length; i2++) {
            if (str.equals(stackTrace[i2].getClassName())) {
                i = i2;
            }
        }
        List subList = Arrays.asList(stackTrace).subList(i + 1, length);
        t.setStackTrace((StackTraceElement[]) subList.toArray(new StackTraceElement[subList.size()]));
        return t;
    }
}
