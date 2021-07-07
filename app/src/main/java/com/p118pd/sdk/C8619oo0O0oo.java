package com.p118pd.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.qiyukf.unicorn.api.ImageLoaderListener;
import com.qiyukf.unicorn.api.UnicornImageLoader;

/* renamed from: com.pd.sdk.oo0O0oo  reason: case insensitive filesystem */
public class C8619oo0O0oo implements UnicornImageLoader {
    public Context OooO00o;

    /* renamed from: com.pd.sdk.oo0O0oo$OooO00o */
    public class OooO00o extends AbstractC7831oO00oOOo<Bitmap> {

        /* renamed from: OooO00o  reason: collision with other field name */
        public final /* synthetic */ ImageLoaderListener f21740OooO00o;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public OooO00o(int i, int i2, ImageLoaderListener imageLoaderListener) {
            super(i, i2);
            this.f21740OooO00o = imageLoaderListener;
        }

        @Override // com.p118pd.sdk.AbstractC7833oO00oOo0
        public /* bridge */ /* synthetic */ void onResourceReady(@NonNull Object obj, @Nullable AbstractC7837oO00ooOo oo00oooo) {
            onResourceReady((Bitmap) obj, (AbstractC7837oO00ooOo<? super Bitmap>) oo00oooo);
        }

        public void onResourceReady(@NonNull Bitmap bitmap, @Nullable AbstractC7837oO00ooOo<? super Bitmap> oo00oooo) {
            ImageLoaderListener imageLoaderListener = this.f21740OooO00o;
            if (imageLoaderListener != null) {
                imageLoaderListener.onLoadComplete(bitmap);
            }
        }
    }

    public C8619oo0O0oo(Context context) {
        this.OooO00o = context.getApplicationContext();
    }

    @Override // com.qiyukf.unicorn.api.UnicornImageLoader
    public void loadImage(String str, int i, int i2, ImageLoaderListener imageLoaderListener) {
        if (i <= 0 || i2 <= 0) {
            i = Integer.MIN_VALUE;
            i2 = Integer.MIN_VALUE;
        }
        ComponentCallbacks2C7604o0o0Oo0o.m19230OooO00o(this.OooO00o).asBitmap().load(str).into(new OooO00o(i, i2, imageLoaderListener));
    }

    @Override // com.qiyukf.unicorn.api.UnicornImageLoader
    @Nullable
    public Bitmap loadImageSync(String str, int i, int i2) {
        return null;
    }
}
