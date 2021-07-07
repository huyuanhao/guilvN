package com.p118pd.sdk;

import android.content.Context;
import com.learnium.RNDeviceInfo.JHDeviceManager;
import com.rxhui.android_log_sdk.LogApplicationType;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.ooOO0o0O  reason: case insensitive filesystem */
public class C8914ooOO0o0O {
    public static final String OooOO0 = "LOG_ID_KEY";
    public static final String OooOO0O = "LOG_START_UP_TIMES";
    public static final String OooOO0o = "LOG_SESSION_TIMES";
    public String OooO = "";
    public int OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f22141OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f22142OooO00o = "";

    /* renamed from: OooO00o  reason: collision with other field name */
    public Map<String, String> f22143OooO00o;
    public int OooO0O0 = 0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public long f22144OooO0O0 = 0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public String f22145OooO0O0 = "";

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Map<String, String> f22146OooO0O0;
    public String OooO0OO = "";
    public String OooO0Oo = "";
    public String OooO0o = "";
    public String OooO0o0 = "";
    public String OooO0oO = "";
    public String OooO0oo = "";

    public void OooO(String str) {
        this.OooO0Oo = str;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public String m20557OooO00o() {
        return this.f22145OooO0O0;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public long m20560OooO0O0() {
        long j = this.f22141OooO00o;
        return j == 0 ? System.currentTimeMillis() : j;
    }

    public String OooO0OO() {
        return this.OooO0OO;
    }

    public void OooO0Oo(String str) {
        this.OooO0o = str;
    }

    public String OooO0o() {
        return this.f22142OooO00o;
    }

    public void OooO0o0(String str) {
        this.f22142OooO00o = str;
    }

    public String OooO0oO() {
        if (C8741oo0oOo0.OooO0OO(this.OooO0oO)) {
            return "";
        }
        String str = this.OooO0oO;
        return C8938ooOOOO00.OooO00o(str, 3, str.length() - 4, 0);
    }

    public void OooO0oo(String str) {
        this.OooO0o0 = str;
    }

    public String OooOO0() {
        return this.OooO0Oo;
    }

    public String OooO() {
        return this.OooO0o0;
    }

    public void OooO00o(String str) {
        this.f22145OooO0O0 = str;
    }

    public int OooO0O0() {
        return this.OooO00o;
    }

    public void OooO0OO(String str) {
        this.OooO0OO = str;
    }

    public synchronized String OooO0Oo() {
        String bigDecimal;
        bigDecimal = C8735oo0oOOO0.OooO00o(C8908ooOO0OoO.OooO00o().OooO00o(OooOO0), "1").toString();
        if (C8741oo0oOo0.m20357OooO00o(bigDecimal) >= Integer.MAX_VALUE) {
            bigDecimal = "1";
        }
        C8908ooOO0OoO.OooO00o().OooO00o(OooOO0, bigDecimal);
        return bigDecimal;
    }

    public void OooO0o(String str) {
        this.OooO0oO = str;
    }

    public String OooO0o0() {
        return this.OooO0o;
    }

    public void OooO0oO(String str) {
        this.OooO0oo = str;
    }

    public String OooO0oo() {
        return this.OooO0oo;
    }

    public int OooO00o() {
        return this.OooO0O0;
    }

    public long OooO0O0(long j) {
        return j - this.f22141OooO00o;
    }

    public long OooO00o(long j) {
        return j - this.f22144OooO0O0;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public synchronized void m20563OooO0O0(long j) {
        String bigDecimal = C8735oo0oOOO0.OooO00o(C8908ooOO0OoO.OooO00o().OooO00o(OooOO0O), "1").toString();
        if (C8741oo0oOo0.m20357OooO00o(bigDecimal) >= Integer.MAX_VALUE) {
            bigDecimal = "1";
        }
        C8908ooOO0OoO.OooO00o().OooO00o(OooOO0O, bigDecimal);
        this.f22141OooO00o = j;
        this.OooO00o = C8741oo0oOo0.m20357OooO00o(bigDecimal);
        m20559OooO00o(j);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public long m20556OooO00o() {
        return this.f22144OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized void m20559OooO00o(long j) {
        String bigDecimal = C8735oo0oOOO0.OooO00o(C8908ooOO0OoO.OooO00o().OooO00o(OooOO0o), "1").toString();
        if (C8741oo0oOo0.m20357OooO00o(bigDecimal) >= Integer.MAX_VALUE) {
            bigDecimal = "1";
        }
        C8908ooOO0OoO.OooO00o().OooO00o(OooOO0o, bigDecimal);
        if (j == 0) {
            j = System.currentTimeMillis();
        }
        this.f22144OooO0O0 = j;
        this.OooO0O0 = C8741oo0oOo0.m20357OooO00o(bigDecimal);
        if (C8908ooOO0OoO.OooO00o().m20546OooO00o() != null) {
            C8908ooOO0OoO.OooO00o().m20546OooO00o().sendSession(this.OooO0O0, this.f22144OooO0O0);
        }
        LogCollectorManager.sharedInstance().recordInfo(LogCategory.APPLICATION, LogApplicationType.SESSION_START.getValue());
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public Map<String, String> m20562OooO0O0() {
        Map<String, String> map = this.f22143OooO00o;
        if (map == null || map.isEmpty()) {
            return new HashMap();
        }
        return this.f22143OooO00o;
    }

    public void OooO0O0(Map<String, String> map) {
        this.f22143OooO00o = map;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public Map<String, String> m20558OooO00o() {
        Map<String, String> map = this.f22146OooO0O0;
        if (map == null || map.isEmpty()) {
            return new HashMap();
        }
        return this.f22146OooO0O0;
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public String m20561OooO0O0() {
        return this.OooO;
    }

    public void OooO0O0(String str) {
        this.OooO = str;
    }

    public void OooO00o(Map<String, String> map) {
        this.f22146OooO0O0 = map;
    }

    public String OooO00o(Context context) {
        JSONObject jSONObject = new JSONObject();
        OooO00o(jSONObject, "device_id", JHDeviceManager.getDeviceId(context), "device_model", JHDeviceManager.getModel(), C8912ooOO0o0.OooO0oo, JHDeviceManager.getDeviceVendor(), C8912ooOO0o0.OooO, Double.valueOf(C8741oo0oOo0.OooO00o(JHDeviceManager.getDeviceTotalMemory(context))), C8912ooOO0o0.OooOO0O, Double.valueOf(C8741oo0oOo0.OooO00o(JHDeviceManager.getAppMaxAvailableMemory())), "os", JHDeviceManager.getSystemName(), "os_version", JHDeviceManager.getSystemVersion(), C8912ooOO0o0.OooOOOO, Integer.valueOf(JHDeviceManager.isRoot() ? 1 : 0), C8912ooOO0o0.OooOOOo, Integer.valueOf(1 ^ (JHDeviceManager.isEmulator() ? 1 : 0)), C8912ooOO0o0.OooOOo0, "", C8912ooOO0o0.OooOOo, "", "package_name", JHDeviceManager.getPackageName(context), C8912ooOO0o0.OooOoO0, JHDeviceManager.getAppName(context), "app_version", JHDeviceManager.getAppVersion(context), C8912ooOO0o0.OooOoOO, JHDeviceManager.getAppVersion(context), C8912ooOO0o0.OooOoo0, OooO0o(), "channel", m20557OooO00o(), C8912ooOO0o0.Oooo0oo, Integer.valueOf(OooO0O0()), C8912ooOO0o0.OooOooO, "", C8912ooOO0o0.OooOooo, "", C8912ooOO0o0.Oooo000, "", C8912ooOO0o0.Oooo00O, "android", C8912ooOO0o0.OoooOOO, "android");
        return jSONObject.toString();
    }

    private void OooO00o(JSONObject jSONObject, Object... objArr) {
        try {
            if (objArr.length > 0 && objArr.length % 2 == 0) {
                for (int i = 0; i < objArr.length; i += 2) {
                    jSONObject.put((String) objArr[i], objArr[i + 1]);
                }
            }
        } catch (Exception unused) {
        }
    }
}
