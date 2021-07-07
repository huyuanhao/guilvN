package com.google.android.gms.internal.firebase_ml;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

public final class zzlb {
    @NullableDecl
    public static final Object zzacs;
    @NullableDecl
    public static final Method zzact;
    @NullableDecl
    public static final Method zzacu;

    static {
        Method method;
        Object zzih = zzih();
        zzacs = zzih;
        Method method2 = null;
        if (zzih == null) {
            method = null;
        } else {
            method = zza("getStackTraceElement", Throwable.class, Integer.TYPE);
        }
        zzact = method;
        if (zzacs != null) {
            method2 = zzii();
        }
        zzacu = method2;
    }

    @Deprecated
    public static RuntimeException zza(Throwable th) {
        zzks.checkNotNull(th);
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        } else {
            throw new RuntimeException(th);
        }
    }

    @NullableDecl
    public static Object zzih() {
        try {
            return Class.forName("sun.misc.SharedSecrets", false, null).getMethod("getJavaLangAccess", new Class[0]).invoke(null, new Object[0]);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }

    @NullableDecl
    public static Method zzii() {
        try {
            Method zza = zza("getStackTraceDepth", Throwable.class);
            if (zza == null) {
                return null;
            }
            zza.invoke(zzih(), new Throwable());
            return zza;
        } catch (IllegalAccessException | UnsupportedOperationException | InvocationTargetException unused) {
            return null;
        }
    }

    @NullableDecl
    public static Method zza(String str, Class<?>... clsArr) throws ThreadDeath {
        try {
            return Class.forName("sun.misc.JavaLangAccess", false, null).getMethod(str, clsArr);
        } catch (ThreadDeath e) {
            throw e;
        } catch (Throwable unused) {
            return null;
        }
    }
}
