package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.pd.sdk.丨iIILl  reason: invalid class name and case insensitive filesystem */
public final class C9586iIILl {

    /* renamed from: com.pd.sdk.丨iIILl$OooO00o */
    public static class OooO00o<T> implements Iterator<T> {
        public final T[] OooO00o;
        public int o00oO0O = 0;

        public OooO00o(T[] tArr) {
            this.OooO00o = tArr;
        }

        public boolean hasNext() {
            return this.o00oO0O < this.OooO00o.length;
        }

        @Override // java.util.Iterator
        public T next() {
            int i = this.o00oO0O;
            T[] tArr = this.OooO00o;
            if (i != tArr.length) {
                this.o00oO0O = i + 1;
                return tArr[i];
            }
            throw new NoSuchElementException("Out of elements: " + this.o00oO0O);
        }

        public void remove() {
            throw new UnsupportedOperationException("Cannot remove element from an Array.");
        }
    }

    public static int OooO00o(int i, int i2) {
        int i3 = i2 - i;
        if (i3 >= 0) {
            return i3;
        }
        StringBuffer stringBuffer = new StringBuffer(i);
        stringBuffer.append(" > ");
        stringBuffer.append(i2);
        throw new IllegalArgumentException(stringBuffer.toString());
    }

    public static int OooO00o(byte[] bArr) {
        if (bArr == null) {
            return 0;
        }
        int length = bArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ bArr[length];
        }
    }

    public static int OooO00o(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            return 0;
        }
        int i3 = i2 + 1;
        while (true) {
            i2--;
            if (i2 < 0) {
                return i3;
            }
            i3 = (i3 * 257) ^ bArr[i + i2];
        }
    }

    public static int OooO00o(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return 0;
        }
        if (bArr == null) {
            return -1;
        }
        if (bArr2 == null) {
            return 1;
        }
        int min = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i < min; i++) {
            int i2 = bArr[i] & 255;
            int i3 = bArr2[i] & 255;
            if (i2 < i3) {
                return -1;
            }
            if (i2 > i3) {
                return 1;
            }
        }
        if (bArr.length < bArr2.length) {
            return -1;
        }
        return bArr.length > bArr2.length ? 1 : 0;
    }

    public static int OooO00o(char[] cArr) {
        if (cArr == null) {
            return 0;
        }
        int length = cArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ cArr[length];
        }
    }

    public static int OooO00o(int[] iArr) {
        if (iArr == null) {
            return 0;
        }
        int length = iArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ iArr[length];
        }
    }

    public static int OooO00o(int[] iArr, int i, int i2) {
        if (iArr == null) {
            return 0;
        }
        int i3 = i2 + 1;
        while (true) {
            i2--;
            if (i2 < 0) {
                return i3;
            }
            i3 = (i3 * 257) ^ iArr[i + i2];
        }
    }

    public static int OooO00o(long[] jArr) {
        if (jArr == null) {
            return 0;
        }
        int length = jArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            long j = jArr[length];
            i = (((i * 257) ^ ((int) j)) * 257) ^ ((int) (j >>> 32));
        }
    }

    public static int OooO00o(long[] jArr, int i, int i2) {
        if (jArr == null) {
            return 0;
        }
        int i3 = i2 + 1;
        while (true) {
            i2--;
            if (i2 < 0) {
                return i3;
            }
            long j = jArr[i + i2];
            i3 = (((i3 * 257) ^ ((int) j)) * 257) ^ ((int) (j >>> 32));
        }
    }

    public static int OooO00o(Object[] objArr) {
        if (objArr == null) {
            return 0;
        }
        int length = objArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ objArr[length].hashCode();
        }
    }

    public static int OooO00o(short[] sArr) {
        if (sArr == null) {
            return 0;
        }
        int length = sArr.length;
        int i = length + 1;
        while (true) {
            length--;
            if (length < 0) {
                return i;
            }
            i = (i * 257) ^ (sArr[length] & 255);
        }
    }

    public static int OooO00o(int[][] iArr) {
        int i = 0;
        for (int i2 = 0; i2 != iArr.length; i2++) {
            i = (i * 257) + OooO00o(iArr[i2]);
        }
        return i;
    }

    public static int OooO00o(short[][] sArr) {
        int i = 0;
        for (int i2 = 0; i2 != sArr.length; i2++) {
            i = (i * 257) + OooO00o(sArr[i2]);
        }
        return i;
    }

    public static int OooO00o(short[][][] sArr) {
        int i = 0;
        for (int i2 = 0; i2 != sArr.length; i2++) {
            i = (i * 257) + OooO00o(sArr[i2]);
        }
        return i;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m21625OooO00o(byte[] bArr) {
        if (bArr != null) {
            for (int i = 0; i < bArr.length; i++) {
                bArr[i] = 0;
            }
        }
    }

    public static void OooO00o(byte[] bArr, byte b) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = b;
        }
    }

    public static void OooO00o(byte[] bArr, int i, byte b) {
        if (i < bArr.length) {
            while (i < bArr.length) {
                bArr[i] = b;
                i++;
            }
        }
    }

    public static void OooO00o(char[] cArr, char c) {
        for (int i = 0; i < cArr.length; i++) {
            cArr[i] = c;
        }
    }

    public static void OooO00o(int[] iArr, int i) {
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = i;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m21626OooO00o(int[] iArr, int i, int i2) {
        if (i < iArr.length) {
            while (i < iArr.length) {
                iArr[i] = i2;
                i++;
            }
        }
    }

    public static void OooO00o(long[] jArr, int i, long j) {
        if (i < jArr.length) {
            while (i < jArr.length) {
                jArr[i] = j;
                i++;
            }
        }
    }

    public static void OooO00o(long[] jArr, long j) {
        for (int i = 0; i < jArr.length; i++) {
            jArr[i] = j;
        }
    }

    public static void OooO00o(short[] sArr, int i, short s) {
        if (i < sArr.length) {
            while (i < sArr.length) {
                sArr[i] = s;
                i++;
            }
        }
    }

    public static void OooO00o(short[] sArr, short s) {
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = s;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m21627OooO00o(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i != bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean OooO00o(char[] cArr, char[] cArr2) {
        if (cArr == cArr2) {
            return true;
        }
        if (cArr == null || cArr2 == null || cArr.length != cArr2.length) {
            return false;
        }
        for (int i = 0; i != cArr.length; i++) {
            if (cArr[i] != cArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m21628OooO00o(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static boolean OooO00o(int[] iArr, int[] iArr2) {
        if (iArr == iArr2) {
            return true;
        }
        if (iArr == null || iArr2 == null || iArr.length != iArr2.length) {
            return false;
        }
        for (int i = 0; i != iArr.length; i++) {
            if (iArr[i] != iArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean OooO00o(long[] jArr, long[] jArr2) {
        if (jArr == jArr2) {
            return true;
        }
        if (jArr == null || jArr2 == null || jArr.length != jArr2.length) {
            return false;
        }
        for (int i = 0; i != jArr.length; i++) {
            if (jArr[i] != jArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean OooO00o(Object[] objArr, Object[] objArr2) {
        if (objArr == objArr2) {
            return true;
        }
        if (objArr == null || objArr2 == null || objArr.length != objArr2.length) {
            return false;
        }
        for (int i = 0; i != objArr.length; i++) {
            Object obj = objArr[i];
            Object obj2 = objArr2[i];
            if (obj == null) {
                if (obj2 != null) {
                    return false;
                }
            } else if (!obj.equals(obj2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m21629OooO00o(short[] sArr, short s) {
        for (short s2 : sArr) {
            if (s2 == s) {
                return true;
            }
        }
        return false;
    }

    public static boolean OooO00o(short[] sArr, short[] sArr2) {
        if (sArr == sArr2) {
            return true;
        }
        if (sArr == null || sArr2 == null || sArr.length != sArr2.length) {
            return false;
        }
        for (int i = 0; i != sArr.length; i++) {
            if (sArr[i] != sArr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static boolean OooO00o(boolean[] zArr, boolean[] zArr2) {
        if (zArr == zArr2) {
            return true;
        }
        if (zArr == null || zArr2 == null || zArr.length != zArr2.length) {
            return false;
        }
        for (int i = 0; i != zArr.length; i++) {
            if (zArr[i] != zArr2[i]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m21630OooO00o(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArr2 = new byte[bArr.length];
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m21631OooO00o(byte[] bArr, byte b) {
        if (bArr == null) {
            return new byte[]{b};
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[(length + 1)];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        bArr2[length] = b;
        return bArr2;
    }

    public static byte[] OooO00o(byte[] bArr, int i) {
        byte[] bArr2 = new byte[i];
        if (i >= bArr.length) {
            i = bArr.length;
        }
        System.arraycopy(bArr, 0, bArr2, 0, i);
        return bArr2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m21632OooO00o(byte[] bArr, int i, int i2) {
        int OooO00o2 = OooO00o(i, i2);
        byte[] bArr2 = new byte[OooO00o2];
        if (bArr.length - i < OooO00o2) {
            OooO00o2 = bArr.length - i;
        }
        System.arraycopy(bArr, i, bArr2, 0, OooO00o2);
        return bArr2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m21633OooO00o(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return null;
        }
        if (bArr2 == null || bArr2.length != bArr.length) {
            return m21630OooO00o(bArr);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr2.length);
        return bArr2;
    }

    public static byte[] OooO00o(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        if (bArr == null || bArr2 == null || bArr3 == null) {
            return bArr == null ? m21645OooO0O0(bArr2, bArr3) : bArr2 == null ? m21645OooO0O0(bArr, bArr3) : m21645OooO0O0(bArr, bArr2);
        }
        byte[] bArr4 = new byte[(bArr.length + bArr2.length + bArr3.length)];
        System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr4, bArr.length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr4, bArr.length + bArr2.length, bArr3.length);
        return bArr4;
    }

    public static byte[] OooO00o(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4) {
        if (bArr == null || bArr2 == null || bArr3 == null || bArr4 == null) {
            return bArr4 == null ? OooO00o(bArr, bArr2, bArr3) : bArr3 == null ? OooO00o(bArr, bArr2, bArr4) : bArr2 == null ? OooO00o(bArr, bArr3, bArr4) : OooO00o(bArr2, bArr3, bArr4);
        }
        byte[] bArr5 = new byte[(bArr.length + bArr2.length + bArr3.length + bArr4.length)];
        System.arraycopy(bArr, 0, bArr5, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr5, bArr.length, bArr2.length);
        System.arraycopy(bArr3, 0, bArr5, bArr.length + bArr2.length, bArr3.length);
        System.arraycopy(bArr4, 0, bArr5, bArr.length + bArr2.length + bArr3.length, bArr4.length);
        return bArr5;
    }

    public static byte[] OooO00o(byte[][] bArr) {
        int i = 0;
        for (int i2 = 0; i2 != bArr.length; i2++) {
            i += bArr[i2].length;
        }
        byte[] bArr2 = new byte[i];
        int i3 = 0;
        for (int i4 = 0; i4 != bArr.length; i4++) {
            System.arraycopy(bArr[i4], 0, bArr2, i3, bArr[i4].length);
            i3 += bArr[i4].length;
        }
        return bArr2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static char[] m21634OooO00o(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        char[] cArr2 = new char[cArr.length];
        System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
        return cArr2;
    }

    public static char[] OooO00o(char[] cArr, int i) {
        char[] cArr2 = new char[i];
        if (i >= cArr.length) {
            i = cArr.length;
        }
        System.arraycopy(cArr, 0, cArr2, 0, i);
        return cArr2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int[] m21635OooO00o(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int[] iArr2 = new int[iArr.length];
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int[] m21636OooO00o(int[] iArr, int i) {
        if (iArr == null) {
            return new int[]{i};
        }
        int length = iArr.length;
        int[] iArr2 = new int[(length + 1)];
        System.arraycopy(iArr, 0, iArr2, 0, length);
        iArr2[length] = i;
        return iArr2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int[] m21637OooO00o(int[] iArr, int i, int i2) {
        int OooO00o2 = OooO00o(i, i2);
        int[] iArr2 = new int[OooO00o2];
        if (iArr.length - i < OooO00o2) {
            OooO00o2 = iArr.length - i;
        }
        System.arraycopy(iArr, i, iArr2, 0, OooO00o2);
        return iArr2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static int[] m21638OooO00o(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return m21635OooO00o(iArr2);
        }
        if (iArr2 == null) {
            return m21635OooO00o(iArr);
        }
        int[] iArr3 = new int[(iArr.length + iArr2.length)];
        System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
        return iArr3;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long[] m21639OooO00o(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        long[] jArr2 = new long[jArr.length];
        System.arraycopy(jArr, 0, jArr2, 0, jArr.length);
        return jArr2;
    }

    public static long[] OooO00o(long[] jArr, int i) {
        long[] jArr2 = new long[i];
        if (i >= jArr.length) {
            i = jArr.length;
        }
        System.arraycopy(jArr, 0, jArr2, 0, i);
        return jArr2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long[] m21640OooO00o(long[] jArr, int i, int i2) {
        int OooO00o2 = OooO00o(i, i2);
        long[] jArr2 = new long[OooO00o2];
        if (jArr.length - i < OooO00o2) {
            OooO00o2 = jArr.length - i;
        }
        System.arraycopy(jArr, i, jArr2, 0, OooO00o2);
        return jArr2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long[] m21641OooO00o(long[] jArr, long[] jArr2) {
        if (jArr == null) {
            return null;
        }
        if (jArr2 == null || jArr2.length != jArr.length) {
            return m21639OooO00o(jArr);
        }
        System.arraycopy(jArr, 0, jArr2, 0, jArr2.length);
        return jArr2;
    }

    public static String[] OooO00o(String[] strArr, String str) {
        if (strArr == null) {
            return new String[]{str};
        }
        int length = strArr.length;
        String[] strArr2 = new String[(length + 1)];
        System.arraycopy(strArr, 0, strArr2, 0, length);
        strArr2[length] = str;
        return strArr2;
    }

    public static BigInteger[] OooO00o(BigInteger[] bigIntegerArr) {
        if (bigIntegerArr == null) {
            return null;
        }
        BigInteger[] bigIntegerArr2 = new BigInteger[bigIntegerArr.length];
        System.arraycopy(bigIntegerArr, 0, bigIntegerArr2, 0, bigIntegerArr.length);
        return bigIntegerArr2;
    }

    public static BigInteger[] OooO00o(BigInteger[] bigIntegerArr, int i) {
        BigInteger[] bigIntegerArr2 = new BigInteger[i];
        if (i >= bigIntegerArr.length) {
            i = bigIntegerArr.length;
        }
        System.arraycopy(bigIntegerArr, 0, bigIntegerArr2, 0, i);
        return bigIntegerArr2;
    }

    public static BigInteger[] OooO00o(BigInteger[] bigIntegerArr, int i, int i2) {
        int OooO00o2 = OooO00o(i, i2);
        BigInteger[] bigIntegerArr2 = new BigInteger[OooO00o2];
        if (bigIntegerArr.length - i < OooO00o2) {
            OooO00o2 = bigIntegerArr.length - i;
        }
        System.arraycopy(bigIntegerArr, i, bigIntegerArr2, 0, OooO00o2);
        return bigIntegerArr2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static short[] m21642OooO00o(short[] sArr) {
        if (sArr == null) {
            return null;
        }
        short[] sArr2 = new short[sArr.length];
        System.arraycopy(sArr, 0, sArr2, 0, sArr.length);
        return sArr2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static short[] m21643OooO00o(short[] sArr, short s) {
        if (sArr == null) {
            return new short[]{s};
        }
        int length = sArr.length;
        short[] sArr2 = new short[(length + 1)];
        System.arraycopy(sArr, 0, sArr2, 0, length);
        sArr2[length] = s;
        return sArr2;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[][] m21644OooO00o(byte[][] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[][] bArr2 = new byte[length][];
        for (int i = 0; i != length; i++) {
            bArr2[i] = m21630OooO00o(bArr[i]);
        }
        return bArr2;
    }

    public static byte[][][] OooO00o(byte[][][] bArr) {
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[][][] bArr2 = new byte[length][][];
        for (int i = 0; i != length; i++) {
            bArr2[i] = m21644OooO00o(bArr[i]);
        }
        return bArr2;
    }

    public static boolean OooO0O0(byte[] bArr, byte[] bArr2) {
        if (bArr == bArr2) {
            return true;
        }
        if (bArr == null || bArr2 == null) {
            return false;
        }
        if (bArr.length != bArr2.length) {
            return !OooO0O0(bArr, bArr);
        }
        int i = 0;
        for (int i2 = 0; i2 != bArr.length; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        return i == 0;
    }

    public static byte[] OooO0O0(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        int i = 0;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        while (true) {
            length--;
            if (length < 0) {
                return bArr2;
            }
            bArr2[length] = bArr[i];
            i++;
        }
    }

    public static byte[] OooO0O0(byte[] bArr, byte b) {
        if (bArr == null) {
            return new byte[]{b};
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[(length + 1)];
        System.arraycopy(bArr, 0, bArr2, 1, length);
        bArr2[0] = b;
        return bArr2;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static byte[] m21645OooO0O0(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null) {
            return bArr2 != null ? m21630OooO00o(bArr2) : m21630OooO00o(bArr);
        }
        byte[] bArr3 = new byte[(bArr.length + bArr2.length)];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public static int[] OooO0O0(int[] iArr) {
        if (iArr == null) {
            return null;
        }
        int i = 0;
        int length = iArr.length;
        int[] iArr2 = new int[length];
        while (true) {
            length--;
            if (length < 0) {
                return iArr2;
            }
            iArr2[length] = iArr[i];
            i++;
        }
    }

    public static int[] OooO0O0(int[] iArr, int i) {
        int[] iArr2 = new int[i];
        if (i >= iArr.length) {
            i = iArr.length;
        }
        System.arraycopy(iArr, 0, iArr2, 0, i);
        return iArr2;
    }

    public static short[] OooO0O0(short[] sArr, short s) {
        if (sArr == null) {
            return new short[]{s};
        }
        int length = sArr.length;
        short[] sArr2 = new short[(length + 1)];
        System.arraycopy(sArr, 0, sArr2, 1, length);
        sArr2[0] = s;
        return sArr2;
    }

    public static int[] OooO0OO(int[] iArr, int i) {
        if (iArr == null) {
            return new int[]{i};
        }
        int length = iArr.length;
        int[] iArr2 = new int[(length + 1)];
        System.arraycopy(iArr, 0, iArr2, 1, length);
        iArr2[0] = i;
        return iArr2;
    }
}
