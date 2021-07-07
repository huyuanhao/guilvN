package com.p118pd.sdk;

import com.xiaomi.mipush.sdk.Constants;

/* renamed from: com.pd.sdk.IiiiL1 */
public class IiiiL1 {
    public static char[] OooO00o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f15729OooO00o;

    public IiiiL1(byte[] bArr) {
        this.f15729OooO00o = OooO00o(bArr);
    }

    public static byte[] OooO00o(byte[] bArr) {
        I1llii i1llii = new I1llii(160);
        i1llii.update(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[i1llii.OooO0O0()];
        i1llii.OooO00o(bArr2, 0);
        return bArr2;
    }

    public byte[] OooO00o() {
        return C9586iIILl.m21630OooO00o(this.f15729OooO00o);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IiiiL1) {
            return C9586iIILl.m21627OooO00o(((IiiiL1) obj).f15729OooO00o, this.f15729OooO00o);
        }
        return false;
    }

    public int hashCode() {
        return C9586iIILl.OooO00o(this.f15729OooO00o);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i != this.f15729OooO00o.length; i++) {
            if (i > 0) {
                stringBuffer.append(Constants.COLON_SEPARATOR);
            }
            stringBuffer.append(OooO00o[(this.f15729OooO00o[i] >>> 4) & 15]);
            stringBuffer.append(OooO00o[this.f15729OooO00o[i] & 15]);
        }
        return stringBuffer.toString();
    }
}
