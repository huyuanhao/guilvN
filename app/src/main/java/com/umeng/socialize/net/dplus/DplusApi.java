package com.umeng.socialize.net.dplus;

import android.content.Context;
import android.text.TextUtils;
import com.p118pd.sdk.C7383o0OOO0O;
import com.umeng.socialize.Config;
import com.umeng.socialize.ShareContent;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.handler.UMSSOHandler;
import com.umeng.socialize.media.UMEmoji;
import com.umeng.socialize.media.UMImage;
import com.umeng.socialize.media.UMMin;
import com.umeng.socialize.media.UMVideo;
import com.umeng.socialize.media.UMWeb;
import com.umeng.socialize.media.UMusic;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.SocializeUtils;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONException;
import org.json.JSONObject;

public class DplusApi {
    public static final String FULL = "false";
    public static final String SIMPLE = "true";
    public static ExecutorService mExecutor = Executors.newSingleThreadExecutor();

    public static JSONObject constructAuthContent(Map<String, String> map, boolean z, SHARE_MEDIA share_media, String str) throws JSONException {
        JSONObject constructBaseContent = constructBaseContent(share_media, str);
        if (map != null) {
            constructBaseContent.put(CommonNetImpl.f10812AM, share_media.getsharestyle(z));
            if (share_media.toString().equals("WEIXIN")) {
                constructBaseContent.put("uid", map.get("openid"));
            } else {
                constructBaseContent.put("uid", map.get("uid"));
            }
            constructBaseContent.put("unionid", map.get("unionid"));
            constructBaseContent.put(CommonNetImpl.AID, map.get(CommonNetImpl.AID));
            constructBaseContent.put(CommonNetImpl.f10813AS, map.get(CommonNetImpl.f10813AS));
            if (TextUtils.isEmpty(map.get("access_token"))) {
                constructBaseContent.put("at", map.get(UMSSOHandler.ACCESSTOKEN));
            } else {
                constructBaseContent.put("at", map.get("access_token"));
            }
        }
        return constructBaseContent;
    }

    public static JSONObject constructBaseContent(SHARE_MEDIA share_media, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String share_media2 = share_media.toString();
        jSONObject.put(CommonNetImpl.f10816PF, share_media.getName());
        if ((share_media2.equals(SHARE_MEDIA.QQ.toString()) || share_media2.equals(SHARE_MEDIA.QZONE.toString())) && Config.isUmengQQ.booleanValue()) {
            jSONObject.put(CommonNetImpl.SDKT, "true");
        } else if ((share_media2.equals(SHARE_MEDIA.WEIXIN.toString()) || share_media2.equals(SHARE_MEDIA.WEIXIN_CIRCLE.toString()) || share_media2.equals(SHARE_MEDIA.WEIXIN_FAVORITE.toString())) && Config.isUmengWx.booleanValue()) {
            jSONObject.put(CommonNetImpl.SDKT, "true");
        } else if (!share_media2.equals(SHARE_MEDIA.SINA.toString()) || !Config.isUmengSina.booleanValue()) {
            jSONObject.put(CommonNetImpl.SDKT, "false");
        } else {
            jSONObject.put(CommonNetImpl.SDKT, "true");
        }
        jSONObject.put("ts", System.currentTimeMillis());
        jSONObject.put(CommonNetImpl.TAG, str);
        return jSONObject;
    }

    public static JSONObject constructDauContent() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("ts", System.currentTimeMillis());
        jSONObject.put(CommonNetImpl.SHARETYPE, Config.shareType);
        return jSONObject;
    }

    public static JSONObject constructShareContent(ShareContent shareContent, boolean z, SHARE_MEDIA share_media, String str) throws JSONException {
        JSONObject constructBaseContent = constructBaseContent(share_media, str);
        String str2 = shareContent.mText;
        constructBaseContent.put(CommonNetImpl.STYPE, shareContent.getShareType());
        constructBaseContent.put(CommonNetImpl.f10817SM, share_media.getsharestyle(z));
        if (!TextUtils.isEmpty(str2) && str2.length() > 10240) {
            str2 = str2.substring(0, 10240);
        }
        if (shareContent.getShareType() == 2 || shareContent.getShareType() == 3) {
            UMImage uMImage = (UMImage) shareContent.mMedia;
            if (uMImage != null) {
                if (uMImage.isUrlMedia()) {
                    constructBaseContent.put(CommonNetImpl.PICURL, uMImage.asUrlImage());
                } else {
                    constructBaseContent.put("pic", SocializeUtils.hexdigest(SocializeUtils.md5(uMImage.toByte())));
                }
            }
            constructBaseContent.put("ct", str2);
        } else if (shareContent.getShareType() == 1) {
            constructBaseContent.put("ct", str2);
        } else if (shareContent.getShareType() == 8) {
            UMVideo uMVideo = (UMVideo) shareContent.mMedia;
            if (uMVideo.getThumbImage() != null) {
                if (uMVideo.getThumbImage().isUrlMedia()) {
                    constructBaseContent.put(CommonNetImpl.PICURL, uMVideo.getThumbImage().asUrlImage());
                } else {
                    constructBaseContent.put("pic", SocializeUtils.hexdigest(SocializeUtils.md5(uMVideo.getThumbImage().toByte())));
                }
            }
            if (share_media == SHARE_MEDIA.SINA) {
                constructBaseContent.put("ct", str2);
            } else {
                constructBaseContent.put("ct", uMVideo.getDescription());
            }
            constructBaseContent.put("title", uMVideo.getTitle());
            constructBaseContent.put("url", uMVideo.toUrl());
        } else if (shareContent.getShareType() == 4) {
            UMusic uMusic = (UMusic) shareContent.mMedia;
            if (uMusic.getThumbImage() != null) {
                if (uMusic.getThumbImage().isUrlMedia()) {
                    constructBaseContent.put(CommonNetImpl.PICURL, uMusic.getThumbImage().asUrlImage());
                } else {
                    constructBaseContent.put("pic", SocializeUtils.hexdigest(SocializeUtils.md5(uMusic.getThumbImage().toByte())));
                }
            }
            if (share_media == SHARE_MEDIA.SINA) {
                constructBaseContent.put("ct", str2);
            } else {
                constructBaseContent.put("ct", uMusic.getDescription());
            }
            constructBaseContent.put("title", uMusic.getTitle());
            constructBaseContent.put(CommonNetImpl.DURL, uMusic.toUrl());
            constructBaseContent.put("url", uMusic.getmTargetUrl());
        } else if (shareContent.getShareType() == 32) {
            constructBaseContent.put("ct", str2);
        } else if (shareContent.getShareType() == 64) {
            UMEmoji uMEmoji = (UMEmoji) shareContent.mMedia;
            if (uMEmoji != null) {
                if (uMEmoji.isUrlMedia()) {
                    constructBaseContent.put(CommonNetImpl.PICURL, uMEmoji.asUrlImage());
                } else {
                    constructBaseContent.put("pic", SocializeUtils.md5(uMEmoji.toByte()));
                }
            }
            constructBaseContent.put("ct", str2);
        } else if (shareContent.getShareType() == 128) {
            UMMin uMMin = (UMMin) shareContent.mMedia;
            if (uMMin.getThumbImage() != null) {
                if (uMMin.getThumbImage().isUrlMedia()) {
                    constructBaseContent.put(CommonNetImpl.PICURL, uMMin.getThumbImage().asUrlImage());
                } else {
                    constructBaseContent.put("pic", SocializeUtils.hexdigest(SocializeUtils.md5(uMMin.getThumbImage().toByte())));
                }
            }
            constructBaseContent.put("ct", uMMin.getDescription());
            constructBaseContent.put("title", uMMin.getTitle());
            constructBaseContent.put("url", uMMin.toUrl());
            constructBaseContent.put(CommonNetImpl.M_P, uMMin.getPath());
            constructBaseContent.put(CommonNetImpl.M_U, uMMin.getUserName());
        } else if (shareContent.getShareType() == 16) {
            UMWeb uMWeb = (UMWeb) shareContent.mMedia;
            if (uMWeb.getThumbImage() != null) {
                if (uMWeb.getThumbImage().isUrlMedia()) {
                    constructBaseContent.put(CommonNetImpl.PICURL, uMWeb.getThumbImage().asUrlImage());
                } else {
                    constructBaseContent.put("pic", SocializeUtils.hexdigest(SocializeUtils.md5(uMWeb.getThumbImage().toByte())));
                }
            }
            if (share_media == SHARE_MEDIA.SINA) {
                constructBaseContent.put("ct", str2);
            } else {
                constructBaseContent.put("ct", uMWeb.getDescription());
            }
            constructBaseContent.put("title", uMWeb.getTitle());
            constructBaseContent.put("url", uMWeb.toUrl());
        }
        return constructBaseContent;
    }

    public static JSONObject constructStatsAuthEndContent(SHARE_MEDIA share_media, String str, String str2, String str3) throws JSONException {
        JSONObject constructBaseContent = constructBaseContent(share_media, str);
        constructBaseContent.put("name", CommonNetImpl.S_A_E);
        constructBaseContent.put("result", str2);
        if (!TextUtils.isEmpty(str3)) {
            constructBaseContent.put(CommonNetImpl.E_M, str3);
        }
        return constructBaseContent;
    }

    public static JSONObject constructStatsAuthStartContent(boolean z, SHARE_MEDIA share_media, String str) throws JSONException {
        JSONObject constructBaseContent = constructBaseContent(share_media, str);
        constructBaseContent.put("name", CommonNetImpl.S_A_S);
        constructBaseContent.put(CommonNetImpl.f10812AM, share_media.getsharestyle(z));
        return constructBaseContent;
    }

    public static JSONObject constructStatsDauContent(Map<String, String> map, int i) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("name", CommonNetImpl.S_DAU);
        jSONObject.put(CommonNetImpl.A_B, i);
        if (map != null) {
            JSONObject jSONObject2 = new JSONObject();
            if (!TextUtils.isEmpty(map.get("position")) && !TextUtils.isEmpty(map.get(CommonNetImpl.MENUBG))) {
                jSONObject2.put("position", map.get("position"));
                jSONObject2.put(CommonNetImpl.MENUBG, map.get(CommonNetImpl.MENUBG));
                jSONObject.put(CommonNetImpl.S_I, jSONObject2);
            }
        }
        return jSONObject;
    }

    public static JSONObject constructStatsInfoEndContent(SHARE_MEDIA share_media, String str, String str2, String str3) throws JSONException {
        JSONObject constructBaseContent = constructBaseContent(share_media, str);
        constructBaseContent.put("name", CommonNetImpl.S_I_E);
        constructBaseContent.put("result", str2);
        if (!TextUtils.isEmpty(str3)) {
            constructBaseContent.put(CommonNetImpl.E_M, str3);
        }
        return constructBaseContent;
    }

    public static JSONObject constructStatsInfoStartContent(SHARE_MEDIA share_media, String str) throws JSONException {
        JSONObject constructBaseContent = constructBaseContent(share_media, str);
        constructBaseContent.put("name", CommonNetImpl.S_I_S);
        return constructBaseContent;
    }

    public static JSONObject constructStatsShareContent(ShareContent shareContent, boolean z, SHARE_MEDIA share_media, boolean z2, String str) throws JSONException {
        JSONObject constructBaseContent = constructBaseContent(share_media, str);
        constructBaseContent.put("name", CommonNetImpl.S_S_S);
        constructBaseContent.put(CommonNetImpl.U_C, z2 + "");
        constructBaseContent.put(CommonNetImpl.f10817SM, share_media.getsharestyle(z));
        constructBaseContent.put(CommonNetImpl.STYPE, shareContent.getShareType());
        return constructBaseContent;
    }

    public static JSONObject constructStatsShareEndContent(SHARE_MEDIA share_media, String str, String str2, String str3) throws JSONException {
        JSONObject constructBaseContent = constructBaseContent(share_media, str);
        constructBaseContent.put("name", CommonNetImpl.S_S_E);
        constructBaseContent.put("result", str2);
        if (!TextUtils.isEmpty(str3)) {
            constructBaseContent.put(CommonNetImpl.E_M, str3);
        }
        return constructBaseContent;
    }

    public static JSONObject constructUserInfoContent(Map<String, String> map, SHARE_MEDIA share_media, String str) throws JSONException {
        JSONObject constructBaseContent = constructBaseContent(share_media, str);
        if (map != null) {
            constructBaseContent.put(CommonNetImpl.f10819UN, map.get("name"));
            constructBaseContent.put(CommonNetImpl.f10820UP, map.get(UMSSOHandler.ICON));
            constructBaseContent.put("sex", map.get(UMSSOHandler.GENDER));
            if (TextUtils.isEmpty(map.get("location"))) {
                constructBaseContent.put(CommonNetImpl.REGION, map.get(UMSSOHandler.CITY));
            } else {
                constructBaseContent.put(CommonNetImpl.REGION, map.get("location"));
            }
            if (share_media.toString().equals("WEIXIN")) {
                constructBaseContent.put("uid", map.get("openid"));
            } else {
                constructBaseContent.put("uid", map.get("uid"));
            }
            constructBaseContent.put("unionid", map.get("unionid"));
            constructBaseContent.put("ts", System.currentTimeMillis());
        }
        return constructBaseContent;
    }

    public static JSONObject getFakeData() throws JSONException {
        JSONObject constructBaseContent = constructBaseContent(SHARE_MEDIA.SINA, C7383o0OOO0O.OooOOO0);
        constructBaseContent.put("name", "testetstttttttttttttttttttttttttttttttt");
        constructBaseContent.put(CommonNetImpl.U_C, true);
        constructBaseContent.put(CommonNetImpl.f10817SM, "sso");
        constructBaseContent.put(CommonNetImpl.STYPE, 0);
        return constructBaseContent;
    }

    public static void uploadAuth(final Context context, final Map<String, String> map, final boolean z, final SHARE_MEDIA share_media, final String str) {
        mExecutor.execute(new Runnable() {
            /* class com.umeng.socialize.net.dplus.DplusApi.RunnableC39725 */

            public void run() {
                try {
                    UMWorkDispatch.sendEvent(context, SocializeConstants.AUTH_EVENT, DplusApi.constructAuthContent(map, z, share_media, str));
                } catch (JSONException e) {
                    SLog.error(e);
                }
            }
        });
    }

    public static void uploadAuthStart(final Context context, final boolean z, final SHARE_MEDIA share_media, final String str) {
        mExecutor.execute(new Runnable() {
            /* class com.umeng.socialize.net.dplus.DplusApi.RunnableC39736 */

            public void run() {
                try {
                    UMWorkDispatch.sendEvent(context, SocializeConstants.SAVE_STATS_EVENT, DplusApi.constructStatsAuthStartContent(z, share_media, str));
                } catch (JSONException e) {
                    SLog.error(e);
                }
            }
        });
    }

    public static void uploadAuthend(final Context context, final SHARE_MEDIA share_media, final String str, final String str2, final String str3) {
        mExecutor.execute(new Runnable() {
            /* class com.umeng.socialize.net.dplus.DplusApi.RunnableC39747 */

            public void run() {
                try {
                    UMWorkDispatch.sendEvent(context, SocializeConstants.SAVE_STATS_EVENT, DplusApi.constructStatsAuthEndContent(share_media, str, str2, str3));
                } catch (JSONException e) {
                    SLog.error(e);
                }
            }
        });
    }

    public static void uploadDAU(final Context context) {
        mExecutor.execute(new Runnable() {
            /* class com.umeng.socialize.net.dplus.DplusApi.RunnableC39661 */

            public void run() {
                try {
                    UMWorkDispatch.sendEvent(context, 24577, DplusApi.constructDauContent());
                } catch (JSONException e) {
                    SLog.error(e);
                }
            }
        });
    }

    public static void uploadInfoStart(final Context context, final SHARE_MEDIA share_media, final String str) {
        mExecutor.execute(new Runnable() {
            /* class com.umeng.socialize.net.dplus.DplusApi.RunnableC39769 */

            public void run() {
                try {
                    UMWorkDispatch.sendEvent(context, SocializeConstants.SAVE_STATS_EVENT, DplusApi.constructStatsInfoStartContent(share_media, str));
                } catch (JSONException e) {
                    SLog.error(e);
                }
            }
        });
    }

    public static void uploadInfoend(final Context context, final SHARE_MEDIA share_media, final String str, final String str2, final String str3) {
        mExecutor.execute(new Runnable() {
            /* class com.umeng.socialize.net.dplus.DplusApi.RunnableC396710 */

            public void run() {
                try {
                    UMWorkDispatch.sendEvent(context, SocializeConstants.SAVE_STATS_EVENT, DplusApi.constructStatsInfoEndContent(share_media, str, str2, str3));
                } catch (JSONException e) {
                    SLog.error(e);
                }
            }
        });
    }

    public static void uploadShare(final Context context, final ShareContent shareContent, final boolean z, final SHARE_MEDIA share_media, final String str, final boolean z2) {
        mExecutor.execute(new Runnable() {
            /* class com.umeng.socialize.net.dplus.DplusApi.RunnableC39703 */

            public void run() {
                try {
                    UMWorkDispatch.sendEvent(context, SocializeConstants.SHARE_EVENT, DplusApi.constructShareContent(shareContent, z, share_media, str));
                } catch (JSONException e) {
                    SLog.error(e);
                }
            }
        });
        mExecutor.execute(new Runnable() {
            /* class com.umeng.socialize.net.dplus.DplusApi.RunnableC39714 */

            public void run() {
                try {
                    UMWorkDispatch.sendEvent(context, SocializeConstants.SAVE_STATS_EVENT, DplusApi.constructStatsShareContent(shareContent, z, share_media, z2, str));
                } catch (JSONException e) {
                    SLog.error(e);
                }
            }
        });
    }

    public static void uploadStatsDAU(final Context context, final Map<String, String> map, final int i) {
        mExecutor.execute(new Runnable() {
            /* class com.umeng.socialize.net.dplus.DplusApi.RunnableC39692 */

            public void run() {
                try {
                    UMWorkDispatch.sendEvent(context, SocializeConstants.SEND_DAU_STATS_EVENT, DplusApi.constructStatsDauContent(map, i));
                } catch (JSONException e) {
                    SLog.error(e);
                }
            }
        });
    }

    public static void uploadStatsShareEnd(final Context context, final SHARE_MEDIA share_media, final String str, final String str2, final String str3) {
        mExecutor.execute(new Runnable() {
            /* class com.umeng.socialize.net.dplus.DplusApi.RunnableC39758 */

            public void run() {
                try {
                    UMWorkDispatch.sendEvent(context, SocializeConstants.SAVE_STATS_EVENT, DplusApi.constructStatsShareEndContent(share_media, str, str2, str3));
                } catch (JSONException e) {
                    SLog.error(e);
                }
            }
        });
    }

    public static void uploadUserInfo(final Context context, final Map<String, String> map, final SHARE_MEDIA share_media, final String str) {
        mExecutor.execute(new Runnable() {
            /* class com.umeng.socialize.net.dplus.DplusApi.RunnableC396811 */

            public void run() {
                try {
                    UMWorkDispatch.sendEvent(context, SocializeConstants.GET_EVENT, DplusApi.constructUserInfoContent(map, share_media, str));
                } catch (JSONException e) {
                    SLog.error(e);
                }
            }
        });
    }
}
