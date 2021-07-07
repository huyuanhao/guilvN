package kotlin.text;

import com.p118pd.sdk.C8028oOO00oo0;
import com.p118pd.sdk.O000O00;
import com.p118pd.sdk.O000O000;
import com.p118pd.sdk.O00O0OOO;
import com.p118pd.sdk.OOo0O;
import com.p118pd.sdk.o0O0OO00;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import java.util.Collection;
import java.util.Iterator;
import java.util.regex.MatchResult;
import kotlin.Metadata;
import kotlin.collections.AbstractCollection;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.ranges.IntRange;
import kotlin.sequences.SequencesKt___SequencesKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u0005H\u0002J\u0013\u0010\b\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\u0011\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000fH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, mo43195d2 = {"kotlin/text/MatcherMatchResult$groups$1", "Lkotlin/text/MatchNamedGroupCollection;", "Lkotlin/collections/AbstractCollection;", "Lkotlin/text/MatchGroup;", FileAttachment.KEY_SIZE, "", "getSize", "()I", "get", "index", "name", "", "isEmpty", "", "iterator", "", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
public final class MatcherMatchResult$groups$1 extends AbstractCollection<C8028oOO00oo0> implements OOo0O {
    public final /* synthetic */ MatcherMatchResult OooO00o;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    public MatcherMatchResult$groups$1(MatcherMatchResult matcherMatchResult) {
        this.OooO00o = matcherMatchResult;
    }

    public /* bridge */ boolean OooO00o(C8028oOO00oo0 ooo00oo0) {
        return super.contains(ooo00oo0);
    }

    @Override // kotlin.collections.AbstractCollection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj != null ? obj instanceof C8028oOO00oo0 : true) {
            return OooO00o((C8028oOO00oo0) obj);
        }
        return false;
    }

    @Override // kotlin.collections.AbstractCollection
    public boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, kotlin.collections.AbstractCollection, java.lang.Iterable
    @NotNull
    public Iterator<C8028oOO00oo0> iterator() {
        return SequencesKt___SequencesKt.OooO0oO(CollectionsKt___CollectionsKt.m22707OooO00o((Iterable) CollectionsKt__CollectionsKt.OooO00o((Collection<?>) this)), (O00O0OOO) new MatcherMatchResult$groups$1$iterator$1(this)).iterator();
    }

    @Override // kotlin.collections.AbstractCollection
    public int OooO00o() {
        return MatcherMatchResult.OooO00o(this.OooO00o).groupCount() + 1;
    }

    @Override // com.p118pd.sdk.AbstractC8295oOo00Ooo
    @Nullable
    public C8028oOO00oo0 OooO00o(int i) {
        MatchResult OooO00o2 = MatcherMatchResult.OooO00o(this.OooO00o);
        o0O0OO00.OooO00o((Object) OooO00o2, "matchResult");
        IntRange OooO00o3 = RegexKt.OooO00o(OooO00o2, i);
        if (OooO00o3.OooO00o().intValue() < 0) {
            return null;
        }
        String group = MatcherMatchResult.OooO00o(this.OooO00o).group(i);
        o0O0OO00.OooO00o((Object) group, "matchResult.group(index)");
        return new C8028oOO00oo0(group, OooO00o3);
    }

    @Override // com.p118pd.sdk.OOo0O
    @Nullable
    public C8028oOO00oo0 OooO00o(@NotNull String str) {
        o0O0OO00.OooO0o(str, "name");
        O000O00 o000o00 = O000O000.OooO00o;
        MatchResult OooO00o2 = MatcherMatchResult.OooO00o(this.OooO00o);
        o0O0OO00.OooO00o((Object) OooO00o2, "matchResult");
        return o000o00.OooO00o(OooO00o2, str);
    }
}
