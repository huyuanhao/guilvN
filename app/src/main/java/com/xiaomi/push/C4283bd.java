package com.xiaomi.push;

import android.net.Uri;
import android.text.TextUtils;
import com.p118pd.sdk.C8318oOo0oooo;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import java.io.UnsupportedEncodingException;
import java.security.InvalidParameterException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.xiaomi.push.bd */
public class C4283bd {
    /* renamed from: a */
    public static String m11794a(String str) {
        try {
            return String.valueOf(C4282bc.m11791a(MessageDigest.getInstance("SHA1").digest(str.getBytes("UTF-8"))));
        } catch (UnsupportedEncodingException | Exception | NoSuchAlgorithmException e) {
            AbstractC4163b.m11302a("CloudCoder.hash4SHA1 ", e);
            throw new IllegalStateException("failed to SHA1");
        }
    }

    /* renamed from: a */
    public static String m11795a(String str, String str2, Map<String, String> map, String str3) {
        if (!TextUtils.isEmpty(str3)) {
            ArrayList<String> arrayList = new ArrayList();
            if (str != null) {
                arrayList.add(str.toUpperCase());
            }
            if (str2 != null) {
                arrayList.add(Uri.parse(str2).getEncodedPath());
            }
            boolean z = true;
            if (map != null && !map.isEmpty()) {
                for (Map.Entry entry : new TreeMap(map).entrySet()) {
                    arrayList.add(String.format("%s=%s", entry.getKey(), entry.getValue()));
                }
            }
            arrayList.add(str3);
            StringBuilder sb = new StringBuilder();
            for (String str4 : arrayList) {
                if (!z) {
                    sb.append(C8318oOo0oooo.OooO0OO);
                }
                sb.append(str4);
                z = false;
            }
            return m11794a(sb.toString());
        }
        throw new InvalidParameterException("security is not nullable");
    }
}
