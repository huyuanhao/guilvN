package com.p118pd.sdk;

import com.p118pd.sdk.C5876LlIl;
import com.p118pd.sdk.LL1LL;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.pd.sdk.丨l1i  reason: invalid class name and case insensitive filesystem */
public final class C9658l1i implements C5876LlIl.AbstractC5898Oooo0O0 {
    public final long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LL1LL f23264OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C5876LlIl f23265OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final TimeUnit f23266OooO00o;
    public final C5876LlIl OooO0O0;

    /* renamed from: com.pd.sdk.丨l1i$OooO00o */
    public class OooO00o implements liii1l {
        public final /* synthetic */ IIlIIiI1 OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC6473l1II f23267OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicBoolean f23269OooO00o;

        /* renamed from: com.pd.sdk.丨l1i$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4979OooO00o implements AbstractC6473l1II {
            public C4979OooO00o() {
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onCompleted() {
                OooO00o.this.OooO00o.unsubscribe();
                OooO00o.this.f23267OooO00o.onCompleted();
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onError(Throwable th) {
                OooO00o.this.OooO00o.unsubscribe();
                OooO00o.this.f23267OooO00o.onError(th);
            }

            @Override // com.p118pd.sdk.AbstractC6473l1II
            public void onSubscribe(LlIiLii llIiLii) {
                OooO00o.this.OooO00o.OooO00o(llIiLii);
            }
        }

        public OooO00o(AtomicBoolean atomicBoolean, IIlIIiI1 iIlIIiI1, AbstractC6473l1II r4) {
            this.f23269OooO00o = atomicBoolean;
            this.OooO00o = iIlIIiI1;
            this.f23267OooO00o = r4;
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            if (this.f23269OooO00o.compareAndSet(false, true)) {
                this.OooO00o.OooO00o();
                C5876LlIl r0 = C9658l1i.this.OooO0O0;
                if (r0 == null) {
                    this.f23267OooO00o.onError(new TimeoutException());
                } else {
                    r0.OooO0O0(new C4979OooO00o());
                }
            }
        }
    }

    /* renamed from: com.pd.sdk.丨l1i$OooO0O0 */
    public class OooO0O0 implements AbstractC6473l1II {
        public final /* synthetic */ IIlIIiI1 OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC6473l1II f23270OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicBoolean f23272OooO00o;

        public OooO0O0(IIlIIiI1 iIlIIiI1, AtomicBoolean atomicBoolean, AbstractC6473l1II r4) {
            this.OooO00o = iIlIIiI1;
            this.f23272OooO00o = atomicBoolean;
            this.f23270OooO00o = r4;
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onCompleted() {
            if (this.f23272OooO00o.compareAndSet(false, true)) {
                this.OooO00o.unsubscribe();
                this.f23270OooO00o.onCompleted();
            }
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onError(Throwable th) {
            if (this.f23272OooO00o.compareAndSet(false, true)) {
                this.OooO00o.unsubscribe();
                this.f23270OooO00o.onError(th);
                return;
            }
            C9714lli.m21756OooO00o(th);
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onSubscribe(LlIiLii llIiLii) {
            this.OooO00o.OooO00o(llIiLii);
        }
    }

    public C9658l1i(C5876LlIl r1, long j, TimeUnit timeUnit, LL1LL ll1ll, C5876LlIl r6) {
        this.f23265OooO00o = r1;
        this.OooO00o = j;
        this.f23266OooO00o = timeUnit;
        this.f23264OooO00o = ll1ll;
        this.OooO0O0 = r6;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC6473l1II r8) {
        IIlIIiI1 iIlIIiI1 = new IIlIIiI1();
        r8.onSubscribe(iIlIIiI1);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        LL1LL.OooO00o OooO00o2 = this.f23264OooO00o.m16172OooO00o();
        iIlIIiI1.OooO00o(OooO00o2);
        OooO00o2.OooO00o(new OooO00o(atomicBoolean, iIlIIiI1, r8), this.OooO00o, this.f23266OooO00o);
        this.f23265OooO00o.OooO0O0(new OooO0O0(iIlIIiI1, atomicBoolean, r8));
    }
}
