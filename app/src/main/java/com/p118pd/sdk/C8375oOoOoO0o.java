package com.p118pd.sdk;

import android.text.TextUtils;
import java.util.Map;

/* renamed from: com.pd.sdk.oOoOoO0o  reason: case insensitive filesystem */
public class C8375oOoOoO0o {
    public String OooO00o;
    public String OooO0O0;
    public String OooO0OO;

    public C8375oOoOoO0o(Map<String, String> map) {
        if (map != null) {
            for (String str : map.keySet()) {
                if (TextUtils.equals(str, o0OOOOO.OooO00o(new byte[]{17, 93, 22, 67, 13, 69, 48, 76, 4, 66, 20, 66}, "c8e6a1"))) {
                    this.OooO00o = map.get(str);
                } else if (TextUtils.equals(str, o0OOOOO.OooO00o(new byte[]{C8027oOO00oo.OooO0O0, 85, 67, 19, 93, 76}, "500f18"))) {
                    this.OooO0O0 = map.get(str);
                } else if (TextUtils.equals(str, o0OOOOO.OooO00o(new byte[]{85, 87, 84, 89}, "8296c7"))) {
                    this.OooO0OO = map.get(str);
                }
            }
        }
    }

    public String OooO00o() {
        return this.OooO0OO;
    }

    public String OooO0O0() {
        return this.OooO0O0;
    }

    public String OooO0OO() {
        return this.OooO00o;
    }

    public String toString() {
        return o0OOOOO.OooO00o(new byte[]{17, 82, 22, 76, 85, 21, 48, 67, 4, 77, 76, 18, 94, 76}, "c7e99a") + this.OooO00o + o0OOOOO.OooO00o(new byte[]{75, 3, 90, 1, 89, 13, 11, 67}, "687d4b") + this.OooO0OO + o0OOOOO.OooO00o(new byte[]{25, 93, 66, 7, 67, C8027oOO00oo.OooO0O0, 8, 18, 13, 25}, "df0b02") + this.OooO0O0 + o0OOOOO.OooO00o(new byte[]{25}, "ddb94c");
    }
}
