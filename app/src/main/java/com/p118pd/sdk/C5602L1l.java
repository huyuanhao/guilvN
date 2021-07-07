package com.p118pd.sdk;

import com.p118pd.sdk.C6190iLlIl;
import com.p118pd.sdk.C6407ilI;
import com.p118pd.sdk.iL1iI1L;
import org.bouncycastle.pqc.crypto.xmss.BDS;
import org.bouncycastle.pqc.crypto.xmss.BDSStateMap;
import org.bouncycastle.pqc.crypto.xmss.XMSSNode;

/* renamed from: com.pd.sdk.L1丨l  reason: invalid class name and case insensitive filesystem */
public class C5602L1l implements AbstractC5516ILIL1l {
    public C5558Il1l OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5736Liiil f16248OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6454l1ii f16249OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6643li1l f16250OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9341I1iilI1 f16251OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f16252OooO00o;
    public C6643li1l OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f16253OooO0O0;

    private I1LLIII OooO00o(byte[] bArr, iL1iI1L il1ii1l) {
        if (bArr.length != this.f16249OooO00o.OooO00o()) {
            throw new IllegalArgumentException("size of messageDigest needs to be equal to size of digest");
        } else if (il1ii1l != null) {
            C5558Il1l r0 = this.OooO00o;
            r0.OooO00o(r0.m15841OooO00o(this.f16250OooO00o.OooO0o0(), il1ii1l), this.f16250OooO00o.OooO0O0());
            return this.OooO00o.OooO00o(bArr, il1ii1l);
        } else {
            throw new NullPointerException("otsHashAddress == null");
        }
    }

    @Override // com.p118pd.sdk.AbstractC5516ILIL1l
    public C6213iL11I OooO00o() {
        C6643li1l OooO00o2;
        if (this.f16252OooO00o) {
            OooO00o2 = this.f16250OooO00o;
            this.f16250OooO00o = null;
        } else {
            OooO00o2 = this.OooO0O0.m17734OooO00o();
        }
        this.OooO0O0 = null;
        return OooO00o2;
    }

    @Override // com.p118pd.sdk.l1lILl
    public void OooO00o(boolean z, AbstractC6370iIIIl r3) {
        C6454l1ii l1ii;
        if (z) {
            this.f16253OooO0O0 = true;
            this.f16252OooO00o = false;
            C6643li1l r32 = (C6643li1l) r3;
            this.f16250OooO00o = r32;
            this.OooO0O0 = r32;
            l1ii = r32.m17733OooO00o();
        } else {
            this.f16253OooO0O0 = false;
            C5736Liiil r33 = (C5736Liiil) r3;
            this.f16248OooO00o = r33;
            l1ii = r33.OooO00o();
        }
        this.f16249OooO00o = l1ii;
        this.f16251OooO00o = l1ii.m17580OooO00o();
        this.OooO00o = new C5558Il1l(new C6578lLILi(this.f16249OooO00o.m17579OooO00o()));
    }

    @Override // com.p118pd.sdk.l1lILl
    public boolean OooO00o(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            throw new NullPointerException("message == null");
        } else if (bArr2 == null) {
            throw new NullPointerException("signature == null");
        } else if (this.f16248OooO00o != null) {
            C6407ilI OooO00o2 = new C6407ilI.OooO0O0(this.f16249OooO00o).OooO0O0(bArr2).OooO00o();
            byte[] OooO0OO = this.OooO00o.OooO00o().OooO0OO(C9586iIILl.OooO00o(OooO00o2.OooO0O0(), this.f16248OooO00o.OooO0OO(), C5532IiIllL.m15806OooO00o(OooO00o2.OooO00o(), this.f16249OooO00o.OooO00o())), bArr);
            long OooO00o3 = OooO00o2.OooO00o();
            int OooO0O02 = this.f16251OooO00o.OooO0O0();
            long OooO00o4 = C5532IiIllL.m15804OooO00o(OooO00o3, OooO0O02);
            int OooO00o5 = C5532IiIllL.OooO00o(OooO00o3, OooO0O02);
            this.OooO00o.OooO00o(new byte[this.f16249OooO00o.OooO00o()], this.f16248OooO00o.OooO0O0());
            iL1iI1L il1ii1l = (iL1iI1L) ((iL1iI1L.OooO0O0) new iL1iI1L.OooO0O0().OooO00o(OooO00o4)).OooO0OO(OooO00o5).OooO00o();
            XMSSNode OooO00o6 = C5667LLiI.OooO00o(this.OooO00o, OooO0O02, OooO0OO, OooO00o2.m17523OooO00o().get(0), il1ii1l, OooO00o5);
            int i = 1;
            while (i < this.f16249OooO00o.OooO0OO()) {
                int OooO00o7 = C5532IiIllL.OooO00o(OooO00o4, OooO0O02);
                long OooO00o8 = C5532IiIllL.m15804OooO00o(OooO00o4, OooO0O02);
                iL1iI1L il1ii1l2 = (iL1iI1L) ((iL1iI1L.OooO0O0) ((iL1iI1L.OooO0O0) new iL1iI1L.OooO0O0().OooO0O0(i)).OooO00o(OooO00o8)).OooO0OO(OooO00o7).OooO00o();
                OooO00o6 = C5667LLiI.OooO00o(this.OooO00o, OooO0O02, OooO00o6.getValue(), OooO00o2.m17523OooO00o().get(i), il1ii1l2, OooO00o7);
                i++;
                OooO00o4 = OooO00o8;
            }
            return C9586iIILl.OooO0O0(OooO00o6.getValue(), this.f16248OooO00o.OooO0OO());
        } else {
            throw new NullPointerException("publicKey == null");
        }
    }

    @Override // com.p118pd.sdk.l1lILl
    public byte[] OooO00o(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("message == null");
        } else if (this.f16253OooO0O0) {
            C6643li1l r0 = this.f16250OooO00o;
            if (r0 == null) {
                throw new IllegalStateException("signing key no longer usable");
            } else if (!r0.m17735OooO00o().isEmpty()) {
                BDSStateMap OooO00o2 = this.f16250OooO00o.m17735OooO00o();
                long OooO00o3 = this.f16250OooO00o.OooO00o();
                int OooO0O02 = this.f16249OooO00o.OooO0O0();
                int OooO0O03 = this.f16251OooO00o.OooO0O0();
                if (C5532IiIllL.OooO00o(OooO0O02, OooO00o3)) {
                    byte[] OooO0Oo = this.OooO00o.OooO00o().OooO0Oo(this.f16250OooO00o.OooO0Oo(), C5532IiIllL.m15806OooO00o(OooO00o3, 32));
                    byte[] OooO0OO = this.OooO00o.OooO00o().OooO0OO(C9586iIILl.OooO00o(OooO0Oo, this.f16250OooO00o.OooO0OO(), C5532IiIllL.m15806OooO00o(OooO00o3, this.f16249OooO00o.OooO00o())), bArr);
                    C6407ilI OooO00o4 = new C6407ilI.OooO0O0(this.f16249OooO00o).OooO00o(OooO00o3).OooO00o(OooO0Oo).OooO00o();
                    long OooO00o5 = C5532IiIllL.m15804OooO00o(OooO00o3, OooO0O03);
                    int OooO00o6 = C5532IiIllL.OooO00o(OooO00o3, OooO0O03);
                    this.OooO00o.OooO00o(new byte[this.f16249OooO00o.OooO00o()], this.f16250OooO00o.OooO0O0());
                    iL1iI1L il1ii1l = (iL1iI1L) ((iL1iI1L.OooO0O0) new iL1iI1L.OooO0O0().OooO00o(OooO00o5)).OooO0OO(OooO00o6).OooO00o();
                    if (OooO00o2.get(0) == null || OooO00o6 == 0) {
                        OooO00o2.put(0, new BDS(this.f16251OooO00o, this.f16250OooO00o.OooO0O0(), this.f16250OooO00o.OooO0o0(), il1ii1l));
                    }
                    OooO00o4.m17523OooO00o().add(new C6190iLlIl.OooO00o(this.f16251OooO00o).OooO00o(OooO00o(OooO0OO, il1ii1l)).OooO00o(OooO00o2.get(0).getAuthenticationPath()).OooO00o());
                    for (int i = 1; i < this.f16249OooO00o.OooO0OO(); i++) {
                        XMSSNode root = OooO00o2.get(i - 1).getRoot();
                        int OooO00o7 = C5532IiIllL.OooO00o(OooO00o5, OooO0O03);
                        OooO00o5 = C5532IiIllL.m15804OooO00o(OooO00o5, OooO0O03);
                        iL1iI1L il1ii1l2 = (iL1iI1L) ((iL1iI1L.OooO0O0) ((iL1iI1L.OooO0O0) new iL1iI1L.OooO0O0().OooO0O0(i)).OooO00o(OooO00o5)).OooO0OO(OooO00o7).OooO00o();
                        I1LLIII OooO00o8 = OooO00o(root.getValue(), il1ii1l2);
                        if (OooO00o2.get(i) == null || C5532IiIllL.OooO0O0(OooO00o3, OooO0O03, i)) {
                            OooO00o2.put(i, new BDS(this.f16251OooO00o, this.f16250OooO00o.OooO0O0(), this.f16250OooO00o.OooO0o0(), il1ii1l2));
                        }
                        OooO00o4.m17523OooO00o().add(new C6190iLlIl.OooO00o(this.f16251OooO00o).OooO00o(OooO00o8).OooO00o(OooO00o2.get(i).getAuthenticationPath()).OooO00o());
                    }
                    this.f16252OooO00o = true;
                    C6643li1l r15 = this.OooO0O0;
                    if (r15 != null) {
                        C6643li1l OooO00o9 = r15.m17734OooO00o();
                        this.f16250OooO00o = OooO00o9;
                        this.OooO0O0 = OooO00o9;
                    } else {
                        this.f16250OooO00o = null;
                    }
                    return OooO00o4.m17524OooO00o();
                }
                throw new IllegalStateException("index out of bounds");
            } else {
                throw new IllegalStateException("not initialized");
            }
        } else {
            throw new IllegalStateException("signer not initialized for signature generation");
        }
    }
}
