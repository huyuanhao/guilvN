package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.CMSSignerDigestMismatchException;
import org.bouncycastle.cms.CMSVerifierCertificateNotValidException;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.I丨Il  reason: invalid class name and case insensitive filesystem */
public class C5510IIl {
    public final I11L OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C1679L1 f15978OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final LlLI1 f15979OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final AbstractC5808Ll1I f15980OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6456l1ilL f15981OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final C6710li1 f15982OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9731lL1 f15983OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final boolean f15984OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final byte[] f15985OooO00o;
    public final I11L OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public final C6456l1ilL f15986OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public C9731lL1 f15987OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public byte[] f15988OooO0O0;

    public C5510IIl(C5510IIl r2) {
        this.f15982OooO00o = r2.f15982OooO00o;
        this.f15979OooO00o = r2.f15979OooO00o;
        this.f15984OooO00o = r2.m15769OooO00o();
        this.f15978OooO00o = r2.m15762OooO00o();
        this.f15981OooO00o = this.f15982OooO00o.m17803OooO00o();
        this.OooO00o = this.f15982OooO00o.OooO00o();
        this.OooO0O0 = this.f15982OooO00o.OooO0O0();
        this.f15986OooO0O0 = this.f15982OooO00o.m17808OooO0O0();
        this.f15985OooO00o = this.f15982OooO00o.m17805OooO00o().m17938OooO00o();
        this.f15980OooO00o = r2.f15980OooO00o;
        this.f15988OooO0O0 = r2.f15988OooO0O0;
    }

    public C5510IIl(C6710li1 r3, LlLI1 llLI1, AbstractC5808Ll1I r5, byte[] bArr) {
        C1679L1 l1;
        this.f15982OooO00o = r3;
        this.f15979OooO00o = llLI1;
        this.f15984OooO00o = llLI1 == null;
        C9542L OooO00o2 = r3.m17806OooO00o();
        boolean OooO00o3 = OooO00o2.OooO00o();
        AbstractC6854lLi1LL OooO0O02 = OooO00o2.m21602OooO0O0();
        if (OooO00o3) {
            l1 = new C1679L1(AbstractC6804llL1ii.OooO00o(OooO0O02).m17938OooO00o());
        } else {
            IIllLll1 OooO00o4 = IIllLll1.OooO00o(OooO0O02);
            l1 = new C1679L1(OooO00o4.OooO00o(), OooO00o4.m15417OooO00o().m17647OooO0O0());
        }
        this.f15978OooO00o = l1;
        this.f15981OooO00o = r3.m17803OooO00o();
        this.OooO00o = r3.OooO00o();
        this.OooO0O0 = r3.OooO0O0();
        this.f15986OooO0O0 = r3.m17808OooO0O0();
        this.f15985OooO00o = r3.m17805OooO00o().m17938OooO00o();
        this.f15980OooO00o = r5;
        this.f15988OooO0O0 = bArr;
    }

    public static C5510IIl OooO00o(C5510IIl r10, L1L1ll r11) {
        C6710li1 r0 = r10.f15982OooO00o;
        C9731lL1 OooO0O02 = r10.OooO0O0();
        iILLL1 OooO00o2 = OooO0O02 != null ? OooO0O02.m21785OooO00o() : new iILLL1();
        iILLL1 r2 = new iILLL1();
        for (C5510IIl r3 : r11.OooO00o()) {
            r2.OooO00o(r3.m15766OooO00o());
        }
        OooO00o2.OooO00o(new C9476LIL1li(AbstractC6651liIi.OooO0Oo, new i1I1I1l(r2)));
        return new C5510IIl(new C6710li1(r0.m17806OooO00o(), r0.m17803OooO00o(), r0.OooO00o(), r0.m17808OooO0O0(), r0.m17805OooO00o(), new i1I1I1l(OooO00o2)), r10.f15979OooO00o, r10.f15980OooO00o, null);
    }

    public static C5510IIl OooO00o(C5510IIl r10, C9731lL1 r11) {
        C6710li1 r0 = r10.f15982OooO00o;
        return new C5510IIl(new C6710li1(r0.m17806OooO00o(), r0.m17803OooO00o(), r0.OooO00o(), r0.m17808OooO0O0(), r0.m17805OooO00o(), r11 != null ? new i1I1I1l(r11.m21785OooO00o()) : null), r10.f15979OooO00o, r10.f15980OooO00o, null);
    }

    private AbstractC6122iIlLiL OooO00o(LlLI1 llLI1, String str) throws CMSException {
        iILLL1 OooO00o2;
        int OooO00o3;
        C9731lL1 OooO0O02 = OooO0O0();
        if (OooO0O02 == null || OooO0O02.OooO00o(llLI1).OooO00o() <= 0) {
            C9731lL1 OooO00o4 = m15767OooO00o();
            if (OooO00o4 == null || (OooO00o3 = (OooO00o2 = OooO00o4.OooO00o(llLI1)).OooO00o()) == 0) {
                return null;
            }
            if (OooO00o3 == 1) {
                I11L OooO00o5 = ((C9476LIL1li) OooO00o2.OooO00o(0)).OooO00o();
                if (OooO00o5.size() == 1) {
                    return OooO00o5.OooO00o(0).OooO0O0();
                }
                throw new CMSException("A " + str + " attribute MUST have a single attribute value");
            }
            throw new CMSException("The SignedAttributes in a signerInfo MUST NOT include multiple instances of the " + str + " attribute");
        }
        throw new CMSException("The " + str + " attribute MUST NOT be an unsigned attribute");
    }

    private C6656liIlil OooO00o() throws CMSException {
        AbstractC6122iIlLiL OooO00o2 = OooO00o(AbstractC6651liIi.OooO0OO, "signing-time");
        if (OooO00o2 == null) {
            return null;
        }
        try {
            return C6656liIlil.OooO00o(OooO00o2);
        } catch (IllegalArgumentException unused) {
            throw new CMSException("signing-time attribute value not a valid 'Time' structure");
        }
    }

    private byte[] OooO00o(AbstractC6854lLi1LL r1) throws IOException {
        if (r1 != null) {
            return r1.OooO0O0().getEncoded();
        }
        return null;
    }

    private boolean OooO0O0(iIiIliLi iiiilili) throws CMSException {
        String OooO00o2 = C6079iI11II.OooO00o.OooO00o(m15771OooO0O0());
        try {
            lliLLL OooO00o3 = iiiilili.OooO00o(this.f15986OooO0O0, this.f15982OooO00o.m17803OooO00o());
            try {
                OutputStream OooO00o4 = OooO00o3.m17912OooO00o();
                if (this.f15988OooO0O0 == null) {
                    I111LIL OooO00o5 = iiiilili.OooO00o(m15765OooO00o());
                    if (this.f15980OooO00o != null) {
                        OutputStream OooO00o6 = OooO00o5.m21370OooO00o();
                        if (this.OooO00o != null) {
                            this.f15980OooO00o.write(OooO00o6);
                            OooO00o4.write(OooO0OO());
                        } else if (OooO00o3 instanceof AbstractC9463L1iiI) {
                            this.f15980OooO00o.write(OooO00o6);
                        } else {
                            C5741LilILl r5 = new C5741LilILl(OooO00o6, OooO00o4);
                            this.f15980OooO00o.write(r5);
                            r5.close();
                        }
                        OooO00o6.close();
                    } else if (this.OooO00o != null) {
                        OooO00o4.write(OooO0OO());
                    } else {
                        throw new CMSException("data not encapsulated in signature - use detached constructor.");
                    }
                    this.f15988OooO0O0 = OooO00o5.m21371OooO00o();
                } else if (this.OooO00o != null) {
                    OooO00o4.write(OooO0OO());
                } else if (this.f15980OooO00o != null) {
                    this.f15980OooO00o.write(OooO00o4);
                }
                OooO00o4.close();
                AbstractC6122iIlLiL OooO00o7 = OooO00o(AbstractC6651liIi.OooO00o, "content-type");
                if (OooO00o7 == null) {
                    if (!this.f15984OooO00o && this.OooO00o != null) {
                        throw new CMSException("The content-type attribute type MUST be present whenever signed attributes are present in signed-data");
                    }
                } else if (this.f15984OooO00o) {
                    throw new CMSException("[For counter signatures,] the signedAttributes field MUST NOT contain a content-type attribute");
                } else if (!(OooO00o7 instanceof LlLI1)) {
                    throw new CMSException("content-type attribute value not of ASN.1 type 'OBJECT IDENTIFIER'");
                } else if (!((LlLI1) OooO00o7).equals(this.f15979OooO00o)) {
                    throw new CMSException("content-type attribute value does not match eContentType");
                }
                C9731lL1 OooO00o8 = m15767OooO00o();
                C9731lL1 OooO0O02 = OooO0O0();
                if (OooO0O02 == null || OooO0O02.OooO00o(AbstractC6651liIi.OooO0o).OooO00o() <= 0) {
                    if (OooO00o8 != null) {
                        iILLL1 OooO00o9 = OooO00o8.OooO00o(AbstractC6651liIi.OooO0o);
                        if (OooO00o9.OooO00o() > 1) {
                            throw new CMSException("Only one instance of a cmsAlgorithmProtect attribute can be present");
                        } else if (OooO00o9.OooO00o() > 0) {
                            C9476LIL1li OooO00o10 = C9476LIL1li.OooO00o(OooO00o9.OooO00o(0));
                            if (OooO00o10.OooO00o().size() == 1) {
                                C9515LillIL OooO00o11 = C9515LillIL.OooO00o(OooO00o10.m21531OooO00o()[0]);
                                if (!C5799LllI.OooO00o(OooO00o11.OooO00o(), this.f15982OooO00o.m17803OooO00o())) {
                                    throw new CMSException("CMS Algorithm Identifier Protection check failed for digestAlgorithm");
                                } else if (!C5799LllI.OooO00o(OooO00o11.OooO0OO(), this.f15982OooO00o.m17808OooO0O0())) {
                                    throw new CMSException("CMS Algorithm Identifier Protection check failed for signatureAlgorithm");
                                }
                            } else {
                                throw new CMSException("A cmsAlgorithmProtect attribute MUST contain exactly one value");
                            }
                        }
                    }
                    AbstractC6122iIlLiL OooO00o12 = OooO00o(AbstractC6651liIi.OooO0O0, "message-digest");
                    if (OooO00o12 == null) {
                        if (this.OooO00o != null) {
                            throw new CMSException("the message-digest signed attribute type MUST be present when there are any signed attributes present");
                        }
                    } else if (!(OooO00o12 instanceof AbstractC6804llL1ii)) {
                        throw new CMSException("message-digest attribute value not of ASN.1 type 'OCTET STRING'");
                    } else if (!C9586iIILl.OooO0O0(this.f15988OooO0O0, ((AbstractC6804llL1ii) OooO00o12).m17938OooO00o())) {
                        throw new CMSSignerDigestMismatchException("message-digest attribute value does not match calculated value");
                    }
                    if (OooO00o8 == null || OooO00o8.OooO00o(AbstractC6651liIi.OooO0Oo).OooO00o() <= 0) {
                        C9731lL1 OooO0O03 = OooO0O0();
                        if (OooO0O03 != null) {
                            iILLL1 OooO00o13 = OooO0O03.OooO00o(AbstractC6651liIi.OooO0Oo);
                            for (int i = 0; i < OooO00o13.OooO00o(); i++) {
                                if (C9476LIL1li.OooO00o(OooO00o13.OooO00o(i)).OooO00o().size() < 1) {
                                    throw new CMSException("A countersignature attribute MUST contain at least one AttributeValue");
                                }
                            }
                        }
                        try {
                            if (this.OooO00o != null || this.f15988OooO0O0 == null || !(OooO00o3 instanceof AbstractC9463L1iiI)) {
                                return OooO00o3.verify(OooO0o0());
                            }
                            AbstractC9463L1iiI r2 = (AbstractC9463L1iiI) OooO00o3;
                            return OooO00o2.equals(C7491o0OoOOO.OooO00o) ? r2.OooO00o(new C6052i1l(new C6456l1ilL(this.f15981OooO00o.OooO00o(), C6452l1Lll.OooO00o), this.f15988OooO0O0).OooO00o(AbstractC5533IiL.OooO00o), OooO0o0()) : r2.OooO00o(this.f15988OooO0O0, OooO0o0());
                        } catch (IOException e) {
                            throw new CMSException("can't process mime object to create signature.", e);
                        }
                    } else {
                        throw new CMSException("A countersignature attribute MUST NOT be a signed attribute");
                    }
                } else {
                    throw new CMSException("A cmsAlgorithmProtect attribute MUST be a signed attribute");
                }
            } catch (IOException e2) {
                throw new CMSException("can't process mime object to create signature.", e2);
            } catch (OperatorCreationException e3) {
                throw new CMSException("can't create digest calculator: " + e3.getMessage(), e3);
            }
        } catch (OperatorCreationException e4) {
            throw new CMSException("can't create content verifier: " + e4.getMessage(), e4);
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m15761OooO00o() {
        return this.f15982OooO00o.m17804OooO00o().m17647OooO0O0().intValue();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C1679L1 m15762OooO00o() {
        return this.f15978OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public L1L1ll m15763OooO00o() {
        C9731lL1 OooO0O02 = OooO0O0();
        if (OooO0O02 == null) {
            return new L1L1ll(new ArrayList(0));
        }
        ArrayList arrayList = new ArrayList();
        iILLL1 OooO00o2 = OooO0O02.OooO00o(AbstractC6651liIi.OooO0Oo);
        for (int i = 0; i < OooO00o2.OooO00o(); i++) {
            I11L OooO00o3 = ((C9476LIL1li) OooO00o2.OooO00o(i)).OooO00o();
            OooO00o3.size();
            Enumeration OooO00o4 = OooO00o3.m15215OooO00o();
            while (OooO00o4.hasMoreElements()) {
                arrayList.add(new C5510IIl(C6710li1.OooO00o(OooO00o4.nextElement()), null, new C6438l11L1(OooO0o0()), null));
            }
        }
        return new L1L1ll(arrayList);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public LlLI1 m15764OooO00o() {
        return this.f15979OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6456l1ilL m15765OooO00o() {
        return this.f15981OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C6710li1 m15766OooO00o() {
        return this.f15982OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C9731lL1 m15767OooO00o() {
        I11L i11l = this.OooO00o;
        if (i11l != null && this.f15983OooO00o == null) {
            this.f15983OooO00o = new C9731lL1(i11l);
        }
        return this.f15983OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15768OooO00o() {
        return this.f15981OooO00o.OooO00o().m16387OooO0O0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m15769OooO00o() {
        return this.f15984OooO00o;
    }

    public boolean OooO00o(iIiIliLi iiiilili) throws CMSException {
        C6656liIlil OooO00o2 = OooO00o();
        if (!iiiilili.m16972OooO00o() || OooO00o2 == null || iiiilili.OooO00o().isValidOn(OooO00o2.OooO00o())) {
            return OooO0O0(iiiilili);
        }
        throw new CMSVerifierCertificateNotValidException("verifier not valid at signingTime");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m15770OooO00o() {
        byte[] bArr = this.f15988OooO0O0;
        if (bArr != null) {
            return C9586iIILl.m21630OooO00o(bArr);
        }
        throw new IllegalStateException("method can only be called after verify.");
    }

    public C9731lL1 OooO0O0() {
        I11L i11l = this.OooO0O0;
        if (i11l != null && this.f15987OooO0O0 == null) {
            this.f15987OooO0O0 = new C9731lL1(i11l);
        }
        return this.f15987OooO0O0;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m15771OooO0O0() {
        return this.f15986OooO0O0.OooO00o().m16387OooO0O0();
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public byte[] m15772OooO0O0() {
        try {
            return OooO00o(this.f15981OooO00o.m17587OooO0O0());
        } catch (Exception e) {
            throw new RuntimeException("exception getting digest parameters " + e);
        }
    }

    public byte[] OooO0OO() throws IOException {
        I11L i11l = this.OooO00o;
        if (i11l != null) {
            return i11l.OooO00o(AbstractC5533IiL.OooO00o);
        }
        return null;
    }

    public byte[] OooO0Oo() {
        try {
            return OooO00o(this.f15986OooO0O0.m17587OooO0O0());
        } catch (Exception e) {
            throw new RuntimeException("exception getting encryption parameters " + e);
        }
    }

    public byte[] OooO0o0() {
        return C9586iIILl.m21630OooO00o(this.f15985OooO00o);
    }
}
