package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.pd.sdk.IiLiiii1  reason: case insensitive filesystem */
public final class C5358IiLiiii1<T, TClosing> implements C9349III.OooO0O0<List<T>, T> {
    public final LiLIll<? extends C9349III<? extends TClosing>> OooO00o;
    public final int o00oO0O;

    /* renamed from: com.pd.sdk.IiLiiii1$OooO00o */
    public class OooO00o implements LiLIll<C9349III<? extends TClosing>> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C9349III f15721OooO00o;

        public OooO00o(C9349III r2) {
            this.f15721OooO00o = r2;
        }

        /* renamed from: OooO00o */
        public C9349III<? extends TClosing> call() {
            return this.f15721OooO00o;
        }
    }

    /* renamed from: com.pd.sdk.IiLiiii1$OooO0O0 */
    public class OooO0O0 extends AbstractC9508LiLi<TClosing> {
        public final /* synthetic */ OooO0OO OooO00o;

        public OooO0O0(OooO0OO oooO0OO) {
            this.OooO00o = oooO0OO;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(TClosing tclosing) {
            this.OooO00o.OooO0OO();
        }
    }

    /* renamed from: com.pd.sdk.IiLiiii1$OooO0OO */
    public final class OooO0OO extends AbstractC9508LiLi<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super List<T>> f15723OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public List<T> f15724OooO00o;
        public boolean OooO0O0;

        public OooO0OO(AbstractC9508LiLi<? super List<T>> r2) {
            this.f15723OooO00o = r2;
            this.f15724OooO00o = new ArrayList(C5358IiLiiii1.this.o00oO0O);
        }

        public void OooO0OO() {
            synchronized (this) {
                if (!this.OooO0O0) {
                    List<T> list = this.f15724OooO00o;
                    this.f15724OooO00o = new ArrayList(C5358IiLiiii1.this.o00oO0O);
                    try {
                        this.f15723OooO00o.onNext(list);
                    } catch (Throwable th) {
                        unsubscribe();
                        synchronized (this) {
                            if (!this.OooO0O0) {
                                this.OooO0O0 = true;
                                IIl11.OooO00o(th, this.f15723OooO00o);
                            }
                        }
                    }
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            try {
                synchronized (this) {
                    if (!this.OooO0O0) {
                        this.OooO0O0 = true;
                        List<T> list = this.f15724OooO00o;
                        this.f15724OooO00o = null;
                        this.f15723OooO00o.onNext(list);
                        this.f15723OooO00o.onCompleted();
                        unsubscribe();
                    }
                }
            } catch (Throwable th) {
                IIl11.OooO00o(th, this.f15723OooO00o);
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            synchronized (this) {
                if (!this.OooO0O0) {
                    this.OooO0O0 = true;
                    this.f15724OooO00o = null;
                    this.f15723OooO00o.onError(th);
                    unsubscribe();
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            synchronized (this) {
                if (!this.OooO0O0) {
                    this.f15724OooO00o.add(t);
                }
            }
        }
    }

    public C5358IiLiiii1(LiLIll<? extends C9349III<? extends TClosing>> r1, int i) {
        this.OooO00o = r1;
        this.o00oO0O = i;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super List<T>> r4) {
        try {
            C9349III r0 = (C9349III) this.OooO00o.call();
            OooO0OO oooO0OO = new OooO0OO(new IL11lL(r4));
            OooO0O0 oooO0O0 = new OooO0O0(oooO0OO);
            r4.add(oooO0O0);
            r4.add(oooO0OO);
            r0.OooO0O0((AbstractC9508LiLi) oooO0O0);
            return oooO0OO;
        } catch (Throwable th) {
            IIl11.OooO00o(th, r4);
            return C6695lilIl.OooO00o();
        }
    }

    public C5358IiLiiii1(C9349III<? extends TClosing> r2, int i) {
        this.OooO00o = new OooO00o(r2);
        this.o00oO0O = i;
    }
}
