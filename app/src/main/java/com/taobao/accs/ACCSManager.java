package com.taobao.accs;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.wireless.security.open.SecurityGuardManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.common.Constants;
import com.taobao.accs.internal.ACCSManagerImpl;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3194w;
import java.io.Serializable;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
public final class ACCSManager {
    public static final String TAG = "ACCSManager";
    public static Map<String, AbstractC3099c> mAccsInstances = new ConcurrentHashMap(2);
    public static Context mContext = null;
    public static String mDefaultAppkey = null;
    public static String mDefaultConfigTag = "default";
    public static int mEnv;

    @Deprecated
    public static void bindApp(Context context, String str, String str2, String str3, IAppReceiver iAppReceiver) {
        if (!TextUtils.isEmpty(mDefaultAppkey)) {
            C3194w.m7711a();
            getManagerImpl(context).mo37473a(context, mDefaultAppkey, str2, str3, iAppReceiver);
            return;
        }
        throw new RuntimeException("old interface!!, please AccsManager.setAppkey() first!");
    }

    @Deprecated
    public static void bindService(Context context, String str) {
        getManagerImpl(context).mo37484b(context, str);
    }

    @Deprecated
    public static void bindUser(Context context, String str) {
        bindUser(context, str, false);
    }

    @Deprecated
    public static void clearLoginInfoImpl(Context context) {
        getManagerImpl(context).mo37491e(context);
    }

    public static AbstractC3099c createAccsInstance(Context context, String str) {
        return new ACCSManagerImpl(context, str);
    }

    public static void forceDisableService(Context context) {
        getManagerImpl(context).mo37487c(context);
    }

    public static void forceEnableService(Context context) {
        getManagerImpl(context).mo37489d(context);
    }

    @Deprecated
    public static Map<String, Boolean> forceReConnectChannel(Context context) throws Exception {
        return getManagerImpl(context).mo37486c();
    }

    public static AbstractC3099c getAccsInstance(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str2)) {
            ALog.m7599e(TAG, "getAccsInstance param null", Constants.KEY_CONFIG_TAG, str2);
            return null;
        }
        String str3 = str2 + "|" + AccsClientConfig.mEnv;
        if (ALog.isPrintLog(ALog.Level.D)) {
            ALog.m7597d(TAG, "getAccsInstance", "key", str3);
        }
        AbstractC3099c cVar = mAccsInstances.get(str3);
        if (cVar == null) {
            synchronized (ACCSManager.class) {
                if (cVar == null) {
                    try {
                        cVar = createAccsInstance(context, str2);
                    } catch (Exception e) {
                        ALog.m7599e(TAG, "createAccsInstance error", e.getMessage());
                    }
                    if (cVar != null) {
                        mAccsInstances.put(str3, cVar);
                    }
                }
            }
        }
        return cVar;
    }

    public static String[] getAppkey(Context context) {
        try {
            String string = context.getSharedPreferences(Constants.SP_FILE_NAME, 0).getString("appkey", null);
            ALog.m7600i(TAG, "getAppkey:" + string, new Object[0]);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return string.split("\\|");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Deprecated
    public static Map<String, Boolean> getChannelState(Context context) throws Exception {
        return getManagerImpl(context).mo37483b();
    }

    @Deprecated
    public static String getDefaultAppkey(Context context) {
        if (TextUtils.isEmpty(mDefaultAppkey)) {
            ALog.m7599e(TAG, "old interface!!, please AccsManager.setAppkey() first!", new Object[0]);
            String b = C3194w.m7717b(context, Constants.SP_KEY_DEFAULT_APPKEY, null);
            mDefaultAppkey = b;
            if (TextUtils.isEmpty(b)) {
                try {
                    mDefaultAppkey = SecurityGuardManager.getInstance(context).getStaticDataStoreComp().getAppKeyByIndex(0, (String) null);
                } catch (Throwable th) {
                    ALog.m7598e(TAG, "getDefaultAppkey", th, new Object[0]);
                }
            }
            if (TextUtils.isEmpty(mDefaultAppkey)) {
                mDefaultAppkey = "0";
            }
        }
        return mDefaultAppkey;
    }

    public static String getDefaultConfig(Context context) {
        return mDefaultConfigTag;
    }

    public static synchronized AbstractC3099c getManagerImpl(Context context) {
        AbstractC3099c accsInstance;
        synchronized (ACCSManager.class) {
            accsInstance = getAccsInstance(context, null, getDefaultConfig(context));
        }
        return accsInstance;
    }

    @Deprecated
    public static String getUserUnit(Context context) {
        return null;
    }

    @Deprecated
    public static boolean isAccsConnected(Context context) {
        return getManagerImpl(context).mo37477a();
    }

    @Deprecated
    public static boolean isChannelError(Context context, int i) {
        return getManagerImpl(context).mo37478a(i);
    }

    @Deprecated
    public static boolean isNetworkReachable(Context context) {
        return getManagerImpl(context).mo37485b(context);
    }

    @Deprecated
    public static void registerDataListener(Context context, String str, AccsAbstractDataListener accsAbstractDataListener) {
        if (getManagerImpl(context) == null) {
            ALog.m7599e(TAG, "getManagerImpl null, return", new Object[0]);
        } else {
            getManagerImpl(context).mo37470a(context, str, accsAbstractDataListener);
        }
    }

    @Deprecated
    public static void registerSerivce(Context context, String str, String str2) {
        getManagerImpl(context).mo37471a(context, str, str2);
    }

    @Deprecated
    public static String sendData(Context context, String str, String str2, byte[] bArr, String str3) {
        return getManagerImpl(context).mo37462a(context, str, str2, bArr, str3);
    }

    @Deprecated
    public static String sendPushResponse(Context context, AccsRequest accsRequest, TaoBaseService.ExtraInfo extraInfo) {
        return getManagerImpl(context).mo37460a(context, accsRequest, extraInfo);
    }

    @Deprecated
    public static String sendRequest(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url) {
        return getManagerImpl(context).mo37482b(context, str, str2, bArr, str3, str4, url);
    }

    @Deprecated
    public static void setAppkey(Context context, String str, @AccsClientConfig.ENV int i) {
        C3194w.m7713a(context, str);
        Context applicationContext = context.getApplicationContext();
        mContext = applicationContext;
        mDefaultAppkey = str;
        C3194w.m7714a(applicationContext, Constants.SP_KEY_DEFAULT_APPKEY, str);
        mEnv = i;
        AccsClientConfig.mEnv = i;
    }

    @Deprecated
    public static void setDefaultConfig(Context context, String str) {
        if (!TextUtils.isEmpty(str)) {
            ALog.m7600i(TAG, "setDefaultConfig", Constants.KEY_CONFIG_TAG, str);
            mDefaultConfigTag = str;
        }
    }

    @Deprecated
    public static void setLoginInfoImpl(Context context, ILoginInfo iLoginInfo) {
        getManagerImpl(context).mo37467a(context, iLoginInfo);
    }

    @Deprecated
    public static void setMode(Context context, int i) {
        mEnv = i;
        getManagerImpl(context).mo37466a(context, i);
    }

    @Deprecated
    public static void setProxy(Context context, String str, int i) {
        getManagerImpl(context).mo37469a(context, str, i);
    }

    @Deprecated
    public static void setServiceListener(Context context, String str, IServiceReceiver iServiceReceiver) {
    }

    @Deprecated
    public static void startInAppConnection(Context context, String str, String str2, String str3, IAppReceiver iAppReceiver) {
        C3194w.m7711a();
        getManagerImpl(context).mo37472a(context, mDefaultAppkey, str3, iAppReceiver);
    }

    @Deprecated
    public static void unRegisterDataListener(Context context, String str) {
        getManagerImpl(context).mo37492e(context, str);
    }

    @Deprecated
    public static void unbindApp(Context context) {
    }

    @Deprecated
    public static void unbindService(Context context, String str) {
        getManagerImpl(context).mo37488c(context, str);
    }

    @Deprecated
    public static void unbindUser(Context context) {
        getManagerImpl(context).mo37465a(context);
    }

    @Deprecated
    public static void unregisterService(Context context, String str) {
        getManagerImpl(context).mo37490d(context, str);
    }

    @Deprecated
    public static void bindUser(Context context, String str, boolean z) {
        if (!TextUtils.isEmpty(mDefaultAppkey)) {
            getManagerImpl(context).mo37474a(context, str, z);
            return;
        }
        throw new RuntimeException("old interface!!, please AccsManager.setAppkey() first!");
    }

    @Deprecated
    public static String sendData(Context context, String str, String str2, byte[] bArr, String str3, String str4, URL url) {
        return getManagerImpl(context).mo37464a(context, str, str2, bArr, str3, str4, url);
    }

    @Deprecated
    public static String sendRequest(Context context, String str, String str2, byte[] bArr, String str3) {
        return sendRequest(context, str, str2, bArr, str3, null);
    }

    @Deprecated
    public static String sendData(Context context, String str, String str2, byte[] bArr, String str3, String str4) {
        return getManagerImpl(context).mo37463a(context, str, str2, bArr, str3, str4);
    }

    @Deprecated
    public static String sendRequest(Context context, String str, String str2, byte[] bArr, String str3, String str4) {
        return getManagerImpl(context).mo37481b(context, str, str2, bArr, str3, str4);
    }

    @Deprecated
    public static void startInAppConnection(Context context, String str, String str2, IAppReceiver iAppReceiver) {
        startInAppConnection(context, mDefaultAppkey, "", str2, iAppReceiver);
    }

    @Deprecated
    public static String sendData(Context context, AccsRequest accsRequest) {
        return getManagerImpl(context).mo37459a(context, accsRequest);
    }

    @Deprecated
    public static String sendRequest(Context context, AccsRequest accsRequest) {
        return getManagerImpl(context).mo37480b(context, accsRequest);
    }

    @Deprecated
    public static void bindApp(Context context, String str, String str2, IAppReceiver iAppReceiver) {
        bindApp(context, mDefaultAppkey, "", str2, iAppReceiver);
    }

    public static class AccsRequest implements Serializable {
        public String businessId;
        public byte[] data;
        public String dataId;
        public URL host;
        public boolean isUnitBusiness = false;
        public String serviceId;
        public String tag;
        public String target;
        public String targetServiceName;
        public int timeout;
        public String userId;

        public AccsRequest(String str, String str2, byte[] bArr, String str3, String str4, URL url, String str5) {
            this.userId = str;
            this.serviceId = str2;
            this.data = bArr;
            this.dataId = str3;
            this.target = str4;
            this.host = url;
            this.businessId = str5;
        }

        public void setBusinessId(String str) {
            this.businessId = str;
        }

        public void setHost(URL url) {
            this.host = url;
        }

        public void setIsUnitBusiness(boolean z) {
            this.isUnitBusiness = z;
        }

        public void setTag(String str) {
            this.tag = str;
        }

        public void setTarget(String str) {
            this.target = str;
        }

        public void setTargetServiceName(String str) {
            this.targetServiceName = str;
        }

        public void setTimeOut(int i) {
            this.timeout = i;
        }

        public AccsRequest(String str, String str2, byte[] bArr, String str3) {
            this.userId = str;
            this.serviceId = str2;
            this.data = bArr;
            this.dataId = str3;
        }
    }
}
