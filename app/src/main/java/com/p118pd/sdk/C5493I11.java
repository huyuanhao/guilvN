package com.p118pd.sdk;

import com.facebook.react.modules.netinfo.NetInfoModule;
import com.umeng.message.proguard.C3848l;

/* renamed from: com.pd.sdk.I丨11  reason: invalid class name and case insensitive filesystem */
public class C5493I11 {
    public static final short OooO00o = 1;
    public static final short OooO0O0 = 2;

    public static String OooO00o(short s) {
        return s != 1 ? s != 2 ? NetInfoModule.CONNECTION_TYPE_UNKNOWN_DEPRECATED : "fatal" : "warning";
    }

    public static String OooO0O0(short s) {
        return OooO00o(s) + C3848l.f10401s + ((int) s) + C3848l.f10402t;
    }
}
