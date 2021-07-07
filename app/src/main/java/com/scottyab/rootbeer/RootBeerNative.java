package com.scottyab.rootbeer;

import com.p118pd.sdk.C9059ooOoOoOo;

public class RootBeerNative {
    public static boolean OooO00o = true;

    static {
        try {
            System.loadLibrary("tool-checker");
        } catch (UnsatisfiedLinkError e) {
            C9059ooOoOoOo.OooO0O0(e);
        }
    }

    public boolean OooO00o() {
        return OooO00o;
    }

    public native int checkForRoot(Object[] objArr);

    public native int setLogDebugMessages(boolean z);
}
