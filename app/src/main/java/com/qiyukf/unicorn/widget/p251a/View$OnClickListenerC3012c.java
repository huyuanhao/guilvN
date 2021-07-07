package com.qiyukf.unicorn.widget.p251a;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.widget.p251a.C3021g;

/* renamed from: com.qiyukf.unicorn.widget.a.c */
public final class View$OnClickListenerC3012c extends AbstractC3010b<View$OnClickListenerC3012c> implements View.OnClickListener {

    /* renamed from: d */
    public Button f6594d;

    /* renamed from: e */
    public Button f6595e;

    public View$OnClickListenerC3012c(Context context) {
        super(context);
        View inflate = LayoutInflater.from(context).inflate(C2364R.layout.ysf_dialog_content_double_btn, (ViewGroup) null);
        this.f6594d = (Button) inflate.findViewById(C2364R.C2367id.ysf_dialog_btn_left);
        this.f6595e = (Button) inflate.findViewById(C2364R.C2367id.ysf_dialog_btn_right);
        this.f6594d.setOnClickListener(this);
        this.f6595e.setOnClickListener(this);
        this.f6589b.f6591a.removeAllViews();
        this.f6589b.f6591a.addView(inflate, -1, -2);
    }

    /* renamed from: a */
    public final View$OnClickListenerC3012c mo36867a(CharSequence charSequence, CharSequence charSequence2) {
        if (!TextUtils.isEmpty(charSequence)) {
            this.f6594d.setText(charSequence);
        }
        if (!TextUtils.isEmpty(charSequence2)) {
            this.f6595e.setText(charSequence2);
        }
        return this;
    }

    public final void onClick(View view) {
        this.f6589b.cancel();
        C3021g.AbstractC3022a aVar = this.f6590c;
        if (aVar != null) {
            aVar.mo34369a(view == this.f6594d ? 0 : 1);
        }
    }
}
