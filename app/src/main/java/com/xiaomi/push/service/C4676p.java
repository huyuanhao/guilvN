package com.xiaomi.push.service;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;
import com.netease.nis.captcha.Captcha;
import com.p118pd.sdk.C8651oo0OOooo;
import com.umeng.commonsdk.proguard.C3617o;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.mipush.sdk.MiPushMessage;
import com.xiaomi.push.AbstractC4456gl;
import com.xiaomi.push.C4351dh;
import com.xiaomi.push.C4417fd;
import com.xiaomi.push.C4428fn;
import com.xiaomi.push.C4442g;
import com.xiaomi.push.C4449gf;
import com.xiaomi.push.C4452gi;
import com.xiaomi.push.C4455gk;
import com.xiaomi.push.C4473gz;
import com.xiaomi.push.C4508ib;
import com.xiaomi.push.C4511ie;
import com.xiaomi.push.C4517ik;
import com.xiaomi.push.C4520in;
import com.xiaomi.push.C4531iy;
import com.xiaomi.push.C4688t;
import com.xiaomi.push.EnumC4494ho;
import com.xiaomi.push.EnumC4504hy;
import com.xiaomi.push.service.C4592aa;
import com.xiaomi.push.service.C4611am;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.android.agoo.xiaomi.MiPushRegistar;
import org.json.JSONException;

/* renamed from: com.xiaomi.push.service.p */
public class C4676p {
    /* renamed from: a */
    public static Intent m14168a(byte[] bArr, long j) {
        C4517ik a = m14170a(bArr);
        if (a == null) {
            return null;
        }
        Intent intent = new Intent("com.xiaomi.mipush.RECEIVE_MESSAGE");
        intent.putExtra("mipush_payload", bArr);
        intent.putExtra("mrt", Long.toString(j));
        intent.setPackage(a.f12694b);
        return intent;
    }

    /* renamed from: a */
    public static C4517ik m14169a(Context context, C4517ik ikVar) {
        C4511ie ieVar = new C4511ie();
        ieVar.mo42167b(ikVar.m13277a());
        C4508ib a = ikVar.m13270a();
        if (a != null) {
            ieVar.mo42163a(a.m13097a());
            ieVar.mo42162a(a.m13092a());
            if (!TextUtils.isEmpty(a.m13108b())) {
                ieVar.mo42170c(a.m13108b());
            }
        }
        ieVar.mo42164a(C4531iy.m13588a(context, ikVar));
        C4517ik a2 = C4684w.m14206a(ikVar.mo42282b(), ikVar.m13277a(), ieVar, EnumC4494ho.AckMessage);
        C4508ib a3 = ikVar.m13270a().m13093a();
        a3.mo42118a("mat", Long.toString(System.currentTimeMillis()));
        a2.mo42275a(a3);
        return a2;
    }

    /* renamed from: a */
    public static C4517ik m14170a(byte[] bArr) {
        C4517ik ikVar = new C4517ik();
        try {
            C4531iy.m13589a(ikVar, bArr);
            return ikVar;
        } catch (Throwable th) {
            AbstractC4163b.m11303a(th);
            return null;
        }
    }

    /* renamed from: a */
    public static void m14171a(XMPushService xMPushService, C4517ik ikVar) {
        xMPushService.mo42624a(new C4677q(4, xMPushService, ikVar));
    }

    /* renamed from: a */
    public static void m14172a(XMPushService xMPushService, C4517ik ikVar, String str) {
        xMPushService.mo42624a(new C4682u(4, xMPushService, ikVar, str));
    }

    /* renamed from: a */
    public static void m14173a(XMPushService xMPushService, C4517ik ikVar, String str, String str2) {
        xMPushService.mo42624a(new C4683v(4, xMPushService, ikVar, str, str2));
    }

    /* renamed from: a */
    public static void m14174a(XMPushService xMPushService, String str, byte[] bArr, Intent intent) {
        C4417fd a;
        String b;
        String a2;
        int i;
        String str2;
        String str3;
        C4417fd a3;
        String b2;
        String b3;
        String a4;
        String str4;
        boolean z;
        C4517ik a5 = m14170a(bArr);
        C4508ib a6 = a5.m13270a();
        String str5 = null;
        if (bArr != null) {
            C4351dh.m12081a(a5.mo42282b(), xMPushService.getApplicationContext(), null, a5.mo42273a(), bArr.length);
        }
        if (m14183c(a5) && m14177a(xMPushService, str)) {
            if (C4592aa.m13901e(a5)) {
                C4417fd.m12519a(xMPushService.getApplicationContext()).mo41814a(a5.mo42282b(), C4592aa.m13893b(a5), a6.m13097a(), "old message received by new SDK.");
            }
            m14182c(xMPushService, a5);
        } else if (m14178a(a5) && !m14177a(xMPushService, str) && !m14181b(a5)) {
            if (C4592aa.m13901e(a5)) {
                C4417fd.m12519a(xMPushService.getApplicationContext()).mo41814a(a5.mo42282b(), C4592aa.m13893b(a5), a6.m13097a(), "new message received by old SDK.");
            }
            m14184d(xMPushService, a5);
        } else if ((C4592aa.m13887a(a5) && C4442g.m12704b((Context) xMPushService, a5.f12694b)) || m14176a(xMPushService, intent)) {
            if (EnumC4494ho.Registration == a5.mo42273a()) {
                String b4 = a5.mo42282b();
                SharedPreferences.Editor edit = xMPushService.getSharedPreferences("pref_registered_pkg_names", 0).edit();
                edit.putString(b4, a5.f12690a);
                edit.commit();
                C4417fd.m12519a(xMPushService.getApplicationContext()).mo41813a(b4, "E100003", a6.m13097a(), 6003, "receive a register message");
                if (!TextUtils.isEmpty(a6.m13097a())) {
                    intent.putExtra(MiPushMessage.KEY_MESSAGE_ID, a6.m13097a());
                    intent.putExtra("eventMessageType", 6000);
                }
            }
            if (C4592aa.m13899c(a5)) {
                C4417fd.m12519a(xMPushService.getApplicationContext()).mo41812a(a5.mo42282b(), C4592aa.m13893b(a5), a6.m13097a(), 1001, System.currentTimeMillis(), "receive notification message ");
                if (!TextUtils.isEmpty(a6.m13097a())) {
                    intent.putExtra(MiPushMessage.KEY_MESSAGE_ID, a6.m13097a());
                    intent.putExtra("eventMessageType", 1000);
                }
            }
            if (C4592aa.m13897b(a5)) {
                C4417fd.m12519a(xMPushService.getApplicationContext()).mo41812a(a5.mo42282b(), C4592aa.m13893b(a5), a6.m13097a(), Captcha.NO_NETWORK, System.currentTimeMillis(), "receive passThrough message");
                if (!TextUtils.isEmpty(a6.m13097a())) {
                    intent.putExtra(MiPushMessage.KEY_MESSAGE_ID, a6.m13097a());
                    intent.putExtra("eventMessageType", 2000);
                }
            }
            if (C4592aa.m13887a(a5)) {
                C4417fd.m12519a(xMPushService.getApplicationContext()).mo41812a(a5.mo42282b(), C4592aa.m13893b(a5), a6.m13097a(), AuthApiStatusCodes.AUTH_API_ACCESS_FORBIDDEN, System.currentTimeMillis(), "receive business message");
                if (!TextUtils.isEmpty(a6.m13097a())) {
                    intent.putExtra(MiPushMessage.KEY_MESSAGE_ID, a6.m13097a());
                    intent.putExtra("eventMessageType", 3000);
                }
            }
            if (a6 != null && !TextUtils.isEmpty(a6.m13117c()) && !TextUtils.isEmpty(a6.mo42131d()) && a6.f12534b != 1 && (C4592aa.m13889a(a6.m13098a()) || !C4592aa.m13885a((Context) xMPushService, a5.f12694b))) {
                if (a6 != null) {
                    Map<String, String> map = a6.f12532a;
                    if (map != null) {
                        str5 = map.get("jobkey");
                    }
                    if (TextUtils.isEmpty(str5)) {
                        str5 = a6.m13097a();
                    }
                    z = C4598ac.m13904a(xMPushService, a5.f12694b, str5);
                } else {
                    z = false;
                }
                if (z) {
                    C4417fd.m12519a(xMPushService.getApplicationContext()).mo41817c(a5.mo42282b(), C4592aa.m13893b(a5), a6.m13097a(), "drop a duplicate message");
                    AbstractC4163b.m11301a("drop a duplicate message, key=" + str5);
                } else {
                    C4592aa.C4595c a7 = C4592aa.m13872a((Context) xMPushService, a5, bArr);
                    if (a7.f13142a > 0 && !TextUtils.isEmpty(a7.f13143a)) {
                        C4473gz.m12848a(xMPushService, a7.f13143a, a7.f13142a, true, false, System.currentTimeMillis());
                    }
                    if (!C4592aa.m13887a(a5)) {
                        Intent intent2 = new Intent("com.xiaomi.mipush.MESSAGE_ARRIVED");
                        intent2.putExtra("mipush_payload", bArr);
                        intent2.setPackage(a5.f12694b);
                        try {
                            List<ResolveInfo> queryBroadcastReceivers = xMPushService.getPackageManager().queryBroadcastReceivers(intent2, 0);
                            if (queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty()) {
                                xMPushService.sendBroadcast(intent2, C4684w.m14208a(a5.f12694b));
                            }
                        } catch (Exception e) {
                            xMPushService.sendBroadcast(intent2, C4684w.m14208a(a5.f12694b));
                            C4417fd.m12519a(xMPushService.getApplicationContext()).mo41816b(a5.mo42282b(), C4592aa.m13893b(a5), a6.m13097a(), e.getMessage());
                        }
                    }
                }
                m14180b(xMPushService, a5);
            } else if (MiPushRegistar.PACKAGE_XIAOMI.contains(a5.f12694b) && !a5.m13289b() && a6 != null && a6.m13098a() != null && a6.m13098a().containsKey("ab")) {
                m14180b(xMPushService, a5);
                AbstractC4163b.m11305c("receive abtest message. ack it." + a6.m13097a());
            } else if (m14179a(xMPushService, str, a5, a6)) {
                if (a6 != null && !TextUtils.isEmpty(a6.m13097a())) {
                    if (C4592aa.m13897b(a5)) {
                        a = C4417fd.m12519a(xMPushService.getApplicationContext());
                        b = a5.mo42282b();
                        str2 = C4592aa.m13893b(a5);
                        a2 = a6.m13097a();
                        i = 2002;
                        str3 = "try send passThrough message Broadcast";
                    } else {
                        if (C4592aa.m13887a(a5)) {
                            a3 = C4417fd.m12519a(xMPushService.getApplicationContext());
                            b2 = a5.mo42282b();
                            b3 = C4592aa.m13893b(a5);
                            a4 = a6.m13097a();
                            str4 = "try show awake message , but it don't show in foreground";
                        } else if (C4592aa.m13899c(a5)) {
                            a3 = C4417fd.m12519a(xMPushService.getApplicationContext());
                            b2 = a5.mo42282b();
                            b3 = C4592aa.m13893b(a5);
                            a4 = a6.m13097a();
                            str4 = "try show notification message , but it don't show in foreground";
                        } else if (C4592aa.m13900d(a5)) {
                            a = C4417fd.m12519a(xMPushService.getApplicationContext());
                            b = a5.mo42282b();
                            a2 = a6.m13097a();
                            i = 6004;
                            str2 = "E100003";
                            str3 = "try send register broadcast";
                        }
                        a3.mo41814a(b2, b3, a4, str4);
                    }
                    a.mo41813a(b, str2, a2, i, str3);
                }
                xMPushService.sendBroadcast(intent, C4684w.m14208a(a5.f12694b));
            } else {
                C4417fd.m12519a(xMPushService.getApplicationContext()).mo41814a(a5.mo42282b(), C4592aa.m13893b(a5), a6.m13097a(), "passThough message: not permit to send broadcast ");
            }
            if (a5.mo42273a() == EnumC4494ho.UnRegistration && !MiPushRegistar.PACKAGE_XIAOMI.equals(xMPushService.getPackageName())) {
                xMPushService.stopSelf();
            }
        } else if (!C4442g.m12704b((Context) xMPushService, a5.f12694b)) {
            if (C4592aa.m13901e(a5)) {
                C4417fd.m12519a(xMPushService.getApplicationContext()).mo41816b(a5.mo42282b(), C4592aa.m13893b(a5), a6.m13097a(), "receive a message, but the package is removed.");
            }
            m14171a(xMPushService, a5);
        } else {
            AbstractC4163b.m11301a("receive a mipush message, we can see the app, but we can't see the receiver.");
            if (C4592aa.m13901e(a5)) {
                C4417fd.m12519a(xMPushService.getApplicationContext()).mo41816b(a5.mo42282b(), C4592aa.m13893b(a5), a6.m13097a(), "receive a mipush message, we can see the app, but we can't see the receiver.");
            }
        }
    }

    /* renamed from: a */
    public static void m14175a(XMPushService xMPushService, byte[] bArr, long j) {
        Map<String, String> a;
        C4517ik a2 = m14170a(bArr);
        if (a2 != null) {
            if (TextUtils.isEmpty(a2.f12694b)) {
                AbstractC4163b.m11301a("receive a mipush message without package name");
                return;
            }
            Long valueOf = Long.valueOf(System.currentTimeMillis());
            Intent a3 = m14168a(bArr, valueOf.longValue());
            String a4 = C4592aa.m13875a(a2);
            C4473gz.m12848a(xMPushService, a4, j, true, true, System.currentTimeMillis());
            C4508ib a5 = a2.m13270a();
            if (a5 != null) {
                a5.mo42118a("mrt", Long.toString(valueOf.longValue()));
            }
            String str = "";
            if (EnumC4494ho.SendMessage == a2.mo42273a() && C4673m.m14150a(xMPushService).m14152a(a2.f12694b) && !C4592aa.m13887a(a2)) {
                if (a5 != null) {
                    str = a5.m13097a();
                    if (C4592aa.m13901e(a2)) {
                        C4417fd.m12519a(xMPushService.getApplicationContext()).mo41814a(a2.mo42282b(), C4592aa.m13893b(a2), str, "Drop a message for unregistered");
                    }
                }
                AbstractC4163b.m11301a("Drop a message for unregistered, msgid=" + str);
                m14172a(xMPushService, a2, a2.f12694b);
            } else if (EnumC4494ho.SendMessage == a2.mo42273a() && C4673m.m14150a(xMPushService).m14156c(a2.f12694b) && !C4592aa.m13887a(a2)) {
                if (a5 != null) {
                    str = a5.m13097a();
                    if (C4592aa.m13901e(a2)) {
                        C4417fd.m12519a(xMPushService.getApplicationContext()).mo41814a(a2.mo42282b(), C4592aa.m13893b(a2), str, "Drop a message for push closed");
                    }
                }
                AbstractC4163b.m11301a("Drop a message for push closed, msgid=" + str);
                m14172a(xMPushService, a2, a2.f12694b);
            } else if (EnumC4494ho.SendMessage != a2.mo42273a() || TextUtils.equals(xMPushService.getPackageName(), MiPushRegistar.PACKAGE_XIAOMI) || TextUtils.equals(xMPushService.getPackageName(), a2.f12694b)) {
                if (!(a5 == null || a5.m13097a() == null)) {
                    AbstractC4163b.m11301a(String.format("receive a message, appid=%1$s, msgid= %2$s", a2.m13277a(), a5.m13097a()));
                }
                if (a5 == null || (a = a5.m13098a()) == null || !a.containsKey(C8651oo0OOooo.OooOOOo) || !"true".equalsIgnoreCase(a.get(C8651oo0OOooo.OooOOOo))) {
                    if (!(a5 == null || a5.m13098a() == null || !a5.m13098a().containsKey("__miid"))) {
                        String str2 = a5.m13098a().get("__miid");
                        String a6 = C4688t.m14221a(xMPushService.getApplicationContext());
                        if (TextUtils.isEmpty(a6) || !TextUtils.equals(str2, a6)) {
                            if (C4592aa.m13901e(a2)) {
                                C4417fd.m12519a(xMPushService.getApplicationContext()).mo41814a(a2.mo42282b(), C4592aa.m13893b(a2), a5.m13097a(), "miid already logout or anther already login");
                            }
                            AbstractC4163b.m11301a(str2 + " should be login, but got " + a6);
                            m14173a(xMPushService, a2, "miid already logout or anther already login", str2 + " should be login, but got " + a6);
                            return;
                        }
                    }
                    m14174a(xMPushService, a4, bArr, a3);
                    return;
                }
                m14180b(xMPushService, a2);
            } else {
                AbstractC4163b.m11301a("Receive a message with wrong package name, expect " + xMPushService.getPackageName() + ", received " + a2.f12694b);
                m14173a(xMPushService, a2, "unmatched_package", "package should be " + xMPushService.getPackageName() + ", but got " + a2.f12694b);
                if (a5 != null && C4592aa.m13901e(a2)) {
                    C4417fd.m12519a(xMPushService.getApplicationContext()).mo41814a(a2.mo42282b(), C4592aa.m13893b(a2), a5.m13097a(), "Receive a message with wrong package name");
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m14176a(Context context, Intent intent) {
        try {
            List<ResolveInfo> queryBroadcastReceivers = context.getPackageManager().queryBroadcastReceivers(intent, 32);
            return queryBroadcastReceivers != null && !queryBroadcastReceivers.isEmpty();
        } catch (Exception unused) {
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m14177a(Context context, String str) {
        Intent intent = new Intent("com.xiaomi.mipush.miui.CLICK_MESSAGE");
        intent.setPackage(str);
        Intent intent2 = new Intent("com.xiaomi.mipush.miui.RECEIVE_MESSAGE");
        intent2.setPackage(str);
        PackageManager packageManager = context.getPackageManager();
        try {
            return !packageManager.queryBroadcastReceivers(intent2, 32).isEmpty() || !packageManager.queryIntentServices(intent, 32).isEmpty();
        } catch (Exception e) {
            AbstractC4163b.m11303a(e);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m14178a(C4517ik ikVar) {
        return MiPushRegistar.PACKAGE_XIAOMI.equals(ikVar.f12694b) && ikVar.m13270a() != null && ikVar.m13270a().m13098a() != null && ikVar.m13270a().m13098a().containsKey("miui_package_name");
    }

    /* renamed from: a */
    public static boolean m14179a(XMPushService xMPushService, String str, C4517ik ikVar, C4508ib ibVar) {
        boolean z = true;
        if (ibVar != null && ibVar.m13098a() != null && ibVar.m13098a().containsKey("__check_alive") && ibVar.m13098a().containsKey("__awake")) {
            C4520in inVar = new C4520in();
            inVar.mo42314b(ikVar.m13277a());
            inVar.mo42321d(str);
            inVar.mo42317c(EnumC4504hy.AwakeSystemApp.f12451a);
            inVar.mo42307a(ibVar.m13097a());
            inVar.f12723a = new HashMap();
            boolean a = C4442g.m12701a(xMPushService.getApplicationContext(), str);
            inVar.f12723a.put("app_running", Boolean.toString(a));
            if (!a) {
                boolean parseBoolean = Boolean.parseBoolean(ibVar.m13098a().get("__awake"));
                inVar.f12723a.put("awaked", Boolean.toString(parseBoolean));
                if (!parseBoolean) {
                    z = false;
                }
            }
            try {
                C4684w.m14210a(xMPushService, C4684w.m14206a(ikVar.mo42282b(), ikVar.m13277a(), inVar, EnumC4494ho.Notification));
            } catch (C4449gf e) {
                AbstractC4163b.m11303a(e);
            }
        }
        return z;
    }

    /* renamed from: b */
    public static void m14180b(XMPushService xMPushService, C4517ik ikVar) {
        xMPushService.mo42624a(new C4678r(4, xMPushService, ikVar));
    }

    /* renamed from: b */
    public static boolean m14181b(C4517ik ikVar) {
        Map<String, String> a = ikVar.m13270a().m13098a();
        return a != null && a.containsKey("notify_effect");
    }

    /* renamed from: c */
    public static void m14182c(XMPushService xMPushService, C4517ik ikVar) {
        xMPushService.mo42624a(new C4680s(4, xMPushService, ikVar));
    }

    /* renamed from: c */
    public static boolean m14183c(C4517ik ikVar) {
        if (ikVar.m13270a() == null || ikVar.m13270a().m13098a() == null) {
            return false;
        }
        return "1".equals(ikVar.m13270a().m13098a().get("obslete_ads_message"));
    }

    /* renamed from: d */
    public static void m14184d(XMPushService xMPushService, C4517ik ikVar) {
        xMPushService.mo42624a(new C4681t(4, xMPushService, ikVar));
    }

    /* renamed from: a */
    public void mo42748a(Context context, C4611am.C4613b bVar, boolean z, int i, String str) {
        C4670k a;
        if (!z && (a = C4671l.m14141a(context)) != null && "token-expired".equals(str)) {
            try {
                C4671l.m14142a(context, a.f13358f, a.f13356d, a.f13357e);
            } catch (IOException | JSONException e) {
                AbstractC4163b.m11303a(e);
            }
        }
    }

    /* renamed from: a */
    public void mo42749a(XMPushService xMPushService, C4428fn fnVar, C4611am.C4613b bVar) {
        try {
            m14175a(xMPushService, fnVar.m12609a(bVar.f13195h), (long) fnVar.mo41874c());
        } catch (IllegalArgumentException e) {
            AbstractC4163b.m11303a(e);
        }
    }

    /* renamed from: a */
    public void mo42750a(XMPushService xMPushService, AbstractC4456gl glVar, C4611am.C4613b bVar) {
        if (glVar instanceof C4455gk) {
            C4455gk gkVar = (C4455gk) glVar;
            C4452gi a = gkVar.mo41943a(C3617o.f9366at);
            if (a != null) {
                try {
                    m14175a(xMPushService, C4628av.m14005a(C4628av.m14004a(bVar.f13195h, gkVar.mo41966j()), a.mo41935c()), (long) C4473gz.m12840a(glVar.m12784a()));
                } catch (IllegalArgumentException e) {
                    AbstractC4163b.m11303a(e);
                }
            }
        } else {
            AbstractC4163b.m11301a("not a mipush message");
        }
    }
}
