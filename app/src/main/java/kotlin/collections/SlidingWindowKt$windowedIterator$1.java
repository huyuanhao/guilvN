package kotlin.collections;

import com.p118pd.sdk.AbstractC9282oooooO0;
import com.p118pd.sdk.C9174oooOOooO;
import com.p118pd.sdk.O00Oo000;
import com.p118pd.sdk.Oo0OoOO;
import com.p118pd.sdk.o0O0OO00;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006"}, mo43195d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;", "", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, mo43196k = 3, mo43197mv = {1, 1, 13})
@DebugMetadata(mo43383c = "kotlin/collections/SlidingWindowKt$windowedIterator$1", mo43384f = "SlidingWindow.kt", mo43385i = {0, 0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4}, mo43386l = {26, 36, 44, 49, 55, 59}, mo43387m = "invokeSuspend", mo43388n = {"gap", "buffer", "skip", "e", "gap", "buffer", "skip", "gap", "buffer", "e", "gap", "buffer", "gap", "buffer"}, mo43389s = {"I$0", "L$1", "I$1", "L$2", "I$0", "L$0", "I$1", "I$0", "L$1", "L$2", "I$0", "L$1", "I$0", "L$0"})
public final class SlidingWindowKt$windowedIterator$1 extends RestrictedSuspendLambda implements O00Oo000<Oo0OoOO<? super List<? extends T>>, AbstractC9282oooooO0<? super C9174oooOOooO>, Object> {
    public final /* synthetic */ Iterator $iterator;
    public final /* synthetic */ boolean $partialWindows;
    public final /* synthetic */ boolean $reuseBuffer;
    public final /* synthetic */ int $size;
    public final /* synthetic */ int $step;
    public int I$0;
    public int I$1;
    public Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public int label;

    /* renamed from: p$ */
    public Oo0OoOO f13419p$;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SlidingWindowKt$windowedIterator$1(int i, int i2, Iterator it, boolean z, boolean z2, AbstractC9282oooooO0 oooooo0) {
        super(2, oooooo0);
        this.$step = i;
        this.$size = i2;
        this.$iterator = it;
        this.$reuseBuffer = z;
        this.$partialWindows = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final AbstractC9282oooooO0<C9174oooOOooO> create(@Nullable Object obj, @NotNull AbstractC9282oooooO0<?> oooooo0) {
        o0O0OO00.OooO0o(oooooo0, "completion");
        SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1 = new SlidingWindowKt$windowedIterator$1(this.$step, this.$size, this.$iterator, this.$reuseBuffer, this.$partialWindows, oooooo0);
        slidingWindowKt$windowedIterator$1.f13419p$ = (Oo0OoOO) obj;
        return slidingWindowKt$windowedIterator$1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // com.p118pd.sdk.O00Oo000
    public final Object invoke(Object obj, AbstractC9282oooooO0<? super C9174oooOOooO> oooooo0) {
        return ((SlidingWindowKt$windowedIterator$1) create(obj, oooooo0)).invokeSuspend(C9174oooOOooO.OooO00o);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0105 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x014f  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x00e4 A[SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r13) {
        /*
        // Method dump skipped, instructions count: 408
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.SlidingWindowKt$windowedIterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
