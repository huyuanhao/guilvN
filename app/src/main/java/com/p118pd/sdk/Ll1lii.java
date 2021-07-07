package com.p118pd.sdk;

import java.security.MessageDigest;

/* renamed from: com.pd.sdk.丨Ll1lii  reason: invalid class name */
public class Ll1lii extends MessageDigest {
    public AbstractC6436l11LI OooO00o;

    public Ll1lii(AbstractC6436l11LI r2) {
        super(r2.OooO00o());
        this.OooO00o = r2;
    }

    public byte[] engineDigest() {
        byte[] bArr = new byte[this.OooO00o.OooO0O0()];
        this.OooO00o.OooO00o(bArr, 0);
        return bArr;
    }

    public void engineReset() {
        this.OooO00o.reset();
    }

    @Override // java.security.MessageDigestSpi
    public void engineUpdate(byte b) {
        this.OooO00o.update(b);
    }

    public void engineUpdate(byte[] bArr, int i, int i2) {
        this.OooO00o.update(bArr, i, i2);
    }
}
