package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

/* renamed from: com.pd.sdk.lilLi丨i1  reason: invalid class name */
public class lilLii1 {
    public Vector OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public short[] f18643OooO00o;
    public Vector OooO0O0;

    public lilLii1(short[] sArr, Vector vector, Vector vector2) {
        this.f18643OooO00o = sArr;
        this.OooO00o = vector;
        this.OooO0O0 = vector2;
    }

    public static lilLii1 OooO00o(iL1liI il1lii, InputStream inputStream) throws IOException {
        int OooO00o2 = L1LL1Ii.m15923OooO00o(inputStream);
        short[] sArr = new short[OooO00o2];
        for (int i = 0; i < OooO00o2; i++) {
            sArr[i] = L1LL1Ii.m15923OooO00o(inputStream);
        }
        Vector vector = null;
        if (L1LL1Ii.OooO0OO(il1lii)) {
            vector = L1LL1Ii.OooO00o(false, inputStream);
        }
        Vector vector2 = new Vector();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(L1LL1Ii.m15931OooO00o(inputStream));
        while (byteArrayInputStream.available() > 0) {
            vector2.addElement(l1LILI1.OooO00o(L1LL1Ii.OooO0O0(L1LL1Ii.m15931OooO00o((InputStream) byteArrayInputStream))));
        }
        return new lilLii1(sArr, vector, vector2);
    }

    public Vector OooO00o() {
        return this.OooO0O0;
    }

    public void OooO00o(OutputStream outputStream) throws IOException {
        short[] sArr = this.f18643OooO00o;
        if (sArr == null || sArr.length == 0) {
            L1LL1Ii.OooO0OO(0, outputStream);
        } else {
            L1LL1Ii.OooO0O0(sArr, outputStream);
        }
        Vector vector = this.OooO00o;
        if (vector != null) {
            L1LL1Ii.OooO00o(vector, false, outputStream);
        }
        Vector vector2 = this.OooO0O0;
        if (vector2 == null || vector2.isEmpty()) {
            L1LL1Ii.OooO00o(0, outputStream);
            return;
        }
        Vector vector3 = new Vector(this.OooO0O0.size());
        int i = 0;
        for (int i2 = 0; i2 < this.OooO0O0.size(); i2++) {
            byte[] OooO00o2 = ((l1LILI1) this.OooO0O0.elementAt(i2)).OooO00o(AbstractC5533IiL.OooO00o);
            vector3.addElement(OooO00o2);
            i += OooO00o2.length + 2;
        }
        L1LL1Ii.m15925OooO00o(i);
        L1LL1Ii.OooO00o(i, outputStream);
        for (int i3 = 0; i3 < vector3.size(); i3++) {
            L1LL1Ii.OooO00o((byte[]) vector3.elementAt(i3), outputStream);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public short[] m17791OooO00o() {
        return this.f18643OooO00o;
    }

    public Vector OooO0O0() {
        return this.OooO00o;
    }
}
