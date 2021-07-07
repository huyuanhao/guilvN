package com.qiyukf.nim.uikit;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.text.TextUtils;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.p118pd.sdk.C6980o000O000;
import com.p118pd.sdk.C7030o000oo00;
import com.qiyukf.basesdk.p119a.C1709a;
import com.qiyukf.basesdk.p138c.C1805a;
import com.qiyukf.unicorn.C2364R;
import com.qiyukf.unicorn.C2452d;
import com.qiyukf.unicorn.api.ImageLoaderListener;
import com.qiyukf.unicorn.api.UnicornImageLoader;
import com.qiyukf.unicorn.p231j.C2690a;

/* renamed from: com.qiyukf.nim.uikit.a */
public final class C1870a {

    /* renamed from: a */
    public static Context f3442a;

    /* renamed from: b */
    public static C6980o000O000<String, Bitmap> f3443b = new C6980o000O000<>(20);

    /* renamed from: a */
    public static Bitmap m3562a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.contains("staffDefault")) {
            Drawable drawable = f3442a.getResources().getDrawable(C2364R.C2366drawable.ysf_def_avatar_staff);
            if (drawable instanceof BitmapDrawable) {
                return ((BitmapDrawable) drawable).getBitmap();
            }
        } else {
            int i = 0;
            if (str.contains("selfDefault")) {
                Drawable drawable2 = f3442a.getResources().getDrawable(C2364R.C2366drawable.ysf_def_avatar_user);
                if (drawable2 instanceof BitmapDrawable) {
                    if (!C2690a.m6219a().mo36462d()) {
                        return ((BitmapDrawable) drawable2).getBitmap();
                    }
                    if (m3573c("selfDefault") == null) {
                        C6980o000O000<String, Bitmap> o000o000 = f3443b;
                        Bitmap bitmap = ((BitmapDrawable) drawable2).getBitmap();
                        int parseColor = Color.parseColor("#337EFF");
                        int parseColor2 = Color.parseColor(C2690a.m6219a().mo36461c().mo35690b());
                        int width = bitmap.getWidth();
                        int height = bitmap.getHeight();
                        int[] iArr = new int[(width * height)];
                        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
                        Bitmap createBitmap = Bitmap.createBitmap(width, height, bitmap.getConfig());
                        for (int i2 = 0; i2 < height; i2++) {
                            for (int i3 = 0; i3 < width; i3++) {
                                int i4 = (i2 * width) + i3;
                                if (iArr[i4] == parseColor) {
                                    iArr[i4] = Color.argb(Color.alpha(parseColor2), Color.red(parseColor2), Color.green(parseColor2), Color.blue(parseColor2));
                                }
                            }
                        }
                        createBitmap.setPixels(iArr, 0, width, 0, 0, width, height);
                        o000o000.put("selfDefault", createBitmap);
                    }
                    return m3573c("selfDefault");
                }
            } else if (str.startsWith("unicorn://")) {
                try {
                    i = Integer.valueOf(str.replace("unicorn://", "")).intValue();
                } catch (NumberFormatException e) {
                    C1709a.m3015b("本地头像 resid 获取失败 uri:", str, e);
                }
                if (i > 0) {
                    try {
                        Drawable drawable3 = f3442a.getResources().getDrawable(i);
                        if (drawable3 instanceof BitmapDrawable) {
                            return ((BitmapDrawable) drawable3).getBitmap();
                        }
                    } catch (Resources.NotFoundException unused) {
                        C1709a.m3011a("加载本地头像资源失败", "id 为：" + i);
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static Bitmap m3563a(String str, int i, int i2) {
        Bitmap loadImageSync;
        Bitmap c = m3573c(m3571b(str, i, i2));
        if (c != null) {
            return c;
        }
        UnicornImageLoader f = C2452d.m5374f();
        if (f == null || (loadImageSync = f.loadImageSync(str, i, i2)) == null || loadImageSync.isRecycled()) {
            return null;
        }
        f3443b.put(m3571b(str, i, i2), loadImageSync);
        return loadImageSync;
    }

    /* renamed from: a */
    public static void m3564a() {
        f3443b.evictAll();
    }

    /* renamed from: a */
    public static void m3565a(Context context) {
        f3442a = context;
        C1709a.m3011a("ImageLoaderKit", "init ImageLoaderKit completed");
    }

    /* renamed from: a */
    public static void m3566a(final String str, final int i, final int i2, final ImageLoaderListener imageLoaderListener) {
        final String b = m3571b(str, i, i2);
        Bitmap c = m3573c(b);
        if (c == null) {
            final UnicornImageLoader f = C2452d.m5374f();
            if (f != null) {
                RunnableC18722 r7 = new Runnable() {
                    /* class com.qiyukf.nim.uikit.C1870a.RunnableC18722 */

                    public final void run() {
                        f.loadImage(str, i, i2, new ImageLoaderListener() {
                            /* class com.qiyukf.nim.uikit.C1870a.RunnableC18722.C18731 */

                            @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                            public final void onLoadComplete(@NonNull Bitmap bitmap) {
                                if (!bitmap.isRecycled()) {
                                    if (C7030o000oo00.OooO00o(bitmap) <= 4194304) {
                                        C1870a.f3443b.put(b, bitmap);
                                    }
                                    ImageLoaderListener imageLoaderListener = imageLoaderListener;
                                    if (imageLoaderListener != null) {
                                        imageLoaderListener.onLoadComplete(bitmap);
                                        return;
                                    }
                                    return;
                                }
                                ImageLoaderListener imageLoaderListener2 = imageLoaderListener;
                                if (imageLoaderListener2 != null) {
                                    imageLoaderListener2.onLoadFailed(null);
                                }
                            }

                            @Override // com.qiyukf.unicorn.api.ImageLoaderListener
                            public final void onLoadFailed(Throwable th) {
                                ImageLoaderListener imageLoaderListener = imageLoaderListener;
                                if (imageLoaderListener != null) {
                                    imageLoaderListener.onLoadFailed(th);
                                }
                            }
                        });
                    }
                };
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    r7.run();
                } else {
                    C1805a.m3404b().post(r7);
                }
            }
        } else if (imageLoaderListener != null) {
            imageLoaderListener.onLoadComplete(c);
        }
    }

    /* renamed from: a */
    public static void m3567a(String str, ImageView imageView) {
        m3568a(str, imageView, 0, 0);
    }

    /* renamed from: a */
    public static void m3568a(final String str, final ImageView imageView, int i, int i2) {
        if (!m3572b(str)) {
            imageView.setTag(null);
            return;
        }
        imageView.setTag(str);
        m3566a(str, i, i2, new ImageLoaderListener() {
            /* class com.qiyukf.nim.uikit.C1870a.C18711 */

            @Override // com.qiyukf.unicorn.api.ImageLoaderListener
            public final void onLoadComplete(@NonNull Bitmap bitmap) {
                if (imageView.getTag() != null && imageView.getTag().equals(str)) {
                    imageView.setImageBitmap(bitmap);
                }
            }

            @Override // com.qiyukf.unicorn.api.ImageLoaderListener
            public final void onLoadFailed(Throwable th) {
            }
        });
    }

    /* renamed from: a */
    public static void m3569a(String str, ImageLoaderListener imageLoaderListener) {
        m3566a(str, 0, 0, imageLoaderListener);
    }

    /* renamed from: b */
    public static String m3571b(String str, int i, int i2) {
        return str + "#w#" + i + "#h#" + i2;
    }

    /* renamed from: b */
    public static boolean m3572b(String str) {
        return !TextUtils.isEmpty(str);
    }

    /* renamed from: c */
    public static Bitmap m3573c(String str) {
        Bitmap bitmap = f3443b.get(str);
        if (bitmap == null || !bitmap.isRecycled()) {
            return bitmap;
        }
        f3443b.remove(str);
        return null;
    }
}
