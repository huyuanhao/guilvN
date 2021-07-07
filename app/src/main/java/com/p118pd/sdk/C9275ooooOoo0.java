package com.p118pd.sdk;

import java.util.Comparator;
import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.ooooOoo0  reason: case insensitive filesystem */
public final class C9275ooooOoo0 implements Comparator<Comparable<? super Object>> {
    public static final C9275ooooOoo0 OooO00o = new C9275ooooOoo0();

    /* renamed from: OooO00o */
    public int compare(@NotNull Comparable<Object> comparable, @NotNull Comparable<Object> comparable2) {
        o0O0OO00.OooO0o(comparable, "a");
        o0O0OO00.OooO0o(comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    /* Return type fixed from 'java.util.Comparator<java.lang.Comparable<java.lang.Object>>' to match base method */
    @Override // java.util.Comparator
    @NotNull
    public final Comparator<Comparable<? super Object>> reversed() {
        return C9257ooooOO.OooO00o;
    }
}
