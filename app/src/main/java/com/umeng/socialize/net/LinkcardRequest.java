package com.umeng.socialize.net;

import android.content.Context;
import android.text.TextUtils;
import com.p118pd.sdk.C8932ooOOO0o;
import com.umeng.socialize.Config;
import com.umeng.socialize.media.BaseMediaObject;
import com.umeng.socialize.media.UMImage;
import com.umeng.socialize.media.UMVideo;
import com.umeng.socialize.media.UMWeb;
import com.umeng.socialize.media.UMusic;
import com.umeng.socialize.net.base.SocializeRequest;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.umeng.socialize.net.utils.URequest;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.SocializeUtils;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class LinkcardRequest extends SocializeRequest {

    /* renamed from: a */
    public static final String f10792a = "/share/linkcard/";

    /* renamed from: b */
    public String f10793b;

    /* renamed from: c */
    public BaseMediaObject f10794c;

    public LinkcardRequest(Context context) {
        super(context, "", LinkCardResponse.class, 0, URequest.RequestMethod.POST);
    }

    /* renamed from: a */
    private JSONObject m10815a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("display_name", this.f10794c.getTitle());
            jSONObject.put(SocializeProtocolConstants.IMAGE, m10820f());
            jSONObject.put("summary", m10818d());
            jSONObject.put(SocializeProtocolConstants.FULL_IMAGE, m10822h());
            jSONObject.put("url", this.f10794c.toUrl());
            jSONObject.put(SocializeProtocolConstants.LINKS, m10823i());
            jSONObject.put("tags", m10819e());
            jSONObject.put(SocializeProtocolConstants.CREATE_AT, m10817c());
            jSONObject.put(SocializeProtocolConstants.OBJECT_TYPE, m10816b());
        } catch (JSONException e) {
            SLog.error(e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    private String m10816b() {
        BaseMediaObject baseMediaObject = this.f10794c;
        if (baseMediaObject instanceof UMWeb) {
            return "webpage";
        }
        if (baseMediaObject instanceof UMVideo) {
            return "video";
        }
        if (baseMediaObject instanceof UMusic) {
            return "audio";
        }
        return "webpage";
    }

    /* renamed from: c */
    private String m10817c() {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date(System.currentTimeMillis()));
    }

    /* renamed from: d */
    private String m10818d() {
        if (TextUtils.isEmpty(this.f10794c.getDescription()) || this.f10794c.getDescription().length() <= 300) {
            return this.f10794c.getDescription();
        }
        return this.f10794c.getDescription().substring(0, 300);
    }

    /* renamed from: e */
    private JSONArray m10819e() {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("display_name", Config.Descriptor);
            jSONArray.put(jSONObject);
        } catch (JSONException e) {
            SLog.error(e);
        }
        return jSONArray;
    }

    /* renamed from: f */
    private JSONObject m10820f() {
        JSONObject jSONObject = new JSONObject();
        try {
            UMImage thumbImage = this.f10794c.getThumbImage();
            if (thumbImage == null || !thumbImage.isUrlMedia()) {
                jSONObject.put("url", "https://mobile.umeng.com/images/pic/home/social/img-1.png");
            } else {
                jSONObject.put("url", thumbImage.asUrlImage());
            }
            int[] g = m10821g();
            jSONObject.put("width", g[0]);
            jSONObject.put("height", g[1]);
        } catch (JSONException e) {
            SLog.error(e);
        }
        return jSONObject;
    }

    /* renamed from: g */
    private int[] m10821g() {
        int[] iArr = {120, 120};
        BaseMediaObject baseMediaObject = this.f10794c;
        if (!(baseMediaObject == null || baseMediaObject.getmExtra() == null)) {
            Map<String, Object> map = this.f10794c.getmExtra();
            if (map.containsKey("width")) {
                iArr[0] = ((Integer) map.get("width")).intValue();
            }
            if (map.containsKey("height")) {
                iArr[1] = ((Integer) map.get("height")).intValue();
            }
        }
        return iArr;
    }

    /* renamed from: h */
    private JSONObject m10822h() {
        JSONObject jSONObject = new JSONObject();
        try {
            UMImage thumbImage = this.f10794c.getThumbImage();
            if (thumbImage == null || !thumbImage.isUrlMedia()) {
                jSONObject.put("url", "https://mobile.umeng.com/images/pic/home/social/img-1.png");
            } else {
                jSONObject.put("url", thumbImage.asUrlImage());
            }
            int[] g = m10821g();
            jSONObject.put("width", g[0]);
            jSONObject.put("height", g[1]);
        } catch (JSONException e) {
            SLog.error(e);
        }
        return jSONObject;
    }

    /* renamed from: i */
    private JSONObject m10823i() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("url", this.f10794c.toUrl());
        } catch (JSONException e) {
            SLog.error(e);
        }
        return jSONObject;
    }

    @Override // com.umeng.socialize.net.base.SocializeRequest
    public String getPath() {
        return f10792a + SocializeUtils.getAppkey(this.mContext) + C8932ooOOO0o.OooO0OO + Config.EntityKey + C8932ooOOO0o.OooO0OO;
    }

    @Override // com.umeng.socialize.net.base.SocializeRequest, com.umeng.socialize.net.utils.URequest
    public void onPrepareRequest() {
        super.onPrepareRequest();
        addStringParams("linkcard_info", m10815a().toString());
    }

    public void setMedia(BaseMediaObject baseMediaObject) {
        this.f10794c = baseMediaObject;
    }
}
