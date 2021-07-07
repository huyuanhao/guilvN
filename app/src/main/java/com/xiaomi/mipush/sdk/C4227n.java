package com.xiaomi.mipush.sdk;

import android.app.Activity;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.AbstractC4532iz;
import com.xiaomi.push.C4251ai;
import com.xiaomi.push.C4404es;
import com.xiaomi.push.C4520in;
import com.xiaomi.push.C4531iy;
import com.xiaomi.push.C4563l;
import com.xiaomi.push.EnumC4406eu;
import com.xiaomi.push.EnumC4499ht;
import com.xiaomi.push.EnumC4504hy;
import com.xiaomi.push.service.C4605ah;
import com.xiaomi.push.service.C4609ak;
import java.util.HashMap;

/* renamed from: com.xiaomi.mipush.sdk.n */
public class C4227n {
    /* renamed from: a */
    public static void m11580a(Context context, Intent intent, Uri uri) {
        C4404es a;
        EnumC4406eu euVar;
        if (context != null) {
            C4204aw.m11444a(context).m11465a();
            if (C4404es.m12465a(context.getApplicationContext()).m12470a() == null) {
                C4404es.m12465a(context.getApplicationContext()).mo41804a(C4209b.m11491a(context.getApplicationContext()).m11495a(), context.getPackageName(), C4605ah.m13919a(context.getApplicationContext()).mo42656a(EnumC4499ht.AwakeInfoUploadWaySwitch.mo42043a(), 0), new C4215c());
                C4605ah.m13919a(context).mo42659a(new C4229p(102, "awake online config", context));
            }
            if ((context instanceof Activity) && intent != null) {
                a = C4404es.m12465a(context.getApplicationContext());
                euVar = EnumC4406eu.ACTIVITY;
            } else if (!(context instanceof Service) || intent == null) {
                if (uri != null && !TextUtils.isEmpty(uri.toString())) {
                    C4404es.m12465a(context.getApplicationContext()).mo41801a(EnumC4406eu.PROVIDER, context, (Intent) null, uri.toString());
                    return;
                }
                return;
            } else if ("com.xiaomi.mipush.sdk.WAKEUP".equals(intent.getAction())) {
                a = C4404es.m12465a(context.getApplicationContext());
                euVar = EnumC4406eu.SERVICE_COMPONENT;
            } else {
                a = C4404es.m12465a(context.getApplicationContext());
                euVar = EnumC4406eu.SERVICE_ACTION;
            }
            a.mo41801a(euVar, context, intent, (String) null);
        }
    }

    /* renamed from: a */
    public static void m11581a(Context context, C4520in inVar) {
        boolean z = false;
        boolean a = C4605ah.m13919a(context).mo42661a(EnumC4499ht.AwakeAppPingSwitch.mo42043a(), false);
        int a2 = C4605ah.m13919a(context).mo42656a(EnumC4499ht.AwakeAppPingFrequency.mo42043a(), 0);
        if (a2 >= 0 && a2 < 30) {
            AbstractC4163b.m11305c("aw_ping: frquency need > 30s.");
            a2 = 30;
        }
        if (a2 >= 0) {
            z = a;
        }
        if (!C4563l.m13726a()) {
            m11582a(context, inVar, z, a2);
        } else if (z) {
            C4251ai.m11641a(context.getApplicationContext()).mo41477a((C4251ai.AbstractRunnableC4252a) new C4228o(inVar, context), a2);
        }
    }

    /* renamed from: a */
    public static final <T extends AbstractC4532iz<T, ?>> void m11582a(Context context, T t, boolean z, int i) {
        byte[] a = C4531iy.m13590a(t);
        if (a == null) {
            AbstractC4163b.m11301a("send message fail, because msgBytes is null.");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("action_help_ping");
        intent.putExtra("extra_help_ping_switch", z);
        intent.putExtra("extra_help_ping_frequency", i);
        intent.putExtra("mipush_payload", a);
        intent.putExtra("com.xiaomi.mipush.MESSAGE_CACHE", true);
        C4204aw.m11444a(context).m11468a(intent);
    }

    /* renamed from: a */
    public static void m11583a(Context context, String str) {
        AbstractC4163b.m11301a("aw_ping : send aw_ping cmd and content to push service from 3rd app");
        HashMap hashMap = new HashMap();
        hashMap.put("awake_info", str);
        hashMap.put("event_type", String.valueOf(9999));
        hashMap.put("description", "ping message");
        C4520in inVar = new C4520in();
        inVar.mo42314b(C4209b.m11491a(context).m11495a());
        inVar.mo42321d(context.getPackageName());
        inVar.mo42317c(EnumC4504hy.AwakeAppResponse.f12451a);
        inVar.mo42307a(C4609ak.m13938a());
        inVar.f12723a = hashMap;
        m11581a(context, inVar);
    }

    /* renamed from: a */
    public static void m11584a(Context context, String str, int i, String str2) {
        C4520in inVar = new C4520in();
        inVar.mo42314b(str);
        inVar.mo42309a(new HashMap());
        inVar.m13318a().put("extra_aw_app_online_cmd", String.valueOf(i));
        inVar.m13318a().put("extra_help_aw_info", str2);
        inVar.mo42307a(C4609ak.m13938a());
        byte[] a = C4531iy.m13590a(inVar);
        if (a == null) {
            AbstractC4163b.m11301a("send message fail, because msgBytes is null.");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("action_aw_app_logic");
        intent.putExtra("mipush_payload", a);
        C4204aw.m11444a(context).m11468a(intent);
    }
}
