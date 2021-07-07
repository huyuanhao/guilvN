package com.p118pd.sdk;

import com.p118pd.sdk.C93211ll;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Collection;
import org.bouncycastle.x509.NoSuchParserException;
import org.bouncycastle.x509.util.StreamParsingException;

/* renamed from: com.pd.sdk.iII丨  reason: invalid class name and case insensitive filesystem */
public class C6087iII implements i1iI1L {
    public AbstractC9481LIl OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Provider f17494OooO00o;

    public C6087iII(Provider provider, AbstractC9481LIl r2) {
        this.f17494OooO00o = provider;
        this.OooO00o = r2;
    }

    public static C6087iII OooO00o(C93211ll.OooO00o oooO00o) {
        return new C6087iII(oooO00o.m21357OooO00o(), (AbstractC9481LIl) oooO00o.OooO00o());
    }

    public static C6087iII OooO00o(String str) throws NoSuchParserException {
        try {
            return OooO00o(C93211ll.OooO00o("X509StreamParser", str));
        } catch (NoSuchAlgorithmException e) {
            throw new NoSuchParserException(e.getMessage());
        }
    }

    public static C6087iII OooO00o(String str, String str2) throws NoSuchParserException, NoSuchProviderException {
        return OooO00o(str, C93211ll.m21354OooO00o(str2));
    }

    public static C6087iII OooO00o(String str, Provider provider) throws NoSuchParserException {
        try {
            return OooO00o(C93211ll.OooO00o("X509StreamParser", str, provider));
        } catch (NoSuchAlgorithmException e) {
            throw new NoSuchParserException(e.getMessage());
        }
    }

    @Override // com.p118pd.sdk.i1iI1L, com.p118pd.sdk.i1iI1L
    public Object OooO00o() throws StreamParsingException {
        return this.OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.i1iI1L, com.p118pd.sdk.i1iI1L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Provider m16942OooO00o() {
        return this.f17494OooO00o;
    }

    @Override // com.p118pd.sdk.i1iI1L, com.p118pd.sdk.i1iI1L
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Collection m16943OooO00o() throws StreamParsingException {
        return this.OooO00o.m21535OooO00o();
    }

    public void OooO00o(InputStream inputStream) {
        this.OooO00o.OooO00o(inputStream);
    }

    public void OooO00o(byte[] bArr) {
        this.OooO00o.OooO00o(new ByteArrayInputStream(bArr));
    }
}
