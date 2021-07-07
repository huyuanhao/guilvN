package com.p118pd.sdk;

import android.support.p000v4.media.session.MediaSessionCompat;
import com.baidu.idl.face.platform.utils.FileUtils;

/* renamed from: com.pd.sdk.lLlLI丨i  reason: invalid class name */
public class lLlLIi implements AbstractC6769llL1L {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public li1l11I1 f18549OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18550OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f18551OooO0O0;
    public byte[] OooO0OO;
    public byte[] OooO0Oo;
    public byte[] OooO0o;
    public byte[] OooO0o0;

    public lLlLIi(li1l11I1 li1l11i1) {
        this(li1l11i1, li1l11i1.OooO00o() * 8);
    }

    public lLlLIi(li1l11I1 li1l11i1, int i) {
        if (i % 8 != 0) {
            throw new IllegalArgumentException("MAC size must be multiple of 8");
        } else if (i <= li1l11i1.OooO00o() * 8) {
            this.f18549OooO00o = new C6927lll1(li1l11i1);
            this.OooO0O0 = i / 8;
            this.f18550OooO00o = OooO00o(li1l11i1.OooO00o());
            this.OooO0OO = new byte[li1l11i1.OooO00o()];
            this.OooO0Oo = new byte[li1l11i1.OooO00o()];
            this.f18551OooO0O0 = new byte[li1l11i1.OooO00o()];
            this.OooO00o = 0;
        } else {
            throw new IllegalArgumentException("MAC size must be less or equal to " + (li1l11i1.OooO00o() * 8));
        }
    }

    public static int OooO00o(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        int i = 0;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            int i2 = bArr[length] & 255;
            bArr2[length] = (byte) (i | (i2 << 1));
            i = (i2 >>> 7) & 1;
        }
    }

    public static byte[] OooO00o(int i) {
        int i2 = i * 8;
        int i3 = 135;
        switch (i2) {
            case 64:
            case MediaSessionCompat.MAX_BITMAP_SIZE_IN_DP:
                i3 = 27;
                break;
            case 128:
            case 192:
                break;
            case 160:
                i3 = 45;
                break;
            case C7967oO0oOo00.Ooooo0o /*{ENCODED_INT: 224}*/:
                i3 = 777;
                break;
            case 256:
                i3 = C8122oOOOO0oo.OoooOoO;
                break;
            case 384:
                i3 = C7997oO0ooOO0.OoooOo0;
                break;
            case FileUtils.S_IRWXU:
                i3 = 2129;
                break;
            case 512:
                i3 = 293;
                break;
            case 768:
                i3 = 655377;
                break;
            case 1024:
                i3 = 524355;
                break;
            case 2048:
                i3 = 548865;
                break;
            default:
                throw new IllegalArgumentException("Unknown block size for CMAC: " + i2);
        }
        return AbstractC6464l1l.OooO00o(i3);
    }

    private byte[] OooO00o(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        int i = (-OooO00o(bArr, bArr2)) & 255;
        int length = bArr.length - 3;
        byte b = bArr2[length];
        byte[] bArr3 = this.f18550OooO00o;
        bArr2[length] = (byte) (b ^ (bArr3[1] & i));
        int length2 = bArr.length - 2;
        bArr2[length2] = (byte) ((bArr3[2] & i) ^ bArr2[length2]);
        int length3 = bArr.length - 1;
        bArr2[length3] = (byte) ((i & bArr3[3]) ^ bArr2[length3]);
        return bArr2;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    public int OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public int OooO00o(byte[] bArr, int i) {
        byte[] bArr2;
        if (this.OooO00o == this.f18549OooO00o.OooO00o()) {
            bArr2 = this.OooO0o0;
        } else {
            new C5415Iii1().OooO00o(this.OooO0Oo, this.OooO00o);
            bArr2 = this.OooO0o;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr3 = this.OooO0OO;
            if (i2 < bArr3.length) {
                byte[] bArr4 = this.OooO0Oo;
                bArr4[i2] = (byte) (bArr4[i2] ^ bArr2[i2]);
                i2++;
            } else {
                this.f18549OooO00o.OooO00o(this.OooO0Oo, 0, bArr3, 0);
                System.arraycopy(this.OooO0OO, 0, bArr, i, this.OooO0O0);
                reset();
                return this.OooO0O0;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L, com.p118pd.sdk.AbstractC6769llL1L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17704OooO00o() {
        return this.f18549OooO00o.m17732OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void OooO00o(AbstractC6370iIIIl r4) {
        OooO0O0(r4);
        this.f18549OooO00o.OooO00o(true, r4);
        byte[] bArr = this.f18551OooO0O0;
        byte[] bArr2 = new byte[bArr.length];
        this.f18549OooO00o.OooO00o(bArr, 0, bArr2, 0);
        byte[] OooO00o2 = OooO00o(bArr2);
        this.OooO0o0 = OooO00o2;
        this.OooO0o = OooO00o(OooO00o2);
        reset();
    }

    public void OooO0O0(AbstractC6370iIIIl r2) {
        if (r2 != null && !(r2 instanceof C6642li1LI)) {
            throw new IllegalArgumentException("CMac mode only permits key to be set.");
        }
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void reset() {
        int i = 0;
        while (true) {
            byte[] bArr = this.OooO0Oo;
            if (i < bArr.length) {
                bArr[i] = 0;
                i++;
            } else {
                this.OooO00o = 0;
                this.f18549OooO00o.reset();
                return;
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte b) {
        int i = this.OooO00o;
        byte[] bArr = this.OooO0Oo;
        if (i == bArr.length) {
            this.f18549OooO00o.OooO00o(bArr, 0, this.OooO0OO, 0);
            this.OooO00o = 0;
        }
        byte[] bArr2 = this.OooO0Oo;
        int i2 = this.OooO00o;
        this.OooO00o = i2 + 1;
        bArr2[i2] = b;
    }

    @Override // com.p118pd.sdk.AbstractC6769llL1L
    public void update(byte[] bArr, int i, int i2) {
        if (i2 >= 0) {
            int OooO00o2 = this.f18549OooO00o.OooO00o();
            int i3 = this.OooO00o;
            int i4 = OooO00o2 - i3;
            if (i2 > i4) {
                System.arraycopy(bArr, i, this.OooO0Oo, i3, i4);
                this.f18549OooO00o.OooO00o(this.OooO0Oo, 0, this.OooO0OO, 0);
                this.OooO00o = 0;
                i2 -= i4;
                i += i4;
                while (i2 > OooO00o2) {
                    this.f18549OooO00o.OooO00o(bArr, i, this.OooO0OO, 0);
                    i2 -= OooO00o2;
                    i += OooO00o2;
                }
            }
            System.arraycopy(bArr, i, this.OooO0Oo, this.OooO00o, i2);
            this.OooO00o += i2;
            return;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}
