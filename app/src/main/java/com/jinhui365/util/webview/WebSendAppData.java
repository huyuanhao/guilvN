package com.jinhui365.util.webview;

import androidx.annotation.Keep;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
public class WebSendAppData implements Serializable {
    public HashMap<String, Object> data;
    public String idStr;
    public String type = "";

    public WebSendAppData(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            setIdStr((String) jSONObject.get("id"));
            setType(jSONObject.getString("type"));
            setData(OooO00o(jSONObject.getJSONObject("data")));
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private HashMap<String, Object> OooO00o(JSONObject jSONObject) {
        HashMap<String, Object> hashMap = new HashMap<>();
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                Object obj = jSONObject.get(next);
                if (obj instanceof JSONObject) {
                    hashMap.put(next, OooO00o((JSONObject) obj));
                } else {
                    hashMap.put(next, obj);
                }
            }
        } catch (JSONException e) {
            e.printStackTrace();
        } catch (Exception unused) {
        }
        return hashMap;
    }

    public HashMap<String, Object> getData() {
        return this.data;
    }

    public String getIdStr() {
        return this.idStr;
    }

    public String getType() {
        return this.type;
    }

    public void setData(HashMap<String, Object> hashMap) {
        this.data = hashMap;
    }

    public void setIdStr(String str) {
        this.idStr = str;
    }

    public void setType(String str) {
        this.type = str;
    }
}
