package com.qiyukf.nim.uikit.common.media.picker.p148a;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.p143d.C1862c;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.nim.uikit.common.media.picker.model.C1914a;
import com.qiyukf.nim.uikit.common.media.picker.p149b.C1908a;
import com.qiyukf.nim.uikit.common.media.picker.p149b.C1910c;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.ImageLoaderListener;
import java.util.List;

/* renamed from: com.qiyukf.nim.uikit.common.media.picker.a.a */
public final class C1893a extends BaseAdapter {

    /* renamed from: a */
    public LayoutInflater f3497a;

    /* renamed from: b */
    public List<C1914a> f3498b;

    /* renamed from: c */
    public Context f3499c;

    /* renamed from: com.qiyukf.nim.uikit.common.media.picker.a.a$a */
    public class C1896a {

        /* renamed from: a */
        public ImageView f3507a;

        /* renamed from: b */
        public TextView f3508b;

        /* renamed from: c */
        public TextView f3509c;

        public C1896a() {
        }

        public /* synthetic */ C1896a(C1893a aVar, byte b) {
            this();
        }
    }

    public C1893a(Context context, List<C1914a> list) {
        this.f3499c = context;
        this.f3497a = LayoutInflater.from(context);
        this.f3498b = list;
    }

    public final int getCount() {
        return this.f3498b.size();
    }

    public final Object getItem(int i) {
        return this.f3498b.get(i);
    }

    public final long getItemId(int i) {
        return (long) i;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        final C1896a aVar;
        View view2;
        ImageLoaderListener imageLoaderListener;
        int i2;
        int i3;
        final String str;
        if (view == null) {
            aVar = new C1896a(this, (byte) 0);
            view2 = this.f3497a.inflate(C2364R.layout.ysf_picker_photofolder_item, (ViewGroup) null);
            aVar.f3507a = (ImageView) view2.findViewById(C2364R.C2367id.picker_photofolder_cover);
            aVar.f3508b = (TextView) view2.findViewById(C2364R.C2367id.picker_photofolder_info);
            aVar.f3509c = (TextView) view2.findViewById(C2364R.C2367id.picker_photofolder_num);
            view2.setTag(aVar);
        } else {
            view2 = view;
            aVar = (C1896a) view.getTag();
        }
        final C1914a aVar2 = this.f3498b.get(i);
        if (Build.VERSION.SDK_INT < 29 || aVar2.mo34270g() == null) {
            str = C1910c.m3665a(aVar2.mo34258a(), aVar2.mo34264c());
            aVar.f3507a.setTag(str);
            aVar.f3507a.setImageResource(C2364R.C2366drawable.ysf_image_placeholder_loading);
            i3 = C1862c.m3540a(75.0f);
            i2 = C1862c.m3540a(75.0f);
            imageLoaderListener = new ImageLoaderListener() {
                /* class com.qiyukf.nim.uikit.common.media.picker.p148a.C1893a.C18952 */

                @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                public final void onLoadComplete(@NonNull Bitmap bitmap) {
                    if (str.equals(aVar.f3507a.getTag())) {
                        aVar.f3507a.setImageBitmap(C1908a.m3662a(bitmap, aVar2.mo34262b()));
                    }
                }

                @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                public final void onLoadFailed(Throwable th) {
                }
            };
        } else {
            aVar.f3507a.setTag(aVar2.mo34269f());
            aVar.f3507a.setImageResource(C2364R.C2366drawable.ysf_image_placeholder_loading);
            str = aVar2.mo34269f();
            i3 = C1862c.m3540a(75.0f);
            i2 = C1862c.m3540a(75.0f);
            imageLoaderListener = new ImageLoaderListener() {
                /* class com.qiyukf.nim.uikit.common.media.picker.p148a.C1893a.C18941 */

                @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                public final void onLoadComplete(@NonNull Bitmap bitmap) {
                    if (aVar2.mo34269f().equals(aVar.f3507a.getTag())) {
                        aVar.f3507a.setImageBitmap(C1908a.m3662a(bitmap, aVar2.mo34262b()));
                    }
                }

                @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                public final void onLoadFailed(Throwable th) {
                    if (th != null) {
                        C1709a.m3011a("ImageEngineImpl loadImage is error", th.getMessage());
                    }
                }
            };
        }
        C1870a.m3566a(str, i3, i2, imageLoaderListener);
        aVar.f3508b.setText(aVar2.mo34266d());
        aVar.f3509c.setText(String.format(this.f3499c.getResources().getString(C2364R.string.ysf_picker_image_folder_info), Integer.valueOf(this.f3498b.get(i).mo34268e().size())));
        return view2;
    }
}
