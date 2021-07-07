package com.p118pd.sdk;

import android.text.TextUtils;
import com.umeng.message.proguard.C3848l;

@Deprecated
/* renamed from: com.pd.sdk.o000o0oo  reason: case insensitive filesystem */
public final class C7025o000o0oo {
    @Deprecated
    public static String OooO00o(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        return C3848l.f10401s + str + ") AND (" + str2 + C3848l.f10402t;
    }

    @Deprecated
    public static String[] OooO00o(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr.length == 0) {
            return strArr2;
        }
        String[] strArr3 = new String[(strArr.length + strArr2.length)];
        System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
        System.arraycopy(strArr2, 0, strArr3, strArr.length, strArr2.length);
        return strArr3;
    }
}
