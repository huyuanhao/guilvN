package com.qiyukf.unicorn.widget.p251a;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.widget.p251a.AbstractC3010b;
import com.qiyukf.unicorn.widget.p251a.C3021g;

/* renamed from: com.qiyukf.unicorn.widget.a.b */
public abstract class AbstractC3010b<T extends AbstractC3010b> {

    /* renamed from: a */
    public Context f6588a;

    /* renamed from: b */
    public DialogC3011a f6589b;

    /* renamed from: c */
    public C3021g.AbstractC3022a f6590c;

    /* renamed from: com.qiyukf.unicorn.widget.a.b$a */
    public static class DialogC3011a extends Dialog {

        /* renamed from: a */
        public ViewGroup f6591a;

        /* renamed from: b */
        public TextView f6592b;

        /* renamed from: c */
        public TextView f6593c;

        public DialogC3011a(@NonNull Context context) {
            super(context, C2364R.style.ysf_dialog_default_style);
            View inflate = LayoutInflater.from(getContext()).inflate(C2364R.layout.ysf_dialog_base, (ViewGroup) null);
            this.f6591a = (ViewGroup) inflate.findViewById(C2364R.C2367id.ysf_dialog_content);
            this.f6592b = (TextView) inflate.findViewById(C2364R.C2367id.ysf_tv_dialog_title);
            this.f6593c = (TextView) inflate.findViewById(C2364R.C2367id.ysf_tv_dialog_message);
            setContentView(inflate);
        }
    }

    public AbstractC3010b(Context context) {
        this.f6588a = context;
        this.f6589b = new DialogC3011a(context);
    }

    /* renamed from: a */
    public final T mo36862a(C3021g.AbstractC3022a aVar) {
        this.f6590c = aVar;
        return this;
    }

    /* renamed from: a */
    public final T mo36863a(CharSequence charSequence) {
        this.f6589b.f6592b.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        this.f6589b.f6592b.setText(charSequence);
        return this;
    }

    /* renamed from: a */
    public final T mo36864a(boolean z) {
        this.f6589b.setCancelable(z);
        return this;
    }

    /* renamed from: a */
    public void mo36865a() {
        this.f6589b.show();
    }

    /* renamed from: b */
    public final T mo36866b(CharSequence charSequence) {
        this.f6589b.f6593c.setVisibility(TextUtils.isEmpty(charSequence) ? 8 : 0);
        this.f6589b.f6593c.setText(charSequence);
        return this;
    }
}
