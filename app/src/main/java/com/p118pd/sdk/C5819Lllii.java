package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;

/* renamed from: com.pd.sdk.Ll丨lii  reason: invalid class name and case insensitive filesystem */
public final class C5819Lllii<T> implements C9349III.OooO0O0<T, T> {
    public final AbstractC5189I1l1l<? super T, ? super Integer, Boolean> OooO00o;

    /* renamed from: com.pd.sdk.Ll丨lii$OooO00o */
    public class OooO00o implements AbstractC5189I1l1l<T, Integer, Boolean> {
        public final /* synthetic */ AbstractC9847l1 OooO00o;

        public OooO00o(AbstractC9847l1 r1) {
            this.OooO00o = r1;
        }

        public Boolean OooO00o(T t, Integer num) {
            return (Boolean) this.OooO00o.call(t);
        }
    }

    /* renamed from: com.pd.sdk.Ll丨lii$OooO0O0 */
    public class OooO0O0 extends AbstractC9508LiLi<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f16777OooO00o;
        public boolean OooO0O0;
        public int o00oO0O;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO0O0(AbstractC9508LiLi r2, boolean z, AbstractC9508LiLi r4) {
            super(r2, z);
            this.f16777OooO00o = r4;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.OooO0O0) {
                this.f16777OooO00o.onCompleted();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (!this.OooO0O0) {
                this.f16777OooO00o.onError(th);
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            try {
                AbstractC5189I1l1l<? super T, ? super Integer, Boolean> r1 = C5819Lllii.this.OooO00o;
                int i = this.o00oO0O;
                this.o00oO0O = i + 1;
                if (r1.OooO00o(t, Integer.valueOf(i)).booleanValue()) {
                    this.f16777OooO00o.onNext(t);
                    return;
                }
                this.OooO0O0 = true;
                this.f16777OooO00o.onCompleted();
                unsubscribe();
            } catch (Throwable th) {
                this.OooO0O0 = true;
                IIl11.OooO00o(th, this.f16777OooO00o, t);
                unsubscribe();
            }
        }
    }

    public C5819Lllii(AbstractC9847l1<? super T, Boolean> r2) {
        this(new OooO00o(r2));
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r3) {
        OooO0O0 oooO0O0 = new OooO0O0(r3, false, r3);
        r3.add(oooO0O0);
        return oooO0O0;
    }

    public C5819Lllii(AbstractC5189I1l1l<? super T, ? super Integer, Boolean> r1) {
        this.OooO00o = r1;
    }
}
