package com.p118pd.sdk;

import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import java.io.IOException;

/* renamed from: com.pd.sdk.oOO0o0o0  reason: case insensitive filesystem */
public class C8058oOO0o0o0 extends AbstractC8053oOO0o0O<OooO00o> {

    /* renamed from: com.pd.sdk.oOO0o0o0$OooO00o */
    public class OooO00o extends C8054oOO0o0O0 {

        /* renamed from: OooO00o  reason: collision with other field name */
        public int[] f21081OooO00o;
        public int OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public long f21082OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public String f21083OooO0O0;

        /* renamed from: OooO0O0  reason: collision with other field name */
        public int[] f21084OooO0O0;
        public int OooO0OO;
        public int OooO0Oo;
        public int OooO0o0;

        public OooO00o(AbstractC7917oO0o000O oo0o000o) throws IOException {
            super(oo0o000o);
            this.OooO0O0 = oo0o000o.m19622OooO0O0();
            this.OooO0OO = oo0o000o.m19622OooO0O0();
            this.f21081OooO00o = new int[]{oo0o000o.OooO0OO(), oo0o000o.OooO0OO(), oo0o000o.OooO0OO()};
            this.f21082OooO0O0 = oo0o000o.m19615OooO00o();
            oo0o000o.OooO00o(8L);
            this.OooO0Oo = oo0o000o.OooO0OO();
            this.OooO0o0 = oo0o000o.OooO0OO();
            oo0o000o.OooO00o(1L);
            oo0o000o.OooO00o(2L);
            this.f21084OooO0O0 = new int[]{oo0o000o.OooO0OO(), oo0o000o.OooO0OO(), oo0o000o.OooO0OO()};
            this.f21083OooO0O0 = oo0o000o.OooO00o((int) oo0o000o.m19625OooO0O0());
        }
    }

    public C8058oOO0o0o0(AbstractC7917oO0o000O oo0o000o, C8044oOO0OOoo ooo0oooo) throws IOException {
        super(oo0o000o, ooo0oooo);
    }

    @Override // com.p118pd.sdk.AbstractC8053oOO0o0O
    public OooO00o OooO00o(AbstractC7917oO0o000O oo0o000o) throws IOException {
        return new OooO00o(oo0o000o);
    }

    public void OooO00o(C8074oOO0oo0 ooo0oo0) {
        boolean z = false;
        OooO00o oooO00o = (OooO00o) ((AbstractC8053oOO0o0O) this).OooO00o.get(0);
        ooo0oo0.OooO00o(1, (oooO00o.OooO0O0 & 2) == 2);
        ooo0oo0.OooO00o(2, (oooO00o.OooO0O0 & 8) == 8);
        ooo0oo0.OooO00o(3, (oooO00o.OooO0O0 & 32) == 32);
        ooo0oo0.OooO00o(4, (oooO00o.OooO0O0 & 64) == 64);
        ooo0oo0.m19648OooO00o(5, (oooO00o.OooO0O0 & 128) == 128 ? "Horizontal" : "Vertical");
        ooo0oo0.m19648OooO00o(6, (oooO00o.OooO0O0 & 256) == 256 ? "Reverse" : ReactProgressBarViewManager.DEFAULT_STYLE);
        ooo0oo0.OooO00o(7, (oooO00o.OooO0O0 & 512) == 512);
        ooo0oo0.OooO00o(8, (oooO00o.OooO0O0 & 4096) == 4096);
        ooo0oo0.OooO00o(9, (oooO00o.OooO0O0 & 8192) == 8192);
        if ((oooO00o.OooO0O0 & 16384) == 16384) {
            z = true;
        }
        ooo0oo0.OooO00o(10, z);
        int i = oooO00o.OooO0OO;
        if (i == -1) {
            ooo0oo0.m19648OooO00o(11, "Right");
        } else if (i == 0) {
            ooo0oo0.m19648OooO00o(11, "Left");
        } else if (i == 1) {
            ooo0oo0.m19648OooO00o(11, "Center");
        }
        ooo0oo0.OooO00o(12, oooO00o.f21081OooO00o);
        ooo0oo0.OooO00o(13, oooO00o.f21082OooO0O0);
        ooo0oo0.OooO00o(14, oooO00o.OooO0Oo);
        int i2 = oooO00o.OooO0o0;
        if (i2 == 1) {
            ooo0oo0.m19648OooO00o(15, "Bold");
        } else if (i2 == 2) {
            ooo0oo0.m19648OooO00o(15, "Italic");
        } else if (i2 == 4) {
            ooo0oo0.m19648OooO00o(15, "Underline");
        } else if (i2 == 8) {
            ooo0oo0.m19648OooO00o(15, "Outline");
        } else if (i2 == 16) {
            ooo0oo0.m19648OooO00o(15, "Shadow");
        } else if (i2 == 32) {
            ooo0oo0.m19648OooO00o(15, "Condense");
        } else if (i2 == 64) {
            ooo0oo0.m19648OooO00o(15, "Extend");
        }
        ooo0oo0.OooO00o(16, oooO00o.f21084OooO0O0);
        ooo0oo0.m19648OooO00o(17, oooO00o.f21083OooO0O0);
    }
}
