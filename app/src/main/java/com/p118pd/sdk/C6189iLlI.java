package com.p118pd.sdk;

import com.p118pd.sdk.LLil11;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.pd.sdk.iLlI  reason: case insensitive filesystem */
public final class C6189iLlI {

    /* renamed from: com.pd.sdk.iLlI$OooO00o */
    public static class OooO00o implements LLil11.OooOo00<R> {
        public final /* synthetic */ AbstractC6021i1L OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ LLil11[] f17771OooO00o;

        /* renamed from: com.pd.sdk.iLlI$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4936OooO00o extends AbstractC93021L<T> {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AbstractC93021L f17772OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AtomicBoolean f17773OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AtomicInteger f17774OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ Object[] f17775OooO00o;
            public final /* synthetic */ int o00oO0O;

            public C4936OooO00o(Object[] objArr, int i, AtomicInteger atomicInteger, AbstractC93021L r5, AtomicBoolean atomicBoolean) {
                this.f17775OooO00o = objArr;
                this.o00oO0O = i;
                this.f17774OooO00o = atomicInteger;
                this.f17772OooO00o = r5;
                this.f17773OooO00o = atomicBoolean;
            }

            @Override // com.p118pd.sdk.AbstractC93021L
            public void OooO00o(T t) {
                this.f17775OooO00o[this.o00oO0O] = t;
                if (this.f17774OooO00o.decrementAndGet() == 0) {
                    try {
                        this.f17772OooO00o.OooO00o(OooO00o.this.OooO00o.call(this.f17775OooO00o));
                    } catch (Throwable th) {
                        IIl11.m15447OooO00o(th);
                        onError(th);
                    }
                }
            }

            @Override // com.p118pd.sdk.AbstractC93021L
            public void onError(Throwable th) {
                if (this.f17773OooO00o.compareAndSet(false, true)) {
                    this.f17772OooO00o.onError(th);
                } else {
                    C9714lli.m21756OooO00o(th);
                }
            }
        }

        public OooO00o(LLil11[] r1, AbstractC6021i1L i1l) {
            this.f17771OooO00o = r1;
            this.OooO00o = i1l;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC93021L<? super R> r14) {
            if (this.f17771OooO00o.length == 0) {
                r14.onError(new NoSuchElementException("Can't zip 0 Singles."));
                return;
            }
            AtomicInteger atomicInteger = new AtomicInteger(this.f17771OooO00o.length);
            AtomicBoolean atomicBoolean = new AtomicBoolean();
            Object[] objArr = new Object[this.f17771OooO00o.length];
            IIlIIiI1 iIlIIiI1 = new IIlIIiI1();
            r14.OooO00o((LlIiLii) iIlIIiI1);
            for (int i = 0; i < this.f17771OooO00o.length && !iIlIIiI1.isUnsubscribed() && !atomicBoolean.get(); i++) {
                C4936OooO00o oooO00o = new C4936OooO00o(objArr, i, atomicInteger, r14, atomicBoolean);
                iIlIIiI1.OooO00o(oooO00o);
                if (!iIlIIiI1.isUnsubscribed() && !atomicBoolean.get()) {
                    this.f17771OooO00o[i].OooO00o((AbstractC93021L) oooO00o);
                } else {
                    return;
                }
            }
        }
    }

    public C6189iLlI() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, R> LLil11<R> OooO00o(LLil11<? extends T>[] r1, AbstractC6021i1L<? extends R> i1l) {
        return LLil11.OooO00o((LLil11.OooOo00) new OooO00o(r1, i1l));
    }
}
