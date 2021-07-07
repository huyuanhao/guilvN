package com.p118pd.sdk;

import javax.crypto.spec.IvParameterSpec;

/* renamed from: com.pd.sdk.IiiI  reason: case insensitive filesystem */
public class C5363IiiI extends IvParameterSpec {
    public final int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f15728OooO00o;

    public C5363IiiI(byte[] bArr, int i) {
        this(bArr, i, null);
    }

    public C5363IiiI(byte[] bArr, int i, byte[] bArr2) {
        super(bArr);
        this.OooO00o = i;
        this.f15728OooO00o = C9586iIILl.m21630OooO00o(bArr2);
    }

    public int OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15612OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f15728OooO00o);
    }

    public byte[] OooO0O0() {
        return getIV();
    }
}
