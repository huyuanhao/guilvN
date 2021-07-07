package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.LL1LL;
import java.util.concurrent.TimeUnit;

/* renamed from: com.pd.sdk.i丨i丨IL  reason: invalid class name and case insensitive filesystem */
public final class C6402iiIL<T> implements C9349III.OooO0O0<T, T> {
    public final long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LL1LL f18209OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final TimeUnit f18210OooO00o;

    /* renamed from: com.pd.sdk.i丨i丨IL$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<T> {
        public final /* synthetic */ IL11lL OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ LL1LL.OooO00o f18211OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ iLIiLILI f18212OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final OooO0O0<T> f18213OooO00o = new OooO0O0<>();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<?> f18215OooO00o = this;

        /* renamed from: com.pd.sdk.i丨i丨IL$OooO00o$OooO00o  reason: collision with other inner class name */
        public class C4944OooO00o implements liii1l {
            public final /* synthetic */ int o00oO0O;

            public C4944OooO00o(int i) {
                this.o00oO0O = i;
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                OooO00o oooO00o = OooO00o.this;
                oooO00o.f18213OooO00o.OooO00o(this.o00oO0O, oooO00o.OooO00o, oooO00o.f18215OooO00o);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO00o(AbstractC9508LiLi r2, iLIiLILI iliilili, LL1LL.OooO00o oooO00o, IL11lL r5) {
            super(r2);
            this.f18212OooO00o = iliilili;
            this.f18211OooO00o = oooO00o;
            this.OooO00o = r5;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.f18213OooO00o.OooO00o(this.OooO00o, this);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.OooO00o.onError(th);
            unsubscribe();
            this.f18213OooO00o.OooO00o();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            int OooO00o2 = this.f18213OooO00o.OooO00o(t);
            iLIiLILI iliilili = this.f18212OooO00o;
            LL1LL.OooO00o oooO00o = this.f18211OooO00o;
            C4944OooO00o oooO00o2 = new C4944OooO00o(OooO00o2);
            C6402iiIL r6 = C6402iiIL.this;
            iliilili.OooO00o(oooO00o.OooO00o(oooO00o2, r6.OooO00o, r6.f18210OooO00o));
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public C6402iiIL(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        this.OooO00o = j;
        this.f18210OooO00o = timeUnit;
        this.f18209OooO00o = ll1ll;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super T> r8) {
        LL1LL.OooO00o OooO00o2 = this.f18209OooO00o.m16172OooO00o();
        IL11lL r6 = new IL11lL(r8);
        iLIiLILI iliilili = new iLIiLILI();
        r6.add(OooO00o2);
        r6.add(iliilili);
        return new OooO00o(r8, iliilili, OooO00o2, r6);
    }

    /* renamed from: com.pd.sdk.i丨i丨IL$OooO0O0 */
    public static final class OooO0O0<T> {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public T f18216OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f18217OooO00o;
        public boolean OooO0O0;
        public boolean OooO0OO;

        public synchronized int OooO00o(T t) {
            int i;
            this.f18216OooO00o = t;
            this.f18217OooO00o = true;
            i = this.OooO00o + 1;
            this.OooO00o = i;
            return i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
            r4.onNext(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001d, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
            if (r2.OooO0O0 != false) goto L_0x0026;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
            r2.OooO0OO = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0025, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0026, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0027, code lost:
            r4.onCompleted();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x002a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x002e, code lost:
            r4 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x002f, code lost:
            com.p118pd.sdk.IIl11.OooO00o(r4, r5, r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0032, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void OooO00o(int r3, com.p118pd.sdk.AbstractC9508LiLi<T> r4, com.p118pd.sdk.AbstractC9508LiLi<?> r5) {
            /*
                r2 = this;
                monitor-enter(r2)
                boolean r0 = r2.OooO0OO     // Catch:{ all -> 0x0035 }
                if (r0 != 0) goto L_0x0033
                boolean r0 = r2.f18217OooO00o     // Catch:{ all -> 0x0035 }
                if (r0 == 0) goto L_0x0033
                int r0 = r2.OooO00o     // Catch:{ all -> 0x0035 }
                if (r3 == r0) goto L_0x000e
                goto L_0x0033
            L_0x000e:
                T r3 = r2.f18216OooO00o     // Catch:{ all -> 0x0035 }
                r0 = 0
                r2.f18216OooO00o = r0     // Catch:{ all -> 0x0035 }
                r0 = 0
                r2.f18217OooO00o = r0     // Catch:{ all -> 0x0035 }
                r1 = 1
                r2.OooO0OO = r1     // Catch:{ all -> 0x0035 }
                monitor-exit(r2)     // Catch:{ all -> 0x0035 }
                r4.onNext(r3)     // Catch:{ all -> 0x002e }
                monitor-enter(r2)
                boolean r3 = r2.OooO0O0     // Catch:{ all -> 0x002b }
                if (r3 != 0) goto L_0x0026
                r2.OooO0OO = r0     // Catch:{ all -> 0x002b }
                monitor-exit(r2)     // Catch:{ all -> 0x002b }
                return
            L_0x0026:
                monitor-exit(r2)     // Catch:{ all -> 0x002b }
                r4.onCompleted()
                return
            L_0x002b:
                r3 = move-exception
                monitor-exit(r2)
                throw r3
            L_0x002e:
                r4 = move-exception
                com.p118pd.sdk.IIl11.OooO00o(r4, r5, r3)
                return
            L_0x0033:
                monitor-exit(r2)
                return
            L_0x0035:
                r3 = move-exception
                monitor-exit(r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C6402iiIL.OooO0O0.OooO00o(int, com.pd.sdk.丨LiL丨丨i, com.pd.sdk.丨LiL丨丨i):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            r5.onNext(r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001d, code lost:
            r5 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
            com.p118pd.sdk.IIl11.OooO00o(r5, r6, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
            r5.onCompleted();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0025, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            if (r2 == false) goto L_0x0022;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void OooO00o(com.p118pd.sdk.AbstractC9508LiLi<T> r5, com.p118pd.sdk.AbstractC9508LiLi<?> r6) {
            /*
                r4 = this;
                monitor-enter(r4)
                boolean r0 = r4.OooO0OO     // Catch:{ all -> 0x0026 }
                r1 = 1
                if (r0 == 0) goto L_0x000a
                r4.OooO0O0 = r1     // Catch:{ all -> 0x0026 }
                monitor-exit(r4)     // Catch:{ all -> 0x0026 }
                return
            L_0x000a:
                T r0 = r4.f18216OooO00o     // Catch:{ all -> 0x0026 }
                boolean r2 = r4.f18217OooO00o     // Catch:{ all -> 0x0026 }
                r3 = 0
                r4.f18216OooO00o = r3     // Catch:{ all -> 0x0026 }
                r3 = 0
                r4.f18217OooO00o = r3     // Catch:{ all -> 0x0026 }
                r4.OooO0OO = r1     // Catch:{ all -> 0x0026 }
                monitor-exit(r4)     // Catch:{ all -> 0x0026 }
                if (r2 == 0) goto L_0x0022
                r5.onNext(r0)     // Catch:{ all -> 0x001d }
                goto L_0x0022
            L_0x001d:
                r5 = move-exception
                com.p118pd.sdk.IIl11.OooO00o(r5, r6, r0)
                return
            L_0x0022:
                r5.onCompleted()
                return
            L_0x0026:
                r5 = move-exception
                monitor-exit(r4)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C6402iiIL.OooO0O0.OooO00o(com.pd.sdk.丨LiL丨丨i, com.pd.sdk.丨LiL丨丨i):void");
        }

        public synchronized void OooO00o() {
            this.OooO00o++;
            this.f18216OooO00o = null;
            this.f18217OooO00o = false;
        }
    }
}
