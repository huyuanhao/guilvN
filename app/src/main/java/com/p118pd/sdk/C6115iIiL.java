package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.crypto.tls.TlsFatalAlert;

/* renamed from: com.pd.sdk.iIi丨L  reason: invalid class name and case insensitive filesystem */
public class C6115iIiL {
    public static final Integer OooO00o = I11I.OooO00o(22);
    public static final Integer OooO0O0 = I11I.OooO00o(23);
    public static final Integer OooO0OO = I11I.OooO00o(15);
    public static final Integer OooO0Oo = I11I.OooO00o(1);
    public static final Integer OooO0o = I11I.OooO00o(0);
    public static final Integer OooO0o0 = I11I.OooO00o(21);
    public static final Integer OooO0oO = I11I.OooO00o(5);
    public static final Integer OooO0oo = I11I.OooO00o(4);

    public static int OooO00o(Hashtable hashtable) throws IOException {
        byte[] OooO00o2 = L1LL1Ii.OooO00o(hashtable, OooO0o0);
        if (OooO00o2 == null) {
            return -1;
        }
        return OooO00o(OooO00o2);
    }

    public static int OooO00o(byte[] bArr) throws IOException {
        if (bArr != null) {
            for (byte b : bArr) {
                if (b != 0) {
                    throw new TlsFatalAlert(47);
                }
            }
            return bArr.length;
        }
        throw new IllegalArgumentException("'extensionData' cannot be null");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C5854LLi m16996OooO00o(Hashtable hashtable) throws IOException {
        byte[] OooO00o2 = L1LL1Ii.OooO00o(hashtable, OooO0OO);
        if (OooO00o2 == null) {
            return null;
        }
        return m16997OooO00o(OooO00o2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C5854LLi m16997OooO00o(byte[] bArr) throws IOException {
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            C5854LLi OooO00o2 = C5854LLi.OooO00o(byteArrayInputStream);
            AbstractC6892l1.OooO0O0(byteArrayInputStream);
            return OooO00o2;
        }
        throw new IllegalArgumentException("'extensionData' cannot be null");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C6641li1I m16998OooO00o(Hashtable hashtable) throws IOException {
        byte[] OooO00o2 = L1LL1Ii.OooO00o(hashtable, OooO0o);
        if (OooO00o2 == null) {
            return null;
        }
        return m16999OooO00o(OooO00o2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C6641li1I m16999OooO00o(byte[] bArr) throws IOException {
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            C6641li1I OooO00o2 = C6641li1I.OooO00o(byteArrayInputStream);
            AbstractC6892l1.OooO0O0(byteArrayInputStream);
            return OooO00o2;
        }
        throw new IllegalArgumentException("'extensionData' cannot be null");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C6856lL1i m17000OooO00o(Hashtable hashtable) throws IOException {
        byte[] OooO00o2 = L1LL1Ii.OooO00o(hashtable, OooO0oO);
        if (OooO00o2 == null) {
            return null;
        }
        return m17001OooO00o(OooO00o2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C6856lL1i m17001OooO00o(byte[] bArr) throws IOException {
        if (bArr != null) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
            C6856lL1i OooO00o2 = C6856lL1i.OooO00o(byteArrayInputStream);
            AbstractC6892l1.OooO0O0(byteArrayInputStream);
            return OooO00o2;
        }
        throw new IllegalArgumentException("'extensionData' cannot be null");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static Hashtable m17002OooO00o(Hashtable hashtable) {
        return hashtable == null ? new Hashtable() : hashtable;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static short m17003OooO00o(Hashtable hashtable) throws IOException {
        byte[] OooO00o2 = L1LL1Ii.OooO00o(hashtable, OooO0Oo);
        if (OooO00o2 == null) {
            return -1;
        }
        return m17004OooO00o(OooO00o2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static short m17004OooO00o(byte[] bArr) throws IOException {
        if (bArr == null) {
            throw new IllegalArgumentException("'extensionData' cannot be null");
        } else if (bArr.length == 1) {
            return L1LL1Ii.m15924OooO00o(bArr, 0);
        } else {
            throw new TlsFatalAlert(50);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m17005OooO00o(Hashtable hashtable) {
        hashtable.put(OooO00o, OooO0O0());
    }

    public static void OooO00o(Hashtable hashtable, int i) throws IOException {
        hashtable.put(OooO0o0, OooO00o(i));
    }

    public static void OooO00o(Hashtable hashtable, C5854LLi r2) throws IOException {
        hashtable.put(OooO0OO, OooO00o(r2));
    }

    public static void OooO00o(Hashtable hashtable, C6641li1I r2) throws IOException {
        hashtable.put(OooO0o, OooO00o(r2));
    }

    public static void OooO00o(Hashtable hashtable, C6856lL1i r2) throws IOException {
        hashtable.put(OooO0oO, OooO00o(r2));
    }

    public static void OooO00o(Hashtable hashtable, short s) throws IOException {
        hashtable.put(OooO0Oo, OooO00o(s));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m17006OooO00o(Hashtable hashtable) throws IOException {
        byte[] OooO00o2 = L1LL1Ii.OooO00o(hashtable, OooO00o);
        if (OooO00o2 == null) {
            return false;
        }
        return OooO0O0(OooO00o2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m17007OooO00o(byte[] bArr) throws IOException {
        if (bArr == null) {
            throw new IllegalArgumentException("'extensionData' cannot be null");
        } else if (bArr.length == 0) {
            return true;
        } else {
            throw new TlsFatalAlert(47);
        }
    }

    public static byte[] OooO00o() {
        return L1LL1Ii.f16174OooO00o;
    }

    public static byte[] OooO00o(int i) throws IOException {
        L1LL1Ii.m15925OooO00o(i);
        return new byte[i];
    }

    public static byte[] OooO00o(C5854LLi r1) throws IOException {
        if (r1 != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            r1.OooO00o(byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        throw new TlsFatalAlert(80);
    }

    public static byte[] OooO00o(C6641li1I r1) throws IOException {
        if (r1 != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            r1.OooO00o(byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        throw new TlsFatalAlert(80);
    }

    public static byte[] OooO00o(C6856lL1i r1) throws IOException {
        if (r1 != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            r1.OooO00o(byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        throw new TlsFatalAlert(80);
    }

    public static byte[] OooO00o(short s) throws IOException {
        L1LL1Ii.m15926OooO00o(s);
        byte[] bArr = new byte[1];
        L1LL1Ii.OooO00o(s, bArr, 0);
        return bArr;
    }

    public static void OooO0O0(Hashtable hashtable) {
        hashtable.put(OooO0O0, OooO0OO());
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public static boolean m17008OooO0O0(Hashtable hashtable) throws IOException {
        byte[] OooO00o2 = L1LL1Ii.OooO00o(hashtable, OooO0O0);
        if (OooO00o2 == null) {
            return false;
        }
        return OooO0OO(OooO00o2);
    }

    public static boolean OooO0O0(byte[] bArr) throws IOException {
        return m17007OooO00o(bArr);
    }

    public static byte[] OooO0O0() {
        return OooO00o();
    }

    public static void OooO0OO(Hashtable hashtable) {
        hashtable.put(OooO0oo, OooO0Oo());
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    public static boolean m17009OooO0OO(Hashtable hashtable) throws IOException {
        byte[] OooO00o2 = L1LL1Ii.OooO00o(hashtable, OooO0oo);
        if (OooO00o2 == null) {
            return false;
        }
        return OooO0Oo(OooO00o2);
    }

    public static boolean OooO0OO(byte[] bArr) throws IOException {
        return m17007OooO00o(bArr);
    }

    public static byte[] OooO0OO() {
        return OooO00o();
    }

    public static boolean OooO0Oo(byte[] bArr) throws IOException {
        return m17007OooO00o(bArr);
    }

    public static byte[] OooO0Oo() {
        return OooO00o();
    }
}
