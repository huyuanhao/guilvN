package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p293rx.internal.operators.NotificationLite;
import p293rx.subjects.UnicastSubject;

/* renamed from: com.pd.sdk.iL1L  reason: case insensitive filesystem */
public final class C6151iL1L<T, U> implements C9349III.OooO0O0<C9349III<T>, T> {
    public static final Object OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LiLIll<? extends C9349III<? extends U>> f17669OooO00o;

    /* renamed from: com.pd.sdk.iL1L$OooO00o */
    public static final class OooO00o<T, U> extends AbstractC9508LiLi<U> {
        public final OooO0O0<T, U> OooO00o;
        public boolean OooO0O0;

        public OooO00o(OooO0O0<T, U> oooO0O0) {
            this.OooO00o = oooO0O0;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.OooO0O0) {
                this.OooO0O0 = true;
                this.OooO00o.onCompleted();
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(U u) {
            if (!this.OooO0O0) {
                this.OooO0O0 = true;
                this.OooO00o.OooO0o();
            }
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void onStart() {
            request(Long.MAX_VALUE);
        }
    }

    public C6151iL1L(LiLIll<? extends C9349III<? extends U>> r1) {
        this.f17669OooO00o = r1;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super C9349III<T>> r3) {
        OooO0O0 oooO0O0 = new OooO0O0(r3, this.f17669OooO00o);
        r3.add(oooO0O0);
        oooO0O0.OooO0o();
        return oooO0O0;
    }

    /* renamed from: com.pd.sdk.iL1L$OooO0O0 */
    public static final class OooO0O0<T, U> extends AbstractC9508LiLi<T> {
        public AbstractC5477Il11<T> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final LiLIll<? extends C9349III<? extends U>> f17670OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final iLIiLILI f17671OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C9349III<T> f17672OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super C9349III<T>> f17673OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Object f17674OooO00o = new Object();

        /* renamed from: OooO00o  reason: collision with other field name */
        public List<Object> f17675OooO00o;
        public boolean OooO0O0;

        public OooO0O0(AbstractC9508LiLi<? super C9349III<T>> r2, LiLIll<? extends C9349III<? extends U>> r3) {
            this.f17673OooO00o = new IL11lL(r2);
            iLIiLILI iliilili = new iLIiLILI();
            this.f17671OooO00o = iliilili;
            this.f17670OooO00o = r3;
            add(iliilili);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.iL1L$OooO0O0<T, U> */
        /* JADX WARN: Multi-variable type inference failed */
        public void OooO00o(List<Object> list) {
            if (list != null) {
                for (Object obj : list) {
                    if (obj == C6151iL1L.OooO00o) {
                        OooO0o0();
                    } else if (NotificationLite.m23000OooO0O0(obj)) {
                        OooO0O0(NotificationLite.m22998OooO00o(obj));
                        return;
                    } else if (NotificationLite.m22999OooO00o(obj)) {
                        OooO0OO();
                        return;
                    } else {
                        OooO00o(obj);
                    }
                }
            }
        }

        public void OooO0O0(Throwable th) {
            AbstractC5477Il11<T> r0 = this.OooO00o;
            this.OooO00o = null;
            this.f17672OooO00o = null;
            if (r0 != null) {
                r0.onError(th);
            }
            this.f17673OooO00o.onError(th);
            unsubscribe();
        }

        public void OooO0OO() {
            AbstractC5477Il11<T> r0 = this.OooO00o;
            this.OooO00o = null;
            this.f17672OooO00o = null;
            if (r0 != null) {
                r0.onCompleted();
            }
            this.f17673OooO00o.onCompleted();
            unsubscribe();
        }

        public void OooO0Oo() {
            UnicastSubject OooO00o2 = UnicastSubject.OooO00o();
            this.OooO00o = OooO00o2;
            this.f17672OooO00o = OooO00o2;
            try {
                C9349III r0 = (C9349III) this.f17670OooO00o.call();
                OooO00o oooO00o = new OooO00o(this);
                this.f17671OooO00o.OooO00o(oooO00o);
                r0.OooO0O0((AbstractC9508LiLi) oooO00o);
            } catch (Throwable th) {
                this.f17673OooO00o.onError(th);
                unsubscribe();
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0024, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            OooO00o(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
            if (r0 == false) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
            OooO0o0();
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x002f, code lost:
            r1 = r6.f17674OooO00o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0031, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r5 = r6.f17675OooO00o;
            r6.f17675OooO00o = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0036, code lost:
            if (r5 != null) goto L_0x003c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
            r6.OooO0O0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x003b, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x003c, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0043, code lost:
            if (r6.f17673OooO00o.isUnsubscribed() == false) goto L_0x004f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0045, code lost:
            r1 = r6.f17674OooO00o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0047, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            r6.OooO0O0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x004a, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x004b, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x004f, code lost:
            r1 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x0051, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x0052, code lost:
            r3 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0053, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
            throw r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0055, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0057, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0059, code lost:
            r0 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x005a, code lost:
            r3 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x005b, code lost:
            if (r3 == false) goto L_0x005d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x005f, code lost:
            monitor-enter(r6.f17674OooO00o);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
            r6.OooO0O0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0067, code lost:
            throw r0;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void OooO0o() {
            /*
            // Method dump skipped, instructions count: 109
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C6151iL1L.OooO0O0.OooO0o():void");
        }

        public void OooO0o0() {
            AbstractC5477Il11<T> r0 = this.OooO00o;
            if (r0 != null) {
                r0.onCompleted();
            }
            OooO0Oo();
            this.f17673OooO00o.onNext(this.f17672OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            synchronized (this.f17674OooO00o) {
                if (this.OooO0O0) {
                    if (this.f17675OooO00o == null) {
                        this.f17675OooO00o = new ArrayList();
                    }
                    this.f17675OooO00o.add(NotificationLite.OooO00o());
                    return;
                }
                List<Object> list = this.f17675OooO00o;
                this.f17675OooO00o = null;
                this.OooO0O0 = true;
                try {
                    OooO00o(list);
                    OooO0OO();
                } catch (Throwable th) {
                    OooO0O0(th);
                }
            }
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            synchronized (this.f17674OooO00o) {
                if (this.OooO0O0) {
                    this.f17675OooO00o = Collections.singletonList(NotificationLite.OooO00o(th));
                    return;
                }
                this.f17675OooO00o = null;
                this.OooO0O0 = true;
                OooO0O0(th);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0022, code lost:
            r0 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
            OooO00o(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0027, code lost:
            if (r0 == false) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
            OooO00o((java.lang.Object) r7);
            r0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x002d, code lost:
            r1 = r6.f17674OooO00o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r5 = r6.f17675OooO00o;
            r6.f17675OooO00o = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0034, code lost:
            if (r5 != null) goto L_0x003a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0036, code lost:
            r6.OooO0O0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0039, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x003a, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0041, code lost:
            if (r6.f17673OooO00o.isUnsubscribed() == false) goto L_0x004d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0043, code lost:
            r1 = r6.f17674OooO00o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0045, code lost:
            monitor-enter(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
            r6.OooO0O0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0048, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0049, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x004d, code lost:
            r1 = r5;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:41:0x004f, code lost:
            r7 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:0x0050, code lost:
            r3 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0051, code lost:
            monitor-exit(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
            throw r7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:46:0x0053, code lost:
            r7 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:47:0x0055, code lost:
            r7 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x0057, code lost:
            r7 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0058, code lost:
            r3 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0059, code lost:
            if (r3 == false) goto L_0x005b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:0x005d, code lost:
            monitor-enter(r6.f17674OooO00o);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
            r6.OooO0O0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0065, code lost:
            throw r7;
         */
        @Override // com.p118pd.sdk.AbstractC5477Il11
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onNext(T r7) {
            /*
            // Method dump skipped, instructions count: 107
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C6151iL1L.OooO0O0.onNext(java.lang.Object):void");
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        public void OooO00o(T t) {
            AbstractC5477Il11<T> r0 = this.OooO00o;
            if (r0 != null) {
                r0.onNext(t);
            }
        }
    }
}
