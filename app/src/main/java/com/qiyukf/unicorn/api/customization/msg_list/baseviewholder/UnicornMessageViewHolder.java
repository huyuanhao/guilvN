package com.qiyukf.unicorn.api.customization.msg_list.baseviewholder;

import android.content.Context;
import android.view.View;
import com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b;
import com.qiyukf.nimlib.sdk.msg.model.IMMessage;

public abstract class UnicornMessageViewHolder extends AbstractC2083b {
    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public final void bindContentView() {
        bindContentView(this.message, this.context);
    }

    public abstract void bindContentView(IMMessage iMMessage, Context context);

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public <T extends View> T findViewById(int i) {
        return (T) super.findViewById(i);
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public final int getContentResId() {
        return getViewHolderResId();
    }

    public abstract int getViewHolderResId();

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public final void inflateContentView() {
        inflateFindView();
    }

    public abstract void inflateFindView();

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public boolean isMiddleItem() {
        return super.isMiddleItem();
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public boolean isReceivedMessage() {
        return super.isReceivedMessage();
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int leftBackground() {
        return super.leftBackground();
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void onItemClick() {
        super.onItemClick();
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public boolean onItemLongClick() {
        return super.onItemLongClick();
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int rightBackground() {
        return super.rightBackground();
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public boolean showAvatar() {
        return super.showAvatar();
    }
}
