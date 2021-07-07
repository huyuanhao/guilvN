package com.umeng.socialize.net.utils;

import android.content.Context;
import android.text.TextUtils;
import com.p118pd.sdk.C8932ooOOO0o;
import com.umeng.socialize.net.base.SocializeReseponse;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public abstract class URequest {
    public static String APPLICATION = "application/x-www-form-urlencoded";
    public static String GET = "GET";
    public static String MULTIPART = "multipart/form-data";
    public static String POST = "POST";
    public String mBaseUrl;
    public Context mContext;
    public Map<String, String> mHeaders;
    public RequestMethod mMethod;
    public MIME mMimeType;
    public Map<String, String> mParams = new HashMap();
    public Class<? extends SocializeReseponse> mResponseClz;
    public PostStyle postStyle = PostStyle.MULTIPART;

    public static class FilePair {
        public byte[] mBinaryData;
        public String mFileName;

        public FilePair(String str, byte[] bArr) {
            this.mFileName = str;
            this.mBinaryData = bArr;
        }
    }

    public enum MIME {
        DEFAULT("application/x-www-form-urlencoded;charset=utf-8"),
        JSON("application/json;charset=utf-8");
        
        public String mimeType;

        /* access modifiers changed from: public */
        MIME(String str) {
            this.mimeType = str;
        }

        public String toString() {
            return this.mimeType;
        }
    }

    public enum PostStyle {
        MULTIPART {
            public String toString() {
                return URequest.MULTIPART;
            }
        },
        APPLICATION {
            public String toString() {
                return URequest.APPLICATION;
            }
        }
    }

    public enum RequestMethod {
        GET {
            public String toString() {
                return URequest.GET;
            }
        },
        POST {
            public String toString() {
                return URequest.POST;
            }
        }
    }

    public URequest(String str) {
        this.mBaseUrl = str;
    }

    public static String buildGetParams(Map<String, Object> map) {
        StringBuilder sb = new StringBuilder();
        for (String str : map.keySet()) {
            if (map.get(str) != null) {
                sb.append(str + C8932ooOOO0o.OooO0Oo + URLEncoder.encode(map.get(str).toString()) + "&");
            }
        }
        return sb.substring(0, sb.length() - 1).toString();
    }

    public void addStringParams(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            this.mParams.put(str, str2);
        }
    }

    public String buildGetUrl(String str, Map<String, Object> map) {
        if (TextUtils.isEmpty(str) || map == null || map.size() == 0) {
            return str;
        }
        if (!str.endsWith(C8932ooOOO0o.f22176OooO00o)) {
            str = str + C8932ooOOO0o.f22176OooO00o;
        }
        String buildGetParams = buildGetParams(map);
        SLog.debug(UmengText.NET.assertURL(str, buildGetParams));
        try {
            buildGetParams = getEcryptString(buildGetParams);
        } catch (Exception e) {
            SLog.error(UmengText.NET.PARSEERROR, e);
        }
        return str + buildGetParams;
    }

    public abstract Map<String, Object> buildParams();

    public String generateGetURL(String str, Map<String, Object> map) {
        return buildGetUrl(str, map);
    }

    public String getBaseUrl() {
        return this.mBaseUrl;
    }

    public Map<String, Object> getBodyPair() {
        return null;
    }

    public String getDecryptString(String str) {
        return str;
    }

    public String getEcryptString(String str) {
        return str;
    }

    public Map<String, FilePair> getFilePair() {
        return null;
    }

    public String getHttpMethod() {
        return this.mMethod.toString();
    }

    public void onPrepareRequest() {
    }

    public void setBaseUrl(String str) {
        this.mBaseUrl = str;
    }

    public abstract String toGetUrl();

    public abstract JSONObject toJson();
}
