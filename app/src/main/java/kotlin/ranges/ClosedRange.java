package kotlin.ranges;

import com.facebook.react.uimanager.ViewProps;
import java.lang.Comparable;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000f\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003J\u0016\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\nH\u0016R\u0012\u0010\u0004\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0012\u0010\u0007\u001a\u00028\u0000X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006¨\u0006\u000e"}, mo43195d2 = {"Lkotlin/ranges/ClosedRange;", "T", "", "", "endInclusive", "getEndInclusive", "()Ljava/lang/Comparable;", ViewProps.START, "getStart", "contains", "", "value", "(Ljava/lang/Comparable;)Z", "isEmpty", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.oO0000OO  reason: invalid package */
public interface ClosedRange<T extends Comparable<? super T>> {

    /* renamed from: com.pd.sdk.oO0000OO$OooO00o */
    public static final class OooO00o {
        public static <T extends Comparable<? super T>> boolean OooO00o(ClosedRange<T> oo0000oo, @NotNull T t) {
            o0O0OO00.OooO0o(t, "value");
            return t.compareTo(oo0000oo.OooO00o()) >= 0 && t.compareTo(oo0000oo.OooO0O0()) <= 0;
        }

        public static <T extends Comparable<? super T>> boolean OooO00o(ClosedRange<T> oo0000oo) {
            return oo0000oo.OooO00o().compareTo(oo0000oo.OooO0O0()) > 0;
        }
    }

    @NotNull
    T OooO00o();

    boolean OooO00o(@NotNull T t);

    @NotNull
    T OooO0O0();

    boolean isEmpty();
}
