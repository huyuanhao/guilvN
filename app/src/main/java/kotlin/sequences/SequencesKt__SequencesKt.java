package kotlin.sequences;

import com.p118pd.sdk.AbstractC7873oO0OOo00;
import com.p118pd.sdk.C7886oO0Oo00o;
import com.p118pd.sdk.C7900oO0OoOOo;
import com.p118pd.sdk.C9163oooOOO0O;
import com.p118pd.sdk.O00O0000;
import com.p118pd.sdk.O00O0OOO;
import com.p118pd.sdk.O00Oo000;
import com.p118pd.sdk.OOo;
import com.p118pd.sdk.o0O0OO00;
import com.p118pd.sdk.oO0O0OO0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.SinceKotlin;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.internal.InlineOnly;
import kotlin.internal.LowPriorityInOverloadResolution;
import kotlin.jvm.JvmName;
import kotlin.sequences.FlatteningSequence;
import kotlin.sequences.GeneratorSequence;
import kotlin.sequences.TransformingSequence;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u001c\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00050\u0004H\b\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002\u001a&\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\b2\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u0004\u001a<\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\b2\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000b\u001a=\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\b2\b\u0010\f\u001a\u0004\u0018\u0001H\u00022\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u0002H\u0002\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000bH\u0007¢\u0006\u0002\u0010\r\u001a+\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0010\"\u0002H\u0002¢\u0006\u0002\u0010\u0011\u001a\u001c\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001\u001aC\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00150\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0015*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0018\u0010\u0003\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u00050\u000bH\u0002¢\u0006\u0002\b\u0016\u001a)\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00170\u0001H\u0007¢\u0006\u0002\b\u0018\u001a\"\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0001\u001a2\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0012\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00010\u0004H\u0007\u001a!\u0010\u001b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001H\b\u001a@\u0010\u001c\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00150\u001e0\u001d\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0015*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00150\u001d0\u0001¨\u0006\u001f"}, mo43195d2 = {"Sequence", "Lkotlin/sequences/Sequence;", "T", "iterator", "Lkotlin/Function0;", "", "emptySequence", "generateSequence", "", "nextFunction", "seedFunction", "Lkotlin/Function1;", "seed", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlin/sequences/Sequence;", "sequenceOf", "elements", "", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "asSequence", "constrainOnce", "flatten", "R", "flatten$SequencesKt__SequencesKt", "", "flattenSequenceOfIterable", "ifEmpty", "defaultValue", "orEmpty", "unzip", "Lkotlin/Pair;", "", "kotlin-stdlib"}, mo43196k = 5, mo43197mv = {1, 1, 13}, mo43199xi = 1, mo43200xs = "kotlin/sequences/SequencesKt")
public class SequencesKt__SequencesKt extends OOo {

    public static final class OooO00o implements AbstractC7873oO0OOo00<T> {
        public final /* synthetic */ O00O0000 OooO00o;

        public OooO00o(O00O0000 o00o0000) {
            this.OooO00o = o00o0000;
        }

        @Override // com.p118pd.sdk.AbstractC7873oO0OOo00
        @NotNull
        public Iterator<T> iterator() {
            return (Iterator) this.OooO00o.invoke();
        }
    }

    public static final class OooO0O0 implements AbstractC7873oO0OOo00<T> {
        public final /* synthetic */ Iterator OooO00o;

        public OooO0O0(Iterator it) {
            this.OooO00o = it;
        }

        @Override // com.p118pd.sdk.AbstractC7873oO0OOo00
        @NotNull
        public Iterator<T> iterator() {
            return this.OooO00o;
        }
    }

    @InlineOnly
    public static final <T> AbstractC7873oO0OOo00<T> OooO00o(O00O0000<? extends Iterator<? extends T>> o00o0000) {
        return new OooO00o(o00o0000);
    }

    @NotNull
    public static final <T> AbstractC7873oO0OOo00<T> OooO0O0(@NotNull AbstractC7873oO0OOo00<? extends AbstractC7873oO0OOo00<? extends T>> oo0ooo00) {
        o0O0OO00.OooO0o(oo0ooo00, "receiver$0");
        return OooO00o((AbstractC7873oO0OOo00) oo0ooo00, (O00O0OOO) SequencesKt__SequencesKt$flatten$1.INSTANCE);
    }

    @JvmName(name = "flattenSequenceOfIterable")
    @NotNull
    public static final <T> AbstractC7873oO0OOo00<T> OooO0OO(@NotNull AbstractC7873oO0OOo00<? extends Iterable<? extends T>> oo0ooo00) {
        o0O0OO00.OooO0o(oo0ooo00, "receiver$0");
        return OooO00o((AbstractC7873oO0OOo00) oo0ooo00, (O00O0OOO) SequencesKt__SequencesKt$flatten$2.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.pd.sdk.oO0OOo00<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @SinceKotlin(version = "1.3")
    @InlineOnly
    public static final <T> AbstractC7873oO0OOo00<T> OooO0Oo(@Nullable AbstractC7873oO0OOo00<? extends T> oo0ooo00) {
        return oo0ooo00 != 0 ? oo0ooo00 : OooO00o();
    }

    @NotNull
    public static final <T> AbstractC7873oO0OOo00<T> OooO00o(@NotNull Iterator<? extends T> it) {
        o0O0OO00.OooO0o(it, "receiver$0");
        return OooO00o((AbstractC7873oO0OOo00) new OooO0O0(it));
    }

    @NotNull
    public static final <T> AbstractC7873oO0OOo00<T> OooO0O0(@NotNull O00O0000<? extends T> o00o0000) {
        o0O0OO00.OooO0o(o00o0000, "nextFunction");
        return OooO00o((AbstractC7873oO0OOo00) new GeneratorSequence(o00o0000, new SequencesKt__SequencesKt$generateSequence$1(o00o0000)));
    }

    @NotNull
    public static final <T> AbstractC7873oO0OOo00<T> OooO00o(@NotNull T... tArr) {
        o0O0OO00.OooO0o(tArr, "elements");
        return tArr.length == 0 ? OooO00o() : ArraysKt___ArraysKt.m22150OooO00o((Object[]) tArr);
    }

    @NotNull
    public static final <T> AbstractC7873oO0OOo00<T> OooO00o() {
        return C7886oO0Oo00o.OooO00o;
    }

    @SinceKotlin(version = "1.3")
    @NotNull
    public static final <T> AbstractC7873oO0OOo00<T> OooO00o(@NotNull AbstractC7873oO0OOo00<? extends T> oo0ooo00, @NotNull O00O0000<? extends AbstractC7873oO0OOo00<? extends T>> o00o0000) {
        o0O0OO00.OooO0o(oo0ooo00, "receiver$0");
        o0O0OO00.OooO0o(o00o0000, "defaultValue");
        return C7900oO0OoOOo.OooO0O0((O00Oo000) new SequencesKt__SequencesKt$ifEmpty$1(oo0ooo00, o00o0000, null));
    }

    public static final <T, R> AbstractC7873oO0OOo00<R> OooO00o(@NotNull AbstractC7873oO0OOo00<? extends T> oo0ooo00, O00O0OOO<? super T, ? extends Iterator<? extends R>> o00o0ooo) {
        if (oo0ooo00 instanceof TransformingSequence) {
            return ((TransformingSequence) oo0ooo00).OooO00o(o00o0ooo);
        }
        return new FlatteningSequence(oo0ooo00, SequencesKt__SequencesKt$flatten$3.INSTANCE, o00o0ooo);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public static final <T, R> Pair<List<T>, List<R>> m22822OooO00o(@NotNull AbstractC7873oO0OOo00<? extends Pair<? extends T, ? extends R>> oo0ooo00) {
        o0O0OO00.OooO0o(oo0ooo00, "receiver$0");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator<? extends Pair<? extends T, ? extends R>> it = oo0ooo00.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            arrayList.add(pair.getFirst());
            arrayList2.add(pair.getSecond());
        }
        return C9163oooOOO0O.OooO00o(arrayList, arrayList2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.pd.sdk.oO0OOo00<? extends T> */
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> AbstractC7873oO0OOo00<T> OooO00o(@NotNull AbstractC7873oO0OOo00<? extends T> oo0ooo00) {
        o0O0OO00.OooO0o(oo0ooo00, "receiver$0");
        return oo0ooo00 instanceof oO0O0OO0 ? oo0ooo00 : new oO0O0OO0(oo0ooo00);
    }

    @LowPriorityInOverloadResolution
    @NotNull
    public static final <T> AbstractC7873oO0OOo00<T> OooO00o(@Nullable T t, @NotNull O00O0OOO<? super T, ? extends T> o00o0ooo) {
        o0O0OO00.OooO0o(o00o0ooo, "nextFunction");
        if (t == null) {
            return C7886oO0Oo00o.OooO00o;
        }
        return new GeneratorSequence(new SequencesKt__SequencesKt$generateSequence$2(t), o00o0ooo);
    }

    @NotNull
    public static final <T> AbstractC7873oO0OOo00<T> OooO00o(@NotNull O00O0000<? extends T> o00o0000, @NotNull O00O0OOO<? super T, ? extends T> o00o0ooo) {
        o0O0OO00.OooO0o(o00o0000, "seedFunction");
        o0O0OO00.OooO0o(o00o0ooo, "nextFunction");
        return new GeneratorSequence(o00o0000, o00o0ooo);
    }
}
