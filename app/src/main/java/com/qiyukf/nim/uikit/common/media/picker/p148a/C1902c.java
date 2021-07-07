package com.qiyukf.nim.uikit.common.media.picker.p148a;

import android.graphics.Bitmap;
import android.os.Build;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p118pd.sdk.AbstractC7314o0O0Oo0O;
import com.qiyukf.basesdk.p138c.C1805a;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.common.media.picker.model.PhotoInfo;
import com.qiyukf.nim.uikit.common.p150ui.imageview.BaseZoomableImageView;
import com.qiyukf.nim.uikit.common.p150ui.imageview.MultiTouchZoomableImageView;
import com.qiyukf.nimlib.p198j.p200b.C2341a;
import com.qiyukf.nimlib.p198j.p200b.C2342b;
import com.qiyukf.unicorn.C2364R;
import java.util.List;

/* renamed from: com.qiyukf.nim.uikit.common.media.picker.a.c */
public final class C1902c extends AbstractC7314o0O0Oo0O {

    /* renamed from: a */
    public List<PhotoInfo> f3534a;

    /* renamed from: b */
    public LayoutInflater f3535b;

    /* renamed from: c */
    public Handler f3536c = C1805a.m3403a().mo34073c();

    /* renamed from: d */
    public Handler f3537d = new Handler();

    /* renamed from: e */
    public int f3538e;

    public C1902c(int i, List<PhotoInfo> list, LayoutInflater layoutInflater) {
        this.f3538e = i;
        this.f3534a = list;
        this.f3535b = layoutInflater;
    }

    /* renamed from: a */
    public final void mo34224a(final MultiTouchZoomableImageView multiTouchZoomableImageView, int i, boolean z) {
        final Bitmap bitmap;
        PhotoInfo photoInfo = this.f3534a.get(i);
        if (photoInfo != null && photoInfo.getAbsolutePath() != null) {
            Bitmap b = (Build.VERSION.SDK_INT < 29 || photoInfo.getUri() == null) ? C2341a.m5090b(photoInfo.getAbsolutePath()) : C2341a.m5084a(photoInfo.getUri());
            if (b == null) {
                bitmap = C2342b.m5093a();
                C1865f.m3559b(C2364R.string.ysf_picker_image_error);
            } else {
                bitmap = C2342b.m5096a(photoInfo.getAbsolutePath(), b);
            }
            if (z) {
                multiTouchZoomableImageView.mo34274a(bitmap);
            } else {
                this.f3537d.post(new Runnable() {
                    /* class com.qiyukf.nim.uikit.common.media.picker.p148a.C1902c.RunnableC19042 */

                    public final void run() {
                        multiTouchZoomableImageView.mo34274a(bitmap);
                    }
                });
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public final void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        View view = (View) obj;
        ((BaseZoomableImageView) view.findViewById(C2364R.C2367id.imageView)).mo34279b();
        viewGroup.removeView(view);
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public final int getCount() {
        List<PhotoInfo> list = this.f3534a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public final int getItemPosition(Object obj) {
        return -2;
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public final Object instantiateItem(ViewGroup viewGroup, final int i) {
        View inflate = this.f3535b.inflate(C2364R.layout.ysf_preview_image_layout_multi_touch, (ViewGroup) null);
        final MultiTouchZoomableImageView multiTouchZoomableImageView = (MultiTouchZoomableImageView) inflate.findViewById(C2364R.C2367id.imageView);
        if (i == this.f3538e) {
            mo34224a(multiTouchZoomableImageView, i, true);
        } else {
            this.f3536c.post(new Runnable() {
                /* class com.qiyukf.nim.uikit.common.media.picker.p148a.C1902c.RunnableC19031 */

                public final void run() {
                    C1902c.this.mo34224a(multiTouchZoomableImageView, i, false);
                }
            });
        }
        viewGroup.addView(inflate);
        inflate.setTag(Integer.valueOf(i));
        return inflate;
    }

    @Override // com.p118pd.sdk.AbstractC7314o0O0Oo0O
    public final boolean isViewFromObject(View view, Object obj) {
        return view == obj;
    }
}
