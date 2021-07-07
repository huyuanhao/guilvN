package com.qiyukf.unicorn.api.msg.attachment;

import com.qiyukf.unicorn.p213f.p214a.AbstractC2558d;

public class UnicornAttachmentBase extends AbstractC2558d {
    public String attach;

    public UnicornAttachmentBase(String str) {
        this.attach = str;
    }

    @Override // com.qiyukf.unicorn.api.msg.attachment.MsgAttachment
    public String toJson(boolean z) {
        return this.attach;
    }
}
