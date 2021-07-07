package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC9738llL1L;

/* renamed from: com.pd.sdk.I1I丨IIi1  reason: invalid class name */
public class I1IIIi1 extends AbstractC9738llL1L.OooO0OO {
    public I1IIIi1(IIiLIli r2, AbstractC97441iIIL r3, AbstractC97441iIIL r4) {
        this(r2, r3, r4, false);
    }

    public I1IIIi1(IIiLIli r2, AbstractC97441iIIL r3, AbstractC97441iIIL r4, boolean z) {
        super(r2, r3, r4);
        if ((r3 == null) == (r4 != null ? false : true)) {
            ((AbstractC9738llL1L) this).f23371OooO00o = z;
            return;
        }
        throw new IllegalArgumentException("Exactly one of the field elements is null");
    }

    public I1IIIi1(IIiLIli r1, AbstractC97441iIIL r2, AbstractC97441iIIL r3, AbstractC97441iIIL[] r4, boolean z) {
        super(r1, r2, r3, r4);
        ((AbstractC9738llL1L) this).f23371OooO00o = z;
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L.OooO0OO
    public AbstractC9738llL1L OooO00o() {
        return new I1IIIi1(null, m21802OooO00o(), m21810OooO0O0());
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
        iLiIL1i iliil1i = (iLiIL1i) ((AbstractC9738llL1L) this).f23369OooO00o;
        iLiIL1i iliil1i2 = (iLiIL1i) this.f23373OooO0O0;
        iLiIL1i iliil1i3 = (iLiIL1i) r15.m21819OooO0o0();
        iLiIL1i iliil1i4 = (iLiIL1i) r15.m21817OooO0o();
        iLiIL1i iliil1i5 = (iLiIL1i) ((AbstractC9738llL1L) this).f23372OooO00o[0];
        iLiIL1i iliil1i6 = (iLiIL1i) r15.m21803OooO00o(0);
        int[] OooO0O0 = AbstractC6835lIiiL1.OooO0O0();
        int[] OooO00o2 = AbstractC6835lIiiL1.OooO00o();
        int[] OooO00o3 = AbstractC6835lIiiL1.OooO00o();
        int[] OooO00o4 = AbstractC6835lIiiL1.OooO00o();
        boolean OooO00o5 = iliil1i5.m17131OooO00o();
        if (OooO00o5) {
            iArr2 = iliil1i3.OooO00o;
            iArr = iliil1i4.OooO00o;
        } else {
            Ll11ILL.OooO0o0(iliil1i5.OooO00o, OooO00o3);
            Ll11ILL.OooO0OO(OooO00o3, iliil1i3.OooO00o, OooO00o2);
            Ll11ILL.OooO0OO(OooO00o3, iliil1i5.OooO00o, OooO00o3);
            Ll11ILL.OooO0OO(OooO00o3, iliil1i4.OooO00o, OooO00o3);
            iArr2 = OooO00o2;
            iArr = OooO00o3;
        }
        boolean OooO00o6 = iliil1i6.m17131OooO00o();
        if (OooO00o6) {
            iArr4 = iliil1i.OooO00o;
            iArr3 = iliil1i2.OooO00o;
        } else {
            Ll11ILL.OooO0o0(iliil1i6.OooO00o, OooO00o4);
            Ll11ILL.OooO0OO(OooO00o4, iliil1i.OooO00o, OooO0O0);
            Ll11ILL.OooO0OO(OooO00o4, iliil1i6.OooO00o, OooO00o4);
            Ll11ILL.OooO0OO(OooO00o4, iliil1i2.OooO00o, OooO00o4);
            iArr4 = OooO0O0;
            iArr3 = OooO00o4;
        }
        int[] OooO00o7 = AbstractC6835lIiiL1.OooO00o();
        Ll11ILL.OooO0o0(iArr4, iArr2, OooO00o7);
        Ll11ILL.OooO0o0(iArr3, iArr, OooO00o2);
        if (AbstractC6835lIiiL1.OooO0O0(OooO00o7)) {
            return AbstractC6835lIiiL1.OooO0O0(OooO00o2) ? OooO0o() : OooO00o.m15393OooO00o();
        }
        Ll11ILL.OooO0o0(OooO00o7, OooO00o3);
        int[] OooO00o8 = AbstractC6835lIiiL1.OooO00o();
        Ll11ILL.OooO0OO(OooO00o3, OooO00o7, OooO00o8);
        Ll11ILL.OooO0OO(OooO00o3, iArr4, OooO00o3);
        Ll11ILL.OooO0OO(OooO00o8, OooO00o8);
        AbstractC6835lIiiL1.m17976OooO00o(iArr3, OooO00o8, OooO0O0);
        Ll11ILL.OooO00o(AbstractC6835lIiiL1.OooO0O0(OooO00o3, OooO00o3, OooO00o8), OooO00o8);
        iLiIL1i iliil1i7 = new iLiIL1i(OooO00o4);
        Ll11ILL.OooO0o0(OooO00o2, iliil1i7.OooO00o);
        int[] iArr5 = iliil1i7.OooO00o;
        Ll11ILL.OooO0o0(iArr5, OooO00o8, iArr5);
        iLiIL1i iliil1i8 = new iLiIL1i(OooO00o8);
        Ll11ILL.OooO0o0(OooO00o3, iliil1i7.OooO00o, iliil1i8.OooO00o);
        Ll11ILL.OooO0Oo(iliil1i8.OooO00o, OooO00o2, OooO0O0);
        Ll11ILL.OooO0Oo(OooO0O0, iliil1i8.OooO00o);
        iLiIL1i iliil1i9 = new iLiIL1i(OooO00o7);
        if (!OooO00o5) {
            int[] iArr6 = iliil1i9.OooO00o;
            Ll11ILL.OooO0OO(iArr6, iliil1i5.OooO00o, iArr6);
        }
        if (!OooO00o6) {
            int[] iArr7 = iliil1i9.OooO00o;
            Ll11ILL.OooO0OO(iArr7, iliil1i6.OooO00o, iArr7);
        }
        return new I1IIIi1(OooO00o, iliil1i7, iliil1i8, new AbstractC97441iIIL[]{iliil1i9}, ((AbstractC9738llL1L) this).f23371OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO0OO() {
        return m21814OooO0OO() ? this : new I1IIIi1(((AbstractC9738llL1L) this).OooO00o, ((AbstractC9738llL1L) this).f23369OooO00o, this.f23373OooO0O0.OooO0OO(), ((AbstractC9738llL1L) this).f23372OooO00o, ((AbstractC9738llL1L) this).f23371OooO00o);
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
        iLiIL1i iliil1i = (iLiIL1i) this.f23373OooO0O0;
        if (iliil1i.m17133OooO0O0()) {
            return OooO00o.m15393OooO00o();
        }
        iLiIL1i iliil1i2 = (iLiIL1i) ((AbstractC9738llL1L) this).f23369OooO00o;
        iLiIL1i iliil1i3 = (iLiIL1i) ((AbstractC9738llL1L) this).f23372OooO00o[0];
        int[] OooO00o2 = AbstractC6835lIiiL1.OooO00o();
        int[] OooO00o3 = AbstractC6835lIiiL1.OooO00o();
        int[] OooO00o4 = AbstractC6835lIiiL1.OooO00o();
        Ll11ILL.OooO0o0(iliil1i.OooO00o, OooO00o4);
        int[] OooO00o5 = AbstractC6835lIiiL1.OooO00o();
        Ll11ILL.OooO0o0(OooO00o4, OooO00o5);
        boolean OooO00o6 = iliil1i3.m17131OooO00o();
        int[] iArr = iliil1i3.OooO00o;
        if (!OooO00o6) {
            Ll11ILL.OooO0o0(iArr, OooO00o3);
            iArr = OooO00o3;
        }
        Ll11ILL.OooO0o0(iliil1i2.OooO00o, iArr, OooO00o2);
        Ll11ILL.OooO00o(iliil1i2.OooO00o, iArr, OooO00o3);
        Ll11ILL.OooO0OO(OooO00o3, OooO00o2, OooO00o3);
        Ll11ILL.OooO00o(AbstractC6835lIiiL1.OooO0O0(OooO00o3, OooO00o3, OooO00o3), OooO00o3);
        Ll11ILL.OooO0OO(OooO00o4, iliil1i2.OooO00o, OooO00o4);
        Ll11ILL.OooO00o(C1iiIiI.OooO0o(4, OooO00o4, 2, 0), OooO00o4);
        Ll11ILL.OooO00o(C1iiIiI.OooO0O0(4, OooO00o5, 3, 0, OooO00o2), OooO00o2);
        iLiIL1i iliil1i4 = new iLiIL1i(OooO00o5);
        Ll11ILL.OooO0o0(OooO00o3, iliil1i4.OooO00o);
        int[] iArr2 = iliil1i4.OooO00o;
        Ll11ILL.OooO0o0(iArr2, OooO00o4, iArr2);
        int[] iArr3 = iliil1i4.OooO00o;
        Ll11ILL.OooO0o0(iArr3, OooO00o4, iArr3);
        iLiIL1i iliil1i5 = new iLiIL1i(OooO00o4);
        Ll11ILL.OooO0o0(OooO00o4, iliil1i4.OooO00o, iliil1i5.OooO00o);
        int[] iArr4 = iliil1i5.OooO00o;
        Ll11ILL.OooO0OO(iArr4, OooO00o3, iArr4);
        int[] iArr5 = iliil1i5.OooO00o;
        Ll11ILL.OooO0o0(iArr5, OooO00o2, iArr5);
        iLiIL1i iliil1i6 = new iLiIL1i(OooO00o3);
        Ll11ILL.OooO0o(iliil1i.OooO00o, iliil1i6.OooO00o);
        if (!OooO00o6) {
            int[] iArr6 = iliil1i6.OooO00o;
            Ll11ILL.OooO0OO(iArr6, iliil1i3.OooO00o, iArr6);
        }
        return new I1IIIi1(OooO00o, iliil1i4, iliil1i5, new AbstractC97441iIIL[]{iliil1i6}, ((AbstractC9738llL1L) this).f23371OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L, com.p118pd.sdk.AbstractC9738llL1L
    public AbstractC9738llL1L OooO0o0() {
        return (m21814OooO0OO() || this.f23373OooO0O0.m21863OooO0O0()) ? this : OooO0o().OooO00o((AbstractC9738llL1L) this);
    }
}
