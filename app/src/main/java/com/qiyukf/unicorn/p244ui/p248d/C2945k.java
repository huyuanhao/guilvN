package com.qiyukf.unicorn.p244ui.p248d;

import android.widget.TextView;
import com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.msg.attachment.MsgAttachment;
import com.qiyukf.unicorn.p213f.p214a.p222f.C2606b;

/* renamed from: com.qiyukf.unicorn.ui.d.k */
public class C2945k extends AbstractC2083b {

    /* renamed from: a */
    public TextView f6377a;

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void bindContentView() {
        MsgAttachment attachment = this.message.getAttachment();
        if (attachment instanceof C2606b) {
            this.f6377a.setText(((C2606b) attachment).getContent(this.context));
        }
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_message_item_separator;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f6377a = (TextView) findViewById(C2364R.C2367id.ysf_message_item_separator_text);
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public boolean isMiddleItem() {
        return true;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public boolean showAvatar() {
        return false;
    }
}
