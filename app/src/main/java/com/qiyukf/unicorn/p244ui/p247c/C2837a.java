package com.qiyukf.unicorn.p244ui.p247c;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.UICustomization;
import com.qiyukf.unicorn.p232k.C2708h;
import com.qiyukf.unicorn.p232k.C2724p;
import com.qiyukf.unicorn.p244ui.evaluate.C2982d;
import com.qiyukf.unicorn.p244ui.p247c.C2842b;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.qiyukf.unicorn.ui.c.a */
public final class C2837a {

    /* renamed from: a */
    public Context f6017a;

    /* renamed from: b */
    public UICustomization f6018b;

    /* renamed from: c */
    public C2982d f6019c;

    /* renamed from: d */
    public ViewGroup f6020d;

    /* renamed from: e */
    public LinearLayout f6021e;

    /* renamed from: f */
    public PopupWindow f6022f;

    /* renamed from: g */
    public AbstractC2841a f6023g;

    /* renamed from: h */
    public List<C2842b> f6024h;

    /* renamed from: i */
    public C2842b f6025i;

    /* renamed from: com.qiyukf.unicorn.ui.c.a$a */
    public interface AbstractC2841a {
        /* renamed from: a */
        void mo36670a(C2842b bVar);
    }

    public C2837a(ViewGroup viewGroup) {
        if (viewGroup != null) {
            this.f6020d = viewGroup;
            this.f6017a = viewGroup.getContext();
            LinearLayout linearLayout = new LinearLayout(this.f6017a);
            this.f6021e = linearLayout;
            linearLayout.setOrientation(0);
            this.f6021e.setGravity(16);
            this.f6021e.setPadding(C1862c.m3540a(15.0f), 0, C1862c.m3540a(15.0f), 0);
            this.f6020d.removeAllViews();
            this.f6020d.addView(this.f6021e);
        }
    }

    /* renamed from: a */
    private View m6578a(final C2842b bVar, boolean z) {
        View inflate = LayoutInflater.from(this.f6017a).inflate(z ? C2364R.layout.ysf_service_action_menu_item_folded : C2364R.layout.ysf_service_action_menu_item, (ViewGroup) null);
        ImageView imageView = (ImageView) inflate.findViewById(C2364R.C2367id.ysf_action_menu_icon);
        if (z) {
            TextView textView = (TextView) inflate.findViewById(C2364R.C2367id.ysf_action_menu_title);
            textView.setText(bVar.mo36680h());
            if (TextUtils.isEmpty(bVar.mo36674c())) {
                imageView.setImageResource(bVar.mo36675d());
            }
            int i = C2364R.C2365color.ysf_title_bar_text_color_dark_selector;
            if (C2452d.m5373e().titleBarConfig == null || C2452d.m5373e().titleBarConfig.titleBarRightTextColor == 0) {
                textView.setTextColor(this.f6017a.getResources().getColorStateList(i));
            } else {
                textView.setTextColor(C2452d.m5373e().titleBarConfig.titleBarRightTextColor);
            }
            textView.setEllipsize(TextUtils.TruncateAt.END);
        } else if (TextUtils.isEmpty(bVar.mo36674c())) {
            imageView.setImageResource(m6588c() ? bVar.mo36676e() : bVar.mo36675d());
        }
        if (!TextUtils.isEmpty(bVar.mo36674c())) {
            int dimension = (int) this.f6017a.getResources().getDimension(C2364R.dimen.ysf_title_bar_icon_size);
            C1870a.m3568a(bVar.mo36674c(), imageView, dimension, dimension);
        }
        C2724p.m6289a(inflate, bVar.mo36678f());
        if (bVar.mo36673b() == C2842b.EnumC2844a.f6042d) {
            C2724p.m6289a(inflate, false);
            C2982d dVar = this.f6019c;
            if (dVar != null) {
                dVar.mo36820a(inflate, bVar.mo36681i());
            }
        }
        inflate.setOnClickListener(new View.OnClickListener() {
            /* class com.qiyukf.unicorn.p244ui.p247c.C2837a.View$OnClickListenerC28403 */

            public final void onClick(View view) {
                C2837a.this.m6585b();
                if (C2837a.this.f6023g != null) {
                    C2837a.this.f6023g.mo36670a(bVar);
                }
            }
        });
        return inflate;
    }

    /* renamed from: a */
    private void m6580a() {
        for (int i = 0; i < this.f6024h.size(); i++) {
            View a = m6578a(this.f6024h.get(i), false);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.leftMargin = C1862c.m3540a(10.0f);
            a.setLayoutParams(layoutParams);
            this.f6021e.addView(a);
        }
    }

    /* renamed from: a */
    private void m6581a(int i) {
        if (i > 1) {
            this.f6021e.addView(m6578a(this.f6024h.get(0), false));
        }
        ImageView imageView = new ImageView(this.f6017a);
        imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        imageView.setImageResource(m6588c() ? C2364R.C2366drawable.ysf_ic_menu_more_light : C2364R.C2366drawable.ysf_ic_menu_more_dark);
        imageView.setOnClickListener(new View.OnClickListener() {
            /* class com.qiyukf.unicorn.p244ui.p247c.C2837a.View$OnClickListenerC28381 */

            public final void onClick(View view) {
                if (C2837a.this.f6022f != null) {
                    C2837a.this.f6022f.showAsDropDown(C2837a.this.f6021e, -C1862c.m3540a(30.0f), C1862c.m3540a(10.0f));
                    C2837a.m6582a(C2837a.this, 0.5f);
                }
                if (C2837a.this.f6023g != null) {
                    C2837a.this.f6023g.mo36670a(new C2842b(C2842b.EnumC2844a.f6039a));
                }
            }
        });
        int dimension = (int) this.f6017a.getResources().getDimension(C2364R.dimen.ysf_title_bar_icon_size);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(dimension, dimension);
        layoutParams.leftMargin = C1862c.m3540a(10.0f);
        this.f6021e.addView(imageView, layoutParams);
        m6583a(this.f6024h, i);
    }

    /* renamed from: a */
    public static /* synthetic */ void m6582a(C2837a aVar, float f) {
        Context context = aVar.f6017a;
        if (context instanceof Activity) {
            Window window = ((Activity) context).getWindow();
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.alpha = f;
            window.setAttributes(attributes);
        }
    }

    /* renamed from: a */
    private void m6583a(List<C2842b> list, int i) {
        LinearLayout linearLayout = new LinearLayout(this.f6017a);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(C2364R.C2366drawable.ysf_menu_panel_background);
        if (i > 1) {
            for (int i2 = 1; i2 < list.size(); i2++) {
                C2842b bVar = list.get(i2);
                if (i2 > 1) {
                    linearLayout.addView(LayoutInflater.from(this.f6017a).inflate(C2364R.layout.ysf_include_divider, (ViewGroup) linearLayout, false), -1, C1862c.m3540a(0.5f));
                }
                linearLayout.addView(m6578a(bVar, true), -1, -2);
            }
        } else {
            for (int i3 = 0; i3 < list.size(); i3++) {
                C2842b bVar2 = list.get(i3);
                if (i3 > 1) {
                    linearLayout.addView(LayoutInflater.from(this.f6017a).inflate(C2364R.layout.ysf_include_divider, (ViewGroup) linearLayout, false), -1, C1862c.m3540a(0.5f));
                }
                linearLayout.addView(m6578a(bVar2, true), -1, -2);
            }
        }
        PopupWindow popupWindow = new PopupWindow(this.f6017a);
        this.f6022f = popupWindow;
        popupWindow.setWidth(C1862c.m3540a(140.0f));
        this.f6022f.setHeight(-2);
        this.f6022f.setContentView(linearLayout);
        this.f6022f.setBackgroundDrawable(new ColorDrawable(0));
        this.f6022f.setOutsideTouchable(false);
        this.f6022f.setFocusable(true);
        this.f6022f.setOnDismissListener(new PopupWindow.OnDismissListener() {
            /* class com.qiyukf.unicorn.p244ui.p247c.C2837a.C28392 */

            public final void onDismiss() {
                C2837a.m6582a(C2837a.this, 1.0f);
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: b */
    private void m6585b() {
        PopupWindow popupWindow = this.f6022f;
        if (popupWindow != null && popupWindow.isShowing()) {
            this.f6022f.dismiss();
        }
    }

    /* renamed from: b */
    private boolean m6586b(List<C2842b> list) {
        List<C2842b> list2 = this.f6024h;
        if (list2 == null || list2.size() != list.size()) {
            return true;
        }
        for (int i = 0; i < this.f6024h.size(); i++) {
            if (!this.f6024h.get(i).equals(list.get(i))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    private boolean m6588c() {
        UICustomization uICustomization = this.f6018b;
        return uICustomization != null && uICustomization.titleBarStyle == 1;
    }

    /* renamed from: a */
    public final void mo36662a(UICustomization uICustomization) {
        this.f6018b = uICustomization;
    }

    /* renamed from: a */
    public final void mo36663a(AbstractC2841a aVar) {
        this.f6023g = aVar;
    }

    /* renamed from: a */
    public final void mo36664a(C2842b bVar, List<C2842b> list) {
        if (this.f6020d != null) {
            if (!C2708h.m6262a(list) || bVar != null) {
                this.f6020d.setVisibility(0);
                if (m6586b(list) || bVar == null || !bVar.equals(this.f6025i)) {
                    this.f6021e.removeAllViews();
                    if (bVar != null) {
                        this.f6025i = bVar;
                        bVar.mo36671a();
                        this.f6021e.addView(m6578a(this.f6025i, false));
                    }
                    if (!C2708h.m6262a(list)) {
                        this.f6024h = list;
                        for (C2842b bVar2 : list) {
                            bVar2.mo36671a();
                        }
                        if (this.f6024h.size() < 2) {
                            m6580a();
                        } else {
                            m6581a(1);
                        }
                    } else {
                        this.f6024h = new ArrayList();
                    }
                }
            } else {
                this.f6020d.setVisibility(8);
            }
        }
    }

    /* renamed from: a */
    public final void mo36665a(C2982d dVar) {
        this.f6019c = dVar;
    }

    /* renamed from: a */
    public final void mo36666a(List<C2842b> list) {
        if (this.f6020d != null) {
            if (C2708h.m6262a(list)) {
                this.f6020d.setVisibility(8);
                return;
            }
            this.f6020d.setVisibility(0);
            if (m6586b(list)) {
                this.f6024h = list;
                m6585b();
                for (C2842b bVar : this.f6024h) {
                    bVar.mo36671a();
                }
                this.f6021e.removeAllViews();
                if (this.f6024h.size() < 3) {
                    m6580a();
                } else {
                    m6581a(2);
                }
            }
        }
    }
}
