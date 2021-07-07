package org.bouncycastle.jce.provider;

import com.p118pd.sdk.AbstractC5533IiL;
import com.p118pd.sdk.AbstractC5702Li111;
import com.p118pd.sdk.AbstractC6122iIlLiL;
import com.p118pd.sdk.AbstractC6786llil;
import com.p118pd.sdk.AbstractC6804llL1ii;
import com.p118pd.sdk.AbstractC6854lLi1LL;
import com.p118pd.sdk.AbstractC98681;
import com.p118pd.sdk.C1iIii;
import com.p118pd.sdk.C5237III;
import com.p118pd.sdk.C5387Ii;
import com.p118pd.sdk.C5793Lli1l;
import com.p118pd.sdk.C5805Ll1;
import com.p118pd.sdk.C6010i11lLl;
import com.p118pd.sdk.C6103iIi1;
import com.p118pd.sdk.C6396iiLiL;
import com.p118pd.sdk.C6452l1Lll;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6472l1l1l;
import com.p118pd.sdk.C6790lll1I11;
import com.p118pd.sdk.C9586iIILl;
import com.p118pd.sdk.C9878I1;
import com.p118pd.sdk.I11I;
import com.p118pd.sdk.I11li1;
import com.p118pd.sdk.I1IiLiI;
import com.p118pd.sdk.ILI;
import com.p118pd.sdk.L1iI1;
import com.p118pd.sdk.LL1ILll;
import com.p118pd.sdk.LLi1i;
import com.p118pd.sdk.LilIiIl;
import com.p118pd.sdk.LlLI1;
import com.p118pd.sdk.iI11IL;
import com.p118pd.sdk.iIilII1;
import com.p118pd.sdk.iLII1ii;
import com.p118pd.sdk.l1LILI1;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Principal;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Security;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateExpiredException;
import java.security.cert.CertificateNotYetValidException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.util.Strings;

public class X509CertificateObject extends X509Certificate implements AbstractC6786llil {
    public AbstractC6786llil attrCarrier = new LLi1i();
    public iLII1ii basicConstraints;

    /* renamed from: c */
    public LilIiIl f13503c;
    public int hashValue;
    public boolean hashValueSet;
    public boolean[] keyUsage;

    public X509CertificateObject(LilIiIl lilIiIl) throws CertificateParsingException {
        this.f13503c = lilIiIl;
        try {
            byte[] OooO00o = OooO00o("2.5.29.19");
            if (OooO00o != null) {
                this.basicConstraints = iLII1ii.OooO00o(AbstractC6122iIlLiL.OooO00o(OooO00o));
            }
            try {
                byte[] OooO00o2 = OooO00o("2.5.29.15");
                if (OooO00o2 != null) {
                    iIilII1 OooO00o3 = iIilII1.OooO00o((Object) AbstractC6122iIlLiL.OooO00o(OooO00o2));
                    byte[] OooO00o4 = OooO00o3.m15475OooO00o();
                    int length = (OooO00o4.length * 8) - OooO00o3.OooO0OO();
                    int i = 9;
                    if (length >= 9) {
                        i = length;
                    }
                    this.keyUsage = new boolean[i];
                    for (int i2 = 0; i2 != length; i2++) {
                        this.keyUsage[i2] = (OooO00o4[i2 / 8] & (128 >>> (i2 % 8))) != 0;
                    }
                    return;
                }
                this.keyUsage = null;
            } catch (Exception e) {
                throw new CertificateParsingException("cannot construct KeyUsage: " + e);
            }
        } catch (Exception e2) {
            throw new CertificateParsingException("cannot construct BasicConstraints: " + e2);
        }
    }

    private int OooO00o() {
        try {
            byte[] encoded = getEncoded();
            int i = 0;
            for (int i2 = 1; i2 < encoded.length; i2++) {
                i += encoded[i2] * i2;
            }
            return i;
        } catch (CertificateEncodingException unused) {
            return 0;
        }
    }

    public static Collection OooO00o(byte[] bArr) throws CertificateParsingException {
        String OooO00o;
        if (bArr == null) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Enumeration OooO00o2 = I11li1.OooO00o((Object) bArr).m15236OooO00o();
            while (OooO00o2.hasMoreElements()) {
                ILI OooO00o3 = ILI.OooO00o(OooO00o2.nextElement());
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(I11I.OooO00o(OooO00o3.OooO00o()));
                switch (OooO00o3.OooO00o()) {
                    case 0:
                    case 3:
                    case 5:
                        arrayList2.add(OooO00o3.getEncoded());
                        break;
                    case 1:
                    case 2:
                    case 6:
                        OooO00o = ((AbstractC98681) OooO00o3.m15483OooO0O0()).OooO00o();
                        arrayList2.add(OooO00o);
                        break;
                    case 4:
                        OooO00o = l1LILI1.OooO00o(I1IiLiI.OooO00o, OooO00o3.m15483OooO0O0()).toString();
                        arrayList2.add(OooO00o);
                        break;
                    case 7:
                        try {
                            OooO00o = InetAddress.getByAddress(AbstractC6804llL1ii.OooO00o(OooO00o3.m15483OooO0O0()).m17938OooO00o()).getHostAddress();
                            arrayList2.add(OooO00o);
                            break;
                        } catch (UnknownHostException unused) {
                            break;
                        }
                    case 8:
                        OooO00o = LlLI1.OooO00o(OooO00o3.m15483OooO0O0()).m16387OooO0O0();
                        arrayList2.add(OooO00o);
                        break;
                    default:
                        throw new IOException("Bad tag number: " + OooO00o3.OooO00o());
                }
                arrayList.add(Collections.unmodifiableList(arrayList2));
            }
            if (arrayList.size() == 0) {
                return null;
            }
            return Collections.unmodifiableCollection(arrayList);
        } catch (Exception e) {
            throw new CertificateParsingException(e.getMessage());
        }
    }

    private void OooO00o(PublicKey publicKey, Signature signature) throws CertificateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        if (OooO00o(this.f13503c.m16319OooO00o(), this.f13503c.OooO00o().m15516OooO00o())) {
            C1iIii.OooO00o(signature, this.f13503c.m16319OooO00o().m17587OooO0O0());
            signature.initVerify(publicKey);
            signature.update(getTBSCertificate());
            if (!signature.verify(getSignature())) {
                throw new SignatureException("certificate does not verify with supplied key");
            }
            return;
        }
        throw new CertificateException("signature algorithm in TBS cert not same as outer cert");
    }

    private boolean OooO00o(C6456l1ilL r4, C6456l1ilL r5) {
        if (!r4.OooO00o().equals(r5.OooO00o())) {
            return false;
        }
        return r4.m17587OooO0O0() == null ? r5.m17587OooO0O0() == null || r5.m17587OooO0O0().equals(C6452l1Lll.OooO00o) : r5.m17587OooO0O0() == null ? r4.m17587OooO0O0() == null || r4.m17587OooO0O0().equals(C6452l1Lll.OooO00o) : r4.m17587OooO0O0().equals(r5.m17587OooO0O0());
    }

    private byte[] OooO00o(String str) {
        C5237III OooO00o;
        iI11IL OooO00o2 = this.f13503c.OooO00o().m15514OooO00o();
        if (OooO00o2 == null || (OooO00o = OooO00o2.OooO00o(new LlLI1(str))) == null) {
            return null;
        }
        return OooO00o.m15433OooO00o().m17938OooO00o();
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity() throws CertificateExpiredException, CertificateNotYetValidException {
        checkValidity(new Date());
    }

    @Override // java.security.cert.X509Certificate
    public void checkValidity(Date date) throws CertificateExpiredException, CertificateNotYetValidException {
        if (date.getTime() > getNotAfter().getTime()) {
            throw new CertificateExpiredException("certificate expired on " + this.f13503c.m16316OooO00o().m15665OooO0O0());
        } else if (date.getTime() < getNotBefore().getTime()) {
            throw new CertificateNotYetValidException("certificate not valid till " + this.f13503c.m16322OooO0O0().m15665OooO0O0());
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Certificate)) {
            return false;
        }
        try {
            return C9586iIILl.m21627OooO00o(getEncoded(), ((Certificate) obj).getEncoded());
        } catch (CertificateEncodingException unused) {
            return false;
        }
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public AbstractC6854lLi1LL getBagAttribute(LlLI1 llLI1) {
        return this.attrCarrier.getBagAttribute(llLI1);
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public Enumeration getBagAttributeKeys() {
        return this.attrCarrier.getBagAttributeKeys();
    }

    public int getBasicConstraints() {
        iLII1ii r0 = this.basicConstraints;
        if (r0 == null || !r0.m17107OooO00o()) {
            return -1;
        }
        if (this.basicConstraints.OooO00o() == null) {
            return Integer.MAX_VALUE;
        }
        return this.basicConstraints.OooO00o().intValue();
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        HashSet hashSet = new HashSet();
        iI11IL OooO00o = this.f13503c.OooO00o().m15514OooO00o();
        if (OooO00o == null) {
            return null;
        }
        Enumeration OooO00o2 = OooO00o.OooO00o();
        while (OooO00o2.hasMoreElements()) {
            LlLI1 llLI1 = (LlLI1) OooO00o2.nextElement();
            if (OooO00o.OooO00o(llLI1).m15434OooO00o()) {
                hashSet.add(llLI1.m16387OooO0O0());
            }
        }
        return hashSet;
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() throws CertificateEncodingException {
        try {
            return this.f13503c.OooO00o(AbstractC5533IiL.OooO00o);
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public List getExtendedKeyUsage() throws CertificateParsingException {
        byte[] OooO00o = OooO00o("2.5.29.37");
        if (OooO00o == null) {
            return null;
        }
        try {
            I11li1 i11li1 = (I11li1) new C5805Ll1(OooO00o).OooO00o();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i != i11li1.size(); i++) {
                arrayList.add(((LlLI1) i11li1.OooO00o(i)).m16387OooO0O0());
            }
            return Collections.unmodifiableList(arrayList);
        } catch (Exception unused) {
            throw new CertificateParsingException("error processing extended key usage extension");
        }
    }

    public byte[] getExtensionValue(String str) {
        C5237III OooO00o;
        iI11IL OooO00o2 = this.f13503c.OooO00o().m15514OooO00o();
        if (OooO00o2 == null || (OooO00o = OooO00o2.OooO00o(new LlLI1(str))) == null) {
            return null;
        }
        try {
            return OooO00o.m15433OooO00o().getEncoded();
        } catch (Exception e) {
            throw new IllegalStateException("error parsing " + e.toString());
        }
    }

    @Override // java.security.cert.X509Certificate
    public Collection getIssuerAlternativeNames() throws CertificateParsingException {
        return OooO00o(OooO00o(C5237III.o00Ooo0O.m16387OooO0O0()));
    }

    public Principal getIssuerDN() {
        try {
            return new C6790lll1I11(l1LILI1.OooO00o(this.f13503c.m16318OooO00o().getEncoded()));
        } catch (IOException unused) {
            return null;
        }
    }

    public boolean[] getIssuerUniqueID() {
        iIilII1 OooO00o = this.f13503c.OooO00o().m15513OooO00o();
        if (OooO00o == null) {
            return null;
        }
        byte[] OooO00o2 = OooO00o.m15475OooO00o();
        int length = (OooO00o2.length * 8) - OooO00o.OooO0OO();
        boolean[] zArr = new boolean[length];
        for (int i = 0; i != length; i++) {
            zArr[i] = (OooO00o2[i / 8] & (128 >>> (i % 8))) != 0;
        }
        return zArr;
    }

    public X500Principal getIssuerX500Principal() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new C6103iIi1(byteArrayOutputStream).OooO00o(this.f13503c.m16318OooO00o());
            return new X500Principal(byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    public boolean[] getKeyUsage() {
        return this.keyUsage;
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        if (getVersion() != 3) {
            return null;
        }
        HashSet hashSet = new HashSet();
        iI11IL OooO00o = this.f13503c.OooO00o().m15514OooO00o();
        if (OooO00o == null) {
            return null;
        }
        Enumeration OooO00o2 = OooO00o.OooO00o();
        while (OooO00o2.hasMoreElements()) {
            LlLI1 llLI1 = (LlLI1) OooO00o2.nextElement();
            if (!OooO00o.OooO00o(llLI1).m15434OooO00o()) {
                hashSet.add(llLI1.m16387OooO0O0());
            }
        }
        return hashSet;
    }

    public Date getNotAfter() {
        return this.f13503c.m16316OooO00o().OooO00o();
    }

    public Date getNotBefore() {
        return this.f13503c.m16322OooO0O0().OooO00o();
    }

    public PublicKey getPublicKey() {
        try {
            return BouncyCastleProvider.getPublicKey(this.f13503c.m16321OooO00o());
        } catch (IOException unused) {
            return null;
        }
    }

    public BigInteger getSerialNumber() {
        return this.f13503c.m16320OooO00o().m17647OooO0O0();
    }

    public String getSigAlgName() {
        Provider provider = Security.getProvider(BouncyCastleProvider.PROVIDER_NAME);
        if (provider != null) {
            String property = provider.getProperty("Alg.Alias.Signature." + getSigAlgOID());
            if (property != null) {
                return property;
            }
        }
        Provider[] providers = Security.getProviders();
        for (int i = 0; i != providers.length; i++) {
            Provider provider2 = providers[i];
            String property2 = provider2.getProperty("Alg.Alias.Signature." + getSigAlgOID());
            if (property2 != null) {
                return property2;
            }
        }
        return getSigAlgOID();
    }

    public String getSigAlgOID() {
        return this.f13503c.m16319OooO00o().OooO00o().m16387OooO0O0();
    }

    public byte[] getSigAlgParams() {
        if (this.f13503c.m16319OooO00o().m17587OooO0O0() != null) {
            try {
                return this.f13503c.m16319OooO00o().m17587OooO0O0().OooO0O0().OooO00o(AbstractC5533IiL.OooO00o);
            } catch (IOException unused) {
            }
        }
        return null;
    }

    public byte[] getSignature() {
        return this.f13503c.m16317OooO00o().OooO0O0();
    }

    @Override // java.security.cert.X509Certificate
    public Collection getSubjectAlternativeNames() throws CertificateParsingException {
        return OooO00o(OooO00o(C5237III.o00Ooo0.m16387OooO0O0()));
    }

    public Principal getSubjectDN() {
        return new C6790lll1I11(l1LILI1.OooO00o(this.f13503c.m16324OooO0O0().OooO0O0()));
    }

    public boolean[] getSubjectUniqueID() {
        iIilII1 OooO0O0 = this.f13503c.OooO00o().m15520OooO0O0();
        if (OooO0O0 == null) {
            return null;
        }
        byte[] OooO00o = OooO0O0.m15475OooO00o();
        int length = (OooO00o.length * 8) - OooO0O0.OooO0OO();
        boolean[] zArr = new boolean[length];
        for (int i = 0; i != length; i++) {
            zArr[i] = (OooO00o[i / 8] & (128 >>> (i % 8))) != 0;
        }
        return zArr;
    }

    public X500Principal getSubjectX500Principal() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new C6103iIi1(byteArrayOutputStream).OooO00o(this.f13503c.m16324OooO0O0());
            return new X500Principal(byteArrayOutputStream.toByteArray());
        } catch (IOException unused) {
            throw new IllegalStateException("can't encode issuer DN");
        }
    }

    @Override // java.security.cert.X509Certificate
    public byte[] getTBSCertificate() throws CertificateEncodingException {
        try {
            return this.f13503c.OooO00o().OooO00o(AbstractC5533IiL.OooO00o);
        } catch (IOException e) {
            throw new CertificateEncodingException(e.toString());
        }
    }

    public int getVersion() {
        return this.f13503c.OooO0O0();
    }

    public boolean hasUnsupportedCriticalExtension() {
        iI11IL OooO00o;
        if (getVersion() != 3 || (OooO00o = this.f13503c.OooO00o().m15514OooO00o()) == null) {
            return false;
        }
        Enumeration OooO00o2 = OooO00o.OooO00o();
        while (OooO00o2.hasMoreElements()) {
            LlLI1 llLI1 = (LlLI1) OooO00o2.nextElement();
            String OooO0O0 = llLI1.m16387OooO0O0();
            if (!OooO0O0.equals(C6396iiLiL.OooOOO0) && !OooO0O0.equals(C6396iiLiL.f18205OooO00o) && !OooO0O0.equals(C6396iiLiL.f18207OooO0O0) && !OooO0O0.equals(C6396iiLiL.OooO0OO) && !OooO0O0.equals(C6396iiLiL.OooO) && !OooO0O0.equals(C6396iiLiL.OooO0Oo) && !OooO0O0.equals(C6396iiLiL.OooO0o) && !OooO0O0.equals(C6396iiLiL.OooO0oO) && !OooO0O0.equals(C6396iiLiL.OooO0oo) && !OooO0O0.equals(C6396iiLiL.OooOO0) && !OooO0O0.equals(C6396iiLiL.OooOO0O) && OooO00o.OooO00o(llLI1).m15434OooO00o()) {
                return true;
            }
        }
        return false;
    }

    public synchronized int hashCode() {
        if (!this.hashValueSet) {
            this.hashValue = OooO00o();
            this.hashValueSet = true;
        }
        return this.hashValue;
    }

    @Override // com.p118pd.sdk.AbstractC6786llil
    public void setBagAttribute(LlLI1 llLI1, AbstractC6854lLi1LL r3) {
        this.attrCarrier.setBagAttribute(llLI1, r3);
    }

    public String toString() {
        Object r6;
        StringBuffer stringBuffer = new StringBuffer();
        String OooO00o = Strings.m22984OooO00o();
        stringBuffer.append("  [0]         Version: ");
        stringBuffer.append(getVersion());
        stringBuffer.append(OooO00o);
        stringBuffer.append("         SerialNumber: ");
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(OooO00o);
        stringBuffer.append("             IssuerDN: ");
        stringBuffer.append(getIssuerDN());
        stringBuffer.append(OooO00o);
        stringBuffer.append("           Start Date: ");
        stringBuffer.append(getNotBefore());
        stringBuffer.append(OooO00o);
        stringBuffer.append("           Final Date: ");
        stringBuffer.append(getNotAfter());
        stringBuffer.append(OooO00o);
        stringBuffer.append("            SubjectDN: ");
        stringBuffer.append(getSubjectDN());
        stringBuffer.append(OooO00o);
        stringBuffer.append("           Public Key: ");
        stringBuffer.append(getPublicKey());
        stringBuffer.append(OooO00o);
        stringBuffer.append("  Signature Algorithm: ");
        stringBuffer.append(getSigAlgName());
        stringBuffer.append(OooO00o);
        byte[] signature = getSignature();
        stringBuffer.append("            Signature: ");
        stringBuffer.append(new String(C6472l1l1l.m17609OooO00o(signature, 0, 20)));
        stringBuffer.append(OooO00o);
        int i = 20;
        while (i < signature.length) {
            int length = signature.length - 20;
            stringBuffer.append("                       ");
            stringBuffer.append(i < length ? new String(C6472l1l1l.m17609OooO00o(signature, i, 20)) : new String(C6472l1l1l.m17609OooO00o(signature, i, signature.length - i)));
            stringBuffer.append(OooO00o);
            i += 20;
        }
        iI11IL OooO00o2 = this.f13503c.OooO00o().m15514OooO00o();
        if (OooO00o2 != null) {
            Enumeration OooO00o3 = OooO00o2.OooO00o();
            if (OooO00o3.hasMoreElements()) {
                stringBuffer.append("       Extensions: \n");
            }
            while (OooO00o3.hasMoreElements()) {
                LlLI1 llLI1 = (LlLI1) OooO00o3.nextElement();
                C5237III OooO00o4 = OooO00o2.OooO00o(llLI1);
                if (OooO00o4.m15433OooO00o() != null) {
                    C5805Ll1 r8 = new C5805Ll1(OooO00o4.m15433OooO00o().m17938OooO00o());
                    stringBuffer.append("                       critical(");
                    stringBuffer.append(OooO00o4.m15434OooO00o());
                    stringBuffer.append(") ");
                    try {
                        if (llLI1.equals(C5237III.o00Ooo0o)) {
                            r6 = iLII1ii.OooO00o(r8.OooO00o());
                        } else if (llLI1.equals(C5237III.o00OoOoo)) {
                            r6 = C5387Ii.OooO00o(r8.OooO00o());
                        } else if (llLI1.equals(AbstractC5702Li111.OooO0O0)) {
                            r6 = new LL1ILll((iIilII1) r8.OooO00o());
                        } else if (llLI1.equals(AbstractC5702Li111.OooO0Oo)) {
                            r6 = new C6010i11lLl((L1iI1) r8.OooO00o());
                        } else if (llLI1.equals(AbstractC5702Li111.OooOO0O)) {
                            r6 = new C5793Lli1l((L1iI1) r8.OooO00o());
                        } else {
                            stringBuffer.append(llLI1.m16387OooO0O0());
                            stringBuffer.append(" value = ");
                            stringBuffer.append(C9878I1.OooO00o(r8.OooO00o()));
                            stringBuffer.append(OooO00o);
                        }
                        stringBuffer.append(r6);
                        stringBuffer.append(OooO00o);
                    } catch (Exception unused) {
                        stringBuffer.append(llLI1.m16387OooO0O0());
                        stringBuffer.append(" value = ");
                        stringBuffer.append("*****");
                    }
                }
                stringBuffer.append(OooO00o);
            }
        }
        return stringBuffer.toString();
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        Signature signature;
        String OooO00o = C1iIii.OooO00o(this.f13503c.m16319OooO00o());
        try {
            signature = Signature.getInstance(OooO00o, BouncyCastleProvider.PROVIDER_NAME);
        } catch (Exception unused) {
            signature = Signature.getInstance(OooO00o);
        }
        OooO00o(publicKey, signature);
    }

    @Override // java.security.cert.Certificate
    public final void verify(PublicKey publicKey, String str) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, NoSuchProviderException, SignatureException {
        String OooO00o = C1iIii.OooO00o(this.f13503c.m16319OooO00o());
        OooO00o(publicKey, str != null ? Signature.getInstance(OooO00o, str) : Signature.getInstance(OooO00o));
    }

    @Override // java.security.cert.X509Certificate, java.security.cert.Certificate
    public final void verify(PublicKey publicKey, Provider provider) throws CertificateException, NoSuchAlgorithmException, InvalidKeyException, SignatureException {
        String OooO00o = C1iIii.OooO00o(this.f13503c.m16319OooO00o());
        OooO00o(publicKey, provider != null ? Signature.getInstance(OooO00o, provider) : Signature.getInstance(OooO00o));
    }
}
