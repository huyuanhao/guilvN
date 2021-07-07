package com.p118pd.sdk;

import java.util.Set;
import kotlin.internal.InlineOnly;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.Ooo0o0O */
public class Ooo0o0O extends C8052oOO0o00O {
    @InlineOnly
    public static final Regex OooO00o(@NotNull String str) {
        return new Regex(str);
    }

    @InlineOnly
    public static final Regex OooO00o(@NotNull String str, RegexOption regexOption) {
        return new Regex(str, regexOption);
    }

    @InlineOnly
    public static final Regex OooO00o(@NotNull String str, Set<? extends RegexOption> set) {
        return new Regex(str, set);
    }
}
