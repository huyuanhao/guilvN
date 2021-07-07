package com.netease.nimlib.mixpush.p116hw;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.hms.support.api.push.PushReceiver;
import com.netease.nimlib.sdk.mixpush.HWPushMessageReceiver;
import com.p118pd.sdk.C8783oo0oooOO;
import com.p118pd.sdk.C8803ooO000oo;
import com.p118pd.sdk.C8827ooO0O0OO;
import com.p118pd.sdk.C8871ooO0oO0O;
import com.p118pd.sdk.C9004ooOo000o;
import com.umeng.message.entity.UMessage;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.netease.nimlib.mixpush.hw.HWPushReceiver */
public final class HWPushReceiver extends PushReceiver {
    public static final String OooO00o = "HWPushReceiver";

    private void OooO00o(String str) {
        C8783oo0oooOO.OooOOOO("HWPushReceiver " + str);
    }

    @Override // com.huawei.hms.support.api.push.PushReceiver
    public void onEvent(Context context, PushReceiver.Event event, Bundle bundle) {
        if (PushReceiver.Event.NOTIFICATION_OPENED.equals(event) || PushReceiver.Event.NOTIFICATION_CLICK_BTN.equals(event)) {
            int i = bundle.getInt(PushReceiver.BOUND_KEY.pushNotifyId, 0);
            String string = bundle.getString(PushReceiver.BOUND_KEY.pushMsgKey);
            OooO00o("onEvent event " + event + " extras = " + string);
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = null;
                try {
                    JSONArray jSONArray = new JSONArray(string);
                    if (jSONArray.length() == 1) {
                        jSONObject = jSONArray.getJSONObject(0);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                Map<String, String> OooO00o2 = C8871ooO0oO0O.OooO00o(jSONObject);
                if (OooO00o2 == null || !C8803ooO000oo.OooO00o(OooO00o2)) {
                    HWPushMessageReceiver OooO00o3 = C9004ooOo000o.OooO00o(context);
                    if (OooO00o3 != null) {
                        OooO00o3.OooO00o(context, event, bundle);
                        return;
                    }
                    return;
                }
                if (i != 0) {
                    ((NotificationManager) context.getSystemService(UMessage.DISPLAY_TYPE_NOTIFICATION)).cancel(i);
                }
                C8827ooO0O0OO.OooO00o(6).OooO00o(context, OooO00o2);
            }
        }
    }

    @Override // com.huawei.hms.support.api.push.PushReceiver
    public boolean onPushMsg(Context context, byte[] bArr, Bundle bundle) {
        try {
            String str = new String(bArr, "UTF-8");
            OooO00o("Receiver push pass msg : " + str);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        HWPushMessageReceiver OooO00o2 = C9004ooOo000o.OooO00o(context);
        if (OooO00o2 != null) {
            return OooO00o2.OooO00o(context, bArr, bundle);
        }
        return false;
    }

    @Override // com.huawei.hms.support.api.push.PushReceiver
    public void onPushState(Context context, boolean z) {
        try {
            OooO00o("onPushState: state " + z);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        HWPushMessageReceiver OooO00o2 = C9004ooOo000o.OooO00o(context);
        if (OooO00o2 != null) {
            OooO00o2.OooO00o(context, z);
        }
    }

    @Override // com.huawei.hms.support.api.push.PushReceiver
    public void onToken(Context context, String str, Bundle bundle) {
        String string = bundle.getString("belongId");
        OooO00o("onToken: token " + str + " belongId " + string);
        C8827ooO0O0OO.OooO00o(6).OooO00o(str);
        HWPushMessageReceiver OooO00o2 = C9004ooOo000o.OooO00o(context);
        if (OooO00o2 != null) {
            OooO00o2.OooO00o(context, str, bundle);
        }
    }
}
