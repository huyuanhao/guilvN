package com.p118pd.sdk;

import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.Il丨L  reason: invalid class name and case insensitive filesystem */
public class C5481IlL implements AbstractC6109iIiLiLi {
    public byte[] OooO00o;
    public byte[] OooO0O0;

    public C5481IlL(String str, byte[] bArr) {
        this.OooO00o = Strings.m22987OooO0O0(str);
        this.OooO0O0 = C9586iIILl.m21630OooO00o(bArr);
    }

    public C5481IlL(byte[] bArr, byte[] bArr2) {
        this.OooO00o = C9586iIILl.m21630OooO00o(bArr);
        this.OooO0O0 = C9586iIILl.m21630OooO00o(bArr2);
    }

    @Override // com.p118pd.sdk.AbstractC6109iIiLiLi, com.p118pd.sdk.AbstractC6109iIiLiLi
    public void OooO00o() {
    }

    @Override // com.p118pd.sdk.AbstractC6109iIiLiLi
    public void OooO00o(byte[] bArr) {
    }

    @Override // com.p118pd.sdk.AbstractC6109iIiLiLi, com.p118pd.sdk.AbstractC6109iIiLiLi
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15720OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6109iIiLiLi
    public byte[] OooO0O0() {
        return this.OooO0O0;
    }
}
