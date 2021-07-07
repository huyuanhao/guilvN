package com.p118pd.sdk;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.facebook.react.views.text.FontMetricsUtil;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.pd.sdk.oO000oOo  reason: case insensitive filesystem */
public final class C7790oO000oOo {
    public static final int OooO00o = 6;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Paint f20844OooO00o = new Paint(6);

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f20845OooO00o = "TransformationUtils";

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Set<String> f20846OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final Lock f20847OooO00o;
    public static final int OooO0O0 = 7;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public static final Paint f20848OooO0O0 = new Paint(7);
    public static final Paint OooO0OO;

    /* renamed from: com.pd.sdk.oO000oOo$OooO00o */
    public static final class OooO00o implements Lock {
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @NonNull
        public Condition newCondition() {
            throw new UnsupportedOperationException("Should not be called");
        }

        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j, @NonNull TimeUnit timeUnit) throws InterruptedException {
            return true;
        }

        public void unlock() {
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079"));
        f20846OooO00o = hashSet;
        f20847OooO00o = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new OooO00o();
        Paint paint = new Paint(7);
        OooO0OO = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static int OooO00o(int i) {
        switch (i) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    public static Lock OooO00o() {
        return f20847OooO00o;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m19447OooO00o(int i) {
        switch (i) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap OooO0O0(@NonNull AbstractC7711o0ooO0OO o0ooo0oo, @NonNull Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() > i || bitmap.getHeight() > i2) {
            Log.isLoggable(f20845OooO00o, 2);
            return OooO0Oo(o0ooo0oo, bitmap, i, i2);
        }
        Log.isLoggable(f20845OooO00o, 2);
        return bitmap;
    }

    /* JADX INFO: finally extract failed */
    public static Bitmap OooO0OO(@NonNull AbstractC7711o0ooO0OO o0ooo0oo, @NonNull Bitmap bitmap, int i, int i2) {
        int min = Math.min(i, i2);
        float f = (float) min;
        float f2 = f / 2.0f;
        float width = (float) bitmap.getWidth();
        float height = (float) bitmap.getHeight();
        float max = Math.max(f / width, f / height);
        float f3 = width * max;
        float f4 = max * height;
        float f5 = (f - f3) / 2.0f;
        float f6 = (f - f4) / 2.0f;
        RectF rectF = new RectF(f5, f6, f3 + f5, f4 + f6);
        Bitmap OooO00o2 = OooO00o(o0ooo0oo, bitmap);
        Bitmap OooO00o3 = o0ooo0oo.OooO00o(min, min, OooO00o(bitmap));
        OooO00o3.setHasAlpha(true);
        f20847OooO00o.lock();
        try {
            Canvas canvas = new Canvas(OooO00o3);
            canvas.drawCircle(f2, f2, f2, f20848OooO0O0);
            canvas.drawBitmap(OooO00o2, (Rect) null, rectF, OooO0OO);
            OooO00o(canvas);
            f20847OooO00o.unlock();
            if (!OooO00o2.equals(bitmap)) {
                o0ooo0oo.OooO00o(OooO00o2);
            }
            return OooO00o3;
        } catch (Throwable th) {
            f20847OooO00o.unlock();
            throw th;
        }
    }

    public static Bitmap OooO0Oo(@NonNull AbstractC7711o0ooO0OO o0ooo0oo, @NonNull Bitmap bitmap, int i, int i2) {
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            Log.isLoggable(f20845OooO00o, 2);
            return bitmap;
        }
        float min = Math.min(((float) i) / ((float) bitmap.getWidth()), ((float) i2) / ((float) bitmap.getHeight()));
        int round = Math.round(((float) bitmap.getWidth()) * min);
        int round2 = Math.round(((float) bitmap.getHeight()) * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            Log.isLoggable(f20845OooO00o, 2);
            return bitmap;
        }
        Bitmap OooO00o2 = o0ooo0oo.OooO00o((int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), OooO0O0(bitmap));
        OooO00o(bitmap, OooO00o2);
        if (Log.isLoggable(f20845OooO00o, 2)) {
            String str = "request: " + i + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + i2;
            String str2 = "toFit:   " + bitmap.getWidth() + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + bitmap.getHeight();
            String str3 = "toReuse: " + OooO00o2.getWidth() + FontMetricsUtil.X_HEIGHT_MEASUREMENT_TEXT + OooO00o2.getHeight();
            String str4 = "minPct:   " + min;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        OooO00o(bitmap, OooO00o2, matrix);
        return OooO00o2;
    }

    public static Bitmap OooO00o(@NonNull AbstractC7711o0ooO0OO o0ooo0oo, @NonNull Bitmap bitmap, int i, int i2) {
        float f;
        float f2;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f3 = 0.0f;
        if (bitmap.getWidth() * i2 > bitmap.getHeight() * i) {
            f2 = ((float) i2) / ((float) bitmap.getHeight());
            f3 = (((float) i) - (((float) bitmap.getWidth()) * f2)) * 0.5f;
            f = 0.0f;
        } else {
            f2 = ((float) i) / ((float) bitmap.getWidth());
            f = (((float) i2) - (((float) bitmap.getHeight()) * f2)) * 0.5f;
        }
        matrix.setScale(f2, f2);
        matrix.postTranslate((float) ((int) (f3 + 0.5f)), (float) ((int) (f + 0.5f)));
        Bitmap OooO00o2 = o0ooo0oo.OooO00o(i, i2, OooO0O0(bitmap));
        OooO00o(bitmap, OooO00o2);
        OooO00o(bitmap, OooO00o2, matrix);
        return OooO00o2;
    }

    /* JADX INFO: finally extract failed */
    public static Bitmap OooO0O0(@NonNull AbstractC7711o0ooO0OO o0ooo0oo, @NonNull Bitmap bitmap, int i) {
        C7842oO0O0.OooO00o(i > 0, "roundingRadius must be greater than 0.");
        Bitmap.Config OooO00o2 = OooO00o(bitmap);
        Bitmap OooO00o3 = OooO00o(o0ooo0oo, bitmap);
        Bitmap OooO00o4 = o0ooo0oo.OooO00o(OooO00o3.getWidth(), OooO00o3.getHeight(), OooO00o2);
        OooO00o4.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(OooO00o3, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, (float) OooO00o4.getWidth(), (float) OooO00o4.getHeight());
        f20847OooO00o.lock();
        try {
            Canvas canvas = new Canvas(OooO00o4);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            float f = (float) i;
            canvas.drawRoundRect(rectF, f, f, paint);
            OooO00o(canvas);
            f20847OooO00o.unlock();
            if (!OooO00o3.equals(bitmap)) {
                o0ooo0oo.OooO00o(OooO00o3);
            }
            return OooO00o4;
        } catch (Throwable th) {
            f20847OooO00o.unlock();
            throw th;
        }
    }

    public static void OooO00o(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }

    public static Bitmap OooO00o(@NonNull Bitmap bitmap, int i) {
        if (i == 0) {
            return bitmap;
        }
        try {
            Matrix matrix = new Matrix();
            matrix.setRotate((float) i);
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (Exception unused) {
            Log.isLoggable(f20845OooO00o, 6);
            return bitmap;
        }
    }

    public static Bitmap OooO00o(@NonNull AbstractC7711o0ooO0OO o0ooo0oo, @NonNull Bitmap bitmap, int i) {
        if (!m19447OooO00o(i)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        OooO00o(i, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, (float) bitmap.getWidth(), (float) bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap OooO00o2 = o0ooo0oo.OooO00o(Math.round(rectF.width()), Math.round(rectF.height()), OooO0O0(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        OooO00o(bitmap, OooO00o2, matrix);
        return OooO00o2;
    }

    @NonNull
    public static Bitmap.Config OooO0O0(@NonNull Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    public static Bitmap OooO00o(@NonNull AbstractC7711o0ooO0OO o0ooo0oo, @NonNull Bitmap bitmap) {
        Bitmap.Config OooO00o2 = OooO00o(bitmap);
        if (OooO00o2.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap OooO00o3 = o0ooo0oo.OooO00o(bitmap.getWidth(), bitmap.getHeight(), OooO00o2);
        new Canvas(OooO00o3).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return OooO00o3;
    }

    @NonNull
    public static Bitmap.Config OooO00o(@NonNull Bitmap bitmap) {
        if (Build.VERSION.SDK_INT < 26 || !Bitmap.Config.RGBA_F16.equals(bitmap.getConfig())) {
            return Bitmap.Config.ARGB_8888;
        }
        return Bitmap.Config.RGBA_F16;
    }

    @Deprecated
    public static Bitmap OooO00o(@NonNull AbstractC7711o0ooO0OO o0ooo0oo, @NonNull Bitmap bitmap, int i, int i2, int i3) {
        return OooO0O0(o0ooo0oo, bitmap, i3);
    }

    public static void OooO00o(Canvas canvas) {
        canvas.setBitmap(null);
    }

    public static void OooO00o(@NonNull Bitmap bitmap, @NonNull Bitmap bitmap2, Matrix matrix) {
        f20847OooO00o.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f20844OooO00o);
            OooO00o(canvas);
        } finally {
            f20847OooO00o.unlock();
        }
    }

    @VisibleForTesting
    public static void OooO00o(int i, Matrix matrix) {
        switch (i) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                return;
            case 3:
                matrix.setRotate(180.0f);
                return;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 6:
                matrix.setRotate(90.0f);
                return;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                return;
            case 8:
                matrix.setRotate(-90.0f);
                return;
            default:
                return;
        }
    }
}
