package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.bouncycastle.asn1.ASN1Exception;
import org.bouncycastle.cert.CertIOException;
import org.bouncycastle.cert.ocsp.OCSPException;

/* renamed from: com.pd.sdk.III丨丨  reason: invalid class name and case insensitive filesystem */
public class C5198III {
    public static final int OooO00o = 0;
    public static final int OooO0O0 = 1;
    public static final int OooO0OO = 2;
    public static final int OooO0Oo = 3;
    public static final int OooO0o = 6;
    public static final int OooO0o0 = 5;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6682liLi f15469OooO00o;

    public C5198III(C5805Ll1 r4) throws IOException {
        try {
            C6682liLi OooO00o2 = C6682liLi.OooO00o(r4.OooO00o());
            this.f15469OooO00o = OooO00o2;
            if (OooO00o2 == null) {
                throw new CertIOException("malformed response: no response data found");
            }
        } catch (IllegalArgumentException e) {
            throw new CertIOException("malformed response: " + e.getMessage(), e);
        } catch (ClassCastException e2) {
            throw new CertIOException("malformed response: " + e2.getMessage(), e2);
        } catch (ASN1Exception e3) {
            throw new CertIOException("malformed response: " + e3.getMessage(), e3);
        }
    }

    public C5198III(C6682liLi r1) {
        this.f15469OooO00o = r1;
    }

    public C5198III(InputStream inputStream) throws IOException {
        this(new C5805Ll1(inputStream));
    }

    public C5198III(byte[] bArr) throws IOException {
        this(new ByteArrayInputStream(bArr));
    }

    public int OooO00o() {
        return this.f15469OooO00o.m17758OooO00o().OooO00o().intValue();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6682liLi m15372OooO00o() {
        return this.f15469OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Object m15373OooO00o() throws OCSPException {
        C9505LiL OooO00o2 = this.f15469OooO00o.OooO00o();
        if (OooO00o2 == null) {
            return null;
        }
        if (!OooO00o2.OooO00o().equals(AbstractC6085iIIlIIL.OooO0O0)) {
            return OooO00o2.m21570OooO00o();
        }
        try {
            return new C6685lii111(I1IL.OooO00o(AbstractC6122iIlLiL.OooO00o(OooO00o2.m21570OooO00o().m17938OooO00o())));
        } catch (Exception e) {
            throw new OCSPException("problem decoding object: " + e, e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15374OooO00o() throws IOException {
        return this.f15469OooO00o.getEncoded();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C5198III)) {
            return false;
        }
        return this.f15469OooO00o.equals(((C5198III) obj).f15469OooO00o);
    }

    public int hashCode() {
        return this.f15469OooO00o.hashCode();
    }
}
