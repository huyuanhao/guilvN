package com.umeng.socialize.handler;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.p118pd.sdk.C7031o000oo0O;
import com.tencent.p269mm.opensdk.modelbase.BaseReq;
import com.tencent.p269mm.opensdk.modelbase.BaseResp;
import com.tencent.p269mm.opensdk.modelmsg.SendAuth;
import com.tencent.p269mm.opensdk.modelmsg.SendMessageToWX;
import com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.p269mm.opensdk.openapi.IWXAPI;
import com.tencent.p269mm.opensdk.openapi.IWXAPIEventHandler;
import com.tencent.p269mm.opensdk.openapi.WXAPIFactory;
import com.umeng.socialize.Config;
import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.ShareContent;
import com.umeng.socialize.UMAuthListener;
import com.umeng.socialize.UMShareConfig;
import com.umeng.socialize.UMShareListener;
import com.umeng.socialize.bean.HandlerRequestCode;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.StringName;
import com.umeng.socialize.bean.UmengErrorCode;
import com.umeng.socialize.common.QueuedWork;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.media.WeiXinShareContent;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.SocializeUtils;
import com.umeng.socialize.utils.UmengText;
import com.umeng.socialize.utils.UrlUtil;
import com.umeng.socialize.weixin.net.WXAuthUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class UMWXHandler extends UMSSOHandler {
    public static final String ERRMSG = "errmsg";
    public static final String ERRORCODE = "errcode";
    public static final String ERROR_CODE_TOKEN_ACCESS_FAIL = "42002";
    public static final String ERROR_CODE_TOKEN_FAIL = "40001";
    public static final String ERROR_CODE_TOKEN_REFESH_FAIL = "40030";
    public static final String HEADIMGURL = "headimgurl";
    public static final String LANGUAGE = "language";
    public static final String NICKNAME = "nickname";
    public static final String PRIVILEGE = "privilege";
    public static final int REFRESH_TOKEN_EXPIRES = 604800;
    public static final String REFRESH_TOKEN_EXPIRES_KEY = "refresh_token_expires";
    public static final int RESP_TYPE_AUTH = 1;
    public static final int RESP_TYPE_SHARE = 2;
    public static final String SEX = "sex";
    public static final String TAG = "UMWXHandler";
    public static String sScope = "snsapi_userinfo,snsapi_friend,snsapi_message";
    public String VERSION = "7.0.2";
    public PlatformConfig.APPIDPlatform config;
    public UMAuthListener mAuthListener;
    public IWXAPIEventHandler mEventHandler = new IWXAPIEventHandler() {
        /* class com.umeng.socialize.handler.UMWXHandler.C394316 */

        @Override // com.tencent.p269mm.opensdk.openapi.IWXAPIEventHandler
        public void onReq(BaseReq baseReq) {
        }

        @Override // com.tencent.p269mm.opensdk.openapi.IWXAPIEventHandler
        public void onResp(BaseResp baseResp) {
            int type = baseResp.getType();
            if (type == 1) {
                UMWXHandler.this.onAuthCallback((SendAuth.Resp) baseResp);
            } else if (type == 2) {
                UMWXHandler.this.onShareCallback((SendMessageToWX.Resp) baseResp);
            }
        }
    };
    public SHARE_MEDIA mTarget = SHARE_MEDIA.WEIXIN;
    public IWXAPI mWXApi;
    public UMShareListener umShareListener;
    public WeixinPreferences weixinPreferences;

    /* renamed from: com.umeng.socialize.handler.UMWXHandler$17 */
    public static /* synthetic */ class C394417 {
        public static final /* synthetic */ int[] $SwitchMap$com$umeng$socialize$bean$SHARE_MEDIA;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.umeng.socialize.bean.SHARE_MEDIA[] r0 = com.umeng.socialize.bean.SHARE_MEDIA.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.umeng.socialize.handler.UMWXHandler.C394417.$SwitchMap$com$umeng$socialize$bean$SHARE_MEDIA = r0
                com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.umeng.socialize.handler.UMWXHandler.C394417.$SwitchMap$com$umeng$socialize$bean$SHARE_MEDIA     // Catch:{ NoSuchFieldError -> 0x001d }
                com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_CIRCLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.umeng.socialize.handler.UMWXHandler.C394417.$SwitchMap$com$umeng$socialize$bean$SHARE_MEDIA     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_FAVORITE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.umeng.socialize.handler.UMWXHandler.C394417.<clinit>():void");
        }
    }

    private String buildTransaction(String str) {
        if (str == null) {
            return String.valueOf(System.currentTimeMillis());
        }
        return str + System.currentTimeMillis();
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void fetchUserInfo(final UMAuthListener uMAuthListener) {
        String openid = getOpenid();
        String accessToken = getAccessToken();
        final String request = WXAuthUtils.request("https://api.weixin.qq.com/sns/userinfo?access_token=" + accessToken + "&openid=" + openid + "&lang=zh_CN");
        if (TextUtils.isEmpty(request) || request.startsWith("##")) {
            QueuedWork.runInMain(new Runnable() {
                /* class com.umeng.socialize.handler.UMWXHandler.RunnableC39495 */

                public void run() {
                    UMAuthListener authListener = UMWXHandler.this.getAuthListener(uMAuthListener);
                    SHARE_MEDIA share_media = SHARE_MEDIA.WEIXIN;
                    authListener.onError(share_media, 2, new Throwable(UmengErrorCode.RequestForUserProfileFailed.getMessage() + request));
                }
            });
            return;
        }
        final Map<String, String> parseUserInfo = parseUserInfo(request);
        if (parseUserInfo == null) {
            QueuedWork.runInMain(new Runnable() {
                /* class com.umeng.socialize.handler.UMWXHandler.RunnableC39506 */

                public void run() {
                    UMAuthListener authListener = UMWXHandler.this.getAuthListener(uMAuthListener);
                    SHARE_MEDIA share_media = SHARE_MEDIA.WEIXIN;
                    authListener.onError(share_media, 2, new Throwable(UmengErrorCode.RequestForUserProfileFailed.getMessage() + request));
                }
            });
        } else if (!parseUserInfo.containsKey(ERRORCODE)) {
            QueuedWork.runInMain(new Runnable() {
                /* class com.umeng.socialize.handler.UMWXHandler.RunnableC39528 */

                public void run() {
                    UMWXHandler.this.getAuthListener(uMAuthListener).onComplete(SHARE_MEDIA.WEIXIN, 2, parseUserInfo);
                }
            });
        } else if (parseUserInfo.get(ERRORCODE).equals(ERROR_CODE_TOKEN_FAIL)) {
            weixinPreferencesDelete();
            authorize(uMAuthListener);
        } else {
            QueuedWork.runInMain(new Runnable() {
                /* class com.umeng.socialize.handler.UMWXHandler.RunnableC39517 */

                public void run() {
                    UMAuthListener authListener = UMWXHandler.this.getAuthListener(uMAuthListener);
                    SHARE_MEDIA share_media = SHARE_MEDIA.WEIXIN;
                    authListener.onError(share_media, 2, new Throwable(UmengErrorCode.RequestForUserProfileFailed.getMessage() + ((String) parseUserInfo.get(UMWXHandler.ERRORCODE))));
                }
            });
        }
    }

    private String getAccessToken() {
        WeixinPreferences weixinPreferences2 = this.weixinPreferences;
        return weixinPreferences2 != null ? weixinPreferences2.getAccessToken() : "";
    }

    private void getAuthWithCode(String str, final UMAuthListener uMAuthListener) {
        final StringBuilder sb = new StringBuilder();
        sb.append("https://api.weixin.qq.com/sns/oauth2/access_token?");
        sb.append("appid=");
        sb.append(this.config.appId);
        sb.append("&secret=");
        sb.append(this.config.appkey);
        sb.append("&code=");
        sb.append(str);
        sb.append("&grant_type=authorization_code");
        QueuedWork.runInBack(new Runnable() {
            /* class com.umeng.socialize.handler.UMWXHandler.RunnableC39463 */

            public void run() {
                String request = WXAuthUtils.request(sb.toString());
                try {
                    final Map<String, String> jsonToMap = SocializeUtils.jsonToMap(request);
                    if (jsonToMap == null || jsonToMap.size() == 0) {
                        UMWXHandler.this.getMap();
                    }
                    UMWXHandler.this.setBundle(UMWXHandler.this.parseAuthData(request));
                    QueuedWork.runInMain(new Runnable() {
                        /* class com.umeng.socialize.handler.UMWXHandler.RunnableC39463.RunnableC39471 */

                        public void run() {
                            if (jsonToMap.get(UMWXHandler.ERRORCODE) != null) {
                                RunnableC39463 r0 = RunnableC39463.this;
                                UMAuthListener authListener = UMWXHandler.this.getAuthListener(uMAuthListener);
                                SHARE_MEDIA share_media = SHARE_MEDIA.WEIXIN;
                                authListener.onError(share_media, 0, new Throwable(UmengErrorCode.AuthorizeFailed.getMessage() + ((String) jsonToMap.get(UMWXHandler.ERRMSG))));
                            } else {
                                RunnableC39463 r02 = RunnableC39463.this;
                                UMWXHandler.this.getAuthListener(uMAuthListener).onComplete(SHARE_MEDIA.WEIXIN, 0, jsonToMap);
                            }
                            jsonToMap.put(CommonNetImpl.AID, UMWXHandler.this.config.appId);
                            jsonToMap.put(CommonNetImpl.f10813AS, UMWXHandler.this.config.appkey);
                            Map map = jsonToMap;
                            map.put("uid", map.get("openid"));
                            Map map2 = jsonToMap;
                            map2.put("unionid", map2.get("unionid"));
                        }
                    });
                } catch (Exception e) {
                    SLog.error(e);
                }
            }
        }, true);
    }

    private Map<String, String> getAuthWithRefreshToken(String str) {
        Map<String, String> map;
        Exception e;
        try {
            map = SocializeUtils.jsonToMap(WXAuthUtils.request("https://api.weixin.qq.com/sns/oauth2/refresh_token?" + "appid=" + this.config.appId + "&grant_type=refresh_token" + "&refresh_token=" + str));
            try {
                map.put("unionid", getUid());
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception e3) {
            e = e3;
            map = null;
            SLog.error(e);
            return map;
        }
        return map;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private Map<String, String> getMap() {
        WeixinPreferences weixinPreferences2 = this.weixinPreferences;
        if (weixinPreferences2 != null) {
            return weixinPreferences2.getmap();
        }
        return null;
    }

    private String getOpenid() {
        WeixinPreferences weixinPreferences2 = this.weixinPreferences;
        return weixinPreferences2 != null ? weixinPreferences2.getmOpenid() : "";
    }

    private String getRefreshToken() {
        WeixinPreferences weixinPreferences2 = this.weixinPreferences;
        return weixinPreferences2 != null ? weixinPreferences2.getRefreshToken() : "";
    }

    private String getUid() {
        WeixinPreferences weixinPreferences2 = this.weixinPreferences;
        return weixinPreferences2 != null ? weixinPreferences2.getUID() : "";
    }

    private long getmAccessTokenTTL() {
        WeixinPreferences weixinPreferences2 = this.weixinPreferences;
        if (weixinPreferences2 != null) {
            return weixinPreferences2.getmAccessTokenTTL();
        }
        return 0;
    }

    private boolean isAbleShareEmoji(SHARE_MEDIA share_media, WeiXinShareContent weiXinShareContent) {
        if (weiXinShareContent.getmStyle() == 64) {
            return (share_media == SHARE_MEDIA.WEIXIN_CIRCLE || share_media == SHARE_MEDIA.WEIXIN_FAVORITE) ? false : true;
        }
        return true;
    }

    private boolean isAccessTokenAvailable() {
        WeixinPreferences weixinPreferences2 = this.weixinPreferences;
        if (weixinPreferences2 != null) {
            return weixinPreferences2.isAccessTokenAvailable();
        }
        return false;
    }

    private boolean isAuthValid() {
        WeixinPreferences weixinPreferences2 = this.weixinPreferences;
        if (weixinPreferences2 != null) {
            return weixinPreferences2.isAuthValid();
        }
        return false;
    }

    private void loadOauthData(String str) {
        setBundle(parseAuthData(WXAuthUtils.request(str)));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void onAuthCallback(SendAuth.Resp resp) {
        int i = resp.errCode;
        if (i == 0) {
            getAuthWithCode(resp.code, this.mAuthListener);
        } else if (i == -2) {
            getAuthListener(this.mAuthListener).onCancel(SHARE_MEDIA.WEIXIN, 0);
        } else if (i == -6) {
            UMAuthListener authListener = getAuthListener(this.mAuthListener);
            SHARE_MEDIA share_media = SHARE_MEDIA.WEIXIN;
            authListener.onError(share_media, 0, new Throwable(UmengErrorCode.AuthorizeFailed.getMessage() + UmengText.errorWithUrl(UmengText.AUTH.AUTH_DENIED, UrlUtil.WX_ERROR_SIGN)));
        } else {
            CharSequence concat = TextUtils.concat("weixin auth error (", String.valueOf(i), "):", resp.errStr);
            UMAuthListener authListener2 = getAuthListener(this.mAuthListener);
            SHARE_MEDIA share_media2 = SHARE_MEDIA.WEIXIN;
            authListener2.onError(share_media2, 0, new Throwable(UmengErrorCode.AuthorizeFailed.getMessage() + ((Object) concat)));
        }
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private Bundle parseAuthData(String str) {
        Bundle bundle = new Bundle();
        if (TextUtils.isEmpty(str)) {
            return bundle;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                bundle.putString(next, jSONObject.optString(next));
            }
            bundle.putLong(REFRESH_TOKEN_EXPIRES_KEY, 604800);
            bundle.putString(UMSSOHandler.ACCESSTOKEN, bundle.getString("access_token"));
            bundle.putString(UMSSOHandler.EXPIRATION, bundle.getString("expires_in"));
            bundle.putString(UMSSOHandler.REFRESHTOKEN, bundle.getString("refresh_token"));
            bundle.putString("uid", bundle.getString("unionid"));
        } catch (JSONException e) {
            SLog.error(e);
        }
        return bundle;
    }

    private Map<String, String> parseUserInfo(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyMap();
        }
        HashMap hashMap = new HashMap();
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(ERRORCODE)) {
                hashMap.put(ERRORCODE, jSONObject.getString(ERRORCODE));
                hashMap.put(ERRMSG, jSONObject.getString(ERRMSG));
                return hashMap;
            }
            hashMap.put("openid", jSONObject.optString("openid"));
            hashMap.put(UMSSOHandler.SCREEN_NAME, jSONObject.optString(NICKNAME));
            hashMap.put("name", jSONObject.optString(NICKNAME));
            hashMap.put("language", jSONObject.optString("language"));
            hashMap.put(UMSSOHandler.CITY, jSONObject.optString(UMSSOHandler.CITY));
            hashMap.put(UMSSOHandler.PROVINCE, jSONObject.optString(UMSSOHandler.PROVINCE));
            hashMap.put("country", jSONObject.optString("country"));
            hashMap.put(UMSSOHandler.PROFILE_IMAGE_URL, jSONObject.optString(HEADIMGURL));
            hashMap.put(UMSSOHandler.ICON, jSONObject.optString(HEADIMGURL));
            hashMap.put("unionid", jSONObject.optString("unionid"));
            hashMap.put("uid", jSONObject.optString("unionid"));
            hashMap.put(UMSSOHandler.GENDER, getGender(jSONObject.optString("sex")));
            JSONArray optJSONArray = jSONObject.optJSONArray(PRIVILEGE);
            if (optJSONArray == null) {
                i = 0;
            } else {
                i = optJSONArray.length();
            }
            if (i > 0) {
                String[] strArr = new String[i];
                for (int i2 = 0; i2 < i; i2++) {
                    strArr[i2] = optJSONArray.get(i2).toString();
                }
                hashMap.put(PRIVILEGE, strArr.toString());
            }
            hashMap.put("access_token", getAccessToken());
            hashMap.put(UMSSOHandler.REFRESHTOKEN, getRefreshToken());
            hashMap.put("expires_in", String.valueOf(getmAccessTokenTTL()));
            hashMap.put(UMSSOHandler.ACCESSTOKEN, getAccessToken());
            hashMap.put(UMSSOHandler.REFRESHTOKEN, getRefreshToken());
            hashMap.put(UMSSOHandler.EXPIRATION, String.valueOf(getmAccessTokenTTL()));
            return hashMap;
        } catch (JSONException e) {
            SLog.error(e);
            return Collections.emptyMap();
        }
    }

    private void runInMainThread(Runnable runnable) {
        QueuedWork.runInMain(runnable);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private void setBundle(Bundle bundle) {
        WeixinPreferences weixinPreferences2 = this.weixinPreferences;
        if (weixinPreferences2 != null) {
            weixinPreferences2.setBundle(bundle).commit();
        }
    }

    private boolean shareTo(WeiXinShareContent weiXinShareContent) {
        SendMessageToWX.Req req = new SendMessageToWX.Req();
        req.transaction = buildTransaction(weiXinShareContent.getStrStyle());
        req.message = weiXinShareContent.getWxMediaMessage();
        int i = C394417.$SwitchMap$com$umeng$socialize$bean$SHARE_MEDIA[this.mTarget.ordinal()];
        if (i == 1) {
            req.scene = 0;
        } else if (i == 2) {
            req.scene = 1;
        } else if (i != 3) {
            req.scene = 2;
        } else {
            req.scene = 2;
        }
        WXMediaMessage wXMediaMessage = req.message;
        if (wXMediaMessage == null) {
            QueuedWork.runInMain(new Runnable() {
                /* class com.umeng.socialize.handler.UMWXHandler.RunnableC394013 */

                public void run() {
                    UMWXHandler uMWXHandler = UMWXHandler.this;
                    UMShareListener shareListener = uMWXHandler.getShareListener(uMWXHandler.umShareListener);
                    SHARE_MEDIA share_media = UMWXHandler.this.mTarget;
                    shareListener.onError(share_media, new Throwable(UmengErrorCode.UnKnowCode.getMessage() + "message = null"));
                }
            });
            return false;
        } else if (wXMediaMessage.mediaObject == null) {
            QueuedWork.runInMain(new Runnable() {
                /* class com.umeng.socialize.handler.UMWXHandler.RunnableC394114 */

                public void run() {
                    UMWXHandler uMWXHandler = UMWXHandler.this;
                    UMShareListener shareListener = uMWXHandler.getShareListener(uMWXHandler.umShareListener);
                    SHARE_MEDIA share_media = UMWXHandler.this.mTarget;
                    shareListener.onError(share_media, new Throwable(UmengErrorCode.UnKnowCode.getMessage() + "mediaobject = null"));
                }
            });
            return false;
        } else {
            boolean sendReq = this.mWXApi.sendReq(req);
            if (!sendReq) {
                QueuedWork.runInMain(new Runnable() {
                    /* class com.umeng.socialize.handler.UMWXHandler.RunnableC394215 */

                    public void run() {
                        UMWXHandler uMWXHandler = UMWXHandler.this;
                        UMShareListener shareListener = uMWXHandler.getShareListener(uMWXHandler.umShareListener);
                        SHARE_MEDIA share_media = UMWXHandler.this.mTarget;
                        shareListener.onError(share_media, new Throwable(UmengErrorCode.UnKnowCode.getMessage() + UmengText.SHARE.SHARE_CONTENT_FAIL));
                    }
                });
            }
            return sendReq;
        }
    }

    private void weixinPreferencesDelete() {
        WeixinPreferences weixinPreferences2 = this.weixinPreferences;
        if (weixinPreferences2 != null) {
            weixinPreferences2.delete();
        }
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void authorize(final UMAuthListener uMAuthListener) {
        PlatformConfig.APPIDPlatform aPPIDPlatform = this.config;
        if (aPPIDPlatform != null) {
            this.mTarget = aPPIDPlatform.getName();
        }
        this.mAuthListener = uMAuthListener;
        if (!isInstall()) {
            if (Config.isJumptoAppStore) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("http://log.umsns.com/link/weixin/download/"));
                this.mWeakAct.get().startActivity(intent);
            }
            runInMainThread(new Runnable() {
                /* class com.umeng.socialize.handler.UMWXHandler.RunnableC39361 */

                public void run() {
                    UMWXHandler.this.getAuthListener(uMAuthListener).onError(UMWXHandler.this.mTarget, 0, new Throwable(UmengErrorCode.NotInstall.getMessage()));
                }
            });
        } else if (isAuthValid()) {
            String refreshToken = getRefreshToken();
            loadOauthData("https://api.weixin.qq.com/sns/oauth2/refresh_token?appid=" + this.config.appId + "&grant_type=refresh_token&refresh_token=" + refreshToken);
            getRefreshToken();
            final Map<String, String> authWithRefreshToken = getAuthWithRefreshToken(refreshToken);
            if (!authWithRefreshToken.containsKey(ERRORCODE) || (!authWithRefreshToken.get(ERRORCODE).equals(ERROR_CODE_TOKEN_ACCESS_FAIL) && !authWithRefreshToken.get(ERRORCODE).equals(ERROR_CODE_TOKEN_REFESH_FAIL))) {
                runInMainThread(new Runnable() {
                    /* class com.umeng.socialize.handler.UMWXHandler.RunnableC39452 */

                    public void run() {
                        UMWXHandler uMWXHandler = UMWXHandler.this;
                        uMWXHandler.getAuthListener(uMWXHandler.mAuthListener).onComplete(SHARE_MEDIA.WEIXIN, 0, authWithRefreshToken);
                    }
                });
                return;
            }
            weixinPreferencesDelete();
            authorize(uMAuthListener);
        } else {
            SendAuth.Req req = new SendAuth.Req();
            req.scope = sScope;
            req.state = "none";
            this.mWXApi.sendReq(req);
        }
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void deleteAuth(final UMAuthListener uMAuthListener) {
        weixinPreferencesDelete();
        QueuedWork.runInMain(new Runnable() {
            /* class com.umeng.socialize.handler.UMWXHandler.RunnableC39484 */

            public void run() {
                UMWXHandler.this.getAuthListener(uMAuthListener).onComplete(SHARE_MEDIA.WEIXIN, 1, null);
            }
        });
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public String getGender(Object obj) {
        String str = StringName.male;
        String str2 = StringName.female;
        if (obj == null) {
            return "";
        }
        if (obj instanceof String) {
            if (obj.equals(C7031o000oo0O.OooO0O0) || obj.equals("1") || obj.equals(UmengText.MAN)) {
                return str;
            }
            return (obj.equals("f") || obj.equals("2") || obj.equals(UmengText.WOMAN)) ? str2 : obj.toString();
        } else if (!(obj instanceof Integer)) {
            return obj.toString();
        } else {
            Integer num = (Integer) obj;
            if (num.intValue() == 1) {
                return str;
            }
            if (num.intValue() == 2) {
                return str2;
            }
            return obj.toString();
        }
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void getPlatformInfo(final UMAuthListener uMAuthListener) {
        if (getShareConfig().isNeedAuthOnGetUserInfo()) {
            weixinPreferencesDelete();
        }
        authorize(new UMAuthListener() {
            /* class com.umeng.socialize.handler.UMWXHandler.C39539 */

            @Override // com.umeng.socialize.UMAuthListener
            public void onCancel(SHARE_MEDIA share_media, int i) {
                UMWXHandler.this.getAuthListener(uMAuthListener).onCancel(share_media, i);
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onComplete(SHARE_MEDIA share_media, int i, Map<String, String> map) {
                QueuedWork.runInBack(new Runnable() {
                    /* class com.umeng.socialize.handler.UMWXHandler.C39539.RunnableC39541 */

                    public void run() {
                        C39539 r0 = C39539.this;
                        UMWXHandler.this.fetchUserInfo(uMAuthListener);
                    }
                }, true);
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onError(SHARE_MEDIA share_media, int i, Throwable th) {
                UMWXHandler.this.getAuthListener(uMAuthListener).onError(share_media, i, th);
            }

            @Override // com.umeng.socialize.UMAuthListener
            public void onStart(SHARE_MEDIA share_media) {
            }
        });
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public int getRequestCode() {
        return HandlerRequestCode.WX_REQUEST_CODE;
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public String getSDKVersion() {
        return "3.1.1";
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public String getVersion() {
        return this.VERSION;
    }

    public IWXAPI getWXApi() {
        return this.mWXApi;
    }

    public IWXAPIEventHandler getWXEventHandler() {
        return this.mEventHandler;
    }

    public boolean isAbleShareMin(SHARE_MEDIA share_media, WeiXinShareContent weiXinShareContent) {
        if (weiXinShareContent.getmStyle() == 128) {
            return (share_media == SHARE_MEDIA.WEIXIN_CIRCLE || share_media == SHARE_MEDIA.WEIXIN_FAVORITE) ? false : true;
        }
        return true;
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean isAuthorize() {
        return this.weixinPreferences.isAuth();
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean isHasAuthListener() {
        return this.mAuthListener != null;
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean isInstall() {
        IWXAPI iwxapi = this.mWXApi;
        return iwxapi != null && iwxapi.isWXAppInstalled();
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean isSupport() {
        return this.mWXApi.getWXAppSupportAPI() >= 553779201;
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean isSupportAuth() {
        return true;
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void onCreate(Context context, PlatformConfig.Platform platform) {
        super.onCreate(context, platform);
        this.weixinPreferences = new WeixinPreferences(context.getApplicationContext(), "weixin");
        this.config = (PlatformConfig.APPIDPlatform) platform;
        IWXAPI createWXAPI = WXAPIFactory.createWXAPI(context.getApplicationContext(), this.config.appId, getShareConfig().getOpenWXAnalytics());
        this.mWXApi = createWXAPI;
        createWXAPI.registerApp(this.config.appId);
    }

    public void onShareCallback(SendMessageToWX.Resp resp) {
        int i = resp.errCode;
        if (i == -6) {
            UMShareListener shareListener = getShareListener(this.umShareListener);
            SHARE_MEDIA share_media = this.mTarget;
            shareListener.onError(share_media, new Throwable(UmengErrorCode.ShareFailed.getMessage() + UmengText.errorWithUrl(UmengText.AUTH.AUTH_DENIED, UrlUtil.WX_ERROR_SIGN)));
        } else if (i != -5) {
            if (i != -3) {
                if (i == -2) {
                    getShareListener(this.umShareListener).onCancel(this.mTarget);
                    return;
                } else if (i != -1) {
                    if (i != 0) {
                        UMShareListener shareListener2 = getShareListener(this.umShareListener);
                        SHARE_MEDIA share_media2 = this.mTarget;
                        shareListener2.onError(share_media2, new Throwable(UmengErrorCode.ShareFailed.getMessage() + "code:" + resp.errCode + "msg:" + resp.errStr));
                        return;
                    }
                    new HashMap().put("uid", resp.openId);
                    getShareListener(this.umShareListener).onResult(this.mTarget);
                    return;
                }
            }
            UMShareListener shareListener3 = getShareListener(this.umShareListener);
            SHARE_MEDIA share_media3 = this.mTarget;
            shareListener3.onError(share_media3, new Throwable(UmengErrorCode.ShareFailed.getMessage() + resp.errStr));
        } else {
            UMShareListener shareListener4 = getShareListener(this.umShareListener);
            SHARE_MEDIA share_media4 = this.mTarget;
            shareListener4.onError(share_media4, new Throwable(UmengErrorCode.ShareFailed.getMessage() + UmengText.SHARE.VERSION_NOT_SUPPORT));
        }
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void release() {
        super.release();
        this.mAuthListener = null;
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void setAuthListener(UMAuthListener uMAuthListener) {
        super.setAuthListener(uMAuthListener);
        this.mAuthListener = uMAuthListener;
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean share(ShareContent shareContent, final UMShareListener uMShareListener) {
        PlatformConfig.APPIDPlatform aPPIDPlatform = this.config;
        if (aPPIDPlatform != null) {
            this.mTarget = aPPIDPlatform.getName();
        }
        if (!isInstall()) {
            if (Config.isJumptoAppStore) {
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(SocializeConstants.DOWN_URL_WX));
                this.mWeakAct.get().startActivity(intent);
            }
            QueuedWork.runInMain(new Runnable() {
                /* class com.umeng.socialize.handler.UMWXHandler.RunnableC393710 */

                public void run() {
                    UMWXHandler.this.getShareListener(uMShareListener).onError(UMWXHandler.this.mTarget, new Throwable(UmengErrorCode.NotInstall.getMessage()));
                }
            });
            return false;
        }
        WeiXinShareContent weiXinShareContent = new WeiXinShareContent(shareContent);
        UMShareConfig uMShareConfig = this.mShareConfig;
        if (uMShareConfig != null) {
            weiXinShareContent.setCompressListener(uMShareConfig.getCompressListener());
        }
        if (!isAbleShareEmoji(this.mTarget, weiXinShareContent)) {
            QueuedWork.runInMain(new Runnable() {
                /* class com.umeng.socialize.handler.UMWXHandler.RunnableC393811 */

                public void run() {
                    UMShareListener shareListener = UMWXHandler.this.getShareListener(uMShareListener);
                    SHARE_MEDIA share_media = UMWXHandler.this.mTarget;
                    shareListener.onError(share_media, new Throwable(UmengErrorCode.ShareDataTypeIllegal.getMessage() + UmengText.C4008WX.WX_CIRCLE_NOT_SUPPORT_EMOJ));
                }
            });
            return false;
        } else if (!isAbleShareMin(this.mTarget, weiXinShareContent)) {
            QueuedWork.runInMain(new Runnable() {
                /* class com.umeng.socialize.handler.UMWXHandler.RunnableC393912 */

                public void run() {
                    UMShareListener shareListener = UMWXHandler.this.getShareListener(uMShareListener);
                    SHARE_MEDIA share_media = UMWXHandler.this.mTarget;
                    shareListener.onError(share_media, new Throwable(UmengErrorCode.ShareDataTypeIllegal.getMessage() + UmengText.C4008WX.WX_CIRCLE_NOT_SUPPORT_MIN));
                }
            });
            return false;
        } else {
            this.umShareListener = uMShareListener;
            return shareTo(weiXinShareContent);
        }
    }
}
