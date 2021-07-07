package exocr.bankcard;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;

public class Preview extends ViewGroup {
    public static final /* synthetic */ boolean OooO0OO = false;
    public static final String o0ooOOo = Preview.class.getSimpleName();
    public SurfaceView OooO00o;
    public boolean OooO0O0;
    public int o00oO0O;
    public int o0ooOO0;

    public Preview(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet);
        this.o00oO0O = i2;
        this.o0ooOO0 = i;
        SurfaceView surfaceView = new SurfaceView(context);
        this.OooO00o = surfaceView;
        addView(surfaceView);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public SurfaceView m22021OooO00o() {
        return this.OooO00o;
    }

    public void onDraw(Canvas canvas) {
        DebugLog.m22020OooO00o("Preview.onDraw()");
        super.onDraw(canvas);
        canvas.drawARGB(255, 255, 0, 0);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        DebugLog.m22020OooO00o("Preview.onLayout()");
        DebugLog.m22020OooO00o("- isSurfaceValid: " + this.OooO0O0);
        if (z && getChildCount() > 0) {
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (this.o00oO0O != 0 || this.o0ooOO0 != 0) {
                int i7 = this.o0ooOO0;
                int i8 = i5 * i7;
                int i9 = this.o00oO0O;
                if (i8 > i6 * i9) {
                    int i10 = (i9 * i6) / i7;
                    this.OooO00o.layout((i5 - i10) / 2, 0, (i5 + i10) / 2, i6);
                    return;
                }
                int i11 = (i7 * i5) / i9;
                this.OooO00o.layout(0, (i6 - i11) / 2, i5, (i6 + i11) / 2);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        int resolveSize = ViewGroup.resolveSize(getSuggestedMinimumWidth(), i);
        int resolveSize2 = ViewGroup.resolveSize(getSuggestedMinimumHeight(), i2);
        DebugLog.m22020OooO00o(String.format("Preview.onMeasure(w:%d, h:%d) setMeasuredDimension(w:%d, h:%d)", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(resolveSize), Integer.valueOf(resolveSize2)));
        setMeasuredDimension(resolveSize, resolveSize2);
    }

    public SurfaceHolder OooO00o() {
        return this.OooO00o.getHolder();
    }
}
