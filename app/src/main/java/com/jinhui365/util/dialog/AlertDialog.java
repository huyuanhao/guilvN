package com.jinhui365.util.dialog;

import android.app.AlertDialog;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.Keep;
import com.jinhui365.util.C1427R;
import com.p118pd.sdk.C8741oo0oOo0;

@Keep
public class AlertDialog {
    public android.app.AlertDialog OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Context f14994OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public View f14995OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public RelativeLayout f14996OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public TextView f14997OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f14998OooO00o;
    public View OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public TextView f14999OooO0O0;
    public TextView OooO0OO;
    public TextView OooO0Oo;

    public AlertDialog(Context context) {
        this(context, true);
    }

    public void OooO00o(boolean z) {
        this.OooO00o.setCancelable(z);
    }

    public void OooO0O0(int i) {
        this.f14999OooO0O0.setGravity(i);
    }

    public void OooO0OO(int i) {
        if (i != 0) {
            this.f14997OooO00o.setText(i);
            this.f14997OooO00o.setVisibility(0);
            return;
        }
        this.f14997OooO00o.setVisibility(8);
    }

    public void OooO0Oo(int i) {
        RelativeLayout relativeLayout = (RelativeLayout) this.OooO00o.getWindow().findViewById(C1427R.C1430id.rl_alert_dialog_custom_view);
        this.f14996OooO00o = relativeLayout;
        this.OooO0O0 = ((LayoutInflater) this.f14994OooO00o.getSystemService("layout_inflater")).inflate(i, relativeLayout);
        this.f14996OooO00o.setVisibility(0);
        this.f14999OooO0O0.setVisibility(8);
    }

    public AlertDialog(Context context, boolean z) {
        this.f14996OooO00o = null;
        this.OooO0O0 = null;
        this.f14994OooO00o = context;
        android.app.AlertDialog create = new AlertDialog.Builder(context).create();
        this.OooO00o = create;
        create.show();
        Window window = this.OooO00o.getWindow();
        window.clearFlags(131072);
        if (z) {
            window.setContentView(C1427R.layout.alert_dialog_view);
            this.f14997OooO00o = (TextView) window.findViewById(C1427R.C1430id.alert_dialog_title);
        } else {
            window.setContentView(C1427R.layout.alert_dialog_notitle_view);
        }
        this.f14999OooO0O0 = (TextView) window.findViewById(C1427R.C1430id.alert_dialog_message);
        this.OooO0OO = (TextView) window.findViewById(C1427R.C1430id.alert_dialog_cancel);
        this.OooO0Oo = (TextView) window.findViewById(C1427R.C1430id.alert_dialog_ok);
        this.f14995OooO00o = window.findViewById(C1427R.C1430id.alert_dialog_space);
    }

    public void OooO00o(View view) {
        if (view != null) {
            this.OooO0O0 = view;
            RelativeLayout relativeLayout = (RelativeLayout) this.OooO00o.getWindow().findViewById(C1427R.C1430id.rl_alert_dialog_custom_view);
            this.f14996OooO00o = relativeLayout;
            relativeLayout.addView(view);
            this.f14996OooO00o.setVisibility(0);
            this.f14999OooO0O0.setVisibility(8);
        }
    }

    public void OooO0O0(String str, View.OnClickListener onClickListener) {
        TextView textView = this.OooO0Oo;
        if (textView != null) {
            textView.setText(str);
            this.OooO0Oo.setOnClickListener(onClickListener);
        }
    }

    public void OooO0OO(String str) {
        if (!C8741oo0oOo0.OooO0OO(str)) {
            this.f14997OooO00o.setText(str);
            this.f14997OooO00o.setVisibility(0);
            return;
        }
        this.f14997OooO00o.setVisibility(8);
    }

    public void OooO0O0(String str) {
        this.OooO0Oo.setText(str);
    }

    public View OooO00o() {
        return this.OooO0O0;
    }

    public void OooO00o(int i) {
        this.f14999OooO0O0.setText(i);
    }

    public void OooO00o(String str) {
        this.f14999OooO0O0.setText(str);
    }

    public void OooO00o(String str, int i) {
        this.f14999OooO0O0.setGravity(i);
        this.f14999OooO0O0.setText(str);
    }

    public void OooO00o(String str, View.OnClickListener onClickListener) {
        TextView textView = this.OooO0OO;
        if (textView != null) {
            textView.setVisibility(0);
            this.f14995OooO00o.setVisibility(0);
            this.OooO0Oo.setBackgroundResource(C1427R.C1429drawable.sl_alert_dialog_btn_right);
            this.OooO0OO.setText(str);
            this.OooO0OO.setOnClickListener(onClickListener);
            this.OooO0Oo.setBackgroundDrawable(this.f14994OooO00o.getResources().getDrawable(C1427R.C1429drawable.sl_alert_dialog_btn_right));
            return;
        }
        this.OooO0Oo.setBackgroundDrawable(this.f14994OooO00o.getResources().getDrawable(C1427R.C1429drawable.sl_alert_dialog_btn_left_right));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m15121OooO00o() {
        this.OooO00o.dismiss();
    }
}
