package com.drew.metadata.jpeg;

import androidx.exifinterface.media.ExifInterface;
import com.drew.lang.annotations.NotNull;
import com.drew.metadata.MetadataException;
import com.p118pd.sdk.AbstractC7922oO0o0O0O;
import com.p118pd.sdk.C8027oOO00oo;
import com.p118pd.sdk.oOO0O0;
import com.umeng.commonsdk.proguard.C3571am;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;

public class HuffmanTablesDirectory extends AbstractC7922oO0o0O0O {
    public static final int OooO00o = 1;
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final HashMap<Integer, String> f14870OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final byte[] f14871OooO00o = {0, 1, 5, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0};
    public static final byte[] OooO0O0 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    public static final byte[] OooO0OO = {0, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0};
    public static final byte[] OooO0Oo = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    public static final byte[] OooO0o = {1, 2, 3, 0, 4, 17, 5, 18, PublicSuffixDatabase.EXCEPTION_MARKER, 49, C8027oOO00oo.OooO00o, 6, 19, 81, 97, 7, 34, 113, 20, 50, -127, -111, -95, 8, 35, 66, -79, ExifInterface.OooO0o0, 21, 82, -47, -16, 36, 51, 98, 114, C3571am.f9202h, 9, 10, 22, 23, 24, 25, 26, C8027oOO00oo.OooO0OO, 38, 39, 40, 41, ExifInterface.OooO00o, 52, 53, 54, 55, 56, 57, 58, 67, 68, 69, 70, C8027oOO00oo.OooO0O0, 72, 73, 74, 83, 84, 85, 86, 87, 88, 89, 90, 99, 100, 101, 102, 103, 104, 105, 106, 115, 116, 117, 118, 119, 120, 121, 122, -125, -124, -123, -122, -121, -120, -119, -118, -110, -109, -108, -107, -106, -105, -104, -103, -102, -94, -93, -92, -91, -90, -89, -88, -87, -86, -78, -77, -76, -75, -74, -73, -72, -71, -70, ExifInterface.OooO0o, ExifInterface.OooO0oO, -60, ExifInterface.OooO0oo, ExifInterface.OooO, ExifInterface.OooOO0, -56, ExifInterface.OooOO0O, ExifInterface.OooOO0o, -46, -45, -44, -43, -42, -41, ExifInterface.OooO0OO, -39, -38, ExifInterface.OooOOo, -30, -29, -28, -27, -26, -25, -24, -23, -22, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6};
    public static final byte[] OooO0o0 = {0, 2, 1, 3, 3, 2, 4, 3, 5, 5, 4, 4, 0, 0, 1, 125};
    public static final byte[] OooO0oO = {0, 2, 1, 2, 4, 4, 3, 4, 7, 5, 4, 4, 0, 1, 2, 119};
    public static final byte[] OooO0oo = {0, 1, 2, 3, 17, 4, 5, PublicSuffixDatabase.EXCEPTION_MARKER, 49, 6, 18, C8027oOO00oo.OooO00o, 81, 7, 97, 113, 19, 34, 50, -127, 8, 20, 66, -111, -95, -79, ExifInterface.OooO0o0, 9, 35, 51, 82, -16, 21, 98, 114, -47, 10, 22, 36, 52, ExifInterface.OooOOo, C8027oOO00oo.OooO0OO, -15, 23, 24, 25, 26, 38, 39, 40, 41, ExifInterface.OooO00o, 53, 54, 55, 56, 57, 58, 67, 68, 69, 70, C8027oOO00oo.OooO0O0, 72, 73, 74, 83, 84, 85, 86, 87, 88, 89, 90, 99, 100, 101, 102, 103, 104, 105, 106, 115, 116, 117, 118, 119, 120, 121, 122, C3571am.f9202h, -125, -124, -123, -122, -121, -120, -119, -118, -110, -109, -108, -107, -106, -105, -104, -103, -102, -94, -93, -92, -91, -90, -89, -88, -87, -86, -78, -77, -76, -75, -74, -73, -72, -71, -70, ExifInterface.OooO0o, ExifInterface.OooO0oO, -60, ExifInterface.OooO0oo, ExifInterface.OooO, ExifInterface.OooOO0, -56, ExifInterface.OooOO0O, ExifInterface.OooOO0o, -46, -45, -44, -43, -42, -41, ExifInterface.OooO0OO, -39, -38, -30, -29, -28, -27, -26, -25, -24, -23, -22, -14, -13, -12, -11, -10, -9, -8, -7, -6};
    @NotNull

    /* renamed from: OooO00o  reason: collision with other field name */
    public final List<HuffmanTable> f14872OooO00o = new ArrayList(4);

    public static class HuffmanTable {
        public final int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final HuffmanTableClass f14873OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final byte[] f14874OooO00o;
        public final int OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public final byte[] f14875OooO0O0;

        public enum HuffmanTableClass {
            DC,
            AC,
            UNKNOWN;

            public static HuffmanTableClass typeOf(int i) {
                if (i == 0) {
                    return DC;
                }
                if (i != 1) {
                    return UNKNOWN;
                }
                return AC;
            }
        }

        public HuffmanTable(@NotNull HuffmanTableClass huffmanTableClass, int i, @NotNull byte[] bArr, @NotNull byte[] bArr2) {
            if (bArr == null) {
                throw new IllegalArgumentException("lengthBytes cannot be null.");
            } else if (bArr2 != null) {
                this.f14873OooO00o = huffmanTableClass;
                this.OooO0O0 = i;
                this.f14874OooO00o = bArr;
                this.f14875OooO0O0 = bArr2;
                this.OooO00o = bArr2.length + 17;
            } else {
                throw new IllegalArgumentException("valueBytes cannot be null.");
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public HuffmanTableClass m15033OooO00o() {
            return this.f14873OooO00o;
        }

        public int OooO0O0() {
            return this.OooO00o;
        }

        public int OooO00o() {
            return this.OooO0O0;
        }

        @NotNull
        /* renamed from: OooO0O0  reason: collision with other method in class */
        public byte[] m15037OooO0O0() {
            byte[] bArr = this.f14875OooO0O0;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }

        @NotNull
        /* renamed from: OooO00o  reason: collision with other method in class */
        public byte[] m15035OooO00o() {
            byte[] bArr = this.f14874OooO00o;
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }

        /* renamed from: OooO0O0  reason: collision with other method in class */
        public boolean m15036OooO0O0() {
            HuffmanTableClass huffmanTableClass = this.f14873OooO00o;
            if (huffmanTableClass == HuffmanTableClass.DC) {
                if (Arrays.equals(this.f14874OooO00o, HuffmanTablesDirectory.f14871OooO00o) && Arrays.equals(this.f14875OooO0O0, HuffmanTablesDirectory.OooO0O0)) {
                    return true;
                }
                if (!Arrays.equals(this.f14874OooO00o, HuffmanTablesDirectory.OooO0OO) || !Arrays.equals(this.f14875OooO0O0, HuffmanTablesDirectory.OooO0Oo)) {
                    return false;
                }
                return true;
            } else if (huffmanTableClass != HuffmanTableClass.AC) {
                return false;
            } else {
                if (Arrays.equals(this.f14874OooO00o, HuffmanTablesDirectory.OooO0o0) && Arrays.equals(this.f14875OooO0O0, HuffmanTablesDirectory.OooO0o)) {
                    return true;
                }
                if (!Arrays.equals(this.f14874OooO00o, HuffmanTablesDirectory.OooO0oO) || !Arrays.equals(this.f14875OooO0O0, HuffmanTablesDirectory.OooO0oo)) {
                    return false;
                }
                return true;
            }
        }

        /* renamed from: OooO00o  reason: collision with other method in class */
        public boolean m15034OooO00o() {
            return !m15036OooO0O0();
        }
    }

    static {
        HashMap<Integer, String> hashMap = new HashMap<>();
        f14870OooO00o = hashMap;
        hashMap.put(1, "Number of Tables");
    }

    public HuffmanTablesDirectory() {
        OooO00o(new oOO0O0(this));
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public String OooO00o() {
        return "Huffman";
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public HashMap<Integer, String> m15030OooO00o() {
        return f14870OooO00o;
    }

    public int OooO0OO() throws MetadataException {
        return m19631OooO00o(1);
    }

    public boolean OooO0Oo() {
        if (this.f14872OooO00o.size() == 0) {
            return false;
        }
        for (HuffmanTable huffmanTable : this.f14872OooO00o) {
            if (!huffmanTable.m15036OooO0O0()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    public HuffmanTable OooO00o(int i) {
        return this.f14872OooO00o.get(i);
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public boolean m15032OooO0OO() {
        return !OooO0Oo();
    }

    @Override // com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O, com.p118pd.sdk.AbstractC7922oO0o0O0O
    @NotNull
    /* renamed from: OooO00o  reason: collision with other method in class */
    public List<HuffmanTable> m15031OooO00o() {
        return this.f14872OooO00o;
    }
}
