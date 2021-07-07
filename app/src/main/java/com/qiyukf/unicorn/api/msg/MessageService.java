package com.qiyukf.unicorn.api.msg;

import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.api.ProductDetail;
import com.qiyukf.unicorn.api.msg.attachment.ProductAttachment;
import com.qiyukf.unicorn.p213f.p214a.AbstractC2597e;
import com.qiyukf.unicorn.p229h.C2667c;

public class MessageService {
    public static void saveMessageToLocal(IMMessage iMMessage, boolean z, boolean z2) {
        C2667c.m6118a(iMMessage, z, z2);
    }

    public static void sendMessage(IMMessage iMMessage) {
        C2667c.m6119b(iMMessage);
    }

    public static void sendProductMessage(ProductDetail productDetail) {
        sendProductMessage(C2667c.m6116a(), productDetail);
    }

    public static void sendProductMessage(String str, ProductDetail productDetail) {
        ProductAttachment productAttachment = new ProductAttachment();
        productAttachment.fromProductDetail(productDetail, false);
        if (productAttachment.getSendByUser() == 1) {
            productAttachment.setSendByUser(0);
        }
        if (productAttachment.getShow() == 1) {
            IMMessage buildCustomMessage = UnicornMessageBuilder.buildCustomMessage(str, productAttachment);
            buildCustomMessage.setStatus(MsgStatusEnum.success);
            C2667c.m6119b(buildCustomMessage);
            return;
        }
        C2667c.m6115a((AbstractC2597e) productAttachment, str, false);
    }
}
