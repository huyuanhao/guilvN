package com.p118pd.sdk;

import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.o0O0OOo0  reason: case insensitive filesystem */
public final class C7309o0O0OOo0 extends O0OO0<long[]> {
    public final long[] OooO00o;

    public C7309o0O0OOo0(int i) {
        super(i);
        this.OooO00o = new long[i];
    }

    public int OooO00o(@NotNull long[] jArr) {
        o0O0OO00.OooO0o(jArr, "receiver$0");
        return jArr.length;
    }

    public final void OooO00o(long j) {
        long[] jArr = this.OooO00o;
        int OooO00o2 = OooO00o();
        OooO00o(OooO00o2 + 1);
        jArr[OooO00o2] = j;
    }

    @Override // com.p118pd.sdk.O0OO0
    @NotNull
    public final long[] OooO00o() {
        return (long[]) OooO00o(this.OooO00o, new long[OooO0O0()]);
    }
}
