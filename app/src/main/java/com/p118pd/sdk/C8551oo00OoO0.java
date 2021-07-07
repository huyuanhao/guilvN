package com.p118pd.sdk;

import android.text.TextUtils;
import android.util.Base64;
import java.nio.charset.Charset;
import java.text.MessageFormat;

/* renamed from: com.pd.sdk.oo00OoO0  reason: case insensitive filesystem */
public final class C8551oo00OoO0 {
    public static String OooO00o(String str) {
        if (!str.startsWith("https") && !str.startsWith("http")) {
            return str;
        }
        String substring = str.substring(str.indexOf("//") + 2);
        return substring.substring(substring.indexOf(C8932ooOOO0o.OooO0OO));
    }

    public static String OooO00o(String str, String str2) {
        byte[] encode = Base64.encode(C8586oo0O00.OooO00o(str, str2), 2);
        if (encode == null) {
            return null;
        }
        return new String(encode, Charset.forName("UTF-8"));
    }

    public static String OooO00o(String str, String str2, String str3) {
        C8550oo00OoO oo00ooo;
        StringBuffer stringBuffer = new StringBuffer(512);
        String OooO00o = OooO00o(str);
        if (OooO00o.contains(C8932ooOOO0o.f22176OooO00o)) {
            String substring = OooO00o.substring(0, OooO00o.indexOf(63));
            oo00ooo = OooO00o.substring(OooO00o.indexOf(C8932ooOOO0o.f22176OooO00o)).length() > 1 ? new C8550oo00OoO(OooO00o.substring(OooO00o.indexOf(C8932ooOOO0o.f22176OooO00o) + 1)) : new C8550oo00OoO(null);
            OooO00o = substring;
        } else {
            oo00ooo = new C8550oo00OoO(null);
        }
        stringBuffer.append("POST");
        stringBuffer.append("&");
        String OooO00o2 = oo00ooo.m20208OooO00o(AbstractC8411oOoo0Oo0.OooOo00);
        if (TextUtils.isEmpty(OooO00o2)) {
            AbstractC8536oo00OO0O.OooO0Oo("AuthoHeadUtil", "appid is empty！");
            return null;
        }
        stringBuffer.append(OooO00o.substring(OooO00o.indexOf(C8932ooOOO0o.OooO0OO)));
        stringBuffer.append("&");
        stringBuffer.append(oo00ooo.OooO00o());
        stringBuffer.append("&");
        stringBuffer.append(str2);
        stringBuffer.append("&appID=");
        stringBuffer.append(OooO00o2);
        return MessageFormat.format("HMAC-SHA256 appID={0}, signature=\"{1}\"", OooO00o2, OooO00o(stringBuffer.toString(), str3));
    }
}
