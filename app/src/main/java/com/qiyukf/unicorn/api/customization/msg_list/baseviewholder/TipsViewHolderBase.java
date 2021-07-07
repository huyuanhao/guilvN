package com.qiyukf.unicorn.api.customization.msg_list.baseviewholder;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.qiyukf.nim.uikit.session.emoji.C1990f;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;
import com.qiyukf.unicorn.api.msg.attachment.MsgAttachment;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2559a;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2590t;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2592v;

public abstract class TipsViewHolderBase extends UnicornMessageViewHolder {
    private String getDisplayText() {
        MsgAttachment attachment = this.message.getAttachment();
        return attachment instanceof C2559a ? ((C2559a) attachment).mo35982a().toString() : attachment instanceof C2592v ? ((C2592v) attachment).mo36116b() : attachment instanceof C2590t ? ((C2590t) attachment).mo36106d() : this.message.getContent();
    }

    private void handleTextNotification(String str) {
        C1990f.m3949a(this.context, getMainTextView(), str, this.message.getSessionId());
        getMainTextView().setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.qiyukf.unicorn.api.customization.msg_list.baseviewholder.UnicornMessageViewHolder
    public final void bindContentView(IMMessage iMMessage, Context context) {
        handleTextNotification(getDisplayText());
    }

    public abstract TextView getMainTextView();

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b, com.qiyukf.unicorn.api.customization.msg_list.baseviewholder.UnicornMessageViewHolder
    public boolean isMiddleItem() {
        return true;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b, com.qiyukf.unicorn.api.customization.msg_list.baseviewholder.UnicornMessageViewHolder
    public boolean showAvatar() {
        return false;
    }
}
