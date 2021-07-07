package com.p118pd.sdk;

import java.util.HashSet;
import java.util.List;
import p293rx.exceptions.CompositeException;
import p293rx.exceptions.OnCompletedFailedException;
import p293rx.exceptions.OnErrorFailedException;
import p293rx.exceptions.OnErrorNotImplementedException;
import p293rx.exceptions.OnErrorThrowable;

/* renamed from: com.pd.sdk.II丨l11  reason: invalid class name */
public final class IIl11 {
    public static final int OooO00o = 25;

    public IIl11() {
        throw new IllegalStateException("No instances!");
    }

    public static RuntimeException OooO00o(Throwable th) {
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        } else {
            throw new RuntimeException(th);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m15447OooO00o(Throwable th) {
        if (th instanceof OnErrorNotImplementedException) {
            throw ((OnErrorNotImplementedException) th);
        } else if (th instanceof OnErrorFailedException) {
            throw ((OnErrorFailedException) th);
        } else if (th instanceof OnCompletedFailedException) {
            throw ((OnCompletedFailedException) th);
        } else if (th instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th);
        } else if (th instanceof ThreadDeath) {
            throw ((ThreadDeath) th);
        } else if (th instanceof LinkageError) {
            throw ((LinkageError) th);
        }
    }

    public static void OooO00o(Throwable th, Throwable th2) {
        HashSet hashSet = new HashSet();
        int i = 0;
        while (th.getCause() != null) {
            int i2 = i + 1;
            if (i < 25) {
                th = th.getCause();
                if (!hashSet.contains(th.getCause())) {
                    hashSet.add(th.getCause());
                    i = i2;
                }
            } else {
                return;
            }
        }
        try {
            th.initCause(th2);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Throwable m15446OooO00o(Throwable th) {
        int i = 0;
        while (th.getCause() != null) {
            int i2 = i + 1;
            if (i >= 25) {
                return new RuntimeException("Stack too deep to get final cause");
            }
            th = th.getCause();
            i = i2;
        }
        return th;
    }

    public static void OooO00o(List<? extends Throwable> list) {
        if (list != null && !list.isEmpty()) {
            if (list.size() == 1) {
                Throwable th = (Throwable) list.get(0);
                if (th instanceof RuntimeException) {
                    throw ((RuntimeException) th);
                } else if (th instanceof Error) {
                    throw ((Error) th);
                } else {
                    throw new RuntimeException(th);
                }
            } else {
                throw new CompositeException(list);
            }
        }
    }

    public static void OooO00o(Throwable th, AbstractC5477Il11<?> r1, Object obj) {
        m15447OooO00o(th);
        r1.onError(OnErrorThrowable.addValueAsLastCause(th, obj));
    }

    public static void OooO00o(Throwable th, AbstractC93021L<?> r1, Object obj) {
        m15447OooO00o(th);
        r1.onError(OnErrorThrowable.addValueAsLastCause(th, obj));
    }

    public static void OooO00o(Throwable th, AbstractC5477Il11<?> r1) {
        m15447OooO00o(th);
        r1.onError(th);
    }

    public static void OooO00o(Throwable th, AbstractC93021L<?> r1) {
        m15447OooO00o(th);
        r1.onError(th);
    }
}
