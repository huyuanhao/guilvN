package com.p118pd.sdk;

import android.annotation.SuppressLint;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import com.github.mikephil.charting.listener.ChartTouchListener;
import java.util.ArrayList;

/* renamed from: com.pd.sdk.oOo00oo  reason: case insensitive filesystem */
public class C8302oOo00oo extends ChartTouchListener<AbstractC8199oOOo0o0o<?>> {
    public long OooO00o = 0;

    /* renamed from: OooO00o  reason: collision with other field name */
    public C8349oOoOOo00 f21388OooO00o = C8349oOoOOo00.OooO00o(0.0f, 0.0f);

    /* renamed from: OooO00o  reason: collision with other field name */
    public ArrayList<OooO00o> f21389OooO00o = new ArrayList<>();
    public float OooO0Oo = 0.0f;
    public float OooO0o0 = 0.0f;

    /* renamed from: com.pd.sdk.oOo00oo$OooO00o */
    public class OooO00o {
        public float OooO00o;

        /* renamed from: OooO00o  reason: collision with other field name */
        public long f21390OooO00o;

        public OooO00o(long j, float f) {
            this.f21390OooO00o = j;
            this.OooO00o = f;
        }
    }

    public C8302oOo00oo(AbstractC8199oOOo0o0o<?> oooo0o0o) {
        super(oooo0o0o);
    }

    @Override // com.github.mikephil.charting.listener.ChartTouchListener, com.github.mikephil.charting.listener.ChartTouchListener
    private float OooO00o() {
        if (this.f21389OooO00o.isEmpty()) {
            return 0.0f;
        }
        boolean z = false;
        OooO00o oooO00o = this.f21389OooO00o.get(0);
        ArrayList<OooO00o> arrayList = this.f21389OooO00o;
        OooO00o oooO00o2 = arrayList.get(arrayList.size() - 1);
        OooO00o oooO00o3 = oooO00o;
        for (int size = this.f21389OooO00o.size() - 1; size >= 0; size--) {
            oooO00o3 = this.f21389OooO00o.get(size);
            if (oooO00o3.OooO00o != oooO00o2.OooO00o) {
                break;
            }
        }
        float f = ((float) (oooO00o2.f21390OooO00o - oooO00o.f21390OooO00o)) / 1000.0f;
        if (f == 0.0f) {
            f = 0.1f;
        }
        if (oooO00o2.OooO00o >= oooO00o3.OooO00o) {
            z = true;
        }
        if (((double) Math.abs(oooO00o2.OooO00o - oooO00o3.OooO00o)) > 270.0d) {
            z = !z;
        }
        float f2 = oooO00o2.OooO00o;
        float f3 = oooO00o.OooO00o;
        if (((double) (f2 - f3)) > 180.0d) {
            double d = (double) f3;
            Double.isNaN(d);
            oooO00o.OooO00o = (float) (d + 360.0d);
        } else if (((double) (f3 - f2)) > 180.0d) {
            double d2 = (double) f2;
            Double.isNaN(d2);
            oooO00o2.OooO00o = (float) (d2 + 360.0d);
        }
        float abs = Math.abs((oooO00o2.OooO00o - oooO00o.OooO00o) / f);
        return !z ? -abs : abs;
    }

    private void OooO0OO() {
        this.f21389OooO00o.clear();
    }

    public void OooO0O0(float f, float f2) {
        T t = ((ChartTouchListener) this).f14955OooO00o;
        ((AbstractC8199oOOo0o0o) t).setRotationAngle(((AbstractC8199oOOo0o0o) t).OooO0O0(f, f2) - this.OooO0Oo);
    }

    public void onLongPress(MotionEvent motionEvent) {
        ((ChartTouchListener) this).f14954OooO00o = ChartTouchListener.ChartGesture.LONG_PRESS;
        AbstractC8311oOo0o00 onChartGestureListener = ((AbstractC8199oOOo0o0o) ((ChartTouchListener) this).f14955OooO00o).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.OooO00o(motionEvent);
        }
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        ((ChartTouchListener) this).f14954OooO00o = ChartTouchListener.ChartGesture.SINGLE_TAP;
        AbstractC8311oOo0o00 onChartGestureListener = ((AbstractC8199oOOo0o0o) ((ChartTouchListener) this).f14955OooO00o).getOnChartGestureListener();
        if (onChartGestureListener != null) {
            onChartGestureListener.OooO0O0(motionEvent);
        }
        if (!((AbstractC8199oOOo0o0o) ((ChartTouchListener) this).f14955OooO00o).m19850OooO0oo()) {
            return false;
        }
        OooO00o(((AbstractC8199oOOo0o0o) ((ChartTouchListener) this).f14955OooO00o).OooO00o(motionEvent.getX(), motionEvent.getY()), motionEvent);
        return true;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (!((ChartTouchListener) this).OooO00o.onTouchEvent(motionEvent) && ((AbstractC8199oOOo0o0o) ((ChartTouchListener) this).f14955OooO00o).OooOO0O()) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            int action = motionEvent.getAction();
            if (action == 0) {
                OooO0O0(motionEvent);
                OooO0O0();
                OooO0OO();
                if (((AbstractC8199oOOo0o0o) ((ChartTouchListener) this).f14955OooO00o).m19846OooO0Oo()) {
                    OooO0OO(x, y);
                }
                OooO00o(x, y);
                C8349oOoOOo00 oooooo00 = this.f21388OooO00o;
                oooooo00.f21456OooO00o = x;
                oooooo00.OooO0O0 = y;
            } else if (action == 1) {
                if (((AbstractC8199oOOo0o0o) ((ChartTouchListener) this).f14955OooO00o).m19846OooO0Oo()) {
                    OooO0O0();
                    OooO0OO(x, y);
                    float OooO00o2 = OooO00o();
                    this.OooO0o0 = OooO00o2;
                    if (OooO00o2 != 0.0f) {
                        this.OooO00o = AnimationUtils.currentAnimationTimeMillis();
                        AbstractC8352oOoOOoO0.OooO00o(((ChartTouchListener) this).f14955OooO00o);
                    }
                }
                ((AbstractC8199oOOo0o0o) ((ChartTouchListener) this).f14955OooO00o).OooO0oO();
                this.o00oO0O = 0;
                OooO00o(motionEvent);
            } else if (action == 2) {
                if (((AbstractC8199oOOo0o0o) ((ChartTouchListener) this).f14955OooO00o).m19846OooO0Oo()) {
                    OooO0OO(x, y);
                }
                if (this.o00oO0O == 0) {
                    C8349oOoOOo00 oooooo002 = this.f21388OooO00o;
                    if (ChartTouchListener.OooO00o(x, oooooo002.f21456OooO00o, y, oooooo002.OooO0O0) > AbstractC8352oOoOOoO0.OooO00o(8.0f)) {
                        ((ChartTouchListener) this).f14954OooO00o = ChartTouchListener.ChartGesture.ROTATE;
                        this.o00oO0O = 6;
                        ((AbstractC8199oOOo0o0o) ((ChartTouchListener) this).f14955OooO00o).OooO0o();
                        OooO00o(motionEvent);
                    }
                }
                if (this.o00oO0O == 6) {
                    OooO0O0(x, y);
                    ((AbstractC8199oOOo0o0o) ((ChartTouchListener) this).f14955OooO00o).invalidate();
                }
                OooO00o(motionEvent);
            }
        }
        return true;
    }

    private void OooO0OO(float f, float f2) {
        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        this.f21389OooO00o.add(new OooO00o(currentAnimationTimeMillis, ((AbstractC8199oOOo0o0o) ((ChartTouchListener) this).f14955OooO00o).OooO0O0(f, f2)));
        for (int size = this.f21389OooO00o.size(); size - 2 > 0 && currentAnimationTimeMillis - this.f21389OooO00o.get(0).f21390OooO00o > 1000; size--) {
            this.f21389OooO00o.remove(0);
        }
    }

    public void OooO0O0() {
        this.OooO0o0 = 0.0f;
    }

    public void OooO00o(float f, float f2) {
        this.OooO0Oo = ((AbstractC8199oOOo0o0o) ((ChartTouchListener) this).f14955OooO00o).OooO0O0(f, f2) - ((AbstractC8199oOOo0o0o) ((ChartTouchListener) this).f14955OooO00o).getRawRotationAngle();
    }

    @Override // com.github.mikephil.charting.listener.ChartTouchListener, com.github.mikephil.charting.listener.ChartTouchListener
    /* renamed from: OooO00o  reason: collision with other method in class */
    public void m19994OooO00o() {
        if (this.OooO0o0 != 0.0f) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            this.OooO0o0 *= ((AbstractC8199oOOo0o0o) ((ChartTouchListener) this).f14955OooO00o).getDragDecelerationFrictionCoef();
            T t = ((ChartTouchListener) this).f14955OooO00o;
            ((AbstractC8199oOOo0o0o) t).setRotationAngle(((AbstractC8199oOOo0o0o) t).getRotationAngle() + (this.OooO0o0 * (((float) (currentAnimationTimeMillis - this.OooO00o)) / 1000.0f)));
            this.OooO00o = currentAnimationTimeMillis;
            if (((double) Math.abs(this.OooO0o0)) >= 0.001d) {
                AbstractC8352oOoOOoO0.OooO00o(((ChartTouchListener) this).f14955OooO00o);
            } else {
                OooO0O0();
            }
        }
    }
}
