package com.qiyukf.unicorn.p213f.p214a;

import android.content.Context;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.msg.attachment.MsgAttachment;
import org.json.JSONObject;

/* renamed from: com.qiyukf.unicorn.f.a.d */
public abstract class AbstractC2558d implements MsgAttachment {
    public void afterParse(JSONObject jSONObject) {
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.MsgAttachment
    public boolean countToUnread() {
        return false;
    }

    public final void fromJson(JSONObject jSONObject) {
        C2547b.m5680a(this, jSONObject);
        afterParse(jSONObject);
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.MsgAttachment
    public String getContent(Context context) {
        return context.getString(C2364R.string.ysf_msg_notify_custom_default);
    }
}
