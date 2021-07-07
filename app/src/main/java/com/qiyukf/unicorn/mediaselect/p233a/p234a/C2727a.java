package com.qiyukf.unicorn.mediaselect.p233a.p234a;

import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.ImageLoaderListener;
import com.qiyukf.unicorn.api.UnicornGifImageLoader;
import com.qiyukf.unicorn.mediaselect.p233a.AbstractC2726a;

/* renamed from: com.qiyukf.unicorn.mediaselect.a.a.a */
public final class C2727a implements AbstractC2726a {
    @Override // com.qiyukf.unicorn.mediaselect.p233a.AbstractC2726a
    /* renamed from: a */
    public final void mo36480a(int i, int i2, final ImageView imageView, Uri uri) {
        C1870a.m3566a(uri.toString(), i, i2, new ImageLoaderListener() {
            /* class com.qiyukf.unicorn.mediaselect.p233a.p234a.C2727a.C27303 */

            @Override // com.qiyukf.unicorn.api.ImageLoaderListener
            public final void onLoadComplete(@NonNull Bitmap bitmap) {
                imageView.setImageBitmap(bitmap);
            }

            @Override // com.qiyukf.unicorn.api.ImageLoaderListener
            public final void onLoadFailed(Throwable th) {
                if (th != null) {
                    C1709a.m3011a("ImageEngineImpl loadImage is error", th.getMessage());
                }
            }
        });
    }

    @Override // com.qiyukf.unicorn.mediaselect.p233a.AbstractC2726a
    /* renamed from: a */
    public final void mo36481a(int i, final ImageView imageView, Uri uri) {
        C1870a.m3566a(uri.toString(), i, i, new ImageLoaderListener() {
            /* class com.qiyukf.unicorn.mediaselect.p233a.p234a.C2727a.C27281 */

            @Override // com.qiyukf.unicorn.api.ImageLoaderListener
            public final void onLoadComplete(@NonNull Bitmap bitmap) {
                imageView.setImageBitmap(bitmap);
            }

            @Override // com.qiyukf.unicorn.api.ImageLoaderListener
            public final void onLoadFailed(Throwable th) {
                if (th != null) {
                    C1709a.m3011a("ImageEngineImpl loadThumbnail is error", th.getMessage());
                }
            }
        });
    }

    @Override // com.qiyukf.unicorn.mediaselect.p233a.AbstractC2726a
    /* renamed from: a */
    public final void mo36482a(ImageView imageView, Uri uri) {
        UnicornGifImageLoader unicornGifImageLoader = C2452d.m5373e().gifImageLoader;
        if (unicornGifImageLoader != null) {
            unicornGifImageLoader.loadGifImage(uri.toString(), imageView, uri.toString());
        }
    }

    @Override // com.qiyukf.unicorn.mediaselect.p233a.AbstractC2726a
    /* renamed from: b */
    public final void mo36483b(int i, final ImageView imageView, Uri uri) {
        C1870a.m3566a(uri.toString(), i, i, new ImageLoaderListener() {
            /* class com.qiyukf.unicorn.mediaselect.p233a.p234a.C2727a.C27292 */

            @Override // com.qiyukf.unicorn.api.ImageLoaderListener
            public final void onLoadComplete(@NonNull Bitmap bitmap) {
                imageView.setImageBitmap(bitmap);
            }

            @Override // com.qiyukf.unicorn.api.ImageLoaderListener
            public final void onLoadFailed(Throwable th) {
                if (th != null) {
                    C1709a.m3011a("ImageEngineImpl loadGifThumbnail is error", th.getMessage());
                }
            }
        });
    }
}
