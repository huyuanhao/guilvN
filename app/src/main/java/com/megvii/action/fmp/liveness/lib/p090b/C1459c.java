package com.megvii.action.fmp.liveness.lib.p090b;

import com.megvii.action.fmp.liveness.lib.jni.MegDelta;
import org.json.JSONObject;

/* renamed from: com.megvii.action.fmp.liveness.lib.b.c */
public final class C1459c {
    /* renamed from: a */
    public static String m2160a(JSONObject jSONObject) {
        try {
            return MegDelta.encodeJsonStr(jSONObject.toString());
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }
}
