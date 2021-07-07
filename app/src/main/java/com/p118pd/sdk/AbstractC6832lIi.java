package com.p118pd.sdk;

import com.p118pd.sdk.C6561lL1lL;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.l丨Ii  reason: invalid class name and case insensitive filesystem */
public abstract class AbstractC6832lIi {
    public LL1L OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iLLLlIi f18880OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6456l1ilL f18881OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC6646liI11LlI f18882OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iilI1iI f18883OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f18884OooO00o;
    public C6456l1ilL OooO0O0;

    public AbstractC6832lIi(C6456l1ilL r1, C6456l1ilL r2, iLLLlIi illllii, AbstractC6646liI11LlI lii11lli) {
        this.f18881OooO00o = r1;
        this.OooO0O0 = r2;
        this.f18880OooO00o = illllii;
        this.f18882OooO00o = lii11lli;
    }

    private byte[] OooO00o(AbstractC6854lLi1LL r1) throws IOException {
        if (r1 != null) {
            return r1.OooO0O0().getEncoded();
        }
        return null;
    }

    public C5200IILli OooO00o(AbstractC6799ll r3) throws CMSException, IOException {
        LL1L OooO00o2 = m17966OooO00o(r3);
        this.OooO00o = OooO00o2;
        return this.f18882OooO00o != null ? new C5200IILli(this.f18880OooO00o.OooO00o()) : new C5200IILli(OooO00o2.OooO00o(this.f18880OooO00o.OooO00o()));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public abstract LL1L m17966OooO00o(AbstractC6799ll v) throws CMSException, IOException;

    public C6456l1ilL OooO00o() {
        return this.f18881OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public iilI1iI m17967OooO00o() {
        return this.f18883OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17968OooO00o() {
        return this.f18881OooO00o.OooO00o().m16387OooO0O0();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17969OooO00o() {
        iLLLlIi illllii = this.f18880OooO00o;
        if (illllii instanceof C6561lL1lL.OooO0O0) {
            return ((C6561lL1lL.OooO0O0) illllii).m17662OooO00o();
        }
        return null;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17970OooO00o(AbstractC6799ll r4) throws CMSException {
        try {
            return C5799LllI.m16401OooO00o(OooO00o(r4).m15381OooO00o());
        } catch (IOException e) {
            throw new CMSException("unable to parse internal stream: " + e.getMessage(), e);
        }
    }

    public byte[] OooO0O0() {
        try {
            return OooO00o(this.f18881OooO00o.m17587OooO0O0());
        } catch (Exception e) {
            throw new RuntimeException("exception getting encryption parameters " + e);
        }
    }

    public byte[] OooO0OO() {
        if (this.f18884OooO00o == null && this.OooO00o.OooO00o()) {
            if (this.f18882OooO00o != null) {
                try {
                    C6304ilIi1.OooO00o(this.OooO00o.OooO00o(new ByteArrayInputStream(this.f18882OooO00o.OooO00o().OooO00o(AbstractC5533IiL.OooO00o))));
                } catch (IOException e) {
                    throw new IllegalStateException("unable to drain input: " + e.getMessage());
                }
            }
            this.f18884OooO00o = this.OooO00o.m16171OooO00o();
        }
        return this.f18884OooO00o;
    }
}
