package com.p118pd.sdk;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.cert.X509AttributeCertificateHolder;
import org.bouncycastle.cert.X509CRLHolder;
import org.bouncycastle.cert.X509CertificateHolder;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.operator.OperatorCreationException;

/* renamed from: com.pd.sdk.iiiLLi1丨  reason: invalid class name */
public class iiiLLi1 implements i11ILLIi {
    public static final C6079iI11II OooO00o = C6079iI11II.OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC5563Il f17907OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5575L11Li f17908OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public L1L1ll f17909OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5753LiI1 f17910OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map f17911OooO00o;

    /* renamed from: com.pd.sdk.iiiLLi1丨$OooO00o */
    public class OooO00o implements AbstractC5563Il {
        public final /* synthetic */ AbstractC5808Ll1I OooO00o;

        public OooO00o(AbstractC5808Ll1I r2) {
            this.OooO00o = r2;
        }

        @Override // com.p118pd.sdk.AbstractC5563Il, com.p118pd.sdk.AbstractC5808Ll1I
        public LlLI1 OooO00o() {
            return iiiLLi1.this.f17908OooO00o.m15880OooO00o().OooO00o();
        }

        @Override // com.p118pd.sdk.AbstractC5563Il, com.p118pd.sdk.AbstractC5808Ll1I
        /* renamed from: OooO00o  reason: collision with other method in class */
        public Object m17287OooO00o() {
            return this.OooO00o.OooO00o();
        }

        @Override // com.p118pd.sdk.AbstractC5808Ll1I
        public void write(OutputStream outputStream) throws IOException, CMSException {
            this.OooO00o.write(outputStream);
        }
    }

    public iiiLLi1(C5753LiI1 r3) throws CMSException {
        this.f17910OooO00o = r3;
        C5575L11Li OooO00o2 = OooO00o();
        this.f17908OooO00o = OooO00o2;
        AbstractC6854lLi1LL OooO0O0 = OooO00o2.m15880OooO00o().m16341OooO0O0();
        if (OooO0O0 != null) {
            this.f17907OooO00o = OooO0O0 instanceof AbstractC6804llL1ii ? new C6438l11L1(this.f17908OooO00o.m15880OooO00o().OooO00o(), ((AbstractC6804llL1ii) OooO0O0).m17938OooO00o()) : new L111I1(this.f17908OooO00o.m15880OooO00o().OooO00o(), OooO0O0);
        } else {
            this.f17907OooO00o = null;
        }
    }

    public iiiLLi1(AbstractC5808Ll1I r2, C5753LiI1 r3) throws CMSException {
        if (r2 instanceof AbstractC5563Il) {
            this.f17907OooO00o = (AbstractC5563Il) r2;
        } else {
            this.f17907OooO00o = new OooO00o(r2);
        }
        this.f17910OooO00o = r3;
        this.f17908OooO00o = OooO00o();
    }

    public iiiLLi1(AbstractC5808Ll1I r2, InputStream inputStream) throws CMSException {
        this(r2, C5799LllI.OooO00o((InputStream) new C5805Ll1(inputStream)));
    }

    public iiiLLi1(AbstractC5808Ll1I r1, byte[] bArr) throws CMSException {
        this(r1, C5799LllI.OooO00o(bArr));
    }

    public iiiLLi1(iiiLLi1 r2) {
        this.f17908OooO00o = r2.f17908OooO00o;
        this.f17910OooO00o = r2.f17910OooO00o;
        this.f17907OooO00o = r2.f17907OooO00o;
        this.f17909OooO00o = r2.f17909OooO00o;
    }

    public iiiLLi1(InputStream inputStream) throws CMSException {
        this(C5799LllI.OooO00o(inputStream));
    }

    public iiiLLi1(Map map, C5753LiI1 r2) throws CMSException {
        this.f17911OooO00o = map;
        this.f17910OooO00o = r2;
        this.f17908OooO00o = OooO00o();
    }

    public iiiLLi1(Map map, byte[] bArr) throws CMSException {
        this(map, C5799LllI.OooO00o(bArr));
    }

    public iiiLLi1(byte[] bArr) throws CMSException {
        this(C5799LllI.OooO00o(bArr));
    }

    private C5575L11Li OooO00o() throws CMSException {
        try {
            return C5575L11Li.OooO00o(this.f17910OooO00o.m16341OooO0O0());
        } catch (ClassCastException e) {
            throw new CMSException("Malformed content.", e);
        } catch (IllegalArgumentException e2) {
            throw new CMSException("Malformed content.", e2);
        }
    }

    public static iiiLLi1 OooO00o(iiiLLi1 r6, L1L1ll r7) {
        iiiLLi1 r0 = new iiiLLi1(r6);
        r0.f17909OooO00o = r7;
        iILLL1 r1 = new iILLL1();
        iILLL1 r2 = new iILLL1();
        for (C5510IIl r3 : r7.OooO00o()) {
            r1.OooO00o(C6079iI11II.OooO00o.OooO00o(r3.m15765OooO00o()));
            r2.OooO00o(r3.m15766OooO00o());
        }
        i1I1I1l r72 = new i1I1I1l(r1);
        i1I1I1l r12 = new i1I1I1l(r2);
        I11li1 i11li1 = (I11li1) r6.f17908OooO00o.m15882OooO0O0();
        iILLL1 r22 = new iILLL1();
        r22.OooO00o(i11li1.OooO00o(0));
        r22.OooO00o(r72);
        for (int i = 2; i != i11li1.size() - 1; i++) {
            r22.OooO00o(i11li1.OooO00o(i));
        }
        r22.OooO00o(r12);
        r0.f17908OooO00o = C5575L11Li.OooO00o(new C6351ill(r22));
        r0.f17910OooO00o = new C5753LiI1(r0.f17910OooO00o.OooO00o(), r0.f17908OooO00o);
        return r0;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0030  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.p118pd.sdk.iiiLLi1 OooO00o(com.p118pd.sdk.iiiLLi1 r8, com.p118pd.sdk.AbstractC6271iilI r9, com.p118pd.sdk.AbstractC6271iilI r10, com.p118pd.sdk.AbstractC6271iilI r11) throws org.bouncycastle.cms.CMSException {
        /*
        // Method dump skipped, instructions count: 107
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.iiiLLi1.OooO00o(com.pd.sdk.iiiLLi1丨, com.pd.sdk.iilI, com.pd.sdk.iilI, com.pd.sdk.iilI):com.pd.sdk.iiiLLi1丨");
    }

    private boolean OooO00o(C5510IIl r3, AbstractC9737ll r4) throws OperatorCreationException, CMSException {
        if (!r3.OooO00o(r4.OooO00o(r3.m15762OooO00o()))) {
            return false;
        }
        for (C5510IIl r0 : r3.m15763OooO00o().OooO00o()) {
            if (!OooO00o(r0, r4)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public int m17278OooO00o() {
        return this.f17908OooO00o.m15881OooO00o().m17647OooO0O0().intValue();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC5563Il m17279OooO00o() {
        return this.f17907OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public L1L1ll m17280OooO00o() {
        Object obj;
        Map map;
        if (this.f17909OooO00o == null) {
            I11L OooO0Oo = this.f17908OooO00o.OooO0Oo();
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i != OooO0Oo.size(); i++) {
                C6710li1 OooO00o2 = C6710li1.OooO00o(OooO0Oo.OooO00o(i));
                LlLI1 OooO00o3 = this.f17908OooO00o.m15880OooO00o().OooO00o();
                Map map2 = this.f17911OooO00o;
                if (map2 == null) {
                    arrayList.add(new C5510IIl(OooO00o2, OooO00o3, this.f17907OooO00o, null));
                } else {
                    if (map2.keySet().iterator().next() instanceof String) {
                        map = this.f17911OooO00o;
                        obj = OooO00o2.m17803OooO00o().OooO00o().m16387OooO0O0();
                    } else {
                        map = this.f17911OooO00o;
                        obj = OooO00o2.m17803OooO00o().OooO00o();
                    }
                    arrayList.add(new C5510IIl(OooO00o2, OooO00o3, null, (byte[]) map.get(obj)));
                }
            }
            this.f17909OooO00o = new L1L1ll(arrayList);
        }
        return this.f17909OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5753LiI1 m17281OooO00o() {
        return this.f17910OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6271iilI<X509AttributeCertificateHolder> m17282OooO00o() {
        return OooO00o.OooO00o(this.f17908OooO00o.OooO0O0());
    }

    public AbstractC6271iilI OooO00o(LlLI1 llLI1) {
        return OooO00o.OooO00o(llLI1, this.f17908OooO00o.OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17283OooO00o() {
        return this.f17908OooO00o.m15880OooO00o().OooO00o().m16387OooO0O0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Set<C6456l1ilL> m17284OooO00o() {
        HashSet hashSet = new HashSet(this.f17908OooO00o.OooO0OO().size());
        Enumeration OooO00o2 = this.f17908OooO00o.OooO0OO().m15215OooO00o();
        while (OooO00o2.hasMoreElements()) {
            hashSet.add(C6456l1ilL.OooO00o(OooO00o2.nextElement()));
        }
        return Collections.unmodifiableSet(hashSet);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17285OooO00o() {
        return this.f17908OooO00o.m15880OooO00o().m16341OooO0O0() == null && this.f17908OooO00o.OooO0Oo().size() == 0;
    }

    public boolean OooO00o(AbstractC9737ll r2) throws CMSException {
        return OooO00o(r2, false);
    }

    public boolean OooO00o(AbstractC9737ll r5, boolean z) throws CMSException {
        for (C5510IIl r1 : m17280OooO00o().OooO00o()) {
            try {
                if (!r1.OooO00o(r5.OooO00o(r1.m15762OooO00o()))) {
                    return false;
                }
                if (!z) {
                    for (C5510IIl r2 : r1.m15763OooO00o().OooO00o()) {
                        if (!OooO00o(r2, r5)) {
                            return false;
                        }
                    }
                    continue;
                }
            } catch (OperatorCreationException e) {
                throw new CMSException("failure in verifier provider: " + e.getMessage(), e);
            }
        }
        return true;
    }

    public AbstractC6271iilI<X509CRLHolder> OooO0O0() {
        return OooO00o.OooO0O0(this.f17908OooO00o.OooO00o());
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public boolean m17286OooO0O0() {
        return this.f17908OooO00o.m15880OooO00o().m16341OooO0O0() == null && this.f17908OooO00o.OooO0Oo().size() > 0;
    }

    public AbstractC6271iilI<X509CertificateHolder> OooO0OO() {
        return OooO00o.OooO0OO(this.f17908OooO00o.OooO0O0());
    }

    @Override // com.p118pd.sdk.i11ILLIi
    public byte[] getEncoded() throws IOException {
        return this.f17910OooO00o.getEncoded();
    }
}
