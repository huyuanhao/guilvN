package com.huawei.hms.support.api.push.p046b.p047a.p048a;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.support.api.client.ApiClient;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.log.C1202a;
import com.huawei.hms.support.p050b.C1201a;
import com.p118pd.sdk.AbstractC7726o0ooOOoo;
import com.umeng.message.common.C3777a;
import com.xiaomi.mipush.sdk.Constants;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.huawei.hms.support.api.push.b.a.a.a */
public abstract class AbstractC1189a {

    /* renamed from: a */
    public static final char[] f1298a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public static JSONArray m1270a(String str) {
        if (TextUtils.isEmpty(str)) {
            C1202a.m1316a("BaseUtil", "jsonString is null");
            return null;
        }
        try {
            return new JSONArray(str);
        } catch (JSONException unused) {
            C1202a.m1316a("BaseUtil", "cast jsonString to jsonArray error");
            return null;
        }
    }

    /* renamed from: b */
    public static byte[] m1273b(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        try {
            byte[] bytes = str.getBytes("UTF-8");
            for (int i = 0; i < length; i++) {
                StringBuilder sb = new StringBuilder();
                sb.append("0x");
                int i2 = i * 2;
                sb.append(new String(new byte[]{bytes[i2]}, "UTF-8"));
                bArr[i] = (byte) (((byte) (Byte.decode(sb.toString()).byteValue() << 4)) ^ Byte.decode("0x" + new String(new byte[]{bytes[i2 + 1]}, "UTF-8")).byteValue());
            }
        } catch (UnsupportedEncodingException e) {
            C1202a.m1316a("BaseUtil", "hexString2ByteArray error" + e.getMessage());
        }
        return bArr;
    }

    /* renamed from: a */
    public static String m1269a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bArr.length == 0) {
            return "";
        }
        char[] cArr = new char[(bArr.length * 2)];
        for (int i = 0; i < bArr.length; i++) {
            byte b = bArr[i];
            int i2 = i * 2;
            char[] cArr2 = f1298a;
            cArr[i2] = cArr2[(b & 240) >> 4];
            cArr[i2 + 1] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* renamed from: a */
    public static JSONArray m1271a(List<String> list, Context context) throws JSONException {
        JSONArray jSONArray = new JSONArray();
        C1191c cVar = new C1191c(context, "tags_info");
        for (String str : list) {
            if (cVar.mo15701c(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("tagKey", str);
                jSONObject.put("opType", 2);
                if (jSONObject.length() > 0) {
                    jSONArray.put(jSONObject);
                }
            } else {
                C1202a.m1316a("BaseUtil", str + " not exist, need not to remove");
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static void m1272a(ApiClient apiClient, String str) {
        if (!C1201a.m1307a().mo15709b() && apiClient != null) {
            HashMap hashMap = new HashMap();
            hashMap.put(C3777a.f10045u, apiClient.getPackageName());
            hashMap.put("sdk_ver", String.valueOf((int) HuaweiApiAvailability.HMS_SDK_VERSION_CODE));
            String str2 = null;
            SubAppInfo subAppInfo = apiClient.getSubAppInfo();
            if (subAppInfo != null) {
                str2 = subAppInfo.getSubAppID();
            }
            if (str2 == null) {
                str2 = apiClient.getAppID();
            }
            hashMap.put(Constants.APP_ID, str2);
            String[] split = str.split("\\.");
            if (split.length == 2) {
                hashMap.put("service", split[0]);
                hashMap.put(AbstractC7726o0ooOOoo.OooO, split[1]);
            }
            hashMap.put("result", String.valueOf(0));
            hashMap.put("cost_time", String.valueOf(0));
            C1201a.m1307a().mo15707a(apiClient.getContext(), "HMS_SDK_API_CALL", hashMap);
        }
    }
}
