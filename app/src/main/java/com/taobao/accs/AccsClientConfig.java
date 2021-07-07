package com.taobao.accs;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.ALog;
import com.taobao.accs.utl.C3194w;
import java.io.Serializable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AccsClientConfig implements Serializable {
    public static final String[] DEFAULT_CENTER_HOSTS = {"msgacs.m.taobao.com", "msgacs.wapa.taobao.com", "msgacs.waptest.taobao.com"};
    public static final String[] DEFAULT_CHANNEL_HOSTS = {"accscdn.m.taobao.com", "acs.wapa.taobao.com", "acs.waptest.taobao.com"};
    public static final String DEFAULT_CONFIGTAG = "default";
    public static final int SECURITY_OFF = 2;
    public static final int SECURITY_OPEN = 1;
    public static final int SECURITY_TAOBAO = 0;
    public static final String TAG = "AccsClientConfig";
    public static boolean loadedStaticConfig = true;
    public static Context mContext;
    public static Map<String, AccsClientConfig> mDebugConfigs = new ConcurrentHashMap(1);
    @ENV
    public static int mEnv;
    public static Map<String, AccsClientConfig> mPreviewConfigs = new ConcurrentHashMap(1);
    public static Map<String, AccsClientConfig> mReleaseConfigs = new ConcurrentHashMap(1);
    public boolean mAccsHeartbeatEnable;
    public String mAppKey;
    public String mAppSecret;
    public String mAuthCode;
    public boolean mAutoUnit;
    public String mChannelHost;
    public int mChannelPubKey;
    public int mConfigEnv;
    public boolean mDisableChannel;
    public String mInappHost;
    public int mInappPubKey;
    public boolean mKeepalive;
    public boolean mQuickReconnect;
    public int mSecurity;
    public String mStoreId;
    public String mTag;

    public static class Builder {
        public boolean mAccsHeartbeatEnable = false;
        public String mAppKey = "";
        public String mAppSecret = "";
        public String mAuthCode = "";
        public boolean mAutoUnit = true;
        public String mChannelHost = "";
        public int mChannelPubKey = -1;
        public int mConfigEnv = -1;
        public boolean mDisableChannel = false;
        public String mInappHost = "";
        public int mInappPubKey = -1;
        public boolean mKeepalive = true;
        public boolean mQuickReconnect = false;
        public String mStoreId = "";
        public String mTag = "";

        public AccsClientConfig build() throws AccsException {
            Map<String, AccsClientConfig> map;
            if (!TextUtils.isEmpty(this.mAppKey)) {
                AccsClientConfig accsClientConfig = new AccsClientConfig();
                accsClientConfig.mAppKey = this.mAppKey;
                accsClientConfig.mAppSecret = this.mAppSecret;
                accsClientConfig.mAuthCode = this.mAuthCode;
                accsClientConfig.mKeepalive = this.mKeepalive;
                accsClientConfig.mAutoUnit = this.mAutoUnit;
                accsClientConfig.mInappPubKey = this.mInappPubKey;
                accsClientConfig.mChannelPubKey = this.mChannelPubKey;
                accsClientConfig.mInappHost = this.mInappHost;
                accsClientConfig.mChannelHost = this.mChannelHost;
                accsClientConfig.mTag = this.mTag;
                accsClientConfig.mStoreId = this.mStoreId;
                accsClientConfig.mConfigEnv = this.mConfigEnv;
                accsClientConfig.mDisableChannel = this.mDisableChannel;
                accsClientConfig.mQuickReconnect = this.mQuickReconnect;
                accsClientConfig.mAccsHeartbeatEnable = this.mAccsHeartbeatEnable;
                if (accsClientConfig.mConfigEnv < 0) {
                    accsClientConfig.mConfigEnv = AccsClientConfig.mEnv;
                }
                if (TextUtils.isEmpty(accsClientConfig.mAppSecret)) {
                    accsClientConfig.mSecurity = 0;
                } else {
                    accsClientConfig.mSecurity = 2;
                }
                if (TextUtils.isEmpty(accsClientConfig.mInappHost)) {
                    accsClientConfig.mInappHost = AccsClientConfig.DEFAULT_CENTER_HOSTS[accsClientConfig.mConfigEnv];
                }
                if (TextUtils.isEmpty(accsClientConfig.mChannelHost)) {
                    accsClientConfig.mChannelHost = AccsClientConfig.DEFAULT_CHANNEL_HOSTS[accsClientConfig.mConfigEnv];
                }
                if (TextUtils.isEmpty(accsClientConfig.mTag)) {
                    accsClientConfig.mTag = accsClientConfig.mAppKey;
                }
                int i = accsClientConfig.mConfigEnv;
                if (i == 1) {
                    map = AccsClientConfig.mPreviewConfigs;
                } else if (i != 2) {
                    map = AccsClientConfig.mReleaseConfigs;
                } else {
                    map = AccsClientConfig.mDebugConfigs;
                }
                ALog.m7597d(AccsClientConfig.TAG, "build", "config", accsClientConfig);
                AccsClientConfig accsClientConfig2 = map.get(accsClientConfig.getTag());
                if (accsClientConfig2 != null) {
                    ALog.m7603w(AccsClientConfig.TAG, "build conver", "old config", accsClientConfig2);
                }
                map.put(accsClientConfig.getTag(), accsClientConfig);
                return accsClientConfig;
            }
            throw new AccsException("appkey null");
        }

        public Builder setAccsHeartbeatEnable(boolean z) {
            this.mAccsHeartbeatEnable = z;
            return this;
        }

        public Builder setAppKey(String str) {
            this.mAppKey = str;
            return this;
        }

        public Builder setAppSecret(String str) {
            this.mAppSecret = str;
            return this;
        }

        public Builder setAutoCode(String str) {
            this.mAuthCode = str;
            return this;
        }

        public Builder setAutoUnit(boolean z) {
            this.mAutoUnit = z;
            return this;
        }

        public Builder setChannelHost(String str) {
            this.mChannelHost = str;
            return this;
        }

        public Builder setChannelPubKey(int i) {
            this.mChannelPubKey = i;
            return this;
        }

        public Builder setConfigEnv(@ENV int i) {
            this.mConfigEnv = i;
            return this;
        }

        public Builder setDisableChannel(boolean z) {
            this.mDisableChannel = z;
            return this;
        }

        public Builder setInappHost(String str) {
            this.mInappHost = str;
            return this;
        }

        public Builder setInappPubKey(int i) {
            this.mInappPubKey = i;
            return this;
        }

        public Builder setKeepAlive(boolean z) {
            this.mKeepalive = z;
            return this;
        }

        public Builder setQuickReconnect(boolean z) {
            this.mQuickReconnect = z;
            return this;
        }

        public Builder setStoreId(String str) {
            this.mStoreId = str;
            return this;
        }

        public Builder setTag(String str) {
            this.mTag = str;
            return this;
        }
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface ENV {
    }

    @Retention(RetentionPolicy.CLASS)
    public @interface SECURITY_TYPE {
    }

    static {
        int i;
        Throwable th;
        int i2;
        String[] strArr;
        int i3;
        String str;
        boolean z = true;
        try {
            Bundle g = C3194w.m7722g(getContext());
            if (g != null) {
                String str2 = null;
                String string = g.getString("accsConfigTags", null);
                ALog.m7600i(TAG, "init config from xml", "configtags", string);
                if (!TextUtils.isEmpty(string)) {
                    String[] split = string.split("\\|");
                    if (split == null) {
                        split = new String[]{string};
                    }
                    int length = split.length;
                    int i4 = 0;
                    while (i4 < length) {
                        String str3 = split[i4];
                        if (TextUtils.isEmpty(str3)) {
                            i3 = length;
                            strArr = split;
                            i2 = i4;
                        } else {
                            int i5 = g.getInt(str3 + "_accsAppkey", -1);
                            if (i5 < 0) {
                                str = str2;
                            } else {
                                str = String.valueOf(i5);
                            }
                            String string2 = g.getString(str3 + "_accsAppSecret");
                            String string3 = g.getString(str3 + "_authCode");
                            boolean z2 = g.getBoolean(str3 + "_keepAlive", z);
                            boolean z3 = g.getBoolean(str3 + "_autoUnit", z);
                            int i6 = g.getInt(str3 + "_inappPubkey", -1);
                            int i7 = g.getInt(str3 + "_channelPubkey", -1);
                            String string4 = g.getString(str3 + "_inappHost");
                            StringBuilder sb = new StringBuilder();
                            sb.append(str3);
                            i3 = length;
                            sb.append("_channelHost");
                            String string5 = g.getString(sb.toString());
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(str3);
                            strArr = split;
                            sb2.append("_configEnv");
                            int i8 = g.getInt(sb2.toString(), 0);
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(str3);
                            i2 = i4;
                            sb3.append("_disableChannel");
                            boolean z4 = g.getBoolean(sb3.toString());
                            if (!TextUtils.isEmpty(str)) {
                                new Builder().setTag(str3).setConfigEnv(i8).setAppKey(str).setAppSecret(string2).setAutoCode(string3).setKeepAlive(z2).setAutoUnit(z3).setInappHost(string4).setInappPubKey(i6).setChannelHost(string5).setChannelPubKey(i7).setDisableChannel(z4).build();
                                i = 0;
                                try {
                                    ALog.m7600i(TAG, "init config from xml", new Object[0]);
                                } catch (Throwable th2) {
                                    th = th2;
                                    ALog.m7598e(TAG, "init config from xml", th, new Object[i]);
                                }
                            }
                        }
                        i4 = i2 + 1;
                        length = i3;
                        split = strArr;
                        str2 = null;
                        z = true;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            i = 0;
            ALog.m7598e(TAG, "init config from xml", th, new Object[i]);
        }
    }

    @Deprecated
    public static AccsClientConfig getConfig(String str) {
        Map<String, AccsClientConfig> map;
        int i = mEnv;
        if (i == 1) {
            map = mPreviewConfigs;
        } else if (i != 2) {
            map = mReleaseConfigs;
        } else {
            map = mDebugConfigs;
        }
        for (AccsClientConfig accsClientConfig : map.values()) {
            if (accsClientConfig.mAppKey.equals(str) && accsClientConfig.mConfigEnv == mEnv) {
                return accsClientConfig;
            }
        }
        ALog.m7599e(TAG, "getConfigByTag return null", "appkey", str);
        return null;
    }

    public static AccsClientConfig getConfigByTag(String str) {
        AccsClientConfig accsClientConfig;
        int i = mEnv;
        if (i == 0) {
            accsClientConfig = mReleaseConfigs.get(str);
        } else if (i == 1) {
            accsClientConfig = mPreviewConfigs.get(str);
        } else if (i != 2) {
            accsClientConfig = mReleaseConfigs.get(str);
        } else {
            accsClientConfig = mDebugConfigs.get(str);
        }
        if (accsClientConfig == null) {
            ALog.m7599e(TAG, "getConfigByTag return null", Constants.KEY_CONFIG_TAG, str);
        }
        return accsClientConfig;
    }

    public static Context getContext() {
        Context context = mContext;
        if (context != null) {
            return context;
        }
        synchronized (AccsClientConfig.class) {
            if (mContext != null) {
                return mContext;
            }
            try {
                Class<?> cls = Class.forName("android.app.ActivityThread");
                Object invoke = cls.getMethod("currentActivityThread", new Class[0]).invoke(cls, new Object[0]);
                mContext = (Context) invoke.getClass().getMethod("getApplication", new Class[0]).invoke(invoke, new Object[0]);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return mContext;
        }
    }

    public static void setAccsConfig(int i, AccsClientConfig accsClientConfig) {
        Map<String, AccsClientConfig> map;
        if (i == 1) {
            map = mPreviewConfigs;
        } else if (i != 2) {
            map = mReleaseConfigs;
        } else {
            map = mDebugConfigs;
        }
        AccsClientConfig accsClientConfig2 = map.get(accsClientConfig.getTag());
        if (accsClientConfig2 != null) {
            ALog.m7603w(TAG, "build conver", "old config", accsClientConfig2);
        }
        map.put(accsClientConfig.getTag(), accsClientConfig);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AccsClientConfig)) {
            return false;
        }
        AccsClientConfig accsClientConfig = (AccsClientConfig) obj;
        if (this.mSecurity == accsClientConfig.mSecurity && this.mInappPubKey == accsClientConfig.mInappPubKey && this.mChannelPubKey == accsClientConfig.mChannelPubKey && this.mKeepalive == accsClientConfig.mKeepalive && this.mAutoUnit == accsClientConfig.mAutoUnit && this.mConfigEnv == accsClientConfig.mConfigEnv && this.mDisableChannel == accsClientConfig.mDisableChannel && this.mQuickReconnect == accsClientConfig.mQuickReconnect && this.mAccsHeartbeatEnable == accsClientConfig.mAccsHeartbeatEnable && this.mAppKey.equals(accsClientConfig.mAppKey) && this.mAppSecret.equals(accsClientConfig.mAppSecret) && this.mInappHost.equals(accsClientConfig.mInappHost) && this.mChannelHost.equals(accsClientConfig.mChannelHost) && this.mStoreId.equals(accsClientConfig.mStoreId) && this.mAuthCode.equals(accsClientConfig.mAuthCode) && this.mTag.equals(accsClientConfig.mTag)) {
            return true;
        }
        return false;
    }

    public String getAppKey() {
        return this.mAppKey;
    }

    public String getAppSecret() {
        return this.mAppSecret;
    }

    public String getAuthCode() {
        return this.mAuthCode;
    }

    public String getChannelHost() {
        return this.mChannelHost;
    }

    public int getChannelPubKey() {
        return this.mChannelPubKey;
    }

    public int getConfigEnv() {
        return this.mConfigEnv;
    }

    public boolean getDisableChannel() {
        return this.mDisableChannel;
    }

    public String getInappHost() {
        return this.mInappHost;
    }

    public int getInappPubKey() {
        return this.mInappPubKey;
    }

    public int getSecurity() {
        return this.mSecurity;
    }

    public String getStoreId() {
        return this.mStoreId;
    }

    public String getTag() {
        return this.mTag;
    }

    public boolean isAccsHeartbeatEnable() {
        return this.mAccsHeartbeatEnable;
    }

    public boolean isAutoUnit() {
        return this.mAutoUnit;
    }

    public boolean isKeepalive() {
        return this.mKeepalive;
    }

    public boolean isQuickReconnect() {
        return this.mQuickReconnect;
    }

    public String toString() {
        return "AccsClientConfig{" + "Tag=" + this.mTag + ", ConfigEnv=" + this.mConfigEnv + ", AppKey=" + this.mAppKey + ", AppSecret=" + this.mAppSecret + ", InappHost=" + this.mInappHost + ", ChannelHost=" + this.mChannelHost + ", Security=" + this.mSecurity + ", AuthCode=" + this.mAuthCode + ", InappPubKey=" + this.mInappPubKey + ", ChannelPubKey=" + this.mChannelPubKey + ", Keepalive=" + this.mKeepalive + ", AutoUnit=" + this.mAutoUnit + ", DisableChannel=" + this.mDisableChannel + ", QuickReconnect=" + this.mQuickReconnect + C7522o0Ooo0o.OooO0Oo;
    }
}
