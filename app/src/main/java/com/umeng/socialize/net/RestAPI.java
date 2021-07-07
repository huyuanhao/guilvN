package com.umeng.socialize.net;

import com.umeng.socialize.net.analytics.AnalyticsReqeust;
import com.umeng.socialize.net.analytics.AnalyticsResponse;
import com.umeng.socialize.net.base.SocializeClient;

public class RestAPI {

    /* renamed from: a */
    public static SocializeClient f10795a = new SocializeClient();

    public static LinkCardResponse convertLinkCard(LinkcardRequest linkcardRequest) {
        return (LinkCardResponse) f10795a.execute(linkcardRequest);
    }

    public static AnalyticsResponse doShareByRequest(AnalyticsReqeust analyticsReqeust) {
        return (AnalyticsResponse) f10795a.execute(analyticsReqeust);
    }

    public static ActionBarResponse queryShareId(ActionBarRequest actionBarRequest) {
        return (ActionBarResponse) f10795a.execute(actionBarRequest);
    }
}
