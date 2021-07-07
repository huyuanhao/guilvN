package com.umeng.socialize.utils;

import android.content.Context;
import android.os.Build;
import com.p118pd.sdk.C8932ooOOO0o;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.common.SocializeConstants;

public class URLBuilder {
    public String imei = null;
    public String mAppkey = null;
    public String mEntityKey = null;
    public String mHost = null;
    public String mOpId = null;
    public String mPath = null;
    public String mPlatfrom = null;
    public String mReqType = "0";
    public String mSessionId = null;
    public String mUID = null;
    public String mac = null;
    public String model = null;
    public String network = null;

    /* renamed from: os */
    public String f10866os = null;
    public String protoversion = null;
    public String sdkversion = null;

    /* renamed from: ts */
    public String f10867ts = null;

    public URLBuilder(Context context) {
        this.imei = DeviceConfig.getDeviceId(context);
        this.mac = DeviceConfig.getMac(context);
        this.network = DeviceConfig.getNetworkAccessMode(context)[0];
        this.model = Build.MODEL;
        this.sdkversion = "7.0.2";
        this.f10866os = "Android";
        this.f10867ts = String.valueOf(System.currentTimeMillis());
        this.protoversion = SocializeConstants.PROTOCOL_VERSON;
    }

    private String buildParams() {
        StringBuilder sb = new StringBuilder();
        sb.append("via=");
        sb.append(this.mPlatfrom.toLowerCase());
        sb.append("&opid=");
        sb.append(this.mOpId);
        sb.append("&ak=");
        sb.append(this.mAppkey);
        sb.append("&pcv=");
        sb.append(this.protoversion);
        sb.append("&tp=");
        sb.append(this.mReqType);
        if (this.imei != null) {
            sb.append("&imei=");
            sb.append(this.imei);
        }
        if (this.mac != null) {
            sb.append("&mac=");
            sb.append(this.mac);
        }
        if (this.network != null) {
            sb.append("&en=");
            sb.append(this.network);
        }
        if (this.model != null) {
            sb.append("&de=");
            sb.append(this.model);
        }
        if (this.sdkversion != null) {
            sb.append("&sdkv=");
            sb.append(this.sdkversion);
        }
        if (this.f10866os != null) {
            sb.append("&os=");
            sb.append(this.f10866os);
        }
        if (this.f10867ts != null) {
            sb.append("&dt=");
            sb.append(this.f10867ts);
        }
        if (this.mUID != null) {
            sb.append("&uid=");
            sb.append(this.mUID);
        }
        if (this.mEntityKey != null) {
            sb.append("&ek=");
            sb.append(this.mEntityKey);
        }
        if (this.mSessionId != null) {
            sb.append("&sid=");
            sb.append(this.mSessionId);
        }
        return sb.toString();
    }

    public URLBuilder setAppkey(String str) {
        this.mAppkey = str;
        return this;
    }

    public URLBuilder setEntityKey(String str) {
        this.mEntityKey = str;
        return this;
    }

    public URLBuilder setHost(String str) {
        this.mHost = str;
        return this;
    }

    public URLBuilder setPath(String str) {
        this.mPath = str;
        return this;
    }

    /* renamed from: to */
    public String mo40753to() {
        return this.mHost + this.mPath + this.mAppkey + C8932ooOOO0o.OooO0OO + this.mEntityKey + "/?" + buildParams();
    }

    public String toEncript() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.mHost);
        sb.append(this.mPath);
        sb.append(this.mAppkey);
        sb.append(C8932ooOOO0o.OooO0OO);
        sb.append(this.mEntityKey);
        sb.append("/?");
        String buildParams = buildParams();
        try {
            sb.append(buildParams);
        } catch (Exception unused) {
            sb.append(buildParams);
        }
        return sb.toString();
    }

    public URLBuilder withMedia(SHARE_MEDIA share_media) {
        this.mPlatfrom = share_media.toString();
        return this;
    }

    public URLBuilder withOpId(String str) {
        this.mOpId = str;
        return this;
    }

    public URLBuilder withSessionId(String str) {
        this.mSessionId = str;
        return this;
    }

    public URLBuilder withUID(String str) {
        this.mUID = str;
        return this;
    }
}
