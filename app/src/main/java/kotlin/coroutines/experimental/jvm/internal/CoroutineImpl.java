package kotlin.coroutines.experimental.jvm.internal;

import com.p118pd.sdk.AbstractC9285oooooOO;
import com.p118pd.sdk.C9174oooOOooO;
import com.p118pd.sdk.C9295ooooooOo;
import com.p118pd.sdk.C9297oooooooo;
import com.p118pd.sdk.o0O0OO00;
import com.umeng.analytics.pro.C3416b;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.coroutines.experimental.CoroutineContext;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0003\b&\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J$\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016J\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0016J\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H$J\u0012\u0010\u0019\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00038\u0004@\u0004X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0012\u0010\u0011\u001a\u00020\u00058\u0004@\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, mo43195d2 = {"Lkotlin/coroutines/experimental/jvm/internal/CoroutineImpl;", "Lkotlin/jvm/internal/Lambda;", "", "Lkotlin/coroutines/experimental/Continuation;", "arity", "", "completion", "(ILkotlin/coroutines/experimental/Continuation;)V", "_context", "Lkotlin/coroutines/experimental/CoroutineContext;", "_facade", C3416b.f8433Q, "getContext", "()Lkotlin/coroutines/experimental/CoroutineContext;", "facade", "getFacade", "()Lkotlin/coroutines/experimental/Continuation;", "label", "create", "", "value", "doResume", "data", "exception", "", "resume", "resumeWithException", "kotlin-stdlib_coroutines"}, mo43196k = 1, mo43197mv = {1, 1, 13})
public abstract class CoroutineImpl extends Lambda<Object> implements AbstractC9285oooooOO<Object> {
    public final CoroutineContext _context;
    public AbstractC9285oooooOO<Object> _facade;
    @JvmField
    @Nullable
    public AbstractC9285oooooOO<Object> completion;
    @JvmField
    public int label;

    public CoroutineImpl(int i, @Nullable AbstractC9285oooooOO<Object> ooooooo) {
        super(i);
        this.completion = ooooooo;
        this.label = ooooooo != null ? 0 : -1;
        AbstractC9285oooooOO<Object> ooooooo2 = this.completion;
        this._context = ooooooo2 != null ? ooooooo2.getContext() : null;
    }

    @NotNull
    public AbstractC9285oooooOO<C9174oooOOooO> create(@NotNull AbstractC9285oooooOO<?> ooooooo) {
        o0O0OO00.OooO0o(ooooooo, "completion");
        throw new IllegalStateException("create(Continuation) has not been overridden");
    }

    @Nullable
    public abstract Object doResume(@Nullable Object obj, @Nullable Throwable th);

    @Override // com.p118pd.sdk.AbstractC9285oooooOO
    @NotNull
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        if (coroutineContext == null) {
            o0O0OO00.OooO0o0();
        }
        return coroutineContext;
    }

    @NotNull
    public final AbstractC9285oooooOO<Object> getFacade() {
        if (this._facade == null) {
            CoroutineContext coroutineContext = this._context;
            if (coroutineContext == null) {
                o0O0OO00.OooO0o0();
            }
            this._facade = C9297oooooooo.OooO00o(coroutineContext, this);
        }
        AbstractC9285oooooOO<Object> ooooooo = this._facade;
        if (ooooooo == null) {
            o0O0OO00.OooO0o0();
        }
        return ooooooo;
    }

    @Override // com.p118pd.sdk.AbstractC9285oooooOO
    public void resume(@Nullable Object obj) {
        AbstractC9285oooooOO<Object> ooooooo = this.completion;
        if (ooooooo == null) {
            o0O0OO00.OooO0o0();
        }
        try {
            Object doResume = doResume(obj, null);
            if (doResume == C9295ooooooOo.OooO00o()) {
                return;
            }
            if (ooooooo != null) {
                ooooooo.resume(doResume);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.experimental.Continuation<kotlin.Any?>");
        } catch (Throwable th) {
            ooooooo.resumeWithException(th);
        }
    }

    @Override // com.p118pd.sdk.AbstractC9285oooooOO
    public void resumeWithException(@NotNull Throwable th) {
        o0O0OO00.OooO0o(th, "exception");
        AbstractC9285oooooOO<Object> ooooooo = this.completion;
        if (ooooooo == null) {
            o0O0OO00.OooO0o0();
        }
        try {
            Object doResume = doResume(null, th);
            if (doResume == C9295ooooooOo.OooO00o()) {
                return;
            }
            if (ooooooo != null) {
                ooooooo.resume(doResume);
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.coroutines.experimental.Continuation<kotlin.Any?>");
        } catch (Throwable th2) {
            ooooooo.resumeWithException(th2);
        }
    }

    @NotNull
    public AbstractC9285oooooOO<C9174oooOOooO> create(@Nullable Object obj, @NotNull AbstractC9285oooooOO<?> ooooooo) {
        o0O0OO00.OooO0o(ooooooo, "completion");
        throw new IllegalStateException("create(Any?;Continuation) has not been overridden");
    }
}
