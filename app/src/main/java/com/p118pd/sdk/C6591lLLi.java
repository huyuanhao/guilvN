package com.p118pd.sdk;

import android.support.p000v4.media.session.MediaSessionCompat;

/* renamed from: com.pd.sdk.lLL丨i  reason: invalid class name and case insensitive filesystem */
public class C6591lLLi {

    /* renamed from: com.pd.sdk.lLL丨i$OooO00o */
    public static class OooO00o extends Ll1lii implements Cloneable {
        public OooO00o() {
            super(new C6601lLl());
        }

        @Override // java.security.MessageDigest, java.security.MessageDigestSpi, java.lang.Object
        public Object clone() throws CloneNotSupportedException {
            OooO00o oooO00o = (OooO00o) super.clone();
            oooO00o.OooO00o = new C6601lLl((C6601lLl) this.OooO00o);
            return oooO00o;
        }
    }

    /* renamed from: com.pd.sdk.lLL丨i$OooO0O0 */
    public static class OooO0O0 extends C9680lII1i {
        public OooO0O0() {
            super(new C6383iLl1(new C6601lLl()));
        }
    }

    /* renamed from: com.pd.sdk.lLL丨i$OooO0OO */
    public static class OooO0OO extends C5597L11llL {
        public OooO0OO() {
            super("HMACRIPEMD320", MediaSessionCompat.MAX_BITMAP_SIZE_IN_DP, new C5706LiL());
        }
    }

    /* renamed from: com.pd.sdk.lLL丨i$OooO0Oo  reason: case insensitive filesystem */
    public static class C6592OooO0Oo extends AbstractC6146iIIi1 {
        public static final String OooO00o = C6591lLLi.class.getName();

        @Override // com.p118pd.sdk.II1ii1
        public void OooO00o(l1I1L r4) {
            r4.addAlgorithm("MessageDigest.RIPEMD320", OooO00o + "$Digest");
            OooO00o(r4, "RIPEMD320", OooO00o + "$HashMac", OooO00o + "$KeyGenerator");
        }
    }
}
