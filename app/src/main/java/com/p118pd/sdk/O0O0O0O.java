package com.p118pd.sdk;

import org.jetbrains.annotations.NotNull;

/* renamed from: com.pd.sdk.O0O0O0O */
public final class O0O0O0O extends O0OO0<float[]> {
    public final float[] OooO00o;

    public O0O0O0O(int i) {
        super(i);
        this.OooO00o = new float[i];
    }

    public int OooO00o(@NotNull float[] fArr) {
        o0O0OO00.OooO0o(fArr, "receiver$0");
        return fArr.length;
    }

    public final void OooO00o(float f) {
        float[] fArr = this.OooO00o;
        int OooO00o2 = OooO00o();
        OooO00o(OooO00o2 + 1);
        fArr[OooO00o2] = f;
    }

    @Override // com.p118pd.sdk.O0OO0
    @NotNull
    public final float[] OooO00o() {
        return (float[]) OooO00o(this.OooO00o, new float[OooO0O0()]);
    }
}
