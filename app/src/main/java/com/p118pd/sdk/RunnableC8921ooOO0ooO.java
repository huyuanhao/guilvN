package com.p118pd.sdk;

import android.content.Context;
import com.learnium.RNDeviceInfo.JHDeviceManager;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;
import org.json.JSONTokener;

/* renamed from: com.pd.sdk.ooOO0ooO  reason: case insensitive filesystem */
public class RunnableC8921ooOO0ooO implements Runnable {
    public long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f22160OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<String, String> f22161OooO00o;
    public String o0ooOOo;

    public RunnableC8921ooOO0ooO(Context context, String str) {
        this(context, str, null);
    }

    public String OooO00o(Map<String, String> map) {
        Set<String> keySet = map.keySet();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("{");
        Iterator<String> it = keySet.iterator();
        while (it.hasNext()) {
            String next = it.next();
            stringBuffer.append(next + Constants.COLON_SEPARATOR + "\"" + map.get(next) + "\"");
            if (it.hasNext()) {
                stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            }
        }
        stringBuffer.append(C7522o0Ooo0o.OooO0Oo);
        return stringBuffer.toString();
    }

    public void run() {
        C8914ooOO0o0O logParamsManager = LogCollectorManager.sharedInstance().getLogParamsManager();
        HashMap hashMap = new HashMap();
        hashMap.put("eventId", this.o0ooOOo);
        hashMap.put("uid", logParamsManager.OooOO0());
        hashMap.put("deviceId", JHDeviceManager.getDeviceId(this.f22160OooO00o));
        hashMap.put("mac", JHDeviceManager.getMacAddress());
        hashMap.put("deviceName", JHDeviceManager.getModel());
        hashMap.put(C8912ooOO0o0.Oooo00O, JHDeviceManager.getSystemName());
        hashMap.put("os", JHDeviceManager.getSystemVersion());
        hashMap.put("ut", logParamsManager.OooO0o());
        long j = this.OooO00o;
        if (j > 0) {
            hashMap.put("elapsed", String.valueOf(j));
        }
        Map<String, String> map = this.f22161OooO00o;
        if (map != null && map.size() > 0) {
            hashMap.put("ext", OooO00o(this.f22161OooO00o));
        }
        C8924ooOOO00 OooO0O0 = C8932ooOOO0o.m20594OooO0O0(C8919ooOO0oo.OooO00o().OooO0OO(), C8938ooOOOO00.OooO00o(C8919ooOO0oo.OooO00o().m20570OooO00o(), C8919ooOO0oo.OooO00o().OooO0O0(), String.valueOf(System.currentTimeMillis()), hashMap));
        if (OooO0O0 == null && C8908ooOO0OoO.OooO00o().m20550OooO00o()) {
            String str = C8919ooOO0oo.OooO0Oo;
        }
        if (OooO0O0.OooO00o() == 200) {
            if (C8908ooOO0OoO.OooO00o().m20550OooO00o()) {
                String str2 = LogCollectorManager.TAG;
                OooO0O0.m20575OooO00o();
            }
            try {
                JSONObject jSONObject = (JSONObject) new JSONTokener(OooO0O0.m20575OooO00o()).nextValue();
                if (C8908ooOO0OoO.OooO00o().m20550OooO00o()) {
                    String str3 = C8919ooOO0oo.OooO0Oo;
                    jSONObject.getString("message");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public RunnableC8921ooOO0ooO(Context context, String str, Map<String, String> map) {
        this(context, str, 0, map);
    }

    public RunnableC8921ooOO0ooO(Context context, String str, long j, Map<String, String> map) {
        this.f22160OooO00o = context;
        this.OooO00o = j;
        this.o0ooOOo = str;
        this.f22161OooO00o = map;
    }
}
