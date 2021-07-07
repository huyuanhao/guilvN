package com.umeng.message;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import anet.channel.util.HttpConstant;
import com.p118pd.sdk.C8932ooOOO0o;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.proguard.C3617o;
import com.umeng.message.common.UmengMessageDeviceConfig;
import com.umeng.message.entity.UMessage;
import com.umeng.message.proguard.C3814c;
import com.umeng.message.proguard.C3849m;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import java.lang.reflect.Method;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class UmengNotificationClickHandler implements UHandler {

    /* renamed from: a */
    public static final String f10006a = "com.umeng.message.UmengNotificationClickHandler";

    /* renamed from: a */
    private void m10294a(Context context, UMessage uMessage) {
        String str = "";
        try {
            String str2 = uMessage.custom;
            if (str2 == null) {
                return;
            }
            if (!str2.equals(str)) {
                JSONObject jSONObject = new JSONObject(str2);
                String optString = jSONObject.optString(C3617o.f9365as);
                String optString2 = jSONObject.optString("pu");
                String optString3 = jSONObject.optString("ju");
                int optInt = jSONObject.optInt(SocializeProtocolConstants.PROTOCOL_KEY_EN);
                Intent intent = new Intent();
                String[] split = optString2.split(HttpConstant.SCHEME_SPLIT);
                if (split == null || split.length >= 2) {
                    String[] split2 = split[1].split(C8932ooOOO0o.OooO0OO);
                    if (split2 == null || split2.length >= 1) {
                        String str3 = split2[0];
                        if (optInt == 1) {
                            String[] split3 = optString2.split(str3 + C8932ooOOO0o.OooO0OO);
                            try {
                                StringBuilder sb = new StringBuilder();
                                if (split3 != null && split3.length >= 2) {
                                    sb.append(split3[1]);
                                }
                                sb.append("&umessage=");
                                sb.append(uMessage.getRaw().toString());
                                sb.append("&thirdkey=");
                                sb.append(PushAgent.getInstance(context).getMessageAppkey());
                                UMLog uMLog = UMConfigure.umDebugLog;
                                UMLog.mutlInfo(f10006a, 2, "url:" + sb.toString());
                                str = C3814c.m10489a(sb.toString());
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                            optString2 = split3[0] + str3 + C8932ooOOO0o.OooO0OO + str;
                        }
                        intent.setData(Uri.parse(optString2));
                        intent.setPackage(optString);
                        intent.addFlags(CommonNetImpl.FLAG_AUTH);
                        if (UmengMessageDeviceConfig.getDataData(optString)) {
                            try {
                                if (UmengMessageDeviceConfig.isIntentExist(context, optString2, optString)) {
                                    UTrack.getInstance(context).trackMsgPulled(uMessage, 62);
                                    context.startActivity(intent);
                                    return;
                                }
                                UTrack.getInstance(context).trackMsgPulled(uMessage, 61);
                                if (optString3 == null) {
                                    return;
                                }
                                if (!TextUtils.isEmpty(optString3.trim())) {
                                    Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse(optString3));
                                    intent2.addFlags(CommonNetImpl.FLAG_AUTH);
                                    context.startActivity(intent2);
                                }
                            } catch (Exception unused) {
                            }
                        } else {
                            UTrack.getInstance(context).trackMsgPulled(uMessage, 60);
                            if (optString3 != null && !TextUtils.isEmpty(optString3.trim())) {
                                Intent intent3 = new Intent("android.intent.action.VIEW", Uri.parse(optString3));
                                intent3.addFlags(CommonNetImpl.FLAG_AUTH);
                                context.startActivity(intent3);
                            }
                        }
                    }
                }
            }
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    public void autoUpdate(Context context, UMessage uMessage) {
        try {
            Object g = C3849m.m10581a(context).mo39941g();
            Class<?> cls = Class.forName("com.umeng.update.UmengUpdateAgent");
            Class<?> cls2 = Class.forName("com.umeng.update.UpdateResponse");
            Method method = cls.getMethod("showUpdateDialog", Context.class, cls2);
            if (g != null) {
                method.invoke(cls, context, cls2.cast(g));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void dealWithCustomAction(Context context, UMessage uMessage) {
    }

    public void dismissNotification(Context context, UMessage uMessage) {
    }

    @Override // com.umeng.message.UHandler
    public void handleMessage(Context context, UMessage uMessage) {
        try {
            if (!uMessage.clickOrDismiss) {
                dismissNotification(context, uMessage);
            } else if (!TextUtils.equals(UMessage.DISPLAY_TYPE_AUTOUPDATE, uMessage.display_type) || !PushAgent.getInstance(context).isIncludesUmengUpdateSDK()) {
                if (!TextUtils.isEmpty(uMessage.after_open)) {
                    if (UMessage.DISPLAY_TYPE_NOTIFICATIONPULLAPP.equals(uMessage.display_type)) {
                        if (TextUtils.equals(UMessage.NOTIFICATION_GO_APPURL, uMessage.after_open)) {
                            m10294a(context, uMessage);
                            return;
                        }
                    } else if (TextUtils.equals("go_url", uMessage.after_open)) {
                        openUrl(context, uMessage);
                        return;
                    } else if (TextUtils.equals("go_activity", uMessage.after_open)) {
                        openActivity(context, uMessage);
                        return;
                    } else if (TextUtils.equals(UMessage.NOTIFICATION_GO_CUSTOM, uMessage.after_open)) {
                        dealWithCustomAction(context, uMessage);
                        return;
                    } else if (TextUtils.equals("go_app", uMessage.after_open)) {
                        launchApp(context, uMessage);
                        return;
                    }
                }
                if (!UMessage.DISPLAY_TYPE_NOTIFICATIONPULLAPP.equals(uMessage.display_type)) {
                    if (uMessage.url != null && !TextUtils.isEmpty(uMessage.url.trim())) {
                        openUrl(context, uMessage);
                    } else if (uMessage.activity != null && !TextUtils.isEmpty(uMessage.activity.trim())) {
                        openActivity(context, uMessage);
                    } else if (uMessage.custom == null || TextUtils.isEmpty(uMessage.custom.trim())) {
                        launchApp(context, uMessage);
                    } else {
                        dealWithCustomAction(context, uMessage);
                    }
                }
            } else {
                autoUpdate(context, uMessage);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void launchApp(Context context, UMessage uMessage) {
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage == null) {
            UMLog uMLog = UMConfigure.umDebugLog;
            String str = f10006a;
            UMLog.mutlInfo(str, 0, "找不到应用: " + context.getPackageName());
            return;
        }
        launchIntentForPackage.setPackage(null);
        launchIntentForPackage.addFlags(CommonNetImpl.FLAG_AUTH);
        m10293a(launchIntentForPackage, uMessage);
        context.startActivity(launchIntentForPackage);
        UMLog uMLog2 = UMConfigure.umDebugLog;
        String str2 = f10006a;
        UMLog.mutlInfo(str2, 0, "启动应用: " + context.getPackageName());
    }

    public void openActivity(Context context, UMessage uMessage) {
        String str = uMessage.activity;
        if (str != null && !TextUtils.isEmpty(str.trim())) {
            Intent intent = new Intent();
            m10293a(intent, uMessage);
            intent.setClassName(context, uMessage.activity);
            intent.addFlags(CommonNetImpl.FLAG_AUTH);
            context.startActivity(intent);
        }
    }

    public void openUrl(Context context, UMessage uMessage) {
        String str = uMessage.url;
        if (str != null && !TextUtils.isEmpty(str.trim())) {
            UMLog uMLog = UMConfigure.umDebugLog;
            String str2 = f10006a;
            UMLog.mutlInfo(str2, 2, "打开链接: " + uMessage.url);
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(uMessage.url));
            m10293a(intent, uMessage);
            intent.addFlags(CommonNetImpl.FLAG_AUTH);
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    private Intent m10293a(Intent intent, UMessage uMessage) {
        Map<String, String> map;
        if (!(intent == null || uMessage == null || (map = uMessage.extra) == null)) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null) {
                    intent.putExtra(key, value);
                }
            }
        }
        return intent;
    }
}
