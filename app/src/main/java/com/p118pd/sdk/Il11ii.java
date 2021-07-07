package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.LinkedList;
import java.util.List;
import p293rx.subjects.UnicastSubject;

/* renamed from: com.pd.sdk.丨Il11i丨i  reason: invalid class name */
public final class Il11ii<T, U, V> implements C9349III.OooO0O0<C9349III<T>, T> {
    public final C9349III<? extends U> OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9847l1<? super U, ? extends C9349III<? extends V>> f22947OooO00o;

    /* renamed from: com.pd.sdk.丨Il11i丨i$OooO00o */
    public class OooO00o extends AbstractC9508LiLi<U> {
        public final /* synthetic */ OooO0OO OooO00o;

        public OooO00o(OooO0OO oooO0OO) {
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
        public void onNext(U u) {
            this.OooO00o.OooO00o((Object) u);
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    /* renamed from: com.pd.sdk.丨Il11i丨i$OooO0O0 */
    public static final class OooO0O0<T> {
        public final AbstractC5477Il11<T> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C9349III<T> f22949OooO00o;

        public OooO0O0(AbstractC5477Il11<T> r2, C9349III<T> r3) {
            this.OooO00o = new C5468IllIL(r2);
            this.f22949OooO00o = r3;
        }
    }

    public Il11ii(C9349III<? extends U> r1, AbstractC9847l1<? super U, ? extends C9349III<? extends V>> r2) {
        this.OooO00o = r1;
        this.f22947OooO00o = r2;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super C9349III<T>> r3) {
        IIlIIiI1 iIlIIiI1 = new IIlIIiI1();
        r3.add(iIlIIiI1);
        OooO0OO oooO0OO = new OooO0OO(r3, iIlIIiI1);
        OooO00o oooO00o = new OooO00o(oooO0OO);
        iIlIIiI1.OooO00o(oooO0OO);
        iIlIIiI1.OooO00o(oooO00o);
        this.OooO00o.OooO0O0((AbstractC9508LiLi<? super Object>) oooO00o);
        return oooO0OO;
    }

    /* renamed from: com.pd.sdk.丨Il11i丨i$OooO0OO */
    public final class OooO0OO extends AbstractC9508LiLi<T> {
        public final IIlIIiI1 OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super C9349III<T>> f22951OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Object f22952OooO00o = new Object();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final List<OooO0O0<T>> f22953OooO00o = new LinkedList();
        public boolean OooO0O0;

        /* renamed from: com.pd.sdk.丨Il11i丨i$OooO0OO$OooO00o */
        public class OooO00o extends AbstractC9508LiLi<V> {
            public final /* synthetic */ OooO0O0 OooO00o;
            public boolean OooO0O0 = true;

            public OooO00o(OooO0O0 oooO0O0) {
                this.OooO00o = oooO0O0;
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onCompleted() {
                if (this.OooO0O0) {
                    this.OooO0O0 = false;
                    OooO0OO.this.OooO00o((OooO0O0) this.OooO00o);
                    OooO0OO.this.OooO00o.OooO0O0(this);
                }
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onError(Throwable th) {
                OooO0OO.this.onError(th);
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onNext(V v) {
                onCompleted();
            }
        }

        public OooO0OO(AbstractC9508LiLi<? super C9349III<T>> r2, IIlIIiI1 iIlIIiI1) {
            this.f22951OooO00o = new IL11lL(r2);
            this.OooO00o = iIlIIiI1;
        }

        public void OooO00o(U u) {
            OooO0O0<T> OooO00o2 = OooO00o();
            synchronized (this.f22952OooO00o) {
                if (!this.OooO0O0) {
                    this.f22953OooO00o.add(OooO00o2);
                    this.f22951OooO00o.onNext(OooO00o2.f22949OooO00o);
                    try {
                        C9349III r4 = (C9349III) Il11ii.this.f22947OooO00o.call(u);
                        OooO00o oooO00o = new OooO00o(OooO00o2);
                        this.OooO00o.OooO00o(oooO00o);
                        r4.OooO0O0((AbstractC9508LiLi) oooO00o);
                    } catch (Throwable th) {
                        onError(th);
                    }
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            r0 = r1.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
            if (r0.hasNext() == false) goto L_0x0034;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
            ((com.p118pd.sdk.Il11ii.OooO0O0) r0.next()).OooO00o.onCompleted();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
            r3.f22951OooO00o.onCompleted();
            r3.OooO00o.unsubscribe();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
            return;
         */
        @Override // com.p118pd.sdk.AbstractC5477Il11
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onCompleted() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f22952OooO00o     // Catch:{ all -> 0x0042 }
                monitor-enter(r0)     // Catch:{ all -> 0x0042 }
                boolean r1 = r3.OooO0O0     // Catch:{ all -> 0x003f }
                if (r1 == 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x003f }
                com.pd.sdk.IIlIIiI1 r0 = r3.OooO00o
                r0.unsubscribe()
                return
            L_0x000e:
                r1 = 1
                r3.OooO0O0 = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.List<com.pd.sdk.丨Il11i丨i$OooO0O0<T>> r2 = r3.f22953OooO00o
                r1.<init>(r2)
                java.util.List<com.pd.sdk.丨Il11i丨i$OooO0O0<T>> r2 = r3.f22953OooO00o
                r2.clear()
                monitor-exit(r0)
                java.util.Iterator r0 = r1.iterator()
            L_0x0022:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0034
                java.lang.Object r1 = r0.next()
                com.pd.sdk.丨Il11i丨i$OooO0O0 r1 = (com.p118pd.sdk.Il11ii.OooO0O0) r1
                com.pd.sdk.Il丨11<T> r1 = r1.OooO00o
                r1.onCompleted()
                goto L_0x0022
            L_0x0034:
                com.pd.sdk.丨LiL丨丨i<? super com.pd.sdk.丨III<T>> r0 = r3.f22951OooO00o
                r0.onCompleted()
                com.pd.sdk.IIlIIiI1 r0 = r3.OooO00o
                r0.unsubscribe()
                return
            L_0x003f:
                r1 = move-exception
                monitor-exit(r0)
                throw r1
            L_0x0042:
                r0 = move-exception
                com.pd.sdk.IIlIIiI1 r1 = r3.OooO00o
                r1.unsubscribe()
                goto L_0x004a
            L_0x0049:
                throw r0
            L_0x004a:
                goto L_0x0049
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.Il11ii.OooO0OO.onCompleted():void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
            r0 = r1.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
            if (r0.hasNext() == false) goto L_0x0034;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
            ((com.p118pd.sdk.Il11ii.OooO0O0) r0.next()).OooO00o.onError(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
            r3.f22951OooO00o.onError(r4);
            r3.OooO00o.unsubscribe();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
            return;
         */
        @Override // com.p118pd.sdk.AbstractC5477Il11
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onError(java.lang.Throwable r4) {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f22952OooO00o     // Catch:{ all -> 0x0042 }
                monitor-enter(r0)     // Catch:{ all -> 0x0042 }
                boolean r1 = r3.OooO0O0     // Catch:{ all -> 0x003f }
                if (r1 == 0) goto L_0x000e
                monitor-exit(r0)     // Catch:{ all -> 0x003f }
                com.pd.sdk.IIlIIiI1 r4 = r3.OooO00o
                r4.unsubscribe()
                return
            L_0x000e:
                r1 = 1
                r3.OooO0O0 = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                java.util.List<com.pd.sdk.丨Il11i丨i$OooO0O0<T>> r2 = r3.f22953OooO00o
                r1.<init>(r2)
                java.util.List<com.pd.sdk.丨Il11i丨i$OooO0O0<T>> r2 = r3.f22953OooO00o
                r2.clear()
                monitor-exit(r0)
                java.util.Iterator r0 = r1.iterator()
            L_0x0022:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0034
                java.lang.Object r1 = r0.next()
                com.pd.sdk.丨Il11i丨i$OooO0O0 r1 = (com.p118pd.sdk.Il11ii.OooO0O0) r1
                com.pd.sdk.Il丨11<T> r1 = r1.OooO00o
                r1.onError(r4)
                goto L_0x0022
            L_0x0034:
                com.pd.sdk.丨LiL丨丨i<? super com.pd.sdk.丨III<T>> r0 = r3.f22951OooO00o
                r0.onError(r4)
                com.pd.sdk.IIlIIiI1 r4 = r3.OooO00o
                r4.unsubscribe()
                return
            L_0x003f:
                r4 = move-exception
                monitor-exit(r0)
                throw r4
            L_0x0042:
                r4 = move-exception
                com.pd.sdk.IIlIIiI1 r0 = r3.OooO00o
                r0.unsubscribe()
                goto L_0x004a
            L_0x0049:
                throw r4
            L_0x004a:
                goto L_0x0049
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.Il11ii.OooO0OO.onError(java.lang.Throwable):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
            if (r0.hasNext() == false) goto L_0x0027;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001b, code lost:
            ((com.p118pd.sdk.Il11ii.OooO0O0) r0.next()).OooO00o.onNext(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            r0 = r1.iterator();
         */
        @Override // com.p118pd.sdk.AbstractC5477Il11
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onNext(T r4) {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f22952OooO00o
                monitor-enter(r0)
                boolean r1 = r3.OooO0O0     // Catch:{ all -> 0x0028 }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                return
            L_0x0009:
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0028 }
                java.util.List<com.pd.sdk.丨Il11i丨i$OooO0O0<T>> r2 = r3.f22953OooO00o     // Catch:{ all -> 0x0028 }
                r1.<init>(r2)     // Catch:{ all -> 0x0028 }
                monitor-exit(r0)     // Catch:{ all -> 0x0028 }
                java.util.Iterator r0 = r1.iterator()
            L_0x0015:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0027
                java.lang.Object r1 = r0.next()
                com.pd.sdk.丨Il11i丨i$OooO0O0 r1 = (com.p118pd.sdk.Il11ii.OooO0O0) r1
                com.pd.sdk.Il丨11<T> r1 = r1.OooO00o
                r1.onNext(r4)
                goto L_0x0015
            L_0x0027:
                return
            L_0x0028:
                r4 = move-exception
                monitor-exit(r0)
                goto L_0x002c
            L_0x002b:
                throw r4
            L_0x002c:
                goto L_0x002b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.Il11ii.OooO0OO.onNext(java.lang.Object):void");
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
            if (r2 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
            r4.OooO00o.onCompleted();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void OooO00o(com.p118pd.sdk.Il11ii.OooO0O0<T> r4) {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f22952OooO00o
                monitor-enter(r0)
                boolean r1 = r3.OooO0O0     // Catch:{ all -> 0x002c }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x002c }
                return
            L_0x0009:
                java.util.List<com.pd.sdk.丨Il11i丨i$OooO0O0<T>> r1 = r3.f22953OooO00o     // Catch:{ all -> 0x002c }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x002c }
            L_0x000f:
                boolean r2 = r1.hasNext()     // Catch:{ all -> 0x002c }
                if (r2 == 0) goto L_0x0022
                java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x002c }
                com.pd.sdk.丨Il11i丨i$OooO0O0 r2 = (com.p118pd.sdk.Il11ii.OooO0O0) r2     // Catch:{ all -> 0x002c }
                if (r2 != r4) goto L_0x000f
                r2 = 1
                r1.remove()     // Catch:{ all -> 0x002c }
                goto L_0x0023
            L_0x0022:
                r2 = 0
            L_0x0023:
                monitor-exit(r0)     // Catch:{ all -> 0x002c }
                if (r2 == 0) goto L_0x002b
                com.pd.sdk.Il丨11<T> r4 = r4.OooO00o
                r4.onCompleted()
            L_0x002b:
                return
            L_0x002c:
                r4 = move-exception
                monitor-exit(r0)
                goto L_0x0030
            L_0x002f:
                throw r4
            L_0x0030:
                goto L_0x002f
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.Il11ii.OooO0OO.OooO00o(com.pd.sdk.丨Il11i丨i$OooO0O0):void");
        }

        public OooO0O0<T> OooO00o() {
            UnicastSubject OooO00o2 = UnicastSubject.OooO00o();
            return new OooO0O0<>(OooO00o2, OooO00o2);
        }
    }
}
