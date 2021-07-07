package com.qiyukf.unicorn.api.customization.msg_list.baseviewholder;

import android.content.Context;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nimlib.sdk.msg.MessageBuilder;
import com.qiyukf.nimlib.sdk.msg.constant.MsgDirectionEnum;
import com.qiyukf.nimlib.sdk.msg.constant.SessionTypeEnum;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.msg.attachment.ProductAttachment;
import com.qiyukf.unicorn.p229h.C2667c;

public abstract class ProductViewHolderBase extends UnicornMessageViewHolder {
    @Override // com.qiyukf.unicorn.api.customization.msg_list.baseviewholder.UnicornMessageViewHolder
    public final void bindContentView(IMMessage iMMessage, Context context) {
        ProductAttachment productAttachment = (ProductAttachment) iMMessage.getAttachment();
        boolean z = true;
        if (!(productAttachment.getSendByUser() == 1 && iMMessage.getDirect() == MsgDirectionEnum.Out && C2452d.m5375g().mo36355f(iMMessage.getSessionId()) != 1)) {
            z = false;
        }
        bindTextMsgView(context, productAttachment, Boolean.valueOf(z));
    }

    public abstract void bindTextMsgView(Context context, ProductAttachment productAttachment, Boolean bool);

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b, com.qiyukf.unicorn.api.customization.msg_list.baseviewholder.UnicornMessageViewHolder
    public int leftBackground() {
        return 0;
    }

    public final void onClickToSendByUser(ProductAttachment productAttachment) {
        int i;
        if (C2452d.m5375g().mo36355f(this.message.getSessionId()) == 1) {
            i = C2364R.string.ysf_send_card_robot;
        } else if (!C2667c.m6120b()) {
            i = C2364R.string.ysf_send_card_error;
        } else {
            ProductAttachment clone = productAttachment.clone();
            if (clone != null) {
                clone.setSendByUser(0);
                clone.setActionText("");
                C2667c.m6119b(MessageBuilder.createCustomMessage(this.message.getSessionId(), SessionTypeEnum.Ysf, clone));
                return;
            }
            return;
        }
        C1865f.m3559b(i);
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b, com.qiyukf.unicorn.api.customization.msg_list.baseviewholder.UnicornMessageViewHolder
    public int rightBackground() {
        return 0;
    }
}
