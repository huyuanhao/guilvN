package p293rx.internal.util;

import com.p118pd.sdk.AbstractC5189I1l1l;
import com.p118pd.sdk.AbstractC6153iL1l;
import com.p118pd.sdk.AbstractC9583iI1Il;
import com.p118pd.sdk.AbstractC9847l1;
import com.p118pd.sdk.C6086iIIllI;
import com.p118pd.sdk.C9349III;
import com.p118pd.sdk.LL1LL;
import com.p118pd.sdk.LiLIll;
import com.p118pd.sdk.i11iiILl;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p293rx.Notification;
import p293rx.exceptions.OnErrorNotImplementedException;

/* renamed from: rx.internal.util.InternalObservableUtils */
public enum InternalObservableUtils {
    ;
    
    public static final C9970OooO0oO COUNTER = new C9970OooO0oO();
    public static final C9969OooO0o0 ERROR_EXTRACTOR = new C9969OooO0o0();
    public static final AbstractC6153iL1l<Throwable> ERROR_NOT_IMPLEMENTED = new OooO0OO();
    public static final C9349III.OooO0O0<Boolean, Object> IS_EMPTY = new C6086iIIllI(UtilityFunctions.OooO0O0(), true);
    public static final C9971OooO0oo LONG_COUNTER = new C9971OooO0oo();
    public static final OooO0o OBJECT_EQUALS = new OooO0o();
    public static final OooOOOO RETURNS_VOID = new OooOOOO();
    public static final C9974OooOOo0 TO_ARRAY = new C9974OooOOo0();

    /* renamed from: rx.internal.util.InternalObservableUtils$OooO */
    public static final class OooO implements AbstractC9847l1<C9349III<? extends Notification<?>>, C9349III<?>> {
        public final AbstractC9847l1<? super C9349III<? extends Void>, ? extends C9349III<?>> OooO00o;

        public OooO(AbstractC9847l1<? super C9349III<? extends Void>, ? extends C9349III<?>> r1) {
            this.OooO00o = r1;
        }

        /* renamed from: OooO00o */
        public C9349III<?> call(C9349III<? extends Notification<?>> r3) {
            return (C9349III) this.OooO00o.call(r3.OooOOoo(InternalObservableUtils.RETURNS_VOID));
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$OooO00o */
    public static final class OooO00o<T, R> implements AbstractC5189I1l1l<R, T, R> {
        public final AbstractC9583iI1Il<R, ? super T> OooO00o;

        public OooO00o(AbstractC9583iI1Il<R, ? super T> r1) {
            this.OooO00o = r1;
        }

        @Override // com.p118pd.sdk.AbstractC5189I1l1l
        public R OooO00o(R r, T t) {
            this.OooO00o.OooO00o(r, t);
            return r;
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$OooO0O0 */
    public static final class OooO0O0 implements AbstractC9847l1<Object, Boolean> {
        public final Object OooO00o;

        public OooO0O0(Object obj) {
            this.OooO00o = obj;
        }

        /* renamed from: OooO00o */
        public Boolean call(Object obj) {
            Object obj2 = this.OooO00o;
            return Boolean.valueOf(obj == obj2 || (obj != null && obj.equals(obj2)));
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$OooO0OO */
    public static final class OooO0OO implements AbstractC6153iL1l<Throwable> {
        /* renamed from: OooO00o */
        public void call(Throwable th) {
            throw new OnErrorNotImplementedException(th);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$OooO0Oo  reason: case insensitive filesystem */
    public static final class C9968OooO0Oo implements AbstractC9847l1<Object, Boolean> {
        public final Class<?> OooO00o;

        public C9968OooO0Oo(Class<?> cls) {
            this.OooO00o = cls;
        }

        /* renamed from: OooO00o */
        public Boolean call(Object obj) {
            return Boolean.valueOf(this.OooO00o.isInstance(obj));
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$OooO0o */
    public static final class OooO0o implements AbstractC5189I1l1l<Object, Object, Boolean> {
        @Override // com.p118pd.sdk.AbstractC5189I1l1l
        public Boolean OooO00o(Object obj, Object obj2) {
            return Boolean.valueOf(obj == obj2 || (obj != null && obj.equals(obj2)));
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$OooO0o0  reason: case insensitive filesystem */
    public static final class C9969OooO0o0 implements AbstractC9847l1<Notification<?>, Throwable> {
        /* renamed from: OooO00o */
        public Throwable call(Notification<?> notification) {
            return notification.m22991OooO00o();
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$OooO0oO  reason: case insensitive filesystem */
    public static final class C9970OooO0oO implements AbstractC5189I1l1l<Integer, Object, Integer> {
        public Integer OooO00o(Integer num, Object obj) {
            return Integer.valueOf(num.intValue() + 1);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$OooO0oo  reason: case insensitive filesystem */
    public static final class C9971OooO0oo implements AbstractC5189I1l1l<Long, Object, Long> {
        public Long OooO00o(Long l, Object obj) {
            return Long.valueOf(l.longValue() + 1);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$OooOO0 */
    public static final class OooOO0<T> implements LiLIll<i11iiILl<T>> {
        public final C9349III<T> OooO00o;
        public final int o00oO0O;

        public OooOO0(C9349III<T> r1, int i) {
            this.OooO00o = r1;
            this.o00oO0O = i;
        }

        /* renamed from: OooO00o */
        public i11iiILl<T> call() {
            return this.OooO00o.OooO00o(this.o00oO0O);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$OooOO0O */
    public static final class OooOO0O<T> implements LiLIll<i11iiILl<T>> {
        public final long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final LL1LL f24159OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C9349III<T> f24160OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final TimeUnit f24161OooO00o;

        public OooOO0O(C9349III<T> r1, long j, TimeUnit timeUnit, LL1LL ll1ll) {
            this.f24161OooO00o = timeUnit;
            this.f24160OooO00o = r1;
            this.OooO00o = j;
            this.f24159OooO00o = ll1ll;
        }

        /* renamed from: OooO00o */
        public i11iiILl<T> call() {
            return this.f24160OooO00o.OooO00o(this.OooO00o, this.f24161OooO00o, this.f24159OooO00o);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$OooOO0o  reason: case insensitive filesystem */
    public static final class C9972OooOO0o<T> implements LiLIll<i11iiILl<T>> {
        public final C9349III<T> OooO00o;

        public C9972OooOO0o(C9349III<T> r1) {
            this.OooO00o = r1;
        }

        /* renamed from: OooO00o */
        public i11iiILl<T> call() {
            return this.OooO00o.OooO0O0();
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$OooOOO */
    public static final class OooOOO implements AbstractC9847l1<C9349III<? extends Notification<?>>, C9349III<?>> {
        public final AbstractC9847l1<? super C9349III<? extends Throwable>, ? extends C9349III<?>> OooO00o;

        public OooOOO(AbstractC9847l1<? super C9349III<? extends Throwable>, ? extends C9349III<?>> r1) {
            this.OooO00o = r1;
        }

        /* renamed from: OooO00o */
        public C9349III<?> call(C9349III<? extends Notification<?>> r3) {
            return (C9349III) this.OooO00o.call(r3.OooOOoo(InternalObservableUtils.ERROR_EXTRACTOR));
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$OooOOO0 */
    public static final class OooOOO0<T> implements LiLIll<i11iiILl<T>> {
        public final long OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final LL1LL f24162OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final C9349III<T> f24163OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final TimeUnit f24164OooO00o;
        public final int o00oO0O;

        public OooOOO0(C9349III<T> r1, int i, long j, TimeUnit timeUnit, LL1LL ll1ll) {
            this.OooO00o = j;
            this.f24164OooO00o = timeUnit;
            this.f24162OooO00o = ll1ll;
            this.o00oO0O = i;
            this.f24163OooO00o = r1;
        }

        /* renamed from: OooO00o */
        public i11iiILl<T> call() {
            return this.f24163OooO00o.OooO00o(this.o00oO0O, this.OooO00o, this.f24164OooO00o, this.f24162OooO00o);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$OooOOOO */
    public static final class OooOOOO implements AbstractC9847l1<Object, Void> {
        /* renamed from: OooO00o */
        public Void call(Object obj) {
            return null;
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$OooOOOo  reason: case insensitive filesystem */
    public static final class C9973OooOOOo<T, R> implements AbstractC9847l1<C9349III<T>, C9349III<R>> {
        public final LL1LL OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final AbstractC9847l1<? super C9349III<T>, ? extends C9349III<R>> f24165OooO00o;

        public C9973OooOOOo(AbstractC9847l1<? super C9349III<T>, ? extends C9349III<R>> r1, LL1LL ll1ll) {
            this.f24165OooO00o = r1;
            this.OooO00o = ll1ll;
        }

        /* renamed from: OooO00o */
        public C9349III<R> call(C9349III<T> r2) {
            return ((C9349III) this.f24165OooO00o.call(r2)).m21402OooO00o(this.OooO00o);
        }
    }

    /* renamed from: rx.internal.util.InternalObservableUtils$OooOOo0  reason: case insensitive filesystem */
    public static final class C9974OooOOo0 implements AbstractC9847l1<List<? extends C9349III<?>>, C9349III<?>[]> {
        /* renamed from: OooO00o */
        public C9349III<?>[] call(List<? extends C9349III<?>> list) {
            return (C9349III[]) list.toArray(new C9349III[list.size()]);
        }
    }

    public static <T, R> AbstractC5189I1l1l<R, T, R> createCollectorCaller(AbstractC9583iI1Il<R, ? super T> r1) {
        return new OooO00o(r1);
    }

    public static AbstractC9847l1<C9349III<? extends Notification<?>>, C9349III<?>> createRepeatDematerializer(AbstractC9847l1<? super C9349III<? extends Void>, ? extends C9349III<?>> r1) {
        return new OooO(r1);
    }

    public static <T, R> AbstractC9847l1<C9349III<T>, C9349III<R>> createReplaySelectorAndObserveOn(AbstractC9847l1<? super C9349III<T>, ? extends C9349III<R>> r1, LL1LL ll1ll) {
        return new C9973OooOOOo(r1, ll1ll);
    }

    public static <T> LiLIll<i11iiILl<T>> createReplaySupplier(C9349III<T> r1) {
        return new C9972OooOO0o(r1);
    }

    public static AbstractC9847l1<C9349III<? extends Notification<?>>, C9349III<?>> createRetryDematerializer(AbstractC9847l1<? super C9349III<? extends Throwable>, ? extends C9349III<?>> r1) {
        return new OooOOO(r1);
    }

    public static AbstractC9847l1<Object, Boolean> equalsWith(Object obj) {
        return new OooO0O0(obj);
    }

    public static AbstractC9847l1<Object, Boolean> isInstanceOf(Class<?> cls) {
        return new C9968OooO0Oo(cls);
    }

    public static <T> LiLIll<i11iiILl<T>> createReplaySupplier(C9349III<T> r1, int i) {
        return new OooOO0(r1, i);
    }

    public static <T> LiLIll<i11iiILl<T>> createReplaySupplier(C9349III<T> r7, long j, TimeUnit timeUnit, LL1LL ll1ll) {
        return new OooOO0O(r7, j, timeUnit, ll1ll);
    }

    public static <T> LiLIll<i11iiILl<T>> createReplaySupplier(C9349III<T> r8, int i, long j, TimeUnit timeUnit, LL1LL ll1ll) {
        return new OooOOO0(r8, i, j, timeUnit, ll1ll);
    }
}
