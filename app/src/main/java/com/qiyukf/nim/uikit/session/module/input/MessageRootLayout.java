package com.qiyukf.nim.uikit.session.module.input;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.nim.uikit.session.emoji.EmoticonPickerView;

public class MessageRootLayout extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    public MessageBottomContainer f4067a;

    /* renamed from: b */
    public EmoticonPickerView f4068b;

    /* renamed from: c */
    public boolean f4069c = false;

    /* renamed from: d */
    public int f4070d = -1;

    /* renamed from: e */
    public int f4071e = 0;

    /* renamed from: f */
    public int f4072f = 0;

    /* renamed from: g */
    public int f4073g;

    /* renamed from: h */
    public int f4074h;

    /* renamed from: i */
    public int f4075i;

    public MessageRootLayout(Context context) {
        super(context);
        m4119a();
    }

    public MessageRootLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m4119a();
    }

    public MessageRootLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4119a();
    }

    @TargetApi(21)
    public MessageRootLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        m4119a();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: android.view.View */
    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    private <T extends View> T m4117a(Class<T> cls, View view) {
        if (cls.isInstance(view)) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        int i = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                return null;
            }
            T t = (T) m4117a(cls, viewGroup.getChildAt(i));
            if (t != null) {
                return t;
            }
            i++;
        }
    }

    /* renamed from: a */
    private MessageBottomContainer m4118a(View view) {
        if (this.f4067a == null) {
            this.f4067a = (MessageBottomContainer) m4117a(MessageBottomContainer.class, view);
        }
        return this.f4067a;
    }

    /* renamed from: a */
    private void m4119a() {
        getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f4073g = C1862c.m3544d();
        int e = C1862c.m3545e();
        this.f4074h = e;
        this.f4075i = this.f4073g + e;
    }

    /* renamed from: a */
    private void m4120a(boolean z) {
        this.f4069c = z;
        MessageBottomContainer a = m4118a(this);
        if (a != null) {
            a.mo34522a(z);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f4070d = -1;
        this.f4071e = 0;
        this.f4072f = 0;
        this.f4073g = C1862c.m3544d();
        int e = C1862c.m3545e();
        this.f4074h = e;
        this.f4075i = this.f4073g + e;
    }

    public void onGlobalLayout() {
        int abs;
        int height = getHeight();
        int i = this.f4072f;
        if (i == 0) {
            this.f4072f = height;
        } else if (i != height && (abs = Math.abs(i - height)) > this.f4075i) {
            this.f4072f = height;
            if (C2063d.m4139a(abs)) {
                MessageBottomContainer a = m4118a(this);
                if (a != null) {
                    a.mo34521a();
                }
                if (this.f4068b == null) {
                    this.f4068b = (EmoticonPickerView) m4117a(EmoticonPickerView.class, this);
                }
                EmoticonPickerView emoticonPickerView = this.f4068b;
                if (emoticonPickerView != null) {
                    emoticonPickerView.mo34395a();
                }
            }
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = this.f4071e;
        if (i5 != 0) {
            int abs = Math.abs(i5 - i4);
            m4120a((abs == 0 || abs == this.f4073g || abs == this.f4074h || abs == this.f4075i) ? false : true);
        }
        if (this.f4071e + this.f4075i < i4) {
            this.f4071e = i4;
        }
    }

    public void onMeasure(int i, int i2) {
        MessageBottomContainer a;
        View.MeasureSpec.getSize(i);
        int size = View.MeasureSpec.getSize(i2);
        if (size >= 0) {
            int i3 = this.f4070d;
            if (i3 < 0) {
                this.f4070d = size;
            } else {
                int i4 = i3 - size;
                this.f4070d = size;
                if (!(i4 == 0 || (a = m4118a(this)) == null)) {
                    int i5 = this.f4075i;
                    if (i4 > i5) {
                        a.mo34523b();
                    } else if (i4 < (-i5) && this.f4069c) {
                        a.mo34524c();
                    }
                }
            }
        }
        super.onMeasure(i, i2);
    }
}
