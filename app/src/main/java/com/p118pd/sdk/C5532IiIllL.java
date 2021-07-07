package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.ObjectStreamClass;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.pd.sdk.I丨iIllL  reason: invalid class name and case insensitive filesystem */
public class C5532IiIllL {

    /* renamed from: com.pd.sdk.I丨iIllL$OooO00o */
    public static class OooO00o extends ObjectInputStream {
        public static final Set OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final Class f16043OooO00o;
        public boolean OooO0O0 = false;

        static {
            HashSet hashSet = new HashSet();
            OooO00o = hashSet;
            hashSet.add("java.util.TreeMap");
            OooO00o.add("java.lang.Integer");
            OooO00o.add("java.lang.Number");
            OooO00o.add("org.bouncycastle.pqc.crypto.xmss.BDS");
            OooO00o.add("java.util.ArrayList");
            OooO00o.add("org.bouncycastle.pqc.crypto.xmss.XMSSNode");
            OooO00o.add("[B");
            OooO00o.add("java.util.LinkedList");
            OooO00o.add("java.util.Stack");
            OooO00o.add("java.util.Vector");
            OooO00o.add("[Ljava.lang.Object;");
            OooO00o.add("org.bouncycastle.pqc.crypto.xmss.BDSTreeHash");
        }

        public OooO00o(Class cls, InputStream inputStream) throws IOException {
            super(inputStream);
            this.f16043OooO00o = cls;
        }

        @Override // java.io.ObjectInputStream
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            if (!this.OooO0O0) {
                if (objectStreamClass.getName().equals(this.f16043OooO00o.getName())) {
                    this.OooO0O0 = true;
                } else {
                    throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
                }
            } else if (!OooO00o.contains(objectStreamClass.getName())) {
                throw new InvalidClassException("unexpected class: ", objectStreamClass.getName());
            }
            return super.resolveClass(objectStreamClass);
        }
    }

    public static int OooO00o(int i) {
        int i2 = 0;
        while (true) {
            i >>= 1;
            if (i == 0) {
                return i2;
            }
            i2++;
        }
    }

    public static int OooO00o(int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            if (((i >> i3) & 1) == 0) {
                return i3;
            }
        }
        return 0;
    }

    public static int OooO00o(long j, int i) {
        return (int) (j & ((1 << i) - 1));
    }

    public static int OooO00o(AbstractC6436l11LI r2) {
        if (r2 != null) {
            String OooO00o2 = r2.OooO00o();
            if (OooO00o2.equals("SHAKE128")) {
                return 32;
            }
            if (OooO00o2.equals("SHAKE256")) {
                return 64;
            }
            return r2.OooO0O0();
        }
        throw new NullPointerException("digest == null");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static long m15804OooO00o(long j, int i) {
        return j >> i;
    }

    public static long OooO00o(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            long j = 0;
            for (int i3 = i; i3 < i + i2; i3++) {
                j = (j << 8) | ((long) (bArr[i3] & 255));
            }
            return j;
        }
        throw new NullPointerException("in == null");
    }

    public static Object OooO00o(byte[] bArr, Class cls) throws IOException, ClassNotFoundException {
        OooO00o oooO00o = new OooO00o(cls, new ByteArrayInputStream(bArr));
        Object readObject = oooO00o.readObject();
        if (oooO00o.available() != 0) {
            throw new IOException("unexpected data found at end of ObjectInputStream");
        } else if (cls.isInstance(readObject)) {
            return readObject;
        } else {
            throw new IOException("unexpected class found in ObjectInputStream");
        }
    }

    public static void OooO00o(long j, byte[] bArr, int i) {
        if (bArr == null) {
            throw new NullPointerException("in == null");
        } else if (bArr.length - i >= 8) {
            bArr[i] = (byte) ((int) ((j >> 56) & 255));
            bArr[i + 1] = (byte) ((int) ((j >> 48) & 255));
            bArr[i + 2] = (byte) ((int) ((j >> 40) & 255));
            bArr[i + 3] = (byte) ((int) ((j >> 32) & 255));
            bArr[i + 4] = (byte) ((int) ((j >> 24) & 255));
            bArr[i + 5] = (byte) ((int) ((j >> 16) & 255));
            bArr[i + 6] = (byte) ((int) ((j >> 8) & 255));
            bArr[i + 7] = (byte) ((int) (j & 255));
        } else {
            throw new IllegalArgumentException("not enough space in array");
        }
    }

    public static void OooO00o(byte[] bArr, byte[] bArr2, int i) {
        if (bArr == null) {
            throw new NullPointerException("dst == null");
        } else if (bArr2 == null) {
            throw new NullPointerException("src == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        } else if (bArr2.length + i <= bArr.length) {
            for (int i2 = 0; i2 < bArr2.length; i2++) {
                bArr[i + i2] = bArr2[i2];
            }
        } else {
            throw new IllegalArgumentException("src length + offset must not be greater than size of destination");
        }
    }

    public static void OooO00o(byte[][] bArr) {
        if (!m15805OooO00o(bArr)) {
            for (byte[] bArr2 : bArr) {
                System.out.println(C6472l1l1l.OooO00o(bArr2));
            }
            return;
        }
        throw new NullPointerException("x has null pointers");
    }

    public static boolean OooO00o(int i, long j) {
        if (j >= 0) {
            return j < (1 << i);
        }
        throw new IllegalStateException("index must not be negative");
    }

    public static boolean OooO00o(long j, int i, int i2) {
        return j != 0 && (j + 1) % ((long) Math.pow((double) (1 << i), (double) i2)) == 0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m15805OooO00o(byte[][] bArr) {
        if (bArr == null) {
            return true;
        }
        for (byte[] bArr2 : bArr) {
            if (bArr2 == null) {
                return true;
            }
        }
        return false;
    }

    public static boolean OooO00o(byte[][] bArr, byte[][] bArr2) {
        if (m15805OooO00o(bArr) || m15805OooO00o(bArr2)) {
            throw new NullPointerException("a or b == null");
        }
        for (int i = 0; i < bArr.length; i++) {
            if (!C9586iIILl.m21627OooO00o(bArr[i], bArr2[i])) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m15806OooO00o(long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = i - 1; i2 >= 0; i2--) {
            bArr[i2] = (byte) ((int) j);
            j >>>= 8;
        }
        return bArr;
    }

    public static byte[] OooO00o(Object obj) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(obj);
        objectOutputStream.flush();
        return byteArrayOutputStream.toByteArray();
    }

    public static byte[] OooO00o(byte[] bArr) {
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        throw new NullPointerException("in == null");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[] m15807OooO00o(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("src == null");
        } else if (i < 0) {
            throw new IllegalArgumentException("offset hast to be >= 0");
        } else if (i2 < 0) {
            throw new IllegalArgumentException("length hast to be >= 0");
        } else if (i + i2 <= bArr.length) {
            byte[] bArr2 = new byte[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                bArr2[i3] = bArr[i + i3];
            }
            return bArr2;
        } else {
            throw new IllegalArgumentException("offset + length must not be greater then size of source array");
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static byte[][] m15808OooO00o(byte[][] bArr) {
        if (!m15805OooO00o(bArr)) {
            byte[][] bArr2 = new byte[bArr.length][];
            for (int i = 0; i < bArr.length; i++) {
                bArr2[i] = new byte[bArr[i].length];
                System.arraycopy(bArr[i], 0, bArr2[i], 0, bArr[i].length);
            }
            return bArr2;
        }
        throw new NullPointerException("in has null pointers");
    }

    public static boolean OooO0O0(long j, int i, int i2) {
        return j != 0 && j % ((long) Math.pow((double) (1 << i), (double) (i2 + 1))) == 0;
    }
}
