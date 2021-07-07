package com.qiyukf.unicorn.mediaselect.internal.p242ui.activity;

import android.database.Cursor;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2739a;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2743d;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2745e;
import com.qiyukf.unicorn.mediaselect.internal.p240c.C2751b;
import s.h.e.l.l.C;

/* renamed from: com.qiyukf.unicorn.mediaselect.internal.ui.activity.AlbumPreviewActivity */
public class AlbumPreviewActivity extends BasePreviewActivity implements C2751b.AbstractC2752a {

    /* renamed from: l */
    public C2751b f5739l = new C2751b();

    /* renamed from: m */
    public boolean f5740m;

    static {
        C.i(50331751);
    }

    @Override // com.qiyukf.unicorn.mediaselect.internal.p240c.C2751b.AbstractC2752a
    public native void onAlbumMediaLoad(Cursor cursor);

    @Override // com.qiyukf.unicorn.mediaselect.internal.p240c.C2751b.AbstractC2752a
    public native void onAlbumMediaReset();

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity, com.qiyukf.unicorn.mediaselect.internal.p242ui.activity.BasePreviewActivity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (!C2745e.m6339a().f5690q) {
            setResult(0);
            finish();
            return;
        }
        this.f5739l.mo36532a(this, this);
        this.f5739l.mo36533a((C2739a) getIntent().getParcelableExtra("extra_album"));
        C2743d dVar = (C2743d) getIntent().getParcelableExtra("extra_item");
        if (((BasePreviewActivity) this).f5742c.f5679f) {
            this.f5745f.mo36591a(((BasePreviewActivity) this).f5741b.mo36548e(dVar));
        } else {
            this.f5745f.mo36592a(((BasePreviewActivity) this).f5741b.mo36545c(dVar));
        }
        mo36575a(dVar);
    }

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity
    public native void onDestroy();
}
