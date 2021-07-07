package com.umeng.socialize.net;

import com.umeng.socialize.net.base.SocializeReseponse;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import org.json.JSONObject;

public class LinkCardResponse extends SocializeReseponse {
    public String url;

    public LinkCardResponse(JSONObject jSONObject) {
        super(jSONObject);
    }

    @Override // com.umeng.socialize.net.base.SocializeReseponse
    public void parseJsonObject() {
        JSONObject jSONObject = this.mJsonData;
        if (jSONObject == null) {
            SLog.m10856E(UmengText.NET.JSONNULL);
        } else {
            this.url = jSONObject.optString("linkcard_url");
        }
    }

    public LinkCardResponse(Integer num, JSONObject jSONObject) {
        super(num, jSONObject);
    }
}
