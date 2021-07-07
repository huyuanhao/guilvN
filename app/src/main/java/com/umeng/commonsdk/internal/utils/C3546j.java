package com.umeng.commonsdk.internal.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.react.views.text.FontMetricsUtil;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.framework.UMWorkDispatch;
import com.umeng.commonsdk.internal.C3524b;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.proguard.C3617o;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.utils.C3745b;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import okhttp3.internal.platform.AndroidPlatform;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.internal.utils.j */
public class C3546j {

    /* renamed from: a */
    public static final String f9125a = "info";

    /* renamed from: b */
    public static final String f9126b = "stat";

    /* renamed from: c */
    public static boolean f9127c = false;

    /* renamed from: d */
    public static HandlerThread f9128d = null;

    /* renamed from: e */
    public static Context f9129e = null;

    /* renamed from: f */
    public static int f9130f = 0;

    /* renamed from: g */
    public static int f9131g = 0;

    /* renamed from: h */
    public static int f9132h = 0;

    /* renamed from: i */
    public static int f9133i = 1;

    /* renamed from: j */
    public static long f9134j = 0;

    /* renamed from: k */
    public static long f9135k = 0;

    /* renamed from: l */
    public static final int f9136l = 40;

    /* renamed from: m */
    public static final int f9137m = 50000;

    /* renamed from: n */
    public static SensorManager f9138n;

    /* renamed from: o */
    public static ArrayList<float[]> f9139o = new ArrayList<>();

    /* renamed from: p */
    public static SensorEventListener f9140p = new SensorEventListener() {
        /* class com.umeng.commonsdk.internal.utils.C3546j.C35471 */

        public void onAccuracyChanged(Sensor sensor, int i) {
        }

        public void onSensorChanged(SensorEvent sensorEvent) {
            if (C3546j.f9131g < 15) {
                C3546j.m9195c();
                return;
            }
            if (C3546j.f9130f < 20) {
                C3546j.m9199e();
                C3546j.f9139o.add(sensorEvent.values.clone());
            }
            if (C3546j.f9130f == 20) {
                C3546j.m9199e();
                if (C3546j.f9133i == 1) {
                    long unused = C3546j.f9134j = System.currentTimeMillis();
                }
                if (C3546j.f9133i == 2) {
                    long unused2 = C3546j.f9135k = System.currentTimeMillis();
                }
                C3546j.m9203h();
                C3546j.m9207l();
            }
        }
    };

    /* renamed from: c */
    public static /* synthetic */ int m9195c() {
        int i = f9131g;
        f9131g = i + 1;
        return i;
    }

    /* renamed from: e */
    public static /* synthetic */ int m9199e() {
        int i = f9130f;
        f9130f = i + 1;
        return i;
    }

    /* renamed from: h */
    public static /* synthetic */ int m9203h() {
        int i = f9133i;
        f9133i = i + 1;
        return i;
    }

    /* renamed from: l */
    public static void m9207l() {
        SensorManager sensorManager = f9138n;
        if (sensorManager != null) {
            sensorManager.unregisterListener(f9140p);
        }
        if (f9139o.size() == 40) {
            m9200e(f9129e);
            ArrayList<float[]> arrayList = f9139o;
            if (arrayList != null) {
                arrayList.clear();
            }
            HandlerThread handlerThread = f9128d;
            if (handlerThread != null) {
                handlerThread.quit();
                f9128d = null;
            }
            f9129e = null;
            f9127c = false;
        }
    }

    /* renamed from: c */
    public static JSONArray m9196c(Context context) {
        String string;
        SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("info", 0);
        if (sharedPreferences == null || !FieldManager.allow(C3745b.f9827Q) || (string = sharedPreferences.getString("stat", null)) == null) {
            return null;
        }
        try {
            return new JSONArray(string);
        } catch (JSONException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public static void m9198d(Context context) {
        if (context != null) {
            context.getApplicationContext().getSharedPreferences("info", 0).edit().remove("stat").commit();
        }
    }

    /* renamed from: e */
    public static void m9200e(Context context) {
        int i;
        if (context != null) {
            try {
                if (FieldManager.allow(C3745b.f9827Q)) {
                    JSONArray jSONArray = new JSONArray();
                    for (int i2 = 0; i2 < 2; i2++) {
                        JSONObject jSONObject = new JSONObject();
                        JSONArray jSONArray2 = new JSONArray();
                        int i3 = 20;
                        if (i2 == 1) {
                            i = 40;
                        } else {
                            i3 = 0;
                            i = 20;
                        }
                        while (i3 < i) {
                            JSONObject jSONObject2 = new JSONObject();
                            jSONObject2.put(FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT, (double) f9139o.get(i3)[0]);
                            jSONObject2.put("y", (double) f9139o.get(i3)[1]);
                            jSONObject2.put("z", (double) f9139o.get(i3)[2]);
                            jSONArray2.put(jSONObject2);
                            i3++;
                        }
                        if (f9132h == 4) {
                            jSONObject.put("g", jSONArray2);
                        } else if (f9132h == 1) {
                            jSONObject.put("a", jSONArray2);
                        }
                        if (i2 == 0) {
                            jSONObject.put("ts", f9134j);
                        } else {
                            jSONObject.put("ts", f9135k);
                        }
                        jSONArray.put(jSONObject);
                        UMWorkDispatch.sendEvent(context, 32776, C3524b.m9071a(context).mo38849a(), jSONArray.toString());
                    }
                }
            } catch (Exception e) {
                UMCrashManager.reportCrash(context, e);
            }
        }
    }

    /* renamed from: a */
    public static List<Sensor> m9190a(Context context) {
        SensorManager sensorManager;
        if (context == null || (sensorManager = (SensorManager) context.getSystemService(C3617o.f9339Z)) == null) {
            return null;
        }
        return sensorManager.getSensorList(-1);
    }

    /* renamed from: b */
    public static void m9194b(Context context) {
        if (context != null && !m9191a()) {
            f9127c = true;
            f9129e = context.getApplicationContext();
            String currentProcessName = UMFrUtils.getCurrentProcessName(context);
            String packageName = context.getPackageName();
            if (currentProcessName != null && currentProcessName.equals(packageName)) {
                SensorManager sensorManager = (SensorManager) context.getSystemService(C3617o.f9339Z);
                f9138n = sensorManager;
                if (sensorManager != null) {
                    final Sensor defaultSensor = sensorManager.getDefaultSensor(4);
                    final Sensor defaultSensor2 = f9138n.getDefaultSensor(1);
                    if (defaultSensor != null) {
                        f9132h = 4;
                        f9138n.registerListener(f9140p, defaultSensor, f9137m);
                    } else if (defaultSensor2 != null) {
                        f9132h = 1;
                        f9138n.registerListener(f9140p, defaultSensor2, f9137m);
                    }
                    int nextInt = (new Random().nextInt(3) * 1000) + AndroidPlatform.MAX_LOG_LENGTH;
                    HandlerThread handlerThread = new HandlerThread("sensor_thread");
                    f9128d = handlerThread;
                    handlerThread.start();
                    new Handler(f9128d.getLooper()).postDelayed(new Runnable() {
                        /* class com.umeng.commonsdk.internal.utils.C3546j.RunnableC35482 */

                        public void run() {
                            try {
                                int unused = C3546j.f9130f = 0;
                                if (defaultSensor != null) {
                                    C3546j.f9138n.registerListener(C3546j.f9140p, defaultSensor, C3546j.f9137m);
                                } else if (defaultSensor2 != null) {
                                    C3546j.f9138n.registerListener(C3546j.f9140p, defaultSensor2, C3546j.f9137m);
                                }
                            } catch (Exception unused2) {
                                ULog.m9829i("sensor exception");
                            }
                        }
                    }, (long) nextInt);
                }
            }
        }
    }

    /* renamed from: a */
    public static synchronized boolean m9191a() {
        boolean z;
        synchronized (C3546j.class) {
            z = f9127c;
        }
        return z;
    }
}
