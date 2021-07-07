package kotlin.sequences;

import com.p118pd.sdk.AbstractC7873oO0OOo00;
import com.p118pd.sdk.AbstractC9282oooooO0;
import com.p118pd.sdk.C9174oooOOooO;
import com.p118pd.sdk.O00000OO;
import com.p118pd.sdk.O00O0000;
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

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005"}, mo43195d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo43196k = 3, mo43197mv = {1, 1, 13})
@DebugMetadata(mo43383c = "kotlin/sequences/SequencesKt__SequencesKt$ifEmpty$1", mo43384f = "Sequences.kt", mo43385i = {0, 1}, mo43386l = {66, 71, 72}, mo43387m = "invokeSuspend", mo43388n = {"iterator", "iterator"}, mo43389s = {"L$0", "L$0"})
public final class SequencesKt__SequencesKt$ifEmpty$1 extends RestrictedSuspendLambda implements O00Oo000<Oo0OoOO<? super T>, AbstractC9282oooooO0<? super C9174oooOOooO>, Object> {
    public final /* synthetic */ O00O0000 $defaultValue;
    public final /* synthetic */ AbstractC7873oO0OOo00 $this_ifEmpty;
    public Object L$0;
    public int label;

    /* renamed from: p$ */
    public Oo0OoOO f13421p$;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SequencesKt__SequencesKt$ifEmpty$1(AbstractC7873oO0OOo00 oo0ooo00, O00O0000 o00o0000, AbstractC9282oooooO0 oooooo0) {
        super(2, oooooo0);
        this.$this_ifEmpty = oo0ooo00;
        this.$defaultValue = o00o0000;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final AbstractC9282oooooO0<C9174oooOOooO> create(@Nullable Object obj, @NotNull AbstractC9282oooooO0<?> oooooo0) {
        o0O0OO00.OooO0o(oooooo0, "completion");
        SequencesKt__SequencesKt$ifEmpty$1 sequencesKt__SequencesKt$ifEmpty$1 = new SequencesKt__SequencesKt$ifEmpty$1(this.$this_ifEmpty, this.$defaultValue, oooooo0);
        sequencesKt__SequencesKt$ifEmpty$1.f13421p$ = (Oo0OoOO) obj;
        return sequencesKt__SequencesKt$ifEmpty$1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.p118pd.sdk.O00Oo000
    public final Object invoke(Object obj, AbstractC9282oooooO0<? super C9174oooOOooO> oooooo0) {
        return ((SequencesKt__SequencesKt$ifEmpty$1) create(obj, oooooo0)).invokeSuspend(C9174oooOOooO.OooO00o);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object OooO00o = O00000OO.OooO00o();
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                Iterator it = (Iterator) this.L$0;
                if (obj instanceof Result.Failure) {
                    throw ((Result.Failure) obj).exception;
                }
            } else if (i == 2) {
                Iterator it2 = (Iterator) this.L$0;
                if (obj instanceof Result.Failure) {
                    throw ((Result.Failure) obj).exception;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else if (!(obj instanceof Result.Failure)) {
            Oo0OoOO oo0OoOO = this.f13421p$;
            Iterator it3 = this.$this_ifEmpty.iterator();
            if (it3.hasNext()) {
                this.L$0 = it3;
                this.label = 1;
                if (oo0OoOO.OooO00o(it3, (AbstractC9282oooooO0<? super C9174oooOOooO>) this) == OooO00o) {
                    return OooO00o;
                }
            } else {
                this.L$0 = it3;
                this.label = 2;
                if (oo0OoOO.OooO00o((AbstractC7873oO0OOo00) this.$defaultValue.invoke(), (AbstractC9282oooooO0<? super C9174oooOOooO>) this) == OooO00o) {
                    return OooO00o;
                }
            }
        } else {
            throw ((Result.Failure) obj).exception;
        }
        return C9174oooOOooO.OooO00o;
    }
}
