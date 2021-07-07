package com.qiyukf.unicorn.p244ui.evaluate;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.p231j.C2690a;

/* renamed from: com.qiyukf.unicorn.ui.evaluate.a */
public final class DialogC2969a extends Dialog implements View.OnClickListener {

    /* renamed from: a */
    public View f6439a;

    /* renamed from: b */
    public ImageView f6440b;

    /* renamed from: c */
    public TextView f6441c;

    /* renamed from: d */
    public String f6442d;

    /* renamed from: e */
    public AbstractC2971a f6443e;

    /* renamed from: f */
    public Button f6444f;

    /* renamed from: g */
    public TextWatcher f6445g = new TextWatcher() {
        /* class com.qiyukf.unicorn.p244ui.evaluate.DialogC2969a.C29701 */

        public final void afterTextChanged(Editable editable) {
            TextView textView = DialogC2969a.this.f6441c;
            textView.setText(editable.length() + "/200");
            DialogC2969a.this.mo36799a(true);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    };

    /* renamed from: com.qiyukf.unicorn.ui.evaluate.a$a */
    public interface AbstractC2971a {
        /* renamed from: a */
        void mo36765a(String str);
    }

    public DialogC2969a(Context context, String str) {
        super(context, C2364R.style.ysf_popup_dialog_style);
        String str2;
        TextView textView;
        this.f6442d = str;
        View inflate = LayoutInflater.from(getContext()).inflate(C2364R.layout.ysf_dialog_evaluation_bubble_remark, (ViewGroup) null);
        this.f6439a = inflate;
        setContentView(inflate);
        setCancelable(false);
        this.f6440b = (ImageView) this.f6439a.findViewById(C2364R.C2367id.ysf_evaluation_bubble_remark_close);
        this.f6441c = (TextView) this.f6439a.findViewById(C2364R.C2367id.ysf_tv_evaluator_remark_word_count_bubble);
        Button button = (Button) this.f6439a.findViewById(C2364R.C2367id.ysf_evaluation_bubble_remark_submit);
        this.f6444f = button;
        button.setOnClickListener(this);
        this.f6440b.setOnClickListener(this);
        C2690a.m6219a().mo36459a(this.f6444f);
        m6910a().addTextChangedListener(this.f6445g);
        mo36799a(false);
        if (TextUtils.isEmpty(this.f6442d)) {
            textView = this.f6441c;
            str2 = "0/200";
        } else {
            textView = this.f6441c;
            str2 = this.f6442d.length() + "/200";
        }
        textView.setText(str2);
        m6910a().setText(this.f6442d);
    }

    /* renamed from: a */
    private EditText m6910a() {
        return (EditText) this.f6439a.findViewById(C2364R.C2367id.ysf_evaluation_bubble_et_remark);
    }

    /* renamed from: a */
    public final void mo36798a(AbstractC2971a aVar) {
        this.f6443e = aVar;
    }

    /* renamed from: a */
    public final void mo36799a(boolean z) {
        Button button = this.f6444f;
        if (button != null) {
            button.setEnabled(z);
        }
    }

    public final void onClick(View view) {
        if (view.getId() == C2364R.C2367id.ysf_evaluation_bubble_remark_submit) {
            this.f6443e.mo36765a(m6910a().getText().toString());
            dismiss();
        } else if (view.getId() == C2364R.C2367id.ysf_evaluation_bubble_remark_close) {
            cancel();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        attributes.gravity = 80;
        getWindow().setAttributes(attributes);
    }
}
