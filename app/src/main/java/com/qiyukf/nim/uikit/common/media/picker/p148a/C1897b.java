package com.qiyukf.nim.uikit.common.media.picker.p148a;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.basesdk.p138c.p143d.C1865f;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.nim.uikit.common.media.picker.activity.CheckboxImageView;
import com.qiyukf.nim.uikit.common.media.picker.fragment.PickerImageFragment;
import com.qiyukf.nim.uikit.common.media.picker.model.PhotoInfo;
import com.qiyukf.nim.uikit.common.media.picker.p149b.C1908a;
import com.qiyukf.nim.uikit.common.media.picker.p149b.C1910c;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.ImageLoaderListener;
import java.util.List;

/* renamed from: com.qiyukf.nim.uikit.common.media.picker.a.b */
public final class C1897b extends BaseAdapter {

    /* renamed from: a */
    public Context f3511a;

    /* renamed from: b */
    public LayoutInflater f3512b;

    /* renamed from: c */
    public List<PhotoInfo> f3513c;

    /* renamed from: d */
    public GridView f3514d;

    /* renamed from: e */
    public int f3515e = 0;

    /* renamed from: f */
    public int f3516f = (C1862c.m3539a() / 4);

    /* renamed from: g */
    public boolean f3517g;

    /* renamed from: h */
    public int f3518h;

    /* renamed from: i */
    public int f3519i = 1;

    /* renamed from: j */
    public PickerImageFragment.AbstractC1913a f3520j;

    /* renamed from: com.qiyukf.nim.uikit.common.media.picker.a.b$a */
    public class C1901a {

        /* renamed from: a */
        public ImageView f3530a;

        /* renamed from: b */
        public CheckboxImageView f3531b;

        /* renamed from: c */
        public RelativeLayout f3532c;

        public C1901a() {
        }

        public /* synthetic */ C1901a(C1897b bVar, byte b) {
            this();
        }
    }

    public C1897b(Context context, List<PhotoInfo> list, GridView gridView, boolean z, int i, int i2, int i3) {
        this.f3511a = context;
        this.f3512b = LayoutInflater.from(context);
        this.f3513c = list;
        this.f3514d = gridView;
        this.f3517g = z;
        this.f3515e = i;
        this.f3518h = i2;
        this.f3519i = i3;
        if (this.f3520j == null) {
            this.f3520j = (PickerImageFragment.AbstractC1913a) context;
        }
        this.f3516f = i3 == 2 ? C1862c.m3539a() / 6 : C1862c.m3539a() / 4;
    }

    /* renamed from: a */
    public static /* synthetic */ void m3640a(C1897b bVar, int i) {
        ((C1901a) bVar.f3514d.getChildAt(i - bVar.f3514d.getFirstVisiblePosition()).getTag()).f3531b.mo34227a(bVar.f3513c.get(i).isChoose());
    }

    /* renamed from: b */
    public static /* synthetic */ int m3641b(C1897b bVar) {
        int i = bVar.f3515e;
        bVar.f3515e = i - 1;
        return i;
    }

    /* renamed from: e */
    public static /* synthetic */ int m3644e(C1897b bVar) {
        int i = bVar.f3515e;
        bVar.f3515e = i + 1;
        return i;
    }

    /* renamed from: a */
    public final void mo34217a(int i) {
        this.f3515e = i;
    }

    /* renamed from: a */
    public final void mo34218a(Configuration configuration) {
        int i = configuration.orientation;
        this.f3519i = i;
        if (this.f3514d == null) {
            return;
        }
        if (i == 2) {
            this.f3516f = C1862c.m3539a() / 6;
        } else {
            this.f3516f = C1862c.m3539a() / 4;
        }
    }

    public final int getCount() {
        return this.f3513c.size();
    }

    public final Object getItem(int i) {
        return this.f3513c.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(final int i, View view, ViewGroup viewGroup) {
        final C1901a aVar;
        View view2;
        if (view == null) {
            aVar = new C1901a(this, (byte) 0);
            view2 = this.f3512b.inflate(C2364R.layout.ysf_picker_photo_grid_item, (ViewGroup) null);
            aVar.f3530a = (ImageView) view2.findViewById(C2364R.C2367id.picker_photo_grid_item_img);
            aVar.f3531b = (CheckboxImageView) view2.findViewById(C2364R.C2367id.picker_photo_grid_item_select);
            aVar.f3532c = (RelativeLayout) view2.findViewById(C2364R.C2367id.picker_photo_grid_item_select_hotpot);
            view2.setTag(aVar);
        } else {
            view2 = view;
            aVar = (C1901a) view.getTag();
        }
        if (this.f3517g) {
            aVar.f3532c.setVisibility(0);
        } else {
            aVar.f3532c.setVisibility(8);
        }
        ViewGroup.LayoutParams layoutParams = aVar.f3532c.getLayoutParams();
        int i2 = this.f3516f;
        layoutParams.width = i2 / 2;
        layoutParams.height = i2 / 2;
        aVar.f3532c.setLayoutParams(layoutParams);
        aVar.f3532c.setOnClickListener(new View.OnClickListener() {
            /* class com.qiyukf.nim.uikit.common.media.picker.p148a.C1897b.View$OnClickListenerC18981 */

            public final void onClick(View view) {
                PhotoInfo photoInfo = (PhotoInfo) C1897b.this.f3513c.get(i);
                if (photoInfo.isChoose()) {
                    photoInfo.setChoose(false);
                    C1897b.m3641b(C1897b.this);
                } else if (C1897b.this.f3515e < C1897b.this.f3518h) {
                    photoInfo.setChoose(true);
                    C1897b.m3644e(C1897b.this);
                } else {
                    C1865f.m3560b(String.format(C1897b.this.f3511a.getResources().getString(C2364R.string.ysf_picker_image_exceed_max_image_select), Integer.valueOf(C1897b.this.f3518h)));
                    return;
                }
                C1897b.m3640a(C1897b.this, i);
                C1897b.this.f3520j.onPhotoSelectClick(photoInfo);
            }
        });
        aVar.f3531b.mo34227a(this.f3513c.get(i).isChoose());
        ViewGroup.LayoutParams layoutParams2 = aVar.f3530a.getLayoutParams();
        int i3 = this.f3516f;
        layoutParams2.width = i3;
        layoutParams2.height = i3;
        aVar.f3530a.setLayoutParams(layoutParams2);
        final PhotoInfo photoInfo = this.f3513c.get(i);
        if (photoInfo != null) {
            if (Build.VERSION.SDK_INT < 29 || photoInfo.getUriStr() == null) {
                final String a = C1910c.m3665a(photoInfo.getImageId(), photoInfo.getFilePath());
                aVar.f3530a.setTag(a);
                aVar.f3530a.setImageResource(C2364R.C2366drawable.ysf_image_placeholder_loading);
                int i4 = this.f3516f;
                C1870a.m3566a(a, i4, i4, new ImageLoaderListener() {
                    /* class com.qiyukf.nim.uikit.common.media.picker.p148a.C1897b.C19003 */

                    @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                    public final void onLoadComplete(@NonNull Bitmap bitmap) {
                        if (a.equals(aVar.f3530a.getTag())) {
                            aVar.f3530a.setImageBitmap(C1908a.m3662a(bitmap, photoInfo.getAbsolutePath()));
                        }
                    }

                    @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                    public final void onLoadFailed(Throwable th) {
                        if (th != null) {
                            C1709a.m3011a("ImageEngineImpl loadImage is error", th.getMessage());
                        }
                    }
                });
            } else {
                aVar.f3530a.setTag(photoInfo.getUriStr());
                aVar.f3530a.setImageResource(C2364R.C2366drawable.ysf_image_placeholder_loading);
                C1870a.m3566a(photoInfo.getUriStr(), C1862c.m3540a(75.0f), C1862c.m3540a(75.0f), new ImageLoaderListener() {
                    /* class com.qiyukf.nim.uikit.common.media.picker.p148a.C1897b.C18992 */

                    @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                    public final void onLoadComplete(@NonNull Bitmap bitmap) {
                        if (photoInfo.getUriStr().equals(aVar.f3530a.getTag())) {
                            aVar.f3530a.setImageBitmap(C1908a.m3662a(bitmap, photoInfo.getAbsolutePath()));
                        }
                    }

                    @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                    public final void onLoadFailed(Throwable th) {
                        if (th != null) {
                            C1709a.m3011a("ImageEngineImpl loadImage is error", th.getMessage());
                        }
                    }
                });
            }
        }
        return view2;
    }
}
