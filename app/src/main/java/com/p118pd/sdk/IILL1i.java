package com.p118pd.sdk;

import java.math.BigInteger;

/* renamed from: com.pd.sdk.丨IILL1i  reason: invalid class name */
public class IILL1i {
    public static final String OooO00o = "bc_fixed_point";

    /* renamed from: com.pd.sdk.丨IILL1i$OooO00o */
    public static class OooO00o implements iLLLIil {
        public final /* synthetic */ IIiLIli OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9738llL1L f22883OooO00o;

        public OooO00o(IIiLIli r1, AbstractC9738llL1L r2) {
            this.OooO00o = r1;
            this.f22883OooO00o = r2;
        }

        private boolean OooO00o(C5315ILlLil r1, int i) {
            return r1 != null && OooO00o(r1.m15524OooO00o(), i);
        }

        private boolean OooO00o(AbstractC6100iILll iilll, int i) {
            return iilll != null && iilll.OooO00o() >= i;
        }

        @Override // com.p118pd.sdk.iLLLIil
        public AbstractC6375iL1 OooO00o(AbstractC6375iL1 r11) {
            C5315ILlLil r112 = r11 instanceof C5315ILlLil ? (C5315ILlLil) r11 : null;
            int OooO00o2 = IILL1i.OooO00o(this.OooO00o);
            int i = OooO00o2 > 257 ? 6 : 5;
            int i2 = 1 << i;
            if (OooO00o(r112, i2)) {
                return r112;
            }
            int i3 = ((OooO00o2 + i) - 1) / i;
            AbstractC9738llL1L[] r113 = new AbstractC9738llL1L[(i + 1)];
            r113[0] = this.f22883OooO00o;
            for (int i4 = 1; i4 < i; i4++) {
                r113[i4] = r113[i4 - 1].OooO00o(i3);
            }
            r113[i] = r113[0].OooO0O0(r113[1]);
            this.OooO00o.OooO0O0(r113);
            AbstractC9738llL1L[] r0 = new AbstractC9738llL1L[i2];
            r0[0] = r113[0];
            for (int i5 = i - 1; i5 >= 0; i5--) {
                AbstractC9738llL1L r6 = r113[i5];
                int i6 = 1 << i5;
                for (int i7 = i6; i7 < i2; i7 += i6 << 1) {
                    r0[i7] = r0[i7 - i6].OooO00o(r6);
                }
            }
            this.OooO00o.OooO0O0(r0);
            C5315ILlLil r2 = new C5315ILlLil();
            r2.OooO00o(this.OooO00o.OooO00o(r0, 0, i2));
            r2.OooO00o(r113[i]);
            r2.OooO00o(i);
            return r2;
        }
    }

    public static int OooO00o(IIiLIli r1) {
        BigInteger OooO0O0 = r1.m15401OooO0O0();
        return OooO0O0 == null ? r1.OooO0O0() + 1 : OooO0O0.bitLength();
    }

    public static C5315ILlLil OooO00o(AbstractC6375iL1 r1) {
        if (r1 instanceof C5315ILlLil) {
            return (C5315ILlLil) r1;
        }
        return null;
    }

    public static C5315ILlLil OooO00o(AbstractC9738llL1L r3) {
        IIiLIli OooO00o2 = r3.m21800OooO00o();
        return (C5315ILlLil) OooO00o2.OooO00o(r3, OooO00o, new OooO00o(OooO00o2, r3));
    }
}
