package com.qiyukf.unicorn.p244ui.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.annotation.NonNull;
import androidx.viewpager.widget.ViewPager;
import com.p118pd.sdk.AbstractC7314o0O0Oo0O;
import com.qiyukf.basesdk.p138c.p139a.C1806a;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity;
import com.qiyukf.nim.uikit.common.p150ui.imageview.AbstractC1923a;
import com.qiyukf.nim.uikit.common.p150ui.imageview.MultiTouchZoomableImageView;
import com.qiyukf.nimlib.p198j.p201c.C2346b;
import com.qiyukf.nimlib.p198j.p201c.C2349d;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.ImageLoaderListener;
import com.qiyukf.unicorn.p232k.C2700f;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import s.h.e.l.l.C;

/* renamed from: com.qiyukf.unicorn.ui.activity.UrlImagePreviewActivity */
public class UrlImagePreviewActivity extends BaseFragmentActivity {

    /* renamed from: b */
    public ViewPager f5912b;

    /* renamed from: c */
    public List<String> f5913c;

    /* renamed from: d */
    public Bitmap f5914d;

    /* renamed from: e */
    public Bitmap f5915e;

    /* renamed from: com.qiyukf.unicorn.ui.activity.UrlImagePreviewActivity$a */
    public class C2813a extends AbstractC7314o0O0Oo0O {
        public C2813a() {
        }

        public /* synthetic */ C2813a(UrlImagePreviewActivity urlImagePreviewActivity, byte b) {
            this();
        }

        @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
        public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            ViewGroup viewGroup2 = (ViewGroup) obj;
            viewGroup2.removeAllViews();
            viewGroup.removeView(viewGroup2);
        }

        @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
        public final int getCount() {
            return UrlImagePreviewActivity.this.f5913c.size();
        }

        @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
        public final Object instantiateItem(ViewGroup viewGroup, int i) {
            View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(C2364R.layout.ysf_url_image_preview_item, (ViewGroup) null);
            final MultiTouchZoomableImageView multiTouchZoomableImageView = (MultiTouchZoomableImageView) inflate.findViewById(C2364R.C2367id.ysf_image_preview_image);
            multiTouchZoomableImageView.mo34276a(UrlImagePreviewActivity.this.f5912b);
            multiTouchZoomableImageView.mo34277a(new AbstractC1923a() {
                /* class com.qiyukf.unicorn.p244ui.activity.UrlImagePreviewActivity.C2813a.C28141 */

                @Override // com.qiyukf.nim.uikit.common.p150ui.imageview.AbstractC1923a
                /* renamed from: a */
                public final void mo34327a() {
                    UrlImagePreviewActivity.this.finish();
                }

                @Override // com.qiyukf.nim.uikit.common.p150ui.imageview.AbstractC1923a
                /* renamed from: b */
                public final void mo34328b() {
                    UrlImagePreviewActivity.m6505a(UrlImagePreviewActivity.this, multiTouchZoomableImageView);
                }

                @Override // com.qiyukf.nim.uikit.common.p150ui.imageview.AbstractC1923a
                /* renamed from: c */
                public final void mo34329c() {
                    UrlImagePreviewActivity.this.finish();
                }
            });
            UrlImagePreviewActivity urlImagePreviewActivity = UrlImagePreviewActivity.this;
            UrlImagePreviewActivity.m6506a(urlImagePreviewActivity, multiTouchZoomableImageView, (ProgressBar) inflate.findViewById(C2364R.C2367id.ysf_image_preview_progress), (String) urlImagePreviewActivity.f5913c.get(i));
            viewGroup.addView(inflate);
            return inflate;
        }

        @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
        public final boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }
    }

    static {
        C.i(50331758);
    }

    /* renamed from: a */
    public static /* synthetic */ void m6504a(UrlImagePreviewActivity urlImagePreviewActivity, Bitmap bitmap) {
        if (bitmap != null && !bitmap.isRecycled()) {
            File a = C1806a.m3409a(C2349d.m5129b(urlImagePreviewActivity) + ("img_" + System.currentTimeMillis() + ".jpg"));
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(a);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 90, fileOutputStream);
                fileOutputStream.flush();
                fileOutputStream.close();
                if (Build.VERSION.SDK_INT < 29) {
                    Intent intent = new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE");
                    intent.setData(Uri.fromFile(a));
                    urlImagePreviewActivity.sendBroadcast(intent);
                    C1865f.m3559b(C2364R.string.ysf_picture_save_to);
                    return;
                } else if (C2346b.m5117a(urlImagePreviewActivity, a)) {
                    C1865f.m3559b(C2364R.string.ysf_picture_save_to);
                    return;
                } else {
                    C1865f.m3555a(C2364R.string.ysf_picture_save_fail);
                    return;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        C1865f.m3555a(C2364R.string.ysf_picture_save_fail);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r4 = r4.mo34271a();
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void m6505a(com.qiyukf.unicorn.p244ui.activity.UrlImagePreviewActivity r3, com.qiyukf.nim.uikit.common.p150ui.imageview.MultiTouchZoomableImageView r4) {
        /*
            if (r4 == 0) goto L_0x0030
            android.graphics.Bitmap r4 = r4.mo34271a()
            if (r4 == 0) goto L_0x0030
            boolean r0 = r4.isRecycled()
            if (r0 != 0) goto L_0x0030
            android.graphics.Bitmap r0 = r3.m6510f()
            if (r4 == r0) goto L_0x0030
            android.graphics.Bitmap r0 = r3.m6511g()
            if (r4 != r0) goto L_0x001b
            goto L_0x0030
        L_0x001b:
            int r0 = com.qiyukf.unicorn.C2364R.string.ysf_save_to_device
            java.lang.String r0 = r3.getString(r0)
            r1 = 1
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 0
            com.qiyukf.unicorn.ui.activity.UrlImagePreviewActivity$2 r2 = new com.qiyukf.unicorn.ui.activity.UrlImagePreviewActivity$2
            r2.<init>(r4)
            com.qiyukf.unicorn.widget.p251a.C3021g.m7057a(r3, r0, r1, r2)
        L_0x0030:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qiyukf.unicorn.p244ui.activity.UrlImagePreviewActivity.m6505a(com.qiyukf.unicorn.ui.activity.UrlImagePreviewActivity, com.qiyukf.nim.uikit.common.ui.imageview.MultiTouchZoomableImageView):void");
    }

    /* renamed from: a */
    public static /* synthetic */ void m6506a(UrlImagePreviewActivity urlImagePreviewActivity, final MultiTouchZoomableImageView multiTouchZoomableImageView, final ProgressBar progressBar, String str) {
        progressBar.setVisibility(0);
        Bitmap a = C2700f.m6247b(str) ? C1870a.m3563a(C2700f.m6248c(str), 0, 0) : null;
        if (a == null || a.isRecycled()) {
            a = urlImagePreviewActivity.m6510f();
        }
        multiTouchZoomableImageView.mo34274a(a);
        C1870a.m3569a(str, new ImageLoaderListener() {
            /* class com.qiyukf.unicorn.p244ui.activity.UrlImagePreviewActivity.C28101 */

            @Override // com.qiyukf.unicorn.api.ImageLoaderListener
            public final void onLoadComplete(@NonNull Bitmap bitmap) {
                if (multiTouchZoomableImageView.getParent() != null) {
                    progressBar.setVisibility(8);
                    multiTouchZoomableImageView.mo34274a(bitmap);
                }
            }

            @Override // com.qiyukf.unicorn.api.ImageLoaderListener
            public final void onLoadFailed(Throwable th) {
                if (multiTouchZoomableImageView.getParent() != null) {
                    progressBar.setVisibility(8);
                    if (multiTouchZoomableImageView.mo34271a() == UrlImagePreviewActivity.this.m6510f()) {
                        multiTouchZoomableImageView.mo34274a(UrlImagePreviewActivity.this.m6511g());
                    }
                }
            }
        });
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: f */
    private Bitmap m6510f() {
        if (this.f5914d == null) {
            this.f5914d = BitmapFactory.decodeResource(getResources(), C2364R.C2366drawable.ysf_image_placeholder_loading);
        }
        return this.f5914d;
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    /* renamed from: g */
    private Bitmap m6511g() {
        if (this.f5915e == null) {
            this.f5915e = BitmapFactory.decodeResource(getResources(), C2364R.C2366drawable.ysf_image_placeholder_fail);
        }
        return this.f5915e;
    }

    public static void start(Context context, ArrayList<String> arrayList, int i) {
        Intent intent = new Intent(context, UrlImagePreviewActivity.class);
        intent.putExtra("url_list", arrayList);
        intent.putExtra("position", i);
        context.startActivity(intent);
    }

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity
    /* renamed from: a */
    public final boolean mo34171a() {
        return false;
    }

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.core.app.ComponentActivity, androidx.fragment.app.FragmentActivity
    public native void onCreate(Bundle bundle);

    @Override // com.qiyukf.nim.uikit.common.activity.BaseFragmentActivity, androidx.fragment.app.FragmentActivity
    public native void onDestroy();
}
