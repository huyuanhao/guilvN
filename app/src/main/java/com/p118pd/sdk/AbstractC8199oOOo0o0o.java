package com.p118pd.sdk;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.facebook.imagepipeline.producers.ResizeAndRotateProducer;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.p118pd.sdk.AbstractC8219oOOoOOOo;

/* renamed from: com.pd.sdk.oOOo0o0o  reason: case insensitive filesystem */
public abstract class AbstractC8199oOOo0o0o<T extends AbstractC8219oOOoOOOo<? extends AbstractC8265oOOoooO0<? extends Entry>>> extends AbstractC8194oOOo0OoO<T> {
    public boolean OooO = true;
    public float OooOO0 = 270.0f;
    public float OooOO0O = 270.0f;
    public float OooOO0o = 0.0f;

    /* renamed from: com.pd.sdk.oOOo0o0o$OooO00o */
    public class OooO00o implements ValueAnimator.AnimatorUpdateListener {
        public OooO00o() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            AbstractC8199oOOo0o0o.this.postInvalidate();
        }
    }

    /* renamed from: com.pd.sdk.oOOo0o0o$OooO0O0 */
    public static /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] OooO00o;
        public static final /* synthetic */ int[] OooO0O0;
        public static final /* synthetic */ int[] OooO0OO;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|(2:13|14)|15|17|18|19|20|22) */
        /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0054 */
        static {
            /*
                com.github.mikephil.charting.components.Legend$LegendOrientation[] r0 = com.github.mikephil.charting.components.Legend.LegendOrientation.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.p118pd.sdk.AbstractC8199oOOo0o0o.OooO0O0.OooO0OO = r0
                r1 = 1
                com.github.mikephil.charting.components.Legend$LegendOrientation r2 = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = com.p118pd.sdk.AbstractC8199oOOo0o0o.OooO0O0.OooO0OO     // Catch:{ NoSuchFieldError -> 0x001d }
                com.github.mikephil.charting.components.Legend$LegendOrientation r3 = com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment[] r2 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                com.p118pd.sdk.AbstractC8199oOOo0o0o.OooO0O0.OooO0O0 = r2
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.p118pd.sdk.AbstractC8199oOOo0o0o.OooO0O0.OooO0O0     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.p118pd.sdk.AbstractC8199oOOo0o0o.OooO0O0.OooO0O0     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment[] r2 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                com.p118pd.sdk.AbstractC8199oOOo0o0o.OooO0O0.OooO00o = r2
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r1 = com.p118pd.sdk.AbstractC8199oOOo0o0o.OooO0O0.OooO00o     // Catch:{ NoSuchFieldError -> 0x005e }
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r2 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.BOTTOM     // Catch:{ NoSuchFieldError -> 0x005e }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.AbstractC8199oOOo0o0o.OooO0O0.<clinit>():void");
        }
    }

    public AbstractC8199oOOo0o0o(Context context) {
        super(context);
    }

    @Override // com.p118pd.sdk.AbstractC8194oOOo0OoO, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public void OooO() {
        if (((AbstractC8194oOOo0OoO) this).f21268OooO00o != null) {
            OooO00o();
            if (((AbstractC8194oOOo0OoO) this).f21262OooO00o != null) {
                ((AbstractC8194oOOo0OoO) this).f21274OooO00o.OooO00o(((AbstractC8194oOOo0OoO) this).f21268OooO00o);
            }
            OooO0O0();
        }
    }

    public abstract int OooO00o(float f);

    public C8349oOoOOo00 OooO00o(C8349oOoOOo00 oooooo00, float f, float f2) {
        C8349oOoOOo00 OooO00o2 = C8349oOoOOo00.OooO00o(0.0f, 0.0f);
        OooO00o(oooooo00, f, f2, OooO00o2);
        return OooO00o2;
    }

    @Override // com.p118pd.sdk.AbstractC8194oOOo0OoO
    public void OooO00o() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x007d, code lost:
        if (r2 != 2) goto L_0x007f;
     */
    @Override // com.p118pd.sdk.AbstractC8194oOOo0OoO
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void OooO0O0() {
        /*
        // Method dump skipped, instructions count: 540
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.AbstractC8199oOOo0o0o.OooO0O0():void");
    }

    @Override // com.p118pd.sdk.AbstractC8194oOOo0OoO, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public void OooO0oo() {
        super.OooO0oo();
        ((AbstractC8194oOOo0OoO) this).f21264OooO00o = new C8302oOo00oo(this);
    }

    public boolean OooOO0O() {
        return this.OooO;
    }

    public void computeScroll() {
        ChartTouchListener chartTouchListener = ((AbstractC8194oOOo0OoO) this).f21264OooO00o;
        if (chartTouchListener instanceof C8302oOo00oo) {
            ((C8302oOo00oo) chartTouchListener).m19994OooO00o();
        }
    }

    public float getDiameter() {
        RectF OooO00o2 = ((AbstractC8194oOOo0OoO) this).f21275OooO00o.m20027OooO00o();
        OooO00o2.left += getExtraLeftOffset();
        OooO00o2.top += getExtraTopOffset();
        OooO00o2.right -= getExtraRightOffset();
        OooO00o2.bottom -= getExtraBottomOffset();
        return Math.min(OooO00o2.width(), OooO00o2.height());
    }

    @Override // com.p118pd.sdk.AbstractC8257oOOooOo0
    public int getMaxVisibleCount() {
        return ((AbstractC8194oOOo0OoO) this).f21268OooO00o.m19916OooO0O0();
    }

    public float getMinOffset() {
        return this.OooOO0o;
    }

    public abstract float getRadius();

    public float getRawRotationAngle() {
        return this.OooOO0O;
    }

    public abstract float getRequiredBaseOffset();

    public abstract float getRequiredLegendOffset();

    public float getRotationAngle() {
        return this.OooOO0;
    }

    @Override // com.p118pd.sdk.AbstractC8257oOOooOo0
    public float getYChartMax() {
        return 0.0f;
    }

    @Override // com.p118pd.sdk.AbstractC8257oOOooOo0
    public float getYChartMin() {
        return 0.0f;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        ChartTouchListener chartTouchListener;
        if (!((AbstractC8194oOOo0OoO) this).f21281OooO0o0 || (chartTouchListener = ((AbstractC8194oOOo0OoO) this).f21264OooO00o) == null) {
            return super.onTouchEvent(motionEvent);
        }
        return chartTouchListener.onTouch(this, motionEvent);
    }

    public void setMinOffset(float f) {
        this.OooOO0o = f;
    }

    public void setRotationAngle(float f) {
        this.OooOO0O = f;
        this.OooOO0 = AbstractC8352oOoOOoO0.OooO0OO(f);
    }

    public void setRotationEnabled(boolean z) {
        this.OooO = z;
    }

    public void OooO00o(C8349oOoOOo00 oooooo00, float f, float f2, C8349oOoOOo00 oooooo002) {
        double d = (double) oooooo00.f21456OooO00o;
        double d2 = (double) f;
        double d3 = (double) f2;
        double cos = Math.cos(Math.toRadians(d3));
        Double.isNaN(d2);
        Double.isNaN(d);
        oooooo002.f21456OooO00o = (float) (d + (cos * d2));
        double d4 = (double) oooooo00.OooO0O0;
        double sin = Math.sin(Math.toRadians(d3));
        Double.isNaN(d2);
        Double.isNaN(d4);
        oooooo002.OooO0O0 = (float) (d4 + (d2 * sin));
    }

    @Override // com.p118pd.sdk.AbstractC8194oOOo0OoO, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public float OooO00o(float f, float f2) {
        C8349oOoOOo00 centerOffsets = getCenterOffsets();
        float f3 = centerOffsets.f21456OooO00o;
        float f4 = f > f3 ? f - f3 : f3 - f;
        float f5 = centerOffsets.OooO0O0;
        float sqrt = (float) Math.sqrt(Math.pow((double) f4, 2.0d) + Math.pow((double) (f2 > f5 ? f2 - f5 : f5 - f2), 2.0d));
        C8349oOoOOo00.m20016OooO00o(centerOffsets);
        return sqrt;
    }

    public AbstractC8199oOOo0o0o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @SuppressLint({"NewApi"})
    public void OooO00o(int i, float f, float f2, Easing.EasingOption easingOption) {
        if (Build.VERSION.SDK_INT >= 11) {
            setRotationAngle(f);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, ResizeAndRotateProducer.ROTATION_ANGLE_KEY, f, f2);
            ofFloat.setDuration((long) i);
            ofFloat.setInterpolator(Easing.OooO00o(easingOption));
            ofFloat.addUpdateListener(new OooO00o());
            ofFloat.start();
        }
    }

    public AbstractC8199oOOo0o0o(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public float OooO0O0(float f, float f2) {
        C8349oOoOOo00 centerOffsets = getCenterOffsets();
        double d = (double) (f - centerOffsets.f21456OooO00o);
        double d2 = (double) (f2 - centerOffsets.OooO0O0);
        Double.isNaN(d);
        Double.isNaN(d);
        Double.isNaN(d2);
        Double.isNaN(d2);
        double sqrt = Math.sqrt((d * d) + (d2 * d2));
        Double.isNaN(d2);
        float degrees = (float) Math.toDegrees(Math.acos(d2 / sqrt));
        if (f > centerOffsets.f21456OooO00o) {
            degrees = 360.0f - degrees;
        }
        float f3 = degrees + 90.0f;
        if (f3 > 360.0f) {
            f3 -= 360.0f;
        }
        C8349oOoOOo00.m20016OooO00o(centerOffsets);
        return f3;
    }
}
