package com.qiyukf.unicorn.mediaselect.internal.p242ui.activity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.mediaselect.EnumC2731b;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2742c;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2743d;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2745e;
import com.qiyukf.unicorn.mediaselect.internal.p240c.C2753c;
import com.qiyukf.unicorn.mediaselect.internal.p241d.C2756c;
import com.qiyukf.unicorn.mediaselect.internal.p242ui.p243a.C2766d;
import com.qiyukf.unicorn.mediaselect.internal.p242ui.widget.CheckRadioView;
import com.qiyukf.unicorn.mediaselect.internal.p242ui.widget.CheckView;
import com.qiyukf.unicorn.mediaselect.internal.p242ui.widget.IncapableDialog;
import com.qiyukf.unicorn.mediaselect.p237c.AbstractC2737b;
import s.h.e.l.l.C;

/* renamed from: com.qiyukf.unicorn.mediaselect.internal.ui.activity.BasePreviewActivity */
public abstract class BasePreviewActivity extends BaseFragmentActivity implements ViewPager.OooO, View.OnClickListener, AbstractC2737b {

    /* renamed from: b */
    public final C2753c f5741b = new C2753c(this);

    /* renamed from: c */
    public C2745e f5742c;

    /* renamed from: d */
    public ViewPager f5743d;

    /* renamed from: e */
    public C2766d f5744e;

    /* renamed from: f */
    public CheckView f5745f;

    /* renamed from: g */
    public TextView f5746g;

    /* renamed from: h */
    public TextView f5747h;

    /* renamed from: i */
    public TextView f5748i;

    /* renamed from: j */
    public int f5749j = -1;

    /* renamed from: k */
    public boolean f5750k;

    /* renamed from: l */
    public LinearLayout f5751l;

    /* renamed from: m */
    public CheckRadioView f5752m;

    /* renamed from: n */
    public FrameLayout f5753n;

    /* renamed from: o */
    public FrameLayout f5754o;

    /* renamed from: p */
    public boolean f5755p = false;

    static {
        C.i(16777273);
    }

    /* renamed from: a */
    private void m6405a(boolean z) {
        Intent intent = new Intent();
        intent.putExtra("extra_result_bundle", this.f5741b.mo36537a());
        intent.putExtra("extra_result_apply", z);
        intent.putExtra("extra_result_original_enable", this.f5750k);
        setResult(-1, intent);
    }

    /* renamed from: a */
    public static /* synthetic */ boolean m6406a(BasePreviewActivity basePreviewActivity, C2743d dVar) {
        C2742c d = basePreviewActivity.f5741b.mo36546d(dVar);
        C2742c.m6336a(basePreviewActivity, d);
        return d == null;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: f */
    private void m6409f() {
        int f = this.f5741b.mo36550f();
        if (f == 0) {
            this.f5747h.setText(C2364R.string.ysf_button_sure_default);
            this.f5747h.setEnabled(false);
        } else if (f != 1 || !this.f5742c.mo36518c()) {
            this.f5747h.setEnabled(true);
            this.f5747h.setText(getString(C2364R.string.ysf_button_sure, new Object[]{Integer.valueOf(f)}));
        } else {
            this.f5747h.setText(C2364R.string.ysf_button_sure_default);
            this.f5747h.setEnabled(true);
        }
        if (this.f5742c.f5692s) {
            this.f5751l.setVisibility(0);
            this.f5752m.mo36590a(this.f5750k);
            if (!this.f5750k) {
                this.f5752m.mo36589a();
            }
            if (m6410g() > 0 && this.f5750k) {
                IncapableDialog.newInstance("", getString(C2364R.string.ysf_error_over_original_size, new Object[]{Integer.valueOf(this.f5742c.f5694u)})).show(getSupportFragmentManager(), IncapableDialog.class.getName());
                this.f5752m.mo36590a(false);
                this.f5752m.mo36589a();
                this.f5750k = false;
                return;
            }
            return;
        }
        this.f5751l.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: g */
    private int m6410g() {
        int f = this.f5741b.mo36550f();
        int i = 0;
        for (int i2 = 0; i2 < f; i2++) {
            C2743d dVar = this.f5741b.mo36541b().get(i2);
            if (EnumC2731b.m6306a(dVar.f5670b) && C2756c.m6384a(dVar.f5672d) > ((float) this.f5742c.f5694u)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public final void mo36575a(C2743d dVar) {
        if (EnumC2731b.m6310c(dVar.f5670b)) {
            this.f5748i.setVisibility(0);
            TextView textView = this.f5748i;
            textView.setText(C2756c.m6384a(dVar.f5672d) + "M");
        } else {
            this.f5748i.setVisibility(8);
        }
        if (EnumC2731b.m6308b(dVar.f5670b)) {
            this.f5751l.setVisibility(8);
        } else if (this.f5742c.f5692s) {
            this.f5751l.setVisibility(0);
        }
    }

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity
    /* renamed from: a */
    public final boolean mo34171a() {
        return false;
    }

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity
    public native void onBackPressed();

    @Override // com.qiyukf.unicorn.mediaselect.p237c.AbstractC2737b
    public native void onClick();

    public native void onClick(View view);

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(@Nullable Bundle bundle) {
        boolean z;
        setTheme(C2745e.m6339a().f5677d);
        super.onCreate(bundle);
        if (!C2745e.m6339a().f5690q) {
            setResult(0);
            finish();
            return;
        }
        setContentView(C2364R.layout.ysf_activity_media_preview);
        if (Build.VERSION.SDK_INT >= 19) {
            getWindow().addFlags(67108864);
        }
        C2745e a = C2745e.m6339a();
        this.f5742c = a;
        if (a.mo36519d()) {
            setRequestedOrientation(this.f5742c.f5678e);
        }
        if (bundle == null) {
            this.f5741b.mo36538a(getIntent().getBundleExtra("extra_default_bundle"));
            z = getIntent().getBooleanExtra("extra_result_original_enable", false);
        } else {
            this.f5741b.mo36538a(bundle);
            z = bundle.getBoolean("checkState");
        }
        this.f5750k = z;
        this.f5746g = (TextView) findViewById(C2364R.C2367id.ysf_button_back);
        this.f5747h = (TextView) findViewById(C2364R.C2367id.ysf_button_apply);
        this.f5748i = (TextView) findViewById(C2364R.C2367id.ysf_size);
        this.f5746g.setOnClickListener(this);
        this.f5747h.setOnClickListener(this);
        ViewPager viewPager = (ViewPager) findViewById(C2364R.C2367id.ysf_pager);
        this.f5743d = viewPager;
        viewPager.addOnPageChangeListener(this);
        C2766d dVar = new C2766d(getSupportFragmentManager());
        this.f5744e = dVar;
        this.f5743d.setAdapter(dVar);
        CheckView checkView = (CheckView) findViewById(C2364R.C2367id.ysf_check_view);
        this.f5745f = checkView;
        checkView.mo36593b(this.f5742c.f5679f);
        this.f5753n = (FrameLayout) findViewById(C2364R.C2367id.ysf_bottom_toolbar);
        this.f5754o = (FrameLayout) findViewById(C2364R.C2367id.ysf_top_toolbar);
        this.f5745f.setOnClickListener(new View.OnClickListener() {
            /* class com.qiyukf.unicorn.mediaselect.internal.p242ui.activity.BasePreviewActivity.View$OnClickListenerC27681 */

            /* JADX WARNING: Removed duplicated region for block: B:15:0x0068  */
            /* JADX WARNING: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onClick(android.view.View r3) {
                /*
                // Method dump skipped, instructions count: 117
                */
                throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.mediaselect.internal.p242ui.activity.BasePreviewActivity.View$OnClickListenerC27681.onClick(android.view.View):void");
            }
        });
        this.f5751l = (LinearLayout) findViewById(C2364R.C2367id.ysf_originalLayout);
        this.f5752m = (CheckRadioView) findViewById(C2364R.C2367id.ysf_original);
        this.f5751l.setOnClickListener(new View.OnClickListener() {
            /* class com.qiyukf.unicorn.mediaselect.internal.p242ui.activity.BasePreviewActivity.View$OnClickListenerC27692 */

            public final void onClick(View view) {
                int g = BasePreviewActivity.this.m6410g();
                if (g > 0) {
                    IncapableDialog.newInstance("", BasePreviewActivity.this.getString(C2364R.string.ysf_error_over_original_count, new Object[]{Integer.valueOf(g), Integer.valueOf(BasePreviewActivity.this.f5742c.f5694u)})).show(BasePreviewActivity.this.getSupportFragmentManager(), IncapableDialog.class.getName());
                    return;
                }
                BasePreviewActivity basePreviewActivity = BasePreviewActivity.this;
                basePreviewActivity.f5750k = true ^ basePreviewActivity.f5750k;
                basePreviewActivity.f5752m.mo36590a(BasePreviewActivity.this.f5750k);
                BasePreviewActivity basePreviewActivity2 = BasePreviewActivity.this;
                if (!basePreviewActivity2.f5750k) {
                    basePreviewActivity2.f5752m.mo36589a();
                }
            }
        });
        m6409f();
    }

    @Override // androidx.viewpager.widget.ViewPager.OooO
    public native void onPageScrollStateChanged(int i);

    @Override // androidx.viewpager.widget.ViewPager.OooO
    public native void onPageScrolled(int i, float f, int i2);

    @Override // androidx.viewpager.widget.ViewPager.OooO
    public native void onPageSelected(int i);

    @Override // androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public native void onSaveInstanceState(Bundle bundle);
}
