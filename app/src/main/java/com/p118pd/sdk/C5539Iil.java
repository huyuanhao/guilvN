package com.p118pd.sdk;

import com.umeng.commonsdk.proguard.C3587az;
import com.umeng.message.UmengMessageHandler;
import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.I丨il  reason: invalid class name and case insensitive filesystem */
public class C5539Iil implements li1l11I1 {
    public static byte[] OooO = {4, 10, 9, 2, 13, 8, 0, C3587az.f9268l, 6, 11, 1, 12, 7, 15, 5, 3, C3587az.f9268l, 11, 4, 12, 6, 13, 15, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, 13, 10, 3, 4, 2, C3587az.f9268l, 15, 12, 7, 6, 0, 9, 11, 7, 13, 10, 1, 0, 8, 9, 15, C3587az.f9268l, 4, 6, 12, 11, 2, 5, 3, 6, 12, 7, 1, 5, 15, 13, 8, 4, 10, 9, C3587az.f9268l, 0, 3, 11, 2, 4, 11, 10, 0, 7, 2, 1, 13, 3, 6, 8, 5, 9, 12, 15, C3587az.f9268l, 13, 11, 4, 1, 3, 15, 5, 9, 0, 10, C3587az.f9268l, 7, 6, 8, 2, 12, 1, 15, 13, 0, 5, 7, 10, 4, 9, 2, 3, C3587az.f9268l, 6, 11, 8, 12};
    public static final int OooO00o = 8;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static Hashtable f16053OooO00o = new Hashtable();
    public static byte[] OooO0O0 = {4, 10, 9, 2, 13, 8, 0, C3587az.f9268l, 6, 11, 1, 12, 7, 15, 5, 3, C3587az.f9268l, 11, 4, 12, 6, 13, 15, 10, 2, 3, 8, 1, 0, 7, 5, 9, 5, 8, 1, 13, 10, 3, 4, 2, C3587az.f9268l, 15, 12, 7, 6, 0, 9, 11, 7, 13, 10, 1, 0, 8, 9, 15, C3587az.f9268l, 4, 6, 12, 11, 2, 5, 3, 6, 12, 7, 1, 5, 15, 13, 8, 4, 10, 9, C3587az.f9268l, 0, 3, 11, 2, 4, 11, 10, 0, 7, 2, 1, 13, 3, 6, 8, 5, 9, 12, 15, C3587az.f9268l, 13, 11, 4, 1, 3, 15, 5, 9, 0, 10, C3587az.f9268l, 7, 6, 8, 2, 12, 1, 15, 13, 0, 5, 7, 10, 4, 9, 2, 3, C3587az.f9268l, 6, 11, 8, 12};
    public static byte[] OooO0OO = {4, 2, 15, 5, 9, 1, 0, 8, C3587az.f9268l, 3, 11, 12, 13, 7, 10, 6, 12, 9, 15, C3587az.f9268l, 8, 1, 3, 10, 2, 7, 4, 13, 6, 0, 11, 5, 13, 8, C3587az.f9268l, 12, 7, 3, 9, 10, 1, 5, 2, 4, 6, 15, 0, 11, C3587az.f9268l, 9, 11, 2, 5, 15, 7, 1, 0, 13, 12, 6, 10, 4, 3, 8, 3, C3587az.f9268l, 5, 9, 6, 8, 0, 13, 10, 11, 7, 12, 2, 1, 15, 4, 8, 15, 6, 11, 1, 9, 12, 5, 13, 3, 7, 10, 0, C3587az.f9268l, 2, 4, 9, 11, 12, 0, 3, 6, 7, 5, 4, 8, C3587az.f9268l, 15, 1, 10, 2, 13, 12, 6, 5, 2, 11, 0, 9, 13, 3, C3587az.f9268l, 7, 10, 15, 4, 1, 8};
    public static byte[] OooO0Oo = {9, 6, 3, 2, 8, 11, 1, 7, 10, 4, C3587az.f9268l, 15, 12, 0, 13, 5, 3, 7, C3587az.f9268l, 9, 8, 10, 15, 0, 5, 2, 6, 12, 11, 4, 13, 1, C3587az.f9268l, 4, 6, 2, 11, 3, 13, 8, 12, 15, 5, 10, 0, 7, 1, 9, C3587az.f9268l, 7, 10, 12, 13, 1, 3, 9, 0, 2, 11, 4, 15, 8, 5, 6, 11, 5, 1, 9, 8, 13, 15, 0, C3587az.f9268l, 4, 2, 3, 12, 7, 10, 6, 3, 10, 13, 12, 1, 2, 0, 11, 7, 5, 9, 4, 8, 15, C3587az.f9268l, 6, 1, 13, 2, 9, 7, 10, 6, 0, 8, 12, 4, 5, 15, 3, 11, C3587az.f9268l, 11, 10, 15, 5, 0, 12, C3587az.f9268l, 8, 6, 2, 3, 9, 1, 7, 13, 4};
    public static byte[] OooO0o = {1, 11, 12, 2, 9, 13, 0, 15, 4, 5, 8, C3587az.f9268l, 10, 7, 6, 3, 0, 1, 7, 13, 11, 4, 5, 2, 8, C3587az.f9268l, 15, 12, 9, 10, 6, 3, 8, 2, 5, 0, 4, 9, 15, 10, 3, 7, 12, 13, 6, C3587az.f9268l, 1, 11, 3, 6, 0, 1, 5, 13, 10, 8, 11, 2, 9, 7, C3587az.f9268l, 15, 12, 4, 8, 13, 11, 0, 4, 5, 1, 2, 9, 3, 12, C3587az.f9268l, 6, 15, 10, 7, 12, 9, 11, 1, 8, C3587az.f9268l, 2, 4, 7, 3, 6, 5, 10, 0, 15, 13, 10, 9, 6, 8, 13, C3587az.f9268l, 2, 0, 15, 3, 5, 11, 4, 1, 12, 7, 7, 4, 0, 5, 10, 2, 15, C3587az.f9268l, 12, 6, 1, 11, 13, 9, 3, 8};
    public static byte[] OooO0o0 = {8, 4, 11, 1, 3, 5, 0, 9, 2, C3587az.f9268l, 10, 12, 13, 6, 7, 15, 0, 1, 2, 10, 4, 13, 5, 12, 9, 7, 3, 15, 11, 8, 6, C3587az.f9268l, C3587az.f9268l, 12, 0, 10, 9, 2, 13, 11, 7, 5, 8, 15, 3, 6, 1, 4, 7, 5, 0, 13, 11, 6, 1, 2, 3, 10, 12, 15, 4, C3587az.f9268l, 9, 8, 2, 7, 12, 15, 9, 5, 10, 11, 1, 4, 0, 13, 6, 8, C3587az.f9268l, 3, 8, 3, 2, 6, 4, 13, C3587az.f9268l, 11, 12, 1, 7, 15, 10, 0, 9, 5, 5, 2, 10, 11, 9, 1, 12, 3, 7, 4, 13, 0, 6, 15, 8, C3587az.f9268l, 0, 4, 11, C3587az.f9268l, 8, 3, 7, 1, 10, 2, 9, 6, 15, 13, 5, 12};
    public static byte[] OooO0oO = {15, 12, 2, 10, 6, 4, 5, 0, 7, 9, C3587az.f9268l, 13, 1, 11, 8, 3, 11, 6, 3, 4, 12, 15, C3587az.f9268l, 2, 7, 13, 8, 0, 5, 10, 9, 1, 1, 12, 11, 0, 15, C3587az.f9268l, 6, 5, 10, 13, 4, 8, 9, 3, 7, 2, 1, 5, C3587az.f9268l, 12, 10, 7, 0, 13, 6, 2, 11, 4, 9, 3, 15, 8, 0, 12, 8, 9, 13, 2, 10, 11, 7, 3, 6, 5, 4, C3587az.f9268l, 15, 1, 8, 0, 15, 3, 2, 5, C3587az.f9268l, 11, 1, 10, 4, 7, 12, 9, 13, 6, 3, 0, 6, 15, 1, C3587az.f9268l, 9, 2, 13, 8, 12, 4, 11, 10, 5, 7, 1, 10, 6, 8, 15, 11, 0, 4, 12, 3, 5, 9, 7, 13, 2, C3587az.f9268l};
    public static byte[] OooO0oo = {12, 4, 6, 2, 10, 5, 11, 9, C3587az.f9268l, 8, 13, 7, 0, 3, 15, 1, 6, 8, 2, 3, 9, 10, 5, 12, 1, C3587az.f9268l, 4, 7, 11, 13, 0, 15, 11, 3, 5, 8, 2, 15, 10, 13, C3587az.f9268l, 1, 7, 4, 12, 9, 6, 0, 12, 8, 2, 1, 13, 4, 15, 6, 7, 0, 10, 5, 3, C3587az.f9268l, 9, 11, 7, 15, 5, 10, 8, 1, 6, 13, 0, 9, 3, C3587az.f9268l, 11, 4, 2, 12, 5, 13, 15, 6, 9, 2, 12, 10, 11, 7, 8, 1, 4, 3, C3587az.f9268l, 0, 8, C3587az.f9268l, 2, 5, 6, 9, 1, 12, 15, 4, 11, 0, 13, 10, 3, 7, 1, 7, C3587az.f9268l, 13, 0, 5, 8, 3, 4, 15, 10, 6, 9, 12, 11, 2};
    public static byte[] OooOO0 = {10, 4, 5, 6, 8, 1, 3, 7, 13, 12, C3587az.f9268l, 0, 9, 2, 11, 15, 5, 15, 4, 0, 2, 13, 11, 9, 1, 7, 6, 3, 12, C3587az.f9268l, 10, 8, 7, 15, 12, C3587az.f9268l, 9, 4, 1, 0, 3, 11, 5, 2, 6, 10, 8, 13, 4, 10, 7, 12, 0, 15, 2, 8, C3587az.f9268l, 1, 6, 5, 13, 11, 9, 3, 7, 6, 4, 11, 9, 12, 2, 10, 1, 8, 0, C3587az.f9268l, 15, 13, 3, 5, 7, 6, 2, 4, 13, 9, 15, 0, 10, 1, 5, 11, 8, C3587az.f9268l, 12, 3, 13, C3587az.f9268l, 4, 1, 7, 0, 5, 10, 3, 12, 8, 15, 6, 2, 9, 11, 1, 3, 10, 9, 5, 11, 4, 15, 8, 6, 7, C3587az.f9268l, 13, 0, 2, 12};

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16054OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16055OooO00o = OooO0O0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f16056OooO00o = null;

    static {
        OooO00o(UmengMessageHandler.DEFAULT_NOTIFICATION_CHANNEL_NAME, OooO0O0);
        OooO00o("E-TEST", OooO0OO);
        OooO00o("E-A", OooO0Oo);
        OooO00o("E-B", OooO0o0);
        OooO00o("E-C", OooO0o);
        OooO00o("E-D", OooO0oO);
        OooO00o("Param-Z", OooO0oo);
        OooO00o("D-TEST", OooO);
        OooO00o("D-A", OooOO0);
    }

    private int OooO00o(int i, int i2) {
        int i3 = i2 + i;
        byte[] bArr = this.f16055OooO00o;
        int i4 = (bArr[((i3 >> 0) & 15) + 0] << 0) + (bArr[((i3 >> 4) & 15) + 16] << 4) + (bArr[((i3 >> 8) & 15) + 32] << 8) + (bArr[((i3 >> 12) & 15) + 48] << 12) + (bArr[((i3 >> 16) & 15) + 64] << 16) + (bArr[((i3 >> 20) & 15) + 80] << 20) + (bArr[((i3 >> 24) & 15) + 96] << 24) + (bArr[((i3 >> 28) & 15) + 112] << C8026oOO00oOo.OooO00o);
        return (i4 << 11) | (i4 >>> 21);
    }

    private int OooO00o(byte[] bArr, int i) {
        return ((bArr[i + 3] << 24) & -16777216) + ((bArr[i + 2] << 16) & C7265o0O000oo.OooOo0O) + ((bArr[i + 1] << 8) & 65280) + (bArr[i] & 255);
    }

    public static String OooO00o(byte[] bArr) {
        Enumeration keys = f16053OooO00o.keys();
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            if (C9586iIILl.m21627OooO00o((byte[]) f16053OooO00o.get(str), bArr)) {
                return str;
            }
        }
        throw new IllegalArgumentException("SBOX provided did not map to a known one");
    }

    private void OooO00o(int i, byte[] bArr, int i2) {
        bArr[i2 + 3] = (byte) (i >>> 24);
        bArr[i2 + 2] = (byte) (i >>> 16);
        bArr[i2 + 1] = (byte) (i >>> 8);
        bArr[i2] = (byte) i;
    }

    public static void OooO00o(String str, byte[] bArr) {
        f16053OooO00o.put(Strings.OooO0O0(str), bArr);
    }

    private void OooO00o(int[] iArr, byte[] bArr, int i, byte[] bArr2, int i2) {
        int i3;
        int i4;
        int OooO00o2 = OooO00o(bArr, i);
        int OooO00o3 = OooO00o(bArr, i + 4);
        int i5 = 7;
        if (this.f16054OooO00o) {
            for (int i6 = 0; i6 < 3; i6++) {
                int i7 = 0;
                while (i7 < 8) {
                    i7++;
                    OooO00o2 = OooO00o3 ^ OooO00o(OooO00o2, iArr[i7]);
                    OooO00o3 = OooO00o2;
                }
            }
            i3 = OooO00o3;
            i4 = OooO00o2;
            while (i5 > 0) {
                int OooO00o4 = i3 ^ OooO00o(i4, iArr[i5]);
                i5--;
                i3 = i4;
                i4 = OooO00o4;
            }
        } else {
            int i8 = 0;
            while (i8 < 8) {
                i8++;
                OooO00o2 = OooO00o3 ^ OooO00o(OooO00o2, iArr[i8]);
                OooO00o3 = OooO00o2;
            }
            i3 = OooO00o3;
            i4 = OooO00o2;
            int i9 = 0;
            while (i9 < 3) {
                int i10 = 7;
                while (i10 >= 0 && (i9 != 2 || i10 != 0)) {
                    int OooO00o5 = i3 ^ OooO00o(i4, iArr[i10]);
                    i10--;
                    i3 = i4;
                    i4 = OooO00o5;
                }
                i9++;
            }
        }
        OooO00o(i4, bArr2, i2);
        OooO00o(OooO00o(i4, iArr[0]) ^ i3, bArr2, i2 + 4);
    }

    public static byte[] OooO00o(String str) {
        byte[] bArr = (byte[]) f16053OooO00o.get(Strings.OooO0O0(str));
        if (bArr != null) {
            return C9586iIILl.m21630OooO00o(bArr);
        }
        throw new IllegalArgumentException("Unknown S-Box - possible types: \"Default\", \"E-Test\", \"E-A\", \"E-B\", \"E-C\", \"E-D\", \"Param-Z\", \"D-Test\", \"D-A\".");
    }

    private int[] OooO00o(boolean z, byte[] bArr) {
        this.f16054OooO00o = z;
        if (bArr.length == 32) {
            int[] iArr = new int[8];
            for (int i = 0; i != 8; i++) {
                iArr[i] = OooO00o(bArr, i * 4);
            }
            return iArr;
        }
        throw new IllegalArgumentException("Key length invalid. Key needs to be 32 byte - 256 bit!!!");
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    public int OooO00o() {
        return 8;
    }

    @Override // com.p118pd.sdk.li1l11I1
    public int OooO00o(byte[] bArr, int i, byte[] bArr2, int i2) {
        int[] iArr = this.f16056OooO00o;
        if (iArr == null) {
            throw new IllegalStateException("GOST28147 engine not initialised");
        } else if (i + 8 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        } else if (i2 + 8 <= bArr2.length) {
            OooO00o(iArr, bArr, i, bArr2, i2);
            return 8;
        } else {
            throw new OutputLengthException("output buffer too short");
        }
    }

    @Override // com.p118pd.sdk.li1l11I1, com.p118pd.sdk.li1l11I1
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15824OooO00o() {
        return "GOST28147";
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void OooO00o(boolean z, AbstractC6370iIIIl r5) {
        if (r5 instanceof C9374IiI) {
            C9374IiI r52 = (C9374IiI) r5;
            byte[] OooO00o2 = r52.m21446OooO00o();
            if (OooO00o2.length == OooO0O0.length) {
                this.f16055OooO00o = C9586iIILl.m21630OooO00o(OooO00o2);
                if (r52.OooO00o() != null) {
                    this.f16056OooO00o = OooO00o(z, ((C6642li1LI) r52.OooO00o()).OooO00o());
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("invalid S-box passed to GOST28147 init");
        } else if (r5 instanceof C6642li1LI) {
            this.f16056OooO00o = OooO00o(z, ((C6642li1LI) r5).OooO00o());
        } else if (r5 != null) {
            throw new IllegalArgumentException("invalid parameter passed to GOST28147 init - " + r5.getClass().getName());
        }
    }

    @Override // com.p118pd.sdk.li1l11I1
    public void reset() {
    }
}
