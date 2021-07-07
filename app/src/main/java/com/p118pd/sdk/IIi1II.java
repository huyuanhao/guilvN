package com.p118pd.sdk;

import java.io.InputStream;

/* renamed from: com.pd.sdk.IIi1II */
public abstract class IIi1II extends InputStream {
    public final InputStream OooO00o;
    public int o00oO0O;

    public IIi1II(InputStream inputStream, int i) {
        this.OooO00o = inputStream;
        this.o00oO0O = i;
    }

    public void OooO00o(boolean z) {
        InputStream inputStream = this.OooO00o;
        if (inputStream instanceof C9637ili) {
            ((C9637ili) inputStream).OooO0O0(z);
        }
    }

    public int OooO0O0() {
        return this.o00oO0O;
    }
}
