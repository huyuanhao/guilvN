package com.umeng.socialize.net.base;

import android.text.TextUtils;
import com.umeng.socialize.common.SocializeConstants;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.umeng.socialize.net.utils.UResponse;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public class SocializeReseponse extends UResponse {
    public static final String TAG = "SocializeReseponse";
    public int mHttpCode;
    public JSONObject mJsonData;
    public String mMsg;
    public int mStCode;

    public SocializeReseponse(JSONObject jSONObject) {
        super(jSONObject);
        this.mStCode = -103;
        this.mJsonData = parseStatus(jSONObject);
        parseJsonObject();
    }

    private void parseErrorMsg(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                JSONObject jSONObject2 = jSONObject.getJSONObject(keys.next());
                if (TextUtils.isEmpty(jSONObject2.getString("msg"))) {
                    jSONObject2.getJSONObject("data").getString(SocializeProtocolConstants.PROTOCOL_KEY_PLATFORM_ERROR);
                }
            }
        } catch (Exception e) {
            SLog.error(e);
        }
    }

    public JSONObject getJsonData() {
        return this.mJsonData;
    }

    public boolean isHttpOK() {
        return this.mHttpCode == 200;
    }

    public boolean isOk() {
        return this.mStCode == 200;
    }

    public void parseJsonObject() {
    }

    public JSONObject parseStatus(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            int optInt = jSONObject.optInt("st", SocializeConstants.SERVER_RETURN_PARAMS_ILLEGAL);
            this.mStCode = optInt;
            if (optInt == 0) {
                return null;
            }
            this.mMsg = jSONObject.optString("msg", "");
            String optString = jSONObject.optString("data", null);
            if (TextUtils.isEmpty(optString)) {
                return null;
            }
            if (this.mStCode != 200) {
                parseErrorMsg(optString);
            }
            return new JSONObject(optString);
        } catch (JSONException e) {
            SLog.error(UmengText.NET.PARSEERROR, e);
            return null;
        }
    }

    public SocializeReseponse(Integer num, JSONObject jSONObject) {
        this(jSONObject);
        int i;
        if (num == null) {
            i = -1;
        } else {
            i = num.intValue();
        }
        this.mHttpCode = i;
    }
}
