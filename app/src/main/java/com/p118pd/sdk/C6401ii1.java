package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC9738llL1L;

/* renamed from: com.pd.sdk.i丨i丨1  reason: invalid class name and case insensitive filesystem */
public class C6401ii1 extends AbstractC9738llL1L.OooO0OO {
    public C6401ii1(IIiLIli r2, AbstractC97441iIIL r3, AbstractC97441iIIL r4) {
        this(r2, r3, r4, false);
    }

    public C6401ii1(IIiLIli r2, AbstractC97441iIIL r3, AbstractC97441iIIL r4, boolean z) {
        super(r2, r3, r4);
        if ((r3 == null) == (r4 != null ? false : true)) {
            ((AbstractC9738llL1L) this).f23371OooO00o = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public C6401ii1(IIiLIli r1, AbstractC97441iIIL r2, AbstractC97441iIIL r3, AbstractC97441iIIL[] r4, boolean z) {
        super(r1, r2, r3, r4);
        ((AbstractC9738llL1L) this).f23371OooO00o = z;
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L.OooO0OO
    public AbstractC9738llL1L OooO00o() {
        return new C6401ii1(null, m21802OooO00o(), m21810OooO0O0());
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
        C9858lii r2 = (C9858lii) ((AbstractC9738llL1L) this).f23369OooO00o;
        C9858lii r4 = (C9858lii) this.f23373OooO0O0;
        C9858lii r5 = (C9858lii) r17.m21819OooO0o0();
        C9858lii r6 = (C9858lii) r17.m21817OooO0o();
        C9858lii r7 = (C9858lii) ((AbstractC9738llL1L) this).f23372OooO00o[0];
        C9858lii r1 = (C9858lii) r17.m21803OooO00o(0);
        int[] OooO00o2 = C1iiIiI.OooO00o(24);
        int[] OooO00o3 = C1iiIiI.OooO00o(24);
        int[] OooO00o4 = C1iiIiI.OooO00o(12);
        int[] OooO00o5 = C1iiIiI.OooO00o(12);
        boolean OooO00o6 = r7.m21944OooO00o();
        if (OooO00o6) {
            iArr2 = r5.OooO00o;
            iArr = r6.OooO00o;
        } else {
            C6349ilill1.OooO0o0(r7.OooO00o, OooO00o4);
            C6349ilill1.OooO0OO(OooO00o4, r5.OooO00o, OooO00o3);
            C6349ilill1.OooO0OO(OooO00o4, r7.OooO00o, OooO00o4);
            C6349ilill1.OooO0OO(OooO00o4, r6.OooO00o, OooO00o4);
            iArr2 = OooO00o3;
            iArr = OooO00o4;
        }
        boolean OooO00o7 = r1.m21944OooO00o();
        if (OooO00o7) {
            iArr4 = r2.OooO00o;
            iArr3 = r4.OooO00o;
        } else {
            C6349ilill1.OooO0o0(r1.OooO00o, OooO00o5);
            C6349ilill1.OooO0OO(OooO00o5, r2.OooO00o, OooO00o2);
            C6349ilill1.OooO0OO(OooO00o5, r1.OooO00o, OooO00o5);
            C6349ilill1.OooO0OO(OooO00o5, r4.OooO00o, OooO00o5);
            iArr4 = OooO00o2;
            iArr3 = OooO00o5;
        }
        int[] OooO00o8 = C1iiIiI.OooO00o(12);
        C6349ilill1.OooO0Oo(iArr4, iArr2, OooO00o8);
        int[] OooO00o9 = C1iiIiI.OooO00o(12);
        C6349ilill1.OooO0Oo(iArr3, iArr, OooO00o9);
        if (C1iiIiI.m21328OooO0O0(12, OooO00o8)) {
            return C1iiIiI.m21328OooO0O0(12, OooO00o9) ? OooO0o() : OooO00o.m15393OooO00o();
        }
        C6349ilill1.OooO0o0(OooO00o8, OooO00o4);
        int[] OooO00o10 = C1iiIiI.OooO00o(12);
        C6349ilill1.OooO0OO(OooO00o4, OooO00o8, OooO00o10);
        C6349ilill1.OooO0OO(OooO00o4, iArr4, OooO00o4);
        C6349ilill1.OooO0OO(OooO00o10, OooO00o10);
        L1LiIl.OooO00o(iArr3, OooO00o10, OooO00o2);
        C6349ilill1.OooO00o(C1iiIiI.OooO0O0(12, OooO00o4, OooO00o4, OooO00o10), OooO00o10);
        C9858lii r42 = new C9858lii(OooO00o5);
        C6349ilill1.OooO0o0(OooO00o9, r42.OooO00o);
        int[] iArr5 = r42.OooO00o;
        C6349ilill1.OooO0Oo(iArr5, OooO00o10, iArr5);
        C9858lii r11 = new C9858lii(OooO00o10);
        C6349ilill1.OooO0Oo(OooO00o4, r42.OooO00o, r11.OooO00o);
        L1LiIl.OooO00o(r11.OooO00o, OooO00o9, OooO00o3);
        C6349ilill1.OooO0O0(OooO00o2, OooO00o3, OooO00o2);
        C6349ilill1.OooO0Oo(OooO00o2, r11.OooO00o);
        C9858lii r22 = new C9858lii(OooO00o8);
        if (!OooO00o6) {
            int[] iArr6 = r22.OooO00o;
            C6349ilill1.OooO0OO(iArr6, r7.OooO00o, iArr6);
        }
        if (!OooO00o7) {
            int[] iArr7 = r22.OooO00o;
            C6349ilill1.OooO0OO(iArr7, r1.OooO00o, iArr7);
        }
        return new C6401ii1(OooO00o, r42, r11, new AbstractC97441iIIL[]{r22}, ((AbstractC9738llL1L) this).f23371OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO0OO() {
        return m21814OooO0OO() ? this : new C6401ii1(((AbstractC9738llL1L) this).OooO00o, ((AbstractC9738llL1L) this).f23369OooO00o, this.f23373OooO0O0.OooO0OO(), ((AbstractC9738llL1L) this).f23372OooO00o, ((AbstractC9738llL1L) this).f23371OooO00o);
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
        C9858lii r0 = (C9858lii) this.f23373OooO0O0;
        if (r0.m21946OooO0O0()) {
            return OooO00o.m15393OooO00o();
        }
        C9858lii r1 = (C9858lii) ((AbstractC9738llL1L) this).f23369OooO00o;
        C9858lii r3 = (C9858lii) ((AbstractC9738llL1L) this).f23372OooO00o[0];
        int[] OooO00o2 = C1iiIiI.OooO00o(12);
        int[] OooO00o3 = C1iiIiI.OooO00o(12);
        int[] OooO00o4 = C1iiIiI.OooO00o(12);
        C6349ilill1.OooO0o0(r0.OooO00o, OooO00o4);
        int[] OooO00o5 = C1iiIiI.OooO00o(12);
        C6349ilill1.OooO0o0(OooO00o4, OooO00o5);
        boolean OooO00o6 = r3.m21944OooO00o();
        int[] iArr = r3.OooO00o;
        if (!OooO00o6) {
            C6349ilill1.OooO0o0(iArr, OooO00o3);
            iArr = OooO00o3;
        }
        C6349ilill1.OooO0Oo(r1.OooO00o, iArr, OooO00o2);
        C6349ilill1.OooO00o(r1.OooO00o, iArr, OooO00o3);
        C6349ilill1.OooO0OO(OooO00o3, OooO00o2, OooO00o3);
        C6349ilill1.OooO00o(C1iiIiI.OooO0O0(12, OooO00o3, OooO00o3, OooO00o3), OooO00o3);
        C6349ilill1.OooO0OO(OooO00o4, r1.OooO00o, OooO00o4);
        C6349ilill1.OooO00o(C1iiIiI.OooO0o(12, OooO00o4, 2, 0), OooO00o4);
        C6349ilill1.OooO00o(C1iiIiI.OooO0O0(12, OooO00o5, 3, 0, OooO00o2), OooO00o2);
        C9858lii r5 = new C9858lii(OooO00o5);
        C6349ilill1.OooO0o0(OooO00o3, r5.OooO00o);
        int[] iArr2 = r5.OooO00o;
        C6349ilill1.OooO0Oo(iArr2, OooO00o4, iArr2);
        int[] iArr3 = r5.OooO00o;
        C6349ilill1.OooO0Oo(iArr3, OooO00o4, iArr3);
        C9858lii r9 = new C9858lii(OooO00o4);
        C6349ilill1.OooO0Oo(OooO00o4, r5.OooO00o, r9.OooO00o);
        int[] iArr4 = r9.OooO00o;
        C6349ilill1.OooO0OO(iArr4, OooO00o3, iArr4);
        int[] iArr5 = r9.OooO00o;
        C6349ilill1.OooO0Oo(iArr5, OooO00o2, iArr5);
        C9858lii r12 = new C9858lii(OooO00o3);
        C6349ilill1.OooO0o(r0.OooO00o, r12.OooO00o);
        if (!OooO00o6) {
            int[] iArr6 = r12.OooO00o;
            C6349ilill1.OooO0OO(iArr6, r3.OooO00o, iArr6);
        }
        return new C6401ii1(OooO00o, r5, r9, new AbstractC97441iIIL[]{r12}, ((AbstractC9738llL1L) this).f23371OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO0o0() {
        return (m21814OooO0OO() || this.f23373OooO0O0.m21863OooO0O0()) ? this : OooO0o().OooO00o((AbstractC9738llL1L) this);
    }
}
