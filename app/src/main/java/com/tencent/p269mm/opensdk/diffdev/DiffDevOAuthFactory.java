package com.tencent.p269mm.opensdk.diffdev;

import com.tencent.p269mm.opensdk.diffdev.p271a.C3377a;
import com.tencent.p269mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.diffdev.DiffDevOAuthFactory */
public class DiffDevOAuthFactory {
    public static final int MAX_SUPPORTED_VERSION = 1;
    public static final String TAG = "MicroMsg.SDK.DiffDevOAuthFactory";
    public static final int VERSION_1 = 1;
    public static IDiffDevOAuth v1Instance;

    public static IDiffDevOAuth getDiffDevOAuth() {
        return getDiffDevOAuth(1);
    }

    public static IDiffDevOAuth getDiffDevOAuth(int i) {
        Log.m8653v(TAG, "getDiffDevOAuth, version = " + i);
        if (i > 1) {
            Log.m8651e(TAG, "getDiffDevOAuth fail, unsupported version = " + i);
            return null;
        } else if (i != 1) {
            return null;
        } else {
            if (v1Instance == null) {
                v1Instance = new C3377a();
            }
            return v1Instance;
        }
    }
}
