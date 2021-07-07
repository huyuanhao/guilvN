package com.megvii.meglive_sdk.volley.toolbox;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.megvii.meglive_sdk.volley.AbstractC1628m;
import com.megvii.meglive_sdk.volley.C1620e;
import com.megvii.meglive_sdk.volley.C1625j;
import com.megvii.meglive_sdk.volley.C1627l;
import com.megvii.meglive_sdk.volley.C1631o;
import com.megvii.meglive_sdk.volley.C1654u;

/* renamed from: com.megvii.meglive_sdk.volley.toolbox.h */
public final class C1650h extends AbstractC1628m<Bitmap> {

    /* renamed from: r */
    public static final Object f2948r = new Object();

    /* renamed from: a */
    public final C1631o.AbstractC1633b<Bitmap> f2949a;

    /* renamed from: b */
    public final Bitmap.Config f2950b;

    /* renamed from: c */
    public final int f2951c;

    /* renamed from: p */
    public final int f2952p;

    /* renamed from: q */
    public final ImageView.ScaleType f2953q;

    public C1650h(String str, C1631o.AbstractC1633b<Bitmap> bVar, int i, int i2, ImageView.ScaleType scaleType, Bitmap.Config config, C1631o.AbstractC1632a aVar) {
        super(0, str, aVar);
        this.f2893n = new C1620e(1000, 2, 2.0f);
        this.f2949a = bVar;
        this.f2950b = config;
        this.f2951c = i;
        this.f2952p = i2;
        this.f2953q = scaleType;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.megvii.meglive_sdk.volley.AbstractC1628m
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo17347a(Bitmap bitmap) {
        Bitmap bitmap2 = bitmap;
        C1631o.AbstractC1633b<Bitmap> bVar = this.f2949a;
        if (bVar != null) {
            bVar.mo16992a(bitmap2);
        }
    }

    @Override // com.megvii.meglive_sdk.volley.AbstractC1628m
    /* renamed from: f */
    public final AbstractC1628m.EnumC1629a mo17353f() {
        return AbstractC1628m.EnumC1629a.LOW;
    }

    /* renamed from: a */
    public static int m2864a(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i == 0 && i2 == 0) {
            return i3;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i == 0 ? i3 : i;
        }
        if (i == 0) {
            double d = (double) i2;
            double d2 = (double) i4;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = (double) i3;
            Double.isNaN(d3);
            return (int) (d3 * (d / d2));
        } else if (i2 == 0) {
            return i;
        } else {
            double d4 = (double) i4;
            double d5 = (double) i3;
            Double.isNaN(d4);
            Double.isNaN(d5);
            double d6 = d4 / d5;
            if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                double d7 = (double) i;
                Double.isNaN(d7);
                double d8 = (double) i2;
                if (d7 * d6 >= d8) {
                    return i;
                }
                Double.isNaN(d8);
                return (int) (d8 / d6);
            }
            double d9 = (double) i;
            Double.isNaN(d9);
            double d10 = (double) i2;
            if (d9 * d6 <= d10) {
                return i;
            }
            Double.isNaN(d10);
            return (int) (d10 / d6);
        }
    }

    @Override // com.megvii.meglive_sdk.volley.AbstractC1628m
    /* renamed from: a */
    public final C1631o<Bitmap> mo17346a(C1625j jVar) {
        Bitmap bitmap;
        C1631o<Bitmap> oVar;
        synchronized (f2948r) {
            try {
                byte[] bArr = jVar.f2878b;
                BitmapFactory.Options options = new BitmapFactory.Options();
                if (this.f2951c == 0 && this.f2952p == 0) {
                    options.inPreferredConfig = this.f2950b;
                    bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                } else {
                    options.inJustDecodeBounds = true;
                    BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                    int i = options.outWidth;
                    int i2 = options.outHeight;
                    int a = m2864a(this.f2951c, this.f2952p, i, i2, this.f2953q);
                    int a2 = m2864a(this.f2952p, this.f2951c, i2, i, this.f2953q);
                    options.inJustDecodeBounds = false;
                    options.inSampleSize = m2863a(i, i2, a, a2);
                    bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
                    if (bitmap != null && (bitmap.getWidth() > a || bitmap.getHeight() > a2)) {
                        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, a, a2, true);
                        bitmap.recycle();
                        bitmap = createScaledBitmap;
                    }
                }
                if (bitmap == null) {
                    oVar = C1631o.m2809a(new C1627l(jVar));
                } else {
                    oVar = C1631o.m2810a(bitmap, C1642d.m2850a(jVar));
                }
            } catch (OutOfMemoryError e) {
                C1654u.m2874c("Caught OOM for %d byte image, url=%s", Integer.valueOf(jVar.f2878b.length), this.f2884e);
                return C1631o.m2809a(new C1627l(e));
            } catch (Throwable th) {
                throw th;
            }
        }
        return oVar;
    }

    /* renamed from: a */
    public static int m2863a(int i, int i2, int i3, int i4) {
        double d = (double) i;
        double d2 = (double) i3;
        Double.isNaN(d);
        Double.isNaN(d2);
        double d3 = (double) i2;
        double d4 = (double) i4;
        Double.isNaN(d3);
        Double.isNaN(d4);
        double min = Math.min(d / d2, d3 / d4);
        float f = 1.0f;
        while (true) {
            float f2 = 2.0f * f;
            if (((double) f2) > min) {
                return (int) f;
            }
            f = f2;
        }
    }
}
