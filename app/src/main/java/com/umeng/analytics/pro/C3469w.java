package com.umeng.analytics.pro;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;

/* renamed from: com.umeng.analytics.pro.w */
public class C3469w {

    /* renamed from: a */
    public static String f8799a = null;

    /* renamed from: b */
    public static final String f8800b = "umeng+";

    /* renamed from: c */
    public static final String f8801c = "ek__id";

    /* renamed from: d */
    public static final String f8802d = "ek_key";

    /* renamed from: e */
    public static C3469w f8803e;

    /* renamed from: a */
    public static C3469w m8935a() {
        if (f8803e == null) {
            synchronized (C3469w.class) {
                if (f8803e == null) {
                    f8803e = new C3469w();
                }
            }
        }
        return f8803e;
    }

    /* renamed from: b */
    public String mo38800b(String str) {
        try {
            return TextUtils.isEmpty(f8799a) ? str : new String(DataHelper.decrypt(Base64.decode(str.getBytes(), 0), f8799a.getBytes()));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public void mo38799a(Context context) {
        try {
            if (TextUtils.isEmpty(f8799a)) {
                String multiProcessSP = UMUtils.getMultiProcessSP(context, "ek__id");
                if (TextUtils.isEmpty(multiProcessSP)) {
                    multiProcessSP = PreferenceWrapper.getDefault(context).getString("ek__id", null);
                    if (TextUtils.isEmpty(multiProcessSP)) {
                        multiProcessSP = DeviceConfig.getDBencryptID(context);
                    }
                    if (!TextUtils.isEmpty(multiProcessSP)) {
                        UMUtils.setMultiProcessSP(context, "ek__id", multiProcessSP);
                    }
                }
                if (!TextUtils.isEmpty(multiProcessSP)) {
                    String substring = multiProcessSP.substring(1, 9);
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < substring.length(); i++) {
                        char charAt = substring.charAt(i);
                        if (!Character.isDigit(charAt)) {
                            sb.append(charAt);
                        } else if (Integer.parseInt(Character.toString(charAt)) == 0) {
                            sb.append(0);
                        } else {
                            sb.append(10 - Integer.parseInt(Character.toString(charAt)));
                        }
                    }
                    f8799a = sb.toString();
                }
                if (!TextUtils.isEmpty(f8799a)) {
                    f8799a += new StringBuilder(f8799a).reverse().toString();
                    String multiProcessSP2 = UMUtils.getMultiProcessSP(context, "ek_key");
                    if (TextUtils.isEmpty(multiProcessSP2)) {
                        UMUtils.setMultiProcessSP(context, "ek_key", mo38798a("umeng+"));
                    } else {
                        "umeng+".equals(mo38800b(multiProcessSP2));
                    }
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public String mo38798a(String str) {
        try {
            return TextUtils.isEmpty(f8799a) ? str : Base64.encodeToString(DataHelper.encrypt(str.getBytes(), f8799a.getBytes()), 0);
        } catch (Exception unused) {
            return null;
        }
    }
}
