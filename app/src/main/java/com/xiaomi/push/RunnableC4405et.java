package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.et */
public class RunnableC4405et implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f11800a;

    /* renamed from: a */
    public final /* synthetic */ C4404es f11801a;

    /* renamed from: a */
    public final /* synthetic */ String f11802a;

    /* renamed from: b */
    public final /* synthetic */ String f11803b;

    /* renamed from: c */
    public final /* synthetic */ String f11804c;

    public RunnableC4405et(C4404es esVar, String str, Context context, String str2, String str3) {
        this.f11801a = esVar;
        this.f11802a = str;
        this.f11800a = context;
        this.f11803b = str2;
        this.f11804c = str3;
    }

    public void run() {
        String str;
        String str2;
        Context context;
        Context context2;
        String str3;
        String str4;
        C4404es esVar;
        EnumC4406eu euVar;
        Context context3;
        if (!TextUtils.isEmpty(this.f11802a)) {
            try {
                C4400eo.m12445a(this.f11800a, this.f11802a, 1001, "get message");
                JSONObject jSONObject = new JSONObject(this.f11802a);
                String optString = jSONObject.optString("action");
                String optString2 = jSONObject.optString("awakened_app_packagename");
                String optString3 = jSONObject.optString("awake_app_packagename");
                String optString4 = jSONObject.optString("awake_app");
                String optString5 = jSONObject.optString("awake_type");
                int optInt = jSONObject.optInt("awake_foreground", 0);
                if (this.f11803b.equals(optString3)) {
                    if (this.f11804c.equals(optString4)) {
                        if (TextUtils.isEmpty(optString5) || TextUtils.isEmpty(optString3) || TextUtils.isEmpty(optString4) || TextUtils.isEmpty(optString2)) {
                            context2 = this.f11800a;
                            str3 = this.f11802a;
                            str4 = "A receive a incorrect message with empty type";
                        } else {
                            this.f11801a.mo41806b(optString3);
                            this.f11801a.mo41803a(optString4);
                            C4403er erVar = new C4403er();
                            erVar.mo41793b(optString);
                            erVar.mo41791a(optString2);
                            erVar.mo41790a(optInt);
                            erVar.mo41797d(this.f11802a);
                            if ("service".equals(optString5)) {
                                if (!TextUtils.isEmpty(optString)) {
                                    esVar = this.f11801a;
                                    euVar = EnumC4406eu.SERVICE_ACTION;
                                    context3 = this.f11800a;
                                } else {
                                    erVar.mo41795c("com.xiaomi.mipush.sdk.PushMessageHandler");
                                    esVar = this.f11801a;
                                    euVar = EnumC4406eu.SERVICE_COMPONENT;
                                    context3 = this.f11800a;
                                }
                            } else if (EnumC4406eu.ACTIVITY.f11810a.equals(optString5)) {
                                esVar = this.f11801a;
                                euVar = EnumC4406eu.ACTIVITY;
                                context3 = this.f11800a;
                            } else if (EnumC4406eu.PROVIDER.f11810a.equals(optString5)) {
                                esVar = this.f11801a;
                                euVar = EnumC4406eu.PROVIDER;
                                context3 = this.f11800a;
                            } else {
                                context2 = this.f11800a;
                                str3 = this.f11802a;
                                str4 = "A receive a incorrect message with unknown type " + optString5;
                            }
                            esVar.m12467a(euVar, context3, erVar);
                            return;
                        }
                        C4400eo.m12445a(context2, str3, 1008, str4);
                        return;
                    }
                }
                C4400eo.m12445a(this.f11800a, this.f11802a, 1008, "A receive a incorrect message with incorrect package info" + optString3);
            } catch (JSONException e) {
                AbstractC4163b.m11303a(e);
                context = this.f11800a;
                str2 = this.f11802a;
                str = "A meet a exception when receive the message";
            }
        } else {
            context = this.f11800a;
            str2 = "null";
            str = "A receive a incorrect message with empty info";
            C4400eo.m12445a(context, str2, 1008, str);
        }
    }
}
