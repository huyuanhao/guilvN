package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

/* renamed from: com.pd.sdk.lIlLiI  reason: case insensitive filesystem */
public class C6519lIlLiI {
    public iI11IL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Vector f18403OooO00o;

    public C6519lIlLiI(Vector vector, iI11IL r2) {
        this.f18403OooO00o = vector;
        this.OooO00o = r2;
    }

    public static C6519lIlLiI OooO00o(InputStream inputStream) throws IOException {
        Vector vector = new Vector();
        int OooO00o2 = L1LL1Ii.OooO00o(inputStream);
        if (OooO00o2 > 0) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(L1LL1Ii.OooO0O0(OooO00o2, inputStream));
            do {
                vector.addElement(C1II.OooO00o(L1LL1Ii.OooO0O0(L1LL1Ii.m15931OooO00o((InputStream) byteArrayInputStream))));
            } while (byteArrayInputStream.available() > 0);
        }
        iI11IL r1 = null;
        int OooO00o3 = L1LL1Ii.OooO00o(inputStream);
        if (OooO00o3 > 0) {
            r1 = iI11IL.OooO00o(L1LL1Ii.OooO0O0(L1LL1Ii.OooO0O0(OooO00o3, inputStream)));
        }
        return new C6519lIlLiI(vector, r1);
    }

    public iI11IL OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Vector m17648OooO00o() {
        return this.f18403OooO00o;
    }

    public void OooO00o(OutputStream outputStream) throws IOException {
        Vector vector = this.f18403OooO00o;
        if (vector == null || vector.isEmpty()) {
            L1LL1Ii.OooO00o(0, outputStream);
        } else {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            for (int i = 0; i < this.f18403OooO00o.size(); i++) {
                L1LL1Ii.OooO00o(((C1II) this.f18403OooO00o.elementAt(i)).OooO00o(AbstractC5533IiL.OooO00o), (OutputStream) byteArrayOutputStream);
            }
            L1LL1Ii.m15925OooO00o(byteArrayOutputStream.size());
            L1LL1Ii.OooO00o(byteArrayOutputStream.size(), outputStream);
            C6304ilIi1.OooO00o(byteArrayOutputStream, outputStream);
        }
        iI11IL r0 = this.OooO00o;
        if (r0 == null) {
            L1LL1Ii.OooO00o(0, outputStream);
            return;
        }
        byte[] OooO00o2 = r0.OooO00o(AbstractC5533IiL.OooO00o);
        L1LL1Ii.m15925OooO00o(OooO00o2.length);
        L1LL1Ii.OooO00o(OooO00o2.length, outputStream);
        outputStream.write(OooO00o2);
    }
}
