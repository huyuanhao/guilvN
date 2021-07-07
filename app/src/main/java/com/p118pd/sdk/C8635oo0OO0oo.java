package com.p118pd.sdk;

import android.content.Context;
import com.p118pd.sdk.C8990ooOOoo0O;
import java.util.concurrent.TimeUnit;
import okhttp3.Interceptor;

/* renamed from: com.pd.sdk.oo0OO0oo  reason: case insensitive filesystem */
public class C8635oo0OO0oo {
    public static final int OooO00o = 60;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f21754OooO00o = "RetrofitHelper";

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8990ooOOoo0O f21755OooO00o;
    public C8990ooOOoo0O OooO0O0;

    /* renamed from: com.pd.sdk.oo0OO0oo$OooO0O0 */
    public static class OooO0O0 {
        public static final C8635oo0OO0oo OooO00o = new C8635oo0OO0oo();
    }

    public static C8635oo0OO0oo OooO00o() {
        return OooO0O0.OooO00o;
    }

    public <T> T OooO0O0(Class<T> cls) {
        return (T) this.OooO0O0.OooO00o(cls);
    }

    public C8635oo0OO0oo() {
    }

    public C8635oo0OO0oo OooO00o(Context context) {
        this.f21755OooO00o = OooO00o(new C8990ooOOoo0O.OooO0O0(context).OooO00o(C8630oo0OO0OO.OooO00o().OooO00o), 60, TimeUnit.SECONDS).m20659OooO00o();
        C8990ooOOoo0O.OooO0O0 oooO0O0 = new C8990ooOOoo0O.OooO0O0(context);
        if (!C8630oo0OO0OO.OooO00o().f21751OooO00o) {
            oooO0O0.OooO00o();
        }
        this.OooO0O0 = OooO00o(oooO0O0.OooO00o(C8630oo0OO0OO.OooO00o().OooO00o), 60, TimeUnit.SECONDS).m20659OooO00o();
        return this;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public C8990ooOOoo0O m20256OooO00o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m20255OooO00o() {
        System.setProperty("http.proxyHost", "");
        System.setProperty("http.proxyPort", "");
        System.setProperty("https.proxyPort", "");
        System.setProperty("https.proxyPort", "");
    }

    private C8990ooOOoo0O.OooO0O0 OooO00o(C8990ooOOoo0O.OooO0O0 oooO0O0, int i, TimeUnit timeUnit) {
        if (oooO0O0 != null) {
            oooO0O0.OooO00o(C8996ooOOooo.OooO00o(C6261iii1I1.OooO0OO())).OooO00o(C9000ooOo00.OooO00o()).OooO00o(new C8632oo0OO0o()).OooO00o(new C8628oo0OO0O()).OooO0O0((Interceptor) null).OooO00o(i, timeUnit).OooO0OO(i, timeUnit).OooO0O0(i, timeUnit).OooO0O0(C8625oo0OO00.OooO00o().m20253OooO00o()).OooO00o(true);
            if (C8625oo0OO00.OooO00o().m20252OooO00o() != null) {
                oooO0O0.OooO00o(C8625oo0OO00.OooO00o().m20252OooO00o());
            }
            if (C8625oo0OO00.OooO00o().m20251OooO00o() != null) {
                oooO0O0.OooO00o(C8625oo0OO00.OooO00o().m20251OooO00o());
            }
            return oooO0O0;
        }
        throw new IllegalArgumentException("builder can not is null");
    }

    public <T> T OooO00o(Class<T> cls) {
        return (T) this.f21755OooO00o.OooO00o(cls);
    }

    public C8990ooOOoo0O OooO00o(Context context, int i, TimeUnit timeUnit) {
        return OooO00o(new C8990ooOOoo0O.OooO0O0(context).OooO00o(C8630oo0OO0OO.OooO00o().OooO00o), i, timeUnit).m20659OooO00o();
    }
}
