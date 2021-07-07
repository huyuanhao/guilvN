package com.p118pd.sdk;

/* renamed from: com.pd.sdk.iL11L  reason: case insensitive filesystem */
public class C6148iL11L extends C6642li1LI {
    public int o00oO0O;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C6148iL11L(byte[] bArr) {
        this(bArr, bArr.length > 128 ? 1024 : bArr.length * 8);
    }

    public C6148iL11L(byte[] bArr, int i) {
        super(bArr);
        this.o00oO0O = i;
    }

    @Override // com.p118pd.sdk.C6642li1LI
    public int OooO00o() {
        return this.o00oO0O;
    }
}
