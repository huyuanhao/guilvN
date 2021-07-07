package com.qiyukf.unicorn.widget.p251a;

import android.app.Dialog;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.p231j.C2690a;
import com.qiyukf.unicorn.p231j.C2692b;
import com.qiyukf.unicorn.p232k.C2706g;
import com.qiyukf.unicorn.widget.p251a.C3021g;

/* renamed from: com.qiyukf.unicorn.widget.a.d */
public final class DialogC3013d extends Dialog implements View.OnClickListener {

    /* renamed from: a */
    public View f6596a;

    /* renamed from: b */
    public EditText f6597b;

    /* renamed from: c */
    public Button f6598c;

    /* renamed from: d */
    public AbstractC3016a f6599d;

    /* renamed from: e */
    public String f6600e;

    /* renamed from: f */
    public TextWatcher f6601f = new TextWatcher() {
        /* class com.qiyukf.unicorn.widget.p251a.DialogC3013d.C30152 */

        public final void afterTextChanged(Editable editable) {
            DialogC3013d.this.f6598c.setEnabled(DialogC3013d.this.m7043a().length() > 0);
        }

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    };

    /* renamed from: com.qiyukf.unicorn.widget.a.d$a */
    public interface AbstractC3016a {
        /* renamed from: a */
        void mo36781a();

        /* renamed from: a */
        void mo36782a(String str);
    }

    public DialogC3013d(Context context) {
        super(context, C2364R.style.ysf_dialog_default_style);
        View inflate = LayoutInflater.from(context).inflate(C2364R.layout.ysf_dialog_input_evaluation, (ViewGroup) new LinearLayout(context), false);
        setContentView(inflate);
        setCancelable(false);
        this.f6596a = inflate.findViewById(C2364R.C2367id.ysf_dialog_input_close);
        this.f6597b = (EditText) inflate.findViewById(C2364R.C2367id.ysf_dialog_input_edit);
        this.f6598c = (Button) inflate.findViewById(C2364R.C2367id.ysf_dialog_input_submit);
        if (C2690a.m6219a().mo36462d()) {
            this.f6598c.setBackgroundDrawable(C2692b.m6228a(C2690a.m6219a().mo36461c().mo35690b()));
        }
        this.f6596a.setOnClickListener(this);
        this.f6598c.setOnClickListener(this);
        this.f6597b.addTextChangedListener(this.f6601f);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private String m7043a() {
        return this.f6597b.getText().toString().trim();
    }

    /* renamed from: a */
    public final DialogC3013d mo36869a(AbstractC3016a aVar) {
        this.f6599d = aVar;
        return this;
    }

    /* renamed from: a */
    public final DialogC3013d mo36870a(String str, String str2) {
        if (str == null) {
            str = "";
        }
        this.f6600e = str;
        this.f6597b.setText(str);
        this.f6597b.setHint(str2);
        EditText editText = this.f6597b;
        editText.setSelection(editText.length());
        return this;
    }

    public final void cancel() {
        C2706g.m6261b(this.f6597b);
        super.cancel();
    }

    public final void onClick(View view) {
        AbstractC3016a aVar;
        if (view == this.f6596a) {
            cancel();
            if (!m7043a().equals(this.f6600e)) {
                C3021g.m7059a(getContext(), "确定放弃编辑吗？", false, (C3021g.AbstractC3022a) new C3021g.AbstractC3022a() {
                    /* class com.qiyukf.unicorn.widget.p251a.DialogC3013d.C30141 */

                    @Override // com.qiyukf.unicorn.widget.p251a.C3021g.AbstractC3022a
                    /* renamed from: a */
                    public final void mo34369a(int i) {
                        if (i == 0 && DialogC3013d.this.f6599d != null) {
                            DialogC3013d.this.f6599d.mo36781a();
                        }
                        if (i == 1) {
                            DialogC3013d.this.show();
                        }
                    }
                });
                return;
            }
            AbstractC3016a aVar2 = this.f6599d;
            if (aVar2 != null) {
                aVar2.mo36781a();
            }
        } else if (view == this.f6598c && (aVar = this.f6599d) != null) {
            aVar.mo36782a(m7043a());
            cancel();
        }
    }
}
