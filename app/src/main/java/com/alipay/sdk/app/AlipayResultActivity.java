package com.alipay.sdk.app;

import android.app.Activity;
import android.os.Bundle;
import com.p118pd.sdk.C7513o0Ooo;
import java.util.concurrent.ConcurrentHashMap;

public class AlipayResultActivity extends Activity {
    public static final ConcurrentHashMap<String, OooO00o> OooO00o = new ConcurrentHashMap<>();

    public interface OooO00o {
        void OooO00o(int i, String str, String str2);
    }

    private void OooO00o(String str, Bundle bundle) {
        OooO00o remove = OooO00o.remove(str);
        if (remove == null) {
            finish();
            return;
        }
        try {
            remove.OooO00o(bundle.getInt("endCode"), bundle.getString(C7513o0Ooo.OooO0O0), bundle.getString("result"));
        } finally {
            finish();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x009a A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r9) {
        /*
        // Method dump skipped, instructions count: 201
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.app.AlipayResultActivity.onCreate(android.os.Bundle):void");
    }
}
