package com.p118pd.sdk;

import java.io.IOException;
import java.util.Date;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.iI丨Li丨lI  reason: invalid class name and case insensitive filesystem */
public class C6139iILilI extends C9623il {
    public C6139iILilI(String str) {
        super(str);
    }

    public C6139iILilI(Date date) {
        super(date);
    }

    public C6139iILilI(byte[] bArr) {
        super(bArr);
    }

    @Override // com.p118pd.sdk.C9623il, com.p118pd.sdk.C9623il, com.p118pd.sdk.AbstractC6122iIlLiL
    private byte[] OooO00o() {
        byte[] bArr = this.OooO00o;
        if (bArr[bArr.length - 1] != 90) {
            return bArr;
        }
        if (!m21688OooO0OO()) {
            byte[] bArr2 = this.OooO00o;
            byte[] bArr3 = new byte[(bArr2.length + 4)];
            System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length - 1);
            System.arraycopy(Strings.m22985OooO00o("0000Z"), 0, bArr3, this.OooO00o.length - 1, 5);
            return bArr3;
        } else if (!m21690OooO0Oo()) {
            byte[] bArr4 = this.OooO00o;
            byte[] bArr5 = new byte[(bArr4.length + 2)];
            System.arraycopy(bArr4, 0, bArr5, 0, bArr4.length - 1);
            System.arraycopy(Strings.m22985OooO00o("00Z"), 0, bArr5, this.OooO00o.length - 1, 3);
            return bArr5;
        } else if (!m21687OooO0O0()) {
            return this.OooO00o;
        } else {
            int length = this.OooO00o.length - 2;
            while (length > 0 && this.OooO00o[length] == 48) {
                length--;
            }
            byte[] bArr6 = this.OooO00o;
            if (bArr6[length] == 46) {
                byte[] bArr7 = new byte[(length + 1)];
                System.arraycopy(bArr6, 0, bArr7, 0, length);
                bArr7[length] = 90;
                return bArr7;
            }
            byte[] bArr8 = new byte[(length + 2)];
            int i = length + 1;
            System.arraycopy(bArr6, 0, bArr8, 0, i);
            bArr8[i] = 90;
            return bArr8;
        }
    }

    @Override // com.p118pd.sdk.C9623il, com.p118pd.sdk.AbstractC6122iIlLiL
    public void OooO00o(C6103iIi1 iii1) throws IOException {
        iii1.OooO00o(24, OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.C9623il, com.p118pd.sdk.C9623il, com.p118pd.sdk.C9623il, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6122iIlLiL, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        int length = OooO00o().length;
        return L1li1.OooO00o(length) + 1 + length;
    }
}
