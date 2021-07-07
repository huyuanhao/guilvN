package com.p118pd.sdk;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p293rx.internal.operators.NotificationLite;

/* renamed from: com.pd.sdk.LLLLL丨  reason: invalid class name */
public final class LLLLL {

    /* renamed from: com.pd.sdk.LLLLL丨$OooO00o */
    public static class OooO00o implements Iterable<T> {
        public final /* synthetic */ C9349III OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Object f16464OooO00o;

        public OooO00o(Object obj, C9349III r2) {
            this.f16464OooO00o = obj;
            this.OooO00o = r2;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            OooO0O0 oooO0O0 = new OooO0O0(this.f16464OooO00o);
            this.OooO00o.OooO00o((AbstractC9508LiLi) oooO0O0);
            return oooO0O0.OooO00o();
        }
    }

    /* renamed from: com.pd.sdk.LLLLL丨$OooO0O0 */
    public static final class OooO0O0<T> extends AbstractC9508LiLi<T> {
        public volatile Object OooO00o;

        /* renamed from: com.pd.sdk.LLLLL丨$OooO0O0$OooO00o */
        public class OooO00o implements Iterator<T> {

            /* renamed from: OooO00o  reason: collision with other field name */
            public Object f16465OooO00o;

            public OooO00o() {
            }

            public boolean hasNext() {
                Object obj = OooO0O0.this.OooO00o;
                this.f16465OooO00o = obj;
                return !NotificationLite.m22999OooO00o(obj);
            }

            @Override // java.util.Iterator
            public T next() {
                Object obj = null;
                try {
                    if (this.f16465OooO00o == null) {
                        Object obj2 = OooO0O0.this.OooO00o;
                    }
                    if (NotificationLite.m22999OooO00o(this.f16465OooO00o)) {
                        throw new NoSuchElementException();
                    } else if (!NotificationLite.m23000OooO0O0(this.f16465OooO00o)) {
                        T t = (T) NotificationLite.OooO00o(this.f16465OooO00o);
                        this.f16465OooO00o = obj;
                        return t;
                    } else {
                        throw IIl11.OooO00o(NotificationLite.m22998OooO00o(this.f16465OooO00o));
                    }
                } finally {
                    this.f16465OooO00o = obj;
                }
            }

            public void remove() {
                throw new UnsupportedOperationException("Read only iterator");
            }
        }

        public OooO0O0(T t) {
            this.OooO00o = NotificationLite.OooO0O0((Object) t);
        }

        public Iterator<T> OooO00o() {
            return new OooO00o();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.OooO00o = NotificationLite.OooO00o();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.OooO00o = NotificationLite.OooO00o(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.OooO00o = NotificationLite.OooO0O0((Object) t);
        }
    }

    public LLLLL() {
        throw new IllegalStateException("No instances!");
    }

    public static <T> Iterable<T> OooO00o(C9349III<? extends T> r1, T t) {
        return new OooO00o(t, r1);
    }
}
