package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.analytics.pro.C3437g;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.debug.UMLog;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.umeng.analytics.pro.r */
public class C3463r {

    /* renamed from: b */
    public static final int f8787b = 5;

    /* renamed from: c */
    public static JSONArray f8788c = new JSONArray();

    /* renamed from: d */
    public static Object f8789d = new Object();

    /* renamed from: a */
    public Stack<String> f8790a = new Stack<>();

    /* renamed from: e */
    public final Map<String, Long> f8791e = new HashMap();

    /* renamed from: a */
    public static void m8900a(Context context) {
        String jSONArray;
        if (context != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                synchronized (f8789d) {
                    jSONArray = f8788c.toString();
                    f8788c = new JSONArray();
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put("__a", new JSONArray(jSONArray));
                    if (jSONObject.length() > 0) {
                        C3437g.m8754a(context).mo38707a(C3460q.m8882a().mo38777c(), jSONObject, C3437g.EnumC3439a.PAGE);
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public int mo38722a() {
        return 2;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:26:0x0085 */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo38782b(java.lang.String r11) {
        /*
        // Method dump skipped, instructions count: 210
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.pro.C3463r.mo38782b(java.lang.String):void");
    }

    /* renamed from: a */
    public void mo38780a(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (UMConfigure.isDebugLog() && this.f8790a.size() != 0) {
                UMLog.m9007aq(C3441h.f8600F, 0, "\\|", new String[]{"@"}, new String[]{this.f8790a.peek()}, null, null);
            }
            synchronized (this.f8791e) {
                this.f8791e.put(str, Long.valueOf(System.currentTimeMillis()));
                if (UMConfigure.isDebugLog()) {
                    this.f8790a.push(str);
                }
            }
        }
    }

    /* renamed from: b */
    public void mo38781b() {
        String str;
        synchronized (this.f8791e) {
            str = null;
            long j = 0;
            for (Map.Entry<String, Long> entry : this.f8791e.entrySet()) {
                if (entry.getValue().longValue() > j) {
                    long longValue = entry.getValue().longValue();
                    str = entry.getKey();
                    j = longValue;
                }
            }
        }
        if (str != null) {
            mo38782b(str);
        }
    }
}
