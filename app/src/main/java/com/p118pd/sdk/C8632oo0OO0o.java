package com.p118pd.sdk;

import androidx.annotation.NonNull;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.rxhui.android_log_sdk.LogNetworkType;
import com.rxhui.data.core.BaseVO;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.pd.sdk.oo0OO0o  reason: case insensitive filesystem */
public class C8632oo0OO0o implements AbstractC8962ooOOo {
    public static final String OooO00o = "HttpLogCollectorImpl";

    /* renamed from: com.pd.sdk.oo0OO0o$OooO00o */
    public class OooO00o implements AbstractC9847l1<String, Boolean> {
        public OooO00o() {
        }

        /* renamed from: OooO00o */
        public Boolean call(String str) {
            return true;
        }
    }

    @NonNull
    private C9349III<String> OooO00o(String str) {
        return C9349III.OooO0oO(str).OooOO0O(new OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC8962ooOOo
    public void OooO00o(String str, Map<String, String> map, long j, int i, String str2, String str3) {
        String str4;
        HashMap hashMap = new HashMap();
        String OooO00o2 = C8642oo0OOo0.OooO00o(map);
        if (str2.contains(C8932ooOOO0o.f22176OooO00o)) {
            str2 = str2.substring(0, str2.indexOf(C8932ooOOO0o.f22176OooO00o));
        }
        hashMap.put("url", str2);
        hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, str);
        hashMap.put("params", OooO00o2);
        try {
            hashMap.put("desc", new URI(str2).getPath());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        hashMap.put("duration", j + "");
        hashMap.put("response", str3 == null ? "null" : str3);
        hashMap.put("status", i + "");
        if (200 == i) {
            try {
                if (BaseVO.getMessageCode(new JSONObject(str3)) == 0) {
                    str4 = LogNetworkType.BUSINESS_SUCCESS.getValue();
                } else {
                    str4 = LogNetworkType.BUSINESS_FAIL.getValue();
                }
            } catch (Exception unused) {
                str4 = LogNetworkType.BUSINESS_SUCCESS.getValue();
            }
        } else if (408 == i || 504 == i) {
            str4 = LogNetworkType.OVERTIME.getValue();
        } else if (204 == i) {
            str4 = LogNetworkType.NO_NETWORK.getValue();
        } else {
            str4 = LogNetworkType.NO_200.getValue();
        }
        LogCollectorManager.sharedInstance().recordInfo(LogCategory.NETWORK, str4, hashMap);
    }

    @Override // com.p118pd.sdk.AbstractC8962ooOOo
    public void OooO00o(IOException iOException, String str, Map<String, String> map, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("error", iOException.getLocalizedMessage());
        if (str2.contains(C8932ooOOO0o.f22176OooO00o)) {
            str2 = str2.substring(0, str2.indexOf(C8932ooOOO0o.f22176OooO00o));
        }
        hashMap.put("url", str2);
        hashMap.put(AbstractC7726o0ooOOoo.OooOOo0, str);
        if (map != null) {
            hashMap.put("params", C8642oo0OOo0.OooO00o(map));
        }
        try {
            hashMap.put("desc", new URI(str2).getPath());
        } catch (URISyntaxException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        LogCollectorManager.sharedInstance().recordWarn(LogCategory.NETWORK, LogNetworkType.NO_NETWORK.getValue(), hashMap);
    }
}
