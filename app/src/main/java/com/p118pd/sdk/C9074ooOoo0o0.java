package com.p118pd.sdk;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;

/* renamed from: com.pd.sdk.ooOoo0o0  reason: case insensitive filesystem */
public class C9074ooOoo0o0 extends C9063ooOoOooo<C9074ooOoo0o0> {
    public float OooO;
    public double OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public ScaleGestureDetector.OnScaleGestureListener f22422OooO00o = new OooO00o();

    /* renamed from: OooO00o  reason: collision with other field name */
    public ScaleGestureDetector f22423OooO00o;
    public double OooO0O0;
    public float OooO0oo;

    /* renamed from: com.pd.sdk.ooOoo0o0$OooO00o */
    public class OooO00o implements ScaleGestureDetector.OnScaleGestureListener {
        public OooO00o() {
        }

        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            double d = C9074ooOoo0o0.this.OooO00o;
            C9074ooOoo0o0 ooooo0o0 = C9074ooOoo0o0.this;
            double d2 = ooooo0o0.OooO00o;
            double scaleFactor = (double) scaleGestureDetector.getScaleFactor();
            Double.isNaN(scaleFactor);
            ooooo0o0.OooO00o = d2 * scaleFactor;
            long timeDelta = scaleGestureDetector.getTimeDelta();
            if (timeDelta > 0) {
                C9074ooOoo0o0 ooooo0o02 = C9074ooOoo0o0.this;
                double d3 = ooooo0o02.OooO00o - d;
                double d4 = (double) timeDelta;
                Double.isNaN(d4);
                ooooo0o02.OooO0O0 = d3 / d4;
            }
            if (Math.abs(C9074ooOoo0o0.this.OooO0oo - scaleGestureDetector.getCurrentSpan()) < C9074ooOoo0o0.this.OooO || C9074ooOoo0o0.this.m20737OooO0O0() != 2) {
                return true;
            }
            C9074ooOoo0o0.this.m20733OooO00o();
            return true;
        }

        public boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
            C9074ooOoo0o0.this.OooO0oo = scaleGestureDetector.getCurrentSpan();
            return true;
        }

        public void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        }
    }

    public C9074ooOoo0o0() {
        OooO0O0(false);
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    public void OooO0OO(MotionEvent motionEvent) {
        if (m20737OooO0O0() == 0) {
            Context context = m20731OooO00o().getContext();
            this.OooO0O0 = AbstractC8352oOoOOoO0.OooO0O0;
            this.OooO00o = 1.0d;
            this.f22423OooO00o = new ScaleGestureDetector(context, this.f22422OooO00o);
            this.OooO = (float) ViewConfiguration.get(context).getScaledTouchSlop();
            m20738OooO0O0();
        }
        ScaleGestureDetector scaleGestureDetector = this.f22423OooO00o;
        if (scaleGestureDetector != null) {
            scaleGestureDetector.onTouchEvent(motionEvent);
        }
        int pointerCount = motionEvent.getPointerCount();
        if (motionEvent.getActionMasked() == 6) {
            pointerCount--;
        }
        if (m20737OooO0O0() == 4 && pointerCount < 2) {
            m20744OooO0Oo();
        } else if (motionEvent.getActionMasked() == 1) {
            m20746OooO0o0();
        }
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    /* renamed from: OooO0oO  reason: collision with other method in class */
    public void m20755OooO0oO() {
        this.f22423OooO00o = null;
        this.OooO0O0 = AbstractC8352oOoOOoO0.OooO0O0;
        this.OooO00o = 1.0d;
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    public float OooO0oo() {
        ScaleGestureDetector scaleGestureDetector = this.f22423OooO00o;
        if (scaleGestureDetector == null) {
            return Float.NaN;
        }
        return scaleGestureDetector.getFocusY();
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo, com.p118pd.sdk.C9063ooOoOooo, com.p118pd.sdk.C9063ooOoOooo, com.p118pd.sdk.C9063ooOoOooo
    public double OooO0O0() {
        return this.OooO0O0;
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo
    public float OooO0oO() {
        ScaleGestureDetector scaleGestureDetector = this.f22423OooO00o;
        if (scaleGestureDetector == null) {
            return Float.NaN;
        }
        return scaleGestureDetector.getFocusX();
    }

    @Override // com.p118pd.sdk.C9063ooOoOooo, com.p118pd.sdk.C9063ooOoOooo, com.p118pd.sdk.C9063ooOoOooo, com.p118pd.sdk.C9063ooOoOooo, com.p118pd.sdk.C9063ooOoOooo
    public double OooO00o() {
        return this.OooO00o;
    }
}
