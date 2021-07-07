package com.yongchun.library.view;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p118pd.sdk.C9108oooO0;
import com.p118pd.sdk.C9122oooO0O;
import com.p118pd.sdk.C9124oooO0O00;
import com.p118pd.sdk.C9127oooO0O0O;
import com.p118pd.sdk.C9128oooO0O0o;
import com.p118pd.sdk.C9130oooO0OO0;
import com.yongchun.library.C4695R;
import com.yongchun.library.model.LocalMedia;
import com.yongchun.library.model.LocalMediaFolder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import s.h.e.l.l.C;

public class ImageSelectorActivity extends BaseNativeActivity {
    public static String o000000 = null;
    public static String o000000O = null;
    public static final int o000OOo = 2;

    /* renamed from: o000OOo  reason: collision with other field name */
    public static final String f23536o000OOo = "MinSelectNum";
    public static final int o0O0O00 = 1;

    /* renamed from: o0O0O00  reason: collision with other field name */
    public static final String f23537o0O0O00 = "MaxSelectNum";
    public static final int o0OO00O = 66;

    /* renamed from: o0OO00O  reason: collision with other field name */
    public static final String f23538o0OO00O = "ShowCamera";
    public static final String o0OOO0o = "outputList";
    public static final String o0Oo0oo = "SelectMode";
    public static final String o0ooOoO = "CameraPath";
    public static final int oo0o0Oo = 67;

    /* renamed from: oo0o0Oo  reason: collision with other field name */
    public static final String f23539oo0o0Oo = "EnablePreview";
    public Uri OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public LinearLayout f23540OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public TextView f23541OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Toolbar f23542OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public RecyclerView f23543OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9124oooO0O00 f23544OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C9130oooO0OO0 f23545OooO00o;
    public TextView OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public HashMap<String, String> f23546OooO0O0 = new HashMap<>();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f23547OooO0O0 = true;
    public TextView OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f23548OooO0OO = true;

    /* renamed from: o0OOO0o  reason: collision with other field name */
    public int f23549o0OOO0o = 1;

    /* renamed from: o0Oo0oo  reason: collision with other field name */
    public int f23550o0Oo0oo = 3;
    public int o0ooOOo = 10;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public String f23551o0ooOOo;

    /* renamed from: o0ooOoO  reason: collision with other field name */
    public int f23552o0ooOoO = 0;

    public class OooO00o implements C9128oooO0O0o.OooO0OO {
        public OooO00o() {
        }

        @Override // com.p118pd.sdk.C9128oooO0O0o.OooO0OO
        public void OooO00o(List<LocalMediaFolder> list) {
            ImageSelectorActivity.this.f23545OooO00o.OooO00o(list);
            ImageSelectorActivity.this.f23544OooO00o.OooO00o(list.get(0).getImages());
        }
    }

    public class OooO0O0 implements View.OnClickListener {
        public OooO0O0() {
        }

        public void onClick(View view) {
            ImageSelectorActivity.this.finish();
        }
    }

    public class OooO0OO implements View.OnClickListener {
        public OooO0OO() {
        }

        public void onClick(View view) {
            if (ImageSelectorActivity.this.f23545OooO00o.isShowing()) {
                ImageSelectorActivity.this.f23545OooO00o.dismiss();
            } else {
                ImageSelectorActivity.this.f23545OooO00o.showAsDropDown(ImageSelectorActivity.this.f23542OooO00o);
            }
        }
    }

    public class OooO0o implements C9108oooO0.OooO0O0 {
        public OooO0o() {
        }

        @Override // com.p118pd.sdk.C9108oooO0.OooO0O0
        public void OooO00o(String str, List<LocalMedia> list) {
            ImageSelectorActivity.this.f23545OooO00o.dismiss();
            ImageSelectorActivity.this.f23544OooO00o.OooO00o(list);
            ImageSelectorActivity.this.OooO0OO.setText(str);
        }
    }

    /* renamed from: com.yongchun.library.view.ImageSelectorActivity$OooO0o0  reason: case insensitive filesystem */
    public class View$OnClickListenerC9890OooO0o0 implements View.OnClickListener {
        public View$OnClickListenerC9890OooO0o0() {
        }

        public void onClick(View view) {
            ImageSelectorActivity imageSelectorActivity = ImageSelectorActivity.this;
            imageSelectorActivity.OooO00o(imageSelectorActivity.f23544OooO00o.OooO0O0());
        }
    }

    /* renamed from: com.yongchun.library.view.ImageSelectorActivity$OooO0oO  reason: case insensitive filesystem */
    public class View$OnClickListenerC9891OooO0oO implements View.OnClickListener {
        public View$OnClickListenerC9891OooO0oO() {
        }

        public void onClick(View view) {
            ImageSelectorActivity imageSelectorActivity = ImageSelectorActivity.this;
            imageSelectorActivity.OooO00o(imageSelectorActivity.f23544OooO00o.OooO0O0(), 0);
        }
    }

    /* renamed from: com.yongchun.library.view.ImageSelectorActivity$OooO0oo  reason: case insensitive filesystem */
    public class View$OnClickListenerC9892OooO0oo implements View.OnClickListener {
        public final /* synthetic */ Dialog OooO00o;

        public View$OnClickListenerC9892OooO0oo(Dialog dialog) {
            this.OooO00o = dialog;
        }

        public void onClick(View view) {
            this.OooO00o.dismiss();
        }
    }

    static {
        C.i(50331761);
    }

    public static native void OooO00o(Activity activity, int i, int i2, int i3, boolean z, boolean z2, boolean z3);

    public static native void OooO00o(Activity activity, int i, int i2, int i3, boolean z, boolean z2, boolean z3, int i4);

    public static native void OooO00o(Activity activity, int i, int i2, boolean z, boolean z2);

    private native void OooO0OO();

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private native void OooO0Oo();

    public native void OooO00o(String str);

    public native void OooO0O0();

    @Override // androidx.fragment.app.FragmentActivity
    public native void onActivityResult(int i, int i2, Intent intent);

    @Override // androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.yongchun.library.view.BaseNativeActivity
    public native void onCreate(Bundle bundle);

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.yongchun.library.view.BaseNativeActivity
    public native void onDestroy();

    public native void onSaveInstanceState(Bundle bundle, PersistableBundle persistableBundle);

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.yongchun.library.view.BaseNativeActivity
    public native void onStart();

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.yongchun.library.view.BaseNativeActivity
    public native void onStop();

    /* renamed from: com.yongchun.library.view.ImageSelectorActivity$OooO0Oo  reason: case insensitive filesystem */
    public class C9889OooO0Oo implements C9124oooO0O00.AbstractC9126OooO0o0 {
        public C9889OooO0Oo() {
        }

        @Override // com.p118pd.sdk.C9124oooO0O00.AbstractC9126OooO0o0
        public void OooO00o(List<LocalMedia> list) {
            boolean z = list.size() != 0;
            ImageSelectorActivity.this.f23541OooO00o.setEnabled(z);
            ImageSelectorActivity.this.OooO0O0.setEnabled(z);
            if (z) {
                ImageSelectorActivity.this.f23541OooO00o.setText(ImageSelectorActivity.this.getString(C4695R.string.done_num, new Object[]{Integer.valueOf(list.size()), Integer.valueOf(ImageSelectorActivity.this.o0ooOOo)}));
                ImageSelectorActivity.this.OooO0O0.setText(ImageSelectorActivity.this.getString(C4695R.string.preview_num, new Object[]{Integer.valueOf(list.size())}));
                return;
            }
            ImageSelectorActivity.this.f23541OooO00o.setText(C4695R.string.done);
            ImageSelectorActivity.this.OooO0O0.setText(C4695R.string.preview);
        }

        @Override // com.p118pd.sdk.C9124oooO0O00.AbstractC9126OooO0o0
        public void OooO00o() {
            ImageSelectorActivity.this.OooO0Oo();
        }

        @Override // com.p118pd.sdk.C9124oooO0O00.AbstractC9126OooO0o0
        public void OooO00o(LocalMedia localMedia, int i) {
            if (!ImageSelectorActivity.this.f23548OooO0OO) {
                ImageSelectorActivity.this.OooO00o(localMedia.getPath());
            } else if (ImageSelectorActivity.this.f23544OooO00o.m20877OooO00o().size() <= 1000) {
                ImageSelectorActivity imageSelectorActivity = ImageSelectorActivity.this;
                imageSelectorActivity.OooO00o(imageSelectorActivity.f23544OooO00o.m20877OooO00o(), i);
            }
        }
    }

    public void OooO00o() {
        this.f23545OooO00o = new C9130oooO0OO0(this);
        Toolbar toolbar = (Toolbar) findViewById(C4695R.C4698id.toolbar);
        this.f23542OooO00o = toolbar;
        toolbar.setTitle(C4695R.string.picture);
        setSupportActionBar(this.f23542OooO00o);
        this.f23542OooO00o.setNavigationIcon(C4695R.mipmap.ic_back);
        TextView textView = (TextView) findViewById(C4695R.C4698id.done_text);
        this.f23541OooO00o = textView;
        int i = 8;
        textView.setVisibility(this.f23549o0OOO0o == 1 ? 0 : 8);
        TextView textView2 = (TextView) findViewById(C4695R.C4698id.preview_text);
        this.OooO0O0 = textView2;
        if (this.f23548OooO0OO) {
            i = 0;
        }
        textView2.setVisibility(i);
        this.f23540OooO00o = (LinearLayout) findViewById(C4695R.C4698id.folder_layout);
        this.OooO0OO = (TextView) findViewById(C4695R.C4698id.folder_name);
        RecyclerView recyclerView = (RecyclerView) findViewById(C4695R.C4698id.folder_list);
        this.f23543OooO00o = recyclerView;
        recyclerView.setHasFixedSize(true);
        this.f23543OooO00o.OooO00o(new C9127oooO0O0O(this.f23550o0Oo0oo, C9122oooO0O.OooO00o(this, 2.0f), false));
        this.f23543OooO00o.setLayoutManager(new GridLayoutManager(this, this.f23550o0Oo0oo));
        C9124oooO0O00 oooo0o00 = new C9124oooO0O00(this, this.o0ooOOo, this.f23549o0OOO0o, this.f23547OooO0O0, this.f23548OooO0OO);
        this.f23544OooO00o = oooo0o00;
        this.f23543OooO00o.setAdapter(oooo0o00);
    }

    public void OooO00o(List<LocalMedia> list, int i) {
        ImagePreviewActivity.OooO00o(this, list, this.f23544OooO00o.OooO0O0(), this.o0ooOOo, i);
    }

    public void OooO00o(List<LocalMedia> list) {
        if (list.size() < this.f23552o0ooOoO) {
            OooO0OO();
            return;
        }
        ArrayList<String> arrayList = new ArrayList<>();
        for (LocalMedia localMedia : list) {
            arrayList.add(localMedia.getPath());
        }
        OooO00o(arrayList);
    }

    public void OooO00o(ArrayList<String> arrayList) {
        setResult(-1, new Intent().putStringArrayListExtra("outputList", arrayList));
        finish();
    }
}
