package com.netease.nimlib.mixpush.vivo;

import android.content.Context;
import com.netease.nimlib.sdk.mixpush.VivoPushMessageReceiver;
import com.p118pd.sdk.C8803ooO000oo;
import com.p118pd.sdk.C8827ooO0O0OO;
import com.p118pd.sdk.C9004ooOo000o;
import com.vivo.push.model.UPSNotificationMessage;
import com.vivo.push.sdk.OpenClientPushMessageReceiver;
import java.util.Map;

public class VivoPushReceiver extends OpenClientPushMessageReceiver {
    @Override // com.vivo.push.sdk.PushMessageCallback
    public void onNotificationMessageClicked(Context context, UPSNotificationMessage uPSNotificationMessage) {
        Map<String, String> params = uPSNotificationMessage.getParams();
        if (C8803ooO000oo.OooO00o(params)) {
            C8827ooO0O0OO.OooO00o(9).OooO00o(context, params);
            return;
        }
        VivoPushMessageReceiver OooO00o = C9004ooOo000o.m20670OooO00o(context);
        if (OooO00o != null) {
            OooO00o.OooO00o(context, uPSNotificationMessage);
        }
    }

    @Override // com.vivo.push.sdk.PushMessageCallback
    public void onReceiveRegId(Context context, String str) {
        C8827ooO0O0OO.OooO00o(9).OooO00o(str);
        VivoPushMessageReceiver OooO00o = C9004ooOo000o.m20670OooO00o(context);
        if (OooO00o != null) {
            OooO00o.OooO00o(context, str);
        }
    }
}
