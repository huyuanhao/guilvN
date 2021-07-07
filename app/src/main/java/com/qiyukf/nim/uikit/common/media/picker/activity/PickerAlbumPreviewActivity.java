package com.qiyukf.nim.uikit.common.media.picker.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.p118pd.sdk.C8932ooOOO0o;
import com.qiyukf.nim.uikit.common.activity.BlackFragmentActivity;
import com.qiyukf.nim.uikit.common.media.picker.model.PhotoInfo;
import com.qiyukf.nim.uikit.common.media.picker.p148a.C1902c;
import com.qiyukf.nim.uikit.common.media.picker.p149b.C1909b;
import com.qiyukf.nim.uikit.common.p150ui.imageview.BaseZoomableImageView;
import com.qiyukf.unicorn.C2364R;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import s.h.e.l.l.C;

public class PickerAlbumPreviewActivity extends BlackFragmentActivity implements ViewPager.OooO, View.OnClickListener {

    /* renamed from: b */
    public ViewPager f3560b;

    /* renamed from: c */
    public C1902c f3561c;

    /* renamed from: d */
    public List<PhotoInfo> f3562d = new ArrayList();

    /* renamed from: e */
    public List<PhotoInfo> f3563e = new ArrayList();

    /* renamed from: f */
    public int f3564f = 0;

    /* renamed from: g */
    public int f3565g = -1;

    /* renamed from: h */
    public int f3566h;

    /* renamed from: i */
    public boolean f3567i;

    /* renamed from: j */
    public boolean f3568j;

    /* renamed from: k */
    public TextView f3569k;

    /* renamed from: l */
    public TextView f3570l;

    /* renamed from: m */
    public CheckboxImageView f3571m;

    /* renamed from: n */
    public int f3572n;

    static {
        C.i(50331745);
    }

    /* renamed from: a */
    private void m3654a(boolean z) {
        String str;
        StringBuilder sb;
        String str2;
        if (this.f3562d != null) {
            if (z) {
                long j = 0;
                for (int i = 0; i < this.f3562d.size(); i++) {
                    j += this.f3562d.get(i).getSize();
                }
                TextView textView = this.f3569k;
                String string = getResources().getString(C2364R.string.ysf_picker_image_preview_original_select);
                Object[] objArr = new Object[1];
                if (j <= 0) {
                    str = "0B";
                } else if (j < 1024) {
                    str = j + "B";
                } else {
                    if (j >= 1024 && j < 1048576) {
                        double d = (double) j;
                        Double.isNaN(d);
                        BigDecimal scale = new BigDecimal(d / 1024.0d).setScale(0, 4);
                        sb = new StringBuilder();
                        sb.append((int) scale.doubleValue());
                        str2 = "K";
                    } else if (j < 1048576 || j >= 1073741824) {
                        double d2 = (double) j;
                        Double.isNaN(d2);
                        BigDecimal scale2 = new BigDecimal(d2 / 1.073741824E9d).setScale(2, 4);
                        sb = new StringBuilder();
                        sb.append(scale2.doubleValue());
                        str2 = "GB";
                    } else {
                        double d3 = (double) j;
                        Double.isNaN(d3);
                        BigDecimal scale3 = new BigDecimal(d3 / 1048576.0d).setScale(1, 4);
                        sb = new StringBuilder();
                        sb.append(scale3.doubleValue());
                        str2 = "M";
                    }
                    sb.append(str2);
                    str = sb.toString();
                }
                objArr[0] = str;
                textView.setText(String.format(string, objArr));
                return;
            }
            this.f3569k.setText(C2364R.string.ysf_picker_image_preview_original);
        }
    }

    /* renamed from: c */
    private void m3655c(int i) {
        List<PhotoInfo> list = this.f3563e;
        if (list != null && i < list.size()) {
            this.f3571m.mo34227a(this.f3563e.get(i).isChoose());
        }
    }

    /* renamed from: d */
    private void m3656d(int i) {
        String str;
        if (this.f3566h <= 0) {
            str = "";
        } else {
            str = (i + 1) + C8932ooOOO0o.OooO0OO + this.f3566h;
        }
        setTitle(str);
    }

    /* renamed from: f */
    private void m3657f() {
        int size = this.f3562d.size();
        if (size > 0) {
            this.f3570l.setEnabled(true);
            this.f3570l.setText(String.format(getResources().getString(C2364R.string.ysf_picker_image_send_select), Integer.valueOf(size)));
            return;
        }
        this.f3570l.setEnabled(true);
        this.f3570l.setText(C2364R.string.ysf_send);
    }

    public static void start(Activity activity, List<PhotoInfo> list, int i, boolean z, boolean z2, List<PhotoInfo> list2, int i2) {
        C1909b.m3664a(activity, new ArrayList(list));
        Intent intent = new Intent();
        intent.setClass(activity, PickerAlbumPreviewActivity.class);
        intent.putExtra("selected_photo_list", new ArrayList(list2));
        intent.putExtra("current_pos", i);
        intent.putExtra("support_original", z);
        intent.putExtra("is_original", z2);
        intent.putExtra("multi_select_size_limit", i2);
        activity.startActivityForResult(intent, 5);
    }

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity
    public native void onBackPressed();

    public native void onClick(View view);

    @Override // androidx.fragment.app.FragmentActivity
    public native void onConfigurationChanged(Configuration configuration);

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public native void onCreate(Bundle bundle);

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity
    public native void onDestroy();

    @Override // androidx.viewpager.widget.ViewPager.OooO
    public native void onPageScrollStateChanged(int i);

    @Override // androidx.viewpager.widget.ViewPager.OooO
    public native void onPageScrolled(int i, float f, int i2);

    @Override // androidx.viewpager.widget.ViewPager.OooO
    public native void onPageSelected(int i);

    public void updateCurrentItem(final int i) {
        List<PhotoInfo> list = this.f3563e;
        if (list == null) {
            return;
        }
        if (i <= 0 || i < list.size()) {
            int i2 = this.f3565g;
            if (i2 != i || i2 == 0) {
                this.f3565g = i;
                LinearLayout linearLayout = (LinearLayout) this.f3560b.findViewWithTag(Integer.valueOf(i));
                if (linearLayout == null) {
                    new Handler().postDelayed(new Runnable() {
                        /* class com.qiyukf.nim.uikit.common.media.picker.activity.PickerAlbumPreviewActivity.RunnableC19051 */

                        public final void run() {
                            PickerAlbumPreviewActivity.this.updateCurrentItem(i);
                        }
                    }, 300);
                } else {
                    ((BaseZoomableImageView) linearLayout.findViewById(C2364R.C2367id.imageView)).mo34276a(this.f3560b);
                }
            }
        }
    }
}
