package kotlin.text;

import java.util.List;
import kotlin.Metadata;
import kotlin.internal.InlineOnly;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u00002\u00020\u0001:\u0001\u0017J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0000H&R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0012\u0010\u000f\u001a\u00020\u0010X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0012\u0010\u0013\u001a\u00020\bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, mo43195d2 = {"Lkotlin/text/MatchResult;", "", "destructured", "Lkotlin/text/MatchResult$Destructured;", "getDestructured", "()Lkotlin/text/MatchResult$Destructured;", "groupValues", "", "", "getGroupValues", "()Ljava/util/List;", "groups", "Lkotlin/text/MatchGroupCollection;", "getGroups", "()Lkotlin/text/MatchGroupCollection;", "range", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "value", "getValue", "()Ljava/lang/String;", "next", "Destructured", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.OOO0O0  reason: invalid package */
public interface MatchResult {

    /* renamed from: com.pd.sdk.OOO0O0$OooO00o */
    public static final class OooO00o {
        @NotNull
        public static OooO0O0 OooO00o(MatchResult ooo0o0) {
            return new OooO0O0(ooo0o0);
        }
    }

    /* renamed from: com.pd.sdk.OOO0O0$OooO0O0 */
    public static final class OooO0O0 {
        @NotNull
        public final MatchResult OooO00o;

        public OooO0O0(@NotNull MatchResult ooo0o0) {
            o0O0OO00.OooO0o(ooo0o0, "match");
            this.OooO00o = ooo0o0;
        }

        @InlineOnly
        private final String OooO() {
            return m16552OooO00o().m16551OooO00o().get(8);
        }

        @InlineOnly
        private final String OooO0O0() {
            return m16552OooO00o().m16551OooO00o().get(10);
        }

        @InlineOnly
        private final String OooO0OO() {
            return m16552OooO00o().m16551OooO00o().get(2);
        }

        @InlineOnly
        private final String OooO0Oo() {
            return m16552OooO00o().m16551OooO00o().get(3);
        }

        @InlineOnly
        private final String OooO0o() {
            return m16552OooO00o().m16551OooO00o().get(5);
        }

        @InlineOnly
        private final String OooO0o0() {
            return m16552OooO00o().m16551OooO00o().get(4);
        }

        @InlineOnly
        private final String OooO0oO() {
            return m16552OooO00o().m16551OooO00o().get(6);
        }

        @InlineOnly
        private final String OooO0oo() {
            return m16552OooO00o().m16551OooO00o().get(7);
        }

        @InlineOnly
        private final String OooOO0() {
            return m16552OooO00o().m16551OooO00o().get(9);
        }

        @NotNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public final MatchResult m16552OooO00o() {
            return this.OooO00o;
        }

        @InlineOnly
        private final String OooO00o() {
            return m16552OooO00o().m16551OooO00o().get(1);
        }

        @NotNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public final List<String> m16553OooO00o() {
            return this.OooO00o.m16551OooO00o().subList(1, this.OooO00o.m16551OooO00o().size());
        }
    }

    @NotNull
    OooO0O0 OooO00o();

    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    MatchResult m16548OooO00o();

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    IntRange m16549OooO00o();

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    AbstractC8295oOo00Ooo m16550OooO00o();

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    List<String> m16551OooO00o();

    @NotNull
    String getValue();
}
