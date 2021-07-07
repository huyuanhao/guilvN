package com.qiyukf.unicorn.api.msg.attachment;

import java.io.Serializable;

public interface CustomProductParser extends Serializable {
    UnicornAttachmentBase parseCustomProduct(String str);
}
