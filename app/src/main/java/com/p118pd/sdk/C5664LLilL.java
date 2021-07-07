package com.p118pd.sdk;

import com.p118pd.sdk.C5777LlIi;
import com.p118pd.sdk.LL1LL;
import java.util.concurrent.TimeUnit;

/* renamed from: com.pd.sdk.LLilL  reason: case insensitive filesystem */
public final class C5664LLilL<T> extends C5777LlIi<T> {

    /* renamed from: com.pd.sdk.LLilL$OooO00o */
    public class OooO00o implements C5777LlIi.OooO00o<T> {
        public final /* synthetic */ long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ TimeUnit f16493OooO00o;

        /* renamed from: com.pd.sdk.LLilL$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4921OooO00o implements liii1l {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ C5777LlIi.OooO0OO f16494OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ Long f16495OooO00o;

            public C4921OooO00o(C5777LlIi.OooO0OO oooO0OO, Long l) {
                this.f16494OooO00o = oooO0OO;
                this.f16495OooO00o = l;
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                this.f16494OooO00o.OooO00o(this.f16495OooO00o.longValue());
            }
        }

        public OooO00o(long j, TimeUnit timeUnit) {
            this.OooO00o = j;
            this.f16493OooO00o = timeUnit;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // com.p118pd.sdk.AbstractC9359IIIi
        public /* bridge */ /* synthetic */ LlIiLii OooO00o(Object obj, Long l, LL1LL.OooO00o oooO00o) {
            return OooO00o((C5777LlIi.OooO0OO) ((C5777LlIi.OooO0OO) obj), l, oooO00o);
        }

        public LlIiLii OooO00o(C5777LlIi.OooO0OO<T> oooO0OO, Long l, LL1LL.OooO00o oooO00o) {
            return oooO00o.OooO00o(new C4921OooO00o(oooO0OO, l), this.OooO00o, this.f16493OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.LLilL$OooO0O0 */
    public class OooO0O0 implements C5777LlIi.OooO0O0<T> {
        public final /* synthetic */ long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ TimeUnit f16496OooO00o;

        /* renamed from: com.pd.sdk.LLilL$OooO0O0$OooO00o */
        public class OooO00o implements liii1l {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ C5777LlIi.OooO0OO f16497OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ Long f16498OooO00o;

            public OooO00o(C5777LlIi.OooO0OO oooO0OO, Long l) {
                this.f16497OooO00o = oooO0OO;
                this.f16498OooO00o = l;
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                this.f16497OooO00o.OooO00o(this.f16498OooO00o.longValue());
            }
        }

        public OooO0O0(long j, TimeUnit timeUnit) {
            this.OooO00o = j;
            this.f16496OooO00o = timeUnit;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // com.p118pd.sdk.i1li1ii1
        public /* bridge */ /* synthetic */ LlIiLii OooO00o(Object obj, Long l, Object obj2, LL1LL.OooO00o oooO00o) {
            return OooO00o((C5777LlIi.OooO0OO) ((C5777LlIi.OooO0OO) obj), l, obj2, oooO00o);
        }

        public LlIiLii OooO00o(C5777LlIi.OooO0OO<T> oooO0OO, Long l, T t, LL1LL.OooO00o oooO00o) {
            return oooO00o.OooO00o(new OooO00o(oooO0OO, l), this.OooO00o, this.f16496OooO00o);
        }
    }

    public C5664LLilL(long j, TimeUnit timeUnit, C9349III<? extends T> r6, LL1LL ll1ll) {
        super(new OooO00o(j, timeUnit), new OooO0O0(j, timeUnit), r6, ll1ll);
    }

    @Override // com.p118pd.sdk.C5777LlIi
    public /* bridge */ /* synthetic */ AbstractC9508LiLi OooO00o(AbstractC9508LiLi r1) {
        return super.call(r1);
    }
}
