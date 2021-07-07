package com.p118pd.sdk;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.Il1丨  reason: invalid class name and case insensitive filesystem */
public class C5422Il1 extends C6097iILii {
    public static final C6079iI11II OooO00o = C6079iI11II.OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public I11L f15798OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5200IILli f15799OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public L1L1ll f15800OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LlLI1 f15801OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6001i11LI f15802OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map f15803OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Set<C6456l1ilL> f15804OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f15805OooO00o;
    public I11L OooO0O0;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C5422Il1(com.p118pd.sdk.AbstractC6290ii r5, com.p118pd.sdk.C5200IILli r6, java.io.InputStream r7) throws org.bouncycastle.cms.CMSException {
        /*
        // Method dump skipped, instructions count: 179
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C5422Il1.<init>(com.pd.sdk.ii丨丨, com.pd.sdk.IILli, java.io.InputStream):void");
    }

    public C5422Il1(AbstractC6290ii r2, C5200IILli iILli, byte[] bArr) throws CMSException {
        this(r2, iILli, new ByteArrayInputStream(bArr));
    }

    public C5422Il1(AbstractC6290ii r2, InputStream inputStream) throws CMSException {
        this(r2, (C5200IILli) null, inputStream);
    }

    public C5422Il1(AbstractC6290ii r2, byte[] bArr) throws CMSException {
        this(r2, new ByteArrayInputStream(bArr));
    }

    public static I11L OooO00o(AbstractC6796llliI lllii) {
        if (lllii == null) {
            return null;
        }
        return I11L.OooO00o((Object) lllii.OooO0O0());
    }

    public static OutputStream OooO00o(InputStream inputStream, L1L1ll r9, OutputStream outputStream) throws CMSException, IOException {
        C6001i11LI OooO00o2 = C6001i11LI.OooO00o(new I1Iili1((AbstractC9685lL) new C9727l(inputStream).m21778OooO00o()).OooO00o(16));
        C4984 r0 = new C4984(outputStream);
        r0.OooO00o(AbstractC6252iiLl.OooO0O0);
        C4984 r1 = new C4984(r0.OooO00o(), 0, true);
        r1.OooO00o(OooO00o2.m16844OooO00o());
        OooO00o2.OooO0OO().OooO0O0();
        iILLL1 r2 = new iILLL1();
        for (C5510IIl r6 : r9.OooO00o()) {
            r2.OooO00o(C6079iI11II.OooO00o.OooO00o(r6.m15765OooO00o()));
        }
        r1.OooO00o().write(new i1I1I1l(r2).getEncoded());
        I1Iili1 OooO00o3 = OooO00o2.OooO00o();
        C4984 r5 = new C4984(r1.OooO00o());
        r5.OooO00o(OooO00o3.OooO00o());
        OooO00o(OooO00o3, r5.OooO00o());
        r5.OooO0O0();
        OooO00o(r1, OooO00o2.m16845OooO00o(), 0);
        OooO00o(r1, OooO00o2.OooO0O0(), 1);
        iILLL1 r8 = new iILLL1();
        for (C5510IIl r22 : r9.OooO00o()) {
            r8.OooO00o(r22.m15766OooO00o());
        }
        r1.OooO00o().write(new i1I1I1l(r8).getEncoded());
        r1.OooO0O0();
        r0.OooO0O0();
        return outputStream;
    }

    public static OutputStream OooO00o(InputStream inputStream, AbstractC6271iilI iili, AbstractC6271iilI iili2, AbstractC6271iilI iili3, OutputStream outputStream) throws CMSException, IOException {
        C6001i11LI OooO00o2 = C6001i11LI.OooO00o(new I1Iili1((AbstractC9685lL) new C9727l(inputStream).m21778OooO00o()).OooO00o(16));
        C4984 r0 = new C4984(outputStream);
        r0.OooO00o(AbstractC6252iiLl.OooO0O0);
        C4984 r1 = new C4984(r0.OooO00o(), 0, true);
        r1.OooO00o(OooO00o2.m16844OooO00o());
        r1.OooO00o().write(OooO00o2.OooO0OO().OooO0O0().getEncoded());
        I1Iili1 OooO00o3 = OooO00o2.OooO00o();
        C4984 r5 = new C4984(r1.OooO00o());
        r5.OooO00o(OooO00o3.OooO00o());
        OooO00o(OooO00o3, r5.OooO00o());
        r5.OooO0O0();
        OooO00o(OooO00o2.m16845OooO00o());
        OooO00o(OooO00o2.OooO0O0());
        if (!(iili == null && iili3 == null)) {
            ArrayList arrayList = new ArrayList();
            if (iili != null) {
                arrayList.addAll(C5799LllI.OooO0OO(iili));
            }
            if (iili3 != null) {
                arrayList.addAll(C5799LllI.OooO00o(iili3));
            }
            I11L OooO00o4 = C5799LllI.OooO00o(arrayList);
            if (OooO00o4.size() > 0) {
                r1.OooO00o().write(new ILI1Ll(false, 0, OooO00o4).getEncoded());
            }
        }
        if (iili2 != null) {
            I11L OooO00o5 = C5799LllI.OooO00o(C5799LllI.OooO0O0(iili2));
            if (OooO00o5.size() > 0) {
                r1.OooO00o().write(new ILI1Ll(false, 1, OooO00o5).getEncoded());
            }
        }
        r1.OooO00o().write(OooO00o2.OooO0Oo().OooO0O0().getEncoded());
        r1.OooO0O0();
        r0.OooO0O0();
        return outputStream;
    }

    public static void OooO00o(I1Iili1 i1Iili1, OutputStream outputStream) throws IOException {
        AbstractC6541lIlii r1 = (AbstractC6541lIlii) i1Iili1.OooO00o(4);
        if (r1 != null) {
            OooO00o(r1, outputStream);
        }
    }

    public static void OooO00o(ILL ill, AbstractC6796llliI lllii, int i) throws IOException {
        I11L OooO00o2 = OooO00o(lllii);
        if (OooO00o2 != null) {
            boolean z = lllii instanceof C5232IIiI;
            OutputStream OooO00o3 = ill.OooO00o();
            if (z) {
                OooO00o3.write(new C6881lliiI1(false, i, OooO00o2).getEncoded());
            } else {
                OooO00o3.write(new ILI1Ll(false, i, OooO00o2).getEncoded());
            }
        }
    }

    public static void OooO00o(AbstractC6541lIlii r2, OutputStream outputStream) throws IOException {
        OutputStream OooO00o2 = C5799LllI.OooO00o(outputStream, 0, true, 0);
        C6304ilIi1.OooO00o(r2.OooO00o(), OooO00o2);
        OooO00o2.close();
    }

    private void OooO0O0() throws CMSException {
        if (!this.f15805OooO00o) {
            this.f15805OooO00o = true;
            try {
                this.f15798OooO00o = OooO00o(this.f15802OooO00o.m16845OooO00o());
                this.OooO0O0 = OooO00o(this.f15802OooO00o.OooO0O0());
            } catch (IOException e) {
                throw new CMSException("problem parsing cert/crl sets", e);
            }
        }
    }

    @Override // com.p118pd.sdk.C6097iILii
    public int OooO00o() {
        return this.f15802OooO00o.m16844OooO00o().m17647OooO0O0().intValue();
    }

    @Override // com.p118pd.sdk.C6097iILii
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C5200IILli m15648OooO00o() {
        if (this.f15799OooO00o == null) {
            return null;
        }
        return new C5200IILli(this.f15799OooO00o.OooO00o(), C5799LllI.OooO00o(this.f15803OooO00o.values(), this.f15799OooO00o.m15381OooO00o()));
    }

    @Override // com.p118pd.sdk.C6097iILii
    /* renamed from: OooO00o  reason: collision with other method in class */
    public L1L1ll m15649OooO00o() throws CMSException {
        if (this.f15800OooO00o == null) {
            OooO0O0();
            ArrayList arrayList = new ArrayList();
            HashMap hashMap = new HashMap();
            for (Object obj : this.f15803OooO00o.keySet()) {
                hashMap.put(obj, ((I111LIL) this.f15803OooO00o.get(obj)).m21371OooO00o());
            }
            try {
                AbstractC6796llliI OooO0Oo = this.f15802OooO00o.OooO0Oo();
                while (true) {
                    AbstractC6854lLi1LL OooO00o2 = OooO0Oo.OooO00o();
                    if (OooO00o2 == null) {
                        break;
                    }
                    C6710li1 OooO00o3 = C6710li1.OooO00o(OooO00o2.OooO0O0());
                    arrayList.add(new C5510IIl(OooO00o3, this.f15801OooO00o, null, (byte[]) hashMap.get(OooO00o3.m17803OooO00o().OooO00o())));
                }
                this.f15800OooO00o = new L1L1ll(arrayList);
            } catch (IOException e) {
                throw new CMSException("io exception: " + e.getMessage(), e);
            }
        }
        return this.f15800OooO00o;
    }

    @Override // com.p118pd.sdk.C6097iILii
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC6271iilI m15650OooO00o() throws CMSException {
        OooO0O0();
        return OooO00o.OooO00o(this.f15798OooO00o);
    }

    public AbstractC6271iilI OooO00o(LlLI1 llLI1) throws CMSException {
        OooO0O0();
        return OooO00o.OooO00o(llLI1, this.OooO0O0);
    }

    @Override // com.p118pd.sdk.C6097iILii
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m15651OooO00o() {
        return this.f15801OooO00o.m16387OooO0O0();
    }

    @Override // com.p118pd.sdk.C6097iILii
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Set<C6456l1ilL> m15652OooO00o() {
        return this.f15804OooO00o;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6271iilI m15653OooO0O0() throws CMSException {
        OooO0O0();
        return OooO00o.OooO0O0(this.OooO0O0);
    }

    public AbstractC6271iilI OooO0OO() throws CMSException {
        OooO0O0();
        return OooO00o.OooO0OO(this.f15798OooO00o);
    }
}
