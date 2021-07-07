package com.umeng.commonsdk.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.UMConfigure;
import com.umeng.commonsdk.UMConfigureImpl;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMLogDataProtocol;
import com.umeng.commonsdk.proguard.C3617o;
import com.umeng.commonsdk.statistics.common.ULog;
import java.lang.reflect.Method;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.internal.c */
public class C3525c implements UMLogDataProtocol {

    /* renamed from: a */
    public static final String f9048a = "umeng_sp_zdata";

    /* renamed from: b */
    public static final String f9049b = "umeng_zdata";

    /* renamed from: c */
    public static final String f9050c = "umeng_zdata_req_ts";

    /* renamed from: e */
    public static final String f9051e = "info";

    /* renamed from: f */
    public static final String f9052f = "stat";

    /* renamed from: g */
    public static Class<?> f9053g = null;

    /* renamed from: h */
    public static Method f9054h = null;

    /* renamed from: i */
    public static Method f9055i = null;

    /* renamed from: j */
    public static final String f9056j = "com.umeng.umzid.Spy";

    /* renamed from: d */
    public Context f9057d;

    static {
        m9074b();
    }

    public C3525c(Context context) {
        if (context != null) {
            this.f9057d = context.getApplicationContext();
        }
    }

    /* renamed from: a */
    public static String m9073a() {
        Method method;
        Class<?> cls = f9053g;
        if (!(cls == null || (method = f9055i) == null)) {
            try {
                return (String) method.invoke(cls, new Object[0]);
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    /* renamed from: b */
    public static void m9074b() {
        try {
            Class<?> cls = Class.forName(f9056j);
            if (cls != null) {
                f9053g = cls;
                Method declaredMethod = cls.getDeclaredMethod("getID", new Class[0]);
                if (declaredMethod != null) {
                    f9054h = declaredMethod;
                }
                Method declaredMethod2 = f9053g.getDeclaredMethod("getVersion", new Class[0]);
                if (declaredMethod2 != null) {
                    f9055i = declaredMethod2;
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public static String m9075c() {
        Method method;
        Class<?> cls = f9053g;
        if (!(cls == null || (method = f9054h) == null)) {
            try {
                return (String) method.invoke(cls, new Object[0]);
            } catch (Throwable unused) {
            }
        }
        return "";
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void removeCacheData(Object obj) {
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public JSONObject setupReportData(long j) {
        return null;
    }

    @Override // com.umeng.commonsdk.framework.UMLogDataProtocol
    public void workEvent(Object obj, int i) {
        ULog.m9832i("walle", "[internal] workEvent");
        switch (i) {
            case 32769:
                ULog.m9832i("walle", "[internal] workEvent send envelope");
                Class<?> cls = Class.forName("com.umeng.commonsdk.internal.UMInternalManagerAgent");
                if (cls != null) {
                    cls.getMethod("sendInternalEnvelopeByStateful2", Context.class).invoke(cls, this.f9057d);
                    return;
                }
                return;
            case 32770:
            case 32773:
            default:
                return;
            case 32771:
                ULog.m9832i("walle", "[internal] workEvent cache battery, event is " + obj.toString());
                Class<?> cls2 = Class.forName("com.umeng.commonsdk.internal.utils.UMInternalUtilsAgent");
                if (cls2 != null) {
                    cls2.getMethod("saveBattery", Context.class, String.class).invoke(cls2, this.f9057d, (String) obj);
                    return;
                }
                return;
            case 32772:
                ULog.m9832i("walle", "[internal] workEvent cache station, event is " + obj.toString());
                Class<?> cls3 = Class.forName("com.umeng.commonsdk.internal.utils.UMInternalUtilsAgent");
                if (cls3 != null) {
                    cls3.getMethod("saveBaseStationStrength", Context.class, String.class).invoke(cls3, this.f9057d, (String) obj);
                    return;
                }
                return;
            case 32774:
                Class<?> cls4 = Class.forName("com.umeng.commonsdk.internal.utils.ApplicationLayerUtilAgent");
                if (cls4 != null) {
                    cls4.getMethod("wifiChange", Context.class).invoke(cls4, this.f9057d);
                    return;
                }
                return;
            case 32775:
                try {
                    Class<?> cls5 = Class.forName("com.umeng.commonsdk.internal.utils.InfoPreferenceAgent");
                    if (cls5 != null) {
                        cls5.getMethod("saveUA", Context.class, String.class).invoke(cls5, this.f9057d, (String) obj);
                        return;
                    }
                    return;
                } catch (Throwable unused) {
                    return;
                }
            case 32776:
                SharedPreferences sharedPreferences = this.f9057d.getApplicationContext().getSharedPreferences("info", 0);
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putString("stat", (String) obj).commit();
                    return;
                }
                return;
            case 32777:
                ULog.m9832i("walle", "[internal] workEvent send envelope");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(C3617o.f9341aA, C3523a.f9027d);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(C3617o.f9361ao, new JSONObject());
                JSONObject buildEnvelopeWithExtHeader = UMEnvelopeBuild.buildEnvelopeWithExtHeader(this.f9057d, jSONObject, jSONObject2);
                if (buildEnvelopeWithExtHeader != null && !buildEnvelopeWithExtHeader.has("exception")) {
                    ULog.m9832i("walle", "[internal] workEvent send envelope back, result is ok");
                    return;
                }
                return;
            case C3523a.f9037n:
                Context context = this.f9057d;
                if (context != null) {
                    SharedPreferences sharedPreferences2 = context.getSharedPreferences(f9048a, 0);
                    long currentTimeMillis = System.currentTimeMillis();
                    String c = m9075c();
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (!TextUtils.isEmpty(c) && sharedPreferences2 != null) {
                        SharedPreferences.Editor edit = sharedPreferences2.edit();
                        edit.putString(f9049b, c);
                        edit.putLong(f9050c, currentTimeMillis2 - currentTimeMillis);
                        edit.commit();
                    }
                    if (UMConfigure.sShouldCollectZData) {
                        UMConfigureImpl.removeInterruptFlag();
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
