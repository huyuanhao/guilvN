package com.qiyukf.unicorn.mediaselect.internal.p242ui.widget;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.p118pd.sdk.C7023o000o0o0;
import com.qiyukf.unicorn.C2364R;

/* renamed from: com.qiyukf.unicorn.mediaselect.internal.ui.widget.CheckRadioView */
public class CheckRadioView extends ImageView {

    /* renamed from: a */
    public Drawable f5783a;

    /* renamed from: b */
    public int f5784b;

    /* renamed from: c */
    public int f5785c;

    public CheckRadioView(Context context) {
        super(context);
        m6420b();
    }

    public CheckRadioView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6420b();
    }

    /* renamed from: b */
    private void m6420b() {
        this.f5784b = C7023o000o0o0.OooO00o(getResources(), C2364R.C2365color.ysf_blue_337EFF, getContext().getTheme());
        this.f5785c = C7023o000o0o0.OooO00o(getResources(), C2364R.C2365color.ysf_check_original_radio_disable, getContext().getTheme());
        mo36590a(false);
    }

    /* renamed from: a */
    public final void mo36589a() {
        if (this.f5783a == null) {
            this.f5783a = getDrawable();
        }
        this.f5783a.setColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }

    /* renamed from: a */
    public final void mo36590a(boolean z) {
        Drawable drawable;
        int i;
        if (z) {
            setImageResource(C2364R.C2366drawable.ysf_ic_preview_radio_on);
            drawable = getDrawable();
            this.f5783a = drawable;
            i = this.f5784b;
        } else {
            setImageResource(C2364R.C2366drawable.ysf_ic_preview_radio_off);
            drawable = getDrawable();
            this.f5783a = drawable;
            i = this.f5785c;
        }
        drawable.setColorFilter(i, PorterDuff.Mode.SRC_IN);
    }
}
