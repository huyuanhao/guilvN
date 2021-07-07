package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC9738llL1L;

/* renamed from: com.pd.sdk.丨IL丨Ll  reason: invalid class name and case insensitive filesystem */
public class C9368ILLl extends AbstractC9738llL1L.OooO0OO {
    public C9368ILLl(IIiLIli r2, AbstractC97441iIIL r3, AbstractC97441iIIL r4) {
        this(r2, r3, r4, false);
    }

    public C9368ILLl(IIiLIli r2, AbstractC97441iIIL r3, AbstractC97441iIIL r4, boolean z) {
        super(r2, r3, r4);
        if ((r3 == null) == (r4 != null ? false : true)) {
            ((AbstractC9738llL1L) this).f23371OooO00o = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public C9368ILLl(IIiLIli r1, AbstractC97441iIIL r2, AbstractC97441iIIL r3, AbstractC97441iIIL[] r4, boolean z) {
        super(r1, r2, r3, r4);
        ((AbstractC9738llL1L) this).f23371OooO00o = z;
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L.OooO0OO
    public AbstractC9738llL1L OooO00o() {
        return new C9368ILLl(null, m21802OooO00o(), m21810OooO0O0());
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
        L1L1I1 l1l1i1 = (L1L1I1) ((AbstractC9738llL1L) this).f23369OooO00o;
        L1L1I1 l1l1i12 = (L1L1I1) this.f23373OooO0O0;
        L1L1I1 l1l1i13 = (L1L1I1) r15.m21819OooO0o0();
        L1L1I1 l1l1i14 = (L1L1I1) r15.m21817OooO0o();
        L1L1I1 l1l1i15 = (L1L1I1) ((AbstractC9738llL1L) this).f23372OooO00o[0];
        L1L1I1 l1l1i16 = (L1L1I1) r15.m21803OooO00o(0);
        int[] OooO0O0 = AbstractC6163iLIl1.OooO0O0();
        int[] OooO00o2 = AbstractC6163iLIl1.OooO00o();
        int[] OooO00o3 = AbstractC6163iLIl1.OooO00o();
        int[] OooO00o4 = AbstractC6163iLIl1.OooO00o();
        boolean OooO00o5 = l1l1i15.m15907OooO00o();
        if (OooO00o5) {
            iArr2 = l1l1i13.OooO00o;
            iArr = l1l1i14.OooO00o;
        } else {
            C6083iIIi1L.OooO0o0(l1l1i15.OooO00o, OooO00o3);
            C6083iIIi1L.OooO0OO(OooO00o3, l1l1i13.OooO00o, OooO00o2);
            C6083iIIi1L.OooO0OO(OooO00o3, l1l1i15.OooO00o, OooO00o3);
            C6083iIIi1L.OooO0OO(OooO00o3, l1l1i14.OooO00o, OooO00o3);
            iArr2 = OooO00o2;
            iArr = OooO00o3;
        }
        boolean OooO00o6 = l1l1i16.m15907OooO00o();
        if (OooO00o6) {
            iArr4 = l1l1i1.OooO00o;
            iArr3 = l1l1i12.OooO00o;
        } else {
            C6083iIIi1L.OooO0o0(l1l1i16.OooO00o, OooO00o4);
            C6083iIIi1L.OooO0OO(OooO00o4, l1l1i1.OooO00o, OooO0O0);
            C6083iIIi1L.OooO0OO(OooO00o4, l1l1i16.OooO00o, OooO00o4);
            C6083iIIi1L.OooO0OO(OooO00o4, l1l1i12.OooO00o, OooO00o4);
            iArr4 = OooO0O0;
            iArr3 = OooO00o4;
        }
        int[] OooO00o7 = AbstractC6163iLIl1.OooO00o();
        C6083iIIi1L.OooO0o0(iArr4, iArr2, OooO00o7);
        C6083iIIi1L.OooO0o0(iArr3, iArr, OooO00o2);
        if (AbstractC6163iLIl1.OooO0O0(OooO00o7)) {
            return AbstractC6163iLIl1.OooO0O0(OooO00o2) ? OooO0o() : OooO00o.m15393OooO00o();
        }
        C6083iIIi1L.OooO0o0(OooO00o7, OooO00o3);
        int[] OooO00o8 = AbstractC6163iLIl1.OooO00o();
        C6083iIIi1L.OooO0OO(OooO00o3, OooO00o7, OooO00o8);
        C6083iIIi1L.OooO0OO(OooO00o3, iArr4, OooO00o3);
        C6083iIIi1L.OooO0OO(OooO00o8, OooO00o8);
        AbstractC6163iLIl1.m17090OooO00o(iArr3, OooO00o8, OooO0O0);
        C6083iIIi1L.OooO00o(AbstractC6163iLIl1.OooO0O0(OooO00o3, OooO00o3, OooO00o8), OooO00o8);
        L1L1I1 l1l1i17 = new L1L1I1(OooO00o4);
        C6083iIIi1L.OooO0o0(OooO00o2, l1l1i17.OooO00o);
        int[] iArr5 = l1l1i17.OooO00o;
        C6083iIIi1L.OooO0o0(iArr5, OooO00o8, iArr5);
        L1L1I1 l1l1i18 = new L1L1I1(OooO00o8);
        C6083iIIi1L.OooO0o0(OooO00o3, l1l1i17.OooO00o, l1l1i18.OooO00o);
        C6083iIIi1L.OooO0Oo(l1l1i18.OooO00o, OooO00o2, OooO0O0);
        C6083iIIi1L.OooO0Oo(OooO0O0, l1l1i18.OooO00o);
        L1L1I1 l1l1i19 = new L1L1I1(OooO00o7);
        if (!OooO00o5) {
            int[] iArr6 = l1l1i19.OooO00o;
            C6083iIIi1L.OooO0OO(iArr6, l1l1i15.OooO00o, iArr6);
        }
        if (!OooO00o6) {
            int[] iArr7 = l1l1i19.OooO00o;
            C6083iIIi1L.OooO0OO(iArr7, l1l1i16.OooO00o, iArr7);
        }
        return new C9368ILLl(OooO00o, l1l1i17, l1l1i18, new AbstractC97441iIIL[]{l1l1i19}, ((AbstractC9738llL1L) this).f23371OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO0OO() {
        return m21814OooO0OO() ? this : new C9368ILLl(((AbstractC9738llL1L) this).OooO00o, ((AbstractC9738llL1L) this).f23369OooO00o, this.f23373OooO0O0.OooO0OO(), ((AbstractC9738llL1L) this).f23372OooO00o, ((AbstractC9738llL1L) this).f23371OooO00o);
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
        L1L1I1 l1l1i1 = (L1L1I1) this.f23373OooO0O0;
        if (l1l1i1.m15909OooO0O0()) {
            return OooO00o.m15393OooO00o();
        }
        L1L1I1 l1l1i12 = (L1L1I1) ((AbstractC9738llL1L) this).f23369OooO00o;
        L1L1I1 l1l1i13 = (L1L1I1) ((AbstractC9738llL1L) this).f23372OooO00o[0];
        int[] OooO00o2 = AbstractC6163iLIl1.OooO00o();
        C6083iIIi1L.OooO0o0(l1l1i1.OooO00o, OooO00o2);
        int[] OooO00o3 = AbstractC6163iLIl1.OooO00o();
        C6083iIIi1L.OooO0o0(OooO00o2, OooO00o3);
        int[] OooO00o4 = AbstractC6163iLIl1.OooO00o();
        C6083iIIi1L.OooO0o0(l1l1i12.OooO00o, OooO00o4);
        C6083iIIi1L.OooO00o(AbstractC6163iLIl1.OooO0O0(OooO00o4, OooO00o4, OooO00o4), OooO00o4);
        C6083iIIi1L.OooO0OO(OooO00o2, l1l1i12.OooO00o, OooO00o2);
        C6083iIIi1L.OooO00o(C1iiIiI.OooO0o(6, OooO00o2, 2, 0), OooO00o2);
        int[] OooO00o5 = AbstractC6163iLIl1.OooO00o();
        C6083iIIi1L.OooO00o(C1iiIiI.OooO0O0(6, OooO00o3, 3, 0, OooO00o5), OooO00o5);
        L1L1I1 l1l1i14 = new L1L1I1(OooO00o3);
        C6083iIIi1L.OooO0o0(OooO00o4, l1l1i14.OooO00o);
        int[] iArr = l1l1i14.OooO00o;
        C6083iIIi1L.OooO0o0(iArr, OooO00o2, iArr);
        int[] iArr2 = l1l1i14.OooO00o;
        C6083iIIi1L.OooO0o0(iArr2, OooO00o2, iArr2);
        L1L1I1 l1l1i15 = new L1L1I1(OooO00o2);
        C6083iIIi1L.OooO0o0(OooO00o2, l1l1i14.OooO00o, l1l1i15.OooO00o);
        int[] iArr3 = l1l1i15.OooO00o;
        C6083iIIi1L.OooO0OO(iArr3, OooO00o4, iArr3);
        int[] iArr4 = l1l1i15.OooO00o;
        C6083iIIi1L.OooO0o0(iArr4, OooO00o5, iArr4);
        L1L1I1 l1l1i16 = new L1L1I1(OooO00o4);
        C6083iIIi1L.OooO0o(l1l1i1.OooO00o, l1l1i16.OooO00o);
        if (!l1l1i13.m15907OooO00o()) {
            int[] iArr5 = l1l1i16.OooO00o;
            C6083iIIi1L.OooO0OO(iArr5, l1l1i13.OooO00o, iArr5);
        }
        return new C9368ILLl(OooO00o, l1l1i14, l1l1i15, new AbstractC97441iIIL[]{l1l1i16}, ((AbstractC9738llL1L) this).f23371OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO0o0() {
        return (m21814OooO0OO() || this.f23373OooO0O0.m21863OooO0O0()) ? this : OooO0o().OooO00o((AbstractC9738llL1L) this);
    }
}
