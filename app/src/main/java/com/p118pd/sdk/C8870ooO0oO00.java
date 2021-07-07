package com.p118pd.sdk;

import java.io.IOException;
import java.io.StringReader;

/* renamed from: com.pd.sdk.ooO0oO00  reason: case insensitive filesystem */
public class C8870ooO0oO00 {
    public static final char[] OooO00o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final int[] f22078OooO00o = {60, 56, 52, 48, 44, 40, 36, 32, 28, 24, 20, 16, 12, 8, 4, 0};

    public static int OooO00o(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        char c2 = 'a';
        if (c < 'a' || c > 'f') {
            c2 = 'A';
            if (c < 'A' || c > 'F') {
                return -1;
            }
        }
        return (c - c2) + 10;
    }

    public static String OooO00o(byte[] bArr) {
        C8870ooO0oO00 ooo0oo00 = new C8870ooO0oO00();
        ooo0oo00.getClass();
        return new OooO00o().OooO00o(OooO0O0(bArr));
    }

    public static String OooO0O0(byte[] bArr) {
        return OooO00o(bArr, 0, bArr.length);
    }

    public static String OooO00o(byte[] bArr, int i) {
        C8870ooO0oO00 ooo0oo00 = new C8870ooO0oO00();
        ooo0oo00.getClass();
        return new OooO00o(ooo0oo00, i).OooO00o(OooO0O0(bArr));
    }

    /* renamed from: com.pd.sdk.ooO0oO00$OooO00o */
    public class OooO00o {
        public int OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public String f22080OooO00o;
        public String OooO0O0;

        public OooO00o() {
            this.OooO00o = 8;
            this.f22080OooO00o = "";
            this.OooO0O0 = "\n";
        }

        private boolean OooO0O0(StringBuilder sb, StringReader stringReader) throws IOException {
            StringBuilder sb2 = new StringBuilder();
            boolean z = true;
            for (int i = 0; i < this.OooO00o && (z = OooO00o(sb2, stringReader)); i++) {
            }
            if (sb2.length() > 0) {
                sb.append(this.f22080OooO00o);
                sb.append((CharSequence) sb2);
                sb.append(this.OooO0O0);
            }
            return z;
        }

        public String OooO00o(String str) {
            StringReader stringReader = new StringReader(str);
            StringBuilder sb = new StringBuilder(str.length() * 2);
            do {
            } while (OooO0O0(sb, stringReader));
            return sb.toString();
        }

        public OooO00o(C8870ooO0oO00 ooo0oo00, int i) {
            this(i, "", "\n");
        }

        private boolean OooO00o(StringBuilder sb, StringReader stringReader) throws IOException {
            char[] cArr = new char[4];
            int read = stringReader.read(cArr);
            if (read == -1) {
                return false;
            }
            sb.append(cArr, 0, read);
            sb.append(" ");
            if (read == 4) {
                return true;
            }
            return false;
        }

        public OooO00o(C8870ooO0oO00 ooo0oo00, int i, String str) {
            this(i, str, "\n");
        }

        public OooO00o(int i, String str, String str2) {
            this.OooO00o = 8;
            this.f22080OooO00o = "";
            this.OooO0O0 = "\n";
            this.OooO00o = i;
            this.f22080OooO00o = str;
            this.OooO0O0 = str2;
        }
    }

    public static String OooO00o(byte[] bArr, int i, String str) {
        C8870ooO0oO00 ooo0oo00 = new C8870ooO0oO00();
        ooo0oo00.getClass();
        return new OooO00o(ooo0oo00, i, str).OooO00o(OooO0O0(bArr));
    }

    public static String OooO00o(String str, int i, String str2, String str3) {
        C8870ooO0oO00 ooo0oo00 = new C8870ooO0oO00();
        ooo0oo00.getClass();
        return new OooO00o(i, str2, str3).OooO00o(str);
    }

    public static String OooO00o(long j, int i) {
        StringBuilder sb = new StringBuilder(i);
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(OooO00o[(int) ((j >> f22078OooO00o[(16 - i) + i2]) & 15)]);
        }
        return sb.toString();
    }

    public static String OooO00o(byte b) {
        return OooO00o((long) b, 2);
    }

    public static String OooO00o(short s) {
        return OooO00o((long) s, 4);
    }

    public static String OooO00o(int i) {
        return OooO00o((long) i, 8);
    }

    public static String OooO00o(long j) {
        return OooO00o(j, 16);
    }

    public static String OooO00o(byte[] bArr, int i, int i2) {
        StringBuilder sb = new StringBuilder();
        int i3 = i2 + i;
        while (i < i3) {
            sb.append(OooO00o(bArr[i]));
            i++;
        }
        return sb.toString();
    }

    public static byte[] OooO00o(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            int OooO00o2 = OooO00o(str.charAt(i2));
            int OooO00o3 = OooO00o(str.charAt(i2 + 1));
            if (OooO00o2 == -1 || OooO00o3 == -1) {
                return null;
            }
            bArr[i] = (byte) ((OooO00o2 << 4) + OooO00o3);
        }
        return bArr;
    }
}
