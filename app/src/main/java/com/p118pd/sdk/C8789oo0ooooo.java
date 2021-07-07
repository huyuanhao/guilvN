package com.p118pd.sdk;

import java.io.File;

/* renamed from: com.pd.sdk.oo0ooooo  reason: case insensitive filesystem */
public class C8789oo0ooooo extends C8794ooO00000 {
    public static final String OooO0OO = "_mapped";
    public C8787oo0oooo0 OooO00o;

    @Override // com.p118pd.sdk.AbstractC8784oo0oooo, com.p118pd.sdk.C8794ooO00000
    public void OooO00o(boolean z) {
        String str;
        super.OooO00o(z);
        String str2 = ((AbstractC8784oo0oooo) this).f21984OooO00o;
        String substring = str2.substring(0, str2.lastIndexOf(File.separator));
        String OooO0O0 = C8793ooO0000.OooO0O0(((AbstractC8784oo0oooo) this).f21984OooO00o);
        if (C8793ooO0000.m20431OooO00o(OooO0O0)) {
            str = substring + File.separator + C8793ooO0000.OooO0OO(OooO0O0) + OooO0OO + C9058ooOoOoOO.OooOO0 + C8793ooO0000.m20430OooO00o(OooO0O0);
        } else {
            str = substring + File.separator + OooO0O0 + OooO0OO;
        }
        if (this.OooO00o == null) {
            this.OooO00o = new C8787oo0oooo0();
        }
        this.OooO00o.OooO00o(str, str2);
    }

    @Override // com.p118pd.sdk.AbstractC8784oo0oooo, com.p118pd.sdk.C8794ooO00000
    public void OooO0OO() {
        C8787oo0oooo0 oo0oooo0 = this.OooO00o;
        if (oo0oooo0 != null) {
            oo0oooo0.m20427OooO0O0();
        }
    }

    @Override // com.p118pd.sdk.AbstractC8784oo0oooo, com.p118pd.sdk.C8794ooO00000
    public void OooO00o(String str) {
        C8787oo0oooo0 oo0oooo0 = this.OooO00o;
        if (oo0oooo0 != null) {
            oo0oooo0.OooO00o(str);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8784oo0oooo, com.p118pd.sdk.C8794ooO00000
    public void OooO00o() {
        C8787oo0oooo0 oo0oooo0 = this.OooO00o;
        if (oo0oooo0 != null) {
            oo0oooo0.m20426OooO00o();
        }
    }
}
