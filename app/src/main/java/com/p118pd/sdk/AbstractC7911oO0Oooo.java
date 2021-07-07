package com.p118pd.sdk;

import com.drew.lang.annotations.NotNull;
import com.drew.lang.annotations.Nullable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* renamed from: com.pd.sdk.oO0Oooo  reason: case insensitive filesystem */
public abstract class AbstractC7911oO0Oooo {
    public boolean OooO00o = true;

    public abstract byte OooO00o(int i) throws IOException;

    public abstract long OooO00o() throws IOException;

    public abstract void OooO00o(int i, int i2) throws IOException;

    public void OooO00o(boolean z) {
        this.OooO00o = z;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract boolean m19601OooO00o(int i, int i2) throws IOException;

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract byte[] m19602OooO00o(int i, int i2) throws IOException;

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public short m19607OooO0O0(int i) throws IOException {
        OooO00o(i, 1);
        return (short) (OooO00o(i) & 255);
    }

    public int OooO0OO(int i) throws IOException {
        int OooO00o2;
        byte OooO00o3;
        OooO00o(i, 2);
        if (this.OooO00o) {
            OooO00o2 = (OooO00o(i) << 8) & 65280;
            OooO00o3 = OooO00o(i + 1);
        } else {
            OooO00o2 = (OooO00o(i + 1) << 8) & 65280;
            OooO00o3 = OooO00o(i);
        }
        return (OooO00o3 & 255) | OooO00o2;
    }

    public abstract int OooO0Oo(int i);

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19599OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19600OooO00o(int i) throws IOException {
        int i2 = i / 8;
        OooO00o(i2, 1);
        if (((OooO00o(i2) >> (i % 8)) & 1) == 1) {
            return true;
        }
        return false;
    }

    public byte OooO0O0(int i) throws IOException {
        OooO00o(i, 1);
        return OooO00o(i);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public long m19605OooO0O0(int i) throws IOException {
        long OooO00o2;
        byte OooO00o3;
        OooO00o(i, 4);
        if (this.OooO00o) {
            long OooO00o4 = 4278190080L & (((long) OooO00o(i)) << 24);
            OooO00o2 = (65280 & (((long) OooO00o(i + 2)) << 8)) | (16711680 & (((long) OooO00o(i + 1)) << 16)) | OooO00o4;
            OooO00o3 = OooO00o(i + 3);
        } else {
            long OooO00o5 = 4278190080L & (((long) OooO00o(i + 3)) << 24);
            OooO00o2 = (65280 & (((long) OooO00o(i + 1)) << 8)) | (16711680 & (((long) OooO00o(i + 2)) << 16)) | OooO00o5;
            OooO00o3 = OooO00o(i);
        }
        return (255 & ((long) OooO00o3)) | OooO00o2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public short m19598OooO00o(int i) throws IOException {
        int OooO00o2;
        byte OooO00o3;
        OooO00o(i, 2);
        if (this.OooO00o) {
            OooO00o2 = (((short) OooO00o(i)) << 8) & -256;
            OooO00o3 = OooO00o(i + 1);
        } else {
            OooO00o2 = (((short) OooO00o(i + 1)) << 8) & -256;
            OooO00o3 = OooO00o(i);
        }
        return (short) ((((short) OooO00o3) & 255) | OooO00o2);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public int m19604OooO0O0(int i) throws IOException {
        int OooO00o2;
        byte OooO00o3;
        OooO00o(i, 4);
        if (this.OooO00o) {
            OooO00o2 = ((OooO00o(i) << 24) & -16777216) | (16711680 & (OooO00o(i + 1) << 16)) | (65280 & (OooO00o(i + 2) << 8));
            OooO00o3 = OooO00o(i + 3);
        } else {
            OooO00o2 = ((OooO00o(i + 3) << 24) & -16777216) | (16711680 & (OooO00o(i + 2) << 16)) | (65280 & (OooO00o(i + 1) << 8));
            OooO00o3 = OooO00o(i);
        }
        return (OooO00o3 & 255) | OooO00o2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m19595OooO00o(int i) throws IOException {
        int OooO00o2;
        byte OooO00o3;
        OooO00o(i, 3);
        if (this.OooO00o) {
            OooO00o2 = ((OooO00o(i) << 16) & C7265o0O000oo.OooOo0O) | (65280 & (OooO00o(i + 1) << 8));
            OooO00o3 = OooO00o(i + 2);
        } else {
            OooO00o2 = ((OooO00o(i + 2) << 16) & C7265o0O000oo.OooOo0O) | (65280 & (OooO00o(i + 1) << 8));
            OooO00o3 = OooO00o(i);
        }
        return (OooO00o3 & 255) | OooO00o2;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public float m19603OooO0O0(int i) throws IOException {
        double OooO00o2;
        double d;
        OooO00o(i, 4);
        if (this.OooO00o) {
            int OooO00o3 = (OooO00o(i + 3) & 255) | ((OooO00o(i + 2) & 255) << 8);
            OooO00o2 = (double) ((float) (((OooO00o(i) & 255) << 8) | (OooO00o(i + 1) & 255)));
            double d2 = (double) OooO00o3;
            Double.isNaN(d2);
            d = d2 / 65536.0d;
            Double.isNaN(OooO00o2);
        } else {
            int OooO00o4 = (OooO00o(i) & 255) | ((OooO00o(i + 1) & 255) << 8);
            OooO00o2 = (double) ((float) (((OooO00o(i + 3) & 255) << 8) | (OooO00o(i + 2) & 255)));
            double d3 = (double) OooO00o4;
            Double.isNaN(d3);
            d = d3 / 65536.0d;
            Double.isNaN(OooO00o2);
        }
        return (float) (OooO00o2 + d);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public long m19596OooO00o(int i) throws IOException {
        long OooO00o2;
        byte OooO00o3;
        OooO00o(i, 8);
        if (this.OooO00o) {
            OooO00o2 = ((((long) OooO00o(i)) << 56) & -72057594037927936L) | ((((long) OooO00o(i + 1)) << 48) & 71776119061217280L) | ((((long) OooO00o(i + 2)) << 40) & 280375465082880L) | ((((long) OooO00o(i + 3)) << 32) & 1095216660480L) | ((((long) OooO00o(i + 4)) << 24) & 4278190080L) | ((((long) OooO00o(i + 5)) << 16) & 16711680) | ((((long) OooO00o(i + 6)) << 8) & 65280);
            OooO00o3 = OooO00o(i + 7);
        } else {
            OooO00o2 = ((((long) OooO00o(i + 7)) << 56) & -72057594037927936L) | ((((long) OooO00o(i + 6)) << 48) & 71776119061217280L) | ((((long) OooO00o(i + 5)) << 40) & 280375465082880L) | ((((long) OooO00o(i + 4)) << 32) & 1095216660480L) | ((((long) OooO00o(i + 3)) << 24) & 4278190080L) | ((((long) OooO00o(i + 2)) << 16) & 16711680) | ((((long) OooO00o(i + 1)) << 8) & 65280);
            OooO00o3 = OooO00o(i);
        }
        return (((long) OooO00o3) & 255) | OooO00o2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public float m19594OooO00o(int i) throws IOException {
        return Float.intBitsToFloat(m19604OooO0O0(i));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public double m19593OooO00o(int i) throws IOException {
        return Double.longBitsToDouble(m19596OooO00o(i));
    }

    @NotNull
    public String OooO00o(int i, int i2, @NotNull String str) throws IOException {
        byte[] OooO00o2 = m19602OooO00o(i, i2);
        try {
            return new String(OooO00o2, str);
        } catch (UnsupportedEncodingException unused) {
            return new String(OooO00o2);
        }
    }

    @NotNull
    public C7927oO0o0OOo OooO0O0(int i, int i2, @Nullable Charset charset) throws IOException {
        return new C7927oO0o0OOo(m19602OooO00o(i, i2), charset);
    }

    @NotNull
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m19606OooO0O0(int i, int i2, @NotNull Charset charset) throws IOException {
        return new String(m19602OooO00o(i, i2), charset.name());
    }

    @NotNull
    public byte[] OooO0O0(int i, int i2) throws IOException {
        byte[] OooO00o2 = m19602OooO00o(i, i2);
        int i3 = 0;
        while (i3 < OooO00o2.length && OooO00o2[i3] != 0) {
            i3++;
        }
        if (i3 == i2) {
            return OooO00o2;
        }
        byte[] bArr = new byte[i3];
        if (i3 > 0) {
            System.arraycopy(OooO00o2, 0, bArr, 0, i3);
        }
        return bArr;
    }

    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m19597OooO00o(int i, int i2, @NotNull Charset charset) throws IOException {
        return new String(OooO0O0(i, i2), charset.name());
    }

    @NotNull
    public C7927oO0o0OOo OooO00o(int i, int i2, @Nullable Charset charset) throws IOException {
        return new C7927oO0o0OOo(OooO0O0(i, i2), charset);
    }
}
