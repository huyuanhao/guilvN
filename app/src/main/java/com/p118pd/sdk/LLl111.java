package com.p118pd.sdk;

import java.math.BigInteger;
import java.util.Hashtable;

/* renamed from: com.pd.sdk.LLl111丨  reason: invalid class name */
public class LLl111 extends AbstractC5738Lil {
    public static final Hashtable OooO00o = new Hashtable();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String[] f16503OooO00o = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};
    public static final int o00000 = 3;
    public static final int o000000 = 0;
    public static final int o000000O = 1;
    public static final int o000000o = 2;
    public static final int o00000O = 5;
    public static final int o00000O0 = 4;
    public static final int o00000OO = 6;
    public static final int o00000Oo = 8;
    public static final int o00000o0 = 9;
    public static final int o0000Ooo = 10;
    public static final int o000OOo = 10;
    public static final int o00oO0O = 0;
    public static final int o0O0O00 = 9;
    public static final int o0OO00O = 6;
    public static final int o0OOO0o = 4;
    public static final int o0Oo0oo = 5;
    public static final int o0ooOO0 = 1;
    public static final int o0ooOOo = 2;
    public static final int o0ooOoO = 3;
    public static final int oo0o0Oo = 8;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C5841L11I f16504OooO00o;

    public LLl111(int i) {
        this.f16504OooO00o = new C5841L11I(i);
    }

    public static LLl111 OooO00o(int i) {
        Integer OooO00o2 = I11I.OooO00o(i);
        if (!OooO00o.containsKey(OooO00o2)) {
            OooO00o.put(OooO00o2, new LLl111(i));
        }
        return (LLl111) OooO00o.get(OooO00o2);
    }

    public static LLl111 OooO00o(Object obj) {
        if (obj instanceof LLl111) {
            return (LLl111) obj;
        }
        if (obj != null) {
            return OooO00o(C5841L11I.OooO00o(obj).OooO00o().intValue());
        }
        return null;
    }

    public BigInteger OooO00o() {
        return this.f16504OooO00o.OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public AbstractC6122iIlLiL OooO0O0() {
        return this.f16504OooO00o;
    }

    public String toString() {
        int intValue = OooO00o().intValue();
        String str = (intValue < 0 || intValue > 10) ? "invalid" : f16503OooO00o[intValue];
        return "CRLReason: " + str;
    }
}
