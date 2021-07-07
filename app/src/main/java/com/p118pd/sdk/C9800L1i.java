package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.util.HashSet;
import java.util.Set;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.丨丨L1i  reason: invalid class name and case insensitive filesystem */
public class C9800L1i {
    public static final String OooO00o = "2y";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Set<String> f23402OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final byte[] f23403OooO00o = {46, 47, C8027oOO00oo.OooO00o, 66, 67, 68, 69, 70, C8027oOO00oo.OooO0O0, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57};
    public static final byte[] OooO0O0 = new byte[128];

    static {
        HashSet hashSet = new HashSet();
        f23402OooO00o = hashSet;
        hashSet.add("2a");
        f23402OooO00o.add(OooO00o);
        f23402OooO00o.add("2b");
        int i = 0;
        int i2 = 0;
        while (true) {
            byte[] bArr = OooO0O0;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = -1;
            i2++;
        }
        while (true) {
            byte[] bArr2 = f23403OooO00o;
            if (i < bArr2.length) {
                OooO0O0[bArr2[i]] = (byte) i;
                i++;
            } else {
                return;
            }
        }
    }

    public static String OooO00o(String str, byte[] bArr, byte[] bArr2, int i) {
        String str2;
        if (f23402OooO00o.contains(str)) {
            StringBuffer stringBuffer = new StringBuffer(60);
            stringBuffer.append('$');
            stringBuffer.append(str);
            stringBuffer.append('$');
            if (i < 10) {
                str2 = "0" + i;
            } else {
                str2 = Integer.toString(i);
            }
            stringBuffer.append(str2);
            stringBuffer.append('$');
            stringBuffer.append(OooO00o(bArr2));
            stringBuffer.append(OooO00o(C6779llLLIL.OooO00o(bArr, bArr2, i)));
            return stringBuffer.toString();
        }
        throw new IllegalArgumentException("Version " + str + " is not accepted by this implementation.");
    }

    public static String OooO00o(String str, char[] cArr, byte[] bArr, int i) {
        if (!f23402OooO00o.contains(str)) {
            throw new IllegalArgumentException("Version " + str + " is not accepted by this implementation.");
        } else if (cArr == null) {
            throw new IllegalArgumentException("Password required.");
        } else if (bArr == null) {
            throw new IllegalArgumentException("Salt required.");
        } else if (bArr.length != 16) {
            throw new DataLengthException("16 byte salt required: " + bArr.length);
        } else if (i < 4 || i > 31) {
            throw new IllegalArgumentException("Invalid cost factor.");
        } else {
            byte[] OooO0O02 = Strings.OooO0O0(cArr);
            int i2 = 72;
            if (OooO0O02.length < 72) {
                i2 = OooO0O02.length + 1;
            }
            byte[] bArr2 = new byte[i2];
            if (i2 > OooO0O02.length) {
                i2 = OooO0O02.length;
            }
            System.arraycopy(OooO0O02, 0, bArr2, 0, i2);
            C9586iIILl.OooO00o(OooO0O02, (byte) 0);
            String OooO00o2 = OooO00o(str, bArr2, bArr, i);
            C9586iIILl.OooO00o(bArr2, (byte) 0);
            return OooO00o2;
        }
    }

    public static String OooO00o(byte[] bArr) {
        boolean z;
        if (bArr.length == 24 || bArr.length == 16) {
            if (bArr.length == 16) {
                byte[] bArr2 = new byte[18];
                System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                bArr = bArr2;
                z = true;
            } else {
                bArr[bArr.length - 1] = 0;
                z = false;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int length = bArr.length;
            for (int i = 0; i < length; i += 3) {
                int i2 = bArr[i] & 255;
                int i3 = bArr[i + 1] & 255;
                int i4 = bArr[i + 2] & 255;
                byteArrayOutputStream.write(f23403OooO00o[(i2 >>> 2) & 63]);
                byteArrayOutputStream.write(f23403OooO00o[((i2 << 4) | (i3 >>> 4)) & 63]);
                byteArrayOutputStream.write(f23403OooO00o[((i3 << 2) | (i4 >>> 6)) & 63]);
                byteArrayOutputStream.write(f23403OooO00o[i4 & 63]);
            }
            String OooO00o2 = Strings.OooO00o(byteArrayOutputStream.toByteArray());
            return OooO00o2.substring(0, z ? 22 : OooO00o2.length() - 1);
        }
        throw new DataLengthException("Invalid length: " + bArr.length + ", 24 for key or 16 for salt expected");
    }

    public static String OooO00o(char[] cArr, byte[] bArr, int i) {
        return OooO00o(OooO00o, cArr, bArr, i);
    }

    public static boolean OooO00o(String str, char[] cArr) {
        if (str.length() != 60) {
            throw new DataLengthException("Bcrypt String length: " + str.length() + ", 60 required.");
        } else if (str.charAt(0) == '$' && str.charAt(3) == '$' && str.charAt(6) == '$') {
            String substring = str.substring(1, 3);
            if (f23402OooO00o.contains(substring)) {
                String substring2 = str.substring(4, 6);
                try {
                    int parseInt = Integer.parseInt(substring2);
                    if (parseInt < 4 || parseInt > 31) {
                        throw new IllegalArgumentException("Invalid cost factor: " + parseInt + ", 4 < cost < 31 expected.");
                    } else if (cArr != null) {
                        return str.equals(OooO00o(substring, cArr, OooO00o(str.substring(str.lastIndexOf(36) + 1, str.length() - 31)), parseInt));
                    } else {
                        throw new IllegalArgumentException("Missing password.");
                    }
                } catch (NumberFormatException unused) {
                    throw new IllegalArgumentException("Invalid cost factor: " + substring2);
                }
            } else {
                throw new IllegalArgumentException("Bcrypt version '" + substring + "' is not supported by this implementation");
            }
        } else {
            throw new IllegalArgumentException("Invalid Bcrypt String format.");
        }
    }

    public static byte[] OooO00o(String str) {
        char[] charArray = str.toCharArray();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16);
        if (charArray.length == 22) {
            for (char c : charArray) {
                if (c > 'z' || c < '.' || (c > '9' && c < 'A')) {
                    throw new IllegalArgumentException("Salt string contains invalid character: " + ((int) c));
                }
            }
            char[] cArr = new char[24];
            System.arraycopy(charArray, 0, cArr, 0, charArray.length);
            for (int i = 0; i < 24; i += 4) {
                byte[] bArr = OooO0O0;
                byte b = bArr[cArr[i]];
                byte b2 = bArr[cArr[i + 1]];
                byte b3 = bArr[cArr[i + 2]];
                byte b4 = bArr[cArr[i + 3]];
                byteArrayOutputStream.write((b << 2) | (b2 >> 4));
                byteArrayOutputStream.write((b2 << 4) | (b3 >> 2));
                byteArrayOutputStream.write(b4 | (b3 << 6));
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byte[] bArr2 = new byte[16];
            System.arraycopy(byteArray, 0, bArr2, 0, 16);
            return bArr2;
        }
        throw new DataLengthException("Invalid base64 salt length: " + charArray.length + " , 22 required.");
    }
}
