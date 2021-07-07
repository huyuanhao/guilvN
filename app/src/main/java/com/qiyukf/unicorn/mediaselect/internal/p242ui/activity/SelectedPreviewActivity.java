package com.qiyukf.unicorn.mediaselect.internal.p242ui.activity;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2743d;
import com.qiyukf.unicorn.mediaselect.internal.p238a.C2745e;
import java.util.ArrayList;

/* renamed from: com.qiyukf.unicorn.mediaselect.internal.ui.activity.SelectedPreviewActivity */
public class SelectedPreviewActivity extends BasePreviewActivity {
    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, com.qiyukf.unicorn.mediaselect.internal.p242ui.activity.BasePreviewActivity, androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        if (!C2745e.m6339a().f5690q) {
            setResult(0);
            finish();
            return;
        }
        ArrayList parcelableArrayList = getIntent().getBundleExtra("extra_default_bundle").getParcelableArrayList("state_selection");
        this.f5744e.mo36574a(parcelableArrayList);
        this.f5744e.notifyDataSetChanged();
        if (((BasePreviewActivity) this).f5742c.f5679f) {
            this.f5745f.mo36591a(1);
        } else {
            this.f5745f.mo36592a(true);
        }
        this.f5749j = 0;
        mo36575a((C2743d) parcelableArrayList.get(0));
    }
}
