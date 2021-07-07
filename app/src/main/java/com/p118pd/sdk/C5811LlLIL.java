package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.NoSuchElementException;

/* renamed from: com.pd.sdk.Ll丨LI丨L丨  reason: invalid class name and case insensitive filesystem */
public final class C5811LlLIL<T> implements C9349III.OooO00o<T> {
    public final AbstractC5189I1l1l<T, T, T> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9349III<T> f16761OooO00o;

    /* renamed from: com.pd.sdk.Ll丨LI丨L丨$OooO00o */
    public class OooO00o implements AbstractC9465L1l1 {
        public final /* synthetic */ OooO0O0 OooO00o;

        public OooO00o(OooO0O0 oooO0O0) {
            this.OooO00o = oooO0O0;
        }

        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
            this.OooO00o.OooO00o(j);
        }
    }

    /* renamed from: com.pd.sdk.Ll丨LI丨L丨$OooO0O0 */
    public static final class OooO0O0<T> extends AbstractC9508LiLi<T> {
        public static final Object OooO0O0 = new Object();
        public final AbstractC5189I1l1l<T, T, T> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super T> f16763OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public T f16764OooO00o = ((T) OooO0O0);

        /* renamed from: OooO0O0  reason: collision with other field name */
        public boolean f16765OooO0O0;

        public OooO0O0(AbstractC9508LiLi<? super T> r1, AbstractC5189I1l1l<T, T, T> r2) {
            this.f16763OooO00o = r1;
            this.OooO00o = r2;
            request(0);
        }

        public void OooO00o(long j) {
            if (j < 0) {
                throw new IllegalArgumentException("n >= 0 required but it was " + j);
            } else if (j != 0) {
                request(Long.MAX_VALUE);
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.f16765OooO0O0) {
                this.f16765OooO0O0 = true;
                T t = this.f16764OooO00o;
                if (t != OooO0O0) {
                    this.f16763OooO00o.onNext(t);
                    this.f16763OooO00o.onCompleted();
                    return;
                }
                this.f16763OooO00o.onError(new NoSuchElementException());
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (!this.f16765OooO0O0) {
                this.f16765OooO0O0 = true;
                this.f16763OooO00o.onError(th);
                return;
            }
            C9714lli.m21756OooO00o(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (!this.f16765OooO0O0) {
                T t2 = this.f16764OooO00o;
                if (t2 == OooO0O0) {
                    this.f16764OooO00o = t;
                    return;
                }
                try {
                    this.f16764OooO00o = this.OooO00o.OooO00o(t2, t);
                } catch (Throwable th) {
                    IIl11.m15447OooO00o(th);
                    unsubscribe();
                    onError(th);
                }
            }
        }
    }

    public C5811LlLIL(C9349III<T> r1, AbstractC5189I1l1l<T, T, T> r2) {
        this.f16761OooO00o = r1;
        this.OooO00o = r2;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super T> r3) {
        OooO0O0 oooO0O0 = new OooO0O0(r3, this.OooO00o);
        r3.add(oooO0O0);
        r3.setProducer(new OooO00o(oooO0O0));
        this.f16761OooO00o.OooO0O0((AbstractC9508LiLi) oooO0O0);
    }
}
