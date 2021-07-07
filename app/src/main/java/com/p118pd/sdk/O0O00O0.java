package com.p118pd.sdk;

import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.O0O00O0 */
public final class O0O00O0 extends O0OO0<byte[]> {
    public final byte[] OooO00o;

    public O0O00O0(int i) {
        super(i);
        this.OooO00o = new byte[i];
    }

    public int OooO00o(@NotNull byte[] bArr) {
        o0O0OO00.OooO0o(bArr, "receiver$0");
        return bArr.length;
    }

    public final void OooO00o(byte b) {
        byte[] bArr = this.OooO00o;
        int OooO00o2 = OooO00o();
        OooO00o(OooO00o2 + 1);
        bArr[OooO00o2] = b;
    }

    @Override // com.p118pd.sdk.O0OO0
    @NotNull
    public final byte[] OooO00o() {
        return (byte[]) OooO00o(this.OooO00o, new byte[OooO0O0()]);
    }
}
