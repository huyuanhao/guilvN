package kotlin.text;

import com.p118pd.sdk.AbstractC8295oOo00Ooo;
import com.p118pd.sdk.o0O0OO00;
import java.util.List;
import java.util.regex.Matcher;
import kotlin.Metadata;
import kotlin.collections.AbstractList;
import kotlin.ranges.IntRange;
import kotlin.text.MatchResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n \u0013*\u0004\u0018\u00010\u00120\u0012X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u00158VX\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\t8VX\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, mo43195d2 = {"Lkotlin/text/MatcherMatchResult;", "Lkotlin/text/MatchResult;", "matcher", "Ljava/util/regex/Matcher;", "input", "", "(Ljava/util/regex/Matcher;Ljava/lang/CharSequence;)V", "groupValues", "", "", "getGroupValues", "()Ljava/util/List;", "groupValues_", "groups", "Lkotlin/text/MatchGroupCollection;", "getGroups", "()Lkotlin/text/MatchGroupCollection;", "matchResult", "Ljava/util/regex/MatchResult;", "kotlin.jvm.PlatformType", "range", "Lkotlin/ranges/IntRange;", "getRange", "()Lkotlin/ranges/IntRange;", "value", "getValue", "()Ljava/lang/String;", "next", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
public final class MatcherMatchResult implements MatchResult {
    @NotNull
    public final AbstractC8295oOo00Ooo OooO00o = new MatcherMatchResult$groups$1(this);

    /* renamed from: OooO00o  reason: collision with other field name */
    public final CharSequence f23876OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<String> f23877OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final java.util.regex.MatchResult f23878OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Matcher f23879OooO00o;

    public static final class OooO00o extends AbstractList<String> {
        public final /* synthetic */ MatcherMatchResult OooO00o;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public OooO00o(MatcherMatchResult matcherMatchResult) {
            this.OooO00o = matcherMatchResult;
        }

        public /* bridge */ boolean OooO00o(String str) {
            return super.contains(str);
        }

        public /* bridge */ int OooO0O0(String str) {
            return super.lastIndexOf(str);
        }

        @Override // kotlin.collections.AbstractCollection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof String) {
                return OooO00o((String) obj);
            }
            return false;
        }

        @Override // kotlin.collections.AbstractList
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof String) {
                return OooO00o((String) obj);
            }
            return -1;
        }

        @Override // kotlin.collections.AbstractList
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof String) {
                return OooO0O0((String) obj);
            }
            return -1;
        }

        public /* bridge */ int OooO00o(String str) {
            return super.indexOf(str);
        }

        @Override // java.util.List, kotlin.collections.AbstractList
        @NotNull
        public String get(int i) {
            String group = this.OooO00o.f23878OooO00o.group(i);
            return group != null ? group : "";
        }

        @Override // kotlin.collections.AbstractList, kotlin.collections.AbstractCollection
        public int OooO00o() {
            return this.OooO00o.f23878OooO00o.groupCount() + 1;
        }
    }

    public MatcherMatchResult(@NotNull Matcher matcher, @NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(matcher, "matcher");
        o0O0OO00.OooO0o(charSequence, "input");
        this.f23879OooO00o = matcher;
        this.f23876OooO00o = charSequence;
        this.f23878OooO00o = matcher.toMatchResult();
    }

    @Override // kotlin.text.MatchResult
    @NotNull
    public String getValue() {
        String group = this.f23878OooO00o.group();
        o0O0OO00.OooO00o((Object) group, "matchResult.group()");
        return group;
    }

    @Override // kotlin.text.MatchResult, kotlin.text.MatchResult, kotlin.text.MatchResult, kotlin.text.MatchResult, kotlin.text.MatchResult
    @NotNull
    public MatchResult.OooO0O0 OooO00o() {
        return MatchResult.OooO00o.OooO00o(this);
    }

    @Override // kotlin.text.MatchResult, kotlin.text.MatchResult, kotlin.text.MatchResult, kotlin.text.MatchResult, kotlin.text.MatchResult
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public IntRange m22886OooO00o() {
        java.util.regex.MatchResult matchResult = this.f23878OooO00o;
        o0O0OO00.OooO00o((Object) matchResult, "matchResult");
        return RegexKt.OooO0O0(matchResult);
    }

    @Override // kotlin.text.MatchResult, kotlin.text.MatchResult, kotlin.text.MatchResult, kotlin.text.MatchResult, kotlin.text.MatchResult
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC8295oOo00Ooo m22887OooO00o() {
        return this.OooO00o;
    }

    @Override // kotlin.text.MatchResult, kotlin.text.MatchResult, kotlin.text.MatchResult, kotlin.text.MatchResult, kotlin.text.MatchResult
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<String> m22888OooO00o() {
        if (this.f23877OooO00o == null) {
            this.f23877OooO00o = new OooO00o(this);
        }
        List<String> list = this.f23877OooO00o;
        if (list == null) {
            o0O0OO00.OooO0o0();
        }
        return list;
    }

    @Override // kotlin.text.MatchResult, kotlin.text.MatchResult, kotlin.text.MatchResult, kotlin.text.MatchResult, kotlin.text.MatchResult
    @Nullable
    /* renamed from: OooO00o  reason: collision with other method in class */
    public MatchResult m22885OooO00o() {
        int end = this.f23878OooO00o.end() + (this.f23878OooO00o.end() == this.f23878OooO00o.start() ? 1 : 0);
        if (end <= this.f23876OooO00o.length()) {
            return RegexKt.OooO0O0(this.f23879OooO00o, end, this.f23876OooO00o);
        }
        return null;
    }
}
