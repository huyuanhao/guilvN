package com.p118pd.sdk;

import java.lang.reflect.Field;
import p293rx.internal.util.SuppressAnimalSniffer;
import sun.misc.Unsafe;

@SuppressAnimalSniffer
/* renamed from: com.pd.sdk.丨11LI1丨  reason: invalid class name */
public final class C11LI1 {
    public static final Unsafe OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final boolean f22720OooO00o = (System.getProperty("rx.unsafe-disable") != null);

    static {
        Unsafe unsafe = null;
        try {
            Field declaredField = Unsafe.class.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            unsafe = (Unsafe) declaredField.get(null);
        } catch (Throwable unused) {
        }
        OooO00o = unsafe;
    }

    public C11LI1() {
        throw new IllegalStateException("No instances!");
    }

    public static boolean OooO00o() {
        return OooO00o != null && !f22720OooO00o;
    }

    public static int OooO0O0(Object obj, long j, int i) {
        int intVolatile;
        do {
            intVolatile = OooO00o.getIntVolatile(obj, j);
        } while (!OooO00o.compareAndSwapInt(obj, j, intVolatile, i));
        return intVolatile;
    }

    public static int OooO00o(Object obj, long j) {
        int intVolatile;
        do {
            intVolatile = OooO00o.getIntVolatile(obj, j);
        } while (!OooO00o.compareAndSwapInt(obj, j, intVolatile, intVolatile + 1));
        return intVolatile;
    }

    public static int OooO00o(Object obj, long j, int i) {
        int intVolatile;
        do {
            intVolatile = OooO00o.getIntVolatile(obj, j);
        } while (!OooO00o.compareAndSwapInt(obj, j, intVolatile, intVolatile + i));
        return intVolatile;
    }

    public static boolean OooO00o(Object obj, long j, int i, int i2) {
        return OooO00o.compareAndSwapInt(obj, j, i, i2);
    }

    public static long OooO00o(Class<?> cls, String str) {
        try {
            return OooO00o.objectFieldOffset(cls.getDeclaredField(str));
        } catch (NoSuchFieldException e) {
            InternalError internalError = new InternalError();
            internalError.initCause(e);
            throw internalError;
        }
    }
}
