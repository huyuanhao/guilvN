package com.p118pd.sdk;

import com.p118pd.sdk.C5908LlLlI1;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.LLil11;
import p293rx.internal.producers.SingleProducer;

/* renamed from: com.pd.sdk.LiLl  reason: case insensitive filesystem */
public final class C5710LiLl<T, R> implements LLil11.OooOo00<R> {
    public final LLil11.OooOo00<T> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9349III.OooO0O0<? extends R, ? super T> f16608OooO00o;

    /* renamed from: com.pd.sdk.LiLl$OooO00o */
    public static final class OooO00o<T> extends AbstractC93021L<T> {
        public final AbstractC9508LiLi<? super T> OooO00o;

        public OooO00o(AbstractC9508LiLi<? super T> r1) {
            this.OooO00o = r1;
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void OooO00o(T t) {
            this.OooO00o.setProducer(new SingleProducer(this.OooO00o, t));
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void onError(Throwable th) {
            this.OooO00o.onError(th);
        }
    }

    public C5710LiLl(LLil11.OooOo00<T> oooOo00, C9349III.OooO0O0<? extends R, ? super T> oooO0O0) {
        this.OooO00o = oooOo00;
        this.f16608OooO00o = oooO0O0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: com.pd.sdk.丨III$OooO0O0 */
    /* JADX DEBUG: Multi-variable search result rejected for r0v4, resolved type: com.pd.sdk.LL丨il11$OooOo00<T> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: OooO00o */
    public void call(AbstractC93021L<? super R> r3) {
        C5908LlLlI1.OooO00o oooO00o = new C5908LlLlI1.OooO00o(r3);
        r3.OooO00o((LlIiLii) oooO00o);
        try {
            AbstractC9508LiLi r0 = (AbstractC9508LiLi) C9714lli.OooO0O0((C9349III.OooO0O0) this.f16608OooO00o).call(oooO00o);
            AbstractC93021L OooO00o2 = OooO00o(r0);
            r0.onStart();
            this.OooO00o.call(OooO00o2);
        } catch (Throwable th) {
            IIl11.OooO00o(th, r3);
        }
    }

    public static <T> AbstractC93021L<T> OooO00o(AbstractC9508LiLi<T> r1) {
        OooO00o oooO00o = new OooO00o(r1);
        r1.add(oooO00o);
        return oooO00o;
    }
}
