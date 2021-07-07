package com.megvii.meglive_sdk.p106f;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import com.megvii.meglive_sdk.C1503R;

/* renamed from: com.megvii.meglive_sdk.f.i */
public final class C1567i {

    /* renamed from: a */
    public Activity f2567a;

    public C1567i(Activity activity) {
        this.f2567a = activity;
    }

    /* renamed from: a */
    private AlertDialog m2643a(View view) {
        AlertDialog create = new AlertDialog.Builder(this.f2567a).setCancelable(false).create();
        create.show();
        create.getWindow().setContentView(view);
        create.getWindow().setBackgroundDrawableResource(17170445);
        WindowManager.LayoutParams attributes = create.getWindow().getAttributes();
        attributes.width = (((WindowManager) this.f2567a.getSystemService("window")).getDefaultDisplay().getWidth() * 5) / 6;
        attributes.height = -2;
        create.getWindow().setAttributes(attributes);
        return create;
    }

    /* renamed from: a */
    public final AlertDialog mo17182a(View.OnClickListener onClickListener) {
        View inflate = View.inflate(this.f2567a, C1503R.layout.megvii_liveness_dialog, null);
        TextView textView = (TextView) inflate.findViewById(C1503R.C1506id.tv_megvii_dialog_title);
        TextView textView2 = (TextView) inflate.findViewById(C1503R.C1506id.tv_megvii_dialog_left);
        textView2.setOnClickListener(onClickListener);
        TextView textView3 = (TextView) inflate.findViewById(C1503R.C1506id.tv_megvii_dialog_right);
        textView3.setOnClickListener(onClickListener);
        textView.setText(this.f2567a.getResources().getString(C1580u.m2676a(this.f2567a).mo17199b(this.f2567a.getResources().getString(C1503R.string.key_liveness_exit_titlePrompt_text))));
        textView.setTextSize(0, (float) this.f2567a.getResources().getDimensionPixelSize(C1580u.m2676a(this.f2567a).mo17203f(this.f2567a.getResources().getString(C1503R.string.key_liveness_exit_titlePrompt_size))));
        textView.setTextColor(this.f2567a.getResources().getColor(C1580u.m2676a(this.f2567a).mo17202e(this.f2567a.getResources().getString(C1503R.string.key_liveness_exit_titlePrompt_color))));
        textView2.setText(this.f2567a.getResources().getString(C1580u.m2676a(this.f2567a).mo17199b(this.f2567a.getResources().getString(C1503R.string.key_liveness_exit_leftPrompt_text))));
        textView2.setTextSize(0, (float) this.f2567a.getResources().getDimensionPixelSize(C1580u.m2676a(this.f2567a).mo17203f(this.f2567a.getResources().getString(C1503R.string.key_liveness_exit_leftPrompt_size))));
        textView2.setTextColor(this.f2567a.getResources().getColor(C1580u.m2676a(this.f2567a).mo17202e(this.f2567a.getResources().getString(C1503R.string.key_liveness_exit_leftPrompt_color))));
        textView3.setText(this.f2567a.getResources().getString(C1580u.m2676a(this.f2567a).mo17199b(this.f2567a.getResources().getString(C1503R.string.key_liveness_exit_rightPrompt_text))));
        textView3.setTextSize(0, (float) this.f2567a.getResources().getDimensionPixelSize(C1580u.m2676a(this.f2567a).mo17203f(this.f2567a.getResources().getString(C1503R.string.key_liveness_exit_rightPrompt_size))));
        textView3.setTextColor(this.f2567a.getResources().getColor(C1580u.m2676a(this.f2567a).mo17202e(this.f2567a.getResources().getString(C1503R.string.key_liveness_exit_rightPrompt_color))));
        return m2643a(inflate);
    }

    /* renamed from: a */
    public final AlertDialog mo17183a(String str, View.OnClickListener onClickListener) {
        View inflate = View.inflate(this.f2567a, C1503R.layout.megvii_liveness_retry_dialog, null);
        TextView textView = (TextView) inflate.findViewById(C1503R.C1506id.tv_megvii_retry_dialog_title);
        TextView textView2 = (TextView) inflate.findViewById(C1503R.C1506id.tv_megvii_retry_dialog_left);
        textView2.setOnClickListener(onClickListener);
        TextView textView3 = (TextView) inflate.findViewById(C1503R.C1506id.tv_megvii_retry_dialog_right);
        textView3.setOnClickListener(onClickListener);
        textView.setText(str);
        textView.setTextSize(0, (float) this.f2567a.getResources().getDimensionPixelSize(C1580u.m2676a(this.f2567a).mo17203f(this.f2567a.getResources().getString(C1503R.string.key_liveness_retry_titlePrompt_size))));
        textView.setTextColor(this.f2567a.getResources().getColor(C1580u.m2676a(this.f2567a).mo17202e(this.f2567a.getResources().getString(C1503R.string.key_liveness_retry_titlePrompt_color))));
        textView2.setText(this.f2567a.getResources().getString(C1580u.m2676a(this.f2567a).mo17199b(this.f2567a.getResources().getString(C1503R.string.key_liveness_retry_leftPrompt_text))));
        textView2.setTextSize(0, (float) this.f2567a.getResources().getDimensionPixelSize(C1580u.m2676a(this.f2567a).mo17203f(this.f2567a.getResources().getString(C1503R.string.key_liveness_retry_leftPrompt_size))));
        textView2.setTextColor(this.f2567a.getResources().getColor(C1580u.m2676a(this.f2567a).mo17202e(this.f2567a.getResources().getString(C1503R.string.key_liveness_retry_leftPrompt_color))));
        textView3.setText(this.f2567a.getResources().getString(C1580u.m2676a(this.f2567a).mo17199b(this.f2567a.getResources().getString(C1503R.string.key_liveness_retry_rightPrompt_text))));
        textView3.setTextSize(0, (float) this.f2567a.getResources().getDimensionPixelSize(C1580u.m2676a(this.f2567a).mo17203f(this.f2567a.getResources().getString(C1503R.string.key_liveness_retry_rightPrompt_size))));
        textView3.setTextColor(this.f2567a.getResources().getColor(C1580u.m2676a(this.f2567a).mo17202e(this.f2567a.getResources().getString(C1503R.string.key_liveness_retry_rightPrompt_color))));
        return m2643a(inflate);
    }
}
