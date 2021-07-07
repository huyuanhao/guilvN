package com.p118pd.sdk;

import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.O0o0oo0 */
public final class O0o0oo0 extends O0OO0<int[]> {
    public final int[] OooO00o;

    public O0o0oo0(int i) {
        super(i);
        this.OooO00o = new int[i];
    }

    public final void OooO0O0(int i) {
        int[] iArr = this.OooO00o;
        int OooO00o2 = OooO00o();
        OooO00o(OooO00o2 + 1);
        iArr[OooO00o2] = i;
    }

    public int OooO00o(@NotNull int[] iArr) {
        o0O0OO00.OooO0o(iArr, "receiver$0");
        return iArr.length;
    }

    @Override // com.p118pd.sdk.O0OO0
    @NotNull
    public final int[] OooO00o() {
        return (int[]) OooO00o(this.OooO00o, new int[OooO0O0()]);
    }
}
