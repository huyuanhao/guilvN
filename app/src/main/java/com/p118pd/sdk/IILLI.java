package com.p118pd.sdk;

import com.p118pd.sdk.LLLilLi;
import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.pd.sdk.IILLI丨  reason: invalid class name */
public class IILLI implements AbstractC6769llL1L {
    public static final int OooO00o = 256;
    public static final int OooO0O0 = 512;
    public static final int OooO0OO = 1024;

    /* renamed from: OooO00o  reason: collision with other field name */
    public i1Li1 f15489OooO00o;

    public IILLI(int i, int i2) {
        this.f15489OooO00o = new i1Li1(i, i2);
    }

    public IILLI(IILLI r2) {
        this.f15489OooO00o = new i1Li1(r2.f15489OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    public int OooO00o() {
        return this.f15489OooO00o.m16875OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public int OooO00o(byte[] bArr, int i) {
        return this.f15489OooO00o.OooO00o(bArr, i);
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15379OooO00o() {
        return "Skein-MAC-" + (this.f15489OooO00o.OooO00o() * 8) + Constants.ACCEPT_TIME_SEPARATOR_SERVER + (this.f15489OooO00o.m16875OooO0O0() * 8);
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void OooO00o(AbstractC6370iIIIl r4) throws IllegalArgumentException {
        LLLilLi r42;
        if (r4 instanceof LLLilLi) {
            r42 = (LLLilLi) r4;
        } else if (r4 instanceof C6642li1LI) {
            r42 = new LLLilLi.OooO0O0().OooO00o(((C6642li1LI) r4).OooO00o()).OooO00o();
        } else {
            throw new IllegalArgumentException("Invalid parameter passed to Skein MAC init - " + r4.getClass().getName());
        }
        if (r42.m16431OooO00o() != null) {
            this.f15489OooO00o.OooO00o(r42);
            return;
        }
        throw new IllegalArgumentException("Skein MAC requires a key parameter.");
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void reset() {
        this.f15489OooO00o.m16874OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte b) {
        this.f15489OooO00o.OooO00o(b);
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte[] bArr, int i, int i2) {
        this.f15489OooO00o.OooO00o(bArr, i, i2);
    }
}
