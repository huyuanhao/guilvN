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
import com.tencent.bugly.beta.global.C3226e;
import com.tencent.bugly.beta.global.View$OnClickListenerC3223b;
import com.tencent.bugly.proguard.C3321an;

/* renamed from: com.tencent.bugly.beta.ui.e */
public class C3241e extends AbstractC3234a {

    /* renamed from: n */
    public TextView f7454n;

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
            this.f7454n = textView;
            textView.setLayoutParams(layoutParams);
            TextView textView2 = this.f7454n;
            this.f7427j.getClass();
            textView2.setTextColor(Color.parseColor("#757575"));
            this.f7454n.setTextSize(16.0f);
            this.f7454n.setTag(Beta.TAG_TIP_MESSAGE);
            this.f7426i.addView(this.f7454n);
        } else if (onCreateView != null) {
            this.f7454n = (TextView) onCreateView.findViewWithTag(Beta.TAG_TIP_MESSAGE);
        }
        try {
            this.f7454n.setText("检测到当前版本需要重启，是否重启应用？");
            this.f7423f.setText("更新提示");
            mo38010a("取消", new View$OnClickListenerC3223b(8, this), "重启应用", new View$OnClickListenerC3223b(7, this));
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
}
