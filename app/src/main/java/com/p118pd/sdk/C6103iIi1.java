package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.iIi1  reason: case insensitive filesystem */
public class C6103iIi1 {
    public OutputStream OooO00o;

    /* renamed from: com.pd.sdk.iIi1$OooO00o */
    public class OooO00o extends C6103iIi1 {

        /* renamed from: OooO00o  reason: collision with other field name */
        public boolean f17535OooO00o = true;

        public OooO00o(OutputStream outputStream) {
            super(outputStream);
        }

        @Override // com.p118pd.sdk.C6103iIi1
        public void OooO00o(int i) throws IOException {
            if (this.f17535OooO00o) {
                this.f17535OooO00o = false;
            } else {
                C6103iIi1.super.OooO00o(i);
            }
        }
    }

    public C6103iIi1(OutputStream outputStream) {
        this.OooO00o = outputStream;
    }

    public C6103iIi1 OooO00o() {
        return new C6119iIl1il(this.OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m16965OooO00o() throws IOException {
        this.OooO00o.close();
    }

    public void OooO00o(int i) throws IOException {
        this.OooO00o.write(i);
    }

    public void OooO00o(int i, int i2) throws IOException {
        if (i2 < 31) {
            OooO00o(i | i2);
            return;
        }
        OooO00o(i | 31);
        if (i2 < 128) {
            OooO00o(i2);
            return;
        }
        byte[] bArr = new byte[5];
        int i3 = 4;
        bArr[4] = (byte) (i2 & 127);
        do {
            i2 >>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & 127) | 128);
        } while (i2 > 127);
        OooO00o(bArr, i3, 5 - i3);
    }

    public void OooO00o(int i, int i2, byte[] bArr) throws IOException {
        OooO00o(i, i2);
        OooO0O0(bArr.length);
        OooO00o(bArr);
    }

    public void OooO00o(int i, byte[] bArr) throws IOException {
        OooO00o(i);
        OooO0O0(bArr.length);
        OooO00o(bArr);
    }

    public void OooO00o(AbstractC6122iIlLiL iillil) throws IOException {
        if (iillil != null) {
            iillil.OooO00o(new OooO00o(this.OooO00o));
            return;
        }
        throw new IOException("null object detected");
    }

    public void OooO00o(AbstractC6854lLi1LL r2) throws IOException {
        if (r2 != null) {
            r2.OooO0O0().OooO00o(this);
            return;
        }
        throw new IOException("null object detected");
    }

    public void OooO00o(byte[] bArr) throws IOException {
        this.OooO00o.write(bArr);
    }

    public void OooO00o(byte[] bArr, int i, int i2) throws IOException {
        this.OooO00o.write(bArr, i, i2);
    }

    public C6103iIi1 OooO0O0() {
        return new C6269iil1(this.OooO00o);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m16966OooO0O0() throws IOException {
        this.OooO00o.flush();
    }

    public void OooO0O0(int i) throws IOException {
        if (i > 127) {
            int i2 = i;
            int i3 = 1;
            while (true) {
                i2 >>>= 8;
                if (i2 == 0) {
                    break;
                }
                i3++;
            }
            OooO00o((byte) (i3 | 128));
            for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
                OooO00o((byte) (i >> i4));
            }
            return;
        }
        OooO00o((byte) i);
    }

    public void OooO0OO() throws IOException {
        this.OooO00o.write(5);
        this.OooO00o.write(0);
    }
}
