package com.p118pd.sdk;

import com.p118pd.sdk.AbstractC8784oo0oooo;
import java.io.File;

/* renamed from: com.pd.sdk.oo */
public class C1701oo extends C8794ooO00000 {
    public String OooO0OO;
    public String OooO0Oo;

    @Override // com.p118pd.sdk.AbstractC8784oo0oooo
    public void OooO00o(String str, String str2, int i, int i2, int i3, boolean z, AbstractC8784oo0oooo.AbstractC8786OooO0o0 oooO0o0) {
        this.OooO0OO = str;
        this.OooO0Oo = str2;
        super.OooO00o(str, C8788oo0ooooO.OooO00o(str2), i, i2, i3, z, oooO0o0);
    }

    @Override // com.p118pd.sdk.AbstractC8784oo0oooo, com.p118pd.sdk.C8794ooO00000
    public void OooO00o(String str) {
        String str2 = this.OooO0OO + File.separator + C8788oo0ooooO.OooO00o(this.OooO0Oo);
        ((AbstractC8784oo0oooo) this).f21984OooO00o = str2;
        C8793ooO0000.m20432OooO00o(str, str2);
    }
}
