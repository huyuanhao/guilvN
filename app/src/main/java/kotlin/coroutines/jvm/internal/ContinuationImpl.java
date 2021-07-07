package kotlin.coroutines.jvm.internal;

import com.p118pd.sdk.AbstractC9282oooooO0;
import com.p118pd.sdk.O0000O0;
import com.p118pd.sdk.o0O0OO00;
import com.umeng.analytics.pro.C3416b;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b!\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005B!\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003J\b\u0010\r\u001a\u00020\u000eH\u0014R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, mo43195d2 = {"Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "completion", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/coroutines/Continuation;)V", "_context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/CoroutineContext;)V", C3416b.f8433Q, "getContext", "()Lkotlin/coroutines/CoroutineContext;", "intercepted", "releaseIntercepted", "", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
public abstract class ContinuationImpl extends BaseContinuationImpl {
    public transient AbstractC9282oooooO0<Object> OooO00o;
    public final CoroutineContext _context;

    public ContinuationImpl(@Nullable AbstractC9282oooooO0<Object> oooooo0, @Nullable CoroutineContext coroutineContext) {
        super(oooooo0);
        this._context = coroutineContext;
    }

    @Override // com.p118pd.sdk.AbstractC9282oooooO0
    @NotNull
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this._context;
        if (coroutineContext == null) {
            o0O0OO00.OooO0o0();
        }
        return coroutineContext;
    }

    @NotNull
    public final AbstractC9282oooooO0<Object> intercepted() {
        AbstractC9282oooooO0<Object> oooooo0 = this.OooO00o;
        if (oooooo0 == null) {
            ContinuationInterceptor ooooooo0 = (ContinuationInterceptor) getContext().get(ContinuationInterceptor.OooO00o);
            if (ooooooo0 == null || (oooooo0 = ooooooo0.OooO00o((AbstractC9282oooooO0) this)) == null) {
                oooooo0 = this;
            }
            this.OooO00o = oooooo0;
        }
        return oooooo0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public void releaseIntercepted() {
        AbstractC9282oooooO0<?> oooooo0 = this.OooO00o;
        if (!(oooooo0 == null || oooooo0 == this)) {
            CoroutineContext.Element oooO00o = getContext().get(ContinuationInterceptor.OooO00o);
            if (oooO00o == null) {
                o0O0OO00.OooO0o0();
            }
            ((ContinuationInterceptor) oooO00o).m21218OooO00o(oooooo0);
        }
        this.OooO00o = O0000O0.OooO00o;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ContinuationImpl(@Nullable AbstractC9282oooooO0<Object> oooooo0) {
        this(oooooo0, oooooo0 != null ? oooooo0.getContext() : null);
    }
}
