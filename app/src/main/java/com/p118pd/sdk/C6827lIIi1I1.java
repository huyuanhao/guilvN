package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

/* renamed from: com.pd.sdk.l丨IIi1I1  reason: invalid class name and case insensitive filesystem */
public class C6827lIIi1I1 {
    public static final C6827lIIi1I1 OooO00o = new C6827lIIi1I1(new LilIiIl[0]);

    /* renamed from: OooO00o  reason: collision with other field name */
    public LilIiIl[] f18876OooO00o;

    public C6827lIIi1I1(LilIiIl[] lilIiIlArr) {
        if (lilIiIlArr != null) {
            this.f18876OooO00o = lilIiIlArr;
            return;
        }
        throw new IllegalArgumentException("'certificateList' cannot be null");
    }

    public static C6827lIIi1I1 OooO00o(InputStream inputStream) throws IOException {
        int OooO0O0 = L1LL1Ii.OooO0O0(inputStream);
        if (OooO0O0 == 0) {
            return OooO00o;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(L1LL1Ii.OooO0O0(OooO0O0, inputStream));
        Vector vector = new Vector();
        while (byteArrayInputStream.available() > 0) {
            vector.addElement(LilIiIl.OooO00o(L1LL1Ii.OooO00o(L1LL1Ii.m15942OooO0O0((InputStream) byteArrayInputStream))));
        }
        LilIiIl[] lilIiIlArr = new LilIiIl[vector.size()];
        for (int i = 0; i < vector.size(); i++) {
            lilIiIlArr[i] = (LilIiIl) vector.elementAt(i);
        }
        return new C6827lIIi1I1(lilIiIlArr);
    }

    public int OooO00o() {
        return this.f18876OooO00o.length;
    }

    public LilIiIl OooO00o(int i) {
        return this.f18876OooO00o[i];
    }

    public void OooO00o(OutputStream outputStream) throws IOException {
        Vector vector = new Vector(this.f18876OooO00o.length);
        int i = 0;
        int i2 = 0;
        while (true) {
            LilIiIl[] lilIiIlArr = this.f18876OooO00o;
            if (i >= lilIiIlArr.length) {
                break;
            }
            byte[] OooO00o2 = lilIiIlArr[i].OooO00o(AbstractC5533IiL.OooO00o);
            vector.addElement(OooO00o2);
            i2 += OooO00o2.length + 3;
            i++;
        }
        L1LL1Ii.m15939OooO0O0(i2);
        L1LL1Ii.OooO0O0(i2, outputStream);
        for (int i3 = 0; i3 < vector.size(); i3++) {
            L1LL1Ii.OooO0O0((byte[]) vector.elementAt(i3), outputStream);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17955OooO00o() {
        return this.f18876OooO00o.length == 0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LilIiIl[] m17956OooO00o() {
        LilIiIl[] lilIiIlArr = this.f18876OooO00o;
        int length = lilIiIlArr.length;
        LilIiIl[] lilIiIlArr2 = new LilIiIl[length];
        System.arraycopy(lilIiIlArr, 0, lilIiIlArr2, 0, length);
        return lilIiIlArr2;
    }

    public LilIiIl[] OooO0O0() {
        return m17956OooO00o();
    }
}
