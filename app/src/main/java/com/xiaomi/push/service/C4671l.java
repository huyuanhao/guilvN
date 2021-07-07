package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.idtracking.C3692t;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import com.xiaomi.mipush.sdk.Constants;
import com.xiaomi.push.C4244ab;
import com.xiaomi.push.C4437fv;
import com.xiaomi.push.C4506i;
import com.xiaomi.push.EnumC4566o;
import org.android.agoo.xiaomi.MiPushRegistar;

/* renamed from: com.xiaomi.push.service.l */
public class C4671l {

    /* renamed from: a */
    public static C4670k f13359a;

    /* renamed from: a */
    public static AbstractC4672a f13360a;

    /* renamed from: com.xiaomi.push.service.l$a */
    public interface AbstractC4672a {
        /* renamed from: a */
        void mo42712a();
    }

    /* renamed from: a */
    public static synchronized C4670k m14141a(Context context) {
        synchronized (C4671l.class) {
            if (f13359a != null) {
                return f13359a;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_account", 0);
            String string = sharedPreferences.getString(C3692t.f9678a, null);
            String string2 = sharedPreferences.getString("token", null);
            String string3 = sharedPreferences.getString("security", null);
            String string4 = sharedPreferences.getString(Constants.APP_ID, null);
            String string5 = sharedPreferences.getString("app_token", null);
            String string6 = sharedPreferences.getString("package_name", null);
            String string7 = sharedPreferences.getString("device_id", null);
            int i = sharedPreferences.getInt("env_type", 1);
            if (!TextUtils.isEmpty(string7) && C4506i.m13037a(string7)) {
                string7 = C4506i.m13053k(context);
                sharedPreferences.edit().putString("device_id", string7).commit();
            }
            if (TextUtils.isEmpty(string) || TextUtils.isEmpty(string2) || TextUtils.isEmpty(string3)) {
                return null;
            }
            String k = C4506i.m13053k(context);
            if (!MiPushRegistar.PACKAGE_XIAOMI.equals(context.getPackageName()) && !TextUtils.isEmpty(k) && !TextUtils.isEmpty(string7) && !string7.equals(k)) {
                AbstractC4163b.m11301a("read_phone_state permission changes.");
            }
            C4670k kVar = new C4670k(string, string2, string3, string4, string5, string6, i);
            f13359a = kVar;
            return kVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01b6  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01c0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.xiaomi.push.service.C4670k m14142a(android.content.Context r9, java.lang.String r10, java.lang.String r11, java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 582
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.C4671l.m14142a(android.content.Context, java.lang.String, java.lang.String, java.lang.String):com.xiaomi.push.service.k");
    }

    /* renamed from: a */
    public static String m14143a(Context context) {
        StringBuilder sb;
        String str;
        String a = C4591a.m13848a(context).mo42647a();
        if (C4244ab.m11629b()) {
            sb = new StringBuilder();
            sb.append("http://");
            sb.append(C4437fv.f11978b);
            str = ":9085";
        } else if (EnumC4566o.China.name().equals(a)) {
            sb = new StringBuilder();
            str = "https://cn.register.xmpush.xiaomi.com";
        } else if (EnumC4566o.Global.name().equals(a)) {
            sb = new StringBuilder();
            str = "https://register.xmpush.global.xiaomi.com";
        } else if (EnumC4566o.Europe.name().equals(a)) {
            sb = new StringBuilder();
            str = "https://fr.register.xmpush.global.xiaomi.com";
        } else if (EnumC4566o.Russia.name().equals(a)) {
            sb = new StringBuilder();
            str = "https://ru.register.xmpush.global.xiaomi.com";
        } else if (EnumC4566o.India.name().equals(a)) {
            sb = new StringBuilder();
            str = "https://idmb.register.xmpush.global.xiaomi.com";
        } else {
            sb = new StringBuilder();
            sb.append("https://");
            str = C4244ab.m11628a() ? "sandbox.xmpush.xiaomi.com" : "register.xmpush.xiaomi.com";
        }
        sb.append(str);
        sb.append("/pass/v2/register");
        return sb.toString();
    }

    /* renamed from: a */
    public static void m14144a() {
        AbstractC4672a aVar = f13360a;
        if (aVar != null) {
            aVar.mo42712a();
        }
    }

    /* renamed from: a */
    public static void m14145a(Context context) {
        context.getSharedPreferences("mipush_account", 0).edit().clear().commit();
        f13359a = null;
        m14144a();
    }

    /* renamed from: a */
    public static void m14146a(Context context, C4670k kVar) {
        SharedPreferences.Editor edit = context.getSharedPreferences("mipush_account", 0).edit();
        edit.putString(C3692t.f9678a, kVar.f13353a);
        edit.putString("security", kVar.f13355c);
        edit.putString("token", kVar.f13354b);
        edit.putString(Constants.APP_ID, kVar.f13356d);
        edit.putString("package_name", kVar.f13358f);
        edit.putString("app_token", kVar.f13357e);
        edit.putString("device_id", C4506i.m13053k(context));
        edit.putInt("env_type", kVar.f13352a);
        edit.commit();
        m14144a();
    }

    /* renamed from: a */
    public static void m14147a(AbstractC4672a aVar) {
        f13360a = aVar;
    }

    /* renamed from: a */
    public static boolean m14148a(Context context) {
        return context.getPackageName().equals(MiPushRegistar.PACKAGE_XIAOMI);
    }
}
