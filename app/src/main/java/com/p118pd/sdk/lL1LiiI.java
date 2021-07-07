package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC9738llL1L;
import com.p118pd.sdk.IIiLIli;
import java.math.BigInteger;

/* renamed from: com.pd.sdk.lL1LiiI */
public class lL1LiiI extends Iiii1L {
    public static final String OooO00o = "bc_wtnaf";

    /* renamed from: com.pd.sdk.lL1LiiI$OooO00o */
    public static class OooO00o implements iLLLIil {
        public final /* synthetic */ byte OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ AbstractC9738llL1L.OooO0O0 f18455OooO00o;

        public OooO00o(AbstractC9738llL1L.OooO0O0 oooO0O0, byte b) {
            this.f18455OooO00o = oooO0O0;
            this.OooO00o = b;
        }

        @Override // com.p118pd.sdk.iLLLIil
        public AbstractC6375iL1 OooO00o(AbstractC6375iL1 r3) {
            if (r3 instanceof C6499lIIlL) {
                return r3;
            }
            C6499lIIlL r32 = new C6499lIIlL();
            r32.OooO00o(C9609iLi.OooO00o(this.f18455OooO00o, this.OooO00o));
            return r32;
        }
    }

    private AbstractC9738llL1L.OooO0O0 OooO00o(AbstractC9738llL1L.OooO0O0 oooO0O0, C5519ILL1 r8, byte b, byte b2) {
        return OooO00o(oooO0O0, C9609iLi.OooO00o(b2, r8, (byte) 4, BigInteger.valueOf(16), C9609iLi.OooO00o(b2, 4), b == 0 ? C9609iLi.f23183OooO00o : C9609iLi.f23186OooO0O0));
    }

    public static AbstractC9738llL1L.OooO0O0 OooO00o(AbstractC9738llL1L.OooO0O0 oooO0O0, byte[] bArr) {
        IIiLIli.OooO0O0 oooO0O02 = (IIiLIli.OooO0O0) oooO0O0.m21800OooO00o();
        AbstractC9738llL1L.OooO0O0[] OooO00o2 = ((C6499lIIlL) oooO0O02.OooO00o(oooO0O0, OooO00o, new OooO00o(oooO0O0, oooO0O02.m15394OooO00o().m21859OooO00o().byteValue()))).OooO00o();
        AbstractC9738llL1L.OooO0O0[] oooO0O0Arr = new AbstractC9738llL1L.OooO0O0[OooO00o2.length];
        for (int i = 0; i < OooO00o2.length; i++) {
            oooO0O0Arr[i] = (AbstractC9738llL1L.OooO0O0) OooO00o2[i].OooO0OO();
        }
        AbstractC9738llL1L.OooO0O0 oooO0O03 = (AbstractC9738llL1L.OooO0O0) oooO0O0.m21800OooO00o().m15393OooO00o();
        int i2 = 0;
        for (int length = bArr.length - 1; length >= 0; length--) {
            i2++;
            byte b = bArr[length];
            if (b != 0) {
                oooO0O03 = (AbstractC9738llL1L.OooO0O0) oooO0O03.OooO00o(i2).OooO00o((AbstractC9738llL1L) (b > 0 ? OooO00o2[b >>> 1] : oooO0O0Arr[(-b) >>> 1]));
                i2 = 0;
            }
        }
        return i2 > 0 ? oooO0O03.OooO00o(i2) : oooO0O03;
    }

    @Override // com.p118pd.sdk.Iiii1L
    public AbstractC9738llL1L OooO0O0(AbstractC9738llL1L r10, BigInteger bigInteger) {
        if (r10 instanceof AbstractC9738llL1L.OooO0O0) {
            AbstractC9738llL1L.OooO0O0 oooO0O0 = (AbstractC9738llL1L.OooO0O0) r10;
            IIiLIli.OooO0O0 oooO0O02 = (IIiLIli.OooO0O0) oooO0O0.m21800OooO00o();
            int OooO0O0 = oooO0O02.OooO0O0();
            byte byteValue = oooO0O02.m15394OooO00o().m21859OooO00o().byteValue();
            byte OooO00o2 = C9609iLi.OooO00o(byteValue);
            return OooO00o(oooO0O0, C9609iLi.OooO00o(bigInteger, OooO0O0, byteValue, oooO0O02.m15402OooO00o(), OooO00o2, (byte) 10), byteValue, OooO00o2);
        }
        throw new IllegalArgumentException("Only ECPoint.AbstractF2m can be used in WTauNafMultiplier");
    }
}
