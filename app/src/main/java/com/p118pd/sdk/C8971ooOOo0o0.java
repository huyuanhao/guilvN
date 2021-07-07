package com.p118pd.sdk;

import java.lang.ref.SoftReference;
import s.h.e.l.l.C;

/* renamed from: com.pd.sdk.ooOOo0o0  reason: case insensitive filesystem */
public class C8971ooOOo0o0<T> extends AbstractC9508LiLi<T> implements AbstractC8966ooOOo00o {
    public C8964ooOOo000 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SoftReference<AbstractC8969ooOOo0Oo> f22234OooO00o;

    /* renamed from: com.pd.sdk.ooOOo0o0$OooO00o */
    public class OooO00o implements AbstractC6153iL1l<Long> {
        public OooO00o() {
        }

        /* renamed from: OooO00o */
        public void call(Long l) {
            C8971ooOOo0o0.this.f22234OooO00o.get().OooO00o(l.longValue(), C8971ooOOo0o0.this.OooO00o.m20626OooO00o());
        }
    }

    static {
        C.i(16777265);
    }

    public C8971ooOOo0o0(C8964ooOOo000 ooooo000) {
        this.f22234OooO00o = new SoftReference<>(ooooo000.m20629OooO00o());
        this.OooO00o = ooooo000;
    }

    @Override // com.p118pd.sdk.AbstractC8966ooOOo00o
    public native void OooO00o(long j, long j2, boolean z);

    public native void OooO00o(C8964ooOOo000 ooooo000);

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public native void onCompleted();

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public native void onError(Throwable th);

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onNext(T t) {
        if (this.f22234OooO00o.get() != null) {
            this.f22234OooO00o.get().OooO00o((Object) t);
        }
    }

    @Override // com.p118pd.sdk.AbstractC9508LiLi
    public native void onStart();
}
