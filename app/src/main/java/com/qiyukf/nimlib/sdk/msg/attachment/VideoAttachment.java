package com.qiyukf.nimlib.sdk.msg.attachment;

import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.nimlib.p198j.p201c.EnumC2347c;
import com.qiyukf.unicorn.api.msg.attachment.FileAttachment;
import org.json.JSONObject;

public class VideoAttachment extends FileAttachment {
    public static final String KEY_DURATION = "dur";
    public static final String KEY_HEIGHT = "h";
    public static final String KEY_WIDTH = "w";
    public long duration;
    public int height;
    public int width;

    public VideoAttachment() {
    }

    public VideoAttachment(String str) {
        super(str);
    }

    public long getDuration() {
        return this.duration;
    }

    public int getHeight() {
        return this.height;
    }

    public int getWidth() {
        return this.width;
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.FileAttachment
    public void load(JSONObject jSONObject) {
        this.width = C1810b.m3427b(jSONObject, "w");
        this.height = C1810b.m3427b(jSONObject, "h");
        this.duration = (long) C1810b.m3427b(jSONObject, "dur");
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.FileAttachment
    public void save(JSONObject jSONObject, boolean z) {
        C1810b.m3422a(jSONObject, "w", this.width);
        C1810b.m3422a(jSONObject, "h", this.height);
        C1810b.m3423a(jSONObject, "dur", this.duration);
    }

    public void setDuration(long j) {
        this.duration = j;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.FileAttachment
    public EnumC2347c storageType() {
        return EnumC2347c.TYPE_VIDEO;
    }
}
