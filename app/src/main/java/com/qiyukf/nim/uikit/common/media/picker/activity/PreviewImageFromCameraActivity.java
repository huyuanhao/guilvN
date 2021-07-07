package com.qiyukf.nim.uikit.common.media.picker.activity;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.qiyukf.basesdk.p138c.p139a.C1806a;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.common.activity.BlackFragmentActivity;
import com.qiyukf.nimlib.p198j.p200b.C2341a;
import com.qiyukf.unicorn.C2364R;
import java.io.File;
import java.util.ArrayList;
import s.h.e.l.l.C;

public class PreviewImageFromCameraActivity extends BlackFragmentActivity {

    /* renamed from: b */
    public ImageView f3575b;

    /* renamed from: c */
    public File f3576c;

    /* renamed from: d */
    public TextView f3577d;

    /* renamed from: e */
    public String f3578e;

    /* renamed from: f */
    public String f3579f;

    static {
        C.i(50331746);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: f */
    private void m3661f() {
        File file = this.f3576c;
        if (file != null) {
            file.delete();
        }
        C1806a.m3412b(this.f3578e);
    }

    public static native Bitmap getBitmap(Drawable drawable);

    public static Intent initPreviewImageIntent(ArrayList<String> arrayList, ArrayList<String> arrayList2, boolean z) {
        Intent intent = new Intent();
        intent.putStringArrayListExtra("scaled_image_list", arrayList);
        intent.putStringArrayListExtra("orig_image_list", arrayList2);
        intent.putExtra("is_original", z);
        return intent;
    }

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity
    public native void onBackPressed();

    @Override // androidx.fragment.app.FragmentActivity
    public native void onConfigurationChanged(Configuration configuration);

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C2364R.layout.ysf_preview_image_from_camera_activity);
        TextView a = mo34169a(C2364R.string.ysf_image_retake);
        a.setTextColor(getResources().getColorStateList(C2364R.C2365color.ysf_title_bar_text_color_light_selector));
        a.setOnClickListener(new View.OnClickListener() {
            /* class com.qiyukf.nim.uikit.common.media.picker.activity.PreviewImageFromCameraActivity.View$OnClickListenerC19072 */

            public final void onClick(View view) {
                PreviewImageFromCameraActivity.this.m3661f();
                Intent intent = new Intent();
                PreviewImageFromCameraActivity previewImageFromCameraActivity = PreviewImageFromCameraActivity.this;
                intent.setClass(previewImageFromCameraActivity, previewImageFromCameraActivity.getIntent().getClass());
                intent.putExtra("RESULT_RETAKE", true);
                PreviewImageFromCameraActivity.this.setResult(-1, intent);
                PreviewImageFromCameraActivity.this.finish();
            }
        });
        String string = getIntent().getExtras().getString("image_file_path");
        this.f3578e = getIntent().getExtras().getString("orig_image_file_path");
        this.f3579f = getIntent().getExtras().getString("preview_image_btn_text");
        this.f3576c = new File(string);
        this.f3577d = (TextView) findViewById(C2364R.C2367id.buttonSend);
        this.f3575b = (ImageView) findViewById(C2364R.C2367id.imageViewPreview);
        if (!TextUtils.isEmpty(this.f3579f)) {
            this.f3577d.setText(this.f3579f);
        }
        this.f3577d.setOnClickListener(new View.OnClickListener() {
            /* class com.qiyukf.nim.uikit.common.media.picker.activity.PreviewImageFromCameraActivity.View$OnClickListenerC19061 */

            public final void onClick(View view) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                arrayList.add(PreviewImageFromCameraActivity.this.f3576c.getPath());
                arrayList2.add(PreviewImageFromCameraActivity.this.f3578e);
                C1806a.m3412b(PreviewImageFromCameraActivity.this.f3578e);
                Intent initPreviewImageIntent = PreviewImageFromCameraActivity.initPreviewImageIntent(arrayList, arrayList2, false);
                PreviewImageFromCameraActivity previewImageFromCameraActivity = PreviewImageFromCameraActivity.this;
                initPreviewImageIntent.setClass(previewImageFromCameraActivity, previewImageFromCameraActivity.getIntent().getClass());
                initPreviewImageIntent.putExtra("RESULT_SEND", true);
                PreviewImageFromCameraActivity.this.setResult(-1, initPreviewImageIntent);
                PreviewImageFromCameraActivity.this.finish();
            }
        });
        try {
            Bitmap b = C2341a.m5090b(this.f3576c.getAbsolutePath());
            if (b != null) {
                this.f3575b.setImageBitmap(b);
            } else {
                C1865f.m3559b(C2364R.string.ysf_image_show_error);
            }
        } catch (OutOfMemoryError unused) {
            C1865f.m3559b(C2364R.string.ysf_image_out_of_memory);
        }
    }

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity
    public native void onDestroy();
}
