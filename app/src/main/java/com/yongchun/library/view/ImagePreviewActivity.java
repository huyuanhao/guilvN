package com.yongchun.library.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.p118pd.sdk.AbstractC7175o00o0o0o;
import com.p118pd.sdk.AbstractC7176o00o0oO;
import com.p118pd.sdk.C8932ooOOO0o;
import com.p118pd.sdk.C9129oooO0OO;
import com.yongchun.library.C4695R;
import com.yongchun.library.model.LocalMedia;
import com.yongchun.library.widget.PreviewViewPager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s.h.e.l.l.C;

public class ImagePreviewActivity extends BaseNativeActivity {
    public static final String o0O0O00 = "isDone";
    public static final String o0OO00O = "isShowDelete";
    public static final int o0OOO0o = 68;

    /* renamed from: o0OOO0o  reason: collision with other field name */
    public static final String f23526o0OOO0o = "maxSelectNum";
    public static final String o0Oo0oo = "position";
    public static final String o0ooOOo = "previewList";
    public static final String o0ooOoO = "previewSelectList";
    public static final String oo0o0Oo = "outputList";
    public CheckBox OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LinearLayout f23527OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public RelativeLayout f23528OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public TextView f23529OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Toolbar f23530OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public PreviewViewPager f23531OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public List<LocalMedia> f23532OooO00o = new ArrayList();
    public List<LocalMedia> OooO0O0 = new ArrayList();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f23533OooO0O0 = true;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public int f23534o0ooOOo;

    /* renamed from: o0ooOoO  reason: collision with other field name */
    public int f23535o0ooOoO;

    public class OooO00o implements ViewPager.OooO {
        public OooO00o() {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooO
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooO
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.OooO
        public void onPageSelected(int i) {
            Toolbar toolbar = ImagePreviewActivity.this.f23530OooO00o;
            toolbar.setTitle((i + 1) + C8932ooOOO0o.OooO0OO + ImagePreviewActivity.this.f23532OooO00o.size());
            ImagePreviewActivity.this.OooO00o(i);
        }
    }

    public class OooO0O0 implements View.OnClickListener {
        public OooO0O0() {
        }

        public void onClick(View view) {
            ImagePreviewActivity.this.OooO00o(false);
        }
    }

    public class OooO0OO implements View.OnClickListener {
        public OooO0OO() {
        }

        public void onClick(View view) {
            boolean isChecked = ImagePreviewActivity.this.OooO00o.isChecked();
            if (ImagePreviewActivity.this.OooO0O0.size() < ImagePreviewActivity.this.f23535o0ooOoO || !isChecked) {
                LocalMedia localMedia = (LocalMedia) ImagePreviewActivity.this.f23532OooO00o.get(ImagePreviewActivity.this.f23531OooO00o.getCurrentItem());
                if (!isChecked) {
                    Iterator it = ImagePreviewActivity.this.OooO0O0.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        LocalMedia localMedia2 = (LocalMedia) it.next();
                        if (localMedia2.getPath().equals(localMedia.getPath())) {
                            ImagePreviewActivity.this.OooO0O0.remove(localMedia2);
                            break;
                        }
                    }
                } else {
                    ImagePreviewActivity.this.OooO0O0.add(localMedia);
                }
                ImagePreviewActivity.this.OooO0O0();
                return;
            }
            ImagePreviewActivity imagePreviewActivity = ImagePreviewActivity.this;
            Toast.makeText(imagePreviewActivity, imagePreviewActivity.getString(C4695R.string.message_max_num, new Object[]{Integer.valueOf(imagePreviewActivity.f23535o0ooOoO)}), 1).show();
            ImagePreviewActivity.this.OooO00o.setChecked(false);
        }
    }

    /* renamed from: com.yongchun.library.view.ImagePreviewActivity$OooO0Oo  reason: case insensitive filesystem */
    public class View$OnClickListenerC9887OooO0Oo implements View.OnClickListener {
        public View$OnClickListenerC9887OooO0Oo() {
        }

        public void onClick(View view) {
            ImagePreviewActivity.this.OooO00o(true);
        }
    }

    /* renamed from: com.yongchun.library.view.ImagePreviewActivity$OooO0o0  reason: case insensitive filesystem */
    public class C9888OooO0o0 extends AbstractC7176o00o0oO {
        public C9888OooO0o0(AbstractC7175o00o0o0o o00o0o0o) {
            super(o00o0o0o);
        }

        @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
        public int getCount() {
            return ImagePreviewActivity.this.f23532OooO00o.size();
        }

        @Override // com.p118pd.sdk.AbstractC7176o00o0oO
        public Fragment getItem(int i) {
            return C9129oooO0OO.OooO00o(((LocalMedia) ImagePreviewActivity.this.f23532OooO00o.get(i)).getPath());
        }
    }

    static {
        C.i(50331760);
    }

    private native void OooO0o();

    private native void OooO0o0();

    public native void OooO00o();

    public native void OooO00o(int i);

    public native void OooO00o(boolean z);

    public native boolean OooO00o(LocalMedia localMedia);

    public native void OooO0O0();

    public native void OooO0OO();

    public native void OooO0Oo();

    @Override // androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity
    public native boolean dispatchKeyEvent(KeyEvent keyEvent);

    @Override // androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.yongchun.library.view.BaseNativeActivity
    public native void onCreate(Bundle bundle);

    public static void OooO00o(Activity activity, List<LocalMedia> list, List<LocalMedia> list2, int i, int i2) {
        Intent intent = new Intent(activity, ImagePreviewActivity.class);
        intent.putExtra(o0ooOOo, (ArrayList) list);
        intent.putExtra(o0ooOoO, (ArrayList) list2);
        intent.putExtra("position", i2);
        intent.putExtra(f23526o0OOO0o, i);
        activity.startActivityForResult(intent, 68);
    }
}
