package exocr.idcard;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

public class Torch {
    public static final int OooO00o = 96;

    /* renamed from: OooO00o  reason: collision with other field name */
    public static final String f23810OooO00o = "Torch";
    public static final float OooO0OO = 5.0f;

    /* renamed from: OooO00o  reason: collision with other field name */
    public float f23811OooO00o;
    public float OooO0O0;

    public Torch(float f, float f2) {
        this.f23811OooO00o = f;
        this.OooO0O0 = f2;
    }

    public void OooO00o(Canvas canvas, Context context) {
        int i;
        Bitmap decodeResource;
        canvas.save();
        if (!IDCardManager.OooO00o().m22074OooO0o0()) {
            if (ViewfinderView.OooO0Oo) {
                i = ViewUtil.OooO00o(IDCardManager.OooO00o().m22055OooO00o(), "drawable", "flashon");
            } else {
                i = ViewUtil.OooO00o(IDCardManager.OooO00o().m22055OooO00o(), "drawable", "flash");
            }
            decodeResource = BitmapFactory.decodeResource(context.getResources(), i);
        } else if (ViewfinderView.OooO0Oo) {
            decodeResource = IDCardManager.OooO00o().m22062OooO0OO();
        } else {
            decodeResource = IDCardManager.OooO00o().m22058OooO0O0();
        }
        canvas.translate((-this.f23811OooO00o) / 2.0f, (-this.OooO0O0) / 2.0f);
        OooO00o(canvas, decodeResource, 0, 0, (int) this.f23811OooO00o, (int) this.OooO0O0, 0, 0);
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
