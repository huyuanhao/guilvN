package com.p118pd.sdk;

import com.p118pd.sdk.C5876LlIl;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.LL1LL;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import p293rx.Notification;
import p293rx.annotations.Experimental;
import p293rx.functions.Actions;
import p293rx.internal.operators.SingleFromEmitter;
import p293rx.internal.util.UtilityFunctions;

/* renamed from: com.pd.sdk.LL丨il11  reason: invalid class name */
public class LLil11<T> {
    public final OooOo00<T> OooO00o;

    /* renamed from: com.pd.sdk.LL丨il11$OooO */
    public static class OooO implements OooOo00<T> {
        public final /* synthetic */ Callable OooO00o;

        public OooO(Callable callable) {
            this.OooO00o = callable;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC93021L<? super T> r2) {
            try {
                ((LLil11) this.OooO00o.call()).OooO00o((AbstractC93021L) r2);
            } catch (Throwable th) {
                IIl11.m15447OooO00o(th);
                r2.onError(th);
            }
        }
    }

    /* renamed from: com.pd.sdk.LL丨il11$OooO00o */
    public static class OooO00o implements AbstractC6021i1L<R> {
        public final /* synthetic */ C1i1li OooO00o;

        public OooO00o(C1i1li r1) {
            this.OooO00o = r1;
        }

        @Override // com.p118pd.sdk.AbstractC6021i1L
        public R call(Object... objArr) {
            return (R) this.OooO00o.OooO00o(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7], objArr[8]);
        }
    }

    /* renamed from: com.pd.sdk.LL丨il11$OooO0O0 */
    public class OooO0O0 extends AbstractC93021L<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC6153iL1l f16521OooO00o;
        public final /* synthetic */ AbstractC6153iL1l OooO0O0;

        public OooO0O0(AbstractC6153iL1l il1l, AbstractC6153iL1l il1l2) {
            this.f16521OooO00o = il1l;
            this.OooO0O0 = il1l2;
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public final void OooO00o(T t) {
            try {
                this.OooO0O0.call(t);
            } finally {
                unsubscribe();
            }
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public final void onError(Throwable th) {
            try {
                this.f16521OooO00o.call(th);
            } finally {
                unsubscribe();
            }
        }
    }

    /* renamed from: com.pd.sdk.LL丨il11$OooO0OO */
    public class OooO0OO extends AbstractC93021L<T> {
        public final /* synthetic */ AbstractC5477Il11 OooO00o;

        public OooO0OO(AbstractC5477Il11 r2) {
            this.OooO00o = r2;
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void OooO00o(T t) {
            this.OooO00o.onNext(t);
            this.OooO00o.onCompleted();
        }

        @Override // com.p118pd.sdk.AbstractC93021L
        public void onError(Throwable th) {
            this.OooO00o.onError(th);
        }
    }

    /* renamed from: com.pd.sdk.LL丨il11$OooO0Oo  reason: case insensitive filesystem */
    public class C5681OooO0Oo implements OooOo00<T> {
        public final /* synthetic */ LL1LL OooO00o;

        /* renamed from: com.pd.sdk.LL丨il11$OooO0Oo$OooO00o */
        public class OooO00o implements liii1l {
            public final /* synthetic */ LL1LL.OooO00o OooO00o;

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AbstractC93021L f16525OooO00o;

            /* renamed from: com.pd.sdk.LL丨il11$OooO0Oo$OooO00o$OooO00o  reason: collision with other inner class name */
            public class C4922OooO00o extends AbstractC93021L<T> {
                public C4922OooO00o() {
                }

                @Override // com.p118pd.sdk.AbstractC93021L
                public void OooO00o(T t) {
                    try {
                        OooO00o.this.f16525OooO00o.OooO00o((Object) t);
                    } finally {
                        OooO00o.this.OooO00o.unsubscribe();
                    }
                }

                @Override // com.p118pd.sdk.AbstractC93021L
                public void onError(Throwable th) {
                    try {
                        OooO00o.this.f16525OooO00o.onError(th);
                    } finally {
                        OooO00o.this.OooO00o.unsubscribe();
                    }
                }
            }

            public OooO00o(AbstractC93021L r2, LL1LL.OooO00o oooO00o) {
                this.f16525OooO00o = r2;
                this.OooO00o = oooO00o;
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                C4922OooO00o oooO00o = new C4922OooO00o();
                this.f16525OooO00o.OooO00o((LlIiLii) oooO00o);
                LLil11.this.OooO00o((AbstractC93021L) oooO00o);
            }
        }

        public C5681OooO0Oo(LL1LL ll1ll) {
            this.OooO00o = ll1ll;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC93021L<? super T> r3) {
            LL1LL.OooO00o OooO00o2 = this.OooO00o.m16172OooO00o();
            r3.OooO00o((LlIiLii) OooO00o2);
            OooO00o2.OooO00o(new OooO00o(r3, OooO00o2));
        }
    }

    /* renamed from: com.pd.sdk.LL丨il11$OooO0o */
    public class OooO0o implements AbstractC6153iL1l<Throwable> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC6153iL1l f16526OooO00o;

        public OooO0o(AbstractC6153iL1l il1l) {
            this.f16526OooO00o = il1l;
        }

        /* renamed from: OooO00o */
        public void call(Throwable th) {
            this.f16526OooO00o.call(th);
        }
    }

    /* renamed from: com.pd.sdk.LL丨il11$OooO0o0  reason: case insensitive filesystem */
    public class C5682OooO0o0 implements LiLIll<LLil11<T>> {
        public C5682OooO0o0() {
        }

        /* renamed from: OooO00o */
        public LLil11<T> call() {
            return LLil11.OooO00o((Throwable) new TimeoutException());
        }
    }

    /* renamed from: com.pd.sdk.LL丨il11$OooO0oO  reason: case insensitive filesystem */
    public class C5683OooO0oO implements AbstractC6153iL1l<T> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC6153iL1l f16527OooO00o;

        public C5683OooO0oO(AbstractC6153iL1l il1l) {
            this.f16527OooO00o = il1l;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.pd.sdk.iL1l */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p118pd.sdk.AbstractC6153iL1l
        public void call(T t) {
            this.f16527OooO00o.call(Notification.OooO00o((Object) t));
        }
    }

    /* renamed from: com.pd.sdk.LL丨il11$OooO0oo  reason: case insensitive filesystem */
    public class C5684OooO0oo implements AbstractC6153iL1l<Throwable> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC6153iL1l f16528OooO00o;

        public C5684OooO0oo(AbstractC6153iL1l il1l) {
            this.f16528OooO00o = il1l;
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.pd.sdk.iL1l */
        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: OooO00o */
        public void call(Throwable th) {
            this.f16528OooO00o.call(Notification.OooO00o(th));
        }
    }

    /* renamed from: com.pd.sdk.LL丨il11$OooOO0 */
    public class OooOO0 implements OooOo00<T> {
        public final /* synthetic */ LL1LL OooO00o;

        /* renamed from: com.pd.sdk.LL丨il11$OooOO0$OooO00o */
        public class OooO00o extends AbstractC93021L<T> {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AbstractC93021L f16530OooO00o;

            public OooO00o(AbstractC93021L r2) {
                this.f16530OooO00o = r2;
            }

            @Override // com.p118pd.sdk.AbstractC93021L
            public void OooO00o(T t) {
                this.f16530OooO00o.OooO00o((Object) t);
            }

            @Override // com.p118pd.sdk.AbstractC93021L
            public void onError(Throwable th) {
                this.f16530OooO00o.onError(th);
            }
        }

        /* renamed from: com.pd.sdk.LL丨il11$OooOO0$OooO0O0 */
        public class OooO0O0 implements liii1l {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AbstractC93021L f16531OooO00o;

            /* renamed from: com.pd.sdk.LL丨il11$OooOO0$OooO0O0$OooO00o */
            public class OooO00o implements liii1l {
                public final /* synthetic */ LL1LL.OooO00o OooO00o;

                public OooO00o(LL1LL.OooO00o oooO00o) {
                    this.OooO00o = oooO00o;
                }

                @Override // com.p118pd.sdk.liii1l
                public void call() {
                    try {
                        OooO0O0.this.f16531OooO00o.unsubscribe();
                    } finally {
                        this.OooO00o.unsubscribe();
                    }
                }
            }

            public OooO0O0(AbstractC93021L r2) {
                this.f16531OooO00o = r2;
            }

            @Override // com.p118pd.sdk.liii1l
            public void call() {
                LL1LL.OooO00o OooO00o2 = OooOO0.this.OooO00o.m16172OooO00o();
                OooO00o2.OooO00o(new OooO00o(OooO00o2));
            }
        }

        public OooOO0(LL1LL ll1ll) {
            this.OooO00o = ll1ll;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC93021L<? super T> r3) {
            OooO00o oooO00o = new OooO00o(r3);
            r3.OooO00o(C9638ill.OooO00o(new OooO0O0(oooO00o)));
            LLil11.this.OooO00o((AbstractC93021L) oooO00o);
        }
    }

    /* renamed from: com.pd.sdk.LL丨il11$OooOO0O */
    public static class OooOO0O implements OooOo00<T> {
        public final /* synthetic */ Throwable OooO00o;

        public OooOO0O(Throwable th) {
            this.OooO00o = th;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC93021L<? super T> r2) {
            r2.onError(this.OooO00o);
        }
    }

    /* renamed from: com.pd.sdk.LL丨il11$OooOO0o  reason: case insensitive filesystem */
    public static class C5685OooOO0o implements OooOo00<T> {
        public final /* synthetic */ LLil11 OooO00o;

        /* renamed from: com.pd.sdk.LL丨il11$OooOO0o$OooO00o */
        public class OooO00o extends AbstractC93021L<LLil11<? extends T>> {

            /* renamed from: OooO00o  reason: collision with other field name */
            public final /* synthetic */ AbstractC93021L f16533OooO00o;

            public OooO00o(AbstractC93021L r2) {
                this.f16533OooO00o = r2;
            }

            @Override // com.p118pd.sdk.AbstractC93021L
            public /* bridge */ /* synthetic */ void OooO00o(Object obj) {
                OooO00o((LLil11) ((LLil11) obj));
            }

            @Override // com.p118pd.sdk.AbstractC93021L
            public void onError(Throwable th) {
                this.f16533OooO00o.onError(th);
            }

            public void OooO00o(LLil11<? extends T> r2) {
                r2.OooO00o(this.f16533OooO00o);
            }
        }

        public C5685OooOO0o(LLil11 r1) {
            this.OooO00o = r1;
        }

        /* renamed from: OooO00o */
        public void call(AbstractC93021L<? super T> r2) {
            OooO00o oooO00o = new OooO00o(r2);
            r2.OooO00o((LlIiLii) oooO00o);
            this.OooO00o.OooO00o((AbstractC93021L) oooO00o);
        }
    }

    /* renamed from: com.pd.sdk.LL丨il11$OooOOO */
    public static class OooOOO implements AbstractC6021i1L<R> {
        public final /* synthetic */ AbstractC9359IIIi OooO00o;

        public OooOOO(AbstractC9359IIIi r1) {
            this.OooO00o = r1;
        }

        @Override // com.p118pd.sdk.AbstractC6021i1L
        public R call(Object... objArr) {
            return (R) this.OooO00o.OooO00o(objArr[0], objArr[1], objArr[2]);
        }
    }

    /* renamed from: com.pd.sdk.LL丨il11$OooOOO0 */
    public static class OooOOO0 implements AbstractC6021i1L<R> {
        public final /* synthetic */ AbstractC5189I1l1l OooO00o;

        public OooOOO0(AbstractC5189I1l1l r1) {
            this.OooO00o = r1;
        }

        @Override // com.p118pd.sdk.AbstractC6021i1L
        public R call(Object... objArr) {
            return (R) this.OooO00o.OooO00o(objArr[0], objArr[1]);
        }
    }

    /* renamed from: com.pd.sdk.LL丨il11$OooOOOO */
    public static class OooOOOO implements AbstractC6021i1L<R> {
        public final /* synthetic */ i1li1ii1 OooO00o;

        public OooOOOO(i1li1ii1 i1li1ii1) {
            this.OooO00o = i1li1ii1;
        }

        @Override // com.p118pd.sdk.AbstractC6021i1L
        public R call(Object... objArr) {
            return (R) this.OooO00o.OooO00o(objArr[0], objArr[1], objArr[2], objArr[3]);
        }
    }

    /* renamed from: com.pd.sdk.LL丨il11$OooOOOo  reason: case insensitive filesystem */
    public static class C5686OooOOOo implements AbstractC6021i1L<R> {
        public final /* synthetic */ Il1lLL11 OooO00o;

        public C5686OooOOOo(Il1lLL11 il1lLL11) {
            this.OooO00o = il1lLL11;
        }

        @Override // com.p118pd.sdk.AbstractC6021i1L
        public R call(Object... objArr) {
            return (R) this.OooO00o.OooO00o(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4]);
        }
    }

    /* renamed from: com.pd.sdk.LL丨il11$OooOOo  reason: case insensitive filesystem */
    public static class C5687OooOOo implements AbstractC6021i1L<R> {
        public final /* synthetic */ AbstractC5351IiIi OooO00o;

        public C5687OooOOo(AbstractC5351IiIi iiIi) {
            this.OooO00o = iiIi;
        }

        @Override // com.p118pd.sdk.AbstractC6021i1L
        public R call(Object... objArr) {
            return (R) this.OooO00o.OooO00o(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6]);
        }
    }

    /* renamed from: com.pd.sdk.LL丨il11$OooOOo0  reason: case insensitive filesystem */
    public static class C5688OooOOo0 implements AbstractC6021i1L<R> {
        public final /* synthetic */ AbstractC9474LI1lil OooO00o;

        public C5688OooOOo0(AbstractC9474LI1lil r1) {
            this.OooO00o = r1;
        }

        @Override // com.p118pd.sdk.AbstractC6021i1L
        public R call(Object... objArr) {
            return (R) this.OooO00o.OooO00o(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5]);
        }
    }

    /* renamed from: com.pd.sdk.LL丨il11$OooOOoo  reason: case insensitive filesystem */
    public static class C5689OooOOoo implements AbstractC6021i1L<R> {
        public final /* synthetic */ AbstractC5634LIiL OooO00o;

        public C5689OooOOoo(AbstractC5634LIiL r1) {
            this.OooO00o = r1;
        }

        @Override // com.p118pd.sdk.AbstractC6021i1L
        public R call(Object... objArr) {
            return (R) this.OooO00o.OooO00o(objArr[0], objArr[1], objArr[2], objArr[3], objArr[4], objArr[5], objArr[6], objArr[7]);
        }
    }

    /* renamed from: com.pd.sdk.LL丨il11$OooOo0  reason: case insensitive filesystem */
    public interface AbstractC5690OooOo0<T, R> extends AbstractC9847l1<LLil11<T>, LLil11<R>> {
    }

    /* renamed from: com.pd.sdk.LL丨il11$OooOo00 */
    public interface OooOo00<T> extends AbstractC6153iL1l<AbstractC93021L<? super T>> {
    }

    public LLil11(OooOo00<T> oooOo00) {
        this.OooO00o = C9714lli.OooO00o((OooOo00) oooOo00);
    }

    public static <T> LLil11<T> OooO00o(OooOo00<T> oooOo00) {
        return new LLil11<>(oooOo00);
    }

    public static <T> LLil11<T> OooO0O0(Callable<? extends T> callable) {
        return OooO00o((OooOo00) new C6060i1L1(callable));
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static <T> C9349III<T> m16255OooO0OO(LLil11<T> r1) {
        return C9349III.OooO0O0((C9349III.OooO00o) new iliI1lL(r1.OooO00o));
    }

    public static <T> LLil11<T> OooO0Oo(AbstractC6153iL1l<AbstractC6876llL<T>> il1l) {
        if (il1l != null) {
            return OooO00o((OooOo00) new SingleFromEmitter(il1l));
        }
        throw new NullPointerException("producer is null");
    }

    public final LLil11<T> OooO0o0(AbstractC9847l1<C9349III<? extends Throwable>, ? extends C9349III<?>> r2) {
        return m16263OooO00o().OooOoO0(r2).OooO00o();
    }

    public static <T> C9349III<T> OooO0O0(LLil11<? extends T> r0, LLil11<? extends T> r1) {
        return C9349III.OooO0o0(m16255OooO0OO((LLil11) r0), m16255OooO0OO((LLil11) r1));
    }

    public static <T> LLil11<T> OooO0OO(LLil11<? extends LLil11<? extends T>> r1) {
        if (r1 instanceof IllIIlL) {
            return ((IllIIlL) r1).OooO0o(UtilityFunctions.OooO0OO());
        }
        return OooO00o((OooOo00) new C5685OooOO0o(r1));
    }

    public final <R> LLil11<R> OooO00o(C9349III.OooO0O0<? extends R, ? super T> oooO0O0) {
        return OooO00o((OooOo00) new C5710LiLl(this.OooO00o, oooO0O0));
    }

    @Deprecated
    public LLil11(C9349III.OooO00o<T> oooO00o) {
        this.OooO00o = C9714lli.OooO00o((OooOo00) new C5908LlLlI1(oooO00o));
    }

    public static <T> C9349III<T> OooO0O0(LLil11<? extends T> r0, LLil11<? extends T> r1, LLil11<? extends T> r2) {
        return C9349III.OooO0o0(m16255OooO0OO((LLil11) r0), m16255OooO0OO((LLil11) r1), m16255OooO0OO((LLil11) r2));
    }

    public <R> LLil11<R> OooO00o(AbstractC5690OooOo0<? super T, ? extends R> oooOo0) {
        return (LLil11) oooOo0.call(this);
    }

    public final LLil11<T> OooO0Oo(AbstractC9847l1<Throwable, ? extends T> r3) {
        return OooO00o((OooOo00) new C9338I1L1(this.OooO00o, r3));
    }

    public static <T> C9349III<T> OooO00o(LLil11<? extends T> r0, LLil11<? extends T> r1) {
        return C9349III.OooO0O0(m16255OooO0OO((LLil11) r0), m16255OooO0OO((LLil11) r1));
    }

    public static <T> C9349III<T> OooO0O0(LLil11<? extends T> r0, LLil11<? extends T> r1, LLil11<? extends T> r2, LLil11<? extends T> r3) {
        return C9349III.OooO0o0(m16255OooO0OO((LLil11) r0), m16255OooO0OO((LLil11) r1), m16255OooO0OO((LLil11) r2), m16255OooO0OO((LLil11) r3));
    }

    public static <T> C9349III<T> OooO00o(LLil11<? extends T> r0, LLil11<? extends T> r1, LLil11<? extends T> r2) {
        return C9349III.OooO0O0(m16255OooO0OO((LLil11) r0), m16255OooO0OO((LLil11) r1), m16255OooO0OO((LLil11) r2));
    }

    public static <T> C9349III<T> OooO0O0(LLil11<? extends T> r0, LLil11<? extends T> r1, LLil11<? extends T> r2, LLil11<? extends T> r3, LLil11<? extends T> r4) {
        return C9349III.OooO0o0(m16255OooO0OO((LLil11) r0), m16255OooO0OO((LLil11) r1), m16255OooO0OO((LLil11) r2), m16255OooO0OO((LLil11) r3), m16255OooO0OO((LLil11) r4));
    }

    public final LLil11<T> OooO0OO(AbstractC9847l1<Throwable, ? extends LLil11<? extends T>> r2) {
        return new LLil11<>(C6036i1iIl.OooO00o(this, r2));
    }

    public static <T> C9349III<T> OooO00o(LLil11<? extends T> r0, LLil11<? extends T> r1, LLil11<? extends T> r2, LLil11<? extends T> r3) {
        return C9349III.OooO0O0(m16255OooO0OO((LLil11) r0), m16255OooO0OO((LLil11) r1), m16255OooO0OO((LLil11) r2), m16255OooO0OO((LLil11) r3));
    }

    public static <T> C9349III<T> OooO0O0(LLil11<? extends T> r0, LLil11<? extends T> r1, LLil11<? extends T> r2, LLil11<? extends T> r3, LLil11<? extends T> r4, LLil11<? extends T> r5) {
        return C9349III.OooO0o0(m16255OooO0OO((LLil11) r0), m16255OooO0OO((LLil11) r1), m16255OooO0OO((LLil11) r2), m16255OooO0OO((LLil11) r3), m16255OooO0OO((LLil11) r4), m16255OooO0OO((LLil11) r5));
    }

    public final LLil11<T> OooO0OO(AbstractC6153iL1l<? super T> il1l) {
        if (il1l != null) {
            return OooO00o((OooOo00) new C6302ilIi(this, il1l, Actions.m22996OooO00o()));
        }
        throw new IllegalArgumentException("onSuccess is null");
    }

    public static <T> C9349III<T> OooO00o(LLil11<? extends T> r0, LLil11<? extends T> r1, LLil11<? extends T> r2, LLil11<? extends T> r3, LLil11<? extends T> r4) {
        return C9349III.OooO0O0(m16255OooO0OO((LLil11) r0), m16255OooO0OO((LLil11) r1), m16255OooO0OO((LLil11) r2), m16255OooO0OO((LLil11) r3), m16255OooO0OO((LLil11) r4));
    }

    public static <T> C9349III<T> OooO0O0(LLil11<? extends T> r0, LLil11<? extends T> r1, LLil11<? extends T> r2, LLil11<? extends T> r3, LLil11<? extends T> r4, LLil11<? extends T> r5, LLil11<? extends T> r6) {
        return C9349III.OooO0o0(m16255OooO0OO((LLil11) r0), m16255OooO0OO((LLil11) r1), m16255OooO0OO((LLil11) r2), m16255OooO0OO((LLil11) r3), m16255OooO0OO((LLil11) r4), m16255OooO0OO((LLil11) r5), m16255OooO0OO((LLil11) r6));
    }

    public static <T> C9349III<T> OooO00o(LLil11<? extends T> r0, LLil11<? extends T> r1, LLil11<? extends T> r2, LLil11<? extends T> r3, LLil11<? extends T> r4, LLil11<? extends T> r5) {
        return C9349III.OooO0O0(m16255OooO0OO((LLil11) r0), m16255OooO0OO((LLil11) r1), m16255OooO0OO((LLil11) r2), m16255OooO0OO((LLil11) r3), m16255OooO0OO((LLil11) r4), m16255OooO0OO((LLil11) r5));
    }

    public static <T> C9349III<T> OooO0O0(LLil11<? extends T> r0, LLil11<? extends T> r1, LLil11<? extends T> r2, LLil11<? extends T> r3, LLil11<? extends T> r4, LLil11<? extends T> r5, LLil11<? extends T> r6, LLil11<? extends T> r7) {
        return C9349III.OooO0o0(m16255OooO0OO((LLil11) r0), m16255OooO0OO((LLil11) r1), m16255OooO0OO((LLil11) r2), m16255OooO0OO((LLil11) r3), m16255OooO0OO((LLil11) r4), m16255OooO0OO((LLil11) r5), m16255OooO0OO((LLil11) r6), m16255OooO0OO((LLil11) r7));
    }

    public static <T> C9349III<T> OooO00o(LLil11<? extends T> r0, LLil11<? extends T> r1, LLil11<? extends T> r2, LLil11<? extends T> r3, LLil11<? extends T> r4, LLil11<? extends T> r5, LLil11<? extends T> r6) {
        return C9349III.OooO0O0(m16255OooO0OO((LLil11) r0), m16255OooO0OO((LLil11) r1), m16255OooO0OO((LLil11) r2), m16255OooO0OO((LLil11) r3), m16255OooO0OO((LLil11) r4), m16255OooO0OO((LLil11) r5), m16255OooO0OO((LLil11) r6));
    }

    public static <T> C9349III<T> OooO0O0(LLil11<? extends T> r0, LLil11<? extends T> r1, LLil11<? extends T> r2, LLil11<? extends T> r3, LLil11<? extends T> r4, LLil11<? extends T> r5, LLil11<? extends T> r6, LLil11<? extends T> r7, LLil11<? extends T> r8) {
        return C9349III.OooO0o0(m16255OooO0OO((LLil11) r0), m16255OooO0OO((LLil11) r1), m16255OooO0OO((LLil11) r2), m16255OooO0OO((LLil11) r3), m16255OooO0OO((LLil11) r4), m16255OooO0OO((LLil11) r5), m16255OooO0OO((LLil11) r6), m16255OooO0OO((LLil11) r7), m16255OooO0OO((LLil11) r8));
    }

    public final LLil11<T> OooO0OO(liii1l r3) {
        return OooO00o((OooOo00) new I11ILiL(this.OooO00o, r3));
    }

    public static <T> C9349III<T> OooO00o(LLil11<? extends T> r0, LLil11<? extends T> r1, LLil11<? extends T> r2, LLil11<? extends T> r3, LLil11<? extends T> r4, LLil11<? extends T> r5, LLil11<? extends T> r6, LLil11<? extends T> r7) {
        return C9349III.OooO0O0(m16255OooO0OO((LLil11) r0), m16255OooO0OO((LLil11) r1), m16255OooO0OO((LLil11) r2), m16255OooO0OO((LLil11) r3), m16255OooO0OO((LLil11) r4), m16255OooO0OO((LLil11) r5), m16255OooO0OO((LLil11) r6), m16255OooO0OO((LLil11) r7));
    }

    public static <T> C9349III<T> OooO0O0(C9349III<? extends LLil11<? extends T>> r1) {
        return OooO00o(r1, Integer.MAX_VALUE);
    }

    @Experimental
    public final LLil11<T> OooO0OO(LL1LL ll1ll) {
        return OooO00o((OooOo00) new OooOO0(ll1ll));
    }

    public static <T> C9349III<T> OooO00o(LLil11<? extends T> r0, LLil11<? extends T> r1, LLil11<? extends T> r2, LLil11<? extends T> r3, LLil11<? extends T> r4, LLil11<? extends T> r5, LLil11<? extends T> r6, LLil11<? extends T> r7, LLil11<? extends T> r8) {
        return C9349III.OooO0O0(m16255OooO0OO((LLil11) r0), m16255OooO0OO((LLil11) r1), m16255OooO0OO((LLil11) r2), m16255OooO0OO((LLil11) r3), m16255OooO0OO((LLil11) r4), m16255OooO0OO((LLil11) r5), m16255OooO0OO((LLil11) r6), m16255OooO0OO((LLil11) r7), m16255OooO0OO((LLil11) r8));
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public static <T> C9349III<T> OooO0O0(C9349III<? extends LLil11<? extends T>> r2, int i) {
        return (C9349III<R>) r2.OooO0O0(UtilityFunctions.OooO0OO(), true, i);
    }

    public static <T> LLil11<T> OooO00o(Throwable th) {
        return OooO00o((OooOo00) new OooOO0O(th));
    }

    public final <R> LLil11<R> OooO0O0(AbstractC9847l1<? super T, ? extends R> r2) {
        return OooO00o((OooOo00) new C6878llLLI(this, r2));
    }

    public static <T> LLil11<T> OooO00o(Future<? extends T> future) {
        return OooO00o((OooOo00) new C9573i1i(future, 0, null));
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public final C9349III<T> m16268OooO0O0(LLil11<? extends T> r1) {
        return OooO0O0(this, r1);
    }

    public static <T> LLil11<T> OooO00o(Future<? extends T> future, long j, TimeUnit timeUnit) {
        if (timeUnit != null) {
            return OooO00o((OooOo00) new C9573i1i(future, j, timeUnit));
        }
        throw new NullPointerException("unit is null");
    }

    public final LlIiLii OooO0O0(AbstractC9508LiLi<? super T> r2) {
        return OooO00o((AbstractC9508LiLi) r2, true);
    }

    public final LLil11<T> OooO0O0(LL1LL ll1ll) {
        if (this instanceof IllIIlL) {
            return ((IllIIlL) this).OooO0Oo(ll1ll);
        }
        return OooO00o((OooOo00) new C5681OooO0Oo(ll1ll));
    }

    public static <T> LLil11<T> OooO00o(Future<? extends T> future, LL1LL ll1ll) {
        return OooO00o((Future) future).OooO0O0(ll1ll);
    }

    public static <T> LLil11<T> OooO00o(T t) {
        return IllIIlL.OooO00o((Object) t);
    }

    public static <T> C9349III<T> OooO00o(C9349III<? extends LLil11<? extends T>> r1) {
        return OooO00o(r1, Integer.MAX_VALUE);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public final <E> LLil11<T> m16267OooO0O0(C9349III<? extends E> r3) {
        return OooO00o((OooOo00) new l1Iii1i(this.OooO00o, r3));
    }

    /* JADX DEBUG: Type inference failed for r2v1. Raw type applied. Possible types: com.pd.sdk.丨III<R>, com.pd.sdk.丨III<T> */
    public static <T> C9349III<T> OooO00o(C9349III<? extends LLil11<? extends T>> r2, int i) {
        return (C9349III<R>) r2.OooO0O0(UtilityFunctions.OooO0OO(), false, i);
    }

    public final <E> LLil11<T> OooO0O0(LLil11<? extends E> r3) {
        return OooO00o((OooOo00) new C6182iLili(this.OooO00o, r3));
    }

    public static <T1, T2, R> LLil11<R> OooO00o(LLil11<? extends T1> r2, LLil11<? extends T2> r3, AbstractC5189I1l1l<? super T1, ? super T2, ? extends R> r4) {
        return C6189iLlI.OooO00o(new LLil11[]{r2, r3}, new OooOOO0(r4));
    }

    public final LLil11<T> OooO0O0(long j, TimeUnit timeUnit) {
        return OooO00o(j, timeUnit, (LLil11) null, C6261iii1I1.OooO00o());
    }

    public static <T1, T2, T3, R> LLil11<R> OooO00o(LLil11<? extends T1> r2, LLil11<? extends T2> r3, LLil11<? extends T3> r4, AbstractC9359IIIi<? super T1, ? super T2, ? super T3, ? extends R> r5) {
        return C6189iLlI.OooO00o(new LLil11[]{r2, r3, r4}, new OooOOO(r5));
    }

    public final LLil11<T> OooO0O0(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        return OooO00o(j, timeUnit, (LLil11) null, ll1ll);
    }

    public static <T1, T2, T3, T4, R> LLil11<R> OooO00o(LLil11<? extends T1> r2, LLil11<? extends T2> r3, LLil11<? extends T3> r4, LLil11<? extends T4> r5, i1li1ii1<? super T1, ? super T2, ? super T3, ? super T4, ? extends R> i1li1ii1) {
        return C6189iLlI.OooO00o(new LLil11[]{r2, r3, r4, r5}, new OooOOOO(i1li1ii1));
    }

    public final LLil11<T> OooO0O0(AbstractC6153iL1l<Throwable> il1l) {
        if (il1l != null) {
            return OooO00o((OooOo00) new C6302ilIi(this, Actions.m22996OooO00o(), new OooO0o(il1l)));
        }
        throw new IllegalArgumentException("onError is null");
    }

    public static <T1, T2, T3, T4, T5, R> LLil11<R> OooO00o(LLil11<? extends T1> r2, LLil11<? extends T2> r3, LLil11<? extends T3> r4, LLil11<? extends T4> r5, LLil11<? extends T5> r6, Il1lLL11<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? extends R> il1lLL11) {
        return C6189iLlI.OooO00o(new LLil11[]{r2, r3, r4, r5, r6}, new C5686OooOOOo(il1lLL11));
    }

    public static <T1, T2, T3, T4, T5, T6, R> LLil11<R> OooO00o(LLil11<? extends T1> r2, LLil11<? extends T2> r3, LLil11<? extends T3> r4, LLil11<? extends T4> r5, LLil11<? extends T5> r6, LLil11<? extends T6> r7, AbstractC9474LI1lil<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? extends R> r8) {
        return C6189iLlI.OooO00o(new LLil11[]{r2, r3, r4, r5, r6, r7}, new C5688OooOOo0(r8));
    }

    public final LLil11<T> OooO0O0(liii1l r3) {
        return OooO00o((OooOo00) new C5798Lll1(this.OooO00o, r3));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> LLil11<R> OooO00o(LLil11<? extends T1> r2, LLil11<? extends T2> r3, LLil11<? extends T3> r4, LLil11<? extends T4> r5, LLil11<? extends T5> r6, LLil11<? extends T6> r7, LLil11<? extends T7> r8, AbstractC5351IiIi<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? extends R> iiIi) {
        return C6189iLlI.OooO00o(new LLil11[]{r2, r3, r4, r5, r6, r7, r8}, new C5687OooOOo(iiIi));
    }

    public final LLil11<T> OooO0O0() {
        return m16263OooO00o().OooOOoo().OooO00o();
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> LLil11<R> OooO00o(LLil11<? extends T1> r2, LLil11<? extends T2> r3, LLil11<? extends T3> r4, LLil11<? extends T4> r5, LLil11<? extends T5> r6, LLil11<? extends T6> r7, LLil11<? extends T7> r8, LLil11<? extends T8> r9, AbstractC5634LIiL<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? extends R> r10) {
        return C6189iLlI.OooO00o(new LLil11[]{r2, r3, r4, r5, r6, r7, r8, r9}, new C5689OooOOoo(r10));
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> LLil11<R> OooO00o(LLil11<? extends T1> r2, LLil11<? extends T2> r3, LLil11<? extends T3> r4, LLil11<? extends T4> r5, LLil11<? extends T5> r6, LLil11<? extends T6> r7, LLil11<? extends T7> r8, LLil11<? extends T8> r9, LLil11<? extends T9> r10, C1i1li<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, ? super T8, ? super T9, ? extends R> r11) {
        return C6189iLlI.OooO00o(new LLil11[]{r2, r3, r4, r5, r6, r7, r8, r9, r10}, new OooO00o(r11));
    }

    public static <R> LLil11<R> OooO00o(Iterable<? extends LLil11<?>> iterable, AbstractC6021i1L<? extends R> i1l) {
        return C6189iLlI.OooO00o(OooO00o((Iterable) iterable), i1l);
    }

    public final LLil11<T> OooO00o() {
        return m16263OooO00o().OooO0OO(1).OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final C9349III<T> m16264OooO00o(LLil11<? extends T> r1) {
        return OooO00o(this, r1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.丨丨l1<? super T, ? extends com.pd.sdk.LL丨il11<? extends R>> */
    /* JADX WARN: Multi-variable type inference failed */
    public final <R> LLil11<R> OooO00o(AbstractC9847l1<? super T, ? extends LLil11<? extends R>> r2) {
        if (this instanceof IllIIlL) {
            return ((IllIIlL) this).OooO0o(r2);
        }
        return OooO0OO((LLil11) OooO0O0(r2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.pd.sdk.丨丨l1<? super T, ? extends com.pd.sdk.丨III<? extends R>> */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: OooO00o  reason: collision with other method in class */
    public final <R> C9349III<R> m16265OooO00o(AbstractC9847l1<? super T, ? extends C9349III<? extends R>> r1) {
        return C9349III.OooOOo0(m16255OooO0OO((LLil11) OooO0O0(r1)));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final C5876LlIl m16260OooO00o(AbstractC9847l1<? super T, ? extends C5876LlIl> r2) {
        return C5876LlIl.OooO00o((C5876LlIl.AbstractC5898Oooo0O0) new C6173iLLlI(this, r2));
    }

    public final LLil11<T> OooO00o(LL1LL ll1ll) {
        if (this instanceof IllIIlL) {
            return ((IllIIlL) this).OooO0Oo(ll1ll);
        }
        if (ll1ll != null) {
            return OooO00o((OooOo00) new I1i111(this.OooO00o, ll1ll));
        }
        throw new NullPointerException("scheduler is null");
    }

    public final LLil11<T> OooO00o(LLil11<? extends T> r2) {
        return new LLil11<>(C6036i1iIl.OooO00o(this, r2));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final LlIiLii m16257OooO00o() {
        return OooO00o(Actions.m22996OooO00o(), Actions.OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final LlIiLii m16258OooO00o(AbstractC6153iL1l<? super T> il1l) {
        return OooO00o(il1l, Actions.OooO00o());
    }

    public final LlIiLii OooO00o(AbstractC6153iL1l<? super T> il1l, AbstractC6153iL1l<Throwable> il1l2) {
        if (il1l == null) {
            throw new IllegalArgumentException("onSuccess can not be null");
        } else if (il1l2 != null) {
            return OooO00o((AbstractC93021L) new OooO0O0(il1l2, il1l));
        } else {
            throw new IllegalArgumentException("onError can not be null");
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v2, resolved type: com.pd.sdk.LL丨il11$OooOo00 */
    /* JADX WARN: Multi-variable type inference failed */
    private LlIiLii OooO00o(AbstractC9508LiLi<? super T> r4, boolean z) {
        if (z) {
            try {
                r4.onStart();
            } catch (Throwable th) {
                IIl11.m15447OooO00o(th);
                RuntimeException runtimeException = new RuntimeException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th);
                C9714lli.OooO0OO(runtimeException);
                throw runtimeException;
            }
        }
        C9714lli.OooO00o(this, this.OooO00o).call(C5710LiLl.OooO00o(r4));
        return C9714lli.OooO0O0(r4);
    }

    public final LlIiLii OooO00o(AbstractC5477Il11<? super T> r2) {
        if (r2 != null) {
            return OooO00o((AbstractC93021L) new OooO0OO(r2));
        }
        throw new NullPointerException("observer is null");
    }

    public final LlIiLii OooO00o(AbstractC9508LiLi<? super T> r2) {
        if (r2 != null) {
            r2.onStart();
            if (!(r2 instanceof C6158iLI)) {
                return OooO00o((AbstractC9508LiLi) new C6158iLI(r2), false);
            }
            return OooO00o((AbstractC9508LiLi) r2, true);
        }
        throw new IllegalArgumentException("observer can not be null");
    }

    public final LlIiLii OooO00o(AbstractC93021L<? super T> r5) {
        if (r5 != null) {
            try {
                C9714lli.OooO00o(this, this.OooO00o).call(r5);
                return C9714lli.OooO0O0(r5);
            } catch (Throwable th) {
                IIl11.m15447OooO00o(th);
                RuntimeException runtimeException = new RuntimeException("Error occurred attempting to subscribe [" + th.getMessage() + "] and then again while trying to pass to onError.", th);
                C9714lli.OooO0OO(runtimeException);
                throw runtimeException;
            }
        } else {
            throw new IllegalArgumentException("te is null");
        }
    }

    public final LLil11<T> OooO00o(C5876LlIl r3) {
        return OooO00o((OooOo00) new C9381IiLl1i(this.OooO00o, r3));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final <R> R m16266OooO00o(AbstractC9847l1<? super LLil11<T>, R> r1) {
        return r1.call(this);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final C9349III<T> m16263OooO00o() {
        return m16255OooO0OO((LLil11) this);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final C5876LlIl m16259OooO00o() {
        return C5876LlIl.OooO00o((LLil11<?>) this);
    }

    public final LLil11<T> OooO00o(long j, TimeUnit timeUnit, LLil11<? extends T> r10) {
        return OooO00o(j, timeUnit, r10, C6261iii1I1.OooO00o());
    }

    public final LLil11<T> OooO00o(long j, TimeUnit timeUnit, LLil11<? extends T> r12, LL1LL ll1ll) {
        if (r12 == null) {
            r12 = OooO00o((Callable) new C5682OooO0o0());
        }
        return OooO00o((OooOo00) new liilIII1(this.OooO00o, j, timeUnit, ll1ll, r12.OooO00o));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final ilLi1l<T> m16261OooO00o() {
        return ilLi1l.OooO00o(this);
    }

    public final <T2, R> LLil11<R> OooO00o(LLil11<? extends T2> r1, AbstractC5189I1l1l<? super T, ? super T2, ? extends R> r2) {
        return OooO00o(this, r1, r2);
    }

    public final LLil11<T> OooO00o(AbstractC6153iL1l<Notification<? extends T>> il1l) {
        if (il1l != null) {
            return OooO00o((OooOo00) new C6302ilIi(this, new C5683OooO0oO(il1l), new C5684OooO0oo(il1l)));
        }
        throw new IllegalArgumentException("onNotification is null");
    }

    public final LLil11<T> OooO00o(long j, TimeUnit timeUnit, LL1LL ll1ll) {
        return OooO00o((OooOo00) new I11L1lI(this.OooO00o, j, timeUnit, ll1ll));
    }

    public final LLil11<T> OooO00o(long j, TimeUnit timeUnit) {
        return OooO00o(j, timeUnit, C6261iii1I1.OooO00o());
    }

    public static <T> LLil11<T> OooO00o(Callable<LLil11<T>> callable) {
        return OooO00o((OooOo00) new OooO(callable));
    }

    public final LLil11<T> OooO00o(liii1l r2) {
        return OooO00o((OooOo00) new Ii1LiLI(this, r2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v5, resolved type: java.util.Collection */
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> LLil11<? extends T>[] OooO00o(Iterable<? extends LLil11<? extends T>> iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            return (LLil11[]) collection.toArray(new LLil11[collection.size()]);
        }
        LLil11<? extends T>[] r0 = new LLil11[8];
        int i = 0;
        for (LLil11<? extends T> r3 : iterable) {
            if (i == r0.length) {
                LLil11<? extends T>[] r4 = new LLil11[((i >> 2) + i)];
                System.arraycopy(r0, 0, r4, 0, i);
                r0 = r4;
            }
            r0[i] = r3;
            i++;
        }
        if (r0.length == i) {
            return r0;
        }
        LLil11<? extends T>[] r5 = new LLil11[i];
        System.arraycopy(r0, 0, r5, 0, i);
        return r5;
    }

    public final LLil11<T> OooO00o(long j) {
        return m16263OooO00o().OooO0OO(j).OooO00o();
    }

    public final LLil11<T> OooO00o(AbstractC5189I1l1l<Integer, Throwable, Boolean> r2) {
        return m16263OooO00o().OooO0OO(r2).OooO00o();
    }

    public static <T, Resource> LLil11<T> OooO00o(LiLIll<Resource> r1, AbstractC9847l1<? super Resource, ? extends LLil11<? extends T>> r2, AbstractC6153iL1l<? super Resource> il1l) {
        return OooO00o((LiLIll) r1, (AbstractC9847l1) r2, (AbstractC6153iL1l) il1l, false);
    }

    public static <T, Resource> LLil11<T> OooO00o(LiLIll<Resource> r1, AbstractC9847l1<? super Resource, ? extends LLil11<? extends T>> r2, AbstractC6153iL1l<? super Resource> il1l, boolean z) {
        if (r1 == null) {
            throw new NullPointerException("resourceFactory is null");
        } else if (r2 == null) {
            throw new NullPointerException("singleFactory is null");
        } else if (il1l != null) {
            return OooO00o((OooOo00) new C6809lllLI(r1, r2, il1l, z));
        } else {
            throw new NullPointerException("disposeAction is null");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final LLil11<T> m16256OooO00o(C9349III<?> r2) {
        if (r2 != null) {
            return OooO00o((OooOo00) new C6645liI1(this, r2));
        }
        throw null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final C11LlIl1<T> m16262OooO00o() {
        ili1Il OooO00o2 = ili1Il.OooO00o(Long.MAX_VALUE);
        OooO00o((AbstractC9508LiLi) OooO00o2);
        return OooO00o2;
    }
}
