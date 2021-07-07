package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.pd.sdk.lLIiLLI1 */
public final class lLIiLLI1<T, R> extends i11iiILl<R> {
    public final LiLIll<? extends AbstractC5635LIi1<? super T, ? extends R>> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LlIiLii f18480OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9349III<? extends T> f18481OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9508LiLi<T> f18482OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Object f18483OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<AbstractC9508LiLi<? super R>> f18484OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AtomicReference<AbstractC5635LIi1<? super T, ? extends R>> f18485OooO00o;

    /* renamed from: com.pd.sdk.lLIiLLI1$OooO00o */
    public class OooO00o implements C9349III.OooO00o<R> {
        public final /* synthetic */ Object OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ List f18486OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicReference f18487OooO00o;

        public OooO00o(Object obj, AtomicReference atomicReference, List list) {
            this.OooO00o = obj;
            this.f18487OooO00o = atomicReference;
            this.f18486OooO00o = list;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC9508LiLi<? super R> r3) {
            synchronized (this.OooO00o) {
                if (this.f18487OooO00o.get() == null) {
                    this.f18486OooO00o.add(r3);
                } else {
                    ((AbstractC5635LIi1) this.f18487OooO00o.get()).OooO0O0((AbstractC9508LiLi) r3);
                }
            }
        }
    }

    /* renamed from: com.pd.sdk.lLIiLLI1$OooO0O0 */
    public class OooO0O0 implements liii1l {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicReference f18488OooO00o;

        public OooO0O0(AtomicReference atomicReference) {
            this.f18488OooO00o = atomicReference;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0026, code lost:
            if (r1 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0028, code lost:
            r1.unsubscribe();
         */
        @Override // com.p118pd.sdk.liii1l
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void call() {
            /*
                r4 = this;
                com.pd.sdk.lLIiLLI1 r0 = com.p118pd.sdk.lLIiLLI1.this
                java.lang.Object r0 = r0.f18483OooO00o
                monitor-enter(r0)
                com.pd.sdk.lLIiLLI1 r1 = com.p118pd.sdk.lLIiLLI1.this     // Catch:{ all -> 0x002e }
                com.pd.sdk.LlIiLii r1 = r1.f18480OooO00o     // Catch:{ all -> 0x002e }
                java.util.concurrent.atomic.AtomicReference r2 = r4.f18488OooO00o     // Catch:{ all -> 0x002e }
                java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x002e }
                if (r1 != r2) goto L_0x002c
                com.pd.sdk.lLIiLLI1 r1 = com.p118pd.sdk.lLIiLLI1.this     // Catch:{ all -> 0x002e }
                com.pd.sdk.丨LiL丨丨i<T> r1 = r1.f18482OooO00o     // Catch:{ all -> 0x002e }
                com.pd.sdk.lLIiLLI1 r2 = com.p118pd.sdk.lLIiLLI1.this     // Catch:{ all -> 0x002e }
                r3 = 0
                r2.f18482OooO00o = r3     // Catch:{ all -> 0x002e }
                com.pd.sdk.lLIiLLI1 r2 = com.p118pd.sdk.lLIiLLI1.this     // Catch:{ all -> 0x002e }
                r2.f18480OooO00o = r3     // Catch:{ all -> 0x002e }
                com.pd.sdk.lLIiLLI1 r2 = com.p118pd.sdk.lLIiLLI1.this     // Catch:{ all -> 0x002e }
                java.util.concurrent.atomic.AtomicReference<com.pd.sdk.LIi丨丨1<? super T, ? extends R>> r2 = r2.f18485OooO00o     // Catch:{ all -> 0x002e }
                r2.set(r3)     // Catch:{ all -> 0x002e }
                monitor-exit(r0)     // Catch:{ all -> 0x002e }
                if (r1 == 0) goto L_0x002b
                r1.unsubscribe()
            L_0x002b:
                return
            L_0x002c:
                monitor-exit(r0)
                return
            L_0x002e:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.lLIiLLI1.OooO0O0.call():void");
        }
    }

    /* renamed from: com.pd.sdk.lLIiLLI1$OooO0OO */
    public class OooO0OO extends AbstractC9508LiLi<R> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f18489OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO0OO(AbstractC9508LiLi r2, AbstractC9508LiLi r3) {
            super(r2);
            this.f18489OooO00o = r3;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.f18489OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f18489OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(R r) {
            this.f18489OooO00o.onNext(r);
        }
    }

    public lLIiLLI1(C9349III<? extends T> r7, LiLIll<? extends AbstractC5635LIi1<? super T, ? extends R>> r8) {
        this(new Object(), new AtomicReference(), new ArrayList(), r7, r8);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005b, code lost:
        r6.call(r5.f18480OooO00o);
        r6 = r5.f18483OooO00o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0062, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r0 = r5.f18482OooO00o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0065, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0066, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0068, code lost:
        r5.f18481OooO00o.OooO00o((com.p118pd.sdk.AbstractC9508LiLi<? super java.lang.Object>) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
        return;
     */
    @Override // com.p118pd.sdk.C9349III, com.p118pd.sdk.i11iiILl
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO0O0(com.p118pd.sdk.AbstractC6153iL1l<? super com.p118pd.sdk.LlIiLii> r6) {
        /*
        // Method dump skipped, instructions count: 118
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.lLIiLLI1.OooO0O0(com.pd.sdk.iL1l):void");
    }

    public lLIiLLI1(Object obj, AtomicReference<AbstractC5635LIi1<? super T, ? extends R>> atomicReference, List<AbstractC9508LiLi<? super R>> list, C9349III<? extends T> r5, LiLIll<? extends AbstractC5635LIi1<? super T, ? extends R>> r6) {
        super(new OooO00o(obj, atomicReference, list));
        this.f18483OooO00o = obj;
        this.f18485OooO00o = atomicReference;
        this.f18484OooO00o = list;
        this.f18481OooO00o = r5;
        this.OooO00o = r6;
    }
}
