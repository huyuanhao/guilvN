package com.p118pd.sdk;

import android.view.MotionEvent;

/* renamed from: com.pd.sdk.ooOoo0o  reason: case insensitive filesystem */
public class C9073ooOoo0o {
    public double OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public float f22415OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public long f22416OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public OooO00o f22417OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public boolean f22418OooO00o;

    /* renamed from: OooO00o  reason: collision with other field name */
    public int[] f22419OooO00o = new int[2];
    public double OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public float f22420OooO0O0;

    /* renamed from: OooO0O0  reason: collision with other field name */
    public long f22421OooO0O0;

    /* renamed from: com.pd.sdk.ooOoo0o$OooO00o */
    public interface OooO00o {
        void OooO00o(C9073ooOoo0o ooooo0o);

        /* renamed from: OooO00o  reason: collision with other method in class */
        boolean m20754OooO00o(C9073ooOoo0o ooooo0o);

        boolean OooO0O0(C9073ooOoo0o ooooo0o);
    }

    public C9073ooOoo0o(OooO00o oooO00o) {
        this.f22417OooO00o = oooO00o;
    }

    private void OooO00o(MotionEvent motionEvent) {
        this.f22421OooO0O0 = this.f22416OooO00o;
        this.f22416OooO00o = motionEvent.getEventTime();
        int findPointerIndex = motionEvent.findPointerIndex(this.f22419OooO00o[0]);
        int findPointerIndex2 = motionEvent.findPointerIndex(this.f22419OooO00o[1]);
        float x = motionEvent.getX(findPointerIndex);
        float y = motionEvent.getY(findPointerIndex);
        float x2 = motionEvent.getX(findPointerIndex2);
        float y2 = motionEvent.getY(findPointerIndex2);
        float f = y2 - y;
        this.f22415OooO00o = (x + x2) * 0.5f;
        this.f22420OooO0O0 = (y + y2) * 0.5f;
        double d = -Math.atan2((double) f, (double) (x2 - x));
        if (Double.isNaN(this.OooO00o)) {
            this.OooO0O0 = AbstractC8352oOoOOoO0.OooO0O0;
        } else {
            this.OooO0O0 = this.OooO00o - d;
        }
        this.OooO00o = d;
        double d2 = this.OooO0O0;
        if (d2 > 3.141592653589793d) {
            this.OooO0O0 = d2 - 3.141592653589793d;
        } else if (d2 < -3.141592653589793d) {
            this.OooO0O0 = d2 + 3.141592653589793d;
        }
        double d3 = this.OooO0O0;
        if (d3 > 1.5707963267948966d) {
            this.OooO0O0 = d3 - 3.141592653589793d;
        } else if (d3 < -1.5707963267948966d) {
            this.OooO0O0 = d3 + 3.141592653589793d;
        }
    }

    public float OooO0O0() {
        return this.f22420OooO0O0;
    }

    private void OooO00o() {
        if (this.f22418OooO00o) {
            this.f22418OooO00o = false;
            OooO00o oooO00o = this.f22417OooO00o;
            if (oooO00o != null) {
                oooO00o.OooO00o(this);
            }
        }
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public boolean m20753OooO00o(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f22418OooO00o = false;
            this.f22419OooO00o[0] = motionEvent.getPointerId(motionEvent.getActionIndex());
            this.f22419OooO00o[1] = -1;
        } else if (actionMasked == 1) {
            OooO00o();
        } else if (actionMasked != 2) {
            if (actionMasked != 5) {
                if (actionMasked == 6 && this.f22418OooO00o) {
                    int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
                    int[] iArr = this.f22419OooO00o;
                    if (pointerId == iArr[0] || pointerId == iArr[1]) {
                        OooO00o();
                    }
                }
            } else if (!this.f22418OooO00o) {
                this.f22419OooO00o[1] = motionEvent.getPointerId(motionEvent.getActionIndex());
                this.f22418OooO00o = true;
                this.f22421OooO0O0 = motionEvent.getEventTime();
                this.OooO00o = Double.NaN;
                OooO00o(motionEvent);
                OooO00o oooO00o = this.f22417OooO00o;
                if (oooO00o != null) {
                    oooO00o.OooO0O0(this);
                }
            }
        } else if (this.f22418OooO00o) {
            OooO00o(motionEvent);
            OooO00o oooO00o2 = this.f22417OooO00o;
            if (oooO00o2 != null) {
                oooO00o2.m20754OooO00o(this);
            }
        }
        return true;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public double m20750OooO00o() {
        return this.OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public long m20752OooO00o() {
        return this.f22416OooO00o - this.f22421OooO0O0;
    }

    /* renamed from: OooO00o  reason: collision with other method in class */
    public float m20751OooO00o() {
        return this.f22415OooO00o;
    }
}
