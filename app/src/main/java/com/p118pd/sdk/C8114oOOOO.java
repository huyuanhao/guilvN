package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import java.io.IOException;
import java.util.Set;

/* renamed from: com.pd.sdk.oOOOO  reason: case insensitive filesystem */
public class C8114oOOOO extends C7950oO0oO0o0 {
    public static final int OooO = 37724;
    public static final int OooO00o = 330;
    public static final int OooO0O0 = 437;
    public static final int OooO0OO = 700;
    public static final int OooO0Oo = 33723;
    public static final int OooO0o = 34665;
    public static final int OooO0o0 = 34377;
    public static final int OooO0oO = 34675;
    public static final int OooO0oo = 34853;
    public static final int OooOO0 = 50255;

    public C8114oOOOO(C7925oO0o0OO0 oo0o0oo0, AbstractC7922oO0o0O0O oo0o0o0o) {
        super(oo0o0oo0, oo0o0o0o);
    }

    @Override // com.p118pd.sdk.C7950oO0oO0o0, com.p118pd.sdk.AbstractC7867oO0OOOo
    public boolean OooO00o(int i, @NotNull Set<Integer> set, int i2, @NotNull AbstractC7911oO0Oooo oo0oooo, int i3, int i4) throws IOException {
        if (i3 == 700) {
            new C8138oOOOo00o().OooO00o(oo0oooo.m19602OooO00o(i, i4), ((AbstractC8127oOOOOoO) this).f21130OooO00o);
            return true;
        } else if (i3 == 34377) {
            new C8310oOo0o().OooO00o(new C7916oO0o000(oo0oooo.m19602OooO00o(i, i4)), i4, ((AbstractC8127oOOOOoO) this).f21130OooO00o);
            return true;
        } else if (i3 != 34675) {
            return super.OooO00o(i, set, i2, oo0oooo, i3, i4);
        } else {
            new C8023oOO00o0o().OooO00o(new oO0Oo0(oo0oooo.m19602OooO00o(i, i4)), ((AbstractC8127oOOOOoO) this).f21130OooO00o);
            return true;
        }
    }
}
