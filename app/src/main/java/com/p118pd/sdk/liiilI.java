package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.liiilI */
public class liiilI {
    public BigInteger OooO00o;
    public BigInteger OooO0O0;
    public BigInteger OooO0OO;
    public BigInteger OooO0Oo;

    public liiilI() {
    }

    public liiilI(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        this.OooO00o = bigInteger;
        this.OooO0O0 = bigInteger2;
        this.OooO0OO = bigInteger3;
        this.OooO0Oo = bigInteger4;
    }

    public liiilI(byte[] bArr) {
        int OooO00o2 = AbstractC6464l1l.OooO00o(bArr, 0) + 4;
        this.OooO00o = new BigInteger(C9586iIILl.m21632OooO00o(bArr, 4, OooO00o2));
        int OooO00o3 = AbstractC6464l1l.OooO00o(bArr, OooO00o2);
        int i = OooO00o2 + 4;
        int i2 = OooO00o3 + i;
        this.OooO0O0 = new BigInteger(C9586iIILl.m21632OooO00o(bArr, i, i2));
        int OooO00o4 = AbstractC6464l1l.OooO00o(bArr, i2);
        int i3 = i2 + 4;
        int i4 = OooO00o4 + i3;
        this.OooO0OO = new BigInteger(C9586iIILl.m21632OooO00o(bArr, i3, i4));
        int OooO00o5 = AbstractC6464l1l.OooO00o(bArr, i4);
        int i5 = i4 + 4;
        this.OooO0Oo = new BigInteger(C9586iIILl.m21632OooO00o(bArr, i5, OooO00o5 + i5));
    }

    public BigInteger OooO00o() {
        return this.OooO0OO;
    }

    public void OooO00o(BigInteger bigInteger) {
        this.OooO0OO = bigInteger;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17775OooO00o() {
        byte[] byteArray = this.OooO00o.toByteArray();
        int length = byteArray.length;
        byte[] byteArray2 = this.OooO0O0.toByteArray();
        int length2 = byteArray2.length;
        byte[] byteArray3 = this.OooO0OO.toByteArray();
        int length3 = byteArray3.length;
        byte[] byteArray4 = this.OooO0Oo.toByteArray();
        int length4 = byteArray4.length;
        byte[] bArr = new byte[(length + length2 + length3 + length4 + 16)];
        AbstractC6464l1l.OooO00o(length, bArr, 0);
        System.arraycopy(byteArray, 0, bArr, 4, length);
        int i = length + 4;
        AbstractC6464l1l.OooO00o(length2, bArr, i);
        int i2 = i + 4;
        System.arraycopy(byteArray2, 0, bArr, i2, length2);
        int i3 = i2 + length2;
        AbstractC6464l1l.OooO00o(length3, bArr, i3);
        int i4 = i3 + 4;
        System.arraycopy(byteArray3, 0, bArr, i4, length3);
        int i5 = i4 + length3;
        AbstractC6464l1l.OooO00o(length4, bArr, i5);
        System.arraycopy(byteArray4, 0, bArr, i5 + 4, length4);
        return bArr;
    }

    public BigInteger OooO0O0() {
        return this.OooO00o;
    }

    public void OooO0O0(BigInteger bigInteger) {
        this.OooO00o = bigInteger;
    }

    public BigInteger OooO0OO() {
        return this.OooO0O0;
    }

    public void OooO0OO(BigInteger bigInteger) {
        this.OooO0O0 = bigInteger;
    }

    public BigInteger OooO0Oo() {
        return this.OooO0Oo;
    }

    public void OooO0Oo(BigInteger bigInteger) {
        this.OooO0Oo = bigInteger;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("u1: " + this.OooO00o.toString());
        stringBuffer.append("\nu2: " + this.OooO0O0.toString());
        stringBuffer.append("\ne: " + this.OooO0OO.toString());
        stringBuffer.append("\nv: " + this.OooO0Oo.toString());
        return stringBuffer.toString();
    }
}
