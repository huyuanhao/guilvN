package com.taobao.accs;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.SessionCenter;
import anet.channel.entity.ENV;
import com.taobao.accs.ACCSManager;
import com.taobao.accs.AccsClientConfig;
import com.taobao.accs.base.AccsAbstractDataListener;
import com.taobao.accs.base.TaoBaseService;
import com.taobao.accs.client.GlobalClientInfo;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3194w;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ACCSClient {
    public static String TAG = "ACCSClient";
    public static Map<String, ACCSClient> mACCSClients = new ConcurrentHashMap(2);
    public static Context mContext;
    public String OTAG = TAG;
    public AbstractC3099c mAccsManager;
    public AccsClientConfig mConfig;

    public ACCSClient(AccsClientConfig accsClientConfig) {
        this.mConfig = accsClientConfig;
        this.OTAG += accsClientConfig.getTag();
        this.mAccsManager = ACCSManager.getAccsInstance(mContext, accsClientConfig.getAppKey(), accsClientConfig.getTag());
    }

    public static ACCSClient getAccsClient() throws AccsException {
        return getAccsClient(null);
    }

    public static synchronized String init(Context context, String str) throws AccsException {
        String init;
        synchronized (ACCSClient.class) {
            if (context != null) {
                if (!TextUtils.isEmpty(str)) {
                    AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
                    if (!AccsClientConfig.loadedStaticConfig) {
                        configByTag = new AccsClientConfig.Builder().setAppKey(str).build();
                        ALog.m7600i(TAG, "init", "create config, appkey as tag");
                    }
                    init = init(context, configByTag);
                }
            }
            throw new AccsException("params error");
        }
        return init;
    }

    public static synchronized void setEnvironment(Context context, @AccsClientConfig.ENV int i) {
        synchronized (ACCSClient.class) {
            if (context != null) {
                try {
                    if ((context.getApplicationInfo().flags & 2) != 0) {
                        ALog.isUseTlog = false;
                        anet.channel.util.ALog.setUseTlog(false);
                    }
                } catch (Throwable th) {
                    C3194w.m7712a(context, i);
                    throw th;
                }
            }
            if (i < 0 || i > 2) {
                ALog.m7599e(TAG, "env error", "env", Integer.valueOf(i));
                i = 0;
            }
            int i2 = AccsClientConfig.mEnv;
            AccsClientConfig.mEnv = i;
            if (i2 != i && C3194w.m7720e(context)) {
                ALog.m7600i(TAG, "setEnvironment", "preEnv", Integer.valueOf(i2), "toEnv", Integer.valueOf(i));
                C3194w.m7718c(context);
                C3194w.m7721f(context);
                C3194w.m7719d(context);
                if (i == 2) {
                    SessionCenter.switchEnvironment(ENV.TEST);
                } else if (i == 1) {
                    SessionCenter.switchEnvironment(ENV.PREPARE);
                }
                for (Map.Entry<String, ACCSClient> entry : mACCSClients.entrySet()) {
                    try {
                        getAccsClient(entry.getKey());
                    } catch (AccsException e) {
                        ALog.m7598e(TAG, "setEnvironment update client", e, new Object[0]);
                    }
                }
            }
            C3194w.m7712a(context, i);
        }
    }

    private void updateConfig(AccsClientConfig accsClientConfig) {
        this.mConfig = accsClientConfig;
        AbstractC3099c accsInstance = ACCSManager.getAccsInstance(mContext, accsClientConfig.getAppKey(), accsClientConfig.getTag());
        this.mAccsManager = accsInstance;
        if (accsInstance != null) {
            accsInstance.mo37475a(accsClientConfig);
        }
    }

    public void bindApp(String str, IAppReceiver iAppReceiver) {
        AbstractC3099c cVar = this.mAccsManager;
        if (cVar == null) {
            ALog.m7599e(this.OTAG, "bindApp mAccsManager null", new Object[0]);
        } else {
            cVar.mo37473a(mContext, this.mConfig.getAppKey(), this.mConfig.getAppSecret(), str, iAppReceiver);
        }
    }

    public void bindService(String str) {
        AbstractC3099c cVar = this.mAccsManager;
        if (cVar == null) {
            ALog.m7599e(this.OTAG, "bindService mAccsManager null", new Object[0]);
        } else {
            cVar.mo37484b(mContext, str);
        }
    }

    public void bindUser(String str) {
        AbstractC3099c cVar = this.mAccsManager;
        if (cVar == null) {
            ALog.m7599e(this.OTAG, "bindUser mAccsManager null", new Object[0]);
        } else {
            cVar.mo37468a(mContext, str);
        }
    }

    public boolean cancel(String str) {
        AbstractC3099c cVar = this.mAccsManager;
        if (cVar != null) {
            return cVar.mo37479a(str);
        }
        ALog.m7599e(this.OTAG, "cancel mAccsManager null", new Object[0]);
        return false;
    }

    public void clearLoginInfo() {
        AbstractC3099c cVar = this.mAccsManager;
        if (cVar == null) {
            ALog.m7599e(this.OTAG, "clearLoginInfo mAccsManager null", new Object[0]);
        } else {
            cVar.mo37491e(mContext);
        }
    }

    public void forceDisableService() {
        AbstractC3099c cVar = this.mAccsManager;
        if (cVar == null) {
            ALog.m7599e(this.OTAG, "forceDisableService mAccsManager null", new Object[0]);
        } else {
            cVar.mo37487c(mContext);
        }
    }

    public void forceEnableService() {
        AbstractC3099c cVar = this.mAccsManager;
        if (cVar == null) {
            ALog.m7599e(this.OTAG, "forceEnableService mAccsManager null", new Object[0]);
        } else {
            cVar.mo37489d(mContext);
        }
    }

    public Map<String, Boolean> forceReConnectChannel() throws Exception {
        AbstractC3099c cVar = this.mAccsManager;
        if (cVar != null) {
            return cVar.mo37486c();
        }
        ALog.m7599e(this.OTAG, "forceReConnectChannel mAccsManager null", new Object[0]);
        return null;
    }

    public Map<String, Boolean> getChannelState() throws Exception {
        AbstractC3099c cVar = this.mAccsManager;
        if (cVar != null) {
            return cVar.mo37483b();
        }
        ALog.m7599e(this.OTAG, "getChannelState mAccsManager null", new Object[0]);
        return null;
    }

    @Deprecated
    public String getUserUnit() {
        return null;
    }

    public boolean isAccsConnected() {
        AbstractC3099c cVar = this.mAccsManager;
        return cVar != null && cVar.mo37477a();
    }

    public boolean isChannelError(int i) {
        AbstractC3099c cVar = this.mAccsManager;
        if (cVar != null) {
            return cVar.mo37478a(i);
        }
        ALog.m7599e(this.OTAG, "isChannelError mAccsManager null", new Object[0]);
        return true;
    }

    public boolean isNetworkReachable() {
        AbstractC3099c cVar = this.mAccsManager;
        if (cVar != null) {
            return cVar.mo37485b(mContext);
        }
        ALog.m7599e(this.OTAG, "isNetworkReachable mAccsManager null", new Object[0]);
        return false;
    }

    public void registerDataListener(String str, AccsAbstractDataListener accsAbstractDataListener) {
        AbstractC3099c cVar = this.mAccsManager;
        if (cVar == null) {
            ALog.m7599e(this.OTAG, "registerDataListener mAccsManager null", new Object[0]);
        } else {
            cVar.mo37470a(mContext, str, accsAbstractDataListener);
        }
    }

    public void registerSerivce(String str, String str2) {
        AbstractC3099c cVar = this.mAccsManager;
        if (cVar == null) {
            ALog.m7599e(this.OTAG, "registerSerivce mAccsManager null", new Object[0]);
        } else {
            cVar.mo37471a(mContext, str, str2);
        }
    }

    public void sendBusinessAck(String str, String str2, String str3, short s, String str4, Map<Integer, String> map) {
        AbstractC3099c cVar = this.mAccsManager;
        if (cVar == null) {
            ALog.m7599e(this.OTAG, "sendBusinessAck mAccsManager null", new Object[0]);
        } else {
            cVar.mo37476a(str, str2, str3, s, str4, map);
        }
    }

    public String sendData(ACCSManager.AccsRequest accsRequest) {
        AbstractC3099c cVar = this.mAccsManager;
        if (cVar != null) {
            return cVar.mo37459a(mContext, accsRequest);
        }
        ALog.m7599e(this.OTAG, "sendData mAccsManager null", new Object[0]);
        return null;
    }

    public String sendPushResponse(ACCSManager.AccsRequest accsRequest, TaoBaseService.ExtraInfo extraInfo) {
        AbstractC3099c cVar = this.mAccsManager;
        if (cVar != null) {
            return cVar.mo37460a(mContext, accsRequest, extraInfo);
        }
        ALog.m7599e(this.OTAG, "sendPushResponse mAccsManager null", new Object[0]);
        return null;
    }

    public String sendRequest(ACCSManager.AccsRequest accsRequest) {
        AbstractC3099c cVar = this.mAccsManager;
        if (cVar != null) {
            return cVar.mo37480b(mContext, accsRequest);
        }
        ALog.m7599e(this.OTAG, "sendRequest mAccsManager null", new Object[0]);
        return null;
    }

    public void setLoginInfo(ILoginInfo iLoginInfo) {
        AbstractC3099c cVar = this.mAccsManager;
        if (cVar == null) {
            ALog.m7599e(this.OTAG, "setLoginInfo mAccsManager null", new Object[0]);
        } else {
            cVar.mo37467a(mContext, iLoginInfo);
        }
    }

    public void startInAppConnection(String str, IAppReceiver iAppReceiver) {
        AbstractC3099c cVar = this.mAccsManager;
        if (cVar == null) {
            ALog.m7599e(this.OTAG, "startInAppConnection mAccsManager null", new Object[0]);
            return;
        }
        Context context = mContext;
        String appKey = this.mConfig.getAppKey();
        this.mConfig.getAppSecret();
        cVar.mo37472a(context, appKey, str, iAppReceiver);
    }

    public void unRegisterDataListener(String str) {
        AbstractC3099c cVar = this.mAccsManager;
        if (cVar == null) {
            ALog.m7599e(this.OTAG, "unRegisterDataListener mAccsManager null", new Object[0]);
        } else {
            cVar.mo37492e(mContext, str);
        }
    }

    public void unRegisterSerivce(String str) {
        AbstractC3099c cVar = this.mAccsManager;
        if (cVar == null) {
            ALog.m7599e(this.OTAG, "unRegisterSerivce mAccsManager null", new Object[0]);
        } else {
            cVar.mo37490d(mContext, str);
        }
    }

    public void unbindService(String str) {
        AbstractC3099c cVar = this.mAccsManager;
        if (cVar == null) {
            ALog.m7599e(this.OTAG, "unbindService mAccsManager null", new Object[0]);
        } else {
            cVar.mo37488c(mContext, str);
        }
    }

    public void unbindUser() {
        AbstractC3099c cVar = this.mAccsManager;
        if (cVar == null) {
            ALog.m7599e(this.OTAG, "unbindUser mAccsManager null", new Object[0]);
        } else {
            cVar.mo37465a(mContext);
        }
    }

    public static synchronized ACCSClient getAccsClient(String str) throws AccsException {
        synchronized (ACCSClient.class) {
            if (TextUtils.isEmpty(str)) {
                str = AccsClientConfig.DEFAULT_CONFIGTAG;
                ALog.m7603w(TAG, "getAccsClient", "configTag is null, use default!");
            }
            ALog.m7600i(TAG, "getAccsClient", Constants.KEY_CONFIG_TAG, str);
            AccsClientConfig configByTag = AccsClientConfig.getConfigByTag(str);
            if (configByTag != null) {
                ACCSClient aCCSClient = mACCSClients.get(str);
                if (aCCSClient == null) {
                    ALog.m7597d(TAG, "getAccsClient create client", new Object[0]);
                    ACCSClient aCCSClient2 = new ACCSClient(configByTag);
                    mACCSClients.put(str, aCCSClient2);
                    aCCSClient2.updateConfig(configByTag);
                    return aCCSClient2;
                }
                if (configByTag.equals(aCCSClient.mConfig)) {
                    ALog.m7600i(TAG, "getAccsClient exists", new Object[0]);
                } else {
                    ALog.m7600i(TAG, "getAccsClient update config", "old config", aCCSClient.mConfig.getTag(), "new config", configByTag.getTag());
                    aCCSClient.updateConfig(configByTag);
                }
                return aCCSClient;
            }
            ALog.m7599e(TAG, "getAccsClient", "configTag not exist, please init first!!");
            throw new AccsException("configTag not exist");
        }
    }

    public void bindUser(String str, boolean z) {
        AbstractC3099c cVar = this.mAccsManager;
        if (cVar == null) {
            ALog.m7599e(this.OTAG, "bindUser mAccsManager null", new Object[0]);
        } else {
            cVar.mo37474a(mContext, str, z);
        }
    }

    public static synchronized String init(Context context, AccsClientConfig accsClientConfig) throws AccsException {
        String tag;
        synchronized (ACCSClient.class) {
            if (context == null || accsClientConfig == null) {
                throw new AccsException("init AccsClient params error");
            }
            if ((context.getApplicationInfo().flags & 2) != 0) {
                ALog.isUseTlog = false;
                anet.channel.util.ALog.setUseTlog(false);
            }
            mContext = context.getApplicationContext();
            GlobalClientInfo.f6858a = context.getApplicationContext();
            ALog.m7597d(TAG, "init", "config", accsClientConfig);
            tag = accsClientConfig.getTag();
        }
        return tag;
    }
}
