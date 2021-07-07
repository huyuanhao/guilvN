package com.huawei.updatesdk.sdk.p062a.p069d.p070a;

import com.huawei.updatesdk.sdk.p062a.p066c.p067a.p068a.C1278a;
import com.huawei.updatesdk.sdk.p062a.p069d.AbstractC1293e;
import com.p118pd.sdk.LL1i;
import java.security.MessageDigest;
import java.util.Locale;

/* renamed from: com.huawei.updatesdk.sdk.a.d.a.a */
public abstract class AbstractC1280a {

    /* renamed from: a */
    public static String f1429a = "AESUtil";

    /* renamed from: a */
    public static String m1587a(String str) {
        if (AbstractC1293e.m1646a(str)) {
            return null;
        }
        try {
            MessageDigest instance = MessageDigest.getInstance(LL1i.OooO0Oo);
            instance.update(str.getBytes("UTF-8"));
            StringBuffer stringBuffer = new StringBuffer();
            byte[] digest = instance.digest();
            int length = digest.length;
            for (int i = 0; i < length; i++) {
                stringBuffer.append(String.format("%02X", Byte.valueOf(digest[i])));
            }
            return stringBuffer.toString();
        } catch (Exception unused) {
            C1278a.m1584d(f1429a, "sha256EncryptStr error:Exception");
            return null;
        }
    }

    /* renamed from: b */
    public static String m1588b(String str) {
        String a = m1587a(str);
        if (a == null) {
            return null;
        }
        return a.toLowerCase(Locale.getDefault());
    }
}
