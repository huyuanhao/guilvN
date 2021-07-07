package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC9738llL1L;

/* renamed from: com.pd.sdk.I丨丨I丨丨  reason: invalid class name and case insensitive filesystem */
public class C5567II extends AbstractC9738llL1L.OooO0OO {
    public C5567II(IIiLIli r2, AbstractC97441iIIL r3, AbstractC97441iIIL r4) {
        this(r2, r3, r4, false);
    }

    public C5567II(IIiLIli r2, AbstractC97441iIIL r3, AbstractC97441iIIL r4, boolean z) {
        super(r2, r3, r4);
        if ((r3 == null) == (r4 != null ? false : true)) {
            ((AbstractC9738llL1L) this).f23371OooO00o = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public C5567II(IIiLIli r1, AbstractC97441iIIL r2, AbstractC97441iIIL r3, AbstractC97441iIIL[] r4, boolean z) {
        super(r1, r2, r3, r4);
        ((AbstractC9738llL1L) this).f23371OooO00o = z;
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L.OooO0OO
    public AbstractC9738llL1L OooO00o() {
        return new C5567II(null, m21802OooO00o(), m21810OooO0O0());
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
        C9540LllI1L r0 = (C9540LllI1L) ((AbstractC9738llL1L) this).f23369OooO00o;
        C9540LllI1L r2 = (C9540LllI1L) this.f23373OooO0O0;
        C9540LllI1L r3 = (C9540LllI1L) r15.m21819OooO0o0();
        C9540LllI1L r4 = (C9540LllI1L) r15.m21817OooO0o();
        C9540LllI1L r5 = (C9540LllI1L) ((AbstractC9738llL1L) this).f23372OooO00o[0];
        C9540LllI1L r152 = (C9540LllI1L) r15.m21803OooO00o(0);
        int[] OooO0O0 = AbstractC6163iLIl1.OooO0O0();
        int[] OooO00o2 = AbstractC6163iLIl1.OooO00o();
        int[] OooO00o3 = AbstractC6163iLIl1.OooO00o();
        int[] OooO00o4 = AbstractC6163iLIl1.OooO00o();
        boolean OooO00o5 = r5.m21598OooO00o();
        if (OooO00o5) {
            iArr2 = r3.OooO00o;
            iArr = r4.OooO00o;
        } else {
            IIIil.OooO0o0(r5.OooO00o, OooO00o3);
            IIIil.OooO0OO(OooO00o3, r3.OooO00o, OooO00o2);
            IIIil.OooO0OO(OooO00o3, r5.OooO00o, OooO00o3);
            IIIil.OooO0OO(OooO00o3, r4.OooO00o, OooO00o3);
            iArr2 = OooO00o2;
            iArr = OooO00o3;
        }
        boolean OooO00o6 = r152.m21598OooO00o();
        if (OooO00o6) {
            iArr4 = r0.OooO00o;
            iArr3 = r2.OooO00o;
        } else {
            IIIil.OooO0o0(r152.OooO00o, OooO00o4);
            IIIil.OooO0OO(OooO00o4, r0.OooO00o, OooO0O0);
            IIIil.OooO0OO(OooO00o4, r152.OooO00o, OooO00o4);
            IIIil.OooO0OO(OooO00o4, r2.OooO00o, OooO00o4);
            iArr4 = OooO0O0;
            iArr3 = OooO00o4;
        }
        int[] OooO00o7 = AbstractC6163iLIl1.OooO00o();
        IIIil.OooO0o0(iArr4, iArr2, OooO00o7);
        IIIil.OooO0o0(iArr3, iArr, OooO00o2);
        if (AbstractC6163iLIl1.OooO0O0(OooO00o7)) {
            return AbstractC6163iLIl1.OooO0O0(OooO00o2) ? OooO0o() : OooO00o.m15393OooO00o();
        }
        IIIil.OooO0o0(OooO00o7, OooO00o3);
        int[] OooO00o8 = AbstractC6163iLIl1.OooO00o();
        IIIil.OooO0OO(OooO00o3, OooO00o7, OooO00o8);
        IIIil.OooO0OO(OooO00o3, iArr4, OooO00o3);
        IIIil.OooO0OO(OooO00o8, OooO00o8);
        AbstractC6163iLIl1.m17090OooO00o(iArr3, OooO00o8, OooO0O0);
        IIIil.OooO00o(AbstractC6163iLIl1.OooO0O0(OooO00o3, OooO00o3, OooO00o8), OooO00o8);
        C9540LllI1L r22 = new C9540LllI1L(OooO00o4);
        IIIil.OooO0o0(OooO00o2, r22.OooO00o);
        int[] iArr5 = r22.OooO00o;
        IIIil.OooO0o0(iArr5, OooO00o8, iArr5);
        C9540LllI1L r42 = new C9540LllI1L(OooO00o8);
        IIIil.OooO0o0(OooO00o3, r22.OooO00o, r42.OooO00o);
        IIIil.OooO0Oo(r42.OooO00o, OooO00o2, OooO0O0);
        IIIil.OooO0Oo(OooO0O0, r42.OooO00o);
        C9540LllI1L r02 = new C9540LllI1L(OooO00o7);
        if (!OooO00o5) {
            int[] iArr6 = r02.OooO00o;
            IIIil.OooO0OO(iArr6, r5.OooO00o, iArr6);
        }
        if (!OooO00o6) {
            int[] iArr7 = r02.OooO00o;
            IIIil.OooO0OO(iArr7, r152.OooO00o, iArr7);
        }
        return new C5567II(OooO00o, r22, r42, new AbstractC97441iIIL[]{r02}, ((AbstractC9738llL1L) this).f23371OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO0OO() {
        return m21814OooO0OO() ? this : new C5567II(((AbstractC9738llL1L) this).OooO00o, ((AbstractC9738llL1L) this).f23369OooO00o, this.f23373OooO0O0.OooO0OO(), ((AbstractC9738llL1L) this).f23372OooO00o, ((AbstractC9738llL1L) this).f23371OooO00o);
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
        C9540LllI1L r0 = (C9540LllI1L) this.f23373OooO0O0;
        if (r0.m21600OooO0O0()) {
            return OooO00o.m15393OooO00o();
        }
        C9540LllI1L r1 = (C9540LllI1L) ((AbstractC9738llL1L) this).f23369OooO00o;
        C9540LllI1L r3 = (C9540LllI1L) ((AbstractC9738llL1L) this).f23372OooO00o[0];
        int[] OooO00o2 = AbstractC6163iLIl1.OooO00o();
        int[] OooO00o3 = AbstractC6163iLIl1.OooO00o();
        int[] OooO00o4 = AbstractC6163iLIl1.OooO00o();
        IIIil.OooO0o0(r0.OooO00o, OooO00o4);
        int[] OooO00o5 = AbstractC6163iLIl1.OooO00o();
        IIIil.OooO0o0(OooO00o4, OooO00o5);
        boolean OooO00o6 = r3.m21598OooO00o();
        int[] iArr = r3.OooO00o;
        if (!OooO00o6) {
            IIIil.OooO0o0(iArr, OooO00o3);
            iArr = OooO00o3;
        }
        IIIil.OooO0o0(r1.OooO00o, iArr, OooO00o2);
        IIIil.OooO00o(r1.OooO00o, iArr, OooO00o3);
        IIIil.OooO0OO(OooO00o3, OooO00o2, OooO00o3);
        IIIil.OooO00o(AbstractC6163iLIl1.OooO0O0(OooO00o3, OooO00o3, OooO00o3), OooO00o3);
        IIIil.OooO0OO(OooO00o4, r1.OooO00o, OooO00o4);
        IIIil.OooO00o(C1iiIiI.OooO0o(6, OooO00o4, 2, 0), OooO00o4);
        IIIil.OooO00o(C1iiIiI.OooO0O0(6, OooO00o5, 3, 0, OooO00o2), OooO00o2);
        C9540LllI1L r10 = new C9540LllI1L(OooO00o5);
        IIIil.OooO0o0(OooO00o3, r10.OooO00o);
        int[] iArr2 = r10.OooO00o;
        IIIil.OooO0o0(iArr2, OooO00o4, iArr2);
        int[] iArr3 = r10.OooO00o;
        IIIil.OooO0o0(iArr3, OooO00o4, iArr3);
        C9540LllI1L r8 = new C9540LllI1L(OooO00o4);
        IIIil.OooO0o0(OooO00o4, r10.OooO00o, r8.OooO00o);
        int[] iArr4 = r8.OooO00o;
        IIIil.OooO0OO(iArr4, OooO00o3, iArr4);
        int[] iArr5 = r8.OooO00o;
        IIIil.OooO0o0(iArr5, OooO00o2, iArr5);
        C9540LllI1L r12 = new C9540LllI1L(OooO00o3);
        IIIil.OooO0o(r0.OooO00o, r12.OooO00o);
        if (!OooO00o6) {
            int[] iArr6 = r12.OooO00o;
            IIIil.OooO0OO(iArr6, r3.OooO00o, iArr6);
        }
        return new C5567II(OooO00o, r10, r8, new AbstractC97441iIIL[]{r12}, ((AbstractC9738llL1L) this).f23371OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO0o0() {
        return (m21814OooO0OO() || this.f23373OooO0O0.m21863OooO0O0()) ? this : OooO0o().OooO00o((AbstractC9738llL1L) this);
    }
}
