package com.p118pd.sdk;

import java.util.Enumeration;
import java.util.Vector;

/* renamed from: com.pd.sdk.丨I1LL丨i  reason: invalid class name and case insensitive filesystem */
public class C9339I1LLi {
    public static I1I1LIl[] OooO00o(I1I1LIl[] r3) {
        if (r3 == null) {
            return null;
        }
        I1I1LIl[] r0 = new I1I1LIl[r3.length];
        System.arraycopy(r3, 0, r0, 0, r3.length);
        return r0;
    }

    public static C6206iLL[] OooO00o(C6206iLL[] r3) {
        if (r3 == null) {
            return null;
        }
        C6206iLL[] r0 = new C6206iLL[r3.length];
        System.arraycopy(r3, 0, r0, 0, r3.length);
        return r0;
    }

    public static iil1iLIl[] OooO00o(iil1iLIl[] iil1ililArr) {
        if (iil1ililArr == null) {
            return null;
        }
        iil1iLIl[] iil1ililArr2 = new iil1iLIl[iil1ililArr.length];
        System.arraycopy(iil1ililArr, 0, iil1ililArr2, 0, iil1ililArr.length);
        return iil1ililArr2;
    }

    public static C9356IIlL[] OooO00o(C9356IIlL[] r3) {
        if (r3 == null) {
            return null;
        }
        C9356IIlL[] r0 = new C9356IIlL[r3.length];
        System.arraycopy(r3, 0, r0, 0, r3.length);
        return r0;
    }

    public static Vector[] OooO00o(Vector[] vectorArr) {
        if (vectorArr == null) {
            return null;
        }
        Vector[] vectorArr2 = new Vector[vectorArr.length];
        for (int i = 0; i != vectorArr.length; i++) {
            vectorArr2[i] = new Vector();
            Enumeration elements = vectorArr[i].elements();
            while (elements.hasMoreElements()) {
                vectorArr2[i].addElement(elements.nextElement());
            }
        }
        return vectorArr2;
    }

    public static byte[][] OooO00o(byte[][] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[][] bArr2 = new byte[bArr.length][];
        for (int i = 0; i != bArr.length; i++) {
            bArr2[i] = C9586iIILl.m21630OooO00o(bArr[i]);
        }
        return bArr2;
    }

    public static I1I1LIl[][] OooO00o(I1I1LIl[][] r3) {
        if (r3 == null) {
            return null;
        }
        I1I1LIl[][] r0 = new I1I1LIl[r3.length][];
        for (int i = 0; i != r3.length; i++) {
            r0[i] = OooO00o(r3[i]);
        }
        return r0;
    }

    public static Vector[][] OooO00o(Vector[][] vectorArr) {
        if (vectorArr == null) {
            return null;
        }
        Vector[][] vectorArr2 = new Vector[vectorArr.length][];
        for (int i = 0; i != vectorArr.length; i++) {
            vectorArr2[i] = OooO00o(vectorArr[i]);
        }
        return vectorArr2;
    }

    public static byte[][][] OooO00o(byte[][][] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[][][] bArr2 = new byte[bArr.length][][];
        for (int i = 0; i != bArr.length; i++) {
            bArr2[i] = OooO00o(bArr[i]);
        }
        return bArr2;
    }
}
