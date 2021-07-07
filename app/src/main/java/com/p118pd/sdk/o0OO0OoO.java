package com.p118pd.sdk;

import anet.channel.util.ALog;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.pd.sdk.o0OO0OoO */
public class o0OO0OoO {
    public static final CopyOnWriteArrayList<o0OO0O0O> OooO00o = new CopyOnWriteArrayList<>();

    public static void OooO00o(o0OO0O0O o0oo0o0o) {
        if (!OooO00o.contains(o0oo0o0o)) {
            OooO00o.add(o0oo0o0o);
            ALog.m290i("anet.InterceptorManager", "[addInterceptor]", null, "interceptors", OooO00o.toString());
        }
    }

    public static void OooO0O0(o0OO0O0O o0oo0o0o) {
        OooO00o.remove(o0oo0o0o);
        ALog.m290i("anet.InterceptorManager", "[remoteInterceptor]", null, "interceptors", OooO00o.toString());
    }

    public static o0OO0O0O OooO00o(int i) {
        return OooO00o.get(i);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m18906OooO00o(o0OO0O0O o0oo0o0o) {
        return OooO00o.contains(o0oo0o0o);
    }

    public static int OooO00o() {
        return OooO00o.size();
    }
}
