package com.qiyukf.nim.uikit.session.viewholder;

import com.qiyukf.unicorn.C2364R;

/* renamed from: com.qiyukf.nim.uikit.session.viewholder.e */
public class C2092e extends AbstractC2083b {
    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void bindContentView() {
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_message_action_custom_layout;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.timeTextView.setVisibility(8);
        this.alertButton.setVisibility(8);
        this.progressBar.setVisibility(8);
        this.nameTextView.setVisibility(8);
        this.contentContainer.setVisibility(8);
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public boolean showAvatar() {
        return false;
    }
}
