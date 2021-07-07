package kotlin.coroutines.jvm.internal;

import com.p118pd.sdk.AbstractC9282oooooO0;
import com.p118pd.sdk.O000O;
import com.p118pd.sdk.O0OO00;
import com.p118pd.sdk.o0O0O0O0;
import com.p118pd.sdk.o0O0OO00;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SinceKotlin(version = "1.3")
@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\b!\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u00020\u0004B\u000f\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000f"}, mo43195d2 = {"Lkotlin/coroutines/jvm/internal/RestrictedSuspendLambda;", "Lkotlin/coroutines/jvm/internal/RestrictedContinuationImpl;", "Lkotlin/jvm/internal/FunctionBase;", "", "Lkotlin/coroutines/jvm/internal/SuspendFunction;", "arity", "", "(I)V", "completion", "Lkotlin/coroutines/Continuation;", "(ILkotlin/coroutines/Continuation;)V", "getArity", "()I", "toString", "", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
public abstract class RestrictedSuspendLambda extends RestrictedContinuationImpl implements o0O0O0O0<Object>, O000O {
    public final int arity;

    public RestrictedSuspendLambda(int i, @Nullable AbstractC9282oooooO0<Object> oooooo0) {
        super(oooooo0);
        this.arity = i;
    }

    @Override // com.p118pd.sdk.o0O0O0O0
    public int getArity() {
        return this.arity;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public String toString() {
        if (getCompletion() != null) {
            return super.toString();
        }
        String OooO00o = O0OO00.OooO00o(this);
        o0O0OO00.OooO00o((Object) OooO00o, "Reflection.renderLambdaToString(this)");
        return OooO00o;
    }

    public RestrictedSuspendLambda(int i) {
        this(i, null);
    }
}
