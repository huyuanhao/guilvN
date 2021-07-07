package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;

/* renamed from: com.pd.sdk.丨丨丨ii  reason: invalid class name and case insensitive filesystem */
public final class C9874ii<T, R> implements C9349III.OooO00o<R> {
    public final LiLIll<R> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9349III<T> f23486OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9583iI1Il<R, ? super T> f23487OooO00o;

    /* renamed from: com.pd.sdk.丨丨丨ii$OooO00o */
    public static final class OooO00o<T, R> extends AbstractC5670LLl1<T, R> {
        public final AbstractC9583iI1Il<R, ? super T> OooO00o;

        public OooO00o(AbstractC9508LiLi<? super R> r1, R r, AbstractC9583iI1Il<R, ? super T> r3) {
            super(r1);
            ((AbstractC6730ll1Il) this).f18708OooO00o = r;
            this.OooO0O0 = true;
            this.OooO00o = r3;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            if (!this.OooO0OO) {
                try {
                    this.OooO00o.OooO00o(((AbstractC6730ll1Il) this).f18708OooO00o, t);
                } catch (Throwable th) {
                    IIl11.m15447OooO00o(th);
                    unsubscribe();
                    onError(th);
                }
            }
        }
    }

    public C9874ii(C9349III<T> r1, LiLIll<R> r2, AbstractC9583iI1Il<R, ? super T> r3) {
        this.f23486OooO00o = r1;
        this.OooO00o = r2;
        this.f23487OooO00o = r3;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC9508LiLi<? super R> r4) {
        try {
            new OooO00o(r4, this.OooO00o.call(), this.f23487OooO00o).OooO00o((C9349III) this.f23486OooO00o);
        } catch (Throwable th) {
            IIl11.m15447OooO00o(th);
            r4.onError(th);
        }
    }
}
