package com.p118pd.sdk;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.cms.CMSException;

/* renamed from: com.pd.sdk.IIl  reason: case insensitive filesystem */
public class C5233IIl extends AbstractC6832lIi {
    public static Map OooO00o = new HashMap();
    public static Map OooO0O0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C6404il f15510OooO00o;

    static {
        HashMap hashMap = new HashMap();
        OooO0O0 = hashMap;
        hashMap.put(L1lI1i.OooO0O0, I11I.OooO00o(8));
        OooO0O0.put(L1lI1i.OooO0o, I11I.OooO00o(16));
        OooO0O0.put(L1lI1i.OooO0oO, I11I.OooO00o(16));
        OooO0O0.put(L1lI1i.OooO0oo, I11I.OooO00o(16));
        OooO00o.put(L1lI1i.OooO0O0, I11I.OooO00o(192));
        OooO00o.put(L1lI1i.OooO0o, I11I.OooO00o(128));
        OooO00o.put(L1lI1i.OooO0oO, I11I.OooO00o(192));
        OooO00o.put(L1lI1i.OooO0oo, I11I.OooO00o(256));
    }

    public C5233IIl(C6404il r2, C6456l1ilL r3, iLLLlIi illllii, AbstractC6646liI11LlI lii11lli) {
        super(r2.m17521OooO0O0(), r3, illllii, lii11lli);
        this.f15510OooO00o = r2;
        ((AbstractC6832lIi) this).f18883OooO00o = new C9751I1();
    }

    @Override // com.p118pd.sdk.AbstractC6832lIi, com.p118pd.sdk.AbstractC6832lIi, com.p118pd.sdk.AbstractC6832lIi
    public LL1L OooO00o(AbstractC6799ll r5) throws CMSException, IOException {
        AbstractC9523Ll1LI r52 = (AbstractC9523Ll1LI) r5;
        C6456l1ilL OooO00o2 = C6456l1ilL.OooO00o(C6456l1ilL.OooO00o(this.f15510OooO00o.m17521OooO0O0()).m17587OooO0O0());
        return r52.OooO00o(OooO00o2, this.OooO0O0, r52.OooO00o(r52.OooO00o(), OooO0O0(), ((Integer) OooO00o.get(OooO00o2.OooO00o())).intValue()), this.f15510OooO00o.m17520OooO00o().m17938OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC6832lIi
    public C6456l1ilL OooO0O0() {
        return this.f15510OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC6832lIi
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m15408OooO0O0() {
        if (this.f15510OooO00o.OooO00o() != null) {
            return this.f15510OooO00o.OooO00o().OooO00o().m16387OooO0O0();
        }
        return null;
    }

    public byte[] OooO0Oo() {
        AbstractC6854lLi1LL OooO0O02;
        try {
            if (this.f15510OooO00o.OooO00o() == null || (OooO0O02 = this.f15510OooO00o.OooO00o().m17587OooO0O0()) == null) {
                return null;
            }
            return OooO0O02.OooO0O0().getEncoded();
        } catch (Exception e) {
            throw new RuntimeException("exception getting encryption parameters " + e);
        }
    }
}
