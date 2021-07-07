package com.p118pd.sdk;

/* renamed from: com.pd.sdk.I1l丨丨l  reason: invalid class name and case insensitive filesystem */
public final class C5191I1ll {
    public static final char[] OooO00o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static int OooO00o(byte[] bArr) {
        int i = 1;
        for (byte b : bArr) {
            i = (i * 31) + b;
        }
        return i;
    }

    public static int OooO00o(byte[][] bArr) {
        int i = 1;
        for (byte[] bArr2 : bArr) {
            i = (i * 31) + OooO00o(bArr2);
        }
        return i;
    }

    public static int OooO00o(byte[][][] bArr) {
        int i = 1;
        for (byte[][] bArr2 : bArr) {
            i = (i * 31) + OooO00o(bArr2);
        }
        return i;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m15331OooO00o(byte[] bArr) {
        String str = "";
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            for (int i2 = 0; i2 < 8; i2++) {
                str = str + ((b >>> i2) & 1);
            }
            if (i != bArr.length - 1) {
                str = str + " ";
            }
        }
        return str;
    }

    public static String OooO00o(byte[] bArr, String str, String str2) {
        String str3 = new String(str);
        for (int i = 0; i < bArr.length; i++) {
            str3 = (str3 + OooO00o[(bArr[i] >>> 4) & 15]) + OooO00o[bArr[i] & 15];
            if (i < bArr.length - 1) {
                str3 = str3 + str2;
            }
        }
        return str3;
    }

    public static boolean OooO00o(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2 == null;
        }
        if (bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = bArr.length - 1; length >= 0; length--) {
            z &= bArr[length] == bArr2[length];
        }
        return z;
    }

    public static boolean OooO00o(byte[][] bArr, byte[][] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = bArr.length - 1; length >= 0; length--) {
            z &= OooO00o(bArr[length], bArr2[length]);
        }
        return z;
    }

    public static boolean OooO00o(byte[][][] bArr, byte[][][] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        boolean z = true;
        for (int length = bArr.length - 1; length >= 0; length--) {
            if (bArr[length].length != bArr2[length].length) {
                return false;
            }
            for (int length2 = bArr[length].length - 1; length2 >= 0; length2--) {
                z &= OooO00o(bArr[length][length2], bArr2[length][length2]);
            }
        }
        return z;
    }

    public static byte[] OooO00o(String str) {
        char[] charArray = str.toUpperCase().toCharArray();
        int i = 0;
        for (int i2 = 0; i2 < charArray.length; i2++) {
            if ((charArray[i2] >= '0' && charArray[i2] <= '9') || (charArray[i2] >= 'A' && charArray[i2] <= 'F')) {
                i++;
            }
        }
        byte[] bArr = new byte[((i + 1) >> 1)];
        int i3 = i & 1;
        for (int i4 = 0; i4 < charArray.length; i4++) {
            if (charArray[i4] < '0' || charArray[i4] > '9') {
                if (charArray[i4] >= 'A' && charArray[i4] <= 'F') {
                    int i5 = i3 >> 1;
                    bArr[i5] = (byte) (bArr[i5] << 4);
                    bArr[i5] = (byte) (bArr[i5] | ((charArray[i4] - 'A') + 10));
                }
            } else {
                int i6 = i3 >> 1;
                bArr[i6] = (byte) (bArr[i6] << 4);
                bArr[i6] = (byte) (bArr[i6] | (charArray[i4] - '0'));
            }
            i3++;
        }
        return bArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m15332OooO00o(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    public static byte[] OooO00o(byte[] bArr, int i) {
        return OooO00o(bArr, i, bArr.length);
    }

    public static byte[] OooO00o(byte[] bArr, int i, int i2) {
        int i3 = i2 - i;
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return bArr2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m15333OooO00o(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[(bArr.length + bArr2.length)];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m15334OooO00o(byte[][] bArr) {
        int length = bArr[0].length;
        byte[] bArr2 = new byte[(bArr.length * length)];
        int i = 0;
        for (byte[] bArr3 : bArr) {
            System.arraycopy(bArr3, 0, bArr2, i, length);
            i += length;
        }
        return bArr2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static char[] m15335OooO00o(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        for (int i = 0; i < bArr.length; i++) {
            cArr[i] = (char) bArr[i];
        }
        return cArr;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[][] m15336OooO00o(byte[] bArr, int i) throws ArrayIndexOutOfBoundsException {
        if (i <= bArr.length) {
            byte[][] bArr2 = {new byte[i], new byte[(bArr.length - i)]};
            System.arraycopy(bArr, 0, bArr2[0], 0, i);
            System.arraycopy(bArr, i, bArr2[1], 0, bArr.length - i);
            return bArr2;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public static String OooO0O0(byte[] bArr) {
        String str = "";
        for (int i = 0; i < bArr.length; i++) {
            str = (str + OooO00o[(bArr[i] >>> 4) & 15]) + OooO00o[bArr[i] & 15];
        }
        return str;
    }

    public static byte[] OooO0O0(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length];
        for (int length = bArr.length - 1; length >= 0; length--) {
            bArr3[length] = (byte) (bArr[length] ^ bArr2[length]);
        }
        return bArr3;
    }
}
