package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC9738llL1L;

/* renamed from: com.pd.sdk.ilii1i */
public class ilii1i extends AbstractC9738llL1L.OooO0O0 {
    public ilii1i(IIiLIli r2, AbstractC97441iIIL r3, AbstractC97441iIIL r4) {
        this(r2, r3, r4, false);
    }

    public ilii1i(IIiLIli r2, AbstractC97441iIIL r3, AbstractC97441iIIL r4, boolean z) {
        super(r2, r3, r4);
        if ((r3 == null) == (r4 != null ? false : true)) {
            ((AbstractC9738llL1L) this).f23371OooO00o = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public ilii1i(IIiLIli r1, AbstractC97441iIIL r2, AbstractC97441iIIL r3, AbstractC97441iIIL[] r4, boolean z) {
        super(r1, r2, r3, r4);
        ((AbstractC9738llL1L) this).f23371OooO00o = z;
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L.OooO0O0
    public AbstractC9738llL1L OooO00o() {
        return new ilii1i(null, m21802OooO00o(), m21810OooO0O0());
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO00o(AbstractC9738llL1L r14) {
        AbstractC97441iIIL r9;
        AbstractC97441iIIL r8;
        AbstractC97441iIIL r11;
        AbstractC97441iIIL r4;
        AbstractC97441iIIL r3;
        AbstractC97441iIIL r0;
        if (m21814OooO0OO()) {
            return r14;
        }
        if (r14.m21814OooO0OO()) {
            return this;
        }
        IIiLIli OooO00o = m21800OooO00o();
        AbstractC97441iIIL r02 = ((AbstractC9738llL1L) this).f23369OooO00o;
        AbstractC97441iIIL OooO0OO = r14.m21813OooO0OO();
        if (r02.m21863OooO0O0()) {
            return OooO0OO.m21863OooO0O0() ? OooO00o.m15393OooO00o() : r14.OooO00o((AbstractC9738llL1L) this);
        }
        AbstractC97441iIIL r32 = this.f23373OooO0O0;
        AbstractC97441iIIL r42 = ((AbstractC9738llL1L) this).f23372OooO00o[0];
        AbstractC97441iIIL OooO0Oo = r14.m21815OooO0Oo();
        AbstractC97441iIIL OooO00o2 = r14.m21803OooO00o(0);
        boolean OooO00o3 = r42.m21860OooO00o();
        if (!OooO00o3) {
            r8 = OooO0OO.OooO0OO(r42);
            r9 = OooO0Oo.OooO0OO(r42);
        } else {
            r8 = OooO0OO;
            r9 = OooO0Oo;
        }
        boolean OooO00o4 = OooO00o2.m21860OooO00o();
        if (!OooO00o4) {
            r02 = r02.OooO0OO(OooO00o2);
            r11 = r32.OooO0OO(OooO00o2);
        } else {
            r11 = r32;
        }
        AbstractC97441iIIL OooO00o5 = r11.OooO00o(r9);
        AbstractC97441iIIL OooO00o6 = r02.OooO00o(r8);
        if (OooO00o6.m21863OooO0O0()) {
            return OooO00o5.m21863OooO0O0() ? OooO0o() : OooO00o.m15393OooO00o();
        }
        if (OooO0OO.m21863OooO0O0()) {
            AbstractC9738llL1L OooO0Oo2 = OooO0Oo();
            AbstractC97441iIIL OooO0o0 = OooO0Oo2.m21819OooO0o0();
            AbstractC97441iIIL OooO0o = OooO0Oo2.m21817OooO0o();
            AbstractC97441iIIL OooO0O0 = OooO0o.OooO00o(OooO0Oo).OooO0O0(OooO0o0);
            r3 = OooO0O0.OooO0o0().OooO00o(OooO0O0).OooO00o(OooO0o0).OooO00o(OooO00o.m15394OooO00o());
            if (r3.m21863OooO0O0()) {
                return new ilii1i(OooO00o, r3, OooO00o.m15400OooO0O0().OooO0Oo(), ((AbstractC9738llL1L) this).f23371OooO00o);
            }
            AbstractC97441iIIL OooO00o7 = OooO0O0.OooO0OO(OooO0o0.OooO00o(r3)).OooO00o(r3).OooO00o(OooO0o).OooO0O0(r3).OooO00o(r3);
            r0 = OooO00o.OooO00o(AbstractC5490IlLL.OooO0O0);
            r4 = OooO00o7;
        } else {
            AbstractC97441iIIL OooO0o02 = OooO00o6.OooO0o0();
            AbstractC97441iIIL OooO0OO2 = OooO00o5.OooO0OO(r02);
            AbstractC97441iIIL OooO0OO3 = OooO00o5.OooO0OO(r8);
            AbstractC97441iIIL OooO0OO4 = OooO0OO2.OooO0OO(OooO0OO3);
            if (OooO0OO4.m21863OooO0O0()) {
                return new ilii1i(OooO00o, OooO0OO4, OooO00o.m15400OooO0O0().OooO0Oo(), ((AbstractC9738llL1L) this).f23371OooO00o);
            }
            AbstractC97441iIIL OooO0OO5 = OooO00o5.OooO0OO(OooO0o02);
            AbstractC97441iIIL OooO0OO6 = !OooO00o4 ? OooO0OO5.OooO0OO(OooO00o2) : OooO0OO5;
            AbstractC97441iIIL OooO0O02 = OooO0OO3.OooO00o(OooO0o02).OooO0O0(OooO0OO6, r32.OooO00o(r42));
            if (!OooO00o3) {
                OooO0OO6 = OooO0OO6.OooO0OO(r42);
            }
            r3 = OooO0OO4;
            r4 = OooO0O02;
            r0 = OooO0OO6;
        }
        return new ilii1i(OooO00o, r3, r4, new AbstractC97441iIIL[]{r0}, ((AbstractC9738llL1L) this).f23371OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L.OooO0O0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17384OooO00o() {
        AbstractC97441iIIL OooO0OO = m21813OooO0OO();
        return !OooO0OO.m21863OooO0O0() && m21815OooO0Oo().m21864OooO0OO() != OooO0OO.m21864OooO0OO();
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO0OO() {
        if (m21814OooO0OO()) {
            return this;
        }
        AbstractC97441iIIL r3 = ((AbstractC9738llL1L) this).f23369OooO00o;
        if (r3.m21863OooO0O0()) {
            return this;
        }
        AbstractC97441iIIL r0 = this.f23373OooO0O0;
        AbstractC97441iIIL r1 = ((AbstractC9738llL1L) this).f23372OooO00o[0];
        return new ilii1i(((AbstractC9738llL1L) this).OooO00o, r3, r0.OooO00o(r1), new AbstractC97441iIIL[]{r1}, ((AbstractC9738llL1L) this).f23371OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO0OO(AbstractC9738llL1L r10) {
        if (m21814OooO0OO()) {
            return r10;
        }
        if (r10.m21814OooO0OO()) {
            return OooO0o();
        }
        IIiLIli OooO00o = m21800OooO00o();
        AbstractC97441iIIL r0 = ((AbstractC9738llL1L) this).f23369OooO00o;
        if (r0.m21863OooO0O0()) {
            return r10;
        }
        AbstractC97441iIIL OooO0OO = r10.m21813OooO0OO();
        AbstractC97441iIIL OooO00o2 = r10.m21803OooO00o(0);
        if (OooO0OO.m21863OooO0O0() || !OooO00o2.m21860OooO00o()) {
            return OooO0o().OooO00o(r10);
        }
        AbstractC97441iIIL r4 = this.f23373OooO0O0;
        AbstractC97441iIIL r5 = ((AbstractC9738llL1L) this).f23372OooO00o[0];
        AbstractC97441iIIL OooO0Oo = r10.m21815OooO0Oo();
        AbstractC97441iIIL OooO0o0 = r0.OooO0o0();
        AbstractC97441iIIL OooO0o02 = r4.OooO0o0();
        AbstractC97441iIIL OooO0o03 = r5.OooO0o0();
        AbstractC97441iIIL OooO00o3 = OooO00o.m15394OooO00o().OooO0OO(OooO0o03).OooO00o(OooO0o02).OooO00o(r4.OooO0OO(r5));
        AbstractC97441iIIL OooO00o4 = OooO0Oo.m21857OooO00o();
        AbstractC97441iIIL OooO0O0 = OooO00o.m15394OooO00o().OooO00o(OooO00o4).OooO0OO(OooO0o03).OooO00o(OooO0o02).OooO0O0(OooO00o3, OooO0o0, OooO0o03);
        AbstractC97441iIIL OooO0OO2 = OooO0OO.OooO0OO(OooO0o03);
        AbstractC97441iIIL OooO0o04 = OooO0OO2.OooO00o(OooO00o3).OooO0o0();
        if (OooO0o04.m21863OooO0O0()) {
            return OooO0O0.m21863OooO0O0() ? r10.OooO0o() : OooO00o.m15393OooO00o();
        }
        if (OooO0O0.m21863OooO0O0()) {
            return new ilii1i(OooO00o, OooO0O0, OooO00o.m15400OooO0O0().OooO0Oo(), ((AbstractC9738llL1L) this).f23371OooO00o);
        }
        AbstractC97441iIIL OooO0OO3 = OooO0O0.OooO0o0().OooO0OO(OooO0OO2);
        AbstractC97441iIIL OooO0OO4 = OooO0O0.OooO0OO(OooO0o04).OooO0OO(OooO0o03);
        return new ilii1i(OooO00o, OooO0OO3, OooO0O0.OooO00o(OooO0o04).OooO0o0().OooO0O0(OooO00o3, OooO00o4, OooO0OO4), new AbstractC97441iIIL[]{OooO0OO4}, ((AbstractC9738llL1L) this).f23371OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO0o() {
        if (m21814OooO0OO()) {
            return this;
        }
        IIiLIli OooO00o = m21800OooO00o();
        AbstractC97441iIIL r0 = ((AbstractC9738llL1L) this).f23369OooO00o;
        if (r0.m21863OooO0O0()) {
            return OooO00o.m15393OooO00o();
        }
        AbstractC97441iIIL r1 = this.f23373OooO0O0;
        AbstractC97441iIIL r3 = ((AbstractC9738llL1L) this).f23372OooO00o[0];
        boolean OooO00o2 = r3.m21860OooO00o();
        AbstractC97441iIIL OooO0OO = OooO00o2 ? r1 : r1.OooO0OO(r3);
        AbstractC97441iIIL OooO0o0 = OooO00o2 ? r3 : r3.OooO0o0();
        AbstractC97441iIIL OooO00o3 = OooO00o.m15394OooO00o();
        if (!OooO00o2) {
            OooO00o3 = OooO00o3.OooO0OO(OooO0o0);
        }
        AbstractC97441iIIL OooO00o4 = r1.OooO0o0().OooO00o(OooO0OO).OooO00o(OooO00o3);
        if (OooO00o4.m21863OooO0O0()) {
            return new ilii1i(OooO00o, OooO00o4, OooO00o.m15400OooO0O0().OooO0Oo(), ((AbstractC9738llL1L) this).f23371OooO00o);
        }
        AbstractC97441iIIL OooO0o02 = OooO00o4.OooO0o0();
        AbstractC97441iIIL OooO0OO2 = OooO00o2 ? OooO00o4 : OooO00o4.OooO0OO(OooO0o0);
        if (!OooO00o2) {
            r0 = r0.OooO0OO(r3);
        }
        return new ilii1i(OooO00o, OooO0o02, r0.OooO0O0(OooO00o4, OooO0OO).OooO00o(OooO0o02).OooO00o(OooO0OO2), new AbstractC97441iIIL[]{OooO0OO2}, ((AbstractC9738llL1L) this).f23371OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    /* renamed from: OooO0o  reason: collision with other method in class */
    public AbstractC97441iIIL m17385OooO0o() {
        AbstractC97441iIIL r0 = ((AbstractC9738llL1L) this).f23369OooO00o;
        AbstractC97441iIIL r1 = this.f23373OooO0O0;
        if (m21814OooO0OO() || r0.m21863OooO0O0()) {
            return r1;
        }
        AbstractC97441iIIL OooO0OO = r1.OooO00o(r0).OooO0OO(r0);
        AbstractC97441iIIL r12 = ((AbstractC9738llL1L) this).f23372OooO00o[0];
        return !r12.m21860OooO00o() ? OooO0OO.OooO0O0(r12) : OooO0OO;
    }
}
