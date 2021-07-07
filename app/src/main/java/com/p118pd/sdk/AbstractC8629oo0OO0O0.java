package com.p118pd.sdk;

import android.content.Context;
import android.widget.Toast;
import com.jinhui365.hotsources.C1414R;
import com.rxhui.android_log_sdk.LogCategory;
import com.rxhui.android_log_sdk.LogCollectorManager;
import com.rxhui.android_log_sdk.LogNetworkType;
import com.rxhui.httpclient.exception.ApiException;
import java.io.IOException;
import java.net.ConnectException;
import java.util.HashMap;
import retrofit2.HttpException;

/* renamed from: com.pd.sdk.oo0OO0O0  reason: case insensitive filesystem */
public abstract class AbstractC8629oo0OO0O0<T> extends AbstractC9508LiLi<T> {
    public static final String o0ooOOo = "BaseSubscriber";
    public Context OooO00o;

    public AbstractC8629oo0OO0O0(Context context) {
        this.OooO00o = context;
    }

    public void OooO00o(String str) {
        if (C8908ooOO0OoO.OooO00o().m20550OooO00o()) {
            String str2 = "Exception_response:" + str;
        }
    }

    public abstract void OooO0OO();

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onCompleted() {
        OooO0OO();
    }

    @Override // com.p118pd.sdk.AbstractC5477Il11
    public void onError(Throwable th) {
        OooO0OO();
        HashMap hashMap = new HashMap();
        hashMap.put("error", th.getLocalizedMessage());
        if (th instanceof ConnectException) {
            Context context = this.OooO00o;
            Toast.makeText(context, context.getString(C1414R.string.tip_net_connect_fault), 0).show();
            LogCollectorManager.sharedInstance().recordWarn(LogCategory.NETWORK, LogNetworkType.NO_NETWORK.getValue(), hashMap);
        } else if (th instanceof HttpException) {
            Context context2 = this.OooO00o;
            Toast.makeText(context2, context2.getString(C1414R.string.tip_fault), 0).show();
            LogCollectorManager.sharedInstance().recordWarn(LogCategory.NETWORK, LogNetworkType.OTHER.getValue(), hashMap);
        } else if (th instanceof ApiException) {
            ApiException apiException = (ApiException) th;
            OooO00o(apiException.getResponse());
            OooO00o(apiException.getErrorCode(), apiException.getErrorMsg());
        } else if (th instanceof IOException) {
            Context context3 = this.OooO00o;
            Toast.makeText(context3, context3.getString(C1414R.string.tip_data_fault), 0).show();
            LogCollectorManager.sharedInstance().recordWarn(LogCategory.NETWORK, LogNetworkType.OTHER.getValue(), hashMap);
        } else {
            LogCollectorManager.sharedInstance().recordWarn(LogCategory.NETWORK, LogNetworkType.OTHER.getValue(), hashMap);
            if (C8908ooOO0OoO.OooO00o().m20550OooO00o()) {
                String str = "Exception:" + th.getClass().getSimpleName() + " Message:" + th.getMessage();
            }
        }
    }

    public void OooO00o(String str, String str2) {
        Toast.makeText(this.OooO00o, str2, 0).show();
    }
}
