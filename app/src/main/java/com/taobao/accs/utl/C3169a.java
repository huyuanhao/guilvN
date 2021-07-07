package com.taobao.accs.utl;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.p118pd.sdk.AbstractC8352oOoOOoO0;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AbstractC3099c;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.Constants;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.taobao.accs.utl.a */
public class C3169a {
    public static final String TAG = "a";

    /* renamed from: a */
    public static Handler f7187a = new Handler(Looper.getMainLooper());

    /* renamed from: b */
    public static TaoBaseService.ExtraInfo m7657b(Intent intent) {
        TaoBaseService.ExtraInfo extraInfo = new TaoBaseService.ExtraInfo();
        try {
            HashMap hashMap = (HashMap) intent.getSerializableExtra(TaoBaseService.ExtraInfo.EXT_HEADER);
            Map<TaoBaseService.ExtHeaderType, String> a = m7655a(hashMap);
            String stringExtra = intent.getStringExtra(Constants.KEY_PACKAGE_NAME);
            String stringExtra2 = intent.getStringExtra("host");
            extraInfo.connType = intent.getIntExtra(Constants.KEY_CONN_TYPE, 0);
            extraInfo.extHeader = a;
            extraInfo.oriExtHeader = hashMap;
            extraInfo.fromPackage = stringExtra;
            extraInfo.fromHost = stringExtra2;
        } catch (Throwable th) {
            ALog.m7598e(TAG, "getExtraInfo", th, new Object[0]);
        }
        return extraInfo;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:56:0x0235 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m7653a(android.content.Context r27, android.content.Intent r28, com.taobao.accs.base.AccsDataListener r29) {
        /*
        // Method dump skipped, instructions count: 740
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.accs.utl.C3169a.m7653a(android.content.Context, android.content.Intent, com.taobao.accs.base.AccsDataListener):int");
    }

    /* renamed from: a */
    public static Map<TaoBaseService.ExtHeaderType, String> m7655a(Map<Integer, String> map) {
        Exception e;
        HashMap hashMap = null;
        if (map == null) {
            return null;
        }
        try {
            HashMap hashMap2 = new HashMap();
            try {
                TaoBaseService.ExtHeaderType[] values = TaoBaseService.ExtHeaderType.values();
                for (TaoBaseService.ExtHeaderType extHeaderType : values) {
                    String str = map.get(Integer.valueOf(extHeaderType.ordinal()));
                    if (!TextUtils.isEmpty(str)) {
                        hashMap2.put(extHeaderType, str);
                    }
                }
                return hashMap2;
            } catch (Exception e2) {
                e = e2;
                hashMap = hashMap2;
                ALog.m7598e(TAG, "getExtHeader", e, new Object[0]);
                return hashMap;
            }
        } catch (Exception e3) {
            e = e3;
            ALog.m7598e(TAG, "getExtHeader", e, new Object[0]);
            return hashMap;
        }
    }

    /* renamed from: a */
    public static void m7656a(Context context, Intent intent, String str, Map<Integer, String> map) {
        try {
            ALog.m7600i(TAG, "sendBusinessAck", Constants.KEY_DATA_ID, str);
            if (intent != null) {
                String stringExtra = intent.getStringExtra("host");
                String stringExtra2 = intent.getStringExtra("source");
                String stringExtra3 = intent.getStringExtra("target");
                String stringExtra4 = intent.getStringExtra("appKey");
                String stringExtra5 = intent.getStringExtra(Constants.KEY_CONFIG_TAG);
                short shortExtra = intent.getShortExtra("flags", 0);
                AbstractC3099c accsInstance = ACCSManager.getAccsInstance(context, stringExtra4, stringExtra5);
                if (accsInstance != null) {
                    accsInstance.mo37476a(stringExtra3, stringExtra2, str, shortExtra, stringExtra, map);
                    C3179k.m7667a("accs", BaseMonitor.COUNT_BUSINESS_ACK_SUCC, "", AbstractC8352oOoOOoO0.OooO0O0);
                    return;
                }
                C3179k.m7667a("accs", BaseMonitor.COUNT_BUSINESS_ACK_FAIL, "no acsmgr", AbstractC8352oOoOOoO0.OooO0O0);
            }
        } catch (Throwable th) {
            ALog.m7598e(TAG, "sendBusinessAck", th, new Object[0]);
            C3179k.m7667a("accs", BaseMonitor.COUNT_BUSINESS_ACK_FAIL, th.toString(), AbstractC8352oOoOOoO0.OooO0O0);
        }
    }
}
