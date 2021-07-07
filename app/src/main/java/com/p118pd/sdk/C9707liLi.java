package com.p118pd.sdk;

import android.util.SparseArray;
import com.taobao.accs.flowcontrol.FlowControl;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.pd.sdk.丨liL丨i  reason: invalid class name and case insensitive filesystem */
public class C9707liLi {
    public static final int OooO00o = -1;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final SparseArray<String> f23340OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f23341OooO00o = "UNKNOWN_FORMAT";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Map<String, Integer> f23342OooO00o;

    static {
        SparseArray<String> sparseArray = new SparseArray<>();
        sparseArray.put(1, "CODE_128");
        sparseArray.put(2, "CODE_39");
        sparseArray.put(4, "CODE_93");
        sparseArray.put(8, "CODABAR");
        sparseArray.put(16, "DATA_MATRIX");
        sparseArray.put(32, "EAN_13");
        sparseArray.put(64, "EAN_8");
        sparseArray.put(128, "ITF");
        sparseArray.put(256, "QR_CODE");
        sparseArray.put(512, "UPC_A");
        sparseArray.put(1024, "UPC_E");
        sparseArray.put(2048, "PDF417");
        sparseArray.put(4096, "AZTEC");
        sparseArray.put(0, FlowControl.SERVICE_ALL);
        sparseArray.put(11, "CALENDAR_EVENT");
        sparseArray.put(1, "CONTACT_INFO");
        sparseArray.put(12, "DRIVER_LICENSE");
        sparseArray.put(2, "EMAIL");
        sparseArray.put(10, "GEO");
        sparseArray.put(3, "ISBN");
        sparseArray.put(4, "PHONE");
        sparseArray.put(5, "PRODUCT");
        sparseArray.put(6, "SMS");
        sparseArray.put(7, "TEXT");
        sparseArray.put(512, "UPC_A");
        sparseArray.put(8, "URL");
        sparseArray.put(9, "WIFI");
        sparseArray.put(-1, "None");
        f23340OooO00o = sparseArray;
        HashMap hashMap = new HashMap();
        for (int i = 0; i < sparseArray.size(); i++) {
            hashMap.put(sparseArray.valueAt(i), Integer.valueOf(sparseArray.keyAt(i)));
        }
        f23342OooO00o = Collections.unmodifiableMap(hashMap);
    }

    public static String OooO00o(int i) {
        return f23340OooO00o.get(i, f23341OooO00o);
    }

    public static int OooO00o(String str) {
        if (f23342OooO00o.containsKey(str)) {
            return f23342OooO00o.get(str).intValue();
        }
        return -1;
    }
}
