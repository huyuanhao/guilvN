package com.p118pd.sdk;

import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.p118pd.sdk.AbstractC8219oOOoOOOo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

@SuppressLint({"NewApi"})
/* renamed from: com.pd.sdk.oOOo0OoO  reason: case insensitive filesystem */
public abstract class AbstractC8194oOOo0OoO<T extends AbstractC8219oOOoOOOo<? extends AbstractC8265oOOoooO0<? extends Entry>>> extends ViewGroup implements AbstractC8257oOOooOo0 {
    public static final int o00oO0O = 4;
    public static final int o0OOO0o = 14;
    public static final int o0Oo0oo = 18;
    public static final int o0ooOO0 = 7;
    public static final int o0ooOOo = 11;
    public static final int o0ooOoO = 13;

    /* renamed from: o0ooOoO  reason: collision with other field name */
    public static final String f21261o0ooOoO = "MPAndroidChart";
    public float OooO = 0.0f;
    public Paint OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Legend f21262OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public XAxis f21263OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ChartTouchListener f21264OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8185oOOo0O0 f21265OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8202oOOo0oOO f21266OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8203oOOo0oOo f21267OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public T f21268OooO00o = null;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8234oOOoOooO f21269OooO00o = new C8234oOOoOooO(0);

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8235oOOoo f21270OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8292oOo00Oo f21271OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8311oOo0o00 f21272OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8321oOoO0ooO f21273OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8319oOoO f21274OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8353oOoOOoOO f21275OooO00o = new C8353oOoOOoOO();

    /* renamed from: OooO00o  reason: collision with other field name */
    public ArrayList<Runnable> f21276OooO00o = new ArrayList<>();

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8246oOOoo0oO[] f21277OooO00o;
    public Paint OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f21278OooO0O0 = false;
    public boolean OooO0OO = true;
    public float OooO0Oo = 0.9f;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public boolean f21279OooO0Oo = true;
    public float OooO0o = 0.0f;

    /* renamed from: OooO0o  reason: collision with other field name */
    public boolean f21280OooO0o = false;
    public float OooO0o0 = 0.0f;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public boolean f21281OooO0o0 = true;
    public float OooO0oO = 0.0f;

    /* renamed from: OooO0oO  reason: collision with other field name */
    public boolean f21282OooO0oO = true;
    public float OooO0oo = 0.0f;

    /* renamed from: OooO0oo  reason: collision with other field name */
    public boolean f21283OooO0oo = false;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public String f21284o0ooOOo = "";

    /* renamed from: com.pd.sdk.oOOo0OoO$OooO00o */
    public class OooO00o implements ValueAnimator.AnimatorUpdateListener {
        public OooO00o() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            AbstractC8194oOOo0OoO.this.postInvalidate();
        }
    }

    /* renamed from: com.pd.sdk.oOOo0OoO$OooO0O0 */
    public static /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] OooO00o;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                android.graphics.Bitmap$CompressFormat[] r0 = android.graphics.Bitmap.CompressFormat.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.p118pd.sdk.AbstractC8194oOOo0OoO.OooO0O0.OooO00o = r0
                android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.p118pd.sdk.AbstractC8194oOOo0OoO.OooO0O0.OooO00o     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.WEBP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.p118pd.sdk.AbstractC8194oOOo0OoO.OooO0O0.OooO00o     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$CompressFormat r1 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.AbstractC8194oOOo0OoO.OooO0O0.<clinit>():void");
        }
    }

    public AbstractC8194oOOo0OoO(Context context) {
        super(context);
        OooO0oo();
    }

    public abstract void OooO();

    /* renamed from: OooO  reason: collision with other method in class */
    public boolean m19842OooO() {
        return this.f21278OooO0O0;
    }

    public abstract void OooO00o();

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19843OooO00o(float f, float f2) {
        float f3;
        T t = this.f21268OooO00o;
        if (t == null || t.m19916OooO0O0() < 2) {
            f3 = Math.max(Math.abs(f), Math.abs(f2));
        } else {
            f3 = Math.abs(f2 - f);
        }
        this.f21269OooO00o.OooO00o(AbstractC8352oOoOOoO0.m20020OooO00o(f3));
    }

    public abstract void OooO0O0();

    public void OooO0O0(Canvas canvas) {
        if (this.f21267OooO00o != null && m19847OooO0o() && OooOO0()) {
            int i = 0;
            while (true) {
                C8246oOOoo0oO[] ooooo0ooArr = this.f21277OooO00o;
                if (i < ooooo0ooArr.length) {
                    C8246oOOoo0oO ooooo0oo = ooooo0ooArr[i];
                    AbstractC8265oOOoooO0 OooO00o2 = this.f21268OooO00o.OooO00o(ooooo0oo.m19936OooO0O0());
                    Entry OooO00o3 = this.f21268OooO00o.OooO00o(this.f21277OooO00o[i]);
                    int OooO00o4 = OooO00o2.OooO00o(OooO00o3);
                    if (OooO00o3 != null && ((float) OooO00o4) <= ((float) OooO00o2.OooO0Oo()) * this.f21265OooO00o.OooO00o()) {
                        float[] OooO00o5 = m19845OooO00o(ooooo0oo);
                        if (this.f21275OooO00o.m20033OooO00o(OooO00o5[0], OooO00o5[1])) {
                            this.f21267OooO00o.OooO00o(OooO00o3, ooooo0oo);
                            this.f21267OooO00o.OooO00o(canvas, OooO00o5[0], OooO00o5[1]);
                        }
                    }
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void OooO0OO() {
        this.f21268OooO00o = null;
        this.f21280OooO0o = false;
        this.f21277OooO00o = null;
        this.f21264OooO00o.OooO00o((C8246oOOoo0oO) null);
        invalidate();
    }

    /* renamed from: OooO0Oo  reason: collision with other method in class */
    public boolean m19846OooO0Oo() {
        return this.f21279OooO0Oo;
    }

    public void OooO0o() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public void OooO0o0() {
        this.f21268OooO00o.m19917OooO0O0();
        invalidate();
    }

    /* renamed from: OooO0oO  reason: collision with other method in class */
    public boolean m19849OooO0oO() {
        T t = this.f21268OooO00o;
        if (t != null && t.m19916OooO0O0() > 0) {
            return false;
        }
        return true;
    }

    public void OooO0oo() {
        setWillNotDraw(false);
        if (Build.VERSION.SDK_INT < 11) {
            this.f21265OooO00o = new C8185oOOo0O0();
        } else {
            this.f21265OooO00o = new C8185oOOo0O0(new OooO00o());
        }
        AbstractC8352oOoOOoO0.OooO00o(getContext());
        this.OooO = AbstractC8352oOoOOoO0.OooO00o(500.0f);
        this.f21266OooO00o = new C8202oOOo0oOO();
        Legend legend = new Legend();
        this.f21262OooO00o = legend;
        this.f21274OooO00o = new C8319oOoO(this.f21275OooO00o, legend);
        this.f21263OooO00o = new XAxis();
        this.OooO00o = new Paint(1);
        Paint paint = new Paint(1);
        this.OooO0O0 = paint;
        paint.setColor(Color.rgb(247, 189, 51));
        this.OooO0O0.setTextAlign(Paint.Align.CENTER);
        this.OooO0O0.setTextSize(AbstractC8352oOoOOoO0.OooO00o(12.0f));
        if (this.f21278OooO0O0) {
            Log.i("", "Chart.init()");
        }
    }

    public boolean OooOO0() {
        C8246oOOoo0oO[] ooooo0ooArr = this.f21277OooO00o;
        return (ooooo0ooArr == null || ooooo0ooArr.length <= 0 || ooooo0ooArr[0] == null) ? false : true;
    }

    public C8185oOOo0O0 getAnimator() {
        return this.f21265OooO00o;
    }

    public C8349oOoOOo00 getCenter() {
        return C8349oOoOOo00.OooO00o(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
    }

    @Override // com.p118pd.sdk.AbstractC8257oOOooOo0
    public C8349oOoOOo00 getCenterOfView() {
        return getCenter();
    }

    @Override // com.p118pd.sdk.AbstractC8257oOOooOo0
    public C8349oOoOOo00 getCenterOffsets() {
        return this.f21275OooO00o.m20028OooO00o();
    }

    public Bitmap getChartBitmap() {
        Bitmap createBitmap = Bitmap.createBitmap(getWidth(), getHeight(), Bitmap.Config.RGB_565);
        Canvas canvas = new Canvas(createBitmap);
        Drawable background = getBackground();
        if (background != null) {
            background.draw(canvas);
        } else {
            canvas.drawColor(-1);
        }
        draw(canvas);
        return createBitmap;
    }

    @Override // com.p118pd.sdk.AbstractC8257oOOooOo0
    public RectF getContentRect() {
        return this.f21275OooO00o.m20027OooO00o();
    }

    @Override // com.p118pd.sdk.AbstractC8257oOOooOo0
    public T getData() {
        return this.f21268OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC8257oOOooOo0
    public AbstractC8239oOOoo00O getDefaultValueFormatter() {
        return this.f21269OooO00o;
    }

    public C8202oOOo0oOO getDescription() {
        return this.f21266OooO00o;
    }

    public float getDragDecelerationFrictionCoef() {
        return this.OooO0Oo;
    }

    public float getExtraBottomOffset() {
        return this.OooO0oO;
    }

    public float getExtraLeftOffset() {
        return this.OooO0oo;
    }

    public float getExtraRightOffset() {
        return this.OooO0o;
    }

    public float getExtraTopOffset() {
        return this.OooO0o0;
    }

    public C8246oOOoo0oO[] getHighlighted() {
        return this.f21277OooO00o;
    }

    public AbstractC8235oOOoo getHighlighter() {
        return this.f21270OooO00o;
    }

    public ArrayList<Runnable> getJobs() {
        return this.f21276OooO00o;
    }

    public Legend getLegend() {
        return this.f21262OooO00o;
    }

    public C8319oOoO getLegendRenderer() {
        return this.f21274OooO00o;
    }

    public AbstractC8203oOOo0oOo getMarker() {
        return this.f21267OooO00o;
    }

    @Deprecated
    public AbstractC8203oOOo0oOo getMarkerView() {
        return getMarker();
    }

    @Override // com.p118pd.sdk.AbstractC8257oOOooOo0
    public float getMaxHighlightDistance() {
        return this.OooO;
    }

    public AbstractC8311oOo0o00 getOnChartGestureListener() {
        return this.f21272OooO00o;
    }

    public ChartTouchListener getOnTouchListener() {
        return this.f21264OooO00o;
    }

    public AbstractC8321oOoO0ooO getRenderer() {
        return this.f21273OooO00o;
    }

    public C8353oOoOOoOO getViewPortHandler() {
        return this.f21275OooO00o;
    }

    public XAxis getXAxis() {
        return this.f21263OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC8257oOOooOo0
    public float getXChartMax() {
        return ((AbstractC8201oOOo0oO0) this.f21263OooO00o).OooO;
    }

    @Override // com.p118pd.sdk.AbstractC8257oOOooOo0
    public float getXChartMin() {
        return ((AbstractC8201oOOo0oO0) this.f21263OooO00o).OooOO0;
    }

    @Override // com.p118pd.sdk.AbstractC8257oOOooOo0
    public float getXRange() {
        return ((AbstractC8201oOOo0oO0) this.f21263OooO00o).OooOO0O;
    }

    public float getYMax() {
        return this.f21268OooO00o.OooO0OO();
    }

    public float getYMin() {
        return this.f21268OooO00o.OooO0Oo();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f21283OooO0oo) {
            OooO00o(this);
        }
    }

    public void onDraw(Canvas canvas) {
        if (this.f21268OooO00o == null) {
            if (!TextUtils.isEmpty(this.f21284o0ooOOo)) {
                C8349oOoOOo00 center = getCenter();
                canvas.drawText(this.f21284o0ooOOo, center.f21456OooO00o, center.OooO0O0, this.OooO0O0);
            }
        } else if (!this.f21280OooO0o) {
            OooO0O0();
            this.f21280OooO0o = true;
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            getChildAt(i5).layout(i, i2, i3, i4);
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int OooO00o2 = (int) AbstractC8352oOoOOoO0.OooO00o(50.0f);
        setMeasuredDimension(Math.max(getSuggestedMinimumWidth(), ViewGroup.resolveSize(OooO00o2, i)), Math.max(getSuggestedMinimumHeight(), ViewGroup.resolveSize(OooO00o2, i2)));
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        if (this.f21278OooO0O0) {
            Log.i(f21261o0ooOoO, "OnSizeChanged()");
        }
        if (i > 0 && i2 > 0 && i < 10000 && i2 < 10000) {
            if (this.f21278OooO0O0) {
                Log.i(f21261o0ooOoO, "Setting chart dimens, width: " + i + ", height: " + i2);
            }
            this.f21275OooO00o.m20029OooO00o((float) i, (float) i2);
        } else if (this.f21278OooO0O0) {
            String str = "*Avoiding* setting chart dimens! width: " + i + ", height: " + i2;
        }
        OooO();
        Iterator<Runnable> it = this.f21276OooO00o.iterator();
        while (it.hasNext()) {
            post(it.next());
        }
        this.f21276OooO00o.clear();
        super.onSizeChanged(i, i2, i3, i4);
    }

    public void setData(T t) {
        this.f21268OooO00o = t;
        this.f21280OooO0o = false;
        if (t != null) {
            m19843OooO00o(t.OooO0Oo(), t.OooO0OO());
            for (AbstractC8265oOOoooO0 ooooooo0 : this.f21268OooO00o.m19905OooO00o()) {
                if (ooooooo0.m19964OooO0oO() || ooooooo0.m19952OooO00o() == this.f21269OooO00o) {
                    ooooooo0.OooO00o(this.f21269OooO00o);
                }
            }
            OooO();
            if (this.f21278OooO0O0) {
                Log.i(f21261o0ooOoO, "Data is set.");
            }
        }
    }

    public void setDescription(C8202oOOo0oOO oooo0ooo) {
        this.f21266OooO00o = oooo0ooo;
    }

    public void setDragDecelerationEnabled(boolean z) {
        this.f21279OooO0Oo = z;
    }

    public void setDragDecelerationFrictionCoef(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f >= 1.0f) {
            f = 0.999f;
        }
        this.OooO0Oo = f;
    }

    @Deprecated
    public void setDrawMarkerViews(boolean z) {
        setDrawMarkers(z);
    }

    public void setDrawMarkers(boolean z) {
        this.f21282OooO0oO = z;
    }

    public void setExtraBottomOffset(float f) {
        this.OooO0oO = AbstractC8352oOoOOoO0.OooO00o(f);
    }

    public void setExtraLeftOffset(float f) {
        this.OooO0oo = AbstractC8352oOoOOoO0.OooO00o(f);
    }

    public void setExtraRightOffset(float f) {
        this.OooO0o = AbstractC8352oOoOOoO0.OooO00o(f);
    }

    public void setExtraTopOffset(float f) {
        this.OooO0o0 = AbstractC8352oOoOOoO0.OooO00o(f);
    }

    public void setHardwareAccelerationEnabled(boolean z) {
        if (Build.VERSION.SDK_INT < 11) {
            return;
        }
        if (z) {
            setLayerType(2, null);
        } else {
            setLayerType(1, null);
        }
    }

    public void setHighlightPerTapEnabled(boolean z) {
        this.OooO0OO = z;
    }

    public void setHighlighter(C8244oOOoo0Oo ooooo0oo) {
        this.f21270OooO00o = ooooo0oo;
    }

    public void setLastHighlighted(C8246oOOoo0oO[] ooooo0ooArr) {
        if (ooooo0ooArr == null || ooooo0ooArr.length <= 0 || ooooo0ooArr[0] == null) {
            this.f21264OooO00o.OooO00o((C8246oOOoo0oO) null);
        } else {
            this.f21264OooO00o.OooO00o(ooooo0ooArr[0]);
        }
    }

    public void setLogEnabled(boolean z) {
        this.f21278OooO0O0 = z;
    }

    public void setMarker(AbstractC8203oOOo0oOo oooo0ooo) {
        this.f21267OooO00o = oooo0ooo;
    }

    @Deprecated
    public void setMarkerView(AbstractC8203oOOo0oOo oooo0ooo) {
        setMarker(oooo0ooo);
    }

    public void setMaxHighlightDistance(float f) {
        this.OooO = AbstractC8352oOoOOoO0.OooO00o(f);
    }

    public void setNoDataText(String str) {
        this.f21284o0ooOOo = str;
    }

    public void setNoDataTextColor(int i) {
        this.OooO0O0.setColor(i);
    }

    public void setNoDataTextTypeface(Typeface typeface) {
        this.OooO0O0.setTypeface(typeface);
    }

    public void setOnChartGestureListener(AbstractC8311oOo0o00 ooo0o00) {
        this.f21272OooO00o = ooo0o00;
    }

    public void setOnChartValueSelectedListener(AbstractC8292oOo00Oo ooo00oo) {
        this.f21271OooO00o = ooo00oo;
    }

    public void setOnTouchListener(ChartTouchListener chartTouchListener) {
        this.f21264OooO00o = chartTouchListener;
    }

    public void setRenderer(AbstractC8321oOoO0ooO oooo0ooo) {
        if (oooo0ooo != null) {
            this.f21273OooO00o = oooo0ooo;
        }
    }

    public void setTouchEnabled(boolean z) {
        this.f21281OooO0o0 = z;
    }

    public void setUnbindEnabled(boolean z) {
        this.f21283OooO0oo = z;
    }

    public void OooO0Oo() {
        this.f21276OooO00o.clear();
    }

    /* renamed from: OooO0o  reason: collision with other method in class */
    public boolean m19847OooO0o() {
        return this.f21282OooO0oO;
    }

    @Deprecated
    /* renamed from: OooO0o0  reason: collision with other method in class */
    public boolean m19848OooO0o0() {
        return m19847OooO0o();
    }

    public void OooO0oO() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    public void OooO00o(Canvas canvas) {
        float f;
        float f2;
        C8202oOOo0oOO oooo0ooo = this.f21266OooO00o;
        if (oooo0ooo != null && oooo0ooo.m19855OooO00o()) {
            C8349oOoOOo00 OooO00o2 = this.f21266OooO00o.m19875OooO00o();
            this.OooO00o.setTypeface(this.f21266OooO00o.m19854OooO00o());
            this.OooO00o.setTextSize(this.f21266OooO00o.OooO00o());
            this.OooO00o.setColor(this.f21266OooO00o.m19853OooO00o());
            this.OooO00o.setTextAlign(this.f21266OooO00o.OooO00o());
            if (OooO00o2 == null) {
                f2 = (((float) getWidth()) - this.f21275OooO00o.OooOo00()) - this.f21266OooO00o.OooO0O0();
                f = (((float) getHeight()) - this.f21275OooO00o.OooOOo()) - this.f21266OooO00o.OooO0OO();
            } else {
                float f3 = OooO00o2.f21456OooO00o;
                f = OooO00o2.OooO0O0;
                f2 = f3;
            }
            canvas.drawText(this.f21266OooO00o.m19876OooO00o(), f2, f, this.OooO00o);
        }
    }

    public void OooO0O0(int i, AbstractC8187oOOo0O0O oooo0o0o) {
        this.f21265OooO00o.OooO0O0(i, oooo0o0o);
    }

    public void OooO0O0(int i, Easing.EasingOption easingOption) {
        this.f21265OooO00o.OooO0O0(i, easingOption);
    }

    public void OooO0O0(int i) {
        this.f21265OooO00o.OooO0O0(i);
    }

    public void OooO0O0(Runnable runnable) {
        this.f21276OooO00o.remove(runnable);
    }

    public void OooO00o(C8246oOOoo0oO[] ooooo0ooArr) {
        this.f21277OooO00o = ooooo0ooArr;
        setLastHighlighted(ooooo0ooArr);
        invalidate();
    }

    public AbstractC8194oOOo0OoO(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        OooO0oo();
    }

    /* renamed from: OooO0oo  reason: collision with other method in class */
    public boolean m19850OooO0oo() {
        return this.OooO0OO;
    }

    public void OooO00o(float f, int i) {
        OooO00o(f, i, true);
    }

    public void OooO00o(float f, float f2, int i) {
        OooO00o(f, f2, i, true);
    }

    public void OooO00o(float f, int i, boolean z) {
        OooO00o(f, Float.NaN, i, z);
    }

    public void OooO00o(float f, float f2, int i, boolean z) {
        if (i < 0 || i >= this.f21268OooO00o.m19903OooO00o()) {
            OooO00o((C8246oOOoo0oO) null, z);
        } else {
            OooO00o(new C8246oOOoo0oO(f, f2, i), z);
        }
    }

    public void OooO00o(C8246oOOoo0oO ooooo0oo) {
        OooO00o(ooooo0oo, false);
    }

    public void OooO00o(C8246oOOoo0oO ooooo0oo, boolean z) {
        Entry entry = null;
        if (ooooo0oo == null) {
            this.f21277OooO00o = null;
        } else {
            if (this.f21278OooO0O0) {
                Log.i(f21261o0ooOoO, "Highlighted: " + ooooo0oo.toString());
            }
            Entry OooO00o2 = this.f21268OooO00o.OooO00o(ooooo0oo);
            if (OooO00o2 == null) {
                this.f21277OooO00o = null;
                ooooo0oo = null;
            } else {
                this.f21277OooO00o = new C8246oOOoo0oO[]{ooooo0oo};
            }
            entry = OooO00o2;
        }
        setLastHighlighted(this.f21277OooO00o);
        if (z && this.f21271OooO00o != null) {
            if (!OooOO0()) {
                this.f21271OooO00o.OooO00o();
            } else {
                this.f21271OooO00o.OooO00o(entry, ooooo0oo);
            }
        }
        invalidate();
    }

    public AbstractC8194oOOo0OoO(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        OooO0oo();
    }

    public C8246oOOoo0oO OooO00o(float f, float f2) {
        if (this.f21268OooO00o == null) {
            return null;
        }
        return getHighlighter().OooO00o(f, f2);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public float[] m19845OooO00o(C8246oOOoo0oO ooooo0oo) {
        return new float[]{ooooo0oo.OooO00o(), ooooo0oo.OooO0O0()};
    }

    public void OooO00o(int i, int i2, AbstractC8187oOOo0O0O oooo0o0o, AbstractC8187oOOo0O0O oooo0o0o2) {
        this.f21265OooO00o.OooO00o(i, i2, oooo0o0o, oooo0o0o2);
    }

    public void OooO00o(int i, AbstractC8187oOOo0O0O oooo0o0o) {
        this.f21265OooO00o.OooO00o(i, oooo0o0o);
    }

    public void OooO00o(int i, int i2, Easing.EasingOption easingOption, Easing.EasingOption easingOption2) {
        this.f21265OooO00o.OooO00o(i, i2, easingOption, easingOption2);
    }

    public void OooO00o(int i, Easing.EasingOption easingOption) {
        this.f21265OooO00o.OooO00o(i, easingOption);
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19844OooO00o(int i) {
        this.f21265OooO00o.OooO00o(i);
    }

    public void OooO00o(int i, int i2) {
        this.f21265OooO00o.OooO00o(i, i2);
    }

    public void OooO00o(float f, float f2, float f3, float f4) {
        setExtraLeftOffset(f);
        setExtraTopOffset(f2);
        setExtraRightOffset(f3);
        setExtraBottomOffset(f4);
    }

    public void OooO00o(Paint paint, int i) {
        if (i == 7) {
            this.OooO0O0 = paint;
        } else if (i == 11) {
            this.OooO00o = paint;
        }
    }

    public Paint OooO00o(int i) {
        if (i == 7) {
            return this.OooO0O0;
        }
        if (i != 11) {
            return null;
        }
        return this.OooO00o;
    }

    public boolean OooO00o(String str, String str2) {
        Bitmap chartBitmap = getChartBitmap();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(Environment.getExternalStorageDirectory().getPath() + str2 + C8932ooOOO0o.OooO0OO + str + ".png");
            chartBitmap.compress(Bitmap.CompressFormat.PNG, 40, fileOutputStream);
            fileOutputStream.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean OooO00o(String str, String str2, String str3, Bitmap.CompressFormat compressFormat, int i) {
        if (i < 0 || i > 100) {
            i = 50;
        }
        long currentTimeMillis = System.currentTimeMillis();
        File externalStorageDirectory = Environment.getExternalStorageDirectory();
        File file = new File(externalStorageDirectory.getAbsolutePath() + "/DCIM/" + str2);
        if (!file.exists() && !file.mkdirs()) {
            return false;
        }
        int i2 = OooO0O0.OooO00o[compressFormat.ordinal()];
        String str4 = "image/png";
        if (i2 != 1) {
            if (i2 != 2) {
                if (!str.endsWith(".jpg") && !str.endsWith(".jpeg")) {
                    str = str + ".jpg";
                }
                str4 = "image/jpeg";
            } else {
                if (!str.endsWith(".webp")) {
                    str = str + ".webp";
                }
                str4 = "image/webp";
            }
        } else if (!str.endsWith(".png")) {
            str = str + ".png";
        }
        String str5 = file.getAbsolutePath() + C8932ooOOO0o.OooO0OO + str;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str5);
            getChartBitmap().compress(compressFormat, i, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            long length = new File(str5).length();
            ContentValues contentValues = new ContentValues(8);
            contentValues.put("title", str);
            contentValues.put("_display_name", str);
            contentValues.put("date_added", Long.valueOf(currentTimeMillis));
            contentValues.put("mime_type", str4);
            contentValues.put("description", str3);
            contentValues.put("orientation", (Integer) 0);
            contentValues.put("_data", str5);
            contentValues.put("_size", Long.valueOf(length));
            if (getContext().getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues) != null) {
                return true;
            }
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean OooO00o(String str, int i) {
        return OooO00o(str, "", "MPAndroidChart-Library Save", Bitmap.CompressFormat.JPEG, i);
    }

    public void OooO00o(Runnable runnable) {
        if (this.f21275OooO00o.m20045OooO0o0()) {
            post(runnable);
        } else {
            this.f21276OooO00o.add(runnable);
        }
    }

    private void OooO00o(View view) {
        if (view.getBackground() != null) {
            view.getBackground().setCallback(null);
        }
        if (view instanceof ViewGroup) {
            int i = 0;
            while (true) {
                ViewGroup viewGroup = (ViewGroup) view;
                if (i < viewGroup.getChildCount()) {
                    OooO00o(viewGroup.getChildAt(i));
                    i++;
                } else {
                    viewGroup.removeAllViews();
                    return;
                }
            }
        }
    }
}
