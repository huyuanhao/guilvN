package com.qiyukf.nimlib.sdk.msg.attachment;

import android.content.Context;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.msg.attachment.MsgAttachment;
import org.json.JSONObject;

public class LocationAttachment implements MsgAttachment {
    public static final String KEY_DESC = "title";
    public static final String KEY_LATITUDE = "lat";
    public static final String KEY_LONGITUDE = "lng";
    public String address;
    public double latitude;
    public double longitude;

    public LocationAttachment() {
    }

    public LocationAttachment(String str) {
        fromJson(str);
    }

    private void fromJson(String str) {
        JSONObject a = C1810b.m3420a(str);
        this.latitude = C1810b.m3431d(a, "lat");
        this.longitude = C1810b.m3431d(a, "lng");
        this.address = C1810b.m3432e(a, "title");
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.MsgAttachment
    public boolean countToUnread() {
        return true;
    }

    public String getAddress() {
        return this.address;
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.MsgAttachment
    public String getContent(Context context) {
        return context.getString(C2364R.string.ysf_msg_notify_location);
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public void setAddress(String str) {
        this.address = str;
    }

    public void setLatitude(double d) {
        this.latitude = d;
    }

    public void setLongitude(double d) {
        this.longitude = d;
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.MsgAttachment
    public String toJson(boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lat", this.latitude);
            jSONObject.put("lng", this.longitude);
            jSONObject.put("title", this.address);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return jSONObject.toString();
    }
}
