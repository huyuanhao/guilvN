package com.p118pd.sdk;

import com.p118pd.sdk.C5876LlIl;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.pd.sdk.llL1  reason: case insensitive filesystem */
public final class C6763llL1 implements C5876LlIl.AbstractC5898Oooo0O0 {
    public final C5876LlIl[] OooO00o;

    /* renamed from: com.pd.sdk.llL1$OooO00o */
    public class OooO00o implements AbstractC6473l1II {
        public final /* synthetic */ IIlIIiI1 OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC6473l1II f18752OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Queue f18754OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicInteger f18755OooO00o;

        public OooO00o(IIlIIiI1 iIlIIiI1, Queue queue, AtomicInteger atomicInteger, AbstractC6473l1II r5) {
            this.OooO00o = iIlIIiI1;
            this.f18754OooO00o = queue;
            this.f18755OooO00o = atomicInteger;
            this.f18752OooO00o = r5;
        }

        public void OooO00o() {
            if (this.f18755OooO00o.decrementAndGet() != 0) {
                return;
            }
            if (this.f18754OooO00o.isEmpty()) {
                this.f18752OooO00o.onCompleted();
            } else {
                this.f18752OooO00o.onError(i11IL.OooO00o(this.f18754OooO00o));
            }
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onCompleted() {
            OooO00o();
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onError(Throwable th) {
            this.f18754OooO00o.offer(th);
            OooO00o();
        }

        @Override // com.p118pd.sdk.AbstractC6473l1II
        public void onSubscribe(LlIiLii llIiLii) {
            this.OooO00o.OooO00o(llIiLii);
        }
    }

    public C6763llL1(C5876LlIl[] r1) {
        this.OooO00o = r1;
    }

    /* renamed from: OooO00o */
    public void call(AbstractC6473l1II r15) {
        IIlIIiI1 iIlIIiI1 = new IIlIIiI1();
        AtomicInteger atomicInteger = new AtomicInteger(this.OooO00o.length + 1);
        ConcurrentLinkedQueue concurrentLinkedQueue = new ConcurrentLinkedQueue();
        r15.onSubscribe(iIlIIiI1);
        C5876LlIl[] r9 = this.OooO00o;
        for (C5876LlIl r12 : r9) {
            if (!iIlIIiI1.isUnsubscribed()) {
                if (r12 == null) {
                    concurrentLinkedQueue.offer(new NullPointerException("A completable source is null"));
                    atomicInteger.decrementAndGet();
                } else {
                    r12.OooO0O0(new OooO00o(iIlIIiI1, concurrentLinkedQueue, atomicInteger, r15));
                }
            } else {
                return;
            }
        }
        if (atomicInteger.decrementAndGet() != 0) {
            return;
        }
        if (concurrentLinkedQueue.isEmpty()) {
            r15.onCompleted();
        } else {
            r15.onError(i11IL.OooO00o(concurrentLinkedQueue));
        }
    }
}
