package com.p118pd.sdk;

import com.p118pd.sdk.C5876LlIl;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.pd.sdk.IL丨1  reason: invalid class name and case insensitive filesystem */
public final class C5327IL1 implements C5876LlIl.AbstractC5898Oooo0O0 {
    public final C5876LlIl[] OooO00o;

    /* renamed from: com.pd.sdk.IL丨1$OooO00o */
    public class OooO00o implements AbstractC6473l1II {
        public final /* synthetic */ IIlIIiI1 OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC6473l1II f15641OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicBoolean f15642OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicInteger f15643OooO00o;

        public OooO00o(IIlIIiI1 iIlIIiI1, AtomicBoolean atomicBoolean, AbstractC6473l1II r4, AtomicInteger atomicInteger) {
            this.OooO00o = iIlIIiI1;
            this.f15642OooO00o = atomicBoolean;
            this.f15641OooO00o = r4;
            this.f15643OooO00o = atomicInteger;
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onCompleted() {
            if (this.f15643OooO00o.decrementAndGet() == 0 && this.f15642OooO00o.compareAndSet(false, true)) {
                this.f15641OooO00o.onCompleted();
            }
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onError(Throwable th) {
            this.OooO00o.unsubscribe();
            if (this.f15642OooO00o.compareAndSet(false, true)) {
                this.f15641OooO00o.onError(th);
            } else {
                C9714lli.m21756OooO00o(th);
            }
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onSubscribe(LlIiLii llIiLii) {
            this.OooO00o.OooO00o(llIiLii);
        }
    }

    public C5327IL1(C5876LlIl[] r1) {
        this.OooO00o = r1;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC6473l1II r17) {
        IIlIIiI1 iIlIIiI1 = new IIlIIiI1();
        boolean z = true;
        AtomicInteger atomicInteger = new AtomicInteger(this.OooO00o.length + 1);
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        r17.onSubscribe(iIlIIiI1);
        C5876LlIl[] r12 = this.OooO00o;
        int length = r12.length;
        boolean z2 = false;
        int i = 0;
        while (i < length) {
            C5876LlIl r5 = r12[i];
            if (!iIlIIiI1.isUnsubscribed()) {
                if (r5 == null) {
                    iIlIIiI1.unsubscribe();
                    Throwable nullPointerException = new NullPointerException("A completable source is null");
                    if (atomicBoolean.compareAndSet(z2, z)) {
                        r17.onError(nullPointerException);
                        return;
                    }
                    C9714lli.m21756OooO00o(nullPointerException);
                }
                r5.OooO0O0(new OooO00o(iIlIIiI1, atomicBoolean, r17, atomicInteger));
                i++;
                z = true;
                z2 = false;
            } else {
                return;
            }
        }
        if (atomicInteger.decrementAndGet() == 0 && atomicBoolean.compareAndSet(false, true)) {
            r17.onCompleted();
        }
    }
}
