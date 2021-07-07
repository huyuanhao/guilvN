package com.p118pd.sdk;

import java.io.IOException;

/* renamed from: com.pd.sdk.ooooO0O0  reason: case insensitive filesystem */
public class C9246ooooO0O0 extends AbstractC8053oOO0o0O<OooO00o> {

    /* renamed from: com.pd.sdk.ooooO0O0$OooO00o */
    public class OooO00o extends C8054oOO0o0O0 {

        /* renamed from: OooO00o  reason: collision with other field name */
        public int[] f22637OooO00o;
        public int OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public long f22638OooO0O0;
        public int OooO0OO;
        public int OooO0Oo;
        public int OooO0o0;

        public OooO00o(AbstractC7917oO0o000O oo0o000o) throws IOException {
            super(oo0o000o);
            this.OooO0O0 = oo0o000o.m19622OooO0O0();
            oo0o000o.OooO00o(1L);
            oo0o000o.OooO00o(1L);
            oo0o000o.OooO00o(4L);
            this.f22638OooO0O0 = oo0o000o.m19615OooO00o();
            oo0o000o.OooO00o(4L);
            this.OooO0OO = oo0o000o.m19617OooO00o();
            this.OooO0Oo = oo0o000o.OooO0O0();
            this.OooO0o0 = oo0o000o.OooO0O0();
            this.f22637OooO00o = new int[]{oo0o000o.OooO0OO(), oo0o000o.OooO0OO(), oo0o000o.OooO0OO()};
        }
    }

    public C9246ooooO0O0(AbstractC7917oO0o000O oo0o000o, C8044oOO0OOoo ooo0oooo) throws IOException {
        super(oo0o000o, ooo0oooo);
    }

    @Override // com.p118pd.sdk.AbstractC8053oOO0o0O
    public OooO00o OooO00o(AbstractC7917oO0o000O oo0o000o) throws IOException {
        return null;
    }

    public void OooO00o(C8071oOO0oOoO ooo0oooo) {
        boolean z = false;
        OooO00o oooO00o = (OooO00o) ((AbstractC8053oOO0o0O) this).OooO00o.get(0);
        ooo0oooo.OooO00o(1, (oooO00o.OooO0O0 & 536870912) == 536870912);
        ooo0oooo.OooO00o(2, (oooO00o.OooO0O0 & 1073741824) == 1073741824);
        if ((oooO00o.OooO0O0 & -1073741824) == -1073741824) {
            z = true;
        }
        ooo0oooo.OooO00o(3, z);
        ooo0oooo.OooO00o(4, oooO00o.f22638OooO0O0);
        ooo0oooo.OooO00o(5, oooO00o.OooO0OO);
        int i = oooO00o.OooO0Oo;
        if (i == 1) {
            ooo0oooo.m19648OooO00o(6, "Bold");
        } else if (i == 2) {
            ooo0oooo.m19648OooO00o(6, "Italic");
        } else if (i == 4) {
            ooo0oooo.m19648OooO00o(6, "Underline");
        }
        ooo0oooo.OooO00o(7, oooO00o.OooO0o0);
        ooo0oooo.OooO00o(8, oooO00o.f22637OooO00o);
    }
}
