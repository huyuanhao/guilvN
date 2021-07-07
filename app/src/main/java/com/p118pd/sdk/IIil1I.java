package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import org.bouncycastle.asn1.ASN1ParsingException;
import org.bouncycastle.eac.EACException;
import org.bouncycastle.eac.EACIOException;

/* renamed from: com.pd.sdk.IIil1I */
public class IIil1I {
    public C1703I OooO00o;

    public IIil1I(C1703I r1) {
        this.OooO00o = r1;
    }

    public IIil1I(byte[] bArr) throws IOException {
        this(OooO00o(bArr));
    }

    public static C1703I OooO00o(byte[] bArr) throws IOException {
        try {
            return C1703I.OooO00o(bArr);
        } catch (ClassCastException e) {
            throw new EACIOException("malformed data: " + e.getMessage(), e);
        } catch (IllegalArgumentException e2) {
            throw new EACIOException("malformed data: " + e2.getMessage(), e2);
        } catch (ASN1ParsingException e3) {
            if (e3.getCause() instanceof IOException) {
                throw ((IOException) e3.getCause());
            }
            throw new EACIOException("malformed data: " + e3.getMessage(), e3);
        }
    }

    public C1703I OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9710lilli m15385OooO00o() {
        return this.OooO00o.OooO00o().m15252OooO00o();
    }

    public boolean OooO00o(LLII1 r4) throws EACException {
        try {
            OutputStream OooO00o2 = r4.m16254OooO00o();
            OooO00o2.write(this.OooO00o.OooO00o().OooO00o(AbstractC5533IiL.OooO00o));
            OooO00o2.close();
            return r4.verify(this.OooO00o.m21366OooO00o());
        } catch (Exception e) {
            throw new EACException("unable to process signature: " + e.getMessage(), e);
        }
    }
}
