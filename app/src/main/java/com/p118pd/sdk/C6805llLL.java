package com.p118pd.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.ll丨LL  reason: invalid class name and case insensitive filesystem */
public class C6805llLL {
    public C5464IlilIi OooO00o;

    public C6805llLL(C5464IlilIi r1) {
        this.OooO00o = r1;
    }

    public C6805llLL(byte[] bArr) {
        this(C5464IlilIi.OooO00o(bArr));
    }

    public C5245IIi OooO00o(AbstractC5650LIL r4) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            OutputStream OooO00o2 = r4.OooO00o(byteArrayOutputStream);
            OooO00o2.write(this.OooO00o.getEncoded());
            OooO00o2.close();
            return new C5245IIi(new C6845lLIL(r4.m16163OooO00o(), byteArrayOutputStream.toByteArray()));
        } catch (IOException unused) {
            throw new IllegalStateException("cannot encode privateKeyInfo");
        }
    }
}
