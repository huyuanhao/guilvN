package com.tencent.bugly.beta.p267ui;

import android.graphics.Color;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.bugly.beta.Beta;
import com.tencent.bugly.beta.download.DownloadTask;
import com.tencent.bugly.beta.global.C3226e;
import com.tencent.bugly.beta.global.View$OnClickListenerC3223b;
import com.tencent.bugly.proguard.C3321an;

/* renamed from: com.tencent.bugly.beta.ui.f */
public class C3242f extends AbstractC3234a {

    /* renamed from: n */
    public DownloadTask f7455n;

    /* renamed from: o */
    public TextView f7456o;

    @Override // com.tencent.bugly.beta.p267ui.AbstractC3238b
    /* renamed from: a */
    public boolean mo38016a(int i, KeyEvent keyEvent) {
        return false;
    }

    @Override // androidx.fragment.app.Fragment, com.tencent.bugly.beta.p267ui.AbstractC3234a
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.f7429l = C3226e.f7357E.f7397j;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (this.f7429l == 0) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            TextView textView = new TextView(this.f7418a);
            this.f7456o = textView;
            textView.setLayoutParams(layoutParams);
            TextView textView2 = this.f7456o;
            this.f7427j.getClass();
            textView2.setTextColor(Color.parseColor("#757575"));
            this.f7456o.setTextSize(16.0f);
            this.f7456o.setTag(Beta.TAG_TIP_MESSAGE);
            this.f7426i.addView(this.f7456o);
        } else if (onCreateView != null) {
            this.f7456o = (TextView) onCreateView.findViewWithTag(Beta.TAG_TIP_MESSAGE);
        }
        try {
            this.f7456o.setText(Beta.strNetworkTipsMessage);
            this.f7423f.setText(Beta.strNetworkTipsTitle);
            mo38010a(Beta.strNetworkTipsCancelBtn, new View$OnClickListenerC3223b(2, this), Beta.strNetworkTipsConfirmBtn, new View$OnClickListenerC3223b(3, this, this.f7455n));
        } catch (Exception e) {
            if (this.f7429l != 0) {
                C3321an.m8357e("please confirm your argument: [Beta.tipsDialogLayoutId] is correct", new Object[0]);
            }
            if (!C3321an.m8353b(e)) {
                e.printStackTrace();
            }
        }
        return onCreateView;
    }

    @Override // androidx.fragment.app.Fragment, com.tencent.bugly.beta.p267ui.AbstractC3234a
    public void onDestroyView() {
        super.onDestroyView();
        this.f7456o = null;
    }
}
