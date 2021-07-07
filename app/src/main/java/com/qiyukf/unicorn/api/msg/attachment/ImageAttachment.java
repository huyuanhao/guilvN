package com.qiyukf.unicorn.api.msg.attachment;

import android.content.Context;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.nimlib.p198j.p201c.EnumC2347c;
import com.qiyukf.unicorn.C2364R;
import org.json.JSONObject;

public class ImageAttachment extends FileAttachment {
    public static final String KEY_HEIGHT = "h";
    public static final String KEY_WIDTH = "w";
    public int height;
    public int width;

    public ImageAttachment() {
    }

    public ImageAttachment(String str) {
        super(str);
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.FileAttachment, com.qiyukf.unicorn.api.msg.attachment.MsgAttachment
    public String getContent(Context context) {
        return context.getString(C2364R.string.ysf_msg_notify_image);
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
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.FileAttachment
    public void save(JSONObject jSONObject, boolean z) {
        C1810b.m3422a(jSONObject, "w", this.width);
        C1810b.m3422a(jSONObject, "h", this.height);
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.FileAttachment
    public EnumC2347c storageType() {
        return EnumC2347c.TYPE_IMAGE;
    }
}
