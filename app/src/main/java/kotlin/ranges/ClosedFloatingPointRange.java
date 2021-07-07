package kotlin.ranges;

import java.lang.Comparable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

@SinceKotlin(version = "1.1")
@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bg\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0005H\u0016J\u001d\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0000H&¢\u0006\u0002\u0010\f¨\u0006\r"}, mo43195d2 = {"Lkotlin/ranges/ClosedFloatingPointRange;", "T", "", "Lkotlin/ranges/ClosedRange;", "contains", "", "value", "(Ljava/lang/Comparable;)Z", "isEmpty", "lessThanOrEquals", "a", "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Z", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.oO0000O0  reason: invalid package */
public interface ClosedFloatingPointRange<T extends Comparable<? super T>> extends ClosedRange<T> {

    /* renamed from: com.pd.sdk.oO0000O0$OooO00o */
    public static final class OooO00o {
        public static <T extends Comparable<? super T>> boolean OooO00o(ClosedFloatingPointRange<T> oo0000o0, @NotNull T t) {
            o0O0OO00.OooO0o(t, "value");
            return oo0000o0.OooO00o(oo0000o0.OooO00o(), t) && oo0000o0.OooO00o(t, oo0000o0.OooO0O0());
        }

        public static <T extends Comparable<? super T>> boolean OooO00o(ClosedFloatingPointRange<T> oo0000o0) {
            return !oo0000o0.OooO00o(oo0000o0.OooO00o(), oo0000o0.OooO0O0());
        }
    }

    @Override // kotlin.ranges.ClosedRange
    boolean OooO00o(@NotNull T t);

    boolean OooO00o(@NotNull T t, @NotNull T t2);

    @Override // kotlin.ranges.ClosedRange
    boolean isEmpty();
}
