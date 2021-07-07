package com.umeng.socialize.net.analytics;

import android.content.Context;
import android.text.TextUtils;
import com.p118pd.sdk.C8932ooOOO0o;
import com.umeng.socialize.Config;
import com.umeng.socialize.media.UMImage;
import com.umeng.socialize.media.UMMin;
import com.umeng.socialize.media.UMVideo;
import com.umeng.socialize.media.UMWeb;
import com.umeng.socialize.media.UMediaObject;
import com.umeng.socialize.media.UMusic;
import com.umeng.socialize.net.base.SocializeRequest;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.umeng.socialize.net.utils.URequest;
import com.umeng.socialize.utils.SocializeUtils;

public class AnalyticsReqeust extends SocializeRequest {

    /* renamed from: a */
    public static final String f10796a = "/share/multi_add/";

    /* renamed from: b */
    public static final int f10797b = 9;

    /* renamed from: c */
    public String f10798c;

    /* renamed from: d */
    public String f10799d;

    /* renamed from: e */
    public String f10800e;

    /* renamed from: f */
    public String f10801f;

    /* renamed from: g */
    public String f10802g;

    /* renamed from: h */
    public String f10803h;

    /* renamed from: i */
    public String f10804i;

    /* renamed from: j */
    public UMediaObject f10805j;

    public AnalyticsReqeust(Context context, String str, String str2) {
        super(context, "", AnalyticsResponse.class, 9, URequest.RequestMethod.POST);
        this.mContext = context;
        this.f10799d = str;
        this.f10804i = str2;
    }

    @Override // com.umeng.socialize.net.base.SocializeRequest
    public String getPath() {
        return f10796a + SocializeUtils.getAppkey(this.mContext) + C8932ooOOO0o.OooO0OO + Config.EntityKey + C8932ooOOO0o.OooO0OO;
    }

    @Override // com.umeng.socialize.net.base.SocializeRequest, com.umeng.socialize.net.utils.URequest
    public void onPrepareRequest() {
        super.onPrepareRequest();
        Object[] objArr = new Object[2];
        objArr[0] = this.f10799d;
        String str = this.f10798c;
        if (str == null) {
            str = "";
        }
        objArr[1] = str;
        String format = String.format("{\"%s\":\"%s\"}", objArr);
        String appkey = SocializeUtils.getAppkey(this.mContext);
        addStringParams(SocializeProtocolConstants.PROTOCOL_KEY_DESCRIPTOR, Config.Descriptor);
        addStringParams("to", format);
        addStringParams(SocializeProtocolConstants.PROTOCOL_KEY_SHARE_SNS, format);
        addStringParams(SocializeProtocolConstants.PROTOCOL_KEY_AK, appkey);
        addStringParams("type", this.f10801f);
        addStringParams("usid", this.f10798c);
        addStringParams("ct", this.f10804i);
        if (!TextUtils.isEmpty(this.f10803h)) {
            addStringParams("url", this.f10803h);
        }
        if (!TextUtils.isEmpty(this.f10802g)) {
            addStringParams("title", this.f10802g);
        }
        addMediaParams(this.f10805j);
    }

    public void setMedia(UMediaObject uMediaObject) {
        if (uMediaObject instanceof UMImage) {
            this.f10805j = uMediaObject;
        } else if (uMediaObject instanceof UMusic) {
            UMusic uMusic = (UMusic) uMediaObject;
            this.f10802g = uMusic.getTitle();
            this.f10803h = uMusic.toUrl();
            this.f10804i = uMusic.getDescription();
            this.f10805j = uMusic.getThumbImage();
        } else if (uMediaObject instanceof UMVideo) {
            UMVideo uMVideo = (UMVideo) uMediaObject;
            this.f10802g = uMVideo.getTitle();
            this.f10803h = uMVideo.toUrl();
            this.f10804i = uMVideo.getDescription();
            this.f10805j = uMVideo.getThumbImage();
        } else if (uMediaObject instanceof UMWeb) {
            UMWeb uMWeb = (UMWeb) uMediaObject;
            this.f10802g = uMWeb.getTitle();
            this.f10803h = uMWeb.toUrl();
            this.f10804i = uMWeb.getDescription();
            this.f10805j = uMWeb.getThumbImage();
        } else if (uMediaObject instanceof UMMin) {
            UMMin uMMin = (UMMin) uMediaObject;
            this.f10802g = uMMin.getTitle();
            this.f10803h = uMMin.toUrl();
            this.f10804i = uMMin.getDescription();
            this.f10805j = uMMin.getThumbImage();
        }
    }

    public void setPlatform(String str) {
        this.f10799d = str;
    }

    public void setText(String str) {
        this.f10804i = str;
    }

    public void setType(String str) {
        this.f10801f = str;
    }

    public void setUID(String str) {
        this.f10800e = str;
    }

    public void setmUsid(String str) {
        this.f10798c = str;
    }
}
