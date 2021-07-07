package com.alibaba.sdk.android.httpdns.p016d;

import android.text.TextUtils;
import com.alibaba.sdk.android.httpdns.C0298h;
import java.net.SocketTimeoutException;

/* renamed from: com.alibaba.sdk.android.httpdns.d.c */
public class C0291c {
    /* renamed from: a */
    public static int m515a(Throwable th) {
        return th instanceof C0298h ? ((C0298h) th).getErrorCode() : th instanceof SocketTimeoutException ? 10001 : 10000;
    }

    /* renamed from: a */
    public static String m516a(Throwable th) {
        return (th == null || TextUtils.isEmpty(th.getMessage())) ? th instanceof SocketTimeoutException ? "time out exception" : "default error" : th.getMessage();
    }

    /* renamed from: b */
    public static int m517b() {
        return 0;
    }
}
