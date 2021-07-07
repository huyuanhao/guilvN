package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;

@KeepForSdk
public class MapUtils {
    @KeepForSdk
    public static void writeStringMapToJson(StringBuilder sb, HashMap<String, String> hashMap) {
        sb.append("{");
        boolean z = true;
        for (String str : hashMap.keySet()) {
            if (!z) {
                sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            } else {
                z = false;
            }
            String str2 = hashMap.get(str);
            sb.append("\"");
            sb.append(str);
            sb.append("\":");
            if (str2 == null) {
                sb.append("null");
            } else {
                sb.append("\"");
                sb.append(str2);
                sb.append("\"");
            }
        }
        sb.append(C7522o0Ooo0o.OooO0Oo);
    }
}
