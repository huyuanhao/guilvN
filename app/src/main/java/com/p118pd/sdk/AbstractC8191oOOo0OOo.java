package com.p118pd.sdk;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.components.YAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.p118pd.sdk.AbstractC8211oOOoO0oO;

@SuppressLint({"RtlHardcoded"})
/* renamed from: com.pd.sdk.oOOo0OOo  reason: case insensitive filesystem */
public abstract class AbstractC8191oOOo0OOo<T extends AbstractC8211oOOoO0oO<? extends AbstractC8261oOOooo0<? extends Entry>>> extends AbstractC8194oOOo0OoO<T> implements AbstractC8253oOOooOO {
    public boolean OooO;
    public long OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Matrix f21245OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public RectF f21246OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public YAxis f21247OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8300oOo00oO f21248OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8329oOoOO0OO f21249OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8331oOoOO0o f21250OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8346oOoOOOoo f21251OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8351oOoOOo0o f21252OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public float[] f21253OooO00o;
    public long OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public Matrix f21254OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public YAxis f21255OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public C8331oOoOO0o f21256OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public C8346oOoOOOoo f21257OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public C8351oOoOOo0o f21258OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public float[] f21259OooO0O0;
    public Paint OooO0OO;
    public Paint OooO0Oo;
    public float OooOO0;

    /* renamed from: OooOO0  reason: collision with other field name */
    public boolean f21260OooOO0;
    public boolean OooOO0O;
    public boolean OooOO0o;
    public boolean OooOOO;
    public boolean OooOOO0;
    public boolean OooOOOO;
    public boolean OooOOOo;
    public boolean OooOOo;
    public boolean OooOOo0;
    public boolean OooOOoo;
    public boolean OooOo0;
    public boolean OooOo00;
    public int o0OO00O;

    /* renamed from: com.pd.sdk.oOOo0OOo$OooO00o */
    public class OooO00o implements Runnable {
        public final /* synthetic */ float OooO0Oo;
        public final /* synthetic */ float OooO0o;
        public final /* synthetic */ float OooO0o0;
        public final /* synthetic */ float OooO0oO;

        public OooO00o(float f, float f2, float f3, float f4) {
            this.OooO0Oo = f;
            this.OooO0o0 = f2;
            this.OooO0o = f3;
            this.OooO0oO = f4;
        }

        public void run() {
            ((AbstractC8194oOOo0OoO) AbstractC8191oOOo0OOo.this).f21275OooO00o.m20030OooO00o(this.OooO0Oo, this.OooO0o0, this.OooO0o, this.OooO0oO);
            AbstractC8191oOOo0OOo.this.OooOO0o();
            AbstractC8191oOOo0OOo.this.OooOOO0();
        }
    }

    /* renamed from: com.pd.sdk.oOOo0OOo$OooO0O0 */
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
                com.p118pd.sdk.AbstractC8191oOOo0OOo.OooO0O0.OooO0OO = r0
                r1 = 1
                com.github.mikephil.charting.components.Legend$LegendOrientation r2 = com.github.mikephil.charting.components.Legend.LegendOrientation.VERTICAL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = com.p118pd.sdk.AbstractC8191oOOo0OOo.OooO0O0.OooO0OO     // Catch:{ NoSuchFieldError -> 0x001d }
                com.github.mikephil.charting.components.Legend$LegendOrientation r3 = com.github.mikephil.charting.components.Legend.LegendOrientation.HORIZONTAL     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment[] r2 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                com.p118pd.sdk.AbstractC8191oOOo0OOo.OooO0O0.OooO0O0 = r2
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.LEFT     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = com.p118pd.sdk.AbstractC8191oOOo0OOo.OooO0O0.OooO0O0     // Catch:{ NoSuchFieldError -> 0x0038 }
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.RIGHT     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r2 = com.p118pd.sdk.AbstractC8191oOOo0OOo.OooO0O0.OooO0O0     // Catch:{ NoSuchFieldError -> 0x0043 }
                com.github.mikephil.charting.components.Legend$LegendHorizontalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendHorizontalAlignment.CENTER     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r4 = 3
                r2[r3] = r4     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment[] r2 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                com.p118pd.sdk.AbstractC8191oOOo0OOo.OooO0O0.OooO00o = r2
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r3 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.TOP     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r1 = com.p118pd.sdk.AbstractC8191oOOo0OOo.OooO0O0.OooO00o     // Catch:{ NoSuchFieldError -> 0x005e }
                com.github.mikephil.charting.components.Legend$LegendVerticalAlignment r2 = com.github.mikephil.charting.components.Legend.LegendVerticalAlignment.BOTTOM     // Catch:{ NoSuchFieldError -> 0x005e }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.AbstractC8191oOOo0OOo.OooO0O0.<clinit>():void");
        }
    }

    public AbstractC8191oOOo0OOo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.o0OO00O = 100;
        this.OooO = false;
        this.f21260OooOO0 = false;
        this.OooOO0O = true;
        this.OooOO0o = true;
        this.OooOOO0 = true;
        this.OooOOO = true;
        this.OooOOOO = true;
        this.OooOOOo = true;
        this.OooOOo0 = false;
        this.OooOOo = false;
        this.OooOOoo = false;
        this.OooOO0 = 15.0f;
        this.OooOo00 = false;
        this.OooO00o = 0;
        this.OooO0O0 = 0;
        this.f21246OooO00o = new RectF();
        this.f21245OooO00o = new Matrix();
        this.f21254OooO0O0 = new Matrix();
        this.OooOo0 = false;
        this.f21253OooO00o = new float[2];
        this.f21251OooO00o = C8346oOoOOOoo.OooO00o(AbstractC8352oOoOOoO0.OooO0O0, AbstractC8352oOoOOoO0.OooO0O0);
        this.f21257OooO0O0 = C8346oOoOOOoo.OooO00o(AbstractC8352oOoOOoO0.OooO0O0, AbstractC8352oOoOOoO0.OooO0O0);
        this.f21259OooO0O0 = new float[2];
    }

    @Override // com.p118pd.sdk.AbstractC8194oOOo0OoO, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public void OooO() {
        if (((AbstractC8194oOOo0OoO) this).f21268OooO00o != null) {
            if (((AbstractC8194oOOo0OoO) this).f21278OooO0O0) {
                Log.i(AbstractC8194oOOo0OoO.f21261o0ooOoO, "Preparing...");
            }
            AbstractC8321oOoO0ooO oooo0ooo = ((AbstractC8194oOOo0OoO) this).f21273OooO00o;
            if (oooo0ooo != null) {
                oooo0ooo.m20005OooO00o();
            }
            OooO00o();
            C8331oOoOO0o ooooo0o = this.f21250OooO00o;
            YAxis yAxis = this.f21247OooO00o;
            ooooo0o.OooO00o(((AbstractC8201oOOo0oO0) yAxis).OooOO0, ((AbstractC8201oOOo0oO0) yAxis).OooO, yAxis.OooOOOo());
            C8331oOoOO0o ooooo0o2 = this.f21256OooO0O0;
            YAxis yAxis2 = this.f21255OooO0O0;
            ooooo0o2.OooO00o(((AbstractC8201oOOo0oO0) yAxis2).OooOO0, ((AbstractC8201oOOo0oO0) yAxis2).OooO, yAxis2.OooOOOo());
            C8329oOoOO0OO ooooo0oo = this.f21249OooO00o;
            XAxis xAxis = ((AbstractC8194oOOo0OoO) this).f21263OooO00o;
            ooooo0oo.OooO00o(((AbstractC8201oOOo0oO0) xAxis).OooOO0, ((AbstractC8201oOOo0oO0) xAxis).OooO, false);
            if (((AbstractC8194oOOo0OoO) this).f21262OooO00o != null) {
                ((AbstractC8194oOOo0OoO) this).f21274OooO00o.OooO00o(((AbstractC8194oOOo0OoO) this).f21268OooO00o);
            }
            OooO0O0();
        } else if (((AbstractC8194oOOo0OoO) this).f21278OooO0O0) {
            Log.i(AbstractC8194oOOo0OoO.f21261o0ooOoO, "Preparing... DATA NOT SET.");
        }
    }

    @Override // com.p118pd.sdk.AbstractC8194oOOo0OoO
    public void OooO00o() {
        ((AbstractC8194oOOo0OoO) this).f21263OooO00o.OooO00o(((AbstractC8211oOOoO0oO) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO0O0(), ((AbstractC8211oOOoO0oO) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO00o());
        this.f21247OooO00o.OooO00o(((AbstractC8211oOOoO0oO) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO0O0(YAxis.AxisDependency.LEFT), ((AbstractC8211oOOoO0oO) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO00o(YAxis.AxisDependency.LEFT));
        this.f21255OooO0O0.OooO00o(((AbstractC8211oOOoO0oO) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO0O0(YAxis.AxisDependency.RIGHT), ((AbstractC8211oOOoO0oO) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO00o(YAxis.AxisDependency.RIGHT));
    }

    @Override // com.p118pd.sdk.AbstractC8194oOOo0OoO
    public void OooO0O0() {
        if (!this.OooOo0) {
            OooO00o(this.f21246OooO00o);
            RectF rectF = this.f21246OooO00o;
            float f = rectF.left + 0.0f;
            float f2 = rectF.top + 0.0f;
            float f3 = rectF.right + 0.0f;
            float f4 = rectF.bottom + 0.0f;
            if (this.f21247OooO00o.OooOOo0()) {
                f += this.f21247OooO00o.OooO0O0(this.f21250OooO00o.OooO00o());
            }
            if (this.f21255OooO0O0.OooOOo0()) {
                f3 += this.f21255OooO0O0.OooO0O0(this.f21256OooO0O0.OooO00o());
            }
            if (((AbstractC8194oOOo0OoO) this).f21263OooO00o.m19855OooO00o() && ((AbstractC8194oOOo0OoO) this).f21263OooO00o.m19873OooO0oo()) {
                XAxis xAxis = ((AbstractC8194oOOo0OoO) this).f21263OooO00o;
                float OooO0OO2 = ((float) xAxis.OooOO0) + xAxis.OooO0OO();
                if (((AbstractC8194oOOo0OoO) this).f21263OooO00o.OooO00o() == XAxis.XAxisPosition.BOTTOM) {
                    f4 += OooO0OO2;
                } else {
                    if (((AbstractC8194oOOo0OoO) this).f21263OooO00o.OooO00o() != XAxis.XAxisPosition.TOP) {
                        if (((AbstractC8194oOOo0OoO) this).f21263OooO00o.OooO00o() == XAxis.XAxisPosition.BOTH_SIDED) {
                            f4 += OooO0OO2;
                        }
                    }
                    f2 += OooO0OO2;
                }
            }
            float extraTopOffset = f2 + getExtraTopOffset();
            float extraRightOffset = f3 + getExtraRightOffset();
            float extraBottomOffset = f4 + getExtraBottomOffset();
            float extraLeftOffset = f + getExtraLeftOffset();
            float OooO00o2 = AbstractC8352oOoOOoO0.OooO00o(this.OooOO0);
            ((AbstractC8194oOOo0OoO) this).f21275OooO00o.m20030OooO00o(Math.max(OooO00o2, extraLeftOffset), Math.max(OooO00o2, extraTopOffset), Math.max(OooO00o2, extraRightOffset), Math.max(OooO00o2, extraBottomOffset));
            if (((AbstractC8194oOOo0OoO) this).f21278OooO0O0) {
                Log.i(AbstractC8194oOOo0OoO.f21261o0ooOoO, "offsetLeft: " + extraLeftOffset + ", offsetTop: " + extraTopOffset + ", offsetRight: " + extraRightOffset + ", offsetBottom: " + extraBottomOffset);
                StringBuilder sb = new StringBuilder();
                sb.append("Content: ");
                sb.append(((AbstractC8194oOOo0OoO) this).f21275OooO00o.m20027OooO00o().toString());
                Log.i(AbstractC8194oOOo0OoO.f21261o0ooOoO, sb.toString());
            }
        }
        OooOO0o();
        OooOOO0();
    }

    public void OooO0OO(Canvas canvas) {
        if (this.OooOOo0) {
            canvas.drawRect(((AbstractC8194oOOo0OoO) this).f21275OooO00o.m20027OooO00o(), this.OooO0OO);
        }
        if (this.OooOOo) {
            canvas.drawRect(((AbstractC8194oOOo0OoO) this).f21275OooO00o.m20027OooO00o(), this.OooO0Oo);
        }
    }

    public void OooO0Oo(float f, float f2) {
        C8349oOoOOo00 centerOffsets = getCenterOffsets();
        Matrix matrix = this.f21245OooO00o;
        ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO00o(f, f2, centerOffsets.f21456OooO00o, -centerOffsets.OooO0O0, matrix);
        ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO00o(matrix, (View) this, false);
    }

    @Override // com.p118pd.sdk.AbstractC8194oOOo0OoO, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public void OooO0oo() {
        super.OooO0oo();
        this.f21247OooO00o = new YAxis(YAxis.AxisDependency.LEFT);
        this.f21255OooO0O0 = new YAxis(YAxis.AxisDependency.RIGHT);
        this.f21252OooO00o = new C8351oOoOOo0o(((AbstractC8194oOOo0OoO) this).f21275OooO00o);
        this.f21258OooO0O0 = new C8351oOoOOo0o(((AbstractC8194oOOo0OoO) this).f21275OooO00o);
        this.f21250OooO00o = new C8331oOoOO0o(((AbstractC8194oOOo0OoO) this).f21275OooO00o, this.f21247OooO00o, this.f21252OooO00o);
        this.f21256OooO0O0 = new C8331oOoOO0o(((AbstractC8194oOOo0OoO) this).f21275OooO00o, this.f21255OooO0O0, this.f21258OooO0O0);
        this.f21249OooO00o = new C8329oOoOO0OO(((AbstractC8194oOOo0OoO) this).f21275OooO00o, ((AbstractC8194oOOo0OoO) this).f21263OooO00o, this.f21252OooO00o);
        setHighlighter(new C8244oOOoo0Oo(this));
        ((AbstractC8194oOOo0OoO) this).f21264OooO00o = new C8288oOo00OO(this, ((AbstractC8194oOOo0OoO) this).f21275OooO00o.m20034OooO0O0(), 3.0f);
        Paint paint = new Paint();
        this.OooO0OO = paint;
        paint.setStyle(Paint.Style.FILL);
        this.OooO0OO.setColor(Color.rgb(240, 240, 240));
        Paint paint2 = new Paint();
        this.OooO0Oo = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.OooO0Oo.setColor(-16777216);
        this.OooO0Oo.setStrokeWidth(AbstractC8352oOoOOoO0.OooO00o(1.0f));
    }

    @Override // com.p118pd.sdk.AbstractC8194oOOo0OoO
    public void OooOO0() {
        ((AbstractC8211oOOoO0oO) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO00o(getLowestVisibleX(), getHighestVisibleX());
        ((AbstractC8194oOOo0OoO) this).f21263OooO00o.OooO00o(((AbstractC8211oOOoO0oO) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO0O0(), ((AbstractC8211oOOoO0oO) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO00o());
        if (this.f21247OooO00o.m19855OooO00o()) {
            this.f21247OooO00o.OooO00o(((AbstractC8211oOOoO0oO) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO0O0(YAxis.AxisDependency.LEFT), ((AbstractC8211oOOoO0oO) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO00o(YAxis.AxisDependency.LEFT));
        }
        if (this.f21255OooO0O0.m19855OooO00o()) {
            this.f21255OooO0O0.OooO00o(((AbstractC8211oOOoO0oO) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO0O0(YAxis.AxisDependency.RIGHT), ((AbstractC8211oOOoO0oO) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO00o(YAxis.AxisDependency.RIGHT));
        }
        OooO0O0();
    }

    public void OooOO0O() {
        Matrix matrix = this.f21254OooO0O0;
        ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO00o(matrix);
        ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO00o(matrix, (View) this, false);
        OooO0O0();
        postInvalidate();
    }

    public void OooOO0o() {
        this.f21258OooO0O0.OooO00o(this.f21255OooO0O0.OooOOOo());
        this.f21252OooO00o.OooO00o(this.f21247OooO00o.OooOOOo());
    }

    public void OooOOO() {
        this.OooO00o = 0;
        this.OooO0O0 = 0;
    }

    public void OooOOO0() {
        if (((AbstractC8194oOOo0OoO) this).f21278OooO0O0) {
            Log.i(AbstractC8194oOOo0OoO.f21261o0ooOoO, "Preparing Value-Px Matrix, xmin: " + ((AbstractC8201oOOo0oO0) ((AbstractC8194oOOo0OoO) this).f21263OooO00o).OooOO0 + ", xmax: " + ((AbstractC8201oOOo0oO0) ((AbstractC8194oOOo0OoO) this).f21263OooO00o).OooO + ", xdelta: " + ((AbstractC8201oOOo0oO0) ((AbstractC8194oOOo0OoO) this).f21263OooO00o).OooOO0O);
        }
        C8351oOoOOo0o oooooo0o = this.f21258OooO0O0;
        XAxis xAxis = ((AbstractC8194oOOo0OoO) this).f21263OooO00o;
        float f = ((AbstractC8201oOOo0oO0) xAxis).OooOO0;
        float f2 = ((AbstractC8201oOOo0oO0) xAxis).OooOO0O;
        YAxis yAxis = this.f21255OooO0O0;
        oooooo0o.OooO00o(f, f2, ((AbstractC8201oOOo0oO0) yAxis).OooOO0O, ((AbstractC8201oOOo0oO0) yAxis).OooOO0);
        C8351oOoOOo0o oooooo0o2 = this.f21252OooO00o;
        XAxis xAxis2 = ((AbstractC8194oOOo0OoO) this).f21263OooO00o;
        float f3 = ((AbstractC8201oOOo0oO0) xAxis2).OooOO0;
        float f4 = ((AbstractC8201oOOo0oO0) xAxis2).OooOO0O;
        YAxis yAxis2 = this.f21247OooO00o;
        oooooo0o2.OooO00o(f3, f4, ((AbstractC8201oOOo0oO0) yAxis2).OooOO0O, ((AbstractC8201oOOo0oO0) yAxis2).OooOO0);
    }

    public void OooOOOO() {
        this.OooOo0 = false;
        OooO0O0();
    }

    public void OooOOOo() {
        ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0O0(this.f21245OooO00o);
        ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO00o(this.f21245OooO00o, (View) this, false);
        OooO0O0();
        postInvalidate();
    }

    public void OooOOo() {
        C8349oOoOOo00 OooO00o2 = ((AbstractC8194oOOo0OoO) this).f21275OooO00o.m20028OooO00o();
        ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0Oo(OooO00o2.f21456OooO00o, -OooO00o2.OooO0O0, this.f21245OooO00o);
        ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO00o(this.f21245OooO00o, (View) this, false);
        C8349oOoOOo00.m20016OooO00o(OooO00o2);
        OooO0O0();
        postInvalidate();
    }

    public void OooOOo0() {
        C8349oOoOOo00 OooO00o2 = ((AbstractC8194oOOo0OoO) this).f21275OooO00o.m20028OooO00o();
        ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0OO(OooO00o2.f21456OooO00o, -OooO00o2.OooO0O0, this.f21245OooO00o);
        ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO00o(this.f21245OooO00o, (View) this, false);
        C8349oOoOOo00.m20016OooO00o(OooO00o2);
        OooO0O0();
        postInvalidate();
    }

    public boolean OooOOoo() {
        return this.OooOOo;
    }

    public boolean OooOo() {
        return this.OooOOOO;
    }

    public boolean OooOo0() {
        return this.OooOO0o;
    }

    public boolean OooOo00() {
        return ((AbstractC8194oOOo0OoO) this).f21275OooO00o.m20047OooO0oO();
    }

    public boolean OooOo0O() {
        return this.OooOo00;
    }

    public boolean OooOo0o() {
        return this.f21260OooOO0;
    }

    public boolean OooOoO0() {
        return this.OooOOOo;
    }

    public void computeScroll() {
        ChartTouchListener chartTouchListener = ((AbstractC8194oOOo0OoO) this).f21264OooO00o;
        if (chartTouchListener instanceof C8288oOo00OO) {
            ((C8288oOo00OO) chartTouchListener).m19990OooO00o();
        }
    }

    public YAxis getAxisLeft() {
        return this.f21247OooO00o;
    }

    public YAxis getAxisRight() {
        return this.f21255OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC8253oOOooOO, com.p118pd.sdk.AbstractC8257oOOooOo0, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public /* bridge */ /* synthetic */ AbstractC8211oOOoO0oO getData() {
        return (AbstractC8211oOOoO0oO) super.getData();
    }

    public AbstractC8300oOo00oO getDrawListener() {
        return this.f21248OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC8253oOOooOO
    public float getHighestVisibleX() {
        m19830OooO00o(YAxis.AxisDependency.LEFT).OooO00o(((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0Oo(), ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO00o(), this.f21257OooO0O0);
        return (float) Math.min((double) ((AbstractC8201oOOo0oO0) ((AbstractC8194oOOo0OoO) this).f21263OooO00o).OooO, this.f21257OooO0O0.f21451OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC8253oOOooOO
    public float getLowestVisibleX() {
        m19830OooO00o(YAxis.AxisDependency.LEFT).OooO00o(((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0OO(), ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO00o(), this.f21251OooO00o);
        return (float) Math.max((double) ((AbstractC8201oOOo0oO0) ((AbstractC8194oOOo0OoO) this).f21263OooO00o).OooOO0, this.f21251OooO00o.f21451OooO00o);
    }

    @Override // com.p118pd.sdk.AbstractC8257oOOooOo0
    public int getMaxVisibleCount() {
        return this.o0OO00O;
    }

    public float getMinOffset() {
        return this.OooOO0;
    }

    public C8331oOoOO0o getRendererLeftYAxis() {
        return this.f21250OooO00o;
    }

    public C8331oOoOO0o getRendererRightYAxis() {
        return this.f21256OooO0O0;
    }

    public C8329oOoOO0OO getRendererXAxis() {
        return this.f21249OooO00o;
    }

    public float getScaleX() {
        C8353oOoOOoOO oooooooo = ((AbstractC8194oOOo0OoO) this).f21275OooO00o;
        if (oooooooo == null) {
            return 1.0f;
        }
        return oooooooo.OooOOO0();
    }

    public float getScaleY() {
        C8353oOoOOoOO oooooooo = ((AbstractC8194oOOo0OoO) this).f21275OooO00o;
        if (oooooooo == null) {
            return 1.0f;
        }
        return oooooooo.OooOOO();
    }

    public float getVisibleXRange() {
        return Math.abs(getHighestVisibleX() - getLowestVisibleX());
    }

    @Override // com.p118pd.sdk.AbstractC8257oOOooOo0
    public float getYChartMax() {
        return Math.max(((AbstractC8201oOOo0oO0) this.f21247OooO00o).OooO, ((AbstractC8201oOOo0oO0) this.f21255OooO0O0).OooO);
    }

    @Override // com.p118pd.sdk.AbstractC8257oOOooOo0
    public float getYChartMin() {
        return Math.min(((AbstractC8201oOOo0oO0) this.f21247OooO00o).OooOO0, ((AbstractC8201oOOo0oO0) this.f21255OooO0O0).OooOO0);
    }

    @Override // com.p118pd.sdk.AbstractC8194oOOo0OoO
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (((AbstractC8194oOOo0OoO) this).f21268OooO00o != null) {
            long currentTimeMillis = System.currentTimeMillis();
            OooO0OO(canvas);
            if (this.OooO) {
                OooOO0();
            }
            if (this.f21247OooO00o.m19855OooO00o()) {
                C8331oOoOO0o ooooo0o = this.f21250OooO00o;
                YAxis yAxis = this.f21247OooO00o;
                ooooo0o.OooO00o(((AbstractC8201oOOo0oO0) yAxis).OooOO0, ((AbstractC8201oOOo0oO0) yAxis).OooO, yAxis.OooOOOo());
            }
            if (this.f21255OooO0O0.m19855OooO00o()) {
                C8331oOoOO0o ooooo0o2 = this.f21256OooO0O0;
                YAxis yAxis2 = this.f21255OooO0O0;
                ooooo0o2.OooO00o(((AbstractC8201oOOo0oO0) yAxis2).OooOO0, ((AbstractC8201oOOo0oO0) yAxis2).OooO, yAxis2.OooOOOo());
            }
            if (((AbstractC8194oOOo0OoO) this).f21263OooO00o.m19855OooO00o()) {
                C8329oOoOO0OO ooooo0oo = this.f21249OooO00o;
                XAxis xAxis = ((AbstractC8194oOOo0OoO) this).f21263OooO00o;
                ooooo0oo.OooO00o(((AbstractC8201oOOo0oO0) xAxis).OooOO0, ((AbstractC8201oOOo0oO0) xAxis).OooO, false);
            }
            this.f21249OooO00o.OooO0O0(canvas);
            this.f21250OooO00o.OooO0O0(canvas);
            this.f21256OooO0O0.OooO0O0(canvas);
            this.f21249OooO00o.OooO0OO(canvas);
            this.f21250OooO00o.OooO0OO(canvas);
            this.f21256OooO0O0.OooO0OO(canvas);
            if (((AbstractC8194oOOo0OoO) this).f21263OooO00o.m19855OooO00o() && ((AbstractC8194oOOo0OoO) this).f21263OooO00o.m19856OooO()) {
                this.f21249OooO00o.OooO0Oo(canvas);
            }
            if (this.f21247OooO00o.m19855OooO00o() && this.f21247OooO00o.m19856OooO()) {
                this.f21250OooO00o.OooO0Oo(canvas);
            }
            if (this.f21255OooO0O0.m19855OooO00o() && this.f21255OooO0O0.m19856OooO()) {
                this.f21256OooO0O0.OooO0Oo(canvas);
            }
            int save = canvas.save();
            canvas.clipRect(((AbstractC8194oOOo0OoO) this).f21275OooO00o.m20027OooO00o());
            ((AbstractC8194oOOo0OoO) this).f21273OooO00o.OooO00o(canvas);
            if (OooOO0()) {
                ((AbstractC8194oOOo0OoO) this).f21273OooO00o.OooO00o(canvas, ((AbstractC8194oOOo0OoO) this).f21277OooO00o);
            }
            canvas.restoreToCount(save);
            ((AbstractC8194oOOo0OoO) this).f21273OooO00o.OooO0O0(canvas);
            if (((AbstractC8194oOOo0OoO) this).f21263OooO00o.m19855OooO00o() && !((AbstractC8194oOOo0OoO) this).f21263OooO00o.m19856OooO()) {
                this.f21249OooO00o.OooO0Oo(canvas);
            }
            if (this.f21247OooO00o.m19855OooO00o() && !this.f21247OooO00o.m19856OooO()) {
                this.f21250OooO00o.OooO0Oo(canvas);
            }
            if (this.f21255OooO0O0.m19855OooO00o() && !this.f21255OooO0O0.m19856OooO()) {
                this.f21256OooO0O0.OooO0Oo(canvas);
            }
            this.f21249OooO00o.OooO00o(canvas);
            this.f21250OooO00o.OooO00o(canvas);
            this.f21256OooO0O0.OooO00o(canvas);
            if (m19836OooOOO()) {
                int save2 = canvas.save();
                canvas.clipRect(((AbstractC8194oOOo0OoO) this).f21275OooO00o.m20027OooO00o());
                ((AbstractC8194oOOo0OoO) this).f21273OooO00o.OooO0OO(canvas);
                canvas.restoreToCount(save2);
            } else {
                ((AbstractC8194oOOo0OoO) this).f21273OooO00o.OooO0OO(canvas);
            }
            ((AbstractC8194oOOo0OoO) this).f21274OooO00o.OooO00o(canvas);
            OooO00o(canvas);
            OooO0O0(canvas);
            if (((AbstractC8194oOOo0OoO) this).f21278OooO0O0) {
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                long j = this.OooO00o + currentTimeMillis2;
                this.OooO00o = j;
                long j2 = this.OooO0O0 + 1;
                this.OooO0O0 = j2;
                Log.i(AbstractC8194oOOo0OoO.f21261o0ooOoO, "Drawtime: " + currentTimeMillis2 + " ms, average: " + (j / j2) + " ms, cycles: " + this.OooO0O0);
            }
        }
    }

    @Override // com.p118pd.sdk.AbstractC8194oOOo0OoO
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        float[] fArr = this.f21259OooO0O0;
        fArr[1] = 0.0f;
        fArr[0] = 0.0f;
        if (this.OooOo00) {
            fArr[0] = ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0OO();
            this.f21259OooO0O0[1] = ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0o0();
            m19830OooO00o(YAxis.AxisDependency.LEFT).OooO00o(this.f21259OooO0O0);
        }
        super.onSizeChanged(i, i2, i3, i4);
        if (this.OooOo00) {
            m19830OooO00o(YAxis.AxisDependency.LEFT).OooO0O0(this.f21259OooO0O0);
            ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO00o(this.f21259OooO0O0, this);
            return;
        }
        C8353oOoOOoOO oooooooo = ((AbstractC8194oOOo0OoO) this).f21275OooO00o;
        oooooooo.OooO00o(oooooooo.m20034OooO0O0(), (View) this, true);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        ChartTouchListener chartTouchListener = ((AbstractC8194oOOo0OoO) this).f21264OooO00o;
        if (chartTouchListener == null || ((AbstractC8194oOOo0OoO) this).f21268OooO00o == null || !((AbstractC8194oOOo0OoO) this).f21281OooO0o0) {
            return false;
        }
        return chartTouchListener.onTouch(this, motionEvent);
    }

    public void setAutoScaleMinMaxEnabled(boolean z) {
        this.OooO = z;
    }

    public void setBorderColor(int i) {
        this.OooO0Oo.setColor(i);
    }

    public void setBorderWidth(float f) {
        this.OooO0Oo.setStrokeWidth(AbstractC8352oOoOOoO0.OooO00o(f));
    }

    public void setClipValuesToContent(boolean z) {
        this.OooOOoo = z;
    }

    public void setDoubleTapToZoomEnabled(boolean z) {
        this.OooOO0O = z;
    }

    public void setDragEnabled(boolean z) {
        this.OooOOO0 = z;
        this.OooOOO = z;
    }

    public void setDragOffsetX(float f) {
        ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO00o(f);
    }

    public void setDragOffsetY(float f) {
        ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0O0(f);
    }

    public void setDragXEnabled(boolean z) {
        this.OooOOO0 = z;
    }

    public void setDragYEnabled(boolean z) {
        this.OooOOO = z;
    }

    public void setDrawBorders(boolean z) {
        this.OooOOo = z;
    }

    public void setDrawGridBackground(boolean z) {
        this.OooOOo0 = z;
    }

    public void setGridBackgroundColor(int i) {
        this.OooO0OO.setColor(i);
    }

    public void setHighlightPerDragEnabled(boolean z) {
        this.OooOO0o = z;
    }

    public void setKeepPositionOnRotation(boolean z) {
        this.OooOo00 = z;
    }

    public void setMaxVisibleValueCount(int i) {
        this.o0OO00O = i;
    }

    public void setMinOffset(float f) {
        this.OooOO0 = f;
    }

    public void setOnDrawListener(AbstractC8300oOo00oO ooo00oo) {
        this.f21248OooO00o = ooo00oo;
    }

    public void setPinchZoom(boolean z) {
        this.f21260OooOO0 = z;
    }

    public void setRendererLeftYAxis(C8331oOoOO0o ooooo0o) {
        this.f21250OooO00o = ooooo0o;
    }

    public void setRendererRightYAxis(C8331oOoOO0o ooooo0o) {
        this.f21256OooO0O0 = ooooo0o;
    }

    public void setScaleEnabled(boolean z) {
        this.OooOOOO = z;
        this.OooOOOo = z;
    }

    public void setScaleXEnabled(boolean z) {
        this.OooOOOO = z;
    }

    public void setScaleYEnabled(boolean z) {
        this.OooOOOo = z;
    }

    public void setVisibleXRangeMaximum(float f) {
        ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0o0(((AbstractC8201oOOo0oO0) ((AbstractC8194oOOo0OoO) this).f21263OooO00o).OooOO0O / f);
    }

    public void setVisibleXRangeMinimum(float f) {
        ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0OO(((AbstractC8201oOOo0oO0) ((AbstractC8194oOOo0OoO) this).f21263OooO00o).OooOO0O / f);
    }

    public void setXAxisRenderer(C8329oOoOO0OO ooooo0oo) {
        this.f21249OooO00o = ooooo0oo;
    }

    /* renamed from: OooOO0o  reason: collision with other method in class */
    public boolean m19835OooOO0o() {
        if (!this.f21247OooO00o.OooOOOo() && !this.f21255OooO0O0.OooOOOo()) {
            return false;
        }
        return true;
    }

    /* renamed from: OooOOO  reason: collision with other method in class */
    public boolean m19836OooOOO() {
        return this.OooOOoo;
    }

    /* renamed from: OooOOOO  reason: collision with other method in class */
    public boolean m19838OooOOOO() {
        return this.OooOO0O;
    }

    public void OooO00o(RectF rectF) {
        rectF.left = 0.0f;
        rectF.right = 0.0f;
        rectF.top = 0.0f;
        rectF.bottom = 0.0f;
        Legend legend = ((AbstractC8194oOOo0OoO) this).f21262OooO00o;
        if (legend != null && legend.m19855OooO00o() && !((AbstractC8194oOOo0OoO) this).f21262OooO00o.m15065OooO0O0()) {
            int i = OooO0O0.OooO0OO[((AbstractC8194oOOo0OoO) this).f21262OooO00o.m15057OooO00o().ordinal()];
            if (i == 1) {
                int i2 = OooO0O0.OooO0O0[((AbstractC8194oOOo0OoO) this).f21262OooO00o.m15056OooO00o().ordinal()];
                if (i2 == 1) {
                    rectF.left += Math.min(((AbstractC8194oOOo0OoO) this).f21262OooO00o.OooOO0O, ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0oo() * ((AbstractC8194oOOo0OoO) this).f21262OooO00o.OooO0oO()) + ((AbstractC8194oOOo0OoO) this).f21262OooO00o.OooO0O0();
                } else if (i2 == 2) {
                    rectF.right += Math.min(((AbstractC8194oOOo0OoO) this).f21262OooO00o.OooOO0O, ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0oo() * ((AbstractC8194oOOo0OoO) this).f21262OooO00o.OooO0oO()) + ((AbstractC8194oOOo0OoO) this).f21262OooO00o.OooO0O0();
                } else if (i2 == 3) {
                    int i3 = OooO0O0.OooO00o[((AbstractC8194oOOo0OoO) this).f21262OooO00o.m15059OooO00o().ordinal()];
                    if (i3 == 1) {
                        rectF.top += Math.min(((AbstractC8194oOOo0OoO) this).f21262OooO00o.OooOO0o, ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0oO() * ((AbstractC8194oOOo0OoO) this).f21262OooO00o.OooO0oO()) + ((AbstractC8194oOOo0OoO) this).f21262OooO00o.OooO0OO();
                    } else if (i3 == 2) {
                        rectF.bottom += Math.min(((AbstractC8194oOOo0OoO) this).f21262OooO00o.OooOO0o, ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0oO() * ((AbstractC8194oOOo0OoO) this).f21262OooO00o.OooO0oO()) + ((AbstractC8194oOOo0OoO) this).f21262OooO00o.OooO0OO();
                    }
                }
            } else if (i == 2) {
                int i4 = OooO0O0.OooO00o[((AbstractC8194oOOo0OoO) this).f21262OooO00o.m15059OooO00o().ordinal()];
                if (i4 == 1) {
                    rectF.top += Math.min(((AbstractC8194oOOo0OoO) this).f21262OooO00o.OooOO0o, ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0oO() * ((AbstractC8194oOOo0OoO) this).f21262OooO00o.OooO0oO()) + ((AbstractC8194oOOo0OoO) this).f21262OooO00o.OooO0OO();
                    if (getXAxis().m19855OooO00o() && getXAxis().m19873OooO0oo()) {
                        rectF.top += (float) getXAxis().OooOO0;
                    }
                } else if (i4 == 2) {
                    rectF.bottom += Math.min(((AbstractC8194oOOo0OoO) this).f21262OooO00o.OooOO0o, ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0oO() * ((AbstractC8194oOOo0OoO) this).f21262OooO00o.OooO0oO()) + ((AbstractC8194oOOo0OoO) this).f21262OooO00o.OooO0OO();
                    if (getXAxis().m19855OooO00o() && getXAxis().m19873OooO0oo()) {
                        rectF.bottom += (float) getXAxis().OooOO0;
                    }
                }
            }
        }
    }

    public void OooO0OO(float f, float f2, float f3, float f4) {
        ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO00o(f, f2, f3, -f4, this.f21245OooO00o);
        ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO00o(this.f21245OooO00o, (View) this, false);
        OooO0O0();
        postInvalidate();
    }

    /* renamed from: OooOOO0  reason: collision with other method in class */
    public boolean m19837OooOOO0() {
        return this.OooO;
    }

    /* renamed from: OooOOOo  reason: collision with other method in class */
    public boolean m19839OooOOOo() {
        return this.OooOOO0 || this.OooOOO;
    }

    /* renamed from: OooOO0O  reason: collision with other method in class */
    public boolean m19834OooOO0O() {
        return ((AbstractC8194oOOo0OoO) this).f21275OooO00o.m20043OooO0o();
    }

    /* renamed from: OooOOo  reason: collision with other method in class */
    public boolean m19840OooOOo() {
        return this.OooOOO;
    }

    /* renamed from: OooOOo0  reason: collision with other method in class */
    public boolean m19841OooOOo0() {
        return this.OooOOO0;
    }

    public void OooO0OO(float f, float f2) {
        float f3 = ((AbstractC8201oOOo0oO0) ((AbstractC8194oOOo0OoO) this).f21263OooO00o).OooOO0O;
        ((AbstractC8194oOOo0OoO) this).f21275OooO00o.m20035OooO0O0(f3 / f, f3 / f2);
    }

    public void OooO0OO(float f, YAxis.AxisDependency axisDependency) {
        ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0Oo(OooO00o(axisDependency) / f);
    }

    public void OooO0OO(float f, float f2, YAxis.AxisDependency axisDependency) {
        ((AbstractC8194oOOo0OoO) this).f21275OooO00o.m20038OooO0OO(OooO00o(axisDependency) / f, OooO00o(axisDependency) / f2);
    }

    public AbstractC8191oOOo0OOo(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.o0OO00O = 100;
        this.OooO = false;
        this.f21260OooOO0 = false;
        this.OooOO0O = true;
        this.OooOO0o = true;
        this.OooOOO0 = true;
        this.OooOOO = true;
        this.OooOOOO = true;
        this.OooOOOo = true;
        this.OooOOo0 = false;
        this.OooOOo = false;
        this.OooOOoo = false;
        this.OooOO0 = 15.0f;
        this.OooOo00 = false;
        this.OooO00o = 0;
        this.OooO0O0 = 0;
        this.f21246OooO00o = new RectF();
        this.f21245OooO00o = new Matrix();
        this.f21254OooO0O0 = new Matrix();
        this.OooOo0 = false;
        this.f21253OooO00o = new float[2];
        this.f21251OooO00o = C8346oOoOOOoo.OooO00o(AbstractC8352oOoOOoO0.OooO0O0, AbstractC8352oOoOOoO0.OooO0O0);
        this.f21257OooO0O0 = C8346oOoOOOoo.OooO00o(AbstractC8352oOoOOoO0.OooO0O0, AbstractC8352oOoOOoO0.OooO0O0);
        this.f21259OooO0O0 = new float[2];
    }

    public void OooO0O0(float f, float f2) {
        ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0o0(f);
        ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0o(f2);
    }

    public void OooO0O0(float f, YAxis.AxisDependency axisDependency) {
        ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0o(OooO00o(axisDependency) / f);
    }

    /* renamed from: OooO0O0  reason: collision with other method in class */
    public void m19833OooO0O0(float f, float f2, YAxis.AxisDependency axisDependency) {
        OooO00o(C8280oOo000o.OooO00o(((AbstractC8194oOOo0OoO) this).f21275OooO00o, f, f2 + ((OooO00o(axisDependency) / ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooOOO()) / 2.0f), m19830OooO00o(axisDependency), this));
    }

    @Override // com.p118pd.sdk.AbstractC8253oOOooOO, com.p118pd.sdk.AbstractC8253oOOooOO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public C8351oOoOOo0o m19830OooO00o(YAxis.AxisDependency axisDependency) {
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            return this.f21252OooO00o;
        }
        return this.f21258OooO0O0;
    }

    public void OooO00o(float f, float f2, float f3, float f4, YAxis.AxisDependency axisDependency) {
        OooO00o(C8284oOo00O.OooO00o(((AbstractC8194oOOo0OoO) this).f21275OooO00o, f, f2, f3, f4, m19830OooO00o(axisDependency), axisDependency, this));
    }

    @TargetApi(11)
    public void OooO0O0(float f, float f2, YAxis.AxisDependency axisDependency, long j) {
        if (Build.VERSION.SDK_INT >= 11) {
            C8346oOoOOOoo OooO0O02 = OooO0O0(((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0OO(), ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0o0(), axisDependency);
            OooO00o(C8273oOo0000.OooO00o(((AbstractC8194oOOo0OoO) this).f21275OooO00o, f, f2 + ((OooO00o(axisDependency) / ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooOOO()) / 2.0f), m19830OooO00o(axisDependency), this, (float) OooO0O02.f21451OooO00o, (float) OooO0O02.OooO0O0, j));
            C8346oOoOOOoo.OooO00o(OooO0O02);
        }
    }

    @TargetApi(11)
    public void OooO00o(float f, float f2, float f3, float f4, YAxis.AxisDependency axisDependency, long j) {
        if (Build.VERSION.SDK_INT >= 11) {
            C8346oOoOOOoo OooO0O02 = OooO0O0(((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0OO(), ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0o0(), axisDependency);
            OooO00o(C8276oOo000O.OooO00o(((AbstractC8194oOOo0OoO) this).f21275OooO00o, this, m19830OooO00o(axisDependency), m19828OooO00o(axisDependency), ((AbstractC8201oOOo0oO0) ((AbstractC8194oOOo0OoO) this).f21263OooO00o).OooOO0O, f, f2, ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooOOO0(), ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooOOO(), f3, f4, (float) OooO0O02.f21451OooO00o, (float) OooO0O02.OooO0O0, j));
            C8346oOoOOOoo.OooO00o(OooO0O02);
        }
    }

    public AbstractC8191oOOo0OOo(Context context) {
        super(context);
        this.o0OO00O = 100;
        this.OooO = false;
        this.f21260OooOO0 = false;
        this.OooOO0O = true;
        this.OooOO0o = true;
        this.OooOOO0 = true;
        this.OooOOO = true;
        this.OooOOOO = true;
        this.OooOOOo = true;
        this.OooOOo0 = false;
        this.OooOOo = false;
        this.OooOOoo = false;
        this.OooOO0 = 15.0f;
        this.OooOo00 = false;
        this.OooO00o = 0;
        this.OooO0O0 = 0;
        this.f21246OooO00o = new RectF();
        this.f21245OooO00o = new Matrix();
        this.f21254OooO0O0 = new Matrix();
        this.OooOo0 = false;
        this.f21253OooO00o = new float[2];
        this.f21251OooO00o = C8346oOoOOOoo.OooO00o(AbstractC8352oOoOOoO0.OooO0O0, AbstractC8352oOoOOoO0.OooO0O0);
        this.f21257OooO0O0 = C8346oOoOOOoo.OooO00o(AbstractC8352oOoOOoO0.OooO0O0, AbstractC8352oOoOOoO0.OooO0O0);
        this.f21259OooO0O0 = new float[2];
    }

    public void OooO00o(float f) {
        OooO00o(C8280oOo000o.OooO00o(((AbstractC8194oOOo0OoO) this).f21275OooO00o, f, 0.0f, m19830OooO00o(YAxis.AxisDependency.LEFT), this));
    }

    public void OooO0O0(float f, float f2, float f3, float f4) {
        this.OooOo0 = true;
        post(new OooO00o(f, f2, f3, f4));
    }

    public C8346oOoOOOoo OooO0O0(float f, float f2, YAxis.AxisDependency axisDependency) {
        C8346oOoOOOoo OooO00o2 = C8346oOoOOOoo.OooO00o(AbstractC8352oOoOOoO0.OooO0O0, AbstractC8352oOoOOoO0.OooO0O0);
        OooO00o(f, f2, axisDependency, OooO00o2);
        return OooO00o2;
    }

    public void OooO00o(float f, YAxis.AxisDependency axisDependency) {
        OooO00o(C8280oOo000o.OooO00o(((AbstractC8194oOOo0OoO) this).f21275OooO00o, 0.0f, f + ((OooO00o(axisDependency) / ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooOOO()) / 2.0f), m19830OooO00o(axisDependency), this));
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19831OooO00o(float f, float f2, YAxis.AxisDependency axisDependency) {
        float OooO00o2 = OooO00o(axisDependency) / ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooOOO();
        OooO00o(C8280oOo000o.OooO00o(((AbstractC8194oOOo0OoO) this).f21275OooO00o, f - ((((AbstractC8201oOOo0oO0) getXAxis()).OooOO0O / ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooOOO0()) / 2.0f), f2 + (OooO00o2 / 2.0f), m19830OooO00o(axisDependency), this));
    }

    @TargetApi(11)
    public void OooO00o(float f, float f2, YAxis.AxisDependency axisDependency, long j) {
        if (Build.VERSION.SDK_INT >= 11) {
            C8346oOoOOOoo OooO0O02 = OooO0O0(((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0OO(), ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooO0o0(), axisDependency);
            float OooO00o2 = OooO00o(axisDependency) / ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooOOO();
            OooO00o(C8273oOo0000.OooO00o(((AbstractC8194oOOo0OoO) this).f21275OooO00o, f - ((((AbstractC8201oOOo0oO0) getXAxis()).OooOO0O / ((AbstractC8194oOOo0OoO) this).f21275OooO00o.OooOOO0()) / 2.0f), f2 + (OooO00o2 / 2.0f), m19830OooO00o(axisDependency), this, (float) OooO0O02.f21451OooO00o, (float) OooO0O02.OooO0O0, j));
            C8346oOoOOOoo.OooO00o(OooO0O02);
        }
    }

    @Override // com.p118pd.sdk.AbstractC8253oOOooOO, com.p118pd.sdk.AbstractC8253oOOooOO
    public float OooO00o(YAxis.AxisDependency axisDependency) {
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            return ((AbstractC8201oOOo0oO0) this.f21247OooO00o).OooOO0O;
        }
        return ((AbstractC8201oOOo0oO0) this.f21255OooO0O0).OooOO0O;
    }

    public C8349oOoOOo00 OooO00o(Entry entry, YAxis.AxisDependency axisDependency) {
        if (entry == null) {
            return null;
        }
        this.f21253OooO00o[0] = entry.OooO0O0();
        this.f21253OooO00o[1] = entry.OooO00o();
        m19830OooO00o(axisDependency).OooO0O0(this.f21253OooO00o);
        float[] fArr = this.f21253OooO00o;
        return C8349oOoOOo00.OooO00o(fArr[0], fArr[1]);
    }

    public void OooO00o(float f, float f2, YAxis.AxisDependency axisDependency, C8346oOoOOOoo oooooooo) {
        m19830OooO00o(axisDependency).OooO00o(f, f2, oooooooo);
    }

    public C8346oOoOOOoo OooO00o(float f, float f2, YAxis.AxisDependency axisDependency) {
        return m19830OooO00o(axisDependency).OooO00o(f, f2);
    }

    @Override // com.p118pd.sdk.AbstractC8194oOOo0OoO, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public Entry OooO00o(float f, float f2) {
        C8246oOOoo0oO OooO00o2 = OooO00o(f, f2);
        if (OooO00o2 != null) {
            return ((AbstractC8211oOOoO0oO) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO00o(OooO00o2);
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC8194oOOo0OoO, com.p118pd.sdk.AbstractC8194oOOo0OoO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public AbstractC8261oOOooo0 m19829OooO00o(float f, float f2) {
        C8246oOOoo0oO OooO00o2 = OooO00o(f, f2);
        if (OooO00o2 != null) {
            return (AbstractC8261oOOooo0) ((AbstractC8211oOOoO0oO) ((AbstractC8194oOOo0OoO) this).f21268OooO00o).OooO00o(OooO00o2.m19936OooO0O0());
        }
        return null;
    }

    @Override // com.p118pd.sdk.AbstractC8253oOOooOO, com.p118pd.sdk.AbstractC8253oOOooOO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public YAxis m19828OooO00o(YAxis.AxisDependency axisDependency) {
        if (axisDependency == YAxis.AxisDependency.LEFT) {
            return this.f21247OooO00o;
        }
        return this.f21255OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC8253oOOooOO, com.p118pd.sdk.AbstractC8253oOOooOO
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m19832OooO00o(YAxis.AxisDependency axisDependency) {
        return m19828OooO00o(axisDependency).OooOOOo();
    }

    @Override // com.p118pd.sdk.AbstractC8194oOOo0OoO
    public void OooO00o(Paint paint, int i) {
        super.OooO00o(paint, i);
        if (i == 4) {
            this.OooO0OO = paint;
        }
    }

    @Override // com.p118pd.sdk.AbstractC8194oOOo0OoO, com.p118pd.sdk.AbstractC8194oOOo0OoO
    public Paint OooO00o(int i) {
        Paint OooO00o2 = super.OooO00o(i);
        if (OooO00o2 != null) {
            return OooO00o2;
        }
        if (i != 4) {
            return null;
        }
        return this.OooO0OO;
    }
}
