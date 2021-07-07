package com.p118pd.sdk;

import com.p118pd.sdk.IIiLIli;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.LilI丨  reason: invalid class name and case insensitive filesystem */
public class C5742LilI extends AbstractC5738Lil implements AbstractC5420Il1iIL {
    public IIiLIli OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public byte[] f16651OooO00o;
    public LlLI1 o00OoOOo;

    public C5742LilI(IIiLIli r2) {
        this.o00OoOOo = null;
        this.OooO00o = r2;
        this.f16651OooO00o = null;
        OooO00o();
    }

    public C5742LilI(IIiLIli r2, byte[] bArr) {
        this.o00OoOOo = null;
        this.OooO00o = r2;
        this.f16651OooO00o = bArr;
        OooO00o();
    }

    public C5742LilI(liilIl1 liilil1, I11li1 i11li1) {
        this(liilil1, null, null, i11li1);
    }

    public C5742LilI(liilIl1 liilil1, BigInteger bigInteger, BigInteger bigInteger2, I11li1 i11li1) {
        int i;
        int i2;
        int i3;
        IIiLIli oooO0o0;
        this.o00OoOOo = null;
        LlLI1 OooO00o2 = liilil1.OooO00o();
        this.o00OoOOo = OooO00o2;
        if (OooO00o2.equals(AbstractC5420Il1iIL.oo0oOO0)) {
            oooO0o0 = new IIiLIli.OooO0o(((C6513lIiI) liilil1.OooO0Oo()).m17647OooO0O0(), new BigInteger(1, AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(0)).m17938OooO00o()), new BigInteger(1, AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(1)).m17938OooO00o()), bigInteger, bigInteger2);
        } else if (this.o00OoOOo.equals(AbstractC5420Il1iIL.o00O0Oo)) {
            I11li1 OooO00o3 = I11li1.OooO00o((Object) liilil1.OooO0Oo());
            int intValue = ((C6513lIiI) OooO00o3.OooO00o(0)).m17647OooO0O0().intValue();
            LlLI1 llLI1 = (LlLI1) OooO00o3.OooO00o(1);
            if (llLI1.equals(AbstractC5420Il1iIL.o00O0Ooo)) {
                i3 = C6513lIiI.OooO00o(OooO00o3.OooO00o(2)).m17647OooO0O0().intValue();
                i2 = 0;
                i = 0;
            } else if (llLI1.equals(AbstractC5420Il1iIL.o00O0o00)) {
                I11li1 OooO00o4 = I11li1.OooO00o(OooO00o3.OooO00o(2));
                int intValue2 = C6513lIiI.OooO00o(OooO00o4.OooO00o(0)).m17647OooO0O0().intValue();
                int intValue3 = C6513lIiI.OooO00o(OooO00o4.OooO00o(1)).m17647OooO0O0().intValue();
                i = C6513lIiI.OooO00o(OooO00o4.OooO00o(2)).m17647OooO0O0().intValue();
                i3 = intValue2;
                i2 = intValue3;
            } else {
                throw new IllegalArgumentException("This type of EC basis is not implemented");
            }
            oooO0o0 = new IIiLIli.C5231OooO0o0(intValue, i3, i2, i, new BigInteger(1, AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(0)).m17938OooO00o()), new BigInteger(1, AbstractC6804llL1ii.OooO00o(i11li1.OooO00o(1)).m17938OooO00o()), bigInteger, bigInteger2);
        } else {
            throw new IllegalArgumentException("This type of ECCurve is not implemented");
        }
        this.OooO00o = oooO0o0;
        if (i11li1.size() == 3) {
            this.f16651OooO00o = ((iIilII1) i11li1.OooO00o(2)).m15475OooO00o();
        }
    }

    private void OooO00o() {
        LlLI1 llLI1;
        if (Lii1I.OooO0O0(this.OooO00o)) {
            llLI1 = AbstractC5420Il1iIL.oo0oOO0;
        } else if (Lii1I.OooO00o(this.OooO00o)) {
            llLI1 = AbstractC5420Il1iIL.o00O0Oo;
        } else {
            throw new IllegalArgumentException("This type of ECCurve is not implemented");
        }
        this.o00OoOOo = llLI1;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public IIiLIli m16330OooO00o() {
        return this.OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public byte[] m16331OooO00o() {
        return this.f16651OooO00o;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0060  */
    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.p118pd.sdk.AbstractC6122iIlLiL OooO0O0() {
        /*
        // Method dump skipped, instructions count: 112
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.C5742LilI.OooO0O0():com.pd.sdk.iIlLiL");
    }
}
