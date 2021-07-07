package com.umeng.message.util;

import com.xiaomi.mipush.sdk.Constants;
import java.util.List;

/* renamed from: com.umeng.message.util.e */
public class C3895e {
    /* renamed from: a */
    public static String m10709a(String... strArr) {
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str);
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m10708a(List<String> list) {
        StringBuilder sb = new StringBuilder();
        for (String str : list) {
            sb.append(str);
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }
}
