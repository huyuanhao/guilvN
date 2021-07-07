package com.p118pd.sdk;

import java.security.SecureRandom;

/* renamed from: com.pd.sdk.丨L1lLi1  reason: invalid class name and case insensitive filesystem */
public class C9466L1lLi1 implements IIIL1L {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6436l11LI f23036OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public SecureRandom f23037OooO00o;

    public C9466L1lLi1(int i) {
        this(i, null);
    }

    public C9466L1lLi1(int i, SecureRandom secureRandom) {
        this.f23036OooO00o = new C6461l1liI();
        this.OooO00o = i;
        this.f23037OooO00o = secureRandom;
    }

    @Override // com.p118pd.sdk.IIIL1L
    public byte[] OooO00o(byte[] bArr) {
        int OooO0O0 = this.f23036OooO00o.OooO0O0();
        byte[] bArr2 = new byte[OooO0O0];
        int OooO0O02 = this.OooO00o - this.f23036OooO00o.OooO0O0();
        byte[] bArr3 = new byte[OooO0O02];
        System.arraycopy(bArr, 0, bArr2, 0, OooO0O0);
        C6334illiLLi r5 = new C6334illiLLi(this.f23036OooO00o);
        r5.OooO00o(new C6624lL(bArr2));
        r5.OooO00o(bArr3, 0, OooO0O02);
        for (int i = 0; i != OooO0O02; i++) {
            int i2 = i + OooO0O0;
            bArr[i2] = (byte) (bArr[i2] ^ bArr3[i]);
        }
        int length = bArr.length - 1;
        while (true) {
            if (length == OooO0O0) {
                length = 0;
                break;
            } else if (bArr[length] == 0) {
                break;
            } else {
                length--;
            }
        }
        if (length != 0) {
            int i3 = length - OooO0O0;
            byte[] bArr4 = new byte[i3];
            System.arraycopy(bArr, OooO0O0, bArr4, 0, i3);
            return bArr4;
        }
        throw new IllegalStateException("bad padding in encoding");
    }

    @Override // com.p118pd.sdk.IIIL1L
    public byte[] OooO0O0(byte[] bArr) {
        int i = this.OooO00o;
        byte[] bArr2 = new byte[i];
        int OooO0O0 = this.f23036OooO00o.OooO0O0();
        byte[] bArr3 = new byte[OooO0O0];
        int OooO0O02 = this.OooO00o - this.f23036OooO00o.OooO0O0();
        byte[] bArr4 = new byte[OooO0O02];
        if (this.f23037OooO00o == null) {
            this.f23037OooO00o = new SecureRandom();
        }
        this.f23037OooO00o.nextBytes(bArr3);
        C6334illiLLi r6 = new C6334illiLLi(this.f23036OooO00o);
        r6.OooO00o(new C6624lL(bArr3));
        r6.OooO00o(bArr4, 0, OooO0O02);
        System.arraycopy(bArr3, 0, bArr2, 0, OooO0O0);
        System.arraycopy(bArr, 0, bArr2, OooO0O0, bArr.length);
        int length = bArr.length + OooO0O0;
        while (true) {
            length++;
            if (length == i) {
                break;
            }
            bArr2[length] = (byte) (this.f23037OooO00o.nextInt(255) + 1);
        }
        for (int i2 = 0; i2 != OooO0O02; i2++) {
            int i3 = i2 + OooO0O0;
            bArr2[i3] = (byte) (bArr2[i3] ^ bArr4[i2]);
        }
        return bArr2;
    }
}
