package com.p118pd.sdk;

import android.content.Context;
import com.meizu.cloud.pushsdk.MzPushMessageReceiver;
import com.meizu.cloud.pushsdk.handler.MzPushMessage;
import com.meizu.cloud.pushsdk.notification.PushNotificationBuilder;
import com.meizu.cloud.pushsdk.platform.message.PushSwitchStatus;
import com.meizu.cloud.pushsdk.platform.message.RegisterStatus;
import com.meizu.cloud.pushsdk.platform.message.SubAliasStatus;
import com.meizu.cloud.pushsdk.platform.message.SubTagsStatus;
import com.meizu.cloud.pushsdk.platform.message.UnRegisterStatus;
import com.netease.nimlib.sdk.mixpush.MeiZuPushReceiver;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.ooO0O000  reason: case insensitive filesystem */
public class C8823ooO0O000 extends MzPushMessageReceiver {
    public void OooO00o(Context context, boolean z) {
        MeiZuPushReceiver OooO00o = C9004ooOo000o.m20668OooO00o(context);
        if (OooO00o != null) {
            OooO00o.OooO00o(context, z);
        }
    }

    public void OooO0O0(Context context, String str) {
        MeiZuPushReceiver OooO00o = C9004ooOo000o.m20668OooO00o(context);
        if (OooO00o != null) {
            OooO00o.OooO0O0(context, str);
        }
    }

    public void OooO0OO(Context context, MzPushMessage mzPushMessage) {
        MeiZuPushReceiver OooO00o = C9004ooOo000o.m20668OooO00o(context);
        if (OooO00o != null) {
            OooO00o.OooO0OO(context, mzPushMessage);
        }
    }

    public void OooO00o(Context context, PushSwitchStatus pushSwitchStatus) {
        MeiZuPushReceiver OooO00o = C9004ooOo000o.m20668OooO00o(context);
        if (OooO00o != null) {
            OooO00o.OooO00o(context, pushSwitchStatus);
        }
    }

    public void OooO0O0(Context context, MzPushMessage mzPushMessage) {
        JSONObject jSONObject;
        C8783oo0oooOO.OooOOOO("MZ onNotificationClicked extra = " + mzPushMessage.getSelfDefineContentString());
        try {
            jSONObject = new JSONObject(mzPushMessage.getSelfDefineContentString());
        } catch (JSONException e) {
            e.printStackTrace();
            jSONObject = null;
        }
        Map<String, String> OooO00o = C8871ooO0oO0O.OooO00o(jSONObject);
        if (C8803ooO000oo.OooO00o(OooO00o)) {
            C8827ooO0O0OO.OooO00o(7).OooO00o(context, OooO00o);
            return;
        }
        MeiZuPushReceiver OooO00o2 = C9004ooOo000o.m20668OooO00o(context);
        if (OooO00o2 != null) {
            OooO00o2.OooO0O0(context, mzPushMessage);
        }
    }

    public void OooO00o(Context context, RegisterStatus registerStatus) {
        if (!(registerStatus == null || registerStatus.getPushId() == null)) {
            C8827ooO0O0OO.OooO00o(7).OooO00o(registerStatus.getPushId());
        }
        MeiZuPushReceiver OooO00o = C9004ooOo000o.m20668OooO00o(context);
        if (OooO00o != null) {
            OooO00o.OooO00o(context, registerStatus);
        }
    }

    public void OooO00o(Context context, UnRegisterStatus unRegisterStatus) {
        MeiZuPushReceiver OooO00o = C9004ooOo000o.m20668OooO00o(context);
        if (OooO00o != null) {
            OooO00o.OooO00o(context, unRegisterStatus);
        }
    }

    public void OooO00o(Context context, SubTagsStatus subTagsStatus) {
        MeiZuPushReceiver OooO00o = C9004ooOo000o.m20668OooO00o(context);
        if (OooO00o != null) {
            OooO00o.OooO00o(context, subTagsStatus);
        }
    }

    public void OooO00o(Context context, SubAliasStatus subAliasStatus) {
        MeiZuPushReceiver OooO00o = C9004ooOo000o.m20668OooO00o(context);
        if (OooO00o != null) {
            OooO00o.OooO00o(context, subAliasStatus);
        }
    }

    public void OooO00o(Context context, MzPushMessage mzPushMessage) {
        MeiZuPushReceiver OooO00o = C9004ooOo000o.m20668OooO00o(context);
        if (OooO00o != null) {
            OooO00o.OooO00o(context, mzPushMessage);
        }
    }

    public void OooO00o(Context context, String str) {
        MeiZuPushReceiver OooO00o = C9004ooOo000o.m20668OooO00o(context);
        if (OooO00o != null) {
            OooO00o.OooO00o(context, str);
        }
    }

    public void OooO00o(PushNotificationBuilder pushNotificationBuilder) {
        MeiZuPushReceiver OooO00o = C9004ooOo000o.m20668OooO00o(C8769oo0ooOOO.OooO00o());
        if (OooO00o != null) {
            OooO00o.OooO00o(pushNotificationBuilder);
        }
    }
}
