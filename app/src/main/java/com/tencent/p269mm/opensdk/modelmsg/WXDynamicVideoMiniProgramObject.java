package com.tencent.p269mm.opensdk.modelmsg;

import android.os.Bundle;
import com.tencent.p269mm.opensdk.utils.C3392d;
import com.tencent.p269mm.opensdk.utils.Log;

/* renamed from: com.tencent.mm.opensdk.modelmsg.WXDynamicVideoMiniProgramObject */
public class WXDynamicVideoMiniProgramObject extends WXMiniProgramObject {
    public static final String TAG = "MicroMsg.SDK.WXDynamicVideoMiniProgramObject";
    public String appThumbUrl;
    public String videoSource;

    @Override // com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage.IMediaObject, com.tencent.p269mm.opensdk.modelmsg.WXMiniProgramObject
    public boolean checkArgs() {
        String str;
        if (C3392d.m8661b(this.webpageUrl)) {
            str = "webPageUrl is null";
        } else if (C3392d.m8661b(this.userName)) {
            str = "userName is null";
        } else {
            int i = this.miniprogramType;
            if (i >= 0 && i <= 2) {
                return true;
            }
            str = "miniprogram type should between MINIPTOGRAM_TYPE_RELEASE and MINIPROGRAM_TYPE_PREVIEW";
        }
        Log.m8651e(TAG, str);
        return false;
    }

    @Override // com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage.IMediaObject, com.tencent.p269mm.opensdk.modelmsg.WXMiniProgramObject
    public void serialize(Bundle bundle) {
        bundle.putString("_wxminiprogram_webpageurl", this.webpageUrl);
        bundle.putString("_wxminiprogram_username", this.userName);
        bundle.putString("_wxminiprogram_path", this.path);
        bundle.putString("_wxminiprogram_videoSource", this.videoSource);
        bundle.putString("_wxminiprogram_appThumbUrl", this.appThumbUrl);
        bundle.putBoolean("_wxminiprogram_withsharetiket", this.withShareTicket);
        bundle.putInt("_wxminiprogram_type", this.miniprogramType);
    }

    @Override // com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage.IMediaObject, com.tencent.p269mm.opensdk.modelmsg.WXMiniProgramObject
    public int type() {
        return 46;
    }

    @Override // com.tencent.p269mm.opensdk.modelmsg.WXMediaMessage.IMediaObject, com.tencent.p269mm.opensdk.modelmsg.WXMiniProgramObject
    public void unserialize(Bundle bundle) {
        this.webpageUrl = bundle.getString("_wxminiprogram_webpageurl");
        this.userName = bundle.getString("_wxminiprogram_username");
        this.path = bundle.getString("_wxminiprogram_path");
        this.videoSource = bundle.getString("_wxminiprogram_videoSource");
        this.appThumbUrl = bundle.getString("_wxminiprogram_appThumbUrl");
        this.withShareTicket = bundle.getBoolean("_wxminiprogram_withsharetiket");
        this.miniprogramType = bundle.getInt("_wxminiprogram_type");
    }
}
