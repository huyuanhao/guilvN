package org.bouncycastle.cert;

import com.p118pd.sdk.AbstractC6122iIlLiL;
import com.p118pd.sdk.AbstractC9449II;
import com.p118pd.sdk.C5190I1lIiL;
import com.p118pd.sdk.C5235IIl;
import com.p118pd.sdk.C5237III;
import com.p118pd.sdk.C5805Ll1;
import com.p118pd.sdk.C5845LIillll;
import com.p118pd.sdk.C6119iIl1il;
import com.p118pd.sdk.C6782lli11;
import com.p118pd.sdk.ILI;
import com.p118pd.sdk.LlLI1;
import com.p118pd.sdk.i11ILLIi;
import com.p118pd.sdk.i1LlI;
import com.p118pd.sdk.iI11IL;
import com.p118pd.sdk.l1LILI1;
import com.p118pd.sdk.lIil1IL;
import com.p118pd.sdk.lliLLL;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;

public class X509CRLHolder implements i11ILLIi, Serializable {
    public static final long serialVersionUID = 20170722001L;
    public transient C5190I1lIiL OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient C5845LIillll f23883OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public transient iI11IL f23884OooO00o;
    public transient boolean OooO0O0;

    public X509CRLHolder(C5190I1lIiL r1) {
        OooO00o(r1);
    }

    public X509CRLHolder(InputStream inputStream) throws IOException {
        this(OooO00o(inputStream));
    }

    public X509CRLHolder(byte[] bArr) throws IOException {
        this(OooO00o(new ByteArrayInputStream(bArr)));
    }

    public static C5190I1lIiL OooO00o(InputStream inputStream) throws IOException {
        try {
            AbstractC6122iIlLiL OooO00o2 = new C5805Ll1(inputStream, true).OooO00o();
            if (OooO00o2 != null) {
                return C5190I1lIiL.OooO00o(OooO00o2);
            }
            throw new IOException("no content found");
        } catch (ClassCastException e) {
            throw new CertIOException("malformed data: " + e.getMessage(), e);
        } catch (IllegalArgumentException e2) {
            throw new CertIOException("malformed data: " + e2.getMessage(), e2);
        }
    }

    private void OooO00o(C5190I1lIiL r3) {
        this.OooO00o = r3;
        iI11IL OooO00o2 = r3.m15326OooO00o().m17901OooO00o();
        this.f23884OooO00o = OooO00o2;
        this.OooO0O0 = OooO00o(OooO00o2);
        this.f23883OooO00o = new C5845LIillll(new ILI(r3.m15324OooO00o()));
    }

    public static boolean OooO00o(iI11IL r2) {
        C5237III OooO00o2;
        return (r2 == null || (OooO00o2 = r2.OooO00o(C5237III.o00OoooO)) == null || !i1LlI.OooO00o(OooO00o2.m15435OooO0O0()).m16881OooO00o()) ? false : true;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        OooO00o(C5190I1lIiL.OooO00o(objectInputStream.readObject()));
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(getEncoded());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof X509CRLHolder)) {
            return false;
        }
        return this.OooO00o.equals(((X509CRLHolder) obj).OooO00o);
    }

    public Set getCriticalExtensionOIDs() {
        return lIil1IL.m17645OooO00o(this.f23884OooO00o);
    }

    @Override // com.p118pd.sdk.i11ILLIi
    public byte[] getEncoded() throws IOException {
        return this.OooO00o.getEncoded();
    }

    public C5237III getExtension(LlLI1 llLI1) {
        iI11IL r0 = this.f23884OooO00o;
        if (r0 != null) {
            return r0.OooO00o(llLI1);
        }
        return null;
    }

    public List getExtensionOIDs() {
        return lIil1IL.OooO00o(this.f23884OooO00o);
    }

    public iI11IL getExtensions() {
        return this.f23884OooO00o;
    }

    public l1LILI1 getIssuer() {
        return l1LILI1.OooO00o(this.OooO00o.m15324OooO00o());
    }

    public Set getNonCriticalExtensionOIDs() {
        return lIil1IL.OooO0O0(this.f23884OooO00o);
    }

    public C5235IIl getRevokedCertificate(BigInteger bigInteger) {
        C5237III OooO00o2;
        C5845LIillll r0 = this.f23883OooO00o;
        Enumeration OooO00o3 = this.OooO00o.m15327OooO00o();
        while (OooO00o3.hasMoreElements()) {
            C6782lli11.OooO0O0 oooO0O0 = (C6782lli11.OooO0O0) OooO00o3.nextElement();
            if (oooO0O0.m17910OooO00o().m17647OooO0O0().equals(bigInteger)) {
                return new C5235IIl(oooO0O0, this.OooO0O0, r0);
            }
            if (this.OooO0O0 && oooO0O0.m17911OooO00o() && (OooO00o2 = oooO0O0.m17909OooO00o().OooO00o(C5237III.o00Ooooo)) != null) {
                r0 = C5845LIillll.OooO00o(OooO00o2.m15435OooO0O0());
            }
        }
        return null;
    }

    public Collection getRevokedCertificates() {
        ArrayList arrayList = new ArrayList(this.OooO00o.m15328OooO00o().length);
        C5845LIillll r0 = this.f23883OooO00o;
        Enumeration OooO00o2 = this.OooO00o.m15327OooO00o();
        while (OooO00o2.hasMoreElements()) {
            C5235IIl r4 = new C5235IIl((C6782lli11.OooO0O0) OooO00o2.nextElement(), this.OooO0O0, r0);
            arrayList.add(r4);
            r0 = r4.OooO00o();
        }
        return arrayList;
    }

    public boolean hasExtensions() {
        return this.f23884OooO00o != null;
    }

    public int hashCode() {
        return this.OooO00o.hashCode();
    }

    public boolean isSignatureValid(AbstractC9449II r4) throws CertException {
        C6782lli11 OooO00o2 = this.OooO00o.m15326OooO00o();
        if (lIil1IL.OooO00o(OooO00o2.m17903OooO00o(), this.OooO00o.m15325OooO00o())) {
            try {
                lliLLL OooO00o3 = r4.OooO00o(OooO00o2.m17903OooO00o());
                OutputStream OooO00o4 = OooO00o3.m17912OooO00o();
                new C6119iIl1il(OooO00o4).OooO00o(OooO00o2);
                OooO00o4.close();
                return OooO00o3.verify(this.OooO00o.m15323OooO00o().OooO0O0());
            } catch (Exception e) {
                throw new CertException("unable to process signature: " + e.getMessage(), e);
            }
        } else {
            throw new CertException("signature invalid - algorithm identifier mismatch");
        }
    }

    public C5190I1lIiL toASN1Structure() {
        return this.OooO00o;
    }
}
