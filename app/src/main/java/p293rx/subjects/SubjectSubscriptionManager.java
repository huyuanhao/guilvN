package p293rx.subjects;

import com.p118pd.sdk.AbstractC5477Il11;
import com.p118pd.sdk.AbstractC6153iL1l;
import com.p118pd.sdk.AbstractC9508LiLi;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.C9638ill;
import com.p118pd.sdk.liii1l;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p293rx.functions.Actions;
import p293rx.internal.operators.NotificationLite;

/* renamed from: rx.subjects.SubjectSubscriptionManager */
public final class SubjectSubscriptionManager<T> extends AtomicReference<OooO0O0<T>> implements C9349III.OooO00o<T> {
    public static final long serialVersionUID = 6035251036011671568L;
    public boolean active = true;
    public volatile Object latest;
    public AbstractC6153iL1l<OooO0OO<T>> onAdded = Actions.m22996OooO00o();
    public AbstractC6153iL1l<OooO0OO<T>> onStart = Actions.m22996OooO00o();
    public AbstractC6153iL1l<OooO0OO<T>> onTerminated = Actions.m22996OooO00o();

    /* renamed from: rx.subjects.SubjectSubscriptionManager$OooO00o */
    public class OooO00o implements liii1l {
        public final /* synthetic */ OooO0OO OooO00o;

        public OooO00o(OooO0OO oooO0OO) {
            this.OooO00o = oooO0OO;
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
            SubjectSubscriptionManager.this.remove(this.OooO00o);
        }
    }

    /* renamed from: rx.subjects.SubjectSubscriptionManager$OooO0O0 */
    public static final class OooO0O0<T> {
        public static final OooO0O0 OooO00o;
        public static final OooO0O0 OooO0O0 = new OooO0O0(false, f24192OooO0O0);

        /* renamed from: OooO0O0  reason: collision with other field name */
        public static final OooO0OO[] f24192OooO0O0;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final boolean f24193OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final OooO0OO[] f24194OooO00o;

        static {
            OooO0OO[] oooO0OOArr = new OooO0OO[0];
            f24192OooO0O0 = oooO0OOArr;
            OooO00o = new OooO0O0(true, oooO0OOArr);
        }

        public OooO0O0(boolean z, OooO0OO[] oooO0OOArr) {
            this.f24193OooO00o = z;
            this.f24194OooO00o = oooO0OOArr;
        }

        public OooO0O0 OooO00o(OooO0OO oooO0OO) {
            OooO0OO[] oooO0OOArr = this.f24194OooO00o;
            int length = oooO0OOArr.length;
            OooO0OO[] oooO0OOArr2 = new OooO0OO[(length + 1)];
            System.arraycopy(oooO0OOArr, 0, oooO0OOArr2, 0, length);
            oooO0OOArr2[length] = oooO0OO;
            return new OooO0O0(this.f24193OooO00o, oooO0OOArr2);
        }

        public OooO0O0 OooO0O0(OooO0OO oooO0OO) {
            OooO0OO[] oooO0OOArr = this.f24194OooO00o;
            int length = oooO0OOArr.length;
            if (length == 1 && oooO0OOArr[0] == oooO0OO) {
                return OooO0O0;
            }
            if (length == 0) {
                return this;
            }
            int i = length - 1;
            OooO0OO[] oooO0OOArr2 = new OooO0OO[i];
            int i2 = 0;
            for (OooO0OO oooO0OO2 : oooO0OOArr) {
                if (oooO0OO2 != oooO0OO) {
                    if (i2 == i) {
                        return this;
                    }
                    oooO0OOArr2[i2] = oooO0OO2;
                    i2++;
                }
            }
            if (i2 == 0) {
                return OooO0O0;
            }
            if (i2 < i) {
                OooO0OO[] oooO0OOArr3 = new OooO0OO[i2];
                System.arraycopy(oooO0OOArr2, 0, oooO0OOArr3, 0, i2);
                oooO0OOArr2 = oooO0OOArr3;
            }
            return new OooO0O0(this.f24193OooO00o, oooO0OOArr2);
        }
    }

    public SubjectSubscriptionManager() {
        super(OooO0O0.OooO0O0);
    }

    public boolean add(OooO0OO<T> oooO0OO) {
        OooO0O0 oooO0O0;
        do {
            oooO0O0 = (OooO0O0) get();
            if (oooO0O0.f24193OooO00o) {
                this.onTerminated.call(oooO0OO);
                return false;
            }
        } while (!compareAndSet(oooO0O0, oooO0O0.OooO00o(oooO0OO)));
        this.onAdded.call(oooO0OO);
        return true;
    }

    public void addUnsubscriber(AbstractC9508LiLi<? super T> r2, OooO0OO<T> oooO0OO) {
        r2.add(C9638ill.OooO00o(new OooO00o(oooO0OO)));
    }

    @Override // com.p118pd.sdk.AbstractC6153iL1l
    public /* bridge */ /* synthetic */ void call(Object obj) {
        call((AbstractC9508LiLi) ((AbstractC9508LiLi) obj));
    }

    public Object getLatest() {
        return this.latest;
    }

    public OooO0OO<T>[] next(Object obj) {
        setLatest(obj);
        return ((OooO0O0) get()).f24194OooO00o;
    }

    public OooO0OO<T>[] observers() {
        return ((OooO0O0) get()).f24194OooO00o;
    }

    public void remove(OooO0OO<T> oooO0OO) {
        OooO0O0 oooO0O0;
        OooO0O0 OooO0O02;
        do {
            oooO0O0 = (OooO0O0) get();
            if (oooO0O0.f24193OooO00o || (OooO0O02 = oooO0O0.OooO0O0(oooO0OO)) == oooO0O0) {
                return;
            }
        } while (!compareAndSet(oooO0O0, OooO0O02));
    }

    public void setLatest(Object obj) {
        this.latest = obj;
    }

    public OooO0OO<T>[] terminate(Object obj) {
        setLatest(obj);
        this.active = false;
        if (((OooO0O0) get()).f24193OooO00o) {
            return OooO0O0.f24192OooO0O0;
        }
        return ((OooO0O0) getAndSet(OooO0O0.OooO00o)).f24194OooO00o;
    }

    public void call(AbstractC9508LiLi<? super T> r3) {
        OooO0OO<T> oooO0OO = new OooO0OO<>(r3);
        addUnsubscriber(r3, oooO0OO);
        this.onStart.call(oooO0OO);
        if (!r3.isUnsubscribed() && add(oooO0OO) && r3.isUnsubscribed()) {
            remove(oooO0OO);
        }
    }

    /* renamed from: rx.subjects.SubjectSubscriptionManager$OooO0OO */
    public static final class OooO0OO<T> implements AbstractC5477Il11<T> {
        public final AbstractC9508LiLi<? super T> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public volatile Object f24195OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public List<Object> f24196OooO00o;
        public boolean OooO0O0 = true;
        public boolean OooO0OO;
        public boolean OooO0Oo;
        public volatile boolean OooO0o0;

        public OooO0OO(AbstractC9508LiLi<? super T> r2) {
            this.OooO00o = r2;
        }

        public void OooO00o(List<Object> list, Object obj) {
            Throwable th;
            Throwable th2;
            boolean z = true;
            boolean z2 = true;
            while (true) {
                if (list != null) {
                    try {
                        for (Object obj2 : list) {
                            OooO00o(obj2);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        z = false;
                        if (!z) {
                            synchronized (this) {
                                this.OooO0OO = false;
                            }
                        }
                        throw th;
                    }
                }
                if (z2) {
                    OooO00o(obj);
                    z2 = false;
                }
                synchronized (this) {
                    try {
                        list = this.f24196OooO00o;
                        this.f24196OooO00o = null;
                        if (list == null) {
                            this.OooO0OO = false;
                            try {
                                return;
                            } catch (Throwable th4) {
                                th2 = th4;
                                try {
                                    throw th2;
                                } catch (Throwable th5) {
                                    th = th5;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th2 = th6;
                        z = false;
                        throw th2;
                    }
                }
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0013, code lost:
            if (r2 == null) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0015, code lost:
            OooO00o(null, r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void OooO0O0(java.lang.Object r2) {
            /*
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.OooO0O0     // Catch:{ all -> 0x001c }
                if (r0 == 0) goto L_0x001a
                boolean r0 = r1.OooO0OO     // Catch:{ all -> 0x001c }
                if (r0 == 0) goto L_0x000a
                goto L_0x001a
            L_0x000a:
                r0 = 0
                r1.OooO0O0 = r0     // Catch:{ all -> 0x001c }
                if (r2 == 0) goto L_0x0010
                r0 = 1
            L_0x0010:
                r1.OooO0OO = r0     // Catch:{ all -> 0x001c }
                monitor-exit(r1)     // Catch:{ all -> 0x001c }
                if (r2 == 0) goto L_0x0019
                r0 = 0
                r1.OooO00o(r0, r2)
            L_0x0019:
                return
            L_0x001a:
                monitor-exit(r1)
                return
            L_0x001c:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: p293rx.subjects.SubjectSubscriptionManager.OooO0OO.OooO0O0(java.lang.Object):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
            r1.OooO0Oo = true;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void OooO0OO(java.lang.Object r2) {
            /*
                r1 = this;
                boolean r0 = r1.OooO0Oo
                if (r0 != 0) goto L_0x0026
                monitor-enter(r1)
                r0 = 0
                r1.OooO0O0 = r0     // Catch:{ all -> 0x0023 }
                boolean r0 = r1.OooO0OO     // Catch:{ all -> 0x0023 }
                if (r0 == 0) goto L_0x001e
                java.util.List<java.lang.Object> r0 = r1.f24196OooO00o     // Catch:{ all -> 0x0023 }
                if (r0 != 0) goto L_0x0017
                java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0023 }
                r0.<init>()     // Catch:{ all -> 0x0023 }
                r1.f24196OooO00o = r0     // Catch:{ all -> 0x0023 }
            L_0x0017:
                java.util.List<java.lang.Object> r0 = r1.f24196OooO00o     // Catch:{ all -> 0x0023 }
                r0.add(r2)     // Catch:{ all -> 0x0023 }
                monitor-exit(r1)     // Catch:{ all -> 0x0023 }
                return
            L_0x001e:
                monitor-exit(r1)     // Catch:{ all -> 0x0023 }
                r0 = 1
                r1.OooO0Oo = r0
                goto L_0x0026
            L_0x0023:
                r2 = move-exception
                monitor-exit(r1)
                throw r2
            L_0x0026:
                com.pd.sdk.丨LiL丨丨i<? super T> r0 = r1.OooO00o
                p293rx.internal.operators.NotificationLite.OooO00o(r0, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p293rx.subjects.SubjectSubscriptionManager.OooO0OO.OooO0OO(java.lang.Object):void");
        }

        public void OooO0Oo(Object obj) {
            this.f24195OooO00o = obj;
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
        public void onNext(T t) {
            this.OooO00o.onNext(t);
        }

        public void OooO00o(Object obj) {
            if (obj != null) {
                NotificationLite.OooO00o(this.OooO00o, obj);
            }
        }

        public AbstractC5477Il11<? super T> OooO00o() {
            return this.OooO00o;
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public <I> I m23026OooO00o() {
            return (I) this.f24195OooO00o;
        }
    }
}
