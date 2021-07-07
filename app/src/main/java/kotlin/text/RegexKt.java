package kotlin.text;

import com.p118pd.sdk.C9210oooo000O;
import com.p118pd.sdk.O00O0OOO;
import com.p118pd.sdk.OOO00OO;
import com.p118pd.sdk.o0O0OO00;
import com.p118pd.sdk.oO00O000;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.regex.Matcher;
import kotlin.ranges.IntRange;
import kotlin.text.MatchResult;

public final class RegexKt {
    public static final MatchResult OooO0O0(Matcher matcher, int i, CharSequence charSequence) {
        if (!matcher.find(i)) {
            return null;
        }
        return new MatcherMatchResult(matcher, charSequence);
    }

    public static final MatchResult OooO0O0(Matcher matcher, CharSequence charSequence) {
        if (!matcher.matches()) {
            return null;
        }
        return new MatcherMatchResult(matcher, charSequence);
    }

    public static final IntRange OooO0O0(java.util.regex.MatchResult matchResult) {
        return oO00O000.m19458OooO00o(matchResult.start(), matchResult.end());
    }

    public static final IntRange OooO0O0(java.util.regex.MatchResult matchResult, int i) {
        return oO00O000.m19458OooO00o(matchResult.start(i), matchResult.end(i));
    }

    public static final int OooO0O0(Iterable<? extends OOO00OO> iterable) {
        int i = 0;
        for (OOO00OO ooo00oo : iterable) {
            i |= ooo00oo.getValue();
        }
        return i;
    }

    public static final <T extends Enum<T> & OOO00OO> Set<T> OooO00o(int i) {
        o0O0OO00.OooO00o(4, "T");
        EnumSet allOf = EnumSet.allOf(Enum.class);
        C9210oooo000O.OooO0O0((Iterable) allOf, (O00O0OOO) new RegexKt$fromInt$$inlined$apply$lambda$1(i));
        Set<T> unmodifiableSet = Collections.unmodifiableSet(allOf);
        o0O0OO00.OooO00o((Object) unmodifiableSet, "Collections.unmodifiable…mask == it.value }\n    })");
        return unmodifiableSet;
    }
}
