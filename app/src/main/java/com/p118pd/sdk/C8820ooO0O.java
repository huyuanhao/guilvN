package com.p118pd.sdk;

import android.content.Context;
import com.vivo.push.IPushActionListener;
import com.vivo.push.PushClient;
import java.util.Map;

/* renamed from: com.pd.sdk.ooO0O  reason: case insensitive filesystem */
public class C8820ooO0O implements AbstractC8826ooO0O0O0 {
    public static final int OooO00o = 101;
    public static final int OooO0O0 = 1005;
    public static final int OooO0OO = 102;
    public static final int OooO0Oo = 3;
    public static int OooO0o;
    public static final int OooO0o0 = 0;

    /* renamed from: com.pd.sdk.ooO0O$OooO00o */
    public class OooO00o implements IPushActionListener {
        public final /* synthetic */ Context OooO00o;

        public OooO00o(Context context) {
            this.OooO00o = context;
        }

        @Override // com.vivo.push.IPushActionListener
        public void onStateChanged(int i) {
            C8783oo0oooOO.OooOOOO("vivo turn on push state=" + i);
            if (i == 101 || i == 1005) {
                C8820ooO0O.this.OooO00o("");
            } else if (i == 102) {
                C8820ooO0O.this.OooO00o((C8820ooO0O) this.OooO00o);
            } else if (i == 0) {
                C8820ooO0O.this.OooO00o(PushClient.getInstance(this.OooO00o).getRegId());
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8826ooO0O0O0
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20453OooO00o(Context context) {
        return false;
    }

    @Override // com.p118pd.sdk.AbstractC8826ooO0O0O0
    public void OooO00o(Context context, String str, String str2, String str3) {
        OooO0o = 0;
        OooO00o(context);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    @Override // com.p118pd.sdk.AbstractC8826ooO0O0O0
    private void OooO00o(Context context) {
        int i = OooO0o + 1;
        OooO0o = i;
        if (i <= 3) {
            PushClient.getInstance(context).initialize();
            PushClient.getInstance(context).turnOnPush(new OooO00o(context));
        }
    }

    @Override // com.p118pd.sdk.AbstractC8826ooO0O0O0
    public void OooO00o(String str) {
        C8783oo0oooOO.OooOOOO("vivo push on token:" + str);
        C8827ooO0O0OO.OooO00o(9, str);
    }

    @Override // com.p118pd.sdk.AbstractC8826ooO0O0O0
    public void OooO00o(Context context, Object obj) {
        C8783oo0oooOO.OooOOOO("vivo push on onNotificationClick");
        C8827ooO0O0OO.OooO00o(context, (Map) obj, C8791ooO00.OooO00o());
    }
}
