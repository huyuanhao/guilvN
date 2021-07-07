package com.p118pd.sdk;

/* renamed from: com.pd.sdk.ii1IIlIL */
public class ii1IIlIL {

    /* renamed from: com.pd.sdk.ii1IIlIL$OooO00o */
    public static class OooO00o extends Ll1lii implements Cloneable {
        public OooO00o() {
            super(new II1li1Il());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            OooO00o oooO00o = (OooO00o) super.clone();
            oooO00o.OooO00o = new II1li1Il((II1li1Il) this.OooO00o);
            return oooO00o;
        }
    }

    /* renamed from: com.pd.sdk.ii1IIlIL$OooO0O0 */
    public static class OooO0O0 extends AbstractC6146iIIi1 {
        public static final String OooO00o = ii1IIlIL.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r3) {
            r3.addAlgorithm("MessageDigest.SM3", OooO00o + "$Digest");
            r3.addAlgorithm("Alg.Alias.MessageDigest.SM3", "SM3");
            r3.addAlgorithm("Alg.Alias.MessageDigest.1.2.156.197.1.401", "SM3");
        }
    }
}
