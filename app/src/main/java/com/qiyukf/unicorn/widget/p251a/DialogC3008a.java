package com.qiyukf.unicorn.widget.p251a;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.p118pd.sdk.C7009o000OoOo;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.widget.p251a.C3021g;

/* renamed from: com.qiyukf.unicorn.widget.a.a */
public final class DialogC3008a extends Dialog implements View.OnClickListener {

    /* renamed from: a */
    public View f6580a;

    /* renamed from: b */
    public View f6581b;

    /* renamed from: c */
    public TextView f6582c;

    /* renamed from: d */
    public LinearLayout f6583d;

    /* renamed from: e */
    public C3021g.AbstractC3022a f6584e;

    /* renamed from: f */
    public int f6585f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogC3008a(@NonNull Context context, int i) {
        super(context, i == 17 ? C2364R.style.ysf_dialog_default_style : C2364R.style.ysf_popup_dialog_style);
        this.f6585f = i;
        View inflate = LayoutInflater.from(context).inflate(C2364R.layout.ysf_dialog_category, (ViewGroup) null);
        if (i == 17) {
            inflate.setBackgroundResource(C2364R.C2366drawable.ysf_dialog_bg);
        } else {
            inflate.setBackgroundColor(C7009o000OoOo.OooO00o(getContext(), C2364R.C2365color.ysf_white));
        }
        this.f6580a = inflate.findViewById(C2364R.C2367id.ysf_dialog_category_title_layout);
        this.f6581b = inflate.findViewById(C2364R.C2367id.ysf_dialog_category_close);
        this.f6582c = (TextView) inflate.findViewById(C2364R.C2367id.ysf_dialog_category_title);
        this.f6583d = (LinearLayout) inflate.findViewById(C2364R.C2367id.ysf_dialog_category_item_container);
        this.f6581b.setOnClickListener(this);
        setContentView(inflate);
    }

    /* renamed from: a */
    public final void mo36856a(C3021g.AbstractC3022a aVar) {
        this.f6584e = aVar;
    }

    /* renamed from: a */
    public final void mo36857a(String[] strArr) {
        this.f6583d.removeAllViews();
        final int i = 0;
        while (i < strArr.length) {
            View inflate = LayoutInflater.from(getContext()).inflate(C2364R.layout.ysf_dialog_category_item, (ViewGroup) this.f6583d, false);
            View findViewById = inflate.findViewById(C2364R.C2367id.ysf_dialog_category_item_divider);
            ((TextView) inflate.findViewById(C2364R.C2367id.ysf_dialog_category_item_name)).setText(strArr[i]);
            findViewById.setVisibility(i == strArr.length + -1 ? 8 : 0);
            inflate.setOnClickListener(new View.OnClickListener() {
                /* class com.qiyukf.unicorn.widget.p251a.DialogC3008a.View$OnClickListenerC30091 */

                public final void onClick(View view) {
                    DialogC3008a.this.cancel();
                    if (DialogC3008a.this.f6584e != null) {
                        DialogC3008a.this.f6584e.mo34369a(i);
                    }
                }
            });
            this.f6583d.addView(inflate);
            i++;
        }
    }

    public final void onClick(View view) {
        if (view == this.f6581b) {
            cancel();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = this.f6585f == 17 ? getContext().getResources().getDimensionPixelSize(C2364R.dimen.ysf_dialog_width) : -1;
        attributes.height = -2;
        attributes.gravity = this.f6585f;
        getWindow().setAttributes(attributes);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        this.f6580a.setVisibility(charSequence == null ? 8 : 0);
        this.f6582c.setText(charSequence);
    }
}
