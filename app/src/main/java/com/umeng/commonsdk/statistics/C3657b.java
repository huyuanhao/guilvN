package com.umeng.commonsdk.statistics;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.umeng.analytics.pro.C3416b;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.proguard.C3555ac;
import com.umeng.commonsdk.proguard.C3617o;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.C3676e;
import com.umeng.commonsdk.statistics.idtracking.C3683k;
import com.umeng.commonsdk.statistics.idtracking.Envelope;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.umeng.commonsdk.statistics.b */
public class C3657b {

    /* renamed from: a */
    public static String f9559a = null;

    /* renamed from: b */
    public static String f9560b = "";

    /* renamed from: c */
    public static final String f9561c = "EnvelopeManager";

    /* renamed from: d */
    public static String f9562d;

    /* renamed from: f */
    public static boolean f9563f;

    /* renamed from: e */
    public int f9564e = 0;

    /* renamed from: a */
    public static long m9776a(Context context) {
        long j = DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX - DataHelper.ENVELOPE_EXTRA_LENGTH;
        JSONObject b = m9781b(context);
        if (!(b == null || b.toString() == null || b.toString().getBytes() == null)) {
            long length = (long) b.toString().getBytes().length;
            if (ULog.DEBUG) {
                Log.i(f9561c, "headerLen size is " + length);
            }
            j -= length;
        }
        if (ULog.DEBUG) {
            Log.i(f9561c, "free size is " + j);
        }
        return j;
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x0263  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static org.json.JSONObject m9781b(android.content.Context r14) {
        /*
        // Method dump skipped, instructions count: 705
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.C3657b.m9781b(android.content.Context):org.json.JSONObject");
    }

    /* renamed from: a */
    private JSONObject m9778a(int i, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("exception", i);
            } catch (Exception unused) {
            }
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("exception", i);
        } catch (Exception unused2) {
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public JSONObject mo39177a(Context context, JSONObject jSONObject, JSONObject jSONObject2) {
        JSONObject jSONObject3;
        Exception e;
        JSONObject jSONObject4;
        String str;
        String str2;
        Envelope envelope;
        String str3;
        String str4;
        if (!(!ULog.DEBUG || jSONObject == null || jSONObject2 == null)) {
            Log.i(f9561c, "headerJSONObject size is " + jSONObject.toString().getBytes().length);
            Log.i(f9561c, "bodyJSONObject size is " + jSONObject2.toString().getBytes().length);
        }
        if (context == null || jSONObject2 == null) {
            return m9778a(110, (JSONObject) null);
        }
        try {
            JSONObject b = m9781b(context);
            if (!(b == null || jSONObject == null)) {
                b = m9779a(b, jSONObject);
            }
            if (!(b == null || jSONObject2 == null)) {
                Iterator<String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!(next == null || !(next instanceof String) || (str4 = next) == null || jSONObject2.opt(str4) == null)) {
                        try {
                            b.put(str4, jSONObject2.opt(str4));
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            if (b != null) {
                StringBuilder sb = new StringBuilder();
                if (b.length() > 0) {
                    if (b.has("push")) {
                        String optString = b.optJSONObject("header").optString(C3617o.f9371ay);
                        if (!TextUtils.isEmpty(C3617o.f9365as) && !TextUtils.isEmpty(optString)) {
                            sb.append(C3617o.f9365as);
                            sb.append("==");
                            sb.append(optString);
                            sb.append("&=");
                        }
                    }
                    if (b.has("share")) {
                        String optString2 = b.optJSONObject("header").optString("s_sdk_v");
                        if (!TextUtils.isEmpty(C3617o.f9366at) && !TextUtils.isEmpty(optString2)) {
                            sb.append(C3617o.f9366at);
                            sb.append("==");
                            sb.append(optString2);
                            sb.append("&=");
                        }
                    }
                    if (b.has("analytics")) {
                        if (b.has("dplus")) {
                            str3 = C3617o.f9364ar;
                        } else if (b.optJSONObject("header").has("st")) {
                            str3 = "t";
                        } else {
                            str3 = "a";
                        }
                        String optString3 = b.optJSONObject("header").optString("sdk_version");
                        if (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(optString3)) {
                            sb.append(str3);
                            sb.append("==");
                            sb.append(optString3);
                            sb.append("&=");
                        }
                    }
                    if (b.has("dplus")) {
                        String optString4 = b.optJSONObject("header").optString("sdk_version");
                        if (b.has("analytics")) {
                            if (!sb.toString().contains(C3617o.f9364ar) && !TextUtils.isEmpty(C3617o.f9364ar) && !TextUtils.isEmpty(optString4)) {
                                sb.append(C3617o.f9364ar);
                                sb.append("==");
                                sb.append(optString4);
                                sb.append("&=");
                            }
                        } else if (!TextUtils.isEmpty("d") && !TextUtils.isEmpty(optString4)) {
                            sb.append("d");
                            sb.append("==");
                            sb.append(optString4);
                            sb.append("&=");
                        }
                    }
                    if (b.has(C3617o.f9361ao)) {
                        String optString5 = b.optJSONObject("header").optString(C3617o.f9341aA);
                        if (!TextUtils.isEmpty(C3617o.f9367au) && !TextUtils.isEmpty(optString5)) {
                            sb.append(C3617o.f9367au);
                            sb.append("==");
                            sb.append(optString5);
                            sb.append("&=");
                        }
                    }
                }
                str2 = sb.toString();
                if (TextUtils.isEmpty(str2)) {
                    return m9778a(101, b);
                }
                if (str2.endsWith("&=")) {
                    str2 = str2.substring(0, str2.length() - 2);
                }
            } else {
                str2 = null;
            }
            if (b != null) {
                try {
                    C3676e a = C3676e.m9914a(context);
                    if (a != null) {
                        a.mo39246a();
                        String encodeToString = Base64.encodeToString(new C3555ac().mo38869a(a.mo39248b()), 0);
                        if (!TextUtils.isEmpty(encodeToString)) {
                            JSONObject jSONObject5 = b.getJSONObject("header");
                            jSONObject5.put(C3617o.f9335V, encodeToString);
                            b.put("header", jSONObject5);
                        }
                    }
                } catch (Exception unused2) {
                }
            }
            if (b == null || !DataHelper.largeThanMaxSize((long) b.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                if (b != null) {
                    envelope = m9777a(context, b.toString().getBytes());
                    if (envelope == null) {
                        return m9778a(111, b);
                    }
                } else {
                    envelope = null;
                }
                if (envelope != null && DataHelper.largeThanMaxSize((long) envelope.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                    return m9778a(114, b);
                }
                int a2 = m9775a(context, envelope, str2, b != null ? b.optJSONObject("header").optString("app_version") : null);
                if (a2 != 0) {
                    return m9778a(a2, b);
                }
                if (ULog.DEBUG) {
                    Log.i(f9561c, "constructHeader size is " + b.toString().getBytes().length);
                }
                return b;
            }
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (sharedPreferences != null) {
                sharedPreferences.edit().putInt(C3683k.f9658a, sharedPreferences.getInt(C3683k.f9658a, 1) + 1).commit();
            }
            return m9778a(113, b);
        } catch (Throwable th) {
            UMCrashManager.reportCrash(context, th);
            if (jSONObject != null) {
                try {
                    JSONObject jSONObject6 = new JSONObject();
                    try {
                        jSONObject6.put("header", jSONObject);
                    } catch (JSONException unused3) {
                    } catch (Exception e2) {
                        e = e2;
                        jSONObject3 = jSONObject6;
                        UMCrashManager.reportCrash(context, e);
                        return m9778a(110, jSONObject3);
                    }
                    jSONObject4 = jSONObject2;
                    jSONObject3 = jSONObject6;
                } catch (Exception e3) {
                    e = e3;
                    jSONObject3 = null;
                    UMCrashManager.reportCrash(context, e);
                    return m9778a(110, jSONObject3);
                }
            } else {
                jSONObject4 = jSONObject2;
                jSONObject3 = null;
            }
            if (jSONObject4 != null) {
                if (jSONObject3 == null) {
                    try {
                        jSONObject3 = new JSONObject();
                    } catch (Exception e4) {
                        e = e4;
                        UMCrashManager.reportCrash(context, e);
                        return m9778a(110, jSONObject3);
                    }
                }
                if (jSONObject4 != null) {
                    Iterator<String> keys2 = jSONObject2.keys();
                    while (keys2.hasNext()) {
                        String next2 = keys2.next();
                        if (!(next2 == null || !(next2 instanceof String) || (str = next2) == null || jSONObject4.opt(str) == null)) {
                            try {
                                jSONObject3.put(str, jSONObject4.opt(str));
                            } catch (Exception unused4) {
                            }
                        }
                    }
                }
            }
            return m9778a(110, jSONObject3);
        }
    }

    /* renamed from: a */
    private JSONObject m9779a(JSONObject jSONObject, JSONObject jSONObject2) {
        String str;
        if (!(jSONObject == null || jSONObject2 == null || jSONObject.opt("header") == null || !(jSONObject.opt("header") instanceof JSONObject))) {
            JSONObject jSONObject3 = (JSONObject) jSONObject.opt("header");
            Iterator<String> keys = jSONObject2.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!(next == null || !(next instanceof String) || (str = next) == null || jSONObject2.opt(str) == null)) {
                    try {
                        jSONObject3.put(str, jSONObject2.opt(str));
                        if (str.equals(C3416b.f8482i) && (jSONObject2.opt(str) instanceof Integer)) {
                            this.f9564e = ((Integer) jSONObject2.opt(str)).intValue();
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    private Envelope m9777a(Context context, byte[] bArr) {
        String imprintProperty = UMEnvelopeBuild.imprintProperty(context, "codex", null);
        int i = -1;
        try {
            if (!TextUtils.isEmpty(imprintProperty)) {
                i = Integer.valueOf(imprintProperty).intValue();
            }
        } catch (NumberFormatException e) {
            UMCrashManager.reportCrash(context, e);
        }
        if (i == 0) {
            return Envelope.genEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        if (i == 1) {
            return Envelope.genEncryptEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        if (f9563f) {
            return Envelope.genEncryptEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        return Envelope.genEnvelope(context, UMUtils.getAppkey(context), bArr);
    }

    /* renamed from: a */
    private int m9775a(Context context, Envelope envelope, String str, String str2) {
        if (context == null || envelope == null || TextUtils.isEmpty(str)) {
            return 101;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = DeviceConfig.getAppVersionName(context);
        }
        return UMFrUtils.saveEnvelopeFile(context, str + "&&" + str2 + "_" + System.currentTimeMillis() + "_envelope.log", envelope.toBinary());
    }

    /* renamed from: a */
    public static void m9780a(boolean z) {
        f9563f = z;
    }
}
