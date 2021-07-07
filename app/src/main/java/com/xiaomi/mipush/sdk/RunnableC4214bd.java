package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.push.AbstractC4532iz;
import com.xiaomi.push.AbstractC4565n;
import com.xiaomi.push.C4269au;
import com.xiaomi.push.C4285bf;
import com.xiaomi.push.C4442g;
import com.xiaomi.push.C4506i;
import com.xiaomi.push.C4508ib;
import com.xiaomi.push.C4520in;
import com.xiaomi.push.C4563l;
import com.xiaomi.push.EnumC4494ho;
import com.xiaomi.push.EnumC4504hy;
import com.xiaomi.push.service.C4609ak;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.xiaomi.mipush.sdk.bd */
public final class RunnableC4214bd implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Context f11290a;

    /* renamed from: a */
    public final /* synthetic */ boolean f11291a;

    public RunnableC4214bd(Context context, boolean z) {
        this.f11290a = context;
        this.f11291a = z;
    }

    public void run() {
        String str;
        String str2;
        Map<String, String> map;
        AbstractC4163b.m11301a("do sync info");
        C4520in inVar = new C4520in(C4609ak.m13938a(), false);
        C4209b a = C4209b.m11491a(this.f11290a);
        inVar.mo42317c(EnumC4504hy.SyncInfo.f12451a);
        inVar.mo42314b(a.m11495a());
        inVar.mo42321d(this.f11290a.getPackageName());
        HashMap hashMap = new HashMap();
        inVar.f12723a = hashMap;
        Context context = this.f11290a;
        AbstractC4565n.m13735a(hashMap, "app_version", C4442g.m12699a(context, context.getPackageName()));
        Map<String, String> map2 = inVar.f12723a;
        Context context2 = this.f11290a;
        AbstractC4565n.m13735a(map2, Constants.EXTRA_KEY_APP_VERSION_CODE, Integer.toString(C4442g.m12696a(context2, context2.getPackageName())));
        AbstractC4565n.m13735a(inVar.f12723a, "push_sdk_vn", "3_7_0");
        AbstractC4565n.m13735a(inVar.f12723a, "push_sdk_vc", Integer.toString(30700));
        AbstractC4565n.m13735a(inVar.f12723a, "token", a.mo41428b());
        if (!C4563l.m13731d()) {
            String a2 = C4285bf.m11800a(C4506i.m13048f(this.f11290a));
            String h = C4506i.m13050h(this.f11290a);
            if (!TextUtils.isEmpty(h)) {
                a2 = a2 + Constants.ACCEPT_TIME_SEPARATOR_SP + h;
            }
            if (!TextUtils.isEmpty(a2)) {
                AbstractC4565n.m13735a(inVar.f12723a, Constants.EXTRA_KEY_IMEI_MD5, a2);
            }
        }
        C4269au.m11702a(this.f11290a).mo41498a(inVar.f12723a);
        AbstractC4565n.m13735a(inVar.f12723a, Constants.EXTRA_KEY_REG_ID, a.m11510c());
        AbstractC4565n.m13735a(inVar.f12723a, Constants.EXTRA_KEY_REG_SECRET, a.mo41432d());
        AbstractC4565n.m13735a(inVar.f12723a, Constants.EXTRA_KEY_ACCEPT_TIME, MiPushClient.getAcceptTime(this.f11290a).replace(Constants.ACCEPT_TIME_SEPARATOR_SP, Constants.ACCEPT_TIME_SEPARATOR_SERVER));
        if (this.f11291a) {
            AbstractC4565n.m13735a(inVar.f12723a, Constants.EXTRA_KEY_ALIASES_MD5, C4213bc.m11535c(MiPushClient.getAllAlias(this.f11290a)));
            AbstractC4565n.m13735a(inVar.f12723a, Constants.EXTRA_KEY_TOPICS_MD5, C4213bc.m11535c(MiPushClient.getAllTopic(this.f11290a)));
            map = inVar.f12723a;
            str2 = C4213bc.m11535c(MiPushClient.getAllUserAccount(this.f11290a));
            str = Constants.EXTRA_KEY_ACCOUNTS_MD5;
        } else {
            AbstractC4565n.m13735a(inVar.f12723a, Constants.EXTRA_KEY_ALIASES, C4213bc.m11536d(MiPushClient.getAllAlias(this.f11290a)));
            AbstractC4565n.m13735a(inVar.f12723a, Constants.EXTRA_KEY_TOPICS, C4213bc.m11536d(MiPushClient.getAllTopic(this.f11290a)));
            map = inVar.f12723a;
            str2 = C4213bc.m11536d(MiPushClient.getAllUserAccount(this.f11290a));
            str = Constants.EXTRA_KEY_ACCOUNTS;
        }
        AbstractC4565n.m13735a(map, str, str2);
        C4204aw.m11444a(this.f11290a).mo41404a((AbstractC4532iz) inVar, EnumC4494ho.Notification, false, (C4508ib) null);
    }
}
