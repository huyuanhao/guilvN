package com.p118pd.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.rxhui.android_log_sdk.LogLevel;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.ooOO0Ooo  reason: case insensitive filesystem */
public class C8910ooOO0Ooo {
    public static final String OooO0O0 = "LOG_COLLECTOR_STORE";
    public Context OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final SharedPreferences f22136OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public String f22137OooO00o = "[]";

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<String> f22138OooO00o = new ArrayList();

    public C8910ooOO0Ooo(Context context) {
        if (context != null) {
            this.OooO00o = context;
            this.f22136OooO00o = context.getSharedPreferences(OooO0O0, 0);
            return;
        }
        throw new IllegalArgumentException("must provide valid context");
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public SharedPreferences m20553OooO00o() {
        return this.f22136OooO00o;
    }

    public void OooO0O0() {
        this.f22137OooO00o = "[]";
    }

    public boolean OooO00o(LogCategory logCategory, String str, long j, long j2, Map<String, String> map, LogLevel logLevel, Map<String, String> map2, Map<String, C8906ooOO0Oo> map3) {
        String OooO00o2 = new C8917ooOO0oOO(logCategory, str, j, j2, map, logLevel, map2, map3).OooO00o(this.OooO00o);
        if (C8908ooOO0OoO.OooO00o().m20550OooO00o()) {
            String str2 = LogCollectorManager.TAG;
            String str3 = OooO00o2 + "";
        }
        if (!C8741oo0oOo0.OooO0Oo(OooO00o2)) {
            return false;
        }
        OooO00o(OooO00o2);
        return true;
    }

    private synchronized void OooO00o(String str) {
        try {
            this.f22138OooO00o.add(str);
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            if (C8908ooOO0OoO.OooO00o().m20550OooO00o()) {
                String str2 = LogCollectorManager.TAG;
                e.getLocalizedMessage();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
            String str3 = LogCollectorManager.TAG;
            e2.getLocalizedMessage();
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public synchronized String m20554OooO00o() {
        try {
            JSONArray jSONArray = new JSONArray(this.f22137OooO00o);
            if (this.f22138OooO00o != null && this.f22138OooO00o.size() > 0) {
                for (String str : OooO00o(this.f22138OooO00o)) {
                    try {
                        jSONArray.put(new JSONObject(str));
                    } catch (JSONException e) {
                        e.printStackTrace();
                        if (C8908ooOO0OoO.OooO00o().m20550OooO00o()) {
                            String str2 = LogCollectorManager.TAG;
                            String str3 = "get log jsonObject failure;JSONException:" + e.getLocalizedMessage();
                        }
                    } catch (Exception e2) {
                        if (C8908ooOO0OoO.OooO00o().m20550OooO00o()) {
                            String str4 = LogCollectorManager.TAG;
                            String str5 = "get log jsonObject failure;Exception:" + e2.getLocalizedMessage();
                        }
                    }
                }
                if (C8908ooOO0OoO.OooO00o().m20550OooO00o()) {
                    String str6 = LogCollectorManager.TAG;
                    String str7 = "jsonArray size==" + jSONArray.length();
                }
                String jSONArray2 = jSONArray.toString();
                this.f22137OooO00o = jSONArray2;
                return jSONArray2;
            }
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        return this.f22137OooO00o;
    }

    public int OooO00o() {
        return this.f22138OooO00o.size();
    }

    public boolean OooO00o(LogLevel logLevel) {
        return logLevel.getLevel() == LogLevel.error.getLevel();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m20555OooO00o() {
        this.f22138OooO00o.clear();
    }

    public static <T> List<T> OooO00o(List<T> list) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new ObjectOutputStream(byteArrayOutputStream).writeObject(list);
            return (List) new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())).readObject();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return list;
        } catch (IOException e2) {
            e2.printStackTrace();
            return list;
        } catch (Exception e3) {
            e3.printStackTrace();
            return list;
        }
    }
}
