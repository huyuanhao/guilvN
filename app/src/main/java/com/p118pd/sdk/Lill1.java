package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;

/* renamed from: com.pd.sdk.Lill丨1丨  reason: invalid class name */
public class Lill1 implements AbstractC6436l11LI {
    public ByteArrayOutputStream OooO00o = new ByteArrayOutputStream();

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public int OooO00o(byte[] bArr, int i) {
        byte[] byteArray = this.OooO00o.toByteArray();
        System.arraycopy(byteArray, 0, bArr, i, byteArray.length);
        reset();
        return byteArray.length;
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public String OooO00o() {
        return "NULL";
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public int OooO0O0() {
        return this.OooO00o.size();
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void reset() {
        this.OooO00o.reset();
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void update(byte b) {
        this.OooO00o.write(b);
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void update(byte[] bArr, int i, int i2) {
        this.OooO00o.write(bArr, i, i2);
    }
}
