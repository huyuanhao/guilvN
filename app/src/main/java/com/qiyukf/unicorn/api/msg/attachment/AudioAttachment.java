package com.qiyukf.unicorn.api.msg.attachment;

import android.content.Context;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.nimlib.p198j.p201c.EnumC2347c;
import com.qiyukf.unicorn.C2364R;
import org.json.JSONObject;

public class AudioAttachment extends FileAttachment {
    public static final String KEY_DURATION = "dur";
    public static final String KEY_IS_AUTO_TRANSFORM = "auto";
    public static final String KEY_TEXT = "tt";
    public boolean autoTransform;
    public long duration;
    public String text;

    public AudioAttachment() {
    }

    public AudioAttachment(String str) {
        super(str);
    }

    public boolean getAutoTransform() {
        return this.autoTransform;
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.FileAttachment, com.qiyukf.unicorn.api.msg.attachment.MsgAttachment
    public String getContent(Context context) {
        return context.getString(C2364R.string.ysf_msg_notify_audio);
    }

    public long getDuration() {
        return this.duration;
    }

    public String getText() {
        return this.text;
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.FileAttachment
    public void load(JSONObject jSONObject) {
        this.duration = C1810b.m3430c(jSONObject, "dur");
        this.text = C1810b.m3432e(jSONObject, KEY_TEXT);
        this.autoTransform = C1810b.m3426a(jSONObject, "auto");
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.FileAttachment
    public void save(JSONObject jSONObject, boolean z) {
        C1810b.m3423a(jSONObject, "dur", this.duration);
        if (!z) {
            C1810b.m3425a(jSONObject, KEY_TEXT, this.text);
            C1810b.m3424a(jSONObject, "auto", Boolean.valueOf(this.autoTransform));
        }
    }

    public void setAutoTransform(boolean z) {
        this.autoTransform = z;
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setText(String str) {
        this.text = str;
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.FileAttachment
    public EnumC2347c storageType() {
        return EnumC2347c.TYPE_AUDIO;
    }
}
