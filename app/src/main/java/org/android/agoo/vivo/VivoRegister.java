package org.android.agoo.vivo;

import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.p118pd.sdk.C7227o00ooO0O;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.agoo.BaseNotifyClickActivity;
import com.vivo.push.IPushActionListener;
import com.vivo.push.PushClient;
import com.xiaomi.mipush.sdk.MiPushClient;
import org.android.agoo.control.NotifManager;

public class VivoRegister {
    public static final String TAG = "VivoRegister";
    public static Context mContext;
    public static VivoBadgeReceiver vivoBadgeReceiver;

    public static void register(final Context context) {
        if (context != null) {
            try {
                mContext = context.getApplicationContext();
                if (!UtilityImpl.isMainProcess(context)) {
                    ALog.m7600i(TAG, "not in main process, return", new Object[0]);
                } else if (PushClient.getInstance(context).isSupport()) {
                    ALog.m7597d(TAG, "register start", new Object[0]);
                    BaseNotifyClickActivity.addNotifyListener(new VivoMsgParseImpl());
                    PushClient.getInstance(context).initialize();
                    PushClient.getInstance(context).turnOnPush(new IPushActionListener() {
                        /* class org.android.agoo.vivo.VivoRegister.C48211 */

                        @Override // com.vivo.push.IPushActionListener
                        public void onStateChanged(int i) {
                            ALog.m7597d(VivoRegister.TAG, "turnOnPush", "state", Integer.valueOf(i));
                            if (i == 0) {
                                String regId = PushClient.getInstance(context).getRegId();
                                if (!TextUtils.isEmpty(regId)) {
                                    NotifManager notifManager = new NotifManager();
                                    notifManager.init(context.getApplicationContext());
                                    notifManager.reportThirdPushToken(regId, PushMessageReceiverImpl.VIVO_TOKEN, "1.0.4", true);
                                }
                            }
                        }
                    });
                    vivoBadgeReceiver = new VivoBadgeReceiver();
                    IntentFilter intentFilter = new IntentFilter();
                    intentFilter.addAction(VivoBadgeReceiver.ACTION_MPM_MESSAGE_BOX_UNREAD);
                    C7227o00ooO0O.OooO00o(context).OooO00o(vivoBadgeReceiver, intentFilter);
                } else {
                    ALog.m7599e(TAG, "this device is not support vivo push", new Object[0]);
                }
            } catch (Throwable th) {
                ALog.m7598e(TAG, "register", th, new Object[0]);
            }
        }
    }

    public static void unregister() {
        ALog.m7600i(TAG, MiPushClient.COMMAND_UNREGISTER, new Object[0]);
        if (vivoBadgeReceiver != null) {
            C7227o00ooO0O.OooO00o(mContext).OooO00o(vivoBadgeReceiver);
        }
        PushClient.getInstance(mContext).turnOffPush(new IPushActionListener() {
            /* class org.android.agoo.vivo.VivoRegister.C48222 */

            @Override // com.vivo.push.IPushActionListener
            public void onStateChanged(int i) {
                ALog.m7597d(VivoRegister.TAG, "turnOffPush", "state", Integer.valueOf(i));
            }
        });
    }
}
