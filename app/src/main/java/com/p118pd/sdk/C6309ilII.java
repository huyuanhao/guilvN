package com.p118pd.sdk;

import java.io.PrintStream;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* renamed from: com.pd.sdk.ilI丨I丨  reason: invalid class name and case insensitive filesystem */
public final class C6309ilII<E> implements LlIiLii {
    public static final int o00oO0O;
    public final OooO00o<E> OooO00o = new OooO00o<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final OooO0O0 f18003OooO00o = new OooO0O0();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AtomicInteger f18004OooO00o = new AtomicInteger();
    public final AtomicInteger OooO0O0 = new AtomicInteger();

    /* renamed from: com.pd.sdk.ilI丨I丨$OooO00o */
    public static final class OooO00o<E> {
        public final AtomicReference<OooO00o<E>> OooO00o = new AtomicReference<>();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicReferenceArray<E> f18005OooO00o = new AtomicReferenceArray<>(C6309ilII.o00oO0O);

        public OooO00o<E> OooO00o() {
            if (this.OooO00o.get() != null) {
                return this.OooO00o.get();
            }
            OooO00o<E> oooO00o = new OooO00o<>();
            if (this.OooO00o.compareAndSet(null, oooO00o)) {
                return oooO00o;
            }
            return this.OooO00o.get();
        }
    }

    /* renamed from: com.pd.sdk.ilI丨I丨$OooO0O0 */
    public static class OooO0O0 {
        public final AtomicIntegerArray OooO00o = new AtomicIntegerArray(C6309ilII.o00oO0O);

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicReference<OooO0O0> f18006OooO00o = new AtomicReference<>();

        public int OooO00o(int i, int i2) {
            return this.OooO00o.getAndSet(i, i2);
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public void m17350OooO00o(int i, int i2) {
            this.OooO00o.set(i, i2);
        }

        public OooO0O0 OooO00o() {
            if (this.f18006OooO00o.get() != null) {
                return this.f18006OooO00o.get();
            }
            OooO0O0 oooO0O0 = new OooO0O0();
            if (this.f18006OooO00o.compareAndSet(null, oooO0O0)) {
                return oooO0O0;
            }
            return this.f18006OooO00o.get();
        }
    }

    static {
        int i = C5593L1ll.m15992OooO00o() ? 8 : 128;
        String property = System.getProperty("rx.indexed-ring-buffer.size");
        if (property != null) {
            try {
                i = Integer.parseInt(property);
            } catch (NumberFormatException e) {
                PrintStream printStream = System.err;
                printStream.println("Failed to set 'rx.indexed-ring-buffer.size' with value " + property + " => " + e.getMessage());
            }
        }
        o00oO0O = i;
    }

    public static <T> C6309ilII<T> OooO00o() {
        return new C6309ilII<>();
    }

    private synchronized int OooO0O0() {
        int i;
        int OooO0Oo = OooO0Oo();
        if (OooO0Oo >= 0) {
            if (OooO0Oo < o00oO0O) {
                i = this.f18003OooO00o.OooO00o(OooO0Oo, -1);
            } else {
                i = m17346OooO00o(OooO0Oo).OooO00o(OooO0Oo % o00oO0O, -1);
            }
            if (i == this.f18004OooO00o.get()) {
                this.f18004OooO00o.getAndIncrement();
            }
        } else {
            i = this.f18004OooO00o.getAndIncrement();
        }
        return i;
    }

    private synchronized int OooO0Oo() {
        int i;
        int i2;
        do {
            i = this.OooO0O0.get();
            if (i <= 0) {
                return -1;
            }
            i2 = i - 1;
        } while (!this.OooO0O0.compareAndSet(i, i2));
        return i2;
    }

    @Override // com.p118pd.sdk.LlIiLii
    public boolean isUnsubscribed() {
        return false;
    }

    @Override // com.p118pd.sdk.LlIiLii
    public void unsubscribe() {
        m17349OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m17349OooO00o() {
        int i = this.f18004OooO00o.get();
        int i2 = 0;
        loop0:
        for (OooO00o<E> oooO00o = this.OooO00o; oooO00o != null; oooO00o = oooO00o.OooO00o.get()) {
            int i3 = 0;
            while (i3 < o00oO0O) {
                if (i2 >= i) {
                    break loop0;
                }
                oooO00o.f18005OooO00o.set(i3, null);
                i3++;
                i2++;
            }
        }
        this.f18004OooO00o.set(0);
        this.OooO0O0.set(0);
    }

    public int OooO00o(E e) {
        int OooO0O02 = OooO0O0();
        int i = o00oO0O;
        if (OooO0O02 < i) {
            this.OooO00o.f18005OooO00o.set(OooO0O02, e);
            return OooO0O02;
        }
        OooO00o(OooO0O02).f18005OooO00o.set(OooO0O02 % i, e);
        return OooO0O02;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public E m17348OooO00o(int i) {
        E e;
        int i2 = o00oO0O;
        if (i < i2) {
            e = this.OooO00o.f18005OooO00o.getAndSet(i, null);
        } else {
            e = OooO00o(i).f18005OooO00o.getAndSet(i % i2, null);
        }
        m17347OooO00o(i);
        return e;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private OooO0O0 m17346OooO00o(int i) {
        int i2 = o00oO0O;
        if (i < i2) {
            return this.f18003OooO00o;
        }
        int i3 = i / i2;
        OooO0O0 oooO0O0 = this.f18003OooO00o;
        for (int i4 = 0; i4 < i3; i4++) {
            oooO0O0 = oooO0O0.OooO00o();
        }
        return oooO0O0;
    }

    private OooO00o<E> OooO00o(int i) {
        int i2 = o00oO0O;
        if (i < i2) {
            return this.OooO00o;
        }
        int i3 = i / i2;
        OooO00o<E> oooO00o = this.OooO00o;
        for (int i4 = 0; i4 < i3; i4++) {
            oooO00o = oooO00o.OooO00o();
        }
        return oooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private synchronized void m17347OooO00o(int i) {
        int andIncrement = this.OooO0O0.getAndIncrement();
        if (andIncrement < o00oO0O) {
            this.f18003OooO00o.m17350OooO00o(andIncrement, i);
        } else {
            m17346OooO00o(andIncrement).m17350OooO00o(andIncrement % o00oO0O, i);
        }
    }

    public int OooO00o(AbstractC9847l1<? super E, Boolean> r2) {
        return OooO00o(r2, 0);
    }

    public int OooO00o(AbstractC9847l1<? super E, Boolean> r4, int i) {
        int OooO00o2 = OooO00o(r4, i, this.f18004OooO00o.get());
        if (i > 0 && OooO00o2 == this.f18004OooO00o.get()) {
            return OooO00o(r4, 0, i);
        }
        if (OooO00o2 == this.f18004OooO00o.get()) {
            return 0;
        }
        return OooO00o2;
    }

    private int OooO00o(AbstractC9847l1<? super E, Boolean> r6, int i, int i2) {
        OooO00o<E> oooO00o;
        int i3;
        int i4 = this.f18004OooO00o.get();
        OooO00o<E> oooO00o2 = this.OooO00o;
        if (i >= o00oO0O) {
            OooO00o<E> OooO00o2 = OooO00o(i);
            i3 = i;
            i %= o00oO0O;
            oooO00o = OooO00o2;
        } else {
            oooO00o = oooO00o2;
            i3 = i;
        }
        loop0:
        while (oooO00o != null) {
            while (i < o00oO0O) {
                if (i3 >= i4 || i3 >= i2) {
                    break loop0;
                }
                E e = oooO00o.f18005OooO00o.get(i);
                if (e != null && !r6.call(e).booleanValue()) {
                    return i3;
                }
                i++;
                i3++;
            }
            oooO00o = oooO00o.OooO00o.get();
            i = 0;
        }
        return i3;
    }
}
