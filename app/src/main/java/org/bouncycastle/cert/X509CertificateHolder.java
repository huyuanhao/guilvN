package org.bouncycastle.cert;

import com.p118pd.sdk.AbstractC9449II;
import com.p118pd.sdk.C5237III;
import com.p118pd.sdk.C5314ILlLL;
import com.p118pd.sdk.C6119iIl1il;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C6888ll;
import com.p118pd.sdk.LilIiIl;
import com.p118pd.sdk.LlLI1;
import com.p118pd.sdk.i11ILLIi;
import com.p118pd.sdk.iI11IL;
import com.p118pd.sdk.l1LILI1;
import com.p118pd.sdk.lIil1IL;
import com.p118pd.sdk.lliLLL;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class X509CertificateHolder implements i11ILLIi, Serializable {
    public static final long serialVersionUID = 20170722001L;
    public transient LilIiIl OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient iI11IL f23885OooO00o;

    public X509CertificateHolder(LilIiIl lilIiIl) {
        OooO00o(lilIiIl);
    }

    public X509CertificateHolder(byte[] bArr) throws IOException {
        this(OooO00o(bArr));
    }

    public static LilIiIl OooO00o(byte[] bArr) throws IOException {
        try {
            return LilIiIl.OooO00o(lIil1IL.OooO00o(bArr));
        } catch (ClassCastException e) {
            throw new CertIOException("malformed data: " + e.getMessage(), e);
        } catch (IllegalArgumentException e2) {
            throw new CertIOException("malformed data: " + e2.getMessage(), e2);
        }
    }

    private void OooO00o(LilIiIl lilIiIl) {
        this.OooO00o = lilIiIl;
        this.f23885OooO00o = lilIiIl.OooO00o().m15514OooO00o();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        OooO00o(LilIiIl.OooO00o(objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X509CertificateHolder)) {
            return false;
        }
        return this.OooO00o.equals(((X509CertificateHolder) obj).OooO00o);
    }

    public Set getCriticalExtensionOIDs() {
        return lIil1IL.m17645OooO00o(this.f23885OooO00o);
    }

    @Override // com.p118pd.sdk.i11ILLIi
    public byte[] getEncoded() throws IOException {
        return this.OooO00o.getEncoded();
    }

    public C5237III getExtension(LlLI1 llLI1) {
        iI11IL r0 = this.f23885OooO00o;
        if (r0 != null) {
            return r0.OooO00o(llLI1);
        }
        return null;
    }

    public List getExtensionOIDs() {
        return lIil1IL.OooO00o(this.f23885OooO00o);
    }

    public iI11IL getExtensions() {
        return this.f23885OooO00o;
    }

    public l1LILI1 getIssuer() {
        return l1LILI1.OooO00o(this.OooO00o.m16318OooO00o());
    }

    public Set getNonCriticalExtensionOIDs() {
        return lIil1IL.OooO0O0(this.f23885OooO00o);
    }

    public Date getNotAfter() {
        return this.OooO00o.m16316OooO00o().OooO00o();
    }

    public Date getNotBefore() {
        return this.OooO00o.m16322OooO0O0().OooO00o();
    }

    public BigInteger getSerialNumber() {
        return this.OooO00o.m16320OooO00o().m17647OooO0O0();
    }

    public byte[] getSignature() {
        return this.OooO00o.m16317OooO00o().OooO0O0();
    }

    public C6456l1ilL getSignatureAlgorithm() {
        return this.OooO00o.m16319OooO00o();
    }

    public l1LILI1 getSubject() {
        return l1LILI1.OooO00o(this.OooO00o.m16324OooO0O0());
    }

    public C6888ll getSubjectPublicKeyInfo() {
        return this.OooO00o.m16321OooO00o();
    }

    public int getVersion() {
        return this.OooO00o.OooO0O0();
    }

    public int getVersionNumber() {
        return this.OooO00o.OooO0O0();
    }

    public boolean hasExtensions() {
        return this.f23885OooO00o != null;
    }

    public int hashCode() {
        return this.OooO00o.hashCode();
    }

    public boolean isSignatureValid(AbstractC9449II r4) throws CertException {
        C5314ILlLL OooO00o2 = this.OooO00o.OooO00o();
        if (lIil1IL.OooO00o(OooO00o2.m15516OooO00o(), this.OooO00o.m16319OooO00o())) {
            try {
                lliLLL OooO00o3 = r4.OooO00o(OooO00o2.m15516OooO00o());
                OutputStream OooO00o4 = OooO00o3.m17912OooO00o();
                new C6119iIl1il(OooO00o4).OooO00o(OooO00o2);
                OooO00o4.close();
                return OooO00o3.verify(getSignature());
            } catch (Exception e) {
                throw new CertException("unable to process signature: " + e.getMessage(), e);
            }
        } else {
            throw new CertException("signature invalid - algorithm identifier mismatch");
        }
    }

    public boolean isValidOn(Date date) {
        return !date.before(this.OooO00o.m16322OooO0O0().OooO00o()) && !date.after(this.OooO00o.m16316OooO00o().OooO00o());
    }

    public LilIiIl toASN1Structure() {
        return this.OooO00o;
    }
}
