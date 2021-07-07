package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC9738llL1L;

/* renamed from: com.pd.sdk.l11丨lI  reason: invalid class name and case insensitive filesystem */
public class C6439l11lI extends AbstractC9738llL1L.OooO0OO {
    public C6439l11lI(IIiLIli r2, AbstractC97441iIIL r3, AbstractC97441iIIL r4) {
        this(r2, r3, r4, false);
    }

    public C6439l11lI(IIiLIli r2, AbstractC97441iIIL r3, AbstractC97441iIIL r4, boolean z) {
        super(r2, r3, r4);
        if ((r3 == null) == (r4 != null ? false : true)) {
            ((AbstractC9738llL1L) this).f23371OooO00o = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public C6439l11lI(IIiLIli r1, AbstractC97441iIIL r2, AbstractC97441iIIL r3, AbstractC97441iIIL[] r4, boolean z) {
        super(r1, r2, r3, r4);
        ((AbstractC9738llL1L) this).f23371OooO00o = z;
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L.OooO0OO
    public AbstractC9738llL1L OooO00o() {
        return new C6439l11lI(null, m21802OooO00o(), m21810OooO0O0());
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO00o(AbstractC9738llL1L r17) {
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int[] iArr4;
        if (m21814OooO0OO()) {
            return r17;
        }
        if (r17.m21814OooO0OO()) {
            return this;
        }
        if (this == r17) {
            return OooO0o();
        }
        IIiLIli OooO00o = m21800OooO00o();
        C98691i r2 = (C98691i) ((AbstractC9738llL1L) this).f23369OooO00o;
        C98691i r4 = (C98691i) this.f23373OooO0O0;
        C98691i r5 = (C98691i) r17.m21819OooO0o0();
        C98691i r6 = (C98691i) r17.m21817OooO0o();
        C98691i r7 = (C98691i) ((AbstractC9738llL1L) this).f23372OooO00o[0];
        C98691i r1 = (C98691i) r17.m21803OooO00o(0);
        int[] OooO00o2 = C1iiIiI.OooO00o(17);
        int[] OooO00o3 = C1iiIiI.OooO00o(17);
        int[] OooO00o4 = C1iiIiI.OooO00o(17);
        int[] OooO00o5 = C1iiIiI.OooO00o(17);
        boolean OooO00o6 = r7.m21955OooO00o();
        if (OooO00o6) {
            iArr2 = r5.OooO00o;
            iArr = r6.OooO00o;
        } else {
            C6742ll1lI.OooO0o(r7.OooO00o, OooO00o4);
            C6742ll1lI.OooO0OO(OooO00o4, r5.OooO00o, OooO00o3);
            C6742ll1lI.OooO0OO(OooO00o4, r7.OooO00o, OooO00o4);
            C6742ll1lI.OooO0OO(OooO00o4, r6.OooO00o, OooO00o4);
            iArr2 = OooO00o3;
            iArr = OooO00o4;
        }
        boolean OooO00o7 = r1.m21955OooO00o();
        if (OooO00o7) {
            iArr4 = r2.OooO00o;
            iArr3 = r4.OooO00o;
        } else {
            C6742ll1lI.OooO0o(r1.OooO00o, OooO00o5);
            C6742ll1lI.OooO0OO(OooO00o5, r2.OooO00o, OooO00o2);
            C6742ll1lI.OooO0OO(OooO00o5, r1.OooO00o, OooO00o5);
            C6742ll1lI.OooO0OO(OooO00o5, r4.OooO00o, OooO00o5);
            iArr4 = OooO00o2;
            iArr3 = OooO00o5;
        }
        int[] OooO00o8 = C1iiIiI.OooO00o(17);
        C6742ll1lI.OooO0Oo(iArr4, iArr2, OooO00o8);
        C6742ll1lI.OooO0Oo(iArr3, iArr, OooO00o3);
        if (C1iiIiI.m21328OooO0O0(17, OooO00o8)) {
            return C1iiIiI.m21328OooO0O0(17, OooO00o3) ? OooO0o() : OooO00o.m15393OooO00o();
        }
        C6742ll1lI.OooO0o(OooO00o8, OooO00o4);
        int[] OooO00o9 = C1iiIiI.OooO00o(17);
        C6742ll1lI.OooO0OO(OooO00o4, OooO00o8, OooO00o9);
        C6742ll1lI.OooO0OO(OooO00o4, iArr4, OooO00o4);
        C6742ll1lI.OooO0OO(iArr3, OooO00o9, OooO00o2);
        C98691i r42 = new C98691i(OooO00o5);
        C6742ll1lI.OooO0o(OooO00o3, r42.OooO00o);
        int[] iArr5 = r42.OooO00o;
        C6742ll1lI.OooO00o(iArr5, OooO00o9, iArr5);
        int[] iArr6 = r42.OooO00o;
        C6742ll1lI.OooO0Oo(iArr6, OooO00o4, iArr6);
        int[] iArr7 = r42.OooO00o;
        C6742ll1lI.OooO0Oo(iArr7, OooO00o4, iArr7);
        C98691i r62 = new C98691i(OooO00o9);
        C6742ll1lI.OooO0Oo(OooO00o4, r42.OooO00o, r62.OooO00o);
        C6742ll1lI.OooO0OO(r62.OooO00o, OooO00o3, OooO00o3);
        C6742ll1lI.OooO0Oo(OooO00o3, OooO00o2, r62.OooO00o);
        C98691i r22 = new C98691i(OooO00o8);
        if (!OooO00o6) {
            int[] iArr8 = r22.OooO00o;
            C6742ll1lI.OooO0OO(iArr8, r7.OooO00o, iArr8);
        }
        if (!OooO00o7) {
            int[] iArr9 = r22.OooO00o;
            C6742ll1lI.OooO0OO(iArr9, r1.OooO00o, iArr9);
        }
        return new C6439l11lI(OooO00o, r42, r62, new AbstractC97441iIIL[]{r22}, ((AbstractC9738llL1L) this).f23371OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r1) {
        return OooO0O0(OooO0Oo(r1));
    }

    public AbstractC97441iIIL OooO00o(AbstractC97441iIIL r1, AbstractC97441iIIL r2, AbstractC97441iIIL r3, AbstractC97441iIIL r4) {
        return r1.OooO00o(r2).OooO0o0().OooO0Oo(r3).OooO0Oo(r4);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC97441iIIL OooO0O0(AbstractC97441iIIL r1) {
        return OooO0Oo(OooO0Oo(r1));
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO0OO() {
        return m21814OooO0OO() ? this : new C6439l11lI(((AbstractC9738llL1L) this).OooO00o, ((AbstractC9738llL1L) this).f23369OooO00o, this.f23373OooO0O0.OooO0OO(), ((AbstractC9738llL1L) this).f23372OooO00o, ((AbstractC9738llL1L) this).f23371OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO0OO(AbstractC9738llL1L r2) {
        return this == r2 ? OooO0o0() : m21814OooO0OO() ? r2 : r2.m21814OooO0OO() ? OooO0o() : this.f23373OooO0O0.m21863OooO0O0() ? r2 : OooO0o().OooO00o(r2);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC97441iIIL OooO0OO(AbstractC97441iIIL r2) {
        return OooO0Oo(r2).OooO00o(r2);
    }

    public AbstractC97441iIIL OooO0Oo(AbstractC97441iIIL r1) {
        return r1.OooO00o(r1);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO0o() {
        if (m21814OooO0OO()) {
            return this;
        }
        IIiLIli OooO00o = m21800OooO00o();
        C98691i r0 = (C98691i) this.f23373OooO0O0;
        if (r0.m21957OooO0O0()) {
            return OooO00o.m15393OooO00o();
        }
        C98691i r1 = (C98691i) ((AbstractC9738llL1L) this).f23369OooO00o;
        C98691i r3 = (C98691i) ((AbstractC9738llL1L) this).f23372OooO00o[0];
        int[] OooO00o2 = C1iiIiI.OooO00o(17);
        int[] OooO00o3 = C1iiIiI.OooO00o(17);
        int[] OooO00o4 = C1iiIiI.OooO00o(17);
        C6742ll1lI.OooO0o(r0.OooO00o, OooO00o4);
        int[] OooO00o5 = C1iiIiI.OooO00o(17);
        C6742ll1lI.OooO0o(OooO00o4, OooO00o5);
        boolean OooO00o6 = r3.m21955OooO00o();
        int[] iArr = r3.OooO00o;
        if (!OooO00o6) {
            C6742ll1lI.OooO0o(iArr, OooO00o3);
            iArr = OooO00o3;
        }
        C6742ll1lI.OooO0Oo(r1.OooO00o, iArr, OooO00o2);
        C6742ll1lI.OooO00o(r1.OooO00o, iArr, OooO00o3);
        C6742ll1lI.OooO0OO(OooO00o3, OooO00o2, OooO00o3);
        C1iiIiI.OooO0O0(17, OooO00o3, OooO00o3, OooO00o3);
        C6742ll1lI.OooO00o(OooO00o3);
        C6742ll1lI.OooO0OO(OooO00o4, r1.OooO00o, OooO00o4);
        C1iiIiI.OooO0o(17, OooO00o4, 2, 0);
        C6742ll1lI.OooO00o(OooO00o4);
        C1iiIiI.OooO0O0(17, OooO00o5, 3, 0, OooO00o2);
        C6742ll1lI.OooO00o(OooO00o2);
        C98691i r5 = new C98691i(OooO00o5);
        C6742ll1lI.OooO0o(OooO00o3, r5.OooO00o);
        int[] iArr2 = r5.OooO00o;
        C6742ll1lI.OooO0Oo(iArr2, OooO00o4, iArr2);
        int[] iArr3 = r5.OooO00o;
        C6742ll1lI.OooO0Oo(iArr3, OooO00o4, iArr3);
        C98691i r9 = new C98691i(OooO00o4);
        C6742ll1lI.OooO0Oo(OooO00o4, r5.OooO00o, r9.OooO00o);
        int[] iArr4 = r9.OooO00o;
        C6742ll1lI.OooO0OO(iArr4, OooO00o3, iArr4);
        int[] iArr5 = r9.OooO00o;
        C6742ll1lI.OooO0Oo(iArr5, OooO00o2, iArr5);
        C98691i r12 = new C98691i(OooO00o3);
        C6742ll1lI.OooO0oO(r0.OooO00o, r12.OooO00o);
        if (!OooO00o6) {
            int[] iArr6 = r12.OooO00o;
            C6742ll1lI.OooO0OO(iArr6, r3.OooO00o, iArr6);
        }
        return new C6439l11lI(OooO00o, r5, r9, new AbstractC97441iIIL[]{r12}, ((AbstractC9738llL1L) this).f23371OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO0o0() {
        return (m21814OooO0OO() || this.f23373OooO0O0.m21863OooO0O0()) ? this : OooO0o().OooO00o((AbstractC9738llL1L) this);
    }
}
