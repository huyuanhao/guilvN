package com.qiyukf.nim.uikit.session.viewholder;

import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import com.qiyukf.nim.uikit.session.emoji.C1990f;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.UICustomization;

/* renamed from: com.qiyukf.nim.uikit.session.viewholder.f */
public class C2093f extends AbstractC2083b {

    /* renamed from: a */
    public TextView f4211a;

    /* renamed from: a */
    public String mo34618a() {
        return this.message.getContent();
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void bindContentView() {
        if (TextUtils.isEmpty(mo34618a())) {
            this.f4211a.setVisibility(8);
            return;
        }
        this.f4211a.setVisibility(0);
        C1990f.m3949a(this.context, this.f4211a, mo34618a(), this.message.getSessionId());
        this.f4211a.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public int getContentResId() {
        return C2364R.layout.ysf_message_item_notification;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public void inflateContentView() {
        this.f4211a = (TextView) this.view.findViewById(C2364R.C2367id.ysf_message_item_notification_label);
        UICustomization uICustomization = C2452d.m5373e().uiCustomization;
        if (uICustomization != null) {
            float f = uICustomization.tipsTextSize;
            if (f > 0.0f) {
                this.f4211a.setTextSize(f);
            }
            int i = uICustomization.tipsTextColor;
            if (i != 0) {
                this.f4211a.setTextColor(i);
            }
        }
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public boolean isMiddleItem() {
        return true;
    }

    @Override // com.qiyukf.nim.uikit.session.viewholder.AbstractC2083b
    public boolean showAvatar() {
        return false;
    }
}
