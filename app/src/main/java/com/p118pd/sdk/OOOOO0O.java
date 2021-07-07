package com.p118pd.sdk;

import javax.annotation.Nullable;

/* renamed from: com.pd.sdk.OOOOO0O */
public final class OOOOO0O {
    public static final long OooO00o = 65536;
    @Nullable

    /* renamed from: OooO00o  reason: collision with other field name */
    public static C8927ooOOO00o f16989OooO00o;
    public static long OooO0O0;

    public static C8927ooOOO00o OooO00o() {
        synchronized (OOOOO0O.class) {
            if (f16989OooO00o == null) {
                return new C8927ooOOO00o();
            }
            C8927ooOOO00o ooooo00o = f16989OooO00o;
            f16989OooO00o = ooooo00o.f22168OooO00o;
            ooooo00o.f22168OooO00o = null;
            OooO0O0 -= 8192;
            return ooooo00o;
        }
    }

    public static void OooO00o(C8927ooOOO00o ooooo00o) {
        if (ooooo00o.f22168OooO00o != null || ooooo00o.f22171OooO0O0 != null) {
            throw new IllegalArgumentException();
        } else if (!ooooo00o.f22169OooO00o) {
            synchronized (OOOOO0O.class) {
                if (OooO0O0 + 8192 <= 65536) {
                    OooO0O0 += 8192;
                    ooooo00o.f22168OooO00o = f16989OooO00o;
                    ooooo00o.OooO0O0 = 0;
                    ooooo00o.OooO00o = 0;
                    f16989OooO00o = ooooo00o;
                }
            }
        }
    }
}
