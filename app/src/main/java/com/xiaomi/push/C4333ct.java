package com.xiaomi.push;

import android.util.Base64;
import com.p118pd.sdk.C8932ooOOO0o;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Collections;
import java.util.List;
import org.apache.http.NameValuePair;

/* renamed from: com.xiaomi.push.ct */
public class C4333ct {
    /* renamed from: a */
    public static String m11976a(String str) {
        if (str == null) {
            return "";
        }
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(m11979a(str));
            return String.format("%1$032X", new BigInteger(1, instance.digest()));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static String m11977a(List<NameValuePair> list, String str) {
        Collections.sort(list, new C4334cu());
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (NameValuePair nameValuePair : list) {
            if (!z) {
                sb.append("&");
            }
            sb.append(nameValuePair.getName());
            sb.append(C8932ooOOO0o.OooO0Oo);
            sb.append(nameValuePair.getValue());
            z = false;
        }
        sb.append("&");
        sb.append(str);
        return m11976a(new String(Base64.encode(m11979a(sb.toString()), 2)));
    }

    /* renamed from: a */
    public static void m11978a(String str) {
    }

    /* renamed from: a */
    public static byte[] m11979a(String str) {
        try {
            return str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }
}
