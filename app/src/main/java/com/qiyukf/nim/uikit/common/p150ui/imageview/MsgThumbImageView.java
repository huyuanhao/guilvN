package com.qiyukf.nim.uikit.common.p150ui.imageview;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.p118pd.sdk.C7009o000OoOo;
import com.qiyukf.nim.uikit.C1870a;

/* renamed from: com.qiyukf.nim.uikit.common.ui.imageview.MsgThumbImageView */
public class MsgThumbImageView extends ImageView {

    /* renamed from: b */
    public static final Paint f3651b;

    /* renamed from: a */
    public Drawable f3652a;

    static {
        Paint paint = new Paint();
        f3651b = paint;
        paint.setAntiAlias(true);
        f3651b.setFilterBitmap(true);
        f3651b.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public MsgThumbImageView(Context context) {
        super(context);
    }

    public MsgThumbImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MsgThumbImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    /* renamed from: a */
    private void m3727a(int i) {
        this.f3652a = i != 0 ? C7009o000OoOo.m18256OooO00o(getContext(), i) : null;
    }

    /* renamed from: a */
    private void m3728a(int i, int i2) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    public final void mo34304a(int i, int i2, int i3, int i4) {
        m3728a(i2, i3);
        m3727a(i4);
        setImageDrawable(C7009o000OoOo.m18256OooO00o(getContext(), i));
    }

    /* renamed from: a */
    public final void mo34305a(Bitmap bitmap, int i, int i2, int i3) {
        m3728a(i, i2);
        m3727a(i3);
        setImageBitmap(bitmap);
    }

    /* renamed from: a */
    public final void mo34306a(String str, int i, int i2, int i3) {
        m3728a(i, i2);
        m3727a(i3);
        C1870a.m3568a("file://" + str, this, i, i2);
    }

    public boolean isOpaque() {
        return false;
    }

    public void onDraw(Canvas canvas) {
        if (this.f3652a != null) {
            int width = getWidth();
            int height = getHeight();
            float f = (float) width;
            float f2 = (float) height;
            canvas.saveLayer(0.0f, 0.0f, f, f2, null, 31);
            Drawable drawable = this.f3652a;
            if (drawable != null) {
                drawable.setBounds(0, 0, width, height);
                this.f3652a.draw(canvas);
            }
            canvas.saveLayer(0.0f, 0.0f, f, f2, f3651b, 31);
            super.onDraw(canvas);
            canvas.restore();
            canvas.restore();
            return;
        }
        super.onDraw(canvas);
    }
}
