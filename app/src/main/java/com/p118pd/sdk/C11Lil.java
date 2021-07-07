package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC9738llL1L;

/* renamed from: com.pd.sdk.丨丨丨11Lil  reason: invalid class name */
public class C11Lil extends AbstractC9738llL1L.OooO0OO {
    public C11Lil(IIiLIli r2, AbstractC97441iIIL r3, AbstractC97441iIIL r4) {
        this(r2, r3, r4, false);
    }

    public C11Lil(IIiLIli r2, AbstractC97441iIIL r3, AbstractC97441iIIL r4, boolean z) {
        super(r2, r3, r4);
        if ((r3 == null) == (r4 != null ? false : true)) {
            ((AbstractC9738llL1L) this).f23371OooO00o = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public C11Lil(IIiLIli r1, AbstractC97441iIIL r2, AbstractC97441iIIL r3, AbstractC97441iIIL[] r4, boolean z) {
        super(r1, r2, r3, r4);
        ((AbstractC9738llL1L) this).f23371OooO00o = z;
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L.OooO0OO
    public AbstractC9738llL1L OooO00o() {
        return new C11Lil(null, m21802OooO00o(), m21810OooO0O0());
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO00o(AbstractC9738llL1L r15) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (m21814OooO0OO()) {
            return r15;
        }
        if (r15.m21814OooO0OO()) {
            return this;
        }
        if (this == r15) {
            return OooO0o();
        }
        IIiLIli OooO00o = m21800OooO00o();
        IiLliiii iiLliiii = (IiLliiii) ((AbstractC9738llL1L) this).f23369OooO00o;
        IiLliiii iiLliiii2 = (IiLliiii) this.f23373OooO0O0;
        IiLliiii iiLliiii3 = (IiLliiii) r15.m21819OooO0o0();
        IiLliiii iiLliiii4 = (IiLliiii) r15.m21817OooO0o();
        IiLliiii iiLliiii5 = (IiLliiii) ((AbstractC9738llL1L) this).f23372OooO00o[0];
        IiLliiii iiLliiii6 = (IiLliiii) r15.m21803OooO00o(0);
        int[] OooO0O0 = AbstractC6694lilI.OooO0O0();
        int[] OooO00o2 = AbstractC6694lilI.OooO00o();
        int[] OooO00o3 = AbstractC6694lilI.OooO00o();
        int[] OooO00o4 = AbstractC6694lilI.OooO00o();
        boolean OooO00o5 = iiLliiii5.m15605OooO00o();
        if (OooO00o5) {
            iArr2 = iiLliiii3.OooO00o;
            iArr = iiLliiii4.OooO00o;
        } else {
            C5839L1lL1.OooO0o0(iiLliiii5.OooO00o, OooO00o3);
            C5839L1lL1.OooO0OO(OooO00o3, iiLliiii3.OooO00o, OooO00o2);
            C5839L1lL1.OooO0OO(OooO00o3, iiLliiii5.OooO00o, OooO00o3);
            C5839L1lL1.OooO0OO(OooO00o3, iiLliiii4.OooO00o, OooO00o3);
            iArr2 = OooO00o2;
            iArr = OooO00o3;
        }
        boolean OooO00o6 = iiLliiii6.m15605OooO00o();
        if (OooO00o6) {
            iArr4 = iiLliiii.OooO00o;
            iArr3 = iiLliiii2.OooO00o;
        } else {
            C5839L1lL1.OooO0o0(iiLliiii6.OooO00o, OooO00o4);
            C5839L1lL1.OooO0OO(OooO00o4, iiLliiii.OooO00o, OooO0O0);
            C5839L1lL1.OooO0OO(OooO00o4, iiLliiii6.OooO00o, OooO00o4);
            C5839L1lL1.OooO0OO(OooO00o4, iiLliiii2.OooO00o, OooO00o4);
            iArr4 = OooO0O0;
            iArr3 = OooO00o4;
        }
        int[] OooO00o7 = AbstractC6694lilI.OooO00o();
        C5839L1lL1.OooO0o0(iArr4, iArr2, OooO00o7);
        C5839L1lL1.OooO0o0(iArr3, iArr, OooO00o2);
        if (AbstractC6694lilI.OooO0O0(OooO00o7)) {
            return AbstractC6694lilI.OooO0O0(OooO00o2) ? OooO0o() : OooO00o.m15393OooO00o();
        }
        C5839L1lL1.OooO0o0(OooO00o7, OooO00o3);
        int[] OooO00o8 = AbstractC6694lilI.OooO00o();
        C5839L1lL1.OooO0OO(OooO00o3, OooO00o7, OooO00o8);
        C5839L1lL1.OooO0OO(OooO00o3, iArr4, OooO00o3);
        C5839L1lL1.OooO0OO(OooO00o8, OooO00o8);
        AbstractC6694lilI.m17783OooO00o(iArr3, OooO00o8, OooO0O0);
        C5839L1lL1.OooO00o(AbstractC6694lilI.OooO0O0(OooO00o3, OooO00o3, OooO00o8), OooO00o8);
        IiLliiii iiLliiii7 = new IiLliiii(OooO00o4);
        C5839L1lL1.OooO0o0(OooO00o2, iiLliiii7.OooO00o);
        int[] iArr5 = iiLliiii7.OooO00o;
        C5839L1lL1.OooO0o0(iArr5, OooO00o8, iArr5);
        IiLliiii iiLliiii8 = new IiLliiii(OooO00o8);
        C5839L1lL1.OooO0o0(OooO00o3, iiLliiii7.OooO00o, iiLliiii8.OooO00o);
        C5839L1lL1.OooO0Oo(iiLliiii8.OooO00o, OooO00o2, OooO0O0);
        C5839L1lL1.OooO0Oo(OooO0O0, iiLliiii8.OooO00o);
        IiLliiii iiLliiii9 = new IiLliiii(OooO00o7);
        if (!OooO00o5) {
            int[] iArr6 = iiLliiii9.OooO00o;
            C5839L1lL1.OooO0OO(iArr6, iiLliiii5.OooO00o, iArr6);
        }
        if (!OooO00o6) {
            int[] iArr7 = iiLliiii9.OooO00o;
            C5839L1lL1.OooO0OO(iArr7, iiLliiii6.OooO00o, iArr7);
        }
        return new C11Lil(OooO00o, iiLliiii7, iiLliiii8, new AbstractC97441iIIL[]{iiLliiii9}, ((AbstractC9738llL1L) this).f23371OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO0OO() {
        return m21814OooO0OO() ? this : new C11Lil(((AbstractC9738llL1L) this).OooO00o, ((AbstractC9738llL1L) this).f23369OooO00o, this.f23373OooO0O0.OooO0OO(), ((AbstractC9738llL1L) this).f23372OooO00o, ((AbstractC9738llL1L) this).f23371OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO0OO(AbstractC9738llL1L r2) {
        return this == r2 ? OooO0o0() : m21814OooO0OO() ? r2 : r2.m21814OooO0OO() ? OooO0o() : this.f23373OooO0O0.m21863OooO0O0() ? r2 : OooO0o().OooO00o(r2);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO0o() {
        if (m21814OooO0OO()) {
            return this;
        }
        IIiLIli OooO00o = m21800OooO00o();
        IiLliiii iiLliiii = (IiLliiii) this.f23373OooO0O0;
        if (iiLliiii.m15607OooO0O0()) {
            return OooO00o.m15393OooO00o();
        }
        IiLliiii iiLliiii2 = (IiLliiii) ((AbstractC9738llL1L) this).f23369OooO00o;
        IiLliiii iiLliiii3 = (IiLliiii) ((AbstractC9738llL1L) this).f23372OooO00o[0];
        int[] OooO00o2 = AbstractC6694lilI.OooO00o();
        C5839L1lL1.OooO0o0(iiLliiii.OooO00o, OooO00o2);
        int[] OooO00o3 = AbstractC6694lilI.OooO00o();
        C5839L1lL1.OooO0o0(OooO00o2, OooO00o3);
        int[] OooO00o4 = AbstractC6694lilI.OooO00o();
        C5839L1lL1.OooO0o0(iiLliiii2.OooO00o, OooO00o4);
        C5839L1lL1.OooO00o(AbstractC6694lilI.OooO0O0(OooO00o4, OooO00o4, OooO00o4), OooO00o4);
        C5839L1lL1.OooO0OO(OooO00o2, iiLliiii2.OooO00o, OooO00o2);
        C5839L1lL1.OooO00o(C1iiIiI.OooO0o(7, OooO00o2, 2, 0), OooO00o2);
        int[] OooO00o5 = AbstractC6694lilI.OooO00o();
        C5839L1lL1.OooO00o(C1iiIiI.OooO0O0(7, OooO00o3, 3, 0, OooO00o5), OooO00o5);
        IiLliiii iiLliiii4 = new IiLliiii(OooO00o3);
        C5839L1lL1.OooO0o0(OooO00o4, iiLliiii4.OooO00o);
        int[] iArr = iiLliiii4.OooO00o;
        C5839L1lL1.OooO0o0(iArr, OooO00o2, iArr);
        int[] iArr2 = iiLliiii4.OooO00o;
        C5839L1lL1.OooO0o0(iArr2, OooO00o2, iArr2);
        IiLliiii iiLliiii5 = new IiLliiii(OooO00o2);
        C5839L1lL1.OooO0o0(OooO00o2, iiLliiii4.OooO00o, iiLliiii5.OooO00o);
        int[] iArr3 = iiLliiii5.OooO00o;
        C5839L1lL1.OooO0OO(iArr3, OooO00o4, iArr3);
        int[] iArr4 = iiLliiii5.OooO00o;
        C5839L1lL1.OooO0o0(iArr4, OooO00o5, iArr4);
        IiLliiii iiLliiii6 = new IiLliiii(OooO00o4);
        C5839L1lL1.OooO0o(iiLliiii.OooO00o, iiLliiii6.OooO00o);
        if (!iiLliiii3.m15605OooO00o()) {
            int[] iArr5 = iiLliiii6.OooO00o;
            C5839L1lL1.OooO0OO(iArr5, iiLliiii3.OooO00o, iArr5);
        }
        return new C11Lil(OooO00o, iiLliiii4, iiLliiii5, new AbstractC97441iIIL[]{iiLliiii6}, ((AbstractC9738llL1L) this).f23371OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO0o0() {
        return (m21814OooO0OO() || this.f23373OooO0O0.m21863OooO0O0()) ? this : OooO0o().OooO00o((AbstractC9738llL1L) this);
    }
}
