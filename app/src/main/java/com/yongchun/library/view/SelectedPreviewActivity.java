package com.yongchun.library.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.p118pd.sdk.AbstractC7175o00o0o0o;
import com.p118pd.sdk.AbstractC7176o00o0oO;
import com.p118pd.sdk.C8932ooOOO0o;
import com.p118pd.sdk.C9129oooO0OO;
import java.util.ArrayList;
import s.h.e.l.l.C;

public class SelectedPreviewActivity extends ImagePreviewActivity {
    public ArrayList<String> OooO00o = new ArrayList<>();
    public boolean OooO0OO;
    public int o0Oo0oo;

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
            Toolbar toolbar = ((ImagePreviewActivity) SelectedPreviewActivity.this).f23530OooO00o;
            toolbar.setTitle((i + 1) + C8932ooOOO0o.OooO0OO + SelectedPreviewActivity.this.OooO00o.size());
            SelectedPreviewActivity.this.o0Oo0oo = i;
        }
    }

    public class OooO0O0 implements View.OnClickListener {
        public OooO0O0() {
        }

        public void onClick(View view) {
            SelectedPreviewActivity.this.OooO00o(false);
        }
    }

    public class OooO0OO implements View.OnClickListener {
        public OooO0OO() {
        }

        public void onClick(View view) {
            SelectedPreviewActivity.this.OooO00o(true);
        }
    }

    /* renamed from: com.yongchun.library.view.SelectedPreviewActivity$OooO0Oo  reason: case insensitive filesystem */
    public class C9893OooO0Oo extends AbstractC7176o00o0oO {
        public C9893OooO0Oo(AbstractC7175o00o0o0o o00o0o0o) {
            super(o00o0o0o);
        }

        @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
        public int getCount() {
            return SelectedPreviewActivity.this.OooO00o.size();
        }

        @Override // com.p118pd.sdk.AbstractC7176o00o0oO
        public Fragment getItem(int i) {
            return C9129oooO0OO.OooO00o((String) SelectedPreviewActivity.this.OooO00o.get(i));
        }
    }

    static {
        C.i(50331762);
    }

    private native void OooO0oO();

    private native void OooO0oo();

    @Override // com.yongchun.library.view.ImagePreviewActivity
    public native void OooO00o();

    @Override // com.yongchun.library.view.ImagePreviewActivity
    public native void OooO00o(boolean z);

    @Override // com.yongchun.library.view.ImagePreviewActivity
    public native void OooO0OO();

    @Override // com.yongchun.library.view.ImagePreviewActivity
    public native void OooO0Oo();

    @Override // androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.yongchun.library.view.BaseNativeActivity, com.yongchun.library.view.ImagePreviewActivity
    public native void onCreate(Bundle bundle);

    public static void OooO00o(Activity activity, ArrayList<String> arrayList, int i) {
        Intent intent = new Intent(activity, SelectedPreviewActivity.class);
        intent.putExtra(ImagePreviewActivity.o0ooOOo, arrayList);
        intent.putExtra("position", i);
        activity.startActivityForResult(intent, 68);
    }

    public static void OooO00o(Activity activity, ArrayList<String> arrayList, int i, boolean z) {
        Intent intent = new Intent(activity, SelectedPreviewActivity.class);
        intent.putExtra(ImagePreviewActivity.o0ooOOo, arrayList);
        intent.putExtra("position", i);
        intent.putExtra(ImagePreviewActivity.o0OO00O, z);
        activity.startActivityForResult(intent, 68);
    }
}
