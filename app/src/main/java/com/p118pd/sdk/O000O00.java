package com.p118pd.sdk;

import java.util.regex.MatchResult;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.pd.sdk.O000O00 */
public class O000O00 {
    @Nullable
    public C8028oOO00oo0 OooO00o(@NotNull MatchResult matchResult, @NotNull String str) {
        o0O0OO00.OooO0o(matchResult, "matchResult");
        o0O0OO00.OooO0o(str, "name");
        throw new UnsupportedOperationException("Retrieving groups by name is not supported on this platform.");
    }

    public void OooO00o(@NotNull Throwable th, @NotNull Throwable th2) {
        o0O0OO00.OooO0o(th, "cause");
        o0O0OO00.OooO0o(th2, "exception");
    }

    @NotNull
    public Random OooO00o() {
        return new FallbackThreadLocalRandom();
    }
}
