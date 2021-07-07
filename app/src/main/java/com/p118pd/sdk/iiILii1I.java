package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.Arrays;
import p293rx.exceptions.CompositeException;

/* renamed from: com.pd.sdk.iiILii1I */
public class iiILii1I<T> implements C9349III.OooO00o<T> {
    public final AbstractC5477Il11<? super T> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9349III<T> f17851OooO00o;

    /* renamed from: com.pd.sdk.iiILii1I$OooO00o */
    public static final class OooO00o<T> extends AbstractC9508LiLi<T> {
        public final AbstractC5477Il11<? super T> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super T> f17852OooO00o;
        public boolean OooO0O0;

        public OooO00o(AbstractC9508LiLi<? super T> r1, AbstractC5477Il11<? super T> r2) {
            super(r1);
            this.f17852OooO00o = r1;
            this.OooO00o = r2;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.OooO0O0) {
                try {
                    this.OooO00o.onCompleted();
                    this.OooO0O0 = true;
                    this.f17852OooO00o.onCompleted();
                } catch (Throwable th) {
                    IIl11.OooO00o(th, this);
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (this.OooO0O0) {
                C9714lli.m21756OooO00o(th);
                return;
            }
            this.OooO0O0 = true;
            try {
                this.OooO00o.onError(th);
                this.f17852OooO00o.onError(th);
            } catch (Throwable th2) {
                IIl11.m15447OooO00o(th2);
                this.f17852OooO00o.onError(new CompositeException(Arrays.asList(th, th2)));
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (!this.OooO0O0) {
                try {
                    this.OooO00o.onNext(t);
                    this.f17852OooO00o.onNext(t);
                } catch (Throwable th) {
                    IIl11.OooO00o(th, this, t);
                }
            }
        }
    }

    public iiILii1I(C9349III<T> r1, AbstractC5477Il11<? super T> r2) {
        this.f17851OooO00o = r1;
        this.OooO00o = r2;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super T> r4) {
        this.f17851OooO00o.OooO0O0((AbstractC9508LiLi) new OooO00o(r4, this.OooO00o));
    }
}
