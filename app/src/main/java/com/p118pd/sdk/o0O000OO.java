package com.p118pd.sdk;

import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.o0O000OO */
public final class o0O000OO extends O0OO0<boolean[]> {
    public final boolean[] OooO00o;

    public o0O000OO(int i) {
        super(i);
        this.OooO00o = new boolean[i];
    }

    public int OooO00o(@NotNull boolean[] zArr) {
        o0O0OO00.OooO0o(zArr, "receiver$0");
        return zArr.length;
    }

    public final void OooO00o(boolean z) {
        boolean[] zArr = this.OooO00o;
        int OooO00o2 = OooO00o();
        OooO00o(OooO00o2 + 1);
        zArr[OooO00o2] = z;
    }

    @Override // com.p118pd.sdk.O0OO0
    @NotNull
    public final boolean[] OooO00o() {
        return (boolean[]) OooO00o(this.OooO00o, new boolean[OooO0O0()]);
    }
}
