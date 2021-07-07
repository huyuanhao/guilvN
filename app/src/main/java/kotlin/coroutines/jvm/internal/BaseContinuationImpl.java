package kotlin.coroutines.jvm.internal;

import com.p118pd.sdk.AbstractC9282oooooO0;
import com.p118pd.sdk.C9157oooOO0Oo;
import com.p118pd.sdk.C9174oooOOooO;
import com.p118pd.sdk.O00000OO;
import com.p118pd.sdk.O0000O00;
import com.p118pd.sdk.O0000O0O;
import com.p118pd.sdk.O0000OO;
import com.p118pd.sdk.o0O0OO00;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0017\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0002\u0010\u0006J$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\"\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0013H$ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\rH\u0014J\u001e\u0010\u0016\u001a\u00020\r2\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0013ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001b\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, mo43195d2 = {"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Ljava/io/Serializable;", "completion", "(Lkotlin/coroutines/Continuation;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "getCompletion", "()Lkotlin/coroutines/Continuation;", "create", "", "value", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "invokeSuspend", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "resumeWith", "(Ljava/lang/Object;)V", "toString", "", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
public abstract class BaseContinuationImpl implements AbstractC9282oooooO0<Object>, O0000O00, Serializable {
    @Nullable
    public final AbstractC9282oooooO0<Object> completion;

    public BaseContinuationImpl(@Nullable AbstractC9282oooooO0<Object> oooooo0) {
        this.completion = oooooo0;
    }

    @NotNull
    public AbstractC9282oooooO0<C9174oooOOooO> create(@NotNull AbstractC9282oooooO0<?> oooooo0) {
        o0O0OO00.OooO0o(oooooo0, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // com.p118pd.sdk.O0000O00
    @Nullable
    public O0000O00 getCallerFrame() {
        AbstractC9282oooooO0<Object> oooooo0 = this.completion;
        if (!(oooooo0 instanceof O0000O00)) {
            oooooo0 = null;
        }
        return (O0000O00) oooooo0;
    }

    @Nullable
    public final AbstractC9282oooooO0<Object> getCompletion() {
        return this.completion;
    }

    @Override // com.p118pd.sdk.O0000O00
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return O0000O0O.m16499OooO00o(this);
    }

    @Nullable
    public abstract Object invokeSuspend(@NotNull Object obj);

    public void releaseIntercepted() {
    }

    @Override // com.p118pd.sdk.AbstractC9282oooooO0
    public final void resumeWith(@NotNull Object obj) {
        O0000OO.m16502OooO00o((AbstractC9282oooooO0<?>) this);
        BaseContinuationImpl baseContinuationImpl = this;
        while (true) {
            AbstractC9282oooooO0<Object> oooooo0 = baseContinuationImpl.completion;
            if (oooooo0 == null) {
                o0O0OO00.OooO0o0();
            }
            try {
                Object invokeSuspend = baseContinuationImpl.invokeSuspend(obj);
                if (invokeSuspend != O00000OO.OooO00o()) {
                    Result.OooO00o oooO00o = Result.Companion;
                    obj = Result.m22101constructorimpl(invokeSuspend);
                    baseContinuationImpl.releaseIntercepted();
                    if (oooooo0 instanceof BaseContinuationImpl) {
                        baseContinuationImpl = (BaseContinuationImpl) oooooo0;
                    } else {
                        oooooo0.resumeWith(obj);
                        return;
                    }
                } else {
                    return;
                }
            } catch (Throwable th) {
                Result.OooO00o oooO00o2 = Result.Companion;
                obj = Result.m22101constructorimpl(C9157oooOO0Oo.OooO00o(th));
            }
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    @NotNull
    public AbstractC9282oooooO0<C9174oooOOooO> create(@Nullable Object obj, @NotNull AbstractC9282oooooO0<?> oooooo0) {
        o0O0OO00.OooO0o(oooooo0, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
