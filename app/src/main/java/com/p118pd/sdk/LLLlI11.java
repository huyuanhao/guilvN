package com.p118pd.sdk;

import java.io.IOException;
import java.util.Hashtable;
import org.bouncycastle.asn1.eac.BidirectionalMap;

/* renamed from: com.pd.sdk.LLLlI11丨  reason: invalid class name */
public class LLLlI11 extends AbstractC5738Lil {
    public static Hashtable OooO00o = new Hashtable();

    /* renamed from: OooO00o  reason: collision with other field name */
    public static BidirectionalMap f16473OooO00o = new BidirectionalMap();
    public static Hashtable OooO0O0 = new Hashtable();
    public static final LlLI1 o00OoOo0 = AbstractC9525LlI1.OooO00o.m16385OooO00o("3.1.2.1");
    public static final int o00oO0O = 192;
    public static final int o0OOO0o = 2;
    public static final int o0Oo0oo = 1;
    public static final int o0ooOO0 = 128;
    public static final int o0ooOOo = 64;
    public static final int o0ooOoO = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ILLIi f16474OooO00o;
    public LlLI1 o00OoOOo;

    static {
        OooO00o.put(I11I.OooO00o(2), "RADG4");
        OooO00o.put(I11I.OooO00o(1), "RADG3");
        f16473OooO00o.put(I11I.OooO00o(192), "CVCA");
        f16473OooO00o.put(I11I.OooO00o(128), "DV_DOMESTIC");
        f16473OooO00o.put(I11I.OooO00o(64), "DV_FOREIGN");
        f16473OooO00o.put(I11I.OooO00o(0), "IS");
    }

    public LLLlI11(ILLIi r3) throws IOException {
        if (r3.OooO0OO() == 76) {
            OooO00o(new C5805Ll1(r3.m20621OooO00o()));
        }
    }

    public LLLlI11(LlLI1 llLI1, int i) throws IOException {
        OooO00o(llLI1);
        OooO00o((byte) i);
    }

    public static int OooO00o(String str) {
        Integer num = (Integer) f16473OooO00o.getReverse(str);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("Unknown value " + str);
    }

    public static String OooO00o(int i) {
        return (String) f16473OooO00o.get(I11I.OooO00o(i));
    }

    private void OooO00o(byte b) {
        this.f16474OooO00o = new ILLIi(19, new byte[]{b});
    }

    private void OooO00o(LlLI1 llLI1) {
        this.o00OoOOo = llLI1;
    }

    private void OooO00o(C5805Ll1 r3) throws IOException {
        AbstractC6122iIlLiL OooO00o2 = r3.OooO00o();
        if (OooO00o2 instanceof LlLI1) {
            this.o00OoOOo = (LlLI1) OooO00o2;
            AbstractC6122iIlLiL OooO00o3 = r3.OooO00o();
            if (OooO00o3 instanceof ILLIi) {
                this.f16474OooO00o = (ILLIi) OooO00o3;
                return;
            }
            throw new IllegalArgumentException("No access rights in CerticateHolderAuthorization");
        }
        throw new IllegalArgumentException("no Oid in CerticateHolderAuthorization");
    }

    public LlLI1 OooO00o() {
        return this.o00OoOOo;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    public int OooO0O0() {
        return this.f16474OooO00o.m20621OooO00o()[0] & 255;
    }

    @Override // com.p118pd.sdk.AbstractC5738Lil, com.p118pd.sdk.AbstractC6854lLi1LL
    /* renamed from: OooO0O0  reason: collision with other method in class */
    public AbstractC6122iIlLiL m16230OooO0O0() {
        iILLL1 r0 = new iILLL1();
        r0.OooO00o(this.o00OoOOo);
        r0.OooO00o(this.f16474OooO00o);
        return new ILLIi(76, r0);
    }
}
