package com.qiyukf.nim.uikit.common.activity;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import com.p118pd.sdk.AbstractC7179o00o0oOo;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.nim.uikit.common.fragment.TFragment;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.UICustomization;
import com.qiyukf.unicorn.api.Unicorn;
import com.qiyukf.unicorn.p232k.C2709i;
import s.h.e.l.l.C;

public abstract class BaseFragmentActivity extends FragmentActivity {

    /* renamed from: a */
    public ViewGroup f3468a;

    /* renamed from: b */
    public boolean f3469b = false;

    /* renamed from: c */
    public ImageView f3470c;

    static {
        C.i(16777266);
    }

    /* renamed from: b */
    private View m3598b(View view) {
        if (!mo34171a()) {
            return view;
        }
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        LayoutInflater from = LayoutInflater.from(this);
        UICustomization g = m3600g();
        ViewGroup viewGroup = (ViewGroup) from.inflate((g == null || !g.titleCenter) ? C2364R.layout.ysf_title_bar : C2364R.layout.ysf_title_bar_center, (ViewGroup) linearLayout, false);
        this.f3468a = viewGroup;
        linearLayout.addView(viewGroup, -1, (int) getResources().getDimension(C2364R.dimen.ysf_title_bar_height));
        linearLayout.addView(view, -1, -1);
        return linearLayout;
    }

    /* renamed from: f */
    private void mo34366f() {
        if (mo34171a()) {
            setTitle(getTitle());
            View findViewById = findViewById(C2364R.C2367id.ysf_title_bar_back_area);
            this.f3470c = (ImageView) findViewById(C2364R.C2367id.ysf_title_bar_back_view);
            findViewById.setOnClickListener(new View.OnClickListener() {
                /* class com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity.View$OnClickListenerC18841 */

                public final void onClick(View view) {
                    BaseFragmentActivity.this.mo34175d();
                }
            });
            mo34174c();
        }
    }

    /* renamed from: g */
    public static UICustomization m3600g() {
        return !Unicorn.isInit() ? new UICustomization() : (C2452d.m5373e() == null || C2452d.m5373e().uiCustomization == null) ? new UICustomization() : C2452d.m5373e().uiCustomization;
    }

    /* renamed from: h */
    public static boolean m3601h() {
        UICustomization g = m3600g();
        return g != null && g.titleBarStyle == 1;
    }

    /* renamed from: a */
    public final View mo34168a(View view) {
        LinearLayout linearLayout = (LinearLayout) findViewById(C2364R.C2367id.ysf_title_bar_actions_layout);
        if (linearLayout != null) {
            linearLayout.addView(view);
        }
        return view;
    }

    /* renamed from: a */
    public final TextView mo34169a(int i) {
        int i2;
        Resources resources;
        String string = getString(i);
        TextView textView = (TextView) LayoutInflater.from(this).inflate(C2364R.layout.ysf_action_bar_right_text_menu, (ViewGroup) null);
        if (m3601h()) {
            resources = getResources();
            i2 = C2364R.C2365color.ysf_title_bar_text_color_light_selector;
        } else {
            resources = getResources();
            i2 = C2364R.C2365color.ysf_title_bar_text_color_dark_selector;
        }
        textView.setTextColor(resources.getColorStateList(i2));
        textView.setText(string);
        mo34168a(textView);
        return textView;
    }

    /* renamed from: a */
    public final void mo34170a(int i, TFragment tFragment) {
        AbstractC7179o00o0oOo OooO00o = getSupportFragmentManager().m18663OooO00o();
        OooO00o.OooO0O0(i, tFragment);
        try {
            OooO00o.OooO0Oo();
        } catch (Exception unused) {
            C1709a.m3016c("BaseFragmentActivity", "repleaseFragment is error");
        }
    }

    /* renamed from: a */
    public boolean mo34171a() {
        return true;
    }

    /* renamed from: b */
    public final int mo34172b() {
        ViewGroup viewGroup = this.f3468a;
        if (viewGroup == null || viewGroup.getVisibility() != 0) {
            return 0;
        }
        return this.f3468a.getHeight();
    }

    /* renamed from: b */
    public final View mo34173b(int i) {
        return mo34168a(LayoutInflater.from(this).inflate(i, (ViewGroup) null));
    }

    /* renamed from: c */
    public void mo34174c() {
        int i;
        UICustomization g = m3600g();
        if (g != null) {
            int i2 = g.titleBackgroundResId;
            if (i2 > 0) {
                this.f3468a.setBackgroundResource(i2);
            } else {
                int i3 = g.titleBackgroundColor;
                if (i3 != 0) {
                    this.f3468a.setBackgroundColor(i3);
                }
            }
            ImageView imageView = this.f3470c;
            if (!(imageView == null || (i = g.titleBackBtnIconResId) == 0)) {
                imageView.setImageResource(i);
            }
            if (m3601h()) {
                ((ImageView) findViewById(C2364R.C2367id.ysf_title_bar_back_view)).setImageResource(C2364R.C2366drawable.ysf_title_bar_back_icon_white);
                ((TextView) findViewById(C2364R.C2367id.ysf_title_bar_title)).setTextColor(-1);
            }
        }
    }

    /* renamed from: d */
    public void mo34175d() {
        onBackPressed();
    }

    /* renamed from: e */
    public final boolean mo34176e() {
        return Build.VERSION.SDK_INT >= 17 ? super.isDestroyed() : this.f3469b || super.isFinishing();
    }

    @Override // androidx.fragment.app.FragmentActivity
    public native void onBackPressed();

    @Override // androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public native void onCreate(Bundle bundle);

    @Override // androidx.fragment.app.FragmentActivity
    public native void onDestroy();

    @Override // androidx.fragment.app.FragmentActivity, com.p118pd.sdk.C6981o000O00O.OooO0O0
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C2709i.m6266a(i, iArr);
    }

    public native void setAvatar(Bitmap bitmap);

    @Override // android.app.Activity
    public native void setContentView(int i);

    @Override // android.app.Activity
    public native void setContentView(View view);

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(m3598b(view), layoutParams);
        mo34366f();
    }

    @Override // android.app.Activity
    public native void setTitle(int i);

    @Override // android.app.Activity
    public native void setTitle(CharSequence charSequence);
}
