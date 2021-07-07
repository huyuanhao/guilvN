package com.qiyukf.nim.uikit.session.viewholder;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;

public class MsgContainerLayout extends FrameLayout {

    /* renamed from: a */
    public AbstractC2083b f4186a = null;

    public MsgContainerLayout(Context context) {
        super(context);
    }

    public MsgContainerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MsgContainerLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @TargetApi(21)
    public MsgContainerLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    /* renamed from: a */
    public final void mo34591a(AbstractC2083b bVar) {
        this.f4186a = bVar;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AbstractC2083b bVar = this.f4186a;
        if (bVar != null) {
            bVar.onDetached();
        }
    }
}
