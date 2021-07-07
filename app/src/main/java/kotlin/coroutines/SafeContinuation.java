package kotlin.coroutines;

import com.umeng.analytics.pro.C3416b;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Result;
import kotlin.SinceKotlin;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u0000 \u001a*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003:\u0001\u001aB\u0015\b\u0011\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0002\u0010\u0005B\u001f\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\n\u0010\u0011\u001a\u0004\u0018\u00010\u0007H\u0001J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u001e\u0010\u0014\u001a\u00020\u00152\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\u001b"}, mo43195d2 = {"Lkotlin/coroutines/SafeContinuation;", "T", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "delegate", "(Lkotlin/coroutines/Continuation;)V", "initialResult", "", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", C3416b.f8433Q, "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "result", "getOrThrow", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "resumeWith", "", "Lkotlin/Result;", "(Ljava/lang/Object;)V", "toString", "", "Companion", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
@PublishedApi
/* renamed from: com.pd.sdk.oooooO0o  reason: invalid package */
public final class SafeContinuation<T> implements AbstractC9282oooooO0<T>, O0000O00 {
    public static final OooO00o OooO00o = new OooO00o(null);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final AtomicReferenceFieldUpdater<SafeContinuation<?>, Object> f22704OooO00o = AtomicReferenceFieldUpdater.newUpdater(SafeContinuation.class, Object.class, "OooO00o");

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9282oooooO0<T> f22705OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public volatile Object f22706OooO00o;

    /* renamed from: com.pd.sdk.oooooO0o$OooO00o */
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

    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: com.pd.sdk.oooooO0<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public SafeContinuation(@NotNull AbstractC9282oooooO0<? super T> oooooo0, @Nullable Object obj) {
        o0O0OO00.OooO0o(oooooo0, "delegate");
        this.f22705OooO00o = oooooo0;
        this.f22706OooO00o = obj;
    }

    @PublishedApi
    @Nullable
    public final Object OooO00o() {
        Object obj = this.f22706OooO00o;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
        if (obj == coroutineSingletons) {
            if (f22704OooO00o.compareAndSet(this, coroutineSingletons, O00000OO.OooO00o())) {
                return O00000OO.OooO00o();
            }
            obj = this.f22706OooO00o;
        }
        if (obj == CoroutineSingletons.RESUMED) {
            return O00000OO.OooO00o();
        }
        if (!(obj instanceof Result.Failure)) {
            return obj;
        }
        throw ((Result.Failure) obj).exception;
    }

    @Override // com.p118pd.sdk.O0000O00
    @Nullable
    public O0000O00 getCallerFrame() {
        AbstractC9282oooooO0<T> oooooo0 = this.f22705OooO00o;
        if (!(oooooo0 instanceof O0000O00)) {
            oooooo0 = null;
        }
        return (O0000O00) oooooo0;
    }

    @Override // com.p118pd.sdk.AbstractC9282oooooO0
    @NotNull
    public CoroutineContext getContext() {
        return this.f22705OooO00o.getContext();
    }

    @Override // com.p118pd.sdk.O0000O00
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC9282oooooO0
    public void resumeWith(@NotNull Object obj) {
        while (true) {
            Object obj2 = this.f22706OooO00o;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.UNDECIDED;
            if (obj2 == coroutineSingletons) {
                if (f22704OooO00o.compareAndSet(this, coroutineSingletons, obj)) {
                    return;
                }
            } else if (obj2 != O00000OO.OooO00o()) {
                throw new IllegalStateException("Already resumed");
            } else if (f22704OooO00o.compareAndSet(this, O00000OO.OooO00o(), CoroutineSingletons.RESUMED)) {
                this.f22705OooO00o.resumeWith(obj);
                return;
            }
        }
    }

    @NotNull
    public String toString() {
        return "SafeContinuation for " + this.f22705OooO00o;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @PublishedApi
    public SafeContinuation(@NotNull AbstractC9282oooooO0<? super T> oooooo0) {
        this(oooooo0, CoroutineSingletons.UNDECIDED);
        o0O0OO00.OooO0o(oooooo0, "delegate");
    }
}
