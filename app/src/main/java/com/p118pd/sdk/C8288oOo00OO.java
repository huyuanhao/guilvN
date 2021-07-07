package com.p118pd.sdk;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.listener.ChartTouchListener;

/* renamed from: com.pd.sdk.oOo00OO  reason: case insensitive filesystem */
public class C8288oOo00OO extends ChartTouchListener<AbstractC8191oOOo0OOo<? extends AbstractC8211oOOoO0oO<? extends AbstractC8261oOOooo0<? extends Entry>>>> {
    public long OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public Matrix f21378OooO00o = new Matrix();

    /* renamed from: OooO00o  reason: collision with other field name */
    public VelocityTracker f21379OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public AbstractC8265oOOoooO0 f21380OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8349oOoOOo00 f21381OooO00o = C8349oOoOOo00.OooO00o(0.0f, 0.0f);
    public Matrix OooO0O0 = new Matrix();

    /* renamed from: OooO0O0  reason: collision with other field name */
    public C8349oOoOOo00 f21382OooO0O0 = C8349oOoOOo00.OooO00o(0.0f, 0.0f);
    public C8349oOoOOo00 OooO0OO = C8349oOoOOo00.OooO00o(0.0f, 0.0f);
    public float OooO0Oo = 1.0f;

    /* renamed from: OooO0Oo  reason: collision with other field name */
    public C8349oOoOOo00 f21383OooO0Oo = C8349oOoOOo00.OooO00o(0.0f, 0.0f);
    public float OooO0o = 1.0f;
    public float OooO0o0 = 1.0f;
    public float OooO0oO;
    public float OooO0oo;

    public C8288oOo00OO(AbstractC8191oOOo0OOo<? extends AbstractC8211oOOoO0oO<? extends AbstractC8261oOOooo0<? extends Entry>>> oooo0ooo, Matrix matrix, float f) {
        super(oooo0ooo);
        this.f21378OooO00o = matrix;
        this.OooO0oO = AbstractC8352oOoOOoO0.OooO00o(f);
        this.OooO0oo = AbstractC8352oOoOOoO0.OooO00o(3.5f);
    }

    private void OooO00o(MotionEvent motionEvent, float f, float f2) {
        ((ChartTouchListener) this).f14954OooO00o = ChartTouchListener.ChartGesture.DRAG;
        this.f21378OooO00o.set(this.OooO0O0);
        AbstractC8311oOo0o00 onChartGestureListener = ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).getOnChartGestureListener();
        if (OooO00o()) {
            if (((ChartTouchListener) this).f14955OooO00o instanceof C8195oOOo0Ooo) {
                f = -f;
            } else {
                f2 = -f2;
            }
        }
        this.f21378OooO00o.postTranslate(f, f2);
        if (onChartGestureListener != null) {
            onChartGestureListener.OooO0O0(motionEvent, f, f2);
        }
    }

    public static float OooO0O0(MotionEvent motionEvent) {
        return Math.abs(motionEvent.getY(0) - motionEvent.getY(1));
    }

    /* renamed from: OooO0OO  reason: collision with other method in class */
    private void m19988OooO0OO(MotionEvent motionEvent) {
        C8246oOOoo0oO OooO00o2 = ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).OooO00o(motionEvent.getX(), motionEvent.getY());
        if (OooO00o2 != null && !OooO00o2.OooO00o(((ChartTouchListener) this).f14956OooO00o)) {
            ((ChartTouchListener) this).f14956OooO00o = OooO00o2;
            ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).OooO00o(OooO00o2, true);
        }
    }

    private void OooO0Oo(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        if (motionEvent.getPointerCount() >= 2) {
            AbstractC8311oOo0o00 onChartGestureListener = ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).getOnChartGestureListener();
            float OooO0OO2 = OooO0OO(motionEvent);
            if (OooO0OO2 > this.OooO0oo) {
                C8349oOoOOo00 oooooo00 = this.f21382OooO0O0;
                C8349oOoOOo00 OooO00o2 = OooO00o(oooooo00.f21456OooO00o, oooooo00.OooO0O0);
                C8353oOoOOoOO viewPortHandler = ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).getViewPortHandler();
                int i = this.o00oO0O;
                boolean z5 = true;
                float f = 1.0f;
                if (i == 4) {
                    ((ChartTouchListener) this).f14954OooO00o = ChartTouchListener.ChartGesture.PINCH_ZOOM;
                    float f2 = OooO0OO2 / this.OooO0o;
                    if (f2 >= 1.0f) {
                        z5 = false;
                    }
                    if (z5) {
                        z3 = viewPortHandler.m20039OooO0OO();
                    } else {
                        z3 = viewPortHandler.m20031OooO00o();
                    }
                    if (z5) {
                        z4 = viewPortHandler.m20041OooO0Oo();
                    } else {
                        z4 = viewPortHandler.m20036OooO0O0();
                    }
                    float f3 = ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).OooOo() ? f2 : 1.0f;
                    if (((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).OooOoO0()) {
                        f = f2;
                    }
                    if (z4 || z3) {
                        this.f21378OooO00o.set(this.OooO0O0);
                        this.f21378OooO00o.postScale(f3, f, OooO00o2.f21456OooO00o, OooO00o2.OooO0O0);
                        if (onChartGestureListener != null) {
                            onChartGestureListener.OooO00o(motionEvent, f3, f);
                        }
                    }
                } else if (i == 2 && ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).OooOo()) {
                    ((ChartTouchListener) this).f14954OooO00o = ChartTouchListener.ChartGesture.X_ZOOM;
                    float OooO00o3 = OooO00o(motionEvent) / this.OooO0Oo;
                    if (OooO00o3 >= 1.0f) {
                        z5 = false;
                    }
                    if (z5) {
                        z2 = viewPortHandler.m20039OooO0OO();
                    } else {
                        z2 = viewPortHandler.m20031OooO00o();
                    }
                    if (z2) {
                        this.f21378OooO00o.set(this.OooO0O0);
                        this.f21378OooO00o.postScale(OooO00o3, 1.0f, OooO00o2.f21456OooO00o, OooO00o2.OooO0O0);
                        if (onChartGestureListener != null) {
                            onChartGestureListener.OooO00o(motionEvent, OooO00o3, 1.0f);
                        }
                    }
                } else if (this.o00oO0O == 3 && ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).OooOoO0()) {
                    ((ChartTouchListener) this).f14954OooO00o = ChartTouchListener.ChartGesture.Y_ZOOM;
                    float OooO0O02 = OooO0O0(motionEvent) / this.OooO0o0;
                    if (OooO0O02 >= 1.0f) {
                        z5 = false;
                    }
                    if (z5) {
                        z = viewPortHandler.m20041OooO0Oo();
                    } else {
                        z = viewPortHandler.m20036OooO0O0();
                    }
                    if (z) {
                        this.f21378OooO00o.set(this.OooO0O0);
                        this.f21378OooO00o.postScale(1.0f, OooO0O02, OooO00o2.f21456OooO00o, OooO00o2.OooO0O0);
                        if (onChartGestureListener != null) {
                            onChartGestureListener.OooO00o(motionEvent, 1.0f, OooO0O02);
                        }
                    }
                }
                C8349oOoOOo00.m20016OooO00o(OooO00o2);
            }
        }
    }

    private void OooO0o0(MotionEvent motionEvent) {
        this.OooO0O0.set(this.f21378OooO00o);
        this.f21381OooO00o.f21456OooO00o = motionEvent.getX();
        this.f21381OooO00o.OooO0O0 = motionEvent.getY();
        this.f21380OooO00o = ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).m19829OooO00o(motionEvent.getX(), motionEvent.getY());
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        ((ChartTouchListener) this).f14954OooO00o = ChartTouchListener.ChartGesture.DOUBLE_TAP;
        AbstractC8311oOo0o00 onChartGestureListener = ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.OooO0OO(motionEvent);
        }
        if (((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).m19838OooOOOO() && ((AbstractC8211oOOoO0oO) ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).getData()).m19916OooO0O0() > 0) {
            C8349oOoOOo00 OooO00o2 = OooO00o(motionEvent.getX(), motionEvent.getY());
            T t = ((ChartTouchListener) this).f14955OooO00o;
            AbstractC8191oOOo0OOo oooo0ooo = (AbstractC8191oOOo0OOo) t;
            float f = 1.4f;
            float f2 = ((AbstractC8191oOOo0OOo) t).OooOo() ? 1.4f : 1.0f;
            if (!((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).OooOoO0()) {
                f = 1.0f;
            }
            oooo0ooo.OooO0OO(f2, f, OooO00o2.f21456OooO00o, OooO00o2.OooO0O0);
            if (((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).m19842OooO()) {
                Log.i("BarlineChartTouch", "Double-Tap, Zooming In, x: " + OooO00o2.f21456OooO00o + ", y: " + OooO00o2.OooO0O0);
            }
            C8349oOoOOo00.m20016OooO00o(OooO00o2);
        }
        return super.onDoubleTap(motionEvent);
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        ((ChartTouchListener) this).f14954OooO00o = ChartTouchListener.ChartGesture.FLING;
        AbstractC8311oOo0o00 onChartGestureListener = ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.OooO00o(motionEvent, motionEvent2, f, f2);
        }
        return super.onFling(motionEvent, motionEvent2, f, f2);
    }

    public void onLongPress(MotionEvent motionEvent) {
        ((ChartTouchListener) this).f14954OooO00o = ChartTouchListener.ChartGesture.LONG_PRESS;
        AbstractC8311oOo0o00 onChartGestureListener = ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.OooO00o(motionEvent);
        }
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ((ChartTouchListener) this).f14954OooO00o = ChartTouchListener.ChartGesture.SINGLE_TAP;
        AbstractC8311oOo0o00 onChartGestureListener = ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.OooO0O0(motionEvent);
        }
        if (!((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).m19850OooO0oo()) {
            return false;
        }
        OooO00o(((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).OooO00o(motionEvent.getX(), motionEvent.getY()), motionEvent);
        return super.onSingleTapUp(motionEvent);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        VelocityTracker velocityTracker;
        if (this.f21379OooO00o == null) {
            this.f21379OooO00o = VelocityTracker.obtain();
        }
        this.f21379OooO00o.addMovement(motionEvent);
        int i = 3;
        if (motionEvent.getActionMasked() == 3 && (velocityTracker = this.f21379OooO00o) != null) {
            velocityTracker.recycle();
            this.f21379OooO00o = null;
        }
        if (this.o00oO0O == 0) {
            ((ChartTouchListener) this).OooO00o.onTouchEvent(motionEvent);
        }
        if (!((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).m19839OooOOOo() && !((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).OooOo() && !((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).OooOoO0()) {
            return true;
        }
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            boolean z = false;
            if (action == 1) {
                VelocityTracker velocityTracker2 = this.f21379OooO00o;
                int pointerId = motionEvent.getPointerId(0);
                velocityTracker2.computeCurrentVelocity(1000, (float) AbstractC8352oOoOOoO0.OooO00o());
                float yVelocity = velocityTracker2.getYVelocity(pointerId);
                float xVelocity = velocityTracker2.getXVelocity(pointerId);
                if ((Math.abs(xVelocity) > ((float) AbstractC8352oOoOOoO0.OooO0O0()) || Math.abs(yVelocity) > ((float) AbstractC8352oOoOOoO0.OooO0O0())) && this.o00oO0O == 1 && ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).m19846OooO0Oo()) {
                    OooO0O0();
                    this.OooO00o = AnimationUtils.currentAnimationTimeMillis();
                    this.OooO0OO.f21456OooO00o = motionEvent.getX();
                    this.OooO0OO.OooO0O0 = motionEvent.getY();
                    C8349oOoOOo00 oooooo00 = this.f21383OooO0Oo;
                    oooooo00.f21456OooO00o = xVelocity;
                    oooooo00.OooO0O0 = yVelocity;
                    AbstractC8352oOoOOoO0.OooO00o(((ChartTouchListener) this).f14955OooO00o);
                }
                int i2 = this.o00oO0O;
                if (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) {
                    ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).OooO0O0();
                    ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).postInvalidate();
                }
                this.o00oO0O = 0;
                ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).OooO0oO();
                VelocityTracker velocityTracker3 = this.f21379OooO00o;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f21379OooO00o = null;
                }
                OooO00o(motionEvent);
            } else if (action == 2) {
                int i3 = this.o00oO0O;
                if (i3 == 1) {
                    ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).OooO0o();
                    float f = 0.0f;
                    float x = ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).m19841OooOOo0() ? motionEvent.getX() - this.f21381OooO00o.f21456OooO00o : 0.0f;
                    if (((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).m19840OooOOo()) {
                        f = motionEvent.getY() - this.f21381OooO00o.OooO0O0;
                    }
                    OooO00o(motionEvent, x, f);
                } else if (i3 == 2 || i3 == 3 || i3 == 4) {
                    ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).OooO0o();
                    if (((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).OooOo() || ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).OooOoO0()) {
                        OooO0Oo(motionEvent);
                    }
                } else if (i3 == 0 && Math.abs(ChartTouchListener.OooO00o(motionEvent.getX(), this.f21381OooO00o.f21456OooO00o, motionEvent.getY(), this.f21381OooO00o.OooO0O0)) > this.OooO0oO && ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).m19839OooOOOo()) {
                    if (!((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).OooOo00() || !((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).m19834OooOO0O()) {
                        z = true;
                    }
                    if (z) {
                        float abs = Math.abs(motionEvent.getX() - this.f21381OooO00o.f21456OooO00o);
                        float abs2 = Math.abs(motionEvent.getY() - this.f21381OooO00o.OooO0O0);
                        if ((((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).m19841OooOOo0() || abs2 >= abs) && (((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).m19840OooOOo() || abs2 <= abs)) {
                            ((ChartTouchListener) this).f14954OooO00o = ChartTouchListener.ChartGesture.DRAG;
                            this.o00oO0O = 1;
                        }
                    } else if (((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).OooOo0()) {
                        ((ChartTouchListener) this).f14954OooO00o = ChartTouchListener.ChartGesture.DRAG;
                        if (((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).OooOo0()) {
                            m19988OooO0OO(motionEvent);
                        }
                    }
                }
            } else if (action == 3) {
                this.o00oO0O = 0;
                OooO00o(motionEvent);
            } else if (action != 5) {
                if (action == 6) {
                    AbstractC8352oOoOOoO0.OooO00o(motionEvent, this.f21379OooO00o);
                    this.o00oO0O = 5;
                }
            } else if (motionEvent.getPointerCount() >= 2) {
                ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).OooO0o();
                OooO0o0(motionEvent);
                this.OooO0Oo = OooO00o(motionEvent);
                this.OooO0o0 = OooO0O0(motionEvent);
                float OooO0OO2 = OooO0OO(motionEvent);
                this.OooO0o = OooO0OO2;
                if (OooO0OO2 > 10.0f) {
                    if (((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).OooOo0o()) {
                        this.o00oO0O = 4;
                    } else if (((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).OooOo() != ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).OooOoO0()) {
                        if (((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).OooOo()) {
                            i = 2;
                        }
                        this.o00oO0O = i;
                    } else {
                        if (this.OooO0Oo > this.OooO0o0) {
                            i = 2;
                        }
                        this.o00oO0O = i;
                    }
                }
                OooO00o(this.f21382OooO0O0, motionEvent);
            }
        } else {
            OooO0O0(motionEvent);
            OooO0O0();
            OooO0o0(motionEvent);
        }
        this.f21378OooO00o = ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).getViewPortHandler().OooO00o(this.f21378OooO00o, (View) ((ChartTouchListener) this).f14955OooO00o, true);
        return true;
    }

    public void OooO0O0() {
        C8349oOoOOo00 oooooo00 = this.f21383OooO0Oo;
        oooooo00.f21456OooO00o = 0.0f;
        oooooo00.OooO0O0 = 0.0f;
    }

    public static float OooO0OO(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        return (float) Math.sqrt((double) ((x * x) + (y * y)));
    }

    public static void OooO00o(C8349oOoOOo00 oooooo00, MotionEvent motionEvent) {
        oooooo00.f21456OooO00o = (motionEvent.getX(0) + motionEvent.getX(1)) / 2.0f;
        oooooo00.OooO0O0 = (motionEvent.getY(0) + motionEvent.getY(1)) / 2.0f;
    }

    public static float OooO00o(MotionEvent motionEvent) {
        return Math.abs(motionEvent.getX(0) - motionEvent.getX(1));
    }

    public C8349oOoOOo00 OooO00o(float f, float f2) {
        float f3;
        C8353oOoOOoOO viewPortHandler = ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).getViewPortHandler();
        float OooOOoo = f - viewPortHandler.OooOOoo();
        if (OooO00o()) {
            f3 = -(f2 - viewPortHandler.OooOo0());
        } else {
            f3 = -((((float) ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).getMeasuredHeight()) - f2) - viewPortHandler.OooOOo());
        }
        return C8349oOoOOo00.OooO00o(OooOOoo, f3);
    }

    @Override // com.github.mikephil.charting.listener.ChartTouchListener, com.github.mikephil.charting.listener.ChartTouchListener
    private boolean OooO00o() {
        AbstractC8265oOOoooO0 ooooooo0;
        return (this.f21380OooO00o == null && ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).m19835OooOO0o()) || ((ooooooo0 = this.f21380OooO00o) != null && ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).m19832OooO00o(ooooooo0.m19949OooO00o()));
    }

    @Override // com.github.mikephil.charting.listener.ChartTouchListener, com.github.mikephil.charting.listener.ChartTouchListener
    /* renamed from: OooO00o  reason: collision with other method in class */
    public Matrix m19989OooO00o() {
        return this.f21378OooO00o;
    }

    public void OooO00o(float f) {
        this.OooO0oO = AbstractC8352oOoOOoO0.OooO00o(f);
    }

    @Override // com.github.mikephil.charting.listener.ChartTouchListener, com.github.mikephil.charting.listener.ChartTouchListener
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19990OooO00o() {
        C8349oOoOOo00 oooooo00 = this.f21383OooO0Oo;
        float f = 0.0f;
        if (oooooo00.f21456OooO00o != 0.0f || oooooo00.OooO0O0 != 0.0f) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.f21383OooO0Oo.f21456OooO00o *= ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).getDragDecelerationFrictionCoef();
            this.f21383OooO0Oo.OooO0O0 *= ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).getDragDecelerationFrictionCoef();
            float f2 = ((float) (currentAnimationTimeMillis - this.OooO00o)) / 1000.0f;
            C8349oOoOOo00 oooooo002 = this.f21383OooO0Oo;
            float f3 = oooooo002.f21456OooO00o * f2;
            float f4 = oooooo002.OooO0O0 * f2;
            C8349oOoOOo00 oooooo003 = this.OooO0OO;
            float f5 = oooooo003.f21456OooO00o + f3;
            oooooo003.f21456OooO00o = f5;
            float f6 = oooooo003.OooO0O0 + f4;
            oooooo003.OooO0O0 = f6;
            MotionEvent obtain = MotionEvent.obtain(currentAnimationTimeMillis, currentAnimationTimeMillis, 2, f5, f6, 0);
            float f7 = ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).m19841OooOOo0() ? this.OooO0OO.f21456OooO00o - this.f21381OooO00o.f21456OooO00o : 0.0f;
            if (((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).m19840OooOOo()) {
                f = this.OooO0OO.OooO0O0 - this.f21381OooO00o.OooO0O0;
            }
            OooO00o(obtain, f7, f);
            obtain.recycle();
            this.f21378OooO00o = ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).getViewPortHandler().OooO00o(this.f21378OooO00o, (View) ((ChartTouchListener) this).f14955OooO00o, false);
            this.OooO00o = currentAnimationTimeMillis;
            if (((double) Math.abs(this.f21383OooO0Oo.f21456OooO00o)) >= 0.01d || ((double) Math.abs(this.f21383OooO0Oo.OooO0O0)) >= 0.01d) {
                AbstractC8352oOoOOoO0.OooO00o(((ChartTouchListener) this).f14955OooO00o);
                return;
            }
            ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).OooO0O0();
            ((AbstractC8191oOOo0OOo) ((ChartTouchListener) this).f14955OooO00o).postInvalidate();
            OooO0O0();
        }
    }
}
