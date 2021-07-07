package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.CoreProtocol;
import com.umeng.commonsdk.debug.UMLog;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.service.UMGlobalContext;
import com.umeng.commonsdk.statistics.common.HelperUtils;
import com.umeng.commonsdk.statistics.common.MLog;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.o */
public class C3456o {

    /* renamed from: a */
    public static final String f8768a = "fs_lc_tl_uapp";

    /* renamed from: f */
    public static final String f8769f = "-1";

    /* renamed from: g */
    public static Context f8770g;

    /* renamed from: b */
    public final int f8771b;

    /* renamed from: c */
    public final int f8772c;

    /* renamed from: d */
    public final int f8773d;

    /* renamed from: e */
    public final int f8774e;

    /* renamed from: h */
    public JSONObject f8775h;

    /* renamed from: com.umeng.analytics.pro.o$a */
    public static class C3458a {

        /* renamed from: a */
        public static final C3456o f8776a = new C3456o();
    }

    /* renamed from: a */
    public static C3456o m8865a(Context context) {
        if (f8770g == null && context != null) {
            f8770g = context.getApplicationContext();
        }
        return C3458a.f8776a;
    }

    /* renamed from: b */
    private void m8871b(Context context) {
        try {
            String string = PreferenceWrapper.getDefault(context).getString(f8768a, null);
            if (!TextUtils.isEmpty(string)) {
                this.f8775h = new JSONObject(string);
            }
            m8867a();
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    private void m8874c(Context context) {
        try {
            if (this.f8775h != null) {
                PreferenceWrapper.getDefault(f8770g).edit().putString(f8768a, this.f8775h.toString()).commit();
            }
        } catch (Throwable unused) {
        }
    }

    public C3456o() {
        this.f8771b = 128;
        this.f8772c = 256;
        this.f8773d = 1024;
        this.f8774e = 10;
        this.f8775h = null;
        if (0 == 0) {
            try {
                m8871b(f8770g);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: c */
    private boolean m8875c(String str) {
        if (str == null) {
            return true;
        }
        try {
            return str.trim().getBytes().length <= 1024;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public void mo38764a(String str, String str2, long j, int i, String str3) {
        String str4;
        try {
            if (!m8870a(str) || !m8872b(str2)) {
                UMLog.m9005aq(C3441h.f8681l, 0, "\\|");
            } else if (Arrays.asList(C3416b.f8447aD).contains(str)) {
                MLog.m9793e("key is " + str + ", please check key, illegal");
                UMLog.m9005aq(C3441h.f8682m, 0, "\\|");
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put("ts", currentTimeMillis);
                if (j > 0) {
                    jSONObject.put(C3416b.f8438V, j);
                }
                jSONObject.put("__t", C3437g.f8575a);
                if (str2 == null) {
                    str2 = "";
                }
                jSONObject.put(str, str2);
                if (UMGlobalContext.getInstance().isMainProcess(f8770g)) {
                    str4 = C3466u.m8916a().mo38796d(UMGlobalContext.getAppContext(f8770g));
                } else {
                    str4 = C3466u.m8916a().mo38789a(UMGlobalContext.getAppContext(f8770g), currentTimeMillis);
                }
                if (TextUtils.isEmpty(str4)) {
                    str4 = "-1";
                }
                jSONObject.put("__i", str4);
                if (!TextUtils.isEmpty(str3)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(str3);
                        if (jSONObject2.length() > 0) {
                            jSONObject.put(C3416b.f8466ar, jSONObject2);
                        }
                    } catch (JSONException unused) {
                    }
                }
                jSONObject.put(C3416b.f8451ac, 0);
                jSONObject.put(C3416b.f8452ad, UMGlobalContext.getInstance().getProcessName(f8770g));
                m8867a();
                if (this.f8775h != null && this.f8775h.has(str) && !((Boolean) this.f8775h.get(str)).booleanValue()) {
                    jSONObject.put(C3416b.f8440X, 1);
                    this.f8775h.put(str, true);
                    m8874c(f8770g);
                }
                UMWorkDispatch.sendEvent(f8770g, 4097, CoreProtocol.getInstance(f8770g), jSONObject);
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: b */
    private boolean m8872b(String str) {
        if (str == null) {
            return true;
        }
        try {
            if (str.trim().getBytes().length <= 256) {
                return true;
            }
        } catch (Exception unused) {
        }
        MLog.m9793e("value is " + str + ", please check value, illegal");
        return false;
    }

    /* renamed from: b */
    private boolean m8873b(Map<String, Object> map) {
        if (map != null) {
            try {
                if (!map.isEmpty()) {
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        if (!m8870a(entry.getKey())) {
                            UMLog.m9005aq(C3441h.f8677h, 0, "\\|");
                            return false;
                        } else if (entry.getValue() == null) {
                            UMLog.m9005aq(C3441h.f8678i, 0, "\\|");
                            return false;
                        } else if (entry.getValue() instanceof String) {
                            if (C3416b.f8445aB.equals(entry.getKey())) {
                                if (!m8875c(entry.getValue().toString())) {
                                    UMLog.m9005aq(C3441h.f8610P, 0, "\\|");
                                    return false;
                                }
                            } else if (!m8872b(entry.getValue().toString())) {
                                UMLog.m9005aq(C3441h.f8679j, 0, "\\|");
                                return false;
                            }
                        }
                    }
                    return true;
                }
            } catch (Exception unused) {
                return true;
            }
        }
        UMLog.m9005aq(C3441h.f8676g, 0, "\\|");
        return false;
    }

    /* renamed from: a */
    public void mo38765a(String str, Map<String, Object> map, long j, String str2) {
        String str3;
        try {
            if (!m8870a(str)) {
                UMLog.m9005aq(C3441h.f8675f, 0, "\\|");
            } else if (m8873b(map)) {
                if (map.size() > 100) {
                    MLog.m9793e("map size is " + map.size() + ", please check");
                } else if (Arrays.asList(C3416b.f8447aD).contains(str)) {
                    MLog.m9793e("key is " + str + ", please check key, illegal");
                    UMLog.m9005aq(C3441h.f8671b, 0, "\\|");
                } else {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("id", str);
                    jSONObject.put("ts", System.currentTimeMillis());
                    if (j > 0) {
                        jSONObject.put(C3416b.f8438V, j);
                    }
                    jSONObject.put("__t", C3437g.f8575a);
                    ULog.m9829i("befort ekv map, event is " + jSONObject.toString());
                    for (Map.Entry<String, Object> entry : map.entrySet()) {
                        if (!Arrays.asList(C3416b.f8447aD).contains(entry.getKey())) {
                            Object value = entry.getValue();
                            if ((value instanceof String) || (value instanceof Integer) || (value instanceof Long) || (value instanceof Short) || (value instanceof Float) || (value instanceof Double)) {
                                jSONObject.put(entry.getKey(), value);
                            } else if (!value.getClass().isArray()) {
                                MLog.m9793e("please check key or value, illegal type!");
                                return;
                            } else if (value instanceof int[]) {
                                int[] iArr = (int[]) value;
                                if (iArr.length > 10) {
                                    MLog.m9793e("please check key or value, size overlength!");
                                    return;
                                }
                                JSONArray jSONArray = new JSONArray();
                                for (int i : iArr) {
                                    jSONArray.put(i);
                                }
                                jSONObject.put(entry.getKey(), jSONArray);
                            } else if (value instanceof double[]) {
                                double[] dArr = (double[]) value;
                                if (dArr.length > 10) {
                                    MLog.m9793e("please check key or value, size overlength!");
                                    return;
                                }
                                JSONArray jSONArray2 = new JSONArray();
                                for (double d : dArr) {
                                    jSONArray2.put(d);
                                }
                                jSONObject.put(entry.getKey(), jSONArray2);
                            } else if (value instanceof long[]) {
                                long[] jArr = (long[]) value;
                                if (jArr.length > 10) {
                                    MLog.m9793e("please check key or value, size overlength!");
                                    return;
                                }
                                JSONArray jSONArray3 = new JSONArray();
                                for (long j2 : jArr) {
                                    jSONArray3.put(j2);
                                }
                                jSONObject.put(entry.getKey(), jSONArray3);
                            } else if (value instanceof float[]) {
                                float[] fArr = (float[]) value;
                                if (fArr.length > 10) {
                                    MLog.m9793e("please check key or value, size overlength!");
                                    return;
                                }
                                JSONArray jSONArray4 = new JSONArray();
                                for (float f : fArr) {
                                    jSONArray4.put((double) f);
                                }
                                jSONObject.put(entry.getKey(), jSONArray4);
                            } else if (value instanceof short[]) {
                                short[] sArr = (short[]) value;
                                if (sArr.length > 10) {
                                    MLog.m9793e("please check key or value, size overlength!");
                                    return;
                                }
                                JSONArray jSONArray5 = new JSONArray();
                                for (short s : sArr) {
                                    jSONArray5.put((int) s);
                                }
                                jSONObject.put(entry.getKey(), jSONArray5);
                            } else if (value instanceof String[]) {
                                String[] strArr = (String[]) value;
                                if (strArr.length > 10) {
                                    MLog.m9793e("please check key or value, size overlength!");
                                    return;
                                }
                                JSONArray jSONArray6 = new JSONArray();
                                for (int i2 = 0; i2 < strArr.length; i2++) {
                                    if (strArr[i2] == null) {
                                        MLog.m9793e("please check array, null item!");
                                        return;
                                    } else if (m8872b(strArr[i2])) {
                                        jSONArray6.put(strArr[i2]);
                                    } else {
                                        return;
                                    }
                                }
                                jSONObject.put(entry.getKey(), jSONArray6);
                            } else {
                                MLog.m9793e("please check key or value, illegal type!");
                                return;
                            }
                        } else {
                            UMLog.m9005aq(C3441h.f8674e, 0, "\\|");
                            return;
                        }
                    }
                    if (UMGlobalContext.getInstance().isMainProcess(f8770g)) {
                        str3 = C3466u.m8916a().mo38796d(UMGlobalContext.getAppContext(f8770g));
                    } else {
                        str3 = C3466u.m8916a().mo38789a(UMGlobalContext.getAppContext(f8770g), jSONObject.getLong("ts"));
                    }
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "-1";
                    }
                    jSONObject.put("__i", str3);
                    if (!TextUtils.isEmpty(str2)) {
                        try {
                            JSONObject jSONObject2 = new JSONObject(str2);
                            if (jSONObject2.length() > 0) {
                                jSONObject.put(C3416b.f8466ar, jSONObject2);
                            }
                        } catch (JSONException unused) {
                        }
                    }
                    jSONObject.put(C3416b.f8451ac, 0);
                    jSONObject.put(C3416b.f8452ad, UMGlobalContext.getInstance().getProcessName(f8770g));
                    m8867a();
                    if (this.f8775h != null && this.f8775h.has(str) && !((Boolean) this.f8775h.get(str)).booleanValue()) {
                        jSONObject.put(C3416b.f8440X, 1);
                        this.f8775h.put(str, true);
                        m8874c(f8770g);
                    }
                    ULog.m9829i("----->>>>>ekv event json is " + jSONObject.toString());
                    UMWorkDispatch.sendEvent(f8770g, 4097, CoreProtocol.getInstance(f8770g), jSONObject);
                }
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    public void mo38766a(String str, Map<String, Object> map, String str2) {
        try {
            if (m8870a(str)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("id", str);
                jSONObject.put("ts", System.currentTimeMillis());
                jSONObject.put(C3416b.f8438V, 0);
                jSONObject.put("__t", 2050);
                ULog.m9829i("befort gkv map, event is " + jSONObject.toString());
                Iterator<Map.Entry<String, Object>> it = map.entrySet().iterator();
                for (int i = 0; i < 10 && it.hasNext(); i++) {
                    Map.Entry<String, Object> next = it.next();
                    if (!C3416b.f8440X.equals(next.getKey()) && !C3416b.f8438V.equals(next.getKey()) && !"id".equals(next.getKey()) && !"ts".equals(next.getKey())) {
                        Object value = next.getValue();
                        if ((value instanceof String) || (value instanceof Integer) || (value instanceof Long)) {
                            jSONObject.put(next.getKey(), value);
                        }
                    }
                }
                String d = C3466u.m8916a().mo38796d(UMGlobalContext.getAppContext(f8770g));
                if (TextUtils.isEmpty(d)) {
                    d = "-1";
                }
                jSONObject.put("__i", d);
                if (!TextUtils.isEmpty(str2)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject(str2);
                        if (jSONObject2.length() > 0) {
                            jSONObject.put(C3416b.f8466ar, jSONObject2);
                        }
                    } catch (JSONException unused) {
                    }
                }
                jSONObject.put(C3416b.f8451ac, 0);
                jSONObject.put(C3416b.f8452ad, UMGlobalContext.getInstance().getProcessName(f8770g));
                ULog.m9829i("----->>>>>gkv event json is " + jSONObject.toString());
                UMWorkDispatch.sendEvent(f8770g, 4098, CoreProtocol.getInstance(f8770g), jSONObject);
            }
        } catch (Throwable unused2) {
        }
    }

    /* renamed from: a */
    private void m8867a() {
        try {
            String imprintProperty = UMEnvelopeBuild.imprintProperty(f8770g, "track_list", "");
            if (!TextUtils.isEmpty(imprintProperty)) {
                String[] split = imprintProperty.split("!");
                JSONObject jSONObject = new JSONObject();
                int i = 0;
                if (this.f8775h != null) {
                    for (String str : split) {
                        String subStr = HelperUtils.subStr(str, 128);
                        if (this.f8775h.has(subStr)) {
                            jSONObject.put(subStr, this.f8775h.get(subStr));
                        }
                    }
                }
                this.f8775h = new JSONObject();
                if (split.length >= 10) {
                    while (i < 10) {
                        m8868a(split[i], jSONObject);
                        i++;
                    }
                } else {
                    while (i < split.length) {
                        m8868a(split[i], jSONObject);
                        i++;
                    }
                }
                m8874c(f8770g);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private void m8868a(String str, JSONObject jSONObject) throws JSONException {
        String subStr = HelperUtils.subStr(str, 128);
        if (jSONObject.has(subStr)) {
            m8869a(subStr, ((Boolean) jSONObject.get(subStr)).booleanValue());
        } else {
            m8869a(subStr, false);
        }
    }

    /* renamed from: a */
    private void m8869a(String str, boolean z) {
        try {
            if (!C3416b.f8440X.equals(str) && !C3416b.f8438V.equals(str) && !"id".equals(str) && !"ts".equals(str) && !this.f8775h.has(str)) {
                this.f8775h.put(str, z);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo38767a(List<String> list) {
        if (list != null) {
            try {
                if (list.size() > 0) {
                    m8867a();
                    if (this.f8775h == null) {
                        this.f8775h = new JSONObject();
                        int size = list.size();
                        int i = 0;
                        while (true) {
                            if (i >= size) {
                                break;
                            }
                            if (this.f8775h != null) {
                                if (this.f8775h.length() >= 5) {
                                    break;
                                }
                            } else {
                                this.f8775h = new JSONObject();
                            }
                            String str = list.get(i);
                            if (!TextUtils.isEmpty(str)) {
                                m8869a(HelperUtils.subStr(str, 128), false);
                            }
                            i++;
                        }
                        m8874c(f8770g);
                        return;
                    } else if (this.f8775h.length() >= 5) {
                        MLog.m9787d("already setFistLaunchEvent, igone.");
                        return;
                    } else {
                        for (int i2 = 0; i2 < list.size(); i2++) {
                            if (this.f8775h.length() >= 5) {
                                MLog.m9787d(" add setFistLaunchEvent over.");
                                return;
                            } else {
                                m8869a(HelperUtils.subStr(list.get(i2), 128), false);
                            }
                        }
                        m8874c(f8770g);
                        return;
                    }
                }
            } catch (Exception unused) {
                return;
            }
        }
        UMLog.m9005aq(C3441h.f8655ak, 0, "\\|");
    }

    /* renamed from: a */
    private JSONObject m8866a(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                try {
                    String key = entry.getKey();
                    if (key != null) {
                        String subStr = HelperUtils.subStr(key, 128);
                        Object value = entry.getValue();
                        if (value != null) {
                            int i = 0;
                            if (value.getClass().isArray()) {
                                if (value instanceof int[]) {
                                    int[] iArr = (int[]) value;
                                    JSONArray jSONArray = new JSONArray();
                                    while (i < iArr.length) {
                                        jSONArray.put(iArr[i]);
                                        i++;
                                    }
                                    jSONObject.put(subStr, jSONArray);
                                } else if (value instanceof double[]) {
                                    double[] dArr = (double[]) value;
                                    JSONArray jSONArray2 = new JSONArray();
                                    while (i < dArr.length) {
                                        jSONArray2.put(dArr[i]);
                                        i++;
                                    }
                                    jSONObject.put(subStr, jSONArray2);
                                } else if (value instanceof long[]) {
                                    long[] jArr = (long[]) value;
                                    JSONArray jSONArray3 = new JSONArray();
                                    while (i < jArr.length) {
                                        jSONArray3.put(jArr[i]);
                                        i++;
                                    }
                                    jSONObject.put(subStr, jSONArray3);
                                } else if (value instanceof float[]) {
                                    float[] fArr = (float[]) value;
                                    JSONArray jSONArray4 = new JSONArray();
                                    while (i < fArr.length) {
                                        jSONArray4.put((double) fArr[i]);
                                        i++;
                                    }
                                    jSONObject.put(subStr, jSONArray4);
                                } else if (value instanceof short[]) {
                                    short[] sArr = (short[]) value;
                                    JSONArray jSONArray5 = new JSONArray();
                                    while (i < sArr.length) {
                                        jSONArray5.put((int) sArr[i]);
                                        i++;
                                    }
                                    jSONObject.put(subStr, jSONArray5);
                                }
                            } else if (value instanceof List) {
                                List list = (List) value;
                                JSONArray jSONArray6 = new JSONArray();
                                while (i < list.size()) {
                                    Object obj = list.get(i);
                                    if ((obj instanceof String) || (obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof Short)) {
                                        jSONArray6.put(list.get(i));
                                    }
                                    i++;
                                }
                                if (jSONArray6.length() > 0) {
                                    jSONObject.put(subStr, jSONArray6);
                                }
                            } else if (value instanceof String) {
                                jSONObject.put(subStr, HelperUtils.subStr(value.toString(), 256));
                            } else {
                                if (!(value instanceof Long) && !(value instanceof Integer) && !(value instanceof Float) && !(value instanceof Double)) {
                                    if (!(value instanceof Short)) {
                                        MLog.m9793e("The param has not support type. please check !");
                                    }
                                }
                                jSONObject.put(subStr, value);
                            }
                        }
                    }
                } catch (Exception e) {
                    MLog.m9797e(e);
                }
            }
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    private boolean m8870a(String str) {
        if (str != null) {
            try {
                int length = str.trim().getBytes().length;
                if (length > 0 && length <= 128) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        MLog.m9793e("key is " + str + ", please check key, illegal");
        return false;
    }
}
