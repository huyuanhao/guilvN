package com.p118pd.sdk;

import com.p118pd.sdk.C5777LlIi;
import com.p118pd.sdk.LL1LL;

/* renamed from: com.pd.sdk.丨lII1I  reason: invalid class name and case insensitive filesystem */
public class C9679lII1I<T, U, V> extends C5777LlIi<T> {

    /* renamed from: com.pd.sdk.丨lII1I$OooO00o */
    public class OooO00o implements C5777LlIi.OooO00o<T> {
        public final /* synthetic */ LiLIll OooO00o;

        /* renamed from: com.pd.sdk.丨lII1I$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4980OooO00o extends AbstractC9508LiLi<U> {
            public final /* synthetic */ C5777LlIi.OooO0OO OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ Long f23284OooO00o;

            public C4980OooO00o(C5777LlIi.OooO0OO oooO0OO, Long l) {
                this.OooO00o = oooO0OO;
                this.f23284OooO00o = l;
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onCompleted() {
                this.OooO00o.OooO00o(this.f23284OooO00o.longValue());
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onError(Throwable th) {
                this.OooO00o.onError(th);
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onNext(U u) {
                this.OooO00o.OooO00o(this.f23284OooO00o.longValue());
            }
        }

        public OooO00o(LiLIll r1) {
            this.OooO00o = r1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // com.p118pd.sdk.AbstractC9359IIIi
        public /* bridge */ /* synthetic */ LlIiLii OooO00o(Object obj, Long l, LL1LL.OooO00o oooO00o) {
            return OooO00o((C5777LlIi.OooO0OO) ((C5777LlIi.OooO0OO) obj), l, oooO00o);
        }

        public LlIiLii OooO00o(C5777LlIi.OooO0OO<T> oooO0OO, Long l, LL1LL.OooO00o oooO00o) {
            LiLIll r4 = this.OooO00o;
            if (r4 == null) {
                return C9638ill.OooO0O0();
            }
            try {
                return ((C9349III) r4.call()).OooO0O0((AbstractC9508LiLi) new C4980OooO00o(oooO0OO, l));
            } catch (Throwable th) {
                IIl11.OooO00o(th, oooO0OO);
                return C9638ill.OooO0O0();
            }
        }
    }

    /* renamed from: com.pd.sdk.丨lII1I$OooO0O0 */
    public class OooO0O0 implements C5777LlIi.OooO0O0<T> {
        public final /* synthetic */ AbstractC9847l1 OooO00o;

        /* renamed from: com.pd.sdk.丨lII1I$OooO0O0$OooO00o */
        public class OooO00o extends AbstractC9508LiLi<V> {
            public final /* synthetic */ C5777LlIi.OooO0OO OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ Long f23286OooO00o;

            public OooO00o(C5777LlIi.OooO0OO oooO0OO, Long l) {
                this.OooO00o = oooO0OO;
                this.f23286OooO00o = l;
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onCompleted() {
                this.OooO00o.OooO00o(this.f23286OooO00o.longValue());
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onError(Throwable th) {
                this.OooO00o.onError(th);
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onNext(V v) {
                this.OooO00o.OooO00o(this.f23286OooO00o.longValue());
            }
        }

        public OooO0O0(AbstractC9847l1 r1) {
            this.OooO00o = r1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // com.p118pd.sdk.i1li1ii1
        public /* bridge */ /* synthetic */ LlIiLii OooO00o(Object obj, Long l, Object obj2, LL1LL.OooO00o oooO00o) {
            return OooO00o((C5777LlIi.OooO0OO) ((C5777LlIi.OooO0OO) obj), l, obj2, oooO00o);
        }

        public LlIiLii OooO00o(C5777LlIi.OooO0OO<T> oooO0OO, Long l, T t, LL1LL.OooO00o oooO00o) {
            try {
                return ((C9349III) this.OooO00o.call(t)).OooO0O0((AbstractC9508LiLi) new OooO00o(oooO0OO, l));
            } catch (Throwable th) {
                IIl11.OooO00o(th, oooO0OO);
                return C9638ill.OooO0O0();
            }
        }
    }

    public C9679lII1I(LiLIll<? extends C9349III<U>> r2, AbstractC9847l1<? super T, ? extends C9349III<V>> r3, C9349III<? extends T> r4) {
        super(new OooO00o(r2), new OooO0O0(r3), r4, C6261iii1I1.OooO0O0());
    }

    @Override // com.p118pd.sdk.C5777LlIi
    public /* bridge */ /* synthetic */ AbstractC9508LiLi OooO00o(AbstractC9508LiLi r1) {
        return super.call(r1);
    }
}
