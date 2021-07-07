package com.xiaomi.push;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import androidx.exifinterface.media.ExifInterface;
import com.umeng.commonsdk.proguard.C3617o;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.xiaomi.push.en */
public class C4399en {
    /* renamed from: a */
    public static Uri m12440a(String str, String str2) {
        return Uri.parse("content://" + str).buildUpon().appendPath(str2).build();
    }

    /* renamed from: a */
    public static String m12441a(String str) {
        return Base64.encodeToString(C4285bf.m11808a(str), 2);
    }

    /* renamed from: a */
    public static String m12442a(HashMap<String, String> hashMap) {
        if (hashMap == null) {
            return "";
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (String str : hashMap.keySet()) {
                jSONObject.put(str, hashMap.get(str));
            }
        } catch (JSONException e) {
            AbstractC4163b.m11303a(e);
        }
        return jSONObject.toString();
    }

    /* renamed from: b */
    public static String m12443b(String str) {
        return C4285bf.m11804a(Base64.decode(str, 2));
    }

    /* renamed from: b */
    public static String m12444b(HashMap<String, String> hashMap) {
        HashMap hashMap2 = new HashMap();
        if (hashMap != null) {
            hashMap2.put("event_type", hashMap.get("event_type") + "");
            hashMap2.put("description", hashMap.get("description") + "");
            String str = hashMap.get("awake_info");
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    hashMap2.put("__planId__", String.valueOf(jSONObject.opt("__planId__")));
                    hashMap2.put("flow_id", String.valueOf(jSONObject.opt("flow_id")));
                    hashMap2.put("jobkey", String.valueOf(jSONObject.opt("jobkey")));
                    hashMap2.put("msg_id", String.valueOf(jSONObject.opt("msg_id")));
                    hashMap2.put(ExifInterface.o000oo0O, String.valueOf(jSONObject.opt("awake_app")));
                    hashMap2.put("B", String.valueOf(jSONObject.opt("awakened_app")));
                    hashMap2.put(C3617o.f9375d, String.valueOf(jSONObject.opt("awake_type")));
                } catch (JSONException e) {
                    AbstractC4163b.m11303a(e);
                }
            }
        }
        return m12442a(hashMap2);
    }
}
