package com.p118pd.sdk;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.coloros.mcssdk.PushService;
import com.coloros.mcssdk.mode.AppMessage;
import com.coloros.mcssdk.mode.SptDataMessage;
import com.netease.nimlib.sdk.mixpush.OppoPushMessageService;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.ooO0O00O  reason: case insensitive filesystem */
public class C8824ooO0O00O extends PushService {
    public static OppoPushMessageService OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static boolean f22026OooO00o;

    public void OooO00o(Context context, AppMessage appMessage) {
        C8824ooO0O00O.super.processMessage(context, appMessage);
        OppoPushMessageService OooO00o2 = OooO00o(context);
        if (OooO00o2 != null) {
            OooO00o2.OooO00o(context, appMessage);
        }
    }

    public void OooO00o(Context context, SptDataMessage sptDataMessage) {
        C8824ooO0O00O.super.processMessage(context, sptDataMessage);
        String content = sptDataMessage.getContent();
        String str = "0";
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = TextUtils.isEmpty(content) ? null : new JSONObject(content);
            str = jSONObject.getString("nim");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (TextUtils.equals(str, "1")) {
            C8827ooO0O0OO.OooO00o(10).OooO00o(context, hashMap);
            return;
        }
        OppoPushMessageService OooO00o2 = OooO00o(context);
        if (OooO00o2 != null) {
            OooO00o2.OooO00o(context, sptDataMessage);
        }
    }

    private OppoPushMessageService OooO00o(Context context) {
        OppoPushMessageService oppoPushMessageService = OooO00o;
        if (oppoPushMessageService != null) {
            return oppoPushMessageService;
        }
        if (context == null || f22026OooO00o) {
            return null;
        }
        f22026OooO00o = true;
        Intent intent = new Intent("com.coloros.mcs.action.RECEIVE_MCS_MESSAGE");
        intent.setPackage(context.getPackageName());
        try {
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(intent, 64);
            if (queryIntentServices == null) {
                return null;
            }
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (resolveInfo.serviceInfo != null && resolveInfo.serviceInfo.packageName.equals(context.getPackageName())) {
                    String str = resolveInfo.serviceInfo.name;
                    if (OppoPushMessageService.class.isAssignableFrom(Class.forName(str))) {
                        return (OppoPushMessageService) Class.forName(str).newInstance();
                    }
                }
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
