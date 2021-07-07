package org.android.agoo.oppo;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.p118pd.sdk.AbstractC8394oOoo000O;
import com.p118pd.sdk.C8379oOoOoOo;
import com.p118pd.sdk.C8392oOoo000;
import com.p118pd.sdk.C8407oOoo0OO0;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.UtilityImpl;
import com.taobao.agoo.BaseNotifyClickActivity;
import com.xiaomi.mipush.sdk.MiPushClient;
import java.util.List;
import org.android.agoo.control.NotifManager;

public class OppoRegister {
    public static final String OPPO_TOKEN = "OPPO_TOKEN";
    public static final String TAG = "OppoPush";
    public static Context mContext;
    public static AbstractC8394oOoo000O mPushCallback = new C8392oOoo000() {
        /* class org.android.agoo.oppo.OppoRegister.C48161 */

        @Override // com.p118pd.sdk.C8392oOoo000, com.p118pd.sdk.AbstractC8394oOoo000O
        public void onGetAliases(int i, List<C8407oOoo0OO0> list) {
        }

        @Override // com.p118pd.sdk.C8392oOoo000, com.p118pd.sdk.AbstractC8394oOoo000O
        public void onGetNotificationStatus(int i, int i2) {
        }

        @Override // com.p118pd.sdk.C8392oOoo000, com.p118pd.sdk.AbstractC8394oOoo000O
        public void onGetPushStatus(int i, int i2) {
        }

        @Override // com.p118pd.sdk.C8392oOoo000, com.p118pd.sdk.AbstractC8394oOoo000O
        public void onGetTags(int i, List<C8407oOoo0OO0> list) {
        }

        @Override // com.p118pd.sdk.C8392oOoo000, com.p118pd.sdk.AbstractC8394oOoo000O
        public void onGetUserAccounts(int i, List<C8407oOoo0OO0> list) {
        }

        @Override // com.p118pd.sdk.C8392oOoo000, com.p118pd.sdk.AbstractC8394oOoo000O
        public void onRegister(int i, String str) {
            if (i == 0) {
                ALog.m7600i(OppoRegister.TAG, "onRegister regid=" + str, new Object[0]);
                OppoRegister.reportToken(OppoRegister.mContext, str);
                return;
            }
            ALog.m7599e(OppoRegister.TAG, "onRegister code=" + i + ",regid=" + str, new Object[0]);
        }

        @Override // com.p118pd.sdk.C8392oOoo000, com.p118pd.sdk.AbstractC8394oOoo000O
        public void onSetAliases(int i, List<C8407oOoo0OO0> list) {
        }

        @Override // com.p118pd.sdk.C8392oOoo000, com.p118pd.sdk.AbstractC8394oOoo000O
        public void onSetPushTime(int i, String str) {
        }

        @Override // com.p118pd.sdk.C8392oOoo000, com.p118pd.sdk.AbstractC8394oOoo000O
        public void onSetTags(int i, List<C8407oOoo0OO0> list) {
        }

        @Override // com.p118pd.sdk.C8392oOoo000, com.p118pd.sdk.AbstractC8394oOoo000O
        public void onSetUserAccounts(int i, List<C8407oOoo0OO0> list) {
        }

        @Override // com.p118pd.sdk.C8392oOoo000, com.p118pd.sdk.AbstractC8394oOoo000O
        public void onUnRegister(int i) {
            Log.i(OppoRegister.TAG, "onUnRegister code=" + i);
        }

        @Override // com.p118pd.sdk.C8392oOoo000, com.p118pd.sdk.AbstractC8394oOoo000O
        public void onUnsetAliases(int i, List<C8407oOoo0OO0> list) {
        }

        @Override // com.p118pd.sdk.C8392oOoo000, com.p118pd.sdk.AbstractC8394oOoo000O
        public void onUnsetTags(int i, List<C8407oOoo0OO0> list) {
        }

        @Override // com.p118pd.sdk.C8392oOoo000, com.p118pd.sdk.AbstractC8394oOoo000O
        public void onUnsetUserAccounts(int i, List<C8407oOoo0OO0> list) {
        }
    };

    public static void pausePush() {
        ALog.m7603w(TAG, "pausePush", new Object[0]);
        C8379oOoOoOo.OooO00o().OooO0Oo();
    }

    public static void register(Context context, String str, String str2) {
        try {
            Context applicationContext = context.getApplicationContext();
            mContext = applicationContext;
            if (!UtilityImpl.isMainProcess(applicationContext)) {
                ALog.m7600i(TAG, "not in main process, return", new Object[0]);
            } else if (C8379oOoOoOo.m20053OooO00o(mContext)) {
                BaseNotifyClickActivity.addNotifyListener(new OppoMsgParseImpl());
                AbstractC8394oOoo000O oooo000o = mPushCallback;
                ALog.m7600i(TAG, "register oppo begin ", new Object[0]);
                C8379oOoOoOo.OooO00o().OooO00o(mContext, str, str2, oooo000o);
            } else {
                ALog.m7600i(TAG, "not support oppo push", new Object[0]);
            }
        } catch (Throwable th) {
            ALog.m7598e(TAG, "register error", th, new Object[0]);
        }
    }

    public static void reportToken(Context context, String str) {
        if (!TextUtils.isEmpty(str) && context != null) {
            NotifManager notifManager = new NotifManager();
            notifManager.init(context.getApplicationContext());
            notifManager.reportThirdPushToken(str, OPPO_TOKEN, false);
        }
    }

    public static void resumePush() {
        ALog.m7603w(TAG, "resumePush", new Object[0]);
        C8379oOoOoOo.OooO00o().OooO0o0();
    }

    public static void setPushCallback(AbstractC8394oOoo000O oooo000o) {
        ALog.m7600i(TAG, "setPushCallback", new Object[0]);
        C8379oOoOoOo.OooO00o().OooO00o(oooo000o);
    }

    public static void unregister() {
        ALog.m7600i(TAG, MiPushClient.COMMAND_UNREGISTER, new Object[0]);
        C8379oOoOoOo.OooO00o().unRegister();
    }
}
