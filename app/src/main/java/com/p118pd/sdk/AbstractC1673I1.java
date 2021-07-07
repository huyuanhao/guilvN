package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.I1 */
public abstract class AbstractC1673I1 extends ILL {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f15268OooO00o;
    public boolean OooO0O0;

    public AbstractC1673I1(OutputStream outputStream) {
        super(outputStream);
        this.f15268OooO00o = false;
    }

    public AbstractC1673I1(OutputStream outputStream, int i, boolean z) {
        super(outputStream);
        this.f15268OooO00o = false;
        this.f15268OooO00o = true;
        this.OooO0O0 = z;
        this.OooO00o = i;
    }

    private void OooO00o(OutputStream outputStream, int i) throws IOException {
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
            outputStream.write((byte) (i3 | 128));
            for (int i4 = (i3 - 1) * 8; i4 >= 0; i4 -= 8) {
                outputStream.write((byte) (i >> i4));
            }
            return;
        }
        outputStream.write((byte) i);
    }

    public void OooO00o(int i, byte[] bArr) throws IOException {
        if (this.f15268OooO00o) {
            int i2 = this.OooO00o;
            int i3 = i2 | 128;
            if (this.OooO0O0) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                OooO00o(byteArrayOutputStream, i, bArr);
                OooO00o(((ILL) this).OooO00o, i2 | 32 | 128, byteArrayOutputStream.toByteArray());
            } else if ((i & 32) != 0) {
                OooO00o(((ILL) this).OooO00o, i3 | 32, bArr);
            } else {
                OooO00o(((ILL) this).OooO00o, i3, bArr);
            }
        } else {
            OooO00o(((ILL) this).OooO00o, i, bArr);
        }
    }

    public void OooO00o(OutputStream outputStream, int i, byte[] bArr) throws IOException {
        outputStream.write(i);
        OooO00o(outputStream, bArr.length);
        outputStream.write(bArr);
    }
}
