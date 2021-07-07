package org.bouncycastle.cert;

import com.p118pd.sdk.AbstractC9449II;
import com.p118pd.sdk.C5237III;
import com.p118pd.sdk.C5856LLl1I;
import com.p118pd.sdk.C5870LiLlI;
import com.p118pd.sdk.C5872LilIi;
import com.p118pd.sdk.C6119iIl1il;
import com.p118pd.sdk.C6456l1ilL;
import com.p118pd.sdk.C9365ILi;
import com.p118pd.sdk.C9370Ii;
import com.p118pd.sdk.I11li1;
import com.p118pd.sdk.IL1LI;
import com.p118pd.sdk.LlLI1;
import com.p118pd.sdk.i11ILLIi;
import com.p118pd.sdk.iI11IL;
import com.p118pd.sdk.lIil1IL;
import com.p118pd.sdk.lliLLL;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

public class X509AttributeCertificateHolder implements i11ILLIi, Serializable {
    public static C5870LiLlI[] OooO00o = new C5870LiLlI[0];
    public static final long serialVersionUID = 20170722001L;

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient iI11IL f23881OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient C9370Ii f23882OooO00o;

    public X509AttributeCertificateHolder(C9370Ii r1) {
        OooO00o(r1);
    }

    public X509AttributeCertificateHolder(byte[] bArr) throws IOException {
        this(OooO00o(bArr));
    }

    public static C9370Ii OooO00o(byte[] bArr) throws IOException {
        try {
            return C9370Ii.OooO00o(lIil1IL.OooO00o(bArr));
        } catch (ClassCastException e) {
            throw new CertIOException("malformed data: " + e.getMessage(), e);
        } catch (IllegalArgumentException e2) {
            throw new CertIOException("malformed data: " + e2.getMessage(), e2);
        }
    }

    private void OooO00o(C9370Ii r1) {
        this.f23882OooO00o = r1;
        this.f23881OooO00o = r1.OooO00o().m16462OooO00o();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        OooO00o(C9370Ii.OooO00o(objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X509AttributeCertificateHolder)) {
            return false;
        }
        return this.f23882OooO00o.equals(((X509AttributeCertificateHolder) obj).f23882OooO00o);
    }

    public C5870LiLlI[] getAttributes() {
        I11li1 OooO00o2 = this.f23882OooO00o.OooO00o().OooO00o();
        C5870LiLlI[] r1 = new C5870LiLlI[OooO00o2.size()];
        for (int i = 0; i != OooO00o2.size(); i++) {
            r1[i] = C5870LiLlI.OooO00o(OooO00o2.OooO00o(i));
        }
        return r1;
    }

    public C5870LiLlI[] getAttributes(LlLI1 llLI1) {
        I11li1 OooO00o2 = this.f23882OooO00o.OooO00o().OooO00o();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i != OooO00o2.size(); i++) {
            C5870LiLlI OooO00o3 = C5870LiLlI.OooO00o(OooO00o2.OooO00o(i));
            if (OooO00o3.m16459OooO00o().equals(llLI1)) {
                arrayList.add(OooO00o3);
            }
        }
        return arrayList.size() == 0 ? OooO00o : (C5870LiLlI[]) arrayList.toArray(new C5870LiLlI[arrayList.size()]);
    }

    public Set getCriticalExtensionOIDs() {
        return lIil1IL.m17645OooO00o(this.f23881OooO00o);
    }

    @Override // com.p118pd.sdk.i11ILLIi
    public byte[] getEncoded() throws IOException {
        return this.f23882OooO00o.getEncoded();
    }

    public C5237III getExtension(LlLI1 llLI1) {
        iI11IL r0 = this.f23881OooO00o;
        if (r0 != null) {
            return r0.OooO00o(llLI1);
        }
        return null;
    }

    public List getExtensionOIDs() {
        return lIil1IL.OooO00o(this.f23881OooO00o);
    }

    public iI11IL getExtensions() {
        return this.f23881OooO00o;
    }

    public C5856LLl1I getHolder() {
        return new C5856LLl1I((I11li1) this.f23882OooO00o.OooO00o().m16467OooO00o().m21466OooO0O0());
    }

    public IL1LI getIssuer() {
        return new IL1LI(this.f23882OooO00o.OooO00o().m16465OooO00o());
    }

    public boolean[] getIssuerUniqueID() {
        return lIil1IL.OooO00o(this.f23882OooO00o.OooO00o().m16461OooO00o());
    }

    public Set getNonCriticalExtensionOIDs() {
        return lIil1IL.OooO0O0(this.f23881OooO00o);
    }

    public Date getNotAfter() {
        return lIil1IL.OooO00o(this.f23882OooO00o.OooO00o().m16466OooO00o().OooO00o());
    }

    public Date getNotBefore() {
        return lIil1IL.OooO00o(this.f23882OooO00o.OooO00o().m16466OooO00o().m21431OooO0O0());
    }

    public BigInteger getSerialNumber() {
        return this.f23882OooO00o.OooO00o().m16464OooO00o().m17647OooO0O0();
    }

    public byte[] getSignature() {
        return this.f23882OooO00o.m21437OooO00o().OooO0O0();
    }

    public C6456l1ilL getSignatureAlgorithm() {
        return this.f23882OooO00o.m21438OooO00o();
    }

    public int getVersion() {
        return this.f23882OooO00o.OooO00o().m16468OooO0O0().m17647OooO0O0().intValue() + 1;
    }

    public boolean hasExtensions() {
        return this.f23881OooO00o != null;
    }

    public int hashCode() {
        return this.f23882OooO00o.hashCode();
    }

    public boolean isSignatureValid(AbstractC9449II r4) throws CertException {
        C5872LilIi OooO00o2 = this.f23882OooO00o.OooO00o();
        if (lIil1IL.OooO00o(OooO00o2.m16463OooO00o(), this.f23882OooO00o.m21438OooO00o())) {
            try {
                lliLLL OooO00o3 = r4.OooO00o(OooO00o2.m16463OooO00o());
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
        C9365ILi OooO00o2 = this.f23882OooO00o.OooO00o().m16466OooO00o();
        return !date.before(lIil1IL.OooO00o(OooO00o2.m21431OooO0O0())) && !date.after(lIil1IL.OooO00o(OooO00o2.OooO00o()));
    }

    public C9370Ii toASN1Structure() {
        return this.f23882OooO00o;
    }
}
