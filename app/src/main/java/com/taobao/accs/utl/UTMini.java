package com.taobao.accs.utl;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.p118pd.sdk.C8932ooOOO0o;
import com.p254ta.utdid2.device.UTDevice;
import com.ut.mini.UTAnalytics;
import com.ut.mini.internal.UTOriginalCustomHitBuilder;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Map;

public final class UTMini {
    public static final int EVENTID_AGOO = 19999;
    public static final String PAGE_AGOO = "Page_Push";
    public static final String TAG = "UTMini";
    public static UTMini instance = new UTMini();

    private String _convertStringAToKVSString(String... strArr) {
        if (strArr != null && strArr.length == 0) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        if (strArr != null && strArr.length > 0) {
            boolean z = false;
            for (int i = 0; i < strArr.length; i++) {
                if (!TextUtils.isEmpty(strArr[i])) {
                    if (z) {
                        stringBuffer.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    }
                    stringBuffer.append(strArr[i]);
                    z = true;
                }
            }
        }
        return stringBuffer.toString();
    }

    public static String convertObjectToString(Object obj) {
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof Integer) {
            return "" + ((Integer) obj).intValue();
        } else if (obj instanceof Long) {
            return "" + ((Long) obj).longValue();
        } else if (obj instanceof Double) {
            return "" + ((Double) obj).doubleValue();
        } else if (obj instanceof Float) {
            return "" + ((Float) obj).floatValue();
        } else if (obj instanceof Short) {
            return "" + ((int) ((Short) obj).shortValue());
        } else if (obj instanceof Byte) {
            return "" + ((int) ((Byte) obj).byteValue());
        } else if (obj instanceof Boolean) {
            return ((Boolean) obj).toString();
        } else {
            if (obj instanceof Character) {
                return ((Character) obj).toString();
            }
            return obj.toString();
        }
    }

    public static String getCommitInfo(int i, String str, String str2, String str3, Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        sb.append("eventId=");
        sb.append(i);
        sb.append(";arg1=");
        sb.append(str);
        sb.append(";arg2=");
        sb.append(str2);
        sb.append(";arg3=");
        sb.append(str3);
        if (map != null) {
            sb.append(C7522o0Ooo0o.OooO0O0);
            sb.append("args=");
            sb.append(map.toString());
        }
        return sb.toString();
    }

    public static UTMini getInstance() {
        return instance;
    }

    public static String[] mapToArray(Map<String, String> map) {
        int i = 0;
        if (map == null || map.isEmpty()) {
            return new String[0];
        }
        String[] strArr = new String[map.size()];
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key == null) {
                strArr[i] = "";
            } else {
                strArr[i] = key + C8932ooOOO0o.OooO0Oo + value;
            }
            i++;
        }
        return strArr;
    }

    public final void commitEvent(int i, String str, Object obj) {
        try {
            UTAnalytics.getInstance().getTracker("accs").send(new UTOriginalCustomHitBuilder(str, i, convertObjectToString(obj), (String) null, (String) null, (Map) null).build());
        } catch (Throwable unused) {
        }
    }

    public final String getUtdId(Context context) {
        try {
            return UTDevice.getUtdid(context);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void onCaughException(Throwable th) {
    }

    public final void start(Application application, String str, String str2, String str3) {
        try {
            UTAnalytics.getInstance().setAppApplicationInstance(application, new C3193v(this, str3, str));
            ALog.m7597d(TAG, "start success", new Object[0]);
        } catch (Throwable th) {
            ALog.m7598e(TAG, "start fail ", th, new Object[0]);
        }
    }

    public final void stop(Context context) {
    }

    public final void commitEvent(int i, String str, Object obj, Object obj2) {
        try {
            UTAnalytics.getInstance().getTracker("accs").send(new UTOriginalCustomHitBuilder(str, i, convertObjectToString(obj), convertObjectToString(obj2), (String) null, (Map) null).build());
        } catch (Throwable unused) {
        }
    }

    public final void commitEvent(int i, String str, Object obj, Object obj2, Object obj3) {
        try {
            UTAnalytics.getInstance().getTracker("accs").send(new UTOriginalCustomHitBuilder(str, i, convertObjectToString(obj), convertObjectToString(obj2), convertObjectToString(obj3), (Map) null).build());
        } catch (Throwable unused) {
        }
    }

    public final void commitEvent(int i, String str, Object obj, Object obj2, Object obj3, String... strArr) {
        try {
            UTOriginalCustomHitBuilder uTOriginalCustomHitBuilder = new UTOriginalCustomHitBuilder(str, i, convertObjectToString(obj), convertObjectToString(obj2), convertObjectToString(obj3), (Map) null);
            uTOriginalCustomHitBuilder.setProperty("_field_args", _convertStringAToKVSString(strArr));
            UTAnalytics.getInstance().getTracker("accs").send(uTOriginalCustomHitBuilder.build());
        } catch (Throwable unused) {
        }
    }

    public final void commitEvent(int i, String str, Object obj, Object obj2, Object obj3, Map<String, String> map) {
        try {
            commitEvent(i, str, obj, obj2, obj3, mapToArray(map));
        } catch (Throwable unused) {
        }
    }

    public static String getCommitInfo(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        sb.append("eventId=");
        sb.append(i);
        sb.append(";arg1=");
        sb.append(str);
        sb.append(";arg2=");
        sb.append(str2);
        sb.append(";arg3=");
        sb.append(str3);
        if (str4 != null) {
            sb.append(C7522o0Ooo0o.OooO0O0);
            sb.append("args=");
            sb.append(str4);
        }
        return sb.toString();
    }
}
