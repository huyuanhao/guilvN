package com.p118pd.sdk;

import com.p118pd.sdk.C9349III;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p293rx.annotations.Beta;
import p293rx.internal.operators.BufferUntilSubscriber;

@Beta
/* renamed from: com.pd.sdk.L丨1Lii1  reason: invalid class name */
public abstract class L1Lii1<S, T> implements C9349III.OooO00o<T> {

    /* renamed from: com.pd.sdk.L丨1Lii1$OooO00o */
    public static class OooO00o implements AbstractC9359IIIi<S, Long, AbstractC5477Il11<C9349III<? extends T>>, S> {
        public final /* synthetic */ AbstractC6752llII OooO00o;

        public OooO00o(AbstractC6752llII llii) {
            this.OooO00o = llii;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // com.p118pd.sdk.AbstractC9359IIIi
        public /* bridge */ /* synthetic */ Object OooO00o(Object obj, Long l, Object obj2) {
            return OooO00o(obj, l, (AbstractC5477Il11) ((AbstractC5477Il11) obj2));
        }

        public S OooO00o(S s, Long l, AbstractC5477Il11<C9349III<? extends T>> r4) {
            this.OooO00o.OooO00o(s, l, r4);
            return s;
        }
    }

    /* renamed from: com.pd.sdk.L丨1Lii1$OooO0O0 */
    public static class OooO0O0 implements AbstractC9359IIIi<S, Long, AbstractC5477Il11<C9349III<? extends T>>, S> {
        public final /* synthetic */ AbstractC6752llII OooO00o;

        public OooO0O0(AbstractC6752llII llii) {
            this.OooO00o = llii;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // com.p118pd.sdk.AbstractC9359IIIi
        public /* bridge */ /* synthetic */ Object OooO00o(Object obj, Long l, Object obj2) {
            return OooO00o(obj, l, (AbstractC5477Il11) ((AbstractC5477Il11) obj2));
        }

        public S OooO00o(S s, Long l, AbstractC5477Il11<C9349III<? extends T>> r4) {
            this.OooO00o.OooO00o(s, l, r4);
            return s;
        }
    }

    /* renamed from: com.pd.sdk.L丨1Lii1$OooO0OO */
    public static class OooO0OO implements AbstractC9359IIIi<Void, Long, AbstractC5477Il11<C9349III<? extends T>>, Void> {
        public final /* synthetic */ AbstractC9583iI1Il OooO00o;

        public OooO0OO(AbstractC9583iI1Il r1) {
            this.OooO00o = r1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // com.p118pd.sdk.AbstractC9359IIIi
        public /* bridge */ /* synthetic */ Void OooO00o(Void r1, Long l, Object obj) {
            return OooO00o(r1, l, (AbstractC5477Il11) ((AbstractC5477Il11) obj));
        }

        public Void OooO00o(Void r2, Long l, AbstractC5477Il11<C9349III<? extends T>> r4) {
            this.OooO00o.OooO00o(l, r4);
            return r2;
        }
    }

    /* renamed from: com.pd.sdk.L丨1Lii1$OooO0Oo  reason: case insensitive filesystem */
    public static class C5826OooO0Oo implements AbstractC9359IIIi<Void, Long, AbstractC5477Il11<C9349III<? extends T>>, Void> {
        public final /* synthetic */ AbstractC9583iI1Il OooO00o;

        public C5826OooO0Oo(AbstractC9583iI1Il r1) {
            this.OooO00o = r1;
        }

        /* Return type fixed from 'java.lang.Object' to match base method */
        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
        @Override // com.p118pd.sdk.AbstractC9359IIIi
        public /* bridge */ /* synthetic */ Void OooO00o(Void r1, Long l, Object obj) {
            return OooO00o(r1, l, (AbstractC5477Il11) ((AbstractC5477Il11) obj));
        }

        public Void OooO00o(Void r1, Long l, AbstractC5477Il11<C9349III<? extends T>> r3) {
            this.OooO00o.OooO00o(l, r3);
            return null;
        }
    }

    /* renamed from: com.pd.sdk.L丨1Lii1$OooO0o */
    public class OooO0o extends AbstractC9508LiLi<T> {
        public final /* synthetic */ OooO OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9508LiLi f16796OooO00o;

        public OooO0o(AbstractC9508LiLi r2, OooO oooO) {
            this.f16796OooO00o = r2;
            this.OooO00o = oooO;
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.f16796OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.f16796OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.f16796OooO00o.onNext(t);
        }

        @Override // com.p118pd.sdk.AbstractC9508LiLi
        public void setProducer(AbstractC9465L1l1 r2) {
            this.OooO00o.OooO00o(r2);
        }
    }

    /* renamed from: com.pd.sdk.L丨1Lii1$OooO0o0  reason: case insensitive filesystem */
    public static class C5827OooO0o0 implements AbstractC6153iL1l<Void> {
        public final /* synthetic */ liii1l OooO00o;

        public C5827OooO0o0(liii1l r1) {
            this.OooO00o = r1;
        }

        /* renamed from: OooO00o */
        public void call(Void r1) {
            this.OooO00o.call();
        }
    }

    /* renamed from: com.pd.sdk.L丨1Lii1$OooO0oO  reason: case insensitive filesystem */
    public class C5828OooO0oO implements AbstractC9847l1<C9349III<T>, C9349III<T>> {
        public C5828OooO0oO() {
        }

        /* renamed from: OooO00o */
        public C9349III<T> call(C9349III<T> r1) {
            return r1.OooOOO();
        }
    }

    /* renamed from: com.pd.sdk.L丨1Lii1$OooO0oo  reason: case insensitive filesystem */
    public static final class C5829OooO0oo<S, T> extends L1Lii1<S, T> {
        public final LiLIll<? extends S> OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC6153iL1l<? super S> f16797OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9359IIIi<? super S, Long, ? super AbstractC5477Il11<C9349III<? extends T>>, ? extends S> f16798OooO00o;

        public C5829OooO0oo(LiLIll<? extends S> r1, AbstractC9359IIIi<? super S, Long, ? super AbstractC5477Il11<C9349III<? extends T>>, ? extends S> r2, AbstractC6153iL1l<? super S> il1l) {
            this.OooO00o = r1;
            this.f16798OooO00o = r2;
            this.f16797OooO00o = il1l;
        }

        @Override // com.p118pd.sdk.L1Lii1
        public S OooO00o() {
            LiLIll<? extends S> r0 = this.OooO00o;
            if (r0 == null) {
                return null;
            }
            return (S) r0.call();
        }

        @Override // com.p118pd.sdk.L1Lii1, com.p118pd.sdk.AbstractC6153iL1l
        public /* bridge */ /* synthetic */ void call(Object obj) {
            L1Lii1.super.OooO00o((AbstractC9508LiLi) ((AbstractC9508LiLi) obj));
        }

        @Override // com.p118pd.sdk.L1Lii1
        public S OooO00o(S s, long j, AbstractC5477Il11<C9349III<? extends T>> r5) {
            return (S) this.f16798OooO00o.OooO00o(s, Long.valueOf(j), r5);
        }

        @Override // com.p118pd.sdk.L1Lii1
        public void OooO00o(S s) {
            AbstractC6153iL1l<? super S> il1l = this.f16797OooO00o;
            if (il1l != null) {
                il1l.call(s);
            }
        }

        public C5829OooO0oo(LiLIll<? extends S> r2, AbstractC9359IIIi<? super S, Long, ? super AbstractC5477Il11<C9349III<? extends T>>, ? extends S> r3) {
            this(r2, r3, null);
        }

        public C5829OooO0oo(AbstractC9359IIIi<S, Long, AbstractC5477Il11<C9349III<? extends T>>, S> r2, AbstractC6153iL1l<? super S> il1l) {
            this(null, r2, il1l);
        }

        public C5829OooO0oo(AbstractC9359IIIi<S, Long, AbstractC5477Il11<C9349III<? extends T>>, S> r2) {
            this(null, r2, null);
        }
    }

    /* renamed from: com.pd.sdk.L丨1Lii1$OooOO0 */
    public static final class OooOO0<T> extends C9349III<T> implements AbstractC5477Il11<T> {
        public final OooO00o<T> OooO00o;

        /* renamed from: com.pd.sdk.L丨1Lii1$OooOO0$OooO00o */
        public static final class OooO00o<T> implements C9349III.OooO00o<T> {
            public AbstractC9508LiLi<? super T> OooO00o;

            /* renamed from: OooO00o */
            public void call(AbstractC9508LiLi<? super T> r3) {
                synchronized (this) {
                    if (this.OooO00o == null) {
                        this.OooO00o = r3;
                    } else {
                        r3.onError(new IllegalStateException("There can be only one subscriber"));
                    }
                }
            }
        }

        public OooOO0(OooO00o<T> oooO00o) {
            super(oooO00o);
            this.OooO00o = oooO00o;
        }

        public static <T> OooOO0<T> OooO00o() {
            return new OooOO0<>(new OooO00o());
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            this.OooO00o.OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            this.OooO00o.OooO00o.onError(th);
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onNext(T t) {
            this.OooO00o.OooO00o.onNext(t);
        }
    }

    public static <S, T> L1Lii1<S, T> OooO00o(LiLIll<? extends S> r1, AbstractC6752llII<? super S, Long, ? super AbstractC5477Il11<C9349III<? extends T>>> llii) {
        return new C5829OooO0oo(r1, new OooO00o(llii));
    }

    public abstract S OooO00o();

    public abstract S OooO00o(S s, long j, AbstractC5477Il11<C9349III<? extends T>> v);

    public void OooO00o(S s) {
    }

    @Override // com.p118pd.sdk.AbstractC6153iL1l
    public /* bridge */ /* synthetic */ void call(Object obj) {
        OooO00o((AbstractC9508LiLi) ((AbstractC9508LiLi) obj));
    }

    /* renamed from: com.pd.sdk.L丨1Lii1$OooO */
    public static final class OooO<S, T> implements AbstractC9465L1l1, LlIiLii, AbstractC5477Il11<C9349III<? extends T>> {
        public long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final IIlIIiI1 f16784OooO00o = new IIlIIiI1();

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C5468IllIL<C9349III<? extends T>> f16785OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final OooOO0<C9349III<T>> f16786OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final L1Lii1<S, T> f16787OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public AbstractC9465L1l1 f16788OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public S f16789OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public List<Long> f16790OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AtomicBoolean f16791OooO00o;
        public boolean OooO0O0;
        public boolean OooO0OO;
        public boolean OooO0Oo;

        /* renamed from: com.pd.sdk.L丨1Lii1$OooO$OooO00o */
        public class OooO00o extends AbstractC9508LiLi<T> {
            public long OooO00o = this.OooO0O0;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ BufferUntilSubscriber f16793OooO00o;
            public final /* synthetic */ long OooO0O0;

            public OooO00o(long j, BufferUntilSubscriber bufferUntilSubscriber) {
                this.OooO0O0 = j;
                this.f16793OooO00o = bufferUntilSubscriber;
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onCompleted() {
                this.f16793OooO00o.onCompleted();
                long j = this.OooO00o;
                if (j > 0) {
                    OooO.this.OooO0O0(j);
                }
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onError(Throwable th) {
                this.f16793OooO00o.onError(th);
            }

            @Override // com.p118pd.sdk.AbstractC5477Il11
            public void onNext(T t) {
                this.OooO00o--;
                this.f16793OooO00o.onNext(t);
            }
        }

        /* renamed from: com.pd.sdk.L丨1Lii1$OooO$OooO0O0 */
        public class OooO0O0 implements liii1l {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AbstractC9508LiLi f16794OooO00o;

            public OooO0O0(AbstractC9508LiLi r2) {
                this.f16794OooO00o = r2;
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                OooO.this.f16784OooO00o.OooO0O0(this.f16794OooO00o);
            }
        }

        public OooO(L1Lii1<S, T> r2, S s, OooOO0<C9349III<T>> oooOO0) {
            this.f16787OooO00o = r2;
            this.f16785OooO00o = new C5468IllIL<>(this);
            this.f16789OooO00o = s;
            this.f16786OooO00o = oooOO0;
            this.f16791OooO00o = new AtomicBoolean();
        }

        public void OooO00o(AbstractC9465L1l1 r2) {
            if (this.f16788OooO00o == null) {
                this.f16788OooO00o = r2;
                return;
            }
            throw new IllegalStateException("setConcatProducer may be called at most once!");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:18:0x002c, code lost:
            if (m16421OooO00o(r4) == false) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x002e, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
            monitor-enter(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
            r4 = r3.f16790OooO00o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x0032, code lost:
            if (r4 != null) goto L_0x0039;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0034, code lost:
            r3.OooO0Oo = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0037, code lost:
            monitor-exit(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x0038, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0039, code lost:
            r3.f16790OooO00o = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x003c, code lost:
            monitor-exit(r3);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x003d, code lost:
            r4 = r4.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x0045, code lost:
            if (r4.hasNext() == false) goto L_0x002f;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x0055, code lost:
            if (m16421OooO00o(r4.next().longValue()) == false) goto L_0x0041;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x0057, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void OooO0O0(long r4) {
            /*
            // Method dump skipped, instructions count: 119
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.L1Lii1.OooO.OooO0O0(long):void");
        }

        @Override // com.p118pd.sdk.LlIiLii
        public boolean isUnsubscribed() {
            return this.f16791OooO00o.get();
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onCompleted() {
            if (!this.OooO0O0) {
                this.OooO0O0 = true;
                this.f16786OooO00o.onCompleted();
                return;
            }
            throw new IllegalStateException("Terminal event already emitted.");
        }

        @Override // com.p118pd.sdk.AbstractC5477Il11
        public void onError(Throwable th) {
            if (!this.OooO0O0) {
                this.OooO0O0 = true;
                this.f16786OooO00o.onError(th);
                return;
            }
            throw new IllegalStateException("Terminal event already emitted.");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:30:0x0045, code lost:
            r5 = r5.iterator();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x004d, code lost:
            if (r5.hasNext() == false) goto L_0x0038;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x005d, code lost:
            if (m16421OooO00o(r5.next().longValue()) == false) goto L_0x0049;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x005f, code lost:
            return;
         */
        @Override // com.p118pd.sdk.AbstractC9465L1l1
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void request(long r5) {
            /*
            // Method dump skipped, instructions count: 127
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.L1Lii1.OooO.request(long):void");
        }

        @Override // com.p118pd.sdk.LlIiLii
        public void unsubscribe() {
            if (this.f16791OooO00o.compareAndSet(false, true)) {
                synchronized (this) {
                    if (this.OooO0Oo) {
                        ArrayList arrayList = new ArrayList();
                        this.f16790OooO00o = arrayList;
                        arrayList.add(0L);
                        return;
                    }
                    this.OooO0Oo = true;
                    OooO00o();
                }
            }
        }

        public void OooO00o(long j) {
            this.f16789OooO00o = this.f16787OooO00o.OooO00o(this.f16789OooO00o, j, this.f16785OooO00o);
        }

        public void OooO00o() {
            this.f16784OooO00o.unsubscribe();
            try {
                this.f16787OooO00o.OooO00o((Object) this.f16789OooO00o);
            } catch (Throwable th) {
                OooO00o(th);
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m16421OooO00o(long j) {
            if (isUnsubscribed()) {
                OooO00o();
                return true;
            }
            try {
                this.OooO0OO = false;
                this.OooO00o = j;
                OooO00o(j);
                if (!this.OooO0O0) {
                    if (!isUnsubscribed()) {
                        if (this.OooO0OO) {
                            return false;
                        }
                        OooO00o(new IllegalStateException("No events emitted!"));
                        return true;
                    }
                }
                OooO00o();
                return true;
            } catch (Throwable th) {
                OooO00o(th);
                return true;
            }
        }

        private void OooO00o(Throwable th) {
            if (this.OooO0O0) {
                C9714lli.m21756OooO00o(th);
                return;
            }
            this.OooO0O0 = true;
            this.f16786OooO00o.onError(th);
            OooO00o();
        }

        private void OooO0O0(C9349III<? extends T> r5) {
            BufferUntilSubscriber OooO00o2 = BufferUntilSubscriber.OooO00o();
            OooO00o oooO00o = new OooO00o(this.OooO00o, OooO00o2);
            this.f16784OooO00o.OooO00o(oooO00o);
            r5.OooO0Oo((liii1l) new OooO0O0(oooO00o)).OooO00o((AbstractC9508LiLi<? super Object>) oooO00o);
            this.f16786OooO00o.onNext(OooO00o2);
        }

        /* renamed from: OooO00o */
        public void onNext(C9349III<? extends T> r2) {
            if (!this.OooO0OO) {
                this.OooO0OO = true;
                if (!this.OooO0O0) {
                    OooO0O0(r2);
                    return;
                }
                return;
            }
            throw new IllegalStateException("onNext called multiple times!");
        }
    }

    public static <S, T> L1Lii1<S, T> OooO00o(LiLIll<? extends S> r1, AbstractC6752llII<? super S, Long, ? super AbstractC5477Il11<C9349III<? extends T>>> llii, AbstractC6153iL1l<? super S> il1l) {
        return new C5829OooO0oo(r1, new OooO0O0(llii), il1l);
    }

    public static <S, T> L1Lii1<S, T> OooO00o(LiLIll<? extends S> r1, AbstractC9359IIIi<? super S, Long, ? super AbstractC5477Il11<C9349III<? extends T>>, ? extends S> r2, AbstractC6153iL1l<? super S> il1l) {
        return new C5829OooO0oo(r1, r2, il1l);
    }

    public static <S, T> L1Lii1<S, T> OooO00o(LiLIll<? extends S> r1, AbstractC9359IIIi<? super S, Long, ? super AbstractC5477Il11<C9349III<? extends T>>, ? extends S> r2) {
        return new C5829OooO0oo(r1, r2);
    }

    public static <T> L1Lii1<Void, T> OooO00o(AbstractC9583iI1Il<Long, ? super AbstractC5477Il11<C9349III<? extends T>>> r1) {
        return new C5829OooO0oo(new OooO0OO(r1));
    }

    public static <T> L1Lii1<Void, T> OooO00o(AbstractC9583iI1Il<Long, ? super AbstractC5477Il11<C9349III<? extends T>>> r1, liii1l r2) {
        return new C5829OooO0oo(new C5826OooO0Oo(r1), new C5827OooO0o0(r2));
    }

    public final void OooO00o(AbstractC9508LiLi<? super T> r5) {
        try {
            S OooO00o2 = OooO00o();
            OooOO0 OooO00o3 = OooOO0.OooO00o();
            OooO oooO = new OooO(this, OooO00o2, OooO00o3);
            OooO0o oooO0o = new OooO0o(r5, oooO);
            OooO00o3.OooOOO().OooO0O0((AbstractC9847l1) new C5828OooO0oO()).OooO0O0(oooO0o);
            r5.add(oooO0o);
            r5.add(oooO);
            r5.setProducer(oooO);
        } catch (Throwable th) {
            r5.onError(th);
        }
    }
}
