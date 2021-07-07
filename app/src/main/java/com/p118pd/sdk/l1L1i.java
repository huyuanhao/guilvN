package com.p118pd.sdk;

import com.p118pd.sdk.C5661LLLl1;
import com.p118pd.sdk.iL1iI1L;

/* renamed from: com.pd.sdk.l1L1i */
public class l1L1i implements AbstractC5516ILIL1l {
    public II11LLI OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5844LI1L f18265OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6394iiIlI f18266OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9341I1iilI1 f18267OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18268OooO00o;
    public C5844LI1L OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f18269OooO0O0;

    private I1LLIII OooO00o(byte[] bArr, iL1iI1L il1ii1l) {
        if (bArr.length != this.f18267OooO00o.OooO00o()) {
            throw new IllegalArgumentException("size of messageDigest needs to be equal to size of digest");
        } else if (il1ii1l != null) {
            this.f18267OooO00o.m21385OooO00o().OooO00o(this.f18267OooO00o.m21385OooO00o().m15841OooO00o(this.f18265OooO00o.OooO0o0(), il1ii1l), this.f18265OooO00o.OooO0O0());
            return this.f18267OooO00o.m21385OooO00o().OooO00o(bArr, il1ii1l);
        } else {
            throw new NullPointerException("otsHashAddress == null");
        }
    }

    @Override // com.p118pd.sdk.AbstractC5516ILIL1l
    public C6213iL11I OooO00o() {
        C5844LI1L OooO00o2;
        if (this.f18269OooO0O0) {
            OooO00o2 = this.f18265OooO00o;
            this.f18265OooO00o = null;
        } else {
            OooO00o2 = this.OooO0O0.m16427OooO00o();
        }
        this.OooO0O0 = null;
        return OooO00o2;
    }

    @Override // com.p118pd.sdk.l1lILl
    public void OooO00o(boolean z, AbstractC6370iIIIl r3) {
        C9341I1iilI1 r2;
        if (z) {
            this.f18268OooO00o = true;
            this.f18269OooO0O0 = false;
            C5844LI1L r32 = (C5844LI1L) r3;
            this.f18265OooO00o = r32;
            this.OooO0O0 = r32;
            r2 = r32.m16428OooO00o();
        } else {
            this.f18268OooO00o = false;
            C6394iiIlI r33 = (C6394iiIlI) r3;
            this.f18266OooO00o = r33;
            r2 = r33.OooO00o();
        }
        this.f18267OooO00o = r2;
        this.OooO00o = r2.m21385OooO00o().OooO00o();
    }

    @Override // com.p118pd.sdk.l1lILl
    public boolean OooO00o(byte[] bArr, byte[] bArr2) {
        C5661LLLl1 OooO00o2 = new C5661LLLl1.OooO0O0(this.f18267OooO00o).OooO0O0(bArr2).OooO00o();
        int OooO00o3 = OooO00o2.OooO00o();
        this.f18267OooO00o.m21385OooO00o().OooO00o(new byte[this.f18267OooO00o.OooO00o()], this.f18266OooO00o.OooO0O0());
        long j = (long) OooO00o3;
        byte[] OooO0OO = this.OooO00o.OooO0OO(C9586iIILl.OooO00o(OooO00o2.OooO0O0(), this.f18266OooO00o.OooO0OO(), C5532IiIllL.m15806OooO00o(j, this.f18267OooO00o.OooO00o())), bArr);
        int OooO0O02 = this.f18267OooO00o.OooO0O0();
        int OooO00o4 = C5532IiIllL.OooO00o(j, OooO0O02);
        return C9586iIILl.OooO0O0(C5667LLiI.OooO00o(this.f18267OooO00o.m21385OooO00o(), OooO0O02, OooO0OO, OooO00o2, (iL1iI1L) new iL1iI1L.OooO0O0().OooO0OO(OooO00o3).OooO00o(), OooO00o4).getValue(), this.f18266OooO00o.OooO0OO());
    }

    @Override // com.p118pd.sdk.l1lILl
    public byte[] OooO00o(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("message == null");
        } else if (this.f18268OooO00o) {
            C5844LI1L r0 = this.f18265OooO00o;
            if (r0 == null) {
                throw new IllegalStateException("signing key no longer usable");
            } else if (!r0.m16429OooO00o().getAuthenticationPath().isEmpty()) {
                int OooO00o2 = this.f18265OooO00o.OooO00o();
                long j = (long) OooO00o2;
                if (C5532IiIllL.OooO00o(this.f18267OooO00o.OooO0O0(), j)) {
                    byte[] OooO0Oo = this.OooO00o.OooO0Oo(this.f18265OooO00o.OooO0Oo(), C5532IiIllL.m15806OooO00o(j, 32));
                    C5661LLLl1 lLLl1 = (C5661LLLl1) new C5661LLLl1.OooO0O0(this.f18267OooO00o).OooO00o(OooO00o2).OooO00o(OooO0Oo).OooO00o(OooO00o(this.OooO00o.OooO0OO(C9586iIILl.OooO00o(OooO0Oo, this.f18265OooO00o.OooO0OO(), C5532IiIllL.m15806OooO00o(j, this.f18267OooO00o.OooO00o())), bArr), (iL1iI1L) new iL1iI1L.OooO0O0().OooO0OO(OooO00o2).OooO00o())).OooO00o(this.f18265OooO00o.m16429OooO00o().getAuthenticationPath()).OooO00o();
                    this.f18269OooO0O0 = true;
                    C5844LI1L r02 = this.OooO0O0;
                    if (r02 != null) {
                        C5844LI1L OooO00o3 = r02.m16427OooO00o();
                        this.f18265OooO00o = OooO00o3;
                        this.OooO0O0 = OooO00o3;
                    } else {
                        this.f18265OooO00o = null;
                    }
                    return lLLl1.m16229OooO00o();
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
