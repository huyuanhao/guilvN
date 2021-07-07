package com.p118pd.sdk;

import java.util.Comparator;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.ooooOO  reason: case insensitive filesystem */
public final class C9257ooooOO implements Comparator<Comparable<? super Object>> {
    public static final C9257ooooOO OooO00o = new C9257ooooOO();

    /* renamed from: OooO00o */
    public int compare(@NotNull Comparable<Object> comparable, @NotNull Comparable<Object> comparable2) {
        o0O0OO00.OooO0o(comparable, "a");
        o0O0OO00.OooO0o(comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    /* Return type fixed from 'java.util.Comparator<java.lang.Comparable<java.lang.Object>>' to match base method */
    @Override // java.util.Comparator
    @NotNull
    public final Comparator<Comparable<? super Object>> reversed() {
        return C9275ooooOoo0.OooO00o;
    }
}
