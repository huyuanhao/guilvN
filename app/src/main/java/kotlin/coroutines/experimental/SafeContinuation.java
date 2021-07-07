package kotlin.coroutines.experimental;

import com.umeng.analytics.pro.C3416b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.coroutines.experimental.CoroutineContext;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\b\u0001\u0018\u0000 \u0015*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0002\u0015\u0016B\u0015\b\u0011\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0004B\u001f\b\u0000\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\n\u0010\r\u001a\u0004\u0018\u00010\u0006H\u0001J\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0014H\u0016R\u0014\u0010\b\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, mo43195d2 = {"Lkotlin/coroutines/experimental/SafeContinuation;", "T", "Lkotlin/coroutines/experimental/Continuation;", "delegate", "(Lkotlin/coroutines/experimental/Continuation;)V", "initialResult", "", "(Lkotlin/coroutines/experimental/Continuation;Ljava/lang/Object;)V", C3416b.f8433Q, "Lkotlin/coroutines/experimental/CoroutineContext;", "getContext", "()Lkotlin/coroutines/experimental/CoroutineContext;", "result", "getResult", "resume", "", "value", "(Ljava/lang/Object;)V", "resumeWithException", "exception", "", "Companion", "Fail", "kotlin-stdlib_coroutines"}, mo43196k = 1, mo43197mv = {1, 1, 13})
@PublishedApi
/* renamed from: com.pd.sdk.oooooo00  reason: invalid package */
public final class SafeContinuation<T> implements AbstractC9285oooooOO<T> {
    public static final OooO00o OooO00o = new OooO00o(null);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final AtomicReferenceFieldUpdater<SafeContinuation<?>, Object> f22708OooO00o = AtomicReferenceFieldUpdater.newUpdater(SafeContinuation.class, Object.class, "OooO00o");
    public static final Object OooO0O0 = new Object();
    public static final Object OooO0OO = new Object();

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9285oooooOO<T> f22709OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile Object f22710OooO00o;

    /* renamed from: com.pd.sdk.oooooo00$OooO00o */
    public static final class OooO00o {
        public OooO00o() {
        }

        @JvmStatic
        public static /* synthetic */ void OooO00o() {
        }

        public /* synthetic */ OooO00o(O0o0o o0o0o) {
            this();
        }
    }

    /* renamed from: com.pd.sdk.oooooo00$OooO0O0 */
    public static final class OooO0O0 {
        @NotNull
        public final Throwable OooO00o;

        public OooO0O0(@NotNull Throwable th) {
            o0O0OO00.OooO0o(th, "exception");
            this.OooO00o = th;
        }

        @NotNull
        public final Throwable OooO00o() {
            return this.OooO00o;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.oooooOO<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public SafeContinuation(@NotNull AbstractC9285oooooOO<? super T> ooooooo, @Nullable Object obj) {
        o0O0OO00.OooO0o(ooooooo, "delegate");
        this.f22709OooO00o = ooooooo;
        this.f22710OooO00o = obj;
    }

    @PublishedApi
    @Nullable
    public final Object OooO00o() {
        Object obj = this.f22710OooO00o;
        Object obj2 = OooO0O0;
        if (obj == obj2) {
            if (f22708OooO00o.compareAndSet(this, obj2, C9295ooooooOo.OooO00o())) {
                return C9295ooooooOo.OooO00o();
            }
            obj = this.f22710OooO00o;
        }
        if (obj == OooO0OO) {
            return C9295ooooooOo.OooO00o();
        }
        if (!(obj instanceof OooO0O0)) {
            return obj;
        }
        throw ((OooO0O0) obj).OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC9285oooooOO
    @NotNull
    public CoroutineContext getContext() {
        return this.f22709OooO00o.getContext();
    }

    @Override // com.p118pd.sdk.AbstractC9285oooooOO
    public void resume(T t) {
        while (true) {
            Object obj = this.f22710OooO00o;
            Object obj2 = OooO0O0;
            if (obj == obj2) {
                if (f22708OooO00o.compareAndSet(this, obj2, t)) {
                    return;
                }
            } else if (obj != C9295ooooooOo.OooO00o()) {
                throw new IllegalStateException("Already resumed");
            } else if (f22708OooO00o.compareAndSet(this, C9295ooooooOo.OooO00o(), OooO0OO)) {
                this.f22709OooO00o.resume(t);
                return;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC9285oooooOO
    public void resumeWithException(@NotNull Throwable th) {
        o0O0OO00.OooO0o(th, "exception");
        while (true) {
            Object obj = this.f22710OooO00o;
            Object obj2 = OooO0O0;
            if (obj == obj2) {
                if (f22708OooO00o.compareAndSet(this, obj2, new OooO0O0(th))) {
                    return;
                }
            } else if (obj != C9295ooooooOo.OooO00o()) {
                throw new IllegalStateException("Already resumed");
            } else if (f22708OooO00o.compareAndSet(this, C9295ooooooOo.OooO00o(), OooO0OO)) {
                this.f22709OooO00o.resumeWithException(th);
                return;
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @PublishedApi
    public SafeContinuation(@NotNull AbstractC9285oooooOO<? super T> ooooooo) {
        this(ooooooo, OooO0O0);
        o0O0OO00.OooO0o(ooooooo, "delegate");
    }
}
