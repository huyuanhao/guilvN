package com.p118pd.sdk;

import android.content.Context;
import android.util.Log;
import androidx.annotation.NonNull;
import com.p118pd.sdk.AbstractC8217oOOoOOO0;

/* renamed from: com.pd.sdk.oO00OoOo  reason: case insensitive filesystem */
public class C7808oO00OoOo implements AbstractC7807oO00OoOO {
    public static final String OooO00o = "ConnectivityMonitor";
    public static final String OooO0O0 = "android.permission.ACCESS_NETWORK_STATE";

    @Override // com.p118pd.sdk.AbstractC7807oO00OoOO
    @NonNull
    public AbstractC8217oOOoOOO0 OooO00o(@NonNull Context context, @NonNull AbstractC8217oOOoOOO0.OooO00o oooO00o) {
        boolean z = C7009o000OoOo.OooO00o(context, "android.permission.ACCESS_NETWORK_STATE") == 0;
        Log.isLoggable("ConnectivityMonitor", 3);
        return z ? new C7960oO0oOOOo(context, oooO00o) : new C7879oO0OOoOo();
    }
}
