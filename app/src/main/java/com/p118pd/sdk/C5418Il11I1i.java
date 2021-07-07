package com.p118pd.sdk;

import com.p118pd.sdk.C6782lli11;
import java.io.IOException;
import java.math.BigInteger;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.jcajce.provider.asymmetric.x509.ExtCRLException;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.Il11I1i  reason: case insensitive filesystem */
public class C5418Il11I1i extends X509CRL {
    public C5190I1lIiL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ii1I11l f15781OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f15782OooO00o;
    public boolean OooO0O0;
    public boolean OooO0OO = false;
    public int o00oO0O;
    public String o0ooOOo;

    public C5418Il11I1i(ii1I11l ii1i11l, C5190I1lIiL r4) throws CRLException {
        this.f15781OooO00o = ii1i11l;
        this.OooO00o = r4;
        try {
            this.o0ooOOo = i1LLIL.OooO00o(r4.m15325OooO00o());
            if (r4.m15325OooO00o().m17587OooO0O0() != null) {
                this.f15782OooO00o = r4.m15325OooO00o().m17587OooO0O0().OooO0O0().OooO00o(AbstractC5533IiL.OooO00o);
            } else {
                this.f15782OooO00o = null;
            }
            this.OooO0O0 = OooO00o(this);
        } catch (Exception e) {
            throw new CRLException("CRL contents invalid: " + e);
        }
    }

    private Set OooO00o() {
        C5237III OooO00o2;
        HashSet hashSet = new HashSet();
        Enumeration OooO00o3 = this.OooO00o.m15327OooO00o();
        l1LILI1 r2 = null;
        while (OooO00o3.hasMoreElements()) {
            C6782lli11.OooO0O0 oooO0O0 = (C6782lli11.OooO0O0) OooO00o3.nextElement();
            hashSet.add(new C93231I1(oooO0O0, this.OooO0O0, r2));
            if (this.OooO0O0 && oooO0O0.m17911OooO00o() && (OooO00o2 = oooO0O0.m17909OooO00o().OooO00o(C5237III.o00Ooooo)) != null) {
                r2 = l1LILI1.OooO00o(C5845LIillll.OooO00o(OooO00o2.m15435OooO0O0()).OooO00o()[0].m15483OooO0O0());
            }
        }
        return hashSet;
    }

    private Set OooO00o(boolean z) {
        iI11IL OooO00o2;
        if (getVersion() != 2 || (OooO00o2 = this.OooO00o.m15326OooO00o().m17901OooO00o()) == null) {
            return null;
        }
        HashSet hashSet = new HashSet();
        Enumeration OooO00o3 = OooO00o2.OooO00o();
        while (OooO00o3.hasMoreElements()) {
            LlLI1 llLI1 = (LlLI1) OooO00o3.nextElement();
            if (z == OooO00o2.OooO00o(llLI1).m15434OooO00o()) {
                hashSet.add(llLI1.m16387OooO0O0());
            }
        }
        return hashSet;
    }

    private void OooO00o(PublicKey publicKey, Signature signature) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        if (this.OooO00o.m15325OooO00o().equals(this.OooO00o.m15326OooO00o().m17903OooO00o())) {
            byte[] bArr = this.f15782OooO00o;
            if (bArr != null) {
                try {
                    i1LLIL.OooO00o(signature, AbstractC6122iIlLiL.OooO00o(bArr));
                } catch (IOException e) {
                    throw new SignatureException("cannot decode signature parameters: " + e.getMessage());
                }
            }
            signature.initVerify(publicKey);
            signature.update(getTBSCertList());
            if (!signature.verify(getSignature())) {
                throw new SignatureException("CRL does not verify with supplied public key.");
            }
            return;
        }
        throw new CRLException("Signature algorithm on CertificateList does not match TBSCertList.");
    }

    public static boolean OooO00o(X509CRL x509crl) throws CRLException {
        try {
            byte[] extensionValue = x509crl.getExtensionValue(C5237III.o00OoooO.m16387OooO0O0());
            return extensionValue != null && i1LlI.OooO00o(AbstractC6804llL1ii.OooO00o(extensionValue).m17938OooO00o()).m16881OooO00o();
        } catch (Exception e) {
            throw new ExtCRLException("Exception reading IssuingDistributionPoint", e);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof X509CRL)) {
            return false;
        }
        if (!(obj instanceof C5418Il11I1i)) {
            return super.equals(obj);
        }
        C5418Il11I1i il11I1i = (C5418Il11I1i) obj;
        if (!this.OooO0OO || !il11I1i.OooO0OO || il11I1i.o00oO0O == this.o00oO0O) {
            return this.OooO00o.equals(il11I1i.OooO00o);
        }
        return false;
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return OooO00o(true);
    }

    @Override // java.security.cert.X509CRL
    public byte[] getEncoded() throws CRLException {
        try {
            return this.OooO00o.OooO00o(AbstractC5533IiL.OooO00o);
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    public byte[] getExtensionValue(String str) {
        C5237III OooO00o2;
        iI11IL OooO00o3 = this.OooO00o.m15326OooO00o().m17901OooO00o();
        if (OooO00o3 == null || (OooO00o2 = OooO00o3.OooO00o(new LlLI1(str))) == null) {
            return null;
        }
        try {
            return OooO00o2.m15433OooO00o().getEncoded();
        } catch (Exception e) {
            throw new IllegalStateException("error parsing " + e.toString());
        }
    }

    public Principal getIssuerDN() {
        return new C6790lll1I11(l1LILI1.OooO00o(this.OooO00o.m15324OooO00o().OooO0O0()));
    }

    public X500Principal getIssuerX500Principal() {
        try {
            return new X500Principal(this.OooO00o.m15324OooO00o().getEncoded());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    public Date getNextUpdate() {
        if (this.OooO00o.OooO00o() != null) {
            return this.OooO00o.OooO00o().OooO00o();
        }
        return null;
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return OooO00o(false);
    }

    @Override // java.security.cert.X509CRL
    public X509CRLEntry getRevokedCertificate(BigInteger bigInteger) {
        C5237III OooO00o2;
        Enumeration OooO00o3 = this.OooO00o.m15327OooO00o();
        l1LILI1 r2 = null;
        while (OooO00o3.hasMoreElements()) {
            C6782lli11.OooO0O0 oooO0O0 = (C6782lli11.OooO0O0) OooO00o3.nextElement();
            if (bigInteger.equals(oooO0O0.m17910OooO00o().m17647OooO0O0())) {
                return new C93231I1(oooO0O0, this.OooO0O0, r2);
            }
            if (this.OooO0O0 && oooO0O0.m17911OooO00o() && (OooO00o2 = oooO0O0.m17909OooO00o().OooO00o(C5237III.o00Ooooo)) != null) {
                r2 = l1LILI1.OooO00o(C5845LIillll.OooO00o(OooO00o2.m15435OooO0O0()).OooO00o()[0].m15483OooO0O0());
            }
        }
        return null;
    }

    @Override // java.security.cert.X509CRL
    public Set getRevokedCertificates() {
        Set OooO00o2 = OooO00o();
        if (!OooO00o2.isEmpty()) {
            return Collections.unmodifiableSet(OooO00o2);
        }
        return null;
    }

    public String getSigAlgName() {
        return this.o0ooOOo;
    }

    public String getSigAlgOID() {
        return this.OooO00o.m15325OooO00o().OooO00o().m16387OooO0O0();
    }

    public byte[] getSigAlgParams() {
        byte[] bArr = this.f15782OooO00o;
        if (bArr == null) {
            return null;
        }
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    public byte[] getSignature() {
        return this.OooO00o.m15323OooO00o().OooO0O0();
    }

    @Override // java.security.cert.X509CRL
    public byte[] getTBSCertList() throws CRLException {
        try {
            return this.OooO00o.m15326OooO00o().OooO00o(AbstractC5533IiL.OooO00o);
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    public Date getThisUpdate() {
        return this.OooO00o.m15329OooO0O0().OooO00o();
    }

    public int getVersion() {
        return this.OooO00o.OooO0O0();
    }

    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        if (criticalExtensionOIDs == null) {
            return false;
        }
        criticalExtensionOIDs.remove(C5237III.o00OoooO.m16387OooO0O0());
        criticalExtensionOIDs.remove(C5237III.o0O00o0.m16387OooO0O0());
        return !criticalExtensionOIDs.isEmpty();
    }

    public int hashCode() {
        if (!this.OooO0OO) {
            this.OooO0OO = true;
            this.o00oO0O = super.hashCode();
        }
        return this.o00oO0O;
    }

    public boolean isRevoked(Certificate certificate) {
        l1LILI1 r9;
        C5237III OooO00o2;
        if (certificate.getType().equals("X.509")) {
            Enumeration OooO00o3 = this.OooO00o.m15327OooO00o();
            l1LILI1 OooO00o4 = this.OooO00o.m15324OooO00o();
            if (OooO00o3.hasMoreElements()) {
                X509Certificate x509Certificate = (X509Certificate) certificate;
                BigInteger serialNumber = x509Certificate.getSerialNumber();
                while (OooO00o3.hasMoreElements()) {
                    C6782lli11.OooO0O0 OooO00o5 = C6782lli11.OooO0O0.OooO00o(OooO00o3.nextElement());
                    if (this.OooO0O0 && OooO00o5.m17911OooO00o() && (OooO00o2 = OooO00o5.m17909OooO00o().OooO00o(C5237III.o00Ooooo)) != null) {
                        OooO00o4 = l1LILI1.OooO00o(C5845LIillll.OooO00o(OooO00o2.m15435OooO0O0()).OooO00o()[0].m15483OooO0O0());
                    }
                    if (OooO00o5.m17910OooO00o().m17647OooO0O0().equals(serialNumber)) {
                        if (certificate instanceof X509Certificate) {
                            r9 = l1LILI1.OooO00o(x509Certificate.getIssuerX500Principal().getEncoded());
                        } else {
                            try {
                                r9 = LilIiIl.OooO00o(certificate.getEncoded()).m16318OooO00o();
                            } catch (CertificateEncodingException e) {
                                throw new IllegalArgumentException("Cannot process certificate: " + e.getMessage());
                            }
                        }
                        return OooO00o4.equals(r9);
                    }
                }
            }
            return false;
        }
        throw new IllegalArgumentException("X.509 CRL used with non X.509 Cert");
    }

    public String toString() {
        String str;
        String OooO00o2;
        Object OooO00o3;
        StringBuffer stringBuffer = new StringBuffer();
        String OooO00o4 = Strings.m22984OooO00o();
        stringBuffer.append("              Version: ");
        stringBuffer.append(getVersion());
        stringBuffer.append(OooO00o4);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(OooO00o4);
        stringBuffer.append("          This update: ");
        stringBuffer.append(getThisUpdate());
        stringBuffer.append(OooO00o4);
        stringBuffer.append("          Next update: ");
        stringBuffer.append(getNextUpdate());
        stringBuffer.append(OooO00o4);
        stringBuffer.append("  Signature Algorithm: ");
        stringBuffer.append(getSigAlgName());
        stringBuffer.append(OooO00o4);
        byte[] signature = getSignature();
        stringBuffer.append("            Signature: ");
        stringBuffer.append(new String(C6472l1l1l.m17609OooO00o(signature, 0, 20)));
        stringBuffer.append(OooO00o4);
        int i = 20;
        while (i < signature.length) {
            int length = signature.length - 20;
            stringBuffer.append("                       ");
            stringBuffer.append(i < length ? new String(C6472l1l1l.m17609OooO00o(signature, i, 20)) : new String(C6472l1l1l.m17609OooO00o(signature, i, signature.length - i)));
            stringBuffer.append(OooO00o4);
            i += 20;
        }
        iI11IL OooO00o5 = this.OooO00o.m15326OooO00o().m17901OooO00o();
        if (OooO00o5 != null) {
            Enumeration OooO00o6 = OooO00o5.OooO00o();
            if (OooO00o6.hasMoreElements()) {
                str = "           Extensions: ";
                stringBuffer.append(str);
                stringBuffer.append(OooO00o4);
            }
            while (true) {
                if (OooO00o6.hasMoreElements()) {
                    LlLI1 llLI1 = (LlLI1) OooO00o6.nextElement();
                    C5237III OooO00o7 = OooO00o5.OooO00o(llLI1);
                    if (OooO00o7.m15433OooO00o() == null) {
                        break;
                    }
                    C5805Ll1 r8 = new C5805Ll1(OooO00o7.m15433OooO00o().m17938OooO00o());
                    stringBuffer.append("                       critical(");
                    stringBuffer.append(OooO00o7.m15434OooO00o());
                    stringBuffer.append(") ");
                    C5805Ll1 r82 = new C5805Ll1(OooO00o7.m15433OooO00o().m17938OooO00o());
                    stringBuffer.append("                       critical(");
                    stringBuffer.append(OooO00o7.m15434OooO00o());
                    stringBuffer.append(") ");
                    try {
                    } catch (Exception unused) {
                        stringBuffer.append(llLI1.m16387OooO0O0());
                        stringBuffer.append(" value = ");
                        str = "*****";
                    }
                    if (llLI1.equals(C5237III.o00OooO0)) {
                        OooO00o3 = new C6537lIiII(C6513lIiI.OooO00o((Object) r82.OooO00o()).OooO00o());
                    } else {
                        if (llLI1.equals(C5237III.o0O00o0)) {
                            OooO00o2 = "Base CRL: " + new C6537lIiII(C6513lIiI.OooO00o((Object) r82.OooO00o()).OooO00o());
                        } else if (llLI1.equals(C5237III.o00OoooO)) {
                            OooO00o3 = i1LlI.OooO00o(r82.OooO00o());
                        } else if (llLI1.equals(C5237III.o00o000)) {
                            OooO00o3 = C6251iiLilL.OooO00o(r82.OooO00o());
                        } else if (llLI1.equals(C5237III.o00o00Oo)) {
                            OooO00o3 = C6251iiLilL.OooO00o(r82.OooO00o());
                        } else {
                            stringBuffer.append(llLI1.m16387OooO0O0());
                            stringBuffer.append(" value = ");
                            OooO00o2 = C9878I1.OooO00o(r82.OooO00o());
                        }
                        stringBuffer.append(OooO00o2);
                        stringBuffer.append(OooO00o4);
                    }
                    stringBuffer.append(OooO00o3);
                    stringBuffer.append(OooO00o4);
                }
                break;
            }
        }
        Set<Object> revokedCertificates = getRevokedCertificates();
        if (revokedCertificates != null) {
            for (Object obj : revokedCertificates) {
                stringBuffer.append(obj);
                stringBuffer.append(OooO00o4);
            }
        }
        return stringBuffer.toString();
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        Signature signature;
        try {
            signature = this.f15781OooO00o.m17222OooO00o(getSigAlgName());
        } catch (Exception unused) {
            signature = Signature.getInstance(getSigAlgName());
        }
        OooO00o(publicKey, signature);
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, String str) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        OooO00o(publicKey, str != null ? Signature.getInstance(getSigAlgName(), str) : Signature.getInstance(getSigAlgName()));
    }

    @Override // java.security.cert.X509CRL
    public void verify(PublicKey publicKey, Provider provider) throws CRLException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        OooO00o(publicKey, provider != null ? Signature.getInstance(getSigAlgName(), provider) : Signature.getInstance(getSigAlgName()));
    }
}
