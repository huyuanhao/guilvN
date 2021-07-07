package exocr.idcard;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

public class Photo {
    public static final int OooO00o = 96;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f23807OooO00o = "Photo";
    public static final float OooO0OO = 5.0f;

    /* renamed from: OooO00o  reason: collision with other field name */
    public float f23808OooO00o;
    public float OooO0O0;

    public Photo(float f, float f2) {
        this.f23808OooO00o = f;
        this.OooO0O0 = f2;
    }

    public void OooO00o(Canvas canvas, Context context) {
        Bitmap bitmap;
        canvas.save();
        if (IDCardManager.OooO00o().m22070OooO0o()) {
            bitmap = IDCardManager.OooO00o().m22066OooO0Oo();
        } else {
            bitmap = BitmapFactory.decodeResource(context.getResources(), ViewUtil.OooO00o(IDCardManager.OooO00o().m22055OooO00o(), "drawable", "photo"));
        }
        canvas.translate((-this.f23808OooO00o) / 2.0f, (-this.OooO0O0) / 2.0f);
        OooO00o(canvas, bitmap, 0, 0, (int) this.f23808OooO00o, (int) this.OooO0O0, 0, 0);
        canvas.restore();
    }

    public void OooO00o(Canvas canvas, Bitmap bitmap, int i, int i2, int i3, int i4, int i5, int i6) {
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        rect.left = i5;
        rect.top = i6;
        rect.right = i5 + i3;
        rect.bottom = i6 + i4;
        rect2.left = i;
        rect2.top = i2;
        rect2.right = i + i3;
        rect2.bottom = i2 + i4;
        canvas.drawBitmap(bitmap, (Rect) null, rect2, (Paint) null);
    }
}
