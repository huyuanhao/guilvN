package com.huawei.updatesdk.sdk.service.p076c.p077a;

import com.huawei.updatesdk.sdk.p062a.p069d.AbstractC1292d;
import com.huawei.updatesdk.sdk.p062a.p069d.AbstractC1293e;
import com.p118pd.sdk.C8932ooOOO0o;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.huawei.updatesdk.sdk.service.c.a.c */
public class C1301c {
    public static final String CLIENT_API = "tlsApis";
    public static final String END_FLAG = "_";
    public String method_;
    public String ver_ = "1.1";

    /* renamed from: a */
    private String m1668a(Field field) throws IllegalAccessException, IllegalArgumentException {
        Object obj = field.get(this);
        if (obj != null && (obj instanceof AbstractC1299b)) {
            return ((AbstractC1299b) obj).toJson();
        }
        if (obj != null) {
            return String.valueOf(obj);
        }
        return null;
    }

    /* renamed from: d */
    public String mo15838d() throws IllegalAccessException, IllegalArgumentException, ArrayIndexOutOfBoundsException {
        mo15840e();
        Map<String, Field> i = mo15922i();
        int size = i.size();
        String[] strArr = new String[size];
        i.keySet().toArray(strArr);
        Arrays.sort(strArr);
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        do {
            String a = m1668a(i.get(strArr[i2]));
            if (a != null) {
                String b = AbstractC1293e.m1647b(a);
                sb.append(strArr[i2]);
                sb.append(C8932ooOOO0o.OooO0Oo);
                sb.append(b);
                sb.append("&");
            }
            i2++;
        } while (i2 < size);
        int length = sb.length();
        if (length > 0) {
            int i3 = length - 1;
            if (sb.charAt(i3) == '&') {
                sb.deleteCharAt(i3);
            }
        }
        return sb.toString();
    }

    /* renamed from: e */
    public void mo15840e() {
    }

    /* renamed from: g */
    public String mo15920g() {
        return this.method_;
    }

    /* renamed from: h */
    public String mo15921h() {
        return "https://store.hispace.hicloud.com/hwmarket/api/tlsApis";
    }

    /* renamed from: i */
    public Map<String, Field> mo15922i() {
        HashMap hashMap = new HashMap();
        Field[] a = AbstractC1292d.m1645a(getClass());
        for (Field field : a) {
            field.setAccessible(true);
            String name = field.getName();
            if (name.endsWith("_")) {
                hashMap.put(name.substring(0, name.length() - 1), field);
            }
        }
        return hashMap;
    }

    /* renamed from: u */
    public void mo15923u(String str) {
        this.method_ = str;
    }

    /* renamed from: v */
    public void mo15924v(String str) {
        this.ver_ = str;
    }
}
