package com.qiyukf.unicorn.p244ui.evaluate;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.unicorn.C2364R;

/* renamed from: com.qiyukf.unicorn.ui.evaluate.EvaluationEntryView */
public class EvaluationEntryView extends LinearLayout {

    /* renamed from: a */
    public ImageView f6437a;

    /* renamed from: b */
    public TextView f6438b;

    public EvaluationEntryView(Context context) {
        this(context, null);
    }

    public EvaluationEntryView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setGravity(1);
        setOrientation(1);
        ImageView imageView = new ImageView(getContext());
        this.f6437a = imageView;
        imageView.setPadding(0, C1862c.m3540a(5.0f), 0, C1862c.m3540a(5.0f));
        this.f6437a.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        addView(this.f6437a, new LinearLayout.LayoutParams(-2, -2));
        TextView textView = new TextView(getContext());
        this.f6438b = textView;
        textView.setBackgroundResource(C2364R.C2366drawable.ysf_evaluation_dialog_select_text_bg_selector);
        this.f6438b.setPadding(C1862c.m3540a(5.0f), C1862c.m3540a(3.0f), C1862c.m3540a(5.0f), C1862c.m3540a(3.0f));
        this.f6438b.setTextColor(getResources().getColorStateList(C2364R.C2365color.ysf_evaluation_dialog_select_text_selector));
        this.f6438b.setTextSize(9.0f);
        addView(this.f6438b, new LinearLayout.LayoutParams(-2, -2));
    }
}
