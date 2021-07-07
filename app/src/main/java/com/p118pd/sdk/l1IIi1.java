package com.p118pd.sdk;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.pd.sdk.l1IIi1丨  reason: invalid class name */
public class l1IIi1 extends ILL {
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f18250OooO00o;
    public boolean OooO0O0;

    public l1IIi1(OutputStream outputStream) {
        super(outputStream);
        this.f18250OooO00o = false;
    }

    public l1IIi1(OutputStream outputStream, int i, boolean z) {
        super(outputStream);
        this.f18250OooO00o = false;
        this.f18250OooO00o = true;
        this.OooO0O0 = z;
        this.OooO00o = i;
    }

    private void OooO0O0(int i) throws IOException {
        ((ILL) this).OooO00o.write(i);
        ((ILL) this).OooO00o.write(128);
    }

    @Override // com.p118pd.sdk.ILL
    public OutputStream OooO00o() {
        return ((ILL) this).OooO00o;
    }

    @Override // com.p118pd.sdk.ILL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m17558OooO00o() throws IOException {
        ((ILL) this).OooO00o.write(0);
        ((ILL) this).OooO00o.write(0);
        if (this.f18250OooO00o && this.OooO0O0) {
            ((ILL) this).OooO00o.write(0);
            ((ILL) this).OooO00o.write(0);
        }
    }

    public void OooO00o(int i) throws IOException {
        if (this.f18250OooO00o) {
            int i2 = this.OooO00o | 128;
            if (this.OooO0O0) {
                OooO0O0(i2 | 32);
            } else if ((i & 32) != 0) {
                i = i2 | 32;
            } else {
                OooO0O0(i2);
                return;
            }
        }
        OooO0O0(i);
    }
}
