package com.qiyukf.nim.uikit.common.activity;

import android.widget.ImageView;
import android.widget.TextView;
import com.qiyukf.unicorn.C2364R;

public abstract class BlackFragmentActivity extends BaseFragmentActivity {
    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity
    /* renamed from: c */
    public final void mo34174c() {
        this.f3468a.setBackgroundResource(C2364R.C2366drawable.ysf_title_bar_bg_black);
        ((ImageView) findViewById(C2364R.C2367id.ysf_title_bar_back_view)).setImageResource(C2364R.C2366drawable.ysf_title_bar_back_icon_white);
        ((TextView) findViewById(C2364R.C2367id.ysf_title_bar_title)).setTextColor(-1);
    }
}
