package com.p118pd.sdk;

import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.o0OO000O */
public final class o0OO000O extends O0OO0<short[]> {
    public final short[] OooO00o;

    public o0OO000O(int i) {
        super(i);
        this.OooO00o = new short[i];
    }

    public int OooO00o(@NotNull short[] sArr) {
        o0O0OO00.OooO0o(sArr, "receiver$0");
        return sArr.length;
    }

    public final void OooO00o(short s) {
        short[] sArr = this.OooO00o;
        int OooO00o2 = OooO00o();
        OooO00o(OooO00o2 + 1);
        sArr[OooO00o2] = s;
    }

    @Override // com.p118pd.sdk.O0OO0
    @NotNull
    public final short[] OooO00o() {
        return (short[]) OooO00o(this.OooO00o, new short[OooO0O0()]);
    }
}
