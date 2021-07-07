package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.Il1丨丨  reason: invalid class name and case insensitive filesystem */
public class C5425Il1 {
    public BigInteger OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f15811OooO00o;
    public BigInteger OooO0O0;
    public BigInteger OooO0OO;

    public C5425Il1(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr, BigInteger bigInteger3) {
        this.OooO00o = bigInteger;
        this.OooO0O0 = bigInteger2;
        this.f15811OooO00o = C9586iIILl.m21630OooO00o(bArr);
        this.OooO0OO = bigInteger3;
    }

    public static C5425Il1 OooO00o(InputStream inputStream) throws IOException {
        return new C5425Il1(iILl11.OooO00o(inputStream), iILl11.OooO00o(inputStream), L1LL1Ii.m15946OooO0OO(inputStream), iILl11.OooO00o(inputStream));
    }

    public BigInteger OooO00o() {
        return this.OooO0OO;
    }

    public void OooO00o(OutputStream outputStream) throws IOException {
        iILl11.OooO00o(this.OooO00o, outputStream);
        iILl11.OooO00o(this.OooO0O0, outputStream);
        L1LL1Ii.OooO0OO(this.f15811OooO00o, outputStream);
        iILl11.OooO00o(this.OooO0OO, outputStream);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15658OooO00o() {
        return this.f15811OooO00o;
    }

    public BigInteger OooO0O0() {
        return this.OooO0O0;
    }

    public BigInteger OooO0OO() {
        return this.OooO00o;
    }
}
