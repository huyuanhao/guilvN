package com.p118pd.sdk;

import bolts.AggregateException;
import bolts.ExecutorException;
import bolts.UnobservedTaskException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.pd.sdk.o0OOOO0o  reason: case insensitive filesystem */
public class C7391o0OOOO0o<TResult> {
    public static volatile AbstractC7398OooOOo0 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static C7391o0OOOO0o<?> f20156OooO00o = new C7391o0OOOO0o<>((Object) null);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Executor f20157OooO00o = C7386o0OOO0o0.OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final ExecutorService f20158OooO00o = C7386o0OOO0o0.m18915OooO00o();
    public static C7391o0OOOO0o<Boolean> OooO0O0 = new C7391o0OOOO0o<>((Boolean) true);

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final Executor f20159OooO0O0 = C7384o0OOO0Oo.OooO00o();
    public static C7391o0OOOO0o<Boolean> OooO0OO = new C7391o0OOOO0o<>((Boolean) false);
    public static C7391o0OOOO0o<?> OooO0Oo = new C7391o0OOOO0o<>(true);

    /* renamed from: OooO00o  reason: collision with other field name */
    public o0OOOOO0 f20160OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Exception f20161OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Object f20162OooO00o = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<AbstractC7390o0OOOO0<TResult, Void>> f20163OooO00o = new ArrayList();

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f20164OooO00o;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public TResult f20165OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f20166OooO0O0;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f20167OooO0OO;

    /* renamed from: com.pd.sdk.o0OOOO0o$OooO */
    public class OooO implements AbstractC7390o0OOOO0<TResult, C7391o0OOOO0o<Void>> {
        public OooO() {
        }

        /* renamed from: OooO00o */
        public C7391o0OOOO0o<Void> then(C7391o0OOOO0o<TResult> o0oooo0o) throws Exception {
            if (o0oooo0o.m18933OooO00o()) {
                return C7391o0OOOO0o.OooO0OO();
            }
            if (o0oooo0o.m18938OooO0OO()) {
                return C7391o0OOOO0o.OooO00o(o0oooo0o.m18930OooO00o());
            }
            return C7391o0OOOO0o.OooO00o((Object) null);
        }
    }

    /* renamed from: com.pd.sdk.o0OOOO0o$OooO00o */
    public class OooO00o implements AbstractC7390o0OOOO0<TResult, Void> {
        public final /* synthetic */ C7387o0OOO0oO OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC7390o0OOOO0 f20168OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C7389o0OOOO f20170OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Executor f20171OooO00o;

        public OooO00o(C7389o0OOOO o0oooo, AbstractC7390o0OOOO0 o0oooo0, Executor executor, C7387o0OOO0oO o0ooo0oo) {
            this.f20170OooO00o = o0oooo;
            this.f20168OooO00o = o0oooo0;
            this.f20171OooO00o = executor;
            this.OooO00o = o0ooo0oo;
        }

        /* renamed from: OooO00o */
        public Void then(C7391o0OOOO0o<TResult> o0oooo0o) {
            C7391o0OOOO0o.OooO0Oo(this.f20170OooO00o, this.f20168OooO00o, o0oooo0o, this.f20171OooO00o, this.OooO00o);
            return null;
        }
    }

    /* renamed from: com.pd.sdk.o0OOOO0o$OooO0O0 */
    public class OooO0O0 implements AbstractC7390o0OOOO0<TResult, Void> {
        public final /* synthetic */ C7387o0OOO0oO OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC7390o0OOOO0 f20172OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C7389o0OOOO f20174OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Executor f20175OooO00o;

        public OooO0O0(C7389o0OOOO o0oooo, AbstractC7390o0OOOO0 o0oooo0, Executor executor, C7387o0OOO0oO o0ooo0oo) {
            this.f20174OooO00o = o0oooo;
            this.f20172OooO00o = o0oooo0;
            this.f20175OooO00o = executor;
            this.OooO00o = o0ooo0oo;
        }

        /* renamed from: OooO00o */
        public Void then(C7391o0OOOO0o<TResult> o0oooo0o) {
            C7391o0OOOO0o.OooO0OO(this.f20174OooO00o, this.f20172OooO00o, o0oooo0o, this.f20175OooO00o, this.OooO00o);
            return null;
        }
    }

    /* renamed from: com.pd.sdk.o0OOOO0o$OooO0OO */
    public class OooO0OO implements AbstractC7390o0OOOO0<TResult, C7391o0OOOO0o<TContinuationResult>> {
        public final /* synthetic */ C7387o0OOO0oO OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC7390o0OOOO0 f20176OooO00o;

        public OooO0OO(C7387o0OOO0oO o0ooo0oo, AbstractC7390o0OOOO0 o0oooo0) {
            this.OooO00o = o0ooo0oo;
            this.f20176OooO00o = o0oooo0;
        }

        /* renamed from: OooO00o */
        public C7391o0OOOO0o<TContinuationResult> then(C7391o0OOOO0o<TResult> o0oooo0o) {
            C7387o0OOO0oO o0ooo0oo = this.OooO00o;
            if (o0ooo0oo != null && o0ooo0oo.m18918OooO00o()) {
                return C7391o0OOOO0o.OooO0OO();
            }
            if (o0oooo0o.m18938OooO0OO()) {
                return C7391o0OOOO0o.OooO00o(o0oooo0o.m18930OooO00o());
            }
            if (o0oooo0o.m18933OooO00o()) {
                return C7391o0OOOO0o.OooO0OO();
            }
            return o0oooo0o.OooO00o((AbstractC7390o0OOOO0) this.f20176OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.o0OOOO0o$OooO0Oo  reason: case insensitive filesystem */
    public class C7392OooO0Oo implements AbstractC7390o0OOOO0<TResult, C7391o0OOOO0o<TContinuationResult>> {
        public final /* synthetic */ C7387o0OOO0oO OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC7390o0OOOO0 f20178OooO00o;

        public C7392OooO0Oo(C7387o0OOO0oO o0ooo0oo, AbstractC7390o0OOOO0 o0oooo0) {
            this.OooO00o = o0ooo0oo;
            this.f20178OooO00o = o0oooo0;
        }

        /* renamed from: OooO00o */
        public C7391o0OOOO0o<TContinuationResult> then(C7391o0OOOO0o<TResult> o0oooo0o) {
            C7387o0OOO0oO o0ooo0oo = this.OooO00o;
            if (o0ooo0oo != null && o0ooo0oo.m18918OooO00o()) {
                return C7391o0OOOO0o.OooO0OO();
            }
            if (o0oooo0o.m18938OooO0OO()) {
                return C7391o0OOOO0o.OooO00o(o0oooo0o.m18930OooO00o());
            }
            if (o0oooo0o.m18933OooO00o()) {
                return C7391o0OOOO0o.OooO0OO();
            }
            return o0oooo0o.OooO0O0(this.f20178OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.o0OOOO0o$OooO0o */
    public static class OooO0o implements Runnable {
        public final /* synthetic */ C7387o0OOO0oO OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC7390o0OOOO0 f20180OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C7391o0OOOO0o f20181OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C7389o0OOOO f20182OooO00o;

        /* renamed from: com.pd.sdk.o0OOOO0o$OooO0o$OooO00o */
        public class OooO00o implements AbstractC7390o0OOOO0<TContinuationResult, Void> {
            public OooO00o() {
            }

            /* renamed from: OooO00o */
            public Void then(C7391o0OOOO0o<TContinuationResult> o0oooo0o) {
                C7387o0OOO0oO o0ooo0oo = OooO0o.this.OooO00o;
                if (o0ooo0oo == null || !o0ooo0oo.m18918OooO00o()) {
                    if (o0oooo0o.m18933OooO00o()) {
                        OooO0o.this.f20182OooO00o.m18919OooO00o();
                    } else if (o0oooo0o.m18938OooO0OO()) {
                        OooO0o.this.f20182OooO00o.OooO00o(o0oooo0o.m18930OooO00o());
                    } else {
                        OooO0o.this.f20182OooO00o.OooO00o((Object) o0oooo0o.m18931OooO00o());
                    }
                    return null;
                }
                OooO0o.this.f20182OooO00o.m18919OooO00o();
                return null;
            }
        }

        public OooO0o(C7387o0OOO0oO o0ooo0oo, C7389o0OOOO o0oooo, AbstractC7390o0OOOO0 o0oooo0, C7391o0OOOO0o o0oooo0o) {
            this.OooO00o = o0ooo0oo;
            this.f20182OooO00o = o0oooo;
            this.f20180OooO00o = o0oooo0;
            this.f20181OooO00o = o0oooo0o;
        }

        public void run() {
            C7387o0OOO0oO o0ooo0oo = this.OooO00o;
            if (o0ooo0oo == null || !o0ooo0oo.m18918OooO00o()) {
                try {
                    C7391o0OOOO0o o0oooo0o = (C7391o0OOOO0o) this.f20180OooO00o.then(this.f20181OooO00o);
                    if (o0oooo0o == null) {
                        this.f20182OooO00o.OooO00o((Object) null);
                    } else {
                        o0oooo0o.OooO00o((AbstractC7390o0OOOO0) new OooO00o());
                    }
                } catch (CancellationException unused) {
                    this.f20182OooO00o.m18919OooO00o();
                } catch (Exception e) {
                    this.f20182OooO00o.OooO00o(e);
                }
            } else {
                this.f20182OooO00o.m18919OooO00o();
            }
        }
    }

    /* renamed from: com.pd.sdk.o0OOOO0o$OooO0o0  reason: case insensitive filesystem */
    public static class RunnableC7393OooO0o0 implements Runnable {
        public final /* synthetic */ C7387o0OOO0oO OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC7390o0OOOO0 f20183OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C7391o0OOOO0o f20184OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C7389o0OOOO f20185OooO00o;

        public RunnableC7393OooO0o0(C7387o0OOO0oO o0ooo0oo, C7389o0OOOO o0oooo, AbstractC7390o0OOOO0 o0oooo0, C7391o0OOOO0o o0oooo0o) {
            this.OooO00o = o0ooo0oo;
            this.f20185OooO00o = o0oooo;
            this.f20183OooO00o = o0oooo0;
            this.f20184OooO00o = o0oooo0o;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: com.pd.sdk.o0OOOO */
        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            C7387o0OOO0oO o0ooo0oo = this.OooO00o;
            if (o0ooo0oo == null || !o0ooo0oo.m18918OooO00o()) {
                try {
                    this.f20185OooO00o.OooO00o(this.f20183OooO00o.then(this.f20184OooO00o));
                } catch (CancellationException unused) {
                    this.f20185OooO00o.m18919OooO00o();
                } catch (Exception e) {
                    this.f20185OooO00o.OooO00o(e);
                }
            } else {
                this.f20185OooO00o.m18919OooO00o();
            }
        }
    }

    /* renamed from: com.pd.sdk.o0OOOO0o$OooO0oO  reason: case insensitive filesystem */
    public static class RunnableC7394OooO0oO implements Runnable {
        public final /* synthetic */ C7389o0OOOO OooO00o;

        public RunnableC7394OooO0oO(C7389o0OOOO o0oooo) {
            this.OooO00o = o0oooo;
        }

        public void run() {
            this.OooO00o.m18922OooO00o((Object) null);
        }
    }

    /* renamed from: com.pd.sdk.o0OOOO0o$OooO0oo  reason: case insensitive filesystem */
    public static class RunnableC7395OooO0oo implements Runnable {
        public final /* synthetic */ C7389o0OOOO OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ScheduledFuture f20186OooO00o;

        public RunnableC7395OooO0oo(ScheduledFuture scheduledFuture, C7389o0OOOO o0oooo) {
            this.f20186OooO00o = scheduledFuture;
            this.OooO00o = o0oooo;
        }

        public void run() {
            this.f20186OooO00o.cancel(true);
            this.OooO00o.m18920OooO00o();
        }
    }

    /* renamed from: com.pd.sdk.o0OOOO0o$OooOO0 */
    public static class OooOO0 implements Runnable {
        public final /* synthetic */ C7387o0OOO0oO OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C7389o0OOOO f20187OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Callable f20188OooO00o;

        public OooOO0(C7387o0OOO0oO o0ooo0oo, C7389o0OOOO o0oooo, Callable callable) {
            this.OooO00o = o0ooo0oo;
            this.f20187OooO00o = o0oooo;
            this.f20188OooO00o = callable;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: com.pd.sdk.o0OOOO */
        /* JADX WARN: Multi-variable type inference failed */
        public void run() {
            C7387o0OOO0oO o0ooo0oo = this.OooO00o;
            if (o0ooo0oo == null || !o0ooo0oo.m18918OooO00o()) {
                try {
                    this.f20187OooO00o.OooO00o(this.f20188OooO00o.call());
                } catch (CancellationException unused) {
                    this.f20187OooO00o.m18919OooO00o();
                } catch (Exception e) {
                    this.f20187OooO00o.OooO00o(e);
                }
            } else {
                this.f20187OooO00o.m18919OooO00o();
            }
        }
    }

    /* renamed from: com.pd.sdk.o0OOOO0o$OooOO0O */
    public static class OooOO0O implements AbstractC7390o0OOOO0<TResult, Void> {
        public final /* synthetic */ C7389o0OOOO OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicBoolean f20189OooO00o;

        public OooOO0O(AtomicBoolean atomicBoolean, C7389o0OOOO o0oooo) {
            this.f20189OooO00o = atomicBoolean;
            this.OooO00o = o0oooo;
        }

        /* renamed from: OooO00o */
        public Void then(C7391o0OOOO0o<TResult> o0oooo0o) {
            if (this.f20189OooO00o.compareAndSet(false, true)) {
                this.OooO00o.OooO00o((Object) o0oooo0o);
                return null;
            }
            o0oooo0o.m18930OooO00o();
            return null;
        }
    }

    /* renamed from: com.pd.sdk.o0OOOO0o$OooOO0o  reason: case insensitive filesystem */
    public static class C7396OooOO0o implements AbstractC7390o0OOOO0<Object, Void> {
        public final /* synthetic */ C7389o0OOOO OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicBoolean f20190OooO00o;

        public C7396OooOO0o(AtomicBoolean atomicBoolean, C7389o0OOOO o0oooo) {
            this.f20190OooO00o = atomicBoolean;
            this.OooO00o = o0oooo;
        }

        /* renamed from: OooO00o */
        public Void then(C7391o0OOOO0o<Object> o0oooo0o) {
            if (this.f20190OooO00o.compareAndSet(false, true)) {
                this.OooO00o.OooO00o((Object) o0oooo0o);
                return null;
            }
            o0oooo0o.m18930OooO00o();
            return null;
        }
    }

    /* renamed from: com.pd.sdk.o0OOOO0o$OooOOO */
    public static class OooOOO implements AbstractC7390o0OOOO0<Object, Void> {
        public final /* synthetic */ C7389o0OOOO OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Object f20191OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ArrayList f20192OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicBoolean f20193OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AtomicInteger f20194OooO00o;

        public OooOOO(Object obj, ArrayList arrayList, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, C7389o0OOOO o0oooo) {
            this.f20191OooO00o = obj;
            this.f20192OooO00o = arrayList;
            this.f20193OooO00o = atomicBoolean;
            this.f20194OooO00o = atomicInteger;
            this.OooO00o = o0oooo;
        }

        /* renamed from: OooO00o */
        public Void then(C7391o0OOOO0o<Object> o0oooo0o) {
            if (o0oooo0o.m18938OooO0OO()) {
                synchronized (this.f20191OooO00o) {
                    this.f20192OooO00o.add(o0oooo0o.m18930OooO00o());
                }
            }
            if (o0oooo0o.m18933OooO00o()) {
                this.f20193OooO00o.set(true);
            }
            if (this.f20194OooO00o.decrementAndGet() == 0) {
                if (this.f20192OooO00o.size() != 0) {
                    if (this.f20192OooO00o.size() == 1) {
                        this.OooO00o.OooO00o((Exception) this.f20192OooO00o.get(0));
                    } else {
                        this.OooO00o.OooO00o((Exception) new AggregateException(String.format("There were %d exceptions.", Integer.valueOf(this.f20192OooO00o.size())), this.f20192OooO00o));
                    }
                } else if (this.f20193OooO00o.get()) {
                    this.OooO00o.m18919OooO00o();
                } else {
                    this.OooO00o.OooO00o((Object) null);
                }
            }
            return null;
        }
    }

    /* renamed from: com.pd.sdk.o0OOOO0o$OooOOO0 */
    public static class OooOOO0 implements AbstractC7390o0OOOO0<Void, List<TResult>> {
        public final /* synthetic */ Collection OooO00o;

        public OooOOO0(Collection collection) {
            this.OooO00o = collection;
        }

        /* renamed from: OooO00o */
        public List<TResult> then(C7391o0OOOO0o<Void> o0oooo0o) throws Exception {
            if (this.OooO00o.size() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (C7391o0OOOO0o o0oooo0o2 : this.OooO00o) {
                arrayList.add(o0oooo0o2.m18931OooO00o());
            }
            return arrayList;
        }
    }

    /* renamed from: com.pd.sdk.o0OOOO0o$OooOOOO */
    public class OooOOOO implements AbstractC7390o0OOOO0<Void, C7391o0OOOO0o<Void>> {
        public final /* synthetic */ C7387o0OOO0oO OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ o0OOOO00 f20195OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC7390o0OOOO0 f20196OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Callable f20198OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Executor f20199OooO00o;

        public OooOOOO(C7387o0OOO0oO o0ooo0oo, Callable callable, AbstractC7390o0OOOO0 o0oooo0, Executor executor, o0OOOO00 o0oooo00) {
            this.OooO00o = o0ooo0oo;
            this.f20198OooO00o = callable;
            this.f20196OooO00o = o0oooo0;
            this.f20199OooO00o = executor;
            this.f20195OooO00o = o0oooo00;
        }

        /* renamed from: OooO00o */
        public C7391o0OOOO0o<Void> then(C7391o0OOOO0o<Void> o0oooo0o) throws Exception {
            C7387o0OOO0oO o0ooo0oo = this.OooO00o;
            if (o0ooo0oo != null && o0ooo0oo.m18918OooO00o()) {
                return C7391o0OOOO0o.OooO0OO();
            }
            if (((Boolean) this.f20198OooO00o.call()).booleanValue()) {
                return C7391o0OOOO0o.OooO00o((Object) null).OooO0Oo(this.f20196OooO00o, this.f20199OooO00o).OooO0Oo((AbstractC7390o0OOOO0) this.f20195OooO00o.OooO00o(), this.f20199OooO00o);
            }
            return C7391o0OOOO0o.OooO00o((Object) null);
        }
    }

    /* renamed from: com.pd.sdk.o0OOOO0o$OooOOOo  reason: case insensitive filesystem */
    public class C7397OooOOOo extends C7389o0OOOO<TResult> {
        public C7397OooOOOo() {
        }
    }

    /* renamed from: com.pd.sdk.o0OOOO0o$OooOOo0  reason: case insensitive filesystem */
    public interface AbstractC7398OooOOo0 {
        void OooO00o(C7391o0OOOO0o<?> o0oooo0o, UnobservedTaskException unobservedTaskException);
    }

    public C7391o0OOOO0o() {
    }

    public static <TResult> C7391o0OOOO0o<C7391o0OOOO0o<TResult>> OooO0Oo(Collection<? extends C7391o0OOOO0o<TResult>> collection) {
        if (collection.size() == 0) {
            return OooO00o((Object) null);
        }
        C7389o0OOOO o0oooo = new C7389o0OOOO();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator<? extends C7391o0OOOO0o<TResult>> it = collection.iterator();
        while (it.hasNext()) {
            ((C7391o0OOOO0o) it.next()).OooO00o((AbstractC7390o0OOOO0) new OooOO0O(atomicBoolean, o0oooo));
        }
        return o0oooo.OooO00o();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.pd.sdk.o0OOOO0o<TResult> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: OooO00o  reason: collision with other method in class */
    public <TOut> C7391o0OOOO0o<TOut> m18929OooO00o() {
        return this;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m18938OooO0OO() {
        boolean z;
        synchronized (this.f20162OooO00o) {
            z = m18930OooO00o() != null;
        }
        return z;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static AbstractC7398OooOOo0 m18928OooO00o() {
        return OooO00o;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m18937OooO0O0() {
        boolean z;
        synchronized (this.f20162OooO00o) {
            z = this.f20164OooO00o;
        }
        return z;
    }

    public static void OooO00o(AbstractC7398OooOOo0 oooOOo0) {
        OooO00o = oooOOo0;
    }

    public C7391o0OOOO0o(TResult tresult) {
        m18935OooO00o((Object) tresult);
    }

    public static <TResult> C7391o0OOOO0o<TResult>.C7397OooOOOo OooO00o() {
        C7391o0OOOO0o o0oooo0o = new C7391o0OOOO0o();
        o0oooo0o.getClass();
        return new C7397OooOOOo();
    }

    public static <TResult> C7391o0OOOO0o<TResult> OooO0OO() {
        return (C7391o0OOOO0o<TResult>) OooO0Oo;
    }

    public static C7391o0OOOO0o<C7391o0OOOO0o<?>> OooO0OO(Collection<? extends C7391o0OOOO0o<?>> collection) {
        if (collection.size() == 0) {
            return OooO00o((Object) null);
        }
        C7389o0OOOO o0oooo = new C7389o0OOOO();
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator<? extends C7391o0OOOO0o<?>> it = collection.iterator();
        while (it.hasNext()) {
            ((C7391o0OOOO0o) it.next()).OooO00o((AbstractC7390o0OOOO0) new C7396OooOO0o(atomicBoolean, o0oooo));
        }
        return o0oooo.OooO00o();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public C7391o0OOOO0o<Void> m18936OooO0O0() {
        return OooO0O0(new OooO());
    }

    public static <TResult> C7391o0OOOO0o<TResult> OooO0O0(Callable<TResult> callable) {
        return OooO00o(callable, f20158OooO00o, (C7387o0OOO0oO) null);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18933OooO00o() {
        boolean z;
        synchronized (this.f20162OooO00o) {
            z = this.f20166OooO0O0;
        }
        return z;
    }

    public static <TResult> C7391o0OOOO0o<TResult> OooO0O0(Callable<TResult> callable, C7387o0OOO0oO o0ooo0oo) {
        return OooO00o(callable, f20158OooO00o, o0ooo0oo);
    }

    public C7391o0OOOO0o(boolean z) {
        if (z) {
            OooO0Oo();
        } else {
            m18935OooO00o((Object) null);
        }
    }

    public static <TResult> C7391o0OOOO0o<List<TResult>> OooO0O0(Collection<? extends C7391o0OOOO0o<TResult>> collection) {
        return OooO00o((Collection<? extends C7391o0OOOO0o<?>>) collection).OooO0OO(new OooOOO0(collection));
    }

    public <TContinuationResult> C7391o0OOOO0o<TContinuationResult> OooO0Oo(AbstractC7390o0OOOO0<TResult, C7391o0OOOO0o<TContinuationResult>> o0oooo0, Executor executor) {
        return OooO0Oo(o0oooo0, executor, null);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public TResult m18931OooO00o() {
        TResult tresult;
        synchronized (this.f20162OooO00o) {
            tresult = this.f20165OooO0O0;
        }
        return tresult;
    }

    public <TContinuationResult> C7391o0OOOO0o<TContinuationResult> OooO0O0(AbstractC7390o0OOOO0<TResult, C7391o0OOOO0o<TContinuationResult>> o0oooo0, Executor executor) {
        return OooO0O0(o0oooo0, executor, null);
    }

    public <TContinuationResult> C7391o0OOOO0o<TContinuationResult> OooO0Oo(AbstractC7390o0OOOO0<TResult, C7391o0OOOO0o<TContinuationResult>> o0oooo0, Executor executor, C7387o0OOO0oO o0ooo0oo) {
        return OooO0O0(new C7392OooO0Oo(o0ooo0oo, o0oooo0), executor);
    }

    public <TContinuationResult> C7391o0OOOO0o<TContinuationResult> OooO0O0(AbstractC7390o0OOOO0<TResult, C7391o0OOOO0o<TContinuationResult>> o0oooo0, Executor executor, C7387o0OOO0oO o0ooo0oo) {
        boolean OooO0O02;
        C7389o0OOOO o0oooo = new C7389o0OOOO();
        synchronized (this.f20162OooO00o) {
            OooO0O02 = m18937OooO0O0();
            if (!OooO0O02) {
                this.f20163OooO00o.add(new OooO0O0(o0oooo, o0oooo0, executor, o0ooo0oo));
            }
        }
        if (OooO0O02) {
            OooO0OO(o0oooo, o0oooo0, this, executor, o0ooo0oo);
        }
        return o0oooo.OooO00o();
    }

    public <TContinuationResult> C7391o0OOOO0o<TContinuationResult> OooO0Oo(AbstractC7390o0OOOO0<TResult, C7391o0OOOO0o<TContinuationResult>> o0oooo0) {
        return OooO0Oo(o0oooo0, f20157OooO00o);
    }

    public <TContinuationResult> C7391o0OOOO0o<TContinuationResult> OooO0Oo(AbstractC7390o0OOOO0<TResult, C7391o0OOOO0o<TContinuationResult>> o0oooo0, C7387o0OOO0oO o0ooo0oo) {
        return OooO0Oo(o0oooo0, f20157OooO00o, o0ooo0oo);
    }

    public static <TContinuationResult, TResult> void OooO0Oo(C7389o0OOOO<TContinuationResult> o0oooo, AbstractC7390o0OOOO0<TResult, TContinuationResult> o0oooo0, C7391o0OOOO0o<TResult> o0oooo0o, Executor executor, C7387o0OOO0oO o0ooo0oo) {
        try {
            executor.execute(new RunnableC7393OooO0o0(o0ooo0oo, o0oooo, o0oooo0, o0oooo0o));
        } catch (Exception e) {
            o0oooo.OooO00o((Exception) new ExecutorException(e));
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Exception m18930OooO00o() {
        Exception exc;
        synchronized (this.f20162OooO00o) {
            if (this.f20161OooO00o != null) {
                this.f20167OooO0OO = true;
                if (this.f20160OooO00o != null) {
                    this.f20160OooO00o.OooO00o();
                    this.f20160OooO00o = null;
                }
            }
            exc = this.f20161OooO00o;
        }
        return exc;
    }

    public <TContinuationResult> C7391o0OOOO0o<TContinuationResult> OooO0OO(AbstractC7390o0OOOO0<TResult, TContinuationResult> o0oooo0, Executor executor) {
        return OooO0OO(o0oooo0, executor, null);
    }

    public <TContinuationResult> C7391o0OOOO0o<TContinuationResult> OooO0OO(AbstractC7390o0OOOO0<TResult, TContinuationResult> o0oooo0, Executor executor, C7387o0OOO0oO o0ooo0oo) {
        return OooO0O0(new OooO0OO(o0ooo0oo, o0oooo0), executor);
    }

    public <TContinuationResult> C7391o0OOOO0o<TContinuationResult> OooO0OO(AbstractC7390o0OOOO0<TResult, TContinuationResult> o0oooo0) {
        return OooO0OO(o0oooo0, f20157OooO00o, null);
    }

    public boolean OooO0Oo() {
        synchronized (this.f20162OooO00o) {
            if (this.f20164OooO00o) {
                return false;
            }
            this.f20164OooO00o = true;
            this.f20166OooO0O0 = true;
            this.f20162OooO00o.notifyAll();
            OooO0O0();
            return true;
        }
    }

    public <TContinuationResult> C7391o0OOOO0o<TContinuationResult> OooO0OO(AbstractC7390o0OOOO0<TResult, TContinuationResult> o0oooo0, C7387o0OOO0oO o0ooo0oo) {
        return OooO0OO(o0oooo0, f20157OooO00o, o0ooo0oo);
    }

    public static <TContinuationResult, TResult> void OooO0OO(C7389o0OOOO<TContinuationResult> o0oooo, AbstractC7390o0OOOO0<TResult, C7391o0OOOO0o<TContinuationResult>> o0oooo0, C7391o0OOOO0o<TResult> o0oooo0o, Executor executor, C7387o0OOO0oO o0ooo0oo) {
        try {
            executor.execute(new OooO0o(o0ooo0oo, o0oooo, o0oooo0, o0oooo0o));
        } catch (Exception e) {
            o0oooo.OooO00o((Exception) new ExecutorException(e));
        }
    }

    public <TContinuationResult> C7391o0OOOO0o<TContinuationResult> OooO0O0(AbstractC7390o0OOOO0<TResult, C7391o0OOOO0o<TContinuationResult>> o0oooo0) {
        return OooO0O0(o0oooo0, f20157OooO00o, null);
    }

    public <TContinuationResult> C7391o0OOOO0o<TContinuationResult> OooO0O0(AbstractC7390o0OOOO0<TResult, C7391o0OOOO0o<TContinuationResult>> o0oooo0, C7387o0OOO0oO o0ooo0oo) {
        return OooO0O0(o0oooo0, f20157OooO00o, o0ooo0oo);
    }

    private void OooO0O0() {
        synchronized (this.f20162OooO00o) {
            for (AbstractC7390o0OOOO0<TResult, Void> o0oooo0 : this.f20163OooO00o) {
                try {
                    o0oooo0.then(this);
                } catch (RuntimeException e) {
                    throw e;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
            }
            this.f20163OooO00o = null;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m18932OooO00o() throws InterruptedException {
        synchronized (this.f20162OooO00o) {
            if (!m18937OooO0O0()) {
                this.f20162OooO00o.wait();
            }
        }
    }

    public boolean OooO00o(long j, TimeUnit timeUnit) throws InterruptedException {
        boolean OooO0O02;
        synchronized (this.f20162OooO00o) {
            if (!m18937OooO0O0()) {
                this.f20162OooO00o.wait(timeUnit.toMillis(j));
            }
            OooO0O02 = m18937OooO0O0();
        }
        return OooO0O02;
    }

    public static <TResult> C7391o0OOOO0o<TResult> OooO00o(TResult tresult) {
        if (tresult == null) {
            return (C7391o0OOOO0o<TResult>) f20156OooO00o;
        }
        if (tresult instanceof Boolean) {
            return tresult.booleanValue() ? (C7391o0OOOO0o<TResult>) OooO0O0 : (C7391o0OOOO0o<TResult>) OooO0OO;
        }
        C7389o0OOOO o0oooo = new C7389o0OOOO();
        o0oooo.OooO00o((Object) tresult);
        return o0oooo.OooO00o();
    }

    public static <TResult> C7391o0OOOO0o<TResult> OooO00o(Exception exc) {
        C7389o0OOOO o0oooo = new C7389o0OOOO();
        o0oooo.OooO00o(exc);
        return o0oooo.OooO00o();
    }

    public static C7391o0OOOO0o<Void> OooO00o(long j) {
        return OooO00o(j, C7386o0OOO0o0.m18916OooO00o(), (C7387o0OOO0oO) null);
    }

    public static C7391o0OOOO0o<Void> OooO00o(long j, C7387o0OOO0oO o0ooo0oo) {
        return OooO00o(j, C7386o0OOO0o0.m18916OooO00o(), o0ooo0oo);
    }

    public static C7391o0OOOO0o<Void> OooO00o(long j, ScheduledExecutorService scheduledExecutorService, C7387o0OOO0oO o0ooo0oo) {
        if (o0ooo0oo != null && o0ooo0oo.m18918OooO00o()) {
            return OooO0OO();
        }
        if (j <= 0) {
            return OooO00o((Object) null);
        }
        C7389o0OOOO o0oooo = new C7389o0OOOO();
        ScheduledFuture<?> schedule = scheduledExecutorService.schedule(new RunnableC7394OooO0oO(o0oooo), j, TimeUnit.MILLISECONDS);
        if (o0ooo0oo != null) {
            o0ooo0oo.OooO00o(new RunnableC7395OooO0oo(schedule, o0oooo));
        }
        return o0oooo.OooO00o();
    }

    public static <TResult> C7391o0OOOO0o<TResult> OooO00o(Callable<TResult> callable, Executor executor) {
        return OooO00o(callable, executor, (C7387o0OOO0oO) null);
    }

    public static <TResult> C7391o0OOOO0o<TResult> OooO00o(Callable<TResult> callable, Executor executor, C7387o0OOO0oO o0ooo0oo) {
        C7389o0OOOO o0oooo = new C7389o0OOOO();
        try {
            executor.execute(new OooOO0(o0ooo0oo, o0oooo, callable));
        } catch (Exception e) {
            o0oooo.OooO00o((Exception) new ExecutorException(e));
        }
        return o0oooo.OooO00o();
    }

    public static <TResult> C7391o0OOOO0o<TResult> OooO00o(Callable<TResult> callable) {
        return OooO00o(callable, f20157OooO00o, (C7387o0OOO0oO) null);
    }

    public static <TResult> C7391o0OOOO0o<TResult> OooO00o(Callable<TResult> callable, C7387o0OOO0oO o0ooo0oo) {
        return OooO00o(callable, f20157OooO00o, o0ooo0oo);
    }

    public static C7391o0OOOO0o<Void> OooO00o(Collection<? extends C7391o0OOOO0o<?>> collection) {
        if (collection.size() == 0) {
            return OooO00o((Object) null);
        }
        C7389o0OOOO o0oooo = new C7389o0OOOO();
        ArrayList arrayList = new ArrayList();
        Object obj = new Object();
        AtomicInteger atomicInteger = new AtomicInteger(collection.size());
        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Iterator<? extends C7391o0OOOO0o<?>> it = collection.iterator();
        while (it.hasNext()) {
            ((C7391o0OOOO0o) it.next()).OooO00o((AbstractC7390o0OOOO0) new OooOOO(obj, arrayList, atomicBoolean, atomicInteger, o0oooo));
        }
        return o0oooo.OooO00o();
    }

    public C7391o0OOOO0o<Void> OooO00o(Callable<Boolean> callable, AbstractC7390o0OOOO0<Void, C7391o0OOOO0o<Void>> o0oooo0) {
        return OooO00o(callable, o0oooo0, f20157OooO00o, null);
    }

    public C7391o0OOOO0o<Void> OooO00o(Callable<Boolean> callable, AbstractC7390o0OOOO0<Void, C7391o0OOOO0o<Void>> o0oooo0, C7387o0OOO0oO o0ooo0oo) {
        return OooO00o(callable, o0oooo0, f20157OooO00o, o0ooo0oo);
    }

    public C7391o0OOOO0o<Void> OooO00o(Callable<Boolean> callable, AbstractC7390o0OOOO0<Void, C7391o0OOOO0o<Void>> o0oooo0, Executor executor) {
        return OooO00o(callable, o0oooo0, executor, null);
    }

    public C7391o0OOOO0o<Void> OooO00o(Callable<Boolean> callable, AbstractC7390o0OOOO0<Void, C7391o0OOOO0o<Void>> o0oooo0, Executor executor, C7387o0OOO0oO o0ooo0oo) {
        o0OOOO00 o0oooo00 = new o0OOOO00();
        o0oooo00.OooO00o(new OooOOOO(o0ooo0oo, callable, o0oooo0, executor, o0oooo00));
        return m18936OooO0O0().OooO0O0((AbstractC7390o0OOOO0) o0oooo00.OooO00o(), executor);
    }

    public <TContinuationResult> C7391o0OOOO0o<TContinuationResult> OooO00o(AbstractC7390o0OOOO0<TResult, TContinuationResult> o0oooo0, Executor executor) {
        return OooO00o(o0oooo0, executor, (C7387o0OOO0oO) null);
    }

    public <TContinuationResult> C7391o0OOOO0o<TContinuationResult> OooO00o(AbstractC7390o0OOOO0<TResult, TContinuationResult> o0oooo0, Executor executor, C7387o0OOO0oO o0ooo0oo) {
        boolean OooO0O02;
        C7389o0OOOO o0oooo = new C7389o0OOOO();
        synchronized (this.f20162OooO00o) {
            OooO0O02 = m18937OooO0O0();
            if (!OooO0O02) {
                this.f20163OooO00o.add(new OooO00o(o0oooo, o0oooo0, executor, o0ooo0oo));
            }
        }
        if (OooO0O02) {
            OooO0Oo(o0oooo, o0oooo0, this, executor, o0ooo0oo);
        }
        return o0oooo.OooO00o();
    }

    public <TContinuationResult> C7391o0OOOO0o<TContinuationResult> OooO00o(AbstractC7390o0OOOO0<TResult, TContinuationResult> o0oooo0) {
        return OooO00o(o0oooo0, f20157OooO00o, (C7387o0OOO0oO) null);
    }

    public <TContinuationResult> C7391o0OOOO0o<TContinuationResult> OooO00o(AbstractC7390o0OOOO0<TResult, TContinuationResult> o0oooo0, C7387o0OOO0oO o0ooo0oo) {
        return OooO00o(o0oooo0, f20157OooO00o, o0ooo0oo);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18935OooO00o(TResult tresult) {
        synchronized (this.f20162OooO00o) {
            if (this.f20164OooO00o) {
                return false;
            }
            this.f20164OooO00o = true;
            this.f20165OooO0O0 = tresult;
            this.f20162OooO00o.notifyAll();
            OooO0O0();
            return true;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m18934OooO00o(Exception exc) {
        synchronized (this.f20162OooO00o) {
            if (this.f20164OooO00o) {
                return false;
            }
            this.f20164OooO00o = true;
            this.f20161OooO00o = exc;
            this.f20167OooO0OO = false;
            this.f20162OooO00o.notifyAll();
            OooO0O0();
            if (!this.f20167OooO0OO && m18928OooO00o() != null) {
                this.f20160OooO00o = new o0OOOOO0(this);
            }
            return true;
        }
    }
}
