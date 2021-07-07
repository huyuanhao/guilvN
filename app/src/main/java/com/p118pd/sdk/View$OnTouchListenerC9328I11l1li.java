package com.p118pd.sdk;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* renamed from: com.pd.sdk.丨I11l1li  reason: invalid class name and case insensitive filesystem */
public class View$OnTouchListenerC9328I11l1li implements AbstractC6511lIiilL, View.OnTouchListener, LlLI1l11, ViewTreeObserver.OnGlobalLayoutListener {
    public static final Interpolator OooO00o = new AccelerateDecelerateInterpolator();
    public static final boolean OooO0o0 = Log.isLoggable(o0ooOOo, 3);
    public static final int o000OOo = 2;
    public static final int o0O0O00 = 1;
    public static final int o0OO00O = -1;
    public static final String o0ooOOo = "PhotoViewAttacher";
    public static final int oo0o0Oo = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final Matrix f22844OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final RectF f22845OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public GestureDetector f22846OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public View.OnLongClickListener f22847OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ImageView.ScaleType f22848OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public RunnableC9329OooO0Oo f22849OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9330OooO0o0 f22850OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO0o f22851OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9331OooO0oO f22852OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9332OooO0oo f22853OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC9478LILL f22854OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public WeakReference<ImageView> f22855OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public final float[] f22856OooO00o;
    public final Matrix OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public boolean f22857OooO0O0;
    public final Matrix OooO0OO;

    /* renamed from: OooO0OO  reason: collision with other field name */
    public boolean f22858OooO0OO;
    public float OooO0Oo;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public boolean f22859OooO0Oo;
    public float OooO0o;

    /* renamed from: OooO0o0  reason: collision with other field name */
    public float f22860OooO0o0;
    public int o00oO0O;
    public int o0OOO0o;
    public int o0Oo0oo;
    public int o0ooOO0;

    /* renamed from: o0ooOOo  reason: collision with other field name */
    public int f22861o0ooOOo;
    public int o0ooOoO;

    /* renamed from: com.pd.sdk.丨I11l1li$OooO00o */
    public class OooO00o extends GestureDetector.SimpleOnGestureListener {
        public OooO00o() {
        }

        public void onLongPress(MotionEvent motionEvent) {
            if (View$OnTouchListenerC9328I11l1li.this.f22847OooO00o != null) {
                View$OnTouchListenerC9328I11l1li.this.f22847OooO00o.onLongClick(View$OnTouchListenerC9328I11l1li.this.m21376OooO00o());
            }
        }
    }

    /* renamed from: com.pd.sdk.丨I11l1li$OooO0O0 */
    public static /* synthetic */ class OooO0O0 {
        public static final /* synthetic */ int[] OooO00o;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.p118pd.sdk.View$OnTouchListenerC9328I11l1li.OooO0O0.OooO00o = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = com.p118pd.sdk.View$OnTouchListenerC9328I11l1li.OooO0O0.OooO00o     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = com.p118pd.sdk.View$OnTouchListenerC9328I11l1li.OooO0O0.OooO00o     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = com.p118pd.sdk.View$OnTouchListenerC9328I11l1li.OooO0O0.OooO00o     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = com.p118pd.sdk.View$OnTouchListenerC9328I11l1li.OooO0O0.OooO00o     // Catch:{ NoSuchFieldError -> 0x003e }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.View$OnTouchListenerC9328I11l1li.OooO0O0.<clinit>():void");
        }
    }

    /* renamed from: com.pd.sdk.丨I11l1li$OooO0OO */
    public class OooO0OO implements Runnable {
        public final long OooO00o = System.currentTimeMillis();
        public final float OooO0Oo;
        public final float OooO0o;
        public final float OooO0o0;
        public final float OooO0oO;

        public OooO0OO(float f, float f2, float f3, float f4) {
            this.OooO0Oo = f3;
            this.OooO0o0 = f4;
            this.OooO0o = f;
            this.OooO0oO = f2;
        }

        private float OooO00o() {
            return View$OnTouchListenerC9328I11l1li.OooO00o.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.OooO00o)) * 1.0f) / ((float) View$OnTouchListenerC9328I11l1li.this.o00oO0O)));
        }

        public void run() {
            ImageView OooO00o2 = View$OnTouchListenerC9328I11l1li.this.m21376OooO00o();
            if (OooO00o2 != null) {
                float OooO00o3 = OooO00o();
                float f = this.OooO0o;
                View$OnTouchListenerC9328I11l1li.this.OooO00o((f + ((this.OooO0oO - f) * OooO00o3)) / View$OnTouchListenerC9328I11l1li.this.getScale(), this.OooO0Oo, this.OooO0o0);
                if (OooO00o3 < 1.0f) {
                    L1IlIlI.OooO00o(OooO00o2, this);
                }
            }
        }
    }

    /* renamed from: com.pd.sdk.丨I11l1li$OooO0o */
    public interface OooO0o {
        void OooO00o(View view, float f, float f2);
    }

    /* renamed from: com.pd.sdk.丨I11l1li$OooO0o0  reason: case insensitive filesystem */
    public interface AbstractC9330OooO0o0 {
        void OooO00o(RectF rectF);
    }

    /* renamed from: com.pd.sdk.丨I11l1li$OooO0oO  reason: case insensitive filesystem */
    public interface AbstractC9331OooO0oO {
        void OooO00o(float f, float f2, float f3);
    }

    /* renamed from: com.pd.sdk.丨I11l1li$OooO0oo  reason: case insensitive filesystem */
    public interface AbstractC9332OooO0oo {
        void OooO00o(View view, float f, float f2);
    }

    public View$OnTouchListenerC9328I11l1li(ImageView imageView) {
        this(imageView, true);
    }

    public static void OooO0OO(float f, float f2, float f3) {
        if (f >= f2) {
            throw new IllegalArgumentException("MinZoom has to be less than MidZoom");
        } else if (f2 >= f3) {
            throw new IllegalArgumentException("MidZoom has to be less than MaxZoom");
        }
    }

    private void OooO0Oo() {
        if (m21375OooO0OO()) {
            m21372OooO00o(OooO00o());
        }
    }

    private void OooO0o() {
        this.OooO0OO.reset();
        m21372OooO00o(OooO00o());
        m21375OooO0OO();
    }

    private void OooO0o0() {
        ImageView OooO00o2 = m21376OooO00o();
        if (OooO00o2 != null && !(OooO00o2 instanceof AbstractC6511lIiilL) && !ImageView.ScaleType.MATRIX.equals(OooO00o2.getScaleType())) {
            throw new IllegalStateException("The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher");
        }
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public Matrix getDisplayMatrix() {
        return new Matrix(OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public RectF getDisplayRect() {
        m21375OooO0OO();
        return OooO00o(OooO00o());
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public AbstractC6511lIiilL getIPhotoViewImplementation() {
        return this;
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    @Deprecated
    public float getMaxScale() {
        return getMaximumScale();
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public float getMaximumScale() {
        return this.OooO0o;
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public float getMediumScale() {
        return this.f22860OooO0o0;
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    @Deprecated
    public float getMidScale() {
        return getMediumScale();
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    @Deprecated
    public float getMinScale() {
        return getMinimumScale();
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public float getMinimumScale() {
        return this.OooO0Oo;
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public OooO0o getOnPhotoTapListener() {
        return this.f22851OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public AbstractC9332OooO0oo getOnViewTapListener() {
        return this.f22853OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public float getScale() {
        return (float) Math.sqrt((double) (((float) Math.pow((double) OooO00o(this.OooO0OO, 0), 2.0d)) + ((float) Math.pow((double) OooO00o(this.OooO0OO, 3), 2.0d))));
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public ImageView.ScaleType getScaleType() {
        return this.f22848OooO00o;
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public Bitmap getVisibleRectangleBitmap() {
        ImageView OooO00o2 = m21376OooO00o();
        if (OooO00o2 == null) {
            return null;
        }
        return OooO00o2.getDrawingCache();
    }

    public void onGlobalLayout() {
        ImageView OooO00o2 = m21376OooO00o();
        if (OooO00o2 == null) {
            return;
        }
        if (this.f22859OooO0Oo) {
            int top = OooO00o2.getTop();
            int right = OooO00o2.getRight();
            int bottom = OooO00o2.getBottom();
            int left = OooO00o2.getLeft();
            if (top != this.o0ooOO0 || bottom != this.o0ooOoO || left != this.o0OOO0o || right != this.f22861o0ooOOo) {
                OooO00o(OooO00o2.getDrawable());
                this.o0ooOO0 = top;
                this.f22861o0ooOOo = right;
                this.o0ooOoO = bottom;
                this.o0OOO0o = left;
                return;
            }
            return;
        }
        OooO00o(OooO00o2.getDrawable());
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0095  */
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
        // Method dump skipped, instructions count: 162
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.View$OnTouchListenerC9328I11l1li.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setAllowParentInterceptOnEdge(boolean z) {
        this.f22857OooO0O0 = z;
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    @Deprecated
    public void setMaxScale(float f) {
        setMaximumScale(f);
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setMaximumScale(float f) {
        OooO0OO(this.OooO0Oo, this.f22860OooO0o0, f);
        this.OooO0o = f;
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setMediumScale(float f) {
        OooO0OO(this.OooO0Oo, f, this.OooO0o);
        this.f22860OooO0o0 = f;
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    @Deprecated
    public void setMidScale(float f) {
        setMediumScale(f);
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    @Deprecated
    public void setMinScale(float f) {
        setMinimumScale(f);
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setMinimumScale(float f) {
        OooO0OO(f, this.f22860OooO0o0, this.OooO0o);
        this.OooO0Oo = f;
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        if (onDoubleTapListener != null) {
            this.f22846OooO00o.setOnDoubleTapListener(onDoubleTapListener);
        } else {
            this.f22846OooO00o.setOnDoubleTapListener(new GestureDetector$OnDoubleTapListenerC6425iL1i1(this));
        }
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f22847OooO00o = onLongClickListener;
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setOnMatrixChangeListener(AbstractC9330OooO0o0 oooO0o0) {
        this.f22850OooO00o = oooO0o0;
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setOnPhotoTapListener(OooO0o oooO0o) {
        this.f22851OooO00o = oooO0o;
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setOnScaleChangeListener(AbstractC9331OooO0oO oooO0oO) {
        this.f22852OooO00o = oooO0oO;
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setOnViewTapListener(AbstractC9332OooO0oo oooO0oo) {
        this.f22853OooO00o = oooO0oo;
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setPhotoViewRotation(float f) {
        this.OooO0OO.setRotate(f % 360.0f);
        OooO0Oo();
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setRotationBy(float f) {
        this.OooO0OO.postRotate(f % 360.0f);
        OooO0Oo();
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setRotationTo(float f) {
        this.OooO0OO.setRotate(f % 360.0f);
        OooO0Oo();
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setScale(float f) {
        OooO00o(f, false);
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setScaleType(ImageView.ScaleType scaleType) {
        if (OooO00o(scaleType) && scaleType != this.f22848OooO00o) {
            this.f22848OooO00o = scaleType;
            OooO0O0();
        }
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setZoomTransitionDuration(int i) {
        if (i < 0) {
            i = 200;
        }
        this.o00oO0O = i;
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void setZoomable(boolean z) {
        this.f22859OooO0Oo = z;
        OooO0O0();
    }

    public View$OnTouchListenerC9328I11l1li(ImageView imageView, boolean z) {
        this.o00oO0O = 200;
        this.OooO0Oo = 1.0f;
        this.f22860OooO0o0 = 1.75f;
        this.OooO0o = 3.0f;
        this.f22857OooO0O0 = true;
        this.f22858OooO0OO = false;
        this.f22844OooO00o = new Matrix();
        this.OooO0O0 = new Matrix();
        this.OooO0OO = new Matrix();
        this.f22845OooO00o = new RectF();
        this.f22856OooO00o = new float[9];
        this.o0Oo0oo = 2;
        this.f22848OooO00o = ImageView.ScaleType.FIT_CENTER;
        this.f22855OooO00o = new WeakReference<>(imageView);
        imageView.setDrawingCacheEnabled(true);
        imageView.setOnTouchListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        m21373OooO00o(imageView);
        if (!imageView.isInEditMode()) {
            this.f22854OooO00o = L1LLii.OooO00o(imageView.getContext(), this);
            GestureDetector gestureDetector = new GestureDetector(imageView.getContext(), new OooO00o());
            this.f22846OooO00o = gestureDetector;
            gestureDetector.setOnDoubleTapListener(new GestureDetector$OnDoubleTapListenerC6425iL1i1(this));
            setZoomable(z);
        }
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void OooO0O0(float f, float f2, float f3) {
        OooO0OO(f, f2, f3);
        this.OooO0Oo = f;
        this.f22860OooO0o0 = f2;
        this.OooO0o = f3;
    }

    /* renamed from: com.pd.sdk.丨I11l1li$OooO0Oo  reason: case insensitive filesystem */
    public class RunnableC9329OooO0Oo implements Runnable {
        public final AbstractC6180iLiL1L OooO00o;
        public int o00oO0O;
        public int o0ooOO0;

        public RunnableC9329OooO0Oo(Context context) {
            this.OooO00o = AbstractC6180iLiL1L.OooO00o(context);
        }

        public void OooO00o() {
            if (View$OnTouchListenerC9328I11l1li.OooO0o0) {
                C93141lL.OooO00o().mo18544d(View$OnTouchListenerC9328I11l1li.o0ooOOo, "Cancel Fling");
            }
            this.OooO00o.OooO00o(true);
        }

        public void run() {
            ImageView OooO00o2;
            if (!this.OooO00o.m17140OooO0O0() && (OooO00o2 = View$OnTouchListenerC9328I11l1li.this.m21376OooO00o()) != null && this.OooO00o.m17139OooO00o()) {
                int OooO00o3 = this.OooO00o.OooO00o();
                int OooO0O0 = this.OooO00o.OooO0O0();
                if (View$OnTouchListenerC9328I11l1li.OooO0o0) {
                    C1Lll OooO00o4 = C93141lL.OooO00o();
                    OooO00o4.mo18544d(View$OnTouchListenerC9328I11l1li.o0ooOOo, "fling run(). CurrentX:" + this.o00oO0O + " CurrentY:" + this.o0ooOO0 + " NewX:" + OooO00o3 + " NewY:" + OooO0O0);
                }
                View$OnTouchListenerC9328I11l1li.this.OooO0OO.postTranslate((float) (this.o00oO0O - OooO00o3), (float) (this.o0ooOO0 - OooO0O0));
                View$OnTouchListenerC9328I11l1li r3 = View$OnTouchListenerC9328I11l1li.this;
                r3.m21372OooO00o((View$OnTouchListenerC9328I11l1li) r3.OooO00o());
                this.o00oO0O = OooO00o3;
                this.o0ooOO0 = OooO0O0;
                L1IlIlI.OooO00o(OooO00o2, this);
            }
        }

        public void OooO00o(int i, int i2, int i3, int i4) {
            int i5;
            int i6;
            int i7;
            int i8;
            RectF displayRect = View$OnTouchListenerC9328I11l1li.this.getDisplayRect();
            if (displayRect != null) {
                int round = Math.round(-displayRect.left);
                float f = (float) i;
                if (f < displayRect.width()) {
                    i5 = Math.round(displayRect.width() - f);
                    i6 = 0;
                } else {
                    i6 = round;
                    i5 = i6;
                }
                int round2 = Math.round(-displayRect.top);
                float f2 = (float) i2;
                if (f2 < displayRect.height()) {
                    i7 = Math.round(displayRect.height() - f2);
                    i8 = 0;
                } else {
                    i8 = round2;
                    i7 = i8;
                }
                this.o00oO0O = round;
                this.o0ooOO0 = round2;
                if (View$OnTouchListenerC9328I11l1li.OooO0o0) {
                    C1Lll OooO00o2 = C93141lL.OooO00o();
                    OooO00o2.mo18544d(View$OnTouchListenerC9328I11l1li.o0ooOOo, "fling. StartX:" + round + " StartY:" + round2 + " MaxX:" + i5 + " MaxY:" + i7);
                }
                if (round != i5 || round2 != i7) {
                    this.OooO00o.OooO00o(round, round2, i3, i4, i6, i5, i8, i7, 0, 0);
                }
            }
        }
    }

    private void OooO0OO() {
        RunnableC9329OooO0Oo oooO0Oo = this.f22849OooO00o;
        if (oooO0Oo != null) {
            oooO0Oo.OooO00o();
            this.f22849OooO00o = null;
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static boolean m21374OooO00o(ImageView imageView) {
        return (imageView == null || imageView.getDrawable() == null) ? false : true;
    }

    public static boolean OooO00o(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            return false;
        }
        if (OooO0O0.OooO00o[scaleType.ordinal()] != 1) {
            return true;
        }
        throw new IllegalArgumentException(scaleType.name() + " is not supported in PhotoView");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007d  */
    /* renamed from: OooO0OO  reason: collision with other method in class */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m21375OooO0OO() {
        /*
        // Method dump skipped, instructions count: 155
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p118pd.sdk.View$OnTouchListenerC9328I11l1li.m21375OooO0OO():boolean");
    }

    public void OooO0O0() {
        ImageView OooO00o2 = m21376OooO00o();
        if (OooO00o2 == null) {
            return;
        }
        if (this.f22859OooO0Oo) {
            m21373OooO00o(OooO00o2);
            OooO00o(OooO00o2.getDrawable());
            return;
        }
        OooO0o();
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public static void m21373OooO00o(ImageView imageView) {
        if (imageView != null && !(imageView instanceof AbstractC6511lIiilL) && !ImageView.ScaleType.MATRIX.equals(imageView.getScaleType())) {
            imageView.setScaleType(ImageView.ScaleType.MATRIX);
        }
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21378OooO00o() {
        return this.f22859OooO0Oo;
    }

    private int OooO0O0(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m21377OooO00o() {
        WeakReference<ImageView> weakReference = this.f22855OooO00o;
        if (weakReference != null) {
            ImageView imageView = weakReference.get();
            if (imageView != null) {
                ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                imageView.setOnTouchListener(null);
                OooO0OO();
            }
            GestureDetector gestureDetector = this.f22846OooO00o;
            if (gestureDetector != null) {
                gestureDetector.setOnDoubleTapListener(null);
            }
            this.f22850OooO00o = null;
            this.f22851OooO00o = null;
            this.f22853OooO00o = null;
            this.f22855OooO00o = null;
        }
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m21379OooO00o(Matrix matrix) {
        if (matrix != null) {
            ImageView OooO00o2 = m21376OooO00o();
            if (OooO00o2 == null || OooO00o2.getDrawable() == null) {
                return false;
            }
            this.OooO0OO.set(matrix);
            m21372OooO00o(OooO00o());
            m21375OooO0OO();
            return true;
        }
        throw new IllegalArgumentException("Matrix cannot be null");
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    /* renamed from: OooO00o  reason: collision with other method in class */
    public ImageView m21376OooO00o() {
        WeakReference<ImageView> weakReference = this.f22855OooO00o;
        ImageView imageView = weakReference != null ? weakReference.get() : null;
        if (imageView == null) {
            m21377OooO00o();
            C93141lL.OooO00o().OooO0OO(o0ooOOo, "ImageView no longer exists. You should not use this PhotoViewAttacher any more.");
        }
        return imageView;
    }

    @Override // com.p118pd.sdk.LlLI1l11
    public void OooO00o(float f, float f2) {
        if (!this.f22854OooO00o.OooO00o()) {
            if (OooO0o0) {
                C93141lL.OooO00o().mo18544d(o0ooOOo, String.format("onDrag: dx: %.2f. dy: %.2f", Float.valueOf(f), Float.valueOf(f2)));
            }
            ImageView OooO00o2 = m21376OooO00o();
            this.OooO0OO.postTranslate(f, f2);
            OooO0Oo();
            ViewParent parent = OooO00o2.getParent();
            if (this.f22857OooO0O0 && !this.f22854OooO00o.OooO00o() && !this.f22858OooO0OO) {
                int i = this.o0Oo0oo;
                if ((i == 2 || ((i == 0 && f >= 1.0f) || (this.o0Oo0oo == 1 && f <= -1.0f))) && parent != null) {
                    parent.requestDisallowInterceptTouchEvent(false);
                }
            } else if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    @Override // com.p118pd.sdk.LlLI1l11
    public void OooO00o(float f, float f2, float f3, float f4) {
        if (OooO0o0) {
            C1Lll OooO00o2 = C93141lL.OooO00o();
            OooO00o2.mo18544d(o0ooOOo, "onFling. sX: " + f + " sY: " + f2 + " Vx: " + f3 + " Vy: " + f4);
        }
        ImageView OooO00o3 = m21376OooO00o();
        RunnableC9329OooO0Oo oooO0Oo = new RunnableC9329OooO0Oo(OooO00o3.getContext());
        this.f22849OooO00o = oooO0Oo;
        oooO0Oo.OooO00o(OooO0O0(OooO00o3), OooO00o(OooO00o3), (int) f3, (int) f4);
        OooO00o3.post(this.f22849OooO00o);
    }

    @Override // com.p118pd.sdk.LlLI1l11
    public void OooO00o(float f, float f2, float f3) {
        if (OooO0o0) {
            C93141lL.OooO00o().mo18544d(o0ooOOo, String.format("onScale: scale: %.2f. fX: %.2f. fY: %.2f", Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)));
        }
        if (getScale() < this.OooO0o || f < 1.0f) {
            AbstractC9331OooO0oO oooO0oO = this.f22852OooO00o;
            if (oooO0oO != null) {
                oooO0oO.OooO00o(f, f2, f3);
            }
            this.OooO0OO.postScale(f, f, f2, f3);
            OooO0Oo();
        }
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void OooO00o(float f, boolean z) {
        ImageView OooO00o2 = m21376OooO00o();
        if (OooO00o2 != null) {
            OooO00o(f, (float) (OooO00o2.getRight() / 2), (float) (OooO00o2.getBottom() / 2), z);
        }
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public void OooO00o(float f, float f2, float f3, boolean z) {
        ImageView OooO00o2 = m21376OooO00o();
        if (OooO00o2 == null) {
            return;
        }
        if (f < this.OooO0Oo || f > this.OooO0o) {
            C93141lL.OooO00o().OooO0OO(o0ooOOo, "Scale must be within the range of minScale and maxScale");
        } else if (z) {
            OooO00o2.post(new OooO0OO(getScale(), f, f2, f3));
        } else {
            this.OooO0OO.setScale(f, f, f2, f3);
            OooO0Oo();
        }
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    public Matrix OooO00o() {
        this.OooO0O0.set(this.f22844OooO00o);
        this.OooO0O0.postConcat(this.OooO0OO);
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    private RectF OooO00o(Matrix matrix) {
        Drawable drawable;
        ImageView OooO00o2 = m21376OooO00o();
        if (OooO00o2 == null || (drawable = OooO00o2.getDrawable()) == null) {
            return null;
        }
        this.f22845OooO00o.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
        matrix.mapRect(this.f22845OooO00o);
        return this.f22845OooO00o;
    }

    private float OooO00o(Matrix matrix, int i) {
        matrix.getValues(this.f22856OooO00o);
        return this.f22856OooO00o[i];
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    @Override // com.p118pd.sdk.AbstractC6511lIiilL
    /* renamed from: OooO00o  reason: collision with other method in class */
    private void m21372OooO00o(Matrix matrix) {
        RectF OooO00o2;
        ImageView OooO00o3 = m21376OooO00o();
        if (OooO00o3 != null) {
            OooO0o0();
            OooO00o3.setImageMatrix(matrix);
            if (this.f22850OooO00o != null && (OooO00o2 = OooO00o(matrix)) != null) {
                this.f22850OooO00o.OooO00o(OooO00o2);
            }
        }
    }

    private void OooO00o(Drawable drawable) {
        ImageView OooO00o2 = m21376OooO00o();
        if (OooO00o2 != null && drawable != null) {
            float OooO0O02 = (float) OooO0O0(OooO00o2);
            float OooO00o3 = (float) OooO00o(OooO00o2);
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            this.f22844OooO00o.reset();
            float f = (float) intrinsicWidth;
            float f2 = OooO0O02 / f;
            float f3 = (float) intrinsicHeight;
            float f4 = OooO00o3 / f3;
            ImageView.ScaleType scaleType = this.f22848OooO00o;
            if (scaleType == ImageView.ScaleType.CENTER) {
                this.f22844OooO00o.postTranslate((OooO0O02 - f) / 2.0f, (OooO00o3 - f3) / 2.0f);
            } else if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                float max = Math.max(f2, f4);
                this.f22844OooO00o.postScale(max, max);
                this.f22844OooO00o.postTranslate((OooO0O02 - (f * max)) / 2.0f, (OooO00o3 - (f3 * max)) / 2.0f);
            } else if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
                float min = Math.min(1.0f, Math.min(f2, f4));
                this.f22844OooO00o.postScale(min, min);
                this.f22844OooO00o.postTranslate((OooO0O02 - (f * min)) / 2.0f, (OooO00o3 - (f3 * min)) / 2.0f);
            } else {
                RectF rectF = new RectF(0.0f, 0.0f, f, f3);
                RectF rectF2 = new RectF(0.0f, 0.0f, OooO0O02, OooO00o3);
                int i = OooO0O0.OooO00o[this.f22848OooO00o.ordinal()];
                if (i == 2) {
                    this.f22844OooO00o.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
                } else if (i == 3) {
                    this.f22844OooO00o.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
                } else if (i == 4) {
                    this.f22844OooO00o.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
                } else if (i == 5) {
                    this.f22844OooO00o.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
                }
            }
            OooO0o();
        }
    }

    private int OooO00o(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }
}
