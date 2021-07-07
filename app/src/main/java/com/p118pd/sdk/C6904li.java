package com.p118pd.sdk;

import java.security.spec.AlgorithmParameterSpec;

/* renamed from: com.pd.sdk.l丨丨i丨  reason: invalid class name and case insensitive filesystem */
public class C6904li implements AlgorithmParameterSpec {
    public byte[] OooO00o;

    public C6904li(byte[] bArr) {
        if (bArr != null) {
            this.OooO00o = C9586iIILl.m21630OooO00o(bArr);
            return;
        }
        throw new NullPointerException("id string cannot be null");
    }

    public byte[] OooO00o() {
        return C9586iIILl.m21630OooO00o(this.OooO00o);
    }
}
