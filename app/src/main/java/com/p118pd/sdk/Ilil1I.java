package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC9738llL1L;

/* renamed from: com.pd.sdk.Ili丨l1I  reason: invalid class name */
public class Ilil1I extends AbstractC9738llL1L.OooO0OO {
    public Ilil1I(IIiLIli r2, AbstractC97441iIIL r3, AbstractC97441iIIL r4) {
        this(r2, r3, r4, false);
    }

    public Ilil1I(IIiLIli r2, AbstractC97441iIIL r3, AbstractC97441iIIL r4, boolean z) {
        super(r2, r3, r4);
        if ((r3 == null) == (r4 != null ? false : true)) {
            ((AbstractC9738llL1L) this).f23371OooO00o = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public Ilil1I(IIiLIli r1, AbstractC97441iIIL r2, AbstractC97441iIIL r3, AbstractC97441iIIL[] r4, boolean z) {
        super(r1, r2, r3, r4);
        ((AbstractC9738llL1L) this).f23371OooO00o = z;
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L.OooO0OO
    public AbstractC9738llL1L OooO00o() {
        return new Ilil1I(null, m21802OooO00o(), m21810OooO0O0());
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
        iIL1Il iil1il = (iIL1Il) ((AbstractC9738llL1L) this).f23369OooO00o;
        iIL1Il iil1il2 = (iIL1Il) this.f23373OooO0O0;
        iIL1Il iil1il3 = (iIL1Il) r15.m21819OooO0o0();
        iIL1Il iil1il4 = (iIL1Il) r15.m21817OooO0o();
        iIL1Il iil1il5 = (iIL1Il) ((AbstractC9738llL1L) this).f23372OooO00o[0];
        iIL1Il iil1il6 = (iIL1Il) r15.m21803OooO00o(0);
        int[] OooO0O0 = LILLl.OooO0O0();
        int[] OooO00o2 = LILLl.OooO00o();
        int[] OooO00o3 = LILLl.OooO00o();
        int[] OooO00o4 = LILLl.OooO00o();
        boolean OooO00o5 = iil1il5.m16957OooO00o();
        if (OooO00o5) {
            iArr2 = iil1il3.OooO00o;
            iArr = iil1il4.OooO00o;
        } else {
            C9822Li1.OooO0o0(iil1il5.OooO00o, OooO00o3);
            C9822Li1.OooO0OO(OooO00o3, iil1il3.OooO00o, OooO00o2);
            C9822Li1.OooO0OO(OooO00o3, iil1il5.OooO00o, OooO00o3);
            C9822Li1.OooO0OO(OooO00o3, iil1il4.OooO00o, OooO00o3);
            iArr2 = OooO00o2;
            iArr = OooO00o3;
        }
        boolean OooO00o6 = iil1il6.m16957OooO00o();
        if (OooO00o6) {
            iArr4 = iil1il.OooO00o;
            iArr3 = iil1il2.OooO00o;
        } else {
            C9822Li1.OooO0o0(iil1il6.OooO00o, OooO00o4);
            C9822Li1.OooO0OO(OooO00o4, iil1il.OooO00o, OooO0O0);
            C9822Li1.OooO0OO(OooO00o4, iil1il6.OooO00o, OooO00o4);
            C9822Li1.OooO0OO(OooO00o4, iil1il2.OooO00o, OooO00o4);
            iArr4 = OooO0O0;
            iArr3 = OooO00o4;
        }
        int[] OooO00o7 = LILLl.OooO00o();
        C9822Li1.OooO0o0(iArr4, iArr2, OooO00o7);
        C9822Li1.OooO0o0(iArr3, iArr, OooO00o2);
        if (LILLl.OooO0O0(OooO00o7)) {
            return LILLl.OooO0O0(OooO00o2) ? OooO0o() : OooO00o.m15393OooO00o();
        }
        C9822Li1.OooO0o0(OooO00o7, OooO00o3);
        int[] OooO00o8 = LILLl.OooO00o();
        C9822Li1.OooO0OO(OooO00o3, OooO00o7, OooO00o8);
        C9822Li1.OooO0OO(OooO00o3, iArr4, OooO00o3);
        C9822Li1.OooO0OO(OooO00o8, OooO00o8);
        LILLl.m16052OooO00o(iArr3, OooO00o8, OooO0O0);
        C9822Li1.OooO00o(LILLl.OooO0O0(OooO00o3, OooO00o3, OooO00o8), OooO00o8);
        iIL1Il iil1il7 = new iIL1Il(OooO00o4);
        C9822Li1.OooO0o0(OooO00o2, iil1il7.OooO00o);
        int[] iArr5 = iil1il7.OooO00o;
        C9822Li1.OooO0o0(iArr5, OooO00o8, iArr5);
        iIL1Il iil1il8 = new iIL1Il(OooO00o8);
        C9822Li1.OooO0o0(OooO00o3, iil1il7.OooO00o, iil1il8.OooO00o);
        C9822Li1.OooO0Oo(iil1il8.OooO00o, OooO00o2, OooO0O0);
        C9822Li1.OooO0Oo(OooO0O0, iil1il8.OooO00o);
        iIL1Il iil1il9 = new iIL1Il(OooO00o7);
        if (!OooO00o5) {
            int[] iArr6 = iil1il9.OooO00o;
            C9822Li1.OooO0OO(iArr6, iil1il5.OooO00o, iArr6);
        }
        if (!OooO00o6) {
            int[] iArr7 = iil1il9.OooO00o;
            C9822Li1.OooO0OO(iArr7, iil1il6.OooO00o, iArr7);
        }
        return new Ilil1I(OooO00o, iil1il7, iil1il8, new AbstractC97441iIIL[]{iil1il9}, ((AbstractC9738llL1L) this).f23371OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO0OO() {
        return m21814OooO0OO() ? this : new Ilil1I(((AbstractC9738llL1L) this).OooO00o, ((AbstractC9738llL1L) this).f23369OooO00o, this.f23373OooO0O0.OooO0OO(), ((AbstractC9738llL1L) this).f23372OooO00o, ((AbstractC9738llL1L) this).f23371OooO00o);
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
        iIL1Il iil1il = (iIL1Il) this.f23373OooO0O0;
        if (iil1il.m16959OooO0O0()) {
            return OooO00o.m15393OooO00o();
        }
        iIL1Il iil1il2 = (iIL1Il) ((AbstractC9738llL1L) this).f23369OooO00o;
        iIL1Il iil1il3 = (iIL1Il) ((AbstractC9738llL1L) this).f23372OooO00o[0];
        int[] OooO00o2 = LILLl.OooO00o();
        int[] OooO00o3 = LILLl.OooO00o();
        int[] OooO00o4 = LILLl.OooO00o();
        C9822Li1.OooO0o0(iil1il.OooO00o, OooO00o4);
        int[] OooO00o5 = LILLl.OooO00o();
        C9822Li1.OooO0o0(OooO00o4, OooO00o5);
        boolean OooO00o6 = iil1il3.m16957OooO00o();
        int[] iArr = iil1il3.OooO00o;
        if (!OooO00o6) {
            C9822Li1.OooO0o0(iArr, OooO00o3);
            iArr = OooO00o3;
        }
        C9822Li1.OooO0o0(iil1il2.OooO00o, iArr, OooO00o2);
        C9822Li1.OooO00o(iil1il2.OooO00o, iArr, OooO00o3);
        C9822Li1.OooO0OO(OooO00o3, OooO00o2, OooO00o3);
        C9822Li1.OooO00o(LILLl.OooO0O0(OooO00o3, OooO00o3, OooO00o3), OooO00o3);
        C9822Li1.OooO0OO(OooO00o4, iil1il2.OooO00o, OooO00o4);
        C9822Li1.OooO00o(C1iiIiI.OooO0o(5, OooO00o4, 2, 0), OooO00o4);
        C9822Li1.OooO00o(C1iiIiI.OooO0O0(5, OooO00o5, 3, 0, OooO00o2), OooO00o2);
        iIL1Il iil1il4 = new iIL1Il(OooO00o5);
        C9822Li1.OooO0o0(OooO00o3, iil1il4.OooO00o);
        int[] iArr2 = iil1il4.OooO00o;
        C9822Li1.OooO0o0(iArr2, OooO00o4, iArr2);
        int[] iArr3 = iil1il4.OooO00o;
        C9822Li1.OooO0o0(iArr3, OooO00o4, iArr3);
        iIL1Il iil1il5 = new iIL1Il(OooO00o4);
        C9822Li1.OooO0o0(OooO00o4, iil1il4.OooO00o, iil1il5.OooO00o);
        int[] iArr4 = iil1il5.OooO00o;
        C9822Li1.OooO0OO(iArr4, OooO00o3, iArr4);
        int[] iArr5 = iil1il5.OooO00o;
        C9822Li1.OooO0o0(iArr5, OooO00o2, iArr5);
        iIL1Il iil1il6 = new iIL1Il(OooO00o3);
        C9822Li1.OooO0o(iil1il.OooO00o, iil1il6.OooO00o);
        if (!OooO00o6) {
            int[] iArr6 = iil1il6.OooO00o;
            C9822Li1.OooO0OO(iArr6, iil1il3.OooO00o, iArr6);
        }
        return new Ilil1I(OooO00o, iil1il4, iil1il5, new AbstractC97441iIIL[]{iil1il6}, ((AbstractC9738llL1L) this).f23371OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO0o0() {
        return (m21814OooO0OO() || this.f23373OooO0O0.m21863OooO0O0()) ? this : OooO0o().OooO00o((AbstractC9738llL1L) this);
    }
}
