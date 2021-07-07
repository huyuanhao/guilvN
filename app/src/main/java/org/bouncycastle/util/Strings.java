package org.bouncycastle.util;

import androidx.exifinterface.media.ExifInterface;
import com.p118pd.sdk.C7967oO0oOo00;
import com.p118pd.sdk.LiilL1;
import com.umeng.commonsdk.proguard.C3571am;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.ArrayList;
import java.util.Vector;

public final class Strings {
    public static String OooO00o;

    public static class OooO00o implements PrivilegedAction<String> {
        /* renamed from: OooO00o */
        public String run() {
            return System.getProperty("line.separator");
        }
    }

    public static class StringListImpl extends ArrayList<String> implements LiilL1 {
        public StringListImpl() {
        }

        public /* synthetic */ StringListImpl(OooO00o oooO00o) {
            this();
        }

        public void add(int i, String str) {
            super.add(i, (Object) str);
        }

        @Override // com.p118pd.sdk.LiilL1
        public boolean add(String str) {
            return super.add((Object) str);
        }

        @Override // com.p118pd.sdk.LiilL1, java.util.List, java.util.AbstractList, java.util.ArrayList
        public /* bridge */ /* synthetic */ String get(int i) {
            return (String) super.get(i);
        }

        public String set(int i, String str) {
            return (String) super.set(i, (Object) str);
        }

        @Override // com.p118pd.sdk.LiilL1
        public String[] toStringArray() {
            int size = size();
            String[] strArr = new String[size];
            for (int i = 0; i != size; i++) {
                strArr[i] = (String) get(i);
            }
            return strArr;
        }

        @Override // com.p118pd.sdk.LiilL1
        public String[] toStringArray(int i, int i2) {
            String[] strArr = new String[(i2 - i)];
            int i3 = i;
            while (i3 != size() && i3 != i2) {
                strArr[i3 - i] = (String) get(i3);
                i3++;
            }
            return strArr;
        }
    }

    static {
        try {
            OooO00o = (String) AccessController.doPrivileged(new OooO00o());
        } catch (Exception unused) {
            try {
                OooO00o = String.format("%n", new Object[0]);
            } catch (Exception unused2) {
                OooO00o = "\n";
            }
        }
    }

    public static int OooO00o(String str, byte[] bArr, int i) {
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            bArr[i + i2] = (byte) str.charAt(i2);
        }
        return length;
    }

    public static LiilL1 OooO00o() {
        return new StringListImpl(null);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m22984OooO00o() {
        return OooO00o;
    }

    public static String OooO00o(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('A' <= c && 'Z' >= c) {
                charArray[i] = (char) ((c - 'A') + 97);
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    public static String OooO00o(byte[] bArr) {
        return new String(m22986OooO00o(bArr));
    }

    public static void OooO00o(char[] cArr, OutputStream outputStream) throws IOException {
        char c;
        int i;
        int i2 = 0;
        while (i2 < cArr.length) {
            char c2 = cArr[i2];
            char c3 = c2;
            if (c2 >= 128) {
                if (c2 < 2048) {
                    i = (c2 >> 6) | 192;
                } else if (c2 < 55296 || c2 > 57343) {
                    outputStream.write((c2 >> '\f') | C7967oO0oOo00.Ooooo0o);
                    i = ((c2 >> 6) & 63) | 128;
                } else {
                    i2++;
                    if (i2 < cArr.length) {
                        char c4 = cArr[i2];
                        if (c2 <= 56319) {
                            int i3 = (((c2 & 1023) << 10) | (c4 & 1023)) + 65536;
                            outputStream.write((i3 >> 18) | 240);
                            outputStream.write(((i3 >> 12) & 63) | 128);
                            outputStream.write(((i3 >> 6) & 63) | 128);
                            c = i3;
                            c3 = ((c == 1 ? 1 : 0) & 63) | 128;
                        } else {
                            throw new IllegalStateException("invalid UTF-16 codepoint");
                        }
                    } else {
                        throw new IllegalStateException("invalid UTF-16 codepoint");
                    }
                }
                outputStream.write(i);
                c = c2;
                c3 = ((c == 1 ? 1 : 0) & 63) | 128;
            }
            outputStream.write(c3 == 1 ? 1 : 0);
            i2++;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m22985OooO00o(String str) {
        int length = str.length();
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) str.charAt(i);
        }
        return bArr;
    }

    public static byte[] OooO00o(char[] cArr) {
        int length = cArr.length;
        byte[] bArr = new byte[length];
        for (int i = 0; i != length; i++) {
            bArr[i] = (byte) cArr[i];
        }
        return bArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static char[] m22986OooO00o(byte[] bArr) {
        int length = bArr.length;
        char[] cArr = new char[length];
        for (int i = 0; i != length; i++) {
            cArr[i] = (char) (bArr[i] & 255);
        }
        return cArr;
    }

    public static String[] OooO00o(String str, char c) {
        int i;
        Vector vector = new Vector();
        boolean z = true;
        while (true) {
            if (!z) {
                break;
            }
            int indexOf = str.indexOf(c);
            if (indexOf > 0) {
                vector.addElement(str.substring(0, indexOf));
                str = str.substring(indexOf + 1);
            } else {
                vector.addElement(str);
                z = false;
            }
        }
        int size = vector.size();
        String[] strArr = new String[size];
        for (i = 0; i != size; i++) {
            strArr[i] = (String) vector.elementAt(i);
        }
        return strArr;
    }

    public static String OooO0O0(String str) {
        char[] charArray = str.toCharArray();
        boolean z = false;
        for (int i = 0; i != charArray.length; i++) {
            char c = charArray[i];
            if ('a' <= c && 'z' >= c) {
                charArray[i] = (char) ((c - 'a') + 65);
                z = true;
            }
        }
        return z ? new String(charArray) : str;
    }

    public static String OooO0O0(byte[] bArr) {
        char c;
        int i;
        byte b;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < bArr.length) {
            i4++;
            if ((bArr[i3] & 240) == 240) {
                i4++;
                i3 += 4;
            } else {
                i3 = (bArr[i3] & C3571am.f9205k) == 224 ? i3 + 3 : (bArr[i3] & ExifInterface.OooO0Oo) == 192 ? i3 + 2 : i3 + 1;
            }
        }
        char[] cArr = new char[i4];
        int i5 = 0;
        while (i2 < bArr.length) {
            if ((bArr[i2] & 240) == 240) {
                int i6 = (((((bArr[i2] & 3) << 18) | ((bArr[i2 + 1] & 63) << 12)) | ((bArr[i2 + 2] & 63) << 6)) | (bArr[i2 + 3] & 63)) - 65536;
                c = (char) ((i6 & 1023) | 56320);
                cArr[i5] = (char) (55296 | (i6 >> 10));
                i2 += 4;
                i5++;
            } else if ((bArr[i2] & C3571am.f9205k) == 224) {
                c = (char) (((bArr[i2] & 15) << 12) | ((bArr[i2 + 1] & 63) << 6) | (bArr[i2 + 2] & 63));
                i2 += 3;
            } else {
                if ((bArr[i2] & 208) == 208) {
                    i = (bArr[i2] & C3571am.f9204j) << 6;
                    b = bArr[i2 + 1];
                } else if ((bArr[i2] & ExifInterface.OooO0Oo) == 192) {
                    i = (bArr[i2] & C3571am.f9204j) << 6;
                    b = bArr[i2 + 1];
                } else {
                    c = (char) (bArr[i2] & 255);
                    i2++;
                }
                c = (char) (i | (b & 63));
                i2 += 2;
            }
            cArr[i5] = c;
            i5++;
        }
        return new String(cArr);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static byte[] m22987OooO0O0(String str) {
        return OooO0O0(str.toCharArray());
    }

    public static byte[] OooO0O0(char[] cArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            OooO00o(cArr, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException unused) {
            throw new IllegalStateException("cannot encode string to byte array!");
        }
    }
}
