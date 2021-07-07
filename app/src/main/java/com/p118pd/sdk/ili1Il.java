package com.p118pd.sdk;

import java.util.List;
import java.util.concurrent.TimeUnit;
import s.h.e.l.l.C;

/* renamed from: com.pd.sdk.ili1Il */
public class ili1Il<T> extends AbstractC9508LiLi<T> implements C11LlIl1<T> {
    public final C6154iL1lLl<T> OooO00o;

    static {
        C.i(33554505);
    }

    public ili1Il(C6154iL1lLl<T> il1lll) {
        this.OooO00o = il1lll;
    }

    public static <T> ili1Il<T> OooO00o(long j) {
        C6154iL1lLl il1lll = new C6154iL1lLl(j);
        ili1Il<T> ili1il = new ili1Il<>(il1lll);
        ili1il.add(il1lll);
        return ili1il;
    }

    @Override // com.p118pd.sdk.C11LlIl1, com.p118pd.sdk.C11LlIl1, com.p118pd.sdk.C11LlIl1, com.p118pd.sdk.C11LlIl1
    public final native int OooO00o();

    @Override // com.p118pd.sdk.C11LlIl1, com.p118pd.sdk.C11LlIl1, com.p118pd.sdk.C11LlIl1, com.p118pd.sdk.C11LlIl1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public native Thread m17374OooO00o();

    @Override // com.p118pd.sdk.C11LlIl1, com.p118pd.sdk.C11LlIl1
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public List<Throwable> m17376OooO0O0() {
        return this.OooO00o.OooO0O0();
    }

    @Override // com.p118pd.sdk.C11LlIl1, com.p118pd.sdk.C11LlIl1
    public final native int OooO0OO();

    @Override // com.p118pd.sdk.C11LlIl1
    public C11LlIl1<T> OooO0Oo() {
        this.OooO00o.m17073OooO0OO();
        return this;
    }

    @Override // com.p118pd.sdk.C11LlIl1
    public C11LlIl1<T> OooO0o() {
        this.OooO00o.OooO0Oo();
        return this;
    }

    @Override // com.p118pd.sdk.C11LlIl1
    public C11LlIl1<T> OooO0o0() {
        this.OooO00o.OooO0o();
        return this;
    }

    @Override // com.p118pd.sdk.C11LlIl1
    public C11LlIl1<T> OooO0oO() {
        this.OooO00o.OooO();
        return this;
    }

    @Override // com.p118pd.sdk.C11LlIl1
    public C11LlIl1<T> OooO0oo() {
        this.OooO00o.OooO0oo();
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public native void onCompleted();

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public native void onError(Throwable th);

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onNext(T t) {
        this.OooO00o.onNext(t);
    }

    @Override // com.p118pd.sdk.C11LlIl1, com.p118pd.sdk.AbstractC9508LiLi
    public native void onStart();

    @Override // com.p118pd.sdk.C11LlIl1, com.p118pd.sdk.AbstractC9508LiLi
    public void setProducer(AbstractC9465L1l1 r2) {
        this.OooO00o.setProducer(r2);
    }

    public native String toString();

    @Override // com.p118pd.sdk.C11LlIl1
    public C11LlIl1<T> OooO0O0(long j, TimeUnit timeUnit) {
        this.OooO00o.OooO0O0(j, timeUnit);
        return this;
    }

    @Override // com.p118pd.sdk.C11LlIl1, com.p118pd.sdk.C11LlIl1
    /* renamed from: OooO0OO  reason: collision with other method in class */
    public C11LlIl1<T> m17377OooO0OO() {
        this.OooO00o.OooO0o0();
        return this;
    }

    @Override // com.p118pd.sdk.C11LlIl1, com.p118pd.sdk.C11LlIl1
    public C11LlIl1<T> OooO0O0() {
        this.OooO00o.OooO0oO();
        return this;
    }

    @Override // com.p118pd.sdk.C11LlIl1
    public C11LlIl1<T> OooO0O0(T... tArr) {
        this.OooO00o.OooO0O0(tArr);
        return this;
    }

    @Override // com.p118pd.sdk.C11LlIl1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C11LlIl1<T> m17373OooO00o(long j) {
        this.OooO00o.m17071OooO00o(j);
        return this;
    }

    @Override // com.p118pd.sdk.C11LlIl1, com.p118pd.sdk.C11LlIl1, com.p118pd.sdk.C11LlIl1, com.p118pd.sdk.C11LlIl1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<T> m17375OooO00o() {
        return this.OooO00o.m17070OooO00o();
    }

    @Override // com.p118pd.sdk.C11LlIl1
    public C11LlIl1<T> OooO00o(List<T> list) {
        this.OooO00o.OooO00o((List) list);
        return this;
    }

    @Override // com.p118pd.sdk.C11LlIl1
    public final C11LlIl1<T> OooO00o(int i, long j, TimeUnit timeUnit) {
        if (this.OooO00o.OooO00o(i, j, timeUnit)) {
            return this;
        }
        throw new AssertionError("Did not receive enough values in time. Expected: " + i + ", Actual: " + this.OooO00o.OooO0OO());
    }

    @Override // com.p118pd.sdk.C11LlIl1, com.p118pd.sdk.C11LlIl1, com.p118pd.sdk.C11LlIl1, com.p118pd.sdk.C11LlIl1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C11LlIl1<T> m17372OooO00o() {
        this.OooO00o.OooOO0();
        return this;
    }

    @Override // com.p118pd.sdk.C11LlIl1
    public C11LlIl1<T> OooO00o(long j, TimeUnit timeUnit) {
        this.OooO00o.OooO00o(j, timeUnit);
        return this;
    }

    @Override // com.p118pd.sdk.C11LlIl1
    public C11LlIl1<T> OooO00o(Class<? extends Throwable> cls) {
        this.OooO00o.OooO00o(cls);
        return this;
    }

    @Override // com.p118pd.sdk.C11LlIl1
    public C11LlIl1<T> OooO00o(Throwable th) {
        this.OooO00o.OooO0O0(th);
        return this;
    }

    @Override // com.p118pd.sdk.C11LlIl1
    public C11LlIl1<T> OooO00o(int i) {
        this.OooO00o.OooO00o(i);
        return this;
    }

    @Override // com.p118pd.sdk.C11LlIl1
    public C11LlIl1<T> OooO00o(T t) {
        this.OooO00o.OooO00o((Object) t);
        return this;
    }

    @Override // com.p118pd.sdk.C11LlIl1
    public final C11LlIl1<T> OooO00o(T t, T... tArr) {
        this.OooO00o.OooO00o(t, tArr);
        return this;
    }

    @Override // com.p118pd.sdk.C11LlIl1
    public final C11LlIl1<T> OooO00o(liii1l r1) {
        r1.call();
        return this;
    }

    @Override // com.p118pd.sdk.C11LlIl1
    public final C11LlIl1<T> OooO00o(T... tArr) {
        this.OooO00o.OooO0O0(tArr);
        this.OooO00o.OooO0Oo();
        this.OooO00o.m17073OooO0OO();
        return this;
    }

    @Override // com.p118pd.sdk.C11LlIl1
    public final C11LlIl1<T> OooO00o(Class<? extends Throwable> cls, T... tArr) {
        this.OooO00o.OooO0O0(tArr);
        this.OooO00o.OooO00o(cls);
        this.OooO00o.OooO0oO();
        return this;
    }

    @Override // com.p118pd.sdk.C11LlIl1
    public final C11LlIl1<T> OooO00o(Class<? extends Throwable> cls, String str, T... tArr) {
        this.OooO00o.OooO0O0(tArr);
        this.OooO00o.OooO00o(cls);
        this.OooO00o.OooO0oO();
        String message = this.OooO00o.OooO0O0().get(0).getMessage();
        if (message == str || (str != null && str.equals(message))) {
            return this;
        }
        throw new AssertionError("Error message differs. Expected: '" + str + "', Received: '" + message + "'");
    }
}
