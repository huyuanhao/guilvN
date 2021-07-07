package kotlin.text;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TypeCastException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012:\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000e¢\u0006\u0002\u0010\u000fJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\u0011H\u0002RB\u0010\b\u001a6\u0012\u0004\u0012\u00020\u0004\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\r0\t¢\u0006\u0002\b\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, mo43195d2 = {"Lkotlin/text/DelimitedRangesSequence;", "Lkotlin/sequences/Sequence;", "Lkotlin/ranges/IntRange;", "input", "", "startIndex", "", "limit", "getNextMatch", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "currentIndex", "Lkotlin/Pair;", "Lkotlin/ExtensionFunctionType;", "(Ljava/lang/CharSequence;IILkotlin/jvm/functions/Function2;)V", "iterator", "", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
/* renamed from: com.pd.sdk.oOo00O0o  reason: invalid package */
public final class DelimitedRangesSequence implements AbstractC7873oO0OOo00<IntRange> {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final O00Oo000<CharSequence, Integer, Pair<Integer, Integer>> f21375OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final CharSequence f21376OooO00o;
    public final int OooO0O0;

    /* renamed from: com.pd.sdk.oOo00O0o$OooO00o */
    public static final class OooO00o implements Iterator<IntRange>, O0OO0o {
        @Nullable
        public IntRange OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ DelimitedRangesSequence f21377OooO00o;
        public int o00oO0O = -1;
        public int o0ooOO0;
        public int o0ooOOo;
        public int o0ooOoO;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public OooO00o(DelimitedRangesSequence ooo00o0o) {
            this.f21377OooO00o = ooo00o0o;
            int OooO00o2 = oO00O000.OooO00o(ooo00o0o.OooO00o, 0, ooo00o0o.f21376OooO00o.length());
            this.o0ooOO0 = OooO00o2;
            this.o0ooOOo = OooO00o2;
        }

        @Nullable
        /* renamed from: OooO00o  reason: collision with other method in class */
        public final IntRange m19985OooO00o() {
            return this.OooO00o;
        }

        public final int OooO0O0() {
            return this.o0ooOO0;
        }

        /* renamed from: OooO0OO  reason: collision with other method in class */
        public final int m19987OooO0OO() {
            return this.o0ooOOo;
        }

        public final int OooO0Oo() {
            return this.o00oO0O;
        }

        public boolean hasNext() {
            if (this.o00oO0O == -1) {
                OooO0OO();
            }
            return this.o00oO0O == 1;
        }

        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final void OooO00o(@Nullable IntRange oo000o0o) {
            this.OooO00o = oo000o0o;
        }

        public final void OooO0O0(int i) {
            this.o0ooOO0 = i;
        }

        public final void OooO0OO(int i) {
            this.o0ooOOo = i;
        }

        public final void OooO0Oo(int i) {
            this.o00oO0O = i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0021, code lost:
            if (r0 < r6.f21377OooO00o.OooO0O0) goto L_0x0023;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private final void OooO0OO() {
            /*
            // Method dump skipped, instructions count: 159
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.text.DelimitedRangesSequence.OooO00o.OooO0OO():void");
        }

        public final int OooO00o() {
            return this.o0ooOoO;
        }

        @NotNull
        /* renamed from: OooO0O0  reason: collision with other method in class */
        public IntRange next() {
            if (this.o00oO0O == -1) {
                OooO0OO();
            }
            if (this.o00oO0O != 0) {
                IntRange oo000o0o = this.OooO00o;
                if (oo000o0o != null) {
                    this.OooO00o = null;
                    this.o00oO0O = -1;
                    return oo000o0o;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.ranges.IntRange");
            }
            throw new NoSuchElementException();
        }

        public final void OooO00o(int i) {
            this.o0ooOoO = i;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.pd.sdk.O00Oo000<? super java.lang.CharSequence, ? super java.lang.Integer, kotlin.Pair<java.lang.Integer, java.lang.Integer>> */
    /* JADX WARN: Multi-variable type inference failed */
    public DelimitedRangesSequence(@NotNull CharSequence charSequence, int i, int i2, @NotNull O00Oo000<? super CharSequence, ? super Integer, Pair<Integer, Integer>> o00Oo000) {
        o0O0OO00.OooO0o(charSequence, "input");
        o0O0OO00.OooO0o(o00Oo000, "getNextMatch");
        this.f21376OooO00o = charSequence;
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.f21375OooO00o = o00Oo000;
    }

    @Override // com.p118pd.sdk.AbstractC7873oO0OOo00
    @NotNull
    public Iterator<IntRange> iterator() {
        return new OooO00o(this);
    }
}
