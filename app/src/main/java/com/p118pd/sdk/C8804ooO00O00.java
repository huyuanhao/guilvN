package com.p118pd.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.netease.nimlib.mixpush.fcm.FCMTokenService;

/* renamed from: com.pd.sdk.ooO00O00  reason: case insensitive filesystem */
public class C8804ooO00O00 implements AbstractC8826ooO0O0O0 {
    public OooO00o OooO00o;

    /* renamed from: com.pd.sdk.ooO00O00$OooO00o */
    public class OooO00o implements Runnable {
        public static final int o0ooOO0 = 3;
        public Context OooO00o;
        public int o00oO0O = 0;

        public OooO00o(Context context) {
            this.OooO00o = context;
        }

        public void OooO00o() {
            this.o00oO0O = 0;
        }

        public void OooO0O0() {
            run();
        }

        public void run() {
            int i = this.o00oO0O;
            if (i >= 3) {
                C8804ooO00O00.this.OooO00o((String) null);
                return;
            }
            this.o00oO0O = i + 1;
            String OooO00o2 = FCMTokenService.OooO00o();
            if (!TextUtils.isEmpty(OooO00o2)) {
                C8804ooO00O00.this.OooO00o(OooO00o2);
            } else {
                C8775oo0ooo0.OooO0O0(this.OooO00o).postDelayed(this, 3000);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8826ooO0O0O0
    public void OooO00o(Context context, Object obj) {
    }

    @Override // com.p118pd.sdk.AbstractC8826ooO0O0O0
    public void OooO00o(Context context, String str, String str2, String str3) {
        C8783oo0oooOO.OooOOOO("fcm push register start");
        if (this.OooO00o == null) {
            this.OooO00o = new OooO00o(context);
        }
        this.OooO00o.OooO0O0();
    }

    @Override // com.p118pd.sdk.AbstractC8826ooO0O0O0
    public boolean OooO00o(Context context) {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC8826ooO0O0O0
    public void OooO00o(String str) {
        C8783oo0oooOO.OooOOOO("fcm push onToken " + str);
        OooO00o oooO00o = this.OooO00o;
        if (oooO00o != null) {
            oooO00o.OooO00o();
        }
        C8827ooO0O0OO.OooO00o(8, str);
    }
}
