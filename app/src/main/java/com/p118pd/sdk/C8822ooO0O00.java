package com.p118pd.sdk;

import android.content.Context;
import com.coloros.mcssdk.PushManager;
import com.coloros.mcssdk.callback.PushAdapter;
import java.util.Map;

/* renamed from: com.pd.sdk.ooO0O00  reason: case insensitive filesystem */
public class C8822ooO0O00 implements AbstractC8826ooO0O0O0 {
    public static final int OooO00o = 11;
    public static final int OooO0O0 = -1;
    public static final int OooO0OO = 13;
    public static final int OooO0Oo = 14;
    public static final int OooO0o = 0;
    public static final int OooO0o0 = 3;
    public static int OooO0oO;

    /* renamed from: com.pd.sdk.ooO0O00$OooO00o */
    public class OooO00o extends PushAdapter {
        public final /* synthetic */ Context OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ String f22025OooO00o;
        public final /* synthetic */ String OooO0O0;

        public OooO00o(Context context, String str, String str2) {
            this.OooO00o = context;
            this.f22025OooO00o = str;
            this.OooO0O0 = str2;
        }

        public void OooO00o(int i, String str) {
            C8783oo0oooOO.OooOOOO("oppp turn on push state=" + i);
            if (i == 11 || i == 14) {
                C8822ooO0O00.this.OooO00o("");
            } else if (i == -1 || i == 13) {
                C8822ooO0O00.this.OooO00o(this.OooO00o, this.f22025OooO00o, this.OooO0O0);
            } else if (i == 0) {
                C8822ooO0O00.this.OooO00o(str);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8826ooO0O0O0
    public boolean OooO00o(Context context) {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC8826ooO0O0O0
    public void OooO00o(Context context, String str, String str2, String str3) {
        OooO0oO = 0;
        if (PushManager.isSupportPush(context)) {
            OooO00o(context, str2, str3);
        } else {
            OooO00o("");
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void OooO00o(Context context, String str, String str2) {
        int i = OooO0oO + 1;
        OooO0oO = i;
        if (i <= 3) {
            PushManager.getInstance().register(context, str, str2, new OooO00o(context, str, str2));
        }
    }

    @Override // com.p118pd.sdk.AbstractC8826ooO0O0O0
    public void OooO00o(String str) {
        C8783oo0oooOO.OooOOOO("oppp push on token:" + str);
        C8827ooO0O0OO.OooO00o(10, str);
    }

    @Override // com.p118pd.sdk.AbstractC8826ooO0O0O0
    public void OooO00o(Context context, Object obj) {
        C8783oo0oooOO.OooOOOO("oppp push on onNotificationClick");
        C8827ooO0O0OO.OooO00o(context, (Map) obj, C8791ooO00.OooO00o());
    }
}
