package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.iiLLi  reason: case insensitive filesystem */
public class C6248iiLLi {
    public final Lii1ii1 OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6092iILIii f17874OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC6817lI f17875OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final I111LIL f17876OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C9542L f17877OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC9852lIli f17878OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public X509CertificateHolder f17879OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f17880OooO00o;
    public final AbstractC9852lIli OooO0O0;

    public C6248iiLLi(C6248iiLLi iilli, AbstractC9852lIli r3, AbstractC9852lIli r4) {
        this.f17874OooO00o = new C6056i1I();
        this.f17880OooO00o = null;
        this.f17877OooO00o = iilli.f17877OooO00o;
        this.OooO00o = iilli.OooO00o;
        this.f17876OooO00o = iilli.f17876OooO00o;
        this.f17875OooO00o = iilli.f17875OooO00o;
        this.f17878OooO00o = r3;
        this.OooO0O0 = r4;
    }

    public C6248iiLLi(C9542L r7, Lii1ii1 r8, AbstractC6290ii r9, AbstractC6817lI r10) throws OperatorCreationException {
        this(r7, r8, r9, r10, false);
    }

    public C6248iiLLi(C9542L r3, Lii1ii1 r4, AbstractC6290ii r5, AbstractC6817lI r6, AbstractC9852lIli r7, AbstractC9852lIli r8) throws OperatorCreationException {
        C6056i1I r0 = new C6056i1I();
        this.f17874OooO00o = r0;
        this.f17880OooO00o = null;
        this.f17877OooO00o = r3;
        this.OooO00o = r4;
        if (r5 != null) {
            this.f17876OooO00o = r5.OooO00o(r0.OooO00o(r4.OooO00o()));
        } else {
            this.f17876OooO00o = null;
        }
        this.f17878OooO00o = r7;
        this.OooO0O0 = r8;
        this.f17875OooO00o = r6;
    }

    public C6248iiLLi(C9542L r3, Lii1ii1 r4, AbstractC6290ii r5, AbstractC6817lI r6, boolean z) throws OperatorCreationException {
        C6056i1I r0 = new C6056i1I();
        this.f17874OooO00o = r0;
        this.f17880OooO00o = null;
        this.f17877OooO00o = r3;
        this.OooO00o = r4;
        if (r5 != null) {
            this.f17876OooO00o = r5.OooO00o(r0.OooO00o(r4.OooO00o()));
        } else {
            this.f17876OooO00o = null;
        }
        if (z) {
            this.f17878OooO00o = null;
        } else {
            this.f17878OooO00o = new C9561i111();
        }
        this.OooO0O0 = null;
        this.f17875OooO00o = r6;
    }

    private I11L OooO00o(C9731lL1 r2) {
        if (r2 != null) {
            return new i1I1I1l(r2.m21785OooO00o());
        }
        return null;
    }

    private Map OooO00o(LlLI1 llLI1, C6456l1ilL r4, C6456l1ilL r5, byte[] bArr) {
        HashMap hashMap = new HashMap();
        if (llLI1 != null) {
            hashMap.put(AbstractC9852lIli.OooO00o, llLI1);
        }
        hashMap.put(AbstractC9852lIli.OooO0Oo, r4);
        hashMap.put(AbstractC9852lIli.OooO0o, r5);
        hashMap.put(AbstractC9852lIli.OooO0O0, C9586iIILl.m21630OooO00o(bArr));
        return hashMap;
    }

    public int OooO00o() {
        return this.f17877OooO00o.OooO00o() ? 3 : 1;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m17258OooO00o() {
        I111LIL r0 = this.f17876OooO00o;
        return r0 != null ? r0.OooO00o() : this.f17874OooO00o.OooO00o(this.OooO00o.OooO00o());
    }

    public C6710li1 OooO00o(LlLI1 llLI1) throws CMSException {
        I11L i11l;
        C6456l1ilL r4;
        I11L i11l2;
        C6456l1ilL r0;
        try {
            C6456l1ilL OooO00o2 = this.f17875OooO00o.OooO00o(this.OooO00o.OooO00o());
            if (this.f17878OooO00o != null) {
                C6456l1ilL OooO00o3 = this.f17876OooO00o.OooO00o();
                this.f17880OooO00o = this.f17876OooO00o.m21371OooO00o();
                I11L OooO00o4 = OooO00o(this.f17878OooO00o.OooO00o(Collections.unmodifiableMap(OooO00o(llLI1, this.f17876OooO00o.OooO00o(), OooO00o2, this.f17880OooO00o))));
                OutputStream OooO00o5 = this.OooO00o.m16310OooO00o();
                OooO00o5.write(OooO00o4.OooO00o(AbstractC5533IiL.OooO00o));
                OooO00o5.close();
                r4 = OooO00o3;
                i11l = OooO00o4;
            } else {
                if (this.f17876OooO00o != null) {
                    r0 = this.f17876OooO00o.OooO00o();
                    this.f17880OooO00o = this.f17876OooO00o.m21371OooO00o();
                } else {
                    r0 = this.f17874OooO00o.OooO00o(this.OooO00o.OooO00o());
                    this.f17880OooO00o = null;
                }
                r4 = r0;
                i11l = null;
            }
            byte[] signature = this.OooO00o.getSignature();
            if (this.OooO0O0 != null) {
                Map OooO00o6 = OooO00o(llLI1, r4, OooO00o2, this.f17880OooO00o);
                OooO00o6.put(AbstractC9852lIli.OooO0OO, C9586iIILl.m21630OooO00o(signature));
                i11l2 = OooO00o(this.OooO0O0.OooO00o(Collections.unmodifiableMap(OooO00o6)));
            } else {
                i11l2 = null;
            }
            return new C6710li1(this.f17877OooO00o, r4, i11l, OooO00o2, new C6487lIIiIlL(signature), i11l2);
        } catch (IOException e) {
            throw new CMSException("encoding error.", e);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9542L m17259OooO00o() {
        return this.f17877OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9852lIli m17260OooO00o() {
        return this.f17878OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public OutputStream m17261OooO00o() {
        I111LIL r0 = this.f17876OooO00o;
        return r0 != null ? this.f17878OooO00o == null ? new C5741LilILl(this.f17876OooO00o.m21370OooO00o(), this.OooO00o.m16310OooO00o()) : r0.m21370OooO00o() : this.OooO00o.m16310OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public X509CertificateHolder m17262OooO00o() {
        return this.f17879OooO00o;
    }

    public void OooO00o(X509CertificateHolder x509CertificateHolder) {
        this.f17879OooO00o = x509CertificateHolder;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17263OooO00o() {
        return this.f17879OooO00o != null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17264OooO00o() {
        byte[] bArr = this.f17880OooO00o;
        if (bArr != null) {
            return C9586iIILl.m21630OooO00o(bArr);
        }
        return null;
    }

    public AbstractC9852lIli OooO0O0() {
        return this.OooO0O0;
    }
}
