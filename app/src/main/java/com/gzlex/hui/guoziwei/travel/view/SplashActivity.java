package com.gzlex.hui.guoziwei.travel.view;

import android.content.Intent;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.gzlex.hui.guoziwei.travel.C1084R;
import com.jinhui365.hotsources.bean.HotSourceVO;
import com.p118pd.sdk.C8026oOO00oOo;
import com.p118pd.sdk.C8027oOO00oo;
import com.p118pd.sdk.C8620oo0O0oo0;
import com.p118pd.sdk.C8654oo0Oo00;
import com.p118pd.sdk.C8707oo0o0OOO;
import com.p118pd.sdk.o0OOOOO;
import com.umeng.commonsdk.proguard.C3587az;
import java.util.List;

public class SplashActivity extends com.jinhui365.template.view.SplashActivity {
    public ProgressBar OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public RelativeLayout f14958OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public TextView f14959OooO00o;

    @Override // com.jinhui365.template.view.SplashActivity, com.jinhui365.template.view.SplashActivity, com.jinhui365.template.view.SplashActivity
    public int OooO00o() {
        return C1084R.layout.ac_sp;
    }

    @Override // com.jinhui365.template.view.SplashActivity
    public void OooO00o(int i) {
        if (i <= 0 || i >= 100) {
            this.f14958OooO00o.setVisibility(8);
            return;
        }
        TextView textView = this.f14959OooO00o;
        textView.setText(i + o0OOOOO.OooO00o(new byte[]{C8026oOO00oOo.OooO00o}, "906116"));
        this.OooO00o.setProgress(i);
        this.f14958OooO00o.setVisibility(0);
    }

    @Override // com.p118pd.sdk.AbstractC8728oo0oO000
    public void OooO00o(HotSourceVO hotSourceVO, String str) {
    }

    @Override // com.p118pd.sdk.AbstractC8728oo0oO000
    public void OooO00o(String str, String str2, HotSourceVO hotSourceVO) {
    }

    @Override // com.p118pd.sdk.AbstractC8728oo0oO000
    public void OooO00o(List<HotSourceVO> list) {
    }

    @Override // com.jinhui365.template.view.SplashActivity
    public void OooO0O0() {
        if (C8707oo0o0OOO.OooO0O0() != null) {
            Intent intent = getIntent();
            if (intent != null && intent.hasExtra(o0OOOOO.OooO00o(new byte[]{119, 121, 123, 110, 38, 96, 109, 98, 119, 110, 45, 119, 109, 121}, "9061c8"))) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString(o0OOOOO.OooO00o(new byte[]{22, C3587az.f9268l, C8027oOO00oo.OooO0O0, 17, 93, 67, 49, 19, 94}, "da2e81"), o0OOOOO.OooO00o(new byte[]{112, 75, 11, 92, 13, 80}, "69b9c4"));
                C8654oo0Oo00.OooO00o().OooO00o(o0OOOOO.OooO00o(new byte[]{121, 9, 68, 12, 2, 79, 101, 3, 93, 12, 10, 82, 82, 20}, "7f0ed6"), createMap);
                finish();
            } else if (C8620oo0O0oo0.OooO00o().OooO00o(intent)) {
                finish();
            } else {
                super.OooO0O0();
            }
        } else {
            super.OooO0O0();
        }
    }

    @Override // com.p118pd.sdk.AbstractC8728oo0oO000
    public void OooO0O0(String str, String str2, HotSourceVO hotSourceVO) {
    }

    @Override // com.jinhui365.template.view.SplashActivity
    public void OooO0OO() {
        this.f14958OooO00o = (RelativeLayout) findViewById(C1084R.C1087id.rl_progress);
        this.f14959OooO00o = (TextView) findViewById(C1084R.C1087id.tv_progress);
        this.OooO00o = (ProgressBar) findViewById(C1084R.C1087id.progressbar);
    }

    @Override // com.p118pd.sdk.AbstractC8728oo0oO000
    public void onFailure(String str, String str2) {
    }
}
