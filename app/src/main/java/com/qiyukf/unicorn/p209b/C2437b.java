package com.qiyukf.unicorn.p209b;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.basesdk.p138c.C1847c;
import com.qiyukf.basesdk.p138c.p142c.C1848a;
import com.qiyukf.unicorn.p213f.p214a.p219c.C2555c;
import com.qiyukf.unicorn.p232k.C2697c;
import com.xiaomi.mipush.sdk.Constants;
import java.security.SecureRandom;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.qiyukf.unicorn.b.b */
public final class C2437b {

    /* renamed from: a */
    public static Context f4778a;

    /* renamed from: b */
    public static String f4779b;

    /* renamed from: a */
    public static String m5237a() {
        return m5307u("YSF_ID_YX");
    }

    /* renamed from: a */
    public static void m5238a(int i) {
        m5270d("YSF_KEYBOARD_HEIGHT", i);
    }

    /* renamed from: a */
    public static void m5239a(long j) {
        m5275e("YSF_LAST_UPLOAD_USER", j);
    }

    /* renamed from: a */
    public static void m5240a(long j, String str) {
        m5264c(f4779b + j, str);
    }

    /* renamed from: a */
    public static void m5241a(Context context, String str) {
        f4778a = context.getApplicationContext();
        f4779b = str;
    }

    /* renamed from: a */
    public static void m5242a(Boolean bool) {
        m5257b("IS_UN_READ_CALLBACK", bool.booleanValue());
    }

    /* renamed from: a */
    public static void m5243a(String str) {
        m5264c("YSF_ID_YX", str);
    }

    /* renamed from: a */
    public static void m5244a(String str, int i) {
        m5270d("YSF_SESSION_COUNT/" + str, i);
    }

    /* renamed from: a */
    public static void m5245a(String str, long j) {
        m5275e("YSF_SESSION_ID/" + str, j);
    }

    /* renamed from: a */
    public static void m5246a(String str, C2555c cVar) {
        String jSONObject = cVar == null ? null : cVar.mo35958b().toString();
        m5264c("YSF_EVALUATION_CONFIG/" + str, jSONObject);
    }

    /* renamed from: a */
    public static void m5247a(String str, String str2) {
        m5264c("YSF_ID_MP/" + str, str2);
    }

    /* renamed from: a */
    public static void m5248a(boolean z) {
        m5257b("YSF_EAR_PHONE_MODE", z);
    }

    /* renamed from: a */
    public static boolean m5249a(String str, boolean z) {
        return m5311y().getBoolean(str, z);
    }

    /* renamed from: b */
    public static int m5250b(int i) {
        return m5259c("YSF_KEYBOARD_HEIGHT", i);
    }

    /* renamed from: b */
    public static String m5251b() {
        String u = m5307u("YSF_ID_TK");
        if (TextUtils.isEmpty(u)) {
            return null;
        }
        String d = m5267d();
        return C2697c.m6240a(f4778a, C1848a.m3507a(u), d);
    }

    /* renamed from: b */
    public static void m5252b(long j) {
        m5275e(f4779b + "KET_YSF_REQUEST_CONFIG_DA_TIME", j);
    }

    /* renamed from: b */
    public static void m5253b(String str) {
        byte[] a;
        m5264c("YSF_ID_TK", (!TextUtils.isEmpty(str) && (a = C2697c.m6242a(f4778a, str, m5267d())) != null) ? C1848a.m3506a(a) : null);
    }

    /* renamed from: b */
    public static void m5254b(String str, int i) {
        m5270d("YSF_SESSION_EVALUATE_STATE/" + str, i);
    }

    /* renamed from: b */
    public static void m5255b(String str, long j) {
        m5275e("KEY_YSF_MUITI_EVALUATION_TIME/" + str, j);
    }

    /* renamed from: b */
    public static void m5256b(String str, String str2) {
        m5264c("YSF_DRAFT/" + str, str2);
    }

    /* renamed from: b */
    public static void m5257b(String str, boolean z) {
        C1847c.m3503a(m5311y(), str, z);
    }

    /* renamed from: b */
    public static void m5258b(boolean z) {
        m5257b("YSF_SB_ON", z);
    }

    /* renamed from: c */
    public static int m5259c(String str, int i) {
        return m5311y().getInt(str, i);
    }

    /* renamed from: c */
    public static String m5260c() {
        return m5311y().getString("YSF_BID", "");
    }

    /* renamed from: c */
    public static String m5261c(String str) {
        return m5307u("YSF_ID_MP/" + str);
    }

    /* renamed from: c */
    public static void m5262c(long j) {
        m5275e(f4779b + "KEY_EMOJI_MAP_REQUEST_TIME", j);
    }

    /* renamed from: c */
    public static void m5263c(String str, long j) {
        m5275e(str, j);
    }

    /* renamed from: c */
    public static void m5264c(String str, String str2) {
        C1847c.m3502a(m5311y(), str, str2);
    }

    /* renamed from: c */
    public static void m5265c(boolean z) {
        m5257b("YSF_TOKEN_REGISTERED", z);
    }

    /* renamed from: d */
    public static long m5266d(String str, long j) {
        try {
            return m5311y().getLong(str, j);
        } catch (ClassCastException unused) {
            return (long) m5311y().getInt(str, 0);
        }
    }

    /* renamed from: d */
    public static String m5267d() {
        String u = m5307u("YSF_ID_DV");
        if (!TextUtils.isEmpty(u)) {
            return u;
        }
        String replace = UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
        m5264c("YSF_ID_DV", replace);
        return replace;
    }

    /* renamed from: d */
    public static void m5268d(long j) {
        m5275e(f4779b + "KEY_UI_REQUEST_TIME", j);
    }

    /* renamed from: d */
    public static void m5269d(String str) {
        m5264c("YSF_BID", str);
    }

    /* renamed from: d */
    public static void m5270d(String str, int i) {
        C1847c.m3500a(m5311y(), str, i);
    }

    /* renamed from: d */
    public static void m5271d(boolean z) {
        m5257b("YSF_STATISTICS_ON", z);
    }

    /* renamed from: e */
    public static String m5272e(long j) {
        return m5307u(f4779b + j);
    }

    /* renamed from: e */
    public static String m5273e(String str) {
        return m5307u("YSF_DRAFT/" + str);
    }

    /* renamed from: e */
    public static void m5274e() {
        m5264c("YSF_ID_DV", (String) null);
    }

    /* renamed from: e */
    public static void m5275e(String str, long j) {
        C1847c.m3501a(m5311y(), str, j);
    }

    /* renamed from: f */
    public static String m5276f() {
        String u = m5307u("YSF_ID_SD");
        if (!TextUtils.isEmpty(u)) {
            return u;
        }
        String a = C1848a.m3506a(new SecureRandom().generateSeed(32));
        m5264c("YSF_ID_SD", a);
        return a;
    }

    /* renamed from: f */
    public static void m5277f(String str) {
        m5264c("YSF_FOREIGN_NAME", str);
    }

    /* renamed from: g */
    public static String m5278g() {
        return m5307u("YSF_FOREIGN_NAME");
    }

    /* renamed from: g */
    public static void m5279g(String str) {
        m5264c("YSF_CRM_DATA", str);
    }

    /* renamed from: h */
    public static String m5280h() {
        return m5307u("YSF_CRM_DATA");
    }

    /* renamed from: h */
    public static void m5281h(String str) {
        m5264c("AUTH_TOKEN", str);
    }

    /* renamed from: i */
    public static long m5282i(String str) {
        return m5266d("YSF_SESSION_ID/" + str, 0L);
    }

    /* renamed from: i */
    public static String m5283i() {
        return m5307u("AUTH_TOKEN");
    }

    /* renamed from: j */
    public static int m5284j(String str) {
        return m5259c("YSF_SESSION_COUNT/" + str, 0);
    }

    /* renamed from: j */
    public static boolean m5285j() {
        return m5249a("YSF_EAR_PHONE_MODE", false);
    }

    /* renamed from: k */
    public static int m5286k(String str) {
        return m5259c("YSF_SESSION_EVALUATE_STATE/" + str, 0);
    }

    /* renamed from: k */
    public static Boolean m5287k() {
        return Boolean.valueOf(m5249a("IS_UN_READ_CALLBACK", false));
    }

    /* renamed from: l */
    public static C2555c m5288l(String str) {
        JSONObject a = C1810b.m3420a(m5307u("YSF_EVALUATION_CONFIG/" + str));
        if (a == null) {
            return null;
        }
        C2555c cVar = new C2555c();
        cVar.mo35957a(a);
        return cVar;
    }

    /* renamed from: l */
    public static boolean m5289l() {
        return m5249a("YSF_SB_ON", true);
    }

    /* renamed from: m */
    public static long m5290m(String str) {
        return m5266d("KEY_YSF_MUITI_EVALUATION_TIME/" + str, 0L);
    }

    /* renamed from: m */
    public static String m5291m() {
        return m5307u("YSF_PUSH_TOKEN");
    }

    /* renamed from: n */
    public static void m5292n(String str) {
        m5264c("YSF_PUSH_TOKEN", str);
    }

    /* renamed from: n */
    public static boolean m5293n() {
        return m5249a("YSF_TOKEN_REGISTERED", true);
    }

    /* renamed from: o */
    public static String m5294o() {
        return m5307u("YSF_LAST_STAFF_ID");
    }

    /* renamed from: o */
    public static void m5295o(String str) {
        m5264c("YSF_LAST_STAFF_ID", str);
    }

    /* renamed from: p */
    public static String m5296p() {
        return m5307u("YSF_MSG_SESSION_ID");
    }

    /* renamed from: p */
    public static void m5297p(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = null;
        } else {
            String u = m5307u("YSF_MSG_SESSION_ID");
            if (TextUtils.isEmpty(u)) {
                m5264c("YSF_MSG_SESSION_ID", str);
                return;
            }
            str2 = u + Constants.ACCEPT_TIME_SEPARATOR_SP + str;
        }
        m5264c("YSF_MSG_SESSION_ID", str2);
    }

    /* renamed from: q */
    public static String m5298q() {
        return m5307u("YSF_CRM_DATA_CACHE");
    }

    /* renamed from: q */
    public static void m5299q(String str) {
        m5264c("YSF_CRM_DATA_CACHE", str);
    }

    /* renamed from: r */
    public static long m5300r() {
        return m5266d("YSF_LAST_UPLOAD_USER", 0L);
    }

    /* renamed from: r */
    public static long m5301r(String str) {
        return m5266d(str, -1000L);
    }

    /* renamed from: s */
    public static void m5302s(String str) {
        m5264c(f4779b + "KEY_EMOJI_MAP_BODE", str);
    }

    /* renamed from: s */
    public static boolean m5303s() {
        return m5249a("YSF_STATISTICS_ON", false);
    }

    /* renamed from: t */
    public static long m5304t() {
        return m5266d(f4779b + "KET_YSF_REQUEST_CONFIG_DA_TIME", 0L);
    }

    /* renamed from: t */
    public static void m5305t(String str) {
        m5264c(f4779b + "KEY_EMOJI_MAP_BODE", str);
    }

    /* renamed from: u */
    public static long m5306u() {
        return m5266d(f4779b + "KEY_EMOJI_MAP_REQUEST_TIME", 0L);
    }

    /* renamed from: u */
    public static String m5307u(String str) {
        return m5311y().getString(str, null);
    }

    /* renamed from: v */
    public static String m5308v() {
        return m5307u(f4779b + "KEY_EMOJI_MAP_BODE");
    }

    /* renamed from: w */
    public static long m5309w() {
        return m5266d(f4779b + "KEY_UI_REQUEST_TIME", 0L);
    }

    /* renamed from: x */
    public static String m5310x() {
        return m5307u(f4779b + "KEY_EMOJI_MAP_BODE");
    }

    /* renamed from: y */
    public static SharedPreferences m5311y() {
        Context context = f4778a;
        return context.getSharedPreferences("Unicorn." + f4779b, 0);
    }
}
