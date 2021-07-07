package com.qiyukf.unicorn.p244ui.p246b;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.p213f.p214a.p219c.C2554b;
import com.qiyukf.unicorn.p231j.C2690a;

/* renamed from: com.qiyukf.unicorn.ui.b.a */
public final class DialogC2823a extends Dialog implements View.OnClickListener {

    /* renamed from: a */
    public C2554b f5944a;

    /* renamed from: b */
    public AbstractC2824a f5945b;

    /* renamed from: c */
    public Context f5946c;

    /* renamed from: d */
    public View f5947d;

    /* renamed from: e */
    public ImageView f5948e = ((ImageView) this.f5947d.findViewById(C2364R.C2367id.ysf_iv_bot_product_detail_img));

    /* renamed from: f */
    public TextView f5949f = ((TextView) this.f5947d.findViewById(C2364R.C2367id.ysf_tv_bot_product_detail_title));

    /* renamed from: g */
    public TextView f5950g = ((TextView) this.f5947d.findViewById(C2364R.C2367id.ysf_tv_bot_product_detail_money));

    /* renamed from: h */
    public TextView f5951h = ((TextView) this.f5947d.findViewById(C2364R.C2367id.ysf_tv_bot_product_detail_sku));

    /* renamed from: i */
    public TextView f5952i = ((TextView) this.f5947d.findViewById(C2364R.C2367id.ysf_tv_bot_product_detail_info));

    /* renamed from: j */
    public TextView f5953j = ((TextView) this.f5947d.findViewById(C2364R.C2367id.ysf_tv_bot_product_detail_status));

    /* renamed from: k */
    public TextView f5954k = ((TextView) this.f5947d.findViewById(C2364R.C2367id.ysf_tv_dialog_bot_product_detail_cancel));

    /* renamed from: l */
    public TextView f5955l = ((TextView) this.f5947d.findViewById(C2364R.C2367id.ysf_tv_dialog_bot_product_detail_done));

    /* renamed from: com.qiyukf.unicorn.ui.b.a$a */
    public interface AbstractC2824a {
        /* renamed from: a */
        void mo36642a(C2554b bVar);
    }

    public DialogC2823a(@NonNull Context context) {
        super(context, C2364R.style.ysf_popup_dialog_style);
        this.f5946c = context;
        View inflate = LayoutInflater.from(context).inflate(C2364R.layout.ysf_dialog_bot_product_detail, (ViewGroup) null);
        this.f5947d = inflate;
        setContentView(inflate);
        setCancelable(false);
        this.f5954k.setOnClickListener(this);
        this.f5955l.setOnClickListener(this);
        C2690a.m6219a().mo36459a(this.f5955l);
    }

    /* renamed from: a */
    public final void mo36638a(C2554b bVar) {
        ImageView imageView;
        int i;
        this.f5944a = bVar;
        if (bVar == null) {
            dismiss();
            return;
        }
        if (!TextUtils.isEmpty(bVar.mo35948c())) {
            String c = this.f5944a.mo35948c();
            ImageView imageView2 = this.f5948e;
            C1870a.m3568a(c, imageView2, imageView2.getWidth(), this.f5948e.getHeight());
            imageView = this.f5948e;
            i = 0;
        } else {
            imageView = this.f5948e;
            i = 8;
        }
        imageView.setVisibility(i);
        this.f5949f.setText(this.f5944a.mo35949d());
        this.f5950g.setText(this.f5944a.mo35951f());
        this.f5951h.setText(this.f5944a.mo35952g());
        this.f5953j.setText(this.f5944a.mo35953h());
        this.f5952i.setText(this.f5944a.mo35950e());
    }

    /* renamed from: a */
    public final void mo36639a(AbstractC2824a aVar) {
        this.f5945b = aVar;
    }

    public final void onClick(View view) {
        AbstractC2824a aVar;
        if (view.getId() == C2364R.C2367id.ysf_tv_dialog_bot_product_detail_cancel) {
            dismiss();
        } else if (view.getId() == C2364R.C2367id.ysf_tv_dialog_bot_product_detail_done && (aVar = this.f5945b) != null) {
            aVar.mo36642a(this.f5944a);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -2;
        attributes.gravity = 17;
        getWindow().setAttributes(attributes);
    }
}
