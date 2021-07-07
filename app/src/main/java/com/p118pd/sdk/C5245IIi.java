package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.bouncycastle.pkcs.PKCSException;
import org.bouncycastle.pkcs.PKCSIOException;

/* renamed from: com.pd.sdk.II丨丨i  reason: invalid class name and case insensitive filesystem */
public class C5245IIi {
    public C6845lLIL OooO00o;

    public C5245IIi(C6845lLIL r1) {
        this.OooO00o = r1;
    }

    public C5245IIi(byte[] bArr) throws IOException {
        this(OooO00o(bArr));
    }

    public static C6845lLIL OooO00o(byte[] bArr) throws IOException {
        try {
            return C6845lLIL.OooO00o(AbstractC6122iIlLiL.OooO00o(bArr));
        } catch (ClassCastException e) {
            throw new PKCSIOException("malformed data: " + e.getMessage(), e);
        } catch (IllegalArgumentException e2) {
            throw new PKCSIOException("malformed data: " + e2.getMessage(), e2);
        }
    }

    public C5464IlilIi OooO00o(AbstractC6429iliL r4) throws PKCSException {
        try {
            return C5464IlilIi.OooO00o(C6304ilIi1.m17339OooO00o(r4.OooO00o(this.OooO00o.OooO00o()).OooO00o(new ByteArrayInputStream(this.OooO00o.m17992OooO00o()))));
        } catch (Exception e) {
            throw new PKCSException("unable to read encrypted data: " + e.getMessage(), e);
        }
    }

    public C6456l1ilL OooO00o() {
        return this.OooO00o.OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6845lLIL m15462OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15463OooO00o() throws IOException {
        return this.OooO00o.getEncoded();
    }

    public byte[] OooO0O0() {
        return this.OooO00o.m17992OooO00o();
    }
}
