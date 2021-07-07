package com.qiyukf.unicorn.p232k;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.style.DynamicDrawableSpan;
import android.text.style.ImageSpan;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.nim.uikit.C1870a;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.api.ImageLoaderListener;
import java.lang.reflect.Field;

/* renamed from: com.qiyukf.unicorn.k.o */
public final class C2722o extends ImageSpan {

    /* renamed from: a */
    public String f5624a;

    /* renamed from: b */
    public TextView f5625b;

    /* renamed from: c */
    public boolean f5626c;

    public C2722o(Context context, String str, TextView textView) {
        super(context, C2364R.C2366drawable.ysf_ic_emoji_loading);
        this.f5624a = str;
        this.f5625b = textView;
    }

    /* renamed from: a */
    public static Bitmap m6286a(@NonNull Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(0.7f, 0.7f);
        return Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, true);
    }

    public final Drawable getDrawable() {
        if (!this.f5626c) {
            C1870a.m3566a(this.f5624a, 100, 100, new ImageLoaderListener() {
                /* class com.qiyukf.unicorn.p232k.C2722o.C27231 */

                @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                public final void onLoadComplete(@NonNull Bitmap bitmap) {
                    String message;
                    BitmapDrawable bitmapDrawable = new BitmapDrawable(C2722o.this.f5625b.getContext().getResources(), C2722o.m6286a(bitmap));
                    bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
                    try {
                        Field declaredField = ImageSpan.class.getDeclaredField("mDrawable");
                        declaredField.setAccessible(true);
                        declaredField.set(C2722o.this, bitmapDrawable);
                        Field declaredField2 = DynamicDrawableSpan.class.getDeclaredField("mDrawableRef");
                        declaredField2.setAccessible(true);
                        declaredField2.set(C2722o.this, null);
                        C2722o.this.f5626c = true;
                        C2722o.this.f5625b.setText(C2722o.this.f5625b.getText());
                    } catch (IllegalAccessException e) {
                        message = e.getMessage();
                        C1709a.m3011a("UrlImageSpan 加载网络图片异常", message);
                    } catch (NoSuchFieldException e2) {
                        message = e2.getMessage();
                        C1709a.m3011a("UrlImageSpan 加载网络图片异常", message);
                    }
                }

                @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                public final void onLoadFailed(Throwable th) {
                    C1709a.m3011a("UrlImageSpan 加载网络图片异常", th.getMessage());
                }
            });
        }
        return super.getDrawable();
    }
}
