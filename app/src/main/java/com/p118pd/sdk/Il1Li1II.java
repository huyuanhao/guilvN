package com.p118pd.sdk;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.Il1Li1II */
public class Il1Li1II {
    public static Map OooO00o;

    static {
        HashMap hashMap = new HashMap();
        OooO00o = hashMap;
        hashMap.put(AbstractC5711LiLli.OoooOoo.m16387OooO0O0(), I11I.OooO00o(192));
        OooO00o.put(AbstractC5905LllI.OooOo0, I11I.OooO00o(128));
        OooO00o.put(AbstractC5905LllI.OooOoo, I11I.OooO00o(192));
        OooO00o.put(AbstractC5905LllI.Oooo0OO, I11I.OooO00o(256));
        OooO00o.put(lILIiLL.OooO00o, I11I.OooO00o(128));
        OooO00o.put(lILIiLL.OooO0O0, I11I.OooO00o(192));
        OooO00o.put(lILIiLL.OooO0OO, I11I.OooO00o(256));
    }

    public static int OooO00o(LlLI1 llLI1) {
        Integer num = (Integer) OooO00o.get(llLI1);
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }
}
