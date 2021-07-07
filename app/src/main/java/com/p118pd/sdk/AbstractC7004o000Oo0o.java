package com.p118pd.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import java.util.List;
import java.util.Map;

/* renamed from: com.pd.sdk.o000Oo0o  reason: case insensitive filesystem */
public abstract class AbstractC7004o000Oo0o {
    public static final int OooO00o = 1048576;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f19271OooO00o = "sharedElement:snapshot:bitmap";
    public static final String OooO0O0 = "sharedElement:snapshot:imageScaleType";
    public static final String OooO0OO = "sharedElement:snapshot:imageMatrix";

    /* renamed from: OooO00o  reason: collision with other field name */
    public Matrix f19272OooO00o;

    /* renamed from: com.pd.sdk.o000Oo0o$OooO00o */
    public interface OooO00o {
        void OooO00o();
    }

    public Parcelable OooO00o(View view, Matrix matrix, RectF rectF) {
        Bitmap OooO00o2;
        if (view instanceof ImageView) {
            ImageView imageView = (ImageView) view;
            Drawable drawable = imageView.getDrawable();
            Drawable background = imageView.getBackground();
            if (!(drawable == null || background != null || (OooO00o2 = OooO00o(drawable)) == null)) {
                Bundle bundle = new Bundle();
                bundle.putParcelable(f19271OooO00o, OooO00o2);
                bundle.putString(OooO0O0, imageView.getScaleType().toString());
                if (imageView.getScaleType() == ImageView.ScaleType.MATRIX) {
                    float[] fArr = new float[9];
                    imageView.getImageMatrix().getValues(fArr);
                    bundle.putFloatArray(OooO0OO, fArr);
                }
                return bundle;
            }
        }
        int round = Math.round(rectF.width());
        int round2 = Math.round(rectF.height());
        if (round <= 0 || round2 <= 0) {
            return null;
        }
        float min = Math.min(1.0f, 1048576.0f / ((float) (round * round2)));
        int i = (int) (((float) round) * min);
        int i2 = (int) (((float) round2) * min);
        if (this.f19272OooO00o == null) {
            this.f19272OooO00o = new Matrix();
        }
        this.f19272OooO00o.set(matrix);
        this.f19272OooO00o.postTranslate(-rectF.left, -rectF.top);
        this.f19272OooO00o.postScale(min, min);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.concat(this.f19272OooO00o);
        view.draw(canvas);
        return createBitmap;
    }

    public void OooO00o(List<View> list) {
    }

    public void OooO00o(List<String> list, List<View> list2, List<View> list3) {
    }

    public void OooO00o(List<String> list, Map<String, View> map) {
    }

    public void OooO0O0(List<String> list, List<View> list2, List<View> list3) {
    }

    public static Bitmap OooO00o(Drawable drawable) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return null;
        }
        float min = Math.min(1.0f, 1048576.0f / ((float) (intrinsicWidth * intrinsicHeight)));
        if ((drawable instanceof BitmapDrawable) && min == 1.0f) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        int i = (int) (((float) intrinsicWidth) * min);
        int i2 = (int) (((float) intrinsicHeight) * min);
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Rect bounds = drawable.getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        drawable.setBounds(0, 0, i, i2);
        drawable.draw(canvas);
        drawable.setBounds(i3, i4, i5, i6);
        return createBitmap;
    }

    public View OooO00o(Context context, Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Bitmap bitmap = (Bitmap) bundle.getParcelable(f19271OooO00o);
            if (bitmap == null) {
                return null;
            }
            ImageView imageView = new ImageView(context);
            imageView.setImageBitmap(bitmap);
            imageView.setScaleType(ImageView.ScaleType.valueOf(bundle.getString(OooO0O0)));
            if (imageView.getScaleType() != ImageView.ScaleType.MATRIX) {
                return imageView;
            }
            float[] floatArray = bundle.getFloatArray(OooO0OO);
            Matrix matrix = new Matrix();
            matrix.setValues(floatArray);
            imageView.setImageMatrix(matrix);
            return imageView;
        } else if (!(parcelable instanceof Bitmap)) {
            return null;
        } else {
            ImageView imageView2 = new ImageView(context);
            imageView2.setImageBitmap((Bitmap) parcelable);
            return imageView2;
        }
    }

    public void OooO00o(List<String> list, List<View> list2, OooO00o oooO00o) {
        oooO00o.OooO00o();
    }
}
