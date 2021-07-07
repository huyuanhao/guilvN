package com.p118pd.sdk;

import java.util.Iterator;
import java.util.List;

/* renamed from: com.pd.sdk.iLI1II */
public final class iLI1II<T> implements AbstractC9465L1l1, AbstractC5477Il11<T> {
    public static final AbstractC9465L1l1 OooO0OO = new OooO00o();
    public long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9465L1l1 f17692OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9508LiLi<? super T> f17693OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Object f17694OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<T> f17695OooO00o;
    public long OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public AbstractC9465L1l1 f17696OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f17697OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public volatile boolean f17698OooO0OO;

    /* renamed from: com.pd.sdk.iLI1II$OooO00o */
    public static class OooO00o implements AbstractC9465L1l1 {
        @Override // com.p118pd.sdk.AbstractC9465L1l1
        public void request(long j) {
        }
    }

    public iLI1II(AbstractC9508LiLi<? super T> r1) {
        this.f17693OooO00o = r1;
    }

    public void OooO00o() {
        long j;
        AbstractC9465L1l1 r10;
        Object obj;
        List<T> list;
        boolean z;
        boolean z2;
        long j2;
        AbstractC9508LiLi<? super T> r2 = this.f17693OooO00o;
        AbstractC9465L1l1 r7 = null;
        long j3 = 0;
        while (true) {
            synchronized (this) {
                j = this.OooO0O0;
                r10 = this.f17696OooO0O0;
                obj = this.f17694OooO00o;
                list = this.f17695OooO00o;
                z = true;
                if (j == 0 && r10 == null && list == null && obj == null) {
                    this.f17697OooO0O0 = false;
                    z2 = true;
                } else {
                    this.OooO0O0 = 0;
                    this.f17696OooO0O0 = null;
                    this.f17695OooO00o = null;
                    this.f17694OooO00o = null;
                    z2 = false;
                }
            }
            if (!z2) {
                if (list != null && !list.isEmpty()) {
                    z = false;
                }
                if (obj != null) {
                    if (obj != Boolean.TRUE) {
                        r2.onError((Throwable) obj);
                        return;
                    } else if (z) {
                        r2.onCompleted();
                        return;
                    }
                }
                if (list != null) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            j2 = ((long) list.size()) + 0;
                            break;
                        }
                        T next = it.next();
                        if (!r2.isUnsubscribed()) {
                            if (this.f17698OooO0OO) {
                                break;
                            }
                            try {
                                r2.onNext(next);
                            } catch (Throwable th) {
                                IIl11.OooO00o(th, r2, next);
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    j2 = 0;
                }
                long j4 = this.OooO00o;
                if (j4 != Long.MAX_VALUE) {
                    if (j != 0) {
                        j4 += j;
                        if (j4 < 0) {
                            j4 = Long.MAX_VALUE;
                        }
                    }
                    if (!(j2 == 0 || j4 == Long.MAX_VALUE)) {
                        j4 -= j2;
                        if (j4 < 0) {
                            throw new IllegalStateException("More produced than requested");
                        }
                    }
                    this.OooO00o = j4;
                }
                if (r10 == null) {
                    r10 = this.f17692OooO00o;
                    if (r10 != null && j != 0) {
                        j3 = C6211iLli.OooO00o(j3, j);
                    }
                } else if (r10 == OooO0OO) {
                    this.f17692OooO00o = null;
                } else {
                    this.f17692OooO00o = r10;
                    if (j4 != 0) {
                        j3 = C6211iLli.OooO00o(j3, j4);
                    }
                }
                r7 = r10;
            } else if (j3 != 0 && r7 != null) {
                r7.request(j3);
                return;
            } else {
                return;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onCompleted() {
        synchronized (this) {
            if (this.f17697OooO0O0) {
                this.f17694OooO00o = true;
                return;
            }
            this.f17697OooO0O0 = true;
            this.f17693OooO00o.onCompleted();
        }
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onError(Throwable th) {
        boolean z;
        synchronized (this) {
            if (this.f17697OooO0O0) {
                this.f17694OooO00o = th;
                z = false;
            } else {
                this.f17697OooO0O0 = true;
                z = true;
            }
        }
        if (z) {
            this.f17693OooO00o.onError(th);
        } else {
            this.f17698OooO0OO = true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r4.f17693OooO00o.onNext(r5);
        r0 = r4.OooO00o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0028, code lost:
        if (r0 == Long.MAX_VALUE) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        r4.OooO00o = r0 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        OooO00o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0032, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0034, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.f17697OooO0O0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0039, code lost:
        throw r5;
     */
    @Override // com.p118pd.sdk.AbstractC5477Il11
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNext(T r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f17697OooO0O0     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x0016
            java.util.List<T> r0 = r4.f17695OooO00o     // Catch:{ all -> 0x003d }
            if (r0 != 0) goto L_0x0011
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x003d }
            r1 = 4
            r0.<init>(r1)     // Catch:{ all -> 0x003d }
            r4.f17695OooO00o = r0     // Catch:{ all -> 0x003d }
        L_0x0011:
            r0.add(r5)     // Catch:{ all -> 0x003d }
            monitor-exit(r4)     // Catch:{ all -> 0x003d }
            return
        L_0x0016:
            r0 = 1
            r4.f17697OooO0O0 = r0     // Catch:{ all -> 0x003d }
            monitor-exit(r4)     // Catch:{ all -> 0x003d }
            com.pd.sdk.丨LiL丨丨i<? super T> r0 = r4.f17693OooO00o     // Catch:{ all -> 0x0033 }
            r0.onNext(r5)     // Catch:{ all -> 0x0033 }
            long r0 = r4.OooO00o     // Catch:{ all -> 0x0033 }
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 == 0) goto L_0x002f
            r2 = 1
            long r0 = r0 - r2
            r4.OooO00o = r0     // Catch:{ all -> 0x0033 }
        L_0x002f:
            r4.OooO00o()     // Catch:{ all -> 0x0033 }
            return
        L_0x0033:
            r5 = move-exception
            monitor-enter(r4)
            r0 = 0
            r4.f17697OooO0O0 = r0     // Catch:{ all -> 0x003a }
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            throw r5
        L_0x003a:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        L_0x003d:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.iLI1II.onNext(java.lang.Object):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        r2 = r6.f17692OooO00o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3 = r6.OooO00o + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0022, code lost:
        if (r3 >= 0) goto L_0x0029;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0024, code lost:
        r3 = Long.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0029, code lost:
        r6.OooO00o = r3;
        OooO00o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002e, code lost:
        if (r2 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0030, code lost:
        r2.request(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0034, code lost:
        r7 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0035, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        r6.f17697OooO0O0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003a, code lost:
        throw r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        return;
     */
    @Override // com.p118pd.sdk.AbstractC9465L1l1
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void request(long r7) {
        /*
            r6 = this;
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0041
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x000b
            return
        L_0x000b:
            monitor-enter(r6)
            boolean r2 = r6.f17697OooO0O0     // Catch:{ all -> 0x003e }
            if (r2 == 0) goto L_0x0017
            long r0 = r6.OooO0O0     // Catch:{ all -> 0x003e }
            long r0 = r0 + r7
            r6.OooO0O0 = r0     // Catch:{ all -> 0x003e }
            monitor-exit(r6)     // Catch:{ all -> 0x003e }
            return
        L_0x0017:
            r2 = 1
            r6.f17697OooO0O0 = r2     // Catch:{ all -> 0x003e }
            monitor-exit(r6)     // Catch:{ all -> 0x003e }
            com.pd.sdk.丨L1l1 r2 = r6.f17692OooO00o
            long r3 = r6.OooO00o     // Catch:{ all -> 0x0034 }
            long r3 = r3 + r7
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 >= 0) goto L_0x0029
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x0029:
            r6.OooO00o = r3     // Catch:{ all -> 0x0034 }
            r6.OooO00o()     // Catch:{ all -> 0x0034 }
            if (r2 == 0) goto L_0x0033
            r2.request(r7)
        L_0x0033:
            return
        L_0x0034:
            r7 = move-exception
            monitor-enter(r6)
            r8 = 0
            r6.f17697OooO0O0 = r8     // Catch:{ all -> 0x003b }
            monitor-exit(r6)     // Catch:{ all -> 0x003b }
            throw r7
        L_0x003b:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x003e:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x0041:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "n >= 0 required"
            r7.<init>(r8)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.iLI1II.request(long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0012, code lost:
        r5.f17692OooO00o = r6;
        r0 = r5.OooO00o;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        OooO00o();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0019, code lost:
        if (r6 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x001f, code lost:
        if (r0 == 0) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0021, code lost:
        r6.request(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0025, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0026, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r5.f17697OooO0O0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002b, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setProducer(com.p118pd.sdk.AbstractC9465L1l1 r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f17697OooO0O0     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x000e
            if (r6 == 0) goto L_0x0008
            goto L_0x000a
        L_0x0008:
            com.pd.sdk.丨L1l1 r6 = com.p118pd.sdk.iLI1II.OooO0OO     // Catch:{ all -> 0x002f }
        L_0x000a:
            r5.f17696OooO0O0 = r6     // Catch:{ all -> 0x002f }
            monitor-exit(r5)     // Catch:{ all -> 0x002f }
            return
        L_0x000e:
            r0 = 1
            r5.f17697OooO0O0 = r0     // Catch:{ all -> 0x002f }
            monitor-exit(r5)     // Catch:{ all -> 0x002f }
            r5.f17692OooO00o = r6
            long r0 = r5.OooO00o
            r5.OooO00o()     // Catch:{ all -> 0x0025 }
            if (r6 == 0) goto L_0x0024
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0024
            r6.request(r0)
        L_0x0024:
            return
        L_0x0025:
            r6 = move-exception
            monitor-enter(r5)
            r0 = 0
            r5.f17697OooO0O0 = r0     // Catch:{ all -> 0x002c }
            monitor-exit(r5)     // Catch:{ all -> 0x002c }
            throw r6
        L_0x002c:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        L_0x002f:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.iLI1II.setProducer(com.pd.sdk.丨L1l1):void");
    }
}
