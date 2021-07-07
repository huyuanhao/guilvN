package com.qiyukf.nim.uikit.session.module.input;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class MessageBottomContainer extends FrameLayout {

    /* renamed from: a */
    public boolean f4064a = false;

    /* renamed from: b */
    public boolean f4065b = false;

    public MessageBottomContainer(Context context) {
        super(context);
        mo34521a();
    }

    public MessageBottomContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        mo34521a();
    }

    public MessageBottomContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        mo34521a();
    }

    @TargetApi(21)
    public MessageBottomContainer(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        mo34521a();
    }

    /* renamed from: a */
    public final void mo34521a() {
        if (!isInEditMode() && getHeight() != C2063d.m4137a()) {
            post(new Runnable() {
                /* class com.qiyukf.nim.uikit.session.module.input.MessageBottomContainer.RunnableC20491 */

                public final void run() {
                    ViewGroup.LayoutParams layoutParams = MessageBottomContainer.this.getLayoutParams();
                    if (layoutParams == null) {
                        layoutParams = new ViewGroup.LayoutParams(-1, C2063d.m4137a());
                    } else {
                        layoutParams.height = C2063d.m4137a();
                    }
                    MessageBottomContainer.this.setLayoutParams(layoutParams);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo34522a(boolean z) {
        this.f4064a = z;
    }

    /* renamed from: b */
    public final void mo34523b() {
        this.f4065b = true;
    }

    /* renamed from: c */
    public final void mo34524c() {
        super.setVisibility(0);
    }

    public void onMeasure(int i, int i2) {
        View.MeasureSpec.getSize(i);
        View.MeasureSpec.getSize(i2);
        if (this.f4065b) {
            setVisibility(8);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
            i2 = View.MeasureSpec.makeMeasureSpec(0, 1073741824);
            i = makeMeasureSpec;
        }
        super.onMeasure(i, i2);
    }

    public void setVisibility(int i) {
        if (i == 0) {
            this.f4065b = false;
        }
        if (i != getVisibility()) {
            if (!this.f4064a || i != 0) {
                super.setVisibility(i);
            }
        }
    }
}
