package kotlin.sequences;

import com.p118pd.sdk.AbstractC7873oO0OOo00;
import com.p118pd.sdk.AbstractC9282oooooO0;
import com.p118pd.sdk.C9174oooOOooO;
import com.p118pd.sdk.O00000OO;
import com.p118pd.sdk.O00Oo000;
import com.p118pd.sdk.Oo0OoOO;
import com.p118pd.sdk.o0O0OO00;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, mo43195d2 = {"<anonymous>", "", "T", "R", "Lkotlin/sequences/SequenceScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo43196k = 3, mo43197mv = {1, 1, 13})
@DebugMetadata(mo43383c = "kotlin/sequences/SequencesKt___SequencesKt$zipWithNext$2", mo43384f = "_Sequences.kt", mo43385i = {0, 0, 0}, mo43386l = {1676, 1683}, mo43387m = "invokeSuspend", mo43388n = {"iterator", "current", "next"}, mo43389s = {"L$1", "L$2", "L$3"})
public final class SequencesKt___SequencesKt$zipWithNext$2 extends RestrictedSuspendLambda implements O00Oo000<Oo0OoOO<? super R>, AbstractC9282oooooO0<? super C9174oooOOooO>, Object> {
    public final /* synthetic */ AbstractC7873oO0OOo00 $this_zipWithNext;
    public final /* synthetic */ O00Oo000 $transform;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;

    /* renamed from: p$ */
    public Oo0OoOO f13422p$;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt___SequencesKt$zipWithNext$2(AbstractC7873oO0OOo00 oo0ooo00, O00Oo000 o00Oo000, AbstractC9282oooooO0 oooooo0) {
        super(2, oooooo0);
        this.$this_zipWithNext = oo0ooo00;
        this.$transform = o00Oo000;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final AbstractC9282oooooO0<C9174oooOOooO> create(@Nullable Object obj, @NotNull AbstractC9282oooooO0<?> oooooo0) {
        o0O0OO00.OooO0o(oooooo0, "completion");
        SequencesKt___SequencesKt$zipWithNext$2 sequencesKt___SequencesKt$zipWithNext$2 = new SequencesKt___SequencesKt$zipWithNext$2(this.$this_zipWithNext, this.$transform, oooooo0);
        sequencesKt___SequencesKt$zipWithNext$2.f13422p$ = (Oo0OoOO) obj;
        return sequencesKt___SequencesKt$zipWithNext$2;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.p118pd.sdk.O00Oo000
    public final Object invoke(Object obj, AbstractC9282oooooO0<? super C9174oooOOooO> oooooo0) {
        return ((SequencesKt___SequencesKt$zipWithNext$2) create(obj, oooooo0)).invokeSuspend(C9174oooOOooO.OooO00o);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object obj2;
        Oo0OoOO oo0OoOO;
        Iterator it;
        Object OooO00o = O00000OO.OooO00o();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                Object obj3 = this.L$3;
                it = (Iterator) this.L$1;
                oo0OoOO = (Oo0OoOO) this.L$0;
                if (!(obj instanceof Result.Failure)) {
                    obj2 = obj3;
                } else {
                    throw ((Result.Failure) obj).exception;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else if (!(obj instanceof Result.Failure)) {
            Oo0OoOO oo0OoOO2 = this.f13422p$;
            Iterator it2 = this.$this_zipWithNext.iterator();
            if (!it2.hasNext()) {
                return C9174oooOOooO.OooO00o;
            }
            oo0OoOO = oo0OoOO2;
            obj2 = it2.next();
            it = it2;
        } else {
            throw ((Result.Failure) obj).exception;
        }
        while (it.hasNext()) {
            Object next = it.next();
            Object invoke = this.$transform.invoke(obj2, next);
            this.L$0 = oo0OoOO;
            this.L$1 = it;
            this.L$2 = obj2;
            this.L$3 = next;
            this.label = 1;
            if (oo0OoOO.OooO00o(invoke, this) == OooO00o) {
                return OooO00o;
            }
            obj2 = next;
        }
        return C9174oooOOooO.OooO00o;
    }
}
