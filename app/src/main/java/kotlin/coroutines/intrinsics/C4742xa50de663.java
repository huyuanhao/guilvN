package kotlin.coroutines.intrinsics;

import com.p118pd.sdk.AbstractC9282oooooO0;
import com.p118pd.sdk.C7367o0OO00oO;
import com.p118pd.sdk.C9157oooOO0Oo;
import com.p118pd.sdk.O00Oo000;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0007H\u0014ø\u0001\u0000¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b\u0019¨\u0006\t¸\u0006\u0000"}, mo43195d2 = {"kotlin/coroutines/intrinsics/IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2", "Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "label", "", "invokeSuspend", "", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4 */
public final class C4742xa50de663 extends ContinuationImpl {
    public final /* synthetic */ AbstractC9282oooooO0 $completion;
    public final /* synthetic */ CoroutineContext $context;
    public final /* synthetic */ Object $receiver$inlined;
    public final /* synthetic */ O00Oo000 $this_createCoroutineUnintercepted$inlined;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C4742xa50de663(AbstractC9282oooooO0 oooooo0, CoroutineContext coroutineContext, AbstractC9282oooooO0 oooooo02, CoroutineContext coroutineContext2, O00Oo000 o00Oo000, Object obj) {
        super(oooooo02, coroutineContext2);
        this.$completion = oooooo0;
        this.$context = coroutineContext;
        this.$this_createCoroutineUnintercepted$inlined = o00Oo000;
        this.$receiver$inlined = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public Object invokeSuspend(@NotNull Object obj) {
        int i = this.label;
        if (i == 0) {
            this.label = 1;
            C9157oooOO0Oo.m20899OooO00o(obj);
            O00Oo000 o00Oo000 = this.$this_createCoroutineUnintercepted$inlined;
            if (o00Oo000 != null) {
                return ((O00Oo000) C7367o0OO00oO.OooO00o((Object) o00Oo000, 2)).invoke(this.$receiver$inlined, this);
            }
            throw new TypeCastException("null cannot be cast to non-null type (R, kotlin.coroutines.Continuation<T>) -> kotlin.Any?");
        } else if (i == 1) {
            this.label = 2;
            C9157oooOO0Oo.m20899OooO00o(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
