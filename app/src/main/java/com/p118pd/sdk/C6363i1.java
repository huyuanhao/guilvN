package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC9738llL1L;

/* renamed from: com.pd.sdk.i丨1丨  reason: invalid class name and case insensitive filesystem */
public class C6363i1 extends AbstractC9738llL1L.OooO0O0 {
    public C6363i1(IIiLIli r2, AbstractC97441iIIL r3, AbstractC97441iIIL r4) {
        this(r2, r3, r4, false);
    }

    public C6363i1(IIiLIli r2, AbstractC97441iIIL r3, AbstractC97441iIIL r4, boolean z) {
        super(r2, r3, r4);
        if ((r3 == null) == (r4 != null ? false : true)) {
            ((AbstractC9738llL1L) this).f23371OooO00o = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public C6363i1(IIiLIli r1, AbstractC97441iIIL r2, AbstractC97441iIIL r3, AbstractC97441iIIL[] r4, boolean z) {
        super(r1, r2, r3, r4);
        ((AbstractC9738llL1L) this).f23371OooO00o = z;
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L.OooO0O0
    public AbstractC9738llL1L OooO00o() {
        return new C6363i1(null, m21802OooO00o(), m21810OooO0O0());
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO00o(AbstractC9738llL1L r18) {
        long[] jArr;
        long[] jArr2;
        long[] jArr3;
        IlIL1 r6;
        IlIL1 r5;
        IlIL1 r2;
        if (m21814OooO0OO()) {
            return r18;
        }
        if (r18.m21814OooO0OO()) {
            return this;
        }
        IIiLIli OooO00o = m21800OooO00o();
        IlIL1 r22 = (IlIL1) ((AbstractC9738llL1L) this).f23369OooO00o;
        IlIL1 r3 = (IlIL1) r18.m21813OooO0OO();
        if (r22.m15846OooO0O0()) {
            return r3.m15846OooO0O0() ? OooO00o.m15393OooO00o() : r18.OooO00o((AbstractC9738llL1L) this);
        }
        IlIL1 r52 = (IlIL1) this.f23373OooO0O0;
        IlIL1 r62 = (IlIL1) ((AbstractC9738llL1L) this).f23372OooO00o[0];
        IlIL1 r8 = (IlIL1) r18.m21815OooO0Oo();
        IlIL1 r1 = (IlIL1) r18.m21803OooO00o(0);
        long[] OooO00o2 = lillilII.OooO00o();
        long[] OooO00o3 = lillilII.OooO00o();
        long[] OooO00o4 = lillilII.OooO00o();
        long[] OooO00o5 = lillilII.OooO00o();
        long[] OooO00o6 = r62.m15844OooO00o() ? null : C5357IiLL.m15594OooO00o(r62.OooO00o);
        if (OooO00o6 == null) {
            jArr = r3.OooO00o;
            jArr2 = r8.OooO00o;
        } else {
            C5357IiLL.OooO0oo(r3.OooO00o, OooO00o6, OooO00o3);
            C5357IiLL.OooO0oo(r8.OooO00o, OooO00o6, OooO00o5);
            jArr = OooO00o3;
            jArr2 = OooO00o5;
        }
        long[] OooO00o7 = r1.m15844OooO00o() ? null : C5357IiLL.m15594OooO00o(r1.OooO00o);
        long[] jArr4 = r22.OooO00o;
        if (OooO00o7 == null) {
            jArr3 = r52.OooO00o;
        } else {
            C5357IiLL.OooO0oo(jArr4, OooO00o7, OooO00o2);
            C5357IiLL.OooO0oo(r52.OooO00o, OooO00o7, OooO00o4);
            jArr4 = OooO00o2;
            jArr3 = OooO00o4;
        }
        C5357IiLL.OooO00o(jArr3, jArr2, OooO00o4);
        C5357IiLL.OooO00o(jArr4, jArr, OooO00o5);
        if (lillilII.OooO0O0(OooO00o5)) {
            return lillilII.OooO0O0(OooO00o4) ? OooO0o() : OooO00o.m15393OooO00o();
        }
        if (r3.m15846OooO0O0()) {
            AbstractC9738llL1L OooO0Oo = OooO0Oo();
            IlIL1 r23 = (IlIL1) OooO0Oo.m21819OooO0o0();
            AbstractC97441iIIL OooO0o = OooO0Oo.m21817OooO0o();
            AbstractC97441iIIL OooO0O0 = OooO0o.OooO00o(r8).OooO0O0(r23);
            r5 = (IlIL1) OooO0O0.OooO0o0().OooO00o(OooO0O0).OooO00o(r23);
            if (r5.m15846OooO0O0()) {
                return new C6363i1(OooO00o, r5, OooO00o.m15400OooO0O0(), ((AbstractC9738llL1L) this).f23371OooO00o);
            }
            r2 = (IlIL1) OooO00o.OooO00o(AbstractC5490IlLL.OooO0O0);
            r6 = (IlIL1) OooO0O0.OooO0OO(r23.OooO00o(r5)).OooO00o(r5).OooO00o(OooO0o).OooO0O0(r5).OooO00o(r5);
        } else {
            C5357IiLL.OooO0o(OooO00o5, OooO00o5);
            long[] OooO00o8 = C5357IiLL.m15594OooO00o(OooO00o4);
            C5357IiLL.OooO0oo(jArr4, OooO00o8, OooO00o2);
            C5357IiLL.OooO0oo(jArr, OooO00o8, OooO00o3);
            IlIL1 r24 = new IlIL1(OooO00o2);
            C5357IiLL.OooO0o(OooO00o2, OooO00o3, r24.OooO00o);
            if (r24.m15846OooO0O0()) {
                return new C6363i1(OooO00o, r24, OooO00o.m15400OooO0O0(), ((AbstractC9738llL1L) this).f23371OooO00o);
            }
            IlIL1 r7 = new IlIL1(OooO00o4);
            C5357IiLL.OooO0oo(OooO00o5, OooO00o8, r7.OooO00o);
            if (OooO00o7 != null) {
                long[] jArr5 = r7.OooO00o;
                C5357IiLL.OooO0oo(jArr5, OooO00o7, jArr5);
            }
            long[] OooO0O02 = lillilII.OooO0O0();
            C5357IiLL.OooO00o(OooO00o3, OooO00o5, OooO00o5);
            C5357IiLL.OooO0oO(OooO00o5, OooO0O02);
            C5357IiLL.OooO00o(r52.OooO00o, r62.OooO00o, OooO00o5);
            C5357IiLL.OooO0oO(OooO00o5, r7.OooO00o, OooO0O02);
            IlIL1 r32 = new IlIL1(OooO00o5);
            C5357IiLL.OooO0Oo(OooO0O02, r32.OooO00o);
            if (OooO00o6 != null) {
                long[] jArr6 = r7.OooO00o;
                C5357IiLL.OooO0oo(jArr6, OooO00o6, jArr6);
            }
            r5 = r24;
            r6 = r32;
            r2 = r7;
        }
        return new C6363i1(OooO00o, r5, r6, new AbstractC97441iIIL[]{r2}, ((AbstractC9738llL1L) this).f23371OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L.OooO0O0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m17463OooO00o() {
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
        return new C6363i1(((AbstractC9738llL1L) this).OooO00o, r3, r0.OooO00o(r1), new AbstractC97441iIIL[]{r1}, ((AbstractC9738llL1L) this).f23371OooO00o);
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
        AbstractC97441iIIL OooO00o3 = OooO0o02.OooO00o(r4.OooO0OO(r5));
        AbstractC97441iIIL OooO00o4 = OooO0Oo.m21857OooO00o();
        AbstractC97441iIIL OooO0O0 = OooO00o4.OooO0OO(OooO0o03).OooO00o(OooO0o02).OooO0O0(OooO00o3, OooO0o0, OooO0o03);
        AbstractC97441iIIL OooO0OO2 = OooO0OO.OooO0OO(OooO0o03);
        AbstractC97441iIIL OooO0o04 = OooO0OO2.OooO00o(OooO00o3).OooO0o0();
        if (OooO0o04.m21863OooO0O0()) {
            return OooO0O0.m21863OooO0O0() ? r10.OooO0o() : OooO00o.m15393OooO00o();
        }
        if (OooO0O0.m21863OooO0O0()) {
            return new C6363i1(OooO00o, OooO0O0, OooO00o.m15400OooO0O0(), ((AbstractC9738llL1L) this).f23371OooO00o);
        }
        AbstractC97441iIIL OooO0OO3 = OooO0O0.OooO0o0().OooO0OO(OooO0OO2);
        AbstractC97441iIIL OooO0OO4 = OooO0O0.OooO0OO(OooO0o04).OooO0OO(OooO0o03);
        return new C6363i1(OooO00o, OooO0OO3, OooO0O0.OooO00o(OooO0o04).OooO0o0().OooO0O0(OooO00o3, OooO00o4, OooO0OO4), new AbstractC97441iIIL[]{OooO0OO4}, ((AbstractC9738llL1L) this).f23371OooO00o);
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
        AbstractC97441iIIL OooO0o0 = OooO00o2 ? r3 : r3.OooO0o0();
        AbstractC97441iIIL OooO00o3 = OooO00o2 ? r1.OooO0o0().OooO00o(r1) : r1.OooO00o(r3).OooO0OO(r1);
        if (OooO00o3.m21863OooO0O0()) {
            return new C6363i1(OooO00o, OooO00o3, OooO00o.m15400OooO0O0(), ((AbstractC9738llL1L) this).f23371OooO00o);
        }
        AbstractC97441iIIL OooO0o02 = OooO00o3.OooO0o0();
        AbstractC97441iIIL OooO0OO = OooO00o2 ? OooO00o3 : OooO00o3.OooO0OO(OooO0o0);
        AbstractC97441iIIL OooO0o03 = r1.OooO00o(r0).OooO0o0();
        if (!OooO00o2) {
            r3 = OooO0o0.OooO0o0();
        }
        return new C6363i1(OooO00o, OooO0o02, OooO0o03.OooO00o(OooO00o3).OooO00o(OooO0o0).OooO0OO(OooO0o03).OooO00o(r3).OooO00o(OooO0o02).OooO00o(OooO0OO), new AbstractC97441iIIL[]{OooO0OO}, ((AbstractC9738llL1L) this).f23371OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    /* renamed from: OooO0o  reason: collision with other method in class */
    public AbstractC97441iIIL m17464OooO0o() {
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
