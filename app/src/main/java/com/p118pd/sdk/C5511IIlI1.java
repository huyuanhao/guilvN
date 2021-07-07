package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.pd.sdk.I丨IlI丨1  reason: invalid class name and case insensitive filesystem */
public class C5511IIlI1 implements AbstractC9605iL11 {
    public C9370Ii OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Date f15989OooO00o;
    public Date OooO0O0;

    public C5511IIlI1(C9370Ii r2) throws IOException {
        this.OooO00o = r2;
        try {
            this.OooO0O0 = r2.OooO00o().m16466OooO00o().OooO00o().OooO00o();
            this.f15989OooO00o = r2.OooO00o().m16466OooO00o().m21431OooO0O0().OooO00o();
        } catch (ParseException unused) {
            throw new IOException("invalid data structure in certificate!");
        }
    }

    public C5511IIlI1(InputStream inputStream) throws IOException {
        this(OooO00o(inputStream));
    }

    public C5511IIlI1(byte[] bArr) throws IOException {
        this(new ByteArrayInputStream(bArr));
    }

    public static C9370Ii OooO00o(InputStream inputStream) throws IOException {
        try {
            return C9370Ii.OooO00o(new C5805Ll1(inputStream).OooO00o());
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException("exception decoding certificate structure: " + e2.toString());
        }
    }

    private Set OooO00o(boolean z) {
        iI11IL OooO00o2 = this.OooO00o.OooO00o().m16462OooO00o();
        if (OooO00o2 == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration OooO00o3 = OooO00o2.OooO00o();
        while (OooO00o3.hasMoreElements()) {
            LlLI1 llLI1 = (LlLI1) OooO00o3.nextElement();
            if (OooO00o2.OooO00o(llLI1).m15434OooO00o() == z) {
                hashSet.add(llLI1.m16387OooO0O0());
            }
        }
        return hashSet;
    }

    @Override // com.p118pd.sdk.AbstractC9605iL11, com.p118pd.sdk.AbstractC9605iL11, com.p118pd.sdk.AbstractC9605iL11
    public llL1LI OooO00o() {
        return new llL1LI((I11li1) this.OooO00o.OooO00o().m16467OooO00o().m21466OooO0O0());
    }

    @Override // com.p118pd.sdk.AbstractC9605iL11, com.p118pd.sdk.AbstractC9605iL11, com.p118pd.sdk.AbstractC9605iL11
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Lllll1 m15773OooO00o() {
        return new Lllll1(this.OooO00o.OooO00o().m16465OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC9605iL11, com.p118pd.sdk.AbstractC9605iL11, com.p118pd.sdk.AbstractC9605iL11
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9850lI1I[] m15774OooO00o() {
        I11li1 OooO00o2 = this.OooO00o.OooO00o().OooO00o();
        C9850lI1I[] r1 = new C9850lI1I[OooO00o2.size()];
        for (int i = 0; i != OooO00o2.size(); i++) {
            r1[i] = new C9850lI1I(OooO00o2.OooO00o(i));
        }
        return r1;
    }

    @Override // com.p118pd.sdk.AbstractC9605iL11
    public C9850lI1I[] OooO00o(String str) {
        I11li1 OooO00o2 = this.OooO00o.OooO00o().OooO00o();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i != OooO00o2.size(); i++) {
            C9850lI1I r3 = new C9850lI1I(OooO00o2.OooO00o(i));
            if (r3.m21933OooO0O0().equals(str)) {
                arrayList.add(r3);
            }
        }
        if (arrayList.size() == 0) {
            return null;
        }
        return (C9850lI1I[]) arrayList.toArray(new C9850lI1I[arrayList.size()]);
    }

    @Override // com.p118pd.sdk.AbstractC9605iL11
    public void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException {
        checkValidity(new Date());
    }

    @Override // com.p118pd.sdk.AbstractC9605iL11
    public void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException {
        if (date.after(getNotAfter())) {
            throw new CertificateExpiredException("certificate expired on " + getNotAfter());
        } else if (date.before(getNotBefore())) {
            throw new CertificateNotYetValidException("certificate not valid till " + getNotBefore());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC9605iL11)) {
            return false;
        }
        try {
            return C9586iIILl.m21627OooO00o(getEncoded(), ((AbstractC9605iL11) obj).getEncoded());
        } catch (IOException unused) {
            return false;
        }
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return OooO00o(true);
    }

    @Override // com.p118pd.sdk.AbstractC9605iL11
    public byte[] getEncoded() throws IOException {
        return this.OooO00o.getEncoded();
    }

    public byte[] getExtensionValue(String str) {
        C5237III OooO00o2;
        iI11IL OooO00o3 = this.OooO00o.OooO00o().m16462OooO00o();
        if (OooO00o3 == null || (OooO00o2 = OooO00o3.OooO00o(new LlLI1(str))) == null) {
            return null;
        }
        try {
            return OooO00o2.m15433OooO00o().OooO00o(AbstractC5533IiL.OooO00o);
        } catch (Exception e) {
            throw new RuntimeException("error encoding " + e.toString());
        }
    }

    @Override // com.p118pd.sdk.AbstractC9605iL11
    public boolean[] getIssuerUniqueID() {
        iIilII1 OooO00o2 = this.OooO00o.OooO00o().m16461OooO00o();
        if (OooO00o2 == null) {
            return null;
        }
        byte[] OooO00o3 = OooO00o2.m15475OooO00o();
        int length = (OooO00o3.length * 8) - OooO00o2.OooO0OO();
        boolean[] zArr = new boolean[length];
        for (int i = 0; i != length; i++) {
            zArr[i] = (OooO00o3[i / 8] & (128 >>> (i % 8))) != 0;
        }
        return zArr;
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return OooO00o(false);
    }

    @Override // com.p118pd.sdk.AbstractC9605iL11
    public Date getNotAfter() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC9605iL11
    public Date getNotBefore() {
        return this.f15989OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC9605iL11
    public BigInteger getSerialNumber() {
        return this.OooO00o.OooO00o().m16464OooO00o().m17647OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC9605iL11
    public byte[] getSignature() {
        return this.OooO00o.m21437OooO00o().OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC9605iL11
    public int getVersion() {
        return this.OooO00o.OooO00o().m16468OooO0O0().m17647OooO0O0().intValue() + 1;
    }

    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        return criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty();
    }

    public int hashCode() {
        try {
            return C9586iIILl.OooO00o(getEncoded());
        } catch (IOException unused) {
            return 0;
        }
    }

    @Override // com.p118pd.sdk.AbstractC9605iL11
    public final void verify(PublicKey publicKey, String str) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        if (this.OooO00o.m21438OooO00o().equals(this.OooO00o.OooO00o().m16463OooO00o())) {
            Signature instance = Signature.getInstance(this.OooO00o.m21438OooO00o().OooO00o().m16387OooO0O0(), str);
            instance.initVerify(publicKey);
            try {
                instance.update(this.OooO00o.OooO00o().getEncoded());
                if (!instance.verify(getSignature())) {
                    throw new InvalidKeyException("Public key presented not for certificate signature");
                }
            } catch (IOException unused) {
                throw new SignatureException("Exception encoding certificate info object");
            }
        } else {
            throw new CertificateException("Signature algorithm in certificate info not same as outer certificate");
        }
    }
}
