package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.pd.sdk.oO0o000O  reason: case insensitive filesystem */
public abstract class AbstractC7917oO0o000O {
    public boolean OooO00o = true;

    public abstract byte OooO00o() throws IOException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract int m19614OooO00o();

    public abstract void OooO00o(long j) throws IOException;

    public void OooO00o(boolean z) {
        this.OooO00o = z;
    }

    public abstract void OooO00o(@NotNull byte[] bArr, int i, int i2) throws IOException;

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract boolean m19619OooO00o(long j) throws IOException;

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract byte[] m19620OooO00o(int i) throws IOException;

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public abstract long m19623OooO0O0() throws IOException;

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public short m19625OooO0O0() throws IOException {
        return (short) (OooO00o() & 255);
    }

    public int OooO0OO() throws IOException {
        int OooO00o2;
        int OooO00o3;
        if (this.OooO00o) {
            OooO00o2 = (OooO00o() << 8) & 65280;
            OooO00o3 = OooO00o() & 255;
        } else {
            OooO00o2 = OooO00o() & 255;
            OooO00o3 = 65280 & (OooO00o() << 8);
        }
        return OooO00o2 | OooO00o3;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19618OooO00o() {
        return this.OooO00o;
    }

    public byte OooO0O0() throws IOException {
        return OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public short m19617OooO00o() throws IOException {
        int OooO00o2;
        int OooO00o3;
        if (this.OooO00o) {
            OooO00o2 = (((short) OooO00o()) << 8) & -256;
            OooO00o3 = ((short) OooO00o()) & 255;
        } else {
            OooO00o2 = ((short) OooO00o()) & 255;
            OooO00o3 = (((short) OooO00o()) << 8) & -256;
        }
        return (short) (OooO00o2 | OooO00o3);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public int m19622OooO0O0() throws IOException {
        int OooO00o2;
        int OooO00o3;
        if (this.OooO00o) {
            OooO00o2 = ((OooO00o() << 24) & -16777216) | ((OooO00o() << 16) & C7265o0O000oo.OooOo0O) | ((OooO00o() << 8) & 65280);
            OooO00o3 = OooO00o() & 255;
        } else {
            OooO00o2 = (OooO00o() & 255) | (65280 & (OooO00o() << 8)) | (16711680 & (OooO00o() << 16));
            OooO00o3 = -16777216 & (OooO00o() << 24);
        }
        return OooO00o2 | OooO00o3;
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public long m19626OooO0OO() throws IOException {
        if (this.OooO00o) {
            return (4278190080L & (((long) OooO00o()) << 24)) | (16711680 & (((long) OooO00o()) << 16)) | ((((long) OooO00o()) << 8) & 65280) | (((long) OooO00o()) & 255);
        }
        long OooO00o2 = 255 & ((long) OooO00o());
        long OooO00o3 = 16711680 & (((long) OooO00o()) << 16);
        return (4278190080L & (((long) OooO00o()) << 24)) | OooO00o3 | (65280 & (((long) OooO00o()) << 8)) | OooO00o2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public long m19615OooO00o() throws IOException {
        if (this.OooO00o) {
            return (-72057594037927936L & (((long) OooO00o()) << 56)) | (71776119061217280L & (((long) OooO00o()) << 48)) | ((((long) OooO00o()) << 40) & 280375465082880L) | ((((long) OooO00o()) << 32) & 1095216660480L) | ((((long) OooO00o()) << 24) & 4278190080L) | ((((long) OooO00o()) << 16) & 16711680) | ((((long) OooO00o()) << 8) & 65280) | (((long) OooO00o()) & 255);
        }
        return ((((long) OooO00o()) << 8) & 65280) | (((long) OooO00o()) & 255) | ((((long) OooO00o()) << 16) & 16711680) | ((((long) OooO00o()) << 24) & 4278190080L) | (1095216660480L & (((long) OooO00o()) << 32)) | (280375465082880L & (((long) OooO00o()) << 40)) | (71776119061217280L & (((long) OooO00o()) << 48)) | ((((long) OooO00o()) << 56) & -72057594037927936L);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public float m19621OooO0O0() throws IOException {
        if (this.OooO00o) {
            int OooO00o2 = ((OooO00o() & 255) << 8) | (OooO00o() & 255);
            double OooO00o3 = (double) ((float) (((OooO00o() & 255) << 8) | (OooO00o() & 255)));
            double d = (double) OooO00o2;
            Double.isNaN(d);
            Double.isNaN(OooO00o3);
            return (float) (OooO00o3 + (d / 65536.0d));
        }
        int OooO00o4 = (OooO00o() & 255) | ((OooO00o() & 255) << 8);
        double OooO00o5 = (double) ((float) ((OooO00o() & 255) | ((OooO00o() & 255) << 8)));
        double d2 = (double) OooO00o4;
        Double.isNaN(d2);
        Double.isNaN(OooO00o5);
        return (float) (OooO00o5 + (d2 / 65536.0d));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public float m19613OooO00o() throws IOException {
        return Float.intBitsToFloat(m19622OooO0O0());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public double m19612OooO00o() throws IOException {
        return Double.longBitsToDouble(m19615OooO00o());
    }

    @NotNull
    public String OooO00o(int i) throws IOException {
        return new String(m19620OooO00o(i));
    }

    @NotNull
    public String OooO00o(int i, String str) throws IOException {
        byte[] OooO00o2 = m19620OooO00o(i);
        try {
            return new String(OooO00o2, str);
        } catch (UnsupportedEncodingException unused) {
            return new String(OooO00o2);
        }
    }

    @NotNull
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m19624OooO0O0(int i, @NotNull Charset charset) throws IOException {
        return new String(m19620OooO00o(i), charset);
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19616OooO00o(int i, Charset charset) throws IOException {
        return OooO00o(i, charset).toString();
    }

    @NotNull
    public C7927oO0o0OOo OooO0O0(int i, @Nullable Charset charset) throws IOException {
        return new C7927oO0o0OOo(m19620OooO00o(i), charset);
    }

    @NotNull
    public C7927oO0o0OOo OooO00o(int i, Charset charset) throws IOException {
        return new C7927oO0o0OOo(OooO0O0(i), charset);
    }

    @NotNull
    public byte[] OooO0O0(int i) throws IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            byte OooO00o2 = OooO00o();
            bArr[i2] = OooO00o2;
            if (OooO00o2 == 0) {
                break;
            }
            i2++;
        }
        if (i2 == i) {
            return bArr;
        }
        byte[] bArr2 = new byte[i2];
        if (i2 > 0) {
            System.arraycopy(bArr, 0, bArr2, 0, i2);
        }
        return bArr2;
    }
}
