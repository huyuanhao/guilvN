package com.umeng.socialize.net.dplus.cache;

import com.umeng.socialize.utils.SLog;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonReader extends IReader<JSONObject> {
    public JsonReader(String str) {
        super(str);
    }

    @Override // com.umeng.socialize.net.dplus.cache.IReader
    public void create(String str) {
        try {
            this.result = (T) new JSONObject(str);
        } catch (JSONException e) {
            SLog.error(e);
        }
    }
}
