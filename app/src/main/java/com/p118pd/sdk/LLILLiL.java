package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC9738llL1L;

/* renamed from: com.pd.sdk.LLILLiL */
public class LLILLiL extends AbstractC9738llL1L.OooO0OO {
    public LLILLiL(IIiLIli r2, AbstractC97441iIIL r3, AbstractC97441iIIL r4) {
        this(r2, r3, r4, false);
    }

    public LLILLiL(IIiLIli r2, AbstractC97441iIIL r3, AbstractC97441iIIL r4, boolean z) {
        super(r2, r3, r4);
        if ((r3 == null) == (r4 != null ? false : true)) {
            ((AbstractC9738llL1L) this).f23371OooO00o = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public LLILLiL(IIiLIli r1, AbstractC97441iIIL r2, AbstractC97441iIIL r3, AbstractC97441iIIL[] r4, boolean z) {
        super(r1, r2, r3, r4);
        ((AbstractC9738llL1L) this).f23371OooO00o = z;
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    public LLILLiL OooO00o(boolean z) {
        C9513LilLI r0 = (C9513LilLI) ((AbstractC9738llL1L) this).f23369OooO00o;
        C9513LilLI r1 = (C9513LilLI) this.f23373OooO0O0;
        C9513LilLI r2 = (C9513LilLI) ((AbstractC9738llL1L) this).f23372OooO00o[0];
        C9513LilLI OooO00o = OooO00o();
        int[] OooO00o2 = C1LLlIL.OooO00o();
        C6486lIILlLI.OooO0o0(r0.OooO00o, OooO00o2);
        C6486lIILlLI.OooO00o(C1LLlIL.OooO0O0(OooO00o2, OooO00o2, OooO00o2) + C1LLlIL.OooO00o(OooO00o.OooO00o, OooO00o2), OooO00o2);
        int[] OooO00o3 = C1LLlIL.OooO00o();
        C6486lIILlLI.OooO0o(r1.OooO00o, OooO00o3);
        int[] OooO00o4 = C1LLlIL.OooO00o();
        C6486lIILlLI.OooO0OO(OooO00o3, r1.OooO00o, OooO00o4);
        int[] OooO00o5 = C1LLlIL.OooO00o();
        C6486lIILlLI.OooO0OO(OooO00o4, r0.OooO00o, OooO00o5);
        C6486lIILlLI.OooO0o(OooO00o5, OooO00o5);
        int[] OooO00o6 = C1LLlIL.OooO00o();
        C6486lIILlLI.OooO0o0(OooO00o4, OooO00o6);
        C6486lIILlLI.OooO0o(OooO00o6, OooO00o6);
        C9513LilLI r10 = new C9513LilLI(OooO00o4);
        C6486lIILlLI.OooO0o0(OooO00o2, r10.OooO00o);
        int[] iArr = r10.OooO00o;
        C6486lIILlLI.OooO0o0(iArr, OooO00o5, iArr);
        int[] iArr2 = r10.OooO00o;
        C6486lIILlLI.OooO0o0(iArr2, OooO00o5, iArr2);
        C9513LilLI r11 = new C9513LilLI(OooO00o5);
        C6486lIILlLI.OooO0o0(OooO00o5, r10.OooO00o, r11.OooO00o);
        int[] iArr3 = r11.OooO00o;
        C6486lIILlLI.OooO0OO(iArr3, OooO00o2, iArr3);
        int[] iArr4 = r11.OooO00o;
        C6486lIILlLI.OooO0o0(iArr4, OooO00o6, iArr4);
        C9513LilLI r12 = new C9513LilLI(OooO00o3);
        if (!C1LLlIL.m21842OooO00o(r2.OooO00o)) {
            int[] iArr5 = r12.OooO00o;
            C6486lIILlLI.OooO0OO(iArr5, r2.OooO00o, iArr5);
        }
        C9513LilLI r22 = null;
        if (z) {
            r22 = new C9513LilLI(OooO00o6);
            int[] iArr6 = r22.OooO00o;
            C6486lIILlLI.OooO0OO(iArr6, OooO00o.OooO00o, iArr6);
            int[] iArr7 = r22.OooO00o;
            C6486lIILlLI.OooO0o(iArr7, iArr7);
        }
        return new LLILLiL(m21800OooO00o(), r10, r11, new AbstractC97441iIIL[]{r12, r22}, ((AbstractC9738llL1L) this).f23371OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L.OooO0OO
    public C9513LilLI OooO00o() {
        AbstractC97441iIIL[] r0 = ((AbstractC9738llL1L) this).f23372OooO00o;
        C9513LilLI r2 = (C9513LilLI) r0[1];
        if (r2 != null) {
            return r2;
        }
        C9513LilLI OooO00o = OooO00o((C9513LilLI) r0[0], (int[]) null);
        r0[1] = OooO00o;
        return OooO00o;
    }

    public C9513LilLI OooO00o(C9513LilLI r3, int[] iArr) {
        C9513LilLI r0 = (C9513LilLI) m21800OooO00o().m15394OooO00o();
        if (r3.m21577OooO00o()) {
            return r0;
        }
        C9513LilLI r1 = new C9513LilLI();
        if (iArr == null) {
            iArr = r1.OooO00o;
            C6486lIILlLI.OooO0o0(r3.OooO00o, iArr);
        }
        C6486lIILlLI.OooO0o0(iArr, r1.OooO00o);
        int[] iArr2 = r1.OooO00o;
        C6486lIILlLI.OooO0OO(iArr2, r0.OooO00o, iArr2);
        return r1;
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L.OooO0OO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC9738llL1L m16197OooO00o() {
        return new LLILLiL(null, m21802OooO00o(), m21810OooO0O0());
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
        C9513LilLI r0 = (C9513LilLI) ((AbstractC9738llL1L) this).f23369OooO00o;
        C9513LilLI r2 = (C9513LilLI) this.f23373OooO0O0;
        C9513LilLI r3 = (C9513LilLI) ((AbstractC9738llL1L) this).f23372OooO00o[0];
        C9513LilLI r5 = (C9513LilLI) r15.m21819OooO0o0();
        C9513LilLI r6 = (C9513LilLI) r15.m21817OooO0o();
        C9513LilLI r152 = (C9513LilLI) r15.m21803OooO00o(0);
        int[] OooO0O0 = C1LLlIL.OooO0O0();
        int[] OooO00o2 = C1LLlIL.OooO00o();
        int[] OooO00o3 = C1LLlIL.OooO00o();
        int[] OooO00o4 = C1LLlIL.OooO00o();
        boolean OooO00o5 = r3.m21577OooO00o();
        if (OooO00o5) {
            iArr2 = r5.OooO00o;
            iArr = r6.OooO00o;
        } else {
            C6486lIILlLI.OooO0o0(r3.OooO00o, OooO00o3);
            C6486lIILlLI.OooO0OO(OooO00o3, r5.OooO00o, OooO00o2);
            C6486lIILlLI.OooO0OO(OooO00o3, r3.OooO00o, OooO00o3);
            C6486lIILlLI.OooO0OO(OooO00o3, r6.OooO00o, OooO00o3);
            iArr2 = OooO00o2;
            iArr = OooO00o3;
        }
        boolean OooO00o6 = r152.m21577OooO00o();
        if (OooO00o6) {
            iArr4 = r0.OooO00o;
            iArr3 = r2.OooO00o;
        } else {
            C6486lIILlLI.OooO0o0(r152.OooO00o, OooO00o4);
            C6486lIILlLI.OooO0OO(OooO00o4, r0.OooO00o, OooO0O0);
            C6486lIILlLI.OooO0OO(OooO00o4, r152.OooO00o, OooO00o4);
            C6486lIILlLI.OooO0OO(OooO00o4, r2.OooO00o, OooO00o4);
            iArr4 = OooO0O0;
            iArr3 = OooO00o4;
        }
        int[] OooO00o7 = C1LLlIL.OooO00o();
        C6486lIILlLI.OooO0o0(iArr4, iArr2, OooO00o7);
        C6486lIILlLI.OooO0o0(iArr3, iArr, OooO00o2);
        if (C1LLlIL.OooO0O0(OooO00o7)) {
            return C1LLlIL.OooO0O0(OooO00o2) ? OooO0o() : OooO00o.m15393OooO00o();
        }
        int[] OooO00o8 = C1LLlIL.OooO00o();
        C6486lIILlLI.OooO0o0(OooO00o7, OooO00o8);
        int[] OooO00o9 = C1LLlIL.OooO00o();
        C6486lIILlLI.OooO0OO(OooO00o8, OooO00o7, OooO00o9);
        C6486lIILlLI.OooO0OO(OooO00o8, iArr4, OooO00o3);
        C6486lIILlLI.OooO0OO(OooO00o9, OooO00o9);
        C1LLlIL.m21841OooO00o(iArr3, OooO00o9, OooO0O0);
        C6486lIILlLI.OooO00o(C1LLlIL.OooO0O0(OooO00o3, OooO00o3, OooO00o9), OooO00o9);
        C9513LilLI r22 = new C9513LilLI(OooO00o4);
        C6486lIILlLI.OooO0o0(OooO00o2, r22.OooO00o);
        int[] iArr5 = r22.OooO00o;
        C6486lIILlLI.OooO0o0(iArr5, OooO00o9, iArr5);
        C9513LilLI r10 = new C9513LilLI(OooO00o9);
        C6486lIILlLI.OooO0o0(OooO00o3, r22.OooO00o, r10.OooO00o);
        C6486lIILlLI.OooO0Oo(r10.OooO00o, OooO00o2, OooO0O0);
        C6486lIILlLI.OooO0Oo(OooO0O0, r10.OooO00o);
        C9513LilLI r02 = new C9513LilLI(OooO00o7);
        if (!OooO00o5) {
            int[] iArr6 = r02.OooO00o;
            C6486lIILlLI.OooO0OO(iArr6, r3.OooO00o, iArr6);
        }
        if (!OooO00o6) {
            int[] iArr7 = r02.OooO00o;
            C6486lIILlLI.OooO0OO(iArr7, r152.OooO00o, iArr7);
        }
        if (!OooO00o5 || !OooO00o6) {
            OooO00o8 = null;
        }
        return new LLILLiL(OooO00o, r22, r10, new AbstractC97441iIIL[]{r02, OooO00o(r02, OooO00o8)}, ((AbstractC9738llL1L) this).f23371OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC97441iIIL OooO00o(int i) {
        return i == 1 ? OooO00o() : super.m21803OooO00o(i);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO0OO() {
        return m21814OooO0OO() ? this : new LLILLiL(m21800OooO00o(), ((AbstractC9738llL1L) this).f23369OooO00o, this.f23373OooO0O0.OooO0OO(), ((AbstractC9738llL1L) this).f23372OooO00o, ((AbstractC9738llL1L) this).f23371OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO0OO(AbstractC9738llL1L r2) {
        return this == r2 ? OooO0o0() : m21814OooO0OO() ? r2 : r2.m21814OooO0OO() ? OooO0o() : this.f23373OooO0O0.m21863OooO0O0() ? r2 : OooO00o(false).OooO00o(r2);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO0o() {
        if (m21814OooO0OO()) {
            return this;
        }
        return this.f23373OooO0O0.m21863OooO0O0() ? m21800OooO00o().m15393OooO00o() : OooO00o(true);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO0o0() {
        return (!m21814OooO0OO() && !this.f23373OooO0O0.m21863OooO0O0()) ? OooO00o(false).OooO00o((AbstractC9738llL1L) this) : this;
    }
}
