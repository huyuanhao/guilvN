package com.p118pd.sdk;

import java.io.IOException;
import java.util.Enumeration;
import org.bouncycastle.asn1.ASN1ParsingException;

/* renamed from: com.pd.sdk.Li1丨IL1  reason: invalid class name */
public class Li1IL1 implements Enumeration {
    public C5805Ll1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Object f16579OooO00o = OooO00o();

    public Li1IL1(byte[] bArr) {
        this.OooO00o = new C5805Ll1(bArr, true);
    }

    private Object OooO00o() {
        try {
            return this.OooO00o.OooO00o();
        } catch (IOException e) {
            throw new ASN1ParsingException("malformed DER construction: " + e, e);
        }
    }

    public boolean hasMoreElements() {
        return this.f16579OooO00o != null;
    }

    @Override // java.util.Enumeration
    public Object nextElement() {
        Object obj = this.f16579OooO00o;
        this.f16579OooO00o = OooO00o();
        return obj;
    }
}
