package com.tencent.p269mm.opensdk.utils;

import android.os.Bundle;

/* renamed from: com.tencent.mm.opensdk.utils.a */
public final class C3387a {
    /* renamed from: a */
    public static int m8655a(Bundle bundle, String str) {
        if (bundle == null) {
            return -1;
        }
        try {
            return bundle.getInt(str, -1);
        } catch (Exception e) {
            Log.m8651e("MicroMsg.IntentUtil", "getIntExtra exception:" + e.getMessage());
            return -1;
        }
    }

    /* renamed from: b */
    public static String m8656b(Bundle bundle, String str) {
        if (bundle == null) {
            return null;
        }
        try {
            return bundle.getString(str);
        } catch (Exception e) {
            Log.m8651e("MicroMsg.IntentUtil", "getStringExtra exception:" + e.getMessage());
            return null;
        }
    }
}
