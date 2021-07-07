package com.qiyukf.unicorn.p244ui.p248d;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.C1810b;
import com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2575j;
import com.qiyukf.unicorn.p231j.C2690a;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.qiyukf.unicorn.ui.d.f */
public class C2929f extends AbstractC2083b {

    /* renamed from: a */
    public TextView f6325a;

    /* renamed from: b */
    public LinearLayout f6326b;

    /* renamed from: c */
    public C2575j f6327c;

    /* renamed from: d */
    public LinearLayout f6328d;

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void bindContentView() {
        String str;
        this.f6328d.setBackgroundResource(C2364R.C2366drawable.ysf_msg_blue_back_rigth_selector);
        C2690a.m6219a().mo36459a(this.f6328d);
        this.f6327c = (C2575j) this.message.getAttachment();
        this.f6325a.setText(C2364R.string.ysf_leave_msg_my_leave_msg);
        this.f6326b.removeAllViews();
        JSONArray b = C1810b.m3428b(this.f6327c.mo36055a());
        for (int i = 0; i < b.length(); i++) {
            JSONObject b2 = C1810b.m3429b(b, i);
            if (!TextUtils.isEmpty(C1810b.m3432e(b2, "fieldName")) && !TextUtils.isEmpty(C1810b.m3432e(b2, "fieldValue")) && !"请选择".equals(C1810b.m3432e(b2, "fieldValue"))) {
                View inflate = LayoutInflater.from(this.context).inflate(C2364R.layout.ysf_item_vh_leave_msg_local, (ViewGroup) null);
                TextView textView = (TextView) inflate.findViewById(C2364R.C2367id.ysf_tv_item_vh_leave_msg_msg_name);
                TextView textView2 = (TextView) inflate.findViewById(C2364R.C2367id.ysf_tv_item_vh_leave_msg_msg_value);
                textView.setText((C1810b.m3432e(b2, "fieldName").length() > 5 ? C1810b.m3432e(b2, "fieldName").substring(0, 4) + "..." : C1810b.m3432e(b2, "fieldName")) + "：");
                if (C1810b.m3427b(b2, "fieldId") == -4) {
                    JSONArray g = C1810b.m3434g(b2, "fieldValue");
                    StringBuilder sb = new StringBuilder();
                    int i2 = 0;
                    while (i2 < g.length()) {
                        StringBuilder sb2 = new StringBuilder("文件");
                        int i3 = i2 + 1;
                        sb2.append(i3);
                        sb.append(sb2.toString());
                        if (i2 != g.length() - 1) {
                            sb.append("\n");
                        }
                        i2 = i3;
                    }
                    str = sb.toString();
                } else {
                    str = C1810b.m3432e(b2, "fieldValue");
                }
                textView2.setText(str);
                this.f6326b.addView(inflate);
            }
        }
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_viewholder_leave_msg_local;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f6325a = (TextView) findView(C2364R.C2367id.ysf_tv_leave_msg_local_label);
        this.f6326b = (LinearLayout) findView(C2364R.C2367id.ysf_vh_leave_msg_local_parent);
        this.f6328d = (LinearLayout) findViewById(C2364R.C2367id.ysf_ll_vh_leave_msg_parent);
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int rightBackground() {
        return 0;
    }
}
