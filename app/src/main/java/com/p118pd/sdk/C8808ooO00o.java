package com.p118pd.sdk;

import android.os.Handler;
import android.text.TextUtils;
import com.facebook.react.devsupport.WebsocketJavaScriptExecutor;
import com.xiaomi.mipush.sdk.MiPushClient;

/* renamed from: com.pd.sdk.ooO00o  reason: case insensitive filesystem */
public class C8808ooO00o {
    public static final int OooO0O0 = 5000;
    public static final int OooO0OO = 250;
    public static final int OooO0Oo = 3;
    public int OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f22014OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Runnable f22015OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f22016OooO00o;

    /* renamed from: com.pd.sdk.ooO00o$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        public void run() {
            if (C8808ooO00o.this.f22016OooO00o) {
                C8808ooO00o.this.OooO0o();
            }
            if (C8808ooO00o.this.f22016OooO00o) {
                C8808ooO00o.this.OooO00o().postDelayed(this, 250);
            }
        }
    }

    /* renamed from: com.pd.sdk.ooO00o$OooO0O0 */
    public static class OooO0O0 {
        public static final C8808ooO00o OooO00o = new C8808ooO00o(null);
    }

    public /* synthetic */ C8808ooO00o(OooO00o oooO00o) {
        this();
    }

    private void OooO0OO() {
        C8783oo0oooOO.OooOOOO("mi register timer start");
        this.f22014OooO00o = System.currentTimeMillis();
        this.f22016OooO00o = true;
        OooO00o().postDelayed(this.f22015OooO00o, 250);
    }

    private void OooO0Oo() {
        C8783oo0oooOO.OooOOOO("mi register timer stop");
        this.OooO00o = 0;
        this.f22016OooO00o = false;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO0o() {
        if (System.currentTimeMillis() - this.f22014OooO00o > WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS) {
            OooO0o0();
        }
    }

    private void OooO0o0() {
        C8783oo0oooOO.OooOOOO("mi register timer time out");
        String regId = MiPushClient.getRegId(C8769oo0ooOOO.OooO00o());
        if (!TextUtils.isEmpty(regId)) {
            C8827ooO0O0OO.OooO00o(5).OooO00o(regId);
            return;
        }
        int i = this.OooO00o;
        if (i >= 3) {
            C8827ooO0O0OO.OooO00o(5).OooO00o((String) null);
            return;
        }
        this.OooO00o = i + 1;
        this.f22014OooO00o = System.currentTimeMillis();
    }

    public void OooO0O0() {
        OooO0Oo();
    }

    public C8808ooO00o() {
        this.OooO00o = 0;
        this.f22016OooO00o = false;
        this.f22014OooO00o = 0;
        this.f22015OooO00o = new OooO00o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20445OooO00o() {
        OooO0OO();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20446OooO00o() {
        return this.f22016OooO00o;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private Handler OooO00o() {
        return C8775oo0ooo0.OooO00o(C8769oo0ooOOO.OooO00o());
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static C8808ooO00o m20444OooO00o() {
        return OooO0O0.OooO00o;
    }
}
