package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.pd.sdk.ILL丨丨  reason: invalid class name and case insensitive filesystem */
public final class C5305ILL<T, TOpening, TClosing> implements C9349III.OooO0O0<List<T>, T> {
    public final C9349III<? extends TOpening> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9847l1<? super TOpening, ? extends C9349III<? extends TClosing>> f15597OooO00o;

    /* renamed from: com.pd.sdk.ILL丨丨$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<TOpening> {
        public final /* synthetic */ OooO0O0 OooO00o;

        public OooO00o(OooO0O0 oooO0O0) {
            this.OooO00o = oooO0O0;
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
        public void onNext(TOpening topening) {
            this.OooO00o.OooO00o((Object) topening);
        }
    }

    public C5305ILL(C9349III<? extends TOpening> r1, AbstractC9847l1<? super TOpening, ? extends C9349III<? extends TClosing>> r2) {
        this.OooO00o = r1;
        this.f15597OooO00o = r2;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super List<T>> r3) {
        OooO0O0 oooO0O0 = new OooO0O0(new IL11lL(r3));
        OooO00o oooO00o = new OooO00o(oooO0O0);
        r3.add(oooO00o);
        r3.add(oooO0O0);
        this.OooO00o.OooO0O0((AbstractC9508LiLi<? super Object>) oooO00o);
        return oooO0O0;
    }

    /* renamed from: com.pd.sdk.ILL丨丨$OooO0O0 */
    public final class OooO0O0 extends AbstractC9508LiLi<T> {
        public final IIlIIiI1 OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super List<T>> f15600OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final List<List<T>> f15601OooO00o = new LinkedList();
        public boolean OooO0O0;

        /* renamed from: com.pd.sdk.ILL丨丨$OooO0O0$OooO00o */
        public class OooO00o extends AbstractC9508LiLi<TClosing> {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ List f15602OooO00o;

            public OooO00o(List list) {
                this.f15602OooO00o = list;
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onCompleted() {
                OooO0O0.this.OooO00o.OooO0O0(this);
                OooO0O0.this.OooO00o((List) this.f15602OooO00o);
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onError(Throwable th) {
                OooO0O0.this.onError(th);
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onNext(TClosing tclosing) {
                OooO0O0.this.OooO00o.OooO0O0(this);
                OooO0O0.this.OooO00o((List) this.f15602OooO00o);
            }
        }

        public OooO0O0(AbstractC9508LiLi<? super List<T>> r2) {
            this.f15600OooO00o = r2;
            IIlIIiI1 iIlIIiI1 = new IIlIIiI1();
            this.OooO00o = iIlIIiI1;
            add(iIlIIiI1);
        }

        public void OooO00o(TOpening topening) {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                if (!this.OooO0O0) {
                    this.f15601OooO00o.add(arrayList);
                    try {
                        C9349III r3 = (C9349III) C5305ILL.this.f15597OooO00o.call(topening);
                        OooO00o oooO00o = new OooO00o(arrayList);
                        this.OooO00o.OooO00o(oooO00o);
                        r3.OooO0O0((AbstractC9508LiLi) oooO00o);
                    } catch (Throwable th) {
                        IIl11.OooO00o(th, this);
                    }
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
            if (r0.hasNext() == false) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
            r3.f15600OooO00o.onNext((java.util.List) r0.next());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002d, code lost:
            r3.f15600OooO00o.onCompleted();
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
                java.util.List<java.util.List<T>> r1 = r3.f15601OooO00o     // Catch:{ all -> 0x0036 }
                r0.<init>(r1)     // Catch:{ all -> 0x0036 }
                java.util.List<java.util.List<T>> r1 = r3.f15601OooO00o     // Catch:{ all -> 0x0036 }
                r1.clear()     // Catch:{ all -> 0x0036 }
                monitor-exit(r3)     // Catch:{ all -> 0x0036 }
                java.util.Iterator r0 = r0.iterator()
            L_0x001b:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x002d
                java.lang.Object r1 = r0.next()
                java.util.List r1 = (java.util.List) r1
                com.pd.sdk.丨LiL丨丨i<? super java.util.List<T>> r2 = r3.f15600OooO00o
                r2.onNext(r1)
                goto L_0x001b
            L_0x002d:
                com.pd.sdk.丨LiL丨丨i<? super java.util.List<T>> r0 = r3.f15600OooO00o
                r0.onCompleted()
                r3.unsubscribe()
                return
            L_0x0036:
                r0 = move-exception
                monitor-exit(r3)
                throw r0
            L_0x0039:
                r0 = move-exception
                com.pd.sdk.丨LiL丨丨i<? super java.util.List<T>> r1 = r3.f15600OooO00o
                com.p118pd.sdk.IIl11.OooO00o(r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C5305ILL.OooO0O0.onCompleted():void");
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            synchronized (this) {
                if (!this.OooO0O0) {
                    this.OooO0O0 = true;
                    this.f15601OooO00o.clear();
                    this.f15600OooO00o.onError(th);
                    unsubscribe();
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            synchronized (this) {
                for (List<T> list : this.f15601OooO00o) {
                    list.add(t);
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0022, code lost:
            if (r1 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
            r2.f15600OooO00o.onNext(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void OooO00o(java.util.List<T> r3) {
            /*
                r2 = this;
                monitor-enter(r2)
                boolean r0 = r2.OooO0O0     // Catch:{ all -> 0x002a }
                if (r0 == 0) goto L_0x0007
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
                return
            L_0x0007:
                java.util.List<java.util.List<T>> r0 = r2.f15601OooO00o     // Catch:{ all -> 0x002a }
                java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x002a }
            L_0x000d:
                boolean r1 = r0.hasNext()     // Catch:{ all -> 0x002a }
                if (r1 == 0) goto L_0x0020
                java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x002a }
                java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x002a }
                if (r1 != r3) goto L_0x000d
                r1 = 1
                r0.remove()     // Catch:{ all -> 0x002a }
                goto L_0x0021
            L_0x0020:
                r1 = 0
            L_0x0021:
                monitor-exit(r2)     // Catch:{ all -> 0x002a }
                if (r1 == 0) goto L_0x0029
                com.pd.sdk.丨LiL丨丨i<? super java.util.List<T>> r0 = r2.f15600OooO00o
                r0.onNext(r3)
            L_0x0029:
                return
            L_0x002a:
                r3 = move-exception
                monitor-exit(r2)
                goto L_0x002e
            L_0x002d:
                throw r3
            L_0x002e:
                goto L_0x002d
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C5305ILL.OooO0O0.OooO00o(java.util.List):void");
        }
    }
}
