package org.android.agoo.huawei;

import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.facebook.react.devsupport.WebsocketJavaScriptExecutor;
import com.p118pd.sdk.AbstractC8435oOooO0o;
import com.p118pd.sdk.AbstractC8451oOooOo0;
import com.p118pd.sdk.C8417oOoo0o0O;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.BaseMonitor;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.agoo.BaseNotifyClickActivity;
import org.android.agoo.common.AgooConstants;

public class HuaWeiRegister {
    public static final String TAG = "HuaWeiRegister";
    public static boolean isChannelRegister;

    public static boolean checkDevice() {
        return Build.BRAND.equalsIgnoreCase(AgooConstants.MESSAGE_SYSTEM_SOURCE_HUAWEI) || Build.BRAND.equalsIgnoreCase("honor");
    }

    public static void getToken() {
        C8417oOoo0o0O.OooO0OO.OooO00o(new AbstractC8451oOooOo0() {
            /* class org.android.agoo.huawei.HuaWeiRegister.C48092 */

            @Override // com.p118pd.sdk.AbstractC8437oOooO0oO
            public void onResult(int i) {
                ALog.m7600i(HuaWeiRegister.TAG, "getToken", "result", Integer.valueOf(i));
            }
        });
    }

    public static void register(Application application) {
        registerBundle(application, false);
    }

    public static void registerBundle(Application application, boolean z) {
        try {
            isChannelRegister = z;
            if (!z && !UtilityImpl.isMainProcess(application)) {
                ALog.m7599e(TAG, "register not in main process, return", new Object[0]);
            } else if (checkDevice()) {
                C8417oOoo0o0O.OooO00o(application);
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
                    /* class org.android.agoo.huawei.HuaWeiRegister.RunnableC48071 */

                    public void run() {
                        ALog.m7600i(HuaWeiRegister.TAG, "register begin", "isChannel", Boolean.valueOf(HuaWeiRegister.isChannelRegister));
                        BaseNotifyClickActivity.addNotifyListener(new HuaweiMsgParseImpl());
                        C8417oOoo0o0O.OooO00o((Activity) null, new AbstractC8435oOooO0o() {
                            /* class org.android.agoo.huawei.HuaWeiRegister.RunnableC48071.C48081 */

                            @Override // com.p118pd.sdk.AbstractC8435oOooO0o
                            public void onConnect(int i) {
                                ALog.m7600i(HuaWeiRegister.TAG, BaseMonitor.ALARM_POINT_CONNECT, "result", Integer.valueOf(i));
                                if (i == 0) {
                                    HuaWeiRegister.getToken();
                                }
                            }
                        });
                    }
                }, WebsocketJavaScriptExecutor.CONNECT_TIMEOUT_MS);
            } else {
                ALog.m7599e(TAG, "register checkDevice false", new Object[0]);
            }
        } catch (Throwable th) {
            ALog.m7598e(TAG, "register", th, new Object[0]);
        }
    }
}
