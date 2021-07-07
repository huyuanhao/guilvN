package com.p118pd.sdk;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import java.util.HashMap;

/* renamed from: com.pd.sdk.oo0ooo0  reason: case insensitive filesystem */
public final class C8775oo0ooo0 {
    public static Handler OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static C8775oo0ooo0 f21952OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f21953OooO00o = "DEFAULT";
    public static final String OooO0O0 = "MISC";

    /* renamed from: OooO00o  reason: collision with other field name */
    public final HashMap<String, HandlerThread> f21954OooO00o = new HashMap<>();

    public static Handler OooO0O0(Context context) {
        if (OooO00o == null) {
            OooO00o = new Handler(context.getMainLooper());
        }
        return OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final Handler m20414OooO00o() {
        return m20415OooO00o(f21953OooO00o);
    }

    public static Handler OooO00o(Context context) {
        return new Handler(context.getMainLooper());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public final Handler m20415OooO00o(String str) {
        return new Handler(OooO00o(str).getLooper());
    }

    private HandlerThread OooO00o(String str) {
        HandlerThread handlerThread;
        synchronized (this.f21954OooO00o) {
            handlerThread = this.f21954OooO00o.get(str);
            if (handlerThread != null && handlerThread.getLooper() == null) {
                this.f21954OooO00o.remove(str);
                handlerThread = null;
            }
            if (handlerThread == null) {
                handlerThread = new HandlerThread(m20413OooO00o(str));
                handlerThread.start();
                this.f21954OooO00o.put(str, handlerThread);
            }
        }
        return handlerThread;
    }

    public final Handler OooO0O0() {
        return m20415OooO00o(OooO0O0);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static String m20413OooO00o(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("NIM-HT-");
        if (TextUtils.isEmpty(str)) {
            str = f21953OooO00o;
        }
        sb.append(str);
        return sb.toString();
    }

    public static synchronized C8775oo0ooo0 OooO00o() {
        C8775oo0ooo0 oo0ooo0;
        synchronized (C8775oo0ooo0.class) {
            if (f21952OooO00o == null) {
                f21952OooO00o = new C8775oo0ooo0();
            }
            oo0ooo0 = f21952OooO00o;
        }
        return oo0ooo0;
    }
}
