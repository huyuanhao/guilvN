package com.qiyukf.unicorn.api.customization.msg_list;

import com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b;
import com.qiyukf.nim.uikit.session.viewholder.C2090c;
import com.qiyukf.nim.uikit.session.viewholder.C2092e;
import com.qiyukf.unicorn.api.customization.msg_list.baseviewholder.EvaluationViewHolderBase;
import com.qiyukf.unicorn.api.customization.msg_list.baseviewholder.ProductViewHolderBase;
import com.qiyukf.unicorn.api.customization.msg_list.baseviewholder.TextViewHolderBase;
import com.qiyukf.unicorn.api.customization.msg_list.baseviewholder.TipsViewHolderBase;
import com.qiyukf.unicorn.api.msg.MsgTypeEnum;
import com.qiyukf.unicorn.api.msg.attachment.MsgAttachment;
import com.qiyukf.unicorn.api.msg.attachment.ProductAttachment;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2608d;

public class MsgCustomizationRegistry {
    @SafeVarargs
    public static void hideViewForMsgType(Class<? extends MsgAttachment>... clsArr) {
        for (Class<? extends MsgAttachment> cls : clsArr) {
            C2090c.m4247a(cls, C2092e.class, false);
        }
    }

    public static void registerMessageHandlerFactory(MessageHandlerFactory messageHandlerFactory) {
        C2090c.m4244a(messageHandlerFactory);
    }

    public static void registerMessageViewHolder(Class<? extends AbstractC2083b> cls) {
        if (TextViewHolderBase.class.isAssignableFrom(cls)) {
            C2090c.m4245a(MsgTypeEnum.text, cls);
        } else if (TipsViewHolderBase.class.isAssignableFrom(cls)) {
            C2090c.m4245a(MsgTypeEnum.tips, cls);
        } else if (EvaluationViewHolderBase.class.isAssignableFrom(cls)) {
            C2090c.m4247a(C2608d.class, cls, true);
        } else if (ProductViewHolderBase.class.isAssignableFrom(cls)) {
            C2090c.m4247a(ProductAttachment.class, cls, true);
        }
    }

    public static void registerMessageViewHolder(Class<? extends MsgAttachment> cls, Class<? extends AbstractC2083b> cls2) {
        C2090c.m4247a(cls, cls2, true);
    }
}
