package com.xiaomi.clientreport.data;

import com.p118pd.sdk.C8404oOoo0O00;
import com.xiaomi.channel.commonutils.logger.AbstractC4163b;
import org.json.JSONException;
import org.json.JSONObject;

public class EventClientReport extends C4164a {
    public String eventContent;
    public String eventId;
    public long eventTime;
    public int eventType;

    public static EventClientReport getBlankInstance() {
        return new EventClientReport();
    }

    @Override // com.xiaomi.clientreport.data.C4164a
    public JSONObject toJson() {
        try {
            JSONObject json = super.toJson();
            if (json == null) {
                return null;
            }
            json.put("eventId", this.eventId);
            json.put("eventType", this.eventType);
            json.put(C8404oOoo0O00.OooOO0o, this.eventTime);
            json.put("eventContent", this.eventContent);
            return json;
        } catch (JSONException e) {
            AbstractC4163b.m11303a(e);
            return null;
        }
    }

    @Override // com.xiaomi.clientreport.data.C4164a
    public String toJsonString() {
        return super.toJsonString();
    }
}
