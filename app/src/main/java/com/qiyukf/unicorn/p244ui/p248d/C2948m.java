package com.qiyukf.unicorn.p244ui.p248d;

import android.widget.TextView;
import com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2578m;

/* renamed from: com.qiyukf.unicorn.ui.d.m */
public class C2948m extends AbstractC2083b {

    /* renamed from: a */
    public TextView f6381a;

    /* renamed from: b */
    public C2578m f6382b;

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void bindContentView() {
        this.progressBar.setVisibility(8);
        C2578m mVar = (C2578m) this.message.getAttachment();
        this.f6382b = mVar;
        this.f6381a.setText(mVar.mo36059a());
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_message_item_withdrawal_notify;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f6381a = (TextView) findViewById(C2364R.C2367id.ysf_tv_msg_item_withdrawal_text);
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public boolean isMiddleItem() {
        return true;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int leftBackground() {
        return 0;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int rightBackground() {
        return 0;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public boolean showAvatar() {
        return false;
    }
}
