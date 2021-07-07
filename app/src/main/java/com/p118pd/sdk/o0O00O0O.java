package com.p118pd.sdk;

import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.o0O00O0O */
public final class o0O00O0O extends O0OO0<char[]> {
    public final char[] OooO00o;

    public o0O00O0O(int i) {
        super(i);
        this.OooO00o = new char[i];
    }

    public int OooO00o(@NotNull char[] cArr) {
        o0O0OO00.OooO0o(cArr, "receiver$0");
        return cArr.length;
    }

    public final void OooO00o(char c) {
        char[] cArr = this.OooO00o;
        int OooO00o2 = OooO00o();
        OooO00o(OooO00o2 + 1);
        cArr[OooO00o2] = c;
    }

    @Override // com.p118pd.sdk.O0OO0
    @NotNull
    public final char[] OooO00o() {
        return (char[]) OooO00o(this.OooO00o, new char[OooO0O0()]);
    }
}
