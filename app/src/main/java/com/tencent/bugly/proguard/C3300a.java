package com.tencent.bugly.proguard;

import com.p118pd.sdk.C8412oOoo0OoO;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.tencent.bugly.proguard.a */
public class C3300a {
    /* renamed from: a */
    public static String m8224a(ArrayList<String> arrayList) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList.set(i, m8223a(arrayList.get(i)));
        }
        Collections.reverse(arrayList);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            String str = arrayList.get(i2);
            if (str.equals(C8412oOoo0OoO.OooO0OO)) {
                int i3 = i2 - 1;
                arrayList.set(i3, "<" + arrayList.get(i3));
                arrayList.set(0, arrayList.get(0) + ">");
            } else if (str.equals("map")) {
                int i4 = i2 - 1;
                arrayList.set(i4, "<" + arrayList.get(i4) + Constants.ACCEPT_TIME_SEPARATOR_SP);
                StringBuilder sb = new StringBuilder();
                sb.append(arrayList.get(0));
                sb.append(">");
                arrayList.set(0, sb.toString());
            } else if (str.equals("Array")) {
                int i5 = i2 - 1;
                arrayList.set(i5, "<" + arrayList.get(i5));
                arrayList.set(0, arrayList.get(0) + ">");
            }
        }
        Collections.reverse(arrayList);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            stringBuffer.append(it.next());
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static String m8223a(String str) {
        if (str.equals("java.lang.Integer") || str.equals("int")) {
            return "int32";
        }
        if (str.equals("java.lang.Boolean") || str.equals("boolean")) {
            return "bool";
        }
        if (str.equals("java.lang.Byte") || str.equals("byte")) {
            return "char";
        }
        String str2 = "double";
        if (!str.equals("java.lang.Double") && !str.equals(str2)) {
            str2 = "float";
            if (!str.equals("java.lang.Float") && !str.equals(str2)) {
                if (str.equals("java.lang.Long") || str.equals("long")) {
                    return "int64";
                }
                if (str.equals("java.lang.Short") || str.equals("short")) {
                    return "short";
                }
                if (str.equals("java.lang.Character")) {
                    throw new IllegalArgumentException("can not support java.lang.Character");
                } else if (str.equals("java.lang.String")) {
                    return "string";
                } else {
                    if (str.equals("java.util.List")) {
                        return C8412oOoo0OoO.OooO0OO;
                    }
                    return str.equals("java.util.Map") ? "map" : str;
                }
            }
        }
        return str2;
    }
}
