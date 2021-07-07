package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iLllLLIi  reason: case insensitive filesystem */
public class C6195iLllLLIi extends C5592L1llII {
    public short[] OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public short[][] f17794OooO00o;
    public short[][] OooO0O0;

    public C6195iLllLLIi(int i, short[][] sArr, short[][] sArr2, short[] sArr3) {
        super(false, i);
        this.f17794OooO00o = sArr;
        this.OooO0O0 = sArr2;
        this.OooO00o = sArr3;
    }

    @Override // com.p118pd.sdk.C6213iL11I, com.p118pd.sdk.C5592L1llII
    public short[] OooO00o() {
        return this.OooO00o;
    }

    @Override // com.p118pd.sdk.C6213iL11I, com.p118pd.sdk.C5592L1llII
    /* renamed from: OooO00o  reason: collision with other method in class */
    public short[][] m17167OooO00o() {
        return this.f17794OooO00o;
    }

    public short[][] OooO0O0() {
        return this.OooO0O0;
    }
}
