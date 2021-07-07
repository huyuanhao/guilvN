package com.p118pd.sdk;

import java.util.Enumeration;
import java.util.Hashtable;

/* renamed from: com.pd.sdk.i丨I11丨  reason: invalid class name and case insensitive filesystem */
public class C6367iI11 implements AbstractC9439IL {
    public static final int OooO00o = 4;

    /* renamed from: OooO00o  reason: collision with other field name */
    public iL1liI f18144OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9812LL1I f18145OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Short f18146OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Hashtable f18147OooO00o;

    public C6367iI11() {
        this.f18145OooO00o = new C9812LL1I();
        this.f18147OooO00o = new Hashtable();
        this.f18146OooO00o = null;
    }

    public C6367iI11(Short sh, AbstractC6436l11LI r3) {
        this.f18145OooO00o = null;
        Hashtable hashtable = new Hashtable();
        this.f18147OooO00o = hashtable;
        this.f18146OooO00o = sh;
        hashtable.put(sh, r3);
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public int OooO00o(byte[] bArr, int i) {
        throw new IllegalStateException("Use fork() to get a definite Digest");
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC9439IL, com.p118pd.sdk.AbstractC9439IL, com.p118pd.sdk.AbstractC9439IL
    public AbstractC6436l11LI OooO00o() {
        m17480OooO0O0();
        if (this.f18145OooO00o == null) {
            return L1LL1Ii.OooO00o(this.f18146OooO00o.shortValue(), (AbstractC6436l11LI) this.f18147OooO00o.get(this.f18146OooO00o));
        }
        AbstractC6436l11LI OooO00o2 = L1LL1Ii.m15920OooO00o(this.f18146OooO00o.shortValue());
        this.f18145OooO00o.OooO00o(OooO00o2);
        return OooO00o2;
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC9439IL, com.p118pd.sdk.AbstractC9439IL, com.p118pd.sdk.AbstractC9439IL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9439IL m17475OooO00o() {
        AbstractC6436l11LI OooO00o2 = L1LL1Ii.OooO00o(this.f18146OooO00o.shortValue(), (AbstractC6436l11LI) this.f18147OooO00o.get(this.f18146OooO00o));
        C9812LL1I r1 = this.f18145OooO00o;
        if (r1 != null) {
            r1.OooO00o(OooO00o2);
        }
        C6367iI11 r12 = new C6367iI11(this.f18146OooO00o, OooO00o2);
        r12.OooO00o(this.f18144OooO00o);
        return r12;
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC9439IL, com.p118pd.sdk.AbstractC9439IL, com.p118pd.sdk.AbstractC9439IL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m17476OooO00o() {
        throw new IllegalStateException("Use fork() to get a definite Digest");
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC9439IL, com.p118pd.sdk.AbstractC9439IL, com.p118pd.sdk.AbstractC9439IL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m17477OooO00o() {
        m17480OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC9439IL
    public void OooO00o(iL1liI il1lii) {
        this.f18144OooO00o = il1lii;
    }

    public void OooO00o(Short sh) {
        if (!this.f18147OooO00o.containsKey(sh)) {
            this.f18147OooO00o.put(sh, L1LL1Ii.m15920OooO00o(sh.shortValue()));
        }
    }

    @Override // com.p118pd.sdk.AbstractC9439IL, com.p118pd.sdk.AbstractC9439IL
    public void OooO00o(short s) {
        if (this.f18145OooO00o != null) {
            OooO00o(C6732ll1i1.OooO00o(s));
            return;
        }
        throw new IllegalStateException("Too late to track more hash algorithms");
    }

    @Override // com.p118pd.sdk.AbstractC9439IL, com.p118pd.sdk.AbstractC9439IL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m17478OooO00o(short s) {
        AbstractC6436l11LI r0 = (AbstractC6436l11LI) this.f18147OooO00o.get(C6732ll1i1.OooO00o(s));
        if (r0 != null) {
            AbstractC6436l11LI OooO00o2 = L1LL1Ii.OooO00o(s, r0);
            C9812LL1I r02 = this.f18145OooO00o;
            if (r02 != null) {
                r02.OooO00o(OooO00o2);
            }
            byte[] bArr = new byte[OooO00o2.OooO0O0()];
            OooO00o2.OooO00o(bArr, 0);
            return bArr;
        }
        throw new IllegalStateException("HashAlgorithm." + C6259iii1.OooO0O0(s) + " is not being tracked");
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC9439IL
    public int OooO0O0() {
        throw new IllegalStateException("Use fork() to get a definite Digest");
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC9439IL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC9439IL m17479OooO0O0() {
        int OooO0OO = this.f18144OooO00o.m17074OooO00o().OooO0OO();
        if (OooO0OO == 0) {
            C6352ili r0 = new C6352ili();
            r0.OooO00o(this.f18144OooO00o);
            this.f18145OooO00o.OooO00o(r0);
            return r0.m17416OooO0O0();
        }
        Short OooO00o2 = C6732ll1i1.OooO00o(L1LL1Ii.m15922OooO00o(OooO0OO));
        this.f18146OooO00o = OooO00o2;
        OooO00o(OooO00o2);
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI, com.p118pd.sdk.AbstractC9439IL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m17480OooO0O0() {
        if (this.f18145OooO00o != null && this.f18147OooO00o.size() <= 4) {
            Enumeration elements = this.f18147OooO00o.elements();
            while (elements.hasMoreElements()) {
                this.f18145OooO00o.OooO00o((AbstractC6436l11LI) elements.nextElement());
            }
            this.f18145OooO00o = null;
        }
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void reset() {
        C9812LL1I r0 = this.f18145OooO00o;
        if (r0 != null) {
            r0.reset();
            return;
        }
        Enumeration elements = this.f18147OooO00o.elements();
        while (elements.hasMoreElements()) {
            ((AbstractC6436l11LI) elements.nextElement()).reset();
        }
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void update(byte b) {
        C9812LL1I r0 = this.f18145OooO00o;
        if (r0 != null) {
            r0.write(b);
            return;
        }
        Enumeration elements = this.f18147OooO00o.elements();
        while (elements.hasMoreElements()) {
            ((AbstractC6436l11LI) elements.nextElement()).update(b);
        }
    }

    @Override // com.p118pd.sdk.AbstractC6436l11LI
    public void update(byte[] bArr, int i, int i2) {
        C9812LL1I r0 = this.f18145OooO00o;
        if (r0 != null) {
            r0.write(bArr, i, i2);
            return;
        }
        Enumeration elements = this.f18147OooO00o.elements();
        while (elements.hasMoreElements()) {
            ((AbstractC6436l11LI) elements.nextElement()).update(bArr, i, i2);
        }
    }
}
