package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSAttributeTableGenerationException;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.tsp.TSPException;

/* renamed from: com.pd.sdk.il丨11ii1  reason: invalid class name */
public class il11ii1 {
    public static final int OooO0o = 1;
    public static final int OooO0o0 = 0;
    public static final int OooO0oO = 2;
    public static final int OooO0oo = 3;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ILI f18085OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LlLI1 f18086OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6248iiLLi f18087OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List f18088OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Locale f18089OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map f18090OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18091OooO00o;
    public int OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public List f18092OooO0O0;
    public int OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public List f18093OooO0OO;
    public int OooO0Oo;

    /* renamed from: com.pd.sdk.il丨11ii1$OooO00o */
    public class OooO00o implements AbstractC9852lIli {
        public final /* synthetic */ C6248iiLLi OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ i1Ii11l f18095OooO00o;

        public OooO00o(C6248iiLLi iilli, i1Ii11l r3) {
            this.OooO00o = iilli;
            this.f18095OooO00o = r3;
        }

        @Override // com.p118pd.sdk.AbstractC9852lIli
        public C9731lL1 OooO00o(Map map) throws CMSAttributeTableGenerationException {
            C9731lL1 OooO00o2 = this.OooO00o.m17260OooO00o().OooO00o(map);
            return OooO00o2.m21787OooO00o(AbstractC5711LiLli.o000OoO) == null ? OooO00o2.OooO00o(AbstractC5711LiLli.o000OoO, new C9606iLL(this.f18095OooO00o)) : OooO00o2;
        }
    }

    /* renamed from: com.pd.sdk.il丨11ii1$OooO0O0 */
    public class OooO0O0 implements AbstractC9852lIli {
        public final /* synthetic */ C6172iLLlI OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ C6248iiLLi f18096OooO00o;

        public OooO0O0(C6248iiLLi iilli, C6172iLLlI illli) {
            this.f18096OooO00o = iilli;
            this.OooO00o = illli;
        }

        @Override // com.p118pd.sdk.AbstractC9852lIli
        public C9731lL1 OooO00o(Map map) throws CMSAttributeTableGenerationException {
            C9731lL1 OooO00o2 = this.f18096OooO00o.m17260OooO00o().OooO00o(map);
            return OooO00o2.m21787OooO00o(AbstractC5711LiLli.o000O0o) == null ? OooO00o2.OooO00o(AbstractC5711LiLli.o000O0o, new C6272iilIl(this.OooO00o)) : OooO00o2;
        }
    }

    public il11ii1(C6248iiLLi iilli, I111LIL r3, LlLI1 llLI1) throws IllegalArgumentException, TSPException {
        this(iilli, r3, llLI1, false);
    }

    public il11ii1(C6248iiLLi iilli, I111LIL r7, LlLI1 llLI1, boolean z) throws IllegalArgumentException, TSPException {
        C6248iiLLi iilli2;
        this.OooO00o = 0;
        C93041iI1l r1 = null;
        this.f18089OooO00o = null;
        this.OooO0O0 = -1;
        this.OooO0OO = -1;
        this.OooO0Oo = -1;
        this.f18091OooO00o = false;
        this.f18085OooO00o = null;
        this.f18088OooO00o = new ArrayList();
        this.f18092OooO0O0 = new ArrayList();
        this.f18093OooO0OO = new ArrayList();
        this.f18090OooO00o = new HashMap();
        this.f18087OooO00o = iilli;
        this.f18086OooO00o = llLI1;
        if (iilli.m17263OooO00o()) {
            X509CertificateHolder OooO00o2 = iilli.m17262OooO00o();
            IL11iL.OooO00o(OooO00o2);
            try {
                OutputStream OooO00o3 = r7.m21370OooO00o();
                OooO00o3.write(OooO00o2.getEncoded());
                OooO00o3.close();
                if (r7.OooO00o().OooO00o().equals(AbstractC9733l.OooO)) {
                    iilli2 = new C6248iiLLi(iilli, new OooO00o(iilli, new i1Ii11l(r7.m21371OooO00o(), z ? new C93041iI1l(new C5845LIillll(new ILI(OooO00o2.getIssuer())), OooO00o2.getSerialNumber()) : r1)), iilli.OooO0O0());
                } else {
                    iilli2 = new C6248iiLLi(iilli, new OooO0O0(iilli, new C6172iLLlI(new C6456l1ilL(r7.OooO00o().OooO00o()), r7.m21371OooO00o(), z ? new C93041iI1l(new C5845LIillll(new ILI(OooO00o2.getIssuer())), new C6513lIiI(OooO00o2.getSerialNumber())) : r1)), iilli.OooO0O0());
                }
                this.f18087OooO00o = iilli2;
            } catch (IOException e) {
                throw new TSPException("Exception processing certificate.", e);
            }
        } else {
            throw new IllegalArgumentException("SignerInfoGenerator must have an associated certificate");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0067, code lost:
        if (r1.length() > r4) goto L_0x0072;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0070, code lost:
        if (r1.length() > r4) goto L_0x0072;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0086 A[LOOP:0: B:21:0x0079->B:23:0x0086, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0096  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.p118pd.sdk.C9623il OooO00o(java.util.Date r6) throws org.bouncycastle.tsp.TSPException {
        /*
        // Method dump skipped, instructions count: 171
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.il11ii1.OooO00o(java.util.Date):com.pd.sdk.丨il");
    }

    public C9448Il OooO00o(C1LI1l r2, BigInteger bigInteger, Date date) throws TSPException {
        return OooO00o(r2, bigInteger, date, null);
    }

    public C9448Il OooO00o(C1LI1l r17, BigInteger bigInteger, Date date, iI11IL r20) throws TSPException {
        C9521Ll r11;
        iI11IL r15;
        C9623il r10;
        C6506lIi lii = new C6506lIi(new C6456l1ilL(r17.m21827OooO00o(), C6452l1Lll.OooO00o), r17.m21836OooO0O0());
        if (this.OooO0O0 > 0 || this.OooO0OO > 0 || this.OooO0Oo > 0) {
            int i = this.OooO0O0;
            C6513lIiI r5 = i > 0 ? new C6513lIiI((long) i) : null;
            int i2 = this.OooO0OO;
            C6513lIiI r6 = i2 > 0 ? new C6513lIiI((long) i2) : null;
            int i3 = this.OooO0Oo;
            r11 = new C9521Ll(r5, r6, i3 > 0 ? new C6513lIiI((long) i3) : null);
        } else {
            r11 = null;
        }
        boolean z = this.f18091OooO00o;
        C5514IL OooO00o2 = z ? C5514IL.OooO00o(z) : null;
        C6513lIiI r13 = r17.m21829OooO00o() != null ? new C6513lIiI(r17.m21829OooO00o()) : null;
        LlLI1 llLI1 = this.f18086OooO00o;
        if (r17.OooO0O0() != null) {
            llLI1 = r17.OooO0O0();
        }
        iI11IL OooO00o3 = r17.m21828OooO00o();
        if (r20 != null) {
            L11l1i r4 = new L11l1i();
            if (OooO00o3 != null) {
                Enumeration OooO00o4 = OooO00o3.OooO00o();
                while (OooO00o4.hasMoreElements()) {
                    r4.OooO00o(OooO00o3.OooO00o(LlLI1.OooO00o(OooO00o4.nextElement())));
                }
            }
            Enumeration OooO00o5 = r20.OooO00o();
            while (OooO00o5.hasMoreElements()) {
                r4.OooO00o(r20.OooO00o(LlLI1.OooO00o(OooO00o5.nextElement())));
            }
            r15 = r4.OooO00o();
        } else {
            r15 = OooO00o3;
        }
        if (this.OooO00o == 0) {
            Locale locale = this.f18089OooO00o;
            r10 = locale == null ? new C9623il(date) : new C9623il(date, locale);
        } else {
            r10 = OooO00o(date);
        }
        C6188iLl1 ill1 = new C6188iLl1(llLI1, lii, new C6513lIiI(bigInteger), r10, r11, OooO00o2, r13, this.f18085OooO00o, r15);
        try {
            ILlllLi r2 = new ILlllLi();
            if (r17.m21832OooO00o()) {
                r2.OooO0OO(new C5607LI1I1iI(this.f18088OooO00o));
                r2.OooO00o(new C5607LI1I1iI(this.f18093OooO0OO));
            }
            r2.OooO0O0(new C5607LI1I1iI(this.f18092OooO0O0));
            if (!this.f18090OooO00o.isEmpty()) {
                for (LlLI1 llLI12 : this.f18090OooO00o.keySet()) {
                    r2.OooO00o(llLI12, new C5607LI1I1iI((Collection) this.f18090OooO00o.get(llLI12)));
                }
            }
            r2.OooO00o(this.f18087OooO00o);
            return new C9448Il(r2.OooO00o((AbstractC5563Il) new C6438l11L1(AbstractC5711LiLli.o000OO, ill1.OooO00o(AbstractC5533IiL.OooO00o)), true));
        } catch (CMSException e) {
            throw new TSPException("Error generating time-stamp token", e);
        } catch (IOException e2) {
            throw new TSPException("Exception encoding info", e2);
        }
    }

    public void OooO00o(int i) {
        this.OooO0Oo = i;
    }

    public void OooO00o(ILI ili) {
        this.f18085OooO00o = ili;
    }

    public void OooO00o(LlLI1 llLI1, AbstractC6271iilI iili) {
        this.f18090OooO00o.put(llLI1, iili.OooO00o(null));
    }

    public void OooO00o(AbstractC6271iilI iili) {
        this.f18093OooO0OO.addAll(iili.OooO00o(null));
    }

    public void OooO00o(Locale locale) {
        this.f18089OooO00o = locale;
    }

    public void OooO00o(boolean z) {
        this.f18091OooO00o = z;
    }

    public void OooO0O0(int i) {
        this.OooO0OO = i;
    }

    public void OooO0O0(AbstractC6271iilI iili) {
        this.f18092OooO0O0.addAll(iili.OooO00o(null));
    }

    public void OooO0OO(int i) {
        this.OooO0O0 = i;
    }

    public void OooO0OO(AbstractC6271iilI iili) {
        this.f18088OooO00o.addAll(iili.OooO00o(null));
    }

    public void OooO0Oo(int i) {
        this.OooO00o = i;
    }
}
