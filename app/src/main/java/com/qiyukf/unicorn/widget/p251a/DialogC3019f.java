package com.qiyukf.unicorn.widget.p251a;

import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.qiyukf.unicorn.C2364R;

/* renamed from: com.qiyukf.unicorn.widget.a.f */
public final class DialogC3019f extends Dialog {

    /* renamed from: a */
    public ProgressBar f6609a;

    /* renamed from: b */
    public TextView f6610b;

    /* renamed from: c */
    public Handler f6611c;

    public DialogC3019f(Context context) {
        super(context, C2364R.style.ysf_dialog_default_style);
        View inflate = LayoutInflater.from(getContext()).inflate(C2364R.layout.ysf_progress_dialog, (ViewGroup) null);
        this.f6609a = (ProgressBar) inflate.findViewById(C2364R.C2367id.ysf_progress_dialog_progress);
        this.f6610b = (TextView) inflate.findViewById(C2364R.C2367id.ysf_progress_dialog_message);
        setContentView(inflate);
        setCancelable(false);
    }

    /* renamed from: a */
    public final void mo36878a() {
        this.f6609a.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo36879a(String str) {
        this.f6610b.setText(str);
    }

    /* renamed from: b */
    public final void mo36880b() {
        if (!isShowing()) {
            show();
        }
        if (this.f6611c == null) {
            this.f6611c = new Handler(Looper.getMainLooper());
        }
        this.f6611c.postDelayed(new Runnable() {
            /* class com.qiyukf.unicorn.widget.p251a.DialogC3019f.RunnableC30201 */

            public final void run() {
                if (DialogC3019f.this.isShowing()) {
                    DialogC3019f.this.cancel();
                }
            }
        }, 1000);
    }
}
