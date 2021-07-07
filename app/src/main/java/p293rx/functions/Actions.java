package p293rx.functions;

import com.p118pd.sdk.AbstractC5189I1l1l;
import com.p118pd.sdk.AbstractC5337Ii11;
import com.p118pd.sdk.AbstractC5351IiIi;
import com.p118pd.sdk.AbstractC5634LIiL;
import com.p118pd.sdk.AbstractC6021i1L;
import com.p118pd.sdk.AbstractC6153iL1l;
import com.p118pd.sdk.AbstractC6522lIl;
import com.p118pd.sdk.AbstractC6713liiII;
import com.p118pd.sdk.AbstractC6729ll1IL;
import com.p118pd.sdk.AbstractC6752llII;
import com.p118pd.sdk.AbstractC9359IIIi;
import com.p118pd.sdk.AbstractC9378IiLI;
import com.p118pd.sdk.AbstractC9474LI1lil;
import com.p118pd.sdk.AbstractC9512LilI;
import com.p118pd.sdk.AbstractC9583iI1Il;
import com.p118pd.sdk.AbstractC9847l1;
import com.p118pd.sdk.AbstractC9865lLi;
import com.p118pd.sdk.C1i1li;
import com.p118pd.sdk.Il1lLL11;
import com.p118pd.sdk.LiLIll;
import com.p118pd.sdk.i1li1ii1;
import com.p118pd.sdk.liii1l;
import p293rx.exceptions.OnErrorNotImplementedException;

/* renamed from: rx.functions.Actions */
public final class Actions {
    public static final OooOOO0 OooO00o = new OooOOO0();

    /* renamed from: rx.functions.Actions$NotImplemented */
    public enum NotImplemented implements AbstractC6153iL1l<Throwable> {
        INSTANCE;

        public void call(Throwable th) {
            throw new OnErrorNotImplementedException(th);
        }
    }

    /* renamed from: rx.functions.Actions$OooO */
    public static class OooO implements AbstractC9474LI1lil<T1, T2, T3, T4, T5, T6, R> {
        public final /* synthetic */ AbstractC6713liiII OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Object f24014OooO00o;

        public OooO(AbstractC6713liiII r1, Object obj) {
            this.OooO00o = r1;
            this.f24014OooO00o = obj;
        }

        @Override // com.p118pd.sdk.AbstractC9474LI1lil
        public R OooO00o(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
            this.OooO00o.OooO00o(t1, t2, t3, t4, t5, t6);
            return (R) this.f24014OooO00o;
        }
    }

    /* renamed from: rx.functions.Actions$OooO00o */
    public static class OooO00o implements C1i1li<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> {
        public final /* synthetic */ AbstractC6729ll1IL OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Object f24015OooO00o;

        public OooO00o(AbstractC6729ll1IL ll1il, Object obj) {
            this.OooO00o = ll1il;
            this.f24015OooO00o = obj;
        }

        @Override // com.p118pd.sdk.C1i1li
        public R OooO00o(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9) {
            this.OooO00o.OooO00o(t1, t2, t3, t4, t5, t6, t7, t8, t9);
            return (R) this.f24015OooO00o;
        }
    }

    /* renamed from: rx.functions.Actions$OooO0O0 */
    public static class OooO0O0 implements AbstractC6021i1L<R> {
        public final /* synthetic */ AbstractC9865lLi OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Object f24016OooO00o;

        public OooO0O0(AbstractC9865lLi r1, Object obj) {
            this.OooO00o = r1;
            this.f24016OooO00o = obj;
        }

        @Override // com.p118pd.sdk.AbstractC6021i1L
        public R call(Object... objArr) {
            this.OooO00o.OooO00o(objArr);
            return (R) this.f24016OooO00o;
        }
    }

    /* renamed from: rx.functions.Actions$OooO0OO */
    public static class OooO0OO implements LiLIll<R> {
        public final /* synthetic */ liii1l OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Object f24017OooO00o;

        public OooO0OO(liii1l r1, Object obj) {
            this.OooO00o = r1;
            this.f24017OooO00o = obj;
        }

        @Override // java.util.concurrent.Callable, com.p118pd.sdk.LiLIll
        public R call() {
            this.OooO00o.call();
            return (R) this.f24017OooO00o;
        }
    }

    /* renamed from: rx.functions.Actions$OooO0Oo  reason: case insensitive filesystem */
    public static class C9955OooO0Oo implements AbstractC9847l1<T1, R> {
        public final /* synthetic */ AbstractC6153iL1l OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Object f24018OooO00o;

        public C9955OooO0Oo(AbstractC6153iL1l il1l, Object obj) {
            this.OooO00o = il1l;
            this.f24018OooO00o = obj;
        }

        @Override // com.p118pd.sdk.AbstractC9847l1
        public R call(T1 t1) {
            this.OooO00o.call(t1);
            return (R) this.f24018OooO00o;
        }
    }

    /* renamed from: rx.functions.Actions$OooO0o */
    public static class OooO0o implements AbstractC9359IIIi<T1, T2, T3, R> {
        public final /* synthetic */ AbstractC6752llII OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Object f24019OooO00o;

        public OooO0o(AbstractC6752llII llii, Object obj) {
            this.OooO00o = llii;
            this.f24019OooO00o = obj;
        }

        @Override // com.p118pd.sdk.AbstractC9359IIIi
        public R OooO00o(T1 t1, T2 t2, T3 t3) {
            this.OooO00o.OooO00o(t1, t2, t3);
            return (R) this.f24019OooO00o;
        }
    }

    /* renamed from: rx.functions.Actions$OooO0o0  reason: case insensitive filesystem */
    public static class C9956OooO0o0 implements AbstractC5189I1l1l<T1, T2, R> {
        public final /* synthetic */ AbstractC9583iI1Il OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Object f24020OooO00o;

        public C9956OooO0o0(AbstractC9583iI1Il r1, Object obj) {
            this.OooO00o = r1;
            this.f24020OooO00o = obj;
        }

        @Override // com.p118pd.sdk.AbstractC5189I1l1l
        public R OooO00o(T1 t1, T2 t2) {
            this.OooO00o.OooO00o(t1, t2);
            return (R) this.f24020OooO00o;
        }
    }

    /* renamed from: rx.functions.Actions$OooO0oO  reason: case insensitive filesystem */
    public static class C9957OooO0oO implements i1li1ii1<T1, T2, T3, T4, R> {
        public final /* synthetic */ AbstractC9378IiLI OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Object f24021OooO00o;

        public C9957OooO0oO(AbstractC9378IiLI r1, Object obj) {
            this.OooO00o = r1;
            this.f24021OooO00o = obj;
        }

        @Override // com.p118pd.sdk.i1li1ii1
        public R OooO00o(T1 t1, T2 t2, T3 t3, T4 t4) {
            this.OooO00o.OooO00o(t1, t2, t3, t4);
            return (R) this.f24021OooO00o;
        }
    }

    /* renamed from: rx.functions.Actions$OooO0oo  reason: case insensitive filesystem */
    public static class C9958OooO0oo implements Il1lLL11<T1, T2, T3, T4, T5, R> {
        public final /* synthetic */ AbstractC9512LilI OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Object f24022OooO00o;

        public C9958OooO0oo(AbstractC9512LilI r1, Object obj) {
            this.OooO00o = r1;
            this.f24022OooO00o = obj;
        }

        @Override // com.p118pd.sdk.Il1lLL11
        public R OooO00o(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
            this.OooO00o.OooO00o(t1, t2, t3, t4, t5);
            return (R) this.f24022OooO00o;
        }
    }

    /* renamed from: rx.functions.Actions$OooOO0 */
    public static class OooOO0 implements AbstractC5351IiIi<T1, T2, T3, T4, T5, T6, T7, R> {
        public final /* synthetic */ AbstractC6522lIl OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Object f24023OooO00o;

        public OooOO0(AbstractC6522lIl r1, Object obj) {
            this.OooO00o = r1;
            this.f24023OooO00o = obj;
        }

        @Override // com.p118pd.sdk.AbstractC5351IiIi
        public R OooO00o(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
            this.OooO00o.OooO00o(t1, t2, t3, t4, t5, t6, t7);
            return (R) this.f24023OooO00o;
        }
    }

    /* renamed from: rx.functions.Actions$OooOO0O */
    public static class OooOO0O implements AbstractC5634LIiL<T1, T2, T3, T4, T5, T6, T7, T8, R> {
        public final /* synthetic */ AbstractC5337Ii11 OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ Object f24024OooO00o;

        public OooOO0O(AbstractC5337Ii11 ii11, Object obj) {
            this.OooO00o = ii11;
            this.f24024OooO00o = obj;
        }

        @Override // com.p118pd.sdk.AbstractC5634LIiL
        public R OooO00o(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
            this.OooO00o.OooO00o(t1, t2, t3, t4, t5, t6, t7, t8);
            return (R) this.f24024OooO00o;
        }
    }

    /* renamed from: rx.functions.Actions$OooOO0o  reason: case insensitive filesystem */
    public static final class C9959OooOO0o<T> implements AbstractC6153iL1l<T> {
        public final liii1l OooO00o;

        public C9959OooOO0o(liii1l r1) {
            this.OooO00o = r1;
        }

        @Override // com.p118pd.sdk.AbstractC6153iL1l
        public void call(T t) {
            this.OooO00o.call();
        }
    }

    /* renamed from: rx.functions.Actions$OooOOO0 */
    public static final class OooOOO0<T0, T1, T2, T3, T4, T5, T6, T7, T8> implements liii1l, AbstractC6153iL1l<T0>, AbstractC9583iI1Il<T0, T1>, AbstractC6752llII<T0, T1, T2>, AbstractC9378IiLI<T0, T1, T2, T3>, AbstractC9512LilI<T0, T1, T2, T3, T4>, AbstractC6713liiII<T0, T1, T2, T3, T4, T5>, AbstractC6522lIl<T0, T1, T2, T3, T4, T5, T6>, AbstractC5337Ii11<T0, T1, T2, T3, T4, T5, T6, T7>, AbstractC6729ll1IL<T0, T1, T2, T3, T4, T5, T6, T7, T8>, AbstractC9865lLi {
        @Override // com.p118pd.sdk.AbstractC9583iI1Il
        public void OooO00o(T0 t0, T1 t1) {
        }

        @Override // com.p118pd.sdk.AbstractC6752llII
        public void OooO00o(T0 t0, T1 t1, T2 t2) {
        }

        @Override // com.p118pd.sdk.AbstractC9378IiLI
        public void OooO00o(T0 t0, T1 t1, T2 t2, T3 t3) {
        }

        @Override // com.p118pd.sdk.AbstractC9512LilI
        public void OooO00o(T0 t0, T1 t1, T2 t2, T3 t3, T4 t4) {
        }

        @Override // com.p118pd.sdk.AbstractC6713liiII
        public void OooO00o(T0 t0, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        }

        @Override // com.p118pd.sdk.AbstractC6522lIl
        public void OooO00o(T0 t0, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        }

        @Override // com.p118pd.sdk.AbstractC5337Ii11
        public void OooO00o(T0 t0, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        }

        @Override // com.p118pd.sdk.AbstractC6729ll1IL
        public void OooO00o(T0 t0, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        }

        @Override // com.p118pd.sdk.AbstractC9865lLi
        public void OooO00o(Object... objArr) {
        }

        @Override // com.p118pd.sdk.liii1l
        public void call() {
        }

        @Override // com.p118pd.sdk.AbstractC6153iL1l
        public void call(T0 t0) {
        }
    }

    public Actions() {
        throw new IllegalStateException("No instances!");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static <T0, T1, T2, T3, T4, T5, T6, T7, T8> OooOOO0<T0, T1, T2, T3, T4, T5, T6, T7, T8> m22996OooO00o() {
        return OooO00o;
    }

    public static LiLIll<Void> OooO00o(liii1l r1) {
        return OooO00o(r1, (Object) null);
    }

    public static <T1> AbstractC9847l1<T1, Void> OooO00o(AbstractC6153iL1l<T1> il1l) {
        return OooO00o(il1l, (Object) null);
    }

    public static <T1, T2> AbstractC5189I1l1l<T1, T2, Void> OooO00o(AbstractC9583iI1Il<T1, T2> r1) {
        return OooO00o(r1, (Object) null);
    }

    public static <T1, T2, T3> AbstractC9359IIIi<T1, T2, T3, Void> OooO00o(AbstractC6752llII<T1, T2, T3> llii) {
        return OooO00o(llii, (Object) null);
    }

    public static <T1, T2, T3, T4> i1li1ii1<T1, T2, T3, T4, Void> OooO00o(AbstractC9378IiLI<T1, T2, T3, T4> r1) {
        return OooO00o(r1, (Object) null);
    }

    public static <T1, T2, T3, T4, T5> Il1lLL11<T1, T2, T3, T4, T5, Void> OooO00o(AbstractC9512LilI<T1, T2, T3, T4, T5> r1) {
        return OooO00o(r1, (Object) null);
    }

    public static <T1, T2, T3, T4, T5, T6> AbstractC9474LI1lil<T1, T2, T3, T4, T5, T6, Void> OooO00o(AbstractC6713liiII<T1, T2, T3, T4, T5, T6> r1) {
        return OooO00o(r1, (Object) null);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> AbstractC5351IiIi<T1, T2, T3, T4, T5, T6, T7, Void> OooO00o(AbstractC6522lIl<T1, T2, T3, T4, T5, T6, T7> r1) {
        return OooO00o(r1, (Object) null);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> AbstractC5634LIiL<T1, T2, T3, T4, T5, T6, T7, T8, Void> OooO00o(AbstractC5337Ii11<T1, T2, T3, T4, T5, T6, T7, T8> ii11) {
        return OooO00o(ii11, (Object) null);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> C1i1li<T1, T2, T3, T4, T5, T6, T7, T8, T9, Void> OooO00o(AbstractC6729ll1IL<T1, T2, T3, T4, T5, T6, T7, T8, T9> ll1il) {
        return OooO00o(ll1il, (Object) null);
    }

    public static AbstractC6021i1L<Void> OooO00o(AbstractC9865lLi r1) {
        return OooO00o(r1, (Object) null);
    }

    public static <R> LiLIll<R> OooO00o(liii1l r1, R r) {
        return new OooO0OO(r1, r);
    }

    public static <T1, R> AbstractC9847l1<T1, R> OooO00o(AbstractC6153iL1l<T1> il1l, R r) {
        return new C9955OooO0Oo(il1l, r);
    }

    public static <T1, T2, R> AbstractC5189I1l1l<T1, T2, R> OooO00o(AbstractC9583iI1Il<T1, T2> r1, R r) {
        return new C9956OooO0o0(r1, r);
    }

    public static <T1, T2, T3, R> AbstractC9359IIIi<T1, T2, T3, R> OooO00o(AbstractC6752llII<T1, T2, T3> llii, R r) {
        return new OooO0o(llii, r);
    }

    public static <T1, T2, T3, T4, R> i1li1ii1<T1, T2, T3, T4, R> OooO00o(AbstractC9378IiLI<T1, T2, T3, T4> r1, R r) {
        return new C9957OooO0oO(r1, r);
    }

    public static <T1, T2, T3, T4, T5, R> Il1lLL11<T1, T2, T3, T4, T5, R> OooO00o(AbstractC9512LilI<T1, T2, T3, T4, T5> r1, R r) {
        return new C9958OooO0oo(r1, r);
    }

    public static <T1, T2, T3, T4, T5, T6, R> AbstractC9474LI1lil<T1, T2, T3, T4, T5, T6, R> OooO00o(AbstractC6713liiII<T1, T2, T3, T4, T5, T6> r1, R r) {
        return new OooO(r1, r);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R> AbstractC5351IiIi<T1, T2, T3, T4, T5, T6, T7, R> OooO00o(AbstractC6522lIl<T1, T2, T3, T4, T5, T6, T7> r1, R r) {
        return new OooOO0(r1, r);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R> AbstractC5634LIiL<T1, T2, T3, T4, T5, T6, T7, T8, R> OooO00o(AbstractC5337Ii11<T1, T2, T3, T4, T5, T6, T7, T8> ii11, R r) {
        return new OooOO0O(ii11, r);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R> C1i1li<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> OooO00o(AbstractC6729ll1IL<T1, T2, T3, T4, T5, T6, T7, T8, T9> ll1il, R r) {
        return new OooO00o(ll1il, r);
    }

    public static <R> AbstractC6021i1L<R> OooO00o(AbstractC9865lLi r1, R r) {
        return new OooO0O0(r1, r);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static <T> AbstractC6153iL1l<T> m22995OooO00o(liii1l r1) {
        return new C9959OooOO0o(r1);
    }

    public static AbstractC6153iL1l<Throwable> OooO00o() {
        return NotImplemented.INSTANCE;
    }
}
