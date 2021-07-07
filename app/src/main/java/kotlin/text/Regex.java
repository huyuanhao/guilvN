package kotlin.text;

import com.facebook.react.uimanager.BaseViewManager;
import com.p118pd.sdk.AbstractC7873oO0OOo00;
import com.p118pd.sdk.C9201oooOooOo;
import com.p118pd.sdk.C9210oooo000O;
import com.p118pd.sdk.O00O0000;
import com.p118pd.sdk.O00O0OOO;
import com.p118pd.sdk.O0o0o;
import com.p118pd.sdk.o0O0OO00;
import com.p118pd.sdk.oO00O000;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.text.MatchResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 ,2\u00060\u0001j\u0002`\u0002:\u0002,-B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001d\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0002\u0010\u000bB\u000f\b\u0001\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u001e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0016\u001a\u00020\u0017J\u0011\u0010\u001f\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0004J\"\u0010 \u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00170\"J\u0016\u0010 \u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0004J\u0016\u0010$\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0004J\u001e\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040&2\u0006\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010'\u001a\u00020\u001bJ\u0006\u0010(\u001a\u00020\rJ\b\u0010)\u001a\u00020\u0004H\u0016J\b\u0010*\u001a\u00020+H\u0002R\u0016\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\n8F¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0003\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006."}, mo43195d2 = {"Lkotlin/text/Regex;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "pattern", "", "(Ljava/lang/String;)V", "option", "Lkotlin/text/RegexOption;", "(Ljava/lang/String;Lkotlin/text/RegexOption;)V", "options", "", "(Ljava/lang/String;Ljava/util/Set;)V", "nativePattern", "Ljava/util/regex/Pattern;", "(Ljava/util/regex/Pattern;)V", "_options", "getOptions", "()Ljava/util/Set;", "getPattern", "()Ljava/lang/String;", "containsMatchIn", "", "input", "", "find", "Lkotlin/text/MatchResult;", "startIndex", "", "findAll", "Lkotlin/sequences/Sequence;", "matchEntire", "matches", "replace", BaseViewManager.PROP_TRANSFORM, "Lkotlin/Function1;", "replacement", "replaceFirst", "split", "", "limit", "toPattern", "toString", "writeReplace", "", "Companion", "Serialized", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
public final class Regex implements Serializable {
    public static final OooO00o Companion = new OooO00o(null);
    public Set<? extends RegexOption> _options;
    public final Pattern nativePattern;

    public static final class OooO00o {
        public OooO00o() {
        }

        /* access modifiers changed from: private */
        /* access modifiers changed from: public */
        private final int OooO00o(int i) {
            return (i & 2) != 0 ? i | 64 : i;
        }

        @NotNull
        public final String OooO0O0(@NotNull String str) {
            o0O0OO00.OooO0o(str, "literal");
            String quoteReplacement = Matcher.quoteReplacement(str);
            o0O0OO00.OooO00o((Object) quoteReplacement, "Matcher.quoteReplacement(literal)");
            return quoteReplacement;
        }

        public /* synthetic */ OooO00o(O0o0o o0o0o) {
            this();
        }

        @NotNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public final Regex m22889OooO00o(@NotNull String str) {
            o0O0OO00.OooO0o(str, "literal");
            return new Regex(str, RegexOption.LITERAL);
        }

        @NotNull
        public final String OooO00o(@NotNull String str) {
            o0O0OO00.OooO0o(str, "literal");
            String quote = Pattern.quote(str);
            o0O0OO00.OooO00o((Object) quote, "Pattern.quote(literal)");
            return quote;
        }
    }

    @Metadata(mo43193bv = {1, 0, 3}, mo43194d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u0000 \u000e2\u00060\u0001j\u0002`\u0002:\u0001\u000eB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, mo43195d2 = {"Lkotlin/text/Regex$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "pattern", "", "flags", "", "(Ljava/lang/String;I)V", "getFlags", "()I", "getPattern", "()Ljava/lang/String;", "readResolve", "", "Companion", "kotlin-stdlib"}, mo43196k = 1, mo43197mv = {1, 1, 13})
    public static final class Serialized implements Serializable {
        public static final OooO00o Companion = new OooO00o(null);
        public static final long serialVersionUID = 0;
        public final int flags;
        @NotNull
        public final String pattern;

        public static final class OooO00o {
            public OooO00o() {
            }

            public /* synthetic */ OooO00o(O0o0o o0o0o) {
                this();
            }
        }

        public Serialized(@NotNull String str, int i) {
            o0O0OO00.OooO0o(str, "pattern");
            this.pattern = str;
            this.flags = i;
        }

        private final Object readResolve() {
            Pattern compile = Pattern.compile(this.pattern, this.flags);
            o0O0OO00.OooO00o((Object) compile, "Pattern.compile(pattern, flags)");
            return new Regex(compile);
        }

        public final int getFlags() {
            return this.flags;
        }

        @NotNull
        public final String getPattern() {
            return this.pattern;
        }
    }

    @PublishedApi
    public Regex(@NotNull Pattern pattern) {
        o0O0OO00.OooO0o(pattern, "nativePattern");
        this.nativePattern = pattern;
    }

    @Nullable
    public static /* synthetic */ MatchResult find$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.find(charSequence, i);
    }

    @NotNull
    public static /* synthetic */ AbstractC7873oO0OOo00 findAll$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.findAll(charSequence, i);
    }

    @NotNull
    public static /* synthetic */ List split$default(Regex regex, CharSequence charSequence, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return regex.split(charSequence, i);
    }

    private final Object writeReplace() {
        String pattern = this.nativePattern.pattern();
        o0O0OO00.OooO00o((Object) pattern, "nativePattern.pattern()");
        return new Serialized(pattern, this.nativePattern.flags());
    }

    public final boolean containsMatchIn(@NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(charSequence, "input");
        return this.nativePattern.matcher(charSequence).find();
    }

    @Nullable
    public final MatchResult find(@NotNull CharSequence charSequence, int i) {
        o0O0OO00.OooO0o(charSequence, "input");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        o0O0OO00.OooO00o((Object) matcher, "nativePattern.matcher(input)");
        return RegexKt.OooO00o(matcher, i, charSequence);
    }

    @NotNull
    public final AbstractC7873oO0OOo00<MatchResult> findAll(@NotNull CharSequence charSequence, int i) {
        o0O0OO00.OooO0o(charSequence, "input");
        return SequencesKt__SequencesKt.OooO00o((O00O0000) new Regex$findAll$1(this, charSequence, i), (O00O0OOO) Regex$findAll$2.INSTANCE);
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.Set<? extends kotlin.text.RegexOption>, java.util.Set<kotlin.text.RegexOption> */
    @NotNull
    public final Set<RegexOption> getOptions() {
        Set set = this._options;
        if (set != null) {
            return set;
        }
        int flags = this.nativePattern.flags();
        EnumSet allOf = EnumSet.allOf(RegexOption.class);
        C9210oooo000O.OooO0O0((Iterable) allOf, (O00O0OOO) new Regex$fromInt$$inlined$apply$lambda$1(flags));
        Set<RegexOption> unmodifiableSet = Collections.unmodifiableSet(allOf);
        o0O0OO00.OooO00o((Object) unmodifiableSet, "Collections.unmodifiable…mask == it.value }\n    })");
        this._options = unmodifiableSet;
        return unmodifiableSet;
    }

    @NotNull
    public final String getPattern() {
        String pattern = this.nativePattern.pattern();
        o0O0OO00.OooO00o((Object) pattern, "nativePattern.pattern()");
        return pattern;
    }

    @Nullable
    public final MatchResult matchEntire(@NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(charSequence, "input");
        Matcher matcher = this.nativePattern.matcher(charSequence);
        o0O0OO00.OooO00o((Object) matcher, "nativePattern.matcher(input)");
        return RegexKt.OooO00o(matcher, charSequence);
    }

    public final boolean matches(@NotNull CharSequence charSequence) {
        o0O0OO00.OooO0o(charSequence, "input");
        return this.nativePattern.matcher(charSequence).matches();
    }

    @NotNull
    public final String replace(@NotNull CharSequence charSequence, @NotNull String str) {
        o0O0OO00.OooO0o(charSequence, "input");
        o0O0OO00.OooO0o(str, "replacement");
        String replaceAll = this.nativePattern.matcher(charSequence).replaceAll(str);
        o0O0OO00.OooO00o((Object) replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    @NotNull
    public final String replaceFirst(@NotNull CharSequence charSequence, @NotNull String str) {
        o0O0OO00.OooO0o(charSequence, "input");
        o0O0OO00.OooO0o(str, "replacement");
        String replaceFirst = this.nativePattern.matcher(charSequence).replaceFirst(str);
        o0O0OO00.OooO00o((Object) replaceFirst, "nativePattern.matcher(in…replaceFirst(replacement)");
        return replaceFirst;
    }

    @NotNull
    public final List<String> split(@NotNull CharSequence charSequence, int i) {
        o0O0OO00.OooO0o(charSequence, "input");
        int i2 = 0;
        if (i >= 0) {
            Matcher matcher = this.nativePattern.matcher(charSequence);
            if (!matcher.find() || i == 1) {
                return C9201oooOooOo.OooO00o(charSequence.toString());
            }
            int i3 = 10;
            if (i > 0) {
                i3 = oO00O000.OooO0O0(i, 10);
            }
            ArrayList arrayList = new ArrayList(i3);
            int i4 = i - 1;
            do {
                arrayList.add(charSequence.subSequence(i2, matcher.start()).toString());
                i2 = matcher.end();
                if (i4 >= 0 && arrayList.size() == i4) {
                    break;
                }
            } while (matcher.find());
            arrayList.add(charSequence.subSequence(i2, charSequence.length()).toString());
            return arrayList;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i + '.').toString());
    }

    @NotNull
    public final Pattern toPattern() {
        return this.nativePattern;
    }

    @NotNull
    public String toString() {
        String pattern = this.nativePattern.toString();
        o0O0OO00.OooO00o((Object) pattern, "nativePattern.toString()");
        return pattern;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Regex(@org.jetbrains.annotations.NotNull java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            com.p118pd.sdk.o0O0OO00.OooO0o(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "Pattern.compile(pattern)"
            com.p118pd.sdk.o0O0OO00.OooO00o(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String):void");
    }

    @NotNull
    public final String replace(@NotNull CharSequence charSequence, @NotNull O00O0OOO<? super MatchResult, ? extends CharSequence> o00o0ooo) {
        o0O0OO00.OooO0o(charSequence, "input");
        o0O0OO00.OooO0o(o00o0ooo, BaseViewManager.PROP_TRANSFORM);
        int i = 0;
        MatchResult find$default = find$default(this, charSequence, 0, 2, null);
        if (find$default == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            if (find$default == null) {
                o0O0OO00.OooO0o0();
            }
            sb.append(charSequence, i, find$default.m16549OooO00o().OooO00o().intValue());
            sb.append((CharSequence) o00o0ooo.invoke(find$default));
            i = find$default.m16549OooO00o().OooO0O0().intValue() + 1;
            find$default = find$default.m16548OooO00o();
            if (i >= length) {
                break;
            }
        } while (find$default != null);
        if (i < length) {
            sb.append(charSequence, i, length);
        }
        String sb2 = sb.toString();
        o0O0OO00.OooO00o((Object) sb2, "sb.toString()");
        return sb2;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Regex(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull kotlin.text.RegexOption r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            com.p118pd.sdk.o0O0OO00.OooO0o(r2, r0)
            java.lang.String r0 = "option"
            com.p118pd.sdk.o0O0OO00.OooO0o(r3, r0)
            kotlin.text.Regex$OooO00o r0 = kotlin.text.Regex.Companion
            int r3 = r3.getValue()
            int r3 = kotlin.text.Regex.OooO00o.OooO00o(r0, r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "Pattern.compile(pattern,…nicodeCase(option.value))"
            com.p118pd.sdk.o0O0OO00.OooO00o(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String, kotlin.text.RegexOption):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Regex(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull java.util.Set<? extends kotlin.text.RegexOption> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            com.p118pd.sdk.o0O0OO00.OooO0o(r2, r0)
            java.lang.String r0 = "options"
            com.p118pd.sdk.o0O0OO00.OooO0o(r3, r0)
            kotlin.text.Regex$OooO00o r0 = kotlin.text.Regex.Companion
            int r3 = kotlin.text.RegexKt.OooO00o(r3)
            int r3 = kotlin.text.Regex.OooO00o.OooO00o(r0, r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "Pattern.compile(pattern,…odeCase(options.toInt()))"
            com.p118pd.sdk.o0O0OO00.OooO00o(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.text.Regex.<init>(java.lang.String, java.util.Set):void");
    }
}
