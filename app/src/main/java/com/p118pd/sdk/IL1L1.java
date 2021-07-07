package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.LL1LL;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: com.pd.sdk.IL1L1 */
public final class IL1L1<T> implements C9349III.OooO0O0<List<T>, T> {
    public final long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LL1LL f15550OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final TimeUnit f15551OooO00o;
    public final long OooO0O0;
    public final int o00oO0O;

    /* renamed from: com.pd.sdk.IL1L1$OooO00o */
    public final class OooO00o extends AbstractC9508LiLi<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final LL1LL.OooO00o f15552OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super List<T>> f15553OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public List<T> f15554OooO00o = new ArrayList();
        public boolean OooO0O0;

        /* renamed from: com.pd.sdk.IL1L1$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4912OooO00o implements liii1l {
            public C4912OooO00o() {
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                OooO00o.this.OooO0OO();
            }
        }

        public OooO00o(AbstractC9508LiLi<? super List<T>> r2, LL1LL.OooO00o oooO00o) {
            this.f15553OooO00o = r2;
            this.f15552OooO00o = oooO00o;
        }

        public void OooO0OO() {
            synchronized (this) {
                if (!this.OooO0O0) {
                    List<T> list = this.f15554OooO00o;
                    this.f15554OooO00o = new ArrayList();
                    try {
                        this.f15553OooO00o.onNext(list);
                    } catch (Throwable th) {
                        IIl11.OooO00o(th, this);
                    }
                }
            }
        }

        public void OooO0Oo() {
            LL1LL.OooO00o oooO00o = this.f15552OooO00o;
            C4912OooO00o oooO00o2 = new C4912OooO00o();
            IL1L1 il1l1 = IL1L1.this;
            long j = il1l1.OooO00o;
            oooO00o.OooO00o(oooO00o2, j, j, il1l1.f15551OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            try {
                this.f15552OooO00o.unsubscribe();
                synchronized (this) {
                    if (!this.OooO0O0) {
                        this.OooO0O0 = true;
                        List<T> list = this.f15554OooO00o;
                        this.f15554OooO00o = null;
                        this.f15553OooO00o.onNext(list);
                        this.f15553OooO00o.onCompleted();
                        unsubscribe();
                    }
                }
            } catch (Throwable th) {
                IIl11.OooO00o(th, this.f15553OooO00o);
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            synchronized (this) {
                if (!this.OooO0O0) {
                    this.OooO0O0 = true;
                    this.f15554OooO00o = null;
                    this.f15553OooO00o.onError(th);
                    unsubscribe();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0024, code lost:
            if (r2 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0026, code lost:
            r1.f15553OooO00o.onNext(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            return;
         */
        @Override // com.p118pd.sdk.AbstractC5477Il11
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onNext(T r2) {
            /*
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.OooO0O0     // Catch:{ all -> 0x002c }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r1)     // Catch:{ all -> 0x002c }
                return
            L_0x0007:
                java.util.List<T> r0 = r1.f15554OooO00o     // Catch:{ all -> 0x002c }
                r0.add(r2)     // Catch:{ all -> 0x002c }
                java.util.List<T> r2 = r1.f15554OooO00o     // Catch:{ all -> 0x002c }
                int r2 = r2.size()     // Catch:{ all -> 0x002c }
                com.pd.sdk.IL1L1 r0 = com.p118pd.sdk.IL1L1.this     // Catch:{ all -> 0x002c }
                int r0 = r0.o00oO0O     // Catch:{ all -> 0x002c }
                if (r2 != r0) goto L_0x0022
                java.util.List<T> r2 = r1.f15554OooO00o     // Catch:{ all -> 0x002c }
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x002c }
                r0.<init>()     // Catch:{ all -> 0x002c }
                r1.f15554OooO00o = r0     // Catch:{ all -> 0x002c }
                goto L_0x0023
            L_0x0022:
                r2 = 0
            L_0x0023:
                monitor-exit(r1)     // Catch:{ all -> 0x002c }
                if (r2 == 0) goto L_0x002b
                com.pd.sdk.丨LiL丨丨i<? super java.util.List<T>> r0 = r1.f15553OooO00o
                r0.onNext(r2)
            L_0x002b:
                return
            L_0x002c:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.IL1L1.OooO00o.onNext(java.lang.Object):void");
        }
    }

    /* renamed from: com.pd.sdk.IL1L1$OooO0O0 */
    public final class OooO0O0 extends AbstractC9508LiLi<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final LL1LL.OooO00o f15555OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super List<T>> f15556OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final List<List<T>> f15557OooO00o = new LinkedList();
        public boolean OooO0O0;

        /* renamed from: com.pd.sdk.IL1L1$OooO0O0$OooO00o */
        public class OooO00o implements liii1l {
            public OooO00o() {
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                OooO0O0.this.OooO0Oo();
            }
        }

        /* renamed from: com.pd.sdk.IL1L1$OooO0O0$OooO0O0  reason: collision with other inner class name */
        public class C4913OooO0O0 implements liii1l {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ List f15558OooO00o;

            public C4913OooO0O0(List list) {
                this.f15558OooO00o = list;
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                OooO0O0.this.OooO00o(this.f15558OooO00o);
            }
        }

        public OooO0O0(AbstractC9508LiLi<? super List<T>> r2, LL1LL.OooO00o oooO00o) {
            this.f15556OooO00o = r2;
            this.f15555OooO00o = oooO00o;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
            if (r0 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            r2.f15556OooO00o.onNext(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x002a, code lost:
            r3 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
            com.p118pd.sdk.IIl11.OooO00o(r3, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void OooO00o(java.util.List<T> r3) {
            /*
                r2 = this;
                monitor-enter(r2)
                boolean r0 = r2.OooO0O0     // Catch:{ all -> 0x002f }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r2)     // Catch:{ all -> 0x002f }
                return
            L_0x0007:
                java.util.List<java.util.List<T>> r0 = r2.f15557OooO00o     // Catch:{ all -> 0x002f }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x002f }
            L_0x000d:
                boolean r1 = r0.hasNext()     // Catch:{ all -> 0x002f }
                if (r1 == 0) goto L_0x0020
                java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x002f }
                java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x002f }
                if (r1 != r3) goto L_0x000d
                r0.remove()     // Catch:{ all -> 0x002f }
                r0 = 1
                goto L_0x0021
            L_0x0020:
                r0 = 0
            L_0x0021:
                monitor-exit(r2)     // Catch:{ all -> 0x002f }
                if (r0 == 0) goto L_0x002e
                com.pd.sdk.丨LiL丨丨i<? super java.util.List<T>> r0 = r2.f15556OooO00o     // Catch:{ all -> 0x002a }
                r0.onNext(r3)     // Catch:{ all -> 0x002a }
                goto L_0x002e
            L_0x002a:
                r3 = move-exception
                com.p118pd.sdk.IIl11.OooO00o(r3, r2)
            L_0x002e:
                return
            L_0x002f:
                r3 = move-exception
                monitor-exit(r2)
                goto L_0x0033
            L_0x0032:
                throw r3
            L_0x0033:
                goto L_0x0032
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.IL1L1.OooO0O0.OooO00o(java.util.List):void");
        }

        public void OooO0OO() {
            LL1LL.OooO00o oooO00o = this.f15555OooO00o;
            OooO00o oooO00o2 = new OooO00o();
            IL1L1 il1l1 = IL1L1.this;
            long j = il1l1.OooO0O0;
            oooO00o.OooO00o(oooO00o2, j, j, il1l1.f15551OooO00o);
        }

        public void OooO0Oo() {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                if (!this.OooO0O0) {
                    this.f15557OooO00o.add(arrayList);
                    LL1LL.OooO00o oooO00o = this.f15555OooO00o;
                    C4913OooO0O0 oooO0O0 = new C4913OooO0O0(arrayList);
                    IL1L1 il1l1 = IL1L1.this;
                    oooO00o.OooO00o(oooO0O0, il1l1.OooO00o, il1l1.f15551OooO00o);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
            if (r0.hasNext() == false) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
            r3.f15556OooO00o.onNext((java.util.List) r0.next());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
            r3.f15556OooO00o.onCompleted();
            unsubscribe();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            r0 = r0.iterator();
         */
        @Override // com.p118pd.sdk.AbstractC5477Il11
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onCompleted() {
            /*
                r3 = this;
                monitor-enter(r3)     // Catch:{ all -> 0x0039 }
                boolean r0 = r3.OooO0O0     // Catch:{ all -> 0x0036 }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r3)     // Catch:{ all -> 0x0036 }
                return
            L_0x0007:
                r0 = 1
                r3.OooO0O0 = r0     // Catch:{ all -> 0x0036 }
                java.util.LinkedList r0 = new java.util.LinkedList     // Catch:{ all -> 0x0036 }
                java.util.List<java.util.List<T>> r1 = r3.f15557OooO00o     // Catch:{ all -> 0x0036 }
                r0.<init>(r1)     // Catch:{ all -> 0x0036 }
                java.util.List<java.util.List<T>> r1 = r3.f15557OooO00o     // Catch:{ all -> 0x0036 }
                r1.clear()     // Catch:{ all -> 0x0036 }
                monitor-exit(r3)     // Catch:{ all -> 0x0036 }
                java.util.Iterator r0 = r0.iterator()
            L_0x001b:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x002d
                java.lang.Object r1 = r0.next()
                java.util.List r1 = (java.util.List) r1
                com.pd.sdk.丨LiL丨丨i<? super java.util.List<T>> r2 = r3.f15556OooO00o
                r2.onNext(r1)
                goto L_0x001b
            L_0x002d:
                com.pd.sdk.丨LiL丨丨i<? super java.util.List<T>> r0 = r3.f15556OooO00o
                r0.onCompleted()
                r3.unsubscribe()
                return
            L_0x0036:
                r0 = move-exception
                monitor-exit(r3)
                throw r0
            L_0x0039:
                r0 = move-exception
                com.pd.sdk.丨LiL丨丨i<? super java.util.List<T>> r1 = r3.f15556OooO00o
                com.p118pd.sdk.IIl11.OooO00o(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.IL1L1.OooO0O0.onCompleted():void");
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            synchronized (this) {
                if (!this.OooO0O0) {
                    this.OooO0O0 = true;
                    this.f15557OooO00o.clear();
                    this.f15556OooO00o.onError(th);
                    unsubscribe();
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0036, code lost:
            if (r1 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0038, code lost:
            r6 = r1.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
            if (r6.hasNext() == false) goto L_0x004e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
            r5.f15556OooO00o.onNext((java.util.List) r6.next());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
            return;
         */
        @Override // com.p118pd.sdk.AbstractC5477Il11
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onNext(T r6) {
            /*
                r5 = this;
                monitor-enter(r5)
                boolean r0 = r5.OooO0O0     // Catch:{ all -> 0x004f }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r5)     // Catch:{ all -> 0x004f }
                return
            L_0x0007:
                java.util.List<java.util.List<T>> r0 = r5.f15557OooO00o     // Catch:{ all -> 0x004f }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x004f }
                r1 = 0
            L_0x000e:
                boolean r2 = r0.hasNext()     // Catch:{ all -> 0x004f }
                if (r2 == 0) goto L_0x0035
                java.lang.Object r2 = r0.next()     // Catch:{ all -> 0x004f }
                java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x004f }
                r2.add(r6)     // Catch:{ all -> 0x004f }
                int r3 = r2.size()     // Catch:{ all -> 0x004f }
                com.pd.sdk.IL1L1 r4 = com.p118pd.sdk.IL1L1.this     // Catch:{ all -> 0x004f }
                int r4 = r4.o00oO0O     // Catch:{ all -> 0x004f }
                if (r3 != r4) goto L_0x000e
                r0.remove()     // Catch:{ all -> 0x004f }
                if (r1 != 0) goto L_0x0031
                java.util.LinkedList r1 = new java.util.LinkedList     // Catch:{ all -> 0x004f }
                r1.<init>()     // Catch:{ all -> 0x004f }
            L_0x0031:
                r1.add(r2)     // Catch:{ all -> 0x004f }
                goto L_0x000e
            L_0x0035:
                monitor-exit(r5)     // Catch:{ all -> 0x004f }
                if (r1 == 0) goto L_0x004e
                java.util.Iterator r6 = r1.iterator()
            L_0x003c:
                boolean r0 = r6.hasNext()
                if (r0 == 0) goto L_0x004e
                java.lang.Object r0 = r6.next()
                java.util.List r0 = (java.util.List) r0
                com.pd.sdk.丨LiL丨丨i<? super java.util.List<T>> r1 = r5.f15556OooO00o
                r1.onNext(r0)
                goto L_0x003c
            L_0x004e:
                return
            L_0x004f:
                r6 = move-exception
                monitor-exit(r5)
                goto L_0x0053
            L_0x0052:
                throw r6
            L_0x0053:
                goto L_0x0052
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.IL1L1.OooO0O0.onNext(java.lang.Object):void");
        }
    }

    public IL1L1(long j, long j2, TimeUnit timeUnit, int i, LL1LL ll1ll) {
        this.OooO00o = j;
        this.OooO0O0 = j2;
        this.f15551OooO00o = timeUnit;
        this.o00oO0O = i;
        this.f15550OooO00o = ll1ll;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super List<T>> r8) {
        LL1LL.OooO00o OooO00o2 = this.f15550OooO00o.m16172OooO00o();
        IL11lL r1 = new IL11lL(r8);
        if (this.OooO00o == this.OooO0O0) {
            OooO00o oooO00o = new OooO00o(r1, OooO00o2);
            oooO00o.add(OooO00o2);
            r8.add(oooO00o);
            oooO00o.OooO0Oo();
            return oooO00o;
        }
        OooO0O0 oooO0O0 = new OooO0O0(r1, OooO00o2);
        oooO0O0.add(OooO00o2);
        r8.add(oooO0O0);
        oooO0O0.OooO0Oo();
        oooO0O0.OooO0OO();
        return oooO0O0;
    }
}
