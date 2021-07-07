package com.umeng.socialize.net.analytics;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.p118pd.sdk.C7522o0Ooo0o;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.media.UMediaObject;
import com.umeng.socialize.net.base.SocializeClient;
import com.umeng.socialize.net.dplus.CommonNetImpl;
import com.umeng.socialize.net.dplus.DplusApi;
import com.umeng.socialize.uploadlog.UMLog;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.SocializeSpUtils;
import com.umeng.socialize.utils.UmengText;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public final class SocialAnalytics {

    /* renamed from: a */
    public static SocializeClient f10806a = new SocializeClient();

    /* renamed from: b */
    public static ExecutorService f10807b = Executors.newCachedThreadPool();

    public static void authendt(Context context, SHARE_MEDIA share_media, String str, boolean z, String str2, String str3, Map<String, String> map) {
        DplusApi.uploadAuthend(context, share_media, str3, str, str2);
        if (map != null) {
            DplusApi.uploadAuth(context, map, z, share_media, str3);
        }
    }

    public static void authstart(Context context, SHARE_MEDIA share_media, String str, boolean z, String str2) {
        DplusApi.uploadAuthStart(context, z, share_media, str2);
    }

    public static void dauStats(Context context, boolean z) {
        Bundle shareAndAuth = UMLog.getShareAndAuth();
        int i = (shareAndAuth.getBoolean("isjump") ? CommonNetImpl.FLAG_SHARE_JUMP : 0) | (shareAndAuth.getBoolean("share") ? 536870912 : 0) | (shareAndAuth.getBoolean("auth") ? CommonNetImpl.FLAG_AUTH : 0) | (UMLog.isOpenShareEdit() ? 16777216 : 0);
        String shareBoardConfig = SocializeSpUtils.getShareBoardConfig(context);
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(shareBoardConfig)) {
            String[] split = shareBoardConfig.split(C7522o0Ooo0o.OooO0O0);
            if (split.length == 2) {
                String str = split[0];
                String str2 = split[1];
                if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                    hashMap.put("position", split[1]);
                    hashMap.put(CommonNetImpl.MENUBG, split[0]);
                    DplusApi.uploadStatsDAU(context, hashMap, i);
                    return;
                }
                return;
            }
            return;
        }
        DplusApi.uploadStatsDAU(context, null, i);
    }

    public static void getInfoendt(Context context, SHARE_MEDIA share_media, String str, String str2, String str3, Map<String, String> map) {
        DplusApi.uploadInfoend(context, share_media, str3, str, str2);
        if (map != null) {
            DplusApi.uploadUserInfo(context, map, share_media, str3);
        }
    }

    public static void getInfostart(Context context, SHARE_MEDIA share_media, String str) {
        DplusApi.uploadInfoStart(context, share_media, str);
    }

    public static void log(final Context context, final String str, final String str2, final UMediaObject uMediaObject) {
        m10825a(new Runnable() {
            /* class com.umeng.socialize.net.analytics.SocialAnalytics.RunnableC39641 */

            public void run() {
                AnalyticsReqeust analyticsReqeust = new AnalyticsReqeust(context, str, str2);
                analyticsReqeust.setMedia(uMediaObject);
                analyticsReqeust.setReqType(1);
                AnalyticsResponse analyticsResponse = (AnalyticsResponse) SocialAnalytics.f10806a.execute(analyticsReqeust);
                if (analyticsResponse == null || !analyticsResponse.isOk()) {
                    SLog.debug(UmengText.NET.SHARESELFFAIL);
                } else {
                    SLog.debug(UmengText.NET.SHARESELFOK);
                }
            }
        });
    }

    public static void shareend(Context context, SHARE_MEDIA share_media, String str, String str2, String str3) {
        DplusApi.uploadStatsShareEnd(context, share_media, str3, str, str2);
    }

    /* renamed from: a */
    public static void m10825a(Runnable runnable) {
        ExecutorService executorService = f10807b;
        if (executorService != null && runnable != null) {
            executorService.execute(runnable);
        }
    }
}
