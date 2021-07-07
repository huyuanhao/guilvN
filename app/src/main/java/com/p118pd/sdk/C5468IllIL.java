package com.p118pd.sdk;

import p293rx.internal.operators.NotificationLite;

/* renamed from: com.pd.sdk.IllIL丨  reason: invalid class name and case insensitive filesystem */
public class C5468IllIL<T> implements AbstractC5477Il11<T> {
    public OooO00o OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC5477Il11<? super T> f15892OooO00o;
    public boolean OooO0O0;
    public volatile boolean OooO0OO;

    /* renamed from: com.pd.sdk.IllIL丨$OooO00o */
    public static final class OooO00o {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Object[] f15893OooO00o;

        public void OooO00o(Object obj) {
            int i = this.OooO00o;
            Object[] objArr = this.f15893OooO00o;
            if (objArr == null) {
                objArr = new Object[16];
                this.f15893OooO00o = objArr;
            } else if (i == objArr.length) {
                Object[] objArr2 = new Object[((i >> 2) + i)];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                this.f15893OooO00o = objArr2;
                objArr = objArr2;
            }
            objArr[i] = obj;
            this.OooO00o = i + 1;
        }
    }

    public C5468IllIL(AbstractC5477Il11<? super T> r1) {
        this.f15892OooO00o = r1;
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onCompleted() {
        if (!this.OooO0OO) {
            synchronized (this) {
                if (!this.OooO0OO) {
                    this.OooO0OO = true;
                    if (this.OooO0O0) {
                        OooO00o oooO00o = this.OooO00o;
                        if (oooO00o == null) {
                            oooO00o = new OooO00o();
                            this.OooO00o = oooO00o;
                        }
                        oooO00o.OooO00o(NotificationLite.OooO00o());
                        return;
                    }
                    this.OooO0O0 = true;
                    this.f15892OooO00o.onCompleted();
                }
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onError(Throwable th) {
        IIl11.m15447OooO00o(th);
        if (!this.OooO0OO) {
            synchronized (this) {
                if (!this.OooO0OO) {
                    this.OooO0OO = true;
                    if (this.OooO0O0) {
                        OooO00o oooO00o = this.OooO00o;
                        if (oooO00o == null) {
                            oooO00o = new OooO00o();
                            this.OooO00o = oooO00o;
                        }
                        oooO00o.OooO00o(NotificationLite.OooO00o(th));
                        return;
                    }
                    this.OooO0O0 = true;
                    this.f15892OooO00o.onError(th);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r6.f15892OooO00o.onNext(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x002d, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r1 = r6.OooO00o;
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0031, code lost:
        if (r1 != null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0033, code lost:
        r6.OooO0O0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0035, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0036, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0037, code lost:
        r6.OooO00o = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x003a, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003b, code lost:
        r1 = r1.f15893OooO00o;
        r3 = r1.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x003e, code lost:
        if (r2 >= r3) goto L_0x002d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0040, code lost:
        r4 = r1[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0042, code lost:
        if (r4 != null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x004b, code lost:
        if (p293rx.internal.operators.NotificationLite.OooO00o(r6.f15892OooO00o, r4) == false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x004d, code lost:
        r6.OooO0OO = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x004f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0050, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0053, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0054, code lost:
        r6.OooO0OO = true;
        com.p118pd.sdk.IIl11.m15447OooO00o(r1);
        r6.f15892OooO00o.onError(p293rx.exceptions.OnErrorThrowable.addValueAsLastCause(r1, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0062, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0066, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0067, code lost:
        r6.OooO0OO = true;
        com.p118pd.sdk.IIl11.OooO00o(r1, r6.f15892OooO00o, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x006e, code lost:
        return;
     */
    @Override // com.p118pd.sdk.AbstractC5477Il11
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNext(T r7) {
        /*
        // Method dump skipped, instructions count: 116
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C5468IllIL.onNext(java.lang.Object):void");
    }
}
