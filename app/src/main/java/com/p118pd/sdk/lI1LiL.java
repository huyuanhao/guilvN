package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.LL1LL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p293rx.internal.operators.NotificationLite;
import p293rx.subjects.UnicastSubject;

/* renamed from: com.pd.sdk.lI1LiL */
public final class lI1LiL<T> implements C9349III.OooO0O0<C9349III<T>, T> {
    public static final Object OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final long f18323OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LL1LL f18324OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final TimeUnit f18325OooO00o;
    public final long OooO0O0;
    public final int o00oO0O;

    /* renamed from: com.pd.sdk.lI1LiL$OooO00o */
    public static final class OooO00o<T> {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC5477Il11<T> f18326OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C9349III<T> f18327OooO00o;

        public OooO00o(AbstractC5477Il11<T> r2, C9349III<T> r3) {
            this.f18326OooO00o = new C5468IllIL(r2);
            this.f18327OooO00o = r3;
        }
    }

    /* renamed from: com.pd.sdk.lI1LiL$OooO0Oo  reason: case insensitive filesystem */
    public static final class C6480OooO0Oo<T> {
        public static final C6480OooO0Oo<Object> OooO00o = new C6480OooO0Oo<>(null, null, 0);

        /* renamed from: OooO00o  reason: collision with other field name */
        public final int f18339OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC5477Il11<T> f18340OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C9349III<T> f18341OooO00o;

        public C6480OooO0Oo(AbstractC5477Il11<T> r1, C9349III<T> r2, int i) {
            this.f18340OooO00o = r1;
            this.f18341OooO00o = r2;
            this.f18339OooO00o = i;
        }

        public static <T> C6480OooO0Oo<T> OooO0OO() {
            return (C6480OooO0Oo<T>) OooO00o;
        }

        public C6480OooO0Oo<T> OooO00o(AbstractC5477Il11<T> r3, C9349III<T> r4) {
            return new C6480OooO0Oo<>(r3, r4, 0);
        }

        public C6480OooO0Oo<T> OooO0O0() {
            return new C6480OooO0Oo<>(this.f18340OooO00o, this.f18341OooO00o, this.f18339OooO00o + 1);
        }

        public C6480OooO0Oo<T> OooO00o() {
            return OooO0OO();
        }
    }

    public lI1LiL(long j, long j2, TimeUnit timeUnit, int i, LL1LL ll1ll) {
        this.f18323OooO00o = j;
        this.OooO0O0 = j2;
        this.f18325OooO00o = timeUnit;
        this.o00oO0O = i;
        this.f18324OooO00o = ll1ll;
    }

    /* renamed from: OooO00o */
    public AbstractC9508LiLi<? super T> call(AbstractC9508LiLi<? super C9349III<T>> r7) {
        LL1LL.OooO00o OooO00o2 = this.f18324OooO00o.m16172OooO00o();
        if (this.f18323OooO00o == this.OooO0O0) {
            OooO0O0 oooO0O0 = new OooO0O0(r7, OooO00o2);
            oooO0O0.add(OooO00o2);
            oooO0O0.OooO0o0();
            return oooO0O0;
        }
        OooO0OO oooO0OO = new OooO0OO(r7, OooO00o2);
        oooO0OO.add(OooO00o2);
        oooO0OO.OooO0Oo();
        oooO0OO.OooO0OO();
        return oooO0OO;
    }

    /* renamed from: com.pd.sdk.lI1LiL$OooO0O0 */
    public final class OooO0O0 extends AbstractC9508LiLi<T> {
        public final LL1LL.OooO00o OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public volatile C6480OooO0Oo<T> f18328OooO00o = C6480OooO0Oo.OooO0OO();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super C9349III<T>> f18330OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Object f18331OooO00o = new Object();

        /* renamed from: OooO00o  reason: collision with other field name */
        public List<Object> f18332OooO00o;
        public boolean OooO0O0;

        /* renamed from: com.pd.sdk.lI1LiL$OooO0O0$OooO00o */
        public class OooO00o implements liii1l {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ lI1LiL f18333OooO00o;

            public OooO00o(lI1LiL li1lil) {
                this.f18333OooO00o = li1lil;
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                if (OooO0O0.this.f18328OooO00o.f18340OooO00o == null) {
                    OooO0O0.this.unsubscribe();
                }
            }
        }

        /* renamed from: com.pd.sdk.lI1LiL$OooO0O0$OooO0O0  reason: collision with other inner class name */
        public class C4947OooO0O0 implements liii1l {
            public C4947OooO0O0() {
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                OooO0O0.this.OooO0Oo();
            }
        }

        public OooO0O0(AbstractC9508LiLi<? super C9349III<T>> r3, LL1LL.OooO00o oooO00o) {
            this.f18330OooO00o = new IL11lL(r3);
            this.OooO00o = oooO00o;
            r3.add(C9638ill.OooO00o(new OooO00o(lI1LiL.this)));
        }

        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: com.pd.sdk.lI1LiL$OooO0O0 */
        /* JADX WARN: Multi-variable type inference failed */
        public boolean OooO00o(List<Object> list) {
            if (list == null) {
                return true;
            }
            Iterator<Object> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next == lI1LiL.OooO00o) {
                    if (!OooO00o()) {
                        return false;
                    }
                } else if (NotificationLite.m23000OooO0O0(next)) {
                    OooO0O0(NotificationLite.m22998OooO00o(next));
                    break;
                } else if (NotificationLite.m22999OooO00o(next)) {
                    OooO0OO();
                    break;
                } else if (!OooO0O0(next)) {
                    return false;
                }
            }
            return true;
        }

        public boolean OooO0O0(T t) {
            C6480OooO0Oo<T> oooO0Oo;
            C6480OooO0Oo<T> oooO0Oo2 = this.f18328OooO00o;
            if (oooO0Oo2.f18340OooO00o == null) {
                if (!OooO00o()) {
                    return false;
                }
                oooO0Oo2 = this.f18328OooO00o;
            }
            oooO0Oo2.f18340OooO00o.onNext(t);
            if (oooO0Oo2.f18339OooO00o == lI1LiL.this.o00oO0O - 1) {
                oooO0Oo2.f18340OooO00o.onCompleted();
                oooO0Oo = oooO0Oo2.OooO00o();
            } else {
                oooO0Oo = oooO0Oo2.OooO0O0();
            }
            this.f18328OooO00o = oooO0Oo;
            return true;
        }

        public void OooO0OO() {
            AbstractC5477Il11<T> r0 = this.f18328OooO00o.f18340OooO00o;
            this.f18328OooO00o = this.f18328OooO00o.OooO00o();
            if (r0 != null) {
                r0.onCompleted();
            }
            this.f18330OooO00o.onCompleted();
            unsubscribe();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0024, code lost:
            if (OooO00o() != false) goto L_0x0030;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0026, code lost:
            r2 = r6.f18331OooO00o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0028, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r6.OooO0O0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x002b, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x002c, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0030, code lost:
            r2 = r6.f18331OooO00o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0032, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            r3 = r6.f18332OooO00o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0035, code lost:
            if (r3 != null) goto L_0x003b;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0037, code lost:
            r6.OooO0O0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x003a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x003b, code lost:
            r6.f18332OooO00o = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x003e, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0043, code lost:
            if (OooO00o(r3) != false) goto L_0x0030;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0045, code lost:
            r2 = r6.f18331OooO00o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0047, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
            r6.OooO0O0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x004a, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x004b, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x004f, code lost:
            r3 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x0050, code lost:
            r1 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x0051, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
            throw r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0053, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0054, code lost:
            r2 = r1;
            r1 = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0058, code lost:
            r3 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x005a, code lost:
            r1 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x005b, code lost:
            r2 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:58:0x005c, code lost:
            if (r2 == false) goto L_0x005e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:60:0x0060, code lost:
            monitor-enter(r6.f18331OooO00o);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
            r6.OooO0O0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:68:0x0068, code lost:
            throw r1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void OooO0Oo() {
            /*
            // Method dump skipped, instructions count: 110
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.lI1LiL.OooO0O0.OooO0Oo():void");
        }

        public void OooO0o0() {
            LL1LL.OooO00o oooO00o = this.OooO00o;
            C4947OooO0O0 oooO0O0 = new C4947OooO0O0();
            lI1LiL li1lil = lI1LiL.this;
            oooO00o.OooO00o(oooO0O0, 0, li1lil.f18323OooO00o, li1lil.f18325OooO00o);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            synchronized (this.f18331OooO00o) {
                if (this.OooO0O0) {
                    if (this.f18332OooO00o == null) {
                        this.f18332OooO00o = new ArrayList();
                    }
                    this.f18332OooO00o.add(NotificationLite.OooO00o());
                    return;
                }
                List<Object> list = this.f18332OooO00o;
                this.f18332OooO00o = null;
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
            synchronized (this.f18331OooO00o) {
                if (this.OooO0O0) {
                    this.f18332OooO00o = Collections.singletonList(NotificationLite.OooO00o(th));
                    return;
                }
                this.f18332OooO00o = null;
                this.OooO0O0 = true;
                OooO0O0(th);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0022, code lost:
            if (OooO0O0((java.lang.Object) r5) != false) goto L_0x002e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0024, code lost:
            r5 = r4.f18331OooO00o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
            monitor-enter(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            r4.OooO0O0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0029, code lost:
            monitor-exit(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x002a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x002e, code lost:
            r5 = r4.f18331OooO00o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0030, code lost:
            monitor-enter(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:?, code lost:
            r2 = r4.f18332OooO00o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0033, code lost:
            if (r2 != null) goto L_0x0039;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0035, code lost:
            r4.OooO0O0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:?, code lost:
            monitor-exit(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0038, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0039, code lost:
            r4.f18332OooO00o = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x003c, code lost:
            monitor-exit(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:38:0x0041, code lost:
            if (OooO00o(r2) != false) goto L_0x002e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:39:0x0043, code lost:
            r5 = r4.f18331OooO00o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:40:0x0045, code lost:
            monitor-enter(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
            r4.OooO0O0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:43:0x0048, code lost:
            monitor-exit(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:0x0049, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:48:0x004d, code lost:
            r2 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:49:0x004e, code lost:
            r1 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:50:0x004f, code lost:
            monitor-exit(r5);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
            throw r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:53:0x0051, code lost:
            r5 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:54:0x0053, code lost:
            r2 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:55:0x0055, code lost:
            r5 = th;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:56:0x0056, code lost:
            r1 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:57:0x0057, code lost:
            if (r1 == false) goto L_0x0059;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:59:0x005b, code lost:
            monitor-enter(r4.f18331OooO00o);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
            r4.OooO0O0 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:67:0x0063, code lost:
            throw r5;
         */
        @Override // com.p118pd.sdk.AbstractC5477Il11
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onNext(T r5) {
            /*
            // Method dump skipped, instructions count: 105
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.lI1LiL.OooO0O0.onNext(java.lang.Object):void");
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        public boolean OooO00o() {
            AbstractC5477Il11<T> r0 = this.f18328OooO00o.f18340OooO00o;
            if (r0 != null) {
                r0.onCompleted();
            }
            if (this.f18330OooO00o.isUnsubscribed()) {
                this.f18328OooO00o = this.f18328OooO00o.OooO00o();
                unsubscribe();
                return false;
            }
            UnicastSubject OooO00o2 = UnicastSubject.OooO00o();
            this.f18328OooO00o = this.f18328OooO00o.OooO00o(OooO00o2, OooO00o2);
            this.f18330OooO00o.onNext(OooO00o2);
            return true;
        }

        public void OooO0O0(Throwable th) {
            AbstractC5477Il11<T> r0 = this.f18328OooO00o.f18340OooO00o;
            this.f18328OooO00o = this.f18328OooO00o.OooO00o();
            if (r0 != null) {
                r0.onError(th);
            }
            this.f18330OooO00o.onError(th);
            unsubscribe();
        }
    }

    /* renamed from: com.pd.sdk.lI1LiL$OooO0OO */
    public final class OooO0OO extends AbstractC9508LiLi<T> {
        public final LL1LL.OooO00o OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9508LiLi<? super C9349III<T>> f18335OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Object f18336OooO00o = new Object();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final List<OooO00o<T>> f18337OooO00o = new LinkedList();
        public boolean OooO0O0;

        /* renamed from: com.pd.sdk.lI1LiL$OooO0OO$OooO00o */
        public class OooO00o implements liii1l {
            public OooO00o() {
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                OooO0OO.this.OooO0Oo();
            }
        }

        /* renamed from: com.pd.sdk.lI1LiL$OooO0OO$OooO0O0 */
        public class OooO0O0 implements liii1l {
            public final /* synthetic */ OooO00o OooO00o;

            public OooO0O0(OooO00o oooO00o) {
                this.OooO00o = oooO00o;
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                OooO0OO.this.OooO00o(this.OooO00o);
            }
        }

        public OooO0OO(AbstractC9508LiLi<? super C9349III<T>> r2, LL1LL.OooO00o oooO00o) {
            super(r2);
            this.f18335OooO00o = r2;
            this.OooO00o = oooO00o;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0024, code lost:
            if (r2 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0026, code lost:
            r4.f18326OooO00o.onCompleted();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void OooO00o(com.p118pd.sdk.lI1LiL.OooO00o<T> r4) {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f18336OooO00o
                monitor-enter(r0)
                boolean r1 = r3.OooO0O0     // Catch:{ all -> 0x002c }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x002c }
                return
            L_0x0009:
                java.util.List<com.pd.sdk.lI1LiL$OooO00o<T>> r1 = r3.f18337OooO00o     // Catch:{ all -> 0x002c }
                java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x002c }
            L_0x000f:
                boolean r2 = r1.hasNext()     // Catch:{ all -> 0x002c }
                if (r2 == 0) goto L_0x0022
                java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x002c }
                com.pd.sdk.lI1LiL$OooO00o r2 = (com.p118pd.sdk.lI1LiL.OooO00o) r2     // Catch:{ all -> 0x002c }
                if (r2 != r4) goto L_0x000f
                r2 = 1
                r1.remove()     // Catch:{ all -> 0x002c }
                goto L_0x0023
            L_0x0022:
                r2 = 0
            L_0x0023:
                monitor-exit(r0)     // Catch:{ all -> 0x002c }
                if (r2 == 0) goto L_0x002b
                com.pd.sdk.Il丨11<T> r4 = r4.f18326OooO00o
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
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.lI1LiL.OooO0OO.OooO00o(com.pd.sdk.lI1LiL$OooO00o):void");
        }

        public void OooO0OO() {
            LL1LL.OooO00o oooO00o = this.OooO00o;
            OooO00o oooO00o2 = new OooO00o();
            lI1LiL li1lil = lI1LiL.this;
            long j = li1lil.OooO0O0;
            oooO00o.OooO00o(oooO00o2, j, j, li1lil.f18325OooO00o);
        }

        public void OooO0Oo() {
            OooO00o<T> OooO00o2 = OooO00o();
            synchronized (this.f18336OooO00o) {
                if (!this.OooO0O0) {
                    this.f18337OooO00o.add(OooO00o2);
                    try {
                        this.f18335OooO00o.onNext(OooO00o2.f18327OooO00o);
                        LL1LL.OooO00o oooO00o = this.OooO00o;
                        OooO0O0 oooO0O0 = new OooO0O0(OooO00o2);
                        lI1LiL li1lil = lI1LiL.this;
                        oooO00o.OooO00o(oooO0O0, li1lil.f18323OooO00o, li1lil.f18325OooO00o);
                    } catch (Throwable th) {
                        onError(th);
                    }
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
            if (r0.hasNext() == false) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
            ((com.p118pd.sdk.lI1LiL.OooO00o) r0.next()).f18326OooO00o.onCompleted();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
            r3.f18335OooO00o.onCompleted();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
            r0 = r1.iterator();
         */
        @Override // com.p118pd.sdk.AbstractC5477Il11
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onCompleted() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f18336OooO00o
                monitor-enter(r0)
                boolean r1 = r3.OooO0O0     // Catch:{ all -> 0x0035 }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0035 }
                return
            L_0x0009:
                r1 = 1
                r3.OooO0O0 = r1     // Catch:{ all -> 0x0035 }
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0035 }
                java.util.List<com.pd.sdk.lI1LiL$OooO00o<T>> r2 = r3.f18337OooO00o     // Catch:{ all -> 0x0035 }
                r1.<init>(r2)     // Catch:{ all -> 0x0035 }
                java.util.List<com.pd.sdk.lI1LiL$OooO00o<T>> r2 = r3.f18337OooO00o     // Catch:{ all -> 0x0035 }
                r2.clear()     // Catch:{ all -> 0x0035 }
                monitor-exit(r0)     // Catch:{ all -> 0x0035 }
                java.util.Iterator r0 = r1.iterator()
            L_0x001d:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x002f
                java.lang.Object r1 = r0.next()
                com.pd.sdk.lI1LiL$OooO00o r1 = (com.p118pd.sdk.lI1LiL.OooO00o) r1
                com.pd.sdk.Il丨11<T> r1 = r1.f18326OooO00o
                r1.onCompleted()
                goto L_0x001d
            L_0x002f:
                com.pd.sdk.丨LiL丨丨i<? super com.pd.sdk.丨III<T>> r0 = r3.f18335OooO00o
                r0.onCompleted()
                return
            L_0x0035:
                r1 = move-exception
                monitor-exit(r0)
                goto L_0x0039
            L_0x0038:
                throw r1
            L_0x0039:
                goto L_0x0038
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.lI1LiL.OooO0OO.onCompleted():void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
            if (r0.hasNext() == false) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
            ((com.p118pd.sdk.lI1LiL.OooO00o) r0.next()).f18326OooO00o.onError(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
            r3.f18335OooO00o.onError(r4);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
            r0 = r1.iterator();
         */
        @Override // com.p118pd.sdk.AbstractC5477Il11
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onError(java.lang.Throwable r4) {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f18336OooO00o
                monitor-enter(r0)
                boolean r1 = r3.OooO0O0     // Catch:{ all -> 0x0035 }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0035 }
                return
            L_0x0009:
                r1 = 1
                r3.OooO0O0 = r1     // Catch:{ all -> 0x0035 }
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0035 }
                java.util.List<com.pd.sdk.lI1LiL$OooO00o<T>> r2 = r3.f18337OooO00o     // Catch:{ all -> 0x0035 }
                r1.<init>(r2)     // Catch:{ all -> 0x0035 }
                java.util.List<com.pd.sdk.lI1LiL$OooO00o<T>> r2 = r3.f18337OooO00o     // Catch:{ all -> 0x0035 }
                r2.clear()     // Catch:{ all -> 0x0035 }
                monitor-exit(r0)     // Catch:{ all -> 0x0035 }
                java.util.Iterator r0 = r1.iterator()
            L_0x001d:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x002f
                java.lang.Object r1 = r0.next()
                com.pd.sdk.lI1LiL$OooO00o r1 = (com.p118pd.sdk.lI1LiL.OooO00o) r1
                com.pd.sdk.Il丨11<T> r1 = r1.f18326OooO00o
                r1.onError(r4)
                goto L_0x001d
            L_0x002f:
                com.pd.sdk.丨LiL丨丨i<? super com.pd.sdk.丨III<T>> r0 = r3.f18335OooO00o
                r0.onError(r4)
                return
            L_0x0035:
                r4 = move-exception
                monitor-exit(r0)
                goto L_0x0039
            L_0x0038:
                throw r4
            L_0x0039:
                goto L_0x0038
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.lI1LiL.OooO0OO.onError(java.lang.Throwable):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
            r0 = r1.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x003b, code lost:
            if (r0.hasNext() == false) goto L_0x0056;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x003d, code lost:
            r1 = (com.p118pd.sdk.lI1LiL.OooO00o) r0.next();
            r1.f18326OooO00o.onNext(r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
            if (r1.OooO00o != r5.f18334OooO00o.o00oO0O) goto L_0x0037;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
            r1.f18326OooO00o.onCompleted();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0056, code lost:
            return;
         */
        @Override // com.p118pd.sdk.AbstractC5477Il11
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void onNext(T r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f18336OooO00o
                monitor-enter(r0)
                boolean r1 = r5.OooO0O0     // Catch:{ all -> 0x0057 }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0057 }
                return
            L_0x0009:
                java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0057 }
                java.util.List<com.pd.sdk.lI1LiL$OooO00o<T>> r2 = r5.f18337OooO00o     // Catch:{ all -> 0x0057 }
                r1.<init>(r2)     // Catch:{ all -> 0x0057 }
                java.util.List<com.pd.sdk.lI1LiL$OooO00o<T>> r2 = r5.f18337OooO00o     // Catch:{ all -> 0x0057 }
                java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0057 }
            L_0x0016:
                boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0057 }
                if (r3 == 0) goto L_0x0032
                java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0057 }
                com.pd.sdk.lI1LiL$OooO00o r3 = (com.p118pd.sdk.lI1LiL.OooO00o) r3     // Catch:{ all -> 0x0057 }
                int r4 = r3.OooO00o     // Catch:{ all -> 0x0057 }
                int r4 = r4 + 1
                r3.OooO00o = r4     // Catch:{ all -> 0x0057 }
                com.pd.sdk.lI1LiL r3 = com.p118pd.sdk.lI1LiL.this     // Catch:{ all -> 0x0057 }
                int r3 = r3.o00oO0O     // Catch:{ all -> 0x0057 }
                if (r4 != r3) goto L_0x0016
                r2.remove()     // Catch:{ all -> 0x0057 }
                goto L_0x0016
            L_0x0032:
                monitor-exit(r0)     // Catch:{ all -> 0x0057 }
                java.util.Iterator r0 = r1.iterator()
            L_0x0037:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L_0x0056
                java.lang.Object r1 = r0.next()
                com.pd.sdk.lI1LiL$OooO00o r1 = (com.p118pd.sdk.lI1LiL.OooO00o) r1
                com.pd.sdk.Il丨11<T> r2 = r1.f18326OooO00o
                r2.onNext(r6)
                int r2 = r1.OooO00o
                com.pd.sdk.lI1LiL r3 = com.p118pd.sdk.lI1LiL.this
                int r3 = r3.o00oO0O
                if (r2 != r3) goto L_0x0037
                com.pd.sdk.Il丨11<T> r1 = r1.f18326OooO00o
                r1.onCompleted()
                goto L_0x0037
            L_0x0056:
                return
            L_0x0057:
                r6 = move-exception
                monitor-exit(r0)
                goto L_0x005b
            L_0x005a:
                throw r6
            L_0x005b:
                goto L_0x005a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.lI1LiL.OooO0OO.onNext(java.lang.Object):void");
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void onStart() {
            request(Long.MAX_VALUE);
        }

        public OooO00o<T> OooO00o() {
            UnicastSubject OooO00o2 = UnicastSubject.OooO00o();
            return new OooO00o<>(OooO00o2, OooO00o2);
        }
    }
}
