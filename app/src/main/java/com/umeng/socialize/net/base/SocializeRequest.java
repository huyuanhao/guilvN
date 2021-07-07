package com.umeng.socialize.net.base;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.p118pd.sdk.C9058ooOoOoOO;
import com.umeng.commonsdk.utils.UMUtils;
import com.umeng.socialize.Config;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.media.BaseMediaObject;
import com.umeng.socialize.media.UMediaObject;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.umeng.socialize.net.utils.URequest;
import com.umeng.socialize.p275b.p276a.C3913a;
import com.umeng.socialize.utils.DefaultClass;
import com.umeng.socialize.utils.DeviceConfig;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.SocializeUtils;
import com.umeng.socialize.utils.UmengText;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public abstract class SocializeRequest extends URequest {
    public static final String BASE_URL = "https://log.umsns.com/";
    public static final int REQUEST_ANALYTIC = 1;
    public static final int REQUEST_API = 2;
    public static final int REQUEST_SOCIAL = 0;
    public static final String TAG = "SocializeRequest";
    public Map<String, URequest.FilePair> mFileMap = new HashMap();
    public int mOpId;
    public int mReqType = 1;

    /* renamed from: com.umeng.socialize.net.base.SocializeRequest$1 */
    public static /* synthetic */ class C39651 {
        public static final /* synthetic */ int[] $SwitchMap$com$umeng$socialize$net$utils$URequest$RequestMethod;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.umeng.socialize.net.utils.URequest$RequestMethod[] r0 = com.umeng.socialize.net.utils.URequest.RequestMethod.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.umeng.socialize.net.base.SocializeRequest.C39651.$SwitchMap$com$umeng$socialize$net$utils$URequest$RequestMethod = r0
                com.umeng.socialize.net.utils.URequest$RequestMethod r1 = com.umeng.socialize.net.utils.URequest.RequestMethod.POST     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.umeng.socialize.net.base.SocializeRequest.C39651.$SwitchMap$com$umeng$socialize$net$utils$URequest$RequestMethod     // Catch:{ NoSuchFieldError -> 0x001d }
                com.umeng.socialize.net.utils.URequest$RequestMethod r1 = com.umeng.socialize.net.utils.URequest.RequestMethod.GET     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.umeng.socialize.net.base.SocializeRequest.C39651.<clinit>():void");
        }
    }

    public enum FILE_TYPE {
        IMAGE,
        VEDIO
    }

    public SocializeRequest(Context context, String str, Class<? extends SocializeReseponse> cls, int i, URequest.RequestMethod requestMethod) {
        super("");
        this.mResponseClz = cls;
        this.mOpId = i;
        this.mContext = context;
        this.mMethod = requestMethod;
        setBaseUrl("https://log.umsns.com/");
    }

    public static Map<String, Object> getBaseQuery(Context context) {
        HashMap hashMap = new HashMap();
        String deviceId = DeviceConfig.getDeviceId(context);
        if (!TextUtils.isEmpty(deviceId)) {
            hashMap.put("imei", deviceId);
        }
        String mac = DeviceConfig.getMac(context);
        if (TextUtils.isEmpty(mac)) {
            mac = DefaultClass.getMac();
            SLog.m10857I(UmengText.NET.MACNULL);
        }
        hashMap.put("mac", mac);
        if (!TextUtils.isEmpty(SocializeConstants.UID)) {
            hashMap.put("uid", SocializeConstants.UID);
        }
        try {
            hashMap.put(SocializeProtocolConstants.PROTOCOL_KEY_EN, DeviceConfig.getNetworkAccessMode(context)[0]);
        } catch (Exception unused) {
            hashMap.put(SocializeProtocolConstants.PROTOCOL_KEY_EN, "Unknown");
        }
        hashMap.put(SocializeProtocolConstants.PROTOCOL_KEY_DE, Build.MODEL);
        hashMap.put(SocializeProtocolConstants.PROTOCOL_KEY_VERSION, "7.0.2");
        hashMap.put("os", "Android");
        hashMap.put("android_id", DeviceConfig.getAndroidID(context));
        hashMap.put("sn", DeviceConfig.getDeviceSN());
        hashMap.put("os_version", DeviceConfig.getOsVersion());
        hashMap.put(SocializeProtocolConstants.PROTOCOL_KEY_DT, Long.valueOf(System.currentTimeMillis()));
        hashMap.put(SocializeProtocolConstants.PROTOCOL_KEY_AK, SocializeUtils.getAppkey(context));
        hashMap.put(SocializeProtocolConstants.PROTOCOL_VERSION, SocializeConstants.PROTOCOL_VERSON);
        hashMap.put(SocializeConstants.USHARETYPE, Config.shareType);
        if (!TextUtils.isEmpty(Config.EntityKey)) {
            hashMap.put(SocializeProtocolConstants.PROTOCOL_KEY_ENTITY_KEY, Config.EntityKey);
        }
        if (!TextUtils.isEmpty(Config.SessionId)) {
            hashMap.put("sid", Config.SessionId);
        }
        try {
            hashMap.put(SocializeProtocolConstants.PROTOCOL_KEY_REQUEST_TYPE, 0);
        } catch (Exception e) {
            SLog.error(e);
        }
        return hashMap;
    }

    private String mapTostring(Map<String, Object> map) {
        if (this.mParams.isEmpty()) {
            return null;
        }
        try {
            return new JSONObject(map).toString();
        } catch (Exception e) {
            SLog.error(e);
            return null;
        }
    }

    public void addFileParams(byte[] bArr, FILE_TYPE file_type, String str) {
        if (FILE_TYPE.IMAGE == file_type) {
            String c = C3913a.m10779c(bArr);
            if (TextUtils.isEmpty(c)) {
                c = "png";
            }
            this.mFileMap.put(SocializeProtocolConstants.PROTOCOL_KEY_IMAGE, new URequest.FilePair(SocializeUtils.md5(bArr) + C9058ooOoOoOO.OooOO0 + c, bArr));
        }
    }

    public void addMediaParams(UMediaObject uMediaObject) {
        if (uMediaObject != null) {
            if (uMediaObject instanceof BaseMediaObject) {
                addStringParams(SocializeProtocolConstants.PROTOCOL_KEY_TITLE, ((BaseMediaObject) uMediaObject).getTitle());
            }
            if (uMediaObject.isUrlMedia()) {
                for (Map.Entry<String, Object> entry : uMediaObject.toUrlExtraParams().entrySet()) {
                    addStringParams(entry.getKey(), entry.getValue().toString());
                }
                return;
            }
            byte[] bArr = uMediaObject.toByte();
            if (bArr != null) {
                addFileParams(bArr, FILE_TYPE.IMAGE, null);
            }
        }
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public Map<String, Object> buildParams() {
        Map<String, Object> baseQuery = getBaseQuery(this.mContext);
        if (!TextUtils.isEmpty(Config.EntityKey)) {
            baseQuery.put(SocializeProtocolConstants.PROTOCOL_KEY_ENTITY_KEY, Config.EntityKey);
        }
        if (!TextUtils.isEmpty(Config.SessionId)) {
            baseQuery.put("sid", Config.SessionId);
        }
        baseQuery.put(SocializeProtocolConstants.PROTOCOL_KEY_REQUEST_TYPE, Integer.valueOf(this.mReqType));
        baseQuery.put(SocializeProtocolConstants.PROTOCOL_KEY_OPID, Integer.valueOf(this.mOpId));
        baseQuery.put("uid", UMUtils.getUMId(this.mContext));
        baseQuery.putAll(this.mParams);
        return baseQuery;
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public Map<String, Object> getBodyPair() {
        return buildParams();
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public String getDecryptString(String str) {
        return str;
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public String getEcryptString(String str) {
        return str;
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public Map<String, URequest.FilePair> getFilePair() {
        return this.mFileMap;
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public String getHttpMethod() {
        if (C39651.$SwitchMap$com$umeng$socialize$net$utils$URequest$RequestMethod[this.mMethod.ordinal()] != 1) {
            return URequest.GET;
        }
        return URequest.POST;
    }

    public abstract String getPath();

    @Override // com.umeng.socialize.net.utils.URequest
    public void onPrepareRequest() {
        addStringParams("pcv", SocializeConstants.PROTOCOL_VERSON);
        addStringParams(SocializeConstants.USHARETYPE, Config.shareType);
        addStringParams("imei", DeviceConfig.getDeviceId(this.mContext));
        addStringParams(SocializeProtocolConstants.PROTOCOL_KEY_DE, Build.MODEL);
        addStringParams("mac", DeviceConfig.getMac(this.mContext));
        addStringParams("os", "Android");
        addStringParams(SocializeProtocolConstants.PROTOCOL_KEY_EN, DeviceConfig.getNetworkAccessMode(this.mContext)[0]);
        addStringParams("uid", null);
        addStringParams(SocializeProtocolConstants.PROTOCOL_KEY_VERSION, "7.0.2");
        addStringParams(SocializeProtocolConstants.PROTOCOL_KEY_DT, String.valueOf(System.currentTimeMillis()));
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public void setBaseUrl(String str) {
        String str2 = "";
        try {
            if (!TextUtils.isEmpty(getPath())) {
                str2 = new URL(new URL(str), getPath()).toString();
            }
        } catch (Exception e) {
            SLog.error(UmengText.NET.getURLERROR(str), e);
        }
        super.setBaseUrl(str2);
    }

    public void setReqType(int i) {
        this.mReqType = i;
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public String toGetUrl() {
        return generateGetURL(getBaseUrl(), buildParams());
    }

    @Override // com.umeng.socialize.net.utils.URequest
    public JSONObject toJson() {
        return null;
    }
}
