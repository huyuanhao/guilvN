package com.qiyukf.nim.uikit.common.media.picker.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity;
import com.qiyukf.nim.uikit.common.media.picker.fragment.PickerAlbumFragment;
import com.qiyukf.nim.uikit.common.media.picker.fragment.PickerImageFragment;
import com.qiyukf.nim.uikit.common.media.picker.model.C1914a;
import com.qiyukf.nim.uikit.common.media.picker.model.C1915b;
import com.qiyukf.nim.uikit.common.media.picker.model.PhotoInfo;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.UICustomization;
import com.qiyukf.unicorn.p231j.C2690a;
import java.util.ArrayList;
import java.util.List;
import s.h.e.l.l.C;

public class PickerAlbumActivity extends BaseFragmentActivity implements View.OnClickListener, PickerAlbumFragment.AbstractC1912b, PickerImageFragment.AbstractC1913a {

    /* renamed from: b */
    public FrameLayout f3547b;

    /* renamed from: c */
    public FrameLayout f3548c;

    /* renamed from: d */
    public PickerAlbumFragment f3549d;

    /* renamed from: e */
    public PickerImageFragment f3550e;

    /* renamed from: f */
    public TextView f3551f;

    /* renamed from: g */
    public TextView f3552g;

    /* renamed from: h */
    public List<PhotoInfo> f3553h = new ArrayList();

    /* renamed from: i */
    public boolean f3554i;

    /* renamed from: j */
    public boolean f3555j;

    /* renamed from: k */
    public boolean f3556k;

    /* renamed from: l */
    public int f3557l;

    /* renamed from: m */
    public boolean f3558m;

    /* renamed from: n */
    public int f3559n = 1;

    static {
        C.i(50331744);
    }

    /* renamed from: a */
    private boolean m3652a(PhotoInfo photoInfo) {
        for (int i = 0; i < this.f3553h.size(); i++) {
            if (this.f3553h.get(i).getImageId() == photoInfo.getImageId()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    private void m3653f() {
        int size = this.f3553h.size();
        if (size > 0) {
            this.f3551f.setEnabled(true);
            this.f3552g.setEnabled(true);
            this.f3552g.setText(String.format(getResources().getString(C2364R.string.ysf_picker_image_send_select), Integer.valueOf(size)));
            return;
        }
        this.f3551f.setEnabled(false);
        this.f3552g.setEnabled(false);
        this.f3552g.setText(C2364R.string.ysf_send);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public native void onActivityResult(int i, int i2, Intent intent);

    @Override // com.qiyukf.nim.uikit.common.media.picker.fragment.PickerAlbumFragment.AbstractC1912b
    public native void onAlbumItemClick(C1914a aVar);

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity
    public native void onBackPressed();

    public void onClick(View view) {
        if (view.getId() == C2364R.C2367id.picker_bottombar_preview) {
            List<PhotoInfo> list = this.f3553h;
            PickerAlbumPreviewActivity.start(this, list, 0, this.f3555j, this.f3556k, list, this.f3557l);
        } else if (view.getId() == C2364R.C2367id.picker_bottombar_select) {
            setResult(-1, C1915b.m3689a(this.f3553h, this.f3556k));
            finish();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity
    public native void onConfigurationChanged(Configuration configuration);

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C2364R.layout.ysf_picker_album_activity);
        Intent intent = getIntent();
        int i = 0;
        if (intent != null) {
            this.f3554i = intent.getBooleanExtra("multi_select_mode", false);
            this.f3557l = intent.getIntExtra("multi_select_size_limit", 9);
            this.f3555j = intent.getBooleanExtra("support_original", false);
        }
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(C2364R.C2367id.picker_bottombar);
        if (!this.f3554i) {
            i = 8;
        }
        relativeLayout.setVisibility(i);
        TextView textView = (TextView) findViewById(C2364R.C2367id.picker_bottombar_preview);
        this.f3551f = textView;
        textView.setOnClickListener(this);
        TextView textView2 = (TextView) findViewById(C2364R.C2367id.picker_bottombar_select);
        this.f3552g = textView2;
        textView2.setOnClickListener(this);
        this.f3547b = (FrameLayout) findViewById(C2364R.C2367id.picker_album_fragment);
        this.f3548c = (FrameLayout) findViewById(C2364R.C2367id.picker_photos_fragment);
        PickerAlbumFragment pickerAlbumFragment = new PickerAlbumFragment();
        this.f3549d = pickerAlbumFragment;
        mo34170a(C2364R.C2367id.picker_album_fragment, pickerAlbumFragment);
        this.f3558m = true;
        if (C2690a.m6219a().mo36462d()) {
            this.f3551f.setTextColor(Color.parseColor(C2690a.m6219a().mo36461c().mo35690b()));
        } else {
            try {
                UICustomization uICustomization = C2452d.m5373e().uiCustomization;
                if (uICustomization != null && uICustomization.buttonBackgroundColorList > 0) {
                    this.f3551f.setTextColor(getResources().getColorStateList(uICustomization.buttonBackgroundColorList));
                }
            } catch (Exception e) {
                C1709a.m3016c("PickerAlbumActivity", "ui customization error: " + e.toString());
            }
        }
        setTitle(C2364R.string.ysf_picker_image_folder);
    }

    @Override // com.qiyukf.nim.uikit.common.media.picker.fragment.PickerImageFragment.AbstractC1913a
    public native void onPhotoSelectClick(PhotoInfo photoInfo);

    @Override // com.qiyukf.nim.uikit.common.media.picker.fragment.PickerImageFragment.AbstractC1913a
    public void onPhotoSingleClick(List<PhotoInfo> list, int i) {
        if (this.f3554i) {
            PickerAlbumPreviewActivity.start(this, list, i, this.f3555j, this.f3556k, this.f3553h, this.f3557l);
        } else if (list != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(list.get(i));
            setResult(-1, C1915b.m3689a(arrayList, false));
            finish();
        }
    }
}
