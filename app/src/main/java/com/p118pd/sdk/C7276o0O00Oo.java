package com.p118pd.sdk;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import com.p118pd.sdk.AbstractC7614o0oO0O0o;
import com.p118pd.sdk.C7352o0O0oo0o;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.pd.sdk.o0O00Oo  reason: case insensitive filesystem */
public class C7276o0O00Oo<T> implements AbstractC7614o0oO0O0o<T> {

    /* renamed from: com.pd.sdk.o0O00Oo$OooO00o */
    public class OooO00o implements AbstractC7614o0oO0O0o.OooO0O0<T> {
        public static final int OooO00o = 1;
        public static final int OooO0O0 = 2;
        public static final int OooO0OO = 3;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Handler f19929OooO00o = new Handler(Looper.getMainLooper());

        /* renamed from: OooO00o  reason: collision with other field name */
        public final OooO0OO f19930OooO00o = new OooO0OO();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC7614o0oO0O0o.OooO0O0 f19932OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Runnable f19933OooO00o = new RunnableC4958OooO00o();

        /* renamed from: com.pd.sdk.o0O00Oo$OooO00o$OooO00o  reason: collision with other inner class name */
        public class RunnableC4958OooO00o implements Runnable {
            public RunnableC4958OooO00o() {
            }

            public void run() {
                C7277OooO0Oo OooO00o2 = OooO00o.this.f19930OooO00o.OooO00o();
                while (OooO00o2 != null) {
                    int i = OooO00o2.OooO00o;
                    if (i == 1) {
                        OooO00o.this.f19932OooO00o.OooO00o(OooO00o2.f19943OooO0O0, OooO00o2.OooO0OO);
                    } else if (i == 2) {
                        OooO00o.this.f19932OooO00o.OooO00o(OooO00o2.f19943OooO0O0, (C7352o0O0oo0o.OooO00o) OooO00o2.f19942OooO00o);
                    } else if (i != 3) {
                        String str = "Unsupported message, what=" + OooO00o2.OooO00o;
                    } else {
                        OooO00o.this.f19932OooO00o.OooO0O0(OooO00o2.f19943OooO0O0, OooO00o2.OooO0OO);
                    }
                    OooO00o2 = OooO00o.this.f19930OooO00o.OooO00o();
                }
            }
        }

        public OooO00o(AbstractC7614o0oO0O0o.OooO0O0 oooO0O0) {
            this.f19932OooO00o = oooO0O0;
        }

        @Override // com.p118pd.sdk.AbstractC7614o0oO0O0o.OooO0O0
        public void OooO00o(int i, int i2) {
            OooO00o(C7277OooO0Oo.OooO00o(1, i, i2));
        }

        @Override // com.p118pd.sdk.AbstractC7614o0oO0O0o.OooO0O0
        public void OooO0O0(int i, int i2) {
            OooO00o(C7277OooO0Oo.OooO00o(3, i, i2));
        }

        @Override // com.p118pd.sdk.AbstractC7614o0oO0O0o.OooO0O0
        public void OooO00o(int i, C7352o0O0oo0o.OooO00o<T> oooO00o) {
            OooO00o(C7277OooO0Oo.OooO00o(2, i, oooO00o));
        }

        private void OooO00o(C7277OooO0Oo oooO0Oo) {
            this.f19930OooO00o.OooO00o(oooO0Oo);
            this.f19929OooO00o.post(this.f19933OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.o0O00Oo$OooO0O0 */
    public class OooO0O0 implements AbstractC7614o0oO0O0o.OooO00o<T> {
        public static final int OooO00o = 1;
        public static final int OooO0O0 = 2;
        public static final int OooO0OO = 3;
        public static final int OooO0Oo = 4;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final OooO0OO f19934OooO00o = new OooO0OO();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC7614o0oO0O0o.OooO00o f19936OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Runnable f19937OooO00o = new OooO00o();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Executor f19938OooO00o = AsyncTask.THREAD_POOL_EXECUTOR;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AtomicBoolean f19939OooO00o = new AtomicBoolean(false);

        /* renamed from: com.pd.sdk.o0O00Oo$OooO0O0$OooO00o */
        public class OooO00o implements Runnable {
            public OooO00o() {
            }

            public void run() {
                while (true) {
                    C7277OooO0Oo OooO00o2 = OooO0O0.this.f19934OooO00o.OooO00o();
                    if (OooO00o2 == null) {
                        OooO0O0.this.f19939OooO00o.set(false);
                        return;
                    }
                    int i = OooO00o2.OooO00o;
                    if (i == 1) {
                        OooO0O0.this.f19934OooO00o.OooO00o(1);
                        OooO0O0.this.f19936OooO00o.OooO00o(OooO00o2.f19943OooO0O0);
                    } else if (i == 2) {
                        OooO0O0.this.f19934OooO00o.OooO00o(2);
                        OooO0O0.this.f19934OooO00o.OooO00o(3);
                        OooO0O0.this.f19936OooO00o.OooO00o(OooO00o2.f19943OooO0O0, OooO00o2.OooO0OO, OooO00o2.OooO0Oo, OooO00o2.OooO0o0, OooO00o2.OooO0o);
                    } else if (i == 3) {
                        OooO0O0.this.f19936OooO00o.OooO00o(OooO00o2.f19943OooO0O0, OooO00o2.OooO0OO);
                    } else if (i != 4) {
                        String str = "Unsupported message, what=" + OooO00o2.OooO00o;
                    } else {
                        OooO0O0.this.f19936OooO00o.OooO00o((C7352o0O0oo0o.OooO00o) OooO00o2.f19942OooO00o);
                    }
                }
            }
        }

        public OooO0O0(AbstractC7614o0oO0O0o.OooO00o oooO00o) {
            this.f19936OooO00o = oooO00o;
        }

        private void OooO0O0(C7277OooO0Oo oooO0Oo) {
            this.f19934OooO00o.OooO0O0(oooO0Oo);
            OooO00o();
        }

        @Override // com.p118pd.sdk.AbstractC7614o0oO0O0o.OooO00o
        public void OooO00o(int i) {
            OooO0O0(C7277OooO0Oo.OooO00o(1, i, (Object) null));
        }

        @Override // com.p118pd.sdk.AbstractC7614o0oO0O0o.OooO00o
        public void OooO00o(int i, int i2, int i3, int i4, int i5) {
            OooO0O0(C7277OooO0Oo.OooO00o(2, i, i2, i3, i4, i5, null));
        }

        @Override // com.p118pd.sdk.AbstractC7614o0oO0O0o.OooO00o
        public void OooO00o(int i, int i2) {
            OooO00o(C7277OooO0Oo.OooO00o(3, i, i2));
        }

        @Override // com.p118pd.sdk.AbstractC7614o0oO0O0o.OooO00o
        public void OooO00o(C7352o0O0oo0o.OooO00o<T> oooO00o) {
            OooO00o(C7277OooO0Oo.OooO00o(4, 0, oooO00o));
        }

        private void OooO00o(C7277OooO0Oo oooO0Oo) {
            this.f19934OooO00o.OooO00o(oooO0Oo);
            OooO00o();
        }

        private void OooO00o() {
            if (this.f19939OooO00o.compareAndSet(false, true)) {
                this.f19938OooO00o.execute(this.f19937OooO00o);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7614o0oO0O0o
    public AbstractC7614o0oO0O0o.OooO0O0<T> OooO00o(AbstractC7614o0oO0O0o.OooO0O0<T> oooO0O0) {
        return new OooO00o(oooO0O0);
    }

    @Override // com.p118pd.sdk.AbstractC7614o0oO0O0o
    public AbstractC7614o0oO0O0o.OooO00o<T> OooO00o(AbstractC7614o0oO0O0o.OooO00o<T> oooO00o) {
        return new OooO0O0(oooO00o);
    }

    /* renamed from: com.pd.sdk.o0O00Oo$OooO0OO */
    public static class OooO0OO {
        public C7277OooO0Oo OooO00o;

        public synchronized C7277OooO0Oo OooO00o() {
            if (this.OooO00o == null) {
                return null;
            }
            C7277OooO0Oo oooO0Oo = this.OooO00o;
            this.OooO00o = this.OooO00o.f19941OooO00o;
            return oooO0Oo;
        }

        public synchronized void OooO0O0(C7277OooO0Oo oooO0Oo) {
            oooO0Oo.f19941OooO00o = this.OooO00o;
            this.OooO00o = oooO0Oo;
        }

        public synchronized void OooO00o(C7277OooO0Oo oooO0Oo) {
            if (this.OooO00o == null) {
                this.OooO00o = oooO0Oo;
                return;
            }
            C7277OooO0Oo oooO0Oo2 = this.OooO00o;
            while (oooO0Oo2.f19941OooO00o != null) {
                oooO0Oo2 = oooO0Oo2.f19941OooO00o;
            }
            oooO0Oo2.f19941OooO00o = oooO0Oo;
        }

        public synchronized void OooO00o(int i) {
            while (this.OooO00o != null && this.OooO00o.OooO00o == i) {
                C7277OooO0Oo oooO0Oo = this.OooO00o;
                this.OooO00o = this.OooO00o.f19941OooO00o;
                oooO0Oo.OooO00o();
            }
            if (this.OooO00o != null) {
                C7277OooO0Oo oooO0Oo2 = this.OooO00o;
                C7277OooO0Oo oooO0Oo3 = oooO0Oo2.f19941OooO00o;
                while (oooO0Oo3 != null) {
                    C7277OooO0Oo oooO0Oo4 = oooO0Oo3.f19941OooO00o;
                    if (oooO0Oo3.OooO00o == i) {
                        oooO0Oo2.f19941OooO00o = oooO0Oo4;
                        oooO0Oo3.OooO00o();
                    } else {
                        oooO0Oo2 = oooO0Oo3;
                    }
                    oooO0Oo3 = oooO0Oo4;
                }
            }
        }
    }

    /* renamed from: com.pd.sdk.o0O00Oo$OooO0Oo  reason: case insensitive filesystem */
    public static class C7277OooO0Oo {
        public static C7277OooO0Oo OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public static final Object f19940OooO0O0 = new Object();
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public C7277OooO0Oo f19941OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public Object f19942OooO00o;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public int f19943OooO0O0;
        public int OooO0OO;
        public int OooO0Oo;
        public int OooO0o;
        public int OooO0o0;

        public void OooO00o() {
            this.f19941OooO00o = null;
            this.OooO0o = 0;
            this.OooO0o0 = 0;
            this.OooO0Oo = 0;
            this.OooO0OO = 0;
            this.f19943OooO0O0 = 0;
            this.OooO00o = 0;
            this.f19942OooO00o = null;
            synchronized (f19940OooO0O0) {
                if (OooO0O0 != null) {
                    this.f19941OooO00o = OooO0O0;
                }
                OooO0O0 = this;
            }
        }

        public static C7277OooO0Oo OooO00o(int i, int i2, int i3, int i4, int i5, int i6, Object obj) {
            C7277OooO0Oo oooO0Oo;
            synchronized (f19940OooO0O0) {
                if (OooO0O0 == null) {
                    oooO0Oo = new C7277OooO0Oo();
                } else {
                    oooO0Oo = OooO0O0;
                    OooO0O0 = OooO0O0.f19941OooO00o;
                    oooO0Oo.f19941OooO00o = null;
                }
                oooO0Oo.OooO00o = i;
                oooO0Oo.f19943OooO0O0 = i2;
                oooO0Oo.OooO0OO = i3;
                oooO0Oo.OooO0Oo = i4;
                oooO0Oo.OooO0o0 = i5;
                oooO0Oo.OooO0o = i6;
                oooO0Oo.f19942OooO00o = obj;
            }
            return oooO0Oo;
        }

        public static C7277OooO0Oo OooO00o(int i, int i2, int i3) {
            return OooO00o(i, i2, i3, 0, 0, 0, null);
        }

        public static C7277OooO0Oo OooO00o(int i, int i2, Object obj) {
            return OooO00o(i, i2, 0, 0, 0, 0, obj);
        }
    }
}
