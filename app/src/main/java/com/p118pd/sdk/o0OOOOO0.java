package com.p118pd.sdk;

import bolts.UnobservedTaskException;
import com.p118pd.sdk.C7391o0OOOO0o;

/* renamed from: com.pd.sdk.o0OOOOO0 */
public class o0OOOOO0 {
    public C7391o0OOOO0o<?> OooO00o;

    public o0OOOOO0(C7391o0OOOO0o<?> o0oooo0o) {
        this.OooO00o = o0oooo0o;
    }

    public void OooO00o() {
        this.OooO00o = null;
    }

    public void finalize() throws Throwable {
        C7391o0OOOO0o.AbstractC7398OooOOo0 OooO00o2;
        try {
            C7391o0OOOO0o<?> o0oooo0o = this.OooO00o;
            if (!(o0oooo0o == null || (OooO00o2 = C7391o0OOOO0o.m18928OooO00o()) == null)) {
                OooO00o2.OooO00o(o0oooo0o, new UnobservedTaskException(o0oooo0o.m18930OooO00o()));
            }
        } finally {
            super.finalize();
        }
    }
}
