package com.p118pd.sdk;

/* renamed from: com.pd.sdk.LIiLl丨I  reason: invalid class name */
public class LIiLlI implements AbstractC6100iILll {
    public final AbstractC9738llL1L[] OooO00o;

    public LIiLlI(AbstractC9738llL1L[] r1, int i, int i2) {
        this.OooO00o = OooO00o(r1, i, i2);
    }

    public static AbstractC9738llL1L[] OooO00o(AbstractC9738llL1L[] r3, int i, int i2) {
        AbstractC9738llL1L[] r0 = new AbstractC9738llL1L[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            r0[i3] = r3[i + i3];
        }
        return r0;
    }

    @Override // com.p118pd.sdk.AbstractC6100iILll
    public int OooO00o() {
        return this.OooO00o.length;
    }

    @Override // com.p118pd.sdk.AbstractC6100iILll
    public AbstractC9738llL1L OooO00o(int i) {
        return this.OooO00o[i];
    }
}
