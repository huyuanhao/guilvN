package com.p118pd.sdk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import p293rx.Notification;
import p293rx.exceptions.CompositeException;

/* renamed from: com.pd.sdk.iL1lLl  reason: case insensitive filesystem */
public class C6154iL1lLl<T> extends AbstractC9508LiLi<T> {
    public static final AbstractC5477Il11<Object> OooO0O0 = new OooO00o();
    public final AbstractC5477Il11<T> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile Thread f17676OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<T> f17677OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final CountDownLatch f17678OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final List<Throwable> f17679OooO0O0;
    public int o00oO0O;
    public volatile int o0ooOO0;

    /* renamed from: com.pd.sdk.iL1lLl$OooO00o */
    public static class OooO00o implements AbstractC5477Il11<Object> {
        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(Object obj) {
        }
    }

    public C6154iL1lLl(long j) {
        this(OooO0O0, j);
    }

    public static <T> C6154iL1lLl<T> OooO00o() {
        return new C6154iL1lLl<>();
    }

    public void OooO() {
        if (!isUnsubscribed()) {
            OooO00o("Not unsubscribed.");
        }
    }

    public List<Throwable> OooO0O0() {
        return this.f17679OooO0O0;
    }

    @Deprecated
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public List<Notification<T>> m17072OooO0OO() {
        int i = this.o00oO0O;
        ArrayList arrayList = new ArrayList(i != 0 ? i : 1);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(Notification.OooO00o());
        }
        return arrayList;
    }

    public void OooO0Oo() {
        if (!OooO0O0().isEmpty()) {
            OooO00o("Unexpected onError events");
        }
    }

    public void OooO0o() {
        int size = this.f17677OooO00o.size();
        if (size != 0) {
            OooO00o("No onNext events expected yet some received: " + size);
        }
    }

    public void OooO0o0() {
        List<Throwable> list = this.f17679OooO0O0;
        int i = this.o00oO0O;
        if (list.isEmpty() && i <= 0) {
            return;
        }
        if (list.isEmpty()) {
            OooO00o("Found " + list.size() + " errors and " + i + " completion events instead of none");
        } else if (list.size() == 1) {
            OooO00o("Found " + list.size() + " errors and " + i + " completion events instead of none");
        } else {
            OooO00o("Found " + list.size() + " errors and " + i + " completion events instead of none");
        }
    }

    public void OooO0oO() {
        int i = this.o00oO0O;
        if (i == 1) {
            OooO00o("Completed!");
        } else if (i > 1) {
            OooO00o("Completed multiple times: " + i);
        }
    }

    public void OooO0oo() {
        if (this.f17679OooO0O0.size() > 1) {
            OooO00o("Too many onError events: " + this.f17679OooO0O0.size());
        }
        if (this.o00oO0O > 1) {
            OooO00o("Too many onCompleted events: " + this.o00oO0O);
        }
        if (this.o00oO0O == 1 && this.f17679OooO0O0.size() == 1) {
            OooO00o("Received both an onError and onCompleted. Should be one or the other.");
        }
        if (this.o00oO0O == 0 && this.f17679OooO0O0.isEmpty()) {
            OooO00o("No terminal events received.");
        }
    }

    public void OooOO0() {
        try {
            this.f17678OooO00o.await();
        } catch (InterruptedException e) {
            throw new IllegalStateException("Interrupted", e);
        }
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onCompleted() {
        try {
            this.o00oO0O++;
            this.f17676OooO00o = Thread.currentThread();
            this.OooO00o.onCompleted();
        } finally {
            this.f17678OooO00o.countDown();
        }
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onError(Throwable th) {
        try {
            this.f17676OooO00o = Thread.currentThread();
            this.f17679OooO0O0.add(th);
            this.OooO00o.onError(th);
        } finally {
            this.f17678OooO00o.countDown();
        }
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onNext(T t) {
        this.f17676OooO00o = Thread.currentThread();
        this.f17677OooO00o.add(t);
        this.o0ooOO0 = this.f17677OooO00o.size();
        this.OooO00o.onNext(t);
    }

    public C6154iL1lLl(AbstractC5477Il11<T> r3, long j) {
        this.f17678OooO00o = new CountDownLatch(1);
        if (r3 != null) {
            this.OooO00o = r3;
            if (j >= 0) {
                request(j);
            }
            this.f17677OooO00o = new ArrayList();
            this.f17679OooO0O0 = new ArrayList();
            return;
        }
        throw null;
    }

    public static <T> C6154iL1lLl<T> OooO00o(long j) {
        return new C6154iL1lLl<>(j);
    }

    public void OooO0O0(long j, TimeUnit timeUnit) {
        try {
            if (!this.f17678OooO00o.await(j, timeUnit)) {
                unsubscribe();
            }
        } catch (InterruptedException unused) {
            unsubscribe();
        }
    }

    public static <T> C6154iL1lLl<T> OooO00o(AbstractC5477Il11<T> r1, long j) {
        return new C6154iL1lLl<>(r1, j);
    }

    public static <T> C6154iL1lLl<T> OooO00o(AbstractC9508LiLi<T> r1) {
        return new C6154iL1lLl<>((AbstractC9508LiLi) r1);
    }

    public final int OooO0OO() {
        return this.o0ooOO0;
    }

    public static <T> C6154iL1lLl<T> OooO00o(AbstractC5477Il11<T> r1) {
        return new C6154iL1lLl<>(r1);
    }

    public void OooO0O0(Throwable th) {
        List<Throwable> list = this.f17679OooO0O0;
        if (list.isEmpty()) {
            OooO00o("No errors");
        } else if (list.size() > 1) {
            OooO00o("Multiple errors");
        } else if (!th.equals(list.get(0))) {
            OooO00o("Exceptions differ; expected: " + th + ", actual: " + list.get(0));
        }
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public void m17073OooO0OO() {
        int i = this.o00oO0O;
        if (i == 0) {
            OooO00o("Not completed!");
        } else if (i > 1) {
            OooO00o("Completed multiple times: " + i);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final int m17068OooO00o() {
        return this.o00oO0O;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m17071OooO00o(long j) {
        request(j);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<T> m17070OooO00o() {
        return this.f17677OooO00o;
    }

    public C6154iL1lLl(AbstractC9508LiLi<T> r3) {
        this(r3, -1);
    }

    public void OooO00o(List<T> list) {
        if (this.f17677OooO00o.size() != list.size()) {
            OooO00o("Number of items does not match. Provided: " + list.size() + "  Actual: " + this.f17677OooO00o.size() + ".\n" + "Provided values: " + list + "\n" + "Actual values: " + this.f17677OooO00o + "\n");
        }
        for (int i = 0; i < list.size(); i++) {
            OooO00o((Object) list.get(i), i);
        }
    }

    public C6154iL1lLl(AbstractC5477Il11<T> r3) {
        this(r3, -1);
    }

    public C6154iL1lLl() {
        this(-1);
    }

    public void OooO0O0(T... tArr) {
        OooO00o((List) Arrays.asList(tArr));
    }

    private void OooO00o(T t, int i) {
        T t2 = this.f17677OooO00o.get(i);
        if (t == null) {
            if (t2 != null) {
                OooO00o("Value at index: " + i + " expected: [null] but was: [" + ((Object) t2) + "]\n");
            }
        } else if (!t.equals(t2)) {
            StringBuilder sb = new StringBuilder();
            sb.append("Value at index: ");
            sb.append(i);
            sb.append(" expected: [");
            sb.append((Object) t);
            sb.append("] (");
            sb.append(t.getClass().getSimpleName());
            sb.append(") but was: [");
            sb.append((Object) t2);
            sb.append("] (");
            sb.append(t2 != null ? t2.getClass().getSimpleName() : "null");
            sb.append(")\n");
            OooO00o(sb.toString());
        }
    }

    public final boolean OooO00o(int i, long j, TimeUnit timeUnit) {
        while (j != 0 && this.o0ooOO0 < i) {
            try {
                timeUnit.sleep(1);
                j--;
            } catch (InterruptedException e) {
                throw new IllegalStateException("Interrupted", e);
            }
        }
        return this.o0ooOO0 >= i;
    }

    public void OooO00o(long j, TimeUnit timeUnit) {
        try {
            this.f17678OooO00o.await(j, timeUnit);
        } catch (InterruptedException e) {
            throw new IllegalStateException("Interrupted", e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Thread m17069OooO00o() {
        return this.f17676OooO00o;
    }

    public void OooO00o(Class<? extends Throwable> cls) {
        List<Throwable> list = this.f17679OooO0O0;
        if (list.isEmpty()) {
            OooO00o("No errors");
        } else if (list.size() > 1) {
            AssertionError assertionError = new AssertionError("Multiple errors: " + list.size());
            assertionError.initCause(new CompositeException(list));
            throw assertionError;
        } else if (!cls.isInstance(list.get(0))) {
            AssertionError assertionError2 = new AssertionError("Exceptions differ; expected: " + cls + ", actual: " + list.get(0));
            assertionError2.initCause(list.get(0));
            throw assertionError2;
        }
    }

    public void OooO00o(int i) {
        int size = this.f17677OooO00o.size();
        if (size != i) {
            OooO00o("Number of onNext events differ; expected: " + i + ", actual: " + size);
        }
    }

    public void OooO00o(T t) {
        OooO00o((List) Collections.singletonList(t));
    }

    public final void OooO00o(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 32);
        sb.append(str);
        sb.append(" (");
        int i = this.o00oO0O;
        sb.append(i);
        sb.append(" completion");
        if (i != 1) {
            sb.append('s');
        }
        sb.append(')');
        if (!this.f17679OooO0O0.isEmpty()) {
            int size = this.f17679OooO0O0.size();
            sb.append(" (+");
            sb.append(size);
            sb.append(" error");
            if (size != 1) {
                sb.append('s');
            }
            sb.append(')');
        }
        AssertionError assertionError = new AssertionError(sb.toString());
        if (!this.f17679OooO0O0.isEmpty()) {
            if (this.f17679OooO0O0.size() == 1) {
                assertionError.initCause(this.f17679OooO0O0.get(0));
            } else {
                assertionError.initCause(new CompositeException(this.f17679OooO0O0));
            }
        }
        throw assertionError;
    }

    public final void OooO00o(T t, T... tArr) {
        OooO00o(tArr.length + 1);
        int i = 0;
        OooO00o((Object) t, 0);
        while (i < tArr.length) {
            T t2 = tArr[i];
            i++;
            OooO00o((Object) t2, i);
        }
        this.f17677OooO00o.clear();
    }
}
