package com.umeng.commonsdk.proguard;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.text.TextUtils;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.umeng.commonsdk.internal.C3523a;
import com.umeng.commonsdk.statistics.common.ULog;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.proguard.b */
public class C3588b {

    /* renamed from: a */
    public static final String f9271a = "lng";

    /* renamed from: b */
    public static final String f9272b = "lat";

    /* renamed from: c */
    public static final String f9273c = "ts";

    /* renamed from: d */
    public static final long f9274d = 30000;

    /* renamed from: e */
    public static final int f9275e = 200;

    /* renamed from: f */
    public static final String f9276f = "UMSysLocationCache";

    /* renamed from: a */
    public static void m9439a(final Context context) {
        ULog.m9832i(f9276f, "begin location");
        if (context != null) {
            try {
                new Thread(new Runnable() {
                    /* class com.umeng.commonsdk.proguard.C3588b.RunnableC35891 */

                    public void run() {
                        try {
                            JSONArray b = C3588b.m9440b(context);
                            if (b == null || b.length() < 200) {
                                ULog.m9832i(C3588b.f9276f, "location status is ok, time is " + System.currentTimeMillis());
                                final C3552a aVar = new C3552a(context);
                                aVar.mo38865a(new AbstractC3600c() {
                                    /* class com.umeng.commonsdk.proguard.C3588b.RunnableC35891.C35901 */

                                    @Override // com.umeng.commonsdk.proguard.AbstractC3600c
                                    /* renamed from: a */
                                    public void mo38964a(Location location) {
                                        int i;
                                        Throwable th;
                                        if (location != null) {
                                            try {
                                                double longitude = location.getLongitude();
                                                double latitude = location.getLatitude();
                                                float accuracy = location.getAccuracy();
                                                double altitude = location.getAltitude();
                                                ULog.m9832i(C3588b.f9276f, "lon is " + longitude + ", lat is " + latitude + ", acc is " + accuracy + ", alt is " + altitude);
                                                if (!(longitude == AbstractC8352oOoOOoO0.OooO0O0 || latitude == AbstractC8352oOoOOoO0.OooO0O0)) {
                                                    long time = location.getTime();
                                                    JSONObject jSONObject = new JSONObject();
                                                    try {
                                                        jSONObject.put("lng", longitude);
                                                        jSONObject.put("lat", latitude);
                                                        jSONObject.put("ts", time);
                                                        jSONObject.put("acc", (double) accuracy);
                                                        jSONObject.put("alt", altitude);
                                                    } catch (JSONException e) {
                                                        ULog.m9832i(C3588b.f9276f, "e is " + e);
                                                    }
                                                    ULog.m9832i(C3588b.f9276f, "locationJSONObject is " + jSONObject.toString());
                                                    SharedPreferences sharedPreferences = context.getSharedPreferences(C3523a.f9040q, 0);
                                                    if (sharedPreferences != null) {
                                                        String string = sharedPreferences.getString(C3523a.f9042s, "");
                                                        String string2 = sharedPreferences.getString(C3523a.f9043t, "");
                                                        ULog.m9832i(C3588b.f9276f, "--->>> get lon is " + string + ", lat is " + string2);
                                                        if (TextUtils.isEmpty(string) || Double.parseDouble(string) != longitude || TextUtils.isEmpty(string2) || Double.parseDouble(string2) != latitude) {
                                                            JSONArray b = C3588b.m9440b(context);
                                                            if (b == null) {
                                                                b = new JSONArray();
                                                            }
                                                            b.put(jSONObject);
                                                            SharedPreferences.Editor edit = sharedPreferences.edit();
                                                            edit.putString(C3523a.f9042s, String.valueOf(longitude));
                                                            edit.putString(C3523a.f9043t, String.valueOf(latitude));
                                                            edit.putString(C3523a.f9041r, b.toString());
                                                            edit.commit();
                                                            ULog.m9832i(C3588b.f9276f, "location put is ok~~");
                                                        } else {
                                                            i = 1;
                                                            try {
                                                                Object[] objArr = new Object[1];
                                                                objArr[0] = "location same";
                                                                ULog.m9832i(C3588b.f9276f, objArr);
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                Object[] objArr2 = new Object[i];
                                                                objArr2[0] = "" + th.getMessage();
                                                                ULog.m9832i(C3588b.f9276f, objArr2);
                                                                aVar.mo38864a();
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th3) {
                                                th = th3;
                                                i = 1;
                                                Object[] objArr22 = new Object[i];
                                                objArr22[0] = "" + th.getMessage();
                                                ULog.m9832i(C3588b.f9276f, objArr22);
                                                aVar.mo38864a();
                                            }
                                        }
                                        aVar.mo38864a();
                                    }
                                });
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }).start();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public static JSONArray m9440b(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(C3523a.f9040q, 0);
        JSONArray jSONArray = null;
        if (sharedPreferences == null) {
            return null;
        }
        try {
            String string = sharedPreferences.getString(C3523a.f9041r, "");
            if (!TextUtils.isEmpty(string)) {
                jSONArray = new JSONArray(string);
            }
        } catch (JSONException e) {
            ULog.m9832i(f9276f, "e is " + e);
        } catch (Throwable th) {
            ULog.m9832i(f9276f, "e is " + th);
        }
        if (jSONArray != null) {
            ULog.m9832i(f9276f, "get json str is " + jSONArray.toString());
        }
        return jSONArray;
    }

    /* renamed from: c */
    public static void m9441c(Context context) {
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences(C3523a.f9040q, 0);
            if (sharedPreferences != null) {
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putString(C3523a.f9041r, "");
                edit.commit();
                ULog.m9832i(f9276f, "delete is ok~~");
            }
        } catch (Throwable unused) {
        }
    }
}
