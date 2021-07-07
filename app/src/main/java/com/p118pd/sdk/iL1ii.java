package com.p118pd.sdk;

import android.content.Context;
import java.io.File;

/* renamed from: com.pd.sdk.iL1ii */
public class iL1ii {
    public File OooO00o = null;

    public iL1ii(Context context) {
        OooO00o(context);
    }

    public void OooO00o(Context context) {
        this.OooO00o = new File(context.getCacheDir() + "/Camera/");
    }

    public File OooO00o() {
        return this.OooO00o;
    }
}
