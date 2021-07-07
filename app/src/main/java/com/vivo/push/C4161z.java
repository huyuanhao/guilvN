package com.vivo.push;

import android.net.Uri;
import com.netease.nis.captcha.Captcha;

/* renamed from: com.vivo.push.z */
public final class C4161z {

    /* renamed from: a */
    public static final Uri f11158a = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/config");

    /* renamed from: b */
    public static final Uri f11159b = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/permission");

    /* renamed from: c */
    public static final Uri f11160c = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/clientState");

    /* renamed from: d */
    public static final Uri f11161d = Uri.parse("content://com.vivo.push.sdk.service.SystemPushConfig/debugInfo");

    /* renamed from: a */
    public static String m11292a(int i) {
        switch (i) {
            case 2002:
                return "method_alias_bind";
            case Captcha.WEB_VIEW_HTTP_ERROR:
                return "method_alias_unbind";
            case Captcha.WEB_VIEW_HTTPS_ERROR:
                return "method_tag_bind";
            case 2005:
                return "method_tag_unbind";
            case 2006:
                return "method_sdk_bind";
            case 2007:
                return "method_sdk_unbind";
            case 2008:
                return "method_stop";
            default:
                return null;
        }
    }
}
