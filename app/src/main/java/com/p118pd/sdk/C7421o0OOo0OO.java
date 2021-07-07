package com.p118pd.sdk;

import com.umeng.message.proguard.C3817f;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.pd.sdk.o0OOo0OO  reason: case insensitive filesystem */
public class C7421o0OOo0OO {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f20238OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f20239OooO00o;

    public C7421o0OOo0OO(int i) {
        this.f20238OooO00o = null;
        this.f20239OooO00o = new byte[i];
        this.OooO00o = 0;
    }

    public C7421o0OOo0OO(InputStream inputStream) throws IOException {
        this.f20238OooO00o = null;
        this.OooO00o = 0;
        this.f20239OooO00o = new byte[16384];
        while (true) {
            int read = inputStream.read(this.f20239OooO00o, this.OooO00o, 16384);
            if (read > 0) {
                int i = this.OooO00o + read;
                this.OooO00o = i;
                if (read == 16384) {
                    OooO00o(i + 16384);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public C7421o0OOo0OO(byte[] bArr) {
        this.f20238OooO00o = null;
        this.f20239OooO00o = bArr;
        this.OooO00o = bArr.length;
    }

    public C7421o0OOo0OO(byte[] bArr, int i) {
        this.f20238OooO00o = null;
        if (i <= bArr.length) {
            this.f20239OooO00o = bArr;
            this.OooO00o = i;
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Valid length exceeds the buffer length.");
    }

    public C7421o0OOo0OO(byte[] bArr, int i, int i2) {
        this.f20238OooO00o = null;
        if (i2 <= bArr.length - i) {
            byte[] bArr2 = new byte[i2];
            this.f20239OooO00o = bArr2;
            System.arraycopy(bArr, i, bArr2, 0, i2);
            this.OooO00o = i2;
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Valid length exceeds the buffer length.");
    }

    private void OooO00o(int i) {
        byte[] bArr = this.f20239OooO00o;
        if (i > bArr.length) {
            byte[] bArr2 = new byte[(bArr.length * 2)];
            this.f20239OooO00o = bArr2;
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte m18986OooO00o(int i) {
        if (i < this.OooO00o) {
            return this.f20239OooO00o[i];
        }
        throw new IndexOutOfBoundsException("The index exceeds the valid buffer area");
    }

    public int OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m18987OooO00o(int i) {
        if (i < this.OooO00o) {
            return this.f20239OooO00o[i] & 255;
        }
        throw new IndexOutOfBoundsException("The index exceeds the valid buffer area");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public InputStream m18988OooO00o() {
        return new ByteArrayInputStream(this.f20239OooO00o, 0, this.OooO00o);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m18989OooO00o() {
        String str;
        if (this.f20238OooO00o == null) {
            int i = this.OooO00o;
            if (i >= 2) {
                byte[] bArr = this.f20239OooO00o;
                if (bArr[0] == 0) {
                    if (i < 4 || bArr[1] != 0) {
                        str = C3817f.f10342d;
                        this.f20238OooO00o = str;
                    } else if ((bArr[2] & 255) == 254 && (bArr[3] & 255) == 255) {
                        str = "UTF-32BE";
                        this.f20238OooO00o = str;
                    }
                } else if ((bArr[0] & 255) < 128) {
                    if (bArr[1] == 0) {
                        str = (i < 4 || bArr[2] != 0) ? C3817f.f10343e : "UTF-32LE";
                        this.f20238OooO00o = str;
                    }
                } else if ((bArr[0] & 255) != 239) {
                    if ((bArr[0] & 255) == 254 || i < 4 || bArr[2] != 0) {
                        this.f20238OooO00o = C3817f.f10341c;
                    }
                }
                this.f20238OooO00o = "UTF-32";
            }
            this.f20238OooO00o = "UTF-8";
        }
        return this.f20238OooO00o;
    }

    public void OooO00o(byte b) {
        OooO00o(this.OooO00o + 1);
        byte[] bArr = this.f20239OooO00o;
        int i = this.OooO00o;
        this.OooO00o = i + 1;
        bArr[i] = b;
    }

    public void OooO00o(C7421o0OOo0OO o0ooo0oo) {
        OooO00o(o0ooo0oo.f20239OooO00o, 0, o0ooo0oo.OooO00o);
    }

    public void OooO00o(byte[] bArr) {
        OooO00o(bArr, 0, bArr.length);
    }

    public void OooO00o(byte[] bArr, int i, int i2) {
        OooO00o(this.OooO00o + i2);
        System.arraycopy(bArr, i, this.f20239OooO00o, this.OooO00o, i2);
        this.OooO00o += i2;
    }
}
