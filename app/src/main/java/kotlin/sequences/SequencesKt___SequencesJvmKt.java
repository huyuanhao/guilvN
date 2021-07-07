package kotlin.sequences;

import com.p118pd.sdk.AbstractC7873oO0OOo00;
import com.p118pd.sdk.O00O0OOO;
import com.p118pd.sdk.o0O0OO00;
import java.util.Collection;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.TypeCastException;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001aA\u0010\u0005\u001a\u0002H\u0006\"\u0010\b\u0000\u0010\u0006*\n\u0012\u0006\b\u0000\u0012\u0002H\u00020\u0007\"\u0004\b\u0001\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\b\u001a\u0002H\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004¢\u0006\u0002\u0010\t\u001a&\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\f0\u000b\"\u000e\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\r*\b\u0012\u0004\u0012\u0002H\f0\u0001\u001a8\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\f0\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00012\u001a\u0010\u000e\u001a\u0016\u0012\u0006\b\u0000\u0012\u0002H\f0\u000fj\n\u0012\u0006\b\u0000\u0012\u0002H\f`\u0010¨\u0006\u0011"}, mo43195d2 = {"filterIsInstance", "Lkotlin/sequences/Sequence;", "R", "klass", "Ljava/lang/Class;", "filterIsInstanceTo", "C", "", "destination", "(Lkotlin/sequences/Sequence;Ljava/util/Collection;Ljava/lang/Class;)Ljava/util/Collection;", "toSortedSet", "Ljava/util/SortedSet;", "T", "", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "kotlin-stdlib"}, mo43196k = 5, mo43197mv = {1, 1, 13}, mo43199xi = 1, mo43200xs = "kotlin/sequences/SequencesKt")
public class SequencesKt___SequencesJvmKt extends SequencesKt__SequencesKt {
    @NotNull
    public static final <R> AbstractC7873oO0OOo00<R> OooO00o(@NotNull AbstractC7873oO0OOo00<?> oo0ooo00, @NotNull Class<R> cls) {
        o0O0OO00.OooO0o(oo0ooo00, "receiver$0");
        o0O0OO00.OooO0o(cls, "klass");
        AbstractC7873oO0OOo00<R> OooO0Oo = SequencesKt___SequencesKt.m22871OooO0Oo((AbstractC7873oO0OOo00) oo0ooo00, (O00O0OOO) new SequencesKt___SequencesJvmKt$filterIsInstance$1(cls));
        if (OooO0Oo != null) {
            return OooO0Oo;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.sequences.Sequence<R>");
    }

    @NotNull
    public static final <C extends Collection<? super R>, R> C OooO00o(@NotNull AbstractC7873oO0OOo00<?> oo0ooo00, @NotNull C c, @NotNull Class<R> cls) {
        o0O0OO00.OooO0o(oo0ooo00, "receiver$0");
        o0O0OO00.OooO0o(c, "destination");
        o0O0OO00.OooO0o(cls, "klass");
        for (Object obj : oo0ooo00) {
            if (cls.isInstance(obj)) {
                c.add(obj);
            }
        }
        return c;
    }

    @NotNull
    public static final <T extends Comparable<? super T>> SortedSet<T> OooO00o(@NotNull AbstractC7873oO0OOo00<? extends T> oo0ooo00) {
        o0O0OO00.OooO0o(oo0ooo00, "receiver$0");
        return (SortedSet) SequencesKt___SequencesKt.OooO0OO((AbstractC7873oO0OOo00) oo0ooo00, (Collection) new TreeSet());
    }

    @NotNull
    public static final <T> SortedSet<T> OooO00o(@NotNull AbstractC7873oO0OOo00<? extends T> oo0ooo00, @NotNull Comparator<? super T> comparator) {
        o0O0OO00.OooO0o(oo0ooo00, "receiver$0");
        o0O0OO00.OooO0o(comparator, "comparator");
        return (SortedSet) SequencesKt___SequencesKt.OooO0OO((AbstractC7873oO0OOo00) oo0ooo00, (Collection) new TreeSet(comparator));
    }
}
