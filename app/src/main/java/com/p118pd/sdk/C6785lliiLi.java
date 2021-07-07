package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC9738llL1L;

/* renamed from: com.pd.sdk.lliiLi丨  reason: invalid class name and case insensitive filesystem */
public class C6785lliiLi extends AbstractC9738llL1L.OooO0OO {
    public C6785lliiLi(IIiLIli r2, AbstractC97441iIIL r3, AbstractC97441iIIL r4) {
        this(r2, r3, r4, false);
    }

    public C6785lliiLi(IIiLIli r2, AbstractC97441iIIL r3, AbstractC97441iIIL r4, boolean z) {
        super(r2, r3, r4);
        if ((r3 == null) == (r4 != null ? false : true)) {
            ((AbstractC9738llL1L) this).f23371OooO00o = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public C6785lliiLi(IIiLIli r1, AbstractC97441iIIL r2, AbstractC97441iIIL r3, AbstractC97441iIIL[] r4, boolean z) {
        super(r1, r2, r3, r4);
        ((AbstractC9738llL1L) this).f23371OooO00o = z;
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L.OooO0OO
    public AbstractC9738llL1L OooO00o() {
        return new C6785lliiLi(null, m21802OooO00o(), m21810OooO0O0());
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
        C6495lIIlIl liilil = (C6495lIIlIl) ((AbstractC9738llL1L) this).f23369OooO00o;
        C6495lIIlIl liilil2 = (C6495lIIlIl) this.f23373OooO0O0;
        C6495lIIlIl liilil3 = (C6495lIIlIl) r15.m21819OooO0o0();
        C6495lIIlIl liilil4 = (C6495lIIlIl) r15.m21817OooO0o();
        C6495lIIlIl liilil5 = (C6495lIIlIl) ((AbstractC9738llL1L) this).f23372OooO00o[0];
        C6495lIIlIl liilil6 = (C6495lIIlIl) r15.m21803OooO00o(0);
        int[] OooO0O0 = C1LLlIL.OooO0O0();
        int[] OooO00o2 = C1LLlIL.OooO00o();
        int[] OooO00o3 = C1LLlIL.OooO00o();
        int[] OooO00o4 = C1LLlIL.OooO00o();
        boolean OooO00o5 = liilil5.m17628OooO00o();
        if (OooO00o5) {
            iArr2 = liilil3.OooO00o;
            iArr = liilil4.OooO00o;
        } else {
            C9444ILl.OooO0o0(liilil5.OooO00o, OooO00o3);
            C9444ILl.OooO0OO(OooO00o3, liilil3.OooO00o, OooO00o2);
            C9444ILl.OooO0OO(OooO00o3, liilil5.OooO00o, OooO00o3);
            C9444ILl.OooO0OO(OooO00o3, liilil4.OooO00o, OooO00o3);
            iArr2 = OooO00o2;
            iArr = OooO00o3;
        }
        boolean OooO00o6 = liilil6.m17628OooO00o();
        if (OooO00o6) {
            iArr4 = liilil.OooO00o;
            iArr3 = liilil2.OooO00o;
        } else {
            C9444ILl.OooO0o0(liilil6.OooO00o, OooO00o4);
            C9444ILl.OooO0OO(OooO00o4, liilil.OooO00o, OooO0O0);
            C9444ILl.OooO0OO(OooO00o4, liilil6.OooO00o, OooO00o4);
            C9444ILl.OooO0OO(OooO00o4, liilil2.OooO00o, OooO00o4);
            iArr4 = OooO0O0;
            iArr3 = OooO00o4;
        }
        int[] OooO00o7 = C1LLlIL.OooO00o();
        C9444ILl.OooO0o0(iArr4, iArr2, OooO00o7);
        C9444ILl.OooO0o0(iArr3, iArr, OooO00o2);
        if (C1LLlIL.OooO0O0(OooO00o7)) {
            return C1LLlIL.OooO0O0(OooO00o2) ? OooO0o() : OooO00o.m15393OooO00o();
        }
        C9444ILl.OooO0o0(OooO00o7, OooO00o3);
        int[] OooO00o8 = C1LLlIL.OooO00o();
        C9444ILl.OooO0OO(OooO00o3, OooO00o7, OooO00o8);
        C9444ILl.OooO0OO(OooO00o3, iArr4, OooO00o3);
        C9444ILl.OooO0OO(OooO00o8, OooO00o8);
        C1LLlIL.m21841OooO00o(iArr3, OooO00o8, OooO0O0);
        C9444ILl.OooO00o(C1LLlIL.OooO0O0(OooO00o3, OooO00o3, OooO00o8), OooO00o8);
        C6495lIIlIl liilil7 = new C6495lIIlIl(OooO00o4);
        C9444ILl.OooO0o0(OooO00o2, liilil7.OooO00o);
        int[] iArr5 = liilil7.OooO00o;
        C9444ILl.OooO0o0(iArr5, OooO00o8, iArr5);
        C6495lIIlIl liilil8 = new C6495lIIlIl(OooO00o8);
        C9444ILl.OooO0o0(OooO00o3, liilil7.OooO00o, liilil8.OooO00o);
        C9444ILl.OooO0Oo(liilil8.OooO00o, OooO00o2, OooO0O0);
        C9444ILl.OooO0Oo(OooO0O0, liilil8.OooO00o);
        C6495lIIlIl liilil9 = new C6495lIIlIl(OooO00o7);
        if (!OooO00o5) {
            int[] iArr6 = liilil9.OooO00o;
            C9444ILl.OooO0OO(iArr6, liilil5.OooO00o, iArr6);
        }
        if (!OooO00o6) {
            int[] iArr7 = liilil9.OooO00o;
            C9444ILl.OooO0OO(iArr7, liilil6.OooO00o, iArr7);
        }
        return new C6785lliiLi(OooO00o, liilil7, liilil8, new AbstractC97441iIIL[]{liilil9}, ((AbstractC9738llL1L) this).f23371OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO0OO() {
        return m21814OooO0OO() ? this : new C6785lliiLi(((AbstractC9738llL1L) this).OooO00o, ((AbstractC9738llL1L) this).f23369OooO00o, this.f23373OooO0O0.OooO0OO(), ((AbstractC9738llL1L) this).f23372OooO00o, ((AbstractC9738llL1L) this).f23371OooO00o);
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
        C6495lIIlIl liilil = (C6495lIIlIl) this.f23373OooO0O0;
        if (liilil.m17630OooO0O0()) {
            return OooO00o.m15393OooO00o();
        }
        C6495lIIlIl liilil2 = (C6495lIIlIl) ((AbstractC9738llL1L) this).f23369OooO00o;
        C6495lIIlIl liilil3 = (C6495lIIlIl) ((AbstractC9738llL1L) this).f23372OooO00o[0];
        int[] OooO00o2 = C1LLlIL.OooO00o();
        int[] OooO00o3 = C1LLlIL.OooO00o();
        int[] OooO00o4 = C1LLlIL.OooO00o();
        C9444ILl.OooO0o0(liilil.OooO00o, OooO00o4);
        int[] OooO00o5 = C1LLlIL.OooO00o();
        C9444ILl.OooO0o0(OooO00o4, OooO00o5);
        boolean OooO00o6 = liilil3.m17628OooO00o();
        int[] iArr = liilil3.OooO00o;
        if (!OooO00o6) {
            C9444ILl.OooO0o0(iArr, OooO00o3);
            iArr = OooO00o3;
        }
        C9444ILl.OooO0o0(liilil2.OooO00o, iArr, OooO00o2);
        C9444ILl.OooO00o(liilil2.OooO00o, iArr, OooO00o3);
        C9444ILl.OooO0OO(OooO00o3, OooO00o2, OooO00o3);
        C9444ILl.OooO00o(C1LLlIL.OooO0O0(OooO00o3, OooO00o3, OooO00o3), OooO00o3);
        C9444ILl.OooO0OO(OooO00o4, liilil2.OooO00o, OooO00o4);
        C9444ILl.OooO00o(C1iiIiI.OooO0o(8, OooO00o4, 2, 0), OooO00o4);
        C9444ILl.OooO00o(C1iiIiI.OooO0O0(8, OooO00o5, 3, 0, OooO00o2), OooO00o2);
        C6495lIIlIl liilil4 = new C6495lIIlIl(OooO00o5);
        C9444ILl.OooO0o0(OooO00o3, liilil4.OooO00o);
        int[] iArr2 = liilil4.OooO00o;
        C9444ILl.OooO0o0(iArr2, OooO00o4, iArr2);
        int[] iArr3 = liilil4.OooO00o;
        C9444ILl.OooO0o0(iArr3, OooO00o4, iArr3);
        C6495lIIlIl liilil5 = new C6495lIIlIl(OooO00o4);
        C9444ILl.OooO0o0(OooO00o4, liilil4.OooO00o, liilil5.OooO00o);
        int[] iArr4 = liilil5.OooO00o;
        C9444ILl.OooO0OO(iArr4, OooO00o3, iArr4);
        int[] iArr5 = liilil5.OooO00o;
        C9444ILl.OooO0o0(iArr5, OooO00o2, iArr5);
        C6495lIIlIl liilil6 = new C6495lIIlIl(OooO00o3);
        C9444ILl.OooO0o(liilil.OooO00o, liilil6.OooO00o);
        if (!OooO00o6) {
            int[] iArr6 = liilil6.OooO00o;
            C9444ILl.OooO0OO(iArr6, liilil3.OooO00o, iArr6);
        }
        return new C6785lliiLi(OooO00o, liilil4, liilil5, new AbstractC97441iIIL[]{liilil6}, ((AbstractC9738llL1L) this).f23371OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO0o0() {
        return (m21814OooO0OO() || this.f23373OooO0O0.m21863OooO0O0()) ? this : OooO0o().OooO00o((AbstractC9738llL1L) this);
    }
}
