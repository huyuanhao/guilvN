package com.umeng.message.inapp;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.message.entity.UInAppMessage;

public class UmengInAppClickHandler implements UInAppHandler {

    /* renamed from: a */
    public static final String f10223a = "com.umeng.message.inapp.UmengInAppClickHandler";

    /* renamed from: b */
    public String f10224b = null;

    /* renamed from: c */
    public String f10225c = null;

    /* renamed from: d */
    public String f10226d = null;

    @Override // com.umeng.message.inapp.UInAppHandler
    public final void handleInAppMessage(Activity activity, UInAppMessage uInAppMessage, int i) {
        switch (i) {
            case 16:
                this.f10224b = uInAppMessage.action_type;
                this.f10225c = uInAppMessage.action_activity;
                this.f10226d = uInAppMessage.action_url;
                break;
            case 17:
                this.f10224b = uInAppMessage.bottom_action_type;
                this.f10225c = uInAppMessage.bottom_action_activity;
                this.f10226d = uInAppMessage.bottom_action_url;
                break;
            case 18:
                this.f10224b = uInAppMessage.plainTextActionType;
                this.f10225c = uInAppMessage.plainTextActivity;
                this.f10226d = uInAppMessage.plainTextUrl;
                break;
            case 19:
                this.f10224b = uInAppMessage.customButtonActionType;
                this.f10225c = uInAppMessage.customButtonActivity;
                this.f10226d = uInAppMessage.customButtonUrl;
                break;
        }
        if (TextUtils.isEmpty(this.f10224b)) {
            return;
        }
        if (TextUtils.equals("go_activity", this.f10224b)) {
            openActivity(activity, this.f10225c);
        } else if (TextUtils.equals("go_url", this.f10224b)) {
            openUrl(activity, this.f10226d);
        } else {
            TextUtils.equals("go_app", this.f10224b);
        }
    }

    public void openActivity(Activity activity, String str) {
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str.trim())) {
                    UMLog uMLog = UMConfigure.umDebugLog;
                    String str2 = f10223a;
                    UMLog.mutlInfo(str2, 2, "打开Activity: " + str);
                    Intent intent = new Intent();
                    intent.setClassName(activity, str);
                    intent.setFlags(536870912);
                    activity.startActivity(intent);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void openUrl(Activity activity, String str) {
        if (str != null) {
            try {
                if (!TextUtils.isEmpty(str.trim())) {
                    UMLog uMLog = UMConfigure.umDebugLog;
                    String str2 = f10223a;
                    UMLog.mutlInfo(str2, 2, "打开链接: " + str);
                    activity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
