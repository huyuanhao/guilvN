package com.xiaomi.push.service;

/* renamed from: com.xiaomi.push.service.aq */
public abstract class AbstractC4621aq {

    /* renamed from: A */
    public static String f13212A = "ext_notify_id";

    /* renamed from: B */
    public static String f13213B = "ext_notify_type";

    /* renamed from: C */
    public static String f13214C = "ext_session";

    /* renamed from: D */
    public static String f13215D = "sig";

    /* renamed from: E */
    public static String f13216E = "ext_notify_title";

    /* renamed from: F */
    public static String f13217F = "ext_notify_description";

    /* renamed from: G */
    public static String f13218G = "ext_messenger";

    /* renamed from: H */
    public static String f13219H = "title";

    /* renamed from: I */
    public static String f13220I = "description";

    /* renamed from: J */
    public static String f13221J = "notifyId";

    /* renamed from: a */
    public static String f13222a = "1";

    /* renamed from: b */
    public static String f13223b = "2";

    /* renamed from: c */
    public static String f13224c = "3";

    /* renamed from: d */
    public static String f13225d = "com.xiaomi.push.OPEN_CHANNEL";

    /* renamed from: e */
    public static String f13226e = "com.xiaomi.push.SEND_MESSAGE";

    /* renamed from: f */
    public static String f13227f = "com.xiaomi.push.SEND_IQ";

    /* renamed from: g */
    public static String f13228g = "com.xiaomi.push.BATCH_SEND_MESSAGE";

    /* renamed from: h */
    public static String f13229h = "com.xiaomi.push.SEND_PRES";

    /* renamed from: i */
    public static String f13230i = "com.xiaomi.push.CLOSE_CHANNEL";

    /* renamed from: j */
    public static String f13231j = "com.xiaomi.push.FORCE_RECONN";

    /* renamed from: k */
    public static String f13232k = "com.xiaomi.push.RESET_CONN";

    /* renamed from: l */
    public static String f13233l = "com.xiaomi.push.UPDATE_CHANNEL_INFO";

    /* renamed from: m */
    public static String f13234m = "com.xiaomi.push.SEND_STATS";

    /* renamed from: n */
    public static String f13235n = "com.xiaomi.push.CHANGE_HOST";

    /* renamed from: o */
    public static String f13236o = "com.xiaomi.push.PING_TIMER";

    /* renamed from: p */
    public static String f13237p = "ext_user_id";

    /* renamed from: q */
    public static String f13238q = "ext_user_res";

    /* renamed from: r */
    public static String f13239r = "ext_chid";

    /* renamed from: s */
    public static String f13240s = "ext_sid";

    /* renamed from: t */
    public static String f13241t = "ext_token";

    /* renamed from: u */
    public static String f13242u = "ext_auth_method";

    /* renamed from: v */
    public static String f13243v = "ext_security";

    /* renamed from: w */
    public static String f13244w = "ext_kick";

    /* renamed from: x */
    public static String f13245x = "ext_client_attr";

    /* renamed from: y */
    public static String f13246y = "ext_cloud_attr";

    /* renamed from: z */
    public static String f13247z = "ext_pkg_name";

    /* renamed from: a */
    public static String m13985a(int i) {
        switch (i) {
            case 0:
                return "ERROR_OK";
            case 1:
                return "ERROR_SERVICE_NOT_INSTALLED";
            case 2:
                return "ERROR_NETWORK_NOT_AVAILABLE";
            case 3:
                return "ERROR_NETWORK_FAILED";
            case 4:
                return "ERROR_ACCESS_DENIED";
            case 5:
                return "ERROR_AUTH_FAILED";
            case 6:
                return "ERROR_MULTI_LOGIN";
            case 7:
                return "ERROR_SERVER_ERROR";
            case 8:
                return "ERROR_RECEIVE_TIMEOUT";
            case 9:
                return "ERROR_READ_ERROR";
            case 10:
                return "ERROR_SEND_ERROR";
            case 11:
                return "ERROR_RESET";
            case 12:
                return "ERROR_NO_CLIENT";
            case 13:
                return "ERROR_SERVER_STREAM";
            case 14:
                return "ERROR_THREAD_BLOCK";
            case 15:
                return "ERROR_SERVICE_DESTROY";
            case 16:
                return "ERROR_SESSION_CHANGED";
            case 17:
                return "ERROR_READ_TIMEOUT";
            case 18:
                return "ERROR_CONNECTIING_TIMEOUT";
            case 19:
                return "ERROR_USER_BLOCKED";
            case 20:
                return "ERROR_REDIRECT";
            case 21:
                return "ERROR_BIND_TIMEOUT";
            case 22:
                return "ERROR_PING_TIMEOUT";
            default:
                return String.valueOf(i);
        }
    }
}
