package com.qiyukf.nim.uikit.session.module.input.p154a;

import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.widget.TextView;
import com.p118pd.sdk.C7009o000OoOo;
import com.qiyukf.nim.uikit.common.p145a.AbstractC1883f;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.p213f.p214a.p220d.C2571g;

/* renamed from: com.qiyukf.nim.uikit.session.module.input.a.b */
public class C2056b extends AbstractC1883f<C2571g.C2572a> {

    /* renamed from: a */
    public TextView f4092a;

    @Override // com.qiyukf.nim.uikit.common.p145a.AbstractC1883f
    public int getResId() {
        return C2364R.layout.ysf_view_holder_faq_list;
    }

    @Override // com.qiyukf.nim.uikit.common.p145a.AbstractC1883f
    public void inflate() {
        this.f4092a = (TextView) findView(C2364R.C2367id.ysf_tv_faq_list_item);
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.qiyukf.nim.uikit.common.p145a.AbstractC1883f
    public /* synthetic */ void refresh(C2571g.C2572a aVar) {
        String str = (String) getAdapter().mo34145c();
        String a = aVar.mo36049a();
        int OooO00o = C7009o000OoOo.OooO00o(this.context, C2364R.C2365color.ysf_red_f25058);
        SpannableString spannableString = new SpannableString(a);
        int indexOf = TextUtils.isEmpty(str) ? -1 : a.toLowerCase().indexOf(str.toLowerCase());
        if (indexOf >= 0) {
            spannableString.setSpan(new ForegroundColorSpan(OooO00o), indexOf, str.length() + indexOf, 33);
        }
        this.f4092a.setText(spannableString);
    }
}
