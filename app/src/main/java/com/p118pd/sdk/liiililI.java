package com.p118pd.sdk;

import com.p118pd.sdk.C6782lli11;
import java.io.IOException;
import java.math.BigInteger;
import java.security.cert.CRLException;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import javax.security.auth.x500.X500Principal;
import org.bouncycastle.util.Strings;

/* renamed from: com.pd.sdk.liiililI */
public class liiililI extends X509CRLEntry {
    public l1LILI1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6782lli11.OooO0O0 f18627OooO00o;
    public boolean OooO0O0;
    public int o00oO0O;

    public liiililI(C6782lli11.OooO0O0 oooO0O0) {
        this.f18627OooO00o = oooO0O0;
        this.OooO00o = null;
    }

    public liiililI(C6782lli11.OooO0O0 oooO0O0, boolean z, l1LILI1 r3) {
        this.f18627OooO00o = oooO0O0;
        this.OooO00o = OooO00o(z, r3);
    }

    private C5237III OooO00o(LlLI1 llLI1) {
        iI11IL OooO00o2 = this.f18627OooO00o.m17909OooO00o();
        if (OooO00o2 != null) {
            return OooO00o2.OooO00o(llLI1);
        }
        return null;
    }

    private l1LILI1 OooO00o(boolean z, l1LILI1 r5) {
        if (!z) {
            return null;
        }
        C5237III OooO00o2 = OooO00o(C5237III.o00Ooooo);
        if (OooO00o2 == null) {
            return r5;
        }
        try {
            ILI[] OooO00o3 = C5845LIillll.OooO00o(OooO00o2.m15435OooO0O0()).OooO00o();
            for (int i = 0; i < OooO00o3.length; i++) {
                if (OooO00o3[i].OooO00o() == 4) {
                    return l1LILI1.OooO00o(OooO00o3[i].m15483OooO0O0());
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private Set OooO00o(boolean z) {
        iI11IL OooO00o2 = this.f18627OooO00o.m17909OooO00o();
        if (OooO00o2 == null) {
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof liiililI ? this.f18627OooO00o.equals(((liiililI) obj).f18627OooO00o) : super.equals(this);
    }

    public X500Principal getCertificateIssuer() {
        if (this.OooO00o == null) {
            return null;
        }
        try {
            return new X500Principal(this.OooO00o.getEncoded());
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.cert.X509Extension
    public Set getCriticalExtensionOIDs() {
        return OooO00o(true);
    }

    @Override // java.security.cert.X509CRLEntry
    public byte[] getEncoded() throws CRLException {
        try {
            return this.f18627OooO00o.OooO00o(AbstractC5533IiL.OooO00o);
        } catch (IOException e) {
            throw new CRLException(e.toString());
        }
    }

    public byte[] getExtensionValue(String str) {
        C5237III OooO00o2 = OooO00o(new LlLI1(str));
        if (OooO00o2 == null) {
            return null;
        }
        try {
            return OooO00o2.m15433OooO00o().getEncoded();
        } catch (Exception e) {
            throw new RuntimeException("error encoding " + e.toString());
        }
    }

    @Override // java.security.cert.X509Extension
    public Set getNonCriticalExtensionOIDs() {
        return OooO00o(false);
    }

    public Date getRevocationDate() {
        return this.f18627OooO00o.OooO00o().OooO00o();
    }

    public BigInteger getSerialNumber() {
        return this.f18627OooO00o.m17910OooO00o().m17647OooO0O0();
    }

    public boolean hasExtensions() {
        return this.f18627OooO00o.m17909OooO00o() != null;
    }

    public boolean hasUnsupportedCriticalExtension() {
        Set criticalExtensionOIDs = getCriticalExtensionOIDs();
        return criticalExtensionOIDs != null && !criticalExtensionOIDs.isEmpty();
    }

    public int hashCode() {
        if (!this.OooO0O0) {
            this.o00oO0O = super.hashCode();
            this.OooO0O0 = true;
        }
        return this.o00oO0O;
    }

    public String toString() {
        Object OooO00o2;
        StringBuffer stringBuffer = new StringBuffer();
        String OooO00o3 = Strings.m22984OooO00o();
        stringBuffer.append("      userCertificate: ");
        stringBuffer.append(getSerialNumber());
        stringBuffer.append(OooO00o3);
        stringBuffer.append("       revocationDate: ");
        stringBuffer.append(getRevocationDate());
        stringBuffer.append(OooO00o3);
        stringBuffer.append("       certificateIssuer: ");
        stringBuffer.append(getCertificateIssuer());
        stringBuffer.append(OooO00o3);
        iI11IL OooO00o4 = this.f18627OooO00o.m17909OooO00o();
        if (OooO00o4 != null) {
            Enumeration OooO00o5 = OooO00o4.OooO00o();
            if (OooO00o5.hasMoreElements()) {
                String str = "   crlEntryExtensions:";
                loop0:
                while (true) {
                    stringBuffer.append(str);
                    while (true) {
                        stringBuffer.append(OooO00o3);
                        while (true) {
                            if (!OooO00o5.hasMoreElements()) {
                                break loop0;
                            }
                            LlLI1 llLI1 = (LlLI1) OooO00o5.nextElement();
                            C5237III OooO00o6 = OooO00o4.OooO00o(llLI1);
                            if (OooO00o6.m15433OooO00o() != null) {
                                C5805Ll1 r8 = new C5805Ll1(OooO00o6.m15433OooO00o().m17938OooO00o());
                                stringBuffer.append("                       critical(");
                                stringBuffer.append(OooO00o6.m15434OooO00o());
                                stringBuffer.append(") ");
                                try {
                                    if (llLI1.equals(C5551IiL.OooO)) {
                                        OooO00o2 = LLl111.OooO00o(C5841L11I.OooO00o((Object) r8.OooO00o()));
                                    } else if (llLI1.equals(C5551IiL.OooOOO)) {
                                        stringBuffer.append("Certificate issuer: ");
                                        OooO00o2 = C5845LIillll.OooO00o(r8.OooO00o());
                                    } else {
                                        stringBuffer.append(llLI1.m16387OooO0O0());
                                        stringBuffer.append(" value = ");
                                        stringBuffer.append(C9878I1.OooO00o(r8.OooO00o()));
                                        stringBuffer.append(OooO00o3);
                                    }
                                    stringBuffer.append(OooO00o2);
                                    stringBuffer.append(OooO00o3);
                                } catch (Exception unused) {
                                    stringBuffer.append(llLI1.m16387OooO0O0());
                                    stringBuffer.append(" value = ");
                                    str = "*****";
                                }
                            }
                        }
                    }
                }
            }
        }
        return stringBuffer.toString();
    }
}
