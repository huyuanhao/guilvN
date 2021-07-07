package com.qiyukf.unicorn.mediaselect.internal.p242ui.activity;

import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.UICustomization;
import com.qiyukf.unicorn.mediaselect.EnumC2731b;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2739a;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2741b;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2743d;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2745e;
import com.qiyukf.unicorn.mediaselect.internal.p240c.C2749a;
import com.qiyukf.unicorn.mediaselect.internal.p240c.C2753c;
import com.qiyukf.unicorn.mediaselect.internal.p241d.C2754a;
import com.qiyukf.unicorn.mediaselect.internal.p241d.C2756c;
import com.qiyukf.unicorn.mediaselect.internal.p242ui.fragment.MediaSelectionFragment;
import com.qiyukf.unicorn.mediaselect.internal.p242ui.p243a.C2757a;
import com.qiyukf.unicorn.mediaselect.internal.p242ui.p243a.C2764b;
import com.qiyukf.unicorn.mediaselect.internal.p242ui.widget.C2777a;
import com.qiyukf.unicorn.mediaselect.internal.p242ui.widget.CheckRadioView;
import com.qiyukf.unicorn.mediaselect.internal.p242ui.widget.IncapableDialog;
import com.qiyukf.unicorn.p231j.C2690a;
import s.h.e.l.l.C;

/* renamed from: com.qiyukf.unicorn.mediaselect.internal.ui.activity.MatisseActivity */
public class MatisseActivity extends BaseFragmentActivity implements View.OnClickListener, AdapterView.OnItemSelectedListener, C2749a.AbstractC2750a, C2757a.AbstractC2760b, C2757a.AbstractC2762d, C2757a.AbstractC2763e, MediaSelectionFragment.AbstractC2771a {

    /* renamed from: b */
    public final C2749a f5758b = new C2749a();

    /* renamed from: c */
    public C2754a f5759c;

    /* renamed from: d */
    public C2753c f5760d = new C2753c(this);

    /* renamed from: e */
    public C2745e f5761e;

    /* renamed from: f */
    public C2777a f5762f;

    /* renamed from: g */
    public C2764b f5763g;

    /* renamed from: h */
    public TextView f5764h;

    /* renamed from: i */
    public TextView f5765i;

    /* renamed from: j */
    public View f5766j;

    /* renamed from: k */
    public View f5767k;

    /* renamed from: l */
    public LinearLayout f5768l;

    /* renamed from: m */
    public CheckRadioView f5769m;

    /* renamed from: n */
    public boolean f5770n;

    static {
        C.i(50331752);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: a */
    private void m6414a(C2739a aVar) {
        if (!aVar.mo36507e() || !aVar.mo36508f()) {
            this.f5766j.setVisibility(0);
            this.f5767k.setVisibility(8);
            getSupportFragmentManager().m18663OooO00o().OooO0O0(C2364R.C2367id.ysf_container, MediaSelectionFragment.newInstance(aVar), MediaSelectionFragment.class.getSimpleName()).OooO0Oo();
            return;
        }
        this.f5766j.setVisibility(8);
        this.f5767k.setVisibility(0);
    }

    /* renamed from: f */
    private void m6417f() {
        int f = this.f5760d.mo36550f();
        if (f == 0) {
            this.f5764h.setEnabled(false);
            this.f5765i.setEnabled(false);
            this.f5765i.setText(getString(C2364R.string.ysf_button_sure_default));
        } else if (f != 1 || !this.f5761e.mo36518c()) {
            this.f5764h.setEnabled(true);
            this.f5765i.setEnabled(true);
            this.f5765i.setText(getString(C2364R.string.ysf_button_sure, new Object[]{Integer.valueOf(f)}));
        } else {
            this.f5764h.setEnabled(true);
            this.f5765i.setText(C2364R.string.ysf_button_sure_default);
            this.f5765i.setEnabled(true);
        }
        if (this.f5761e.f5692s) {
            this.f5768l.setVisibility(0);
            this.f5769m.mo36590a(this.f5770n);
            if (m6418g() > 0 && this.f5770n) {
                IncapableDialog.newInstance("", getString(C2364R.string.ysf_error_over_original_size, new Object[]{Integer.valueOf(this.f5761e.f5694u)})).show(getSupportFragmentManager(), IncapableDialog.class.getName());
                this.f5769m.mo36590a(false);
                this.f5770n = false;
                return;
            }
            return;
        }
        this.f5768l.setVisibility(4);
    }

    /* renamed from: g */
    private int m6418g() {
        int f = this.f5760d.mo36550f();
        int i = 0;
        for (int i2 = 0; i2 < f; i2++) {
            C2743d dVar = this.f5760d.mo36541b().get(i2);
            if (EnumC2731b.m6306a(dVar.f5670b) && C2756c.m6384a(dVar.f5672d) > ((float) this.f5761e.f5694u)) {
                i++;
            }
        }
        return i;
    }

    @Override // com.qiyukf.unicorn.mediaselect.internal.p242ui.p243a.C2757a.AbstractC2763e
    public native void capture();

    @Override // androidx.fragment.app.FragmentActivity
    public native void onActivityResult(int i, int i2, Intent intent);

    @Override // com.qiyukf.unicorn.mediaselect.internal.p240c.C2749a.AbstractC2750a
    public native void onAlbumLoad(Cursor cursor);

    @Override // com.qiyukf.unicorn.mediaselect.internal.p240c.C2749a.AbstractC2750a
    public native void onAlbumReset();

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity
    public native void onBackPressed();

    public native void onClick(View view);

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(@Nullable Bundle bundle) {
        C2745e a = C2745e.m6339a();
        this.f5761e = a;
        setTheme(a.f5677d);
        super.onCreate(bundle);
        if (!this.f5761e.f5690q) {
            setResult(0);
            finish();
            return;
        }
        setContentView(C2364R.layout.ysf_activity_matisse);
        if (this.f5761e.mo36519d()) {
            setRequestedOrientation(this.f5761e.f5678e);
        }
        if (this.f5761e.f5684k) {
            C2754a aVar = new C2754a(this);
            this.f5759c = aVar;
            C2741b bVar = this.f5761e.f5685l;
            if (bVar != null) {
                aVar.mo36553a(bVar);
            } else {
                throw new RuntimeException("Don't forget to set CaptureStrategy.");
            }
        }
        this.f5764h = (TextView) findViewById(C2364R.C2367id.ysf_button_preview);
        this.f5765i = (TextView) findViewById(C2364R.C2367id.ysf_button_apply);
        this.f5764h.setOnClickListener(this);
        this.f5765i.setOnClickListener(this);
        this.f5766j = findViewById(C2364R.C2367id.ysf_container);
        this.f5767k = findViewById(C2364R.C2367id.ysf_empty_view);
        this.f5768l = (LinearLayout) findViewById(C2364R.C2367id.ysf_originalLayout);
        this.f5769m = (CheckRadioView) findViewById(C2364R.C2367id.ysf_original);
        this.f5768l.setOnClickListener(this);
        this.f5760d.mo36538a(bundle);
        if (bundle != null) {
            this.f5770n = bundle.getBoolean("checkState");
        }
        m6417f();
        setTitle("选择文件");
        this.f5763g = new C2764b(this);
        C2777a aVar2 = new C2777a(this);
        this.f5762f = aVar2;
        aVar2.mo36608a(this);
        this.f5762f.mo36610a((TextView) findViewById(C2364R.C2367id.ysf_selected_album));
        this.f5762f.mo36607a(findViewById(C2364R.C2367id.ysf_toolbar));
        this.f5762f.mo36609a(this.f5763g);
        this.f5758b.mo36525a(this, this);
        this.f5758b.mo36524a(bundle);
        this.f5758b.mo36526b();
        if (C2690a.m6219a().mo36462d()) {
            this.f5765i.setTextColor(Color.parseColor(C2690a.m6219a().mo36461c().mo35690b()));
            this.f5764h.setTextColor(Color.parseColor(C2690a.m6219a().mo36461c().mo35690b()));
            return;
        }
        try {
            UICustomization uICustomization = C2452d.m5373e().uiCustomization;
            if (uICustomization != null && uICustomization.buttonBackgroundColorList > 0) {
                this.f5765i.setTextColor(getResources().getColorStateList(uICustomization.buttonBackgroundColorList));
                this.f5764h.setTextColor(getResources().getColorStateList(uICustomization.buttonBackgroundColorList));
            }
        } catch (Exception e) {
            C1709a.m3016c("PickerAlbumActivity", "ui customization error: " + e.toString());
        }
    }

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity
    public native void onDestroy();

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        this.f5758b.mo36523a(i);
        this.f5763g.getCursor().moveToPosition(i);
        C2739a a = C2739a.m6328a(this.f5763g.getCursor());
        if (a.mo36507e() && C2745e.m6339a().f5684k) {
            a.mo36505d();
        }
        m6414a(a);
    }

    @Override // com.qiyukf.unicorn.mediaselect.internal.p242ui.p243a.C2757a.AbstractC2762d
    public native void onMediaClick(C2739a aVar, C2743d dVar);

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public native boolean onOptionsItemSelected(MenuItem menuItem);

    @Override // androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public native void onSaveInstanceState(Bundle bundle);

    @Override // com.qiyukf.unicorn.mediaselect.internal.p242ui.p243a.C2757a.AbstractC2760b
    public native void onUpdate();

    @Override // com.qiyukf.unicorn.mediaselect.internal.p242ui.fragment.MediaSelectionFragment.AbstractC2771a
    public native C2753c provideSelectedItemCollection();
}
