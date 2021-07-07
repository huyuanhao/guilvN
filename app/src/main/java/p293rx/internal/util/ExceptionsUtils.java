package p293rx.internal.util;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import p293rx.exceptions.CompositeException;

/* renamed from: rx.internal.util.ExceptionsUtils */
public enum ExceptionsUtils {
    ;
    
    public static final Throwable OooO00o = new Throwable("Terminated");

    public static boolean addThrowable(AtomicReference<Throwable> atomicReference, Throwable th) {
        Throwable th2;
        Throwable th3;
        do {
            th2 = atomicReference.get();
            if (th2 == OooO00o) {
                return false;
            }
            if (th2 == null) {
                th3 = th;
            } else if (th2 instanceof CompositeException) {
                ArrayList arrayList = new ArrayList(((CompositeException) th2).getExceptions());
                arrayList.add(th);
                th3 = new CompositeException(arrayList);
            } else {
                th3 = new CompositeException(th2, th);
            }
        } while (!atomicReference.compareAndSet(th2, th3));
        return true;
    }

    public static boolean isTerminated(AtomicReference<Throwable> atomicReference) {
        return isTerminated(atomicReference.get());
    }

    public static Throwable terminate(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        Throwable th2 = OooO00o;
        return th != th2 ? atomicReference.getAndSet(th2) : th;
    }

    public static boolean isTerminated(Throwable th) {
        return th == OooO00o;
    }
}
